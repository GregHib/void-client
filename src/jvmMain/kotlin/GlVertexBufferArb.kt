import MultiLevelOptionState.Companion.method1849
import jaclib.memory.Buffer
import jaclib.memory.Source

class GlVertexBufferArb internal constructor(glRenderDevice: GlRenderDevice, bool: Boolean) : GlBufferObject(glRenderDevice, 34962, bool), VertexBufferResource {
    private var aByte8491: Byte = 0
    override fun method21(i: Int) {
        super.method21(i)
        anInt8485++
    }

    override fun method18(i: Int): Boolean {
        anInt8489++
        return super.method2123((this.aGlRenderDevice_4759.aMapBuffer9915), i xor 0x18bb)
    }

    fun method2130(i: Int): Int {
        if (i != 3545) return -18
        anInt8487++
        return aByte8491.toInt()
    }

    override fun method19(bool: Boolean, i: Int): Buffer? {
        anInt8490++
        if (i != 26775) aByte8491 = 7.toByte()
        return super.method2120(0, (this.aGlRenderDevice_4759.aMapBuffer9915), bool)
    }

    override fun method16(bool: Boolean): Int {
        anInt8486++
        if (bool != false) method18(-20)
        return super.method16(bool)
    }

    override fun method17(source: Source, i: Int, i_6_: Int, i_7_: Byte): Boolean {
        anInt8484++
        aByte8491 = i.toByte()
        if (i_7_ >= -15) aByte8491 = 62.toByte()
        super.method2121(25625, source, i_6_)
        return true
    }

    override fun method20(i: Int, i_8_: Byte, i_9_: Int): Boolean {
        anInt8488++
        aByte8491 = i_9_.toByte()
        super.method23(15959, i)
        if (i_8_ <= 122) method18(-86)
        return true
    }

    companion object {

        var anInt8483: Int = 0

        var anInt8484: Int = 0

        var anInt8485: Int = 0

        var anInt8486: Int = 0

        var anInt8487: Int = 0

        var anInt8488: Int = 0

        var anInt8489: Int = 0

        var anInt8490: Int = 0

        var anInt8493: Int = 0

        var anInt8494: Int = 0

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
                if (!SpriteArchiveLoader.method311(113.toByte(), string.get(i_0_))) break
                i_0_++
            }
            while ( /**/(i_0_ < i_1_ && SpriteArchiveLoader.method311(104.toByte(), string.get(i_1_ + -1)))) {
                i_1_--
            }
            val i_2_ = i_1_ + -i_0_
            if (i_2_ < 1 || i_2_ > 12) return null
            val stringbuffer = StringBuffer(i_2_)
            var i_3_ = i_0_
            while (i_1_ > i_3_) {
                val c = string.get(i_3_)
                if (method1849(c, i + 108)) {
                    val c_4_ = TypedRecordTable.method2184(c, -10072)
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
            CameraRotationStubStatics.aRenderer326!!.DA(MediaStreamClient.anInt3202, SimpleToggleOptionState.anInt5886, Gl3dTexture.anInt8630, ProjectileConfigUtil.anInt394)
        }

        @JvmStatic
        fun method2131(i: Int) {
            if (i == 0) {
                if (Npc.anInt10503 == 2) {
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![0])
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![1]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![1])
                } else if (Npc.anInt10503 == 3) {
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![0])
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![1]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![1])
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![2]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![2])
                } else {
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![0])
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![1]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![1])
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![2]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![2])
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![3]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![3])
                }
            } else if (i == 1) {
                if (Npc.anInt10503 == 2) NormalMapTextureNode.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![2])
                else if (Npc.anInt10503 == 3) {
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![3])
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![1]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![4])
                } else {
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![4])
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![1]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![5])
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![2]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![6])
                }
            } else if (i == 2) {
                if (Npc.anInt10503 == 2) NormalMapTextureNode.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![3])
                else if (Npc.anInt10503 == 3) NormalMapTextureNode.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![5])
                else NormalMapTextureNode.aSceneLoaderThreadArray9432!![0]!!.method2206(MapElementDefinitionCache.aCacheIndexManagerArray3982!![7])
            }
        }
    }
}
