/**
 * JVM-side accessor shim for [ha_Sub3] companion members.
 * Companions in jvmMain reference this instead of [ha_Sub3] directly
 * so that the logic can be reasoned about without jaclib/jaggl deps.
 */
object ha_Sub3Statics {
    fun method3824(i: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int) =
        ha_Sub3.method3824(i, i_35_, i_36_, i_37_, i_38_, i_39_, i_40_, i_41_)
}
