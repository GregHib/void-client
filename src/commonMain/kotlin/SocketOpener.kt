interface SocketOpener {
    @Throws(IOException::class)
    fun openDirect(host: String, port: Int, key: Int): Class238

    @Throws(IOException::class)
    fun openViaProxy(host: String, port: Int, key: Int): Class238
}
