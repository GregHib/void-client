package awt.image

import java.awt.image.ColorModel.getRGBdefault

actual typealias ColorModel = java.awt.image.ColorModel

actual val ColorModel.pixelSize: Int
    get() = pixelSize

actual val ColorModel.hasAlphaChannel: Boolean
    get() = hasAlpha()

actual val ColorModel.alphaPremultiplied: Boolean
    get() = isAlphaPremultiplied()

actual val rgbDefaultColorModel: ColorModel
    get() = getRGBdefault()