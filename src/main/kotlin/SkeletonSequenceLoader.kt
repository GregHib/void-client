/* Class307 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object SkeletonSequenceLoader {
    var anInt3877: Int = 0
    var anInt3878: Int = 0

    @JvmStatic
    fun method2300(js5Archive: Js5Archive?, string: String?, bool: Boolean, i: Byte): SmoothingBuffer? {
        try {
            anInt3877++
            val i_0_ = js5Archive!!.method417(string!!, 0)
            if (i.toInt() != -91) return null
            if (i_0_ == -1) return SmoothingBuffer(0)
            val `is` = js5Archive.method396(i_0_, i.toInt() xor 0x5a.inv())
            val smoothingBuffer = SmoothingBuffer(`is`!!.size)
            var i_1_ = 0
            var i_2_ = 0
            while (i_1_ < smoothingBuffer.anInt3241) {
                val class348_sub49 = Buffer(js5Archive.method410(-1860, i_0_, `is`[i_2_++]))
                val i_3_ = class348_sub49.readInt((-126).toByte())
                val i_4_ = class348_sub49.readUnsignedShort(i.toInt() xor 0x3235f8a2.inv())
                val i_5_ = class348_sub49.readUnsignedByte(255)
                if (!bool && i_5_ == 1) smoothingBuffer.anInt3241--
                else {
                    smoothingBuffer.anIntArray3238!![i_1_] = i_3_
                    smoothingBuffer.anIntArray3239!![i_1_] = i_4_
                    i_1_++
                }
            }
            return smoothingBuffer
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("wt.A(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + bool + ',' + i + ')'))
        }
    }

    fun method2301(i: Byte, i_6_: Int, bool: Boolean): Int {
        anInt3878++
        if (bool) return 0
        val class348_sub13 = GlTexture1D.method1974((-9).toByte(), i_6_, bool)
        if (class348_sub13 == null) return (ScrollingWidgetComponentNode.aParticleEffectCache_8378!!.method2044(109, i_6_).anInt9542)
        var i_7_ = 0
        var i_8_ = 0
        while ((i_8_ < class348_sub13.anIntArray6757!!.size)) {
            if (class348_sub13.anIntArray6757!![i_8_] == -1) i_7_++
            i_8_++
        }
        if (i.toInt() != 35) SkeletonSequenceLoader.method2301((-102).toByte(), 43, true)
        i_7_ += (ScrollingWidgetComponentNode.aParticleEffectCache_8378!!.method2044(82, i_6_).anInt9542 + -class348_sub13.anIntArray6757!!.size)
        return i_7_
    }
}
