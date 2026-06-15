/**
 * Platform-free statics split out of [Class348_Sub3].
 *
 * Exposes the counters, cache/font handles, and the two AWT-free companion
 * methods so commonMain classes (Client, Class130_Sub1, Class159, …) can
 * reference them without pulling in jaclib / java.awt.
 *
 * [method2743] (takes [java.awt.Component], creates a keyboard [Class346])
 * is JVM-only and stays in the jvmMain actual only.
 */
expect object Class348_Sub3Statics {
    var anInt6568: Int
    var anInt6570: Int
    var anInt6576: Int
    var anInt6578: Int
    var anInt6579: Int
    var anInt6580: Int
    var anInt6583: Int
    var anInt6585: Int
    var anInt6587: Int
    var anInt6588: Int
    var aFloat6586: Float
    var aClass323_6581: Class323?

    fun method2738(i: Byte)
    fun method2739(i: Int)
}
