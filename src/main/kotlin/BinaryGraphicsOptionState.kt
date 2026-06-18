/* Class239_Sub11 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BinaryGraphicsOptionState : GraphicsOptionState {
    fun method1768(i: Int): Int {
        if (i != -32350) method1767(true, -55)
        anInt5958++
        return this.anInt3138
    }

    override fun method1710(i: Int): Int {
        anInt5956++
        if (i != 20014) return -48
        return 0
    }

    override fun method1716(bool: Boolean) {
        if (bool != false) method1716(false)
        anInt5954++
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1712(i: Int, i_2_: Int) {
        anInt5952++
        this.anInt3138 = i_2_
        val i_3_ = 98 / ((82 - i) / 35)
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1714(i: Int, i_15_: Int): Int {
        if (i != 3) return 94
        anInt5955++
        return 1
    }

    companion object {
        @JvmField
        var aIntRange_5949: IntRange? = IntRange(69, 12)
        @JvmField
        var aIntRange_5950: IntRange?
        @JvmField
        var anInt5951: Int = 1339
        @JvmField
        var anInt5952: Int = 0
        @JvmField
        var anInt5953: Int = 0
        @JvmField
        var anInt5954: Int = 0
        @JvmField
        var anInt5955: Int = 0
        @JvmField
        var anInt5956: Int = 0
        @JvmField
        var anInt5957: Int = 0
        @JvmField
        var anInt5958: Int = 0
        @JvmField
        var anInt5959: Int

        @JvmStatic
        fun method1767(bool: Boolean, i: Int) {
            anInt5953++
            ProjectionCameraTransform.method947(41.toByte())
            val i_0_ = (NormalMapGenerator.aParticleAmountCache_3453!!.method1588(-51, i).anInt2125)
            if (i_0_ != 0) {
                if (bool != true) method1769(-43)
                val i_1_ = (ProjectedGroundDecor.aVarpStore_10209!!.anIntArray5063[i])
                if (i_0_ == 5) WallEntity.anInt8770 = i_1_
                if (i_0_ == 6) TileTextureNode.anInt9408 = i_1_
            }
        }

        @JvmStatic
        fun method1769(i: Int) {
            aIntRange_5950 = null
            if (i != 100) method1769(-25)
            aIntRange_5949 = null
        }

        @JvmStatic
        fun method1770(i: Byte): Int {
            anInt5957++
            if (Class367_Sub8.anInt7365 == 0) {
                SlotBinding.aSlotBinding_3401!!.method2025(ConfigVarProgress("jaclib"), false)
                if (SlotBinding.aSlotBinding_3401!!.method2027(119)!!.method31(28) != 100) return 1
                if (!(SlotBinding.aSlotBinding_3401!!.method2027(71) as ConfigVarProgress).method2313(124)) Class79.aClient1367!!.method97(i + 24)
                Class367_Sub8.anInt7365 = 1
            }
            if (Class367_Sub8.anInt7365 == 1) {
                Crc64Hashable.aSlotBindingArray4987 = SlotBinding.method2029(110)
                SlotBinding.aSlotBinding_3396!!.method2025(MapArchiveSource(Class367_Sub8.aClass45_7362!!), false)
                SlotBinding.aSlotBinding_3402!!.method2025(ConfigVarProgress("jaggl"), false)
                SlotBinding.aSlotBinding_3403!!.method2025(ConfigVarProgress("jagdx"), false)
                SlotBinding.aSlotBinding_3404!!.method2025(ConfigVarProgress("jagmisc"), false)
                SlotBinding.aSlotBinding_3405!!.method2025(ConfigVarProgress("sw3d"), false)
                SlotBinding.aSlotBinding_3406!!.method2025(ConfigVarProgress("hw3d"), false)
                SlotBinding.aSlotBinding_3407!!.method2025(ConfigVarProgress("jagtheora"), false)
                SlotBinding.aSlotBinding_3408!!.method2025(MapArchiveSource(SpriteLoadValidator.aClass45_4796!!), false)
                SlotBinding.aSlotBinding_3409!!.method2025(MapArchiveSource(KeyEventNode.aClass45_4770!!), false)
                SlotBinding.aSlotBinding_3410!!.method2025(MapArchiveSource(Class95.aClass45_1541!!), false)
                SlotBinding.aSlotBinding_3411!!.method2025(MapArchiveSource(Class94.aClass45_1538!!), false)
                SlotBinding.aSlotBinding_3412!!.method2025(MapArchiveSource(VideoAdChecker.aClass45_3183!!), false)
                SlotBinding.aSlotBinding_3413!!.method2025(MapArchiveSource(FloatGrid.aClass45_4975!!), false)
                SlotBinding.aSlotBinding_3414!!.method2025(MapArchiveSource(SpotAnimVector.aClass45_2306!!), false)
                SlotBinding.aSlotBinding_3415!!.method2025(MapArchiveSource(OpenGlRenderNode.aClass45_10480!!), false)
                SlotBinding.aSlotBinding_3416!!.method2025(MapArchiveSource(Class78.aClass45_1322!!), false)
                SlotBinding.aSlotBinding_3417!!.method2025(MapArchiveSource(MidiSequencePlayer.aClass45_8926!!), false)
                SlotBinding.aSlotBinding_3418!!.method2025(MapArchiveSource(ModelBatchBase.aClass45_1897!!), false)
                SlotBinding.aSlotBinding_3419!!.method2025(MapArchiveSource(Class82.aClass45_1434!!), false)
                SlotBinding.aSlotBinding_3420!!.method2025(MapArchiveSource(aClass45_3146!!), false)
                SlotBinding.aSlotBinding_3421!!.method2025(MapArchiveSource(NodeDeque.aClass45_3323!!), false)
                SlotBinding.aSlotBinding_3422!!.method2025(Class73((SceneTilePlaneManager.aClass45_233), "huffman"), false)
                SlotBinding.aSlotBinding_3423!!.method2025(MapArchiveSource(IntKeyNode.aClass45_6980!!), false)
                SlotBinding.aSlotBinding_3424!!.method2025(MapArchiveSource(CameraNodeList.aClass45_1743!!), false)
                SlotBinding.aSlotBinding_3425!!.method2025(MapArchiveSource(SoftwareSpriteRaster.aClass45_1627!!), false)
                SlotBinding.aSlotBinding_3426!!.method2025(SpriteLoadValidator((TerrainShadowBuilderGl2.aClass45_6950), "details"), false)
                for (i_4_ in Crc64Hashable.aSlotBindingArray4987!!.indices) {
                    if (Crc64Hashable.aSlotBindingArray4987!![i_4_]!!.method2027(78) == null) throw RuntimeException()
                }
                var i_5_ = 0
                val class267s = Crc64Hashable.aSlotBindingArray4987!!
                for (i_6_ in class267s.indices) {
                    val class267 = class267s[i_6_]!!
                    val i_7_ = class267.method2024(-1)
                    val i_8_ = class267.method2027(80)!!.method31(87)
                    i_5_ += i_8_ * i_7_ / 100
                }
                GradientMapTextureNode.anInt9327 = i_5_
                Class367_Sub8.anInt7365 = 2
            }
            if (Crc64Hashable.aSlotBindingArray4987 == null) return 100
            var i_9_ = 0
            var i_10_ = 0
            var bool = true
            if (i.toInt() != -25) anInt5951 = -33
            val class267s = Crc64Hashable.aSlotBindingArray4987!!
            var i_11_ = 0
            while (class267s.size > i_11_) {
                val class267 = class267s[i_11_]!!
                val i_12_ = class267.method2024(-1)
                val i_13_ = class267.method2027(70)!!.method31(i.toInt() xor 0x75)
                i_9_ += i_12_
                i_10_ += i_13_ * i_12_ / 100
                if (i_13_ < 100) bool = false
                i_11_++
            }
            if (bool) {
                if (!(SlotBinding.aSlotBinding_3404!!.method2027(92) as ConfigVarProgress).method2313(102)) Class79.aClient1367!!.method83(true)
                if (!(SlotBinding.aSlotBinding_3407!!.method2027(i.toInt() xor 0x64.inv()) as ConfigVarProgress).method2313(103)) WidgetTextConfig.aBoolean510 = Class79.aClient1367!!.method100(i.toInt() xor 0x12.inv())
                Crc64Hashable.aSlotBindingArray4987 = null
            }
            i_9_ -= GradientMapTextureNode.anInt9327
            i_10_ -= GradientMapTextureNode.anInt9327
            var i_14_ = if (i_9_ <= 0) 100 else 100 * i_10_ / i_9_
            if (!bool && i_14_ > 99) i_14_ = 99
            return i_14_
        }

        init {
            aIntRange_5950 = IntRange(64, 2)
            anInt5959 = 0
        }
    }
}
