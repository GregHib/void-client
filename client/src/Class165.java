/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.BufferedImage;

final class Class165 {
    private final Robot aRobot2176;
    private Component aComponent2177;

    final void method1280(int i, int i_0_) {
        aRobot2176.mouseMove(i, i_0_);
    }

    final void method1281(Component component, boolean bool) {
        if (bool)
            component = null;
        else if (component == null)
            throw new NullPointerException();
        if (component != aComponent2177) {
            if (null != aComponent2177) {
                aComponent2177.setCursor(null);
                aComponent2177 = null;
            }
            if (null != component) {
                component.setCursor(component.getToolkit().createCustomCursor
                        (new BufferedImage(1, 1, 2),
                                new Point(0, 0), null));
                aComponent2177 = component;
            }
        }
    }

    final void method1282(Component component, int[] is, int i, int i_1_,
                          Point point) {
        if (is != null) {
            BufferedImage bufferedimage = new BufferedImage(i, i_1_, 2);
            bufferedimage.setRGB(0, 0, i, i_1_, is, 0, i);
            component.setCursor
                    (component.getToolkit().createCustomCursor(bufferedimage,
                            point, null));
        } else
            component.setCursor(null);
    }

    Class165() throws Exception {
        aRobot2176 = new Robot();
    }
}
