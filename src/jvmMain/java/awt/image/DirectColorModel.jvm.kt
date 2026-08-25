package awt.image

actual typealias DirectColorModel = java.awt.image.DirectColorModel

actual val DirectColorModel.redMask: Int get() = getRedMask()
actual val DirectColorModel.greenMask: Int get() = getGreenMask()
actual val DirectColorModel.blueMask: Int get() = getBlueMask()
actual val DirectColorModel.alphaMask: Int get() = getAlphaMask()
