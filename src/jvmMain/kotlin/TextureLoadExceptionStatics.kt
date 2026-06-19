object TextureLoadExceptionStatics {
    @JvmField
    var anInt4596: Int
    @JvmField
    var anInt4597: Int = 0
    @JvmField
    var anInt4598: Int = 0
    @JvmField
    var aBoolean4599: Boolean
    @JvmField
    var anInt4600: Int = 52
    @JvmField
    var aFontMetaRef_4601: FontMetaRef?
    @JvmField
    var aFloatArray4602: FloatArray?
    @JvmField
    var anIntArray4603: IntArray? = null
    @JvmField
    var aBoolean4604: Boolean
    @JvmField
    var anInt4605: Int = 0

    @JvmStatic
    fun method4009(i: Int, `is`: IntArray?, is_0_: IntArray?, i_1_: Int, var_ha_Sub2: OpenGlRenderer?, i_2_: Int): NativeSprite {
        try {
            anInt4597++
            val is_3_ = ByteArray(i * i_2_)
            for (i_4_ in i_1_..<i_2_) {
                var i_5_ = i * i_4_ - -`is`!![i_4_]
                for (i_6_ in 0..<is_0_!![i_4_]) is_3_[i_5_++] = (-1).toByte()
            }
            return NativeSprite(var_ha_Sub2, i, i_2_, is_3_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("kg.C(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_0_ != null) "{...}" else "null") + ',' + i_1_ + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i_2_ + ')'))
        }
    }

    @JvmStatic
    fun method4010(i: Int) {
        if (i == -3) {
            anIntArray4603 = null
            aFloatArray4602 = null
            aFontMetaRef_4601 = null
        }
    }

    @JvmStatic
    fun method4011(i: Int, js5Archive: Js5Archive?) {
        anInt4598++
        if (i != 1024) method4012(null, 68.toByte())
        Client.anInt5171 = 0
        TerrainTileShape.anInt8808 = 0
        OpenGlModel.aDoublyLinkedNodeList_2077 = DoublyLinkedNodeList()
        DisplayModeOptionState.aClass318_Sub9_Sub2_Sub1Array6103 = arrayOfNulls<ProjectileNode>(1024)
        DisplaySettingsConfig.aClass318_Sub10Array7249 = arrayOfNulls<SceneGraphContainer>((KeyedCacheEntryReference.anIntArray9558!![TextureQualityOptionState.anInt6637]) + 1)
        GlTexture2D.anInt8550 = 0
        RingBufferInputStream.anInt4559 = 0
        CacheArchiveIndex.method1072(js5Archive, (-107).toByte())
        ModelOrSpriteHolder.method172(30284, js5Archive)
    }

    @JvmStatic
    fun method4012(`is`: ByteArray?, i: Byte) {
        anInt4605++
        val class348_sub49 = ByteBuffer(`is`)
        val i_7_ = -91 % ((i - -51) / 42)
        var bool = false
        while (true) {
            val i_8_ = class348_sub49.readUnsignedByte(255)
            if (i_8_ == 0) break
            if (i_8_ == 1) {
                if (MapSceneTileDefinition.anIntArray1786 == null) {
                    MapSceneTileDefinition.anIntArray1786 = IntArray(4)
                    LocalPlayerState.anInt1905 = 4
                    DualMaterialContainer.anIntArray1636 = IntArray(4)
                }
                for (i_9_ in MapSceneTileDefinition.anIntArray1786!!.indices) {
                    MapSceneTileDefinition.anIntArray1786!![i_9_] = class348_sub49.readShort(13638)
                    DualMaterialContainer.anIntArray1636!![i_9_] = class348_sub49.readShort(13638)
                }
                bool = true
            } else if (i_8_ != 2) {
                if (i_8_ == 3) {
                    LocalPlayerState.anInt1905 = class348_sub49.readUnsignedByte(255)
                    MapSceneTileDefinition.anIntArray1786 = IntArray(LocalPlayerState.anInt1905)
                    DualMaterialContainer.anIntArray1636 = IntArray(LocalPlayerState.anInt1905)
                }
            } else AbstractFrameBufferSurface.anInt6923 = class348_sub49.readUnsignedShort(842397944)
        }
        if (!bool) {
            if (MapSceneTileDefinition.anIntArray1786 == null) {
                MapSceneTileDefinition.anIntArray1786 = IntArray(4)
                DualMaterialContainer.anIntArray1636 = IntArray(4)
                LocalPlayerState.anInt1905 = 4
            }
            for (i_10_ in MapSceneTileDefinition.anIntArray1786!!.indices) {
                MapSceneTileDefinition.anIntArray1786!![i_10_] = 0
                DualMaterialContainer.anIntArray1636!![i_10_] = i_10_ * 20
            }
        }
    }

    init {
        aBoolean4599 = true
        anInt4596 = -1
        aFloatArray4602 = FloatArray(4)
        aBoolean4604 = false
        aFontMetaRef_4601 = FontMetaRef(65, 3)
    }
}