object MultiFieldRecordStatics {
    var aMinimapPositionStateArray6897s: Array<MinimapPositionState?>? = arrayOfNulls<MinimapPositionState>(8)

    var aFloat6898: Float = 0.0f
    var anInt6901: Int = 0
    var anInt6906: Int = 0
    fun method3000(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        WorldMapLabel.anInt4960 = i_2_
        val i_4_ = -89 / ((i_3_ - 78) / 44)
        WidgetTextConfigStatics.anInt513 = i_1_
        CameraNodeListStatics.anInt1745 = i
        LocalPlayerState.anInt1910 = i_0_
        anInt6906++
    }

    @JvmStatic
    fun method3001(i: Int) {
        aMinimapPositionStateArray6897s = null
        if (i != 0) aMinimapPositionStateArray6897s = null
    }

    fun method3002(i: Byte): Array<RectangleRegion?> {
        if (i.toInt() != -97) aMinimapPositionStateArray6897s = null
        anInt6901++
        return (arrayOf<RectangleRegion?>(
            RandomAccessFileOnDisk.aRectangleRegion_3044,
            Texture2DProvider.aRectangleRegion_6321,
            RSFont.aRectangleRegion_4062,
            UnderlayDefinition.aRectangleRegion_2885,
            ProceduralTextureGraph.aRectangleRegion_9530,
            FloatBuffer.aRectangleRegion_9748,
            SpriteMaskShapeStatics.aRectangleRegion_4082,
            GlTexture1D.aRectangleRegion_8553,
            ShaderProgramStatics.aRectangleRegion_7274,
            PlayerSequenceSelector.aRectangleRegion_1213,
            RsaVarbitHandler.aRectangleRegion_4901,
            DynamicSceneObjectEntity.aRectangleRegion_10194,
            ArbVertexProgram.aRectangleRegion_9781,
            GlRenderDevice.aRectangleRegion_9860
        ))
    }
}
