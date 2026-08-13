class NioByteStore : ByteStore() {
    private var byteBuffer6524: ByteArray? = null

    override fun method2689(i: Int, i_0_: Int, i_1_: Int): ByteArray {
        val buffer = byteBuffer6524!!
        val result = ByteArray(i_0_)
        buffer.copyInto(result, destinationOffset = 0, startIndex = i_1_, endIndex = i_1_ + i_0_)
        if (i != 2) byteBuffer6524 = null
        return result
    }

    override fun method2692(i: Int): ByteArray {
        return byteBuffer6524!!.copyOf()
    }

    override fun method2691(i: Byte, `is`: ByteArray) {
        byteBuffer6524 = `is`.copyOf()
    }
}