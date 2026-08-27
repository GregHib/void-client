import awt.Component
import awt.Panel
import io.CachePersistence
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import net.URL

/**
 * Browser equivalent of jvmMain's Loader. It cannot extend that class (it is JVM-only and pulls in
 * Swing), so it reimplements the same contract: an awt.Panel that also acts as the GameApplet
 * supplying the applet parameter map.
 *
 * Panel is the required supertype, not a convenience - GameAppletFrame.runPrelude does
 * `anApplet1530!!.getPulseComponent() as? Container` then `container as Panel`, and this panel is
 * also the container the render canvas is added to in method87.
 */
class JsLoader : Panel(), GameApplet {

    private val params: MutableMap<String, String> = mutableMapOf()

    fun boot() {
        setParms()
        element.style.position = "relative"
        resize()
        window.addEventListener("resize", { resize() })
        (document.getElementById("client") ?: document.body!!).appendChild(element)

        GlobalScope.launch {
            CachePersistence.hydrate()
            GameAppletFrame.provideLoaderApplet(this@JsLoader)
            val client = Client()
            client.init()
            client.start()
            CachePersistence.startAutoFlush()
        }
    }

    private fun resize() {
        setSize(window.innerWidth, window.innerHeight)
    }

    /** Ported verbatim from jvmMain Loader.setParms(). */
    private fun setParms() {
        params["cabbase"] = "g.cab"
        params["java_arguments"] = "-Xmx102m -Dsun.java2d.noddraw=true"
        params["colourid"] = "0"
        params["worldid"] = "16"
        params["lobbyid"] = "15"
        params["lobbyaddress"] = ADDRESS
        params["demoid"] = "0"
        params["demoaddress"] = ""
        params["modewhere"] = "0"
        params["modewhat"] = "0"
        params["lang"] = "0"
        params["objecttag"] = "0"
        params["js"] = "1"
        params["game"] = "0"
        params["affid"] = "0"
        params["advert"] = "1"
        params["settings"] = "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk"
        params["country"] = "0"
        params["haveie6"] = "0"
        params["havefirefox"] = "1"
        params["cookieprefix"] = ""
        params["cookiehost"] = "127.0.0.3"
        params["cachesubdirid"] = "0"
        params["crashurl"] = ""
        params["unsignedurl"] = ""
        params["sitesettings_member"] = "1"
        params["frombilling"] = "false"
        params["sskey"] = ""
        params["force64mb"] = "false"
        params["worldflags"] = "8"
    }

    override fun getParameter(name: String?): String? = params[name]

    override fun getCodeBase(): URL = URL("http://$ADDRESS")

    override fun getDocumentBase(): URL = getCodeBase()

    override fun destroy() {
    }

    override fun getPulseComponent(): Component = this

    /**
     * Deliberately not a real navigation. GameAppletFrame.method82 calls this on any error
     * ("js5connect", "crash"), and navigating away would replace the very screen we want to show.
     */
    override fun showDocument(url: URL?, target: String?) {
        println("showDocument: $url (target=$target)")
    }

    companion object {
        const val ADDRESS = "127.0.0.1"
    }
}

fun main() {
    JsLoader().boot()
}
