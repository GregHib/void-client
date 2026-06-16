/**
 * JVM-only statics split from [Class367_Sub11] companion.
 * Tick-counter [anInt7396] and the sound cache [aClass32_7415] are needed widely
 * by Client.kt and others that should not import the underwater-FX class.
 */
object Class367_Sub11Statics {
    var anInt7396: Int = 0
    var aClass32_7415: Class32? = Class32(8)

    fun method3555(class45: Class45?, i: Int, bool: Boolean, l: Long, i_7_: Int, i_8_: Int, i_9_: Int) =
        Class367_Sub11.method3555(class45, i, bool, l, i_7_, i_8_, i_9_)

    fun method3556(bool: Boolean) =
        Class367_Sub11.method3556(bool)
}
