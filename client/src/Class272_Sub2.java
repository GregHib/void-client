/* Class272_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import sun.net.www.protocol.http.AuthenticationInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public final class Class272_Sub2 extends Class272 {
    private final ProxySelector aProxySelector6172 = ProxySelector.getDefault();
    static Class aClass6173;
    static Class aClass6174;

    private final Socket method2052(String string, int i, String string_0_) throws IOException {
        Socket socket = new Socket(string, i);
        socket.setSoTimeout(10000);
        OutputStream outputstream = socket.getOutputStream();
        if (string_0_ != null) outputstream.write(("CONNECT " + this.aString3476 + ":" + this.anInt3470 + " HTTP/1.0\n" + string_0_ + "\n\n").getBytes(StandardCharsets.ISO_8859_1));
        else outputstream.write(("CONNECT " + this.aString3476 + ":" + this.anInt3470 + " HTTP/1.0\n\n").getBytes(StandardCharsets.ISO_8859_1));
        outputstream.flush();
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String string_1_ = bufferedreader.readLine();
        if (string_1_ != null) {
            if (string_1_.startsWith("HTTP/1.0 200") || string_1_.startsWith("HTTP/1.1 200")) return socket;
            if (string_1_.startsWith("HTTP/1.0 407") || string_1_.startsWith("HTTP/1.1 407")) {
                int i_2_ = 0;
                string_1_ = bufferedreader.readLine();
                String string_3_ = "proxy-authenticate: ";
                for (/**/; null != string_1_ && i_2_ < 50; string_1_ = bufferedreader.readLine()) {
                    if (string_1_.toLowerCase().startsWith(string_3_)) {
                        string_1_ = string_1_.substring(string_3_.length()).trim();
                        int i_4_ = string_1_.indexOf(' ');
                        if (i_4_ != -1) string_1_ = string_1_.substring(0, i_4_);
                        throw new IOException_Sub1(string_1_);
                    }
                    i_2_++;
                }
                throw new IOException_Sub1("");
            }
        }
        outputstream.close();
        bufferedreader.close();
        socket.close();
        return null;
    }

    final Socket method2050(int i) throws IOException {
        boolean flag1;
        boolean flag = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
        if (!flag) System.setProperty("java.net.useSystemProxies", "true");
        flag1 = anInt3470 == 443;
        IOException_Sub1 ioexception_sub1;
        Object[] aobj1;
        int j;
        if (i >= -100) return null;
        List list;
        List list1;
        try {
            list = aProxySelector6172.select(new URI((flag1 ? "https" : "http") + "://" + aString3476));
            list1 = aProxySelector6172.select(new URI((flag1 ? "http" : "https") + "://" + aString3476));
        } catch (URISyntaxException urisyntaxexception) {
            return method2047((byte) 121);
        }
        list.addAll(list1);
        Object[] aobj = list.toArray();
        ioexception_sub1 = null;
        aobj1 = aobj;
        j = 0;

        for (; j < aobj1.length; ++j) {
            Object localObject2 = aobj1[j];

            Proxy localProxy = (Proxy) localObject2;
            try {
                Socket localSocket = method2053(localProxy, (byte) 125);
                if (localSocket != null) {
                    return localSocket;
                }
            } catch (IOException_Sub1 localIOException_Sub1) {
                ioexception_sub1 = localIOException_Sub1;
            } catch (IOException localIOException) {
            }
        }
        if (ioexception_sub1 != null) throw ioexception_sub1;
        else return method2047((byte) 92);
    }

    private final Socket method2053(Proxy proxy, byte i) throws IOException {
        if (proxy.type() == Proxy.Type.DIRECT) return method2047((byte) 126);
        java.net.SocketAddress socketaddress = proxy.address();
        if (!(socketaddress instanceof InetSocketAddress)) return null;
        InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
        if (i != 125) return null;
        if (proxy.type() == Proxy.Type.HTTP) {
            String string = null;
            try {
                Method method = (AuthenticationInfo.class.getDeclaredMethod("getProxyAuth", (aClass6173 == null ? aClass6173 = String.class : aClass6173), Integer.TYPE));
                method.setAccessible(true);
                Object object = method.invoke(null, inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()));
                if (null != object) {
                    Method method_14_ = (AuthenticationInfo.class.getDeclaredMethod("supportsPreemptiveAuthorization"));
                    method_14_.setAccessible(true);
                    if (((Boolean) method_14_.invoke(object, new Object[0])).booleanValue()) {
                        Method method_15_ = AuthenticationInfo.class.getDeclaredMethod("getHeaderName");
                        method_15_.setAccessible(true);
                        Method method_16_ = (AuthenticationInfo.class.getDeclaredMethod("getHeaderValue", (aClass6174 == null ? aClass6174 = URL.class : aClass6174), (aClass6173 == null ? (aClass6173 = String.class) : aClass6173)));
                        method_16_.setAccessible(true);
                        String string_17_ = ((String) method_15_.invoke(object, new Object[0]));
                        String string_18_ = ((String) method_16_.invoke(object, (new Object[]{new URL("https://" + (this.aString3476) + "/"), "https"})));
                        string = string_17_ + ": " + string_18_;
                    }
                }
            } catch (Exception exception) {
                /* empty */
            }
            return method2052(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string);
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            Socket socket = new Socket(proxy);
            socket.connect(new InetSocketAddress((this.aString3476), (this.anInt3470)));
            return socket;
        }
        return null;
    }
}
