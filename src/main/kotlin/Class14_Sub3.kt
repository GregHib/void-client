import GameAppletFrame.Companion.method94
import Class348_Sub40_Sub3.Companion.method3055
import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage3Dub
import java.io.IOException

class Class14_Sub3 internal constructor(class377: Class377?, class304: Class304?, i: Int, i_0_: Int, i_1_: Int, `is`: ByteArray?) : Class14(class377, 32879, class304, Class68.aClass68_1183, i_0_ * (i * i_1_), false), Interface18_Impl1 {
    private val anInt8626: Int
    private val anInt8629: Int
    private val anInt8631: Int

    init {
        try {
            anInt8626 = i_1_
            anInt8631 = i
            anInt8629 = i_0_
            this.aClass377_5082!!.method3850(86.toByte(), this)
            glPixelStorei(3317, 1)
            glTexImage3Dub(this.anInt5093, 0, this.method228(105), anInt8631, anInt8629, anInt8626, 0, method3055(109, this.aClass304_5084), 5121, `is`, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qba.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt8624: Int = 0
        @JvmField
        var anInt8625: Int = 0
        @JvmField
        var anInt8627: Int = 0
        @JvmField
        var anInt8628: Int = 0
        @JvmField
        var anInt8630: Int = 0
        @JvmField
        var anInt8632: Int = 0

        @JvmStatic
        fun method247(i: Int): Class348_Sub51? {
            anInt8632++
            var class234: Class234? = null
            var class348_sub51 = Class348_Sub51(Class348_Sub42_Sub8_Sub2.aClass230_10434, 0)
            try {
                val class144 = Class348_Sub23_Sub1.aClass297_8992!!.method2233((-46).toByte(), "", true)
                while (class144!!.anInt1997 == 0) Class286_Sub5.method2161((-85).toByte(), 1L)
                if (class144.anInt1997 == 1) {
                    class234 = class144.anObject1998 as Class234?
                    val `is` = ByteArray(class234!!.method1662((-46).toByte()).toInt())
                    var i_2_: Int
                    var i_3_ = 0
                    while (`is`.size > i_3_) {
                        i_2_ = class234.method1656(`is`, i_3_, (-49).toByte(), -i_3_ + `is`.size)
                        if (i_2_ == -1) throw IOException("EOF")
                        i_3_ += i_2_
                    }
                    class348_sub51 = Class348_Sub51(Class348_Sub49(`is`), (Class348_Sub42_Sub8_Sub2.aClass230_10434), 0)
                }
            } catch (exception: Exception) {
                /* empty */
            }
            if (i != 24916) return null
            try {
                if (class234 != null) class234.method1657(false)
            } catch (exception: Exception) {
                /* empty */
            }
            return class348_sub51
        }

        @JvmStatic
        fun method248(i: Int): Array<IntRange?> {
            anInt8624++
            if (i != -11271) method249(39)
            return (arrayOf<IntRange?>(
                Class166.aIntRange_2183,
                Class295.aIntRange_3751,
                Class318_Sub1_Sub5_Sub2.aIntRange_10168,
                Class356.aIntRange_4388,
                Class17.aIntRange_250,
                Class330.aIntRange_4126,
                Class254.aIntRange_3264,
                Class239.aIntRange_3143,
                CollisionMapRegion.aIntRange_1722,
                Class348_Sub42_Sub3.aIntRange_9503,
                ScrollingWidgetComponentNode.aIntRange_8385,
                Class318_Sub1.aIntRange_6383,
                Class202.aIntRange_2665,
                Class359.aIntRange_4421,
                Class346_Sub1.aIntRange_6528,
                Class19.aIntRange_315,
                Class367_Sub11.aIntRange_7398,
                Class239_Sub14.aIntRange_5992,
                ScrollingWidgetComponentNode.aIntRange_8384,
                Class20.aIntRange_318,
                Class133.aIntRange_1917,
                Class367_Sub3.aIntRange_7301,
                Class361.aIntRange_4433,
                Class318_Sub1_Sub5_Sub2.aIntRange_10149,
                AbstractMenuEntry.aIntRange_1702,
                Class168.aIntRange_2248,
                Class239_Sub20.aIntRange_6056,
                Class312.aIntRange_3925,
                Class348_Sub40_Sub16.aIntRange_9225,
                Class292.aIntRange_4798,
                Class5_Sub2.aIntRange_8365,
                Class352.aIntRange_4331,
                Class239_Sub26.aIntRange_6121,
                Class348_Sub38.aIntRange_7015,
                Class239_Sub4.aIntRange_5883,
                Class59.aIntRange_1068,
                Class348_Sub45.aIntRange_7106,
                Class367_Sub9.aIntRange_7367,
                Class131.aIntRange_1901,
                Class135_Sub1.aIntRange_4707,
                Class13.aIntRange_220,
                Class239_Sub24.aIntRange_6089,
                IOException_Sub1.aIntRange_90,
                Class252.aIntRange_3240,
                Class298.aIntRange_3809,
                Class271.aIntRange_3467,
                Class239_Sub21.aIntRange_6058,
                Class185.aIntRange_2483,
                Class255.aIntRange_3265,
                Class228.aIntRange_2972,
                InputSettingsState.aIntRange_1762,
                Class15.aIntRange_229,
                MinimapStateReset.aIntRange_1871,
                Class63.aIntRange_1120,
                Class74.aIntRange_1234,
                Class296.aIntRange_3773,
                Class260.aIntRange_3307,
                Class174.aIntRange_2305,
                Class369_Sub2.aIntRange_8590,
                Class28.aIntRange_4998,
                Class172.aIntRange_2279,
                Class348_Sub40_Sub12.aIntRange_9197,
                Class348_Sub47.aIntRange_7124,
                Class264.aIntRange_3371,
                Class239_Sub11.aIntRange_5950,
                Class22.aIntRange_330,
                Class47.aIntRange_843,
                Class345.aIntRange_4272,
                Class151.aIntRange_2068,
                Class239_Sub11.aIntRange_5949,
                Class19.aIntRange_304,
                InputStream_Sub2.aIntRange_82,
                Class348_Sub42_Sub8.aIntRange_9552,
                Class348_Sub40_Sub19.aIntRange_9254,
                Class314_Sub1.aIntRange_6340,
                InputStream_Sub1.aIntRange_79,
                Class73.aIntRange_4779,
                Class173.aIntRange_2285,
                Class63.aIntRange_1123,
                Class280.aIntRange_3641,
                Class176.aIntRange_2335,
                Class140.aIntRange_1959,
                Class318_Sub6.aIntRange_6424,
                Class348_Sub1_Sub2.aIntRange_8817,
                Class133.aIntRange_1914,
                Class348_Sub40_Sub24.aIntRange_9324,
                Class348_Sub41.aIntRange_7052,
                Class345.aIntRange_4269,
                Class365.aIntRange_4477,
                Class239_Sub22.aIntRange_6075,
                Class322.aIntRange_4027,
                Class348_Sub40_Sub15.aIntRange_9216,
                Class178.aIntRange_2338,
                Class267.aIntRange_3427,
                Class205.aIntRange_2693,
                Class20.aIntRange_316,
                Class367_Sub4.aIntRange_7324,
                Class348_Sub46.aIntRange_7113,
                Class189.aIntRange_2527,
                Class168.aIntRange_2255,
                Class59_Sub2_Sub2.aIntRange_8683,
                Class348_Sub45.aIntRange_7105,
                Class348_Sub40_Sub19.aIntRange_9257,
                Class367_Sub8.aIntRange_7363,
                Class348_Sub40_Sub22.aIntRange_9285,
                Class367_Sub4.aIntRange_7323,
                Class218.aIntRange_2860,
                Class318_Sub1_Sub3.aIntRange_8756,
                Class239.aIntRange_3135,
                Class348_Sub42_Sub8.aIntRange_9550,
                Class3.aIntRange_123,
                Class167.aIntRange_2196,
                Class264.aIntRange_3368,
                Class95.aIntRange_1540,
                Class303.aIntRange_3842,
                Class239_Sub15.aIntRange_5997,
                Class321.aIntRange_4015,
                Class368.aIntRange_4500,
                Class209.aIntRange_2717,
                FloatCameraTransform.aIntRange_5742,
                Class176.aIntRange_2331
            ))
        }

        @JvmStatic
        fun method249(i: Int) {
            anInt8627++
            Class286_Sub1.aStringArray6200 = arrayOfNulls<String>(500)
            Class348_Sub31_Sub2.anInt9077 = 2 + (Class369.aClass143_4962!!.anInt1993 + Class369.aClass143_4962!!.anInt1988)
            Class68.anInt1188 = (Class246.aClass143_3179!!.anInt1988 - (-Class246.aClass143_3179!!.anInt1993 - i))
            var i_4_ = 0
            while ((i_4_ < Class286_Sub1.aStringArray6200!!.size)) {
                Class286_Sub1.aStringArray6200!![i_4_] = ""
                i_4_++
            }
            method94(Class274.aClass274_3483!!.method2063(Class348_Sub33.anInt6967, 544)!!, 67)
        }
    }
}
