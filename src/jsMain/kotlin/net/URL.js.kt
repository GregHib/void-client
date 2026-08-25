package net

import io.InputStream

actual class URL actual constructor(spec: String) {
    actual constructor(protocol: String, host: String, file: String) : this("$protocol:$host")
    actual override fun toString(): String {
        TODO("Not yet implemented")
    }

    actual constructor(context: URL?, spec: String?) : this("$context:$spec") {
        TODO("Not yet implemented")
    }

    actual fun openStream(): InputStream {
        TODO("Not yet implemented")
    }

    actual fun getHost(): String {
        TODO("Not yet implemented")
    }
}