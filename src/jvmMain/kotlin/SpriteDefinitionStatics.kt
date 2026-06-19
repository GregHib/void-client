import GlRectangleTextureStatics.method250
import kotlin.math.max
import kotlin.math.min

object SpriteDefinitionStatics {
    var aClass348_Sub16_Sub4_7065: AudioMixerScheduler? = null
            var anInt7068: Int
            var anInt7073: Int = 0
            var anInt7078: Int = 0
            var anIntArrayArrayArray7079: Array<Array<IntArray?>?>? = arrayOfNulls<Array<IntArray?>>(2)
            fun method3298(i: Byte, bool: Boolean, player: Player) {
                anInt7073++
                if (FileExistsConditionStatics.anInt4776 < 400) {
                    if (LocalPlayerState.aPlayer_1907 == player) {
                        if (RenderNodeStatics.aBoolean9722 && (WidgetTextConfigStatics.anInt500 and 0x10) != 0) {
                            LongHashTableStatics.anInt450++
                            MinimapPolygonDrawerStatics.method466(false, (ItemNameResolverStatics.aString5000 + " -> <col=ffffff>" + LocalizedTextStatics.aLocalizedText_3520!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)), 0, (-109).toByte(), false, 0, -1, true, 50, player.anInt10290.toLong(), ItemNameResolverStatics.aString5001, 0L, FloatBufferStatics.anInt9747)
                        }
                    } else {
                        val string: String?
                        if (player.anInt10564 == 0) {
                            var bool_0_ = true
                            if ((LocalPlayerState.aPlayer_1907!!.anInt10561) != -1 && player.anInt10561 != -1) {
                                val i_1_ = (max(player.anInt10516, (LocalPlayerState.aPlayer_1907!!.anInt10516)))
                                val i_2_ = (min((LocalPlayerState.aPlayer_1907!!.anInt10561), player.anInt10561))
                                val i_3_ = 5 - (-(10 * i_1_ / 100) + -i_2_)
                                var i_4_ = (-player.anInt10516 + (LocalPlayerState.aPlayer_1907!!.anInt10516))
                                if (i_4_ < 0) i_4_ = -i_4_
                                if (i_3_ < i_4_) bool_0_ = false
                            }
                            val string_5_ = (if (GlRectangleTextureStatics.aSceneProjector_8638 == HardCacheEntryReferenceStatics.aSceneProjector_10434) LocalizedTextStatics.aLocalizedText_3513!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544) else LocalizedTextStatics.aLocalizedText_3511!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544))
                            if (player.anInt10516 >= player.anInt10557) string = (player.method2456(true, 255) + (if (!bool_0_) "<col=ffffff>" else (method250((LocalPlayerState.aPlayer_1907!!.anInt10516), true, (player.anInt10516)))) + " (" + string_5_ + player.anInt10516 + ")")
                            else string = (player.method2456(true, 255) + (if (bool_0_) (method250((LocalPlayerState.aPlayer_1907!!.anInt10516), true, (player.anInt10516))) else "<col=ffffff>") + " (" + string_5_ + player.anInt10516 + "+" + (-player.anInt10516 + player.anInt10557) + ")")
                        } else if (player.anInt10564 == -1) string = player.method2456(true, 255)
                        else string = (player.method2456(true, 255) + " (" + LocalizedTextStatics.aLocalizedText_3512!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544) + player.anInt10564 + ")")
                        if (RenderNodeStatics.aBoolean9722 && !bool && (0x8 and WidgetTextConfigStatics.anInt500) != 0) {
                            MinimapPolygonDrawerStatics.method466(false, ItemNameResolverStatics.aString5000 + " -> <col=ffffff>" + string, 0, (-109).toByte(), false, 0, -1, true, 51, player.anInt10290.toLong(), ItemNameResolverStatics.aString5001, player.anInt10290.toLong(), FloatBufferStatics.anInt9747)
                            TileRenderStateStatics.anInt4228++
                        }
                        if (i <= 89) anInt7068 = -113
                        if (bool) MinimapPolygonDrawerStatics.method466(true, "", 0, (-115).toByte(), false, 0, 0, false, -1, player.anInt10290.toLong(), "<col=cccccc>" + string, 0L, -1)
                        else {
                            for (i_6_ in 7 downTo 0) {
                                if (DynamicSceneObjectEntityStatics.aStringArray10195!![i_6_] != null) {
                                    var i_7_: Short = 0
                                    if ((HardCacheEntryReferenceStatics.aSceneProjector_10434 != ParticleEmitterNodeStatics.aSceneProjector_186) || !(DynamicSceneObjectEntityStatics.aStringArray10195!![i_6_].equals(LocalizedTextStatics.aLocalizedText_3506!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544), ignoreCase = true))) {
                                        if (PlayerSequenceSelector.aBooleanArray1214!![i_6_]) i_7_ = 2000.toShort()
                                    } else {
                                        if ((LocalPlayerState.aPlayer_1907!!.anInt10516) < (player.anInt10516)) i_7_ = 2000.toShort()
                                        if ((LocalPlayerState.aPlayer_1907!!.anInt10542) != 0 && (player.anInt10542) != 0) {
                                            if ((player.anInt10542) != (LocalPlayerState.aPlayer_1907!!.anInt10542)) i_7_ = 0.toShort()
                                            else i_7_ = 2000.toShort()
                                        }
                                    }
                                    val i_8_ = (i_7_ + (CipheredPacketBufferStatics.aShortArray9768!![i_6_])).toShort()
                                    val i_9_ = (if (DelegatingRenderCanvasStatics.anIntArray60!![i_6_] == -1) WidgetTextConfigStatics.anInt506 else DelegatingRenderCanvasStatics.anIntArray60!![i_6_])
                                    MinimapPolygonDrawerStatics.method466(false, "<col=ffffff>" + string, 0, (-105).toByte(), false, 0, -1, true, i_8_.toInt(), player.anInt10290.toLong(), (DynamicSceneObjectEntityStatics.aStringArray10195!![i_6_]), player.anInt10290.toLong(), i_9_)
                                    DelegatingRenderCanvasStatics.anInt69++
                                }
                            }
                        }
                        if (!bool) {
                            var class348_sub42_sub12 = SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1995(4) as ContactEntry?
                            while (class348_sub42_sub12 != null) {
                                if ((class348_sub42_sub12.anInt9608) == 19) {
                                    class348_sub42_sub12.aString9595 = "<col=ffffff>" + string
                                    break
                                }
                                class348_sub42_sub12 = (SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1990(105.toByte()) as ContactEntry?)
                            }
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method3300(i: Int) {
                anIntArrayArrayArray7079 = null
                aClass348_Sub16_Sub4_7065 = null
                if (i != 0) method3300(-61)
            }
    
            init {
                anInt7068 = 0
            }
}
