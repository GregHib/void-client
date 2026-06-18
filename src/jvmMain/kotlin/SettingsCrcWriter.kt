import MatrixCameraTransform.Companion.method912
import ShadowQualityOptionState.Companion.method1788

/* Class157 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object SettingsCrcWriter {
    var anInt2121: Int = 0
    var anInt2122: Int = 0
    @JvmField
    var aAbstractCameraTransform_2123: AbstractCameraTransform? = null

    fun method1244(i: Int, class348_sub49_sub2: CipheredPacketBuffer) {
        if (i < 10) aAbstractCameraTransform_2123 = null
        class348_sub49_sub2.writeInt(121.toByte(), ShortKeyNode.aJs5Archive_6909!!.method389(26))
        anInt2121++
        class348_sub49_sub2.writeInt(112.toByte(), TextureGenerator.aJs5Archive_2490!!.method389(-106))
        class348_sub49_sub2.writeInt(118.toByte(), DirectionUtil.aJs5Archive_1541!!.method389(-109))
        class348_sub49_sub2.writeInt(120.toByte(), IntKeyNode.aJs5Archive_6980!!.method389(-108))
        class348_sub49_sub2.writeInt(93.toByte(), ModelFacePriorityNode.aJs5Archive_1878!!.method389(-104))
        class348_sub49_sub2.writeInt(90.toByte(), GlShadowRenderPass.aJs5Archive_7382!!.method389(-122))
        class348_sub49_sub2.writeInt(92.toByte(), CachedRgbNoiseTexture.aJs5Archive_8667!!.method389(9))
        class348_sub49_sub2.writeInt(90.toByte(), RasterSprite.aJs5Archive_5207!!.method389(120))
        class348_sub49_sub2.writeInt(99.toByte(), CameraRotationStub.aJs5Archive_322!!.method389(64))
        class348_sub49_sub2.writeInt(90.toByte(), WorldMapTextLabel.aJs5Archive_8589!!.method389(-123))
        class348_sub49_sub2.writeInt(115.toByte(), SceneTilePlaneManager.aJs5Archive_233!!.method389(-113))
        class348_sub49_sub2.writeInt(94.toByte(), TheoraVideoStream.aJs5Archive_9033!!.method389(-113))
        class348_sub49_sub2.writeInt(121.toByte(), CameraNodeList.aJs5Archive_1743!!.method389(-110))
        class348_sub49_sub2.writeInt(123.toByte(), SoftwareSpriteRaster.aJs5Archive_1627!!.method389(72))
        class348_sub49_sub2.writeInt(120.toByte(), LightingOptionState.aJs5Archive_5878!!.method389(37))
        class348_sub49_sub2.writeInt(115.toByte(), HoverActionEntry.aJs5Archive_1815!!.method389(-115))
        class348_sub49_sub2.writeInt(126.toByte(), AnimationFrameState.aJs5Archive_1538!!.method389(104))
        class348_sub49_sub2.writeInt(93.toByte(), VideoAdChecker.aJs5Archive_3183!!.method389(28))
        class348_sub49_sub2.writeInt(115.toByte(), FloatGrid.aJs5Archive_4975!!.method389(-96))
        class348_sub49_sub2.writeInt(102.toByte(), SpotAnimVector.aJs5Archive_2306!!.method389(98))
        class348_sub49_sub2.writeInt(97.toByte(), OpenGlRenderNode.aJs5Archive_10480!!.method389(114))
        class348_sub49_sub2.writeInt(123.toByte(), BufferedRandomAccessFile.aJs5Archive_1322!!.method389(-104))
        class348_sub49_sub2.writeInt(97.toByte(), MidiSequencePlayer.aJs5Archive_8926!!.method389(-96))
        class348_sub49_sub2.writeInt(111.toByte(), TerrainShadowBuilderGl2.aJs5Archive_6950!!.method389(109))
        class348_sub49_sub2.writeInt(108.toByte(), ModelBatchBase.aJs5Archive_1897!!.method389(-106))
        class348_sub49_sub2.writeInt(102.toByte(), ConfigArchiveLoader.aJs5Archive_1434!!.method389(102))
        class348_sub49_sub2.writeInt(113.toByte(), KeyEventNode.aJs5Archive_4770!!.method389(-122))
        class348_sub49_sub2.writeInt(86.toByte(), GraphicsOptionState.aJs5Archive_3146!!.method389(97))
        class348_sub49_sub2.writeInt(96.toByte(), FixedFunctionWaterPass.aJs5Archive_7362!!.method389(-6))
        class348_sub49_sub2.writeInt(96.toByte(), NodeDequeStatics.aJs5Archive_3323!!.method389(-122))
        class348_sub49_sub2.writeInt(107.toByte(), Crc64Hashable.aJs5Archive_4984!!.method389(-107))
        class348_sub49_sub2.writeInt(125.toByte(), SpriteLoadValidator.aJs5Archive_4796!!.method389(-118))
        class348_sub49_sub2.writeInt(90.toByte(), NpcCountAccessor.method1327(31))
        class348_sub49_sub2.writeInt(120.toByte(), method912(0))
        class348_sub49_sub2.writeInt(87.toByte(), HitsplatDefinition.aJs5Archive_2015!!.method389(-94))
    }

    fun method1245(string: String, bool: Boolean): String {
        anInt2122++
        var string_0_ = method1788(115.toByte(), LocDefinitionCache.method2031(-1994, string))
        if (string_0_ == null) string_0_ = ""
        return string_0_
    }

    @JvmStatic
    fun method1246(i: Int) {
        aAbstractCameraTransform_2123 = null
    }
}
