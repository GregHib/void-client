import kotlin.jvm.JvmStatic
import io.File
import util.Locale

object OSInfo {
    var anInt410: Int = 0
    @JvmStatic
    fun method323(js5Archive: Js5Archive?, privilegedOperationWorker: PrivilegedOperationWorker?, i: Byte) {
        try {
            RegionSceneShifter.aString7048 = ""
            GrayscaleNoiseTexture.aPrivilegedOperationWorker_5297 = privilegedOperationWorker
            anInt410++
            ParticleSystemState.aJs5Archive_2208 = js5Archive
            if (!aString6877!!.startsWith("win")) {
                if (!aString6877!!.startsWith("linux")) {
                    if (aString6877!!.startsWith("mac")) RegionSceneShifter.aString7048 += "macos/"
                } else RegionSceneShifter.aString7048 += "linux/"
            } else RegionSceneShifter.aString7048 += "windows/"
            if (!GrayscaleNoiseTexture.aPrivilegedOperationWorker_5297!!.aBoolean3794) {
                if (!aString6876!!.startsWith("amd64") && !aString6876!!.startsWith("x86_64")) {
                    if (!aString6876!!.startsWith("i386") && !aString6876!!.startsWith("i486") && !aString6876!!.startsWith("i586") && !aString6876!!.startsWith("x86")) {
                        if (!aString6876!!.startsWith("ppc")) RegionSceneShifter.aString7048 += "universal/"
                        else RegionSceneShifter.aString7048 += "ppc/"
                    } else RegionSceneShifter.aString7048 += "x86/"
                } else RegionSceneShifter.aString7048 += "x86_64/"
            } else RegionSceneShifter.aString7048 += "msjava/"
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("hw.A(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (privilegedOperationWorker != null) "{...}" else "null") + ',' + i + ')'))
        }
    }
    var aString6876: String?
    var aString6877: String?

    init {
        var string = "Unknown"
        try {
            string = System.getProperty("java.vendor").lowercase()
        } catch (exception: Exception) {
            /* empty */
        }
        string.lowercase()
        string = "Unknown"
        try {
            string = System.getProperty("java.version").lowercase()
        } catch (exception: Exception) {
            /* empty */
        }
        string.lowercase()
        string = "Unknown"
        try {
            string = System.getProperty("os.name").lowercase()
        } catch (exception: Exception) {
            /* empty */
        }
        aString6877 = string.lowercase()
        string = "Unknown"
        try {
            string = System.getProperty("os.arch").lowercase()
        } catch (exception: Exception) {
            /* empty */
        }
        aString6876 = string.lowercase()
        string = "Unknown"
        try {
            string = System.getProperty("os.version").lowercase()
        } catch (exception: Exception) {
            /* empty */
        }
        string.lowercase()
        string = "~/"
        try {
            string = System.getProperty("user.home").lowercase()
        } catch (exception: Exception) {
            /* empty */
        }
        File(string)
    }
    @JvmStatic
    fun method2993(i: Byte) {
        WorldMapScene.anIntArray6878 = null
        aString6876 = null
        aString6877 = null
        val i_37_ = 31 % ((3 - i) / 37)
    }
}