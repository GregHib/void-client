import Class286_Sub3.Companion.method2148
import Class66.method705

/* Class155 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class155 {
    var anInt2108: Int = 0
    var aClass351_2109: Class351? = Class351(19, -1)
    @JvmField
    var aBoolean2110: Boolean = false

    @JvmStatic
    fun method1236(i: Byte) {
        aClass351_2109 = null
    }

    @JvmStatic
    fun method1237(i: Byte, class46: Class46) {
        anInt2108++
        if (i < 69) Class155.method1236((-52).toByte())
        if (r.aBoolean9722) {
            Class296.anInt3775++
            if (class46.anObjectArray679 != null) {
                val class46_0_ = Class348_Sub22.method2957(Class9.anInt169, (-54).toByte(), Class149.anInt2046)
                if (class46_0_ != null) {
                    val class348_sub36 = Class348_Sub36()
                    class348_sub36.aClass46_6989 = class46
                    class348_sub36.aClass46_6983 = class46_0_
                    class348_sub36.anObjectArray6987 = class46.anObjectArray679
                    method705(class348_sub36)
                }
            }
            val class348_sub47 = method2148(Class344.aClass351_4266, Class348_Sub23_Sub2.aClass77_9029, -120)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(100.toByte(), class46.anInt830)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeIntInverseMiddle(Class149.anInt2046, -4086)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-123, Class9.anInt169)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), Class301.anInt3829)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(92, class46.anInt704)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), class46.anInt812)
            Class348_Sub42_Sub14.method3243(-89, class348_sub47)
        }
    }
}
