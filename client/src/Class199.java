/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class199 {
    static int anInt2624;
    private boolean aBoolean2625;
    private int anInt2626;
    static int anInt2627;
    static int anInt2628;
    private boolean aBoolean2629;
    static int anInt2630;
    static int[] anIntArray2631 = new int[4096];
    static int[] anIntArray2632;
    static int[] anIntArray2633;
    static int anInt2634;
    private int anInt2635;
    static Class352[] aClass352Array2636;
    static int anInt2637;

    static final void method1455(int i, Color color, String string,
                                 Color color_0_, byte i_1_, Color color_2_) {
        try {
            anInt2627++;
            try {
                Graphics graphics = Class305.aCanvas3869.getGraphics();
                if (Class351.aFont4329 == null)
                    Class351.aFont4329 = new Font("Helvetica", 1, 13);
                if (color == null)
                    color = new Color(140, 17, 17);
                if (color_0_ == null)
                    color_0_ = new Color(140, 17, 17);
                if (color_2_ == null)
                    color_2_ = new Color(255, 255, 255);
                try {
                    if (Class342.anImage4249 == null)
                        Class342.anImage4249
                                = (Class305.aCanvas3869.createImage
                                (Class321.anInt4017,
                                        Class348_Sub42_Sub8_Sub2.anInt10432));
                    Graphics graphics_3_ = Class342.anImage4249.getGraphics();
                    graphics_3_.setColor(Color.black);
                    graphics_3_.fillRect(0, 0, Class321.anInt4017,
                            Class348_Sub42_Sub8_Sub2.anInt10432);
                    int i_4_ = -152 + Class321.anInt4017 / 2;
                    int i_5_ = -18 + Class348_Sub42_Sub8_Sub2.anInt10432 / 2;
                    graphics_3_.setColor(color_0_);
                    graphics_3_.drawRect(i_4_, i_5_, 303, 33);
                    graphics_3_.setColor(color);
                    graphics_3_.fillRect(2 + i_4_, i_5_ - -2, i * 3, 30);
                    graphics_3_.setColor(Color.black);
                    graphics_3_.drawRect(i_4_ + 1, 1 + i_5_, 301, 31);
                    graphics_3_.fillRect(3 * i + (i_4_ - -2), 2 + i_5_,
                            300 - i * 3, 30);
                    graphics_3_.setFont(Class351.aFont4329);
                    graphics_3_.setColor(color_2_);
                    if (i_1_ > -42)
                        anIntArray2631 = null;
                    graphics_3_.drawString(string,
                            (i_4_
                                    + (304 - string.length() * 6) / 2),
                            i_5_ + 22);
                    if (Class348_Sub42_Sub16.aString9665 != null) {
                        graphics_3_.setFont(Class351.aFont4329);
                        graphics_3_.setColor(color_2_);
                        graphics_3_.drawString
                                (Class348_Sub42_Sub16.aString9665,
                                        (Class321.anInt4017 / 2
                                                - (Class348_Sub42_Sub16.aString9665.length() * 6
                                                / 2)),
                                        -26 + Class348_Sub42_Sub8_Sub2.anInt10432 / 2);
                    }
                    graphics.drawImage(Class342.anImage4249, 0, 0, null);
                } catch (Exception exception) {
                    graphics.setColor(Color.black);
                    graphics.fillRect(0, 0, Class321.anInt4017,
                            Class348_Sub42_Sub8_Sub2.anInt10432);
                    int i_6_ = -152 + Class321.anInt4017 / 2;
                    int i_7_ = Class348_Sub42_Sub8_Sub2.anInt10432 / 2 + -18;
                    graphics.setColor(color_0_);
                    graphics.drawRect(i_6_, i_7_, 303, 33);
                    graphics.setColor(color);
                    graphics.fillRect(2 + i_6_, 2 + i_7_, i * 3, 30);
                    graphics.setColor(Color.black);
                    graphics.drawRect(1 + i_6_, 1 + i_7_, 301, 31);
                    graphics.fillRect(3 * i + 2 + i_6_, 2 + i_7_,
                            -(i * 3) + 300, 30);
                    graphics.setFont(Class351.aFont4329);
                    graphics.setColor(color_2_);
                    if (Class348_Sub42_Sub16.aString9665 != null) {
                        graphics.setFont(Class351.aFont4329);
                        graphics.setColor(color_2_);
                        graphics.drawString
                                (Class348_Sub42_Sub16.aString9665,
                                        (Class321.anInt4017 / 2
                                                + -(6 * Class348_Sub42_Sub16.aString9665.length()
                                                / 2)),
                                        Class348_Sub42_Sub8_Sub2.anInt10432 / 2 - 26);
                    }
                    graphics.drawString(string,
                            i_6_ - -((304 + -(string.length() * 6))
                                    / 2),
                            22 + i_7_);
                }
            } catch (Exception exception) {
                Class305.aCanvas3869.repaint();
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("rc.A(" + i + ',' + (color != null ? "{...}" : "null")
                                    + ',' + (string != null ? "{...}" : "null") + ','
                                    + (color_0_ != null ? "{...}" : "null") + ',' + i_1_
                                    + ',' + (color_2_ != null ? "{...}" : "null") + ')'));
        }
    }

    final boolean method1456(byte i) {
        if (i < 49)
            return true;
        anInt2634++;
        return aBoolean2625;
    }

    static final int method1457(int i, int i_8_) {
        if (Class348_Sub1_Sub2.aByteArrayArray8816 != null)
            return Class348_Sub1_Sub2.aByteArrayArray8816[i][i_8_] & 0xff;
        return 0;
    }

    final int method1458(int i) {
        if (i != -23688)
            return -22;
        anInt2628++;
        return anInt2635;
    }

    static final void method1459(int i, int i_9_) {
        anInt2637++;
        Class348_Sub42_Sub15 class348_sub42_sub15
                = Class318_Sub9_Sub1.method2516(i, (byte) 105, 10);
        class348_sub42_sub15.method3251(-16058);
        if (i_9_ != 2)
            aClass352Array2636 = null;
    }

    final boolean method1460(int i) {
        anInt2630++;
        if (i >= -27)
            anInt2626 = 107;
        return aBoolean2629;
    }

    public static void method1461(byte i) {
        anIntArray2633 = null;
        if (i <= 77)
            anIntArray2633 = null;
        anIntArray2631 = null;
        aClass352Array2636 = null;
        anIntArray2632 = null;
    }

    final int method1462(int i) {
        int i_10_ = 23 % ((-4 - i) / 55);
        anInt2624++;
        return anInt2626;
    }

    Class199(boolean bool, int i, int i_11_, boolean bool_12_) {
        anInt2626 = i_11_;
        aBoolean2625 = bool_12_;
        anInt2635 = i;
        aBoolean2629 = bool;
    }

    static {
        for (int i = 0; (i ^ 0xffffffff) > -4097; i++)
            anIntArray2631[i] = Class252.method1918(-3358, i);
        anIntArray2632 = new int[32];
        anIntArray2633 = new int[32];
        aClass352Array2636 = null;
    }
}
