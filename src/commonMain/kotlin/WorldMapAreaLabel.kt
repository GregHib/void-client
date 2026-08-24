import kotlin.jvm.JvmStatic
/* Class369_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WorldMapAreaLabel(screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) : WorldMapLabel(screenAnchorAlignment, tileRenderState, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_) {

    var anInt8580: Int = 0

    var anInt8582: Int = 0
    override fun method51(i: Byte): ProjectileFactory? {
        if (i <= 116) method51((-95).toByte())
        anInt8581++
        return SkyboxGradient.aProjectileFactory_3934
    }

    init {
        try {
            this.anInt8580 = i_7_
            this.anInt8582 = i_8_
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("kh.<init>(" + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    companion object {

        var anInt8579: Int = 0

        var anInt8581: Int = 0

        var anInt8583: Int = -1

        @JvmStatic
        fun method3570(bool: Boolean) {
            if (ClientLoadStateMachine.aSoundChannelMixer_7042 != null) ClientLoadStateMachine.aSoundChannelMixer_7042!!.method2084(-6858)
            anInt8579++
            if (VarbitDefLoader.aSoundChannelMixer_2596 != null) VarbitDefLoader.aSoundChannelMixer_2596!!.method2084(-6858)
            if (bool != false) anInt8583 = 30
        }
    }
}
