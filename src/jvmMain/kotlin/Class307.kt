/* Class307 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class307 {
    var anInt3877: Int = 0
    var anInt3878: Int = 0

    @JvmStatic
    fun method2300(class45: Class45?, string: String?, bool: Boolean, i: Byte): Class252? {
        try {
            anInt3877++
            val i_0_ = class45!!.method417(string!!, 0)
            if (i.toInt() != -91) return null
            if (i_0_ == -1) return Class252(0)
            val `is` = class45.method396(i_0_, i.toInt() xor 0x5a.inv())
            val class252 = Class252(`is`!!.size)
            var i_1_ = 0
            var i_2_ = 0
            while (i_1_ < class252.anInt3241) {
                val class348_sub49 = Class348_Sub49(class45.method410(-1860, i_0_, `is`[i_2_++]))
                val i_3_ = class348_sub49.readInt((-126).toByte())
                val i_4_ = class348_sub49.readUnsignedShort(i.toInt() xor 0x3235f8a2.inv())
                val i_5_ = class348_sub49.readUnsignedByte(255)
                if (!bool && i_5_ == 1) class252.anInt3241--
                else {
                    class252.anIntArray3238!![i_1_] = i_3_
                    class252.anIntArray3239!![i_1_] = i_4_
                    i_1_++
                }
            }
            return class252
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wt.A(" + (if (class45 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + bool + ',' + i + ')'))
        }
    }

    fun method2301(i: Byte, i_6_: Int, bool: Boolean): Int {
        anInt3878++
        if (bool) return 0
        val class348_sub13 = Class258_Sub4.method1974((-9).toByte(), i_6_, bool)
        if (class348_sub13 == null) return (Class127_Sub1.aClass271_8378!!.method2044(109, i_6_).anInt9542)
        var i_7_ = 0
        var i_8_ = 0
        while ((i_8_ < class348_sub13.anIntArray6757!!.size)) {
            if (class348_sub13.anIntArray6757!![i_8_] == -1) i_7_++
            i_8_++
        }
        if (i.toInt() != 35) Class307.method2301((-102).toByte(), 43, true)
        i_7_ += (Class127_Sub1.aClass271_8378!!.method2044(82, i_6_).anInt9542 + -class348_sub13.anIntArray6757!!.size)
        return i_7_
    }
}
