object MidiFileBuilderStatics {
    fun method2734(js5Archive: Js5Archive, i: Int, i_15_: Int): MidiFileBuilder? {
                val `is` = js5Archive.method410(-1860, i, i_15_)
                if (`is` == null) return null
                return MidiFileBuilder(ByteBuffer(`is`))
            }
}
