import TexGenMaterialPass.Companion.method2161
import java.awt.Frame

class Class56 private constructor(i: Int, localizedText: LocalizedText?, localizedText_5_: LocalizedText?, i_6_: Int, i_7_: Int, bool: Boolean, bool_8_: Boolean) {
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

    private constructor(i: Int, localizedText: LocalizedText?, i_0_: Int) : this(i, localizedText, localizedText, i_0_, i_0_, true, false)

    fun method525(i: Int): Int {
        if (i >= -109) aClass56_1039 = null
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
            throw SoundBankPatch.method2929(runtimeexception, ("jj.<init>(" + i + ',' + (if (localizedText != null) "{...}" else "null") + ',' + (if (localizedText_5_ != null) "{...}" else "null") + ',' + i_6_ + ',' + i_7_ + ',' + bool + ',' + bool_8_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt1014: Int = 0
        @JvmField
        var aClass56_1018: Class56? = Class56(0, LocalizedText.aLocalizedText_3499, LocalizedText.aLocalizedText_3499, 0, 1)
        @JvmField
        var anInt1019: Int = 0
        @JvmField
        var anInt1020: Int = 0
        @JvmField
        var anInt1022: Int = 0
        @JvmField
        var aClass56_1023: Class56? = Class56(1, LocalizedText.aLocalizedText_3499, 2)
        @JvmField
        var aClass56_1024: Class56? = Class56(2, LocalizedText.aLocalizedText_3499, LocalizedText.aLocalizedText_3499, 2, 3)
        @JvmField
        var aClass56_1026: Class56? = Class56(3, LocalizedText.aLocalizedText_3499, 3)
        @JvmField
        var aClass56_1027: Class56? = Class56(4, LocalizedText.aLocalizedText_3499, LocalizedText.aLocalizedText_3499, 3, 4)
        @JvmField
        var aClass56_1028: Class56? = Class56(5, LocalizedText.aLocalizedText_3499, 4)
        @JvmField
        var aClass56_1029: Class56? = Class56(6, LocalizedText.aLocalizedText_3499, 4)
        @JvmField
        var aClass56_1030: Class56? = Class56(7, LocalizedText.aLocalizedText_3499, LocalizedText.aLocalizedText_3499, 4, 5)
        @JvmField
        var aClass56_1031: Class56? = Class56(8, LocalizedText.aLocalizedText_3499, LocalizedText.aLocalizedText_3499, 5, 98, true, true) //
        @JvmField
        var aClass56_1032: Class56? = Class56(9, LocalizedText.aLocalizedText_3499, 99)
        @JvmField
        var aClass56_1033: Class56? = Class56(10, LocalizedText.aLocalizedText_3499, 100)
        @JvmField
        var aClass56_1034: Class56? = Class56(11, LocalizedText.aLocalizedText_3500, LocalizedText.aLocalizedText_3500, 0, 92, true, true)
        @JvmField
        var aClass56_1035: Class56? = Class56(12, LocalizedText.aLocalizedText_3500, LocalizedText.aLocalizedText_3500, 92, 92)
        private var aClass56_1036: Class56? = Class56(13, LocalizedText.aLocalizedText_3500, LocalizedText.aLocalizedText_3500, 92, 93)
        @JvmField
        var aClass56_1037: Class56? = Class56(14, LocalizedText.aLocalizedText_3500, LocalizedText.aLocalizedText_3500, 94, 95)
        @JvmField
        var aClass56_1038: Class56? = Class56(15, LocalizedText.aLocalizedText_3500, LocalizedText.aLocalizedText_3500, 96, 97)
        @JvmField
        var aClass56_1039: Class56? = Class56(16, LocalizedText.aLocalizedText_3500, 97)
        @JvmField
        var aClass56_1040: Class56? = Class56(17, LocalizedText.aLocalizedText_3500, 97)
        @JvmField
        var aClass56_1041: Class56? = Class56(18, LocalizedText.aLocalizedText_3500, 100)
        @JvmField
        var aClass56_1042: Class56? = Class56(19, LocalizedText.aLocalizedText_3500, 100)
        var aClass56_1043: Class56? = Class56(20, LocalizedText.aLocalizedText_3500, 100)
        @JvmField
        var anInt1044: Int = 0
        @JvmField
        var anIntArray1045: IntArray? = IntArray(2)

        @JvmStatic
        fun method526(i: Int) {
            aClass56_1040 = null
            aClass56_1032 = null
            aClass56_1042 = null
            aClass56_1038 = null
            aClass56_1034 = null
            aClass56_1027 = null
            aClass56_1018 = null
            aClass56_1026 = null
            if (i > 42) {
                aClass56_1039 = null
                aClass56_1031 = null
                aClass56_1043 = null
                aClass56_1033 = null
                aClass56_1024 = null
                aClass56_1029 = null
                aClass56_1023 = null
                aClass56_1036 = null
                anIntArray1045 = null
                aClass56_1041 = null
                aClass56_1030 = null
                aClass56_1037 = null
                aClass56_1028 = null
                aClass56_1035 = null
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
                throw SoundBankPatch.method2929(runtimeexception, ("jj.D(" + (if (frame != null) "{...}" else "null") + ',' + (if (privilegedOperationWorker != null) "{...}" else "null") + ',' + bool + ')'))
            }
        }

        fun method528(i: Int): Array<Class56?> {
            anInt1014++
            val i_4_ = 108 / ((i - 34) / 55)
            return (arrayOf<Class56?>(aClass56_1018, aClass56_1023, aClass56_1024, aClass56_1026, aClass56_1027, aClass56_1028, aClass56_1029, aClass56_1030, aClass56_1031, aClass56_1032, aClass56_1033, aClass56_1034, aClass56_1035, aClass56_1036, aClass56_1037, aClass56_1038, aClass56_1039, aClass56_1040, aClass56_1041, aClass56_1042, aClass56_1043))
        }
    }
}
