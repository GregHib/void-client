import jaclib.memory.Buffer

/*
 * Class119
 */
open class NativeBufferWrapper {
    var aBuffer1792: Buffer?
    private val aHa_Sub2_1793: OpenGlRenderer?

    fun method1076(`is`: ByteArray?, i: Int) {
        if (this.aBuffer1792 == null || this.aBuffer1792!!.getSize() < i) this.aBuffer1792 = aHa_Sub2_1793!!.aNativeHeap7730!!.a(i, false)
        this.aBuffer1792!!.a(`is`, 0, 0, i)
    }

    constructor(var_ha_Sub2: OpenGlRenderer?, `is`: ByteArray?, i: Int) {
        aHa_Sub2_1793 = var_ha_Sub2
        this.aBuffer1792 = aHa_Sub2_1793!!.aNativeHeap7730!!.a(i, false)
        if (`is` != null) this.aBuffer1792!!.a(`is`, 0, 0, i)
    }

    constructor(var_ha_Sub2: OpenGlRenderer?, buffer: Buffer?) {
        aHa_Sub2_1793 = var_ha_Sub2
        this.aBuffer1792 = buffer
    }
}
