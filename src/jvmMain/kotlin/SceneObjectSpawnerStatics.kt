import ScrollingNoiseTextureStatics.method560

object SceneObjectSpawnerStatics {
    @JvmField
            var anInt1278: Int = 0
            @JvmField
            var aNamedIdRecord_1279: NamedIdRecord? = NamedIdRecord("LOCAL", 4)
            @JvmField
            var anInt1280: Int = 0
            @JvmField
            var anInt1281: Int = 0
            @JvmField
            var anInt1284: Int = 0
            @JvmField
            var anInt1285: Int = 0
            @JvmField
            var aHostPingThread_1286: HostPingThread?
            @JvmField
            var aFloat1287: Float = 1024.0f
            var anInt1288: Int = 0
    
            fun method771(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, `is`: IntArray?, i_5_: Int): Boolean {
                var i_1_ = i_1_
                var i_2_ = i_2_
                var i_3_ = i_3_
                var i_4_ = i_4_
                var i_5_ = i_5_
                anInt1281++
                if (i_3_ > WorldMapToggle.anInt3872) i_3_ = WorldMapToggle.anInt3872
                if (i_4_ < 0) i_4_ = 0
                if (i_0_.toInt() != -25) anInt1288 = -32
                if (i_4_ >= i_3_) return true
                i_5_ += -1 + i_4_
                i_1_ += i * i_4_
                i_2_ = -i_4_ + i_3_ shr 2
                if (ModelTransformParamsStatics.anInt4319 == 1) {
                    NpcDefinitionStatics.anInt2946 += i_2_
                    while (--i_2_ >= 0) {
                        if (`is`!![++i_5_] > i_1_) `is`[i_5_] = i_1_
                        i_1_ += i
                        if (`is`[++i_5_] > i_1_) `is`[i_5_] = i_1_
                        i_1_ += i
                        if (i_1_ < `is`[++i_5_]) `is`[i_5_] = i_1_
                        i_1_ += i
                        if (`is`[++i_5_] > i_1_) `is`[i_5_] = i_1_
                        i_1_ += i
                    }
                    i_2_ = 0x3 and i_3_ - i_4_
                    while (--i_2_ >= 0) {
                        if (`is`!![++i_5_] > i_1_) `is`[i_5_] = i_1_
                        i_1_ += i
                    }
                } else {
                    i_1_ -= 38400
                    while (--i_2_ >= 0) {
                        if (`is`!![++i_5_] > i_1_) return false
                        i_1_ += i
                        if (`is`[++i_5_] > i_1_) return false
                        i_1_ += i
                        if (i_1_ < `is`[++i_5_]) return false
                        i_1_ += i
                        if (`is`[++i_5_] > i_1_) return false
                        i_1_ += i
                    }
                    i_2_ = 0x3 and i_3_ - i_4_
                    while (--i_2_ >= 0) {
                        if (i_1_ < `is`!![++i_5_]) return false
                        i_1_ += i
                    }
                }
                return true
            }
    
            @JvmStatic
            fun method772(i: Byte) {
                aHostPingThread_1286 = null
                aNamedIdRecord_1279 = null
            }
    
            @JvmStatic
            fun method773(bool: Boolean) {
                BrightnessContrastEffectStatics.aBoolean9181 = bool
                anInt1284++
            }
    
            init {
                aHostPingThread_1286 = HostPingThread()
            }
}
