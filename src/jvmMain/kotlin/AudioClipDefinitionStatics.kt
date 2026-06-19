object AudioClipDefinitionStatics {
    fun method2372(js5Archive: Js5Archive, i: Int, i_11_: Int): AudioClipDefinition? {
        val `is` = js5Archive.method410(-1860, i, i_11_)
        if (`is` == null) return null
        return AudioClipDefinition(ByteBuffer(`is`))
    }
}
