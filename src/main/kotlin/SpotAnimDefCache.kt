/* Class256 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object SpotAnimDefCache {
    var anInt3294: Int = 0
    var anIntArray3295: IntArray? = IntArray(25)

    @JvmStatic
    fun method1943(bool: Boolean, i: Int): SpotAnimVector {
        anInt3294++
        var spotAnimVector = (Class318_Sub1_Sub2.aClass60_8732!!.method583(i.toLong(), -78) as SpotAnimVector?)
        if (spotAnimVector != null) return spotAnimVector
        val `is` = Class59_Sub2_Sub1.aClass45_8670!!.method410(-1860, 1, i)
        spotAnimVector = SpotAnimVector()
        if (bool != false) method1944(64)
        spotAnimVector.anInt2303 = i
        if (`is` != null) spotAnimVector.method1336(83, Class348_Sub49(`is`))
        spotAnimVector.method1337(-1)
        if (spotAnimVector.anInt2296 == 2 && (Class59_Sub2_Sub2.aClass356_8679!!.method3480(i.toLong(), -6008) == null)) {
            Class59_Sub2_Sub2.aClass356_8679!!.method3483(87.toByte(), i.toLong(), Class348_Sub35(Class285_Sub1.anInt8492))
            WorldListEntry.aSpotAnimVectorArray311s!![Class285_Sub1.anInt8492++] = spotAnimVector
        }
        Class318_Sub1_Sub2.aClass60_8732!!.method582(spotAnimVector, i.toLong(), (-109).toByte())
        return spotAnimVector
    }

    @JvmStatic
    fun method1944(i: Int) {
        anIntArray3295 = null
        if (i != 1) method1944(-45)
    }
}
