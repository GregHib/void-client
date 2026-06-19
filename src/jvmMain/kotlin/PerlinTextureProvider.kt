import jaggl.OpenGLStatics.glTexImage2Dub
import java.util.*
import kotlin.math.min
import PerlinTextureProviderStatics.anInt5810

class PerlinTextureProvider internal constructor(i: Int) : TextureGenerator() {
    private val anIntArray5804 = IntArray(512)
    override fun method1398(i: Int, i_0_: Int, f: Float, f_1_: Float, i_2_: Int, f_3_: Float, i_4_: Int, f_5_: Float, i_6_: Int, i_7_: Int, fs: FloatArray) {
        var i_2_ = i_2_
        anInt5810++
        var i_8_ = (-1.0f + f * i_6_.toFloat()).toInt()
        i_8_ = i_8_ and 0xff
        var i_9_ = (-1.0f + i_0_.toFloat() * f_5_).toInt()
        i_9_ = i_9_ and 0xff
        var i_10_ = (-1.0f + i.toFloat() * f_1_).toInt()
        i_10_ = i_10_ and 0xff
        val f_11_ = i_7_.toFloat() * f_1_
        var i_12_ = f_11_.toInt()
        var i_13_ = i_12_ + 1
        val f_14_ = f_11_ - i_12_.toFloat()
        val f_15_ = i_4_.toFloat() - f_14_
        val f_16_ = WidgetRedrawRegionStatics.method2684(6, f_14_)
        i_13_ = i_13_ and i_10_
        i_12_ = i_12_ and i_10_
        val i_17_ = anIntArray5804[i_12_]
        val i_18_ = anIntArray5804[i_13_]
        var i_19_ = 0
        while (i_0_ > i_19_) {
            val f_20_ = f_5_ * i_19_.toFloat()
            var i_21_ = f_20_.toInt()
            var i_22_ = i_21_ + 1
            val f_23_ = -i_21_.toFloat() + f_20_
            val f_24_ = -f_23_ + 1.0f
            val f_25_ = WidgetRedrawRegionStatics.method2684(i_4_ xor 0x7, f_23_)
            i_21_ = i_21_ and i_9_
            i_22_ = i_22_ and i_9_
            val i_26_ = anIntArray5804[i_17_ + i_21_]
            val i_27_ = anIntArray5804[i_17_ + i_22_]
            val i_28_ = anIntArray5804[i_21_ + i_18_]
            val i_29_ = anIntArray5804[i_22_ - -i_18_]
            for (i_30_ in 0..<i_6_) {
                val f_31_ = f * i_30_.toFloat()
                var i_32_ = f_31_.toInt()
                var i_33_ = 1 + i_32_
                val f_34_ = f_31_ - i_32_.toFloat()
                val f_35_ = 1.0f - f_34_
                i_32_ = i_32_ and i_8_
                i_33_ = i_33_ and i_8_
                val f_36_ = WidgetRedrawRegionStatics.method2684(i_4_ xor 0x7, f_34_)
                fs[i_2_++] = f_3_ * (ResourceProviderStatics.method2337(
                    (ResourceProviderStatics.method2337(
                        (ResourceProviderStatics.method2337((GlBufferObjectStatics.method2119(f_24_, NpcSummaryDefinitionStatics.method1166((anIntArray5804[i_26_ + i_32_]), 7), f_15_, -70, f_35_)), true, (GlBufferObjectStatics.method2119(f_24_, NpcSummaryDefinitionStatics.method1166(7, (anIntArray5804[i_33_ - -i_26_])), f_15_, -73, f_34_)), f_36_)),
                        true,
                        (ResourceProviderStatics.method2337((GlBufferObjectStatics.method2119(f_23_, NpcSummaryDefinitionStatics.method1166(7, (anIntArray5804[i_32_ + i_27_])), f_15_, -75, f_35_)), true, (GlBufferObjectStatics.method2119(f_23_, NpcSummaryDefinitionStatics.method1166((anIntArray5804[i_27_ + i_33_]), 7), f_15_, -91, f_34_)), f_36_)),
                        f_25_
                    )),
                    true,
                    (ResourceProviderStatics.method2337(
                        (ResourceProviderStatics.method2337((GlBufferObjectStatics.method2119(f_24_, NpcSummaryDefinitionStatics.method1166((anIntArray5804[i_28_ + i_32_]), 7), f_14_, -72, f_35_)), true, (GlBufferObjectStatics.method2119(f_24_, NpcSummaryDefinitionStatics.method1166((anIntArray5804[i_28_ + i_33_]), 7), f_14_, -75, f_34_)), f_36_)),
                        true,
                        (ResourceProviderStatics.method2337((GlBufferObjectStatics.method2119(f_23_, NpcSummaryDefinitionStatics.method1166((anIntArray5804[i_29_ + i_32_]), 7), f_14_, -100, f_35_)), true, (GlBufferObjectStatics.method2119(f_23_, NpcSummaryDefinitionStatics.method1166((anIntArray5804[i_29_ + i_33_]), 7), f_14_, -72, f_34_)), f_36_)),
                        f_25_
                    )),
                    f_16_
                ))
            }
            i_19_++
        }
    }

    init {
        val random = Random(i.toLong())
        for (i_41_ in 0..255) {
            anIntArray5804[256 + i_41_] = i_41_
            anIntArray5804[i_41_] = anIntArray5804[256 + i_41_]
        }
        for (i_42_ in 0..255) {
            val i_43_ = 0xff and random.nextInt()
            val i_44_ = anIntArray5804[i_43_]
            anIntArray5804[256 + i_43_] = anIntArray5804[i_42_]
            anIntArray5804[i_43_] = anIntArray5804[256 + i_43_]
            anIntArray5804[256 + i_42_] = i_44_
            anIntArray5804[i_42_] = anIntArray5804[256 + i_42_]
        }
    }
}
