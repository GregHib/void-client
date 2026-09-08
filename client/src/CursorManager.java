/* CursorManager - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class165` (JODE-obfuscated).
 * Custom cursor manager. Builds BufferedImage-based cursors (setBlankCursor/1282) and installs them on a Component via createCustomCursor; also a blank 1x1 cursor.
 */

import java.awt.*;
import java.awt.image.BufferedImage;

final class CursorManager {
    /** AWT {@link Robot} for {@link #setCursorPos}. */
    private final Robot robot;
    /** Component currently showing the 1×1 blank cursor, or null. */
    private Component blankCursorTarget;

    final void setCursorPos(int i, int i_0_) {
        robot.mouseMove(i, i_0_);
    }

    final void setBlankCursor(Component component, boolean bool) {
        if (bool) component = null;
        else if (component == null) throw new NullPointerException();
        if (component != blankCursorTarget) {
            if (null != blankCursorTarget) {
                blankCursorTarget.setCursor(null);
                blankCursorTarget = null;
            }
            if (null != component) {
                component.setCursor(component.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
                blankCursorTarget = component;
            }
        }
    }

    final void setCustomCursor(Component component, int[] is, int i, int i_1_, Point point) {
        if (is != null) {
            BufferedImage bufferedimage = new BufferedImage(i, i_1_, 2);
            bufferedimage.setRGB(0, 0, i, i_1_, is, 0, i);
            component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
        } else component.setCursor(null);
    }

    CursorManager() throws Exception {
        robot = new Robot();
    }
}
