import java.nio.ByteBuffer

class Class344_Sub1 : Class344() {
    private var aByteBuffer6524: ByteBuffer? = null

    override fun method2689(i: Int, i_0_: Int, i_1_: Int): ByteArray {
        val `is` = ByteArray(i_0_)
        aByteBuffer6524!!.position(i_1_)
        aByteBuffer6524!!.get(`is`, 0, i_0_)
        if (i != 2) aByteBuffer6524 = null
        return `is`
    }

    override fun method2692(i: Int): ByteArray {
        val `is` = ByteArray(aByteBuffer6524!!.capacity())
        if (i != -3672) method2692(78)
        aByteBuffer6524!!.position(0)
        aByteBuffer6524!!.get(`is`)
        return `is`
    }

    override fun method2691(i: Byte, `is`: ByteArray) {
        aByteBuffer6524 = ByteBuffer.allocateDirect(`is`.size)
        aByteBuffer6524!!.position(0)
        if (i.toInt() != 62) method2692(73)
        aByteBuffer6524!!.put(`is`)
    }
}
