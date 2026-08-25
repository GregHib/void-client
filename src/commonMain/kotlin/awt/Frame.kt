package awt

import awt.event.WindowListener

expect class Frame(title: String) : Container {
    constructor()

    fun setTitle(title: String)
    fun getTitle(): String
    fun setResizable(resizable: Boolean)
    fun isResizable(): Boolean
    fun setUndecorated(undecorated: Boolean)
    fun isUndecorated(): Boolean
    fun setExtendedState(state: Int)
    fun getExtendedState(): Int
    fun pack()
    fun dispose()
    fun toFront()
    fun toBack()
    fun addWindowListener(listener: WindowListener)
    fun setLocationRelativeTo(c: Component)

    fun enableInputMethods(boolean: Boolean)
}

expect val FRAME_NORMAL: Int
expect val FRAME_ICONIFIED: Int
expect val FRAME_MAXIMIZED_BOTH: Int