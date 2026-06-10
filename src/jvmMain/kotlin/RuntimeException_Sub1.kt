/* RuntimeException_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RuntimeException_Sub1(@JvmField var aThrowable4595: Throwable?, @JvmField var aString4594: String?) : RuntimeException() {
    companion object {
        @JvmField
        var anInt4596: Int
        @JvmField
        var anInt4597: Int = 0
        @JvmField
        var anInt4598: Int = 0
        @JvmField
        var aBoolean4599: Boolean
        @JvmField
        var anInt4600: Int = 52
        @JvmField
        var aClass351_4601: Class351?
        @JvmField
        var aFloatArray4602: FloatArray?
        @JvmField
        var anIntArray4603: IntArray? = null
        @JvmField
        var aBoolean4604: Boolean
        @JvmField
        var anInt4605: Int = 0

        @JvmStatic
        fun method4009(i: Int, `is`: IntArray?, is_0_: IntArray?, i_1_: Int, var_ha_Sub2: ha_Sub2?, i_2_: Int): aa_Sub1 {
            try {
                anInt4597++
                val is_3_ = ByteArray(i * i_2_)
                for (i_4_ in i_1_..<i_2_) {
                    var i_5_ = i * i_4_ - -`is`!![i_4_]
                    for (i_6_ in 0..<is_0_!![i_4_]) is_3_[i_5_++] = (-1).toByte()
                }
                return aa_Sub1(var_ha_Sub2, i, i_2_, is_3_)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("kg.C(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_0_ != null) "{...}" else "null") + ',' + i_1_ + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i_2_ + ')'))
            }
        }

        @JvmStatic
        fun method4010(i: Int) {
            if (i == -3) {
                anIntArray4603 = null
                aFloatArray4602 = null
                aClass351_4601 = null
            }
        }

        @JvmStatic
        fun method4011(i: Int, class45: Class45?) {
            anInt4598++
            if (i != 1024) method4012(null, 68.toByte())
            Client.anInt5171 = 0
            Class348_Sub1_Sub1.anInt8808 = 0
            Class152.aClass243_2077 = Class243()
            Class239_Sub25.aClass318_Sub9_Sub2_Sub1Array6103 = arrayOfNulls<Class318_Sub9_Sub2_Sub1>(1024)
            Class348_Sub51.aClass318_Sub10Array7249 = arrayOfNulls<Class318_Sub10>((Class348_Sub42_Sub9.anIntArray9558!![Class348_Sub6.anInt6637]) + 1)
            Class258_Sub3.anInt8550 = 0
            Class376.anInt4559 = 0
            Class117.method1072(class45, (-107).toByte())
            Class2.method172(30284, class45)
        }

        @JvmStatic
        fun method4012(`is`: ByteArray?, i: Byte) {
            anInt4605++
            val class348_sub49 = Class348_Sub49(`is`)
            val i_7_ = -91 % ((i - -51) / 42)
            var bool = false
            while (true) {
                val i_8_ = class348_sub49.readUnsignedByte(255)
                if (i_8_ == 0) break
                if (i_8_ == 1) {
                    if (Class118.anIntArray1786 == null) {
                        Class118.anIntArray1786 = IntArray(4)
                        Class132.anInt1905 = 4
                        Class106.anIntArray1636 = IntArray(4)
                    }
                    for (i_9_ in Class118.anIntArray1786!!.indices) {
                        Class118.anIntArray1786!![i_9_] = class348_sub49.readShort(13638)
                        Class106.anIntArray1636!![i_9_] = class348_sub49.readShort(13638)
                    }
                    bool = true
                } else if (i_8_ != 2) {
                    if (i_8_ == 3) {
                        Class132.anInt1905 = class348_sub49.readUnsignedByte(255)
                        Class118.anIntArray1786 = IntArray(Class132.anInt1905)
                        Class106.anIntArray1636 = IntArray(Class132.anInt1905)
                    }
                } else Class348_Sub31.anInt6923 = class348_sub49.readUnsignedShort(842397944)
            }
            if (!bool) {
                if (Class118.anIntArray1786 == null) {
                    Class118.anIntArray1786 = IntArray(4)
                    Class106.anIntArray1636 = IntArray(4)
                    Class132.anInt1905 = 4
                }
                for (i_10_ in Class118.anIntArray1786!!.indices) {
                    Class118.anIntArray1786!![i_10_] = 0
                    Class106.anIntArray1636!![i_10_] = i_10_ * 20
                }
            }
        }

        init {
            aBoolean4599 = true
            anInt4596 = -1
            aFloatArray4602 = FloatArray(4)
            aBoolean4604 = false
            aClass351_4601 = Class351(65, 3)
        }
    }
}
