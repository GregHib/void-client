object LinkedListNodeStatics {

    var aJs5Archive_4286: Js5Archive? = null
    var anInt4287: Int = 0
    var anIntArray4288: IntArray?
    var anInt4289: Int = 0
    var anInt4290: Int
    var anInt4292: Int = 0
    var aClass318_Sub1Array4293: Array<SceneEntity?>? = null
    var anInt4296: Int = 0
    var anInt4298: Int = 0

    @JvmStatic
    fun method2709(i: Int, i_0_: Int, i_1_: Int): Boolean {
        anInt4287++
        if (i_1_ != -1) method2711(-42, 89, null, -113, true, -22, -35, 27, -109, null, 74, -94, -119, null)
        return (0x21 and i_0_) != 0
    }

    @JvmStatic
    fun method2710(i: Int, i_2_: Int): Int {
        anInt4289++
        if (i_2_ < 96) return 0
        if (i >= -113) aClass318_Sub1Array4293 = null
        if (i_2_ < 128) return 2
        return 3
    }

    @JvmStatic
    fun method2711(i: Int, i_3_: Int, abstractModel: AbstractModel?, i_4_: Int, bool: Boolean, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, var_renderer: Renderer?, i_9_: Int, i_10_: Int, i_11_: Int, widgetDefinition: WidgetDefinition?): AbstractModel? {
        var i_5_ = i_5_
        try {
            anInt4298++
            if (abstractModel == null) return null
            var i_12_ = 2055
            if (bool != false) return null
            if (widgetDefinition != null) {
                i_12_ = i_12_ or widgetDefinition.method263(-1, 103, i_5_, false)
                i_12_ = i_12_ and 0x200.inv()
            }
            val l = ((i_10_.toLong() shl 48) + (i_7_ + ((i_9_ shl 16) + (i_11_ shl 24))).toLong() - -(i_6_.toLong() shl 32))
            var abstractModel_13_: AbstractModel?
            withLock(WidgetRedrawRegion.aLruByteCache_4254!!) {
                abstractModel_13_ = WidgetRedrawRegion.aLruByteCache_4254!!.method583(l, -64) as AbstractModel?
            }
            if (abstractModel_13_ == null || (var_renderer!!.method3667(abstractModel_13_.ua(), i_12_) != 0)) {
                if (abstractModel_13_ != null) i_12_ = var_renderer!!.method3679(i_12_, abstractModel_13_.ua())
                val i_14_: Int
                if (i_7_ != 1) {
                    if (i_7_ == 2) i_14_ = 12
                    else if (i_7_ != 3) {
                        if (i_7_ == 4) i_14_ = 18
                        else i_14_ = 21
                    } else i_14_ = 15
                } else i_14_ = 9
                val i_15_ = 3
                val `is` = intArrayOf(64, 96, 128)
                val modelDefinition = ModelDefinition(1 + i_14_ * i_15_, 2 * i_14_ * i_15_ + -i_14_, 0)
                val i_16_ = modelDefinition.method1101(0, 0, 0, -44)
                val is_17_ = Array<IntArray?>(i_15_) { IntArray(i_14_) }
                for (i_18_ in 0..<i_15_) {
                    val i_19_ = `is`[i_18_]
                    val i_20_ = `is`[i_18_]
                    var i_21_ = 0
                    while (i_14_ > i_21_) {
                        val i_22_ = (i_21_ shl 14) / i_14_
                        val i_23_ = (TrigLookupTables.anIntArray1207!![i_22_] * i_19_ shr 14)
                        val i_24_ = (TrigLookupTables.anIntArray1204!![i_22_] * i_20_ shr 14)
                        is_17_[i_18_]!![i_21_] = modelDefinition.method1101(0, i_24_, i_23_, 123)
                        i_21_++
                    }
                }
                var i_25_ = 0
                while (i_15_ > i_25_) {
                    val i_26_ = (i_25_ * 256 + 128) / i_15_
                    val i_27_ = -i_26_ + 256
                    val i_28_ = (i_26_ * i_11_ + i_9_ * i_27_ shr 8).toByte()
                    val i_29_ = (((0xfc0000 and ((i_10_ and 0xfc00) * i_26_ + i_27_ * (0xfc00 and i_6_))) + (((i_10_ and 0x380) * i_26_ + i_27_ * (0x380 and i_6_)) and 0x38000) + ((i_26_ * (i_10_ and 0x7f) + (0x7f and i_6_) * i_27_) and 0x7f00)) shr 8).toShort()
                    for (i_30_ in 0..<i_14_) {
                        if (i_25_ == 0) modelDefinition.method1102(i_16_, 1.toByte(), (-1).toByte(), (-1).toShort(), 45.toByte(), i_29_, is_17_[0]!![(1 + i_30_) % i_14_], i_28_, is_17_[0]!![i_30_])
                        else {
                            modelDefinition.method1102(is_17_[i_25_ - 1]!![i_30_], 1.toByte(), (-1).toByte(), (-1).toShort(), 48.toByte(), i_29_, is_17_[i_25_ + -1]!![(1 + i_30_) % i_14_], i_28_, is_17_[i_25_]!![(1 + i_30_) % i_14_])
                            modelDefinition.method1102(is_17_[-1 + i_25_]!![i_30_], 1.toByte(), (-1).toByte(), (-1).toShort(), 100.toByte(), i_29_, (is_17_[i_25_]!![(1 + i_30_) % i_14_]), i_28_, is_17_[i_25_]!![i_30_])
                        }
                    }
                    i_25_++
                }
                abstractModel_13_ = var_renderer!!.method3625(modelDefinition, i_12_, MapSceneDefLoader.anInt2482, 64, 768)
                withLock(WidgetRedrawRegion.aLruByteCache_4254!!) {
                    WidgetRedrawRegion.aLruByteCache_4254!!.method582(abstractModel_13_, l, (-103).toByte())
                }
            }
            val i_31_ = abstractModel.V()
            val i_32_ = abstractModel.RA()
            val i_33_ = abstractModel.HA()
            val i_34_ = abstractModel.G()
            var class348_sub42_sub17: TextureMaterialGroup? = null
            if (widgetDefinition != null) {
                i_5_ = widgetDefinition.anIntArray237[i_5_]
                class348_sub42_sub17 = ParticleEmitterNode.aWidgetCache_191!!.method839(i_5_ shr 16, 3)
                i_5_ = i_5_ and 0xffff
            }
            if (class348_sub42_sub17 == null) {
                abstractModel_13_ = abstractModel_13_.method614(3.toByte(), i_12_, true)
                abstractModel_13_!!.O(-i_31_ + i_32_ shr 1, 128, -i_33_ + i_34_ shr 1)
                abstractModel_13_.H(i_32_ + i_31_ shr 1, 0, i_34_ + i_33_ shr 1)
            } else {
                abstractModel_13_ = abstractModel_13_.method614(3.toByte(), i_12_, true)
                abstractModel_13_!!.O(-i_31_ + i_32_ shr 1, 128, i_34_ - i_33_ shr 1)
                abstractModel_13_.H(i_32_ + i_31_ shr 1, 0, i_34_ + i_33_ shr 1)
                abstractModel_13_.method611(i_5_, -8700, class348_sub42_sub17)
            }
            if (i != 0) abstractModel_13_.FA(i)
            if (i_4_ != 0) abstractModel_13_.VA(i_4_)
            if (i_8_ != 0) abstractModel_13_.H(0, i_8_, 0)
            return abstractModel_13_
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("eh.PC(" + i + ',' + i_3_ + ',' + (if (abstractModel != null) "{...}" else "null") + ',' + i_4_ + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + (if (widgetDefinition != null) "{...}" else "null") + ')'))
        }
    }

    @JvmStatic
    fun method2713(i: Int) {
        aJs5Archive_4286 = null
        aClass318_Sub1Array4293 = null
        if (i != 0) method2711(-47, 87, null, 85, false, -126, -116, -51, -44, null, 75, -69, 87, null)
        anIntArray4288 = null
    }

    fun method2714(i: Int, i_35_: Int): Boolean {
        if (i != 7351) method2709(-15, 59, 58)
        anInt4296++
        return i_35_ == 1 || i_35_ == 3 || i_35_ == 5
    }

    init {
        anIntArray4288 = IntArray(6)
        anInt4290 = 0
    }
}