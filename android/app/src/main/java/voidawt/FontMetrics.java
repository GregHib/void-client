package voidawt;

import android.graphics.Paint;

/**
 * AWT {@code FontMetrics} over the Font's {@link Paint}.
 * Must match {@link Graphics#drawString} metrics so {@code FontGlyphCache} glyph
 * crops (ascent/width) line up with the baked pixels.
 */
public class FontMetrics {
    private final Paint paint;

    FontMetrics(Font font) {
        this.paint = font.paint;
    }

    public int charWidth(char c) {
        return Math.max(1, Math.round(paint.measureText(String.valueOf(c))));
    }

    public int stringWidth(String s) {
        return Math.max(1, Math.round(paint.measureText(s == null ? "" : s)));
    }

    public int getAscent() {
        return Math.round(-paint.ascent());
    }

    public int getMaxAscent() {
        return getAscent();
    }

    public int getDescent() {
        return Math.round(paint.descent());
    }

    public int getMaxDescent() {
        return getDescent();
    }

    public int getHeight() {
        return getAscent() + getDescent() + 1;
    }
}
