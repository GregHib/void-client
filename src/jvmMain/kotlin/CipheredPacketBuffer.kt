import NamedTimedNodeStatics.method2516
import NpcTypeStatics.method797
import CipheredPacketBufferStatics.method3405
import CipheredPacketBufferStatics.anInt9752
import CipheredPacketBufferStatics.anInt9753
import CipheredPacketBufferStatics.anInt9755
import CipheredPacketBufferStatics.anIntArray9757
import CipheredPacketBufferStatics.anInt9758
import CipheredPacketBufferStatics.anInt9760
import CipheredPacketBufferStatics.anInt9762
import CipheredPacketBufferStatics.anInt9763
import CipheredPacketBufferStatics.anInt9766
import CipheredPacketBufferStatics.anInt9767
import CipheredPacketBufferStatics.aShortArray9768
import CipheredPacketBufferStatics.anInt9769

/* Class348_Sub49_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CipheredPacketBuffer internal constructor(i: Int) : ByteBuffer(i) {
    private var anInt9754 = 0
    private var aIsaacCipher_9756: IsaacCipher? = null
    fun method3404(i: Int): Boolean {
        anInt9758++
        if (i != -1510) return true
        val i_0_ = (((this.aByteArray7154!![this.anInt7197]) - aIsaacCipher_9756!!.method778(19.toByte())) and 0xff)
        return i_0_ >= 128
    }

    fun method3406(i: Int, `is`: IntArray) {
        anInt9755++
        aIsaacCipher_9756 = IsaacCipher(`is`)
        if (i > -41) anIntArray9757 = null
    }

    fun method3407(i: Int): Int {
        anInt9752++
        val i_4_ = (((this.aByteArray7154!![this.anInt7197++]) - aIsaacCipher_9756!!.method781((-67).toByte())) and 0xff)
        if (i_4_ < 128) return i_4_
        if (i != 15295) anIntArray9757 = null
        return ((((this.aByteArray7154!![this.anInt7197++]) - aIsaacCipher_9756!!.method781((-62).toByte())) and 0xff) + (i_4_ + -128 shl 8))
    }

    fun method3408(i: Int, i_5_: Int) {
        this.aByteArray7154!![this.anInt7197++] = (i + aIsaacCipher_9756!!.method781((-85).toByte())).toByte()
        if (i_5_ == 18676) anInt9760++
    }

    fun method3409(i: Int, `is`: ByteArray, i_6_: Int, i_7_: Int) {
        if (i_7_ == -32769) {
            for (i_8_ in 0..<i) `is`[i_6_ + i_8_] = ((this.aByteArray7154!![this.anInt7197++]) + -aIsaacCipher_9756!!.method781((-99).toByte())).toByte()
            anInt9762++
        }
    }

    fun readBits(i: Byte, i_9_: Int): Int {
        var i_9_ = i_9_
        if (i.toInt() != -24) return -126
        anInt9763++
        var i_10_ = anInt9754 shr 3
        var i_11_ = 8 + -(anInt9754 and 0x7)
        anInt9754 += i_9_
        var i_12_ = 0
        while ( /**/i_11_ < i_9_) {
            i_12_ += (this.aByteArray7154!![i_10_++].toInt() and IntPairStatics.anIntArray6972!![i_11_]) shl i_9_ - i_11_
            i_9_ -= i_11_
            i_11_ = 8
        }
        if (i_11_ != i_9_) i_12_ += (this.aByteArray7154!![i_10_].toInt() shr i_11_ - i_9_) and IntPairStatics.anIntArray6972!![i_9_]
        else i_12_ += (IntPairStatics.anIntArray6972!![i_11_] and this.aByteArray7154!![i_10_].toInt())
        return i_12_
    }

    fun stopBitAccess(bool: Boolean) {
        anInt9753++
        this.anInt7197 = (7 + anInt9754) / 8
        if (bool != false) aShortArray9768 = null
    }

    fun method3415(i: Int, i_22_: Int): Int {
        if (i >= -58) method3405(50, true)
        anInt9769++
        return -anInt9754 + i_22_ * 8
    }

    fun method3416(i: Int, isaacCipher: IsaacCipher) {
        val i_23_ = -103 / ((i - 57) / 40)
        aIsaacCipher_9756 = isaacCipher
        anInt9766++
    }

    fun startBitAccess(i: Int) {
        val i_24_ = -126 / ((-15 - i) / 49)
        anInt9767++
        anInt9754 = 8 * this.anInt7197
    }
}
