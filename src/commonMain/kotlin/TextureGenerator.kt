import kotlin.jvm.JvmStatic
/* Class186 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class TextureGenerator {
    abstract fun method1398(i: Int, i_3_: Int, f: Float, f_4_: Float, i_5_: Int, f_6_: Float, i_7_: Int, f_8_: Float, i_9_: Int, i_10_: Int, fs: FloatArray)

    companion object {

        var animationSekeletons: Js5Archive? = null

        var aRgbColorPalette_2491: RgbColorPalette?

        var aBoolean2492: Boolean = false

        var anInt2493: Int = 0

        var aStringArray2494: Array<String?>?

        var aFontMetaRef_2495: FontMetaRef?

        var aString2496: String?

        var anIntArray2497: IntArray?

        @JvmStatic
        fun method1396(i: Int) {
            animationSekeletons = null
            aRgbColorPalette_2491 = null
            aStringArray2494 = null
            anIntArray2497 = null
            aString2496 = null
            aFontMetaRef_2495 = null
            if (i != 25) aFontMetaRef_2495 = null
        }

        @JvmStatic
        fun method1397(i: Int) {
            anInt2493++
            val i_0_ = ShaderState.anInt6513
            val `is` = ScrollTexMaterialPass.anIntArray6290!!
            for (i_1_ in 0..<i_0_) {
                val player = LoadingBarRenderer.aPlayerArray5058!![`is`[i_1_]]
                if (player != null && (player.anInt10264) > 0) {
                    player.anInt10264--
                    if ((player.anInt10264) == 0) player.aString10292 = null
                }
            }
            for (i_2_ in i..<ModelDefinitionLoader.anInt2057) {
                val l = Client.anIntArray1233!![i_2_].toLong()
                val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(l, -6008) as? NpcReference?)
                if (class348_sub22 != null) {
                    val npc = (class348_sub22.aNpc_6859)!!
                    if ((npc.anInt10264) > 0) {
                        npc.anInt10264--
                        if (npc.anInt10264 == 0) npc.aString10292 = null
                    }
                }
            }
        }

        init {
            aRgbColorPalette_2491 = RgbColorPalette(13, -1)
            aStringArray2494 = arrayOfNulls<String>(100)
            aFontMetaRef_2495 = FontMetaRef(35, 5)
            aString2496 = ""
            anIntArray2497 = IntArray(25)
        }
    }
}
