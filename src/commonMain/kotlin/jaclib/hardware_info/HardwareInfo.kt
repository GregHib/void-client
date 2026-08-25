package jaclib.hardware_info

import kotlin.jvm.JvmStatic

expect object HardwareInfo {
    val dXDiagDisplayDevicesProps: Array<Array<String?>?>?

    @JvmStatic
    val cPUInfo: IntArray?

    val openGLProps: Array<String?>?

    val dXDiagSystemProps: Array<String?>?
}
