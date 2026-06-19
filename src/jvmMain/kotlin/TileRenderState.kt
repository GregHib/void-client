import LocTypeDefLoaderStatics.method1406
import WaterDetailOptionStateStatics.method1779
import ConfigFlagUtilStatics.method1916
import LocalizedTextStatics.method2061
import TextureCubeProviderStatics.method2269
import ProjectedGroundDecorStatics.method2433
import RingBufferInputStreamStatics.method3616
import Bzip2DecoderStateStatics.method369
import MinimapTriangleDrawerStatics.method464
import ChatCommandProcessor.method705
import kotlin.math.max
import TileRenderStateStatics.anInt4227
import TileRenderStateStatics.anInt4232

/* Class341 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TileRenderState {
    override fun toString(): String {
        anInt4227++
        throw IllegalStateException()
    }

    fun method2679(i: Int, i_7_: Int, i_8_: Int): Int {
        anInt4232++
        if (i_8_ != 1595) return 38
        val i_9_ = (max(HardCacheEntryReferenceStatics.anInt10432, i))
        if (PerlinTextureProviderStatics.aTileRenderState_5808 == this) return 0
        if (this == WorldMapSceneSoftwareStatics.aTileRenderState_5821) return i_9_ - i_7_
        if (ProjectileConfigUtil.aTileRenderState_399 == this) return (i_9_ - i_7_) / 2
        return 0
    }
}
