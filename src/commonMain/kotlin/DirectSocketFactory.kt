import java.io.IOException
import java.net.Socket

class DirectSocketFactory : SocketFactory() {
    @Throws(IOException::class)
    override fun method2050(i: Int): Socket? {
        if (i > -100) return null
        return this.method2047(87.toByte())
    }
}
