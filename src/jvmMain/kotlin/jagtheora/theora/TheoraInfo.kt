package jagtheora.theora

import jagtheora.misc.SimplePeer

actual class TheoraInfo : SimplePeer() {
    /*private*/ actual val colourSpace = 0

    /*private*/ actual val versionSubMinor: Byte = 0


    actual var fpsNumerator: Int = 0

    /*private*/ actual val pixelFormat = 0

    /*private*/ actual val picY = 0

    /*private*/ actual val aspectDenominator = 0

    /*private*/ actual val picWidth = 0

    /*private*/ actual val versionMinor: Byte = 0

    /*private*/ actual val picX = 0

    /*private*/ actual val picHeight = 0


    actual var fpsDenominator: Int = 0

    /*private*/ actual val versionMajor: Byte = 0


    actual var frameWidth: Int = 0

    /*private*/ actual val aspectNumerator = 0


    actual var frameHeight: Int = 0

    init {
        init()
        check(!this.b())
    }

    actual external override fun clear()

    actual companion object {
        init {
            initFields()
        }

        /*private*/ actual external fun initFields()

        /*protected*/ actual external fun init()
    }
}
