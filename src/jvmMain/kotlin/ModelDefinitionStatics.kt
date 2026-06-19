import WhirlpoolHashStatics.method828
import java.awt.Canvas
import java.util.*

object ModelDefinitionStatics {
    @JvmField
            var anInt1819: Int = 0
            @JvmField
            var anInt1826: Int = 0
            @JvmField
            var anInt1827: Int = 0
            @JvmField
            var anInt1828: Int = 0
            @JvmField
            var anInt1831: Int = 0
            @JvmField
            var anInt1837: Int = 0
            @JvmField
            var anInt1838: Int = 0
            @JvmField
            var anInt1840: Int = 0
            @JvmField
            var anInt1845: Int = 0
            @JvmField
            var aJs5Archive_1848: Js5Archive? = null
            @JvmField
            var anInt1850: Int = 0
            @JvmField
            var anInt1854: Int = 0
            @JvmField
            var anInt1858: Int = 0
            @JvmField
            var anInt1860: Int = 0
            @JvmField
            var anInt1861: Int = 0
            @JvmField
            var anInt1864: Int = 0
            @JvmField
            var anInt1869: Int = 0
    
            @JvmStatic
            fun method1096(i: Int) {
                if (i >= 88) aJs5Archive_1848 = null
            }
    
            fun method1097(i: Byte, i_20_: Int, random: Random): Int {
                anInt1861++
                require(i_20_ > 0)
                if (AsyncTaskHandleStatics.method1436(-19, i_20_)) return (i_20_.toLong() * (0xffffffffL and random.nextInt().toLong()) shr 32).toInt()
                val i_21_ = -2147483648 + -(4294967296L % i_20_.toLong()).toInt()
                if (i < 78) aJs5Archive_1848 = null
                var i_22_: Int
                do i_22_ = random.nextInt() while (i_22_ >= i_21_)
                return ModelTransformParamsStatics.method3452(i_22_, (-15).toByte(), i_20_)
            }
    
            @JvmStatic
            fun method1108(i: Byte, canvas: Canvas) {
                anInt1850++
                val dimension = canvas.getSize()
                if (i.toInt() != -99) method1096(57)
                method828(38.toByte(), dimension.height, dimension.width)
                if (ByteBufferStatics.anInt7207 != 1) CameraRotationStubStatics.aRenderer326!!.method3643(canvas, GrayscaleNoiseTextureStatics.anInt5283, LinkedNodeListIteratorStatics.anInt1651)
                else CameraRotationStubStatics.aRenderer326!!.method3643(canvas, SynthVoiceGroupStatics.anInt8854, ShadowQualityOptionStateStatics.anInt6008)
            }
}
