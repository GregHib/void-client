import java.awt.Component

interface GameApplet {
    fun getParameter(name: String?): String?
    fun getCodeBase(): String?
    fun getDocumentBase(): String?
    fun destroy()
    fun getPulseComponent(): Component?
    fun showDocument(url: String?, target: String?)
}