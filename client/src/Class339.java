/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.URL;

final class Class339 implements Runnable {
    static int anInt4198;
    static int anInt4199;
    static int anInt4200;
    private Class144 aClass144_4201;
    static int anInt4202 = -1;
    static int anInt4203;
    private Class295[] aClass295Array4204;
    private volatile boolean aBoolean4205;
    private Thread aThread4206;
    static Class351 aClass351_4207 = new Class351(29, 3);
    static int anInt4208;
    static int anInt4209;
    static int anInt4210;
    static int anInt4211;

    public static void method2664(int i) {
        if (i == 3)
            aClass351_4207 = null;
    }

    public final void run() {
        anInt4203++;
        try {
            BufferedReader bufferedreader
                    = new BufferedReader(new InputStreamReader((DataInputStream)
                    (aClass144_4201
                            .anObject1998)));
            String string = bufferedreader.readLine();
            Class179 class179 = Class43.method381((byte) 68);
            for (/**/; string != null; string = bufferedreader.readLine())
                class179.method1364(-1, string);
            String[] strings = class179.method1361(63);
            if ((strings.length % 3 ^ 0xffffffff) != -1)
                return;
            aClass295Array4204 = new Class295[strings.length / 3];
            for (int i = 0; i < strings.length; i += 3)
                aClass295Array4204[i / 3]
                        = new Class295(strings[i], strings[i + 1], strings[2 + i]);
        } catch (java.io.IOException ioexception) {
            /* empty */
        }
        aBoolean4205 = true;
    }

    static final void method2665(int i, byte i_0_, int i_1_, int i_2_,
                                 int i_3_, int i_4_) {
        anInt4200++;
        int i_5_ = i_4_ - i;
        int i_6_ = -i_2_ + i_3_;
        if ((i_5_ ^ 0xffffffff) != -1) {
            if ((i_6_ ^ 0xffffffff) == -1) {
                Class5_Sub2.method196(true, i_4_, i_1_, i, i_2_);
                return;
            }
        } else {
            if (i_6_ != 0)
                Class336.method2656(i_2_, i, (byte) 124, i_1_, i_3_);
            return;
        }
        int i_7_ = (i_6_ << 1475002892) / i_5_;
        int i_8_ = -(i_7_ * i >> 1276386988) + i_2_;
        int i_9_;
        int i_10_;
        if (i < Class369.anInt4960) {
            i_9_ = (i_7_ * Class369.anInt4960 >> -28340756) + i_8_;
            i_10_ = Class369.anInt4960;
        } else if ((Class113.anInt1745 ^ 0xffffffff) > (i ^ 0xffffffff)) {
            i_9_ = i_8_ - -(Class113.anInt1745 * i_7_ >> -1080981940);
            i_10_ = Class113.anInt1745;
        } else {
            i_10_ = i;
            i_9_ = i_2_;
        }
        if (i_0_ < 56)
            anInt4202 = -57;
        int i_11_;
        int i_12_;
        if (Class369.anInt4960 <= i_4_) {
            if ((i_4_ ^ 0xffffffff) >= (Class113.anInt1745 ^ 0xffffffff)) {
                i_11_ = i_4_;
                i_12_ = i_3_;
            } else {
                i_11_ = Class113.anInt1745;
                i_12_ = i_8_ + (Class113.anInt1745 * i_7_ >> -1213141044);
            }
        } else {
            i_11_ = Class369.anInt4960;
            i_12_ = (i_7_ * Class369.anInt4960 >> 1998070124) + i_8_;
        }
        if ((Class132.anInt1910 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)) {
            i_11_ = (Class132.anInt1910 + -i_8_ << -917473556) / i_7_;
            i_12_ = Class132.anInt1910;
        } else if ((i_12_ ^ 0xffffffff) < (Class38.anInt513 ^ 0xffffffff)) {
            i_11_ = (Class38.anInt513 - i_8_ << -1636944852) / i_7_;
            i_12_ = Class38.anInt513;
        }
        if (Class132.anInt1910 <= i_9_) {
            if ((i_9_ ^ 0xffffffff) < (Class38.anInt513 ^ 0xffffffff)) {
                i_10_ = (Class38.anInt513 - i_8_ << -897379380) / i_7_;
                i_9_ = Class38.anInt513;
            }
        } else {
            i_10_ = (-i_8_ + Class132.anInt1910 << -720084404) / i_7_;
            i_9_ = Class132.anInt1910;
        }
        Class239_Sub15.method1783(i_10_, -1, i_9_, i_12_, i_11_, i_1_);
    }

    static final void method2666(int i, int i_13_, Class46 class46,
                                 byte i_14_) {
        anInt4199++;
        if (class46 != null) {
            if (((Class46) class46).anObjectArray714 != null) {
                Class348_Sub36 class348_sub36 = new Class348_Sub36();
                ((Class348_Sub36) class348_sub36).anObjectArray6987
                        = ((Class46) class46).anObjectArray714;
                ((Class348_Sub36) class348_sub36).aClass46_6989 = class46;
                Class66.method705(class348_sub36);
            }
            Class362.anInt4458 = ((Class46) class46).anInt695;
            Class246.anInt3176 = i;
            Class38.anInt500 = i_13_;
            Class301.anInt3829 = ((Class46) class46).anInt812;
            r.aBoolean9722 = true;
            Class9.anInt169 = ((Class46) class46).anInt704;
            Class348_Sub49_Sub1.anInt9747 = ((Class46) class46).anInt824;
            if (i_14_ != 21)
                method2665(-99, (byte) -106, 10, -37, 26, -123);
            Class149.anInt2046 = ((Class46) class46).anInt830;
            Class251.method1916(-9343, class46);
        }
    }

    final Class295 method2667(boolean bool, int i) {
        anInt4210++;
        if (bool != false)
            return null;
        if (aClass295Array4204 == null || i < 0
                || (aClass295Array4204.length ^ 0xffffffff) >= (i ^ 0xffffffff))
            return null;
        return aClass295Array4204[i];
    }

    public Class339() {
        /* empty */
    }

    final boolean method2668(int i) {
        anInt4208++;
        if (aBoolean4205)
            return true;
        if (aClass144_4201 == null) {
            try {
                int i_15_
                        = (Class8.aClass364_165 == Class55_Sub1.aClass364_5271 ? 80
                        : 7000 - -(((Class161) Class135_Sub2.aClass161_4839)
                        .anInt2143));
                aClass144_4201
                        = (Class348_Sub23_Sub1.aClass297_8992.method2237
                        (new URL("http://"
                                        + (((Class161) Class135_Sub2.aClass161_4839)
                                        .aString2147)
                                        + ":" + i_15_ + "/news.ws?game="
                                        + ((Class230) (Class348_Sub42_Sub8_Sub2
                                        .aClass230_10434)).anInt2987),
                                8362));
            } catch (java.net.MalformedURLException malformedurlexception) {
                return true;
            }
        }
        if (aClass144_4201 == null || aClass144_4201.anInt1997 == 2)
            return true;
        if (i != -21913)
            return false;
        if ((aClass144_4201.anInt1997 ^ 0xffffffff) != -2)
            return false;
        if (aThread4206 == null) {
            aThread4206 = new Thread(this);
            aThread4206.start();
        }
        return aBoolean4205;
    }

    static final void method2669(Object[] objects, long[] ls, int i) {
        try {
            if (i < -5) {
                anInt4209++;
                Class353.method3461(0, objects, -1 + ls.length, ls, 9455);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("eaa.E("
                            + (objects != null ? "{...}"
                            : "null")
                            + ','
                            + (ls != null ? "{...}" : "null")
                            + ',' + i + ')'));
        }
    }
}
