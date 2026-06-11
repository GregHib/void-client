import java.net.URL

/**
 * JVM implementation of HttpFetch using java.net.URL.openStream().
 */
object JvmHttpFetch : HttpFetch {
    override fun fetch(url: String): ByteArray =
        URL(url).openStream().use { it.readBytes() }
}
