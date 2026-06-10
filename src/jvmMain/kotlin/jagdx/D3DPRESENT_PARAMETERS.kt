package jagdx

import java.awt.Canvas


class D3DPRESENT_PARAMETERS(private val DeviceWindow: Canvas?) {
    @JvmField
	var Windowed: Boolean = false

    private val Flags = 0

    private val FullScreen_RefreshRateInHz = 0

    @JvmField
	var EnableAutoDepthStencil: Boolean = false

    private val SwapEffect = 1

    @JvmField
	var BackBufferFormat: Int = 0

    @JvmField
	var MultiSampleQuality: Int = 0

    @JvmField
	var MultiSampleType: Int = 0

    @JvmField
	var AutoDepthStencilFormat: Int = 0

    @JvmField
	var BackBufferHeight: Int = 0

    @JvmField
	var PresentationInterval: Int = 0

    private val BackBufferCount = 0

    @JvmField
	var BackBufferWidth: Int = 0
}
