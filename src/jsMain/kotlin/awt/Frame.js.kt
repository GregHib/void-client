package awt

import kotlinx.browser.document

actual class Frame actual constructor(title: String) : Container() {
    private var frameTitle: String = title
    private var resizable: Boolean = true
    private var undecorated: Boolean = false
    private var extendedState: Int = FRAME_NORMAL

    actual constructor() : this("")

    init {
        element.style.position = "absolute"
        document.body?.appendChild(element)
        setTitle(title)
    }

    actual fun setTitle(title: String) {
        frameTitle = title
        document.title = title
    }

    actual fun getTitle(): String = frameTitle
    actual fun setResizable(resizable: Boolean) { this.resizable = resizable }
    actual fun isResizable(): Boolean = resizable
    actual fun setUndecorated(undecorated: Boolean) { this.undecorated = undecorated }
    actual fun isUndecorated(): Boolean = undecorated

    actual fun setExtendedState(state: Int) {
        extendedState = state
        if (state and FRAME_MAXIMIZED_BOTH == FRAME_MAXIMIZED_BOTH) {
            element.style.width = "100vw"
            element.style.height = "100vh"
        }
    }

    actual fun getExtendedState(): Int = extendedState

    actual fun pack() { }
    actual fun dispose() { element.remove() }
    actual fun toFront() { element.style.zIndex = "1000" }
    actual fun toBack() { element.style.zIndex = "0" }

    actual fun setLocationRelativeTo(c: Component) {
        element.style.left = "${c.getX() + (c.getWidth() - getWidth()) / 2}px"
        element.style.top = "${c.getY() + (c.getHeight() - getHeight()) / 2}px"
    }
}

actual val FRAME_NORMAL: Int = 0
actual val FRAME_ICONIFIED: Int = 1
actual val FRAME_MAXIMIZED_BOTH: Int = 6