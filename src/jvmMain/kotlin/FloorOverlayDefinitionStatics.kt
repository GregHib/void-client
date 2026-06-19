object FloorOverlayDefinitionStatics {
    @JvmField
            var anInt968: Int = 0
            @JvmField
            var anInt970: Int = 0
            @JvmField
            var anInt971: Int = 0
            @JvmField
            var anInt972: Int = 0
            @JvmField
            var aStringArray974: Array<String?>? = null
            @JvmField
            var anInt975: Int = 0
            @JvmStatic
            fun method500(i: Int, i_0_: Int): Int {
                anInt975++
                if (i != 7) return -107
                return i_0_ ushr 8
            }
    
            @JvmStatic
            fun method501(i: Int) {
                aStringArray974 = null
                if (i != 1) method501(-15)
            }
    
            fun method503(i: Int, i_2_: Int, i_3_: Byte, i_4_: Int, i_5_: Int) {
                anInt968++
                val i_6_ = CompletedResourceRequestStatics.anInt10463
                while_4_@ do {
                    do {
                        if (i_6_ != 0) {
                            if (i_6_ != 1) {
                                if (i_6_ == 2) break
                                break@while_4_
                            }
                        } else return
                        ModelVertexColorBufferStatics.anInt6585 = i
                        ResourceProviderStatics.anInt3941 = i_2_
                        GraphicsOptionStateStatics.anInt3142 = i_5_
                        CompletedResourceRequestStatics.anInt10463 = 2
                        ResourceProviderStatics.anInt3939 = i_4_
                        return
                    } while (false)
                    if (ResourceProviderStatics.anInt3939 < i_4_) ResourceProviderStatics.anInt3939 = i_4_
                    if (ResourceProviderStatics.anInt3941 > i_2_) ResourceProviderStatics.anInt3941 = i_2_
                    if (GraphicsOptionStateStatics.anInt3142 > i_5_) GraphicsOptionStateStatics.anInt3142 = i_5_
                    if (i > ModelVertexColorBufferStatics.anInt6585) ModelVertexColorBufferStatics.anInt6585 = i
                    return
                } while (false)
                if (i_3_.toInt() != -74) method501(46)
            }
}
