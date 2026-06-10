/* Class348_Sub29 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub29 : Class348 {
    var aShort6911: Short = 0

    constructor()

    internal constructor(i: Short) {
        this.aShort6911 = i
    }

    companion object {
        var aClass45_6909: Class45? = null
        var anInt6910: Int = 0
        @JvmStatic
        fun method3003(i: Int) {
            aClass45_6909 = null
            if (i != -4587) method3003(-101)
        }

        fun method3004(class45: Class45?, bool: Boolean, var_d: d?) {
            do {
                try {
                    Class260.aClass45_3309 = class45
                    anInt6910++
                    Class101_Sub1.aD5684 = var_d
                    if (bool == false) break
                    method3004(null, false, null)
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.Companion.method2929(runtimeexception, ("oia.B(" + (if (class45 != null) "{...}" else "null") + ',' + bool + ',' + (if (var_d != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }
    }
}
