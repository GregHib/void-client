package net

actual sealed class InetAddress {
    internal abstract val host: String

    actual override fun toString(): String = host

    /** Dotted quad if the host looks like one, loopback otherwise - nothing resolves in a browser. */
    actual fun getAddress(): ByteArray {
        val parts = host.split('.')
        if (parts.size == 4) {
            val octets = parts.map { it.toIntOrNull() }
            if (octets.all { it != null && it in 0..255 }) {
                return ByteArray(4) { octets[it]!!.toByte() }
            }
        }
        return byteArrayOf(127, 0, 0, 1)
    }

    actual fun getHostName(): String = host
}

private class NamedAddress(override val host: String) : InetAddress()

actual fun getByName(host: String?): InetAddress = NamedAddress(host ?: "127.0.0.1")
