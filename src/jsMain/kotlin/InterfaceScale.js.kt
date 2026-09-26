import awt.UiScale

actual fun setInterfaceScale(scale: Int): String {
    if (scale !in UiScale.MIN..UiScale.MAX) return "Interface scale must be between ${UiScale.MIN} and ${UiScale.MAX}"
    UiScale.set(scale)
    // Shrinks the loader's logical size; Client.method116 notices on its next poll and resizes the
    // canvas, renderer and root interface itself.
    JsLoader.instance?.resize()
    return "Interface scale: x$scale"
}

actual fun getInterfaceScale(): Int = UiScale.factor
