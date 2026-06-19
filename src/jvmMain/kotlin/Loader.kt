import GameAppletFrameStatics.provideLoaderApplet
import java.awt.BorderLayout
import java.awt.Component
import java.awt.Dimension
import java.awt.Image
import java.awt.Panel
import java.math.BigInteger
import java.net.URL
import java.util.*
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JPanel
import LoaderStatics.aProperties1
import LoaderStatics.loadRunescape
import LoaderStatics.address
import LoaderStatics.debug
import LoaderStatics.port
import LoaderStatics.trace

class Loader : Panel(), GameApplet {
    var aJFrame2: JFrame? = null
    var aJPanel3: JPanel = JPanel()
    fun init() {
        doApplet()
    }

    fun doApplet() {
        setParms()
        startClient()
    }

    fun doFrame() {
        setParms()
        openFrame()
        startClient()
    }

    fun setParms() {
        aProperties1.put("cabbase", "g.cab")
        aProperties1.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true")
        aProperties1.put("colourid", "0")
        aProperties1.put("worldid", "16")
        aProperties1.put("lobbyid", "15")
        aProperties1.put("lobbyaddress", if (loadRunescape) "lobby16.runescape.com" else address)
        aProperties1.put("demoid", "0")
        aProperties1.put("demoaddress", "")
        aProperties1.put("modewhere", "0")
        aProperties1.put("modewhat", "0")
        aProperties1.put("lang", "0")
        aProperties1.put("objecttag", "0")
        aProperties1.put("js", "1")
        aProperties1.put("game", "0")
        aProperties1.put("affid", "0")
        aProperties1.put("advert", "1")
        aProperties1.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk")
        aProperties1.put("country", "0")
        aProperties1.put("haveie6", "0")
        aProperties1.put("havefirefox", "1")
        aProperties1.put("cookieprefix", "")
        aProperties1.put("cookiehost", "127.0.0.3")
        aProperties1.put("cachesubdirid", "0")
        aProperties1.put("crashurl", "")
        aProperties1.put("unsignedurl", "")
        aProperties1.put("sitesettings_member", "1")
        aProperties1.put("frombilling", "false")
        aProperties1.put("sskey", "")
        aProperties1.put("force64mb", "false")
        aProperties1.put("worldflags", "8")
    }

    fun openFrame() {
        aJFrame2 = JFrame("Client")
        aJFrame2!!.setLayout(BorderLayout())
        aJPanel3.setLayout(BorderLayout())
        aJPanel3.add(this)
        aJPanel3.setPreferredSize(Dimension(765, 503))
        aJFrame2!!.getContentPane().add(aJPanel3, "Center")
        aJFrame2!!.pack()
        aJFrame2!!.setVisible(true)
        aJFrame2!!.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        val icons = ArrayList<Image?>()
        for (name in mutableListOf<String?>("icon-16.png", "icon-32.png", "icon-64.png", "icon-128.png", "icon-256.png")) {
            val resource = Loader::class.java.getResource(name)
            if (resource != null) {
                icons.add(ImageIcon(resource).getImage())
            }
        }
        aJFrame2!!.setIconImages(icons)
    }

    fun startClient() {
        try {
            provideLoaderApplet(this)
            val var_client = Client()
            var_client.init()
            var_client.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun getParameter(arg0: String?): String? {
        return aProperties1.get(arg0) as String?
    }

    override fun getDocumentBase(): URL? {
        return getCodeBase()
    }

    override fun destroy() {
    }

    override fun getPulseComponent(): Component {
        return this
    }

    override fun showDocument(url: URL?, target: String?) {
        println("Show document: $url, target: $target")
    }

    override fun getCodeBase(): URL? {
        val url: URL?
        try {
            if (loadRunescape) url = URL("http://world16.runescape.com")
            else url = URL("http://" + address)
        } catch (exception: Exception) {
            exception.printStackTrace()
            return null
        }
        return url
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            for (i in args.indices) {
                val arg = args[i]
                when (arg) {
                    "-ip", "--address" -> address = args[i + 1]
                    "-p", "--port" -> port = args[i + 1].toInt()
                    "-d", "--debug" -> debug = true
                    "-t", "--trace" -> trace = true
                }
            }
            val l = Loader()
            l.doFrame()
        }
    }
}