import ColourKeyTextureNodeStatics.method3118
import ColourKeyTextureNodeStatics.anInt9350
import ColourKeyTextureNodeStatics.anInt9353

/* Class348_Sub40_Sub26 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ColourKeyTextureNode : AbstractProceduralTextureNode(1, false) {
    private var anInt9344 = 4096
    private var anInt9347 = 4096
    private var anInt9354 = 4096
    override fun method3047(i: Int, i_3_: Int): Array<IntArray?>? {
        if (i_3_ != -1564599039) return null
        anInt9353++
        val `is` = this.aImageFrameCache_7033!!.method2557(i_3_ + 1564598957, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_4_ = this.method3039((-60).toByte(), i, 0)!!
            val is_5_ = is_4_[0]!!
            val is_6_ = is_4_[1]!!
            val is_7_ = is_4_[2]!!
            val is_8_ = `is`[0]!!
            val is_9_ = `is`[1]!!
            val is_10_ = `is`[2]!!
            var i_11_ = 0
            while ((i_11_ < DisplaceTextureNodeStatics.anInt9139)) {
                val i_12_ = is_5_[i_11_]
                val i_13_ = is_7_[i_11_]
                val i_14_ = is_6_[i_11_]
                if (i_13_ != i_12_ || i_13_ != i_14_) {
                    is_8_[i_11_] = anInt9344
                    is_9_[i_11_] = anInt9354
                    is_10_[i_11_] = anInt9347
                } else {
                    is_8_[i_11_] = i_12_ * anInt9344 shr 12
                    is_9_[i_11_] = anInt9354 * i_13_ shr 12
                    is_10_[i_11_] = anInt9347 * i_14_ shr 12
                }
                i_11_++
            }
        }
        return `is`
    }

    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_23_: Int) {
        do {
            try {
                val i_24_ = i
                while_201_@ do {
                    do {
                        if (i_24_ == 0) {
                            anInt9344 = class348_sub49!!.readUnsignedShort(i_23_ + 842366929)
                            break@while_201_
                        } else if (i_24_ != 1) {
                            if (i_24_ == 2) break
                            break@while_201_
                        }
                        anInt9354 = class348_sub49!!.readUnsignedShort(842397944)
                        break@while_201_
                    } while (false)
                    anInt9347 = class348_sub49!!.readUnsignedShort(842397944)
                } while (false)
                anInt9350++
                if (i_23_ == 31015) break
                method3118(96.toByte())
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("uf.F(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + i_23_ + ')'))
            }
            break
        } while (false)
    }
}
