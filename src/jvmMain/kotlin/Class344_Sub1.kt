class Class344_Sub1 : Class344() {
    private var aBytes6524: ByteArray? = null

    override fun method2689(i: Int, i_0_: Int, i_1_: Int): ByteArray {
        val `is` = ByteArray(i_0_)
        aBytes6524!!.copyInto(`is`, 0, i_1_, i_1_ + i_0_)
        if (i != 2) aBytes6524 = null
        return `is`
    }

    override fun method2692(i: Int): ByteArray {
        val src = aBytes6524!!
        val `is` = ByteArray(src.size)
        if (i != -3672) method2692(78)
        src.copyInto(`is`)
        return `is`
    }

    override fun method2691(i: Byte, `is`: ByteArray) {
        if (i.toInt() != 62) method2692(73)
        aBytes6524 = `is`.copyOf()
    }
}
