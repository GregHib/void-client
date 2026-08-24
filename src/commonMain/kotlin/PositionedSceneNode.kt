/* Class318_Sub9_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class PositionedSceneNode : SceneListNode() {
    var anInt8789: Int = 0
    var anInt8790: Int = 0
    var anInt8791: Int = 0
    var anInt8792: Int = 0
    var anInt8793: Int = 0
    var aBoolean8794: Boolean = false
    var aByte8795: Byte = 5
    var anInt8796: Int = 0

    companion object {

        @JvmStatic
        fun method2518(i: Int) {
            ActorEntity.anIntArray8797 = null
        }

        @JvmStatic
        fun method2519(class318_sub1: SceneEntity, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            var bool = true
            var i_4_ = i_0_
            val i_5_ = i_0_ + i_2_
            val i_6_ = i_1_ - 1
            val i_7_ = i_1_ + i_3_
            for (i_8_ in i..i + 1) {
                if (i_8_ != MapAreaDefinition.anInt2524) {
                    for (i_9_ in i_4_..i_5_) {
                        if (i_9_ >= 0 && i_9_ < ActorEntity.anInt6451) {
                            for (i_10_ in i_6_..i_7_) {
                                if (i_10_ >= 0 && i_10_ < ActorEntity.anInt7054 && (!bool || i_9_ >= i_5_ || i_10_ >= i_7_ || i_10_ < i_1_ && i_9_ != i_0_)) {
                                    val class357 = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_8_]!![i_9_]!![i_10_])
                                    if (class357 != null) {
                                        val i_11_ = (((ActorEntity.aTerrainTileArray5191!![i_8_]!!.method3982((-86).toByte(), i_10_, i_9_)) + (ActorEntity.aTerrainTileArray5191!![i_8_]!!.method3982((-86).toByte(), i_10_, i_9_ + 1)) + (ActorEntity.aTerrainTileArray5191!![i_8_]!!.method3982((-86).toByte(), i_10_ + 1, i_9_)) + (ActorEntity.aTerrainTileArray5191!![i_8_]!!.method3982((-86).toByte(), i_10_ + 1, i_9_ + 1))) / 4 - ((ActorEntity.aTerrainTileArray5191!![i]!!.method3982(
                                            (-86).toByte(),
                                            i_1_,
                                            i_0_
                                        )) + (ActorEntity.aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_1_, i_0_ + 1)) + (ActorEntity.aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_1_ + 1, i_0_)) + (ActorEntity.aTerrainTileArray5191!![i]!!.method3982((-86).toByte(), i_1_ + 1, i_0_ + 1))) / 4)
                                        val class318_sub1_sub4 = (class357.aClass318_Sub1_Sub4_4406)
                                        val class318_sub1_sub4_12_ = (class357.aClass318_Sub1_Sub4_4403)
                                        if (class318_sub1_sub4 != null && class318_sub1_sub4.method2388(-127)) class318_sub1.method2380(NativeLibraryState.aRenderer171, i_11_, bool, class318_sub1_sub4, (((i_10_ - i_1_) * ActorEntity.anInt3465) + ((1 - i_3_) * (ActorEntity.anInt9037))), (-112).toByte(), (((i_9_ - i_0_) * ActorEntity.anInt3465) + ((1 - i_2_) * (ActorEntity.anInt9037))))
                                        if (class318_sub1_sub4_12_ != null && class318_sub1_sub4_12_.method2388(-100)) class318_sub1.method2380(NativeLibraryState.aRenderer171, i_11_, bool, class318_sub1_sub4_12_, (((i_10_ - i_1_) * ActorEntity.anInt3465) + ((1 - i_3_) * (ActorEntity.anInt9037))), (-115).toByte(), (((i_9_ - i_0_) * ActorEntity.anInt3465) + ((1 - i_2_) * (ActorEntity.anInt9037))))
                                        var class148 = (class357.aWidgetNodeLink_4396)
                                        while (class148 != null) {
                                            val class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040)
                                            if (class318_sub1_sub3 != null && class318_sub1_sub3.method2388(-111) && (i_9_ == (class318_sub1_sub3.aShort8743).toInt() || i_9_ == i_4_) && (i_10_ == (class318_sub1_sub3.aShort8750).toInt() || i_10_ == i_6_)) {
                                                val i_13_ = ((class318_sub1_sub3.aShort8751) - (class318_sub1_sub3.aShort8743) + 1)
                                                val i_14_ = ((class318_sub1_sub3.aShort8747) - (class318_sub1_sub3.aShort8750) + 1)
                                                class318_sub1.method2380(NativeLibraryState.aRenderer171, i_11_, bool, class318_sub1_sub3, (((class318_sub1_sub3.aShort8750) - i_1_) * ActorEntity.anInt3465 + ((i_14_ - i_3_) * (ActorEntity.anInt9037))), (-115).toByte(), (((class318_sub1_sub3.aShort8743) - i_0_) * ActorEntity.anInt3465 + ((i_13_ - i_2_) * (ActorEntity.anInt9037))))
                                            }
                                            class148 = (class148.aWidgetNodeLink_2038)
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i_4_--
                    bool = false
                }
            }
        }
    }
}
