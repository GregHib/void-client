/**
 * Abstraction for HTTP GET requests.
 * JVM implementation uses java.net.URL; web/native implementations use platform HTTP clients.
 */
interface HttpFetch {
    /**
     * Performs a synchronous HTTP GET and returns the full response body as bytes.
     * Throws IOException on failure.
     */
    fun fetch(url: String): ByteArray
}
