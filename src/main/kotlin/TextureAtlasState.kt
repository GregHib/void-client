/* Class359 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TextureAtlasState {
    var anInt4420: Int = 0
    var anInt4423: Int = 0
    var anInt4425: Int = 0
    var aBoolean4426: Boolean = false

    companion object {
        var anInt4419: Int = 0
        var aIntRange_4421: IntRange? = IntRange(13, -2)
        var anInt4422: Int = 0
        var anInt4424: Int = 0
        @JvmStatic
        fun method3490(bool: Boolean): Boolean {
            anInt4419++
            var bool_0_ = bool
            if (ColorThresholdEffect.aSpriteImage_9090 == null) {
                if (!CameraRotationStub.aJs5Archive_322!!.method421(false, FireParticleStream.anInt98)) bool_0_ = false
                else ColorThresholdEffect.aSpriteImage_9090 = SpriteImage.method1512(CameraRotationStub.aJs5Archive_322!!, FireParticleStream.anInt98)
            }
            if (RegionTileNode.aSpriteImage_6643 == null) {
                if (CameraRotationStub.aJs5Archive_322!!.method421(!bool, TerrainShadowBuilderGl2.anInt6938)) RegionTileNode.aSpriteImage_6643 = SpriteImage.method1512(CameraRotationStub.aJs5Archive_322!!, TerrainShadowBuilderGl2.anInt6938)
                else bool_0_ = false
            }
            if (ScriptCompilerThread.aSpriteImage_1727 == null) {
                if (!CameraRotationStub.aJs5Archive_322!!.method421(false, LocalizedTextTriple.anInt3762)) bool_0_ = false
                else ScriptCompilerThread.aSpriteImage_1727 = SpriteImage.method1512(CameraRotationStub.aJs5Archive_322!!, LocalizedTextTriple.anInt3762)
            }
            if (ClanChatRequestSender.aFontDefinition_3649 == null) {
                if (SoftwareSpriteRaster.aJs5Archive_1627!!.method421(false, ConnectionStateRefs.anInt317)) ClanChatRequestSender.aFontDefinition_3649 = RangedGraphicsOptionState.method1766((-89).toByte(), ConnectionStateRefs.anInt317, SoftwareSpriteRaster.aJs5Archive_1627!!)
                else bool_0_ = false
            }
            if (ProportionalScrollbarComponent.aSpriteImageArray9929 == null) {
                if (CameraRotationStub.aJs5Archive_322!!.method421(false, ConnectionStateRefs.anInt317)) ProportionalScrollbarComponent.aSpriteImageArray9929 = SpriteImage.method1523(CameraRotationStub.aJs5Archive_322!!, ConnectionStateRefs.anInt317)
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
}
