object CircleHitboxStatics {
    var anIntArray407: IntArray? = IntArray(1)
            @JvmField
            var anInt410: Int = 0
            @JvmField
            var anInt411: Int = 0
            @JvmField
            var aMapSceneCache_413: MapSceneCache? = null
            @JvmField
            var anInt414: Int = 0
            @JvmField
            var anInt415: Int = 0
            fun method319(i: Int, i_0_: Int, i_1_: Byte, i_2_: Int, i_3_: Int) {
                if (i_1_.toInt() != -18) method322(73)
                anInt414++
                HslPaletteState.anInt4171 = i_2_
                ParticleSystemRendererStatics.anInt3861 = i_0_
                GlFramebufferBlitterStatics.anInt282 = i
                CircleDrawer.anInt2688 = i_3_
            }
    
            @JvmStatic
            fun method322(i: Int) {
                anIntArray407 = null
                aMapSceneCache_413 = null
                if (i != 1) method322(-112)
            }
    
            @JvmStatic
            fun method323(js5Archive: Js5Archive?, privilegedOperationWorker: PrivilegedOperationWorker?, i: Byte) {
                try {
                    RegionSceneShifterStatics.aString7048 = ""
                    GrayscaleNoiseTextureStatics.aPrivilegedOperationWorker_5297 = privilegedOperationWorker
                    anInt410++
                    ParticleSystemStateStatics.aJs5Archive_2208 = js5Archive
                    if (!ClientGameLoopNodeStatics.aString6877!!.startsWith("win")) {
                        if (!ClientGameLoopNodeStatics.aString6877!!.startsWith("linux")) {
                            if (ClientGameLoopNodeStatics.aString6877!!.startsWith("mac")) RegionSceneShifterStatics.aString7048 += "macos/"
                        } else RegionSceneShifterStatics.aString7048 += "linux/"
                    } else RegionSceneShifterStatics.aString7048 += "windows/"
                    if (i.toInt() != 95) anIntArray407 = null
                    if (!GrayscaleNoiseTextureStatics.aPrivilegedOperationWorker_5297!!.aBoolean3794) {
                        if (!ClientGameLoopNodeStatics.aString6876!!.startsWith("amd64") && !ClientGameLoopNodeStatics.aString6876!!.startsWith("x86_64")) {
                            if (!ClientGameLoopNodeStatics.aString6876!!.startsWith("i386") && !ClientGameLoopNodeStatics.aString6876!!.startsWith("i486") && !ClientGameLoopNodeStatics.aString6876!!.startsWith("i586") && !ClientGameLoopNodeStatics.aString6876!!.startsWith("x86")) {
                                if (!ClientGameLoopNodeStatics.aString6876!!.startsWith("ppc")) RegionSceneShifterStatics.aString7048 += "universal/"
                                else RegionSceneShifterStatics.aString7048 += "ppc/"
                            } else RegionSceneShifterStatics.aString7048 += "x86/"
                        } else RegionSceneShifterStatics.aString7048 += "x86_64/"
                    } else RegionSceneShifterStatics.aString7048 += "msjava/"
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("hw.A(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (privilegedOperationWorker != null) "{...}" else "null") + ',' + i + ')'))
                }
            }
}
