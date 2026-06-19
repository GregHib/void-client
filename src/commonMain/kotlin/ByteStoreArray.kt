class ByteStoreArray : ByteStore() {
    private var buffer: ByteArray? = null

    override fun method2689(i: Int, i_0_: Int, i_1_: Int): ByteArray {
        val result = ByteArray(i_0_)
        buffer!!.copyInto(result, destinationOffset = 0, startIndex = i_1_, endIndex = i_1_ + i_0_)
        if (i != 2) buffer = null
        return result
    }

    override fun method2692(i: Int): ByteArray {
        return buffer!!.copyOf()
    }

    override fun method2691(i: Byte, `is`: ByteArray) {
        buffer = ByteArray(`is`.size)
        `is`.copyInto(buffer!!)
    }
}