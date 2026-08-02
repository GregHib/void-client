import FixedFunctionMaterialPass.Companion.method2145
import ModelVertexColorBuffer.Companion.method2739
import BoxBlurTextureNode.Companion.method3147
import InboundPacketHeader
import RenderListTextureNode.Companion.method3153

/* Class312 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WidgetRedrawTracker {
    private var aLinkedListNode_3922: LinkedListNode? = null
    private var aNodeDeque_3923: NodeDeque? = null
    fun method2327(i: Byte): LinkedListNode? {
        anInt3929++
        val class348 = (aNodeDeque_3923!!.aLinkedListNode_3334.aLinkedListNode_4294)
        if (i.toInt() != -53) method2329(-21)
        if (aNodeDeque_3923!!.aLinkedListNode_3334 === class348) {
            aLinkedListNode_3922 = null
            return null
        }
        aLinkedListNode_3922 = class348!!.aLinkedListNode_4294
        return class348
    }

    fun method2328(nodeDeque: NodeDeque, i: Int) {
        anInt3927++
        if (i <= 73) method2327((-67).toByte())
        aNodeDeque_3923 = nodeDeque
    }

    fun method2329(i: Int): LinkedListNode? {
        anInt3928++
        if (i != 10) Companion.method2330((-25).toByte())
        val class348 = aLinkedListNode_3922
        if (aNodeDeque_3923!!.aLinkedListNode_3334 === class348) {
            aLinkedListNode_3922 = null
            return null
        }
        aLinkedListNode_3922 = class348!!.aLinkedListNode_4294
        return class348
    }

    constructor()

    internal constructor(nodeDeque: NodeDeque) {
        aNodeDeque_3923 = nodeDeque
    }

    companion object {
        var anInt3924: Int = 0
        var anInt3926: Int = 0
        var anInt3927: Int = 0
        var anInt3928: Int = 0
        var anInt3929: Int = 0
        var anInt3930: Int = 2

        var anInt3931: Int

        var anInt3932: Int

        fun method2330(i: Byte) {
            method2739(0)
            anInt3924++
            if (i.toInt() == 86) {
                RadialTextureNode.anInt9341 = 0
                InboundPacketHeader.aInboundPacketHeader_9456 = null
                CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                InboundPacketHeader.aInboundPacketHeader_3133 = null
                InboundPacketHeader.aInboundPacketHeader_3145 = null
                StringCacheNode.anInt7213 = 0
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                RegionSceneLoader.anInt3699 = 0
                method3153(0)
                method3147(27.toByte())
                for (i_0_ in 0..2047) LoadingBarRenderer.aPlayerArray5058!![i_0_] = null
                LocalPlayerState.aPlayer_1907 = null
                var i_1_ = 0
                while (TerrainShadowBuilderGl2.anInt6930 > i_1_) {
                    val npc = (TurbulenceTextureNode.aClass348_Sub22Array9319!![i_1_]!!.aNpc_6859)
                    if (npc != null) npc.anInt10275 = -1
                    i_1_++
                }
                MapElementManager.method3515(i + 36)
                SequencedWallEntity.anInt10163 = -1
                NativeLibraryState.anInt167 = SequencedWallEntity.anInt10163
                WeaveTextureNode.anInt9282 = 1
                ByteBufferStatics.method3379(2, 10)
                for (i_2_ in 0..99) OpenGlModel.aBooleanArray2076!![i_2_] = true
                method2145(-24498)
                LightingOptionState.aClass348_Sub26_5881 = null
                FloatCameraTransform.aLong5745 = 0L
            }
        }

        @JvmStatic
        fun method2331(bool: Boolean) {
            InboundPacketHeader.aInboundPacketHeader_3925 = null
            if (bool != true) anInt3930 = -53
        }

        fun method2332(i: Int, i_3_: Byte, i_4_: Int): Boolean {
            if (i_3_ <= 120) anInt3930 = 6
            anInt3926++
            return (0x20 and i_4_) != 0
        }

        init {
            anInt3931 = 0
            anInt3932 = 1403
        }
    }
}
