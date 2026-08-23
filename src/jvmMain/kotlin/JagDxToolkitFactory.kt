import BlankTextureNodeStatics.method3098
import NativeLibraryState.method215
import java.awt.Canvas

/*
 * Class96
 */
object JagDxToolkitFactory {
    fun method870(i: Int, i_0_: Int, var_renderConfig: RenderConfig, js5Archive: Js5Archive, canvas: Canvas): Renderer? {
        if (i_0_ != 18993) return null
        val var_renderer: Renderer
        try {
            if (!method215(27165)) throw RuntimeException("")
            if (!method3098(-30282, "jagdx")) throw RuntimeException("")
            var_renderer = D3dRenderDevice.createToolkit(canvas, var_renderConfig, js5Archive, i) as Renderer
        } catch (throwable: Throwable) {
            throw RuntimeException("")
        }
        return var_renderer
    }
}
