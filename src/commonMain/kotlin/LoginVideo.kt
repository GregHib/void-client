/**
 * Seam for login-screen / cutscene video playback (jagtheora on JVM).
 *
 * On JVM: [JvmLoginVideo] delegates to [Class348_Sub23.method2965], which drives the
 * Ogg/Theora/Vorbis decoder and renders into the login surface.
 *
 * On JS / other targets: [LoginVideos.instance] is a no-op stub — video is simply
 * skipped, which is correct because jagtheora is a JNI-only native library.
 *
 * Shape mirrors [NativeLibraryProbe] / [AudioSink]: commonMain interface + singleton
 * holder + default no-op; JVM wires the real impl in [ClientBootstrap.installCommon].
 */
interface LoginVideo {
    /**
     * Start or restart the login video.
     *
     * @param url      Video resource URL/identifier, or null to suppress video.
     * @param mode     Display mode (0 = full-screen, other = windowed fallback).
     * @param fallback Whether to fall back to a simpler rendering path on failure.
     * @param modeArg  Secondary mode parameter forwarded to the decoder.
     */
    fun play(url: String?, mode: Int, fallback: Boolean, modeArg: Int)
}

/** No-op implementation — used on JS and any platform without jagtheora. */
private object NoOpLoginVideo : LoginVideo {
    override fun play(url: String?, mode: Int, fallback: Boolean, modeArg: Int) = Unit
}

object LoginVideos {
    var instance: LoginVideo = NoOpLoginVideo
}
