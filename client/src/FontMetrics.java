/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class FontMetrics {
    static int anInt1978;
    private byte[][] kerningAdjustments;
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

    final String truncateString(Sprite[] icons, int maximumWidth, String input, byte i_0_) {
        try {
            anInt1989++;
            if (maximumWidth >= textWidth(input, icons, false)) return input;
            maximumWidth -= textWidth("...", null, false);
            int tagStart = -1;
            if (i_0_ < 54) aClass351_1987 = null;
            int previous = -1;
            int totalWidth = 0;
            int length = input.length();
            String prefix = "";
            for (int index = 0; length > index; index++) {
                char c = input.charAt(index);
                if (c == 60) tagStart = index;
                else {
                    if (c == 62 && tagStart != -1) {
                        String tag = input.substring(tagStart - -1, index);
                        tagStart = -1;
                        if (tag.equals("lt")) {
                            c = '<';
                        } else if (tag.equals("gt")) {
                            c = '>';
                        } else if (tag.equals("nbsp")) c = '\u00a0';
                        else if (tag.equals("shy")) {
                            c = '\u00ad';
                        } else if (tag.equals("times")) c = '\u00d7';
                        else if (tag.equals("euro")) {
                            c = '\u20ac';
                        } else if (tag.equals("copy")) {
                            c = '\u00a9';
                        } else if (tag.equals("reg")) {
                            c = '\u00ae';
                        } else {
                            if (tag.startsWith("img=") && icons != null) {
                                try {
                                    int id = (Class348_Sub41.parseInt(true, (tag.substring(4))));
                                    previous = -1;
                                    totalWidth += (icons[id].scaleWidth());
                                    if (totalWidth > maximumWidth) return (prefix + "...");
                                    prefix = (input.substring(0, index - -1));
                                } catch (Exception exception) {
                                    /* empty */
                                }
                            }
                            continue;
                        }
                    }
                    if (tagStart == -1) {
                        totalWidth += 0xff & (glyphWidths[Class354.charToByte(c, false) & 0xff]);
                        if (kerningAdjustments != null && previous != -1) {
                            totalWidth += kerningAdjustments[previous][c];
                        }
                        previous = c;
                        int total = totalWidth;
                        if (kerningAdjustments != null) {
                            total += kerningAdjustments[c][46];
                        }
                        if (total > maximumWidth) {
                            return prefix + "...";
                        }
                        prefix = input.substring(0, index + 1);
                    }
                }
            }
            return input;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.I(" + (icons != null ? "{...}" : "null") + ',' + maximumWidth + ',' + (input != null ? "{...}" : "null") + ',' + i_0_ + ')'));
        }
    }

    final int kerning(int first, byte i_10_, char second) {
        if (i_10_ > -47) aClass351_1987 = null;
        anInt1985++;
        if (kerningAdjustments != null) return kerningAdjustments[first][second];
        return 0;
    }

    final int width(boolean bool, String string) {
        anInt1981++;
        if (!bool) truncateString(null, 54, null, (byte) 21);
        return textWidth(string, null, false);
    }

    final int glyphWidth(byte i, int glyph) {
        anInt1982++;
        if (i != -48) kerningAdjustments = null;
        return glyphWidths[glyph] & 0xff;
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

    final int textWidth(String text, Sprite[] icons, boolean bool) {
        try {
            if (bool) this.bottomPadding = 95;
            anInt1980++;
            if (text == null) return 0;
            int tagStart = -1;
            int lastChar = -1;
            int totalWidth = 0;
            int length = text.length();
            for (int index = 0; index < length; index++) {
                char current = text.charAt(index);
                if (current == 60) {
                    tagStart = index;
                } else {
                    if (current == 62 && tagStart != -1) {
                        String tag = text.substring(1 + tagStart, index);
                        tagStart = -1;
                        if (tag.equals("lt")) {
                            current = '<';
                        } else if (tag.equals("gt")) {
                            current = '>';
                        } else if (tag.equals("nbsp")) {
                            current = '\u00a0';
                        } else if (tag.equals("shy")) {
                            current = '\u00ad';
                        } else if (tag.equals("times")) {
                            current = '\u00d7';
                        } else if (tag.equals("euro")) {
                            current = '\u20ac';
                        } else if (tag.equals("copy")) {
                            current = '\u00a9';
                        } else if (tag.equals("reg")) {
                            current = '\u00ae';
                        } else {
                            if (tag.startsWith("img=") && icons != null) {
                                try {
                                    int id = (Class348_Sub41.parseInt(true, (tag.substring(4))));
                                    lastChar = -1;
                                    totalWidth += (icons[id].scaleWidth());
                                } catch (Exception exception) {
                                    /* empty */
                                }
                            }
                            continue;
                        }
                    }
                    if (tagStart == -1) {
                        totalWidth += (glyphWidths[Class354.charToByte(current, false) & 0xff]) & 0xff;
                        if (kerningAdjustments != null && lastChar != -1) {
                            totalWidth += kerningAdjustments[lastChar][current];
                        }
                        lastChar = current;
                    }
                }
            }
            return totalWidth;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.F(" + (text != null ? "{...}" : "null") + ',' + (icons != null ? "{...}" : "null") + ',' + bool + ')'));
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

    final int splitLines(String input, int[] widths, String[] output, byte i, Sprite[] icons) {
        try {
            anInt1978++;
            if (i != 87) splitLines(null, 80, null, 55);
            if (input == null) return 0;
            int totalWidth = 0;
            int lineStart = 0;
            int lineLength = -1;
            int wordWidth = 0;
            int wordStart = 0;
            int tagStart = -1;
            int lastChar = -1;
            int lineCount = 0;
            int length = input.length();
            for (int index = 0; length > index; index++) {
                int current = Class354.charToByte(input.charAt(index), false) & 0xff;
                int extraWidth = 0;
                if (current == 60) {
                    tagStart = index;
                } else {
                    int currentWidth;
                    if (tagStart == -1) {
                        extraWidth += glyphWidth((byte) -48, current);
                        currentWidth = index;
                        if (kerningAdjustments != null && lastChar != -1) extraWidth += kerningAdjustments[lastChar][current];
                        lastChar = current;
                    } else {
                        if (current != 62) continue;
                        currentWidth = tagStart;
                        String tag = input.substring(1 + tagStart, index);
                        tagStart = -1;
                        if (tag.equals("br")) {
                            output[lineCount] = input.substring(lineStart, index - -1);
                            lineCount++;
                            if (output.length <= lineCount) return 0;
                            lineStart = 1 + index;
                            lastChar = -1;
                            totalWidth = 0;
                            lineLength = -1;
                            continue;
                        }
                        if (tag.equals("lt")) {
                            extraWidth += glyphWidth((byte) -48, 60);
                            if (kerningAdjustments != null && lastChar != -1) extraWidth += kerningAdjustments[lastChar][60];
                            lastChar = 60;
                        } else if (tag.equals("gt")) {
                            extraWidth += glyphWidth((byte) -48, 62);
                            if (kerningAdjustments != null && lastChar != -1) extraWidth += kerningAdjustments[lastChar][62];
                            lastChar = 62;
                        } else if (tag.equals("nbsp")) {
                            extraWidth += glyphWidth((byte) -48, 160);
                            if (kerningAdjustments != null && lastChar != -1) extraWidth += kerningAdjustments[lastChar][160];
                            lastChar = 160;
                        } else if (tag.equals("shy")) {
                            extraWidth += glyphWidth((byte) -48, 173);
                            if (kerningAdjustments != null && lastChar != -1) extraWidth += kerningAdjustments[lastChar][173];
                            lastChar = 173;
                        } else if (tag.equals("times")) {
                            extraWidth += glyphWidth((byte) -48, 215);
                            if (kerningAdjustments != null && lastChar != -1) extraWidth += kerningAdjustments[lastChar][215];
                            lastChar = 215;
                        } else if (tag.equals("euro")) {
                            extraWidth += glyphWidth((byte) -48, 8364);
                            if (kerningAdjustments != null && lastChar != -1) extraWidth += (kerningAdjustments[lastChar][8364]);
                            lastChar = 8364;
                        } else if (tag.equals("copy")) {
                            extraWidth += glyphWidth((byte) -48, 169);
                            if (kerningAdjustments != null && lastChar != -1) extraWidth += (kerningAdjustments[lastChar][169]);
                            lastChar = 169;
                        } else if (tag.equals("reg")) {
                            extraWidth += glyphWidth((byte) -48, 174);
                            if (kerningAdjustments != null && lastChar != -1) extraWidth += (kerningAdjustments[lastChar][174]);
                            lastChar = 174;
                        } else if (tag.startsWith("img=") && icons != null) {
                            try {
                                int id = (Class348_Sub41.parseInt(true, (tag.substring(4))));
                                lastChar = -1;
                                extraWidth += icons[id].scaleWidth();
                            } catch (Exception exception) {
                                /* empty */
                            }
                        }
                        current = -1;
                    }
                    if (extraWidth > 0) {
                        totalWidth += extraWidth;
                        if (widths != null) {
                            if (current == 32) {
                                wordStart = 1;
                                wordWidth = totalWidth;
                                lineLength = index;
                            }
                            if (totalWidth > widths[widths.length > lineCount ? lineCount : widths.length + -1]) {
                                if (lineLength >= 0) {
                                    output[lineCount] = input.substring(lineStart, -wordStart + 1 + lineLength);
                                    if (output.length <= ++lineCount) return 0;
                                    lineStart = 1 + lineLength;
                                    lastChar = -1;
                                    lineLength = -1;
                                    totalWidth -= wordWidth;
                                } else {
                                    output[lineCount] = input.substring(lineStart, currentWidth);
                                    lineCount++;
                                    if (lineCount >= output.length) return 0;
                                    lineStart = currentWidth;
                                    lastChar = -1;
                                    lineLength = -1;
                                    totalWidth = extraWidth;
                                }
                            }
                            if (current == 45) {
                                wordWidth = totalWidth;
                                lineLength = index;
                                wordStart = 0;
                            }
                        }
                    }
                }
            }
            if (lineStart < input.length()) {
                output[lineCount] = input.substring(lineStart);
                lineCount++;
            }
            return lineCount;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oea.J(" + (input != null ? "{...}" : "null") + ',' + (widths != null ? "{...}" : "null") + ',' + (output != null ? "{...}" : "null") + ',' + i + ',' + (icons != null ? "{...}" : "null") + ')'));
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
        boolean kerning = buffer.readUnsignedByte(255) == 1;
        glyphWidths = new byte[256];
        buffer.method3389(2147483647, 0, 256, glyphWidths);
        if (kerning) {
            int[] rightOffsets = new int[256];
            int[] leftOffsets = new int[256];
            for (int index = 0; index < 256; index++)
                rightOffsets[index] = buffer.readUnsignedByte(255);
            for (int index = 0; index < 256; index++)
                leftOffsets[index] = buffer.readUnsignedByte(255);
            byte[][] rightGlyphData = new byte[256][];
            for (int i = 0; i < 256; i++) {
                rightGlyphData[i] = new byte[rightOffsets[i]];
                byte total = 0;
                for (int j = 0; (rightGlyphData[i].length > j); j++) {
                    total += buffer.readByte(-83);
                    rightGlyphData[i][j] = total;
                }
            }
            byte[][] leftGlyphData = new byte[256][];
            for (int i = 0; i < 256; i++) {
                leftGlyphData[i] = new byte[rightOffsets[i]];
                byte total = 0;
                for (int j = 0; (leftGlyphData[i].length > j); j++) {
                    total += buffer.readByte(-115);
                    leftGlyphData[i][j] = total;
                }
            }
            this.kerningAdjustments = new byte[256][256];
            for (int left = 0; left < 256; left++) {
                if (left != 32 && left != 160) {
                    for (int right = 0; right < 256; right++) {
                        if (right != 32 && right != 160) this.kerningAdjustments[left][right] = (byte) (Class239_Sub8.calculateKerning(this.glyphWidths, -34, right, left, rightGlyphData, leftGlyphData, leftOffsets, rightOffsets));
                    }
                }
            }
            this.verticalSpacing = leftOffsets[32] + rightOffsets[32];
        } else this.verticalSpacing = buffer.readUnsignedByte(255);
        buffer.readUnsignedByte(255);
        buffer.readUnsignedByte(255);
        this.topPadding = buffer.readUnsignedByte(255);
        this.bottomPadding = buffer.readUnsignedByte(255);
    }
}
