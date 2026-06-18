package jagtheora.theora

import jagtheora.misc.SimplePeer

class TheoraInfo : SimplePeer() {
    private val colourSpace = 0

    private val versionSubMinor: Byte = 0

    @JvmField
    var fpsNumerator: Int = 0

    private val pixelFormat = 0

    private val picY = 0

    private val aspectDenominator = 0

    private val picWidth = 0

    private val versionMinor: Byte = 0

    private val picX = 0

    private val picHeight = 0

    @JvmField
    var fpsDenominator: Int = 0

    private val versionMajor: Byte = 0

    @JvmField
    var frameWidth: Int = 0

    private val aspectNumerator = 0

    @JvmField
    var frameHeight: Int = 0

    init {
        init()
        check(!this.b())
    }

    external override fun clear()

    companion object {
        init {
            initFields()
        }

        private external fun initFields()

        protected external fun init()
    }
}
