/* HeapDumper - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class133` (JODE-obfuscated).
 * JVM heap-dump / diagnostics utility. Obtains a HotSpotDiagnosticMXBean via ManagementFactory.newPlatformMXBeanProxy and exposes heap-dump control (clearStatics/resetGraphicsPreferences).
 */

import com.sun.management.HotSpotDiagnosticMXBean;

import java.lang.management.ManagementFactory;

final class HeapDumper {
    static int anInt1912;
    static int anInt1913;
    static Component183 aClass114_1914 = new Component183(84, 7);
    static boolean aBoolean1915 = false;
    static int anInt1916;
    static Component183 aClass114_1917 = new Component183(20, -2);
    static byte[][] aByteArrayArray1918 = new byte[250][];
    /*synthetic*/ static Class aClass1919;
    /*synthetic*/ static Class aClass1920;

    public static void clearStatics(int i) {
        if (i == 2767) {
            aByteArrayArray1918 = null;
            aClass114_1917 = null;
            aClass114_1914 = null;
        }
    }

    /** Force safe default graphics prefs (safe mode) and mark prefs dirty. */
    static final void resetGraphicsPreferences(int i) {
        anInt1916++;
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub27_7255), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub27_7261), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub14_7250), 2);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub14_7264), 2);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub4_7220), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub9_7256), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub13_7236), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub1_7246), 1);
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub21_7270), 1);
        if (i >= 45) {
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub24_7235), 1);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub7_7238), 2);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub28_7230), 1);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub18_7259), 2);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub16_7247), 1);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub20_7216), 0);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub20_7248), 0);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub15_7224), 2);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub6_7226), 0);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub12_7243), 0);
            DisplayModeManagerContainer87.method1686(-127);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub23_7231), 0);
            Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub29_7229), 4);
            Definition.method3038(-1);
            DisplayModeManagerContainer154.method773(true);
            RuntimeException_Sub1.aBoolean4604 = true;
        }
    }

    /**
     * Decode a player appearance/update mask from {@code class348_sub49_sub2} into {@code player}
     * (anim, hitsplats, chat, force-move, etc.).
     */
    static final void decodePlayerUpdate(DisplayModeManagerContainer207 class348_sub49_sub2, int i, int i_0_, int i_1_, Player player) {
        do {
            try {
                anInt1912++;
                if (i_1_ >= 41) {
                    byte i_2_ = -1;
                    if ((i_0_ & 0x1) != 0) {
                        int i_3_ = class348_sub49_sub2.readUnsignedShort(842397944);
                        if (i_3_ == 65535) i_3_ = -1;
                        player.anInt10275 = i_3_;
                    }
                    if ((0x10000 & i_0_) != 0) {
                        int i_4_ = class348_sub49_sub2.readUnsignedByte(255);
                        int[] is = new int[i_4_];
                        int[] is_5_ = new int[i_4_];
                        for (int i_6_ = 0; i_6_ < i_4_; i_6_++) {
                            int i_7_ = class348_sub49_sub2.readShortAddLittle(-118);
                            if ((i_7_ & 0xc000) == 49152) {
                                int i_8_ = class348_sub49_sub2.readShortLittle(false);
                                is[i_6_] = Component224.bitwiseOr(i_7_ << 16, i_8_);
                            } else is[i_6_] = i_7_;
                            is_5_[i_6_] = class348_sub49_sub2.readShortLittle(false);
                        }
                        player.applyAnimation(is_5_, is, -116);
                    }
                    if ((0x400 & i_0_) != 0) {
                        int i_9_ = class348_sub49_sub2.readShortLittle(false);
                        player.anInt10227 = class348_sub49_sub2.readUnsignedByteSubtract((byte) -94);
                        player.anInt10271 = class348_sub49_sub2.readUnsignedByteSubtract((byte) -104);
                        player.anInt10210 = 0x7fff & i_9_;
                        player.aBoolean10226 = (i_9_ & 0x8000) != 0;
                        player.anInt10287 = (player.anInt10210 + (OpenGlShader.clientCycle + (player.anInt10227)));
                    }
                    if ((0x1000 & i_0_) != 0) {
                        player.aString10292 = class348_sub49_sub2.readString((byte) 110);
                        if (player.aString10292.charAt(0) == '~') {
                            player.aString10292 = player.aString10292.substring(1);
                            ShaderProgramSub2.addChatMessage(player.getName(false, -70), 2, (byte) -116, 0, player.aString10292, player.method2456(true, 255), player.displayName);
                        } else if (Component72.localPlayer == player)
                            ShaderProgramSub2.addChatMessage(player.getName(false, -88), 2, (byte) -102, 0, (player.aString10292), player.method2456(true, 255), (player.displayName));
                        player.anInt10264 = 150;
                        player.anInt10234 = 0;
                        player.anInt10201 = 0;
                    }
                    if ((i_0_ & 0x4) != 0) {
                        int i_10_ = class348_sub49_sub2.readByteInverse((byte) 21);
                        if (i_10_ > 0) {
                            for (int i_11_ = 0; i_10_ > i_11_; i_11_++) {
                                int i_12_ = -1;
                                int i_13_ = -1;
                                int i_14_ = class348_sub49_sub2.readSmart(-127);
                                int i_15_ = -1;
                                if (i_14_ == 32767) {
                                    i_14_ = class348_sub49_sub2.readSmart(-125);
                                    i_13_ = class348_sub49_sub2.readSmart(-126);
                                    i_12_ = class348_sub49_sub2.readSmart(-128);
                                    i_15_ = class348_sub49_sub2.readSmart(-122);
                                } else if (i_14_ != 32766) i_13_ = class348_sub49_sub2.readSmart(-117);
                                else i_14_ = -1;
                                int i_16_ = class348_sub49_sub2.readSmart(-123);
                                int i_17_ = class348_sub49_sub2.readByteAdd((byte) -98);
                                player.method2438(i_13_, OpenGlShader.clientCycle, i_14_, i_15_, i_12_, i_16_, i_17_, (byte) 102);
                            }
                        }
                    }
                    if ((i_0_ & 0x2) != 0) {
                        player.anInt10524 = class348_sub49_sub2.readUnsignedShort(842397944);
                        if (player.anInt10319 == 0) {
                            player.method2440((byte) 49, player.anInt10524);
                            player.anInt10524 = -1;
                        }
                    }
                    if ((0x8000 & i_0_) != 0) {
                        player.aBoolean10554 = class348_sub49_sub2.readByteAdd((byte) -94) == 1;
                    }
                    if ((i_0_ & 0x100) != 0) {
                        int i_18_ = class348_sub49_sub2.readByteInverse((byte) 21);
                        int[] is = new int[i_18_];
                        int[] is_19_ = new int[i_18_];
                        int[] is_20_ = new int[i_18_];
                        for (int i_21_ = 0; i_21_ < i_18_; i_21_++) {
                            int i_22_ = class348_sub49_sub2.readUnsignedShort(842397944);
                            if (i_22_ == 65535) i_22_ = -1;
                            is[i_21_] = i_22_;
                            is_19_[i_21_] = class348_sub49_sub2.readByteInverse((byte) 21);
                            is_20_[i_21_] = class348_sub49_sub2.readUnsignedShort(842397944);
                        }
                        Component385.method1297((byte) -116, player, is_20_, is, is_19_);
                    }
                    if ((0x2000 & i_0_) != 0) {
                        player.anInt10293 = class348_sub49_sub2.readByte(-121);
                        player.anInt10314 = class348_sub49_sub2.readByteSubtract(-27697);
                        player.anInt10241 = class348_sub49_sub2.readByteInverse(-622951480);
                        player.anInt10288 = class348_sub49_sub2.readByteInverse(-622951480);
                        player.anInt10239 = (class348_sub49_sub2.readShortAddLittle(-118) - -OpenGlShader.clientCycle);
                        player.anInt10300 = (class348_sub49_sub2.readShortAdd(19) - -OpenGlShader.clientCycle);
                        player.anInt10231 = class348_sub49_sub2.readUnsignedByte(255);
                        player.anInt10322 = 0;
                        if (player.aBoolean10539) {
                            player.anInt10288 += player.anInt10531;
                            player.anInt10293 += player.anInt10549;
                            player.anInt10314 += player.anInt10531;
                            player.anInt10241 += player.anInt10549;
                            player.anInt10319 = 0;
                        } else {
                            player.anInt10241 += (player.anIntArray10320[0]);
                            player.anInt10288 += (player.anIntArray10317[0]);
                            player.anInt10319 = 1;
                            player.anInt10314 += (player.anIntArray10317[0]);
                            player.anInt10293 += (player.anIntArray10320[0]);
                        }
                    }
                    if ((0x200 & i_0_) != 0) {
                        int i_23_ = class348_sub49_sub2.readShortAddLittle(-107);
                        if (i_23_ == 65535) i_23_ = -1;
                        int i_24_ = class348_sub49_sub2.readIntLittle((byte) -121);
                        int i_25_ = class348_sub49_sub2.readUnsignedByteSubtract((byte) 54);
                        int i_26_ = i_25_ & 0x7;
                        int i_27_ = 0xf & i_25_ >> 3;
                        if (i_27_ == 15) i_27_ = -1;
                        player.method2437(i_26_, i_23_, -1012294866, i_27_, true, i_24_);
                    }
                    if ((i_0_ & 0x40000) != 0) {
                        player.aByte10255 = class348_sub49_sub2.readByteInverse(-622951480);
                        player.aByte10206 = class348_sub49_sub2.readByte(-99);
                        player.aByte10270 = class348_sub49_sub2.readByte(-87);
                        player.aByte10279 = (byte) class348_sub49_sub2.readUnsignedByte(255);
                        player.anInt10248 = (OpenGlShader.clientCycle + class348_sub49_sub2.readShortAddLittle(-120));
                        player.anInt10250 = (OpenGlShader.clientCycle + class348_sub49_sub2.readShortAdd(125));
                    }
                    if ((i_0_ & 0x80) != 0) {
                        Component293.aByteArray3300[i] = class348_sub49_sub2.readByteSubtract(-27697);
                    }
                    if ((i_0_ & 0x20) != 0) {
                        int i_28_ = class348_sub49_sub2.readShortAddLittle(-126);
                        if (i_28_ == 65535) i_28_ = -1;
                        int i_29_ = class348_sub49_sub2.readIntInverseMiddle(255);
                        int i_30_ = class348_sub49_sub2.readByteAdd((byte) -125);
                        int i_31_ = i_30_ & 0x7;
                        int i_32_ = (0x78 & i_30_) >> 3;
                        if (i_32_ == 15) i_32_ = -1;
                        player.method2437(i_31_, i_28_, -1012294866, i_32_, false, i_29_);
                    }
                    if ((0x8 & i_0_) != 0) {
                        int[] is = new int[4];
                        for (int i_33_ = 0; i_33_ < 4; i_33_++) {
                            is[i_33_] = class348_sub49_sub2.readShortAdd(123);
                            if (is[i_33_] == 65535) is[i_33_] = -1;
                        }
                        int i_34_ = class348_sub49_sub2.readByteAdd((byte) -101);
                        Component25.method1791(23946, is, i_34_, player);
                    }
                    if ((i_0_ & 0x10) != 0) {
                        int i_35_ = class348_sub49_sub2.readUnsignedByte(255);
                        byte[] is = new byte[i_35_];
                        Buffer class348_sub49 = new Buffer(is);
                        class348_sub49_sub2.readBytesReverse(is, 0, i_35_, (byte) -124);
                        Component101.aClass348_Sub49Array2105[i] = class348_sub49;
                        player.readUpdateMask((byte) 84, class348_sub49);
                    }
                    if ((0x800 & i_0_) != 0) i_2_ = class348_sub49_sub2.readByteInverse(-622951480);
                    if (!player.aBoolean10539) break;
                    if (i_2_ != 127) {
                        byte i_36_;
                        if (i_2_ != -1) i_36_ = i_2_;
                        else i_36_ = Component293.aByteArray3300[i];
                        Component140.method3208(player, i_36_, -21);
                        player.method2455(player.anInt10531, -26443, i_36_, player.anInt10549);
                    } else player.setMovementState(player.anInt10531, player.anInt10549, (byte) 84);
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("ns.A(" + (class348_sub49_sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (player != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    /** Lazily obtain HotSpotDiagnosticMXBean into Component39.anObject2256. */
    static final synchronized void ensureHotSpotDiagnostic(byte i) {
        anInt1913++;
        if (Component39.anObject2256 == null) {
            try {
                Component39.anObject2256 = ManagementFactory.newPlatformMXBeanProxy(ManagementFactory.getPlatformMBeanServer(), "com.sun.management:type=HotSpotDiagnostic", HotSpotDiagnosticMXBean.class);
            } catch (Exception exception) {
                System.out.println("HeapDump setup error:");
                exception.printStackTrace();
            }
        }
    }

}
