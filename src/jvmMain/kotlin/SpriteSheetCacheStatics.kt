import AbstractRenderPassStatics.method3529
import IndexedSpriteStatics.method165

object SpriteSheetCacheStatics {
    var anInt2556: Int = 0
            var anInt2558: Int = 0
            var anInt2560: Int = 0
            var anInt2566: Int = 0
            var anInt2567: Int = 0
            var aBoxedIntHolder_2568: BoxedIntHolder? = BoxedIntHolder(0)
            var anInt2569: Int = 0
            @JvmField
            var aTextureFormatInfo_2571: TextureFormatInfo? = TextureFormatInfo(2)
    
            @JvmStatic
            fun method1428(bool: Boolean) {
                WidgetRedrawRegionStatics.anImage4249 = null
                anInt2569++
                FontMetaRefStatics.aFont4329 = null
                if (bool != true) method1431(-122)
            }
    
            fun method1429(string: String?, i: Int) {
                FixedFunctionMaterialPassStatics.method2144("", i, (-125).toByte(), 0, string, "", "")
                anInt2560++
            }
    
            fun method1430(i: Int, i_1_: Byte, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, class318_sub1_sub3_sub3: ProjectedGroundDecor?, class318_sub1_sub3_sub3_8_: ProjectedGroundDecor?) {
                try {
                    anInt2567++
                    val i_9_ = class318_sub1_sub3_sub3!!.method2425(-1)
                    if (i_9_ != -1) {
                        val `object`: Any? = null
                        var abstractModelRenderer = (TerrainTileShapeStatics.aLruByteCache_8807!!.method583(i_9_.toLong(), 118) as? AbstractModelRenderer?)
                        if (abstractModelRenderer == null) {
                            val spriteImages = SpriteImageStatics.method1519(CameraRotationStubStatics.aJs5Archive_322!!, i_9_, 0)
                            if (spriteImages == null) return
                            abstractModelRenderer = FacingDirectionNodeStatics.aRenderer6654!!.method3691(spriteImages[0], true)
                            TerrainTileShapeStatics.aLruByteCache_8807!!.method582(abstractModelRenderer, i_9_.toLong(), (-115).toByte())
                        }
                        method165(class318_sub1_sub3_sub3_8_!!.plane.toInt(), i_5_, 0, i_3_ shr 1, class318_sub1_sub3_sub3_8_.x, class318_sub1_sub3_sub3_8_.method2436(126.toByte()) * 256, class318_sub1_sub3_sub3_8_.y, 92.toByte(), i_6_ shr 1, i_2_)
                        var i_10_ = i_7_ + (RemoveRoofsOptionStateStatics.anIntArray6062!![0] + -18)
                        var i_11_ = -54 + (RemoveRoofsOptionStateStatics.anIntArray6062!![1] + i_4_) - 16
                        i_10_ += i / 4 * 18
                        i_11_ += 18 * (i % 4)
                        val i_12_ = -76 / ((i_1_ - 3) / 38)
                        abstractModelRenderer!!.method974(i_10_, i_11_)
                        if (class318_sub1_sub3_sub3 === class318_sub1_sub3_sub3_8_) FacingDirectionNodeStatics.aRenderer6654!!.method3668(18, -1 + i_11_, -256, i_10_ - 1, 18, 57)
                        MapTileShapeStatics.method2663(-5590, i_10_ + -1, 18 + i_10_, i_11_ + -1, i_11_ - -18)
                        val class318_sub6 = method3529(32564)
                        class318_sub6.anInt6426 = 16 + i_10_
                        class318_sub6.anInt6427 = i_11_
                        class318_sub6.aClass318_Sub1_Sub3_Sub3_6431 = class318_sub1_sub3_sub3
                        class318_sub6.anInt6425 = i_11_ - -16
                        class318_sub6.anInt6429 = i_10_
                        InputStream_Sub2Statics.aDoublyLinkedNodeList_83!!.method1869(-87, class318_sub6)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("qk.G(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + (if (class318_sub1_sub3_sub3 != null) "{...}" else "null") + ',' + (if (class318_sub1_sub3_sub3_8_ != null) "{...}" else "null") + ')'))
                }
            }
    
            @JvmStatic
            fun method1431(i: Int) {
                aTextureFormatInfo_2571 = null
                aBoxedIntHolder_2568 = null
                if (i != 0) aBoxedIntHolder_2568 = null
            }
}
