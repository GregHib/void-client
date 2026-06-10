import Class348_Sub40_Sub7.Companion.method3064

/* Class159 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class159 {
    @JvmField
    var anInt2125: Int = 0
    private fun method1251(class348_sub49: Class348_Sub49, i: Int, i_0_: Int) {
        if (i == 5) this.anInt2125 = class348_sub49.readUnsignedShort(842397944)
        anInt2126++
        val i_1_ = 60 % ((i_0_ - 33) / 57)
    }

    fun method1253(class348_sub49: Class348_Sub49, bool: Boolean) {
        while (true) {
            val i = class348_sub49.readUnsignedByte(255)
            if (i == 0) break
            method1251(class348_sub49, i, -105)
        }
        anInt2128++
        if (bool != true) this.anInt2125 = 58
    }

    companion object {
        var anInt2124: Int = 0
        var anInt2126: Int = 0
        var anInt2127: Int = 500
        var anInt2128: Int = 0

        fun method1252(i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Byte, i_9_: Int) {
            anInt2124++
            if (Class320.method2547(i_2_, 84.toByte())) {
                var i_11_ = 0
                var i_12_ = 0
                var i_13_ = 0
                var i_14_ = 0
                var i_15_ = 0
                if (Class59_Sub1.aBoolean5300) {
                    i_11_ = Class314.anInt3941
                    i_15_ = Class348_Sub42_Sub16_Sub2.anInt10463
                    i_13_ = Class314.anInt3939
                    i_12_ = Class239.anInt3142
                    i_14_ = Class348_Sub3.anInt6585
                    Class348_Sub42_Sub16_Sub2.anInt10463 = 1
                }
                if (Class369_Sub2.aClass46ArrayArray8584!![i_2_] == null) method3064(i_9_, i, i_4_ < 0, i_5_, i_3_, i_4_, i_6_, false, (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_2_]), -1, i_7_)
                else method3064(i_9_, i, i_4_ < 0, i_5_, i_3_, i_4_, i_6_, false, (Class369_Sub2.aClass46ArrayArray8584!![i_2_]), -1, i_7_)
                if (i_8_ <= 58) anInt2127 = -84
                if (Class59_Sub1.aBoolean5300) {
                    if (i_4_ >= 0 && Class348_Sub42_Sub16_Sub2.anInt10463 == 2) Class338.method2663(-5590, Class314.anInt3941, Class314.anInt3939, Class239.anInt3142, Class348_Sub3.anInt6585)
                    Class348_Sub42_Sub16_Sub2.anInt10463 = i_15_
                    Class314.anInt3939 = i_13_
                    Class239.anInt3142 = i_12_
                    Class348_Sub3.anInt6585 = i_14_
                    Class314.anInt3941 = i_11_
                }
            } else if (i_4_ == -1) {
                for (i_10_ in 0..99) Class152.Companion.aBooleanArray2076!![i_10_] = true
            } else Class152.Companion.aBooleanArray2076!![i_4_] = true
        }
    }
}
