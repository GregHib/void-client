object ColourKeyTextureNodeStatics {
    @JvmField
            var anInt9345: Int = 0
            @JvmField
            var anInt9346: Int = 0
            @JvmField
            var anInt9348: Int = 0
            @JvmField
            var anInt9349: Int = 0
            @JvmField
            var anInt9350: Int = 0
            @JvmField
            var aBooleanArray9351: BooleanArray?
            @JvmField
            var aBoolean9352: Boolean = true
            @JvmField
            var anInt9353: Int = 0
            @JvmField
            var anInt9355: Int = 0
    
            @JvmStatic
            fun method3118(i: Byte) {
                aBooleanArray9351 = null
                val i_0_ = 37 / ((28 - i) / 61)
            }
    
            @JvmStatic
            fun method3119(i: Int, i_1_: Int, i_2_: Int): Boolean {
                if (i_1_ <= 39) method3119(-106, 118, -21)
                anInt9355++
                return (i and 0xc580) != 0
            }
    
            @JvmStatic
            fun method3120(i: Int) {
                WidgetRedrawTrackerStatics.anInt3931 = 0
                anInt9345++
                val i_15_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-118).toByte())
                val i_16_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-117)
                val i_17_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                val bool = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte()) == 1)
    
                ImageFrameCacheStatics.method2554((-45).toByte())
                CellNoiseTextureNodeStatics.method3111(111, i_15_)
                var i_18_: Int = (-CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 + RadialTextureNodeStatics.anInt9341) / 16
                BrightnessOptionStateStatics.anIntArrayArray5894 = Array<IntArray?>(i_18_) { IntArray(4) }
                for (i_19_ in 0..<i_18_) {
                    for (i_20_ in 0..3) BrightnessOptionStateStatics.anIntArrayArray5894!![i_19_]!![i_20_] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                }
                VorbisOggDecoderStatics.aByteArrayArray8996 = arrayOfNulls<ByteArray>(i_18_)
                ModelFacePriorityNodeStatics.aByteArrayArray1887 = arrayOfNulls<ByteArray>(i_18_)
                NativeSpriteStatics.anIntArray5192 = IntArray(i_18_)
                GlRectangleTextureStatics.aByteArrayArray8642 = arrayOfNulls<ByteArray>(i_18_)
                GameAppletFrameStatics.anIntArray38 = IntArray(i_18_)
                StringCacheNodeStatics.aByteArrayArray7212 = null
                RenderNodeStatics.anIntArray9724 = IntArray(i_18_)
                ImageFrameCacheStatics.anIntArray4031 = null
                DragDropControllerStatics.aByteArrayArray4281 = arrayOfNulls<ByteArray>(i_18_)
                if (i >= -47) anInt9349 = -54
                LocalizedTextTripleStatics.anIntArray3759 = IntArray(i_18_)
                NullOggStreamStatics.anIntArray9042 = IntArray(i_18_)
                i_18_ = 0
                for (i_21_ in (-(GlCubemapLightPassStatics.anInt7319 shr 4) + i_17_) / 8..(i_17_ + (GlCubemapLightPassStatics.anInt7319 shr 4)) / 8) {
                    var i_22_: Int = (i_16_ - (RangeThresholdTextureNodeStatics.anInt9109 shr 4)) / 8
                    while ((i_22_ <= ((RangeThresholdTextureNodeStatics.anInt9109 shr 4) + i_16_) / 8)) {
                        NullOggStreamStatics.anIntArray9042!![i_18_] = i_22_ + (i_21_ shl 8)
                        NativeSpriteStatics.anIntArray5192!![i_18_] = GlShadowRenderPassStatics.aJs5Archive_7382!!.method417("m" + i_21_ + "_" + i_22_, 0)
                        GameAppletFrameStatics.anIntArray38!![i_18_] = GlShadowRenderPassStatics.aJs5Archive_7382!!.method417("l" + i_21_ + "_" + i_22_, 0)
                        LocalizedTextTripleStatics.anIntArray3759!![i_18_] = GlShadowRenderPassStatics.aJs5Archive_7382!!.method417("um" + i_21_ + "_" + i_22_, 0)
                        RenderNodeStatics.anIntArray9724!![i_18_] = GlShadowRenderPassStatics.aJs5Archive_7382!!.method417("ul" + i_21_ + "_" + i_22_, 0)
                        i_18_++
                        i_22_++
                    }
                }
                RegionSceneShifterStatics.method3157(i_16_, 123.toByte(), i_17_, 11, bool)
            }
    
            init {
                aBooleanArray9351 = BooleanArray(8)
            }
}
