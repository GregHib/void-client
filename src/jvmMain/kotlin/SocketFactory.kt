import java.io.IOException
import java.net.Socket
import SocketFactoryStatics.anInt3472
import SocketFactoryStatics.anIntArray3475

/*
 * Class272
 */
abstract class SocketFactory {
    @JvmField
    var anInt3470: Int = 0
    @JvmField
    var aString3476: String? = null

    @Throws(IOException::class)
    fun method2047(i: Byte): Socket {
        anInt3472++
        if (i <= 84) anIntArray3475 = null
        return Socket(this.aString3476, this.anInt3470)
    }

    @Throws(IOException::class)
    abstract fun method2050(i: Int): Socket?
}
