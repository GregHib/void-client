/**
 * JVM-only statics split from [Class348_Sub23_Sub1] companion.
 * The companion could not stay on the jvmMain class because Client.kt
 * (and other callers) only need [aClass297_8992] and [method2968] — not
 * the jagtheora Ogg/Vorbis machinery.  Same split-the-companion pattern
 * as Class238Statics, Class221Statics, etc.
 */
object Class348_Sub23_Sub1Statics {
    var aClass297_8992: Class297? = null

    fun method2968(i: Byte) {
        aClass297_8992 = null
        if (i > -114) method2968((-12).toByte())
    }
}
