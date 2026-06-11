import java.net.InetAddress
import java.net.Socket

object JvmSocketOpener : SocketOpener {
    @Throws(IOException::class)
    override fun openDirect(host: String, port: Int, key: Int): Class238 {
        val socket = Socket(InetAddress.getByName(host), port)
        return Class348_Sub23_Sub3.method2982(socket, 24.toByte(), key)
    }

    @Throws(IOException::class)
    override fun openViaProxy(host: String, port: Int, key: Int): Class238 {
        val socket: Socket
        try {
            socket = Class61.method593(port, (-90).toByte(), host)!!.method2050(-112)!!
        } catch (ex: IOException_Sub1) {
            throw ex
        }
        return Class348_Sub23_Sub3.method2982(socket, 24.toByte(), key)
    }
}
