/**
 * JVM-only statics extracted from [Class101Statics] that reference jvmMain-only types
 * (ha_Sub2, Class258_Sub3_Sub1, Class192, Class33) and therefore cannot live in commonMain.
 */
object Class105Sub2Statics {
    fun method904(i: Int, var_ha_Sub2: ha_Sub2?, i_24_: Int, i_25_: Int, i_26_: Int): Class258_Sub3_Sub1 {
        try {
            Class101Statics.anInt1594++
            if (i <= 42) Class101Statics.method906(123)
            if (var_ha_Sub2!!.aBoolean7793 || (Class192.method1436(82, i_25_) && Class192.method1436(81, i_26_))) return Class258_Sub3_Sub1(var_ha_Sub2, 3553, i_24_, i_25_, i_26_)
            if (var_ha_Sub2.aBoolean7837) return Class258_Sub3_Sub1(var_ha_Sub2, 34037, i_24_, i_25_, i_26_)
            return Class258_Sub3_Sub1(var_ha_Sub2, i_24_, i_25_, i_26_, Class33.method340(i_25_, 108.toByte()), Class33.method340(i_26_, 108.toByte()))
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bca.TA(" + i + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ')'))
        }
    }
}
