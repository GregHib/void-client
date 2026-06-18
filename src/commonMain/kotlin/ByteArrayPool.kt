/* Class37 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ByteArrayPool {
    @JvmField
    var anInt491: Int = 0
    @JvmField
    var anInt492: Int = 0
    @JvmField
    var anInt495: Int = 0
    @JvmField
    var anInt496: Int = 0


    @JvmStatic
    @Synchronized
    fun method357(i: Int, `is`: ByteArray) {
        anInt491++
        if (`is`.size == 100 && anInt9412 < 1000) aByteArrayArray358!![anInt9412++] = `is`
        else {
            if (`is`.size == 5000 && anInt9280 < 250) aByteArrayArray1918!![anInt9280++] = `is`
            else if (`is`.size == 30000 && anInt6913 < 50) aByteArrayArray8505!![anInt6913++] = `is`
            else if (aByteArrayArrayArray9134 != null) {
                var i_2_ = 0
                while (anIntArray8684!!.size > i_2_) {
                    if ((`is`.size == anIntArray8684!![i_2_]) && (aByteArrayArrayArray9134!![i_2_])!!.size > anIntArray2552!![i_2_]) {
                        aByteArrayArrayArray9134!![i_2_]!![anIntArray2552!![i_2_]++] = `is`
                        break
                    }
                    i_2_++
                }
            }
        }
    }

    var anInt493: Int = 0
    var anInt9412: Int = 0
    var anInt9280: Int = 0
    var aByteArrayArray358: Array<ByteArray?>? = arrayOfNulls<ByteArray>(1000)
    var aByteArrayArray1918: Array<ByteArray?>? = arrayOfNulls<ByteArray>(250)
    var anInt6913: Int = 0
    var aByteArrayArray8505: Array<ByteArray?>? = arrayOfNulls<ByteArray>(50)
    var aByteArrayArrayArray9134: Array<Array<ByteArray?>?>? = null
    var anIntArray8684: IntArray? = null
    var anIntArray2552: IntArray? = null
    var anInt9606: Int = 0

    @JvmStatic
    @Synchronized
    fun method359(i: Int, i_9_: Int): ByteArray? {
        anInt493++
        if (i == 100 && anInt9412 > 0) {
            val `is` = aByteArrayArray358!![--anInt9412]
            aByteArrayArray358!![anInt9412] = null
            return `is`
        }
        if (i == 5000 && anInt9280 > 0) {
            val `is` = (aByteArrayArray1918!![--anInt9280])
            aByteArrayArray1918!![anInt9280] = null
            return `is`
        }
        if (i == 30000 && anInt6913 > 0) {
            val `is` = (aByteArrayArray8505!![--anInt6913])
            aByteArrayArray8505!![anInt6913] = null
            return `is`
        }
        if (aByteArrayArrayArray9134 != null) {
            var i_10_ = 0
            while (anIntArray8684!!.size > i_10_) {
                if ((i == anIntArray8684!![i_10_]) && anIntArray2552!![i_10_] > 0) {
                    val `is` = (aByteArrayArrayArray9134!![i_10_]!![--anIntArray2552!![i_10_]])
                    aByteArrayArrayArray9134!![i_10_]!![anIntArray2552!![i_10_]] = null
                    return `is`
                }
                i_10_++
            }
        }
        return ByteArray(i)
    }

    fun method3230(`is`: IntArray?, is_1_: IntArray?, i: Int) {
        try {
            anInt9606++
            if (`is` == null || is_1_ == null) {
                aByteArrayArrayArray9134 = null
                anIntArray2552 = null
                anIntArray8684 = null
            } else {
                anIntArray8684 = `is`
                anIntArray2552 = IntArray(`is`.size)
                aByteArrayArrayArray9134 = arrayOfNulls<Array<ByteArray?>>(`is`.size)
                for (i_2_ in i..<anIntArray8684!!.size) aByteArrayArrayArray9134!![i_2_] = arrayOfNulls<ByteArray>(is_1_[i_2_])
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("db.D(" + (if (`is` != null) "{...}" else "null") + ',' + (if (is_1_ != null) "{...}" else "null") + ',' + i + ')'))
        }
    }
}