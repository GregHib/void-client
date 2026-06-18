import ParticleTileShape.Companion.method2732

/* Class40 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Bzip2DecoderState internal constructor() {
    @JvmField
    var anInt522: Int = 0
    @JvmField
    var aBooleanArray523: BooleanArray?
    @JvmField
    var anInt524: Int = 0
    @JvmField
    var anIntArray525: IntArray = IntArray(6)
    @JvmField
    var anInt526: Int = 0
    @JvmField
    var aByteArray527: ByteArray? = null
    @JvmField
    var aByteArray528: ByteArray?
    @JvmField
    var anIntArrayArray529: Array<IntArray?>?
    @JvmField
    var anInt530: Int = 0
    @JvmField
    var aByteArray531: ByteArray = ByteArray(18002)
    @JvmField
    var aBooleanArray532: BooleanArray?
    @JvmField
    var anInt533: Int = 0
    @JvmField
    var aByteArray534: ByteArray? = null
    @JvmField
    var anIntArray535: IntArray?
    @JvmField
    var anInt536: Int = 0
    @JvmField
    var anInt537: Int = 0
    @JvmField
    var anInt538: Int = 0
    @JvmField
    var aByte539: Byte = 0
    @JvmField
    var anIntArray540: IntArray?
    @JvmField
    var anInt541: Int = 0
    @JvmField
    var aByteArray544: ByteArray?
    @JvmField
    var aByteArray545: ByteArray?
    @JvmField
    var anInt546: Int = 0
    @JvmField
    var anInt548: Int = 0
    @JvmField
    var aByteArrayArray549: Array<ByteArray?>?
    @JvmField
    var anInt550: Int = 0
    @JvmField
    var anInt552: Int = 0
    @JvmField
    var anIntArrayArray553: Array<IntArray?>?
    @JvmField
    var anInt554: Int = 0
    @JvmField
    var anInt555: Int = 0
    @JvmField
    var anIntArrayArray556: Array<IntArray?>?
    @JvmField
    var anIntArray557: IntArray?

    init {
        this.anIntArrayArray529 = Array<IntArray?>(6) { IntArray(258) }
        this.anIntArray535 = IntArray(256)
        this.aByteArray544 = ByteArray(18002)
        this.aBooleanArray523 = BooleanArray(256)
        this.aByteArray528 = ByteArray(256)
        this.aByteArrayArray549 = Array<ByteArray?>(6) { ByteArray(258) }
        this.aByteArray545 = ByteArray(4096)
        this.anIntArray540 = IntArray(16)
        this.aBooleanArray532 = BooleanArray(16)
        this.anIntArrayArray553 = Array<IntArray?>(6) { IntArray(258) }
        this.anIntArrayArray556 = Array<IntArray?>(6) { IntArray(258) }
        this.anIntArray557 = IntArray(257)
    }

    companion object {
        @JvmField
        var anInt542: Int = 0
        @JvmField
        var anIntArray543: IntArray? = null
        @JvmField
        var anInt547: Int = 0
        @JvmField
        var anInt551: Int = 0
        @JvmField
        var anInt558: Int = -1

        @JvmStatic
        fun method368(i: Int, i_0_: Int, bool: Boolean, i_1_: Int, js5Archive: Js5Archive?, i_2_: Int, i_3_: Int) {
            if (i_0_ != 18002) anInt558 = 41
            anInt551++
            if (i_3_ > 0) {
                KeyboardInputSource.aBoolean4275 = bool
                SpriteDefinition.anInt7068 = 1
                ModelDefinition.aJs5Archive_1848 = js5Archive
                NpcActorEntity.anInt10074 = i_1_
                GlBufferObject.aClass348_Sub16_Sub3_4743 = null
                SceneLinkedListNode.anInt3971 = i_2_
                DirectionPath.anInt1059 = i
                WaterDetailOptionState.anInt5994 = (NodeDequeHolder.aClass348_Sub16_Sub3_1564!!.method2844(103.toByte()) / i_3_)
                if (WaterDetailOptionState.anInt5994 < 1) WaterDetailOptionState.anInt5994 = 1
            } else method2732(i_2_, i_1_, bool, 123, js5Archive, i)
        }

        @JvmStatic
        fun method369(i: Int) {
            TimedRecordAccessor.aAbstractModelRendererArray7107 = null
            CameraDistanceOptionState.aAbstractModelRendererArray5857 = null
            BoundingBoxNode.aAbstractModelRendererArray6742 = null
            WorldMapRenderer.aAbstractModelRendererArray4679 = null
            if (i != -29776) method370(true)
            NpcType.aAbstractModelRenderer_1365 = null
            SpriteStore.aAbstractModelRendererArray367 = null
            CustomCursorsOptionState.aAbstractModelRendererArray5933 = null
            ScriptResources.aAbstractModelRendererArray2640 = null
            BoxBlurTextureNode.aAbstractModelRendererArray9467 = null
            NodeDequeStatics.aFont_3326 = null
            SceneryDetailOptionState.aAbstractModelRenderer_6097 = null
            GameAppletFrame.aFont_20 = null
            WorldMapRenderer.aFont_4684 = null
            HostPingThread.aAbstractModelRendererArray2260 = null
            CameraNodeList.aAbstractModelRendererArray1744 = null
            CompassSmoother.aAbstractModelRendererArray3378 = null
            GrayscaleNoiseTexture.aAbstractModelRendererArray5294 = null
            WallSceneEntity.aAbstractModelRendererArray9959 = null
            anInt542++
        }

        @JvmStatic
        fun method370(bool: Boolean) {
            if (bool != true) anIntArray543 = null
            anIntArray543 = null
        }

        @JvmStatic
        fun method371(i: Int, i_4_: Int, i_5_: Int): Boolean {
            if (i_4_ != 256) return true
            anInt547++
            return (i and 0x180) != 0
        }
    }
}
