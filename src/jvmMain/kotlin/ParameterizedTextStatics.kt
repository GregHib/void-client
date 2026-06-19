import BoundsConstraintEntryStatics.method2057
import ParticleSystemRendererStatics.method2296
import SoundBankPatchStatics.method2929
import ModelVertexColorBufferStatics.method2739
import TurbulenceTextureNodeStatics.method3113
import AbstractBloomEffectStatics.method2752

object ParameterizedTextStatics {
    var anInt9560: Int = 0
            var anInt9561: Int = 0
            var anInt9563: Int = 0
            var anInt9568: Int = 0
            var anInt9569: Int = 0
            var anInt9570: Int = 0
            @JvmField
            var aCircleRasterizer_9571: CircleRasterizer? = null
            var anIntArray9572: IntArray?
            var anInt9573: Int = 0
            var anInt9575: Int = 0
            var anInt9576: Int = 0
            var anInt9577: Int = 0
            var anInt9578: Int = 0
    
            fun method3211(i: Byte) {
                NpcTypeStatics.aClient1367!!.method83(true)
                anInt9569++
                method2739(0)
                RegionSceneLoader.anInt3699 = 0
                SineWaveTextureNodeStatics.aIntRange_9456 = null
                StringCacheNodeStatics.anInt7213 = 0
                GraphicsOptionStateStatics.aIntRange_3145 = null
                CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                val i_3_ = -122 % ((i - 13) / 45)
                AbstractGameSocketStatics.aIntRange_3133 = null
                method2296(-99)
                HslAdjustTextureNodeStatics.anInt9383 = 0
                MinimapShapeDrawerStatics.aString863 = null
                ByteArrayPool.anInt496 = 0
                HostPingThreadStatics.aWorldListEntryArray2261 = null
                MinimapSpriteRendererStatics.anInt4930 = 0
            }
    
            @JvmStatic
            fun method3217(i: Byte) {
                if (i.toInt() != 61) method3211((-95).toByte())
                aCircleRasterizer_9571 = null
                anIntArray9572 = null
            }
    
            init {
                anIntArray9572 = intArrayOf(16, 32, 64, 128)
            }
}
