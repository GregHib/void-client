/* HardwareProbe - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub4` (JODE-obfuscated).
 * Hardware information probe node (extends renamed Node). Imports jaclib.hardware_info.HardwareInfo and collects machine specs (CPU/GPU/memory) as int/String fields for the client's system-info reporting.
 */

import jaclib.hardware_info.HardwareInfo;

final class HardwareProbe extends Node {
    private int anInt6591;
    private int anInt6592;
    static int anInt6593;
    /** 1=Sun, 2=Microsoft, 3=Apple, 4=other. */
    private int javaVendorId;
    /** Encoded OS version bucket from {@link ReflectionInvoker#osVersion}. */
    private int osVersionId;
    private int anInt6596;
    private String aString6597;
    private int anInt6598;
    private int anInt6599;
    static int anInt6600;
    static Component253 aClass248_6601;
    static Component75 aClass173_6602 = new Component75();
    private int anInt6603;
    private String aString6604;
    /** Parsed Java minor version. */
    private int javaMinor;
    private int anInt6606;
    /** True when the applet is unsigned (!{@link ReflectionInvoker#signed}). */
    private boolean unsignedClient;
    private boolean aBoolean6608;
    int anInt6609;
    private String aString6610;
    static int anInt6611;
    /** Parsed Java patch/update number. */
    private int javaPatch;
    private int anInt6613;
    private String aString6614;
    static int anInt6615;
    /** Parsed Java major version. */
    private int javaMajor;
    private int anInt6617;

    private final void method2745(int i) {
        if (aString6604.length() > 40) aString6604 = aString6604.substring(0, 40);
        anInt6615++;
        if (aString6614.length() > 40) aString6614 = aString6614.substring(0, 40);
        if (aString6610.length() > i) aString6610 = aString6610.substring(0, 10);
        if (aString6597.length() > 10) aString6597 = aString6597.substring(0, 10);
    }

    final int method2746(byte i) {
        anInt6600++;
        int i_0_ = 23;
        i_0_ += Component118.method2186((byte) -114, aString6604);
        i_0_ += Component118.method2186((byte) -114, aString6614);
        i_0_ += Component118.method2186((byte) -114, aString6610);
        int i_1_ = 42 % ((44 - i) / 49);
        i_0_ += Component118.method2186((byte) -114, aString6597);
        return i_0_;
    }

    final void method2747(int i, Buffer class348_sub49) {
        class348_sub49.writeByte(false, 5);
        anInt6611++;
        class348_sub49.writeByte(false, anInt6613);
        class348_sub49.writeByte(false, aBoolean6608 ? 1 : 0);
        class348_sub49.writeByte(false, osVersionId);
        class348_sub49.writeByte(false, javaVendorId);
        class348_sub49.writeByte(false, javaMajor);
        class348_sub49.writeByte(false, javaMinor);
        class348_sub49.writeByte(false, javaPatch);
        class348_sub49.writeByte(false, !unsignedClient ? 0 : 1);
        class348_sub49.writeShort((byte) 107, anInt6592);
        class348_sub49.writeByte(false, anInt6599);
        class348_sub49.writeMedium(i ^ ~0x26b6, this.anInt6609);
        class348_sub49.writeShort((byte) 107, anInt6591);
        class348_sub49.writeByte(false, anInt6598);
        class348_sub49.writeByte(false, anInt6596);
        class348_sub49.writeByte(false, anInt6603);
        class348_sub49.writeGjstr2(aString6604, 123);
        class348_sub49.writeGjstr2(aString6614, -45);
        class348_sub49.writeGjstr2(aString6610, 100);
        if (i == 1) {
            class348_sub49.writeGjstr2(aString6597, -14);
            class348_sub49.writeByte(false, anInt6606);
            class348_sub49.writeShort((byte) 107, anInt6617);
        }
    }

    public static void method2748(int i) {
        int i_2_ = 80 / ((52 - i) / 57);
        aClass173_6602 = null;
        aClass248_6601 = null;
    }

    static final int method2749(int i) {
        if (i != -1) method2749(20);
        anInt6593++;
        return NodeBaseSub1.anInt9774;
    }

    public HardwareProbe() {
        /* empty */
    }

    HardwareProbe(boolean bool, ReflectionInvoker class297) {
        if (bool) {
            if (ReflectionInvoker.aString3803.startsWith("win")) anInt6613 = 1;
            else if (ReflectionInvoker.aString3803.startsWith("mac")) anInt6613 = 2;
            else if (ReflectionInvoker.aString3803.startsWith("linux")) anInt6613 = 3;
            else anInt6613 = 4;
            aBoolean6608 = ReflectionInvoker.osArch.startsWith("amd64") || ReflectionInvoker.osArch.startsWith("x86_64");
            if (anInt6613 != 1) {
                if (anInt6613 == 2) {
                    if (ReflectionInvoker.osVersion.indexOf("10.4") == -1) {
                        if (ReflectionInvoker.osVersion.indexOf("10.5") == -1) {
                            if (ReflectionInvoker.osVersion.indexOf("10.6") != -1) osVersionId = 22;
                        } else osVersionId = 21;
                    } else osVersionId = 20;
                }
            } else if (ReflectionInvoker.osVersion.indexOf("4.0") != -1) osVersionId = 1;
            else if (ReflectionInvoker.osVersion.indexOf("4.1") == -1) {
                if (ReflectionInvoker.osVersion.indexOf("4.9") == -1) {
                    if (ReflectionInvoker.osVersion.indexOf("5.0") != -1) osVersionId = 4;
                    else if (ReflectionInvoker.osVersion.indexOf("5.1") == -1) {
                        if (ReflectionInvoker.osVersion.indexOf("6.0") != -1) osVersionId = 6;
                        else if (ReflectionInvoker.osVersion.indexOf("6.1") != -1) osVersionId = 7;
                    } else osVersionId = 5;
                } else osVersionId = 3;
            } else osVersionId = 2;
            if (ReflectionInvoker.javaVendor.toLowerCase().indexOf("sun") != -1) javaVendorId = 1;
            else if (ReflectionInvoker.javaVendor.toLowerCase().indexOf("microsoft") == -1) {
                if (ReflectionInvoker.javaVendor.toLowerCase().indexOf("apple") != -1) javaVendorId = 3;
                else javaVendorId = 4;
            } else javaVendorId = 2;
            boolean oldJava = ReflectionInvoker.javaVersion.startsWith("1.");
            int i = oldJava ? 2 : 0;
            int i_3_ = 0;
            try {
                while (ReflectionInvoker.javaVersion.length() > i) {
                    int i_4_ = ReflectionInvoker.javaVersion.charAt(i);
                    if (i_4_ < 48 || i_4_ > 57) break;
                    i++;
                    i_3_ = i_3_ * 10 - -i_4_ + -48;
                }
            } catch (Exception exception) {
                /* empty */
            }
            javaMajor = i_3_;
            i = ReflectionInvoker.javaVersion.indexOf('.', 2) - -1;
            i_3_ = 0;
            try {
                for (/**/; (i < ReflectionInvoker.javaVersion.length()); i++) {
                    int i_5_ = ReflectionInvoker.javaVersion.charAt(i);
                    if (i_5_ < 48 || i_5_ > 57) break;
                    i_3_ = i_3_ * 10 + i_5_ + -48;
                }
            } catch (Exception exception) {
                /* empty */
            }
            javaMinor = i_3_;
            i_3_ = 0;
            i = 1 + ReflectionInvoker.javaVersion.indexOf(oldJava ? '_' : '.', 4);
            try {
                for (/**/; ReflectionInvoker.javaVersion.length() > i; i++) {
                    int i_6_ = ReflectionInvoker.javaVersion.charAt(i);
                    if (i_6_ < 48 || i_6_ > 57) break;
                    i_3_ = i_6_ + -48 + i_3_ * 10;
                }
            } catch (Exception exception) {
                /* empty */
            }
            unsignedClient = !class297.signed;
            javaPatch = i_3_;
            anInt6592 = Component127.anInt2964;
            if (javaMajor <= 3) anInt6599 = 0;
            else anInt6599 = DefinitionSub29.anInt9372;
            try {
                int[] is = HardwareInfo.getCPUInfo();
                if (is != null && is.length == 7) {
                    anInt6598 = is[3];
                    anInt6596 = is[4];
                    anInt6591 = is[2];
                    anInt6603 = is[5];
                    this.anInt6609 = is[6];
                }
            } catch (Throwable throwable) {
                this.anInt6609 = 0;
            }
        }
        if (aString6610 == null) aString6610 = "";
        if (aString6604 == null) aString6604 = "";
        if (aString6597 == null) aString6597 = "";
        if (aString6614 == null) aString6614 = "";
        method2745(10);
    }
}
