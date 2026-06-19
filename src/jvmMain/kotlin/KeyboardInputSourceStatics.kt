object KeyboardInputSourceStatics {
    @JvmField
            var anInt4274: Int = 0
            @JvmField
            var aBoolean4275: Boolean = false
            @JvmField
            var anInt4276: Int = 0
            @JvmField
            var anInt4277: Int = 0
    
            @JvmStatic
            fun method2699(i: Int, `is`: Array<ShortArray?>?, fs: Array<FloatArray?>?): Array<ShortArray?>? {
                try {
                    if (i != 16383) return null
                    var i_1_ = 0
                    while (fs!!.size > i_1_) {
                        for (i_2_ in `is`!![i_1_]!!.indices) `is`[i_1_]!![i_2_] = (16383.0f * fs[i_1_]!![i_2_]).toInt().toShort()
                        i_1_++
                    }
                    anInt4277++
                    return `is`
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("efa.L(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (fs != null) "{...}" else "null") + ')'))
                }
            }
}
