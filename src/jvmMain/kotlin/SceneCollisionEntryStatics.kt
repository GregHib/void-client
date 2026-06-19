import SoundBankPatchStatics.method2929

object SceneCollisionEntryStatics {
    var anInt4392: Int = 0
            var anInt4393: Int = 0
            var aFontMetaRef_4394: FontMetaRef? = FontMetaRef(6, -1)
            var aDouble4404: Double = 0.0
            var aFontMetaRef_4405: FontMetaRef? = FontMetaRef(64, -1)
            var aLongArray4410: LongArray? = LongArray(100)
    
            fun method3486(i: Int, bool: Boolean, i_0_: Int, l: Long, i_1_: Int): String {
                var l = l
                try {
                    anInt4392++
                    var c = ','
                    var c_2_ = '.'
                    if (i_0_ == 0) {
                        c = '.'
                        c_2_ = ','
                    }
                    if (i_0_ == 2) c_2_ = '\u00a0'
                    var bool_3_ = false
                    if (l < 0) {
                        l = -l
                        bool_3_ = true
                    }
                    val stringbuffer = StringBuffer(26)
                    if (i > 0) {
                        var i_4_ = 0
                        while (i > i_4_) {
                            val i_5_ = l.toInt()
                            l /= 10L
                            stringbuffer.append((i_5_ + (48 + -(l.toInt() * 10))).toChar())
                            i_4_++
                        }
                        stringbuffer.append(c)
                    }
                    var i_6_ = 0
                    while (true) {
                        val i_7_ = l.toInt()
                        l /= 10L
                        stringbuffer.append((i_7_ + (48 - l.toInt() * 10)).toChar())
                        if (l == 0L) break
                        if (bool && ++i_6_ % 3 == 0) stringbuffer.append(c_2_)
                    }
                    if (bool_3_) stringbuffer.append('-')
                    if (i_1_ != 16980) aLongArray4410 = null
                    return stringbuffer.reverse().toString()
                } catch (runtimeexception: RuntimeException) {
                    throw method2929(runtimeexception, ("es.C(" + i + ',' + bool + ',' + i_0_ + ',' + l + ',' + i_1_ + ')'))
                }
            }
    
            @JvmStatic
            fun method3487(i: Int) {
                aLongArray4410 = null
                aFontMetaRef_4394 = null
                if (i >= -45) aFontMetaRef_4405 = null
                aFontMetaRef_4405 = null
            }
}
