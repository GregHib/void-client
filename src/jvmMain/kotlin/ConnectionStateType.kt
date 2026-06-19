import TexGenMaterialPassStatics.method2161
import java.awt.Frame
import ConnectionStateTypeStatics.anInt1019
import ConnectionStateTypeStatics.anInt1022
import ConnectionStateTypeStatics.aConnectionStateType_1039

/*
 * Class56
 */
class ConnectionStateType internal constructor(i: Int, localizedText: LocalizedText?, localizedText_5_: LocalizedText?, i_6_: Int, i_7_: Int, bool: Boolean, bool_8_: Boolean) {
    @JvmField
    var aLocalizedText_1012: LocalizedText? = null
    var aBoolean1013: Boolean = false
    var aLocalizedText_1015: LocalizedText? = null
    @JvmField
    var aBoolean1016: Boolean = false
    private val anInt1017: Int
    @JvmField
    var anInt1021: Int = 0
    @JvmField
    var anInt1025: Int = 0

    constructor(i: Int, localizedText: LocalizedText?, i_0_: Int) : this(i, localizedText, localizedText, i_0_, i_0_, true, false)

    fun method525(i: Int): Int {
        if (i >= -109) aConnectionStateType_1039 = null
        anInt1019++
        return anInt1017
    }

    override fun toString(): String {
        anInt1022++
        throw IllegalStateException()
    }

    constructor(i: Int, localizedText: LocalizedText?, localizedText_1_: LocalizedText?, i_2_: Int, i_3_: Int) : this(i, localizedText, localizedText_1_, i_2_, i_3_, true, false)

    init {
        try {
            this.aLocalizedText_1012 = localizedText
            this.anInt1021 = i_7_
            anInt1017 = i
            this.anInt1025 = i_6_
            this.aLocalizedText_1015 = localizedText_5_
            this.aBoolean1016 = bool_8_
            this.aBoolean1013 = bool
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("jj.<init>(" + i + ',' + (if (localizedText != null) "{...}" else "null") + ',' + (if (localizedText_5_ != null) "{...}" else "null") + ',' + i_6_ + ',' + i_7_ + ',' + bool + ',' + bool_8_ + ')'))
        }
    }
}
