/**
 * JVM-side accessor shim for [Class238_Sub1] companion members.
 * Companions in jvmMain reference this instead of [Class238_Sub1] directly
 * so that the logic can be reasoned about without java.net deps.
 */
object Class238_Sub1Statics {
    var aBoolean5840: Boolean
        get() = Class238_Sub1.aBoolean5840
        set(v) { Class238_Sub1.aBoolean5840 = v }
}
