import java.net.InetAddress
import java.net.Socket

/**
 * JVM [SocketOpener]: opens a `java.net.Socket` (direct, or via the SOCKS proxy helper
 * [Class61]) and wraps it in a [Class238_Sub1] connection.
 *
 * This is the exact logic [Class297] runs for request types 23 (direct) / 24 (proxy);
 * pulling it behind the [SocketOpener] seam lets non-JVM targets (JS WebSocket) supply
 * their own connection while the JVM path stays byte-for-byte unchanged.
 *
 * Install once at startup via `Connections.install(JvmSocketOpener())`.
 */
class JvmSocketOpener : SocketOpener {
    @Throws(IOException::class)
    override fun open(proxy: Boolean, host: String?, port: Int): Class238 {
        return if (proxy) {
            Class61.method593(port, (-90).toByte(), host)!!.method2050(-112)!!
        } else {
            Class348_Sub23_Sub3.method2982(Socket(InetAddress.getByName(host), port), 24.toByte(), GAME_CONNECTION_KEY)
        }
    }

    companion object {
        /** Buffer-size key, matching Class297.GAME_CONNECTION_KEY. */
        private const val GAME_CONNECTION_KEY = 7500
    }
}
