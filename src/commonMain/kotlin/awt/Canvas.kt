package awt

expect open class Canvas() : Component {
    fun createImage(width: Int, height: Int): Image
}

// Property-style API, same shape as your Rectangle extensions
expect var Canvas.ignoreRepaint: Boolean
expect val Canvas.pxWidth: Int
expect val Canvas.pxHeight: Int