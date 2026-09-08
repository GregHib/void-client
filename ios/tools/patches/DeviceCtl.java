/*
 * Copyright (C) 2025 The MobiVM Contributors
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.target.ios.devicectl;

import org.apache.commons.exec.ExecuteException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.util.Executor;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Wrapper around `xcrun devicectl` tool
 */
public class DeviceCtl {


    /**
     * json-simple parses JSON numbers via Long.parseLong. Apple's {@code devicectl}
     * emits unsigned 64-bit values (notably {@code cpuType.subtype}) that overflow
     * signed long — e.g. 18446744071562067970. Quote those literals so parsing
     * succeeds; parsers only need fields that fit in long / string anyway.
     */
    private static final Pattern JSON_INTEGER = Pattern.compile("(?<=[:\\[,\\s])(-?\\d+)(?=[,\\}\\]\\s])");

    private static Object parseDevicectlJson(File f) throws IOException, ParseException {
        String json = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
        Matcher m = JSON_INTEGER.matcher(json);
        StringBuffer sb = new StringBuffer(json.length() + 64);
        while (m.find()) {
            String num = m.group(1);
            String replacement = num;
            try {
                Long.parseLong(num);
            } catch (NumberFormatException e) {
                replacement = "\"" + num + "\"";
            }
            m.appendReplacement(sb, Matcher.quoteReplacement(replacement));
        }
        m.appendTail(sb);
        return new JSONParser().parse(sb.toString());
    }

    /**
     * gets list of devices by invoking `xcrun devicectl list devices -j @dest-file`
     */
    public static List<AppleDevice> listDevices(Logger log) throws IOException, ExecuteException, ParseException {
        File f = File.createTempFile("robovm-devicectl-", ".list");
        f.delete();

        new Executor(log, "xcrun")
            .args("devicectl", "list", "devices", "-j", f.getAbsolutePath())
            .exec();

        JSONObject root = (JSONObject) parseDevicectlJson(f);
        return DeviceCtlParsers.parseListResponse(root);
    }

    /**
     * Lists devices, no output to logger, if something goes wrong -- just return empty list
     */
    public static List<AppleDevice> listDevices()  {
        try {
            return listDevices(Logger.NULL_LOGGER);
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    public static List<String> listDeviceUDIDs() {
        return listDevices().stream().map( d -> d.hardwareProperties.udid).collect(Collectors.toList());
    }


    public static AppleDevice getDeviceInfo(Logger log, String udid) throws IOException, ExecuteException, ParseException {
        File f = File.createTempFile("robovm-devicectl-", ".deviceinfo");
        f.delete();

        new Executor(log, "xcrun")
            .args("devicectl", "device", "info", "details", "-q", "-d", udid, "-j", f.getAbsolutePath())
            .exec();

        JSONObject root = (JSONObject) parseDevicectlJson(f);
        return DeviceCtlParsers.parseDeviceInfoResponse(root);
    }

    public static void install(Logger log, String udid, String localAppPath) throws ExecuteException, IOException, ParseException {
        File f = File.createTempFile("robovm-devicectl-", ".install");
        f.delete();

        new Executor(log, "xcrun")
                .args("devicectl", "device", "install", "app", "-d", udid, "-j", f.getAbsolutePath(), localAppPath)
                .exec();
        // Response unused; still sanitize in case json-simple is invoked later.
        parseDevicectlJson(f);
    }

    public static void launchAndWait(
            Logger log, String udid, String bundleId,
            List<String> arguments,
            Map<String, String> env,
            OutputStream errStream,
            OutputStream outStream
    ) throws IOException, ExecuteException {
        Executor executor = new Executor(log, "xcrun");
        List<Object> args = new ArrayList<>();
        args.add("devicectl");
        args.add("device");
        args.add("process");
        args.add("launch");
        args.add("--device");
        args.add(udid);
        args.add("--console");
        args.add("--terminate-existing");
        args.add(bundleId);
        if (!arguments.isEmpty()) {
            args.add("--");
            args.addAll(arguments);
        }
        executor.args(args);
        if (env != null && !env.isEmpty()) {
            Map<String, String> devEnv = new HashMap<>();
            for (Map.Entry<String, String> entry : env.entrySet()) {
                devEnv.put("DEVICECTL_CHILD_" + entry.getKey(), entry.getValue());
            }
            executor.env(devEnv);
        }
        executor.out(outStream).err(errStream).closeOutputStreams(true).inheritEnv(false);
        executor.exec();
    }


    public static void pairDevice(Logger log, String udid) throws IOException, ExecuteException, ParseException {
        new Executor(log, "xcrun")
            .args("devicectl", "manage", "pair", "-d", udid)
            .exec();
    }

    public static void main(String[] args) {
        listDevices().forEach(
                d -> System.out.println(d)
        );
    }
}
