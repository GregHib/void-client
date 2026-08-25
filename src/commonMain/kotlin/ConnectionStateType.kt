import kotlin.jvm.JvmStatic
import TexGenMaterialPass.Companion.method2161
import awt.Frame

/*
 * Class56
 */
class ConnectionStateType private constructor(i: Int, localizedText: LocalizedText?, localizedText_5_: LocalizedText?, i_6_: Int, i_7_: Int, bool: Boolean, bool_8_: Boolean) {

    var aLocalizedText_1012: LocalizedText? = null
    var aBoolean1013: Boolean = false
    var aLocalizedText_1015: LocalizedText? = null

    var aBoolean1016: Boolean = false
    private val anInt1017: Int

    var anInt1021: Int = 0

    var anInt1025: Int = 0

    private constructor(i: Int, localizedText: LocalizedText?, i_0_: Int) : this(i, localizedText, localizedText, i_0_, i_0_, true, false)

    fun method525(i: Int): Int {
        if (i >= -109) aConnectionStateType_1039 = null
        anInt1019++
        return anInt1017
    }

    override fun toString(): String {
        anInt1022++
        throw IllegalStateException()
    }

    private constructor(i: Int, localizedText: LocalizedText?, localizedText_1_: LocalizedText?, i_2_: Int, i_3_: Int) : this(i, localizedText, localizedText_1_, i_2_, i_3_, true, false)

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
            throw TextureLoadException.method2929(runtimeexception, ("jj.<init>(" + i + ',' + (if (localizedText != null) "{...}" else "null") + ',' + (if (localizedText_5_ != null) "{...}" else "null") + ',' + i_6_ + ',' + i_7_ + ',' + bool + ',' + bool_8_ + ')'))
        }
    }

    companion object {

        var anInt1014: Int = 0

        var aConnectionStateType_1018: ConnectionStateType? = ConnectionStateType(0, LocalizedText.aLocalizedText_3499, LocalizedText.aLocalizedText_3499, 0, 1)

        var anInt1019: Int = 0

        var anInt1020: Int = 0

        var anInt1022: Int = 0

        var aConnectionStateType_1023: ConnectionStateType? = ConnectionStateType(1, LocalizedText.aLocalizedText_3499, 2)

        var aConnectionStateType_1024: ConnectionStateType? = ConnectionStateType(2, LocalizedText.aLocalizedText_3499, LocalizedText.aLocalizedText_3499, 2, 3)

        var aConnectionStateType_1026: ConnectionStateType? = ConnectionStateType(3, LocalizedText.aLocalizedText_3499, 3)

        var aConnectionStateType_1027: ConnectionStateType? = ConnectionStateType(4, LocalizedText.aLocalizedText_3499, LocalizedText.aLocalizedText_3499, 3, 4)

        var aConnectionStateType_1028: ConnectionStateType? = ConnectionStateType(5, LocalizedText.aLocalizedText_3499, 4)

        var aConnectionStateType_1029: ConnectionStateType? = ConnectionStateType(6, LocalizedText.aLocalizedText_3499, 4)

        var aConnectionStateType_1030: ConnectionStateType? = ConnectionStateType(7, LocalizedText.aLocalizedText_3499, LocalizedText.aLocalizedText_3499, 4, 5)

        var aConnectionStateType_1031: ConnectionStateType? = ConnectionStateType(8, LocalizedText.aLocalizedText_3499, LocalizedText.aLocalizedText_3499, 5, 98, true, true) //

        var aConnectionStateType_1032: ConnectionStateType? = ConnectionStateType(9, LocalizedText.aLocalizedText_3499, 99)

        var aConnectionStateType_1033: ConnectionStateType? = ConnectionStateType(10, LocalizedText.aLocalizedText_3499, 100)

        var aConnectionStateType_1034: ConnectionStateType? = ConnectionStateType(11, LocalizedText.aLocalizedText_3500, LocalizedText.aLocalizedText_3500, 0, 92, true, true)

        var aConnectionStateType_1035: ConnectionStateType? = ConnectionStateType(12, LocalizedText.aLocalizedText_3500, LocalizedText.aLocalizedText_3500, 92, 92)
        private var aConnectionStateType_1036: ConnectionStateType? = ConnectionStateType(13, LocalizedText.aLocalizedText_3500, LocalizedText.aLocalizedText_3500, 92, 93)

        var aConnectionStateType_1037: ConnectionStateType? = ConnectionStateType(14, LocalizedText.aLocalizedText_3500, LocalizedText.aLocalizedText_3500, 94, 95)

        var aConnectionStateType_1038: ConnectionStateType? = ConnectionStateType(15, LocalizedText.aLocalizedText_3500, LocalizedText.aLocalizedText_3500, 96, 97)

        var aConnectionStateType_1039: ConnectionStateType? = ConnectionStateType(16, LocalizedText.aLocalizedText_3500, 97)

        var aConnectionStateType_1040: ConnectionStateType? = ConnectionStateType(17, LocalizedText.aLocalizedText_3500, 97)

        var aConnectionStateType_1041: ConnectionStateType? = ConnectionStateType(18, LocalizedText.aLocalizedText_3500, 100)

        var aConnectionStateType_1042: ConnectionStateType? = ConnectionStateType(19, LocalizedText.aLocalizedText_3500, 100)
        var aConnectionStateType_1043: ConnectionStateType? = ConnectionStateType(20, LocalizedText.aLocalizedText_3500, 100)

        var anInt1044: Int = 0

        var anIntArray1045: IntArray? = IntArray(2)

        @JvmStatic
        fun method526(i: Int) {
            aConnectionStateType_1040 = null
            aConnectionStateType_1032 = null
            aConnectionStateType_1042 = null
            aConnectionStateType_1038 = null
            aConnectionStateType_1034 = null
            aConnectionStateType_1027 = null
            aConnectionStateType_1018 = null
            aConnectionStateType_1026 = null
            if (i > 42) {
                aConnectionStateType_1039 = null
                aConnectionStateType_1031 = null
                aConnectionStateType_1043 = null
                aConnectionStateType_1033 = null
                aConnectionStateType_1024 = null
                aConnectionStateType_1029 = null
                aConnectionStateType_1023 = null
                aConnectionStateType_1036 = null
                anIntArray1045 = null
                aConnectionStateType_1041 = null
                aConnectionStateType_1030 = null
                aConnectionStateType_1037 = null
                aConnectionStateType_1028 = null
                aConnectionStateType_1035 = null
            }
        }

        @JvmStatic
        fun method527(frame: Frame?, privilegedOperationWorker: PrivilegedOperationWorker?, bool: Boolean) {
            try {
                anInt1020++
                while (true) {
                    val class144 = privilegedOperationWorker!!.method2248(89.toByte(), frame)
                    while (class144!!.anInt1997 == 0) TexGenMaterialPass.method2161((-124).toByte(), 10L)
                    if (class144.anInt1997 == 1) break
                    method2161(33.toByte(), 100L)
                }
                frame!!.setVisible(bool)
                frame.dispose()
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("jj.D(" + (if (frame != null) "{...}" else "null") + ',' + (if (privilegedOperationWorker != null) "{...}" else "null") + ',' + bool + ')'))
            }
        }

        fun method528(i: Int): Array<ConnectionStateType?> {
            anInt1014++
            val i_4_ = 108 / ((i - 34) / 55)
            return (arrayOf<ConnectionStateType?>(aConnectionStateType_1018, aConnectionStateType_1023, aConnectionStateType_1024, aConnectionStateType_1026, aConnectionStateType_1027, aConnectionStateType_1028, aConnectionStateType_1029, aConnectionStateType_1030, aConnectionStateType_1031, aConnectionStateType_1032, aConnectionStateType_1033, aConnectionStateType_1034, aConnectionStateType_1035, aConnectionStateType_1036, aConnectionStateType_1037, aConnectionStateType_1038, aConnectionStateType_1039, aConnectionStateType_1040, aConnectionStateType_1041, aConnectionStateType_1042, aConnectionStateType_1043))
        }
    }
}
