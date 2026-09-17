import kotlin.jvm.JvmStatic
/* Class229 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RenderConfigFactory {
    companion object {
        var anInt2976: Int = 0
        var anInt2977: Int = 0

        var aJs5Archive_2978: Js5Archive? = null

        var aFloorOverlayTypeList_2979: FloorOverlayTypeList? = null
        var anInt2980: Int = 0

        var aVarbitTypeList_2981: VarbitTypeList? = null

        fun method1631(bool: Boolean): BufferPositionTracker {
            anInt2980++
            if (bool != false) aVarbitTypeList_2981 = null
            try {
                return NanoTimerJagex()
            } catch (throwable: Throwable) {
                try {
                    return NanoTimerSystem()
                } catch (throwable_0_: Throwable) {
                    return NanoTimerHighPrecision()
                }
            }
        }

        @JvmStatic
        fun method1632(i: Int) {
            aJs5Archive_2978 = null
            val i_1_ = -20 / ((-87 - i) / 34)
            aVarbitTypeList_2981 = null
            aFloorOverlayTypeList_2979 = null
        }

        fun method1633(bool: Boolean, i: Int, i_2_: Int): Boolean {
            if (bool != false) method1633(false, 85, -80)
            anInt2977++
            return (0x400 and i) != 0
        }
    }
}
