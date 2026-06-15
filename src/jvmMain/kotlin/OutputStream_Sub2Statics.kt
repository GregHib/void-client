/**
 * JVM-side accessor shim for [OutputStream_Sub2] companion members.
 * Common-ready callers reference this object instead of [OutputStream_Sub2] directly,
 * so those files can live in commonMain without a java.io dependency.
 */
object OutputStream_Sub2Statics {
    var anInt101: Int
        get() = OutputStream_Sub2.anInt101
        set(v) { OutputStream_Sub2.anInt101 = v }
    var anInt102: Int
        get() = OutputStream_Sub2.anInt102
        set(v) { OutputStream_Sub2.anInt102 = v }
    var anInt103: Int
        get() = OutputStream_Sub2.anInt103
        set(v) { OutputStream_Sub2.anInt103 = v }
    var anInt104: Int
        get() = OutputStream_Sub2.anInt104
        set(v) { OutputStream_Sub2.anInt104 = v }
    var anInt105: Int
        get() = OutputStream_Sub2.anInt105
        set(v) { OutputStream_Sub2.anInt105 = v }
    var anInt107: Int
        get() = OutputStream_Sub2.anInt107
        set(v) { OutputStream_Sub2.anInt107 = v }
    val aLong108: Long
        get() = OutputStream_Sub2.aLong108
    var aClass105_106: Class105?
        get() = OutputStream_Sub2.aClass105_106
        set(v) { OutputStream_Sub2.aClass105_106 = v }

    fun method136(i: Int, bool: Boolean, bool_2_: Boolean): Class318_Sub4 =
        OutputStream_Sub2.method136(i, bool, bool_2_)

    fun method138(class348_sub42_sub12: Class348_Sub42_Sub12, bool: Boolean): Int =
        OutputStream_Sub2.method138(class348_sub42_sub12, bool)

    fun method139(i: Int) = OutputStream_Sub2.method139(i)
}
