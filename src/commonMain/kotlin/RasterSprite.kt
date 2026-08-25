import lang.Class
import lang.PlatformRuntime
import kotlin.jvm.JvmStatic
class RasterSprite(i: Int, i_3_: Int, `is`: IntArray?, is_4_: IntArray?) : Sprite() {

    var anIntArray5201: IntArray?

    var anIntArray5202: IntArray?

    init {
        try {
            this.anIntArray5201 = `is`
            this.anIntArray5202 = is_4_
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("nba.<init>(" + i + ',' + i_3_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_4_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        var aFontMetaRef_5200: FontMetaRef? = FontMetaRef(13, 2)

        var anInt5203: Int = 0

        var aFontMetaRef_5204: FontMetaRef? = FontMetaRef(15, 8)

        var anInt5205: Int = 0

        var aJs5Archive_5207: Js5Archive? = null

        /*synthetic*/
        var aClass5208: Class<*>? = null

        @JvmStatic
        fun method166(i: Byte, i_0_: Int, i_1_: Int): Boolean {
            if (i < 5) Companion.method166((-119).toByte(), -93, 73)
            anInt5203++
            return (i_1_ and 0x800) != 0 && (i_0_ and 0x37) != 0
        }

        @JvmStatic
        fun method167(i: Int) {
            if (i != 19612) method167(-70)
            aFontMetaRef_5200 = null
            aFontMetaRef_5204 = null
            SpriteSheetCache.aClass348_Sub6_5206 = null
            aJs5Archive_5207 = null
        }

        fun method168(i: Byte) {
            do {
                if (!VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3794) {
                    try {
                        try {
                            val var_long = PlatformRuntime.maxMemory()
                            TextureDefinitionCache.anInt2964 = 1 + (var_long / 1048576L).toInt()
                        } catch (throwable: Throwable) {
                            /* empty */
                        }
                        break
                    } catch (exception: Exception) {
                        break
                    }
                }
                TextureDefinitionCache.anInt2964 = 96
            } while (false)
            val i_2_ = 15 % (i / 51)
            anInt5205++
        }
    }
}
