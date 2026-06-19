import ProjectileFactoryStatics.method1613
import Texture2DProviderStatics.method2259
import LinkedListNodeStatics.method2709
import AbstractModelStatics.method616

object ParticleEmitterDefStatics {
    @JvmField
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
                return ((method2709(i_1_, i, -1) or method1613(false, i_1_, i) or method2259(0, i_1_, i)) and method616(2, i, i_1_))
            }
}
