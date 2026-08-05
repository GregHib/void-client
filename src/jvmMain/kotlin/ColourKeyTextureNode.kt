
/* Class348_Sub40_Sub26 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ColourKeyTextureNode : AbstractProceduralTextureNode(1, false) {
    private var anInt9344 = 4096
    private var anInt9347 = 4096
    private var anInt9354 = 4096
    override fun method3047(i: Int, i_3_: Int): Array<IntArray?>? {
        if (i_3_ != -1564599039) return null
        anInt9353++
        val `is` = this.aImageFrameCache_7033!!.method2557(i_3_ + 1564598957, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_4_ = this.method3039((-60).toByte(), i, 0)!!
            val is_5_ = is_4_[0]!!
            val is_6_ = is_4_[1]!!
            val is_7_ = is_4_[2]!!
            val is_8_ = `is`[0]!!
            val is_9_ = `is`[1]!!
            val is_10_ = `is`[2]!!
            var i_11_ = 0
            while ((i_11_ < PerlinNoiseTextureNode.Companion.anInt9139)) {
                val i_12_ = is_5_[i_11_]
                val i_13_ = is_7_[i_11_]
                val i_14_ = is_6_[i_11_]
                if (i_13_ != i_12_ || i_13_ != i_14_) {
                    is_8_[i_11_] = anInt9344
                    is_9_[i_11_] = anInt9354
                    is_10_[i_11_] = anInt9347
                } else {
                    is_8_[i_11_] = i_12_ * anInt9344 shr 12
                    is_9_[i_11_] = anInt9354 * i_13_ shr 12
                    is_10_[i_11_] = anInt9347 * i_14_ shr 12
                }
                i_11_++
            }
        }
        return `is`
    }

    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_23_: Int) {
        do {
            try {
                val i_24_ = i
                while_201_@ do {
                    do {
                        if (i_24_ == 0) {
                            anInt9344 = class348_sub49!!.readUnsignedShort(i_23_ + 842366929)
                            break@while_201_
                        } else if (i_24_ != 1) {
                            if (i_24_ == 2) break
                            break@while_201_
                        }
                        anInt9354 = class348_sub49!!.readUnsignedShort(842397944)
                        break@while_201_
                    } while (false)
                    anInt9347 = class348_sub49!!.readUnsignedShort(842397944)
                } while (false)
                anInt9350++
                if (i_23_ == 31015) break
                method3118(96.toByte())
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("uf.F(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + i_23_ + ')'))
            }
            break
        } while (false)
    }

    companion object {

        var anInt9345: Int = 0

        var anInt9346: Int = 0

        var anInt9348: Int = 0

        var anInt9349: Int = 0

        var anInt9350: Int = 0

        var aBoolean9352: Boolean = true

        var anInt9353: Int = 0

        var anInt9355: Int = 0

        @JvmStatic
        fun method3118(i: Byte) {
            Renderer.aBooleanArray9351 = null
            val i_0_ = 37 / ((28 - i) / 61)
        }

        @JvmStatic
        fun method3119(i: Int, i_1_: Int, i_2_: Int): Boolean {
            if (i_1_ <= 39) method3119(-106, 118, -21)
            anInt9355++
            return (i and 0xc580) != 0
        }

        var anInt4030: Int = 0
        fun method2554(i: Byte) {
            anInt4030++
            if (WidgetRedrawTracker.anInt3931 == 1 || WidgetRedrawTracker.anInt3931 == 3 || (WidgetRedrawTracker.anInt3931 != WaterTextureSet.anInt1447 && (WidgetRedrawTracker.anInt3931 == 0 || WaterTextureSet.anInt1447 == 0))) {
                TerrainShadowBuilderGl2.anInt6930 = 0
                ModelDefinitionLoader.anInt2057 = 0
                NpcEntityUpdater.aHashtable_3654!!.method3481(0)
            }
            WaterTextureSet.anInt1447 = WidgetRedrawTracker.anInt3931
        }

        @JvmStatic
        fun method3120(i: Int) {
            WidgetRedrawTracker.anInt3931 = 0
            anInt9345++
            val i_15_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-118).toByte())
            val i_16_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-117)
            val i_17_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
            val bool = (CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte()) == 1)

            method2554((-45).toByte())
            CellNoiseTextureNode.Companion.method3111(111, i_15_)
            var i_18_: Int = (-CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.anInt7197 + RadialTextureNode.Companion.anInt9341) / 16
            BrightnessOptionState.anIntArrayArray5894 = Array<IntArray?>(i_18_) { IntArray(4) }
            for (i_19_ in 0..<i_18_) {
                for (i_20_ in 0..3) BrightnessOptionState.anIntArrayArray5894!![i_19_]!![i_20_] = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
            }
            VorbisOggDecoder.aByteArrayArray8996 = arrayOfNulls<ByteArray>(i_18_)
            RegionMapDecoder.aByteArrayArray1887 = arrayOfNulls<ByteArray>(i_18_)
            NativeSprite.anIntArray5192 = IntArray(i_18_)
            GlRectangleTexture.aByteArrayArray8642 = arrayOfNulls<ByteArray>(i_18_)
            GameAppletFrame.anIntArray38 = IntArray(i_18_)
            StringCacheNode.aByteArrayArray7212 = null
            RenderNodeStatics.anIntArray9724 = IntArray(i_18_)
            AbstractCameraTransformStatics.anIntArray4031 = null
            DragDropController.aByteArrayArray4281 = arrayOfNulls<ByteArray>(i_18_)
            if (i >= -47) anInt9349 = -54
            LocalizedTextTriple.anIntArray3759 = IntArray(i_18_)
            NullOggStream.anIntArray9042 = IntArray(i_18_)
            i_18_ = 0
            for (i_21_ in (-(GlCubemapLightPass.anInt7319 shr 4) + i_17_) / 8..(i_17_ + (GlCubemapLightPass.anInt7319 shr 4)) / 8) {
                var i_22_: Int = (i_16_ - (RangeThresholdTextureNode.Companion.anInt9109 shr 4)) / 8
                while ((i_22_ <= ((RangeThresholdTextureNode.Companion.anInt9109 shr 4) + i_16_) / 8)) {
                    NullOggStream.anIntArray9042!![i_18_] = i_22_ + (i_21_ shl 8)
                    NativeSprite.anIntArray5192!![i_18_] = AbstractCameraTransformStatics.aJs5Archive_7382!!.method417("m" + i_21_ + "_" + i_22_, 0)
                    GameAppletFrame.anIntArray38!![i_18_] = AbstractCameraTransformStatics.aJs5Archive_7382!!.method417("l" + i_21_ + "_" + i_22_, 0)
                    LocalizedTextTriple.anIntArray3759!![i_18_] = AbstractCameraTransformStatics.aJs5Archive_7382!!.method417("um" + i_21_ + "_" + i_22_, 0)
                    RenderNodeStatics.anIntArray9724!![i_18_] = AbstractCameraTransformStatics.aJs5Archive_7382!!.method417("ul" + i_21_ + "_" + i_22_, 0)
                    i_18_++
                    i_22_++
                }
            }
            RegionSceneShifterStatics.method3157(i_16_, 123.toByte(), i_17_, 11, bool)
        }

    }
}
