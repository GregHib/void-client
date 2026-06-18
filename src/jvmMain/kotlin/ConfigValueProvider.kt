/* Class120 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ConfigValueProvider internal constructor(@JvmField var anInt4912: Int) : ConfigTypeProvider {
    override fun method51(i: Byte): ProjectileFactory? {
        if (i < 116) method1080(81, 13, -51, -26)
        anInt4909++
        return OrientationRotator.aProjectileFactory_2045
    }

    companion object {
        @JvmField
        var anInt4908: Int = 0
        @JvmField
        var anInt4909: Int = 0
        @JvmField
        var anInt4910: Int = 0
        var anInt4911: Int = -1
        fun method1080(i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
            anInt4908++
            if (i_0_ == -23697) {
                val class348_sub42_sub15 = NamedTimedNode.method2516(i_2_, 105.toByte(), 11)
                class348_sub42_sub15.method3246(i_0_ + -1793)
                class348_sub42_sub15.anInt9652 = i
                class348_sub42_sub15.anInt9651 = i_1_
            }
        }
    }
}
