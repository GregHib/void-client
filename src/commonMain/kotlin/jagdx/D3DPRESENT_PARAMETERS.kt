package jagdx

import java.awt.Canvas


class D3DPRESENT_PARAMETERS(private val DeviceWindow: Canvas?) {

	var Windowed: Boolean = false

    private val Flags = 0

    private val FullScreen_RefreshRateInHz = 0


	var EnableAutoDepthStencil: Boolean = false

    private val SwapEffect = 1


	var BackBufferFormat: Int = 0


	var MultiSampleQuality: Int = 0


	var MultiSampleType: Int = 0


	var AutoDepthStencilFormat: Int = 0


	var BackBufferHeight: Int = 0


	var PresentationInterval: Int = 0

    private val BackBufferCount = 0


	var BackBufferWidth: Int = 0
}
