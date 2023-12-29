/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class FontMetrics {
    static int anInt1978;
    private byte[][] kerning;
    static int anInt1980;
    static int anInt1981;
    static int anInt1982;
    static int anInt1983;
    static int anInt1984;
    static int anInt1985;
    private final byte[] glyphWidths;
    static Class351 aClass351_1987 = new Class351(66, -1);
    int topPadding;
    static int anInt1989;
    static int anInt1990;
    static int anInt1991;
    int verticalSpacing;
    int bottomPadding;

    public static void method1180(byte i) {
        if (i != -76) method1180((byte) 27);
        aClass351_1987 = null;
    }

    final String fitText(Sprite[] icons, int maximumWidth, String string, byte i_0_) {
        try {
            anInt1989++;
            if (maximumWidth >= textWidth(string, icons, false)) return string;
            maximumWidth -= textWidth("...", null, false);
            int escapeStart = -1;
            if (i_0_ < 54) aClass351_1987 = null;
            int previous = -1;
            int width = 0;
            int i_4_ = string.length();
            String prefix = "";
            for (int i_6_ = 0; i_4_ > i_6_; i_6_++) {
                char c = string.charAt(i_6_);
                if (c == 60) escapeStart = i_6_;
                else {
                    if (c == 62 && escapeStart != -1) {
                        String tag = string.substring(escapeStart - -1, i_6_);
                        escapeStart = -1;
                        if (!tag.equals("lt")) {
                            if (!tag.equals("gt")) {
                                if (tag.equals("nbsp")) c = '\u00a0';
                                else if (!tag.equals("shy")) {
                                    if (tag.equals("times")) c = '\u00d7';
                                    else if (!tag.equals("euro")) {
                                        if (!tag.equals("copy")) {
                                            if (!tag.equals("reg")) {
                                                if (tag.startsWith("img=") && icons != null) {
                                                    try {
                                                        int id = (Class348_Sub41.parseInt(true, (tag.substring(4))));
                                                        previous = -1;
                                                        width += (icons[id].scaleWidth());
                                                        if (width > maximumWidth) return (prefix + "...");
                                                        prefix = (string.substring(0, i_6_ - -1));
                                                    } catch (Exception exception) {
                                                        /* empty */
                                                    }
                                                }
                                                continue;
                                            }
                                            c = '\u00ae';
                                        } else c = '\u00a9';
                                    } else c = '\u20ac';
                                } else c = '\u00ad';
                            } else c = '>';
                        } else c = '<';
                    }
                    if (escapeStart == -1) {
                        width += 0xff & (glyphWidths[Class354.charToByte(c, false) & 0xff]);
                        if (kerning != null && previous != -1) width += kerning[previous][c];
                        previous = c;
                        int total = width;
                        if (kerning != null) total += kerning[c][46];
                        if (total > maximumWidth) return prefix + "...";
                        prefix = string.substring(0, i_6_ + 1);
                    }
                }
            }
            return string;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.I(" + (icons != null ? "{...}" : "null") + ',' + maximumWidth + ',' + (string != null ? "{...}" : "null") + ',' + i_0_ + ')'));
        }
    }

    final int kerning(int first, byte i_10_, char second) {
        if (i_10_ > -47) aClass351_1987 = null;
        anInt1985++;
        if (kerning != null) return kerning[first][second];
        return 0;
    }

    final int width(boolean singleLine, String string) {
        anInt1981++;
        if (!singleLine) fitText(null, 54, null, (byte) 21);
        return textWidth(string, null, false);
    }

    final int glyphWidth(byte i, int glyph) {
        anInt1982++;
        if (i != -48) kerning = null;
        return 0xff & glyphWidths[glyph];
    }

    final int method1185(Sprite[] icons, int i, int spacing, int lineWidth, String string) {
        try {
            anInt1990++;
            if (spacing == i) spacing = this.verticalSpacing;
            int width = splitLines(string, new int[]{lineWidth}, Class186.aStringArray2494, (byte) 87, icons);
            int i_15_ = (-1 + width) * spacing;
            return (this.topPadding + (i_15_ + this.bottomPadding));
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.A(" + (icons != null ? "{...}" : "null") + ',' + i + ',' + spacing + ',' + lineWidth + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    final int textWidth(String string, Sprite[] icons, boolean bool) {
        try {
            if (bool != false) this.bottomPadding = 95;
            anInt1980++;
            if (string == null) return 0;
            int i = -1;
            int i_16_ = -1;
            int width = 0;
            int i_18_ = string.length();
            for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
                char c = string.charAt(i_19_);
                if (c == 60) i = i_19_;
                else {
                    if (c == 62 && i != -1) {
                        String tag = string.substring(1 + i, i_19_);
                        i = -1;
                        if (tag.equals("lt")) c = '<';
                        else if (!tag.equals("gt")) {
                            if (!tag.equals("nbsp")) {
                                if (tag.equals("shy")) c = '\u00ad';
                                else if (!tag.equals("times")) {
                                    if (!tag.equals("euro")) {
                                        if (!tag.equals("copy")) {
                                            if (tag.equals("reg")) c = '\u00ae';
                                            else {
                                                if (tag.startsWith("img=") && icons != null) {
                                                    try {
                                                        int id = (Class348_Sub41.parseInt(true, (tag.substring(4))));
                                                        i_16_ = -1;
                                                        width += (icons[id].scaleWidth());
                                                    } catch (Exception exception) {
                                                        /* empty */
                                                    }
                                                }
                                                continue;
                                            }
                                        } else c = '\u00a9';
                                    } else c = '\u20ac';
                                } else c = '\u00d7';
                            } else c = '\u00a0';
                        } else c = '>';
                    }
                    if (i == -1) {
                        width += 0xff & (glyphWidths[Class354.charToByte(c, false) & 0xff]);
                        if (kerning != null && i_16_ != -1) width += kerning[i_16_][c];
                        i_16_ = c;
                    }
                }
            }
            return width;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.F(" + (string != null ? "{...}" : "null") + ',' + (icons != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    final int lineWidth(String string, boolean removePadding, int width, Sprite[] icons) {
        try {
            anInt1984++;
            int count = splitLines(string, new int[]{width}, Class186.aStringArray2494, (byte) 87, icons);
            int largest = 0;
            if (removePadding) this.topPadding = -58;
            for (int index = 0; count > index; index++) {
                int w = textWidth(Class186.aStringArray2494[index], icons, false);
                if (w > largest) largest = w;
            }
            return largest;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.K(" + (string != null ? "{...}" : "null") + ',' + removePadding + ',' + width + ',' + (icons != null ? "{...}" : "null") + ')'));
        }
    }

    final int splitLines(String string, int[] widths, String[] strings, byte i, Sprite[] icons) {
        try {
            anInt1978++;
            if (i != 87) splitLines(null, 80, null, 55);
            if (string == null) return 0;
            int i_26_ = 0;
            int i_27_ = 0;
            int i_28_ = -1;
            int i_29_ = 0;
            int i_30_ = 0;
            int i_31_ = -1;
            int previous = -1;
            int stringIndex = 0;
            int length = string.length();
            for (int index = 0; length > index; index++) {
                int current = Class354.charToByte(string.charAt(index), false) & 0xff;
                int width = 0;
                if (current == 60) i_31_ = index;
                else {
                    int i_38_;
                    if (i_31_ == -1) {
                        width += glyphWidth((byte) -48, current);
                        i_38_ = index;
                        if (kerning != null && previous != -1) width += kerning[previous][current];
                        previous = current;
                    } else {
                        if (current != 62) continue;
                        i_38_ = i_31_;
                        String tag = string.substring(1 + i_31_, index);
                        i_31_ = -1;
                        if (tag.equals("br")) {
                            strings[stringIndex] = string.substring(i_27_, index - -1);
                            stringIndex++;
                            if (strings.length <= stringIndex) return 0;
                            i_27_ = 1 + index;
                            previous = -1;
                            i_26_ = 0;
                            i_28_ = -1;
                            continue;
                        }
                        if (tag.equals("lt")) {
                            width += glyphWidth((byte) -48, 60);
                            if (kerning != null && previous != -1) width += kerning[previous][60];
                            previous = 60;
                        } else if (tag.equals("gt")) {
                            width += glyphWidth((byte) -48, 62);
                            if (kerning != null && previous != -1) width += kerning[previous][62];
                            previous = 62;
                        } else if (tag.equals("nbsp")) {
                            width += glyphWidth((byte) -48, 160);
                            if (kerning != null && previous != -1) width += kerning[previous][160];
                            previous = 160;
                        } else if (tag.equals("shy")) {
                            width += glyphWidth((byte) -48, 173);
                            if (kerning != null && previous != -1) width += kerning[previous][173];
                            previous = 173;
                        } else if (tag.equals("times")) {
                            width += glyphWidth((byte) -48, 215);
                            if (kerning != null && previous != -1) width += kerning[previous][215];
                            previous = 215;
                        } else if (tag.equals("euro")) {
                            width += glyphWidth((byte) -48, 8364);
                            if (kerning != null && previous != -1) width += (kerning[previous][8364]);
                            previous = 8364;
                        } else if (tag.equals("copy")) {
                            width += glyphWidth((byte) -48, 169);
                            if (kerning != null && previous != -1) width += (kerning[previous][169]);
                            previous = 169;
                        } else if (tag.equals("reg")) {
                            width += glyphWidth((byte) -48, 174);
                            if (kerning != null && previous != -1) width += (kerning[previous][174]);
                            previous = 174;
                        } else if (tag.startsWith("img=") && icons != null) {
                            try {
                                int id = (Class348_Sub41.parseInt(true, (tag.substring(4))));
                                previous = -1;
                                width += icons[id].scaleWidth();
                            } catch (Exception exception) {
                                /* empty */
                            }
                        }
                        current = -1;
                    }
                    if (width > 0) {
                        i_26_ += width;
                        if (widths != null) {
                            if (current == 32) {
                                i_30_ = 1;
                                i_29_ = i_26_;
                                i_28_ = index;
                            }
                            if (i_26_ > widths[widths.length > stringIndex ? stringIndex : widths.length + -1]) {
                                if (i_28_ >= 0) {
                                    strings[stringIndex] = string.substring(i_27_, -i_30_ + 1 + i_28_);
                                    if (strings.length <= ++stringIndex) return 0;
                                    i_27_ = 1 + i_28_;
                                    previous = -1;
                                    i_28_ = -1;
                                    i_26_ -= i_29_;
                                } else {
                                    strings[stringIndex] = string.substring(i_27_, i_38_);
                                    stringIndex++;
                                    if (stringIndex >= strings.length) return 0;
                                    i_27_ = i_38_;
                                    previous = -1;
                                    i_28_ = -1;
                                    i_26_ = width;
                                }
                            }
                            if (current == 45) {
                                i_29_ = i_26_;
                                i_28_ = index;
                                i_30_ = 0;
                            }
                        }
                    }
                }
            }
            if (i_27_ < string.length()) {
                strings[stringIndex] = string.substring(i_27_);
                stringIndex++;
            }
            return stringIndex;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.J(" + (string != null ? "{...}" : "null") + ',' + (widths != null ? "{...}" : "null") + ',' + (strings != null ? "{...}" : "null") + ',' + i + ',' + (icons != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method1189(int i, int i_41_) {
        anInt1991++;
        if (i != -1) aClass351_1987 = null;
        Class348_Sub15 class348_sub15 = ((Class348_Sub15) Class27.aClass356_389.method3480(i_41_, -6008));
        if (class348_sub15 != null) {
            class348_sub15.aBoolean6781 = !class348_sub15.aBoolean6781;
            class348_sub15.aClass55_Sub1_6768.method514((byte) 116, class348_sub15.aBoolean6781);
        }
    }

    final int splitLines(Sprite[] icons, int i, String string, int width) {
        try {
            anInt1983++;
            if (i != 1) this.verticalSpacing = -13;
            return splitLines(string, new int[]{width}, Class186.aStringArray2494, (byte) 87, icons);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.B(" + (icons != null ? "{...}" : "null") + ',' + i + ',' + (string != null ? "{...}" : "null") + ',' + width + ')'));
        }
    }

    FontMetrics(byte[] data) {
        Class348_Sub49 buffer = new Class348_Sub49(data);
        int end = buffer.readUnsignedByte(255);
        if (end != 0) throw new RuntimeException("");
        boolean variableWidth = buffer.readUnsignedByte(255) == 1;
        glyphWidths = new byte[256];
        buffer.method3389(2147483647, 0, 256, glyphWidths);
        if (variableWidth) {
            int[] is_43_ = new int[256];
            int[] is_44_ = new int[256];
            for (int i_45_ = 0; i_45_ < 256; i_45_++)
                is_43_[i_45_] = buffer.readUnsignedByte(255);
            for (int i_46_ = 0; i_46_ < 256; i_46_++)
                is_44_[i_46_] = buffer.readUnsignedByte(255);
            byte[][] is_47_ = new byte[256][];
            for (int i_48_ = 0; i_48_ < 256; i_48_++) {
                is_47_[i_48_] = new byte[is_43_[i_48_]];
                byte i_49_ = 0;
                for (int i_50_ = 0; (is_47_[i_48_].length > i_50_); i_50_++) {
                    i_49_ += buffer.readByte(-83);
                    is_47_[i_48_][i_50_] = i_49_;
                }
            }
            byte[][] is_51_ = new byte[256][];
            for (int i_52_ = 0; i_52_ < 256; i_52_++) {
                is_51_[i_52_] = new byte[is_43_[i_52_]];
                byte i_53_ = 0;
                for (int i_54_ = 0; (is_51_[i_52_].length > i_54_); i_54_++) {
                    i_53_ += buffer.readByte(-115);
                    is_51_[i_52_][i_54_] = i_53_;
                }
            }
            kerning = new byte[256][256];
            for (int i_55_ = 0; i_55_ < 256; i_55_++) {
                if (i_55_ != 32 && i_55_ != 160) {
                    for (int i_56_ = 0; i_56_ < 256; i_56_++) {
                        if (i_56_ != 32 && i_56_ != 160) kerning[i_55_][i_56_] = (byte) (Class239_Sub8.calculateKerning(glyphWidths, -34, i_56_, i_55_, is_47_, is_51_, is_44_, is_43_));
                    }
                }
            }
            this.verticalSpacing = is_44_[32] - -is_43_[32];
        } else this.verticalSpacing = buffer.readUnsignedByte(255);
        buffer.readUnsignedByte(255);
        buffer.readUnsignedByte(255);
        this.topPadding = buffer.readUnsignedByte(255);
        this.bottomPadding = buffer.readUnsignedByte(255);
    }
}
