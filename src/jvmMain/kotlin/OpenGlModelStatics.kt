import TwoStateOptionStateStatics.method1846
import ParticleEmitterFactoryStatics.method1885
import SphereMapMaterialPassStatics.method2174
import Texture2DProviderStatics.method2259
import ArchiveResourceProviderStatics.method2352
import LinkedListNodeStatics.method2709
import PcmStreamBufferStatics.method2832
import BlankTextureNodeStatics.method3100
import Bzip2DecoderStateStatics.method371
import CachedRgbNoiseTextureStatics.method565
import RasterSpriteStatics.method166
import jaclib.memory.StreamStatics.floatToRawIntBits
import jaggl.OpenGLStatics.glColor4ub
import OpenGlTerrainTileStatics.method3999
import kotlin.math.sqrt

object OpenGlModelStatics {
    @JvmField
            var anInt5530: Int = 0
            @JvmField
            var anInt5531: Int = 0
            @JvmField
            var anInt5532: Int = 0
            @JvmField
            var anInt5533: Int = 0
            @JvmField
            var anInt5534: Int = 0
            @JvmField
            var anInt5535: Int = 0
            @JvmField
            var anInt5538: Int = 0
            @JvmField
            var anInt5545: Int = 0
            @JvmField
            var anInt5546: Int = 0
            @JvmField
            var anInt5547: Int = 0
            @JvmField
            var anInt5548: Int = 0
            @JvmField
            var anInt5549: Int = 0
            @JvmField
            var anInt5550: Int = 0
            @JvmField
            var anInt5551: Int = 0
            @JvmField
            var aNpcDefinitionCache_5558: NpcDefinitionCache? = null
            @JvmField
            var anInt5560: Int = 0
            @JvmField
            var anInt5561: Int = 0
            @JvmField
            var anInt5562: Int = 0
            @JvmField
            var anInt5565: Int = 0
            @JvmField
            var anInt5567: Int = 0
            @JvmField
            var anInt5568: Int = 0
            @JvmField
            var anInt5569: Int = 0
            @JvmField
            var anInt5570: Int = 0
            @JvmField
            var anInt5574: Int = 0
            @JvmField
            var anInt5577: Int = 0
            @JvmField
            var anInt5578: Int = 0
            @JvmField
            var anInt5582: Int = 0
            @JvmField
            var anInt5584: Int = 0
            @JvmField
            var anInt5585: Int = 0
            @JvmField
            var anInt5587: Int = 0
            @JvmField
            var anInt5588: Int = 0
            @JvmField
            var anInt5589: Int = 0
            @JvmField
            var anInt5590: Int = 0
            @JvmField
            var anInt5597: Int = 0
            @JvmField
            var anInt5599: Int = 0
            @JvmField
            var aString5600: String? = ""
            @JvmField
            var anInt5602: Int = 0
            @JvmField
            var anInt5603: Int = 0
            @JvmField
            var anInt5604: Int = 0
            @JvmField
            var anInt5606: Int = 0
            @JvmField
            var anInt5607: Int = 0
            var aBoolean5609: Boolean = false
            @JvmField
            var anInt5611: Int = 0
            @JvmField
            var anInt5612: Int = 0
            @JvmField
            var anInt5613: Int = 0
            @JvmField
            var anInt5614: Int = 0
            @JvmField
            var anInt5615: Int = 0
            @JvmField
            var anInt5616: Int = 0
            @JvmField
            var anInt5618: Int = 0
            @JvmField
            var anInt5619: Int = 0
            @JvmField
            var anInt5622: Int = 0
            @JvmField
            var anInt5623: Int = 0
            @JvmField
            var anInt5624: Int = 0
            @JvmField
            var anInt5625: Int = 0
            @JvmField
            var anInt5628: Int = 0
            @JvmField
            var anInt5630: Int = 0
            @JvmField
            var anInt5631: Int = 0
            @JvmField
            var anInt5633: Int = 0
            @JvmField
            var anInt5635: Int = 0
            @JvmField
            var anInt5636: Int = 0
            @JvmField
            var anInt5637: Int = 0
            @JvmField
            var anInt5639: Int = 0
            @JvmField
            var anInt5641: Int = 0
            @JvmField
            var anInt5643: Int = 0
            @JvmField
            var anInt5650: Int = 0
            @JvmField
            var anInt5651: Int = 0
    
            @JvmStatic
            fun method681(i: Int) {
                aNpcDefinitionCache_5558 = null
                if (i <= 75) aString5600 = null
                aString5600 = null
            }
    
            @JvmStatic
            fun method687(i: Byte, i_282_: Int) {
                val i_283_ = 113 / ((-63 - i) / 53)
                anInt5570++
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i_282_, 105.toByte(), 5)
                class348_sub42_sub15.method3251(-16058)
            }
    
            @JvmStatic
            fun method689(i: Byte, i_377_: Int) {
                ColourAdjustmentStatics.anInt859 = -1
                TextureMetadataProviderStatics.anInt4609 = -1
                if (i.toInt() != -59) anInt5584 = 77
                anInt5577++
                WidgetActionEntryStatics.anInt6992 = i_377_
                MenuActionNodeStatics.method2811(false)
            }
    
            @JvmStatic
            fun method690(i: Byte, i_378_: Int) {
                anInt5565++
                val class348_sub15 = (ProjectileConfigUtil.aHashtable_389!!.method3480(i_378_.toLong(), -6008) as MenuActionNode?)
                val i_379_ = -8 % ((i - -49) / 44)
                if (class348_sub15 != null) {
                    class348_sub15.aClass55_Sub1_6768!!.method508(1)
                    ProjectileDefinition.method2285(class348_sub15.aBoolean6776, (-114).toByte(), class348_sub15.anInt6773)
                    class348_sub15.method2715(52.toByte())
                }
            }
}
