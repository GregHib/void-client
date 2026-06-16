import java.awt.Component

/**
 * JVM actual for [Class348_Sub3Statics].
 *
 * Delegates every common member to the existing [Class348_Sub3] companion so
 * no behaviour changes. Also adds the AWT-only [method2743] here (takes a
 * [Component] to register as a keyboard listener — not expressible in
 * commonMain).
 */
actual object Class348_Sub3Statics {
    actual var anInt6568: Int
        get() = Class348_Sub3.anInt6568
        set(value) { Class348_Sub3.anInt6568 = value }
    actual var anInt6570: Int
        get() = Class348_Sub3.anInt6570
        set(value) { Class348_Sub3.anInt6570 = value }
    actual var anInt6576: Int
        get() = Class348_Sub3.anInt6576
        set(value) { Class348_Sub3.anInt6576 = value }
    actual var anInt6578: Int
        get() = Class348_Sub3.anInt6578
        set(value) { Class348_Sub3.anInt6578 = value }
    actual var anInt6579: Int
        get() = Class348_Sub3.anInt6579
        set(value) { Class348_Sub3.anInt6579 = value }
    actual var anInt6580: Int
        get() = Class348_Sub3.anInt6580
        set(value) { Class348_Sub3.anInt6580 = value }
    actual var anInt6583: Int
        get() = Class348_Sub3.anInt6583
        set(value) { Class348_Sub3.anInt6583 = value }
    actual var anInt6585: Int
        get() = Class348_Sub3.anInt6585
        set(value) { Class348_Sub3.anInt6585 = value }
    actual var anInt6587: Int
        get() = Class348_Sub3.anInt6587
        set(value) { Class348_Sub3.anInt6587 = value }
    actual var anInt6588: Int
        get() = Class348_Sub3.anInt6588
        set(value) { Class348_Sub3.anInt6588 = value }
    actual var aFloat6586: Float
        get() = Class348_Sub3.aFloat6586
        set(value) { Class348_Sub3.aFloat6586 = value }
    var aClass114_6584: Class114?
        get() = Class348_Sub3.aClass114_6584
        set(value) { Class348_Sub3.aClass114_6584 = value }
    actual var aClass323_6581: Class323?
        get() = Class348_Sub3.aClass323_6581
        set(value) { Class348_Sub3.aClass323_6581 = value }

    actual fun method2738(i: Byte) = Class348_Sub3.method2738(i)
    actual fun method2739(i: Int) = Class348_Sub3.method2739(i)

    /** AWT-only: creates a keyboard [Class346] listener attached to [component]. */
    fun method2743(component: Component?, i: Byte): Class346 =
        Class348_Sub3.method2743(component, i)
}
