import Applet_Sub1.Companion.provideLoaderApplet
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
        var aProperties1: Properties = Properties()
        var loadRunescape: Boolean = false
        var showCoordinates: Boolean = true
        var skipLobby: Boolean = true
        var splitPorts: Boolean = false
        var debug: Boolean = false
        var trace: Boolean = false
        var address: String? = "127.0.0.1"
        var port: Int = 43594
        val LOGIN_SERVER_RSA_MODULUS: BigInteger = BigInteger("ea3680fdebf2621da7a33601ba39925ee203b3fc80775cd3727bf27fd8c0791c803e0bdb42b8b5257567177f8569024569da9147cef59009ed016af6007e57a556f1754f09ca84dd39a03287f7e41e8626fd78ab3b53262bd63f2e37403a549980bf3077bd402b82ef5fac269eb3c04d2a9b7712a67a018321ceba6c3bfb8f7f", 16)
        val FILE_SERVER_RSA_MODULUS: BigInteger = BigInteger("d6808be939bbfd2ec4e96b1581ce3e1144b526e7643a72e3c64fbb902724fbfcf14ab601da6d6f8dbb57d1c369d080d9fc392abeb7886e0076d07f2aea5810e540d2817fd1967e35b39cc95cf7c9170b5fb55f5bf95524b60e938f0d64614bc365b87d66963a8cc8664e32875366099ef297180d01c7c3842162865e11d92299", 16)

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

        fun getDebug(id: Int): String {
            return if (debug) " <col=00ff00>(</col>" + id + "<col=00ff00>)</col>" else ""
        }

        fun getDebug(id: Int, component: Int): String {
            return if (debug) " <col=00ff00>(</col>" + id + " - " + component + "<col=00ff00>)</col>" else ""
        }

        fun getDebug(id: Int, x: Int, y: Int, plane: Int): String {
            return if (debug) " <col=00ff00>(</col>" + id + " - " + x + ", " + y + ", " + plane + "<col=00ff00>)</col>" else ""
        }
    }
}