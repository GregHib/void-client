/**
 * JVM implementation of [LoginVideo] — delegates to [Class348_Sub23.method2965],
 * which drives the jagtheora Ogg/Theora/Vorbis decoder and blits frames into the
 * login surface.
 */
object JvmLoginVideo : LoginVideo {
    override fun play(url: String?, mode: Int, fallback: Boolean, modeArg: Int) {
        Class348_Sub23.method2965(url, mode, fallback, modeArg)
    }
}
