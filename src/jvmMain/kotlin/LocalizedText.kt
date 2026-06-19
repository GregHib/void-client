import ScrollingWidgetComponentNodeStatics.method1118
import WaterMaterialPassStatics.method2148
import LocalizedTextStatics.method2061
import LocalizedTextStatics.anInt3479
import LocalizedTextStatics.anInt3482

/* Class274 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LocalizedText internal constructor(string: String?, string_7_: String?, string_8_: String?, string_9_: String?) {
    private val aStringArray3481: Array<String?>
    override fun toString(): String {
        anInt3482++
        throw IllegalStateException()
    }

    fun method2063(i: Int, i_10_: Int): String? {
        if (i_10_ != 544) method2061(126)
        anInt3479++
        return aStringArray3481[i]
    }

    init {
        try {
            aStringArray3481 = arrayOf<String?>(string, string_7_, string_8_, string_9_)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("va.<init>(" + (if (string != null) "{...}" else "null") + ',' + (if (string_7_ != null) "{...}" else "null") + ',' + (if (string_8_ != null) "{...}" else "null") + ',' + (if (string_9_ != null) "{...}" else "null") + ')'))
        }
    }
}
