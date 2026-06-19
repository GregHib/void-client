import java.io.IOException
import java.io.OutputStream
import ChatMessageStreamStatics.anInt104

/*
 * OutputStream_Sub2
 */
class ChatMessageStream : OutputStream() {
    @Throws(IOException::class)
    override fun write(i: Int) {
        anInt104++
        throw IOException()
    }
}
