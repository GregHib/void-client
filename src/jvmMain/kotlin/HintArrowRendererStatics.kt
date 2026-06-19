import CacheArchiveIndexLoaderStatics.method340
import ColorThresholdEffectStatics.method3051
import kotlin.math.asin
import kotlin.math.atan2
import kotlin.math.max
import kotlin.math.sqrt

object HintArrowRendererStatics {
    var aAbstractModelRenderer_1215: AbstractModelRenderer? = null
    var anIntArray1226: IntArray? = IntArray(4)
    var aAbstractModel_1227: AbstractModel? = null
    var aAbstractModelRenderer_1228: AbstractModelRenderer? = null

    @JvmStatic
    fun method731() {
        aAbstractModel_1227 = null
        aAbstractModelRenderer_1215 = null
        aAbstractModelRenderer_1228 = null
        anIntArray1226 = null
    }

    fun method732(var_renderer: Renderer) {
        if (aAbstractModelRenderer_1228 == null) {
            val `is` = IntArray(16384)
            val is_1_ = IntArray(16384)
            for (i in 0..63) {
                var i_2_ = 64 - i
                i_2_ *= i_2_
                val i_3_ = 128 - i - 1
                val i_4_ = i * 128
                val i_5_ = i_3_ * 128
                for (i_6_ in 0..63) {
                    var i_7_ = 64 - i_6_
                    i_7_ *= i_7_
                    val i_8_ = 128 - i_6_ - 1
                    var i_9_ = 256 - (i_7_ + i_2_ shl 8) / 4096
                    i_9_ = i_9_ * 16 * 192 / 1536
                    if (i_9_ < 0) i_9_ = 0
                    else if (i_9_ > 255) i_9_ = 255
                    val i_10_ = i_9_ / 2
                    is_1_[i_5_ + i_8_] = 0xffffff.inv() or (i_9_ shl 16)
                    is_1_[i_5_ + i_6_] = is_1_[i_5_ + i_8_]
                    is_1_[i_4_ + i_8_] = is_1_[i_5_ + i_6_]
                    is_1_[i_4_ + i_6_] = is_1_[i_4_ + i_8_]
                    `is`[i_5_ + i_8_] = 127 - i_10_ shl 24 or 0xffffff
                    `is`[i_5_ + i_6_] = `is`[i_5_ + i_8_]
                    `is`[i_4_ + i_8_] = `is`[i_5_ + i_6_]
                    `is`[i_4_ + i_6_] = `is`[i_4_ + i_8_]
                }
            }
            aAbstractModelRenderer_1228 = var_renderer.method3662(128, is_1_, 94.toByte(), 0, 128, 128)
            aAbstractModelRenderer_1215 = var_renderer.method3662(128, `is`, 94.toByte(), 0, 128, 128)
        }
    }

    fun method738(var_renderer: Renderer) {
        if (aAbstractModel_1227 == null) {
            val modelDefinition = ModelDefinition(580, 1104, 1)
            modelDefinition.method1105(109, 0.toByte(), 0.toByte(), 0.toShort(), 1024.toShort(), 0.toByte(), 0.toShort(), 32767.toShort(), 1024.toShort(), 1024.toShort())
            modelDefinition.method1101(128, 0, 0, -93)
            modelDefinition.method1101(-128, 0, 0, 108)
            for (i in 0..24) {
                val i_41_ = i * 8192 / 24
                val i_42_: Int = TrigLookupTablesStatics.anIntArray1207!![i_41_]
                val i_43_: Int = TrigLookupTablesStatics.anIntArray1204!![i_41_]
                for (i_44_ in 1..23) {
                    val i_45_ = i_44_ * 8192 / 24
                    val i_46_: Int = TrigLookupTablesStatics.anIntArray1204!![i_45_] shr 7
                    val i_47_: Int = TrigLookupTablesStatics.anIntArray1207!![i_45_] * i_42_ shr 21
                    val i_48_: Int = TrigLookupTablesStatics.anIntArray1207!![i_45_] * i_43_ shr 21
                    modelDefinition.method1101(i_46_, -i_47_, i_48_, 127)
                }
                if (i > 0) {
                    var i_49_ = i * 23 + 2
                    var i_50_ = i_49_ - 23
                    modelDefinition.method1102(0, 0.toByte(), 0.toByte(), 0.toShort(), 52.toByte(), 127.toShort(), i_50_, 0.toByte(), i_49_)
                    for (i_51_ in 1..22) {
                        val i_52_ = i_50_ + 1
                        val i_53_ = i_49_ + 1
                        modelDefinition.method1102(i_50_, 0.toByte(), 0.toByte(), 0.toShort(), 41.toByte(), 127.toShort(), i_52_, 0.toByte(), i_49_)
                        modelDefinition.method1102(i_52_, 0.toByte(), 0.toByte(), 0.toShort(), 67.toByte(), 127.toShort(), i_53_, 0.toByte(), i_49_)
                        i_50_ = i_52_
                        i_49_ = i_53_
                    }
                    modelDefinition.method1102(i_49_, 0.toByte(), 0.toByte(), 0.toShort(), 98.toByte(), 127.toShort(), i_50_, 0.toByte(), 1)
                }
            }
            modelDefinition.anInt1821 = modelDefinition.anInt1836
            modelDefinition.anIntArray1824 = null
            modelDefinition.anIntArray1868 = null
            modelDefinition.aByteArray1839 = null
            aAbstractModel_1227 = var_renderer.method3625(modelDefinition, 51200, 33, 64, 768)
        }
    }

    fun method739() {
        aAbstractModel_1227 = null
        aAbstractModelRenderer_1228 = null
    }
}
