/* ToolkitLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class96` (JODE-obfuscated).
 * Toolkit bootstrap/loader. Uses reflection (D3DToolkit.class.getDeclaredMethod("createToolkit", Canvas, d, CacheStore, Integer)) to locate and invoke the active toolkit's createToolkit factory method at client startup; selects the GL/D3D implementation.
 */

import java.awt.*;
import java.lang.reflect.Method;

final class ToolkitLoader {
    /** Reflectively construct a Direct3D toolkit via {@code D3DToolkit.createToolkit} (desktop only). */
    static final GraphicsToolkit createD3DToolkit(int i, int i_0_, d var_d, CacheStore class45, Canvas canvas) {
        if (i_0_ != 18993) return null;
        GraphicsToolkit var_ha;
        try {
            if (!JaclibLoader.loadNatives(27165)) throw new RuntimeException("");
            if (!DefinitionSub19.tryLoadNativeLibrary(-30282, "jagdx")) throw new RuntimeException("");
            Method method = (D3DToolkit.class.getDeclaredMethod("createToolkit", Canvas.class, d.class, CacheStore.class, Integer.class));
            var_ha = (GraphicsToolkit) method.invoke(null, new Object[]{canvas, var_d, class45, new Integer(i)});
        } catch (Throwable throwable) {
            throw new RuntimeException("");
        }
        return var_ha;
    }
}
