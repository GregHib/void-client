import Class239_Sub23.Companion.method1819
import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState
import kotlin.math.cos
import kotlin.math.sin

abstract class Class348_Sub23 internal constructor(var anOggStreamState6869: OggStreamState) : Class348() {
    var anInt6868: Int = 0
    abstract fun method2961(i: Byte)

    fun method2963(oggpacket: OggPacket, i: Int) {
        method2964((-120).toByte(), oggpacket)
        if (i != 16384) aFloatArray6867 = null
        anInt6863++
        this.anInt6868++
    }

    abstract fun method2964(i: Byte, oggpacket: OggPacket)

    companion object {
        @JvmField
        var anInt6863: Int = 0
        @JvmField
        var anInt6864: Int = 0
        @JvmField
        var aFloatArray6865: FloatArray? = FloatArray(16384)
        @JvmField
        var anInt6866: Int = 0
        @JvmField
        var aFloatArray6867: FloatArray? = FloatArray(16384)
        @JvmField
        var anInt6870: Int = 0

        fun method2960(bool: Boolean, i: Int): Int {
            if (i >= -16) aFloatArray6865 = null
            anInt6870++
            val i_0_ = Class348_Sub49.anInt7207
            while_128_@ do {
                do {
                    if (i_0_ == 0) {
                        if (bool) return 0
                        return Class348_Sub40_Sub8.anInt9157
                    } else if (i_0_ != 1) {
                        if (i_0_ == 2) break
                        break@while_128_
                    }
                    return Class348_Sub40_Sub8.anInt9157
                } while (false)
                return 0
            } while (false)
            return 0
        }

        @JvmStatic
        fun method2962(i: Int) {
            aFloatArray6865 = null
            aFloatArray6867 = null
            if (i != -31055) method2966(-119, -98, true)
        }

        @JvmStatic
        fun method2965(string: String?, i: Int, bool: Boolean, i_1_: Int) {
            anInt6866++
            Class187.method1406(true)
            if (i == 0) {
                Class348_Sub8.aHa6654 = Class104.method958(true, 0, Class348_Sub40_Sub4.aD9113, Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(-32350) * 2, Class305.aCanvas3869, Class136.aClass45_4796)
                if (string != null) {
                    Class348_Sub8.aHa6654!!.GA(0)
                    val class143 = method1819(Class17.anInt235, 0, -117, Class104.aClass45_1627!!)
                    val class324 = (Class348_Sub8.aHa6654!!.method3686(class143, Class207.method1519(Class21.aClass45_322!!, Class17.anInt235, 0), true))
                    Class140.method1170((-89).toByte())
                    Class362.method3511(true, class324, class143, string, 2, Class348_Sub8.aHa6654)
                }
            } else {
                var var_ha: ha? = null
                if (string != null) {
                    var_ha = Class104.method958(true, 0, Class348_Sub40_Sub4.aD9113, 0, Class305.aCanvas3869, Class136.aClass45_4796)!!
                    var_ha.GA(0)
                    val class143 = method1819(Class17.anInt235, 0, -115, Class104.aClass45_1627!!)
                    val class324 = var_ha.method3686(class143, Class207.method1519((Class21.aClass45_322!!), Class17.anInt235, 0), true)
                    Class140.method1170((-107).toByte())
                    Class362.method3511(true, class324, class143, string, i_1_ + 2, var_ha)
                }
                try {
                    Class348_Sub8.aHa6654 = Class104.method958(true, i, Class348_Sub40_Sub4.aD9113, 2 * Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(i_1_ + -32350), Class305.aCanvas3869, Class136.aClass45_4796)
                    if (string != null) {
                        var_ha!!.GA(0)
                        val class143 = method1819(Class17.anInt235, 0, -51, Class104.aClass45_1627!!)
                        val class324 = (var_ha.method3686(class143, Class207.method1519(Class21.aClass45_322!!, Class17.anInt235, 0), true))
                        Class140.method1170((-26).toByte())
                        Class362.method3511(true, class324, class143, string, i_1_ + 2, var_ha)
                    }
                    if (Class348_Sub8.aHa6654!!.method3693()) {
                        var bool_2_ = true
                        try {
                            bool_2_ = (Class348_Sub40_Sub20.aClass348_Sub4_9264!!.anInt6609) > 256
                        } catch (throwable: Throwable) {
                            /* empty */
                        }
                        val var_za: za?
                        if (!bool_2_) var_za = Class348_Sub8.aHa6654!!.method3702(104857600)
                        else var_za = Class348_Sub8.aHa6654!!.method3702(146800640)
                        Class348_Sub8.aHa6654!!.method3651(var_za)
                    }
                } catch (throwable: Throwable) {
                    val i_3_ = Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)
                    if (i_3_ == 2) Class139.aBoolean1952 = true
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271), 0)
                    method2965(string, i_3_, bool, i_1_)
                    return
                } finally {
                    if (var_ha != null) {
                        try {
                            var_ha.method3635((-111).toByte())
                        } catch (throwable: Throwable) {
                            /* empty */
                        }
                    }
                }
            }
            Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1826(!bool, -142238264)
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271), i)
            Class348_Sub49.method3354(i_1_ + -78)
            Class348_Sub8.aHa6654!!.method3650(10000)
            Class348_Sub8.aHa6654!!.X(32)
            Class157.aClass101_2123 = Class348_Sub8.aHa6654!!.method3654()
            Class50_Sub1.aClass101_5209 = Class348_Sub8.aHa6654!!.method3654()
            Class290.method2196((-9).toByte())
            Class348_Sub8.aHa6654!!.method3630(Class316.aClass348_Sub51_3959!!.aClass239_Sub2_7228!!.method1726(-32350) == 1)
            if (Class348_Sub8.aHa6654!!.method3627()) Class348_Sub40_Sub33.method3137(Class316.aClass348_Sub51_3959!!.aClass239_Sub12_7243!!.method1771(-32350) == 1, (-24).toByte())
            Class97.method873(Class367_Sub4.anInt7319 shr 3, 21719, Class348_Sub8.aHa6654, Class348_Sub40_Sub3.anInt9109 shr 3)
            Class76.method773(true)
            r.aBoolean9719 = false
            Class228.aClass57Array2974 = null
            RuntimeException_Sub1.aBoolean4604 = true
            Class348_Sub42_Sub3.method3179(i_1_)
        }

        fun method2966(i: Int, i_4_: Int, bool: Boolean) {
            anInt6864++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, 105.toByte(), 14)
            if (bool != false) aFloatArray6865 = null
            class348_sub42_sub15.method3246(-25490)
            class348_sub42_sub15.anInt9652 = i_4_
        }

        init {
            val d = 3.834951969714103E-4
            for (i in 0..16383) {
                aFloatArray6865!![i] = sin(d * i.toDouble()).toFloat()
                aFloatArray6867!![i] = cos(i.toDouble() * d).toFloat()
            }
        }
    }
}
