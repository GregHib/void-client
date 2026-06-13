/* Class328_Sub2_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class328_Sub2_Sub1 : Class328_Sub2() {
    var aLongArray8800: LongArray? get() = Class328Sub2Sub1Statics.aLongArray8800; set(v) { Class328Sub2Sub1Statics.aLongArray8800 = v }

    @JvmStatic
    fun method2614(i: Int) {
        aLongArray8800 = null
        if (i < 27) method2614(42)
    }
}
