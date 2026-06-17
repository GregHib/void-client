/* Class167 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleSystemState internal constructor(var_ha_Sub1: SoftwareRenderer) {
    private val aHa_Sub1_2191: SoftwareRenderer
    var anInt2192: Int = 0
    var aBoolean2195: Boolean = false
    var anInt2197: Int = 0
    var aRunnable2198: Runnable? = null
    var aBoolean2201: Boolean = false
    var aBoolean2202: Boolean = true
    var anInt2205: Int = 0
    var aClass101_Sub1_2209: MatrixCameraTransform?
    var anInt2210: Int
    var anInt2211: Int = 0
    var anIntArray2212: IntArray?
    var anIntArray2213: IntArray?
    var anIntArray2214: IntArray?
    var anInt2215: Int = 0
    var anIntArray2216: IntArray?
    var anIntArray2217: IntArray?
    var anIntArray2218: IntArray?
    var aClass64_Sub1_2219: Class64_Sub1?
    var aShadowProjector_2220: ShadowProjector?
    var anInt2221: Int = 0
    var anIntArray2222: IntArray?
    var aClass64_Sub1_2223: Class64_Sub1?
    var aClass64_Sub1_2224: Class64_Sub1?
    var aClass64_Sub1_2225: Class64_Sub1?
    var aFloatArray2226: FloatArray?
    var aClass64_Sub1_2227: Class64_Sub1?
    var anIntArray2228: IntArray?
    var anInt2229: Int = 0
    var anIntArray2230: IntArray?
    var aClass64_Sub1_2231: Class64_Sub1?
    var anIntArray2232: IntArray?
    var aClass64_Sub1_2233: Class64_Sub1?
    var anIntArray2234: IntArray?
    var anIntArray2235: IntArray?
    var anIntArray2236: IntArray?
    var anIntArray2237: IntArray?
    var anIntArray2238: IntArray?
    var aClass64_Sub1_2239: Class64_Sub1?
    var anIntArray2240: IntArray?
    var anIntArray2241: IntArray?
    var anIntArray2242: IntArray?
    var aClass64_Sub1_2243: Class64_Sub1?
    var anIntArray2244: IntArray?
    var anIntArray2245: IntArray?
    var aClass64_Sub1_2246: Class64_Sub1?
    var anIntArray2247: IntArray?

    fun method1291(i: Int, runnable: Runnable?) {
        if (i == 10000) {
            this.aRunnable2198 = runnable
            anInt2193++
        }
    }

    fun method1292(i: Int) {
        if (i == 64) {
            anInt2194++
            this.aShadowProjector_2220 = ShadowProjector(aHa_Sub1_2191, this)
        }
    }

    init {
        this.aClass101_Sub1_2209 = MatrixCameraTransform()
        this.anIntArray2213 = IntArray(Class64_Sub1.anInt5350)
        this.anIntArray2214 = IntArray(Class64_Sub1.anInt5350)
        this.anIntArray2212 = IntArray(64)
        this.aFloatArray2226 = FloatArray(2)
        this.anIntArray2216 = IntArray(10000)
        this.anIntArray2222 = IntArray(Class64_Sub1.anInt5350)
        this.anIntArray2232 = IntArray(64)
        this.anIntArray2218 = IntArray(8)
        this.anIntArray2237 = IntArray(Class64_Sub1.anInt5350)
        this.anIntArray2236 = IntArray(10000)
        this.anIntArray2230 = IntArray(Class64_Sub1.anInt5350)
        this.anIntArray2240 = IntArray(10)
        this.anIntArray2228 = IntArray(64)
        this.anIntArray2238 = IntArray(10)
        this.anIntArray2241 = IntArray(8)
        this.anIntArray2235 = IntArray(10)
        this.anIntArray2245 = IntArray(8)
        this.anIntArray2217 = IntArray(64)
        this.anIntArray2244 = IntArray(Class64_Sub1.anInt5350)
        this.anIntArray2247 = IntArray(10)
        this.anIntArray2234 = IntArray(Class64_Sub1.anInt5350)
        aHa_Sub1_2191 = var_ha_Sub1
        this.anInt2210 = aHa_Sub1_2191.anInt7494 + -255
        this.aShadowProjector_2220 = ShadowProjector(var_ha_Sub1, this)
        this.aClass64_Sub1_2243 = Class64_Sub1(aHa_Sub1_2191)
        this.aClass64_Sub1_2224 = Class64_Sub1(aHa_Sub1_2191)
        this.aClass64_Sub1_2219 = Class64_Sub1(aHa_Sub1_2191)
        this.aClass64_Sub1_2239 = Class64_Sub1(aHa_Sub1_2191)
        this.aClass64_Sub1_2233 = Class64_Sub1(aHa_Sub1_2191)
        this.aClass64_Sub1_2231 = Class64_Sub1(aHa_Sub1_2191)
        this.aClass64_Sub1_2223 = Class64_Sub1(aHa_Sub1_2191)
        this.aClass64_Sub1_2227 = Class64_Sub1(aHa_Sub1_2191)
        this.aClass64_Sub1_2246 = Class64_Sub1(aHa_Sub1_2191)
        this.aClass64_Sub1_2225 = Class64_Sub1(aHa_Sub1_2191)
        this.anIntArray2242 = IntArray(Class64_Sub1.anInt5346)
        var i = 0
        while (Class64_Sub1.anInt5346 > i) {
            this.anIntArray2242!![i] = -1
            i++
        }
    }

    companion object {
        var anInt2193: Int = 0
        var anInt2194: Int = 0
        var aIntRange_2196: IntRange? = IntRange(111, -1)
        var anInt2199: Int = 0
        var anInt2200: Int = 0
        var aFloat2203: Float = 0f
        @JvmField
        var anInt2204: Int = 0
        var anInt2206: Int = 0
        @JvmField
        var aRenderConfigFactory_2207: RenderConfigFactory? = RenderConfigFactory()
        var aClass45_2208: Class45? = null
        @JvmStatic
        fun method1293(i: Int) {
            aIntRange_2196 = null
            aClass45_2208 = null
            aRenderConfigFactory_2207 = null
        }

        @JvmStatic
        fun method1294(i: Byte, `is`: ByteArray?): Boolean {
            anInt2199++
            val class348_sub49 = Class348_Sub49(`is`)
            if (i > -98) method1294(73.toByte(), null)
            val i_0_ = class348_sub49.readUnsignedByte(255)
            if (i_0_ != 2) return false
            val bool = class348_sub49.readUnsignedByte(255) == 1
            if (bool) Class59_Sub2_Sub2.method569((-123).toByte(), class348_sub49)
            Class348_Sub42_Sub6.method3188((-67).toByte(), class348_sub49)
            return true
        }

        @JvmStatic
        fun method1295(class318_sub1s: Array<Class318_Sub1?>, i: Int, i_1_: Int) {
            if (i < i_1_) {
                val i_2_ = (i + i_1_) / 2
                var i_3_ = i
                val class318_sub1 = class318_sub1s[i_2_]!!
                class318_sub1s[i_2_] = class318_sub1s[i_1_]
                class318_sub1s[i_1_] = class318_sub1
                val i_4_ = class318_sub1.anInt6389
                for (i_5_ in i..<i_1_) {
                    if (class318_sub1s[i_5_]!!.anInt6389 < i_4_ + (i_5_ and 0x1)) {
                        val class318_sub1_6_: Class318_Sub1? = class318_sub1s[i_5_]
                        class318_sub1s[i_5_] = class318_sub1s[i_3_]
                        class318_sub1s[i_3_++] = class318_sub1_6_!!
                    }
                }
                class318_sub1s[i_1_] = class318_sub1s[i_3_]
                class318_sub1s[i_3_] = class318_sub1
                method1295(class318_sub1s, i, i_3_ - 1)
                method1295(class318_sub1s, i_3_ + 1, i_1_)
            }
        }

        @JvmStatic
        fun method1296(bool: Boolean): Boolean {
            if (bool != true) method1297(88.toByte(), null, null, null, null)
            anInt2200++
            if (Class348_Sub43.anInt7068 != 0) return true
            return Class98.aClass348_Sub16_Sub3_1564!!.method2860(120)
        }

        fun method1297(i: Byte, player: Player?, `is`: IntArray?, is_7_: IntArray?, is_8_: IntArray?) {
            try {
                anInt2206++
                if (i > -96) aFloat2203 = 0.6824298f
                var i_9_ = 0
                while (is_7_!!.size > i_9_) {
                    val i_10_ = is_7_[i_9_]
                    var i_11_ = `is`!![i_9_]
                    val i_12_ = is_8_!![i_9_]
                    var i_13_ = 0
                    while (i_11_ != 0 && i_13_ < (player!!.aLoadProgressCountersArray10308)!!.size) {
                        if ((i_11_ and 0x1) != 0) {
                            if (i_10_ != -1) {
                                val class17 = ParticleEmitterNode.aClass87_191!!.method835(i_10_, 7)
                                val i_14_ = class17.anInt248
                                var class182 = (player.aLoadProgressCountersArray10308!![i_13_])
                                if (class182 != null) {
                                    if (class182.anInt2454 == i_10_) {
                                        if (i_14_ == 0) {
                                            player.aLoadProgressCountersArray10308!![i_13_] = null
                                            class182 = player.aLoadProgressCountersArray10308!![i_13_]
                                        } else if (i_14_ == 1) {
                                            class182.anInt2448 = i_12_
                                            class182.anInt2455 = 1
                                            class182.anInt2456 = 0
                                            class182.anInt2451 = 0
                                            class182.anInt2445 = 0
                                            if (!player.aBoolean10309) TypedRecordTable.method2178(player, 0, class17, -54)
                                        } else if (i_14_ == 2) class182.anInt2445 = 0
                                    } else if (class17.anInt239 >= ParticleEmitterNode.aClass87_191!!.method835((class182.anInt2454), 7).anInt239) {
                                        player.aLoadProgressCountersArray10308!![i_13_] = null
                                        class182 = player.aLoadProgressCountersArray10308!![i_13_]
                                    }
                                }
                                if (class182 == null) {
                                    player.aLoadProgressCountersArray10308!![i_13_] = LoadProgressCounters()
                                    class182 = player.aLoadProgressCountersArray10308!![i_13_]
                                    class182!!.anInt2445 = 0
                                    class182.anInt2455 = 1
                                    class182.anInt2448 = i_12_
                                    class182.anInt2456 = 0
                                    class182.anInt2454 = i_10_
                                    class182.anInt2451 = 0
                                    if (!player.aBoolean10309) TypedRecordTable.method2178(player, 0, class17, -123)
                                }
                            } else player.aLoadProgressCountersArray10308!![i_13_] = null
                        }
                        i_13_++
                        i_11_ = i_11_ ushr 1
                    }
                    i_9_++
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("pga.G(" + i + ',' + (if (player != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_7_ != null) "{...}" else "null") + ',' + (if (is_8_ != null) "{...}" else "null") + ')'))
            }
        }
    }
}
