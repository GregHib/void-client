package awt

actual class Cursor actual constructor(private val type: Int) {
    /** Not part of java.awt.Cursor - the `cursor` CSS value for a CUSTOM_CURSOR,
     *  set by [awt.DefaultToolkit.createCustomCursor]. */
    internal var customCss: String? = null

    actual fun getType(): Int = type

    actual fun getName(): String = when (type) {
        CursorType.DEFAULT_CURSOR -> "Default Cursor"
        CursorType.CROSSHAIR_CURSOR -> "Crosshair Cursor"
        CursorType.TEXT_CURSOR -> "Text Cursor"
        CursorType.WAIT_CURSOR -> "Wait Cursor"
        CursorType.SW_RESIZE_CURSOR -> "SW Resize Cursor"
        CursorType.SE_RESIZE_CURSOR -> "SE Resize Cursor"
        CursorType.NW_RESIZE_CURSOR -> "NW Resize Cursor"
        CursorType.NE_RESIZE_CURSOR -> "NE Resize Cursor"
        CursorType.N_RESIZE_CURSOR -> "N Resize Cursor"
        CursorType.S_RESIZE_CURSOR -> "S Resize Cursor"
        CursorType.W_RESIZE_CURSOR -> "W Resize Cursor"
        CursorType.E_RESIZE_CURSOR -> "E Resize Cursor"
        CursorType.HAND_CURSOR -> "Hand Cursor"
        CursorType.MOVE_CURSOR -> "Move Cursor"
        else -> "Custom Cursor"
    }

    /** Not part of java.awt.Cursor - a JS-only convenience for wiring this
     *  into `HTMLElement.style.cursor`. */
    fun toCssCursor(): String = when (type) {
        CursorType.DEFAULT_CURSOR -> "default"
        CursorType.CROSSHAIR_CURSOR -> "crosshair"
        CursorType.TEXT_CURSOR -> "text"
        CursorType.WAIT_CURSOR -> "wait"
        CursorType.SW_RESIZE_CURSOR -> "sw-resize"
        CursorType.SE_RESIZE_CURSOR -> "se-resize"
        CursorType.NW_RESIZE_CURSOR -> "nw-resize"
        CursorType.NE_RESIZE_CURSOR -> "ne-resize"
        CursorType.N_RESIZE_CURSOR -> "n-resize"
        CursorType.S_RESIZE_CURSOR -> "s-resize"
        CursorType.W_RESIZE_CURSOR -> "w-resize"
        CursorType.E_RESIZE_CURSOR -> "e-resize"
        CursorType.HAND_CURSOR -> "pointer"
        CursorType.MOVE_CURSOR -> "move"
        CursorType.CUSTOM_CURSOR -> customCss ?: "auto"
        else -> "auto"
    }
}


private val predefinedCursors = mutableMapOf<Int, Cursor>()

actual fun getPredefinedCursor(type: Int): Cursor =
    predefinedCursors.getOrPut(type) { Cursor(type) }

actual fun getDefaultCursor(): Cursor = getPredefinedCursor(CursorType.DEFAULT_CURSOR)
