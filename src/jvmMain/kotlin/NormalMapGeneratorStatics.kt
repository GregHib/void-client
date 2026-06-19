import ObjectByteSerializerHolderStatics.method1331
import GrowableStringListStatics.method1357
import MinimapSquareDrawerStatics.method461
import SolidFillComponentStatics.method194
import kotlin.math.sqrt

object NormalMapGeneratorStatics {
    var anInt3450: Int = 0
            @JvmField
            var anInt3451: Int = 0
            @JvmField
            var aParticleAmountCache_3453: ParticleAmountCache? = null
            var anInt3456: Int = 0
            @JvmField
            var anInt3460: Int = 0
            var anInt3461: Int = 0
            var aFloat3462: Float = 0f
    
            fun method2040(i: Int, bool: Boolean) {
                MapSceneDefLoaderStatics.anInt2482 = i
                if (bool != true) aFloat3462 = -0.54794437f
                anInt3450++
                synchronized(WidgetRedrawRegionStatics.aLruByteCache_4254!!) {
                    WidgetRedrawRegionStatics.aLruByteCache_4254!!.method590(0)
                }
            }
    
            @JvmStatic
            fun method2042(i: Byte) {
                if (i.toInt() == -67) aParticleAmountCache_3453 = null
            }
}
