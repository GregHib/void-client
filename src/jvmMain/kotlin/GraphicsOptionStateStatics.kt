import ChatEffectsOptionStateStatics.method1728

object GraphicsOptionStateStatics {
    @JvmField
            var anInt3134: Int = 0
            @JvmField
            var aIntRange_3135: IntRange? = IntRange(108, 5)
            @JvmField
            var anInt3137: Int = 0
            @JvmField
            var anInt3139: Int = 0
            @JvmField
            var anInt3140: Int = 0
            @JvmField
            var anInt3141: Int = 0
            @JvmField
            var anInt3142: Int = 0
            @JvmField
            var aIntRange_3143: IntRange?
            @JvmField
            var aByteArray3144: ByteArray? = ByteArray(520)
            @JvmField
            var aIntRange_3145: IntRange? = null
            @JvmField
            var aJs5Archive_3146: Js5Archive? = null
            @JvmField
            var aItemDefinitionLoader_3147: ItemDefinitionLoader? = null
    
            @JvmStatic
            fun method1709(i: Int): Array<HudTabPanel?> {
                if (i > -110) method1715(97)
                anInt3141++
                return (arrayOf<HudTabPanel?>(MovementDirectionStatics.aHudTabPanel_1189, NoiseTextureNodeStatics.aHudTabPanel_9263, ParticleEmitterDefStatics.aHudTabPanel_4953))
            }
    
            @JvmStatic
            fun method1711(i: Int, js5Archive: Js5Archive?, i_0_: Int, js5Archive_1_: Js5Archive?) {
                try {
                    GlElementArrayBufferStatics.aJs5Archive_4843 = js5Archive_1_
                    anInt3140++
                    if (i != 7) aJs5Archive_3146 = null
                    RectangleRegionStatics.aJs5Archive_1940 = js5Archive
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("su.Q(" + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + i_0_ + ',' + (if (js5Archive_1_ != null) "{...}" else "null") + ')'))
                }
            }
    
            @JvmStatic
            fun method1713(bool: Boolean, i: Int) {
                method1728(HardCacheEntryReferenceStatics.anInt10432, -1, RenderNodeStatics.anInt9721, bool, LocTypeDefinitionStatics.anInt4017)
                if (i == 520) anInt3137++
            }
    
            @JvmStatic
            fun method1715(i: Int) {
                aIntRange_3145 = null
                aIntRange_3143 = null
                aJs5Archive_3146 = null
                aIntRange_3135 = null
                aByteArray3144 = null
                aItemDefinitionLoader_3147 = null
                if (i < 13) method1709(-99)
            }
    
            @JvmStatic
            fun method1717(i: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
                AnimationFrameDefinitionStatics.aByteArrayArrayArray6962 = Array<Array<ByteArray?>?>(i_6_) { Array<ByteArray?>(i_5_) { ByteArray(i_4_) } }
                if (i != 19278) method1717(35, 126, -83, 85)
                anInt3134++
            }
    
            init {
                aIntRange_3143 = IntRange(7, 3)
            }
}
