import DefaultGraphicsOptionStateStatics.method1839
import AbstractBloomEffectStatics.method2753
import OggMediaStreamStatics.method515
import java.awt.Canvas
import java.awt.Rectangle
import java.util.*

object RendererStatics {
    @JvmField
            var anInt4561: Int = 0
            @JvmField
            var anInt4562: Int = 0
            @JvmField
            var anInt4563: Int = 0
            @JvmField
            var anInt4564: Int = 0
            @JvmField
            var anInt4565: Int = 0
            @JvmField
            var anInt4566: Int = 0
            @JvmField
            var anInt4568: Int = 0
            @JvmField
            var anInt4569: Int = 0
            @JvmField
            var anInt4570: Int = 0
            var aFontMetaRef_4571: FontMetaRef?
            @JvmField
            var anInt4572: Int = 0
            @JvmField
            var anInt4573: Int = 0
            @JvmField
            var anInt4574: Int = 0
            @JvmField
            var anInt4575: Int = 0
            @JvmField
            var anInt4576: Int = 0
            @JvmField
            var anInt4577: Int = 0
            @JvmField
            var anIntArray4578: IntArray? = IntArray(200)
            @JvmField
            var anInt4580: Int = 0
            @JvmField
            var anInt4581: Int = 0
            @JvmField
            var aFloat4582: Float = 0f
            @JvmField
            var anInt4583: Int = 0
    
            @JvmStatic
            fun method3641(i: Int, i_35_: Int, i_36_: Byte, i_37_: Int, i_38_: Int, i_39_: Int) {
                anInt4575++
                if (i_36_.toInt() != -75) anInt4581 = 73
                if (i_35_ == i_38_) WidgetComponentNodeStatics.method1116(i, i_37_, i_39_, i_38_, (-99).toByte())
                else if (WorldMapLabelStatics.anInt4960 <= i_39_ + -i_38_ && CameraNodeListStatics.anInt1745 >= i_39_ - -i_38_ && -i_35_ + i >= LocalPlayerState.anInt1910 && WidgetTextConfigStatics.anInt513 >= i + i_35_) method515(i_37_, i_39_, i, i_35_, i_38_, -122)
                else method1839(i_39_, i_35_, i, i_36_.toInt() xor 0x4a, i_37_, i_38_)
            }
    
            fun method3664(i: Int, i_88_: Int): ByteArray {
                anInt4564++
                if (i_88_ <= 21) anInt4583 = 60
                var class348_sub42_sub3 = (HashTileShapeStatics.aCacheLruCache_8815!!.method2302(i.toLong(), (-120).toByte()) as LoadingScreenImageNode?)
                if (class348_sub42_sub3 == null) {
                    val `is` = ByteArray(512)
                    val random = Random(i.toLong())
                    for (i_89_ in 0..254) `is`[i_89_] = i_89_.toByte()
                    for (i_90_ in 0..254) {
                        val i_91_ = -i_90_ + 255
                        val i_92_ = ModelDefinitionStatics.method1097(95.toByte(), i_91_, random)
                        val i_93_ = `is`[i_92_]
                        `is`[i_92_] = `is`[i_91_]
                        `is`[511 + -i_90_] = i_93_
                        `is`[i_91_] = `is`[511 + -i_90_]
                    }
                    class348_sub42_sub3 = LoadingScreenImageNode(`is`)
                    HashTileShapeStatics.aCacheLruCache_8815!!.method2305(i.toLong(), class348_sub42_sub3, -1)
                }
                return class348_sub42_sub3.aByteArray9499!!
            }
    
            @JvmStatic
            fun method3680(i: Int) {
                if (i != -24016) anIntArray4578 = null
                anIntArray4578 = null
                aFontMetaRef_4571 = null
            }
    
            @JvmStatic
            @Synchronized
            fun method3692(i: Int, i_168_: Int, i_169_: Int, js5Archive: Js5Archive?, i_170_: Int, var_renderConfig: RenderConfig?, canvas: Canvas?, i_171_: Int): Renderer? {
                try {
                    anInt4576++
                    if (i_170_ == i_171_) return method2753(true, i_168_, i_169_, canvas, var_renderConfig)
                    if (i_171_ == 2) return WorldMapToggle.method2297(-6, i_168_, var_renderConfig, canvas, i_169_)
                    if (i_171_ == 1) return NodeDequeStatics.method2000(3, i, canvas, var_renderConfig)
                    if (i_171_ == 5) return JagGlToolkitFactory.method862(canvas, var_renderConfig, js5Archive, 25542, i)
                    if (i_171_ == 3) return JagDxToolkitFactory.method870(i, i_170_ xor 0x4a31, var_renderConfig!!, js5Archive!!, canvas!!)
                    throw IllegalArgumentException("UM")
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("ha.TJ(" + i + ',' + i_168_ + ',' + i_169_ + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + i_170_ + ',' + (if (var_renderConfig != null) "{...}" else "null") + ',' + (if (canvas != null) "{...}" else "null") + ',' + i_171_ + ')'))
                }
            }
    
            init {
                aFontMetaRef_4571 = FontMetaRef(73, -1)
            }
}
