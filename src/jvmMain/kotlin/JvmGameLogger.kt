import java.io.IOException

/**
 * JVM implementation of [GameLogger].
 *
 * Body lifted verbatim from Applet_Sub1.Companion.method94; all the JVM-specific
 * types (Calendar, FileOutputStream, IOException) live here so that Applet_Sub1
 * can move to commonMain.
 *
 * Installed once at startup by Loader (same pattern as [JvmSleeper]/[Sleepers]).
 */
object JvmGameLogger : GameLogger {
    override fun log(string: String, i: Int) {
        Applet_Sub1.anInt6++
        if (Class286_Sub1.aStringArray6200 == null) Class14_Sub3.method249(2)
        Class286_Sub3.aCalendar6221!!.setTimeMillis(Class62.method599(-102))
        val i_8_ = Class286_Sub3.aCalendar6221!!.get(11)
        val i_9_ = Class286_Sub3.aCalendar6221!!.get(12)
        val i_10_ = Class286_Sub3.aCalendar6221!!.get(13)
        val string_11_ = ((i_8_ / 10).toString() + i_8_ % 10 + ":" + i_9_ / 10 + i_9_ % 10 + ":" + i_10_ / 10 + i_10_ % 10)
        val strings = Class348_Sub40_Sub23.method3113('\n', true, string)
        for (i_12_ in strings.indices) {
            for (i_13_ in Class369_Sub2.anInt8587 downTo 1) Class286_Sub1.aStringArray6200!![i_13_] = Class286_Sub1.aStringArray6200!![-1 + i_13_]
            Class286_Sub1.aStringArray6200!![0] = string_11_ + ": " + strings[i_12_]
            if (Class299_Sub1.aFileOutputStream6323 != null) {
                try {
                    Class299_Sub1.aFileOutputStream6323!!.write(Class348_Sub24.method2992(((Class286_Sub1.aStringArray6200!![0]) + "\n"), (-20).toByte()))
                } catch (ioexception: IOException) {
                    /* empty */
                }
            }
            if (-1 + Class286_Sub1.aStringArray6200!!.size > Class369_Sub2.anInt8587) {
                Class369_Sub2.anInt8587++
                if (Class284.anInt3676 > 0) Class284.anInt3676++
            }
        }
    }
}
