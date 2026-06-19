import ConfigValueProviderStatics.method1080
import ConfigValueProviderStatics.anInt4909

/* Class120 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ConfigValueProvider internal constructor(@JvmField var anInt4912: Int) : ConfigTypeProvider {
    override fun method51(i: Byte): ProjectileFactory? {
        if (i < 116) method1080(81, 13, -51, -26)
        anInt4909++
        return OrientationRotator.aProjectileFactory_2045
    }
}
