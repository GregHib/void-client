import MinimapFlagRenderer.method1083
import FrameStatsReset.Companion.method1131
import GlFramebufferBlitter.Companion.method282
import Class340.Companion.method2672
import Class348_Sub17.Companion.method2929
import Class348_Sub23_Sub4.Companion.method2988
import Class348_Sub40_Sub30.Companion.method3126
import Class348_Sub40_Sub32.Companion.method3134
import Class348_Sub42_Sub8.Companion.method3196
import Class75.Companion.method749

/* Class348_Sub42_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub3 internal constructor(var aByteArray9499: ByteArray?) : Class348_Sub42() {
    companion object {
        @JvmField
        var aBoolean9498: Boolean = false
        var anInt9500: Int = 0
        @JvmField
        var anInt9501: Int
        @JvmField
        var aShortArray9502: ShortArray?
        var aIntRange_9503: IntRange?
        @JvmField
        var anInt9504: Int = 0
        var anIntArray9505: IntArray? = IntArray(3)
        var anInt9506: Int = 0
        var anInt9507: Int = 0
        var anInt9508: Int = 0
        var anInt9509: Int = 0

        fun method3174(i: Int, i_0_: Int, i_1_: Int, bool: Boolean, i_2_: Byte, i_3_: Int) {
            var i = i
            var i_0_ = i_0_
            var i_1_ = i_1_
            var i_3_ = i_3_
            if (i_1_ < 1) i_1_ = 1
            anInt9507++
            if (i_3_ < 1) i_3_ = 1
            var i_4_ = i_3_ - 334
            if (i_4_ < 0) i_4_ = 0
            else if (i_4_ > 100) i_4_ = 100
            var i_5_ = ((-AbstractMenuEntry.aShort1700 + HeapDiagnosticsHolder.aShort2250) * i_4_ / 100 + AbstractMenuEntry.aShort1700)
            if (i_5_ < Class348_Sub42_Sub8.aShort9555) i_5_ = Class348_Sub42_Sub8.aShort9555.toInt()
            else if (Class48.aShort851 < i_5_) i_5_ = Class48.aShort851.toInt()
            var i_6_ = 512 * i_5_ * i_3_ / (i_1_ * 334)
            if (i_6_ >= Class367_Sub8.aShort7355) {
                if (i_6_ > RefCountedHandle.aShort2269) {
                    i_6_ = RefCountedHandle.aShort2269.toInt()
                    i_5_ = i_1_ * i_6_ * 334 / (i_3_ * 512)
                    if (i_5_ < Class348_Sub42_Sub8.aShort9555) {
                        i_5_ = Class348_Sub42_Sub8.aShort9555.toInt()
                        val i_7_ = i_6_ * (i_1_ * 334) / (i_5_ * 512)
                        val i_8_ = (-i_7_ + i_3_) / 2
                        if (bool) {
                            Class348_Sub8.aRenderer6654!!.la()
                            Class348_Sub8.aRenderer6654!!.method3675(i_1_, (-125).toByte(), i, i_0_, i_8_, -16777216)
                            Class348_Sub8.aRenderer6654!!.method3675(i_1_, (-125).toByte(), i, i_3_ + i_0_ - i_8_, i_8_, -16777216)
                        }
                        i_0_ += i_8_
                        i_3_ -= 2 * i_8_
                    }
                }
            } else {
                i_6_ = Class367_Sub8.aShort7355.toInt()
                i_5_ = i_6_ * (i_1_ * 334) / (i_3_ * 512)
                if (Class48.aShort851 < i_5_) {
                    i_5_ = Class48.aShort851.toInt()
                    val i_9_ = i_5_ * i_3_ * 512 / (334 * i_6_)
                    val i_10_ = (i_1_ + -i_9_) / 2
                    if (bool) {
                        Class348_Sub8.aRenderer6654!!.la()
                        Class348_Sub8.aRenderer6654!!.method3675(i_10_, (-125).toByte(), i, i_0_, i_3_, -16777216)
                        Class348_Sub8.aRenderer6654!!.method3675(i_10_, (-125).toByte(), -i_10_ + i + i_1_, i_0_, i_3_, -16777216)
                    }
                    i += i_10_
                    i_1_ -= i_10_ * 2
                }
            }
            Class97.anInt1550 = i_3_ * i_5_ / 334
            RandomAccessFileOnDisk.anInt3047 = i_0_
            GroundDecorRenderer.anInt3643 = i_3_.toShort().toInt()
            WidgetComponentNode.anInt4656 = i_1_.toShort().toInt()
            LocalizedTextTriple.anInt3764 = i
            val i_11_ = -3 % ((-8 - i_2_) / 56)
        }

        fun method3175(i: Byte) {
            if (!method3196(WorldMapRenderer.anInt4674, -114) && !method2672(WorldMapRenderer.anInt4674, -103)) {
                val i_12_ = ((LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) shr 3)
                val i_13_ = ((LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0]) shr 3)
                if (i_12_ < 0 || Class367_Sub4.anInt7319 shr 3 <= i_12_ || i_13_ < 0 || (Class348_Sub40_Sub3.anInt9109 shr 3 <= i_13_)) Class346_Sub1.method2703(0, Class367_Sub4.anInt7319 shr 4, (Class348_Sub40_Sub3.anInt9109 shr 4), (-13).toByte())
                else Class346_Sub1.method2703(5000, i_12_, i_13_, (-13).toByte())
            } else Class346_Sub1.method2703(5000, GlslMaterialPass.anInt6246 shr 12, Class59_Sub2_Sub2.anInt8685 shr 12, (-13).toByte())
            anInt9509++
            method3134(-1)
            method2988(true)
            val i_14_ = -8 % ((-30 - i) / 38)
            method3126(98.toByte())
            method1131(117)
        }

        @JvmStatic
        fun method3176(bool: Boolean) {
            anIntArray9505 = null
            aShortArray9502 = null
            if (bool != true) aShortArray9502 = null
            aIntRange_9503 = null
        }

        @JvmStatic
        fun method3177(i: Int, bool: Boolean) {
            if (!bool || Class75.aClass348_Sub42_Sub14_1243 == null) GroundDecorOptionState.anInt5976 = -1
            else GroundDecorOptionState.anInt5976 = (Class75.aClass348_Sub42_Sub14_1243!!.anInt9628)
            anInt9500++
            Class75.aClass348_Sub42_Sub14_1243 = null
            HeapDiagnosticsHolder.aClass46_2249 = null
            anInt4290 = 0
            RegionSceneLoader.aNodeDeque_3705 = null
            method749()
            Class75.aNodeDeque_1254!!.method1996(127)
            GlBufferObject.aClass323_4754 = null
            HeapDiagnosticsHolder.aClass323_2252 = null
            Class67.aAbstractModelRenderer_4643 = null
            MinimapSpriteRenderer.aClass323_4921 = null
            PingHostListHolder.aClass323_2333 = null
            Class348_Sub3.aClass323_6581 = null
            Class39.aClass323_521 = null
            Class75.aSmoothingBuffer_1246 = null
            GlRectangleTexture.aClass323_8644 = null
            Class48.anInt859 = -1
            if (i <= -44) {
                TextureMetadataProvider.anInt4609 = -1
                WorldMapRenderer.aClass323_4672 = null
                if (Class75.aConfigDefinitionLoader_1238 != null) {
                    Class75.aConfigDefinitionLoader_1238!!.method1219(7851)
                    Class75.aConfigDefinitionLoader_1238!!.method1220((-100).toByte(), 64, 128)
                }
                if (Class75.aTextureDefinitionLoader_1242 != null) Class75.aTextureDefinitionLoader_1242!!.method1178(64, 1, 64)
                if (Class75.aSeqDefinitionCache_1245 != null) Class75.aSeqDefinitionCache_1245!!.method2014(64, true)
                RenderConfigFactory.aVarbitDefLoader_2981!!.method1444(64, -124)
            }
        }

        fun method3178(class45: Class45?, i: Int, `is`: IntArray?, class45_15_: Class45?) {
            try {
                anInt9506++
                if (`is` != null) Class348_Sub1.anIntArray6547 = `is`
                TerrainTile.aClass45_4585 = class45
                if (i >= -6) method3177(-36, true)
                Class39.aClass45_518 = class45_15_
            } catch (runtimeexception: RuntimeException) {
                throw method2929(runtimeexception, ("lk.F(" + (if (class45 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (class45_15_ != null) "{...}" else "null") + ')'))
            }
        }

        fun method3179(i: Int) {
            CacheStateResetter.method175((-50).toByte())
            anInt9508++
            val i_16_ = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(-32350)
            do {
                if (i_16_ == 2) {
                    method1083(Class348_Sub8.aRenderer6654, 100, 9.toByte(), Class348_Sub42_Sub8_Sub2.anInt10432, 100, LocTypeDefinition.anInt4017)
                    break
                } else if (i_16_ != 3) break
                method282(2, Class348_Sub8.aRenderer6654, LocTypeDefinition.anInt4017, 73.toByte(), Class45.anInt666, PerlinTextureProvider.anInt5812, Class348_Sub42_Sub8_Sub2.anInt10432, 2)
            } while (false)
            if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1735(false)) TerrainTile.method3980(i + 93, ParticleSystemRenderer.aCanvas3869!!)
            if (Class348_Sub8.aRenderer6654 != null) BufferToggleState.method2196((-9).toByte())
            ParticleSystemRenderer.aBoolean3870 = i != IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(-32350)
            Class59_Sub1.aBoolean5300 = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1735(false)
        }

        init {
            anInt9501 = 0
            aShortArray9502 = ShortArray(256)
            aIntRange_9503 = IntRange(9, -1)
        }
    }
}
