/* Class348_Sub27 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MultiFieldRecord : LinkedListNode() {
    var anInt6892: Int = 0
    @JvmField
    var anInt6893: Int = -1
    @JvmField
    var anInt6894: Int = 0
    var anInt6895: Int = 0
    @JvmField
    var anInt6896: Int = 0
    var anInt6899: Int = 0
    var anInt6900: Int = 0
    var anInt6902: Int = 0
    var anInt6903: Int = 0
    var anInt6904: Int = 0
    @JvmField
    var anInt6905: Int = 0
    var anInt6907: Int = 0

    companion object {
        @JvmField
        var aMinimapPositionStateArray6897s: Array<MinimapPositionState?>? = arrayOfNulls<MinimapPositionState>(8)
        @JvmField
        var aFloat6898: Float = 0.0f
        var anInt6901: Int = 0
        var anInt6906: Int = 0
        fun method3000(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            Class369.anInt4960 = i_2_
            val i_4_ = -89 / ((i_3_ - 78) / 44)
            Class38.anInt513 = i_1_
            CameraNodeList.anInt1745 = i
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
            return (arrayOf<RectangleRegion?>(RandomAccessFileOnDisk.aRectangleRegion_3044, Texture2DProvider.aRectangleRegion_6321, Font.aRectangleRegion_4062, UnderlayDefinition.aRectangleRegion_2885, ProceduralTextureGraph.aRectangleRegion_9530, FloatBuffer.aRectangleRegion_9748, SpriteMaskShape.aRectangleRegion_4082, GlTexture1D.aRectangleRegion_8553, ShaderProgram.aRectangleRegion_7274, Class71.aRectangleRegion_1213, Class52.aRectangleRegion_4901, DynamicSceneObjectEntity.aRectangleRegion_10194, ArbVertexProgram.aRectangleRegion_9781, Class377.aRectangleRegion_9860))
        }
    }
}
