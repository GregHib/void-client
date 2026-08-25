package awt.image

actual typealias ColorModel = java.awt.image.ColorModel

actual val ColorModel.pixelSize: Int
    get() = getPixelSize()

actual val ColorModel.hasAlphaChannel: Boolean
    get() = hasAlpha()

actual val ColorModel.alphaPremultiplied: Boolean
    get() = isAlphaPremultiplied()

actual val rgbDefaultColorModel: ColorModel
    get() = java.awt.image.ColorModel.getRGBdefault()