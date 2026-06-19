import ParticleTileShapeStatics.method2732

object BrightnessTextureNodeStatics {
    @JvmField
            var aIntRange_9216: IntRange? = IntRange(91, 2)
            @JvmField
            var anInt9217: Int = 0
            @JvmField
            var anInt9218: Int = 0
            @JvmField
            var anInt9219: Int = 0
            @JvmField
            var anInt9221: Int = 0
    
            fun method3084(i: Int, i_2_: Byte, i_3_: Int) {
                anInt9218++
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i_3_, 105.toByte(), 17)
                class348_sub42_sub15.method3246(-25490)
                class348_sub42_sub15.anInt9652 = i
                val i_4_ = 59 / ((i_2_ - -7) / 49)
            }
    
            @JvmStatic
            fun method3085(i: Int) {
                aIntRange_9216 = null
                if (i != 0) aIntRange_9216 = null
            }
    
            @JvmStatic
            fun method3086(i: Int, class348_sub16_sub3: MidiSequencePlayer?, i_5_: Int, js5Archive: Js5Archive?, bool: Boolean, i_6_: Int, i_7_: Int) {
                try {
                    anInt9219++
                    if (i != 2) aIntRange_9216 = null
                    method2732(i_6_, i_7_, bool, 96, js5Archive, i_5_)
                    GlBufferObjectStatics.aClass348_Sub16_Sub3_4743 = class348_sub16_sub3
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("pba.D(" + i + ',' + (if (class348_sub16_sub3 != null) "{...}" else "null") + ',' + i_5_ + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + bool + ',' + i_6_ + ',' + i_7_ + ')'))
                }
            }
}
