import Class27.method313
import Class98.Companion.method878

/* Class182 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class182 {
    @JvmField
    var anInt2445: Int = 0
    @JvmField
    var anInt2448: Int = 0
    @JvmField
    var anInt2451: Int = 0
    @JvmField
    var anInt2454: Int = 0
    @JvmField
    var anInt2455: Int = 0
    @JvmField
    var anInt2456: Int = 0

    companion object {
        @JvmField
        var anInt2446: Int = 0
        var anInterface16Array2447: Array<Interface16?>? = null
        @JvmField
        var aClass346_2449: Class346? = null
        var anInt2450: Int = 0
        var anInt2452: Int = 0
        var anInt2453: Int = 0
        @JvmStatic
        fun method1372(i: Int) {
            RuntimeException_Sub1.anInt4596 = i
            Class239_Sub12.anInt5969 = 1
            anInt2452++
            var l = 0L
            if (Class348_Sub23_Sub3.aString9043 == null) {
                Class14_Sub4.method254(35, (-101).toByte())
                return
            } else {
                val class348_sub49 = Class348_Sub49(method878((Class110_Sub1.method1039((Class348_Sub23_Sub3.aString9043!!), true)), -125))
                l = class348_sub49.readLong(-456577760)
                Class348_Sub33.aLong6966 = class348_sub49.readLong(-456577760)
            }
            Class132.method1138(method313(l, -100), true, "", (-115).toByte())
        }

        @JvmStatic
        fun method1373(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int) {
            anInt2450++
            if (Class320.method2547(i, 84.toByte()) && i_5_ == -1391) {
                if (Class369_Sub2.aClass46ArrayArray8584!![i] == null) Client.method107((Class348_Sub40_Sub33.aClass46ArrayArray9427!![i]!!), -1, i_1_, i_10_, i_2_, i_7_, i_0_, i_8_, i_4_, i_3_, i_6_, i_9_)
                else Client.method107(Class369_Sub2.aClass46ArrayArray8584!![i]!!, -1, i_1_, i_10_, i_2_, i_7_, i_0_, i_8_, i_4_, i_3_, i_6_, i_9_)
            }
        }

        fun method1374(i: Int, class348_sub49: Class348_Sub49): Class50_Sub4 {
            if (i < 106) aClass346_2449 = null
            anInt2453++
            return Class50_Sub4(class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255))
        }

        @JvmStatic
        fun method1375(i: Int) {
            if (i != 5616) aClass346_2449 = null
            aClass346_2449 = null
            anInterface16Array2447 = null
        }
    }
}
