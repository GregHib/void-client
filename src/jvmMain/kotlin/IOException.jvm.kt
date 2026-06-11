/**
 * JVM actual for the [IOException] seam: the real java.io.IOException, so all
 * existing catch/throw sites behave exactly as before and still catch I/O
 * exceptions thrown by sockets, streams and files.
 */
actual typealias IOException = java.io.IOException
