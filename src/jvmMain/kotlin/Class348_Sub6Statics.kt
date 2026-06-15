/**
 * JVM actual for [Class348_Sub6Statics].
 *
 * Delegates every common member to the existing [Class348_Sub6] companion so
 * no behaviour changes. Also adds the JVM-only [method2769] here (loads a
 * native library via System.load from a java.io.File path — not expressible
 * in commonMain).
 */
actual object Class348_Sub6Statics {
    actual var anIntArray6631: IntArray?
        get() = Class348_Sub6.anIntArray6631
        set(value) { Class348_Sub6.anIntArray6631 = value }
    actual var anInt6632: Int
        get() = Class348_Sub6.anInt6632
        set(value) { Class348_Sub6.anInt6632 = value }
    actual var anInt6633: Int
        get() = Class348_Sub6.anInt6633
        set(value) { Class348_Sub6.anInt6633 = value }
    actual var anInt6634: Int
        get() = Class348_Sub6.anInt6634
        set(value) { Class348_Sub6.anInt6634 = value }
    actual var anIntArray6635: IntArray?
        get() = Class348_Sub6.anIntArray6635
        set(value) { Class348_Sub6.anIntArray6635 = value }
    actual var anInt6637: Int
        get() = Class348_Sub6.anInt6637
        set(value) { Class348_Sub6.anInt6637 = value }
    actual var anInt6638: Int
        get() = Class348_Sub6.anInt6638
        set(value) { Class348_Sub6.anInt6638 = value }
    actual var anInt6639: Int
        get() = Class348_Sub6.anInt6639
        set(value) { Class348_Sub6.anInt6639 = value }

    actual fun method2768(i: Int) = Class348_Sub6.method2768(i)
    actual fun method2770(i: Int) = Class348_Sub6.method2770(i)

    /** JVM-only: loads a native library from the File path stored in [Class275.aHashtable3548]. */
    @JvmStatic
    fun method2769(varClass: Class<*>?, i: Byte, string: String?): Boolean =
        Class348_Sub6.method2769(varClass, i, string)
}
