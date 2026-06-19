import ObjectSpawnDecoder.method1087
import BoundsConstraintEntryStatics.method2056
import kotlin.concurrent.Volatile

object CacheIndexManagerStatics {
    var anInt3944: Int = 0
            var anInt3945: Int = 0
            var anInt3947: Int = 0
            var anInt3948: Int = 0
            var anInt3949: Int = 0
            var anInt3950: Int = 0
            var anInt3951: Int = 0
            var anInt3952: Int = 0
            var anInt3954: Int = 0
            var anInt3955: Int = 0
            @JvmStatic
            fun method2354(namedIdRecord: NamedIdRecord?, i: Int): Boolean {
                anInt3954++
                if (i != -1) method2355(-93, 115.toByte(), true, null, -92, -67, 6)
                return FixedFunctionWaterPassStatics.aNamedIdRecord_7361 == namedIdRecord || SpriteArchiveLoaderStatics.aNamedIdRecord_382 == namedIdRecord || GroundItemRenderState.aNamedIdRecord_1657 == namedIdRecord || namedIdRecord == WidgetRedrawRegionStatics.aNamedIdRecord_4246
            }
    
            @JvmStatic
            fun method2355(i: Int, i_0_: Byte, bool: Boolean, js5Archive: Js5Archive?, i_1_: Int, i_2_: Int, i_3_: Int) {
                DirectionPathStatics.anInt1059 = i
                anInt3948++
                KeyboardInputSourceStatics.aBoolean4275 = bool
                GlBufferObjectStatics.aClass348_Sub16_Sub3_4743 = null
                NpcActorEntityStatics.anInt10074 = i_1_
                WaterDetailOptionStateStatics.anInt5994 = i_3_
                SpriteDefinitionStatics.anInt7068 = 1
                SceneLinkedListNodeStatics.anInt3971 = i_2_
                ModelDefinitionStatics.aJs5Archive_1848 = js5Archive
            }
    
            @JvmStatic
            fun method2357(i: Int, player: Player): Int {
                anInt3951++
                var i_4_ = (player.anInt10560)
                val class225 = player.method2422(72.toByte())
                if (i != (player.anInt10268) && !(player.aBoolean10213)) {
                    if ((player.anInt10268) != class225.anInt2919 && (player.anInt10268 != class225.anInt2920) && (class225.anInt2949 != (player.anInt10268)) && (player.anInt10268 != class225.anInt2914)) {
                        if ((class225.anInt2940 == (player.anInt10268)) || (player.anInt10268 == class225.anInt2924) || (player.anInt10268 == class225.anInt2947) || (player.anInt10268 == class225.anInt2958)) i_4_ = player.anInt10526
                    } else i_4_ = player.anInt10519
                } else i_4_ = player.anInt10535
                return i_4_
            }
    
            fun method2358(i: Int, i_5_: Int, i_6_: Int): Boolean {
                if (i >= -106) return true
                anInt3945++
                return method1087(12644, i_6_, i_5_) || method2056(i_5_, 107, i_6_)
            }
}
