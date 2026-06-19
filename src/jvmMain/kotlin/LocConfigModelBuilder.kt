import LocConfigModelBuilderStatics.anInt4486
import LocConfigModelBuilderStatics.anInt4491
import LocConfigModelBuilderStatics.anInt4496
import LocConfigModelBuilderStatics.anInt4497
import LocConfigModelBuilderStatics.anInt4505
import LocConfigModelBuilderStatics.anInt4511

/* Class368 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LocConfigModelBuilder {
    @JvmField
    var aBoolean4487: Boolean = false
    @JvmField
    var aByte4488: Byte = 0
    private var anInt4489 = 0
    private var aShortArray4490: ShortArray? = null
    private var anInt4492 = 128
    private var anInt4498 = 128
    private var aShortArray4499: ShortArray? = null
    @JvmField
    var anInt4501: Int = 0
    private var aShortArray4502: ShortArray? = null
    @JvmField
    var anInt4503: Int
    private var aShortArray4504: ShortArray? = null
    private var anInt4506 = 0
    private var anInt4507: Int
    private var anInt4508 = 0
    private var anInt4512 = 0
    @JvmField
    var aMapElementDefinitionCache_4513: MapElementDefinitionCache? = null

    fun method3558(i: Int, i_0_: Int, var_renderer: Renderer?, i_1_: Int, i_2_: Int, widgetCache: WidgetCache?, i_3_: Int): AbstractModel? {
        try {
            if (i_2_ != 3172) aShortArray4504 = null
            anInt4505++
            return method3566(var_renderer, i_3_, i_1_, null, 0, widgetCache, i, 5.toByte(), null, 0, false, 0, (-68).toByte(), i_0_)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("fk.B(" + i + ',' + i_0_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + (if (widgetCache != null) "{...}" else "null") + ',' + i_3_ + ')'))
        }
    }

    fun method3559(i: Int, class348_sub49: ByteBuffer) {
        anInt4497++
        if (i == 28105) {
            while (true) {
                val i_4_ = class348_sub49.readUnsignedByte(255)
                if (i_4_ == 0) break
                method3564(i xor 0x6db5.inv(), class348_sub49, i_4_)
            }
        }
    }

    fun method3562(i: Int, var_renderer: Renderer?, i_5_: Int, i_6_: Int, i_7_: Int, widgetCache: WidgetCache?, i_8_: Byte): AbstractModel? {
        try {
            if (i_8_ <= 24) return null
            anInt4511++
            return method3566(var_renderer, i, i_6_, null, 0, widgetCache, i_5_, 2.toByte(), null, 0, false, 0, (-68).toByte(), i_7_)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("fk.A(" + i + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + (if (widgetCache != null) "{...}" else "null") + ',' + i_8_ + ')'))
        }
    }

    private fun method3564(i: Int, class348_sub49: ByteBuffer, i_11_: Int) {
        anInt4486++
        if (i < -119) {
            if (i_11_ == 1) anInt4506 = class348_sub49.readUnsignedShort(842397944)
            else if (i_11_ != 2) {
                if (i_11_ == 4) anInt4498 = class348_sub49.readUnsignedShort(842397944)
                else if (i_11_ != 5) {
                    if (i_11_ != 6) {
                        if (i_11_ != 7) {
                            if (i_11_ != 8) {
                                if (i_11_ == 9) {
                                    anInt4507 = 8224
                                    this.aByte4488 = 3.toByte()
                                } else if (i_11_ != 10) {
                                    if (i_11_ != 11) {
                                        if (i_11_ == 12) this.aByte4488 = 4.toByte()
                                        else if (i_11_ == 13) this.aByte4488 = 5.toByte()
                                        else if (i_11_ == 14) {
                                            this.aByte4488 = 2.toByte()
                                            anInt4507 = class348_sub49.readUnsignedByte(255) * 256
                                        } else if (i_11_ == 15) {
                                            this.aByte4488 = 3.toByte()
                                            anInt4507 = class348_sub49.readUnsignedShort(842397944)
                                        } else if (i_11_ == 16) {
                                            this.aByte4488 = 3.toByte()
                                            anInt4507 = (class348_sub49.readInt((-126).toByte()))
                                        } else if (i_11_ == 40) {
                                            val i_14_ = class348_sub49.readUnsignedByte(255)
                                            aShortArray4490 = ShortArray(i_14_)
                                            aShortArray4502 = ShortArray(i_14_)
                                            var i_15_ = 0
                                            while (i_14_ > i_15_) {
                                                aShortArray4490!![i_15_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                                aShortArray4502!![i_15_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                                i_15_++
                                            }
                                        } else if (i_11_ == 41) {
                                            val i_12_ = (class348_sub49.readUnsignedByte(255))
                                            aShortArray4504 = ShortArray(i_12_)
                                            aShortArray4499 = ShortArray(i_12_)
                                            var i_13_ = 0
                                            while (i_12_ > i_13_) {
                                                aShortArray4499!![i_13_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                                aShortArray4504!![i_13_] = (class348_sub49.readUnsignedShort(842397944)).toShort()
                                                i_13_++
                                            }
                                        }
                                    } else this.aByte4488 = 1.toByte()
                                } else this.aBoolean4487 = true
                            } else anInt4512 = class348_sub49.readUnsignedByte(255)
                        } else anInt4489 = class348_sub49.readUnsignedByte(255)
                    } else anInt4508 = class348_sub49.readUnsignedShort(842397944)
                } else anInt4492 = class348_sub49.readUnsignedShort(842397944)
            } else this.anInt4503 = class348_sub49.readUnsignedShort(842397944)
        }
    }

    fun method3565(i: Int, i_16_: Int, i_17_: Int, i_18_: Int, bool: Boolean, var_renderer: Renderer?, i_19_: Int, i_20_: Int, i_21_: Int, widgetCache: WidgetCache?, var_terrainTile: TerrainTile?, i_22_: Int, var_terrainTile_23_: TerrainTile?): AbstractModel? {
        try {
            anInt4496++
            if (i_21_ != -129) method3566(null, 36, -84, null, 43, null, 2, 54.toByte(), null, -17, true, -42, 95.toByte(), -81)
            return method3566(var_renderer, i_16_, i_18_, var_terrainTile, i_22_, widgetCache, i, 2.toByte(), var_terrainTile_23_, i_17_, bool, i_20_, (-68).toByte(), i_19_)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("fk.F(" + i + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + bool + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + (if (widgetCache != null) "{...}" else "null") + ',' + (if (var_terrainTile != null) "{...}" else "null") + ',' + i_22_ + ',' + (if (var_terrainTile_23_ != null) "{...}" else "null") + ')'))
        }
    }

    init {
        this.anInt4503 = -1
        anInt4507 = -1
    }

    private fun method3566(var_renderer: Renderer?, i: Int, i_24_: Int, var_terrainTile: TerrainTile?, i_25_: Int, widgetCache: WidgetCache?, i_26_: Int, i_27_: Byte, var_terrainTile_28_: TerrainTile?, i_29_: Int, bool: Boolean, i_30_: Int, i_31_: Byte, i_32_: Int): AbstractModel? {
        var bool = bool
        try {
            anInt4491++
            var i_33_ = i_24_
            val class17 = (if (this.anInt4503 != -1 && i != -1) widgetCache!!.method835(this.anInt4503, 7) else null)
            bool = bool and (this.aByte4488.toInt() != 0)
            if (class17 != null) i_33_ = i_33_ or class17.method263(i_32_, 110, i, false)
            if (bool) i_33_ = i_33_ or (if (this.aByte4488.toInt() != 3) 2 else 7)
            if (anInt4492 != 128) i_33_ = i_33_ or 0x2
            if (anInt4498 != 128 || anInt4508 != 0) i_33_ = i_33_ or 0x5
            var abstractModel: AbstractModel?
            this.anInt4501 = this.anInt4501 or (var_renderer!!.anInt4567 shl 29)
            synchronized(this.aMapElementDefinitionCache_4513!!.aLruByteCache_3990) {
                abstractModel = ((this.aMapElementDefinitionCache_4513!!.aLruByteCache_3990.method583(this.anInt4501.toLong(), -122)) as AbstractModel?)
            }
            if (abstractModel == null || var_renderer!!.method3667(abstractModel.ua(), i_33_) != 0) {
                if (abstractModel != null) i_33_ = var_renderer!!.method3679(i_33_, abstractModel.ua())
                var i_34_ = i_33_
                if (aShortArray4490 != null) i_34_ = i_34_ or 0x4000
                if (aShortArray4499 != null) i_34_ = i_34_ or 0x8000
                val class124 = ParticleConfigParserStatics.method2277(0, (this.aMapElementDefinitionCache_4513!!.aJs5Archive_3981!!), anInt4506, -1)
                if (class124 == null) return null
                if (class124.anInt1830 < 13) class124.method1092(2, 114)
                abstractModel = var_renderer!!.method3625(class124, i_34_, (this.aMapElementDefinitionCache_4513!!.anInt3991), 64 + anInt4489, anInt4512 - -850)
                if (aShortArray4490 != null) {
                    var i_35_ = 0
                    while ((i_35_ < aShortArray4490!!.size)) {
                        abstractModel.ia(aShortArray4490!![i_35_], aShortArray4502!![i_35_])
                        i_35_++
                    }
                }
                if (aShortArray4499 != null) {
                    var i_36_ = 0
                    while ((aShortArray4499!!.size > i_36_)) {
                        abstractModel.aa(aShortArray4499!![i_36_], aShortArray4504!![i_36_])
                        i_36_++
                    }
                }
                abstractModel.s(i_33_)
                synchronized(this.aMapElementDefinitionCache_4513!!.aLruByteCache_3990) {
                    this.aMapElementDefinitionCache_4513!!.aLruByteCache_3990.method582(abstractModel, this.anInt4501.toLong(), (-113).toByte())
                }
            }
            if (i_31_.toInt() != -68) return null
            val class64_37_ = (if (class17 != null) class17.method266(abstractModel, 0, i_32_, i_27_, i, i_26_, 663780816, i_33_) else abstractModel.method614(i_27_, i_33_, true))
            if (anInt4498 != 128 || anInt4492 != 128) class64_37_!!.O(anInt4498, anInt4492, anInt4498)
            if (anInt4508 != 0) {
                if (anInt4508 == 90) class64_37_!!.a(4096)
                if (anInt4508 == 180) class64_37_!!.a(8192)
                if (anInt4508 == 270) class64_37_!!.a(12288)
            }
            if (bool) class64_37_!!.p(this.aByte4488.toInt(), anInt4507, var_terrainTile_28_, var_terrainTile, i_30_, i_29_, i_25_)
            class64_37_!!.s(i_24_)
            return class64_37_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("fk.I(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + i_24_ + ',' + (if (var_terrainTile != null) "{...}" else "null") + ',' + i_25_ + ',' + (if (widgetCache != null) "{...}" else "null") + ',' + i_26_ + ',' + i_27_ + ',' + (if (var_terrainTile_28_ != null) "{...}" else "null") + ',' + i_29_ + ',' + bool + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ')'))
        }
    }
}
