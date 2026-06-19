import MultiLevelOptionStateStatics.method1849
import jaclib.memory.Buffer
import jaclib.memory.Source

object GlVertexBufferArbStatics {
    @JvmField
            var anInt8483: Int = 0
            @JvmField
            var anInt8484: Int = 0
            @JvmField
            var anInt8485: Int = 0
            @JvmField
            var anInt8486: Int = 0
            @JvmField
            var anInt8487: Int = 0
            @JvmField
            var anInt8488: Int = 0
            @JvmField
            var anInt8489: Int = 0
            @JvmField
            var anInt8490: Int = 0
            @JvmField
            var anInt8492: Int = 0
            @JvmField
            var anInt8493: Int = 0
            @JvmField
            var anInt8494: Int = 0
            @JvmField
            var anInt8495: Int = 0
    
            @JvmStatic
            fun method2127(i: Int, string: String?): String? {
                if (i != 2) return null
                anInt8483++
                if (string == null) return null
                var i_0_ = 0
                var i_1_: Int
                i_1_ = string.length
                while (i_1_ > i_0_) {
                    if (!SpriteArchiveLoaderStatics.method311(113.toByte(), string.get(i_0_))) break
                    i_0_++
                }
                while ( /**/(i_0_ < i_1_ && SpriteArchiveLoaderStatics.method311(104.toByte(), string.get(i_1_ + -1)))) {
                    i_1_--
                }
                val i_2_ = i_1_ + -i_0_
                if (i_2_ < 1 || i_2_ > 12) return null
                val stringbuffer = StringBuffer(i_2_)
                var i_3_ = i_0_
                while (i_1_ > i_3_) {
                    val c = string.get(i_3_)
                    if (method1849(c, i + 108)) {
                        val c_4_ = TypedRecordTableStatics.method2184(c, -10072)
                        if (c_4_.code != 0) stringbuffer.append(c_4_)
                    }
                    i_3_++
                }
                if (stringbuffer.length == 0) return null
                return stringbuffer.toString()
            }
    
            @JvmStatic
            fun method2128(i: Int, class348_sub49: ByteBuffer): WorldMapPolygonIconLabel {
                anInt8495++
                val class369_sub3 = StringValueNodeStatics.method3322(0, class348_sub49)
                val i_5_ = class348_sub49.readShort(13638)
                return (WorldMapPolygonIconLabel(class369_sub3.aScreenAnchorAlignment_4968, class369_sub3.aTileRenderState_4973, class369_sub3.anInt4970, class369_sub3.anInt4959, class369_sub3.anInt4971, class369_sub3.anInt4963, class369_sub3.anInt4966, class369_sub3.anInt4965, class369_sub3.anInt4961, class369_sub3.anInt8599, class369_sub3.anInt8595, class369_sub3.anInt8603, class369_sub3.anInt8602, class369_sub3.anInt8600, class369_sub3.anInt8597, i_5_))
            }
    
            fun method2129(i: Byte) {
                anInt8494++
                CameraRotationStubStatics.aRenderer326!!.method3638(RenderNodeStatics.aAbstractCameraTransform_9720)
                if (i < 9) anInt8492 = -40
                CameraRotationStubStatics.aRenderer326!!.DA(MediaStreamClientStatics.anInt3202, SimpleToggleOptionStateStatics.anInt5886, Gl3dTextureStatics.anInt8630, ProjectileConfigUtil.anInt394)
            }
    
            @JvmStatic
            fun method2131(i: Int) {
                if (i == 0) {
                    if (NpcStatics.anInt10503 == 2) {
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![0])
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![1]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![1])
                    } else if (NpcStatics.anInt10503 == 3) {
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![0])
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![1]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![1])
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![2]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![2])
                    } else {
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![0])
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![1]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![1])
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![2]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![2])
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![3]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![3])
                    }
                } else if (i == 1) {
                    if (NpcStatics.anInt10503 == 2) NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![2])
                    else if (NpcStatics.anInt10503 == 3) {
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![3])
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![1]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![4])
                    } else {
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![4])
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![1]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![5])
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![2]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![6])
                    }
                } else if (i == 2) {
                    if (NpcStatics.anInt10503 == 2) NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![3])
                    else if (NpcStatics.anInt10503 == 3) NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![5])
                    else NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![7])
                }
            }
}
