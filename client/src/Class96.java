/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Method;

final class Class96 {
    static final ha method870(int i, int i_0_, d var_d, Class45 class45,
                              Canvas canvas) {
        if (i_0_ != 18993)
            return null;
        ha var_ha;
        try {
            if (!Class9.method215(27165))
                throw new RuntimeException("");
            if (!Class348_Sub40_Sub19.method3098(-30282, "jagdx"))
                throw new RuntimeException("");
            Class var_class = Class.forName("Class378");
            Method method
                    = (var_class.getDeclaredMethod
                    ("createToolkit",
                            Class.forName("java.awt.Canvas"),
                            Class.forName("d"), Class.forName("Class45"),
                            Class.forName("java.lang.Integer")));
            var_ha = (ha) method.invoke(null,
                    new Object[]{canvas, var_d, class45,
                            new Integer(i)});
        } catch (Throwable throwable) {
            throw new RuntimeException("");
        }
        return var_ha;
    }
}
