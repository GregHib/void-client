object TextureAtlasStateStatics {
    var anInt4419: Int = 0
            var aIntRange_4421: IntRange? = IntRange(13, -2)
            var anInt4422: Int = 0
            var anInt4424: Int = 0
            @JvmStatic
            fun method3490(bool: Boolean): Boolean {
                anInt4419++
                var bool_0_ = bool
                if (ColorThresholdEffectStatics.aSpriteImage_9090 == null) {
                    if (!CameraRotationStubStatics.aJs5Archive_322!!.method421(false, FireParticleStreamStatics.anInt98)) bool_0_ = false
                    else ColorThresholdEffectStatics.aSpriteImage_9090 = SpriteImageStatics.method1512(CameraRotationStubStatics.aJs5Archive_322!!, FireParticleStreamStatics.anInt98)
                }
                if (RegionTileNodeStatics.aSpriteImage_6643 == null) {
                    if (CameraRotationStubStatics.aJs5Archive_322!!.method421(!bool, TerrainShadowBuilderGl2Statics.anInt6938)) RegionTileNodeStatics.aSpriteImage_6643 = SpriteImageStatics.method1512(CameraRotationStubStatics.aJs5Archive_322!!, TerrainShadowBuilderGl2Statics.anInt6938)
                    else bool_0_ = false
                }
                if (ScriptCompilerThreadStatics.aSpriteImage_1727 == null) {
                    if (!CameraRotationStubStatics.aJs5Archive_322!!.method421(false, LocalizedTextTripleStatics.anInt3762)) bool_0_ = false
                    else ScriptCompilerThreadStatics.aSpriteImage_1727 = SpriteImageStatics.method1512(CameraRotationStubStatics.aJs5Archive_322!!, LocalizedTextTripleStatics.anInt3762)
                }
                if (ClanChatRequestSender.aFontDefinition_3649 == null) {
                    if (SoftwareSpriteRasterStatics.aJs5Archive_1627!!.method421(false, ConnectionStateRefs.anInt317)) ClanChatRequestSender.aFontDefinition_3649 = RangedGraphicsOptionStateStatics.method1766((-89).toByte(), ConnectionStateRefs.anInt317, SoftwareSpriteRasterStatics.aJs5Archive_1627!!)
                    else bool_0_ = false
                }
                if (ProportionalScrollbarComponentStatics.aSpriteImageArray9929 == null) {
                    if (CameraRotationStubStatics.aJs5Archive_322!!.method421(false, ConnectionStateRefs.anInt317)) ProportionalScrollbarComponentStatics.aSpriteImageArray9929 = SpriteImageStatics.method1523(CameraRotationStubStatics.aJs5Archive_322!!, ConnectionStateRefs.anInt317)
                    else bool_0_ = false
                }
                return bool_0_
            }
    
            @JvmStatic
            fun method3491(i: Int) {
                aIntRange_4421 = null
                if (i != 1) method3491(-30)
            }
    
            fun method3492(i: Int, i_1_: Int): Int {
                anInt4422++
                val i_2_ = 0x3f and i
                val i_3_ = (i_1_ and i) shr 6
                if (i_2_ == 18) {
                    if (i_3_ == 0) return 1
                    if (i_3_ == 1) return 2
                    if (i_3_ == 2) return 4
                    if (i_3_ == 3) return 8
                } else if (i_2_ == 19 || i_2_ == 21) {
                    if (i_3_ == 0) return 16
                    if (i_3_ == 1) return 32
                    if (i_3_ == 2) return 64
                    if (i_3_ == 3) return 128
                }
                return 0
            }
}
