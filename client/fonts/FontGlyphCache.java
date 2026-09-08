/* FontGlyphCache - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from {@code Class323} (JODE-obfuscated).
 * <p>
 * Helvetica glyph texture cache used by the world map (and other AWT-backed UI
 * labels). At map-load ({@code StaticElementRenderer} state 70–100) the client
 * bakes eight point sizes (11…30) via {@link java.awt.Graphics#drawString} into
 * toolkit sprites, then draws map labels by blitting those sprites.
 * <p>
 * Mobile hosts replace AWT with {@code voidawt}: iOS must rasterize through
 * {@code UIGraphics} (not raw CoreText CTM) or baked glyphs come out upside-down /
 * clipped — see {@code ios/.../voidawt/Graphics#drawString}.
 * <p>
 * Selected at draw time by {@link DisplayModeManagerContainer341#selectMapLabelFont}
 * from map zoom ({@code DisplayModeManagerContainer229.aFloat1247}) + label tier.
 */

import java.awt.*;
import java.awt.image.PixelGrabber;

final class FontGlyphCache {
    /**
     * JODE-era flag: when bold bake is requested and this is true, ctor retries
     * plain then faux-bold (double-draw). Never set {@code true} in this dump —
     * bold+widen path is effectively dead; kept for parity with original control flow.
     */
    private boolean boldBakeFailed = false;

    /**
     * Printable charset baked into sprites (Latin-1 accents included).
     * Index in this string = glyph slot; unknown codepoints map to space (74).
     */
    private static final String CHARSET =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7";

    /** Length of {@link #CHARSET} — how many glyphs we bake. */
    private static final int CHARSET_LENGTH = CHARSET.length();

    /** Per-glyph advance widths (AWT {@code charWidth}, pre-widen). */
    private final int[] glyphAdvances;

    /** AWT {@code FontMetrics.getHeight()} captured during bake. */
    private int fontHeight;

    /**
     * Distance from draw baseline to first non-empty pixel row of a baked glyph
     * ({@code maxAscent - topInkRow}). Used to vertically align {@link #drawCenteredString}.
     */
    private int baselineAscent;

    /** Toolkit sprites for each charset slot ({@link Component24} = sprite). */
    private final Component24[] glyphSprites;

    /** {@code char → charset index}; unmapped chars → 74 (space in {@link #CHARSET}). */
    private static int[] charToGlyphIndex = new int[256];

    /** Scratch for toolkit clip query {@code GraphicsToolkit.K(int[])}. */
    private final int[] clipBoundsScratch = new int[4];

    /**
     * Rasterize one character into a toolkit sprite.
     * <p>
     * Pipeline: allocate AWT image ({@code charWidth × ascent+descent}) → black
     * fill → white {@code drawString} at baseline {@code maxAscent} → optional
     * +1px faux-bold → {@link PixelGrabber} → zero pure-black RGB → upload via
     * {@code GraphicsToolkit.method3662}.
     *
     * @param glyphIndex slot in {@link #glyphSprites} / {@link #glyphAdvances}
     * @param fauxBold   when true, widen some letters and double-draw at x+1
     */
    private final void bakeGlyph(GraphicsToolkit var_ha, Font font, FontMetrics fontmetrics, char c, int glyphIndex, boolean fauxBold) {
        int bakeWidth = fontmetrics.charWidth(c);
        int advance = bakeWidth;
        if (fauxBold) {
            try {
                if (c == '/') fauxBold = false;
                if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W') bakeWidth++;
            } catch (Exception exception) {
                /* empty */
            }
        }
        int baselineY = fontmetrics.getMaxAscent();
        int imageHeight = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
        int metricsHeight = fontmetrics.getHeight();
        Image image = DisplayModeManagerContainer50.gameCanvas.createImage(bakeWidth, imageHeight);
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, bakeWidth, imageHeight);
        graphics.setColor(Color.white);
        graphics.setFont(font);
        // AWT baseline at maxAscent — voidawt.Graphics.drawString must honour that.
        graphics.drawString(String.valueOf(c), 0, baselineY);
        if (fauxBold) graphics.drawString(String.valueOf(c), 1, baselineY);
        int[] pixels = new int[bakeWidth * imageHeight];
        PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, bakeWidth, imageHeight, pixels, 0, bakeWidth);
        try {
            pixelgrabber.grabPixels();
        } catch (Exception exception) {
            /* empty */
        }
        image.flush();
        Object object = null;
        int topInkRow = 0;
        findTopInk:
        for (int row = 0; row < imageHeight; row++) {
            for (int col = 0; col < bakeWidth; col++) {
                int argb = pixels[col + row * bakeWidth];
                if ((argb & 0xffffff) != 0) {
                    topInkRow = row;
                    break findTopInk;
                }
            }
        }
        // Pure black → fully transparent (keeps AA grey edges).
        for (int i = 0; i < pixels.length; i++) {
            if ((pixels[i] & 0xffffff) == 0) pixels[i] = 0;
        }
        baselineAscent = baselineY - topInkRow;
        fontHeight = metricsHeight;
        glyphAdvances[glyphIndex] = advance;
        glyphSprites[glyphIndex] = var_ha.method3662(bakeWidth, pixels, (byte) 94, 0, bakeWidth, imageHeight);
    }

    /** {@link #baselineAscent} — for vertical layout of multi-line map labels. */
    final int getBaselineAscent() {
        return baselineAscent;
    }

    /**
     * Blit {@code string} left-to-right at ({@code x},{@code y}) using cached glyphs.
     * Optional drop-shadow: black at +1,+1 then coloured glyphs.
     */
    private final void drawStringRaw(GraphicsToolkit var_ha, String string, int[] is, int x, int y, int rgb, boolean shadow) {
        if (rgb == 0) shadow = false;
        rgb |= ~0xffffff;
        for (int i = 0; i < string.length(); i++) {
            int glyph = charToGlyphIndex[string.charAt(i)];
            if (shadow) glyphSprites[glyph].method964(x + 1, y + 1, 0, -16777216, 1);
            glyphSprites[glyph].method964(x, y, 0, rgb, 1);
            x += glyphAdvances[glyph];
        }
    }

    /** Drop static char map (shutdown / toolkit teardown). */
    public static void clearCharsetMap() {
        charToGlyphIndex = null;
    }

    /**
     * Draw {@code string} centered on {@code x}, baseline {@code y}, if it
     * intersects the current toolkit clip. World-map label entry point.
     */
    final void drawCenteredString(GraphicsToolkit var_ha, String string, int x, int y, int rgb, boolean shadow) {
        int halfWidth = measureStringWidth(string) / 2;
        var_ha.K(clipBoundsScratch);
        if (x - halfWidth <= clipBoundsScratch[2] && x + halfWidth >= clipBoundsScratch[0] && y - baselineAscent <= clipBoundsScratch[3] && y + fontHeight >= clipBoundsScratch[1])
            drawStringRaw(var_ha, string, clipBoundsScratch, x - halfWidth, y, rgb, shadow);
    }

    /** Sum of glyph advances for {@code string}. */
    final int measureStringWidth(String string) {
        int width = 0;
        for (int i = 0; i < string.length(); i++) {
            int glyph = charToGlyphIndex[string.charAt(i)];
            width += glyphAdvances[glyph];
        }
        return width;
    }

    /** Line step for multi-line labels ({@code fontHeight - 1}). */
    final int getLineHeight() {
        return fontHeight - 1;
    }

    /**
     * Bake every charset glyph at {@code pointSize} Helvetica.
     *
     * @param bold when true, prefer bold face (faux-bold path gated by {@link #boldBakeFailed})
     */
    FontGlyphCache(GraphicsToolkit var_ha, int pointSize, boolean bold, Component component) {
        boldBakeFailed = false;
        glyphSprites = new Component24[256];
        glyphAdvances = new int[256];
        Font font = new Font("Helvetica", bold ? 1 : 0, pointSize);
        FontMetrics fontmetrics = component.getFontMetrics(font);
        for (int i = 0; i < CHARSET_LENGTH; i++)
            bakeGlyph(var_ha, font, fontmetrics, CHARSET.charAt(i), i, false);
        if (bold && boldBakeFailed) {
            boldBakeFailed = false;
            font = new Font("Helvetica", 0, pointSize);
            fontmetrics = component.getFontMetrics(font);
            for (int i = 0; i < CHARSET_LENGTH; i++)
                bakeGlyph(var_ha, font, fontmetrics, CHARSET.charAt(i), i, false);
            if (!boldBakeFailed) {
                boldBakeFailed = false;
                for (int i = 0; i < CHARSET_LENGTH; i++)
                    bakeGlyph(var_ha, font, fontmetrics, CHARSET.charAt(i), i, true);
            }
        }
    }

    static {
        for (int c = 0; c < 256; c++) {
            int idx = CHARSET.indexOf(c);
            if (idx == -1) idx = 74; // space
            charToGlyphIndex[c] = idx;
        }
    }
}
