package voidawt;

import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * AWT {@code Font} shim for Android.
 * Holds a {@link Paint} with the resolved {@link Typeface} so
 * {@link Graphics#drawString} / {@link FontMetrics} share one face
 * (splash {@code HelveticaFont}, glyph bake {@code FontGlyphCache}).
 */
public class Font {
    public static final int PLAIN = 0;
    public static final int BOLD = 1;
    public static final int ITALIC = 2;

    final String name;
    final int style;
    final int size;
    /** Shared by drawString + FontMetrics; anti-aliased like desktop AWT defaults. */
    final Paint paint;

    public Font(String name, int style, int size) {
        this.name = name;
        this.style = style;
        this.size = size;
        this.paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        int tf = Typeface.NORMAL;
        if ((style & BOLD) != 0 && (style & ITALIC) != 0) {
            tf = Typeface.BOLD_ITALIC;
        } else if ((style & BOLD) != 0) {
            tf = Typeface.BOLD;
        } else if ((style & ITALIC) != 0) {
            tf = Typeface.ITALIC;
        }
        // Helvetica → system fallback (usually Roboto) when the face is absent.
        paint.setTypeface(Typeface.create(name, tf));
        paint.setTextSize(size);
    }

    public int getSize() {
        return size;
    }

    public int getStyle() {
        return style;
    }
}
