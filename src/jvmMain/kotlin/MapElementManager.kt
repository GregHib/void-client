import ScanlineRasterFiller.Companion.method1387
import GlTextureBase.Companion.aTextureFormatInfo_3977

/* Class363 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object MapElementManager {
    var aString4461: String? = ""
    var anInt4462: Int = 0
    var anIntArray4463: IntArray? = IntArray(8)
    var anInt4464: Int = 0
    var anInt4465: Int = 0

    var aDoublyLinkedNodeListArray3974s: Array<DoublyLinkedNodeList?>? = arrayOfNulls<DoublyLinkedNodeList>(5)
    fun method3513(i: Int) {
        withLock(aDoublyLinkedNodeListArray3974s!!) {
            var i_0_ = 0
            while ((i_0_ < aDoublyLinkedNodeListArray3974s!!.size)) {
                aDoublyLinkedNodeListArray3974s!![i_0_] = DoublyLinkedNodeList()
                CalendarUtil.anIntArray4128!![i_0_] = 0
                i_0_++
            }
        }
        anInt4462++
        val i_1_ = 60 / ((-36 - i) / 57)
    }

    @JvmStatic
    fun method2374(i: Byte) {
        aTextureFormatInfo_3977 = null
        val i_0_ = 108 / ((i - -83) / 41)
        MapElementManager.aDoublyLinkedNodeListArray3974s = null
    }

    init {
        var i = 0
        while (aDoublyLinkedNodeListArray3974s!!.size > i) {
            aDoublyLinkedNodeListArray3974s!![i] = DoublyLinkedNodeList()
            i++
        }
    }

    fun method3514(i: Byte) {
        anInt4465++
        var class348_sub27 = (SpriteRenderEntry.aNodeDeque_9711!!.method1995(4) as MultiFieldRecord?)
        while (class348_sub27 != null) {
            if (class348_sub27.anInt6893 == -1) {
                class348_sub27.anInt6894 = 0
                if ((class348_sub27.anInt6905 >= 0) && class348_sub27.anInt6896 >= 0 && (class348_sub27.anInt6905 < GlCubemapLightPass.anInt7319) && (class348_sub27.anInt6896 < RangeThresholdTextureNode.anInt9109)) method1387(i + 26, class348_sub27)
            } else class348_sub27.method2715(39.toByte())
            class348_sub27 = SpriteRenderEntry.aNodeDeque_9711!!.method1990(57.toByte()) as MultiFieldRecord?
        }
        if (i.toInt() != -105) method3516(-128)
    }

    fun method3515(i: Int) {
        val i_2_ = 52 / ((33 - i) / 40)
        AbstractProceduralTextureNode.aHashtable_7041!!.method3481(0)
        anInt4464++
    }

    @JvmStatic
    fun method3516(i: Int) {
        aString4461 = null
        if (i <= 123) anIntArray4463 = null
        anIntArray4463 = null
    }
}
