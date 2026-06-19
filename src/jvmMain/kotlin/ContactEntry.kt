import CollisionMapAccessor.method2064
import SoundBankPatchStatics.method2929
import kotlin.math.atan2
import kotlin.math.sqrt

/* Class348_Sub42_Sub12 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ContactEntry internal constructor(string: String?, string_15_: String?, i: Int, i_16_: Int, i_17_: Int, l: Long, i_18_: Int, i_19_: Int, bool: Boolean, bool_20_: Boolean, l_21_: Long, bool_22_: Boolean) : HashLinkedListNode() {
    var aString9593: String? = null
    @JvmField
    var aString9595: String? = null
    var aBoolean9597: Boolean = false
    var anInt9599: Int = 0
    var aLong9600: Long = 0
    var aString9601: String? = null
    var anInt9602: Int = 0
    var aLong9605: Long = 0
    var anInt9607: Int = 0
    @JvmField
    var anInt9608: Int = 0
    var anInt9609: Int = 0
    var aBoolean9610: Boolean = false
    var aBoolean9611: Boolean = false

    init {
        try {
            this.anInt9607 = i_19_
            this.anInt9608 = i_16_
            this.anInt9599 = i_17_
            this.aLong9605 = l
            this.aBoolean9610 = bool
            this.aBoolean9597 = bool_20_
            this.aString9601 = string_15_
            this.aBoolean9611 = bool_22_
            this.aString9593 = string
            this.anInt9609 = i
            this.aLong9600 = l_21_
            this.anInt9602 = i_18_
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("db.<init>(" + (if (string != null) "{...}" else "null") + ',' + (if (string_15_ != null) "{...}" else "null") + ',' + i + ',' + i_16_ + ',' + i_17_ + ',' + l + ',' + i_18_ + ',' + i_19_ + ',' + bool + ',' + bool_20_ + ',' + l_21_ + ',' + bool_22_ + ')'))
        }
    }
}
