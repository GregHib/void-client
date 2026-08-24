import ProjectileFactory.Companion.method1613
import Texture2DProvider.Companion.method2259

/* Class288 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class ParticleEmitterDef internal constructor(i: Int, screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i_2_: Int, i_3_: Int) : ConfigTypeProvider {

    var anInt4950: Int = 0

    var anInt4951: Int = 0

    var aTileRenderState_4952: TileRenderState? = null

    var aScreenAnchorAlignment_4955: ScreenAnchorAlignment? = null

    var anInt4958: Int = 0

    override fun method51(i: Byte): ProjectileFactory? {
        anInt4957++
        return WeaveTextureNode.aProjectileFactory_9274
    }

    init {
        try {
            this.anInt4950 = i_2_
            this.anInt4958 = i
            this.anInt4951 = i_3_
            this.aScreenAnchorAlignment_4955 = screenAnchorAlignment
            this.aTileRenderState_4952 = tileRenderState
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("vr.<init>(" + i + ',' + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ')'))
        }
    }

    companion object {

        var aHudTabPanel_4953: HudTabPanel? = HudTabPanel("WIP", 2)
        var anInt4954: Int = 0
        var anInt4956: Int = 0
        var anInt4957: Int = 0
        @JvmStatic
        fun method2185(i: Int) {
            aHudTabPanel_4953 = null
            if (i != 2) aHudTabPanel_4953 = null
        }

        fun method2186(i: Byte, string: String): Int {
            anInt4954++
            if (i.toInt() != -114) method2187(-85, -44, 56)
            return string.length + 2
        }

        @JvmStatic
        fun method2187(i: Int, i_0_: Int, i_1_: Int): Boolean {
            anInt4956++
            if (i_0_ > -70) method2187(-57, -121, 54)
            return ((LinkedListNodeStatics.method2709(i_1_, i, -1) or method1613(false, i_1_, i) or method2259(0, i_1_, i)) and method616(2, i, i_1_))
        }

        var anInt1129: Int = 0
        fun method616(i: Int, i_81_: Int, i_82_: Int): Boolean {
            anInt1129++
            if (i != 2) return false
            return (i_81_ and 0x800) != 0
        }
    }
}
