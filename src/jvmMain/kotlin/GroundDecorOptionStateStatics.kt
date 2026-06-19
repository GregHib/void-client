object GroundDecorOptionStateStatics {
    @JvmField
            var anInt5974: Int = 0
            @JvmField
            var anInt5975: Int = 0
            @JvmField
            var anInt5976: Int = 0
            @JvmField
            var anInt5977: Int = 0
            @JvmField
            var anInt5978: Int = 0
            @JvmField
            var anInt5979: Int = 0
            @JvmField
            var anInt5980: Int = 0
            @JvmField
            var anInt5981: Int = 0
    
            @JvmStatic
            fun method1777(i: Int, class318_sub1_sub3_sub3: ProjectedGroundDecor?) {
                if (i == -3) {
                    if (class318_sub1_sub3_sub3 is Npc) {
                        val npc = class318_sub1_sub3_sub3
                        if (npc.aNpcType_10505 != null) WaterMaterialPassStatics.method2150(((LocalPlayerState.aPlayer_1907!!.plane) != (npc.plane)), false, npc)
                    } else if (class318_sub1_sub3_sub3 is Player) {
                        val player = class318_sub1_sub3_sub3
                        SpriteDefinitionStatics.method3298(105.toByte(), ((player.plane) != (LocalPlayerState.aPlayer_1907!!.plane)), player)
                    }
                    anInt5981++
                }
            }
}
