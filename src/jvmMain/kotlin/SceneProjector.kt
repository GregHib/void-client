import AudioResamplerStatics.method1274
import SocketStreamWorkerStatics.method1469
import GlTexture3DStatics.method1960
import MinimapTileEntryStatics.method383
import ScrollingNoiseTextureStatics.method560
import RenderNodeStatics.method3284
import kotlin.math.max
import kotlin.math.min
import SceneProjectorStatics.anInt2989

/* Class230 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SceneProjector internal constructor(string: String?, i: Int) {
    @JvmField
    var aString2985: String? = null
    @JvmField
    var anInt2987: Int = 0
    override fun toString(): String {
        anInt2989++
        throw IllegalStateException()
    }

    init {
        try {
            this.aString2985 = string
            this.anInt2987 = i
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("sj.<init>(" + (if (string != null) "{...}" else "null") + ',' + i + ')'))
        }
    }
}
