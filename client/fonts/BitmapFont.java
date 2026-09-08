/* BitmapFont - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.util.Random;

/**
 * Bitmap font / text drawer used by the 634 UI (chat, FPS overlay, console,
 * Microbot panel, etc.).
 * <p>
 * Common draw helpers (coords are canvas pixels, colours are packed ARGB —
 * FPS overlay often uses {@code -256} yellow / {@code -1} white):
 * <ul>
 *   <li>{@link #drawText} — left-aligned at {@code (x, y)}</li>
 *   <li>{@link #drawTextCentred} — centred on X ({@code centreX}), Y separate</li>
 *   <li>{@link #drawTextRightAligned} — right-aligned to {@code rightX}</li>
 * </ul>
 * Prefer {@link #drawText} for overlays you layout yourself (e.g. Microbot HUD).
 */
abstract class BitmapFont {
    static int anInt4045;
    static int anInt4046;
    static int anInt4047;
    private GraphicsToolkit toolkit;
    static int anInt4049;
    static int anInt4050;
    static int anInt4051;
    static int anInt4052;
    static int anInt4053;
    static int anInt4054;
    static int anInt4055;
    static int anInt4056;
    static int anInt4057;
    static int anInt4058;
    static int anInt4059;
    static int anInt4060;
    static int anInt4061;
    static Component161 aClass138_4062 = new Component161(2, 4, 4, 0);
    private Component184 metrics;
    static int anInt4064;
    static int anInt4065;

    private final void method2566(Component24[] class105s, int[] is, int i, int[] is_0_, int[] is_1_, int i_2_, String string, int i_3_) {
        try {
            i_2_ -= metrics.ascent;
            anInt4058++;
            int i_4_ = -1;
            int i_5_ = -1;
            int i_6_ = 0;
            if (i_3_ == 174) {
                int i_7_ = string.length();
                int i_8_ = 0;
                for (/**/; i_7_ > i_8_; i_8_++) {
                    char c = (char) (Component160.method3464(string.charAt(i_8_), false) & 0xff);
                    if (c == 60) i_4_ = i_8_;
                    else {
                        if (c == 62 && i_4_ != -1) {
                            String string_9_ = string.substring(1 + i_4_, i_8_);
                            i_4_ = -1;
                            if (string_9_.equals("lt")) c = '<';
                            else if (!string_9_.equals("gt")) {
                                if (string_9_.equals("nbsp")) c = '\u00a0';
                                else if (!string_9_.equals("shy")) {
                                    if (string_9_.equals("times")) c = '\u00d7';
                                    else if (!string_9_.equals("euro")) {
                                        if (string_9_.equals("copy")) c = '\u00a9';
                                        else if (string_9_.equals("reg")) c = '\u00ae';
                                        else {
                                            if (string_9_.startsWith("img=")) {
                                                try {
                                                    int i_10_;
                                                    if (is_1_ != null) i_10_ = is_1_[i_6_];
                                                    else i_10_ = 0;
                                                    int i_11_;
                                                    if (is != null) i_11_ = is[i_6_];
                                                    else i_11_ = 0;
                                                    i_6_++;
                                                    int i_12_ = (NodeSub41.parseInt(true, (string_9_.substring(4))));
                                                    Component24 class105 = class105s[i_12_];
                                                    int i_13_ = (is_0_ == null ? class105.method980() : is_0_[i_12_]);
                                                    class105.method964(i + i_10_, (-i_13_ + (metrics.ascent) + (i_2_ - -i_11_)), 1, 0, 1);
                                                    i += class105s[i_12_].method966();
                                                    i_5_ = -1;
                                                } catch (Exception exception) {
                                                    /* empty */
                                                }
                                            } else method2573((byte) -92, string_9_);
                                            continue;
                                        }
                                    } else c = '\u20ac';
                                } else c = '\u00ad';
                            } else c = '>';
                        }
                        if (i_4_ == -1) {
                            if (i_5_ != -1) i += metrics.charKerning(i_5_, (byte) -104, c);
                            int i_14_;
                            if (is_1_ == null) i_14_ = 0;
                            else i_14_ = is_1_[i_6_];
                            int i_15_;
                            if (is == null) i_15_ = 0;
                            else i_15_ = is[i_6_];
                            if (c != 32) {
                                if ((Component120.anInt320 & ~0xffffff) != 0) fa(c, 1 + i - -i_14_, i_2_ - -1 + i_15_, Component120.anInt320, true);
                                fa(c, i + i_14_, i_2_ + i_15_, HashNodeSub1.anInt9492, false);
                            } else if (Component286.anInt1902 > 0) {
                                AbstractGlTexture.anInt4848 += Component286.anInt1902;
                                i += AbstractGlTexture.anInt4848 >> 8;
                                AbstractGlTexture.anInt4848 &= 0xff;
                            }
                            i_6_++;
                            int i_16_ = metrics.charWidth((byte) -48, c);
                            if (Player.anInt10567 != -1) toolkit.method3649((byte) -103, i_16_, i_2_ - -(int) ((double) (metrics.ascent) * 0.7), Player.anInt10567, i);
                            if (DefinitionSub2.anInt9101 != -1) toolkit.method3649((byte) -96, i_16_, (metrics.ascent) + i_2_, (DefinitionSub2.anInt9101), i);
                            i_5_ = c;
                            i += i_16_;
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("da.V(" + (class105s != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + (is_0_ != null ? "{...}" : "null") + ',' + (is_1_ != null ? "{...}" : "null") + ',' + i_2_ + ',' + (string != null ? "{...}" : "null") + ',' + i_3_ + ')'));
        }
    }

    final void method2567(int i, String string, byte i_17_, int i_18_, int i_19_, int i_20_, Component24[] class105s, int[] is) {
        try {
            anInt4056++;
            if (i_17_ > 114 && string != null) {
                method2579(i_19_, -78, i_18_);
                method2583(0, i, 0, class105s, null, string, is, 25625, i_20_);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("da.R(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + (class105s != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    final int method2568(int[] is, int i, byte i_21_, Shader var_aa, int i_22_, Component24[] class105s, int i_23_, int i_24_, int i_25_, int i_26_, String string, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
        try {
            anInt4054++;
            if (string == null) return 0;
            method2579(i_30_, -76, i_23_);
            if (i_32_ == 0) i_32_ = metrics.ascent;
            int[] is_33_;
            if ((metrics.descent + metrics.maxAscent - -i_32_) <= i || i_32_ + i_32_ <= i) is_33_ = new int[]{i_25_};
            else is_33_ = null;
            int i_34_ = metrics.method1188(string, is_33_, ClientErrorReporter.aStringArray2113, (byte) 87, class105s);
            if (i_31_ == -1) {
                i_31_ = i / i_32_;
                if (i_31_ <= 0) i_31_ = 1;
            }
            if (i_31_ > 0 && i_31_ <= i_34_) {
                ClientErrorReporter.aStringArray2113[i_31_ - 1] = metrics.method1181(class105s, i_25_, (ClientErrorReporter.aStringArray2113[i_31_ - 1]), (byte) 55);
                i_34_ = i_31_;
            }
            if (i_26_ == 3 && i_34_ == 1) i_26_ = 1;
            int i_35_ = -116 % ((i_21_ - -28) / 43);
            int i_36_;
            if (i_26_ == 0) i_36_ = metrics.maxAscent + i_24_;
            else if (i_26_ != 1) {
                if (i_26_ != 2) {
                    int i_37_ = ((-(i_32_ * (i_34_ + -1)) + (i + (-metrics.maxAscent + -metrics.descent))) / (1 + i_34_));
                    if (i_37_ < 0) i_37_ = 0;
                    i_32_ += i_37_;
                    i_36_ = metrics.maxAscent + (i_24_ - -i_37_);
                } else i_36_ = (-metrics.descent + i + (i_24_ - (i_34_ + -1) * i_32_));
            } else i_36_ = ((-metrics.descent + (-metrics.maxAscent + i + -(i_32_ * (-1 + i_34_)))) / 2 + (metrics.maxAscent + i_24_));
            for (int i_38_ = 0; i_38_ < i_34_; i_38_++) {
                if (i_29_ == 0) method2583(i_27_, i_36_, i_22_, class105s, var_aa, ClientErrorReporter.aStringArray2113[i_38_], is, 25625, i_28_);
                else if (i_29_ == 1) method2583(i_27_, i_36_, i_22_, class105s, var_aa, ClientErrorReporter.aStringArray2113[i_38_], is, 25625, (-metrics.stringWidth(true, (ClientErrorReporter.aStringArray2113[i_38_])) + i_25_) / 2 + i_28_);
                else if (i_29_ == 2) method2583(i_27_, i_36_, i_22_, class105s, var_aa, ClientErrorReporter.aStringArray2113[i_38_], is, 25625, (-metrics.stringWidth(true, (ClientErrorReporter.aStringArray2113[i_38_])) + (i_25_ + i_28_)));
                else if (i_38_ != i_34_ - 1) {
                    method2580(ClientErrorReporter.aStringArray2113[i_38_], 0, i_25_);
                    method2583(i_27_, i_36_, i_22_, class105s, var_aa, ClientErrorReporter.aStringArray2113[i_38_], is, 25625, i_28_);
                    Component286.anInt1902 = 0;
                } else method2583(i_27_, i_36_, i_22_, class105s, var_aa, ClientErrorReporter.aStringArray2113[i_38_], is, 25625, i_28_);
                i_36_ += i_32_;
            }
            return i_34_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("da.W(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_21_ + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_22_ + ',' + (class105s != null ? "{...}" : "null") + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + (string != null ? "{...}" : "null") + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ')'));
        }
    }

    abstract void fa(char c, int i, int i_39_, int i_40_, boolean bool);

    /**
     * Draw {@code string} right-aligned to {@code rightX}.
     *
     * @param string text
     * @param y      baseline Y
     * @param colour ARGB (e.g. {@code -256} yellow, {@code -1} white)
     * @param rightX right edge X — glyphs end here
     * @param unused must be {@code <= -119} or the call no-ops
     * @param shadow ARGB shadow (often {@code -1} or {@code -16777216})
     */
    final void drawTextRightAligned(String string, int y, int colour, int rightX, int unused, int shadow) {
        anInt4052++;
        if (unused >= -119) method2571(-128, -30, null, null, -107, -80, null, -6, -122, null);
        if (string != null) {
            method2579(shadow, 122, colour);
            method2583(0, y, 0, null, null, string, null, 25625, -metrics.stringWidth(true, string) + rightX);
        }
    }

    /**
     * Look up a root interface component by packed id
     * ({@code (interfaceId << 16) | componentId}).
     * Lives on {@link BitmapFont} for historical/obfuscation reasons — not font-related.
     * Opaque first arg must be {@code 1512932720}.
     */
    static final DisplayModeManagerContainer57 getComponent(int i, int i_45_) {
        anInt4055++;
        if (i != 1512932720) return null;
        int i_46_ = i_45_ >> 16;
        int i_47_ = i_45_ & 0xffff;
        if (DefinitionSub33.openInterfaces[i_46_] == null || (DefinitionSub33.openInterfaces[i_46_][i_47_] == null)) {
            boolean bool = Component233.method2547(i_46_, (byte) 84);
            if (!bool) return null;
        }
        return DefinitionSub33.openInterfaces[i_46_][i_47_];
    }

    final int method2571(int i, int i_48_, int[] is, String string, int i_49_, int i_50_, Component24[] class105s, int i_51_, int i_52_, Random random) {
        try {
            anInt4047++;
            if (string == null) return 0;
            random.setSeed(i_48_);
            int i_53_ = (random.nextInt() & 0x1f) + 192;
            method2579(i_53_ << 24 | 0xffffff & i_50_, i ^ ~0x79, i_53_ << 24 | i_49_ & 0xffffff);
            int i_54_ = string.length();
            if (i != -1) aClass138_4062 = null;
            int[] is_55_ = new int[i_54_];
            int i_56_ = 0;
            for (int i_57_ = 0; i_54_ > i_57_; i_57_++) {
                is_55_[i_57_] = i_56_;
                if ((0x3 & random.nextInt()) == 0) i_56_++;
            }
            method2566(class105s, null, i_52_, is, is_55_, i_51_, string, 174);
            return i_56_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("da.BA(" + i + ',' + i_48_ + ',' + (is != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + i_49_ + ',' + i_50_ + ',' + (class105s != null ? "{...}" : "null") + ',' + i_51_ + ',' + i_52_ + ',' + (random != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method2572(byte i) {
        aClass138_4062 = null;
        if (i != 23) aClass138_4062 = null;
    }

    private final void method2573(byte i, String string) {
        anInt4046++;
        try {
            if (i <= -78) {
                if (string.startsWith("col=")) HashNodeSub1.anInt9492 = (HashNodeSub1.anInt9492 & ~0xffffff | Component377.method450(-20188, string.substring(4), 16) & 0xffffff);
                else if (string.equals("/col")) HashNodeSub1.anInt9492 = (HashNodeSub1.anInt9492 & ~0xffffff | 0xffffff & Component134.anInt5807);
                if (string.startsWith("argb=")) HashNodeSub1.anInt9492 = Component377.method450(-20188, string.substring(5), 16);
                else if (!string.equals("/argb")) {
                    if (!string.startsWith("str=")) {
                        if (string.equals("str")) Player.anInt10567 = (HashNodeSub1.anInt9492 & ~0xffffff | 0x800000);
                        else if (!string.equals("/str")) {
                            if (!string.startsWith("u=")) {
                                if (!string.equals("u")) {
                                    if (!string.equals("/u")) {
                                        if (!string.equalsIgnoreCase("shad=-1")) {
                                            if (string.startsWith("shad=")) Component120.anInt320 = ((~0xffffff & (HashNodeSub1.anInt9492)) | (Component377.method450(-20188, string.substring(5), 16)));
                                            else if (string.equals("shad")) Component120.anInt320 = (~0xffffff & (HashNodeSub1.anInt9492));
                                            else if (!string.equals("/shad")) {
                                                if (string.equals("br")) method2579((DisplayModeManagerContainer346.anInt2061), 117, (Component134.anInt5807));
                                            } else Component120.anInt320 = DisplayModeManagerContainer346.anInt2061;
                                        } else Component120.anInt320 = 0;
                                    } else DefinitionSub2.anInt9101 = -1;
                                } else DefinitionSub2.anInt9101 = (HashNodeSub1.anInt9492 & ~0xffffff);
                            } else DefinitionSub2.anInt9101 = ((HashNodeSub1.anInt9492 & ~0xffffff) | Component377.method450(-20188, string.substring(2), 16));
                        } else Player.anInt10567 = -1;
                    } else Player.anInt10567 = (HashNodeSub1.anInt9492 & ~0xffffff | Component377.method450(-20188, string.substring(4), 16));
                } else HashNodeSub1.anInt9492 = Component134.anInt5807;
            }
        } catch (Exception exception) {
            /* empty */
        }
    }

    final void method2574(int i, int i_58_, String string, int i_59_, int i_60_, int i_61_, boolean bool) {
        anInt4059++;
        if (string != null) {
            method2579(i_60_, 108, i);
            int i_62_ = string.length();
            int[] is = new int[i_62_];
            if (bool != false) toolkit = null;
            for (int i_63_ = 0; i_63_ < i_62_; i_63_++)
                is[i_63_] = (int) (5.0 * Math.sin((double) i_63_ / 2.0 + (double) i_61_ / 5.0));
            method2566(null, is, -(metrics.stringWidth(!bool, string) / 2) + i_59_, null, null, i_58_, string, 174);
        }
    }

    /**
     * Draw {@code string} centred on {@code centreX} at baseline {@code y}.
     * <p>
     * Args are easy to swap with {@link #drawText} — wrong order stacks glyphs.
     * Prefer {@link #drawText} for left-aligned overlays.
     *
     * @param unused  obfuscation pad (any byte; unused for control flow)
     * @param centreX horizontal centre of the string
     * @param colour  ARGB
     * @param string  text
     * @param shadow  ARGB shadow
     * @param y       baseline Y
     */
    final void drawTextCentred(byte unused, int centreX, int colour, String string, int shadow, int y) {
        anInt4060++;
        if (string != null) {
            method2579(shadow, 115, colour);
            method2583(0, y, 0, null, null, string, null, 25625, -(metrics.stringWidth(true, string) / 2) + centreX);
            int i_68_ = 7 % ((66 - unused) / 44);
        }
    }

    /**
     * Draw {@code string} left-aligned at {@code (x, y)}.
     * Used by the developer console and {@code MicrobotPanel}.
     *
     * @param string text
     * @param colour ARGB
     * @param y      baseline Y
     * @param x      left edge X
     * @param shadow ARGB shadow
     * @param pad    must be {@code <= -108} or the call no-ops (obfuscation guard)
     */
    final void drawText(String string, int colour, int y, int x, int shadow, int pad) {
        if (pad <= -108) {
            anInt4045++;
            if (string != null) {
                method2579(shadow, 110, colour);
                method2583(0, y, 0, null, null, string, null, 25625, x);
            }
        }
    }

    final void method2577(int i, int i_73_, String string, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_) {
        anInt4051++;
        if (string != null) {
            method2579(i_75_, -104, i_74_);
            double d = 7.0 - (double) i_76_ / 8.0;
            if (d < 0.0) d = 0.0;
            int i_79_ = string.length();
            if (i_78_ != -20509) fa('\ufff3', -40, -44, -36, true);
            int[] is = new int[i_79_];
            for (int i_80_ = 0; i_79_ > i_80_; i_80_++)
                is[i_80_] = (int) (Math.sin((double) i + (double) i_80_ / 1.5) * d);
            method2566(null, is, i_77_ + -(metrics.stringWidth(true, string) / 2), null, null, i_73_, string, 174);
        }
    }

    abstract void method2578(char c, int i, int i_81_, int i_82_, boolean bool, Shader var_aa, int i_83_, int i_84_);

    private final void method2579(int i, int i_85_, int i_86_) {
        DefinitionSub2.anInt9101 = -1;
        if (i == -1) i = 0;
        HashNodeSub1.anInt9492 = Component134.anInt5807 = i_86_;
        AbstractGlTexture.anInt4848 = 0;
        Component286.anInt1902 = 0;
        int i_87_ = -28 / ((56 - i_85_) / 49);
        anInt4053++;
        Player.anInt10567 = -1;
        Component120.anInt320 = DisplayModeManagerContainer346.anInt2061 = i;
    }

    private final void method2580(String string, int i, int i_88_) {
        anInt4064++;
        int i_89_ = 0;
        boolean bool = false;
        for (int i_90_ = i; i_90_ < string.length(); i_90_++) {
            int i_91_ = string.charAt(i_90_);
            if (i_91_ != 60) {
                if (i_91_ == 62) bool = false;
                else if (!bool && i_91_ == 32) i_89_++;
            } else bool = true;
        }
        if (i_89_ > 0) Component286.anInt1902 = (-metrics.stringWidth(true, string) + i_88_ << 8) / i_89_;
    }

    final void method2581(String string, int i, int i_92_, int i_93_, byte i_94_, int i_95_, int i_96_) {
        anInt4049++;
        if (string != null) {
            method2579(i_95_, 117, i);
            if (i_94_ > -12) metrics = null;
            int i_97_ = string.length();
            int[] is = new int[i_97_];
            int[] is_98_ = new int[i_97_];
            for (int i_99_ = 0; i_97_ > i_99_; i_99_++) {
                is[i_99_] = (int) (5.0 * Math.sin((double) i_92_ / 5.0 + (double) i_99_ / 5.0));
                is_98_[i_99_] = (int) (5.0 * Math.sin((double) i_99_ / 3.0 + (double) i_92_ / 5.0));
            }
            method2566(null, is_98_, -(metrics.stringWidth(true, string) / 2) + i_96_, null, is, i_93_, string, 174);
        }
    }

    static final Component84 method2582(GlExtensionManager class377, DisplayModeManagerContainer271[] class39s, int i) {
        try {
            anInt4065++;
            if (i != -2113) aClass138_4062 = null;
            for (int i_100_ = 0; class39s.length > i_100_; i_100_++) {
                if (class39s[i_100_] == null || class39s[i_100_].aLong517 <= 0) return null;
            }
            long l = OpenGL.glCreateProgramObjectARB();
            for (int i_101_ = 0; class39s.length > i_101_; i_101_++)
                OpenGL.glAttachObjectARB(l, (class39s[i_101_].aLong517));
            OpenGL.glLinkProgramARB(l);
            OpenGL.glGetObjectParameterivARB(l, 35714, DisplayModeManagerContainer159.anIntArray2744, 0);
            if (DisplayModeManagerContainer159.anIntArray2744[0] == 0) {
                if (DisplayModeManagerContainer159.anIntArray2744[0] == 0) System.out.println("aa linking failed:");
                OpenGL.glGetObjectParameterivARB(l, 35716, DisplayModeManagerContainer159.anIntArray2744, 1);
                if (DisplayModeManagerContainer159.anIntArray2744[1] > 1) {
                    byte[] is = new byte[DisplayModeManagerContainer159.anIntArray2744[1]];
                    OpenGL.glGetInfoLogARB(l, DisplayModeManagerContainer159.anIntArray2744[1], DisplayModeManagerContainer159.anIntArray2744, 0, is, 0);
                    System.out.println(new String(is));
                }
                if (DisplayModeManagerContainer159.anIntArray2744[0] == 0) {
                    for (int i_102_ = 0; class39s.length > i_102_; i_102_++)
                        OpenGL.glDetachObjectARB(l, (class39s[i_102_].aLong517));
                    OpenGL.glDeleteObjectARB(l);
                    return null;
                }
            }
            return new Component84(class377, l, class39s);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("da.M(" + (class377 != null ? "{...}" : "null") + ',' + (class39s != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    private final void method2583(int i, int i_103_, int i_104_, Component24[] class105s, Shader var_aa, String string, int[] is, int i_105_, int i_106_) {
        try {
            i_103_ -= metrics.ascent;
            anInt4061++;
            int i_107_ = -1;
            int i_108_ = -1;
            int i_109_ = string.length();
            if (i_105_ == 25625) {
                int i_110_ = 0;
                for (/**/; i_110_ < i_109_; i_110_++) {
                    char c = (char) (Component160.method3464(string.charAt(i_110_), false) & 0xff);
                    if (c == 60) i_107_ = i_110_;
                    else {
                        if (c == 62 && i_107_ != -1) {
                            String string_111_ = string.substring(i_107_ - -1, i_110_);
                            i_107_ = -1;
                            if (string_111_.equals("lt")) c = '<';
                            else if (string_111_.equals("gt")) c = '>';
                            else if (!string_111_.equals("nbsp")) {
                                if (string_111_.equals("shy")) c = '\u00ad';
                                else if (!string_111_.equals("times")) {
                                    if (!string_111_.equals("euro")) {
                                        if (string_111_.equals("copy")) c = '\u00a9';
                                        else if (string_111_.equals("reg")) c = '\u00ae';
                                        else {
                                            if (string_111_.startsWith("img=")) {
                                                try {
                                                    int i_112_ = (NodeSub41.parseInt(true, (string_111_.substring(4))));
                                                    Component24 class105 = class105s[i_112_];
                                                    int i_113_ = (is == null ? class105.method980() : is[i_112_]);
                                                    if (((HashNodeSub1.anInt9492) & ~0xffffff) != -16777216) class105.method964(i_106_, (-i_113_ + (metrics.ascent) + i_103_), 0, (0xffffff | (~0xffffff & (HashNodeSub1.anInt9492))), 1);
                                                    else class105.method964(i_106_, ((metrics.ascent) + (i_103_ - i_113_)), 1, 0, 1);
                                                    i_108_ = -1;
                                                    i_106_ += class105s[i_112_].method966();
                                                } catch (Exception exception) {
                                                    /* empty */
                                                }
                                            } else method2573((byte) -118, string_111_);
                                            continue;
                                        }
                                    } else c = '\u20ac';
                                } else c = '\u00d7';
                            } else c = '\u00a0';
                        }
                        if (i_107_ == -1) {
                            if (i_108_ != -1) i_106_ += metrics.charKerning(i_108_, (byte) -90, c);
                            if (c != 32) {
                                if (var_aa == null) {
                                    if ((Component120.anInt320 & ~0xffffff) != 0) fa(c, i_106_ + 1, 1 + i_103_, Component120.anInt320, true);
                                    fa(c, i_106_, i_103_, HashNodeSub1.anInt9492, false);
                                } else {
                                    if ((~0xffffff & Component120.anInt320) != 0) method2578(c, 1 + i_106_, i_103_ + 1, Component120.anInt320, true, var_aa, i_104_, i);
                                    method2578(c, i_106_, i_103_, HashNodeSub1.anInt9492, false, var_aa, i_104_, i);
                                }
                            } else if (Component286.anInt1902 > 0) {
                                AbstractGlTexture.anInt4848 += Component286.anInt1902;
                                i_106_ += AbstractGlTexture.anInt4848 >> 8;
                                AbstractGlTexture.anInt4848 &= 0xff;
                            }
                            int i_114_ = metrics.charWidth((byte) -48, c);
                            if (Player.anInt10567 != -1) toolkit.method3649((byte) -119, i_114_, (int) ((double) metrics.ascent * 0.7) + i_103_, Player.anInt10567, i_106_);
                            if (DefinitionSub2.anInt9101 != -1) toolkit.method3649((byte) -114, i_114_, (metrics.ascent) + (i_103_ + 1), (DefinitionSub2.anInt9101), i_106_);
                            i_106_ += i_114_;
                            i_108_ = c;
                        }
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("da.AA(" + i + ',' + i_103_ + ',' + i_104_ + ',' + (class105s != null ? "{...}" : "null") + ',' + (var_aa != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i_105_ + ',' + i_106_ + ')'));
        }
    }

    BitmapFont(GraphicsToolkit var_ha, Component184 class143) {
        try {
            metrics = class143;
            toolkit = var_ha;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("da.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class143 != null ? "{...}" : "null") + ')'));
        }
    }

    final int method2584(int[] is, int i, int i_115_, Component24[] class105s, int i_116_, int i_117_, int i_118_, Shader var_aa, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, boolean bool, int i_124_, String string) {
        try {
            if (bool != false) getComponent(-23, 41);
            anInt4057++;
            return method2568(is, i_118_, (byte) 97, var_aa, i_120_, class105s, i_116_, i_119_, i_122_, i_117_, string, i_121_, i_123_, i_124_, i_115_, 0, i);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("da.J(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_115_ + ',' + (class105s != null ? "{...}" : "null") + ',' + i_116_ + ',' + i_117_ + ',' + i_118_ + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_119_ + ',' + i_120_ + ',' + i_121_ + ',' + i_122_ + ',' + i_123_ + ',' + bool + ',' + i_124_ + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    final int method2585(int[] is, int i, Component24[] class105s, int i_125_, int i_126_, int i_127_, int i_128_, Random random, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_, String string, int[] is_134_) {
        try {
            anInt4050++;
            if (string == null) return 0;
            random.setSeed(i_131_);
            int i_135_ = (0x1f & random.nextInt()) + 192;
            method2579(i_135_ << 24 | i_128_ & 0xffffff, -45, 0xffffff & i_126_ | i_135_ << 24);
            int i_136_ = string.length();
            int[] is_137_ = new int[i_136_];
            int i_138_ = 0;
            for (int i_139_ = 0; i_136_ > i_139_; i_139_++) {
                is_137_[i_139_] = i_138_;
                if ((0x3 & random.nextInt()) == 0) i_138_++;
            }
            int i_140_ = i_133_;
            int i_141_ = metrics.maxAscent + i_130_;
            int i_142_ = -1;
            if (i_125_ == 1) i_141_ += (-metrics.maxAscent + i_127_ + -metrics.descent) / 2;
            else if (i_125_ == 2) i_141_ = -metrics.descent + (i_127_ + i_130_);
            if (i_132_ != -33) method2578('\ufffe', 83, -110, 26, true, null, 113, 97);
            if (i_129_ == 1) {
                i_142_ = metrics.stringWidth(true, string) + i_138_;
                i_140_ += (i + -i_142_) / 2;
            } else if (i_129_ == 2) {
                i_142_ = metrics.stringWidth(true, string) - -i_138_;
                i_140_ += -i_142_ + i;
            }
            method2566(class105s, null, i_140_, is, is_137_, i_141_, string, 174);
            if (is_134_ != null) {
                if (i_142_ == -1) i_142_ = metrics.stringWidth(true, string) - -i_138_;
                is_134_[2] = i_142_;
                is_134_[3] = (metrics.descent + metrics.maxAscent);
                is_134_[0] = i_140_;
                is_134_[1] = -metrics.maxAscent + i_141_;
            }
            return i_138_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("da.P(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (class105s != null ? "{...}" : "null") + ',' + i_125_ + ',' + i_126_ + ',' + i_127_ + ',' + i_128_ + ',' + (random != null ? "{...}" : "null") + ',' + i_129_ + ',' + i_130_ + ',' + i_131_ + ',' + i_132_ + ',' + i_133_ + ',' + (string != null ? "{...}" : "null") + ',' + (is_134_ != null ? "{...}" : "null") + ')'));
        }
    }
}
