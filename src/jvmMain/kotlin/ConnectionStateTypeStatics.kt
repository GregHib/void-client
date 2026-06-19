import TexGenMaterialPassStatics.method2161
import java.awt.Frame

object ConnectionStateTypeStatics {
    @JvmField
            var anInt1014: Int = 0
            @JvmField
            var aConnectionStateType_1018: ConnectionStateType? = ConnectionStateType(0, LocalizedTextStatics.aLocalizedText_3499, LocalizedTextStatics.aLocalizedText_3499, 0, 1)
            @JvmField
            var anInt1019: Int = 0
            @JvmField
            var anInt1020: Int = 0
            @JvmField
            var anInt1022: Int = 0
            @JvmField
            var aConnectionStateType_1023: ConnectionStateType? = ConnectionStateType(1, LocalizedTextStatics.aLocalizedText_3499, 2)
            @JvmField
            var aConnectionStateType_1024: ConnectionStateType? = ConnectionStateType(2, LocalizedTextStatics.aLocalizedText_3499, LocalizedTextStatics.aLocalizedText_3499, 2, 3)
            @JvmField
            var aConnectionStateType_1026: ConnectionStateType? = ConnectionStateType(3, LocalizedTextStatics.aLocalizedText_3499, 3)
            @JvmField
            var aConnectionStateType_1027: ConnectionStateType? = ConnectionStateType(4, LocalizedTextStatics.aLocalizedText_3499, LocalizedTextStatics.aLocalizedText_3499, 3, 4)
            @JvmField
            var aConnectionStateType_1028: ConnectionStateType? = ConnectionStateType(5, LocalizedTextStatics.aLocalizedText_3499, 4)
            @JvmField
            var aConnectionStateType_1029: ConnectionStateType? = ConnectionStateType(6, LocalizedTextStatics.aLocalizedText_3499, 4)
            @JvmField
            var aConnectionStateType_1030: ConnectionStateType? = ConnectionStateType(7, LocalizedTextStatics.aLocalizedText_3499, LocalizedTextStatics.aLocalizedText_3499, 4, 5)
            @JvmField
            var aConnectionStateType_1031: ConnectionStateType? = ConnectionStateType(8, LocalizedTextStatics.aLocalizedText_3499, LocalizedTextStatics.aLocalizedText_3499, 5, 98, true, true) //
            @JvmField
            var aConnectionStateType_1032: ConnectionStateType? = ConnectionStateType(9, LocalizedTextStatics.aLocalizedText_3499, 99)
            @JvmField
            var aConnectionStateType_1033: ConnectionStateType? = ConnectionStateType(10, LocalizedTextStatics.aLocalizedText_3499, 100)
            @JvmField
            var aConnectionStateType_1034: ConnectionStateType? = ConnectionStateType(11, LocalizedTextStatics.aLocalizedText_3500, LocalizedTextStatics.aLocalizedText_3500, 0, 92, true, true)
            @JvmField
            var aConnectionStateType_1035: ConnectionStateType? = ConnectionStateType(12, LocalizedTextStatics.aLocalizedText_3500, LocalizedTextStatics.aLocalizedText_3500, 92, 92)
            private var aConnectionStateType_1036: ConnectionStateType? = ConnectionStateType(13, LocalizedTextStatics.aLocalizedText_3500, LocalizedTextStatics.aLocalizedText_3500, 92, 93)
            @JvmField
            var aConnectionStateType_1037: ConnectionStateType? = ConnectionStateType(14, LocalizedTextStatics.aLocalizedText_3500, LocalizedTextStatics.aLocalizedText_3500, 94, 95)
            @JvmField
            var aConnectionStateType_1038: ConnectionStateType? = ConnectionStateType(15, LocalizedTextStatics.aLocalizedText_3500, LocalizedTextStatics.aLocalizedText_3500, 96, 97)
            @JvmField
            var aConnectionStateType_1039: ConnectionStateType? = ConnectionStateType(16, LocalizedTextStatics.aLocalizedText_3500, 97)
            @JvmField
            var aConnectionStateType_1040: ConnectionStateType? = ConnectionStateType(17, LocalizedTextStatics.aLocalizedText_3500, 97)
            @JvmField
            var aConnectionStateType_1041: ConnectionStateType? = ConnectionStateType(18, LocalizedTextStatics.aLocalizedText_3500, 100)
            @JvmField
            var aConnectionStateType_1042: ConnectionStateType? = ConnectionStateType(19, LocalizedTextStatics.aLocalizedText_3500, 100)
            var aConnectionStateType_1043: ConnectionStateType? = ConnectionStateType(20, LocalizedTextStatics.aLocalizedText_3500, 100)
            @JvmField
            var anInt1044: Int = 0
            @JvmField
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
                        while (class144!!.anInt1997 == 0) TexGenMaterialPassStatics.method2161((-124).toByte(), 10L)
                        if (class144.anInt1997 == 1) break
                        method2161(33.toByte(), 100L)
                    }
                    frame!!.setVisible(bool)
                    frame.dispose()
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("jj.D(" + (if (frame != null) "{...}" else "null") + ',' + (if (privilegedOperationWorker != null) "{...}" else "null") + ',' + bool + ')'))
                }
            }
    
            fun method528(i: Int): Array<ConnectionStateType?> {
                anInt1014++
                val i_4_ = 108 / ((i - 34) / 55)
                return (arrayOf<ConnectionStateType?>(aConnectionStateType_1018, aConnectionStateType_1023, aConnectionStateType_1024, aConnectionStateType_1026, aConnectionStateType_1027, aConnectionStateType_1028, aConnectionStateType_1029, aConnectionStateType_1030, aConnectionStateType_1031, aConnectionStateType_1032, aConnectionStateType_1033, aConnectionStateType_1034, aConnectionStateType_1035, aConnectionStateType_1036, aConnectionStateType_1037, aConnectionStateType_1038, aConnectionStateType_1039, aConnectionStateType_1040, aConnectionStateType_1041, aConnectionStateType_1042, aConnectionStateType_1043))
            }
}
