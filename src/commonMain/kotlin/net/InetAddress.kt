package net

expect sealed class InetAddress {
    fun getAddress(): ByteArray
    fun getHostName(): String
    override fun toString(): String
}
expect fun getByName(host: String?): InetAddress