import WorldMapAreaLabel.Companion.method3570

/* Class44 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object MapSceneRenderer {

    var anInt621: Int = 0

    var anInt622: Int = 0

    var anInt623: Int = 0

    var aAbstractCameraTransform_624: AbstractCameraTransform? = null

    @JvmStatic
    fun method384(i: Int, i_0_: Int, i_1_: Int): Int {
        anInt623++
        val i_2_ = (WidgetComponentNode.method1115(i - 1, i_1_ - 1, 91.toByte()) - (-WidgetComponentNode.method1115(i - -1, i_1_ + -1, (-53).toByte()) + -WidgetComponentNode.method1115(-1 + i, 1 + i_1_, (-90).toByte())) + WidgetComponentNode.method1115(i - -1, i_1_ - -1, (-82).toByte()))
        val i_3_ = (WidgetComponentNode.method1115(i + -1, i_1_, (-118).toByte()) + (WidgetComponentNode.method1115(i - i_0_, i_1_, 118.toByte()) - (-WidgetComponentNode.method1115(i, -1 + i_1_, 109.toByte()) + -WidgetComponentNode.method1115(i, 1 + i_1_, 89.toByte()))))
        val i_4_ = WidgetComponentNode.method1115(i, i_1_, (-59).toByte())
        return i_4_ / 4 + i_3_ / 8 + i_2_ / 16
    }

    fun method385(bool: Boolean, class237_sub1: WorldMapSceneSoftware?, `is`: Array<ByteArray?>?) {
        do {
            try {
                anInt622++
                val is_5_ = intArrayOf(-1, 0, 0, 0, 0)
                for (i in 0..<class237_sub1!!.anInt3130) {
                    method3570(false)
                    var i_6_ = 0
                    while ((GlCubemapLightPass.anInt7319 shr 3 > i_6_)) {
                        for (i_7_ in 0..<(RangeThresholdTextureNode.anInt9109 shr 3)) {
                            val i_8_ = (GameClock.anIntArrayArrayArray1116!![i]!![i_6_]!![i_7_])
                            if (i_8_ != -1) {
                                val i_9_ = i_8_ shr 24 and 0x3
                                if (!class237_sub1.aBoolean3109 || i_9_ == 0) {
                                    val i_10_ = (i_8_ and 0x6) shr 1
                                    val i_11_ = (i_8_ and 0xffd064) shr 14
                                    val i_12_ = i_8_ shr 3 and 0x7ff
                                    val i_13_ = ((i_11_ / 8 shl 8) - -(i_12_ / 8))
                                    for (i_14_ in (NullOggStream.anIntArray9042)!!.indices) {
                                        if ((i_13_ == (NullOggStream.anIntArray9042!![i_14_])) && `is`!![i_14_] != null) {
                                            val class348_sub49 = ByteBuffer(`is`[i_14_])
                                            class237_sub1.method1684(i_6_ * 8, i, -1, class348_sub49, i_12_, 8 * i_7_, i_11_, (TimedRecordAccessorStatics.aCollisionMapArray7108s), i_10_, i_9_)
                                            class237_sub1.method1696(class348_sub49, false, i_12_, i_11_, 8 * i_6_, i, i_10_, 8 * i_7_, FacingDirectionNodeStatics.aRenderer6654, if (is_5_[0] != -1) null else is_5_, i_9_)
                                            break
                                        }
                                    }
                                }
                            }
                        }
                        i_6_++
                    }
                }
                var i = 0
                while (class237_sub1.anInt3130 > i) {
                    method3570(false)
                    var i_15_ = 0
                    while ((i_15_ < GlCubemapLightPass.anInt7319 shr 3)) {
                        var i_16_ = 0
                        while ((i_16_ < RangeThresholdTextureNode.anInt9109 shr 3)) {
                            val i_17_ = (GameClock.anIntArrayArrayArray1116!![i]!![i_15_]!![i_16_])
                            if (i_17_ == -1) class237_sub1.method1678(i_15_ * 8, 8, i_16_ * 8, -100, 8, i)
                            i_16_++
                        }
                        i_15_++
                    }
                    i++
                }
                if (is_5_[0] != -1) {
                    KeyboardLayoutCache.aParticleSystemRenderer_3304 = Client.aMapSceneCache_413!!.method823(is_5_[2], is_5_[3], is_5_[1], -109, (HoverActionEntryStatics.aSpriteStore_1813!!), is_5_[0])
                    MapSceneDefLoader.anInt2481 = is_5_[4]
                }
                if (bool == false) break
                method387(26)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("ik.D(" + bool + ',' + (if (class237_sub1 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    @JvmStatic
    fun method386(i: Byte) {
        anInt621++
        if (i.toInt() != -106) method386(21.toByte())
        CharCountUtil.aLruByteCache_225!!.method587(i + 9)
    }

    @JvmStatic
    fun method387(i: Int) {
        aAbstractCameraTransform_624 = null
        ByteBuffer.aCharArray625 = null
    }

    @JvmStatic
    fun method388(i: Int, i_18_: Int, i_19_: Int, class318_sub1_sub5: WallEntity, class318_sub1_sub5_20_: WallEntity?) {
        val class357 = StringValueNodeStatics.method3321(i, i_18_, i_19_)
        if (class357 != null) {
            class357.aClass318_Sub1_Sub5_4395 = class318_sub1_sub5
            class357.aClass318_Sub1_Sub5_4407 = class318_sub1_sub5_20_
            val i_21_ = if (ActorEntity.aTerrainTileArray5191 == ActorEntity.aTerrainTileArray4142) 1 else 0
            if (class318_sub1_sub5.method2376(-62)) {
                if (class318_sub1_sub5.method2377(122.toByte())) {
                    class318_sub1_sub5.aClass318_Sub1_6379 = BackgroundWorkerThread.aClass318_Sub1Array3226!![i_21_]
                    BackgroundWorkerThread.aClass318_Sub1Array3226!![i_21_] = class318_sub1_sub5
                } else {
                    class318_sub1_sub5.aClass318_Sub1_6379 = LinkedListNodeStatics.aClass318_Sub1Array4293!![i_21_]
                    LinkedListNodeStatics.aClass318_Sub1Array4293!![i_21_] = class318_sub1_sub5
                    PcmStreamBuffer.aBoolean8870 = true
                }
            } else {
                class318_sub1_sub5.aClass318_Sub1_6379 = OverlayColorTable.aClass318_Sub1Array1754!![i_21_]
                OverlayColorTable.aClass318_Sub1Array1754!![i_21_] = class318_sub1_sub5
            }
            if (class318_sub1_sub5_20_ != null) {
                if (class318_sub1_sub5_20_.method2376(-110)) {
                    if (class318_sub1_sub5_20_.method2377(122.toByte())) {
                        class318_sub1_sub5_20_.aClass318_Sub1_6379 = BackgroundWorkerThread.aClass318_Sub1Array3226!![i_21_]
                        BackgroundWorkerThread.aClass318_Sub1Array3226!![i_21_] = class318_sub1_sub5_20_
                    } else {
                        class318_sub1_sub5_20_.aClass318_Sub1_6379 = LinkedListNodeStatics.aClass318_Sub1Array4293!![i_21_]
                        LinkedListNodeStatics.aClass318_Sub1Array4293!![i_21_] = class318_sub1_sub5_20_
                        PcmStreamBuffer.aBoolean8870 = true
                    }
                } else {
                    class318_sub1_sub5_20_.aClass318_Sub1_6379 = OverlayColorTable.aClass318_Sub1Array1754!![i_21_]
                    OverlayColorTable.aClass318_Sub1Array1754!![i_21_] = class318_sub1_sub5_20_
                }
            }
        }
    }
}
