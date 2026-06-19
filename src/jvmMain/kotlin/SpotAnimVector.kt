import AbstractModelStatics.method607
import kotlin.math.sqrt
import SpotAnimVectorStatics.anInt2287
import SpotAnimVectorStatics.anInt2288
import SpotAnimVectorStatics.anInt2300

/* Class174 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpotAnimVector {
    @JvmField
    var anInt2289: Int = 0
    @JvmField
    var anInt2290: Int = 0
    @JvmField
    var anInt2291: Int = 0
    @JvmField
    var anInt2292: Int = 0
    @JvmField
    var anInt2294: Int = 0
    @JvmField
    var anInt2296: Int = 0
    @JvmField
    var anInt2297: Int = 0
    @JvmField
    var anInt2298: Int = 0
    @JvmField
    var anInt2299: Int = 0
    @JvmField
    var aLong2301: Long = 0
    private var anInt2302 = 0
    @JvmField
    var anInt2303: Int = 0
    @JvmField
    var anInt2304: Int = 0
    private var aBoolean2308 = false
    private fun method1335(class348_sub49: ByteBuffer, i: Int, i_8_: Byte) {
        anInt2287++
        if (i == 1) anInt2302 = class348_sub49.readUnsignedShort(842397944)
        else if (i == 2) class348_sub49.readUnsignedByte(255)
        else if (i == 3) {
            this.anInt2291 = class348_sub49.readInt((-126).toByte())
            this.anInt2290 = class348_sub49.readInt((-126).toByte())
            this.anInt2294 = class348_sub49.readInt((-126).toByte())
        } else if (i == 4) {
            this.anInt2289 = class348_sub49.readUnsignedByte(255)
            this.anInt2304 = class348_sub49.readInt((-126).toByte())
        } else if (i != 6) {
            if (i == 8) this.anInt2297 = 1
            else if (i == 9) this.anInt2292 = 1
            else if (i == 10) aBoolean2308 = true
        } else this.anInt2296 = class348_sub49.readUnsignedByte(255)
        if (i_8_ >= -124) this.aLong2301 = 65L
    }

    fun method1336(i: Int, class348_sub49: ByteBuffer) {
        while (true) {
            val i_9_ = class348_sub49.readUnsignedByte(255)
            if (i_9_ == 0) break
            method1335(class348_sub49, i_9_, (-128).toByte())
        }
        anInt2288++
        if (i <= 36) this.anInt2296 = 8
    }

    fun method1337(i: Int) {
        anInt2300++
        this.anInt2298 = TrigLookupTablesStatics.anIntArray1204!![anInt2302 shl 3]
        val l = this.anInt2291.toLong()
        val l_10_ = this.anInt2290.toLong()
        val l_11_ = this.anInt2294.toLong()
        this.anInt2299 = sqrt((l_10_ * l_10_ + (l * l - -(l_11_ * l_11_))).toDouble()).toInt()
        if (this.anInt2304 == 0) this.anInt2304 = 1
        if ((this.anInt2289.inv()) != i) {
            if (this.anInt2289 == 1) {
                this.aLong2301 = (this.anInt2299 * 8 / this.anInt2304).toLong()
                this.aLong2301 *= this.aLong2301
            } else if (this.anInt2289 == 2) this.aLong2301 = (8 * this.anInt2299 / this.anInt2304).toLong()
        } else this.aLong2301 = 2147483647L
        if (aBoolean2308) this.anInt2299 *= -1
    }
}
