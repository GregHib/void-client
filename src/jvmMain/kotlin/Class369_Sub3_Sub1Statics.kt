import java.awt.event.ActionEvent

/**
 * JVM-only statics split out of [Class369_Sub3_Sub1].
 *
 * Holds [method3578], the sole AWT-coupled member: it pumps the platform
 * [java.awt.EventQueue] held by [Class297] and posts an [ActionEvent].
 * Kept in jvmMain because the EventQueue lives on Class297 (the platform
 * integration hub, which stays jvm). The remainder of Class369_Sub3_Sub1 is
 * now import-clean and move-ready once its base chain (Class369/Class369_Sub3)
 * moves to commonMain.
 */
object Class369_Sub3_Sub1Statics {
    var anInt10178: Int = 0

    @JvmStatic
    fun method3578(i: Byte, `object`: Any?, class297: Class297?) {
        do {
            try {
                anInt10178++
                if (class297!!.anEventQueue3799 != null) {
                    var i_12_ = 0
                    if (i.toInt() != -42) method3578(95.toByte(), null, null)
                    while ( /**/i_12_ < 50 && class297.anEventQueue3799!!.peekEvent() != null) {
                        Class286_Sub5.method2161(30.toByte(), 1L)
                        i_12_++
                    }
                    try {
                        if (`object` == null) break
                        class297.anEventQueue3799!!.postEvent(ActionEvent(`object`, 1001, "dummy"))
                    } catch (exception: Exception) {
                        /* empty */
                    }
                    break
                }
                break
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("fu.F(" + i + ',' + (if (`object` != null) "{...}" else "null") + ',' + (if (class297 != null) "{...}" else "null") + ')'))
            }
        } while (false)
    }
}
