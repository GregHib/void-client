import BlankTextureNode.Companion.method3098
import Class9.method215
import java.awt.Canvas

object Class96 {
    fun method870(i: Int, i_0_: Int, var_renderConfig: RenderConfig, class45: Class45, canvas: Canvas): Renderer? {
        if (i_0_ != 18993) return null
        val var_renderer: Renderer
        try {
            if (!method215(27165)) throw RuntimeException("")
            if (!method3098(-30282, "jagdx")) throw RuntimeException("")
            var_renderer = D3dRenderDevice.createToolkit(canvas, var_renderConfig, class45, i) as Renderer
        } catch (throwable: Throwable) {
            throw RuntimeException("")
        }
        return var_renderer
    }
}
