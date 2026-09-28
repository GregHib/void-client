import kotlin.jvm.JvmStatic
import SceneEntityModel.Companion.method2503
import SpriteBlitter.method880
import jaclib.memory.Stream.Companion.c

/*
 * Class330
 */
class VideoStreamDecoder internal constructor(var_ha_Sub3: NativeRenderer?, var_s_Sub3: NativeTerrainTile?) {
    private val aHa_Sub3_4111: NativeRenderer?
    var aByteArray4112: ByteArray
    var anInt4113: Int = 0
    private val aS_Sub3_4116: NativeTerrainTile?
    private val anInt4118: Int
    private val anInt4121: Int
    private var aTerrainChunkBuilderArrayArray4122: Array<Array<TerrainChunkBuilder?>?>? = null
    private val anInt4123: Int
    private val anInt4124: Int
    fun method2628(i: Int, i_0_: Byte, var_renderNode: RenderNode?, i_1_: Int): Boolean {
        var i = i
        var i_1_ = i_1_
        anInt4119++
        val var_r_Sub1 = var_renderNode as NativeRenderNode
        val i_2_ = 13 % ((i_0_ - -21) / 45)
        i_1_ += var_r_Sub1.anInt10474 + 1
        i += var_r_Sub1.anInt10468 - -1
        var i_3_ = i_1_ * this.anInt4113 + i
        var i_4_ = var_r_Sub1.anInt10467
        var i_5_ = var_r_Sub1.anInt10466
        var i_6_ = -i_5_ + this.anInt4113
        if (i_1_ <= 0) {
            val i_7_ = 1 + -i_1_
            i_4_ -= i_7_
            i_3_ += this.anInt4113 * i_7_
            i_1_ = 1
        }
        if (anInt4123 <= i_4_ + i_1_) {
            val i_8_ = -anInt4123 + (i_4_ + i_1_) - -1
            i_4_ -= i_8_
        }
        if (i <= 0) {
            val i_9_ = -i + 1
            i = 1
            i_6_ += i_9_
            i_5_ -= i_9_
            i_3_ += i_9_
        }
        if (i_5_ + i >= this.anInt4113) {
            val i_10_ = 1 + i + (i_5_ + -this.anInt4113)
            i_5_ -= i_10_
            i_6_ += i_10_
        }
        if (i_5_ <= 0 || i_4_ <= 0) return false
        val i_11_ = 8
        i_6_ += (i_11_ + -1) * this.anInt4113
        return method2503(i_6_, i_3_, i_11_, this.aByteArray4112, i_5_, -16259, i_4_)
    }

    fun method2629(i: Int, var_renderNode: RenderNode?, i_12_: Int, i_13_: Int) {
        var i = i
        var i_13_ = i_13_
        anInt4114++
        val var_r_Sub1 = var_renderNode as NativeRenderNode
        i_13_ += 1 + var_r_Sub1.anInt10468
        i += i_12_ + var_r_Sub1.anInt10474
        var i_14_ = i * this.anInt4113 + i_13_
        var i_15_ = 0
        var i_16_ = var_r_Sub1.anInt10467
        var i_17_ = var_r_Sub1.anInt10466
        var i_18_ = this.anInt4113 + -i_17_
        if (i <= 0) {
            val i_19_ = -i + 1
            i_14_ += this.anInt4113 * i_19_
            i_16_ -= i_19_
            i = 1
            i_15_ += i_19_ * i_17_
        }
        var i_20_ = 0
        if (anInt4123 <= i_16_ + i) {
            val i_21_ = -anInt4123 + i - -i_16_ + 1
            i_16_ -= i_21_
        }
        if (i_13_ <= 0) {
            val i_22_ = 1 + -i_13_
            i_20_ += i_22_
            i_18_ += i_22_
            i_13_ = 1
            i_14_ += i_22_
            i_15_ += i_22_
            i_17_ -= i_22_
        }
        if (i_13_ + i_17_ >= this.anInt4113) {
            val i_23_ = 1 + i_17_ + (i_13_ - this.anInt4113)
            i_18_ += i_23_
            i_17_ -= i_23_
            i_20_ += i_23_
        }
        if (i_17_ > 0 && i_16_ > 0) {
            BoxBlurTextureNode.method3146(i_18_, i_17_, (-116).toByte(), i_20_, i_16_, i_14_, this.aByteArray4112, (var_r_Sub1.aByteArray10471), i_15_)
            method2634(i, -1, i_13_, i_16_, i_17_)
        }
    }

    fun method2630(i: Int, i_24_: Int, i_25_: Int, bool: Boolean, bools: Array<BooleanArray?>, i_26_: Int) {
        anInt4115++
        aHa_Sub3_4111!!.method3866(false, true)
        aHa_Sub3_4111.method3946(-32, false)
        aHa_Sub3_4111.method3817(79, 1)
        aHa_Sub3_4111.method3923(true, 1)
        aHa_Sub3_4111.method3814(false, false, -2, 82.toByte())
        val f = 1.0f / (aHa_Sub3_4111.anInt8125 * i).toFloat()
        if (bool) {
            // The prebuilt chunk buffer covers every tile of the chunk, so drawing it when only part
            // of the chunk is visible paints shadows onto terrain culled past the draw distance -
            // floating in the void beyond the map edge. Only use it when the whole chunk is drawn;
            // otherwise emit just the visible tiles, matching the terrain pass.
            for (i_27_ in 0..<anInt4118) {
                for (i_30_ in 0..<anInt4121) {
                    val chunk = aTerrainChunkBuilderArrayArray4122!![i_30_]!![i_27_] ?: continue
                    when (chunkVisibility(i_30_, i_27_, bools, i_24_, i_25_, i_26_)) {
                        CHUNK_HIDDEN -> {}
                        CHUNK_FULL -> {
                            val class101_sub2 = aHa_Sub3_4111.method3820(false)
                            class101_sub2.method932(1.0f, f, f, (-65).toByte())
                            class101_sub2.method891(-i_30_, -i_27_, 0)
                            aHa_Sub3_4111.method3853(i xor 0x9f.inv(), WaterDetailOptionState.aConfigFlagUtil_6030)
                            chunk.method871(116.toByte())
                        }
                        else -> drawVisibleTiles(chunk, i_30_, i_27_, bools, i_24_, i_25_, i_26_, i, f)
                    }
                }
            }
        } else {
            for (i_35_ in 0..<anInt4118) {
                for (i_38_ in 0..<anInt4121) {
                    val class97 = aTerrainChunkBuilderArrayArray4122!![i_38_]!![i_35_] ?: continue
                    drawVisibleTiles(class97, i_38_, i_35_, bools, i_24_, i_25_, i_26_, i, f)
                }
            }
        }
        aHa_Sub3_4111.method3879(-8629)
    }

    /** Whether tile ([x], [y]) is inside the draw window centred on ([camX], [camY]) and marked visible. */
    private fun tileVisible(x: Int, y: Int, bools: Array<BooleanArray?>, radius: Int, camX: Int, camY: Int): Boolean {
        val dx = x - camX
        val dy = y - camY
        return dx >= -radius && dx <= radius && dy >= -radius && dy <= radius && bools[radius + dx]!![radius + dy]
    }

    /**
     * [CHUNK_FULL] when every tile of the chunk that has terrain geometry is visible, so the chunk's
     * prebuilt buffer can be drawn as-is; [CHUNK_HIDDEN] when none is; [CHUNK_PARTIAL] otherwise.
     */
    private fun chunkVisibility(chunkX: Int, chunkY: Int, bools: Array<BooleanArray?>, radius: Int, camX: Int, camY: Int): Int {
        val x0 = chunkX shl anInt4124
        val y0 = chunkY shl anInt4124
        val size = 1 shl anInt4124
        val tiles = aS_Sub3_4116!!.aShortArrayArray8299
        val width = aS_Sub3_4116.anInt4587
        var any = false
        var all = true
        for (y in y0..<y0 + size) {
            for (x in x0..<x0 + size) {
                if (tileVisible(x, y, bools, radius, camX, camY)) any = true
                else if (tiles[x + y * width] != null) all = false
                if (any && !all) return CHUNK_PARTIAL
            }
        }
        return if (!any) CHUNK_HIDDEN else CHUNK_FULL
    }

    /** Draws the shadow overlay for only the visible tiles of one chunk, via a streamed index buffer. */
    private fun drawVisibleTiles(chunk: TerrainChunkBuilder, chunkX: Int, chunkY: Int, bools: Array<BooleanArray?>, radius: Int, camX: Int, camY: Int, i: Int, f: Float) {
        val interface5_impl2 = aHa_Sub3_4111!!.method3822(118, chunk.anInt1563 * 3)
        val buffer = interface5_impl2.method24(true, false) ?: return
        val stream = aHa_Sub3_4111.method3893(buffer, 9179)
        val x0 = chunkX shl anInt4124
        val y0 = chunkY shl anInt4124
        val size = 1 shl anInt4124
        var count = 0
        for (y in y0..<y0 + size) {
            for (x in x0..<x0 + size) {
                if (!tileVisible(x, y, bools, radius, camX, camY)) continue
                val `is` = aS_Sub3_4116!!.aShortArrayArray8299[x + y * aS_Sub3_4116.anInt4587] ?: continue
                if (c()) {
                    for (index in `is`) stream.d(index.toInt() and 0xffff)
                } else {
                    for (index in `is`) stream.a(index.toInt() and 0xffff)
                }
                count += `is`.size
            }
        }
        stream.a()
        if (interface5_impl2.method22(-23) && count > 0) {
            val class101_sub2 = aHa_Sub3_4111.method3820(false)
            class101_sub2.method932(1.0f, f, f, (-62).toByte())
            class101_sub2.method891(-chunkX, -chunkY, 0)
            aHa_Sub3_4111.method3853(i xor 0x9f.inv(), WaterDetailOptionState.aConfigFlagUtil_6030)
            chunk.method875(-82, interface5_impl2, count / 3)
        }
    }

    fun method2632(i: Int) {
        aTerrainChunkBuilderArrayArray4122 = Array<Array<TerrainChunkBuilder?>?>(anInt4121) { arrayOfNulls<TerrainChunkBuilder>(anInt4118) }
        anInt4125++
        var i_48_ = 0
        while (anInt4118 > i_48_) {
            for (i_49_ in 0..<anInt4121) {
                aTerrainChunkBuilderArrayArray4122!![i_49_]!![i_48_] = TerrainChunkBuilder(aHa_Sub3_4111, this, aS_Sub3_4116, i_49_, i_48_, anInt4124, 128 * i_49_ - -1, 128 * i_48_ + 1)
                if (aTerrainChunkBuilderArrayArray4122!![i_49_]!![i_48_]!!.anInt1563 == 0) aTerrainChunkBuilderArrayArray4122!![i_49_]!![i_48_] = null
            }
            i_48_++
        }
    }

    fun method2633(i: Int, i_50_: Int, var_renderNode: RenderNode?, i_51_: Int) {
        var i_50_ = i_50_
        var i_51_ = i_51_
        anInt4120++
        val var_r_Sub1 = var_renderNode as NativeRenderNode
        i_51_ += var_r_Sub1.anInt10474 + 1
        i_50_ += 1 + var_r_Sub1.anInt10468
        if (i != 287) method2634(-49, -3, 16, -9, -115)
        var i_52_ = i_50_ + this.anInt4113 * i_51_
        var i_53_ = 0
        var i_54_ = var_r_Sub1.anInt10467
        var i_55_ = var_r_Sub1.anInt10466
        var i_56_ = -i_55_ + this.anInt4113
        if (i_51_ <= 0) {
            val i_57_ = -i_51_ + 1
            i_52_ += this.anInt4113 * i_57_
            i_54_ -= i_57_
            i_53_ += i_57_ * i_55_
            i_51_ = 1
        }
        var i_58_ = 0
        if (anInt4123 <= i_54_ + i_51_) {
            val i_59_ = -anInt4123 + (i_51_ - -i_54_) + 1
            i_54_ -= i_59_
        }
        if (i_50_ <= 0) {
            val i_60_ = 1 + -i_50_
            i_53_ += i_60_
            i_56_ += i_60_
            i_58_ += i_60_
            i_52_ += i_60_
            i_50_ = 1
            i_55_ -= i_60_
        }
        if (i_55_ + i_50_ >= this.anInt4113) {
            val i_61_ = 1 + (i_55_ + (i_50_ + -this.anInt4113))
            i_58_ += i_61_
            i_55_ -= i_61_
            i_56_ += i_61_
        }
        if (i_55_ > 0 && i_54_ > 0) {
            method880(i_55_, this.aByteArray4112, var_r_Sub1.aByteArray10471, i_53_, i + 13593, i_54_, i_52_, i_56_, i_58_)
            method2634(i_51_, -1, i_50_, i_54_, i_55_)
        }
    }

    private fun method2634(i: Int, i_62_: Int, i_63_: Int, i_64_: Int, i_65_: Int) {
        anInt4110++
        if (aTerrainChunkBuilderArrayArray4122 != null) {
            val i_66_ = -1 + i_63_ shr 7
            val i_67_ = -1 + (i_65_ + i_63_ - 1) shr 7
            val i_68_ = i + -1 shr 7
            val i_69_ = i_62_ + (-1 + (i - -i_64_)) shr 7
            var i_70_ = i_66_
            while (i_67_ >= i_70_) {
                val class97s = aTerrainChunkBuilderArrayArray4122!![i_70_]!!
                var i_71_ = i_68_
                while (i_69_ >= i_71_) {
                    if (class97s[i_71_] != null) class97s[i_71_]!!.aBoolean1562 = true
                    i_71_++
                }
                i_70_++
            }
        }
    }

    init {
        try {
            aHa_Sub3_4111 = var_ha_Sub3
            aS_Sub3_4116 = var_s_Sub3
            this.anInt4113 = 2 + ((aS_Sub3_4116!!.anInt4587 * aS_Sub3_4116.anInt4592) shr aHa_Sub3_4111!!.anInt8107)
            anInt4123 = (aS_Sub3_4116.anInt4592 * aS_Sub3_4116.anInt4590 shr aHa_Sub3_4111.anInt8107) + 2
            this.aByteArray4112 = ByteArray(this.anInt4113 * anInt4123)
            anInt4124 = (-aS_Sub3_4116.anInt4588 + (7 + aHa_Sub3_4111.anInt8107))
            anInt4121 = aS_Sub3_4116.anInt4587 shr anInt4124
            anInt4118 = aS_Sub3_4116.anInt4590 shr anInt4124
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("dg.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (var_s_Sub3 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        private const val CHUNK_HIDDEN = 0
        private const val CHUNK_PARTIAL = 1
        private const val CHUNK_FULL = 2
        var anInt4110: Int = 0
        var anInt4114: Int = 0
        var anInt4115: Int = 0
        var aBoolean4117: Boolean = false
        var anInt4119: Int = 0
        var anInt4120: Int = 0
        var anInt4125: Int = 0

        var aBoolean4127: Boolean = false

        @JvmStatic
        fun method2631(i: Int) {
            val i_47_ = -46 / ((65 - i) / 61)
            InboundPacketHeader.aInboundPacketHeader_4126 = null
        }
    }
}
