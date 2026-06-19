import FlickeringEffectsOptionStateStatics.method1752
import FacingDirectionNodeStatics.method2777
import kotlin.math.min

object WhirlpoolHashStatics {
    @JvmField
            var anInt1461: Int = 0
            @JvmField
            var anInt1462: Int = 0
            @JvmField
            var anInt1464: Int = 0
            @JvmField
            var anInt1466: Int = 0
            @JvmField
            var anInt1467: Int = 0
            @JvmField
            var anInt1470: Int = 0
            @JvmField
            var anInt1476: Int = 0
    
            @JvmStatic
            fun method828(i: Byte, i_13_: Int, i_14_: Int) {
                if (i.toInt() != 38) method828(63.toByte(), 119, 33)
                anInt1467++
                if (CameraRotationStubStatics.aRenderer326 != null) {
                    val i_15_ = ItemModelDefinitionStatics.anInt425
                    val i_16_ = BackgroundWorkerThreadStatics.anInt3225
                    method1752(-1, i_13_, i_14_)
                    if (ByteBufferStatics.anInt7207 == 0) {
                        WidgetDefinitionStatics.anSpriteDrawTarget_252 = null
                        WidgetDefinitionStatics.anSpriteDrawTarget_252 = (CameraRotationStubStatics.aRenderer326!!.method3634(CameraRotationStubStatics.aRenderer326!!.method3665((SynthVoiceGroupStatics.anInt8854), ShadowQualityOptionStateStatics.anInt6008), CameraRotationStubStatics.aRenderer326!!.method3624((SynthVoiceGroupStatics.anInt8854), ShadowQualityOptionStateStatics.anInt6008)))
                    } else if (ByteBufferStatics.anInt7207 == 1 && (NpcSpawnDecoder.anSpriteDrawTargetArray1525 == null || i_15_ != ItemModelDefinitionStatics.anInt425 || i_16_ != BackgroundWorkerThreadStatics.anInt3225)) {
                        NpcSpawnDecoder.anSpriteDrawTargetArray1525 = arrayOfNulls<SpriteDrawTarget>(BackgroundWorkerThreadStatics.anInt3225 * ItemModelDefinitionStatics.anInt425)
                        var i_17_ = 0
                        while (NpcSpawnDecoder.anSpriteDrawTargetArray1525!!.size > i_17_) {
                            NpcSpawnDecoder.anSpriteDrawTargetArray1525!![i_17_] = (CameraRotationStubStatics.aRenderer326!!.method3634(CameraRotationStubStatics.aRenderer326!!.method3665(DirectionPathStatics.anInt1067, ByteStoreStatics.anInt4267), CameraRotationStubStatics.aRenderer326!!.method3624(DirectionPathStatics.anInt1067, ByteStoreStatics.anInt4267)))
                            i_17_++
                        }
                        LocalPlayerState.anIntArray1909 = IntArray(ItemModelDefinitionStatics.anInt425 * BackgroundWorkerThreadStatics.anInt3225)
                        GroundDecorSceneEntityStatics.anInt9997 = 1
                    }
                    PcmStreamBufferStatics.aBoolean8870 = true
                }
            }
    
            @JvmStatic
            fun method830(i: Int, i_21_: Int, i_22_: Byte, bool: Boolean, i_23_: Int) {
                var bool = bool
                anInt1461++
                LoadingScreenImageNodeStatics.method3179(0)
                PcmStreamBufferStatics.aLong8866 = 0L
                val i_24_ = ContactEntryStatics.method3229(-82)
                if (i_22_.toInt() == 102) {
                    if (i == 3 || i_24_ == 3) bool = true
                    if (!FacingDirectionNodeStatics.aRenderer6654!!.method3695()) bool = true
                    GameDisplayManager.method1580((-125).toByte(), bool, i_21_, i_24_, i, i_23_)
                }
            }
    
            @JvmStatic
            fun method831(i: Int, i_25_: Int, i_26_: Int, i_27_: Int): Int {
                anInt1476++
                val i_28_ = 106 / ((-20 - i_27_) / 48)
                if (i_26_ > i_25_) return i_26_
                return min(i_25_, i)
            }
}
