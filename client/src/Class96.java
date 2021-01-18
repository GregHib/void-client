/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Method;

final class Class96 {
    static final ha method870(int i, int i_0_, d var_d, Class45 class45, Canvas canvas) {
        if (i_0_ != 18993) return null;
        ha var_ha;
        try {
            if (!Class9.method215(27165)) throw new RuntimeException("");
            if (!Class348_Sub40_Sub19.method3098(-30282, "jagdx")) throw new RuntimeException("");
            Method method = (Class378.class.getDeclaredMethod("createToolkit", Canvas.class, d.class, Class45.class, Integer.class));
            var_ha = (ha) method.invoke(null, new Object[]{canvas, var_d, class45, new Integer(i)});
        } catch (Throwable throwable) {
            throw new RuntimeException("");
        }
        return var_ha;
    }
}
