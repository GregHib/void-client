import CompletedResourceRequest.Companion.method3265

/* Class352 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RenderableEntry {
    var aFont_4332: Font?
    var aFontDefinition_4333: FontDefinition? = null

    internal constructor(font: Font?) {
        this.aFont_4332 = null
        this.aFont_4332 = font
    }

    internal constructor(font: Font?, fontDefinition: FontDefinition?) {
        this.aFont_4332 = null
        try {
            this.aFontDefinition_4333 = fontDefinition
            this.aFont_4332 = font
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("el.<init>(" + (if (font != null) "{...}" else "null") + ',' + (if (fontDefinition != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt4330: Int = 0
        var aIntRange_4331: IntRange? = IntRange(31, -1)
        var anInt4334: Int = 0
        var anInt4335: Int = 0
        var anInt4336: Int = 0
        var anInt4337: Int = -2

        @JvmStatic
        fun method3458(i: Int) {
            aIntRange_4331 = null
        }

        fun method3459(class348_sub34: IntPair, i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
            anInt4330++
            val l = (i_0_ shl 14 or (i shl 28) or i_1_).toLong()
            var class348_sub37 = ModelBatchBase.aHashtable_1895!!.method3480(l, -6008) as HashTableContainer?
            if (class348_sub37 == null) {
                class348_sub37 = HashTableContainer()
                ModelBatchBase.aHashtable_1895!!.method3483(50.toByte(), l, class348_sub37)
                class348_sub37.aNodeDeque_6998.method1999(class348_sub34, -20180)
            } else {
                var class213 = ClientException.aModelHeaderCache_112!!.method1940(i_2_ xor 0x72.inv(), (class348_sub34.anInt6973))
                var i_3_ = class213.anInt2819
                if (i_2_ == (class213.anInt2820.inv())) i_3_ *= 1 + class348_sub34.anInt6971
                var class348_sub34_4_ = class348_sub37.aNodeDeque_6998.method1995(i_2_ + 6) as IntPair?
                while (class348_sub34_4_ != null) {
                    class213 = (ClientException.aModelHeaderCache_112!!.method1940(104, class348_sub34_4_.anInt6973))
                    var i_5_ = class213.anInt2819
                    if (class213.anInt2820 == 1) i_5_ *= class348_sub34_4_.anInt6971 - -1
                    if (i_3_ > i_5_) {
                        method3265(i_2_ xor 0x6c, class348_sub34, class348_sub34_4_)
                        return
                    }
                    class348_sub34_4_ = class348_sub37.aNodeDeque_6998.method1990(34.toByte()) as IntPair?
                }
                class348_sub37.aNodeDeque_6998.method1999(class348_sub34, i_2_ xor 0x4ed2)
            }
        }
    }
}
