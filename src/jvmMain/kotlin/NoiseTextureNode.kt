/* Class348_Sub40_Sub20 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NoiseTextureNode : AbstractProceduralTextureNode(0, true) {
    private fun method3103(i: Int, i_0_: Int, i_1_: Int): Int {
        anInt9262++
        if (i_1_ < 14) aClass348_Sub4_9264 = null
        var i_2_ = i_0_ - -(57 * i)
        i_2_ = i_2_ xor (i_2_ shl 1)
        return (-(((789221 + 15731 * (i_2_ * i_2_)) * i_2_ + 1376312589 and 0x7fffffff) / 262144) + 4096)
    }

    override fun method3042(i: Int, i_3_: Int): IntArray {
        anInt9261++
        val `is` = this.aSpriteSheetCache_7032!!.method1433(0, i)!!
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) {
            val i_4_ = LightDetailOptionState.anIntArray6035!![i]
            var i_5_ = 0
            while ((i_5_ < DisplaceTextureNode.Companion.anInt9139)) {
                `is`[i_5_] = method3103(i_4_, SceneEffectMarker.anIntArray6432!![i_5_], 22) % 4096
                i_5_++
            }
        }
        if (i_3_ != 255) method3042(38, -42)
        return `is`
    }

    companion object {
        @JvmField
        var anInt9261: Int = 0
        @JvmField
        var anInt9262: Int = 0
        @JvmField
        var aHudTabPanel_9263: HudTabPanel? = HudTabPanel("RC", 1)
        @JvmField
        var aClass348_Sub4_9264: ClientMachineInfo? = null
        @JvmField
        var anInt9265: Int = 0

        @JvmStatic
        fun method3102(i: Int) {
            if (i != 22385) aClass348_Sub4_9264 = null
            anInt9265++
            SoundCacheState.aLruByteCache_4139!!.method587(-110)
        }

        @JvmStatic
        fun method3104(bool: Boolean) {
            if (bool == false) {
                aClass348_Sub4_9264 = null
                aHudTabPanel_9263 = null
            }
        }

        init {
            BoundsConstraintEntry("", 73)
        }
    }
}
