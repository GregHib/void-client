/* Class256 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class256 {
    var anInt3294: Int = 0
    var anIntArray3295: IntArray? = IntArray(25)

    @JvmStatic
    fun method1943(bool: Boolean, i: Int): Class174 {
        anInt3294++
        var class174 = (Class318_Sub1_Sub2.aClass60_8732!!.method583(i.toLong(), -78) as Class174?)
        if (class174 != null) return class174
        val `is` = Class59_Sub2_Sub1.aClass45_8670!!.method410(-1860, 1, i)
        class174 = Class174()
        if (bool != false) method1944(64)
        class174.anInt2303 = i
        if (`is` != null) class174.method1336(83, Class348_Sub49(`is`))
        class174.method1337(-1)
        if (class174.anInt2296 == 2 && (Class59_Sub2_Sub2.aClass356_8679!!.method3480(i.toLong(), -6008) == null)) {
            Class59_Sub2_Sub2.aClass356_8679!!.method3483(87.toByte(), i.toLong(), Class348_Sub35(Class285_Sub1.anInt8492))
            Class19.aClass174Array311!![Class285_Sub1.anInt8492++] = class174
        }
        Class318_Sub1_Sub2.aClass60_8732!!.method582(class174, i.toLong(), (-109).toByte())
        return class174
    }

    @JvmStatic
    fun method1944(i: Int) {
        anIntArray3295 = null
        if (i != 1) method1944(-45)
    }
}
