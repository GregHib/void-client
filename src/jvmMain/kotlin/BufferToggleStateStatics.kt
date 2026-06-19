import TextureDefinitionCacheStatics.method1626

object BufferToggleStateStatics {
    var aBoolean3706: Boolean = false
            @JvmField
            var anInt3707: Int = 0
            var aFloat3710: Float = 0f
            @JvmField
            var anInt3712: Int = 0
            var anInt3713: Int = 0
            var anInt3715: Int = 0
            var anInt3716: Int = 0
            @JvmField
            var anInt3717: Int = 1338
            var anInt3718: Int = 0
    
            @JvmStatic
            fun method2196(i: Byte) {
                NoOpGraphicsOptionStateStatics.anInt6043 = (GlCubemapLightPassStatics.anInt7319.toDouble() * 34.46).toInt()
                AnimationFrameDefinitionStatics.anInt6964 = 200
                anInt3716++
                if (i.toInt() == -9) {
                    NoOpGraphicsOptionStateStatics.anInt6043 = NoOpGraphicsOptionStateStatics.anInt6043 shl 2
                    if (FacingDirectionNodeStatics.aRenderer6654!!.method3670()) NoOpGraphicsOptionStateStatics.anInt6043 += 512
                    method1626(1, false)
                }
            }
}
