/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Arrays;

final class Class38 {
    static int anInt497;
    int anInt498;
    int anInt499;
    static int anInt500;
    int anInt501 = 8;
    int anInt502;
    int anInt503 = 16777215;
    int anInt504;
    static int anInt505;
    static int anInt506 = -1;
    boolean aBoolean507;
    int anInt508;
    static int anInt509;
    static boolean aBoolean510 = false;
    static int anInt511;
    static int anInt512;
    static int anInt513 = 100;

    static final Class227 method360(byte i, int i_0_) {
        anInt505++;
        if (i != -57) method363(97);
        Class227[] class227s = Class88.method841(i + -70);
        for (int i_1_ = 0; class227s.length > i_1_; i_1_++) {
            Class227 class227 = class227s[i_1_];
            if (class227.anInt2970 == i_0_) return class227;
        }
        return null;
    }

    private final void method361(int i, Class348_Sub49 class348_sub49, int i_2_) {
        if (i != -6617) method363(95);
        anInt497++;
        if (i_2_ == 1) this.anInt501 = class348_sub49.readUnsignedShort(842397944);
        else if (i_2_ == 2) this.aBoolean507 = true;
        else if (i_2_ == 3) {
            this.anInt499 = class348_sub49.readShort(13638);
            this.anInt502 = class348_sub49.readShort(13638);
            this.anInt508 = class348_sub49.readShort(13638);
        } else if (i_2_ == 4) this.anInt498 = class348_sub49.readUnsignedByte(255);
        else if (i_2_ == 5) this.anInt504 = class348_sub49.readUnsignedShort(842397944);
        else if (i_2_ == 6) this.anInt503 = class348_sub49.readMedium(-1);
    }

    static final void method362(int i) {
        anInt509++;
        Class348_Sub27 class348_sub27 = ((Class348_Sub27) Class348_Sub42_Sub20.aClass262_9711.method1995(4));
        int i_3_ = -45 % ((i - -34) / 47);
        for (/**/; class348_sub27 != null; class348_sub27 = (Class348_Sub27) Class348_Sub42_Sub20.aClass262_9711.method1990((byte) 81)) {
            if (class348_sub27.anInt6893 > 0) class348_sub27.anInt6893--;
            if (class348_sub27.anInt6893 != 0) {
                if (class348_sub27.anInt6894 > 0) class348_sub27.anInt6894--;
                if (class348_sub27.anInt6894 == 0 && class348_sub27.anInt6905 >= 1 && class348_sub27.anInt6896 >= 1 && (class348_sub27.anInt6905 <= -2 + Class367_Sub4.anInt7319) && (class348_sub27.anInt6896 <= -2 + Class348_Sub40_Sub3.anInt9109) && (class348_sub27.anInt6907 < 0 || (Class5_Sub2.method195(class348_sub27.anInt6895, false, class348_sub27.anInt6907)))) {
                    Class218.method1591(class348_sub27.anInt6905, 70, class348_sub27.anInt6904, -1, class348_sub27.anInt6907, class348_sub27.anInt6895, class348_sub27.anInt6896, class348_sub27.anInt6900, class348_sub27.anInt6899);
                    class348_sub27.anInt6894 = -1;
                    if ((class348_sub27.anInt6907 != class348_sub27.anInt6902) || class348_sub27.anInt6902 != -1) {
                        if ((class348_sub27.anInt6907 == class348_sub27.anInt6902) && (class348_sub27.anInt6892 == class348_sub27.anInt6900) && (class348_sub27.anInt6895 == (class348_sub27.anInt6903))) class348_sub27.method2715((byte) 75);
                    } else class348_sub27.method2715((byte) 86);
                }
            } else if (class348_sub27.anInt6902 < 0 || (Class5_Sub2.method195(class348_sub27.anInt6903, false, class348_sub27.anInt6902))) {
                Class218.method1591(class348_sub27.anInt6905, 112, class348_sub27.anInt6904, -1, class348_sub27.anInt6902, class348_sub27.anInt6903, class348_sub27.anInt6896, class348_sub27.anInt6892, class348_sub27.anInt6899);
                class348_sub27.method2715((byte) 49);
            }
        }
    }

    private static int HISTORY_INDEX = -1;

    static final void method363(int i) {
        if (Class168.anInt2254 < 102) Class168.anInt2254 += 6;
        anInt512++;
        if (Class121.anInt1794 != -1 && (Class299_Sub1_Sub1.aLong8694 < Class62.method599(-127))) {
            for (int i_4_ = Class121.anInt1794; i_4_ < Class50_Sub1.aStringArray5223.length; i_4_++) {
                if (Class50_Sub1.aStringArray5223[i_4_].startsWith("pause")) {
                    int i_5_ = 5;
                    try {
                        i_5_ = Integer.parseInt(Class50_Sub1.aStringArray5223[i_4_].substring(6));
                    } catch (Exception exception) {
                        /* empty */
                    }
                    Applet_Sub1.method94("Pausing for " + i_5_ + " seconds...", 58);
                    Class121.anInt1794 = 1 + i_4_;
                    Class299_Sub1_Sub1.aLong8694 = (long) (1000 * i_5_) + Class62.method599(-97);
                    return;
                } else {
                    Class363.aString4461 = Class50_Sub1.aStringArray5223[i_4_];
                    Class59_Sub1.method555(false, 0);
                }
            }
            Class121.anInt1794 = -1;
        }
        if (Class98.anInt1565 != 0) {
            Class284.anInt3676 -= Class98.anInt1565 * 5;
            if (Class284.anInt3676 >= Class369_Sub2.anInt8587) Class284.anInt3676 = -1 + Class369_Sub2.anInt8587;
            Class98.anInt1565 = 0;
            if (Class284.anInt3676 < 0) Class284.anInt3676 = 0;
        }
        if (i >= 124) {
            for (int i_6_ = 0; (Class348_Sub42_Sub19.anInt9699 > i_6_); i_6_++) {
                Interface6 interface6 = Class348_Sub42_Sub5.anInterface6Array9534[i_6_];
                int i_7_ = interface6.method30(false);
                char c = interface6.method28((byte) 46);
                int i_8_ = interface6.method26(-7616);
                if (i_7_ == 98) {
                    for (int index = HISTORY_INDEX; index < Class286_Sub1.aStringArray6200.length; index++) {
                        if (index == -1) {
                            continue;
                        }
                        String line = Class286_Sub1.aStringArray6200[index];
                        if (line.isEmpty()) {
                            continue;
                        }
                        String[] parts = line.split(": ");
                        if (parts.length == 2 && parts[1].startsWith("-->")) {
                            if (index > HISTORY_INDEX) {
                                HISTORY_INDEX = index;
                                Class363.aString4461 = parts[1].substring(4);
                                Class348_Sub38.anInt7006 = Class363.aString4461.length();
                                break;
                            }
                        }
                    }
                } else if (i_7_ == 99) {
                    boolean found = false;
                    for (int index = HISTORY_INDEX - 1; index >= 0; index--) {
                        String line = Class286_Sub1.aStringArray6200[index];
                        if (line.isEmpty()) {
                            continue;
                        }
                        String[] parts = line.split(": ");
                        if (parts.length == 2 && parts[1].startsWith("-->")) {
                            HISTORY_INDEX = index;
                            Class363.aString4461 = parts[1].substring(4);
                            Class348_Sub38.anInt7006 = Class363.aString4461.length();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        Class363.aString4461 = "";
                        Class348_Sub38.anInt7006 = 0;
                    }
                } else if (i_7_ == 84) {
                    Class59_Sub1.method555(false, 0);
                    HISTORY_INDEX = -1;
                } else if (i_7_ != 80) {
                    if (i_7_ == 66 && (0x4 & i_8_) != 0) {
                        if (Class348_Sub40_Sub27.aClipboard9357 != null) {
                            String string = "";
                            for (int i_9_ = -1 + (Class286_Sub1.aStringArray6200).length; i_9_ >= 0; i_9_--) {
                                if ((Class286_Sub1.aStringArray6200[i_9_] != null) && Class286_Sub1.aStringArray6200[i_9_].length() > 0) string += (Class286_Sub1.aStringArray6200[i_9_]) + '\n';
                            }
                            Class348_Sub40_Sub27.aClipboard9357.setContents(new StringSelection(string), null);
                        }
                    } else if (i_7_ != 67 || (0x4 & i_8_) == 0) {
                        if (i_7_ != 85 || Class348_Sub38.anInt7006 <= 0) {
                            if (i_7_ == 101 && (Class348_Sub38.anInt7006 < Class363.aString4461.length())){
                                if ((0x4 & i_8_) == 0) {
                                    Class363.aString4461 = ((Class363.aString4461.substring(0, Class348_Sub38.anInt7006)) + (Class363.aString4461.substring(Class348_Sub38.anInt7006 - -1)));
                                } else {
                                    int index = Class363.aString4461.indexOf(' ', Class348_Sub38.anInt7006 + 1);
                                    if (index == -1) {
                                        index = Class363.aString4461.length();
                                    }
                                    Class363.aString4461 = Class363.aString4461.substring(0, Class348_Sub38.anInt7006) + Class363.aString4461.substring(index);
                                }
                            }
                            else if (i_7_ != 96 || Class348_Sub38.anInt7006 <= 0) {
                                if (i_7_ == 97 && (Class363.aString4461.length() > Class348_Sub38.anInt7006)){
                                    if ((0x4 & i_8_) == 0) {
                                        Class348_Sub38.anInt7006++;
                                    } else {
                                        int result = Class363.aString4461.indexOf(' ', Math.min(Class348_Sub38.anInt7006 + 1, Class363.aString4461.length() - 1));
                                        Class348_Sub38.anInt7006 = result == -1 ? Class363.aString4461.length() : result + 1;
                                    }
                                }
                                else if (i_7_ == 102) Class348_Sub38.anInt7006 = 0;
                                else if (i_7_ == 103) Class348_Sub38.anInt7006 = Class363.aString4461.length();
                                else if (i_7_ != 104 || (Class260.anInt3312 >= (Class286_Sub1.aStringArray6200).length)) {
                                    if (i_7_ == 105 && Class260.anInt3312 > 0) {
                                        Class260.anInt3312--;
                                        aa.method159(-615751774);
                                        Class348_Sub38.anInt7006 = Class363.aString4461.length();
                                    } else if (Npc.method2446(c, (byte) 105) || c == 92 || c == 47 || c == 46 || c == 58 || c == 44 || c == 32 || c == 95 || c == 45 || c == 43 || c == 91 || c == 93) {
                                        Class363.aString4461 = ((Class363.aString4461.substring(0, Class348_Sub38.anInt7006)) + Class348_Sub42_Sub5.anInterface6Array9534[i_6_].method28((byte) 23) + (Class363.aString4461.substring(Class348_Sub38.anInt7006)));
                                        Class348_Sub38.anInt7006++;
                                    }
                                } else {
                                    Class260.anInt3312++;
                                    aa.method159(-615751774);
                                    Class348_Sub38.anInt7006 = Class363.aString4461.length();
                                }
                            } else {
                                if ((0x4 & i_8_) == 0) {
                                    Class348_Sub38.anInt7006--;
                                } else {
                                    Class348_Sub38.anInt7006 = Math.max(Class363.aString4461.lastIndexOf(' ', Class348_Sub38.anInt7006 - 2) + 1, 0);
                                }
                            }
                        } else {
                            if ((0x4 & i_8_) == 0) {
                                Class363.aString4461 = ((Class363.aString4461.substring(0, Class348_Sub38.anInt7006 - 1)) + Class363.aString4461.substring(Class348_Sub38.anInt7006));
                                Class348_Sub38.anInt7006--;
                            } else {
                                int index = Class363.aString4461.trim().lastIndexOf(' ', Class348_Sub38.anInt7006);
                                index++;
                                Class363.aString4461 = Class363.aString4461.substring(0, index);
                                Class348_Sub38.anInt7006 = index;
                            }
                        }
                    } else if (Class348_Sub40_Sub27.aClipboard9357 != null) {
                        Transferable transferable = Class348_Sub40_Sub27.aClipboard9357.getContents(null);
                        if (transferable != null) {
                            try {
                                String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
                                if (string != null) {
                                    String[] strings = Class348_Sub40_Sub23.method3113('\n', true, string);
                                    Class348_Sub42_Sub6.method3189(0, strings);
                                }
                            } catch (Exception exception) {
                                /* empty */
                            }
                        }
                    }
                } else Class59_Sub1.method555(true, 0);
            }
            Class348_Sub42_Sub19.anInt9699 = 0;
            Class253.anInt3246 = 0;
            Class354.method3466(89);
        }
    }

    final void method364(Class348_Sub49 class348_sub49, byte i) {
        anInt511++;
        if (i >= 22) {
            for (; ; ) {
                int i_10_ = class348_sub49.readUnsignedByte(255);
                if (i_10_ == 0) break;
                method361(-6617, class348_sub49, i_10_);
            }
        }
    }

    static final void method365(Class318_Sub1 class318_sub1, Class348_Sub1[] class348_sub1s) {
        if (Class318_Sub1_Sub3_Sub3.aBoolean10221) {
            int i = class318_sub1.method2384(class348_sub1s, 49);
            Class9.aHa171.method3642(i, class348_sub1s);
        }
        if (Class332.aSArray4142 == aa_Sub1.aSArray5191) {
            boolean bool = false;
            boolean bool_11_ = false;
            int i;
            int i_12_;
            if (class318_sub1 instanceof Class318_Sub1_Sub3) {
                i = (((Class318_Sub1_Sub3) class318_sub1).aShort8743);
                i_12_ = ((Class318_Sub1_Sub3) class318_sub1).aShort8750;
            } else {
                i = (class318_sub1.x >> Class362.anInt4459);
                i_12_ = (class318_sub1.y >> Class362.anInt4459);
            }
            Class9.aHa171.EA((Class348_Sub1_Sub1.aSArray8801[0].method3986(class318_sub1.x, class318_sub1.y, (byte) -118)), Class367_Sub8.method3547(i, i_12_), Class318_Sub1_Sub5.method2483(i, i_12_), Class199.method1457(i, i_12_));
        }
        Class318_Sub4 class318_sub4 = class318_sub1.method2386(1, Class9.aHa171);
        if (class318_sub4 != null) {
            if (class318_sub1.aBoolean6391) {
                Class318_Sub3[] class318_sub3s = class318_sub4.aClass318_Sub3Array6414;
                for (int i = 0; i < class318_sub3s.length; i++) {
                    Class318_Sub3 class318_sub3 = class318_sub3s[i];
                    if (class318_sub3.aBoolean6401) Class338.method2663(-5590, (class318_sub3.anInt6405 - class318_sub3.anInt6403), (class318_sub3.anInt6406 + class318_sub3.anInt6403), (class318_sub3.anInt6402 - class318_sub3.anInt6403), (class318_sub3.anInt6404 + class318_sub3.anInt6403));
                }
            }
            if (class318_sub4.aBoolean6409) {
                class318_sub4.aClass318_Sub1_6410 = class318_sub1;
                if (Class348_Sub40_Sub5.aBoolean9121) {
                    synchronized (Class71.aClass76_1208) {
                        Class71.aClass76_1208.method774(class318_sub4, 18802);
                    }
                } else Class71.aClass76_1208.method774(class318_sub4, 18802);
            } else Class59_Sub1_Sub1.method560(class318_sub4, 18);
        }
    }

    public Class38() {
        /* empty */
    }
}
