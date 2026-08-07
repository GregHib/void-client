import NamedTimedNode.Companion.method2516
import NpcType.Companion.method797

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

    companion object {
        var anInt9752: Int = 0
        var anInt9753: Int = 0
        var anInt9755: Int = 0
        var anIntArray9757: IntArray? = null
        var anInt9758: Int = 0
        var anInt9760: Int = 0
        var anInt9761: Int = 0
        var anInt9762: Int = 0
        var anInt9763: Int = 0
        var anInt9764: Int = 0
        var anInt9765: Int = 0
        var anInt9766: Int = 0
        var anInt9767: Int = 0
        var aShortArray9768: ShortArray? = shortArrayOf(11, 17, 45, 23, 48, 8, 57, 58)
        var anInt9769: Int = 0

        fun method3405(i: Int, bool: Boolean): Int {
            anInt9765++
            if (AbstractTileShapeStatics.anIntArray6547 == null) return 0
            if (!bool && LoadingScreenState.aRenderableEntryArray2636 != null) return AbstractTileShapeStatics.anIntArray6547!!.size * 2
            var i_1_ = 0
            if (i != 2012104999) method3405(118, false)
            var i_2_ = 0
            while (AbstractTileShapeStatics.anIntArray6547!!.size > i_2_) {
                val i_3_ = AbstractTileShapeStatics.anIntArray6547!![i_2_]
                if (GlShaderObjectHandle.aJs5Archive_518!!.method421(false, i_3_)) i_1_++
                if (TerrainTileStatics.aJs5Archive_4585!!.method421(false, i_3_)) i_1_++
                i_2_++
            }
            return i_1_
        }

        fun method3411(i: Int, i_13_: Int, i_14_: Int) {
            anInt9761++
            val class348_sub42_sub15 = method2516(i, 105.toByte(), i_13_) //12
            class348_sub42_sub15.method3246(-25490)
            class348_sub42_sub15.anInt9652 = i_14_
        }

        fun method3413(i: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, bool: Boolean, i_19_: Int, f: Float, bool_20_: Boolean): Array<IntArray?> {
            anInt9764++
            val `is` = Array<IntArray?>(i_18_) { IntArray(i_16_) }
            val class348_sub40_sub8 = PerlinNoiseTextureNode()
            class348_sub40_sub8.anInt9149 = (f * 4096.0f).toInt()
            class348_sub40_sub8.anInt9150 = i_15_
            class348_sub40_sub8.anInt9158 = i_17_
            class348_sub40_sub8.anInt9164 = i
            class348_sub40_sub8.aBoolean9160 = bool_20_
            class348_sub40_sub8.method3044(109)
            method797(i_18_, i_16_, 120.toByte())
            if (bool != true) anIntArray9757 = null
            for (i_21_ in 0..<i_18_) class348_sub40_sub8.method3069(i_21_, `is`[i_21_]!!, 99.toByte())
            return `is`
        }

        @JvmStatic
        fun method3414(i: Int) {
            aShortArray9768 = null
            if (i == 21515) anIntArray9757 = null
        }
    }
}
