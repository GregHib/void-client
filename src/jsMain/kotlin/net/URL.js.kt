package net

import io.IOException
import io.InputStream

actual class URL actual constructor(spec: String) {

    private val spec: String = spec

    actual constructor(protocol: String, host: String, file: String) : this("$protocol://$host$file")

    /**
     * The client only builds relative URLs inside `catch (Exception)` blocks (GameAppletFrame
     * .method82, LinkedListIterator.method1242), so failing with MalformedURLException keeps a
     * recovered error recovered - a TODO() here would escape those catches and harden it.
     */
    actual constructor(context: URL?, spec: String?) : this("$context") {
        throw MalformedURLException("Relative URLs are not supported yet: $spec")
    }

    actual override fun toString(): String = spec

    actual fun openStream(): InputStream = throw IOException("URL streams are not supported yet")

    /** Host portion of `scheme://host[:port][/path]`, or the whole spec if it has no authority. */
    actual fun getHost(): String {
        val afterScheme = spec.substringAfter("://", spec)
        return afterScheme.substringBefore('/').substringBefore(':')
    }
}
