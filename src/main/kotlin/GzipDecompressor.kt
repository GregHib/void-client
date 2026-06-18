import java.util.zip.Inflater

/*
 * Class152
 */
class GzipDecompressor private constructor(i: Int, i_6_: Int, i_7_: Int) {
    private var anInflater2072: Inflater? = null
    fun method1214(i: Int, `is`: ByteArray): ByteArray {
        anInt2074++
        val class348_sub49 = Buffer(`is`)
        class348_sub49.anInt7197 = `is`.size - 4
        val i_0_ = class348_sub49.method3359(-86)
        class348_sub49.anInt7197 = 0
        if (i != 9) aFloatArray2075 = null
        val is_1_ = ByteArray(i_0_)
        method1218(is_1_, 29123, class348_sub49)
        return is_1_
    }

    constructor() : this(-1, 1000000, 1000000)

    fun method1218(`is`: ByteArray?, i: Int, class348_sub49: Buffer?) {
        try {
            anInt2073++
            if ((class348_sub49!!.aByteArray7154!![class348_sub49.anInt7197]).toInt() != 31 || (class348_sub49.aByteArray7154!![1 + class348_sub49.anInt7197]).toInt() != -117) throw RuntimeException("Invalid GZIP header!")
            if (anInflater2072 == null) anInflater2072 = Inflater(true)
            try {
                anInflater2072!!.setInput(class348_sub49.aByteArray7154, class348_sub49.anInt7197 - -10, -8 - (10 + class348_sub49.anInt7197 - (class348_sub49.aByteArray7154)!!.size))
                anInflater2072!!.inflate(`is`)
            } catch (exception: Exception) {
                anInflater2072!!.reset()
                throw RuntimeException("Invalid GZIP compressed data!")
            }
            anInflater2072!!.reset()
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("ol.A(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (class348_sub49 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt2070: Int = 0
        var anInt2071: Int = 0
        var anInt2073: Int = 0
        var anInt2074: Int = 0
        var aFloatArray2075: FloatArray? = FloatArray(2)
        @JvmField
        var aBooleanArray2076: BooleanArray? = BooleanArray(100)
        @JvmField
        var aDoublyLinkedNodeList_2077: DoublyLinkedNodeList? = null
        var anInt2078: Int = 0

        fun method1215(i: Byte) {
            anInt2078++
            if (WorldMapRenderer.anInt4674 != 9) {
                if (WorldMapRenderer.anInt4674 == 5 || WorldMapRenderer.anInt4674 == 6) Buffer.method3379(2, 3)
                else if (WorldMapRenderer.anInt4674 == 12) Buffer.method3379(2, 3)
            } else Buffer.method3379(2, 5)
        }

        @JvmStatic
        fun method1216(i: Byte) {
            if (i.toInt() != -97) aFloatArray2075 = null
            aDoublyLinkedNodeList_2077 = null
            aBooleanArray2076 = null
            aFloatArray2075 = null
        }

        fun method1217(i: Int, sceneCollisionEntries: Array<Array<Array<SceneCollisionEntry?>?>?>) {
            anInt2070++
            for (i_2_ in i..<sceneCollisionEntries.size) {
                val sceneCollisionEntryS_3_: Array<Array<SceneCollisionEntry?>?> = sceneCollisionEntries[i_2_]!!
                for (i_4_ in sceneCollisionEntryS_3_.indices) {
                    var i_5_ = 0
                    while ((sceneCollisionEntryS_3_[i_4_]!!.size > i_5_)) {
                        val class357 = sceneCollisionEntryS_3_[i_4_]!![i_5_]
                        if (class357 != null) {
                            if (class357.aClass318_Sub1_Sub1_4402 is RenderTarget) (class357.aClass318_Sub1_Sub1_4402 as RenderTarget).method40(-12031)
                            if (class357.aClass318_Sub1_Sub5_4395 is RenderTarget) (class357.aClass318_Sub1_Sub5_4395 as RenderTarget).method40(-12031)
                            if (class357.aClass318_Sub1_Sub5_4407 is RenderTarget) (class357.aClass318_Sub1_Sub5_4407 as RenderTarget).method40(-12031)
                            if (class357.aClass318_Sub1_Sub4_4406 is RenderTarget) (class357.aClass318_Sub1_Sub4_4406 as RenderTarget).method40(-12031)
                            if (class357.aClass318_Sub1_Sub4_4403 is RenderTarget) (class357.aClass318_Sub1_Sub4_4403 as RenderTarget).method40(-12031)
                            var class148 = class357.aWidgetNodeLink_4396
                            while (class148 != null) {
                                val class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040)
                                if (class318_sub1_sub3 is RenderTarget) (class318_sub1_sub3 as RenderTarget).method40(i xor 0x2efe.inv())
                                class148 = class148.aWidgetNodeLink_2038
                            }
                        }
                        i_5_++
                    }
                }
            }
        }
    }
}
