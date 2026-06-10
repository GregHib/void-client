/* Class320 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class320 {
    var aShort3992: Short = 320
    var anInt3993: Int = 0
    var aFloat3994: Float = 0f

    fun method2547(i: Int, i_0_: Byte): Boolean {
        anInt3993++
        if (Class163.aBooleanArray2162!![i]) return true
        if (!Class229.aClass45_2978!!.method408((-124).toByte(), i)) return false
        val i_1_ = Class229.aClass45_2978!!.method407(0, i)
        if (i_1_ == 0) {
            Class163.aBooleanArray2162!![i] = true
            return true
        }
        if (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i] == null) Class348_Sub40_Sub33.aClass46ArrayArray9427!![i] = arrayOfNulls<Class46>(i_1_)
        var i_2_ = 0
        while (i_1_ > i_2_) {
            if (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i]!![i_2_] == null) {
                val `is` = Class229.aClass45_2978!!.method410(i_0_.toInt() xor 0x717.inv(), i, i_2_)
                if (`is` != null) {
                    val class46 = (Class46().also { Class348_Sub40_Sub33.aClass46ArrayArray9427!![i]!![i_2_] = it })
                    class46.anInt830 = i_2_ + (i shl 16)
                    check(`is`[0].toInt() == -1) { "if1" }
                    class46.method433(Class348_Sub49(`is`), true)
                }
            }
            i_2_++
        }
        if (i_0_.toInt() != 84) aFloat3994 = -0.8522395f
        Class163.aBooleanArray2162!![i] = true
        return true
    }
}
