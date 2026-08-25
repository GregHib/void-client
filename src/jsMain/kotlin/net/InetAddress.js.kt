package net

actual sealed class InetAddress {
    actual override fun toString(): String {
        TODO("Not yet implemented")
    }

    actual fun getAddress(): ByteArray {
        TODO("Not yet implemented")
    }

    actual fun getHostName(): String {
        TODO("Not yet implemented")
    }
}

actual fun getByName(host: String?): InetAddress {
    TODO("Not yet implemented")
}
