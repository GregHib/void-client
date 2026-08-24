package jaclib.hardware_info

import kotlin.jvm.JvmStatic

object HardwareInfo {
    private val dXDiagDisplayDevicesProps: Array<Array<String?>?>?
        external get

    @JvmStatic
    val cPUInfo: IntArray?
        external get

    private val openGLProps: Array<String?>?
        external get

    private val dXDiagSystemProps: Array<String?>?
        external get
}
