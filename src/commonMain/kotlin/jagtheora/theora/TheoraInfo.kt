package jagtheora.theora

import jagtheora.misc.SimplePeer

expect class TheoraInfo() : SimplePeer {
    val colourSpace: Int

    val versionSubMinor: Byte

    var fpsNumerator: Int

    val pixelFormat: Int

    val picY: Int

    val aspectDenominator: Int

    val picWidth: Int

    val versionMinor: Byte

    val picX: Int

    val picHeight: Int


    var fpsDenominator: Int

    val versionMajor: Byte


    var frameWidth: Int

    val aspectNumerator: Int


    var frameHeight: Int

    override fun clear()

    companion object {

        /*private*/ fun initFields()

        /*protected*/ fun init()
    }
}
