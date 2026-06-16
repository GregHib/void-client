/**
 * JVM-only companion helpers for [Applet_Sub1].
 *
 * These methods reference jvmMain-only types (Class275, Class93, Class363,
 * Class348_Sub38, Class369_Sub3) and cannot live in the commonMain class body.
 * They are exposed as @JvmStatic so existing Java/Kotlin call sites work unchanged.
 */
object Applet_Sub1Statics {

    fun method85(i: Int, class45: Class45?) {
        Applet_Sub1.anInt32++
        Class369_Sub3.aClass45_8601 = class45
        if (i != 0) Applet_Sub1.anInt37 = 101
    }

    fun method86(string: String?, i: Int): Boolean {
        Applet_Sub1.anInt13++
        if (i != 0) return true
        return Class275.aHashtable3548!!.containsKey(string)
    }

    fun provideLoaderApplet(applet: GameApplet) {
        Applet_Sub1.anInt11++
        Class93.anApplet1530 = applet
    }

    fun set(string: String) {
        Class363.aString4461 = string
        Class348_Sub38.anInt7006 = string.length
    }

    fun method94(string: String, i: Int) {
        GameLoggers.log(string, i)
    }

    fun method98(i: Int) {
        Applet_Sub1.anIntArray38 = null
        Applet_Sub1.aClass324_20 = null
        if (i != 32717) method86(null, 65)
    }
}
