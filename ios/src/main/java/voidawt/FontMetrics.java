package voidawt;

import org.robovm.apple.coretext.CTLine;
import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UIFont;

/**
 * AWT {@code FontMetrics} shim backed by {@link UIFont} / CoreText.
 * <p>
 * Used when the client bakes per-glyph images in {@code FontGlyphCache}
 * ({@code charWidth}, ascent, descent) and anywhere else that sizes text
 * before {@link Graphics#drawString}. Must match the same face that
 * {@code drawString} rasterizes, or glyph crops come out wrong.
 */
public class FontMetrics {
    private final Font font;
    private final UIFont uiFont;

    FontMetrics(Font font) {
        this.font = font == null ? new Font("Helvetica", Font.PLAIN, 12) : font;
        this.uiFont = this.font.uiFont();
    }

    public int charWidth(char c) {
        return stringWidth(String.valueOf(c));
    }

    /** Advance width via {@link CTLine} (same path as {@code drawString}). */
    public int stringWidth(String s) {
        if (s == null || s.length() == 0) {
            return 1;
        }
        CTLine line = CTLine.create(font.attributed(s, UIColor.white()));
        return Math.max(1, (int) Math.ceil(line.getWidth()));
    }

    public int getAscent() {
        // Match Graphics.drawString: max(UIFont ascender, CTLine ascent) so
        // FontGlyphCache image height / baseline crop the same pixels we bake.
        CTLine line = CTLine.create(font.attributed("Hg", UIColor.white()));
        double ascent = Math.max(uiFont.getAscender(), line.getAscent());
        return Math.max(1, (int) Math.ceil(ascent));
    }

    public int getMaxAscent() {
        return getAscent();
    }

    public int getDescent() {
        // UIKit reports descender as a negative offset below the baseline.
        CTLine line = CTLine.create(font.attributed("Hg", UIColor.white()));
        double descent = Math.max(-uiFont.getDescender(), line.getDescent());
        return Math.max(1, (int) Math.ceil(descent));
    }

    public int getMaxDescent() {
        return getDescent();
    }

    public int getHeight() {
        return Math.max(getAscent() + getDescent(), (int) Math.ceil(uiFont.getLineHeight()));
    }
}
