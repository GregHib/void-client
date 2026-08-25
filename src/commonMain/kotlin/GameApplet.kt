import awt.Component
import net.URL

interface GameApplet {
    fun getParameter(name: String?): String?
    fun getCodeBase(): URL?
    fun getDocumentBase(): URL?
    fun destroy()
    fun getPulseComponent(): Component?
    fun showDocument(url: URL?, target: String?)
}