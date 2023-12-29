/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;

final class Class66 {
    private static int[] anIntArray1149 = new int[1000];
    private static Class46 aClass46_1150;
    private static Class43 aClass43_1151;
    private static String[] aStringArray1152 = new String[1000];
    static int anInt1153;
    private static int anInt1154 = 0;
    private static String[] aStringArray1155;
    static int anInt1156;
    static int anInt1157;
    static int anInt1158;
    static int anInt1159;
    private static Calendar aCalendar1160;
    private static int[][] anIntArrayArray1161 = new int[5][5000];
    static int anInt1162;
    static int anInt1163;
    private static int[] anIntArray1164;
    static int anInt1165;
    static int anInt1166;
    static int anInt1167;
    private static Class184[] aClass184Array1168;
    private static Class46 aClass46_1169;
    private static int anInt1170 = 0;
    static int anInt1171;
    private static int[] anIntArray1172 = new int[5];
    private static int anInt1173 = 0;
    static Class60 aClass60_1174;
    private static int[] anIntArray1175;
    private static String[] aStringArray1176;
    private static int anInt1177;

    static final void method701(Class273 class273, int i, int i_0_) {
        Class348_Sub42_Sub19 class348_sub42_sub19 = Class153.method1223(i, i_0_, 96837648, class273);
        if (class348_sub42_sub19 != null) {
            anIntArray1164 = (new int
                    [class348_sub42_sub19.anInt9688]);
            aStringArray1155 = (new String
                    [class348_sub42_sub19.anInt9689]);
            if ((class348_sub42_sub19.aClass273_9691 == Class90.aClass273_1512) || (class348_sub42_sub19.aClass273_9691) == Class59_Sub1_Sub2.aClass273_8664 || (class348_sub42_sub19.aClass273_9691) == Class77.aClass273_1298) {
                int i_1_ = 0;
                int i_2_ = 0;
                if (Class168.aClass46_2249 != null) {
                    i_1_ = Class168.aClass46_2249.anInt800;
                    i_2_ = Class168.aClass46_2249.anInt750;
                }
                anIntArray1164[0] = Class258_Sub4.aClass373_8552.method3597(true) - i_1_;
                anIntArray1164[1] = (Class258_Sub4.aClass373_8552.method3594((byte) 80) - i_2_);
            }
            method711(class348_sub42_sub19, 200000);
        }
    }

    private static final void method702(int i) {
        Class46 class46 = FontRenderer.method2570(1512932720, i);
        if (class46 != null) {
            int i_3_ = i >>> 16;
            Class46[] class46s = Class369_Sub2.aClass46ArrayArray8584[i_3_];
            if (class46s == null) {
                Class46[] class46s_4_ = Class348_Sub40_Sub33.aClass46ArrayArray9427[i_3_];
                int i_5_ = class46s_4_.length;
                class46s = Class369_Sub2.aClass46ArrayArray8584[i_3_] = new Class46[i_5_];
                Class214.method1575(class46s_4_, 0, class46s, 0, class46s_4_.length);
            }
            int i_6_;
            for (i_6_ = 0; i_6_ < class46s.length; i_6_++) {
                if (class46s[i_6_] == class46) break;
            }
            if (i_6_ < class46s.length) {
                Class214.method1575(class46s, 0, class46s, 1, i_6_);
                class46s[0] = class46;
            }
        }
    }

    static final void method703(int i) {
        if (i != -1 && Class320.method2547(i, (byte) 84)) {
            Class46[] class46s = Class348_Sub40_Sub33.aClass46ArrayArray9427[i];
            for (int i_7_ = 0; i_7_ < class46s.length; i_7_++) {
                Class46 class46 = class46s[i_7_];
                if (class46.anObjectArray815 != null) {
                    Class348_Sub36 class348_sub36 = new Class348_Sub36();
                    class348_sub36.aClass46_6989 = class46;
                    class348_sub36.anObjectArray6987 = class46.anObjectArray815;
                    method712(class348_sub36, 2000000);
                }
            }
        }
    }

    private static final void method704(int i, boolean bool) {
        if (i < 5100) {
            if (i == 5000) {
                anIntArray1149[anInt1173++] = za.anInt7276;
                return;
            }
            if (i == 5001) {
                anInt1173 -= 3;
                za.anInt7276 = anIntArray1149[anInt1173];
                Class57.aClass227_1055 = Class38.method360((byte) -57, anIntArray1149[anInt1173 + 1]);
                if (Class57.aClass227_1055 == null) Class57.aClass227_1055 = Class100.aClass227_1591;
                Class290.anInt3713 = anIntArray1149[anInt1173 + 2];
                anInt1156++;
                Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class348_Sub14.aClass351_6766, (Class348_Sub23_Sub2.aClass77_9029), -111);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, za.anInt7276);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, Class57.aClass227_1055.anInt2970);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, Class290.anInt3713);
                Class348_Sub42_Sub14.method3243(-77, class348_sub47);
                return;
            }
            if (i == 5002) {
                anInt1170 -= 2;
                String string = aStringArray1152[anInt1170];
                String string_8_ = aStringArray1152[anInt1170 + 1];
                anInt1173 -= 2;
                int i_9_ = anIntArray1149[anInt1173];
                int i_10_ = anIntArray1149[anInt1173 + 1];
                if (string_8_ == null) string_8_ = "";
                if (string_8_.length() > 80) string_8_ = string_8_.substring(0, 80);
                anInt1157++;
                Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(FontMetrics.aClass351_1987, (Class348_Sub23_Sub2.aClass77_9029), -117);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, (Class239_Sub6.method1745(string, -65) + 2 + Class239_Sub6.method1745(string_8_, -65)));
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_9_ - 1);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_10_);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string_8_);
                Class348_Sub42_Sub14.method3243(-85, class348_sub47);
                return;
            }
            if (i == 5003) {
                int i_11_ = anIntArray1149[--anInt1173];
                Class147 class147 = s.method3985(-101, i_11_);
                String string = "";
                if (class147 != null && class147.aString2028 != null) string = class147.aString2028;
                aStringArray1152[anInt1170++] = string;
                return;
            }
            if (i == 5004) {
                int i_12_ = anIntArray1149[--anInt1173];
                Class147 class147 = s.method3985(-101, i_12_);
                int i_13_ = -1;
                if (class147 != null) i_13_ = class147.anInt2032;
                anIntArray1149[anInt1173++] = i_13_;
                return;
            }
            if (i == 5005) {
                if (Class57.aClass227_1055 == null) anIntArray1149[anInt1173++] = -1;
                else {
                    anIntArray1149[anInt1173++] = Class57.aClass227_1055.anInt2970;
                    return;
                }
                return;
            }
            if (i == 5006) {
                int i_14_ = anIntArray1149[--anInt1173];
                Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class348_Sub31.aClass351_6925, (Class348_Sub23_Sub2.aClass77_9029), -100);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_14_);
                Class348_Sub42_Sub14.method3243(-70, class348_sub47);
                return;
            }
            if (i == 5008) {
                String string = aStringArray1152[--anInt1170];
                method707(string, i);
                return;
            }
            if (i == 5009) {
                anInt1170 -= 2;
                String string = aStringArray1152[anInt1170];
                String string_15_ = aStringArray1152[anInt1170 + 1];
                if (Class192.anInt2581 != 0 || ((!Class348_Sub40_Sub3.aBoolean9103 || Class133.aBoolean1915) && !Class50_Sub2.aBoolean5233)) {
                    anInt1159++;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class348_Sub40_Sub22.aClass351_9304), (Class348_Sub23_Sub2.aClass77_9029), -116);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                    int i_16_ = (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                    Class367_Sub4.method3544((class348_sub47.aClass348_Sub49_Sub2_7116), -70, string_15_);
                    class348_sub47.aClass348_Sub49_Sub2_7116.method3339(109, (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197) - i_16_);
                    Class348_Sub42_Sub14.method3243(2, class348_sub47);
                    return;
                }
                return;
            }
            if (i == 5010) {
                int i_17_ = anIntArray1149[--anInt1173];
                Class147 class147 = s.method3985(-101, i_17_);
                String string = "";
                if (class147 != null && class147.aString2024 != null) string = class147.aString2024;
                aStringArray1152[anInt1170++] = string;
                return;
            }
            if (i == 5011) {
                int i_18_ = anIntArray1149[--anInt1173];
                Class147 class147 = s.method3985(-101, i_18_);
                String string = "";
                if (class147 != null && class147.aString2022 != null) string = class147.aString2022;
                aStringArray1152[anInt1170++] = string;
                return;
            }
            if (i == 5012) {
                int i_19_ = anIntArray1149[--anInt1173];
                Class147 class147 = s.method3985(-101, i_19_);
                int i_20_ = -1;
                if (class147 != null) i_20_ = class147.anInt2026;
                anIntArray1149[anInt1173++] = i_20_;
                return;
            }
            if (i == 5015) {
                String string;
                if (Class132.aPlayer_1907 != null && (Class132.aPlayer_1907.aString10537) != null) string = Class132.aPlayer_1907.method2456(true, 255);
                else string = "";
                aStringArray1152[anInt1170++] = string;
                return;
            }
            if (i == 5016) {
                anIntArray1149[anInt1173++] = Class290.anInt3713;
                return;
            }
            if (i == 5017) {
                anIntArray1149[anInt1173++] = Class348_Sub4.method2749(-1);
                return;
            }
            if (i == 5018) {
                int i_21_ = anIntArray1149[--anInt1173];
                Class147 class147 = s.method3985(-101, i_21_);
                int i_22_ = 0;
                if (class147 != null) i_22_ = class147.anInt2027;
                anIntArray1149[anInt1173++] = i_22_;
                return;
            }
            if (i == 5019) {
                int i_23_ = anIntArray1149[--anInt1173];
                Class147 class147 = s.method3985(-101, i_23_);
                String string = "";
                if (class147 != null && class147.aString2033 != null) string = class147.aString2033;
                aStringArray1152[anInt1170++] = string;
                return;
            }
            if (i == 5020) {
                String string;
                if (Class132.aPlayer_1907 != null && (Class132.aPlayer_1907.aString10537) != null) string = Class132.aPlayer_1907.method2450(false, -78);
                else string = "";
                aStringArray1152[anInt1170++] = string;
                return;
            }
            if (i == 5023) {
                int i_24_ = anIntArray1149[--anInt1173];
                Class147 class147 = s.method3985(-101, i_24_);
                int i_25_ = -1;
                if (class147 != null) i_25_ = class147.anInt2031;
                anIntArray1149[anInt1173++] = i_25_;
                return;
            }
            if (i == 5024) {
                int i_26_ = anIntArray1149[--anInt1173];
                Class147 class147 = s.method3985(-101, i_26_);
                int i_27_ = -1;
                if (class147 != null) i_27_ = class147.anInt2030;
                anIntArray1149[anInt1173++] = i_27_;
                return;
            }
            if (i == 5025) {
                int i_28_ = anIntArray1149[--anInt1173];
                Class147 class147 = s.method3985(-101, i_28_);
                String string = "";
                if (class147 != null && class147.aString2025 != null) string = class147.aString2025;
                aStringArray1152[anInt1170++] = string;
                return;
            }
            if (i == 5050) {
                int i_29_ = anIntArray1149[--anInt1173];
                aStringArray1152[anInt1170++] = (Class200.aClass226_2639.method1625(0, i_29_).aString9587);
                return;
            }
            if (i == 5051) {
                int i_30_ = anIntArray1149[--anInt1173];
                Class348_Sub42_Sub11 class348_sub42_sub11 = Class200.aClass226_2639.method1625(0, i_30_);
                if ((class348_sub42_sub11.anIntArray9592) == null) anIntArray1149[anInt1173++] = 0;
                else {
                    anIntArray1149[anInt1173++] = (class348_sub42_sub11.anIntArray9592).length;
                    return;
                }
                return;
            }
            if (i == 5052) {
                anInt1173 -= 2;
                int i_31_ = anIntArray1149[anInt1173];
                int i_32_ = anIntArray1149[anInt1173 + 1];
                Class348_Sub42_Sub11 class348_sub42_sub11 = Class200.aClass226_2639.method1625(0, i_31_);
                int i_33_ = (class348_sub42_sub11.anIntArray9592[i_32_]);
                anIntArray1149[anInt1173++] = i_33_;
                return;
            }
            if (i == 5053) {
                int i_34_ = anIntArray1149[--anInt1173];
                Class348_Sub42_Sub11 class348_sub42_sub11 = Class200.aClass226_2639.method1625(0, i_34_);
                if ((class348_sub42_sub11.anIntArray9580) == null) anIntArray1149[anInt1173++] = 0;
                else {
                    anIntArray1149[anInt1173++] = (class348_sub42_sub11.anIntArray9580).length;
                    return;
                }
                return;
            }
            if (i == 5054) {
                anInt1173 -= 2;
                int i_35_ = anIntArray1149[anInt1173];
                int i_36_ = anIntArray1149[anInt1173 + 1];
                anIntArray1149[anInt1173++] = (Class200.aClass226_2639.method1625(0, i_35_).anIntArray9580[i_36_]);
                return;
            }
            if (i == 5055) {
                int i_37_ = anIntArray1149[--anInt1173];
                aStringArray1152[anInt1170++] = Class239_Sub6.aClass355_5900.method3471(i_37_, (byte) -112).method3219(127);
                return;
            }
            if (i == 5056) {
                int i_38_ = anIntArray1149[--anInt1173];
                Class348_Sub42_Sub10 class348_sub42_sub10 = Class239_Sub6.aClass355_5900.method3471(i_38_, (byte) -125);
                if ((class348_sub42_sub10.anIntArray9566) == null) anIntArray1149[anInt1173++] = 0;
                else {
                    anIntArray1149[anInt1173++] = (class348_sub42_sub10.anIntArray9566).length;
                    return;
                }
                return;
            }
            if (i == 5057) {
                anInt1173 -= 2;
                int i_39_ = anIntArray1149[anInt1173];
                int i_40_ = anIntArray1149[anInt1173 + 1];
                anIntArray1149[anInt1173++] = (Class239_Sub6.aClass355_5900.method3471(i_39_, (byte) -126).anIntArray9566[i_40_]);
                return;
            }
            if (i == 5058) {
                aClass43_1151 = new Class43();
                aClass43_1151.anInt615 = anIntArray1149[--anInt1173];
                aClass43_1151.aClass348_Sub42_Sub10_614 = Class239_Sub6.aClass355_5900.method3471((aClass43_1151.anInt615), (byte) -87);
                aClass43_1151.anIntArray617 = new int[aClass43_1151.aClass348_Sub42_Sub10_614.method3215((byte) -48)];
                return;
            }
            if (i == 5059) {
                anInt1165++;
                Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Index.aClass351_643, (Class348_Sub23_Sub2.aClass77_9029), -93);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                int i_41_ = (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, aClass43_1151.anInt615);
                aClass43_1151.aClass348_Sub42_Sub10_614.method3210((byte) 12, aClass43_1151.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116));
                class348_sub47.aClass348_Sub49_Sub2_7116.method3339(115, (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197) - i_41_);
                Class348_Sub42_Sub14.method3243(127, class348_sub47);
                return;
            }
            if (i == 5060) {
                String string = aStringArray1152[--anInt1170];
                anInt1166++;
                Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class155.aClass351_2109, (Class348_Sub23_Sub2.aClass77_9029), -89);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                int i_42_ = (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, aClass43_1151.anInt615);
                aClass43_1151.aClass348_Sub42_Sub10_614.method3210((byte) -125, aClass43_1151.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116));
                class348_sub47.aClass348_Sub49_Sub2_7116.method3339(102, (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197) - i_42_);
                Class348_Sub42_Sub14.method3243(127, class348_sub47);
                return;
            }
            if (i == 5061) {
                anInt1165++;
                Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Index.aClass351_643, (Class348_Sub23_Sub2.aClass77_9029), -104);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
                int i_43_ = (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 1);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, aClass43_1151.anInt615);
                aClass43_1151.aClass348_Sub42_Sub10_614.method3210((byte) -126, aClass43_1151.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116));
                class348_sub47.aClass348_Sub49_Sub2_7116.method3339(92, (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197) - i_43_);
                Class348_Sub42_Sub14.method3243(-111, class348_sub47);
                return;
            }
            if (i == 5062) {
                anInt1173 -= 2;
                int i_44_ = anIntArray1149[anInt1173];
                int i_45_ = anIntArray1149[anInt1173 + 1];
                anIntArray1149[anInt1173++] = (Class200.aClass226_2639.method1625(0, i_44_).aCharArray9588[i_45_]);
                return;
            }
            if (i == 5063) {
                anInt1173 -= 2;
                int i_46_ = anIntArray1149[anInt1173];
                int i_47_ = anIntArray1149[anInt1173 + 1];
                anIntArray1149[anInt1173++] = (Class200.aClass226_2639.method1625(0, i_46_).aCharArray9582[i_47_]);
                return;
            }
            if (i == 5064) {
                anInt1173 -= 2;
                int i_48_ = anIntArray1149[anInt1173];
                int i_49_ = anIntArray1149[anInt1173 + 1];
                if (i_49_ == -1) anIntArray1149[anInt1173++] = -1;
                else {
                    anIntArray1149[anInt1173++] = Class200.aClass226_2639.method1625(0, i_48_).method3226((char) i_49_, 57249897);
                    return;
                }
                return;
            }
            if (i == 5065) {
                anInt1173 -= 2;
                int i_50_ = anIntArray1149[anInt1173];
                int i_51_ = anIntArray1149[anInt1173 + 1];
                if (i_51_ == -1) anIntArray1149[anInt1173++] = -1;
                else {
                    anIntArray1149[anInt1173++] = Class200.aClass226_2639.method1625(0, i_50_).method3222((byte) -122, (char) i_51_);
                    return;
                }
                return;
            }
            if (i == 5066) {
                int i_52_ = anIntArray1149[--anInt1173];
                anIntArray1149[anInt1173++] = Class239_Sub6.aClass355_5900.method3471(i_52_, (byte) -123).method3215((byte) -127);
                return;
            }
            if (i == 5067) {
                anInt1173 -= 2;
                int i_53_ = anIntArray1149[anInt1173];
                int i_54_ = anIntArray1149[anInt1173 + 1];
                int i_55_ = Class239_Sub6.aClass355_5900.method3471(i_53_, (byte) -127).method3212(0, i_54_).anInt1941;
                anIntArray1149[anInt1173++] = i_55_;
                return;
            }
            if (i == 5068) {
                anInt1173 -= 2;
                int i_56_ = anIntArray1149[anInt1173];
                int i_57_ = anIntArray1149[anInt1173 + 1];
                aClass43_1151.anIntArray617[i_56_] = i_57_;
                return;
            }
            if (i == 5069) {
                anInt1173 -= 2;
                int i_58_ = anIntArray1149[anInt1173];
                int i_59_ = anIntArray1149[anInt1173 + 1];
                aClass43_1151.anIntArray617[i_58_] = i_59_;
                return;
            }
            if (i == 5070) {
                anInt1173 -= 3;
                int i_60_ = anIntArray1149[anInt1173];
                int i_61_ = anIntArray1149[anInt1173 + 1];
                int i_62_ = anIntArray1149[anInt1173 + 2];
                Class348_Sub42_Sub10 class348_sub42_sub10 = Class239_Sub6.aClass355_5900.method3471(i_60_, (byte) -127);
                if ((class348_sub42_sub10.method3212(0, i_61_).anInt1941) != 0) throw new RuntimeException("bad command");
                anIntArray1149[anInt1173++] = class348_sub42_sub10.method3213(i_62_, i_61_, true);
                return;
            }
            if (i == 5071) {
                String string = aStringArray1152[--anInt1170];
                boolean bool_63_ = anIntArray1149[--anInt1173] == 1;
                Class64.method606(0, bool_63_, string);
                anIntArray1149[anInt1173++] = Class76.anInt1285;
                return;
            }
            if (i == 5072) {
                if (Class192.aShortArray2579 == null || Class148.anInt2037 >= Class76.anInt1285) anIntArray1149[anInt1173++] = -1;
                else {
                    anIntArray1149[anInt1173++] = (Class192.aShortArray2579[Class148.anInt2037++] & 0xffff);
                    return;
                }
                return;
            }
            if (i == 5073) {
                Class148.anInt2037 = 0;
                return;
            }
        } else if (i < 5200) {
            if (i == 5100) {
                if (Class182.aClass346_2449.method2696(86, -121)) anIntArray1149[anInt1173++] = 1;
                else {
                    anIntArray1149[anInt1173++] = 0;
                    return;
                }
                return;
            }
            if (i == 5101) {
                if (Class182.aClass346_2449.method2696(82, -126)) anIntArray1149[anInt1173++] = 1;
                else {
                    anIntArray1149[anInt1173++] = 0;
                    return;
                }
                return;
            }
            if (i == 5102) {
                if (Class182.aClass346_2449.method2696(81, -128)) anIntArray1149[anInt1173++] = 1;
                else {
                    anIntArray1149[anInt1173++] = 0;
                    return;
                }
                return;
            }
        } else if (i < 5300) {
            if (i == 5200) {
                Class27.method312(anIntArray1149[--anInt1173], (byte) 56);
                return;
            }
            if (i == 5201) {
                anIntArray1149[anInt1173++] = Class14_Sub2.method244(37);
                return;
            }
            if (i == 5205) {
                Class24.method298(false, -1, -1, anIntArray1149[--anInt1173], -53);
                return;
            }
            if (i == 5206) {
                int i_64_ = anIntArray1149[--anInt1173];
                Class348_Sub42_Sub14 class348_sub42_sub14 = Class75.method766(i_64_ >> 14 & 0x3fff, i_64_ & 0x3fff);
                if (class348_sub42_sub14 == null) anIntArray1149[anInt1173++] = -1;
                else {
                    anIntArray1149[anInt1173++] = (class348_sub42_sub14.anInt9628);
                    return;
                }
                return;
            }
            if (i == 5207) {
                Class348_Sub42_Sub14 class348_sub42_sub14 = Class75.method757(anIntArray1149[--anInt1173]);
                if (class348_sub42_sub14 == null || (class348_sub42_sub14.aString9632) == null) aStringArray1152[anInt1170++] = "";
                else {
                    aStringArray1152[anInt1170++] = (class348_sub42_sub14.aString9632);
                    return;
                }
                return;
            }
            if (i == 5208) {
                anIntArray1149[anInt1173++] = Class25.anInt370;
                anIntArray1149[anInt1173++] = Class182.anInt2446;
                return;
            }
            if (i == 5209) {
                anIntArray1149[anInt1173++] = Class348_Sub36.anInt6992 + Class75.anInt1266;
                anIntArray1149[anInt1173++] = Class245.anInt3170 + Class75.anInt1263;
                return;
            }
            if (i == 5210) {
                int i_65_ = anIntArray1149[--anInt1173];
                Class348_Sub42_Sub14 class348_sub42_sub14 = Class75.method757(i_65_);
                if (class348_sub42_sub14 == null) {
                    anIntArray1149[anInt1173++] = 0;
                    anIntArray1149[anInt1173++] = 0;
                } else {
                    anIntArray1149[anInt1173++] = (class348_sub42_sub14.anInt9640) >> 14 & 0x3fff;
                    anIntArray1149[anInt1173++] = (class348_sub42_sub14.anInt9640) & 0x3fff;
                    return;
                }
                return;
            }
            if (i == 5211) {
                int i_66_ = anIntArray1149[--anInt1173];
                Class348_Sub42_Sub14 class348_sub42_sub14 = Class75.method757(i_66_);
                if (class348_sub42_sub14 == null) {
                    anIntArray1149[anInt1173++] = 0;
                    anIntArray1149[anInt1173++] = 0;
                } else {
                    anIntArray1149[anInt1173++] = ((class348_sub42_sub14.anInt9635) - (class348_sub42_sub14.anInt9644));
                    anIntArray1149[anInt1173++] = ((class348_sub42_sub14.anInt9627) - (class348_sub42_sub14.anInt9643));
                    return;
                }
                return;
            }
            if (i == 5212) {
                Class348_Sub21 class348_sub21 = Class5_Sub3.method199(1);
                if (class348_sub21 == null) {
                    anIntArray1149[anInt1173++] = -1;
                    anIntArray1149[anInt1173++] = -1;
                } else {
                    anIntArray1149[anInt1173++] = class348_sub21.anInt6847;
                    int i_67_ = (class348_sub21.anInt6850 << 28 | (class348_sub21.anInt6852 + Class75.anInt1266) << 14 | (class348_sub21.anInt6851 + Class75.anInt1263));
                    anIntArray1149[anInt1173++] = i_67_;
                    return;
                }
                return;
            }
            if (i == 5213) {
                Class348_Sub21 class348_sub21 = Class356.method3479(-1);
                if (class348_sub21 == null) {
                    anIntArray1149[anInt1173++] = -1;
                    anIntArray1149[anInt1173++] = -1;
                } else {
                    anIntArray1149[anInt1173++] = class348_sub21.anInt6847;
                    int i_68_ = (class348_sub21.anInt6850 << 28 | (class348_sub21.anInt6852 + Class75.anInt1266) << 14 | (class348_sub21.anInt6851 + Class75.anInt1263));
                    anIntArray1149[anInt1173++] = i_68_;
                    return;
                }
                return;
            }
            if (i == 5214) {
                int i_69_ = anIntArray1149[--anInt1173];
                Class348_Sub42_Sub14 class348_sub42_sub14 = Class163.method1269(-17096);
                if (class348_sub42_sub14 != null) {
                    boolean bool_70_ = class348_sub42_sub14.method3236(anIntArray1175, i_69_ >> 14 & 0x3fff, i_69_ & 0x3fff, i_69_ >> 28 & 0x3, (byte) -28);
                    if (bool_70_) Class348_Sub16_Sub3.method2839(anIntArray1175[1], -17, anIntArray1175[2]);
                }
                return;
            }
            if (i == 5215) {
                anInt1173 -= 2;
                int i_71_ = anIntArray1149[anInt1173];
                int i_72_ = anIntArray1149[anInt1173 + 1];
                Class107 class107 = Class75.method767(i_71_ >> 14 & 0x3fff, i_71_ & 0x3fff);
                boolean bool_73_ = false;
                for (Class348_Sub42_Sub14 class348_sub42_sub14 = (Class348_Sub42_Sub14) class107.method1011(-48); class348_sub42_sub14 != null; class348_sub42_sub14 = ((Class348_Sub42_Sub14) class107.method1003((byte) 113))) {
                    if (class348_sub42_sub14.anInt9628 == i_72_) {
                        bool_73_ = true;
                        break;
                    }
                }
                if (bool_73_) anIntArray1149[anInt1173++] = 1;
                else {
                    anIntArray1149[anInt1173++] = 0;
                    return;
                }
                return;
            }
            if (i == 5218) {
                int i_74_ = anIntArray1149[--anInt1173];
                Class348_Sub42_Sub14 class348_sub42_sub14 = Class75.method757(i_74_);
                if (class348_sub42_sub14 == null) anIntArray1149[anInt1173++] = -1;
                else {
                    anIntArray1149[anInt1173++] = (class348_sub42_sub14.anInt9631);
                    return;
                }
                return;
            }
            if (i == 5220) {
                anIntArray1149[anInt1173++] = Class348.anInt4290 == 100 ? 1 : 0;
                return;
            }
            if (i == 5221) {
                int i_75_ = anIntArray1149[--anInt1173];
                Class348_Sub16_Sub3.method2839(i_75_ >> 14 & 0x3fff, -17, i_75_ & 0x3fff);
                return;
            }
            if (i == 5222) {
                Class348_Sub42_Sub14 class348_sub42_sub14 = Class163.method1269(-17096);
                if (class348_sub42_sub14 == null) {
                    anIntArray1149[anInt1173++] = -1;
                    anIntArray1149[anInt1173++] = -1;
                    return;
                } else {
                    boolean bool_76_ = (class348_sub42_sub14.method3239(true, Class245.anInt3170 + Class75.anInt1263, Class348_Sub36.anInt6992 + Class75.anInt1266, anIntArray1175));
                    if (bool_76_) {
                        anIntArray1149[anInt1173++] = anIntArray1175[1];
                        anIntArray1149[anInt1173++] = anIntArray1175[2];
                    } else {
                        anIntArray1149[anInt1173++] = -1;
                        anIntArray1149[anInt1173++] = -1;
                    }
                }
                return;
            }
            if (i == 5223) {
                anInt1173 -= 2;
                int i_77_ = anIntArray1149[anInt1173];
                int i_78_ = anIntArray1149[anInt1173 + 1];
                Class24.method298(false, i_78_ & 0x3fff, i_78_ >> 14 & 0x3fff, i_77_, -53);
                return;
            }
            if (i == 5224) {
                int i_79_ = anIntArray1149[--anInt1173];
                Class348_Sub42_Sub14 class348_sub42_sub14 = Class163.method1269(-17096);
                if (class348_sub42_sub14 == null) {
                    anIntArray1149[anInt1173++] = -1;
                    anIntArray1149[anInt1173++] = -1;
                    return;
                } else {
                    boolean bool_80_ = class348_sub42_sub14.method3236(anIntArray1175, i_79_ >> 14 & 0x3fff, i_79_ & 0x3fff, i_79_ >> 28 & 0x3, (byte) -28);
                    if (bool_80_) {
                        anIntArray1149[anInt1173++] = anIntArray1175[1];
                        anIntArray1149[anInt1173++] = anIntArray1175[2];
                    } else {
                        anIntArray1149[anInt1173++] = -1;
                        anIntArray1149[anInt1173++] = -1;
                    }
                }
                return;
            }
            if (i == 5225) {
                int i_81_ = anIntArray1149[--anInt1173];
                Class348_Sub42_Sub14 class348_sub42_sub14 = Class163.method1269(-17096);
                if (class348_sub42_sub14 == null) {
                    anIntArray1149[anInt1173++] = -1;
                    anIntArray1149[anInt1173++] = -1;
                    return;
                } else {
                    boolean bool_82_ = class348_sub42_sub14.method3239(true, i_81_ & 0x3fff, i_81_ >> 14 & 0x3fff, anIntArray1175);
                    if (bool_82_) {
                        anIntArray1149[anInt1173++] = anIntArray1175[1];
                        anIntArray1149[anInt1173++] = anIntArray1175[2];
                    } else {
                        anIntArray1149[anInt1173++] = -1;
                        anIntArray1149[anInt1173++] = -1;
                    }
                }
                return;
            }
            if (i == 5226) {
                Class130.method1129(anIntArray1149[--anInt1173], 100);
                return;
            }
            if (i == 5227) {
                anInt1173 -= 2;
                int i_83_ = anIntArray1149[anInt1173];
                int i_84_ = anIntArray1149[anInt1173 + 1];
                Class24.method298(true, i_84_ & 0x3fff, i_84_ >> 14 & 0x3fff, i_83_, -62);
                return;
            }
            if (i == 5228) {
                Class348_Sub1_Sub1.aBoolean8805 = anIntArray1149[--anInt1173] == 1;
                return;
            }
            if (i == 5229) {
                anIntArray1149[anInt1173++] = Class348_Sub1_Sub1.aBoolean8805 ? 1 : 0;
                return;
            }
            if (i == 5230) {
                int i_85_ = anIntArray1149[--anInt1173];
                Class27.method314((byte) -74, i_85_);
                return;
            }
            if (i == 5231) {
                anInt1173 -= 2;
                int i_86_ = anIntArray1149[anInt1173];
                boolean bool_87_ = anIntArray1149[anInt1173 + 1] == 1;
                if (Class348_Sub42_Sub9_Sub1.aClass356_10442 != null) {
                    Class348 class348 = Class348_Sub42_Sub9_Sub1.aClass356_10442.method3480(i_86_, -6008);
                    if (class348 != null && !bool_87_) class348.method2715((byte) 48);
                    else if (class348 == null && bool_87_) {
                        class348 = new Class348();
                        Class348_Sub42_Sub9_Sub1.aClass356_10442.method3483((byte) 29, i_86_, class348);
                    }
                }
                return;
            }
            if (i == 5232) {
                int i_88_ = anIntArray1149[--anInt1173];
                if (Class348_Sub42_Sub9_Sub1.aClass356_10442 == null) {
                    anIntArray1149[anInt1173++] = 0;
                    return;
                } else {
                    Class348 class348 = Class348_Sub42_Sub9_Sub1.aClass356_10442.method3480(i_88_, -6008);
                    anIntArray1149[anInt1173++] = class348 != null ? 1 : 0;
                }
                return;
            }
            if (i == 5233) {
                anInt1173 -= 2;
                int i_89_ = anIntArray1149[anInt1173];
                boolean bool_90_ = anIntArray1149[anInt1173 + 1] == 1;
                if (Class158.aClass356_4934 != null) {
                    Class348 class348 = Class158.aClass356_4934.method3480(i_89_, -6008);
                    if (class348 != null && !bool_90_) class348.method2715((byte) 83);
                    else if (class348 == null && bool_90_) {
                        class348 = new Class348();
                        Class158.aClass356_4934.method3483((byte) 112, i_89_, class348);
                    }
                }
                return;
            }
            if (i == 5234) {
                int i_91_ = anIntArray1149[--anInt1173];
                if (Class158.aClass356_4934 == null) {
                    anIntArray1149[anInt1173++] = 0;
                    return;
                } else {
                    Class348 class348 = Class158.aClass356_4934.method3480(i_91_, -6008);
                    anIntArray1149[anInt1173++] = class348 != null ? 1 : 0;
                }
                return;
            }
            if (i == 5235) {
                anIntArray1149[anInt1173++] = (Class75.aClass348_Sub42_Sub14_1243 != null ? Class75.aClass348_Sub42_Sub14_1243.anInt9628 : -1);
                return;
            }
            if (i == 5236) {
                anInt1173 -= 2;
                int i_92_ = anIntArray1149[anInt1173];
                int i_93_ = anIntArray1149[anInt1173 + 1];
                int i_94_ = i_93_ >> 14 & 0x3fff;
                int i_95_ = i_93_ & 0x3fff;
                int i_96_ = Class239_Sub8.method1754(true, i_92_, i_94_, i_95_);
                if (i_96_ < 0) anIntArray1149[anInt1173++] = -1;
                else {
                    anIntArray1149[anInt1173++] = i_96_;
                    return;
                }
                return;
            }
            if (i == 5237) {
                Class130_Sub1.method1134(86);
                return;
            }
        } else if (i < 5400) {
            if (i == 5300) {
                anInt1173 -= 2;
                int i_97_ = anIntArray1149[anInt1173];
                int i_98_ = anIntArray1149[anInt1173 + 1];
                Class85.method830(3, i_97_, (byte) 102, false, i_98_);
                anIntArray1149[anInt1173++] = Class34.aFrame476 != null ? 1 : 0;
                return;
            }
            if (i == 5301) {
                if (Class34.aFrame476 != null) Class85.method830(Class316.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350), -1, (byte) 102, false, -1);
                return;
            }
            if (i == 5302) {
                Class57[] class57s = Class318_Sub9_Sub1.method2515(1494);
                anIntArray1149[anInt1173++] = class57s.length;
                return;
            }
            if (i == 5303) {
                int i_99_ = anIntArray1149[--anInt1173];
                Class57[] class57s = Class318_Sub9_Sub1.method2515(1494);
                anIntArray1149[anInt1173++] = class57s[i_99_].anInt1047;
                anIntArray1149[anInt1173++] = class57s[i_99_].anInt1054;
                return;
            }
            if (i == 5305) {
                int i_100_ = Class346.anInt4276;
                int i_101_ = Class239_Sub8.anInt5911;
                int i_102_ = -1;
                Class57[] class57s = Class318_Sub9_Sub1.method2515(1494);
                for (int i_103_ = 0; i_103_ < class57s.length; i_103_++) {
                    Class57 class57 = class57s[i_103_];
                    if (class57.anInt1047 == i_100_ && class57.anInt1054 == i_101_) {
                        i_102_ = i_103_;
                        break;
                    }
                }
                anIntArray1149[anInt1173++] = i_102_;
                return;
            }
            if (i == 5306) {
                anIntArray1149[anInt1173++] = Class348_Sub42_Sub12.method3229(-126);
                return;
            }
            if (i == 5307) {
                int i_104_ = anIntArray1149[--anInt1173];
                if (i_104_ >= 1 && i_104_ <= 2) {
                    Class85.method830(i_104_, -1, (byte) 102, false, -1);
                    return;
                }
                return;
            }
            if (i == 5308) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350);
                return;
            }
            if (i == 5309) {
                int i_105_ = anIntArray1149[--anInt1173];
                if (i_105_ >= 1 && i_105_ <= 2) {
                    Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub8_7227), i_105_);
                    Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub8_7254), i_105_);
                    Class14_Sub2.method243(37);
                    return;
                }
                return;
            }
        } else if (i < 5500) {
            if (i == 5400) {
                anInt1170 -= 2;
                String string = aStringArray1152[anInt1170];
                String string_106_ = aStringArray1152[anInt1170 + 1];
                int i_107_ = anIntArray1149[--anInt1173];
                anInt1171++;
                Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class348_Sub40_Sub17.aClass351_9234), (Class348_Sub23_Sub2.aClass77_9029), -101);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, (Class239_Sub6.method1745(string, -65) + Class239_Sub6.method1745(string_106_, -65) + 1));
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string_106_);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_107_);
                Class348_Sub42_Sub14.method3243(-66, class348_sub47);
                return;
            }
            if (i == 5401) {
                anInt1173 -= 2;
                Class318_Sub6.aShortArray6428[anIntArray1149[anInt1173]] = (short) aa.method160(27076, anIntArray1149[anInt1173 + 1]);
                Exception_Sub1.aClass255_112.method1930(-21804);
                Exception_Sub1.aClass255_112.method1936(-71);
                Class189.aClass278_2529.method2074(-118);
                Class354.method3466(125);
                return;
            }
            if (i == 5405) {
                anInt1173 -= 2;
                int i_108_ = anIntArray1149[anInt1173];
                int i_109_ = anIntArray1149[anInt1173 + 1];
                if (i_108_ >= 0 && i_108_ < 2) Class348_Sub43.anIntArrayArrayArray7079[i_108_] = new int[i_109_ << 1][4];
                return;
            }
            if (i == 5406) {
                anInt1173 -= 7;
                int i_110_ = anIntArray1149[anInt1173];
                int i_111_ = anIntArray1149[anInt1173 + 1] << 1;
                int i_112_ = anIntArray1149[anInt1173 + 2];
                int i_113_ = anIntArray1149[anInt1173 + 3];
                int i_114_ = anIntArray1149[anInt1173 + 4];
                int i_115_ = anIntArray1149[anInt1173 + 5];
                int i_116_ = anIntArray1149[anInt1173 + 6];
                if (i_110_ >= 0 && i_110_ < 2 && Class348_Sub43.anIntArrayArrayArray7079[i_110_] != null && i_111_ >= 0 && i_111_ < (Class348_Sub43.anIntArrayArrayArray7079[i_110_]).length) {
                    Class348_Sub43.anIntArrayArrayArray7079[i_110_][i_111_] = new int[]{(i_112_ >> 14 & 0x3fff) << 9, i_113_ << 2, (i_112_ & 0x3fff) << 9, i_116_};
                    Class348_Sub43.anIntArrayArrayArray7079[i_110_][i_111_ + 1] = new int[]{(i_114_ >> 14 & 0x3fff) << 9, i_115_ << 2, (i_114_ & 0x3fff) << 9};
                }
                return;
            }
            if (i == 5407) {
                int i_117_ = ((Class348_Sub43.anIntArrayArrayArray7079[anIntArray1149[--anInt1173]]).length >> 1);
                anIntArray1149[anInt1173++] = i_117_;
                return;
            }
            if (i == 5411) {
                if (Class34.aFrame476 != null) Class85.method830(Class316.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350), -1, (byte) 102, false, -1);
                if (Class52.aFrame4904 == null) {
                    String string = (Class116.aString1761 != null ? Class116.aString1761 : Class286_Sub6.method2162(false));
                    Class179.method1360(string, Class348_Sub23_Sub1.aClass297_8992, Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 1, false, -47);
                    return;
                } else {
                    Class318_Sub1_Sub2.method2405(97);
                    System.exit(0);
                }
                return;
            }
            if (i == 5419) {
                String string = "";
                if (Class348_Sub42_Sub6.aClass144_9536 != null) {
                    if (Class348_Sub42_Sub6.aClass144_9536.anObject1998 != null) string = (String) (Class348_Sub42_Sub6.aClass144_9536.anObject1998);
                    else string = Class235.method1669(-19918, (Class348_Sub42_Sub6.aClass144_9536.anInt2000));
                }
                aStringArray1152[anInt1170++] = string;
                return;
            }
            if (i == 5420) {
                anIntArray1149[anInt1173++] = Class348_Sub23_Sub1.aClass297_8992.aBoolean3777 ? 0 : 1;
                return;
            }
            if (i == 5421) {
                if (Class34.aFrame476 != null) Class85.method830(Class316.aClass348_Sub51_3959.aClass239_Sub8_7227.method1751(-32350), -1, (byte) 102, false, -1);
                String string = aStringArray1152[--anInt1170];
                boolean bool_118_ = anIntArray1149[--anInt1173] == 1;
                String string_119_ = Class286_Sub6.method2162(false) + string;
                Class179.method1360(string_119_, Class348_Sub23_Sub1.aClass297_8992, Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) == 1, bool_118_, 104);
                return;
            }
            if (i == 5422) {
                anInt1170 -= 2;
                String string = aStringArray1152[anInt1170];
                String string_120_ = aStringArray1152[anInt1170 + 1];
                int i_121_ = anIntArray1149[--anInt1173];
                if (string.length() > 0) {
                    if (Class367_Sub9.aStringArray7378 == null) Class367_Sub9.aStringArray7378 = new String[(Class272.anIntArray3475[Class348_Sub42_Sub8_Sub2.aClass230_10434.anInt2987])];
                    Class367_Sub9.aStringArray7378[i_121_] = string;
                }
                if (string_120_.length() > 0) {
                    if (Class54.aStringArray974 == null) Class54.aStringArray974 = new String[(Class272.anIntArray3475[Class348_Sub42_Sub8_Sub2.aClass230_10434.anInt2987])];
                    Class54.aStringArray974[i_121_] = string_120_;
                }
                return;
            }
            if (i == 5423) {
                System.out.println(aStringArray1152[--anInt1170]);
                return;
            }
            if (i == 5424) {
                anInt1173 -= 11;
                Class264.anInt3376 = anIntArray1149[anInt1173];
                Class51.anInt948 = anIntArray1149[anInt1173 + 1];
                Class264.anInt3374 = anIntArray1149[anInt1173 + 2];
                Class348_Sub42_Sub4.anInt9511 = anIntArray1149[anInt1173 + 3];
                Class231.anInt2996 = anIntArray1149[anInt1173 + 4];
                Class348_Sub40_Sub16.anInt9231 = anIntArray1149[anInt1173 + 5];
                Class318_Sub1_Sub3_Sub3.anInt10257 = anIntArray1149[anInt1173 + 6];
                Class313.anInt3937 = anIntArray1149[anInt1173 + 7];
                Class79.anInt1387 = anIntArray1149[anInt1173 + 8];
                Class348_Sub42_Sub11.anInt9586 = anIntArray1149[anInt1173 + 9];
                Class5_Sub2.anInt8363 = anIntArray1149[anInt1173 + 10];
                Class21.SPRITES.method421(false, Class231.anInt2996);
                Class21.SPRITES.method421(false, Class348_Sub40_Sub16.anInt9231);
                Class21.SPRITES.method421(false, Class318_Sub1_Sub3_Sub3.anInt10257);
                Class21.SPRITES.method421(false, Class313.anInt3937);
                Class21.SPRITES.method421(false, Class79.anInt1387);
                Class348_Sub42_Sub15.aSprite_9659 = Class110.aSprite_1706 = Class174.aSprite_2309 = null;
                OutputStream_Sub2.aSprite_106 = Class121.aSprite_1800 = Class348_Sub5.aSprite_6627 = null;
                Class348_Sub42_Sub15.aSprite_9658 = Class309.aSprite_4808 = null;
                Class71.aBoolean1211 = true;
                return;
            }
            if (i == 5425) {
                Class274.method2061(12);
                Class71.aBoolean1211 = false;
                return;
            }
            if (i == 5426) {
                anInt1173 -= 2;
                Class348_Sub42_Sub16_Sub1.anInt10447 = anIntArray1149[anInt1173];
                Class38.anInt506 = anIntArray1149[anInt1173 + 1];
                return;
            }
            if (i == 5427) {
                anInt1173 -= 2;
                Class286_Sub8.anInt6299 = anIntArray1149[anInt1173 + 1];
                return;
            }
            if (i == 5428) {
                anInt1173 -= 2;
                int i_122_ = anIntArray1149[anInt1173];
                int i_123_ = anIntArray1149[anInt1173 + 1];
                anIntArray1149[anInt1173++] = Class318_Sub1_Sub3.method2410((byte) -49, i_123_, i_122_) ? 1 : 0;
                return;
            }
            if (i == 5429) {
                Class82.method812(aStringArray1152[--anInt1170], false, false, (byte) -79);
                return;
            }
            if (i == 5430) {
                try {
                    Class224.method1617((byte) 125, Class93.anApplet1530, "accountcreated");
                } catch (Throwable throwable) {
                    /* empty */
                }
                return;
            }
            if (i == 5431) {
                try {
                    Class224.method1617((byte) 125, Class93.anApplet1530, "accountcreatestarted");
                } catch (Throwable throwable) {
                    /* empty */
                }
                return;
            }
            if (i == 5432) {
                String string = "";
                if (Class348_Sub40_Sub27.aClipboard9357 != null) {
                    Transferable transferable = Class348_Sub40_Sub27.aClipboard9357.getContents(null);
                    if (transferable != null) {
                        try {
                            string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
                            if (string == null) string = "";
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                }
                aStringArray1152[anInt1170++] = string;
                return;
            }
            if (i == 5433) {
                Class332.anInt4143 = anIntArray1149[--anInt1173];
                return;
            }
        } else if (i < 5600) {
            if (i == 5500) {
                anInt1173 -= 4;
                int i_124_ = anIntArray1149[anInt1173];
                int i_125_ = anIntArray1149[anInt1173 + 1];
                int i_126_ = anIntArray1149[anInt1173 + 2];
                int i_127_ = anIntArray1149[anInt1173 + 3];
                Class239_Sub28.method1844(i_126_, ((i_124_ >> 14 & 0x3fff) - za_Sub2.regionTileX), false, i_125_ << 2, false, i_127_, ((i_124_ & 0x3fff) - Class90.regionTileY));
                return;
            }
            if (i == 5501) {
                anInt1173 -= 4;
                int i_128_ = anIntArray1149[anInt1173];
                int i_129_ = anIntArray1149[anInt1173 + 1];
                int i_130_ = anIntArray1149[anInt1173 + 2];
                int i_131_ = anIntArray1149[anInt1173 + 3];
                Class348_Sub42_Sub12.method3231(((i_128_ & 0x3fff) - Class90.regionTileY), ((i_128_ >> 14 & 0x3fff) - za_Sub2.regionTileX), i_129_ << 2, i_131_, i_130_, -128);
                return;
            }
            if (i == 5502) {
                anInt1173 -= 6;
                int i_132_ = anIntArray1149[anInt1173];
                if (i_132_ >= 2) throw new RuntimeException();
                za_Sub1.anInt9775 = i_132_;
                int i_133_ = anIntArray1149[anInt1173 + 1];
                if (i_133_ + 1 >= (Class348_Sub43.anIntArrayArrayArray7079[za_Sub1.anInt9775]).length >> 1) throw new RuntimeException();
                Class213.anInt2798 = i_133_;
                Class117.anInt1780 = 0;
                Class195.anInt5019 = anIntArray1149[anInt1173 + 2];
                Class331.anInt4133 = anIntArray1149[anInt1173 + 3];
                int i_134_ = anIntArray1149[anInt1173 + 4];
                if (i_134_ >= 2) throw new RuntimeException();
                Class292.anInt4803 = i_134_;
                int i_135_ = anIntArray1149[anInt1173 + 5];
                if (i_135_ + 1 >= (Class348_Sub43.anIntArrayArrayArray7079[Class292.anInt4803]).length >> 1) throw new RuntimeException();
                Class264.anInt3373 = i_135_;
                Class348_Sub40_Sub21.anInt9282 = 3;
                Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
                return;
            }
            if (i == 5503) {
                Class128.method1122(0);
                return;
            }
            if (i == 5504) {
                anInt1173 -= 2;
                Class318_Sub1_Sub1.method2396(anIntArray1149[anInt1173], anIntArray1149[anInt1173 + 1], 0, 3);
                return;
            }
            if (i == 5505) {
                anIntArray1149[anInt1173++] = (int) Class76.aFloat1287 >> 3;
                return;
            }
            if (i == 5506) {
                anIntArray1149[anInt1173++] = (int) Class314.aFloat3938 >> 3;
                return;
            }
            if (i == 5507) {
                Class31.method326((byte) 68);
                return;
            }
            if (i == 5508) {
                Class355.method3470(1);
                return;
            }
            if (i == 5509) {
                Class286_Sub3.method2153(-77);
                return;
            }
            if (i == 5510) {
                Class16.method262(0);
                return;
            }
            if (i == 5511) {
                int i_136_ = anIntArray1149[--anInt1173];
                int i_137_ = i_136_ >> 14 & 0x3fff;
                int i_138_ = i_136_ & 0x3fff;
                i_137_ -= za_Sub2.regionTileX;
                if (i_137_ < 0) i_137_ = 0;
                else if (i_137_ >= Class367_Sub4.anInt7319) i_137_ = Class367_Sub4.anInt7319;
                i_138_ -= Class90.regionTileY;
                if (i_138_ < 0) i_138_ = 0;
                else if (i_138_ >= Class348_Sub40_Sub3.anInt9109) i_138_ = Class348_Sub40_Sub3.anInt9109;
                Class348_Sub6.anInt6633 = (i_137_ << 9) + 256;
                Class348_Sub7.anInt6652 = (i_138_ << 9) + 256;
                Class348_Sub40_Sub21.anInt9282 = 4;
                Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
                return;
            }
            if (i == 5512) {
                Class239_Sub29.method1851((byte) 121);
                return;
            }
            if (i == 5514) {
                Class132.anInt1911 = anIntArray1149[--anInt1173];
                return;
            }
            if (i == 5516) {
                anIntArray1149[anInt1173++] = Class132.anInt1911;
                return;
            }
            if (i == 5517) {
                int i_139_ = anIntArray1149[--anInt1173];
                if (i_139_ == -1) {
                    int i_140_ = i_139_ >> 14 & 0x3fff;
                    int i_141_ = i_139_ & 0x3fff;
                    i_140_ -= za_Sub2.regionTileX;
                    if (i_140_ < 0) i_140_ = 0;
                    else if (i_140_ >= Class367_Sub4.anInt7319) i_140_ = Class367_Sub4.anInt7319;
                    i_141_ -= Class90.regionTileY;
                    if (i_141_ < 0) i_141_ = 0;
                    else if (i_141_ >= Class348_Sub40_Sub3.anInt9109) i_141_ = Class348_Sub40_Sub3.anInt9109;
                    Class9.anInt167 = (i_140_ << 9) + 256;
                    Class318_Sub1_Sub5_Sub2.anInt10163 = (i_141_ << 9) + 256;
                } else {
                    Class9.anInt167 = -1;
                    Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
                    return;
                }
                return;
            }
            if (i == 5547) {
                anIntArray1149[anInt1173++] = Class348_Sub40_Sub21.anInt9282 == 1 ? 1 : 0;
                return;
            }
        } else if (i < 5700) {
            if (i == 5600) {
                anInt1170 -= 2;
                String string = aStringArray1152[anInt1170];
                String string_142_ = aStringArray1152[anInt1170 + 1];
                int i_143_ = anIntArray1149[--anInt1173];
                if (string.length() <= 320 && Class240.anInt4674 == 3 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    Class64_Sub3.aString5600 = string;
                    Class186.aString2496 = string_142_;
                    RuntimeException_Sub1.anInt4596 = i_143_;
                    Class348_Sub49.method3379(2, 6);
                    return;
                }
                return;
            }
            if (i == 5601) {
                Class90.method854((byte) -76);
                return;
            }
            if (i == 5602) {
                if (Class225.anInt2955 == 0) {
                    Class107.anInt1645 = -2;
                    Class348_Sub6.anInt6634 = -2;
                }
                return;
            }
            if (i == 5604) {
                anInt1170--;
                if (Class240.anInt4674 == 3 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    Class281.method2106(aStringArray1152[anInt1170], 101);
                    return;
                }
                return;
            }
            if (i == 5605) {
                anInt1170 -= 2;
                anInt1173 -= 2;
                if (Class240.anInt4674 == 3 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    Class48.method449(aStringArray1152[anInt1170 + 1], aStringArray1152[anInt1170], false, anIntArray1149[anInt1173], anIntArray1149[anInt1173 + 1] == 1);
                    return;
                }
                return;
            }
            if (i == 5606) {
                if (Class367_Sub2.anInt7297 == 0) Class352.anInt4337 = -2;
                return;
            }
            if (i == 5607) {
                anIntArray1149[anInt1173++] = Class348_Sub6.anInt6634;
                return;
            }
            if (i == 5608) {
                anIntArray1149[anInt1173++] = Class63.anInt1121;
                return;
            }
            if (i == 5609) {
                anIntArray1149[anInt1173++] = Class352.anInt4337;
                return;
            }
            if (i == 5611) {
                anIntArray1149[anInt1173++] = Class348_Sub42_Sub7.anInt9541;
                return;
            }
            if (i == 5612) {
                int i_144_ = anIntArray1149[--anInt1173];
                if (Class240.anInt4674 == 7 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                        Class348_Sub40_Sub8.aClass238_9165.method1700((byte) 36);
                        Class348_Sub40_Sub8.aClass238_9165 = null;
                    }
                    RuntimeException_Sub1.anInt4596 = i_144_;
                    Class348_Sub49.method3379(2, 9);
                    return;
                }
                return;
            }
            if (i == 5613) {
                anIntArray1149[anInt1173++] = Class348_Sub6.anInt6634;
                return;
            }
            if (i == 5615) {
                anInt1170 -= 2;
                String string = aStringArray1152[anInt1170];
                String string_145_ = aStringArray1152[anInt1170 + 1];
                if (string.length() <= 320 && Class240.anInt4674 == 3 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                        Class348_Sub40_Sub8.aClass238_9165.method1700((byte) 36);
                        Class348_Sub40_Sub8.aClass238_9165 = null;
                    }
                    Class64_Sub3.aString5600 = string;
                    Class186.aString2496 = string_145_;
                    Class348_Sub49.method3379(2, 5);
                    return;
                }
                return;
            }
            if (i == 5616) {
                Class348_Sub40_Sub34.method3141(false, (byte) 11);
                return;
            }
            if (i == 5617) {
                anIntArray1149[anInt1173++] = Class107.anInt1645;
                return;
            }
            if (i == 5618) {
                anInt1173--;
                return;
            }
            if (i == 5619) {
                anInt1173--;
                return;
            }
            if (i == 5620) {
                anIntArray1149[anInt1173++] = 0;
                return;
            }
            if (i == 5621) {
                anInt1170 -= 2;
                anInt1173 -= 2;
                return;
            }
            if (i == 5622) return;
            if (i == 5623) {
                if (Class348_Sub23_Sub3.aString9043 == null) {
                    anIntArray1149[anInt1173++] = 0;
                    return;
                } else anIntArray1149[anInt1173++] = 1;
                return;
            }
            if (i == 5624) {
                anIntArray1149[anInt1173++] = (int) (Class244.aLong4615 >> 32);
                anIntArray1149[anInt1173++] = (int) (Class244.aLong4615 & 0xffffL);
                return;
            }
            if (i == 5625) {
                anIntArray1149[anInt1173++] = Class330.aBoolean4127 ? 1 : 0;
                return;
            }
            if (i == 5626) {
                Class330.aBoolean4127 = true;
                Class286_Sub8.method2172(84);
                return;
            }
        } else if (i < 6100) {
            if (i == 6001) {
                int i_146_ = anIntArray1149[--anInt1173];
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub10_7232), i_146_);
                Class348_Sub20.method2953((byte) -126);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6002) {
                boolean bool_147_ = anIntArray1149[--anInt1173] == 1;
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub27_7255), bool_147_ ? 1 : 0);
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub27_7261), bool_147_ ? 1 : 0);
                Class348_Sub20.method2953((byte) -122);
                Class348_Sub40_Sub9.method3072((byte) 32);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6003) {
                boolean bool_148_ = anIntArray1149[--anInt1173] == 1;
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub14_7250), bool_148_ ? 2 : 1);
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub14_7264), bool_148_ ? 2 : 1);
                Class348_Sub40_Sub9.method3072((byte) -106);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6005) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub4_7220), anIntArray1149[--anInt1173] == 1 ? 1 : 0);
                Class348_Sub20.method2953((byte) -111);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6007) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub13_7236), anIntArray1149[--anInt1173]);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6008) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub1_7246), anIntArray1149[--anInt1173] == 1 ? 1 : 0);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6010) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub21_7270), anIntArray1149[--anInt1173] == 1 ? 1 : 0);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6011) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub7_7238), anIntArray1149[--anInt1173]);
                Class348_Sub20.method2953((byte) -116);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6012) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub28_7230), anIntArray1149[--anInt1173] == 1 ? 1 : 0);
                Class348_Sub40.method3038(-1);
                Class76.method773(true);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6014) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub18_7259), anIntArray1149[--anInt1173] == 1 ? 2 : 0);
                Class348_Sub20.method2953((byte) -112);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6015) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub16_7247), anIntArray1149[--anInt1173] == 1 ? 1 : 0);
                Class348_Sub20.method2953((byte) -127);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6016) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub20_7248), anIntArray1149[--anInt1173]);
                Class367_Sub10.method3553(false, (byte) 112, Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350));
                Class14_Sub2.method243(37);
                return;
            }
            if (i == 6017) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub5_7240), anIntArray1149[--anInt1173] == 1 ? 1 : 0);
                Class35.method352(1);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6018) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub26_7272), anIntArray1149[--anInt1173]);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6019) {
                int i_149_ = anIntArray1149[--anInt1173];
                int i_150_ = Class316.aClass348_Sub51_3959.aClass239_Sub26_7260.method1838(-32350);
                if (i_149_ != i_150_) {
                    if (Class334.method2653(true, Class240.anInt4674)) {
                        if (i_150_ == 0 && Class267.anInt3428 != -1) {
                            Class348_Sub1_Sub3.method2732(0, Class267.anInt3428, false, 94, (Class59_Sub2_Sub1.MUSIC), i_149_);
                            Class348_Sub40_Sub17_Sub1.method3093(87);
                            Class74.aBoolean1236 = false;
                        } else if (i_149_ == 0) {
                            Class104.method960(1);
                            Class74.aBoolean1236 = false;
                        } else Class34.method345(i_149_, (byte) -49);
                    }
                    Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub26_7260), i_149_);
                    Class14_Sub2.method243(37);
                    r.aBoolean9719 = false;
                }
                return;
            }
            if (i == 6020) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub26_7234), anIntArray1149[--anInt1173]);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6021) {
                int i_151_ = Class316.aClass348_Sub51_3959.aClass239_Sub14_7250.method1778(-32350);
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub14_7264), anIntArray1149[--anInt1173] == 1 ? 0 : i_151_);
                Class348_Sub40_Sub9.method3072((byte) -118);
                return;
            }
            if (i == 6023) {
                int i_152_ = anIntArray1149[--anInt1173];
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub15_7224), i_152_);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6024) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub20_7216), anIntArray1149[--anInt1173]);
                Class14_Sub2.method243(37);
                return;
            }
            if (i == 6025) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub6_7226), anIntArray1149[--anInt1173]);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6027) {
                int i_153_ = anIntArray1149[--anInt1173];
                if (i_153_ < 0 || i_153_ > 1) i_153_ = 0;
                Class348_Sub40_Sub33.method3137(i_153_ == 1, (byte) -24);
                return;
            }
            if (i == 6028) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub22_7253), anIntArray1149[--anInt1173] != 0 ? 1 : 0);
                Class14_Sub2.method243(37);
                return;
            }
            if (i == 6029) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub13_7236), anIntArray1149[--anInt1173]);
                Class14_Sub2.method243(37);
                return;
            }
            if (i == 6030) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub9_7256), anIntArray1149[--anInt1173] != 0 ? 1 : 0);
                Class14_Sub2.method243(37);
                Class348_Sub20.method2953((byte) -116);
                return;
            }
            if (i == 6031) {
                int i_154_ = anIntArray1149[--anInt1173];
                if (i_154_ < 0 || i_154_ > 5) i_154_ = 2;
                Class367_Sub10.method3553(false, (byte) 101, i_154_);
                return;
            }
            if (i == 6032) {
                anInt1173 -= 2;
                int i_155_ = anIntArray1149[anInt1173];
                boolean bool_156_ = anIntArray1149[anInt1173 + 1] == 1;
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub25_7251), i_155_);
                if (!bool_156_) Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub29_7229), 0);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6033) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub17_7263), anIntArray1149[--anInt1173]);
                Class14_Sub2.method243(37);
                return;
            }
            if (i == 6034) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub24_7235), anIntArray1149[--anInt1173] == 1 ? 1 : 0);
                Class14_Sub2.method243(37);
                Class348_Sub40.method3038(-1);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6035) {
                int i_157_ = Class316.aClass348_Sub51_3959.aClass239_Sub27_7255.method1840(-32350);
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub27_7261), anIntArray1149[--anInt1173] == 1 ? 1 : i_157_);
                Class348_Sub20.method2953((byte) -110);
                Class348_Sub40_Sub9.method3072((byte) 125);
                return;
            }
            if (i == 6036) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub23_7231), anIntArray1149[--anInt1173]);
                Class14_Sub2.method243(37);
                RuntimeException_Sub1.aBoolean4604 = true;
                return;
            }
            if (i == 6037) {
                Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub26_7215), anIntArray1149[--anInt1173]);
                Class14_Sub2.method243(37);
                r.aBoolean9719 = false;
                return;
            }
            if (i == 6038) {
                int i_158_ = anIntArray1149[--anInt1173];
                int i_159_ = Class316.aClass348_Sub51_3959.aClass239_Sub26_7245.method1838(-32350);
                if (i_158_ != i_159_ && Class267.anInt3428 == Class345.anInt4270) {
                    if (!Class334.method2653(true, Class240.anInt4674)) {
                        if (i_159_ == 0) {
                            Class348_Sub1_Sub3.method2732(0, Class267.anInt3428, false, 127, (Class59_Sub2_Sub1.MUSIC), i_158_);
                            Class348_Sub40_Sub17_Sub1.method3093(118);
                            Class74.aBoolean1236 = false;
                        } else if (i_158_ == 0) {
                            Class104.method960(1);
                            Class74.aBoolean1236 = false;
                        } else Class34.method345(i_158_, (byte) -52);
                    }
                    Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub26_7245), i_158_);
                    Class14_Sub2.method243(37);
                    r.aBoolean9719 = false;
                }
                return;
            }
            if (i == 6039) {
                int i_160_ = anIntArray1149[--anInt1173];
                if (i_160_ > 255 || i_160_ < 0) i_160_ = 0;
                if (i_160_ != Class316.aClass348_Sub51_3959.aClass239_Sub19_7257.method1805(-32350)) {
                    Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub19_7257), i_160_);
                    Class14_Sub2.method243(37);
                    r.aBoolean9719 = false;
                }
                return;
            }
            if (i == 6040) {
                int i_161_ = anIntArray1149[--anInt1173];
                if (i_161_ != Class316.aClass348_Sub51_3959.aClass239_Sub3_7222.method1727(-32350)) {
                    Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub3_7222), i_161_);
                    Class14_Sub2.method243(37);
                    r.aBoolean9719 = false;
                    Class348_Sub42_Sub3.method3179(0);
                }
                return;
            }
        } else if (i < 6200) {
            if (i == 6101) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub10_7232.method1764(-32350);
                return;
            }
            if (i == 6102) {
                anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub27_7255.method1840(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6103) {
                anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub14_7250.method1778(-32350) == 2 ? 1 : 0);
                return;
            }
            if (i == 6105) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub4_7220.method1737(-32350) == 1 ? 1 : 0;
                return;
            }
            if (i == 6107) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub13_7236.method1776(-32350);
                return;
            }
            if (i == 6108) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub1_7246.method1720(-32350) == 1 ? 1 : 0;
                return;
            }
            if (i == 6110) {
                anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub21_7270.method1812(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6111) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub7_7238.method1748(-32350);
                return;
            }
            if (i == 6112) {
                anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub28_7230.method1845(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6114) {
                anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub18_7259.method1800(-32350) == 2 ? 1 : 0);
                return;
            }
            if (i == 6115) {
                anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub16_7247.method1789(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6116) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub20_7248.method1808(-32350);
                return;
            }
            if (i == 6117) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub5_7240.method1739(-32350) == 1 ? 1 : 0;
                return;
            }
            if (i == 6118) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub26_7272.method1838(-32350);
                return;
            }
            if (i == 6119) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub26_7260.method1838(-32350);
                return;
            }
            if (i == 6120) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub26_7234.method1838(-32350);
                return;
            }
            if (i == 6123) {
                anIntArray1149[anInt1173++] = Class5_Sub2.method197(false);
                return;
            }
            if (i == 6124) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub20_7216.method1808(-32350);
                return;
            }
            if (i == 6125) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub6_7226.method1743(-32350);
                return;
            }
            if (i == 6127) {
                anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub12_7243.method1771(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6128) {
                anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub22_7253.method1815(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6129) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub13_7236.method1776(-32350);
                return;
            }
            if (i == 6130) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub9_7256.method1759(-32350) == 1 ? 1 : 0;
                return;
            }
            if (i == 6131) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350);
                return;
            }
            if (i == 6132) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub25_7251.method1829(-32350);
                return;
            }
            if (i == 6133) {
                anIntArray1149[anInt1173++] = ((Class348_Sub23_Sub1.aClass297_8992.aBoolean3777) && !(Class348_Sub23_Sub1.aClass297_8992.aBoolean3794)) ? 1 : 0;
                return;
            }
            if (i == 6135) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub17_7263.method1798(-32350);
                return;
            }
            if (i == 6136) {
                anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub24_7235.method1820(-32350) == 1 ? 1 : 0);
                return;
            }
            if (i == 6138) {
                anIntArray1149[anInt1173++] = Class239_Sub14.method1781(Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350), -84, 200);
                return;
            }
            if (i == 6139) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub23_7231.method1818(-32350);
                return;
            }
            if (i == 6142) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub26_7215.method1838(-32350);
                return;
            }
            if (i == 6143) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub26_7245.method1838(-32350);
                return;
            }
            if (i == 6144) {
                anIntArray1149[anInt1173++] = Class348_Sub23_Sub2.aBoolean9038 ? 1 : 0;
                return;
            }
            if (i == 6145) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub19_7257.method1805(-32350);
                return;
            }
            if (i == 6146) {
                anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub3_7222.method1727(-32350);
                return;
            }
            if (i == 6147) {
                anIntArray1149[anInt1173++] = (Class348_Sub40_Sub20.aClass348_Sub4_9264.anInt6609 < 512 || Class348_Sub23_Sub2.aBoolean9038 || Class139.aBoolean1952) ? 1 : 0;
                return;
            }
            if (i == 6148) {
                anIntArray1149[anInt1173++] = Class304.aBoolean3847 ? 1 : 0;
                return;
            }
        } else if (i < 6300) {
            if (i == 6200) {
                anInt1173 -= 2;
                Class110.aShort1700 = (short) anIntArray1149[anInt1173];
                if (Class110.aShort1700 <= 0) Class110.aShort1700 = (short) 256;
                Class168.aShort2250 = (short) anIntArray1149[anInt1173 + 1];
                if (Class168.aShort2250 <= 0) Class168.aShort2250 = (short) 205;
                return;
            }
            if (i == 6201) {
                anInt1173 -= 2;
                Class348_Sub23_Sub3.aShort9044 = (short) anIntArray1149[anInt1173];
                if (Class348_Sub23_Sub3.aShort9044 <= 0) Class348_Sub23_Sub3.aShort9044 = (short) 256;
                Class320.aShort3992 = (short) anIntArray1149[anInt1173 + 1];
                if (Class320.aShort3992 <= 0) Class320.aShort3992 = (short) 320;
                return;
            }
            if (i == 6202) {
                anInt1173 -= 4;
                Class348_Sub42_Sub8.aShort9555 = (short) anIntArray1149[anInt1173];
                if (Class348_Sub42_Sub8.aShort9555 <= 0) Class348_Sub42_Sub8.aShort9555 = (short) 1;
                Class48.aShort851 = (short) anIntArray1149[anInt1173 + 1];
                if (Class48.aShort851 <= 0) Class48.aShort851 = (short) 32767;
                else if (Class48.aShort851 < Class348_Sub42_Sub8.aShort9555) Class48.aShort851 = Class348_Sub42_Sub8.aShort9555;
                Class367_Sub8.aShort7355 = (short) anIntArray1149[anInt1173 + 2];
                if (Class367_Sub8.aShort7355 <= 0) Class367_Sub8.aShort7355 = (short) 1;
                Class171.aShort2269 = (short) anIntArray1149[anInt1173 + 3];
                if (Class171.aShort2269 <= 0) Class171.aShort2269 = (short) 32767;
                else {
                    if (Class171.aShort2269 < Class367_Sub8.aShort7355) Class171.aShort2269 = Class367_Sub8.aShort7355;
                    return;
                }
                return;
            }
            if (i == 6203) {
                Class348_Sub42_Sub3.method3174(0, 0, Class348_Sub1.aClass46_6561.anInt709, false, (byte) 74, Class348_Sub1.aClass46_6561.anInt789);
                anIntArray1149[anInt1173++] = Class127.anInt4656;
                anIntArray1149[anInt1173++] = Class280.anInt3643;
                return;
            }
            if (i == 6204) {
                anIntArray1149[anInt1173++] = Class348_Sub23_Sub3.aShort9044;
                anIntArray1149[anInt1173++] = Class320.aShort3992;
                return;
            }
            if (i == 6205) {
                anIntArray1149[anInt1173++] = Class110.aShort1700;
                anIntArray1149[anInt1173++] = Class168.aShort2250;
                return;
            }
        } else if (i < 6400) {
            if (i == 6300) {
                anIntArray1149[anInt1173++] = (int) (Class62.method599(-76) / 60000L);
                return;
            }
            if (i == 6301) {
                anIntArray1149[anInt1173++] = (int) (Class62.method599(-77) / 86400000L) - 11745;
                return;
            }
            if (i == 6302) {
                anInt1173 -= 3;
                int i_162_ = anIntArray1149[anInt1173];
                int i_163_ = anIntArray1149[anInt1173 + 1];
                int i_164_ = anIntArray1149[anInt1173 + 2];
                aCalendar1160.clear();
                aCalendar1160.set(11, 12);
                aCalendar1160.set(i_164_, i_163_, i_162_);
                int i_165_ = ((int) (aCalendar1160.getTime().getTime() / 86400000L) - 11745);
                if (i_164_ < 1970) i_165_--;
                anIntArray1149[anInt1173++] = i_165_;
                return;
            }
            if (i == 6303) {
                aCalendar1160.clear();
                aCalendar1160.setTime(new Date(Class62.method599(-59)));
                anIntArray1149[anInt1173++] = aCalendar1160.get(1);
                return;
            }
            if (i == 6304) {
                int i_166_ = anIntArray1149[--anInt1173];
                boolean bool_167_ = true;
                if (i_166_ < 0) bool_167_ = (i_166_ + 1) % 4 == 0;
                else if (i_166_ < 1582) bool_167_ = i_166_ % 4 == 0;
                else if (i_166_ % 4 != 0) bool_167_ = false;
                else if (i_166_ % 100 != 0) bool_167_ = true;
                else if (i_166_ % 400 != 0) bool_167_ = false;
                anIntArray1149[anInt1173++] = bool_167_ ? 1 : 0;
                return;
            }
        } else if (i < 6500) {
            if (i == 6405) {
                anIntArray1149[anInt1173++] = Class67.method717(-2511) ? 1 : 0;
                return;
            }
            if (i == 6406) {
                anIntArray1149[anInt1173++] = Class247.method1891(314376967) ? 1 : 0;
                return;
            }
        } else if (i < 6600) {
            if (i == 6500) {
                if (Class240.anInt4674 != 7 || Class225.anInt2955 != 0 || Class367_Sub2.anInt7297 != 0) anIntArray1149[anInt1173++] = 1;
                else {
                    if (Class130.aBoolean1899) anIntArray1149[anInt1173++] = 0;
                    else {
                        if (Class240.aLong4683 > Class62.method599(-126) - 1000L) anIntArray1149[anInt1173++] = 1;
                        else {
                            Class130.aBoolean1899 = true;
                            Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class348_Sub23_Sub2.aClass351_9034), (Class348_Sub23_Sub2.aClass77_9029), -115);
                            class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 101, Class5_Sub1.anInt8349);
                            Class348_Sub42_Sub14.method3243(118, class348_sub47);
                            anIntArray1149[anInt1173++] = 0;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 6501) {
                Class110_Sub1 class110_sub1 = Class318_Sub1_Sub5.method2487(-97);
                if (class110_sub1 == null) {
                    anIntArray1149[anInt1173++] = -1;
                    anIntArray1149[anInt1173++] = 0;
                    aStringArray1152[anInt1170++] = "";
                    anIntArray1149[anInt1173++] = 0;
                    aStringArray1152[anInt1170++] = "";
                    anIntArray1149[anInt1173++] = 0;
                    anIntArray1149[anInt1173++] = 0;
                    aStringArray1152[anInt1170++] = "";
                    return;
                } else {
                    anIntArray1149[anInt1173++] = class110_sub1.anInt5786;
                    anIntArray1149[anInt1173++] = class110_sub1.anInt1708;
                    aStringArray1152[anInt1170++] = class110_sub1.aString5787;
                    Class283 class283 = class110_sub1.method1038(false);
                    anIntArray1149[anInt1173++] = class283.anInt3657;
                    aStringArray1152[anInt1170++] = class283.aString3663;
                    anIntArray1149[anInt1173++] = class110_sub1.anInt1704;
                    anIntArray1149[anInt1173++] = class110_sub1.anInt5788;
                    aStringArray1152[anInt1170++] = class110_sub1.aString5794;
                }
                return;
            }
            if (i == 6502) {
                Class110_Sub1 class110_sub1 = Class2.method170(true);
                if (class110_sub1 == null) {
                    anIntArray1149[anInt1173++] = -1;
                    anIntArray1149[anInt1173++] = 0;
                    aStringArray1152[anInt1170++] = "";
                    anIntArray1149[anInt1173++] = 0;
                    aStringArray1152[anInt1170++] = "";
                    anIntArray1149[anInt1173++] = 0;
                    anIntArray1149[anInt1173++] = 0;
                    aStringArray1152[anInt1170++] = "";
                    return;
                } else {
                    anIntArray1149[anInt1173++] = class110_sub1.anInt5786;
                    anIntArray1149[anInt1173++] = class110_sub1.anInt1708;
                    aStringArray1152[anInt1170++] = class110_sub1.aString5787;
                    Class283 class283 = class110_sub1.method1038(false);
                    anIntArray1149[anInt1173++] = class283.anInt3657;
                    aStringArray1152[anInt1170++] = class283.aString3663;
                    anIntArray1149[anInt1173++] = class110_sub1.anInt1704;
                    anIntArray1149[anInt1173++] = class110_sub1.anInt5788;
                    aStringArray1152[anInt1170++] = class110_sub1.aString5794;
                }
                return;
            }
            if (i == 6503) {
                int i_168_ = anIntArray1149[--anInt1173];
                String string = aStringArray1152[--anInt1170];
                if (Class240.anInt4674 != 7 || Class225.anInt2955 != 0 || Class367_Sub2.anInt7297 != 0) anIntArray1149[anInt1173++] = 0;
                else {
                    anIntArray1149[anInt1173++] = (Class348_Sub23_Sub1.method2972(string, i_168_, -42) ? 1 : 0);
                    return;
                }
                return;
            }
            if (i == 6506) {
                int i_169_ = anIntArray1149[--anInt1173];
                Class110_Sub1 class110_sub1 = Class239_Sub5.method1742(false, i_169_);
                if (class110_sub1 == null) {
                    anIntArray1149[anInt1173++] = -1;
                    aStringArray1152[anInt1170++] = "";
                    anIntArray1149[anInt1173++] = 0;
                    aStringArray1152[anInt1170++] = "";
                    anIntArray1149[anInt1173++] = 0;
                    anIntArray1149[anInt1173++] = 0;
                    aStringArray1152[anInt1170++] = "";
                    return;
                } else {
                    anIntArray1149[anInt1173++] = class110_sub1.anInt1708;
                    aStringArray1152[anInt1170++] = class110_sub1.aString5787;
                    Class283 class283 = class110_sub1.method1038(false);
                    anIntArray1149[anInt1173++] = class283.anInt3657;
                    aStringArray1152[anInt1170++] = class283.aString3663;
                    anIntArray1149[anInt1173++] = class110_sub1.anInt1704;
                    anIntArray1149[anInt1173++] = class110_sub1.anInt5788;
                    aStringArray1152[anInt1170++] = class110_sub1.aString5794;
                }
                return;
            }
            if (i == 6507) {
                anInt1173 -= 4;
                int i_170_ = anIntArray1149[anInt1173];
                boolean bool_171_ = anIntArray1149[anInt1173 + 1] == 1;
                int i_172_ = anIntArray1149[anInt1173 + 2];
                boolean bool_173_ = anIntArray1149[anInt1173 + 3] == 1;
                Class302.method2283(bool_173_, 0, i_172_, i_170_, bool_171_);
                return;
            }
            if (i == 6508) {
                Class348_Sub42_Sub20.method3283(-47);
                return;
            }
            if (i == 6509) {
                if (Class240.anInt4674 == 7) {
                    Class348_Sub40_Sub30.aBoolean9403 = anIntArray1149[--anInt1173] == 1;
                    return;
                }
                return;
            }
            if (i == 6510) {
                anIntArray1149[anInt1173++] = Class251.anInt3234;
                return;
            }
        } else if (i >= 6700) {
            if (i < 6800 && Class11.aClass231_196 == Class288.aClass231_4953) {
                if (i == 6700) {
                    int i_174_ = Class125.aClass356_4915.method3474(1);
                    if (r.anInt9721 != -1) i_174_++;
                    anIntArray1149[anInt1173++] = i_174_;
                    return;
                }
                if (i == 6701) {
                    int i_175_ = anIntArray1149[--anInt1173];
                    if (r.anInt9721 != -1) {
                        if (i_175_ == 0) {
                            anIntArray1149[anInt1173++] = r.anInt9721;
                            return;
                        }
                        i_175_--;
                    }
                    Class348_Sub41 class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3484(0));
                    while (i_175_-- > 0) class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3482(0));
                    anIntArray1149[anInt1173++] = class348_sub41.anInt7050;
                    return;
                }
                if (i == 6702) {
                    int i_176_ = anIntArray1149[--anInt1173];
                    if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_176_] == null) aStringArray1152[anInt1170++] = "";
                    else {
                        String string = (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_176_][0].aString721);
                        if (string == null) aStringArray1152[anInt1170++] = "";
                        else {
                            aStringArray1152[anInt1170++] = string.substring(0, string.indexOf(':'));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 6703) {
                    int i_177_ = anIntArray1149[--anInt1173];
                    if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_177_] == null) anIntArray1149[anInt1173++] = 0;
                    else {
                        anIntArray1149[anInt1173++] = (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_177_]).length;
                        return;
                    }
                    return;
                }
                if (i == 6704) {
                    anInt1173 -= 2;
                    int i_178_ = anIntArray1149[anInt1173];
                    int i_179_ = anIntArray1149[anInt1173 + 1];
                    if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_178_] == null) aStringArray1152[anInt1170++] = "";
                    else {
                        String string = (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_178_][i_179_].aString721);
                        if (string == null) aStringArray1152[anInt1170++] = "";
                        else {
                            aStringArray1152[anInt1170++] = string;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 6705) {
                    anInt1173 -= 2;
                    int i_180_ = anIntArray1149[anInt1173];
                    int i_181_ = anIntArray1149[anInt1173 + 1];
                    if (Class348_Sub40_Sub33.aClass46ArrayArray9427[i_180_] == null) anIntArray1149[anInt1173++] = 0;
                    else {
                        anIntArray1149[anInt1173++] = Class348_Sub40_Sub33.aClass46ArrayArray9427[i_180_][i_181_].anInt732;
                        return;
                    }
                    return;
                }
                if (i == 6706) return;
                if (i == 6707) {
                    anInt1173 -= 3;
                    int i_182_ = anIntArray1149[anInt1173];
                    int i_183_ = anIntArray1149[anInt1173 + 1];
                    int i_184_ = anIntArray1149[anInt1173 + 2];
                    Class348_Sub9.method2780(i_184_, "", (byte) 111, 1, i_182_ << 16 | i_183_);
                    return;
                }
                if (i == 6708) {
                    anInt1173 -= 3;
                    int i_185_ = anIntArray1149[anInt1173];
                    int i_186_ = anIntArray1149[anInt1173 + 1];
                    int i_187_ = anIntArray1149[anInt1173 + 2];
                    Class348_Sub9.method2780(i_187_, "", (byte) 127, 2, i_185_ << 16 | i_186_);
                    return;
                }
                if (i == 6709) {
                    anInt1173 -= 3;
                    int i_188_ = anIntArray1149[anInt1173];
                    int i_189_ = anIntArray1149[anInt1173 + 1];
                    int i_190_ = anIntArray1149[anInt1173 + 2];
                    Class348_Sub9.method2780(i_190_, "", (byte) 118, 3, i_188_ << 16 | i_189_);
                    return;
                }
                if (i == 6710) {
                    anInt1173 -= 3;
                    int i_191_ = anIntArray1149[anInt1173];
                    int i_192_ = anIntArray1149[anInt1173 + 1];
                    int i_193_ = anIntArray1149[anInt1173 + 2];
                    Class348_Sub9.method2780(i_193_, "", (byte) 8, 4, i_191_ << 16 | i_192_);
                    return;
                }
                if (i == 6711) {
                    anInt1173 -= 3;
                    int i_194_ = anIntArray1149[anInt1173];
                    int i_195_ = anIntArray1149[anInt1173 + 1];
                    int i_196_ = anIntArray1149[anInt1173 + 2];
                    Class348_Sub9.method2780(i_196_, "", (byte) 125, 5, i_194_ << 16 | i_195_);
                    return;
                }
                if (i == 6712) {
                    anInt1173 -= 3;
                    int i_197_ = anIntArray1149[anInt1173];
                    int i_198_ = anIntArray1149[anInt1173 + 1];
                    int i_199_ = anIntArray1149[anInt1173 + 2];
                    Class348_Sub9.method2780(i_199_, "", (byte) 108, 6, i_197_ << 16 | i_198_);
                    return;
                }
                if (i == 6713) {
                    anInt1173 -= 3;
                    int i_200_ = anIntArray1149[anInt1173];
                    int i_201_ = anIntArray1149[anInt1173 + 1];
                    int i_202_ = anIntArray1149[anInt1173 + 2];
                    Class348_Sub9.method2780(i_202_, "", (byte) -106, 7, i_200_ << 16 | i_201_);
                    return;
                }
                if (i == 6714) {
                    anInt1173 -= 3;
                    int i_203_ = anIntArray1149[anInt1173];
                    int i_204_ = anIntArray1149[anInt1173 + 1];
                    int i_205_ = anIntArray1149[anInt1173 + 2];
                    Class348_Sub9.method2780(i_205_, "", (byte) 117, 8, i_203_ << 16 | i_204_);
                    return;
                }
                if (i == 6715) {
                    anInt1173 -= 3;
                    int i_206_ = anIntArray1149[anInt1173];
                    int i_207_ = anIntArray1149[anInt1173 + 1];
                    int i_208_ = anIntArray1149[anInt1173 + 2];
                    Class348_Sub9.method2780(i_208_, "", (byte) -35, 9, i_206_ << 16 | i_207_);
                    return;
                }
                if (i == 6716) {
                    anInt1173 -= 3;
                    int i_209_ = anIntArray1149[anInt1173];
                    int i_210_ = anIntArray1149[anInt1173 + 1];
                    int i_211_ = anIntArray1149[anInt1173 + 2];
                    Class348_Sub9.method2780(i_211_, "", (byte) 107, 10, i_209_ << 16 | i_210_);
                    return;
                }
                if (i == 6717) {
                    anInt1173 -= 3;
                    int i_212_ = anIntArray1149[anInt1173];
                    int i_213_ = anIntArray1149[anInt1173 + 1];
                    int i_214_ = anIntArray1149[anInt1173 + 2];
                    Class46 class46 = Class348_Sub22.method2957(i_214_, (byte) -54, i_212_ << 16 | i_213_);
                    Class341.method2678(-2049);
                    Class348_Sub44 class348_sub44 = client.method105(class46);
                    Class339.method2666((class348_sub44.anInt7093), class348_sub44.method3307(100), class46, (byte) 21);
                    return;
                }
            } else if (i < 6900) {
                if (i == 6800) {
                    int i_215_ = anIntArray1149[--anInt1173];
                    Class42 class42 = Class348_Sub23_Sub2.aClass153_9031.method1225(i_215_, (byte) 96);
                    if (class42.aString597 == null) aStringArray1152[anInt1170++] = "";
                    else {
                        aStringArray1152[anInt1170++] = class42.aString597;
                        return;
                    }
                    return;
                }
                if (i == 6801) {
                    int i_216_ = anIntArray1149[--anInt1173];
                    Class42 class42 = Class348_Sub23_Sub2.aClass153_9031.method1225(i_216_, (byte) 111);
                    anIntArray1149[anInt1173++] = class42.anInt578;
                    return;
                }
                if (i == 6802) {
                    int i_217_ = anIntArray1149[--anInt1173];
                    Class42 class42 = Class348_Sub23_Sub2.aClass153_9031.method1225(i_217_, (byte) 91);
                    anIntArray1149[anInt1173++] = class42.anInt576;
                    return;
                }
                if (i == 6803) {
                    int i_218_ = anIntArray1149[--anInt1173];
                    Class42 class42 = Class348_Sub23_Sub2.aClass153_9031.method1225(i_218_, (byte) 44);
                    anIntArray1149[anInt1173++] = class42.anInt596;
                    return;
                }
                if (i == 6804) {
                    anInt1173 -= 2;
                    int i_219_ = anIntArray1149[anInt1173];
                    int i_220_ = anIntArray1149[anInt1173 + 1];
                    Class254 class254 = Class101_Sub3.aClass326_5764.method2600(i_220_, 28364);
                    if (class254.method1925(false)) aStringArray1152[anInt1170++] = (Class348_Sub23_Sub2.aClass153_9031.method1225(i_219_, (byte) 79).method376(class254.aString3258, i_220_, (byte) 126));
                    else {
                        anIntArray1149[anInt1173++] = (Class348_Sub23_Sub2.aClass153_9031.method1225(i_219_, (byte) 50).method378(class254.anInt3256, i_220_, false));
                        return;
                    }
                    return;
                }
            } else if (i < 7000) {
                if (i == 6900) {
                    anIntArray1149[anInt1173++] = (Class348_Sub40_Sub3.aBoolean9103 && !Class133.aBoolean1915) ? 1 : 0;
                    return;
                }
                if (i == 6901) {
                    anIntArray1149[anInt1173++] = Class116.anInt1758;
                    return;
                }
                if (i == 6902) {
                    anIntArray1149[anInt1173++] = Class135_Sub1.anInt4716;
                    return;
                }
                if (i == 6903) {
                    anIntArray1149[anInt1173++] = Class322.anInt4026;
                    return;
                }
                if (i == 6904) {
                    anIntArray1149[anInt1173++] = Class206.anInt4870;
                    return;
                }
                if (i == 6905) {
                    String string = "";
                    if (Class348_Sub42_Sub6.aClass144_9536 != null) {
                        if (Class348_Sub42_Sub6.aClass144_9536.anObject1998 != null) string = (String) (Class348_Sub42_Sub6.aClass144_9536.anObject1998);
                        else string = Class235.method1669(-19918, (Class348_Sub42_Sub6.aClass144_9536.anInt2000));
                    }
                    aStringArray1152[anInt1170++] = string;
                    return;
                }
                if (i == 6906) {
                    anIntArray1149[anInt1173++] = Class216.anInt4976;
                    return;
                }
                if (i == 6907) {
                    anIntArray1149[anInt1173++] = Class130_Sub1.anInt5797;
                    return;
                }
                if (i == 6908) {
                    anIntArray1149[anInt1173++] = Class348_Sub6.anInt6632;
                    return;
                }
                if (i == 6909) {
                    anIntArray1149[anInt1173++] = Class290.aBoolean3706 ? 1 : 0;
                    return;
                }
                if (i == 6910) {
                    anIntArray1149[anInt1173++] = Class24.anInt359;
                    return;
                }
                if (i == 6911) {
                    anIntArray1149[anInt1173++] = Applet_Sub1.anInt37;
                    return;
                }
                if (i == 6912) {
                    anIntArray1149[anInt1173++] = Class348_Sub1.anInt6551;
                    return;
                }
            } else if (i < 7100) {
                if (i == 7000) {
                    int i_221_ = Class318_Sub1_Sub4.method2478(1000);
                    anIntArray1149[anInt1173++] = Class64_Sub3.anInt5584 = Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350);
                    anIntArray1149[anInt1173++] = i_221_;
                    Class348_Sub20.method2953((byte) -113);
                    Class14_Sub2.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7001) {
                    Class133.method1140(47);
                    Class348_Sub20.method2953((byte) -126);
                    Class14_Sub2.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7002) {
                    Class47.method447((byte) -59);
                    Class348_Sub20.method2953((byte) -124);
                    Class14_Sub2.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7003) {
                    Class161.method1263(true);
                    Class348_Sub20.method2953((byte) -106);
                    Class14_Sub2.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7004) {
                    Class348_Sub40_Sub12.method3076(0, true);
                    Class348_Sub20.method2953((byte) -107);
                    Class14_Sub2.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7005) {
                    Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub29_7229), 0);
                    Class14_Sub2.method243(37);
                    r.aBoolean9719 = false;
                    return;
                }
                if (i == 7006) {
                    if (Class64_Sub3.anInt5584 == 2) Class221.aBoolean2881 = true;
                    else {
                        if (Class64_Sub3.anInt5584 == 1) Class330.aBoolean4117 = true;
                        else {
                            if (Class64_Sub3.anInt5584 == 3) Class348_Sub1.aBoolean6558 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 7007) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub29_7229.method1848(-32350);
                    return;
                }
            } else if (i < 7200) {
                if (i == 7100) {
                    anInt1173 -= 2;
                    int i_222_ = anIntArray1149[anInt1173];
                    int i_223_ = anIntArray1149[anInt1173 + 1];
                    if (i_222_ != -1) {
                        if (i_223_ > 255) i_223_ = 255;
                        else if (i_223_ < 0) i_223_ = 0;
                        Class55_Sub1.method524(i_223_, false, i_222_, -122);
                    }
                    return;
                }
                if (i == 7101) {
                    int i_224_ = anIntArray1149[--anInt1173];
                    if (i_224_ != -1) Class64_Sub3.method690((byte) 17, i_224_);
                    return;
                }
                if (i == 7102) {
                    int i_225_ = anIntArray1149[--anInt1173];
                    if (i_225_ != -1) FontMetrics.method1189(-1, i_225_);
                    return;
                }
                if (i == 7103) {
                    anIntArray1149[anInt1173++] = Class348_Sub40_Sub31.method3131((byte) 50, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (i < 7300) {
                if (i == 7201) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub4_7220.method1736(123) ? 1 : 0;
                    return;
                }
                if (i == 7202) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub21_7270.method1809(117) ? 1 : 0;
                    return;
                }
                if (i == 7203) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub7_7238.method1747(111) ? 1 : 0;
                    return;
                }
                if (i == 7204) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub18_7259.method1801(125) ? 1 : 0;
                    return;
                }
                if (i == 7205) {
                    anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub20_7216.method1806(108) && Class348_Sub8.aHa6654.method3699()) ? 1 : 0;
                    return;
                }
                if (i == 7206) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub15_7224.method1786(93) ? 1 : 0;
                    return;
                }
                if (i == 7207) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub6_7226.method1744(103) ? 1 : 0;
                    return;
                }
                if (i == 7208) {
                    anIntArray1149[anInt1173++] = (Class316.aClass348_Sub51_3959.aClass239_Sub12_7243.method1774(120) && Class348_Sub8.aHa6654.method3627()) ? 1 : 0;
                    return;
                }
                if (i == 7209) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub9_7256.method1757(115) ? 1 : 0;
                    return;
                }
                if (i == 7210) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub24_7235.method1824(124) ? 1 : 0;
                    return;
                }
                if (i == 7211) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub23_7231.method1817(108) ? 1 : 0;
                    return;
                }
                if (i == 7212) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub16_7247.method1790(94) ? 1 : 0;
                    return;
                }
                if (i == 7213) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub3_7222.method1729(91) ? 1 : 0;
                    return;
                }
                if (i == 7214) {
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub25_7251.method1831(95) ? 1 : 0;
                    return;
                }
            } else if (i < 7400) {
                if (i == 7301) {
                    int i_226_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub4_7220.method1714(3, i_226_);
                    return;
                }
                if (i == 7302) {
                    int i_227_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub21_7270.method1714(3, i_227_);
                    return;
                }
                if (i == 7303) {
                    int i_228_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub7_7238.method1714(3, i_228_);
                    return;
                }
                if (i == 7304) {
                    int i_229_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub18_7259.method1714(3, i_229_);
                    return;
                }
                if (i == 7305) {
                    int i_230_ = anIntArray1149[--anInt1173];
                    if (Class348_Sub8.aHa6654.method3699()) {
                        anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub20_7216.method1714(3, i_230_);
                        return;
                    } else anIntArray1149[anInt1173++] = 3;
                    return;
                }
                if (i == 7306) {
                    int i_231_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub15_7224.method1714(3, i_231_);
                    return;
                }
                if (i == 7307) {
                    int i_232_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub6_7226.method1714(3, i_232_);
                    return;
                }
                if (i == 7308) {
                    int i_233_ = anIntArray1149[--anInt1173];
                    if (Class348_Sub8.aHa6654.method3627()) {
                        anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub12_7243.method1714(3, i_233_);
                        return;
                    } else anIntArray1149[anInt1173++] = 3;
                    return;
                }
                if (i == 7309) {
                    int i_234_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub9_7256.method1714(3, i_234_);
                    return;
                }
                if (i == 7310) {
                    int i_235_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub24_7235.method1714(3, i_235_);
                    return;
                }
                if (i == 7311) {
                    int i_236_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub23_7231.method1714(3, i_236_);
                    return;
                }
                if (i == 7312) {
                    int i_237_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub16_7247.method1714(3, i_237_);
                    return;
                }
                if (i == 7313) {
                    int i_238_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub3_7222.method1714(3, i_238_);
                    return;
                }
                if (i == 7314) {
                    int i_239_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class316.aClass348_Sub51_3959.aClass239_Sub25_7251.method1714(3, i_239_);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(i));
    }

    static final void method705(Class348_Sub36 class348_sub36) {
        method712(class348_sub36, 200000);
    }

    static final void method706() {
        /* empty */
    }

    private static final void method707(String string, int i) {
        if (Class192.anInt2581 != 0 || ((!Class348_Sub40_Sub3.aBoolean9103 || Class133.aBoolean1915) && !Class50_Sub2.aBoolean5233)) {
            String string_240_ = string.toLowerCase();
            int i_241_ = 0;
            if (string_240_.startsWith(Class274.aClass274_3530.method2063(0, 544))) {
                i_241_ = 0;
                string = string.substring(Class274.aClass274_3530.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3531.method2063(0, 544))) {
                i_241_ = 1;
                string = string.substring(Class274.aClass274_3531.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3532.method2063(0, 544))) {
                i_241_ = 2;
                string = string.substring(Class274.aClass274_3532.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3533.method2063(0, 544))) {
                i_241_ = 3;
                string = string.substring(Class274.aClass274_3533.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3534.method2063(0, 544))) {
                i_241_ = 4;
                string = string.substring(Class274.aClass274_3534.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3535.method2063(0, 544))) {
                i_241_ = 5;
                string = string.substring(Class274.aClass274_3535.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3536.method2063(0, 544))) {
                i_241_ = 6;
                string = string.substring(Class274.aClass274_3536.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3537.method2063(0, 544))) {
                i_241_ = 7;
                string = string.substring(Class274.aClass274_3537.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3538.method2063(0, 544))) {
                i_241_ = 8;
                string = string.substring(Class274.aClass274_3538.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3539.method2063(0, 544))) {
                i_241_ = 9;
                string = string.substring(Class274.aClass274_3539.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3540.method2063(0, 544))) {
                i_241_ = 10;
                string = string.substring(Class274.aClass274_3540.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3541.method2063(0, 544))) {
                i_241_ = 11;
                string = string.substring(Class274.aClass274_3541.method2063(0, 544).length());
            } else if (Class348_Sub33.anInt6967 != 0) {
                if (string_240_.startsWith(Class274.aClass274_3530.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 0;
                    string = string.substring(Class274.aClass274_3530.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3531.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 1;
                    string = string.substring(Class274.aClass274_3531.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3532.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 2;
                    string = string.substring(Class274.aClass274_3532.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3533.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 3;
                    string = string.substring(Class274.aClass274_3533.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3534.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 4;
                    string = string.substring(Class274.aClass274_3534.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3535.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 5;
                    string = string.substring(Class274.aClass274_3535.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3536.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 6;
                    string = string.substring(Class274.aClass274_3536.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3537.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 7;
                    string = string.substring(Class274.aClass274_3537.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3538.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 8;
                    string = string.substring(Class274.aClass274_3538.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3539.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 9;
                    string = string.substring(Class274.aClass274_3539.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3540.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 10;
                    string = string.substring(Class274.aClass274_3540.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3541.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_241_ = 11;
                    string = string.substring(Class274.aClass274_3541.method2063(Class348_Sub33.anInt6967, 544).length());
                }
            }
            string_240_ = string.toLowerCase();
            int i_242_ = 0;
            if (string_240_.startsWith(Class274.aClass274_3542.method2063(0, 544))) {
                i_242_ = 1;
                string = string.substring(Class274.aClass274_3542.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3543.method2063(0, 544))) {
                i_242_ = 2;
                string = string.substring(Class274.aClass274_3543.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3544.method2063(0, 544))) {
                i_242_ = 3;
                string = string.substring(Class274.aClass274_3544.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3545.method2063(0, 544))) {
                i_242_ = 4;
                string = string.substring(Class274.aClass274_3545.method2063(0, 544).length());
            } else if (string_240_.startsWith(Class274.aClass274_3546.method2063(0, 544))) {
                i_242_ = 5;
                string = string.substring(Class274.aClass274_3546.method2063(0, 544).length());
            } else if (Class348_Sub33.anInt6967 != 0) {
                if (string_240_.startsWith(Class274.aClass274_3542.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_242_ = 1;
                    string = string.substring(Class274.aClass274_3542.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3543.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_242_ = 2;
                    string = string.substring(Class274.aClass274_3543.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3544.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_242_ = 3;
                    string = string.substring(Class274.aClass274_3544.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3545.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_242_ = 4;
                    string = string.substring(Class274.aClass274_3545.method2063(Class348_Sub33.anInt6967, 544).length());
                } else if (string_240_.startsWith(Class274.aClass274_3546.method2063(Class348_Sub33.anInt6967, 544))) {
                    i_242_ = 5;
                    string = string.substring(Class274.aClass274_3546.method2063(Class348_Sub33.anInt6967, 544).length());
                }
            }
            anInt1158++;
            Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class205.aClass351_2686, Class348_Sub23_Sub2.aClass77_9029, -88);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, 0);
            int i_243_ = (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_241_);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i_242_);
            Class367_Sub4.method3544((class348_sub47.aClass348_Sub49_Sub2_7116), -101, string);
            class348_sub47.aClass348_Sub49_Sub2_7116.method3339(119, (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197) - i_243_);
            Class348_Sub42_Sub14.method3243(124, class348_sub47);
        }
    }

    private static final int method708(char c) {
        if (Class237_Sub1.method1693(c, -114)) return 1;
        return 0;
    }

    private static final String method709(int i) {
        long l = ((long) i + 11745L) * 86400000L;
        aCalendar1160.setTime(new Date(l));
        int i_244_ = aCalendar1160.get(5);
        int i_245_ = aCalendar1160.get(2);
        int i_246_ = aCalendar1160.get(1);
        return (i_244_ + "-" + aStringArray1176[i_245_] + "-" + i_246_);
    }

    private static final void method710(int i, boolean bool) {
        if (i < 300) {
            if (i == 100) {
                anInt1173 -= 3;
                int i_247_ = anIntArray1149[anInt1173];
                int i_248_ = anIntArray1149[anInt1173 + 1];
                int i_249_ = anIntArray1149[anInt1173 + 2];
                if (i_248_ == 0) throw new RuntimeException();
                Class46 class46 = FontRenderer.method2570(1512932720, i_247_);
                if (class46.aClass46Array798 == null) class46.aClass46Array798 = new Class46[i_249_ + 1];
                if (class46.aClass46Array798.length <= i_249_) {
                    Class46[] class46s = new Class46[i_249_ + 1];
                    for (int i_250_ = 0; i_250_ < class46.aClass46Array798.length; i_250_++)
                        class46s[i_250_] = class46.aClass46Array798[i_250_];
                    class46.aClass46Array798 = class46s;
                }
                if (i_249_ > 0 && (class46.aClass46Array798[i_249_ - 1] == null)) throw new RuntimeException("Gap at:" + (i_249_ - 1));
                Class46 class46_251_ = new Class46();
                class46_251_.anInt774 = i_248_;
                class46_251_.anInt834 = class46_251_.anInt830 = class46.anInt830;
                class46_251_.anInt704 = i_249_;
                class46.aClass46Array798[i_249_] = class46_251_;
                if (bool) aClass46_1169 = class46_251_;
                else aClass46_1150 = class46_251_;
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 101) {
                Class46 class46 = bool ? aClass46_1169 : aClass46_1150;
                if (class46.anInt704 == -1) {
                    if (bool) throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                Class46 class46_252_ = FontRenderer.method2570(1512932720, class46.anInt830);
                class46_252_.aClass46Array798[(class46.anInt704)] = null;
                Class251.method1916(-9343, class46_252_);
                return;
            }
            if (i == 102) {
                Class46 class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
                class46.aClass46Array798 = null;
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 200) {
                anInt1173 -= 2;
                int i_253_ = anIntArray1149[anInt1173];
                int i_254_ = anIntArray1149[anInt1173 + 1];
                Class46 class46 = Class348_Sub22.method2957(i_254_, (byte) -54, i_253_);
                if (class46 == null || i_254_ == -1) {
                    anIntArray1149[anInt1173++] = 0;
                    return;
                } else {
                    anIntArray1149[anInt1173++] = 1;
                    if (bool) aClass46_1169 = class46;
                    else aClass46_1150 = class46;
                }
                return;
            }
            if (i == 201) {
                int i_255_ = anIntArray1149[--anInt1173];
                Class46 class46 = FontRenderer.method2570(1512932720, i_255_);
                if (class46 == null) {
                    anIntArray1149[anInt1173++] = 0;
                    return;
                } else {
                    anIntArray1149[anInt1173++] = 1;
                    if (bool) aClass46_1169 = class46;
                    else aClass46_1150 = class46;
                }
                return;
            }
            if (i == 202) {
                int i_256_ = anIntArray1149[--anInt1173];
                method714(i_256_);
                return;
            }
            if (i == 203) {
                int i_257_ = anIntArray1149[--anInt1173];
                method702(i_257_);
                return;
            }
        } else if (i < 500) {
            if (i == 403) {
                anInt1173 -= 2;
                int i_258_ = anIntArray1149[anInt1173];
                int i_259_ = anIntArray1149[anInt1173 + 1];
                if ((Class132.aPlayer_1907.aClass154_10536) != null) {
                    for (int i_260_ = 0; i_260_ < Class141.anIntArray1973.length; i_260_++) {
                        if (Class141.anIntArray1973[i_260_] == i_258_) {
                            Class132.aPlayer_1907.aClass154_10536.method1233(Class348_Sub40_Sub25.aClass150_9342, i_259_, -1, i_260_);
                            return;
                        }
                    }
                    for (int i_261_ = 0; i_261_ < Class91.anIntArray1521.length; i_261_++) {
                        if (Class91.anIntArray1521[i_261_] == i_258_) {
                            Class132.aPlayer_1907.aClass154_10536.method1233(Class348_Sub40_Sub25.aClass150_9342, i_259_, -1, i_261_);
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (i == 404) {
                anInt1173 -= 2;
                int i_262_ = anIntArray1149[anInt1173];
                int i_263_ = anIntArray1149[anInt1173 + 1];
                if ((Class132.aPlayer_1907.aClass154_10536) != null) {
                    Class132.aPlayer_1907.aClass154_10536.method1231(i_262_, 0, i_263_);
                    return;
                }
                return;
            }
            if (i == 410) {
                boolean bool_264_ = anIntArray1149[--anInt1173] != 0;
                if ((Class132.aPlayer_1907.aClass154_10536) != null) {
                    Class132.aPlayer_1907.aClass154_10536.method1229((byte) -17, bool_264_);
                    return;
                }
                return;
            }
            if (i == 411) {
                anInt1173 -= 2;
                int i_265_ = anIntArray1149[anInt1173];
                int i_266_ = anIntArray1149[anInt1173 + 1];
                if ((Class132.aPlayer_1907.aClass154_10536) != null) {
                    Class132.aPlayer_1907.aClass154_10536.method1227((byte) 42, i_265_, i_266_, Exception_Sub1.aClass255_112);
                    return;
                }
                return;
            }
        } else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
            Class46 class46;
            if (i >= 2000) {
                i -= 1000;
                class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
            } else class46 = bool ? aClass46_1169 : aClass46_1150;
            if (i == 1000) {
                anInt1173 -= 4;
                class46.anInt788 = anIntArray1149[anInt1173];
                class46.anInt739 = anIntArray1149[anInt1173 + 1];
                int i_267_ = anIntArray1149[anInt1173 + 2];
                if (i_267_ < 0) i_267_ = 0;
                else if (i_267_ > 5) i_267_ = 5;
                int i_268_ = anIntArray1149[anInt1173 + 3];
                if (i_268_ < 0) i_268_ = 0;
                else if (i_268_ > 5) i_268_ = 5;
                class46.aByte817 = (byte) i_267_;
                class46.aByte681 = (byte) i_268_;
                Class251.method1916(-9343, class46);
                Class111.method1048(class46, 50);
                if (class46.anInt704 == -1) Class239_Sub3.method1733((byte) -78, class46.anInt830);
                return;
            }
            if (i == 1001) {
                anInt1173 -= 4;
                class46.anInt842 = anIntArray1149[anInt1173];
                class46.anInt728 = anIntArray1149[anInt1173 + 1];
                class46.anInt796 = 0;
                class46.anInt826 = 0;
                int i_269_ = anIntArray1149[anInt1173 + 2];
                if (i_269_ < 0) i_269_ = 0;
                else if (i_269_ > 4) i_269_ = 4;
                int i_270_ = anIntArray1149[anInt1173 + 3];
                if (i_270_ < 0) i_270_ = 0;
                else if (i_270_ > 4) i_270_ = 4;
                class46.aByte778 = (byte) i_269_;
                class46.aByte724 = (byte) i_270_;
                Class251.method1916(-9343, class46);
                Class111.method1048(class46, 62);
                if (class46.anInt774 == 0) Class251.method1913(false, 36, class46);
                return;
            }
            if (i == 1003) {
                boolean bool_271_ = anIntArray1149[--anInt1173] == 1;
                if (class46.aBoolean813 != bool_271_) {
                    class46.aBoolean813 = bool_271_;
                    Class251.method1916(-9343, class46);
                }
                if (class46.anInt704 == -1) Class348_Sub26.method2999((byte) 90, class46.anInt830);
                return;
            }
            if (i == 1004) {
                anInt1173 -= 2;
                class46.anInt710 = anIntArray1149[anInt1173];
                class46.anInt775 = anIntArray1149[anInt1173 + 1];
                Class251.method1916(-9343, class46);
                Class111.method1048(class46, 59);
                if (class46.anInt774 == 0) Class251.method1913(false, 49, class46);
                return;
            }
            if (i == 1005) {
                class46.aBoolean776 = anIntArray1149[--anInt1173] == 1;
                return;
            }
        } else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
            Class46 class46;
            if (i >= 2000) {
                i -= 1000;
                class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
            } else class46 = bool ? aClass46_1169 : aClass46_1150;
            if (i == 1100) {
                anInt1173 -= 2;
                class46.anInt747 = anIntArray1149[anInt1173];
                if (class46.anInt747 > (class46.anInt698 - class46.anInt709)) class46.anInt747 = (class46.anInt698 - class46.anInt709);
                if (class46.anInt747 < 0) class46.anInt747 = 0;
                class46.anInt755 = anIntArray1149[anInt1173 + 1];
                if (class46.anInt755 > (class46.anInt791 - class46.anInt789)) class46.anInt755 = (class46.anInt791 - class46.anInt789);
                if (class46.anInt755 < 0) class46.anInt755 = 0;
                Class251.method1916(-9343, class46);
                if (class46.anInt704 == -1) Class328_Sub3.method2615(-91, class46.anInt830);
                return;
            }
            if (i == 1101) {
                class46.anInt749 = anIntArray1149[--anInt1173];
                Class251.method1916(-9343, class46);
                if (class46.anInt704 == -1) Class135.method1148(class46.anInt830, 6);
                return;
            }
            if (i == 1102) {
                class46.aBoolean810 = anIntArray1149[--anInt1173] == 1;
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1103) {
                class46.anInt696 = anIntArray1149[--anInt1173];
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1104) {
                class46.anInt690 = anIntArray1149[--anInt1173];
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1105) {
                int i_272_ = anIntArray1149[--anInt1173];
                if (class46.anInt756 != i_272_) {
                    class46.anInt756 = i_272_;
                    Class251.method1916(-9343, class46);
                }
                if (class46.anInt704 == -1) Class203.method1477(class46.anInt830, 14);
                return;
            }
            if (i == 1106) {
                class46.anInt828 = anIntArray1149[--anInt1173];
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1107) {
                class46.aBoolean697 = anIntArray1149[--anInt1173] == 1;
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1108) {
                class46.anInt770 = 1;
                class46.anInt753 = anIntArray1149[--anInt1173];
                Class251.method1916(-9343, class46);
                if (class46.anInt704 == -1) Class369.method3569(class46.anInt830, -125);
                return;
            }
            if (i == 1109) {
                anInt1173 -= 6;
                class46.anInt808 = anIntArray1149[anInt1173];
                class46.anInt786 = anIntArray1149[anInt1173 + 1];
                class46.anInt757 = anIntArray1149[anInt1173 + 2];
                class46.anInt675 = anIntArray1149[anInt1173 + 3];
                class46.anInt717 = anIntArray1149[anInt1173 + 4];
                class46.anInt716 = anIntArray1149[anInt1173 + 5];
                Class251.method1916(-9343, class46);
                if (class46.anInt704 == -1) {
                    Class239_Sub15.method1787(class46.anInt830, 8);
                    Class199.method1459(class46.anInt830, 2);
                }
                return;
            }
            if (i == 1110) {
                int i_273_ = anIntArray1149[--anInt1173];
                if (class46.anInt699 != i_273_) {
                    class46.anInt699 = i_273_;
                    class46.anInt795 = 0;
                    class46.anInt730 = 1;
                    class46.anInt841 = 0;
                    Class17 class17 = (class46.anInt699 == -1 ? null : Class10.aClass87_191.method835(class46.anInt699, 7));
                    if (class17 != null) Class264.method2017(class46.anInt795, class17, 46);
                    Class251.method1916(-9343, class46);
                }
                if (class46.anInt704 == -1) Class64_Sub3.method687((byte) -117, class46.anInt830);
                return;
            }
            if (i == 1111) {
                class46.aBoolean689 = anIntArray1149[--anInt1173] == 1;
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1112) {
                String string = aStringArray1152[--anInt1170];
                if (!string.equals(class46.aString792)) {
                    class46.aString792 = string;
                    Class251.method1916(-9343, class46);
                }
                if (class46.anInt704 == -1) Class348_Sub45_Sub2.method3316(121, class46.anInt830);
                return;
            }
            if (i == 1113) {
                class46.anInt702 = anIntArray1149[--anInt1173];
                Class251.method1916(-9343, class46);
                if (class46.anInt704 == -1) Class309.method2311((byte) -109, class46.anInt830);
                return;
            }
            if (i == 1114) {
                anInt1173 -= 3;
                class46.anInt762 = anIntArray1149[anInt1173];
                class46.anInt700 = anIntArray1149[anInt1173 + 1];
                class46.anInt673 = anIntArray1149[anInt1173 + 2];
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1115) {
                class46.aBoolean769 = anIntArray1149[--anInt1173] == 1;
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1116) {
                class46.anInt672 = anIntArray1149[--anInt1173];
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1117) {
                class46.anInt809 = anIntArray1149[--anInt1173];
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1118) {
                class46.aBoolean790 = anIntArray1149[--anInt1173] == 1;
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1119) {
                class46.aBoolean735 = anIntArray1149[--anInt1173] == 1;
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1120) {
                anInt1173 -= 2;
                class46.anInt698 = anIntArray1149[anInt1173];
                class46.anInt791 = anIntArray1149[anInt1173 + 1];
                Class251.method1916(-9343, class46);
                if (class46.anInt774 == 0) Class251.method1913(false, 62, class46);
                return;
            }
            if (i == 1122) {
                class46.aBoolean745 = anIntArray1149[--anInt1173] == 1;
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1123) {
                class46.anInt716 = anIntArray1149[--anInt1173];
                Class251.method1916(-9343, class46);
                if (class46.anInt704 == -1) Class239_Sub15.method1787(class46.anInt830, 8);
                return;
            }
            if (i == 1124) {
                int i_274_ = anIntArray1149[--anInt1173];
                class46.aBoolean744 = i_274_ == 1;
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1125) {
                anInt1173 -= 2;
                class46.anInt688 = anIntArray1149[anInt1173];
                class46.anInt799 = anIntArray1149[anInt1173 + 1];
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1126) {
                class46.anInt773 = anIntArray1149[--anInt1173];
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1127) {
                anInt1173 -= 2;
                int i_275_ = anIntArray1149[anInt1173];
                int i_276_ = anIntArray1149[anInt1173 + 1];
                Class254 class254 = Class101_Sub3.aClass326_5764.method2600(i_275_, 28364);
                if (i_276_ == class254.anInt3256) {
                    class46.method435(i_275_, -3437);
                    return;
                } else class46.method436(-70, i_275_, i_276_);
                return;
            }
            if (i == 1128) {
                int i_277_ = anIntArray1149[--anInt1173];
                String string = aStringArray1152[--anInt1170];
                Class254 class254 = Class101_Sub3.aClass326_5764.method2600(i_277_, 28364);
                if (class254.aString3258.equals(string)) {
                    class46.method435(i_277_, -3437);
                    return;
                } else class46.method439(0, i_277_, string);
                return;
            }
            if (i == 1129 || i == 1130) {
                int i_278_ = anIntArray1149[--anInt1173];
                if ((class46.anInt774 == 5 || i != 1129) && (class46.anInt774 == 4 || i != 1130)) {
                    if (class46.anInt806 != i_278_) {
                        class46.anInt806 = i_278_;
                        Class251.method1916(-9343, class46);
                    }
                    if (class46.anInt704 == -1) Class188.method1415(class46.anInt830, 117);
                    return;
                }
                return;
            }
        } else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
            Class46 class46;
            if (i >= 2000) {
                i -= 1000;
                class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
            } else class46 = bool ? aClass46_1169 : aClass46_1150;
            Class251.method1916(-9343, class46);
            if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212 || i == 1213) {
                anInt1173 -= 2;
                int i_279_ = anIntArray1149[anInt1173];
                int i_280_ = anIntArray1149[anInt1173 + 1];
                if (class46.anInt704 == -1) {
                    Class73.method743(9, class46.anInt830);
                    Class239_Sub15.method1787(class46.anInt830, 8);
                    Class199.method1459(class46.anInt830, 2);
                }
                if (i_279_ == -1) {
                    class46.anInt770 = 1;
                    class46.anInt753 = -1;
                    class46.anInt812 = -1;
                } else {
                    class46.anInt812 = i_279_;
                    class46.anInt781 = i_280_;
                    class46.aBoolean720 = i == 1208 || i == 1209;
                    Class213 class213 = Exception_Sub1.aClass255_112.method1940(74, i_279_);
                    class46.anInt757 = class213.anInt2787;
                    class46.anInt675 = class213.anInt2781;
                    class46.anInt717 = class213.anInt2810;
                    class46.anInt808 = class213.anInt2779;
                    class46.anInt786 = class213.anInt2826;
                    class46.anInt716 = class213.anInt2825;
                    if (i == 1205 || i == 1209) class46.anInt678 = 0;
                    else if (i == 1212 || i == 1213) class46.anInt678 = 1;
                    else class46.anInt678 = 2;
                    if (class46.anInt796 > 0) class46.anInt716 = (class46.anInt716 * 32 / class46.anInt796);
                    else {
                        if (class46.anInt842 > 0) class46.anInt716 = (class46.anInt716 * 32 / class46.anInt842);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 1201) {
                class46.anInt770 = 2;
                class46.anInt753 = anIntArray1149[--anInt1173];
                if (class46.anInt704 == -1) Class369.method3569(class46.anInt830, -124);
                return;
            }
            if (i == 1202) {
                class46.anInt770 = 3;
                class46.anInt753 = -1;
                if (class46.anInt704 == -1) Class369.method3569(class46.anInt830, 94);
                return;
            }
            if (i == 1203) {
                class46.anInt770 = 6;
                class46.anInt753 = anIntArray1149[--anInt1173];
                if (class46.anInt704 == -1) Class369.method3569(class46.anInt830, -26);
                return;
            }
            if (i == 1204) {
                class46.anInt770 = 5;
                class46.anInt753 = anIntArray1149[--anInt1173];
                if (class46.anInt704 == -1) Class369.method3569(class46.anInt830, -127);
                return;
            }
            if (i == 1206) {
                anInt1173 -= 4;
                class46.anInt705 = anIntArray1149[anInt1173];
                class46.anInt674 = anIntArray1149[anInt1173 + 1];
                class46.anInt733 = anIntArray1149[anInt1173 + 2];
                class46.anInt693 = anIntArray1149[anInt1173 + 3];
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1207) {
                anInt1173 -= 2;
                class46.anInt759 = anIntArray1149[anInt1173];
                class46.anInt835 = anIntArray1149[anInt1173 + 1];
                Class251.method1916(-9343, class46);
                return;
            }
            if (i == 1210) {
                anInt1173 -= 4;
                class46.anInt753 = anIntArray1149[anInt1173];
                class46.anInt779 = anIntArray1149[anInt1173 + 1];
                if (anIntArray1149[anInt1173 + 2] == 1) class46.anInt770 = 9;
                else class46.anInt770 = 8;
                class46.aBoolean720 = anIntArray1149[anInt1173 + 3] == 1;
                if (class46.anInt704 == -1) Class369.method3569(class46.anInt830, 8);
                return;
            }
            if (i == 1211) {
                class46.anInt770 = 5;
                class46.anInt753 = Class348_Sub42_Sub11.anInt9591;
                class46.anInt779 = 0;
                if (class46.anInt704 == -1) Class369.method3569(class46.anInt830, 66);
                return;
            }
        } else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
            Class46 class46;
            if (i >= 2000) {
                i -= 1000;
                class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
            } else class46 = bool ? aClass46_1169 : aClass46_1150;
            if (i == 1300) {
                int i_281_ = anIntArray1149[--anInt1173] - 1;
                if (i_281_ >= 0 && i_281_ <= 9) {
                    class46.method438(i_281_, 124, aStringArray1152[--anInt1170]);
                    return;
                } else anInt1170--;
                return;
            }
            if (i == 1301) {
                anInt1173 -= 2;
                int i_282_ = anIntArray1149[anInt1173];
                int i_283_ = anIntArray1149[anInt1173 + 1];
                if (i_282_ == -1 && i_283_ == -1) class46.aClass46_782 = null;
                else {
                    class46.aClass46_782 = Class348_Sub22.method2957(i_283_, (byte) -54, i_282_);
                    return;
                }
                return;
            }
            if (i == 1302) {
                int i_284_ = anIntArray1149[--anInt1173];
                if (i_284_ == InputStream_Sub1.anInt78 || i_284_ == Class179.anInt2361 || i_284_ == Class312.anInt3930) {
                    class46.anInt797 = i_284_;
                    return;
                }
                return;
            }
            if (i == 1303) {
                class46.anInt729 = anIntArray1149[--anInt1173];
                return;
            }
            if (i == 1304) {
                class46.anInt703 = anIntArray1149[--anInt1173];
                return;
            }
            if (i == 1305) {
                class46.aString752 = aStringArray1152[--anInt1170];
                return;
            }
            if (i == 1306) {
                class46.aString780 = aStringArray1152[--anInt1170];
                return;
            }
            if (i == 1307) {
                class46.aStringArray833 = null;
                return;
            }
            if (i == 1308) {
                class46.anInt695 = anIntArray1149[--anInt1173];
                class46.anInt824 = anIntArray1149[--anInt1173];
                return;
            }
            if (i == 1309) {
                int i_285_ = anIntArray1149[--anInt1173];
                int i_286_ = anIntArray1149[--anInt1173];
                if (i_286_ >= 1 && i_286_ <= 10) class46.method431(i_286_ - 1, i_285_, (byte) -119);
                return;
            }
            if (i == 1310) {
                class46.aString816 = aStringArray1152[--anInt1170];
                return;
            }
            if (i == 1311) {
                class46.anInt713 = anIntArray1149[--anInt1173];
                return;
            }
            if (i == 1312 || i == 1313) {
                int i_287_;
                int i_288_;
                int i_289_;
                if (i == 1312) {
                    anInt1173 -= 3;
                    i_287_ = anIntArray1149[anInt1173] - 1;
                    i_288_ = anIntArray1149[anInt1173 + 1];
                    i_289_ = anIntArray1149[anInt1173 + 2];
                    if (i_287_ < 0 || i_287_ > 9) throw new RuntimeException("IOR13121313");
                } else {
                    anInt1173 -= 2;
                    i_287_ = 10;
                    i_288_ = anIntArray1149[anInt1173];
                    i_289_ = anIntArray1149[anInt1173 + 1];
                }
                if (class46.aByteArray746 == null) {
                    if (i_288_ != 0) {
                        class46.aByteArray746 = new byte[11];
                        class46.aByteArray832 = new byte[11];
                        class46.anIntArray707 = new int[11];
                    } else return;
                }
                class46.aByteArray746[i_287_] = (byte) i_288_;
                if (i_288_ == 0) {
                    class46.aBoolean676 = false;
                    for (int i_290_ = 0; i_290_ < class46.aByteArray746.length; i_290_++) {
                        if (class46.aByteArray746[i_290_] != 0) {
                            class46.aBoolean676 = true;
                            break;
                        }
                    }
                } else class46.aBoolean676 = true;
                class46.aByteArray832[i_287_] = (byte) i_289_;
                return;
            }
            if (i == 1314) {
                class46.anInt719 = anIntArray1149[--anInt1173];
                return;
            }
        } else {
            if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
                Class46 class46;
                if (i >= 2000) {
                    i -= 1000;
                    class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
                } else class46 = bool ? aClass46_1169 : aClass46_1150;
                if (i == 1499) class46.method434(false);
                else {
                    String string = aStringArray1152[--anInt1170];
                    int[] is = null;
                    if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
                        int i_291_ = anIntArray1149[--anInt1173];
                        if (i_291_ > 0) {
                            is = new int[i_291_];
                            while (i_291_-- > 0) is[i_291_] = anIntArray1149[--anInt1173];
                        }
                        string = string.substring(0, string.length() - 1);
                    }
                    Object[] objects = new Object[string.length() + 1];
                    for (int i_292_ = objects.length - 1; i_292_ >= 1; i_292_--) {
                        if (string.charAt(i_292_ - 1) == 's') objects[i_292_] = aStringArray1152[--anInt1170];
                        else objects[i_292_] = new Integer(anIntArray1149[--anInt1173]);
                    }
                    int i_293_ = anIntArray1149[--anInt1173];
                    if (i_293_ != -1) objects[0] = new Integer(i_293_);
                    else objects = null;
                    if (i == 1400) class46.anObjectArray763 = objects;
                    else if (i == 1401) class46.anObjectArray805 = objects;
                    else if (i == 1402) class46.anObjectArray742 = objects;
                    else if (i == 1403) class46.anObjectArray811 = objects;
                    else if (i == 1404) class46.anObjectArray683 = objects;
                    else if (i == 1405) class46.anObjectArray823 = objects;
                    else if (i == 1406) class46.anObjectArray680 = objects;
                    else if (i == 1407) {
                        class46.anObjectArray777 = objects;
                        class46.anIntArray686 = is;
                    } else if (i == 1408) class46.anObjectArray764 = objects;
                    else if (i == 1409) class46.anObjectArray741 = objects;
                    else if (i == 1410) class46.anObjectArray692 = objects;
                    else if (i == 1411) class46.anObjectArray785 = objects;
                    else if (i == 1412) class46.anObjectArray839 = objects;
                    else if (i == 1414) {
                        class46.anObjectArray751 = objects;
                        class46.anIntArray771 = is;
                    } else if (i == 1415) {
                        class46.anObjectArray671 = objects;
                        class46.anIntArray731 = is;
                    } else if (i == 1416) class46.anObjectArray714 = objects;
                    else if (i == 1417) class46.anObjectArray803 = objects;
                    else if (i == 1418) class46.anObjectArray820 = objects;
                    else if (i == 1419) class46.anObjectArray822 = objects;
                    else if (i == 1420) class46.anObjectArray734 = objects;
                    else if (i == 1421) class46.anObjectArray761 = objects;
                    else if (i == 1422) class46.anObjectArray836 = objects;
                    else if (i == 1423) class46.anObjectArray840 = objects;
                    else if (i == 1424) class46.anObjectArray701 = objects;
                    else if (i == 1425) class46.anObjectArray807 = objects;
                    else if (i == 1426) class46.anObjectArray687 = objects;
                    else if (i == 1427) class46.anObjectArray727 = objects;
                    else if (i == 1428) {
                        class46.anObjectArray685 = objects;
                        class46.anIntArray818 = is;
                    } else if (i == 1429) {
                        class46.anObjectArray708 = objects;
                        class46.anIntArray831 = is;
                    } else if (i == 1430) class46.anObjectArray679 = objects;
                    class46.aBoolean682 = true;
                    return;
                }
                return;
            }
            if (i < 1600) {
                Class46 class46 = bool ? aClass46_1169 : aClass46_1150;
                if (i == 1500) {
                    anIntArray1149[anInt1173++] = class46.anInt800;
                    return;
                }
                if (i == 1501) {
                    anIntArray1149[anInt1173++] = class46.anInt750;
                    return;
                }
                if (i == 1502) {
                    anIntArray1149[anInt1173++] = class46.anInt709;
                    return;
                }
                if (i == 1503) {
                    anIntArray1149[anInt1173++] = class46.anInt789;
                    return;
                }
                if (i == 1504) {
                    anIntArray1149[anInt1173++] = class46.aBoolean813 ? 1 : 0;
                    return;
                }
                if (i == 1505) {
                    anIntArray1149[anInt1173++] = class46.anInt834;
                    return;
                }
                if (i == 1506) {
                    Class46 class46_294_ = Class237.method1687(class46, 3);
                    anIntArray1149[anInt1173++] = (class46_294_ == null ? -1 : class46_294_.anInt830);
                    return;
                }
            } else if (i < 1700) {
                Class46 class46 = bool ? aClass46_1169 : aClass46_1150;
                if (i == 1600) {
                    anIntArray1149[anInt1173++] = class46.anInt747;
                    return;
                }
                if (i == 1601) {
                    anIntArray1149[anInt1173++] = class46.anInt755;
                    return;
                }
                if (i == 1602) {
                    aStringArray1152[anInt1170++] = class46.aString792;
                    return;
                }
                if (i == 1603) {
                    anIntArray1149[anInt1173++] = class46.anInt698;
                    return;
                }
                if (i == 1604) {
                    anIntArray1149[anInt1173++] = class46.anInt791;
                    return;
                }
                if (i == 1605) {
                    anIntArray1149[anInt1173++] = class46.anInt716;
                    return;
                }
                if (i == 1606) {
                    anIntArray1149[anInt1173++] = class46.anInt757;
                    return;
                }
                if (i == 1607) {
                    anIntArray1149[anInt1173++] = class46.anInt717;
                    return;
                }
                if (i == 1608) {
                    anIntArray1149[anInt1173++] = class46.anInt675;
                    return;
                }
                if (i == 1609) {
                    anIntArray1149[anInt1173++] = class46.anInt696;
                    return;
                }
                if (i == 1610) {
                    anIntArray1149[anInt1173++] = class46.anInt808;
                    return;
                }
                if (i == 1611) {
                    anIntArray1149[anInt1173++] = class46.anInt786;
                    return;
                }
                if (i == 1612) {
                    anIntArray1149[anInt1173++] = class46.anInt756;
                    return;
                }
                if (i == 1613) {
                    int i_295_ = anIntArray1149[--anInt1173];
                    Class254 class254 = Class101_Sub3.aClass326_5764.method2600(i_295_, 28364);
                    if (class254.method1925(false)) aStringArray1152[anInt1170++] = class46.method429(i_295_, (class254.aString3258), -1);
                    else {
                        anIntArray1149[anInt1173++] = class46.method428((class254.anInt3256), i_295_, -126);
                        return;
                    }
                    return;
                }
                if (i == 1614) {
                    anIntArray1149[anInt1173++] = class46.anInt828;
                    return;
                }
                if (i == 2614) {
                    anIntArray1149[anInt1173++] = (class46.anInt770 == 1 ? class46.anInt753 : -1);
                    return;
                }
            } else if (i < 1800) {
                Class46 class46 = bool ? aClass46_1169 : aClass46_1150;
                if (i == 1700) {
                    anIntArray1149[anInt1173++] = class46.anInt812;
                    return;
                }
                if (i == 1701) {
                    if (class46.anInt812 == -1) {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    } else anIntArray1149[anInt1173++] = class46.anInt781;
                    return;
                }
                if (i == 1702) {
                    anIntArray1149[anInt1173++] = class46.anInt704;
                    return;
                }
            } else if (i < 1900) {
                Class46 class46 = bool ? aClass46_1169 : aClass46_1150;
                if (i == 1800) {
                    anIntArray1149[anInt1173++] = client.method105(class46).method3307(83);
                    return;
                }
                if (i == 1801) {
                    int i_296_ = anIntArray1149[--anInt1173];
                    i_296_--;
                    if (class46.aStringArray833 == null || i_296_ >= class46.aStringArray833.length || class46.aStringArray833[i_296_] == null) aStringArray1152[anInt1170++] = "";
                    else {
                        aStringArray1152[anInt1170++] = class46.aStringArray833[i_296_];
                        return;
                    }
                    return;
                }
                if (i == 1802) {
                    if (class46.aString752 == null) aStringArray1152[anInt1170++] = "";
                    else {
                        aStringArray1152[anInt1170++] = class46.aString752;
                        return;
                    }
                    return;
                }
            } else if (i < 2000 || i >= 2900 && i < 3000) {
                Class46 class46;
                if (i >= 2000) {
                    class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
                    i -= 1000;
                } else class46 = bool ? aClass46_1169 : aClass46_1150;
                if (anInt1177 >= 10) throw new RuntimeException("C29xx-1");
                if (i == 1927) {
                    if (class46.anObjectArray727 != null) {
                        Class348_Sub36 class348_sub36 = new Class348_Sub36();
                        class348_sub36.aClass46_6989 = class46;
                        class348_sub36.anObjectArray6987 = class46.anObjectArray727;
                        class348_sub36.anInt6988 = anInt1177 + 1;
                        Class348_Sub1_Sub2.aClass262_8810.method1999(class348_sub36, -20180);
                        return;
                    }
                    return;
                }
            } else if (i < 2600) {
                Class46 class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
                if (i == 2500) {
                    anIntArray1149[anInt1173++] = class46.anInt800;
                    return;
                }
                if (i == 2501) {
                    anIntArray1149[anInt1173++] = class46.anInt750;
                    return;
                }
                if (i == 2502) {
                    anIntArray1149[anInt1173++] = class46.anInt709;
                    return;
                }
                if (i == 2503) {
                    anIntArray1149[anInt1173++] = class46.anInt789;
                    return;
                }
                if (i == 2504) {
                    anIntArray1149[anInt1173++] = class46.aBoolean813 ? 1 : 0;
                    return;
                }
                if (i == 2505) {
                    anIntArray1149[anInt1173++] = class46.anInt834;
                    return;
                }
                if (i == 1506) {
                    Class46 class46_297_ = Class237.method1687(class46, 3);
                    anIntArray1149[anInt1173++] = (class46_297_ == null ? -1 : class46_297_.anInt830);
                    return;
                }
            } else if (i < 2700) {
                Class46 class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
                if (i == 2600) {
                    anIntArray1149[anInt1173++] = class46.anInt747;
                    return;
                }
                if (i == 2601) {
                    anIntArray1149[anInt1173++] = class46.anInt755;
                    return;
                }
                if (i == 2602) {
                    aStringArray1152[anInt1170++] = class46.aString792;
                    return;
                }
                if (i == 2603) {
                    anIntArray1149[anInt1173++] = class46.anInt698;
                    return;
                }
                if (i == 2604) {
                    anIntArray1149[anInt1173++] = class46.anInt791;
                    return;
                }
                if (i == 2605) {
                    anIntArray1149[anInt1173++] = class46.anInt716;
                    return;
                }
                if (i == 2606) {
                    anIntArray1149[anInt1173++] = class46.anInt757;
                    return;
                }
                if (i == 2607) {
                    anIntArray1149[anInt1173++] = class46.anInt717;
                    return;
                }
                if (i == 2608) {
                    anIntArray1149[anInt1173++] = class46.anInt675;
                    return;
                }
                if (i == 2609) {
                    anIntArray1149[anInt1173++] = class46.anInt696;
                    return;
                }
                if (i == 2610) {
                    anIntArray1149[anInt1173++] = class46.anInt808;
                    return;
                }
                if (i == 2611) {
                    anIntArray1149[anInt1173++] = class46.anInt786;
                    return;
                }
                if (i == 2612) {
                    anIntArray1149[anInt1173++] = class46.anInt756;
                    return;
                }
                if (i == 2613) {
                    anIntArray1149[anInt1173++] = class46.anInt828;
                    return;
                }
                if (i == 2614) {
                    anIntArray1149[anInt1173++] = (class46.anInt770 == 1 ? class46.anInt753 : -1);
                    return;
                }
            } else if (i < 2800) {
                if (i == 2700) {
                    Class46 class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
                    anIntArray1149[anInt1173++] = class46.anInt812;
                    return;
                }
                if (i == 2701) {
                    Class46 class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
                    if (class46.anInt812 == -1) {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    } else anIntArray1149[anInt1173++] = class46.anInt781;
                    return;
                }
                if (i == 2702) {
                    int i_298_ = anIntArray1149[--anInt1173];
                    Class348_Sub41 class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3480(i_298_, -6008));
                    if (class348_sub41 == null) {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    } else anIntArray1149[anInt1173++] = 1;
                    return;
                }
                if (i == 2703) {
                    Class46 class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
                    if (class46.aClass46Array798 == null) anIntArray1149[anInt1173++] = 0;
                    else {
                        int i_299_ = class46.aClass46Array798.length;
                        for (int i_300_ = 0; (i_300_ < class46.aClass46Array798.length); i_300_++) {
                            if (class46.aClass46Array798[i_300_] == null) {
                                i_299_ = i_300_;
                                break;
                            }
                        }
                        anIntArray1149[anInt1173++] = i_299_;
                        return;
                    }
                    return;
                }
                if (i == 2704 || i == 2705) {
                    anInt1173 -= 2;
                    int i_301_ = anIntArray1149[anInt1173];
                    int i_302_ = anIntArray1149[anInt1173 + 1];
                    Class348_Sub41 class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3480(i_301_, -6008));
                    if (class348_sub41 != null && (class348_sub41.anInt7050 == i_302_)) anIntArray1149[anInt1173++] = 1;
                    else {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    }
                    return;
                }
            } else if (i < 2900) {
                Class46 class46 = FontRenderer.method2570(1512932720, anIntArray1149[--anInt1173]);
                if (i == 2800) {
                    anIntArray1149[anInt1173++] = client.method105(class46).method3307(11);
                    return;
                }
                if (i == 2801) {
                    int i_303_ = anIntArray1149[--anInt1173];
                    i_303_--;
                    if (class46.aStringArray833 == null || i_303_ >= class46.aStringArray833.length || class46.aStringArray833[i_303_] == null) aStringArray1152[anInt1170++] = "";
                    else {
                        aStringArray1152[anInt1170++] = class46.aStringArray833[i_303_];
                        return;
                    }
                    return;
                }
                if (i == 2802) {
                    if (class46.aString752 == null) aStringArray1152[anInt1170++] = "";
                    else {
                        aStringArray1152[anInt1170++] = class46.aString752;
                        return;
                    }
                    return;
                }
            } else if (i < 3200) {
                if (i == 3100) {
                    String string = aStringArray1152[--anInt1170];
                    Class191.method1429(string, 0);
                    return;
                }
                if (i == 3101) {
                    anInt1173 -= 2;
                    Class11.method222((Class132.aPlayer_1907), anIntArray1149[anInt1173], (byte) 4, anIntArray1149[anInt1173 + 1]);
                    return;
                }
                if (i == 3103) {
                    Class274.method2060((byte) -101, true);
                    return;
                }
                if (i == 3104) {
                    String string = aStringArray1152[--anInt1170];
                    int i_304_ = 0;
                    if (Class50_Sub3.method468(string, 73)) i_304_ = Class348_Sub41.parseInt(true, string);
                    anInt1163++;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class348_Sub14.aClass351_6764), (Class348_Sub23_Sub2.aClass77_9029), -112);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 102, i_304_);
                    Class348_Sub42_Sub14.method3243(116, class348_sub47);
                    return;
                }
                if (i == 3105) {
                    String string = aStringArray1152[--anInt1170];
                    anInt1162++;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class340.aClass351_4225, (Class348_Sub23_Sub2.aClass77_9029), -96);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, string.length() + 1);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                    Class348_Sub42_Sub14.method3243(-81, class348_sub47);
                    return;
                }
                if (i == 3106) {
                    String string = aStringArray1152[--anInt1170];
                    anInt1153++;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class348_Sub40_Sub5.aClass351_9130), (Class348_Sub23_Sub2.aClass77_9029), -93);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, string.length() + 1);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                    Class348_Sub42_Sub14.method3243(35, class348_sub47);
                    return;
                }
                if (i == 3107) {
                    int i_305_ = anIntArray1149[--anInt1173];
                    String string = aStringArray1152[--anInt1170];
                    Class5_Sub3.method201(i_305_, -7257, string);
                    return;
                }
                if (i == 3108) {
                    anInt1173 -= 3;
                    int i_306_ = anIntArray1149[anInt1173];
                    int i_307_ = anIntArray1149[anInt1173 + 1];
                    int i_308_ = anIntArray1149[anInt1173 + 2];
                    Class46 class46 = FontRenderer.method2570(1512932720, i_308_);
                    Class100.method887(class46, i_306_, i_307_, 2147483647);
                    return;
                }
                if (i == 3109) {
                    anInt1173 -= 2;
                    int i_309_ = anIntArray1149[anInt1173];
                    int i_310_ = anIntArray1149[anInt1173 + 1];
                    Class46 class46 = bool ? aClass46_1169 : aClass46_1150;
                    Class100.method887(class46, i_309_, i_310_, 2147483647);
                    return;
                }
                if (i == 3110) {
                    int i_311_ = anIntArray1149[--anInt1173];
                    anInt1167++;
                    Class348_Sub47 class348_sub47 = Class286_Sub3.method2148((Class348_Sub40_Sub12.aClass351_9189), (Class348_Sub23_Sub2.aClass77_9029), -121);
                    class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, i_311_);
                    Class348_Sub42_Sub14.method3243(122, class348_sub47);
                    return;
                }
                if (i == 3111) {
                    anInt1173 -= 2;
                    int i_312_ = anIntArray1149[anInt1173];
                    int i_313_ = anIntArray1149[anInt1173 + 1];
                    Class348_Sub41 class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3480(i_312_, -6008));
                    if (class348_sub41 != null) Class127_Sub1.method1118((class348_sub41.anInt7050 != i_313_), true, class348_sub41, 2533);
                    Class338.method2661(i_313_, i_312_, 3, true, 2);
                    return;
                }
                if (i == 3112) {
                    anInt1173--;
                    int i_314_ = anIntArray1149[anInt1173];
                    Class348_Sub41 class348_sub41 = ((Class348_Sub41) Class125.aClass356_4915.method3480(i_314_, -6008));
                    if (class348_sub41 != null && class348_sub41.anInt7053 == 3) Class127_Sub1.method1118(true, true, class348_sub41, 2533);
                    return;
                }
                if (i == 3113) {
                    Class239_Sub1.method1721(aStringArray1152[--anInt1170], (byte) -70);
                    return;
                }
                if (i == 3114) {
                    anInt1173 -= 2;
                    int i_315_ = anIntArray1149[anInt1173];
                    int i_316_ = anIntArray1149[anInt1173 + 1];
                    String string = aStringArray1152[--anInt1170];
                    Class286_Sub2.method2144("", i_315_, (byte) -87, i_316_, string, "", "");
                    return;
                }
                if (i == 3115) {
                    anInt1173 -= 11;
                    Class221[] class221s = Class158.method1248(20);
                    Class341[] class341s = Class62.method596(20000);
                    Class272.method2051(anIntArray1149[anInt1173 + 9], anIntArray1149[anInt1173 + 5], class221s[anIntArray1149[anInt1173]], (class341s[anIntArray1149[anInt1173 + 1]]), anIntArray1149[anInt1173 + 7], anIntArray1149[anInt1173 + 6], anIntArray1149[anInt1173 + 4], (byte) 111, anIntArray1149[anInt1173 + 10], anIntArray1149[anInt1173 + 2], anIntArray1149[anInt1173 + 3], anIntArray1149[anInt1173 + 8]);
                    return;
                }
            } else if (i < 3300) {
                if (i == 3200) {
                    anInt1173 -= 3;
                    Class348_Sub20.method2947(true, 255, anIntArray1149[anInt1173], anIntArray1149[anInt1173 + 1], anIntArray1149[anInt1173 + 2], 256);
                    return;
                }
                if (i == 3201) {
                    Class151.method1212(255, anIntArray1149[--anInt1173], -1, 50);
                    return;
                }
                if (i == 3202) {
                    anInt1173 -= 2;
                    Class177.method1352(anIntArray1149[anInt1173], 255, anIntArray1149[anInt1173 + 1], (byte) -98);
                    return;
                }
                if (i == 3203) {
                    anInt1173 -= 4;
                    Class348_Sub20.method2947(true, anIntArray1149[anInt1173 + 3], anIntArray1149[anInt1173], anIntArray1149[anInt1173 + 1], anIntArray1149[anInt1173 + 2], 256);
                    return;
                }
                if (i == 3204) {
                    anInt1173 -= 3;
                    Class151.method1212(anIntArray1149[anInt1173 + 1], anIntArray1149[anInt1173], -1, anIntArray1149[anInt1173 + 2]);
                    return;
                }
                if (i == 3205) {
                    anInt1173 -= 3;
                    Class177.method1352(anIntArray1149[anInt1173], anIntArray1149[anInt1173 + 2], anIntArray1149[anInt1173 + 1], (byte) -98);
                    return;
                }
                if (i == 3206) {
                    anInt1173 -= 4;
                    Class279.method2090(anIntArray1149[anInt1173 + 1], 256, false, (byte) -35, anIntArray1149[anInt1173 + 3], anIntArray1149[anInt1173 + 2], anIntArray1149[anInt1173]);
                    return;
                }
                if (i == 3207) {
                    anInt1173 -= 4;
                    Class279.method2090(anIntArray1149[anInt1173 + 1], 256, true, (byte) -35, anIntArray1149[anInt1173 + 3], anIntArray1149[anInt1173 + 2], anIntArray1149[anInt1173]);
                    return;
                }
                if (i == 3208) {
                    anInt1173 -= 5;
                    Class348_Sub20.method2947(true, anIntArray1149[anInt1173 + 3], anIntArray1149[anInt1173], anIntArray1149[anInt1173 + 1], anIntArray1149[anInt1173 + 2], anIntArray1149[anInt1173 + 4]);
                    return;
                }
                if (i == 3209) {
                    anInt1173 -= 5;
                    Class279.method2090(anIntArray1149[anInt1173 + 1], anIntArray1149[anInt1173 + 4], false, (byte) -35, anIntArray1149[anInt1173 + 3], anIntArray1149[anInt1173 + 2], anIntArray1149[anInt1173]);
                    return;
                }
            } else if (i < 3400) {
                if (i == 3300) {
                    anIntArray1149[anInt1173++] = Class367_Sub11.anInt7396;
                    return;
                }
                if (i == 3301) {
                    anInt1173 -= 2;
                    int i_317_ = anIntArray1149[anInt1173];
                    int i_318_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = Class322.method2552(false, i_317_, i_318_, -24667);
                    return;
                }
                if (i == 3302) {
                    anInt1173 -= 2;
                    int i_319_ = anIntArray1149[anInt1173];
                    int i_320_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = Class240.method1854(71, i_319_, false, i_320_);
                    return;
                }
                if (i == 3303) {
                    anInt1173 -= 2;
                    int i_321_ = anIntArray1149[anInt1173];
                    int i_322_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = Class58.method532(i_322_, i_321_, false, -126);
                    return;
                }
                if (i == 3304) {
                    int i_323_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = (Class127_Sub1.aClass271_8378.method2044(106, i_323_).anInt9542);
                    return;
                }
                if (i == 3305) {
                    int i_324_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class161.anIntArray2145[i_324_];
                    return;
                }
                if (i == 3306) {
                    int i_325_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class256.anIntArray3295[i_325_];
                    return;
                }
                if (i == 3307) {
                    int i_326_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class186.anIntArray2497[i_326_];
                    return;
                }
                if (i == 3308) {
                    int i_327_ = (Class132.aPlayer_1907.plane);
                    int i_328_ = (((Class132.aPlayer_1907.x) >> 9) + za_Sub2.regionTileX);
                    int i_329_ = (((Class132.aPlayer_1907.y) >> 9) + Class90.regionTileY);
                    anIntArray1149[anInt1173++] = (i_327_ << 28) + (i_328_ << 14) + i_329_;
                    return;
                }
                if (i == 3309) {
                    int i_330_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = i_330_ >> 14 & 0x3fff;
                    return;
                }
                if (i == 3310) {
                    int i_331_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = i_331_ >> 28;
                    return;
                }
                if (i == 3311) {
                    int i_332_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = i_332_ & 0x3fff;
                    return;
                }
                if (i == 3312) {
                    anIntArray1149[anInt1173++] = Class130.aBoolean1900 ? 1 : 0;
                    return;
                }
                if (i == 3313) {
                    anInt1173 -= 2;
                    int i_333_ = anIntArray1149[anInt1173];
                    int i_334_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = Class322.method2552(true, i_333_, i_334_, -24667);
                    return;
                }
                if (i == 3314) {
                    anInt1173 -= 2;
                    int i_335_ = anIntArray1149[anInt1173];
                    int i_336_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = Class240.method1854(103, i_335_, true, i_336_);
                    return;
                }
                if (i == 3315) {
                    anInt1173 -= 2;
                    int i_337_ = anIntArray1149[anInt1173];
                    int i_338_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = Class58.method532(i_338_, i_337_, true, 126);
                    return;
                }
                if (i == 3316) {
                    if (Class192.anInt2581 >= 2) anIntArray1149[anInt1173++] = Class192.anInt2581;
                    else {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3317) {
                    anIntArray1149[anInt1173++] = Class289.anInt3699;
                    return;
                }
                if (i == 3318) {
                    anIntArray1149[anInt1173++] = Class3.aClass161_125.anInt2143;
                    return;
                }
                if (i == 3321) {
                    anIntArray1149[anInt1173++] = Class309.anInt4816;
                    return;
                }
                if (i == 3322) {
                    anIntArray1149[anInt1173++] = Class128.anInt1872;
                    return;
                }
                if (i == 3323) {
                    if (Class125.anInt4919 >= 5 && Class125.anInt4919 <= 9) anIntArray1149[anInt1173++] = 1;
                    else {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3324) {
                    if (Class125.anInt4919 >= 5 && Class125.anInt4919 <= 9) anIntArray1149[anInt1173++] = Class125.anInt4919;
                    else {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3325) {
                    anIntArray1149[anInt1173++] = Class206.aBoolean4888 ? 1 : 0;
                    return;
                }
                if (i == 3326) {
                    anIntArray1149[anInt1173++] = (Class132.aPlayer_1907.anInt10516);
                    return;
                }
                if (i == 3327) {
                    anIntArray1149[anInt1173++] = ((Class132.aPlayer_1907.aClass154_10536) != null && Class132.aPlayer_1907.aClass154_10536.aBoolean2100) ? 1 : 0;
                    return;
                }
                if (i == 3329) {
                    anIntArray1149[anInt1173++] = Class50_Sub2.aBoolean5233 ? 1 : 0;
                    return;
                }
                if (i == 3330) {
                    int i_339_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class307.method2301((byte) 35, i_339_, false);
                    return;
                }
                if (i == 3331) {
                    anInt1173 -= 2;
                    int i_340_ = anIntArray1149[anInt1173];
                    int i_341_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = Class61.method592(false, (byte) -128, false, i_340_, i_341_);
                    return;
                }
                if (i == 3332) {
                    anInt1173 -= 2;
                    int i_342_ = anIntArray1149[anInt1173];
                    int i_343_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = Class61.method592(true, (byte) -128, false, i_342_, i_343_);
                    return;
                }
                if (i == 3333) {
                    anIntArray1149[anInt1173++] = RuntimeException_Sub1.anInt4596;
                    return;
                }
                if (i == 3335) {
                    anIntArray1149[anInt1173++] = Class348_Sub33.anInt6967;
                    return;
                }
                if (i == 3336) {
                    anInt1173 -= 4;
                    int i_344_ = anIntArray1149[anInt1173];
                    int i_345_ = anIntArray1149[anInt1173 + 1];
                    int i_346_ = anIntArray1149[anInt1173 + 2];
                    int i_347_ = anIntArray1149[anInt1173 + 3];
                    i_344_ += i_345_ << 14;
                    i_344_ += i_346_ << 28;
                    i_344_ += i_347_;
                    anIntArray1149[anInt1173++] = i_344_;
                    return;
                }
                if (i == 3337) {
                    anIntArray1149[anInt1173++] = Class202.anInt2670;
                    return;
                }
                if (i == 3338) {
                    anIntArray1149[anInt1173++] = Class284.method2116(-26584);
                    return;
                }
                if (i == 3339) {
                    anIntArray1149[anInt1173++] = 0;
                    return;
                }
                if (i == 3340) {
                    anIntArray1149[anInt1173++] = Class175.aBoolean2329 ? 1 : 0;
                    return;
                }
                if (i == 3341) {
                    anIntArray1149[anInt1173++] = Class375.aBoolean4540 ? 1 : 0;
                    return;
                }
                if (i == 3342) {
                    anIntArray1149[anInt1173++] = Class258_Sub4.aClass373_8552.method3597(true);
                    return;
                }
                if (i == 3343) {
                    anIntArray1149[anInt1173++] = Class258_Sub4.aClass373_8552.method3594((byte) 127);
                    return;
                }
                if (i == 3344) {
                    aStringArray1152[anInt1170++] = Class314_Sub1.method2347((byte) -119);
                    return;
                }
                if (i == 3345) {
                    aStringArray1152[anInt1170++] = Class10.method217((byte) 112);
                    return;
                }
                if (i == 3346) {
                    anIntArray1149[anInt1173++] = Class318_Sub1_Sub5_Sub1.method2489((byte) -106);
                    return;
                }
                if (i == 3347) {
                    anIntArray1149[anInt1173++] = Class337.anInt4179;
                    return;
                }
                if (i == 3349) {
                    anIntArray1149[anInt1173++] = Class132.aPlayer_1907.aClass264_10217.method2019((byte) -31) >> 3;
                    return;
                }
                if (i == 3351) {
                    anIntArray1149[anInt1173++] = Class258_Sub4.aClass373_8552.method3595(-83) ? 1 : 0;
                    anIntArray1149[anInt1173++] = Class258_Sub4.aClass373_8552.method3588(-121) ? 1 : 0;
                    anIntArray1149[anInt1173++] = Class258_Sub4.aClass373_8552.method3590((byte) 125) ? 1 : 0;
                    return;
                }
            } else if (i < 3500) {
                if (i == 3400) {
                    anInt1173 -= 2;
                    int i_348_ = anIntArray1149[anInt1173];
                    int i_349_ = anIntArray1149[anInt1173 + 1];
                    Class117 class117 = Class348_Sub7.aClass33_6653.method337(true, i_348_);
                    aStringArray1152[anInt1170++] = class117.method1074(i_349_, 124);
                    return;
                }
                if (i == 3408) {
                    anInt1173 -= 4;
                    int i_350_ = anIntArray1149[anInt1173];
                    int i_351_ = anIntArray1149[anInt1173 + 1];
                    int i_352_ = anIntArray1149[anInt1173 + 2];
                    int i_353_ = anIntArray1149[anInt1173 + 3];
                    Class117 class117 = Class348_Sub7.aClass33_6653.method337(true, i_352_);
                    if (class117.aChar1778 != i_350_ || class117.aChar1779 != i_351_) throw new RuntimeException("C3408-1 " + i_352_ + "-" + i_353_);
                    if (i_351_ == 115) aStringArray1152[anInt1170++] = class117.method1074(i_353_, 119);
                    else {
                        anIntArray1149[anInt1173++] = class117.method1073(false, i_353_);
                        return;
                    }
                    return;
                }
                if (i == 3409) {
                    anInt1173 -= 3;
                    int i_354_ = anIntArray1149[anInt1173];
                    int i_355_ = anIntArray1149[anInt1173 + 1];
                    int i_356_ = anIntArray1149[anInt1173 + 2];
                    if (i_355_ == -1) throw new RuntimeException("C3409-2");
                    Class117 class117 = Class348_Sub7.aClass33_6653.method337(true, i_355_);
                    if (class117.aChar1779 != i_354_) throw new RuntimeException("C3409-1");
                    anIntArray1149[anInt1173++] = class117.method1067(true, i_356_) ? 1 : 0;
                    return;
                }
                if (i == 3410) {
                    int i_357_ = anIntArray1149[--anInt1173];
                    String string = aStringArray1152[--anInt1170];
                    if (i_357_ == -1) throw new RuntimeException("C3410-2");
                    Class117 class117 = Class348_Sub7.aClass33_6653.method337(true, i_357_);
                    if (class117.aChar1779 != 's') throw new RuntimeException("C3410-1");
                    anIntArray1149[anInt1173++] = class117.method1066(false, string) ? 1 : 0;
                    return;
                }
                if (i == 3411) {
                    int i_358_ = anIntArray1149[--anInt1173];
                    Class117 class117 = Class348_Sub7.aClass33_6653.method337(true, i_358_);
                    anIntArray1149[anInt1173++] = class117.aClass356_1767.method3474(1);
                    return;
                }
            } else if (i < 3700) {
                if (i == 3600) {
                    if (Class125.anInt4930 == 0) anIntArray1149[anInt1173++] = -2;
                    else {
                        if (Class125.anInt4930 == 1) anIntArray1149[anInt1173++] = -1;
                        else {
                            anIntArray1149[anInt1173++] = Class348_Sub40_Sub30.anInt9383;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 3601) {
                    int i_359_ = anIntArray1149[--anInt1173];
                    if (Class125.anInt4930 == 2 && i_359_ < Class348_Sub40_Sub30.anInt9383) {
                        aStringArray1152[anInt1170++] = Class83.aStringArray1441[i_359_];
                        if (Class286_Sub2.aStringArray6205[i_359_] != null) aStringArray1152[anInt1170++] = Class286_Sub2.aStringArray6205[i_359_];
                        else aStringArray1152[anInt1170++] = "";
                    } else {
                        aStringArray1152[anInt1170++] = "";
                        aStringArray1152[anInt1170++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3602) {
                    int i_360_ = anIntArray1149[--anInt1173];
                    if (Class125.anInt4930 == 2 && i_360_ < Class348_Sub40_Sub30.anInt9383) anIntArray1149[anInt1173++] = ha.anIntArray4578[i_360_];
                    else {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3603) {
                    int i_361_ = anIntArray1149[--anInt1173];
                    if (Class125.anInt4930 == 2 && i_361_ < Class348_Sub40_Sub30.anInt9383) anIntArray1149[anInt1173++] = Class172.anIntArray2280[i_361_];
                    else {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3604) {
                    String string = aStringArray1152[--anInt1170];
                    int i_362_ = anIntArray1149[--anInt1173];
                    Class261.method1982(16, i_362_, string);
                    return;
                }
                if (i == 3605) {
                    String string = aStringArray1152[--anInt1170];
                    Class348_Sub40_Sub30.method3128(-81, string);
                    return;
                }
                if (i == 3606) {
                    String string = aStringArray1152[--anInt1170];
                    Class286_Sub7.method2165(true, string);
                    return;
                }
                if (i == 3607) {
                    String string = aStringArray1152[--anInt1170];
                    Class27.method317(string, 117, false);
                    return;
                }
                if (i == 3608) {
                    String string = aStringArray1152[--anInt1170];
                    Class367_Sub2.method3538(true, string);
                    return;
                }
                if (i == 3609) {
                    String string = aStringArray1152[--anInt1170];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7);
                    anIntArray1149[anInt1173++] = (Class348_Sub11.method2797(string, (byte) -63) ? 1 : 0);
                    return;
                }
                if (i == 3610) {
                    int i_363_ = anIntArray1149[--anInt1173];
                    if (Class125.anInt4930 == 2 && i_363_ < Class348_Sub40_Sub30.anInt9383) aStringArray1152[anInt1170++] = Class285.aStringArray4744[i_363_];
                    else {
                        aStringArray1152[anInt1170++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3611) {
                    if (Class50.aString863 == null) {
                        aStringArray1152[anInt1170++] = "";
                        return;
                    } else aStringArray1152[anInt1170++] = Class157.method1245(Class50.aString863, false);
                    return;
                }
                if (i == 3612) {
                    if (Class50.aString863 == null) {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    } else anIntArray1149[anInt1173++] = Class37.anInt496;
                    return;
                }
                if (i == 3613) {
                    int i_364_ = anIntArray1149[--anInt1173];
                    if (Class50.aString863 != null && i_364_ < Class37.anInt496) aStringArray1152[anInt1170++] = (Class169.aClass19Array2261[i_364_].aString314);
                    else {
                        aStringArray1152[anInt1170++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3614) {
                    int i_365_ = anIntArray1149[--anInt1173];
                    if (Class50.aString863 != null && i_365_ < Class37.anInt496) anIntArray1149[anInt1173++] = (Class169.aClass19Array2261[i_365_].anInt308);
                    else {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3615) {
                    int i_366_ = anIntArray1149[--anInt1173];
                    if (Class50.aString863 != null && i_366_ < Class37.anInt496) anIntArray1149[anInt1173++] = (Class169.aClass19Array2261[i_366_].aByte310);
                    else {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3616) {
                    anIntArray1149[anInt1173++] = Class219.aByte2871;
                    return;
                }
                if (i == 3617) {
                    String string = aStringArray1152[--anInt1170];
                    Class306.method2298((byte) -117, string);
                    return;
                }
                if (i == 3618) {
                    anIntArray1149[anInt1173++] = Class119_Sub1.aByte4702;
                    return;
                }
                if (i == 3619) {
                    String string = aStringArray1152[--anInt1170];
                    Class318_Sub1_Sub1_Sub1.method2399(string, -117);
                    return;
                }
                if (i == 3620) {
                    Class242.method1867(77);
                    return;
                }
                if (i == 3621) {
                    if (Class125.anInt4930 == 0) anIntArray1149[anInt1173++] = -1;
                    else {
                        anIntArray1149[anInt1173++] = Class348_Sub42_Sub12.anInt9604;
                        return;
                    }
                    return;
                }
                if (i == 3622) {
                    int i_367_ = anIntArray1149[--anInt1173];
                    if (Class125.anInt4930 != 0 && i_367_ < Class348_Sub42_Sub12.anInt9604) {
                        aStringArray1152[anInt1170++] = Class51.aStringArray932[i_367_];
                        if (Class348_Sub40_Sub21.aStringArray9275[i_367_] != null) aStringArray1152[anInt1170++] = (Class348_Sub40_Sub21.aStringArray9275[i_367_]);
                        else aStringArray1152[anInt1170++] = "";
                    } else {
                        aStringArray1152[anInt1170++] = "";
                        aStringArray1152[anInt1170++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3623) {
                    String string = aStringArray1152[--anInt1170];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7);
                    anIntArray1149[anInt1173++] = Class351.method3455(string, 28280) ? 1 : 0;
                    return;
                }
                if (i == 3624) {
                    int i_368_ = anIntArray1149[--anInt1173];
                    if (Class169.aClass19Array2261 != null && i_368_ < Class37.anInt496 && (Class169.aClass19Array2261[i_368_].aString306.equalsIgnoreCase(Class132.aPlayer_1907.aString10544))) anIntArray1149[anInt1173++] = 1;
                    else {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3625) {
                    if (Class348_Sub21.aString6854 == null) {
                        aStringArray1152[anInt1170++] = "";
                        return;
                    } else aStringArray1152[anInt1170++] = Class348_Sub21.aString6854;
                    return;
                }
                if (i == 3626) {
                    int i_369_ = anIntArray1149[--anInt1173];
                    if (Class50.aString863 != null && i_369_ < Class37.anInt496) aStringArray1152[anInt1170++] = (Class169.aClass19Array2261[i_369_].aString313);
                    else {
                        aStringArray1152[anInt1170++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3627) {
                    int i_370_ = anIntArray1149[--anInt1173];
                    if (Class125.anInt4930 == 2 && i_370_ >= 0 && i_370_ < Class348_Sub40_Sub30.anInt9383) anIntArray1149[anInt1173++] = Class122.aBooleanArray1806[i_370_] ? 1 : 0;
                    else {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    }
                    return;
                }
                if (i == 3628) {
                    String string = aStringArray1152[--anInt1170];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7);
                    anIntArray1149[anInt1173++] = Class300.method2274(string, -91);
                    return;
                }
                if (i == 3629) {
                    anIntArray1149[anInt1173++] = ha.anInt4583;
                    return;
                }
                if (i == 3630) {
                    String string = aStringArray1152[--anInt1170];
                    Class27.method317(string, 119, true);
                    return;
                }
                if (i == 3631) {
                    int i_371_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class367_Sub3.aBooleanArray7304[i_371_] ? 1 : 0;
                    return;
                }
                if (i == 3632) {
                    int i_372_ = anIntArray1149[--anInt1173];
                    if (Class50.aString863 != null && i_372_ < Class37.anInt496) aStringArray1152[anInt1170++] = (Class169.aClass19Array2261[i_372_].aString306);
                    else {
                        aStringArray1152[anInt1170++] = "";
                        return;
                    }
                    return;
                }
                if (i == 3633) {
                    int i_373_ = anIntArray1149[--anInt1173];
                    if (Class125.anInt4930 != 0 && i_373_ < Class348_Sub42_Sub12.anInt9604) aStringArray1152[anInt1170++] = Class122.aStringArray1808[i_373_];
                    else {
                        aStringArray1152[anInt1170++] = "";
                        return;
                    }
                    return;
                }
            } else if (i < 4000) {
                if (i == 3903) {
                    int i_374_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class239_Sub26.aClass54Array6114[i_374_].method499(21110);
                    return;
                }
                if (i == 3904) {
                    int i_375_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = (Class239_Sub26.aClass54Array6114[i_375_].anInt969);
                    return;
                }
                if (i == 3905) {
                    int i_376_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = (Class239_Sub26.aClass54Array6114[i_376_].anInt976);
                    return;
                }
                if (i == 3906) {
                    int i_377_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = (Class239_Sub26.aClass54Array6114[i_377_].anInt967);
                    return;
                }
                if (i == 3907) {
                    int i_378_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = (Class239_Sub26.aClass54Array6114[i_378_].anInt977);
                    return;
                }
                if (i == 3908) {
                    int i_379_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = (Class239_Sub26.aClass54Array6114[i_379_].anInt973);
                    return;
                }
                if (i == 3910) {
                    int i_380_ = anIntArray1149[--anInt1173];
                    int i_381_ = Class239_Sub26.aClass54Array6114[i_380_].method502((byte) 100);
                    anIntArray1149[anInt1173++] = i_381_ == 0 ? 1 : 0;
                    return;
                }
                if (i == 3911) {
                    int i_382_ = anIntArray1149[--anInt1173];
                    int i_383_ = Class239_Sub26.aClass54Array6114[i_382_].method502((byte) 118);
                    anIntArray1149[anInt1173++] = i_383_ == 2 ? 1 : 0;
                    return;
                }
                if (i == 3912) {
                    int i_384_ = anIntArray1149[--anInt1173];
                    int i_385_ = Class239_Sub26.aClass54Array6114[i_384_].method502((byte) -100);
                    anIntArray1149[anInt1173++] = i_385_ == 5 ? 1 : 0;
                    return;
                }
                if (i == 3913) {
                    int i_386_ = anIntArray1149[--anInt1173];
                    int i_387_ = Class239_Sub26.aClass54Array6114[i_386_].method502((byte) 55);
                    anIntArray1149[anInt1173++] = i_387_ == 1 ? 1 : 0;
                    return;
                }
            } else if (i < 4100) {
                if (i == 4000) {
                    anInt1173 -= 2;
                    int i_388_ = anIntArray1149[anInt1173];
                    int i_389_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = i_388_ + i_389_;
                    return;
                }
                if (i == 4001) {
                    anInt1173 -= 2;
                    int i_390_ = anIntArray1149[anInt1173];
                    int i_391_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = i_390_ - i_391_;
                    return;
                }
                if (i == 4002) {
                    anInt1173 -= 2;
                    int i_392_ = anIntArray1149[anInt1173];
                    int i_393_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = i_392_ * i_393_;
                    return;
                }
                if (i == 4003) {
                    anInt1173 -= 2;
                    int i_394_ = anIntArray1149[anInt1173];
                    int i_395_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = i_394_ / i_395_;
                    return;
                }
                if (i == 4004) {
                    int i_396_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = (int) (Math.random() * (double) i_396_);
                    return;
                }
                if (i == 4005) {
                    int i_397_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = (int) (Math.random() * (double) (i_397_ + 1));
                    return;
                }
                if (i == 4006) {
                    anInt1173 -= 5;
                    int i_398_ = anIntArray1149[anInt1173];
                    int i_399_ = anIntArray1149[anInt1173 + 1];
                    int i_400_ = anIntArray1149[anInt1173 + 2];
                    int i_401_ = anIntArray1149[anInt1173 + 3];
                    int i_402_ = anIntArray1149[anInt1173 + 4];
                    anIntArray1149[anInt1173++] = i_398_ + ((i_399_ - i_398_) * (i_402_ - i_400_) / (i_401_ - i_400_));
                    return;
                }
                if (i == 4007) {
                    anInt1173 -= 2;
                    long l = anIntArray1149[anInt1173];
                    long l_403_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = (int) (l + l * l_403_ / 100L);
                    return;
                }
                if (i == 4008) {
                    anInt1173 -= 2;
                    int i_404_ = anIntArray1149[anInt1173];
                    int i_405_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = i_404_ | 1 << i_405_;
                    return;
                }
                if (i == 4009) {
                    anInt1173 -= 2;
                    int i_406_ = anIntArray1149[anInt1173];
                    int i_407_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = i_406_ & -1 - (1 << i_407_);
                    return;
                }
                if (i == 4010) {
                    anInt1173 -= 2;
                    int i_408_ = anIntArray1149[anInt1173];
                    int i_409_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = (i_408_ & 1 << i_409_) != 0 ? 1 : 0;
                    return;
                }
                if (i == 4011) {
                    anInt1173 -= 2;
                    int i_410_ = anIntArray1149[anInt1173];
                    int i_411_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = i_410_ % i_411_;
                    return;
                }
                if (i == 4012) {
                    anInt1173 -= 2;
                    int i_412_ = anIntArray1149[anInt1173];
                    int i_413_ = anIntArray1149[anInt1173 + 1];
                    if (i_412_ == 0) anIntArray1149[anInt1173++] = 0;
                    else {
                        anIntArray1149[anInt1173++] = (int) Math.pow(i_412_, i_413_);
                        return;
                    }
                    return;
                }
                if (i == 4013) {
                    anInt1173 -= 2;
                    int i_414_ = anIntArray1149[anInt1173];
                    int i_415_ = anIntArray1149[anInt1173 + 1];
                    if (i_414_ == 0) anIntArray1149[anInt1173++] = 0;
                    else {
                        if (i_415_ == 0) anIntArray1149[anInt1173++] = 2147483647;
                        else {
                            anIntArray1149[anInt1173++] = (int) Math.pow(i_414_, 1.0 / (double) i_415_);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 4014) {
                    anInt1173 -= 2;
                    int i_416_ = anIntArray1149[anInt1173];
                    int i_417_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = i_416_ & i_417_;
                    return;
                }
                if (i == 4015) {
                    anInt1173 -= 2;
                    int i_418_ = anIntArray1149[anInt1173];
                    int i_419_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = i_418_ | i_419_;
                    return;
                }
                if (i == 4016) {
                    anInt1173 -= 2;
                    int i_420_ = anIntArray1149[anInt1173];
                    int i_421_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = Math.min(i_420_, i_421_);
                    return;
                }
                if (i == 4017) {
                    anInt1173 -= 2;
                    int i_422_ = anIntArray1149[anInt1173];
                    int i_423_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = Math.max(i_422_, i_423_);
                    return;
                }
                if (i == 4018) {
                    anInt1173 -= 3;
                    long l = anIntArray1149[anInt1173];
                    long l_424_ = anIntArray1149[anInt1173 + 1];
                    long l_425_ = anIntArray1149[anInt1173 + 2];
                    anIntArray1149[anInt1173++] = (int) (l * l_425_ / l_424_);
                    return;
                }
                if (i == 4019) {
                    anInt1173 -= 2;
                    int i_426_ = anIntArray1149[anInt1173];
                    int i_427_ = anIntArray1149[anInt1173 + 1];
                    if (i_426_ > 700 || i_427_ > 700) anIntArray1149[anInt1173++] = 256;
                    double d = ((Math.random() * (double) (i_427_ + i_426_) - (double) i_426_ + 800.0) / 100.0);
                    anIntArray1149[anInt1173++] = (int) (Math.pow(2.0, d) + 0.5);
                    return;
                }
            } else if (i < 4200) {
                if (i == 4100) {
                    String string = aStringArray1152[--anInt1170];
                    int i_428_ = anIntArray1149[--anInt1173];
                    aStringArray1152[anInt1170++] = string + i_428_;
                    return;
                }
                if (i == 4101) {
                    anInt1170 -= 2;
                    String string = aStringArray1152[anInt1170];
                    String string_429_ = aStringArray1152[anInt1170 + 1];
                    aStringArray1152[anInt1170++] = string + string_429_;
                    return;
                }
                if (i == 4102) {
                    String string = aStringArray1152[--anInt1170];
                    int i_430_ = anIntArray1149[--anInt1173];
                    aStringArray1152[anInt1170++] = string + Class140.method1171(i_430_, 76, true);
                    return;
                }
                if (i == 4103) {
                    String string = aStringArray1152[--anInt1170];
                    aStringArray1152[anInt1170++] = string.toLowerCase();
                    return;
                }
                if (i == 4104) {
                    aStringArray1152[anInt1170++] = method709(anIntArray1149[--anInt1173]);
                    return;
                }
                if (i == 4105) {
                    anInt1170 -= 2;
                    String string = aStringArray1152[anInt1170];
                    String string_431_ = aStringArray1152[anInt1170 + 1];
                    if ((Class132.aPlayer_1907.aClass154_10536) != null && Class132.aPlayer_1907.aClass154_10536.aBoolean2100) aStringArray1152[anInt1170++] = string_431_;
                    else {
                        aStringArray1152[anInt1170++] = string;
                        return;
                    }
                    return;
                }
                if (i == 4106) {
                    int i_432_ = anIntArray1149[--anInt1173];
                    aStringArray1152[anInt1170++] = Integer.toString(i_432_);
                    return;
                }
                if (i == 4107) {
                    anInt1170 -= 2;
                    anIntArray1149[anInt1173++] = Class239_Sub21.method1811(9152, (aStringArray1152[anInt1170 + 1]), Class348_Sub33.anInt6967, (aStringArray1152[anInt1170]));
                    return;
                }
                if (i == 4108) {
                    String string = aStringArray1152[--anInt1170];
                    anInt1173 -= 2;
                    int i_433_ = anIntArray1149[anInt1173];
                    int i_434_ = anIntArray1149[anInt1173 + 1];
                    FontMetrics fontMetrics = Class239_Sub23.getFontMetrics(i_434_, 0, -123, Class104.FONT_INDEX);
                    anIntArray1149[anInt1173++] = fontMetrics.splitLines(Class113.aSpriteArray1744, 1, string, i_433_);
                    return;
                }
                if (i == 4109) {
                    String string = aStringArray1152[--anInt1170];
                    anInt1173 -= 2;
                    int i_435_ = anIntArray1149[anInt1173];
                    int i_436_ = anIntArray1149[anInt1173 + 1];
                    FontMetrics fontMetrics = Class239_Sub23.getFontMetrics(i_436_, 0, -79, Class104.FONT_INDEX);
                    anIntArray1149[anInt1173++] = fontMetrics.lineWidth(string, false, i_435_, Class113.aSpriteArray1744);
                    return;
                }
                if (i == 4110) {
                    anInt1170 -= 2;
                    String string = aStringArray1152[anInt1170];
                    String string_437_ = aStringArray1152[anInt1170 + 1];
                    if (anIntArray1149[--anInt1173] == 1) aStringArray1152[anInt1170++] = string;
                    else {
                        aStringArray1152[anInt1170++] = string_437_;
                        return;
                    }
                    return;
                }
                if (i == 4111) {
                    String string = aStringArray1152[--anInt1170];
                    aStringArray1152[anInt1170++] = Class59_Sub2_Sub2.method572(string, 23034);
                    return;
                }
                if (i == 4112) {
                    String string = aStringArray1152[--anInt1170];
                    int i_438_ = anIntArray1149[--anInt1173];
                    if (i_438_ == -1) throw new RuntimeException("null char");
                    aStringArray1152[anInt1170++] = string + (char) i_438_;
                    return;
                }
                if (i == 4113) {
                    int i_439_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = method708((char) i_439_);
                    return;
                }
                if (i == 4114) {
                    int i_440_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Npc.method2446((char) i_440_, (byte) 105) ? 1 : 0;
                    return;
                }
                if (i == 4115) {
                    int i_441_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class215.method1581(-93, (char) i_441_) ? 1 : 0;
                    return;
                }
                if (i == 4116) {
                    int i_442_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Class334.method2647(true, (char) i_442_) ? 1 : 0;
                    return;
                }
                if (i == 4117) {
                    String string = aStringArray1152[--anInt1170];
                    if (string == null) {
                        anIntArray1149[anInt1173++] = 0;
                        return;
                    } else anIntArray1149[anInt1173++] = string.length();
                    return;
                }
                if (i == 4118) {
                    String string = aStringArray1152[--anInt1170];
                    anInt1173 -= 2;
                    int i_443_ = anIntArray1149[anInt1173];
                    int i_444_ = anIntArray1149[anInt1173 + 1];
                    aStringArray1152[anInt1170++] = string.substring(i_443_, i_444_);
                    return;
                }
                if (i == 4119) {
                    String string = aStringArray1152[--anInt1170];
                    StringBuffer stringbuffer = new StringBuffer(string.length());
                    boolean bool_445_ = false;
                    for (int i_446_ = 0; i_446_ < string.length(); i_446_++) {
                        char c = string.charAt(i_446_);
                        if (c == '<') bool_445_ = true;
                        else if (c == '>') bool_445_ = false;
                        else if (!bool_445_) stringbuffer.append(c);
                    }
                    aStringArray1152[anInt1170++] = stringbuffer.toString();
                    return;
                }
                if (i == 4120) {
                    String string = aStringArray1152[--anInt1170];
                    anInt1173 -= 2;
                    int i_447_ = anIntArray1149[anInt1173];
                    int i_448_ = anIntArray1149[anInt1173 + 1];
                    anIntArray1149[anInt1173++] = string.indexOf(i_447_, i_448_);
                    return;
                }
                if (i == 4121) {
                    anInt1170 -= 2;
                    String string = aStringArray1152[anInt1170];
                    String string_449_ = aStringArray1152[anInt1170 + 1];
                    int i_450_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = string.indexOf(string_449_, i_450_);
                    return;
                }
                if (i == 4122) {
                    int i_451_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Character.toLowerCase((char) i_451_);
                    return;
                }
                if (i == 4123) {
                    int i_452_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Character.toUpperCase((char) i_452_);
                    return;
                }
                if (i == 4124) {
                    boolean bool_453_ = anIntArray1149[--anInt1173] != 0;
                    int i_454_ = anIntArray1149[--anInt1173];
                    aStringArray1152[anInt1170++] = Class357.method3486(0, bool_453_, Class348_Sub33.anInt6967, i_454_, 16980);
                    return;
                }
                if (i == 4125) {
                    String string = aStringArray1152[--anInt1170];
                    int i_455_ = anIntArray1149[--anInt1173];
                    FontMetrics fontMetrics = Class239_Sub23.getFontMetrics(i_455_, 0, -114, Class104.FONT_INDEX);
                    anIntArray1149[anInt1173++] = fontMetrics.textWidth(string, Class113.aSpriteArray1744, false);
                    return;
                }
            } else if (i < 4300) {
                if (i == 4200) {
                    int i_456_ = anIntArray1149[--anInt1173];
                    aStringArray1152[anInt1170++] = (Exception_Sub1.aClass255_112.method1940(-52, i_456_).aString2795) + Loader.getDebug(i_456_);
                    return;
                }
                if (i == 4201) {
                    anInt1173 -= 2;
                    int i_457_ = anIntArray1149[anInt1173];
                    int i_458_ = anIntArray1149[anInt1173 + 1];
                    Class213 class213 = Exception_Sub1.aClass255_112.method1940(-79, i_457_);
                    if (i_458_ >= 1 && i_458_ <= 5 && (class213.aStringArray2811[i_458_ - 1] != null)) aStringArray1152[anInt1170++] = (class213.aStringArray2811[i_458_ - 1]);
                    else {
                        aStringArray1152[anInt1170++] = "";
                        return;
                    }
                    return;
                }
                if (i == 4202) {
                    anInt1173 -= 2;
                    int i_459_ = anIntArray1149[anInt1173];
                    int i_460_ = anIntArray1149[anInt1173 + 1];
                    Class213 class213 = Exception_Sub1.aClass255_112.method1940(112, i_459_);
                    if (i_460_ >= 1 && i_460_ <= 5 && (class213.aStringArray2763[i_460_ - 1] != null)) aStringArray1152[anInt1170++] = (class213.aStringArray2763[i_460_ - 1]);
                    else {
                        aStringArray1152[anInt1170++] = "";
                        return;
                    }
                    return;
                }
                if (i == 4203) {
                    int i_461_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Exception_Sub1.aClass255_112.method1940(-52, i_461_).anInt2819;
                    return;
                }
                if (i == 4204) {
                    int i_462_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = (Exception_Sub1.aClass255_112.method1940(82, i_462_).anInt2820 == 1) ? 1 : 0;
                    return;
                }
                if (i == 4205) {
                    int i_463_ = anIntArray1149[--anInt1173];
                    Class213 class213 = Exception_Sub1.aClass255_112.method1940(80, i_463_);
                    if (class213.anInt2833 == -1 && class213.anInt2758 >= 0) anIntArray1149[anInt1173++] = class213.anInt2758;
                    else {
                        anIntArray1149[anInt1173++] = i_463_;
                        return;
                    }
                    return;
                }
                if (i == 4206) {
                    int i_464_ = anIntArray1149[--anInt1173];
                    Class213 class213 = Exception_Sub1.aClass255_112.method1940(-56, i_464_);
                    if (class213.anInt2833 >= 0 && class213.anInt2758 >= 0) anIntArray1149[anInt1173++] = class213.anInt2758;
                    else {
                        anIntArray1149[anInt1173++] = i_464_;
                        return;
                    }
                    return;
                }
                if (i == 4207) {
                    int i_465_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = (Exception_Sub1.aClass255_112.method1940(87, i_465_).aBoolean2783) ? 1 : 0;
                    return;
                }
                if (i == 4208) {
                    anInt1173 -= 2;
                    int i_466_ = anIntArray1149[anInt1173];
                    int i_467_ = anIntArray1149[anInt1173 + 1];
                    Class254 class254 = Class101_Sub3.aClass326_5764.method2600(i_467_, 28364);
                    if (class254.method1925(false)) aStringArray1152[anInt1170++] = (Exception_Sub1.aClass255_112.method1940(-96, i_466_).method1561(class254.aString3258, i_467_, -1511086397));
                    else {
                        anIntArray1149[anInt1173++] = (Exception_Sub1.aClass255_112.method1940(-82, i_466_).method1567(class254.anInt3256, -106, i_467_));
                        return;
                    }
                    return;
                }
                if (i == 4209) {
                    anInt1173 -= 2;
                    int i_468_ = anIntArray1149[anInt1173];
                    int i_469_ = anIntArray1149[anInt1173 + 1] - 1;
                    Class213 class213 = Exception_Sub1.aClass255_112.method1940(108, i_468_);
                    if (class213.anInt2766 == i_469_) anIntArray1149[anInt1173++] = class213.anInt2818;
                    else {
                        if (class213.anInt2774 == i_469_) anIntArray1149[anInt1173++] = class213.anInt2817;
                        else {
                            anIntArray1149[anInt1173++] = -1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i == 4210) {
                    String string = aStringArray1152[--anInt1170];
                    int i_470_ = anIntArray1149[--anInt1173];
                    Class217.method1586(i_470_ == 1, (byte) -108, string);
                    anIntArray1149[anInt1173++] = Class76.anInt1285;
                    return;
                }
                if (i == 4211) {
                    if (Class192.aShortArray2579 == null || Class148.anInt2037 >= Class76.anInt1285) anIntArray1149[anInt1173++] = -1;
                    else {
                        anIntArray1149[anInt1173++] = (Class192.aShortArray2579[Class148.anInt2037++] & 0xffff);
                        return;
                    }
                    return;
                }
                if (i == 4212) {
                    Class148.anInt2037 = 0;
                    return;
                }
                if (i == 4213) {
                    int i_471_ = anIntArray1149[--anInt1173];
                    anIntArray1149[anInt1173++] = Exception_Sub1.aClass255_112.method1940(-115, i_471_).anInt2802;
                    return;
                }
                if (i == 4214) {
                    String string = aStringArray1152[--anInt1170];
                    anInt1173 -= 3;
                    int i_472_ = anIntArray1149[anInt1173];
                    int i_473_ = anIntArray1149[anInt1173 + 1];
                    int i_474_ = anIntArray1149[anInt1173 + 2];
                    Class16.method259(i_474_, -125, i_472_ == 1, string, i_473_);
                    anIntArray1149[anInt1173++] = Class76.anInt1285;
                    return;
                }
                if (i == 4215) {
                    anInt1170 -= 2;
                    anInt1173 -= 2;
                    String string = aStringArray1152[anInt1170];
                    int i_475_ = anIntArray1149[anInt1173];
                    int i_476_ = anIntArray1149[anInt1173 + 1];
                    String string_477_ = aStringArray1152[anInt1170 + 1];
                    Class239_Sub1.method1719(i_475_ == 1, string, string_477_, i_476_, -1);
                    anIntArray1149[anInt1173++] = Class76.anInt1285;
                    return;
                }
            } else if (i < 4400) {
                if (i == 4300) {
                    anInt1173 -= 2;
                    int i_478_ = anIntArray1149[anInt1173];
                    int i_479_ = anIntArray1149[anInt1173 + 1];
                    Class254 class254 = Class101_Sub3.aClass326_5764.method2600(i_479_, 28364);
                    if (class254.method1925(false)) aStringArray1152[anInt1170++] = (Class189.aClass278_2529.method2079(i_478_, -1).method801((byte) 17, i_479_, class254.aString3258));
                    else {
                        anIntArray1149[anInt1173++] = (Class189.aClass278_2529.method2079(i_478_, -1).method805(class254.anInt3256, i_479_, 48));
                        return;
                    }
                    return;
                }
            } else if (i < 4500) {
                if (i == 4400) {
                    anInt1173 -= 2;
                    int i_480_ = anIntArray1149[anInt1173];
                    int i_481_ = anIntArray1149[anInt1173 + 1];
                    Class254 class254 = Class101_Sub3.aClass326_5764.method2600(i_481_, 28364);
                    if (class254.method1925(false)) aStringArray1152[anInt1170++] = (Class348_Sub40_Sub12.aClass263_9195.method2005(0, i_480_).method475(class254.aString3258, i_481_, -16));
                    else {
                        anIntArray1149[anInt1173++] = (Class348_Sub40_Sub12.aClass263_9195.method2005(0, i_480_).method487(i_481_, class254.anInt3256, 81));
                        return;
                    }
                    return;
                }
            } else if (i < 4600) {
                if (i == 4500) {
                    anInt1173 -= 2;
                    int i_482_ = anIntArray1149[anInt1173];
                    int i_483_ = anIntArray1149[anInt1173 + 1];
                    Class254 class254 = Class101_Sub3.aClass326_5764.method2600(i_483_, 28364);
                    if (class254.method1925(false)) aStringArray1152[anInt1170++] = (Class136.aClass65_4787.method700(i_482_, -121).method3170(-250, class254.aString3258, i_483_));
                    else {
                        anIntArray1149[anInt1173++] = (Class136.aClass65_4787.method700(i_482_, 81).method3166(i_483_, class254.anInt3256, (byte) 124));
                        return;
                    }
                    return;
                }
            } else if (i < 4700 && i == 4600) {
                int i_484_ = anIntArray1149[--anInt1173];
                Class225 class225 = Class64_Sub3.aClass261_5558.method1983(i_484_, 32);
                if (class225.anIntArray2915 != null && class225.anIntArray2915.length > 0) {
                    int i_485_ = 0;
                    int i_486_ = class225.anIntArray2929[0];
                    for (int i_487_ = 1; i_487_ < class225.anIntArray2915.length; i_487_++) {
                        if (class225.anIntArray2929[i_487_] > i_486_) {
                            i_485_ = i_487_;
                            i_486_ = class225.anIntArray2929[i_487_];
                        }
                    }
                    anIntArray1149[anInt1173++] = class225.anIntArray2915[i_485_];
                } else {
                    anIntArray1149[anInt1173++] = class225.anInt2918;
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(i));
    }

    private static final void method711(Class348_Sub42_Sub19 class348_sub42_sub19, int i) {
        anInt1173 = 0;
        anInt1170 = 0;
        int i_488_ = -1;
        int[] is = class348_sub42_sub19.anIntArray9696;
        int[] is_489_ = class348_sub42_sub19.anIntArray9694;
        int i_490_ = -1;
        anInt1154 = 0;
        try {
            int i_491_ = 0;
            for (; ; ) {
                if (++i_491_ > i) throw new RuntimeException("slow");
                i_490_ = is[++i_488_];
                if (i_490_ < 100) {
                    if (i_490_ == 0) anIntArray1149[anInt1173++] = is_489_[i_488_];
                    else if (i_490_ == 1) {
                        int i_492_ = is_489_[i_488_];
                        anIntArray1149[anInt1173++] = (Class318_Sub1_Sub3_Sub3.aClass170_10209.anIntArray5063[i_492_]);
                    } else if (i_490_ == 2) {
                        int i_493_ = is_489_[i_488_];
                        Class318_Sub1_Sub3_Sub3.aClass170_10209.method1306((byte) -78, anIntArray1149[--anInt1173], i_493_);
                    } else if (i_490_ == 3) aStringArray1152[anInt1170++] = (class348_sub42_sub19.aStringArray9692[i_488_]);
                    else if (i_490_ == 6) i_488_ += is_489_[i_488_];
                    else if (i_490_ == 7) {
                        anInt1173 -= 2;
                        if (anIntArray1149[anInt1173] != anIntArray1149[anInt1173 + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 8) {
                        anInt1173 -= 2;
                        if (anIntArray1149[anInt1173] == anIntArray1149[anInt1173 + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 9) {
                        anInt1173 -= 2;
                        if (anIntArray1149[anInt1173] < anIntArray1149[anInt1173 + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 10) {
                        anInt1173 -= 2;
                        if (anIntArray1149[anInt1173] > anIntArray1149[anInt1173 + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 21) {
                        if (anInt1154 == 0) return;
                        Class184 class184 = aClass184Array1168[--anInt1154];
                        class348_sub42_sub19 = class184.aClass348_Sub42_Sub19_2474;
                        is = (class348_sub42_sub19.anIntArray9696);
                        is_489_ = (class348_sub42_sub19.anIntArray9694);
                        i_488_ = class184.anInt2477;
                        anIntArray1164 = class184.anIntArray2468;
                        aStringArray1155 = class184.aStringArray2473;
                    } else if (i_490_ == 25) {
                        int i_494_ = is_489_[i_488_];
                        anIntArray1149[anInt1173++] = Class318_Sub1_Sub3_Sub3.aClass170_10209.method62(i_494_, -65536);
                    } else if (i_490_ == 27) {
                        int i_495_ = is_489_[i_488_];
                        Class318_Sub1_Sub3_Sub3.aClass170_10209.method1307(i_495_, -1, anIntArray1149[--anInt1173]);
                    } else if (i_490_ == 31) {
                        anInt1173 -= 2;
                        if (anIntArray1149[anInt1173] <= anIntArray1149[anInt1173 + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 32) {
                        anInt1173 -= 2;
                        if (anIntArray1149[anInt1173] >= anIntArray1149[anInt1173 + 1]) i_488_ += is_489_[i_488_];
                    } else if (i_490_ == 33) anIntArray1149[anInt1173++] = anIntArray1164[is_489_[i_488_]];
                    else if (i_490_ == 34) anIntArray1164[is_489_[i_488_]] = anIntArray1149[--anInt1173];
                    else if (i_490_ == 35) aStringArray1152[anInt1170++] = aStringArray1155[is_489_[i_488_]];
                    else if (i_490_ == 36) aStringArray1155[is_489_[i_488_]] = aStringArray1152[--anInt1170];
                    else if (i_490_ == 37) {
                        int i_496_ = is_489_[i_488_];
                        anInt1170 -= i_496_;
                        String string = Class164.method1279(true, i_496_, aStringArray1152, anInt1170);
                        aStringArray1152[anInt1170++] = string;
                    } else if (i_490_ == 38) anInt1173--;
                    else if (i_490_ == 39) anInt1170--;
                    else if (i_490_ == 40) {
                        int i_497_ = is_489_[i_488_];
                        Class348_Sub42_Sub19 class348_sub42_sub19_498_ = Class328.method2609(-114, i_497_);
                        if (class348_sub42_sub19_498_ == null) throw new RuntimeException();
                        int[] is_499_ = new int[class348_sub42_sub19_498_.anInt9688];
                        String[] strings = (new String
                                [class348_sub42_sub19_498_.anInt9689]);
                        for (int i_500_ = 0; i_500_ < class348_sub42_sub19_498_.anInt9697; i_500_++)
                            is_499_[i_500_] = (anIntArray1149[anInt1173 - (class348_sub42_sub19_498_.anInt9697) + i_500_]);
                        for (int i_501_ = 0; i_501_ < class348_sub42_sub19_498_.anInt9695; i_501_++)
                            strings[i_501_] = (aStringArray1152[anInt1170 - (class348_sub42_sub19_498_.anInt9695) + i_501_]);
                        anInt1173 -= class348_sub42_sub19_498_.anInt9697;
                        anInt1170 -= class348_sub42_sub19_498_.anInt9695;
                        Class184 class184 = new Class184();
                        class184.aClass348_Sub42_Sub19_2474 = class348_sub42_sub19;
                        class184.anInt2477 = i_488_;
                        class184.anIntArray2468 = anIntArray1164;
                        class184.aStringArray2473 = aStringArray1155;
                        if (anInt1154 >= aClass184Array1168.length) throw new RuntimeException();
                        aClass184Array1168[anInt1154++] = class184;
                        class348_sub42_sub19 = class348_sub42_sub19_498_;
                        is = (class348_sub42_sub19.anIntArray9696);
                        is_489_ = (class348_sub42_sub19.anIntArray9694);
                        i_488_ = -1;
                        anIntArray1164 = is_499_;
                        aStringArray1155 = strings;
                    } else if (i_490_ == 42) anIntArray1149[anInt1173++] = Class77.anIntArray1303[is_489_[i_488_]];
                    else if (i_490_ == 43) {
                        int i_502_ = is_489_[i_488_];
                        Class77.anIntArray1303[i_502_] = anIntArray1149[--anInt1173];
                        Class232.method1647(-128, i_502_);
                        Class184.aBoolean2469 |= Class286_Sub6.aBooleanArray6270[i_502_];
                    } else if (i_490_ == 44) {
                        int i_503_ = is_489_[i_488_] >> 16;
                        int i_504_ = is_489_[i_488_] & 0xffff;
                        int i_505_ = anIntArray1149[--anInt1173];
                        if (i_505_ < 0 || i_505_ > 5000) throw new RuntimeException();
                        anIntArray1172[i_503_] = i_505_;
                        int i_506_ = -1;
                        if (i_504_ == 105) i_506_ = 0;
                        for (int i_507_ = 0; i_507_ < i_505_; i_507_++)
                            anIntArrayArray1161[i_503_][i_507_] = i_506_;
                    } else if (i_490_ == 45) {
                        int i_508_ = is_489_[i_488_];
                        int i_509_ = anIntArray1149[--anInt1173];
                        if (i_509_ < 0 || i_509_ >= anIntArray1172[i_508_]) throw new RuntimeException();
                        anIntArray1149[anInt1173++] = anIntArrayArray1161[i_508_][i_509_];
                    } else if (i_490_ == 46) {
                        int i_510_ = is_489_[i_488_];
                        anInt1173 -= 2;
                        int i_511_ = anIntArray1149[anInt1173];
                        if (i_511_ < 0 || i_511_ >= anIntArray1172[i_510_]) throw new RuntimeException();
                        anIntArrayArray1161[i_510_][i_511_] = anIntArray1149[anInt1173 + 1];
                    } else if (i_490_ == 47) {
                        String string = Class258_Sub2.aStringArray8532[is_489_[i_488_]];
                        if (string == null) string = "null";
                        aStringArray1152[anInt1170++] = string;
                    } else if (i_490_ == 48) {
                        int i_512_ = is_489_[i_488_];
                        Class258_Sub2.aStringArray8532[i_512_] = aStringArray1152[--anInt1170];
                        Class57.method529(i_512_, true);
                    } else if (i_490_ == 51) {
                        Class356 class356 = (class348_sub42_sub19.aClass356Array9693[is_489_[i_488_]]);
                        Class348_Sub35 class348_sub35 = ((Class348_Sub35) class356.method3480(anIntArray1149[--anInt1173], -6008));
                        if (class348_sub35 != null) i_488_ += class348_sub35.anInt6976;
                    } else if (i_490_ == 86) {
                        if (anIntArray1149[--anInt1173] == 1) {
                            i_488_ += is_489_[i_488_];
                        }
                    }
                } else {
                    boolean bool;
                    bool = is_489_[i_488_] == 1;
                    if (i_490_ >= 100 && i_490_ < 5000) method710(i_490_, bool);
                    else {
                        if (i_490_ < 5000 || i_490_ >= 10000) break;
                        method704(i_490_, bool);
                    }
                }
            }
            throw new IllegalStateException("Command: " + i_490_);
        } catch (Exception exception) {
            if (class348_sub42_sub19.aString9690 == null) {
                StringBuffer stringbuffer = new StringBuffer(30);
                stringbuffer.append("CS2: ").append(class348_sub42_sub19.aLong4291).append(" ");
                for (int i_514_ = anInt1154 - 1; i_514_ >= 0; i_514_--)
                    stringbuffer.append("v: ").append(aClass184Array1168[i_514_].aClass348_Sub42_Sub19_2474.aLong4291).append(" ");
                stringbuffer.append("op: ").append(i_490_);
                Class156.method1242(stringbuffer.toString(), exception, 15004);
            } else {
                Class59.method544(("Clientscript error in: " + class348_sub42_sub19.aString9690), false, 4);
                StringBuffer stringbuffer = new StringBuffer(30);
                stringbuffer.append("Clientscript error in: ").append(class348_sub42_sub19.aString9690).append("\n");
                for (int i_513_ = anInt1154 - 1; i_513_ >= 0; i_513_--)
                    stringbuffer.append("via: ").append(aClass184Array1168[i_513_].aClass348_Sub42_Sub19_2474.aString9690).append("\n");
                stringbuffer.append("Op: ").append(i_490_).append("\n");
                String string = exception.getMessage();
                if (string != null && string.length() > 0) stringbuffer.append("Message: ").append(string).append("\n");
                Class156.method1242(stringbuffer.toString(), exception, 15004);
                Applet_Sub1.method94(stringbuffer.toString(), 90);
            }
        }
    }

    private static final void method712(Class348_Sub36 class348_sub36, int i) {
        Object[] objects = class348_sub36.anObjectArray6987;
        int i_515_ = ((Integer) objects[0]).intValue();
        Class348_Sub42_Sub19 class348_sub42_sub19 = Class328.method2609(-122, i_515_);
        if (class348_sub42_sub19 != null) {
            anIntArray1164 = (new int
                    [class348_sub42_sub19.anInt9688]);
            int i_516_ = 0;
            aStringArray1155 = (new String
                    [class348_sub42_sub19.anInt9689]);
            int i_517_ = 0;
            for (int i_518_ = 1; i_518_ < objects.length; i_518_++) {
                if (objects[i_518_] instanceof Integer) {
                    int i_519_ = ((Integer) objects[i_518_]).intValue();
                    if (i_519_ == -2147483647) i_519_ = class348_sub36.anInt6984;
                    if (i_519_ == -2147483646) i_519_ = class348_sub36.anInt6995;
                    if (i_519_ == -2147483645) i_519_ = ((class348_sub36.aClass46_6989 != null) ? class348_sub36.aClass46_6989.anInt830 : -1);
                    if (i_519_ == -2147483644) i_519_ = class348_sub36.anInt6986;
                    if (i_519_ == -2147483643) i_519_ = ((class348_sub36.aClass46_6989 != null) ? class348_sub36.aClass46_6989.anInt704 : -1);
                    if (i_519_ == -2147483642) i_519_ = ((class348_sub36.aClass46_6983 != null) ? class348_sub36.aClass46_6983.anInt830 : -1);
                    if (i_519_ == -2147483641) i_519_ = ((class348_sub36.aClass46_6983 != null) ? class348_sub36.aClass46_6983.anInt704 : -1);
                    if (i_519_ == -2147483640) i_519_ = class348_sub36.anInt6991;
                    if (i_519_ == -2147483639) i_519_ = class348_sub36.anInt6982;
                    anIntArray1164[i_516_++] = i_519_;
                } else if (objects[i_518_] instanceof String) {
                    String string = (String) objects[i_518_];
                    if (string.equals("event_opbase")) string = class348_sub36.aString6994;
                    aStringArray1155[i_517_++] = string;
                }
            }
            anInt1177 = class348_sub36.anInt6988;
            method711(class348_sub42_sub19, i);
        }
    }

    public static void method713() {
        anIntArray1164 = null;
        aStringArray1155 = null;
        anIntArray1172 = null;
        anIntArrayArray1161 = null;
        anIntArray1149 = null;
        aStringArray1152 = null;
        aClass184Array1168 = null;
        aClass46_1150 = null;
        aClass46_1169 = null;
        aClass43_1151 = null;
        aCalendar1160 = null;
        aStringArray1176 = null;
        anIntArray1175 = null;
        aClass60_1174 = null;
    }

    private static final void method714(int i) {
        Class46 class46 = FontRenderer.method2570(1512932720, i);
        if (class46 != null) {
            int i_520_ = i >>> 16;
            Class46[] class46s = Class369_Sub2.aClass46ArrayArray8584[i_520_];
            if (class46s == null) {
                Class46[] class46s_521_ = Class348_Sub40_Sub33.aClass46ArrayArray9427[i_520_];
                int i_522_ = class46s_521_.length;
                class46s = Class369_Sub2.aClass46ArrayArray8584[i_520_] = new Class46[i_522_];
                Class214.method1575(class46s_521_, 0, class46s, 0, class46s_521_.length);
            }
            int i_523_;
            for (i_523_ = 0; i_523_ < class46s.length; i_523_++) {
                if (class46s[i_523_] == class46) break;
            }
            if (i_523_ < class46s.length) {
                Class214.method1575(class46s, i_523_ + 1, class46s, i_523_, class46s.length - i_523_ - 1);
                class46s[class46s.length - 1] = class46;
            }
        }
    }

    static final void method715(int i, boolean bool) {
        /* empty */
    }

    static {
        aClass184Array1168 = new Class184[50];
        aCalendar1160 = Calendar.getInstance();
        anIntArray1175 = new int[3];
        aStringArray1176 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        aClass60_1174 = new Class60(4);
        anInt1177 = 0;
    }
}
