import GameAppletFrameStatics.method94
import BloomGraphicsOptionStateStatics.method1772
import CameraDistanceOptionStateStatics.method1725
import WaterMaterialPassStatics.method2148
import CubemapTextureImplSourceStatics.method2271
import AbstractTileShapeStatics.method2718
import WorldMapAreaLabelStatics.method3570
import NativeRendererStatics.method3936
import java.awt.Canvas
import java.awt.Component
import java.awt.Graphics
import DelegatingRenderCanvasStatics.anInt61
import DelegatingRenderCanvasStatics.anInt65

/*
 * Canvas_Sub1
 */
class DelegatingRenderCanvas internal constructor(private val aComponent64: Component) : Canvas() {
    override fun update(graphics: Graphics?) {
        anInt61++
        aComponent64.update(graphics)
    }

    override fun paint(graphics: Graphics?) {
        aComponent64.paint(graphics)
        anInt65++
    }
}
