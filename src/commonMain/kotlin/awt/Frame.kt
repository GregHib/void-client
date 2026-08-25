package awt

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
    fun setLocationRelativeTo(c: Component)
}

expect val FRAME_NORMAL: Int
expect val FRAME_ICONIFIED: Int
expect val FRAME_MAXIMIZED_BOTH: Int