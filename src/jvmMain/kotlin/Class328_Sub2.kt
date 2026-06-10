/* Class328_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class328_Sub2 : Class328() {
    companion object {
        var aClass56Array6515: Array<Class56?>? = null
        var anInt6516: Int = 0
        @JvmField
        var aClass60_6517: Class60? = Class60(4)
        var anInt6518: Int = 0

        fun method2612(class348_sub49: Class348_Sub49, bool: Boolean): Class120 {
            anInt6518++
            val i = class348_sub49.readUnsignedShort(842397944)
            if (bool != true) method2613(-27)
            return Class120(i)
        }

        @JvmStatic
        fun method2613(i: Int) {
            aClass56Array6515 = null
            aClass60_6517 = null
            if (i != -1) method2613(58)
        }
    }
}
