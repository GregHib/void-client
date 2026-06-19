/* Class256 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object SpotAnimDefCache {
    var anInt3294: Int = 0
    var aLruByteCache_8732: LruByteCache? = LruByteCache(64)
    var aJs5Archive_8670: Js5Archive? = null
    var aHashtable_8679: Hashtable? = Hashtable(16)
    var anInt8492: Int = 0
    var aSpotAnimVectorArray311s: Array<SpotAnimVector?>? = arrayOfNulls<SpotAnimVector>(16)

    fun method1943(bool: Boolean, i: Int): SpotAnimVector {
        anInt3294++
        var spotAnimVector = (aLruByteCache_8732!!.method583(i.toLong(), -78) as SpotAnimVector?)
        if (spotAnimVector != null) return spotAnimVector
        val `is` = aJs5Archive_8670!!.method410(-1860, 1, i)
        spotAnimVector = SpotAnimVector()
        spotAnimVector.anInt2303 = i
        if (`is` != null) spotAnimVector.method1336(83, ByteBuffer(`is`))
        spotAnimVector.method1337(-1)
        if (spotAnimVector.anInt2296 == 2 && (aHashtable_8679!!.method3480(i.toLong(), -6008) == null)) {
            aHashtable_8679!!.method3483(87.toByte(), i.toLong(), IntKeyNode(anInt8492))
            aSpotAnimVectorArray311s!![anInt8492++] = spotAnimVector
        }
        aLruByteCache_8732!!.method582(spotAnimVector, i.toLong(), (-109).toByte())
        return spotAnimVector
    }

}