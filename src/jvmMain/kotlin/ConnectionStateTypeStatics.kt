import TexGenMaterialPass.Companion.method2161
import java.awt.Frame

object ConnectionStateTypeStatics {
    var anInt1014: Int = 0


    var anInt1020: Int = 0

    var anInt1044: Int = 0

    var anIntArray1045: IntArray? = IntArray(2)

    @JvmStatic
    fun method526(i: Int) {
        ConnectionStateType.aConnectionStateType_1040 = null
        ConnectionStateType.aConnectionStateType_1032 = null
        ConnectionStateType.aConnectionStateType_1042 = null
        ConnectionStateType.aConnectionStateType_1038 = null
        ConnectionStateType.aConnectionStateType_1034 = null
        ConnectionStateType.aConnectionStateType_1027 = null
        ConnectionStateType.aConnectionStateType_1018 = null
        ConnectionStateType.aConnectionStateType_1026 = null
        if (i > 42) {
            ConnectionStateType.aConnectionStateType_1039 = null
            ConnectionStateType.aConnectionStateType_1031 = null
            ConnectionStateType.aConnectionStateType_1043 = null
            ConnectionStateType.aConnectionStateType_1033 = null
            ConnectionStateType.aConnectionStateType_1024 = null
            ConnectionStateType.aConnectionStateType_1029 = null
            ConnectionStateType.aConnectionStateType_1023 = null
            ConnectionStateType.aConnectionStateType_1036 = null
            anIntArray1045 = null
            ConnectionStateType.aConnectionStateType_1041 = null
            ConnectionStateType.aConnectionStateType_1030 = null
            ConnectionStateType.aConnectionStateType_1037 = null
            ConnectionStateType.aConnectionStateType_1028 = null
            ConnectionStateType.aConnectionStateType_1035 = null
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
        return (arrayOf<ConnectionStateType?>(
            ConnectionStateType.aConnectionStateType_1018,
            ConnectionStateType.aConnectionStateType_1023,
            ConnectionStateType.aConnectionStateType_1024,
            ConnectionStateType.aConnectionStateType_1026,
            ConnectionStateType.aConnectionStateType_1027,
            ConnectionStateType.aConnectionStateType_1028,
            ConnectionStateType.aConnectionStateType_1029,
            ConnectionStateType.aConnectionStateType_1030,
            ConnectionStateType.aConnectionStateType_1031,
            ConnectionStateType.aConnectionStateType_1032,
            ConnectionStateType.aConnectionStateType_1033,
            ConnectionStateType.aConnectionStateType_1034,
            ConnectionStateType.aConnectionStateType_1035,
            ConnectionStateType.aConnectionStateType_1036,
            ConnectionStateType.aConnectionStateType_1037,
            ConnectionStateType.aConnectionStateType_1038,
            ConnectionStateType.aConnectionStateType_1039,
            ConnectionStateType.aConnectionStateType_1040,
            ConnectionStateType.aConnectionStateType_1041,
            ConnectionStateType.aConnectionStateType_1042,
            ConnectionStateType.aConnectionStateType_1043
        ))
    }
}
