/* Class254 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class EmoteDefinition {
    var anInt3256: Int = 0
    var aString3258: String? = null
    private var aChar3259 = 0.toChar()
    var aBoolean3261: Boolean = true
    fun method1924(class348_sub49: ByteBuffer, i: Byte) {
        val i_0_ = -47 % ((i - -74) / 49)
        while (true) {
            val i_1_ = class348_sub49.readUnsignedByte(255)
            if (i_1_ == 0) break
            method1927(true, class348_sub49, i_1_)
        }
        anInt3263++
    }

    fun method1925(bool: Boolean): Boolean {
        anInt3262++
        if (bool != false) return true
        return aChar3259.code == 115
    }

    private fun method1927(bool: Boolean, class348_sub49: ByteBuffer, i: Int) {
        anInt3257++
        if (i != 1) {
            if (i == 2) this.anInt3256 = class348_sub49.readInt((-126).toByte())
            else if (i == 4) this.aBoolean3261 = false
            else if (i == 5) this.aString3258 = class348_sub49.readString(91.toByte())
        } else aChar3259 = ByteBuffer.method462(class348_sub49.readByte(-115), -128)
        if (bool != true) this.aBoolean3261 = true
    }

    companion object {
        var anInt3257: Int = 0
        var anInt3262: Int = 0
        var anInt3263: Int = 0
    }
}