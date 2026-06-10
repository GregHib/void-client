import jaclib.memory.Buffer

open class Class119 {
    var aBuffer1792: Buffer?
    private val aHa_Sub2_1793: ha_Sub2?

    fun method1076(`is`: ByteArray?, i: Int) {
        if (this.aBuffer1792 == null || this.aBuffer1792!!.getSize() < i) this.aBuffer1792 = aHa_Sub2_1793!!.aNativeHeap7730!!.a(i, false)
        this.aBuffer1792!!.a(`is`, 0, 0, i)
    }

    constructor(var_ha_Sub2: ha_Sub2?, `is`: ByteArray?, i: Int) {
        aHa_Sub2_1793 = var_ha_Sub2
        this.aBuffer1792 = aHa_Sub2_1793!!.aNativeHeap7730!!.a(i, false)
        if (`is` != null) this.aBuffer1792!!.a(`is`, 0, 0, i)
    }

    constructor(var_ha_Sub2: ha_Sub2?, buffer: Buffer?) {
        aHa_Sub2_1793 = var_ha_Sub2
        this.aBuffer1792 = buffer
    }
}
