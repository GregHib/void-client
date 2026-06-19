import ParticleEmitterNodeStatics.method219
import DetailLevelOptionStateStatics.method1837
import SimpleToggleOptionStateStatics.method1740
import ParticleEmitterFactoryStatics.method1885
import ParticleEmitterFactoryStatics.method1887
import PcmStreamBufferStatics.method2832
import KaraokeSubtitleStreamStatics.method2985
import ColourKeyTextureNodeStatics.method3119
import RangeThresholdTextureNodeStatics.method3056
import EdgeDetectTextureNodeStatics.method3073
import AsyncResourceRequestStatics.method3258
import StreamingResourceRequestStatics.method3262
import CacheEntryReferenceStatics.method3194
import HardCacheEntryReferenceStatics.method3200
import CharacterRenderStateStatics.method2783
import LocConfigModelBuilderStatics.method3563
import CachedRgbNoiseTextureStatics.method565
import ChatMessageStreamStatics.method135
import ChatMessageStreamStatics.method137
import OpenGlRendererStatics.method3743
import jaclib.memory.StreamStatics.c
import kotlin.math.sqrt

object Direct3dModelStatics {
    @JvmField
            var anInt5403: Int = 0
            @JvmField
            var anInt5405: Int = 0
            @JvmField
            var anInt5407: Int = 0
            @JvmField
            var anInt5408: Int = 0
            @JvmField
            var anInt5409: Int = 0
            @JvmField
            var anInt5410: Int = 0
            @JvmField
            var anInt5411: Int = 0
            @JvmField
            var anInt5414: Int = 0
            @JvmField
            var anInt5417: Int = 0
            var aString5420: String? = null
            @JvmField
            var anInt5421: Int = 0
            @JvmField
            var anInt5422: Int = 0
            @JvmField
            var anInt5425: Int = 0
            @JvmField
            var anInt5426: Int = 0
            @JvmField
            var anInt5430: Int = 0
            @JvmField
            var anInt5431: Int = 0
            @JvmField
            var anInt5434: Int = 0
            @JvmField
            var anInt5435: Int = 0
            @JvmField
            var anInt5437: Int = 0
            @JvmField
            var anInt5440: Int = 0
            @JvmField
            var anInt5441: Int = 0
            @JvmField
            var anInt5444: Int = 0
            @JvmField
            var anInt5445: Int = 0
            @JvmField
            var anInt5446: Int = 0
            @JvmField
            var anInt5447: Int = 0
            @JvmField
            var anInt5448: Int = 0
            @JvmField
            var anInt5449: Int = 0
            @JvmField
            var anInt5450: Int = 0
            @JvmField
            var anInt5451: Int = 0
            @JvmField
            var anInt5453: Int = 0
            @JvmField
            var anInt5454: Int = 0
            @JvmField
            var anInt5456: Int = 0
            @JvmField
            var anInt5458: Int = 0
            @JvmField
            var anInt5459: Int = 0
            @JvmField
            var anInt5464: Int = 0
            @JvmField
            var anInt5465: Int = 0
            @JvmField
            var anInt5466: Int = 0
            @JvmField
            var anInt5468: Int = 0
            @JvmField
            var anInt5469: Int = 0
            @JvmField
            var anInt5471: Int = 0
            @JvmField
            var anInt5479: Int = 0
            @JvmField
            var anInt5480: Int = 0
            @JvmField
            var anInt5481: Int = 0
            @JvmField
            var anInt5483: Int = 0
            @JvmField
            var anInt5484: Int = 0
            @JvmField
            var anInt5487: Int = 0
            @JvmField
            var anInt5488: Int = 0
            @JvmField
            var anInt5489: Int = 0
            @JvmField
            var anInt5490: Int = 0
            @JvmField
            var anInt5491: Int = 0
            @JvmField
            var anInt5496: Int = 0
            @JvmField
            var anInt5498: Int = 0
            @JvmField
            var anInt5500: Int = 0
            @JvmField
            var anInt5501: Int = 0
            @JvmField
            var anInt5504: Int = 0
            @JvmField
            var anInt5505: Int = 0
            @JvmField
            var anInt5513: Int = 0
            @JvmField
            var anInt5514: Int = 0
            @JvmField
            var anInt5517: Int = 0
            @JvmField
            var anInt5518: Int = 0
            @JvmField
            var anInt5521: Int = 0
            @JvmField
            var anInt5522: Int = 0
            @JvmField
            var anInt5523: Int = 0
            @JvmField
            var anInt5525: Int = 0
            @JvmField
            var anInt5526: Int = 0
    
            @JvmStatic
            fun method661(i: Byte) {
                anInt5466++
                var class348_sub42_sub13 = (ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1011(-93) as ContactList?)
                while (class348_sub42_sub13 != null) {
                    if (class348_sub42_sub13.anInt9615 > 1) {
                        class348_sub42_sub13.anInt9615 = 0
                        KeyboardLayoutCacheStatics.aLruByteCache_3301!!.method582(class348_sub42_sub13, (class348_sub42_sub13.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as ContactEntry).aLong9600, (-124).toByte())
                        class348_sub42_sub13.aLinkedNodeListIterator_9621.method1009(2110355138)
                    }
                    class348_sub42_sub13 = (ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1003(46.toByte()) as ContactList?)
                }
                NpcAnimationResolverStatics.anInt166 = 0
                if (i < 92) method661(114.toByte())
                FileExistsConditionStatics.anInt4776 = 0
                SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1996(115)
                ContactEntryStatics.aHashtable_9603!!.method3481(0)
                ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1009(2110355138)
                method3743(6.toByte(), FlipTextureNodeStatics.aClass348_Sub42_Sub12_9144)
            }
    
            @JvmStatic
            fun method676(i: Int) {
                aString5420 = null
                if (i <= 11) method661((-43).toByte())
            }
}
