/**
 * JVM-side accessor shim for [InputStream_Sub2] companion members.
 * Common-ready callers reference this object instead of [InputStream_Sub2] directly,
 * so those files can live in commonMain without a java.io dependency.
 */
object InputStream_Sub2Statics {
    var anInt80: Int
        get() = InputStream_Sub2.anInt80
        set(v) { InputStream_Sub2.anInt80 = v }
    var anInt81: Int
        get() = InputStream_Sub2.anInt81
        set(v) { InputStream_Sub2.anInt81 = v }
    val aClass114_82: Class114?
        get() = InputStream_Sub2.aClass114_82
    var anInt85: Int
        get() = InputStream_Sub2.anInt85
        set(v) { InputStream_Sub2.anInt85 = v }
    val aClass243_83: Class243?
        get() = InputStream_Sub2.aClass243_83

    fun method127(i: Byte) = InputStream_Sub2.method127(i)

    fun method128(class74: Class74?, i: Byte) = InputStream_Sub2.method128(class74, i)
}
