import AbstractBloomEffect.Companion.method2755

/* Class348_Sub40_Sub17_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteRgbTextureNode : SpriteTextureNode() {
    override fun method3047(i: Int, i_0_: Int): Array<IntArray?>? {
        if (i_0_ != -1564599039) method3093(54)
        anInt10425++
        val `is` = this.aImageFrameCache_7033!!.method2557(-93, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035 && this.method3090(true)) {
            val is_1_ = `is`[0]!!
            val is_2_ = `is`[1]!!
            val is_3_ = `is`[2]!!
            val i_4_ = (this.anInt9241 * (i % this.anInt9241))
            for (i_5_ in 0..<ClampTextureNode.Companion.anInt9139) {
                val i_6_ = (this.anIntArray9232!![(i_5_ % this.anInt9237 + i_4_)])
                is_3_[i_5_] = WhirlpoolHash.method1166(4080, i_6_ shl 4)
                is_2_[i_5_] = WhirlpoolHash.method1166(65280, i_6_) shr 4
                is_1_[i_5_] = WhirlpoolHash.method1166(4080, i_6_ shr 12)
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt10425: Int = 0
        @JvmField
        var aJs5Archive_10426: Js5Archive? = null
        @JvmField
        var anInt10427: Int = 0

        @JvmStatic
        fun method3092(i: Int) {
            if (i != -1) aJs5Archive_10426 = null
            aJs5Archive_10426 = null
        }

        @JvmStatic
        fun method3093(i: Int) {
            if (i > 85) {
                anInt10427++
                method2755(-1, 255, -1)
            }
        }
    }
}
