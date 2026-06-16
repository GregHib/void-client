/* Class39 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class39 internal constructor(class377: Class377?, l: Long, i: Int) {
    var aLong517: Long = 0
    private val aClass377_519: Class377?

    @Throws(Throwable::class)
    protected fun finalize() {
        aClass377_519!!.method3966(this.aLong517, 34192)
        anInt516++
//        super.finalize()
    }

    init {
        try {
            this.aLong517 = l
            aClass377_519 = class377
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ifa.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + l + ',' + i + ')'))
        }
    }

    companion object {
        var anInt514: Int = 0
        var aClass74_515: Class74? = Class74(7, 7)
        var anInt516: Int = 0
        var aClass45_518: Class45? = null
        var aClass112_520: Class112? = null
        var aClass323_521: Class323? = null

        fun method366(objects: Array<Any?>?, i: Byte, `is`: IntArray?) {
            do {
                try {
                    Class279.method2092(`is`!!.size - 1, 0, `is`, -119, objects)
                    anInt514++
                    if (i <= -97) break
                    method367(-67)
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("ifa.B(" + (if (objects != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        fun method367(i: Int) {
            aClass45_518 = null
            aClass74_515 = null
            aClass323_521 = null
            if (i == -15833) aClass112_520 = null
        }
    }
}
