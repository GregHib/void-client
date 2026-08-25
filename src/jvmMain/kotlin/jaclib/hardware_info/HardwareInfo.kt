package jaclib.hardware_info

import kotlin.jvm.JvmStatic

actual object HardwareInfo {
    /*private*/actual val dXDiagDisplayDevicesProps: Array<Array<String?>?>?
        external get

    @JvmStatic
    actual val cPUInfo: IntArray?
        external get

    /*private*/actual val openGLProps: Array<String?>?
        external get

    /*private*/actual val dXDiagSystemProps: Array<String?>?
        external get
}
