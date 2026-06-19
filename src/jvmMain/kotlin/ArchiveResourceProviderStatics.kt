object ArchiveResourceProviderStatics {
    @JvmField
            var aIntRange_6340: IntRange? = IntRange(74, 28)
            @JvmField
            var anInt6341: Int = 0
            @JvmField
            var anInt6343: Int = 0
            @JvmField
            var anInt6345: Int = 0
            @JvmField
            var anInt6348: Int = 0
            @JvmField
            var anInt6349: Int = 0
            @JvmField
            var anInt6353: Int = 0
            @JvmField
            var anInt6356: Int = 0
            @JvmField
            var anInt6357: Int = 0
            @JvmField
            var anInt6358: Int = 0
            @JvmField
            var anInt6359: Int = 0
            @JvmField
            var anInt6362: Int = 0
            @JvmField
            var anInt6363: Int = 0
            @JvmField
            var anInt6366: Int = 0
            @JvmField
            var anInt6367: Int = 0
            @JvmField
            var anInt6370: Int = 0
            @JvmStatic
            fun method2344(i: Int) {
                if (i == 0) aIntRange_6340 = null
            }
    
            @JvmStatic
            fun method2347(i: Byte): String? {
                if (i.toInt() != -119) return null
                anInt6343++
                if (ScrollbarComponentStatics.aBoolean8335 || IntHashSetStatics.aClass348_Sub42_Sub12_3963 == null) return ""
                if (((IntHashSetStatics.aClass348_Sub42_Sub12_3963!!.aString9601) == null || IntHashSetStatics.aClass348_Sub42_Sub12_3963!!.aString9601!!.length == 0) && (IntHashSetStatics.aClass348_Sub42_Sub12_3963!!.aString9595) != null && IntHashSetStatics.aClass348_Sub42_Sub12_3963!!.aString9595!!.length > 0) return (IntHashSetStatics.aClass348_Sub42_Sub12_3963!!.aString9595)
                return (IntHashSetStatics.aClass348_Sub42_Sub12_3963!!.aString9601)
            }
    
            @JvmStatic
            fun method2348(i: Int): Int {
                anInt6353++
                if (i != -8454) method2352(44, -11, 126)
                val i_6_: Int
                if (TextureDefinitionCacheStatics.anInt2964 < 96) {
                    GradientLookupEffectStatics.method3076(0, true)
                    i_6_ = 1
                } else {
                    val i_7_ = ViewportTransformStatics.method2116(-26584)
                    if (i_7_ > 100) {
                        if (i_7_ <= 500) {
                            i_6_ = 3
                            NanoTimerStatics.method447((-59).toByte())
                        } else if (i_7_ <= 1000) {
                            i_6_ = 2
                            ServerConnectionInfoStatics.method1263(true)
                        } else {
                            GradientLookupEffectStatics.method3076(0, true)
                            i_6_ = 1
                        }
                    } else {
                        i_6_ = 4
                        PlayerUpdateDecoder.method1140(58)
                    }
                }
                if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) != 0) {
                    IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 0)
                    GlShadowRenderPassStatics.method3553(false, 120.toByte(), 0)
                }
                GlCubeMapTextureStatics.method243(37)
                return i_6_
            }
    
            @JvmStatic
            fun method2352(i: Int, i_20_: Int, i_21_: Int): Boolean {
                anInt6358++
                val i_22_ = -38 / ((60 - i) / 40)
                return (0x10 and i_21_) != 0
            }
}
