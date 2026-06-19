import GameAppletFrameStatics.method94
import GameAppletFrameStatics.set
import AbstractMenuEntryStatics.method1034
import AbstractGameSocketStatics.method1703
import GraphicsOptionStateStatics.method1713
import ShadowQualityOptionStateStatics.method1788
import NoOpGraphicsOptionStateStatics.method1803
import DisplayModeOptionStateStatics.method1825
import TwoStateOptionStateStatics.method1844
import MultiLevelOptionStateStatics.method1851
import GlVertexBufferArbStatics.method2127
import TileSceneEntityStatics.method2396
import FontStatics.method2570
import KeyedCacheEntryReferenceStatics.method3203
import FixedFunctionWaterPassStatics.method3546
import GlRenderDeviceStatics.method3965
import InputStream_Sub2Statics.method128
import java.io.IOException
import HardCacheEntryReferenceStatics.anInt10435
import HardCacheEntryReferenceStatics.anInt10438
import HardCacheEntryReferenceStatics.method3202

class HardCacheEntryReference internal constructor(private val anObject10429: Any?, i: Int) : CacheEntryReference(i) {
    override fun method3195(i: Int): Boolean {
        if (i != -4) method3202((-58).toByte())
        anInt10438++
        return false
    }

    override fun method3193(i: Int): Any? {
        anInt10435++
        if (i < 75) method3193(-128)
        return anObject10429
    }
}
