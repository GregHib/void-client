package awt.image

actual typealias DirectColorModel = java.awt.image.DirectColorModel

actual val DirectColorModel.redMask: Int get() = redMask
actual val DirectColorModel.greenMask: Int get() = greenMask
actual val DirectColorModel.blueMask: Int get() = blueMask
actual val DirectColorModel.alphaMask: Int get() = alphaMask
