/**
 * JVM-side accessor shim for [Class348_Sub18] companion members.
 * Companions in jvmMain reference this instead of [Class348_Sub18] directly
 * so that the logic can be reasoned about without java.lang.reflect deps.
 */
object Class348_Sub18Statics {
    var anInt6818: Int
        get() = Class348_Sub18.anInt6818
        set(value) { Class348_Sub18.anInt6818 = value }

    fun method2938(i: Byte) = Class348_Sub18.method2938(i)
}
