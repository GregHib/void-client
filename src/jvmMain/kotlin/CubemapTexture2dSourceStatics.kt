object CubemapTexture2dSourceStatics {
    @JvmField
            var anInt8687: Int = 0
            @JvmField
            var anInt8692: Int = 0
            @JvmField
            var aLong8694: Long = 0
            @JvmField
            var aFloat8696: Float = 0f
            @JvmStatic
            fun method2260(i: Int, i_4_: Int, l: Long, i_5_: Int, bool: Boolean, js5Archive: Js5Archive?, i_6_: Byte, i_7_: Int) {
                do {
                    try {
                        WaterDetailOptionStateStatics.anInt5994 = 10000
                        ModelDefinitionStatics.aJs5Archive_1848 = js5Archive
                        DirectionPathStatics.anInt1059 = i_7_
                        NpcActorEntityStatics.anInt10074 = i
                        KeyboardInputSourceStatics.aBoolean4275 = bool
                        GlBufferObjectStatics.aClass348_Sub16_Sub3_4743 = null
                        SceneLinkedListNodeStatics.anInt3971 = i_4_
                        anInt8687++
                        BloomGraphicsOptionStateStatics.aLong5971 = l
                        SpriteDefinitionStatics.anInt7068 = 1
                        DirectionalLightTextureNodeStatics.anInt9444 = i_5_
                        if (i_6_ >= 54) break
                        method2260(36, 99, 61L, 90, false, null, 126.toByte(), -67)
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("dq.E(" + i + ',' + i_4_ + ',' + l + ',' + i_5_ + ',' + bool + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + i_6_ + ',' + i_7_ + ')'))
                    }
                    break
                } while (false)
            }
}
