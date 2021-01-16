/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Field;

final class Class294 implements Interface16 {
    private boolean aBoolean5020;
    private int anInt5021;
    private boolean aBoolean5022;
    private int anInt5023;
    private FontMetrics aFontMetrics5024;
    static int anInt5025;
    private Image anImage5026;
    static int anInt5027;
    static int anInt5028;
    private int anInt5029;
    private Image anImage5030;
    static int anInt5031;
    private Image anImage5032;
    static int anInt5033;
    private Color aColor5034;
    private Image anImage5035;
    private int anInt5036;
    private Image anImage5037;
    static int anInt5038;
    static int anInt5039;
    private int anInt5040;
    private Image anImage5041;
    private int anInt5042;
    static int anInt5043;
    static int anInt5044;
    private boolean aBoolean5045;
    private int anInt5046;
    private Image anImage5047;
    static int anInt5048;
    static int anInt5049;
    private int anInt5050;
    private int anInt5051;
    static int anInt5052;
    private Font aFont5053;
    private Image anImage5054;
    static int anInt5055;
    private Image anImage5056;
    static Class351 aClass351_5057 = new Class351(10, -1);
    static Class318_Sub1_Sub3_Sub3_Sub2[] aClass318_Sub1_Sub3_Sub3_Sub2Array5058
            = new Class318_Sub1_Sub3_Sub3_Sub2[2048];
    private Image anImage5059;
    static Class338[] aClass338Array5060;
    static int anInt5061;

    private final void method2211(boolean bool)
            throws IllegalAccessException, NoSuchFieldException {
        anInt5055++;
        Class var_class = Class93.anApplet1530.getClass();
        anImage5047 = (Image) method2213(var_class, 2, "bar");
        anImage5035 = (Image) method2213(var_class, 2, "background");
        anImage5032 = (Image) method2213(var_class, 2, "left");
        anImage5037 = (Image) method2213(var_class, 2, "right");
        anImage5054 = (Image) method2213(var_class, 2, "top");
        anImage5041 = (Image) method2213(var_class, 2, "bottom");
        anImage5030 = (Image) method2213(var_class, 2, "bodyLeft");
        anImage5026 = (Image) method2213(var_class, 2, "bodyRight");
        anImage5056 = (Image) method2213(var_class, 2, "bodyFill");
        aFont5053 = (Font) method2213(var_class, 2, "bf");
        aFontMetrics5024 = (FontMetrics) method2213(var_class, 2, "bfm");
        aColor5034 = (Color) method2213(var_class, 2, "colourtext");
        Object object = method2213(var_class, 2, "lb");
        Class var_class_0_ = object.getClass();
        aBoolean5020 = method2216(object, bool, var_class_0_, "xMiddle");
        aBoolean5045 = method2216(object, bool, var_class_0_, "yMiddle");
        anInt5021 = method2212(object, var_class_0_, "xOffset", 95);
        anInt5051 = method2212(object, var_class_0_, "yOffset", -124);
        anInt5023 = method2212(object, var_class_0_, "width", 104);
        anInt5036 = method2212(object, var_class_0_, "height", -45);
        anInt5029 = method2212(object, var_class_0_, "boxXOffset", -91);
        anInt5040 = method2212(object, var_class_0_, "boxYOffset", -74);
        anInt5050 = method2212(object, var_class_0_, "boxWidth", 120);
        anInt5046 = method2212(object, var_class_0_, "textYOffset", -47);
        anInt5042
                = method2212(object, var_class_0_, "offsetPerTenCycles", 107);
    }

    private final int method2212
            (Object object, Class var_class, String string, int i)
            throws IllegalAccessException, NoSuchFieldException {
        try {
            int i_1_ = -38 / ((i - 24) / 60);
            anInt5039++;
            Field field = var_class.getDeclaredField(string);
            return field.getInt(object);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("wba.K(" + (object != null ? "{...}" : "null") + ','
                                    + (var_class != null ? "{...}" : "null") + ','
                                    + (string != null ? "{...}" : "null") + ',' + i
                                    + ')'));
        }
    }

    private final Object method2213(Class var_class, int i, String string)
            throws IllegalAccessException, NoSuchFieldException {
        try {
            if (i != 2)
                return null;
            anInt5038++;
            Field field = var_class.getDeclaredField(string);
            Object object = field.get(Class93.anApplet1530);
            field.set(Class93.anApplet1530, null);
            return object;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("wba.C("
                            + (var_class != null ? "{...}"
                            : "null")
                            + ',' + i + ','
                            + (string != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public final int method55(byte i) {
        if (i != -58)
            return -26;
        anInt5052++;
        return 0;
    }

    public final boolean method56(byte i, long l) {
        try {
            if (i < 30)
                method2215((byte) 25, -63);
            anInt5061++;
            return true;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "wba.I(" + i + ',' + l + ')');
        }
    }

    public static void method2214(int i) {
        aClass351_5057 = null;
        if (i != 0)
            aClass318_Sub1_Sub3_Sub3_Sub2Array5058 = null;
        aClass338Array5060 = null;
        aClass318_Sub1_Sub3_Sub3_Sub2Array5058 = null;
    }

    public final int method60(int i) {
        if (i != -19079)
            anInt5023 = -66;
        anInt5049++;
        return 100;
    }

    private final int method2215(byte i, int i_2_) {
        anInt5033++;
        if (i < 23)
            anImage5030 = null;
        if (aBoolean5020)
            return (-i_2_ + Class321.anInt4017) / 2;
        return 0;
    }

    public final void method57(int i) {
        anInt5043++;
        if (i <= 84)
            anInt5023 = -93;
    }

    public final void method59(int i) {
        Class191.method1428(true);
        anInt5025++;
        if (i != -9719)
            aBoolean5022 = false;
    }

    private final boolean method2216
            (Object object, boolean bool, Class var_class, String string)
            throws IllegalAccessException, NoSuchFieldException {
        try {
            if (bool != true)
                method2217(4, -90, 15);
            anInt5048++;
            Field field = var_class.getDeclaredField(string);
            return field.getBoolean(object);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("wba.H(" + (object != null ? "{...}" : "null") + ','
                                    + bool + ',' + (var_class != null ? "{...}" : "null")
                                    + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    static final boolean method2217(int i, int i_3_, int i_4_) {
        anInt5027++;
        if (i_4_ != 0)
            aClass338Array5060 = null;
        if ((i_3_ & 0x21) == 0)
            return false;
        return true;
    }

    public final void method58(boolean bool, int i) {
        anInt5044++;
        if (i > -69)
            method2215((byte) -61, -24);
        if (!aBoolean5022) {
            if (Class93.anApplet1530 == null)
                aBoolean5022 = true;
            else if (aFont5053 == null) {
                try {
                    method2211(true);
                } catch (Exception exception) {
                    aBoolean5022 = true;
                }
            }
        }
        if (aBoolean5022)
            method2219(33);
        else {
            Graphics graphics = Class305.aCanvas3869.getGraphics();
            if (graphics != null) {
                try {
                    int i_5_ = Class51.aClass311_897.method2320((byte) 103);
                    String string = Class51.aClass311_897.method2318(-9324);
                    if (Class342.anImage4249 == null)
                        Class342.anImage4249
                                = (Class305.aCanvas3869.createImage
                                (Class321.anInt4017,
                                        Class348_Sub42_Sub8_Sub2.anInt10432));
                    Graphics graphics_6_ = Class342.anImage4249.getGraphics();
                    graphics_6_.clearRect(0, 0, Class321.anInt4017,
                            Class348_Sub42_Sub8_Sub2.anInt10432);
                    int i_7_ = anImage5030.getWidth(null);
                    int i_8_ = anImage5026.getWidth(null);
                    int i_9_ = anImage5056.getWidth(null);
                    int i_10_ = anImage5030.getHeight(null);
                    int i_11_ = anImage5026.getHeight(null);
                    int i_12_ = anImage5056.getHeight(null);
                    graphics_6_.drawImage(anImage5030,
                            (method2215((byte) 84, i_7_)
                                    - (-anInt5029 + anInt5050 / 2)),
                            method2218(i_10_, -6277) + anInt5040,
                            null);
                    int i_13_ = i_7_ + -(anInt5050 / 2) + anInt5029;
                    int i_14_ = anInt5029 + anInt5050 / 2;
                    for (int i_15_ = i_13_;
                         (i_15_ ^ 0xffffffff) >= (i_14_ ^ 0xffffffff);
                         i_15_ += i_9_)
                        graphics_6_.drawImage(anImage5056,
                                i_15_ + (method2215((byte) 77,
                                        i_7_)
                                        - -anInt5029),
                                (method2218(i_12_, -6277)
                                        + anInt5040),
                                null);
                    graphics_6_.drawImage(anImage5026,
                            (method2215((byte) 25, i_8_)
                                    - (-anInt5029 - anInt5050 / 2)),
                            (method2218(i_11_, -6277)
                                    - -anInt5040),
                            null);
                    int i_16_ = anImage5032.getWidth(null);
                    int i_17_ = anImage5032.getHeight(null);
                    int i_18_ = anImage5037.getWidth(null);
                    int i_19_ = anImage5037.getHeight(null);
                    int i_20_ = anImage5041.getHeight(null);
                    int i_21_ = anImage5054.getWidth(null);
                    int i_22_ = anImage5054.getHeight(null);
                    int i_23_ = anImage5041.getWidth(null);
                    int i_24_ = anImage5047.getWidth(null);
                    int i_25_ = anImage5035.getWidth(null);
                    int i_26_ = method2215((byte) 122, anInt5023) + anInt5021;
                    int i_27_ = method2218(anInt5036, -6277) - -anInt5051;
                    graphics_6_.drawImage(anImage5032, i_26_,
                            i_27_ - -((anInt5036 + -i_17_) / 2),
                            null);
                    graphics_6_.drawImage(anImage5037,
                            anInt5023 + i_26_ - i_18_,
                            (anInt5036 - i_19_) / 2 + i_27_,
                            null);
                    if (anImage5059 == null)
                        anImage5059
                                = (Class305.aCanvas3869.createImage
                                (-i_18_ + (-i_16_ + anInt5023), anInt5036));
                    Graphics graphics_28_ = anImage5059.getGraphics();
                    for (int i_29_ = 0;
                         ((i_29_ ^ 0xffffffff)
                                 > (-i_18_ + (anInt5023 + -i_16_) ^ 0xffffffff));
                         i_29_ += i_21_)
                        graphics_28_.drawImage(anImage5054, i_29_, 0, null);
                    for (int i_30_ = 0;
                         ((anInt5023 - (i_16_ + i_18_) ^ 0xffffffff)
                                 < (i_30_ ^ 0xffffffff));
                         i_30_ += i_23_)
                        graphics_28_.drawImage(anImage5041, i_30_,
                                -i_20_ + anInt5036, null);
                    int i_31_ = i_5_ * (-i_18_ + (-i_16_ + anInt5023)) / 100;
                    if ((i_31_ ^ 0xffffffff) < -1) {
                        Image image
                                = Class305.aCanvas3869.createImage(i_31_,
                                (-i_22_
                                        + (anInt5036
                                        + -i_20_)));
                        int i_32_ = image.getWidth(null);
                        Graphics graphics_33_ = image.getGraphics();
                        int i_34_
                                = anInt5042 * aa_Sub2.method163(512) / 10 % i_24_;
                        for (int i_35_ = -i_24_ + i_34_;
                             (i_32_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff);
                             i_35_ += i_24_)
                            graphics_33_.drawImage(anImage5047, i_35_, 0,
                                    null);
                        graphics_28_.drawImage(image, 0, i_22_, null);
                    }
                    int i_36_ = i_31_;
                    i_31_ = -i_31_ + -i_18_ + anInt5023 + -i_16_;
                    if (i_31_ > 0) {
                        Image image
                                = Class305.aCanvas3869.createImage(i_31_,
                                (-i_22_
                                        + (anInt5036
                                        + -i_20_)));
                        int i_37_ = image.getWidth(null);
                        Graphics graphics_38_ = image.getGraphics();
                        for (int i_39_ = 0; i_39_ < i_37_; i_39_ += i_25_)
                            graphics_38_.drawImage(anImage5035, i_39_, 0,
                                    null);
                        graphics_28_.drawImage(image, i_36_, i_22_, null);
                    }
                    graphics_6_.drawImage(anImage5059, i_16_ + i_26_, i_27_,
                            null);
                    graphics_6_.setFont(aFont5053);
                    graphics_6_.setColor(aColor5034);
                    graphics_6_.drawString
                            (string,
                                    i_26_ + (anInt5023
                                            + -aFontMetrics5024.stringWidth(string)) / 2,
                                    anInt5046 + (4 + anInt5036 / 2 + i_27_));
                    graphics.drawImage(Class342.anImage4249, 0, 0, null);
                } catch (Exception exception) {
                    aBoolean5022 = true;
                }
            } else
                Class305.aCanvas3869.repaint();
        }
    }

    private final int method2218(int i, int i_40_) {
        anInt5028++;
        if (aBoolean5045)
            return (-i + Class348_Sub42_Sub8_Sub2.anInt10432) / 2;
        if (i_40_ != -6277)
            anImage5026 = null;
        return 0;
    }

    private final void method2219(int i) {
        anInt5031++;
        Class199.method1455(Class51.aClass311_897.method2320((byte) 78),
                Class135.aColorArray1928[Class222.anInt2884],
                Class51.aClass311_897.method2318(-9324),
                (Class348_Sub40_Sub8.aColorArray9163
                        [Class222.anInt2884]),
                (byte) -100,
                Class50_Sub3.aColorArray5242[Class222.anInt2884]);
        if (i != 33)
            method55((byte) 1);
    }

    public Class294() {
        /* empty */
    }
}
