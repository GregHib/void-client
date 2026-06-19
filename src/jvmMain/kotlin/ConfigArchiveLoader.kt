import GameAppletFrameStatics.method94
import GlCubeMapTextureStatics.method243
import WaterDetailOptionStateStatics.method1781
import ParticleDetailOptionStateStatics.method1795
import CameraDistanceOptionStateStatics.method1725
import SceneryDetailOptionStateStatics.method1821
import SimpleToggleOptionStateStatics.method1742
import SocketFactoryStatics.method2049
import WaterMaterialPassStatics.method2148
import CubemapTextureImplSourceStatics.method2271
import SceneObjectEntityStatics.method2405
import ActorEntityStatics.method2478
import LinkedListNodeStatics.method2710
import VorbisOggDecoderStatics.method2972
import TurbulenceTextureNodeStatics.method3113
import GlShadowRenderPassStatics.method3553
import GlCubemapLightPassStatics.method3544
import WidgetComponentStatics.method427
import MinimapTriangleDrawerStatics.method464
import GameClock.method599
import ChatCommandProcessor.method706
import ChatCommandProcessor.method715
import jagex3.jagmisc.jagmisc.availablePhysicalMemory
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream

/*
 * Class82
 */
class ConfigArchiveLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_1436: Js5Archive?
    @JvmField
    var anInt1439: Int = 0

    init {
        LruByteCache(64)
        try {
            aJs5Archive_1436 = js5Archive
            this.anInt1439 = aJs5Archive_1436!!.method407(0, 15)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("lba.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }
}
