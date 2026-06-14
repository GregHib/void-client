/**
 * JVM singleton [SoftwareToolkitFactory] wired with all AWT/JVM concrete implementations.
 *
 * Used by [haStatics.method3692] for the software branch (`i_171_ == 0`) and by
 * [Class348_Sub5Statics.method2753] which now delegates to [SoftwareToolkitFactory.build].
 */
val JvmSoftwareToolkitFactory = SoftwareToolkitFactory(
    interface13Factory = { i, i2 -> Class216(i, i2) },
    interface4Factory = { ha, i3, i13 -> Class49(ha, i3 as Class105?, i13 as Class216?) },
    class64Factory = { ha, c124, i, i1, i2, i3 -> Class64_Sub1(ha, c124 as Class124, i, i1, i2, i3) },
    sFactory = { ha, a, b, c, d, e, f, g -> s_Sub1(ha, a, b, c, d, e, f, g) },
    class167Factory = { ha -> Class167(ha) },
    class60Factory = { Class60(it) },
    class324FactoryProvider = { bool ->
        { ha, c143, c207s, bool_284_ ->
            val class143 = c143 as Class143?
            val `is` = IntArray(c207s!!.size)
            val is_283_ = IntArray(c207s.size)
            var hasByteData = false
            for (i in c207s.indices) {
                `is`[i] = c207s[i]!!.anInt2702
                is_283_[i] = c207s[i]!!.anInt2696
                if (c207s[i]!!.aByteArray2695 != null) hasByteData = true
            }
            if (bool) {
                if (hasByteData) Class324_Sub4(ha, class143, c207s, `is`, is_283_)
                else Class324_Sub1(ha, class143, c207s, `is`, is_283_)
            } else {
                require(!hasByteData) { "" }
                Class324_Sub3(ha, class143, c207s, `is`, is_283_)
            }
        }
    },
    class105FactoryProvider = ::JvmClass105Factory,
    audioInit = { Class59_Sub2_Sub1.method566(true, true, (-126).toByte()) { Class239_Sub25.method1827(1415665776) } },
    screenReleaseCallback = { Class286_Sub8.method2173(false, -101, true) },
)
