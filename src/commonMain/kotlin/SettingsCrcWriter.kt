import kotlin.jvm.JvmStatic
import MatrixCameraTransform.Companion.method912
import FogOptionState.Companion.method1788

/* Class157 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object SettingsCrcWriter {
    var anInt2121: Int = 0
    var anInt2122: Int = 0

    var aAbstractCameraTransform_2123: AbstractCameraTransform? = null

    fun method1244(i: Int, class348_sub49_sub2: CipheredPacketBuffer) {
        if (i < 10) aAbstractCameraTransform_2123 = null
        class348_sub49_sub2.writeInt(121.toByte(), ShortKeyNode.animationFrames!!.method389(26))
        anInt2121++
        class348_sub49_sub2.writeInt(112.toByte(), TextureGenerator.animationSekeletons!!.method389(-106))
        class348_sub49_sub2.writeInt(118.toByte(), DirectionUtil.config!!.method389(-109))
        class348_sub49_sub2.writeInt(120.toByte(), ClientLoadStateMachine.interfaces!!.method389(-108))
        class348_sub49_sub2.writeInt(93.toByte(), ClientLoadStateMachine.soundEffects!!.method389(-104))
        class348_sub49_sub2.writeInt(90.toByte(), AbstractCameraTransformStatics.maps!!.method389(-122))
        class348_sub49_sub2.writeInt(92.toByte(), CachedRgbNoiseTexture.music!!.method389(9))
        class348_sub49_sub2.writeInt(90.toByte(), RasterSprite.models!!.method389(120))
        class348_sub49_sub2.writeInt(99.toByte(), CameraRotationStub.sprites!!.method389(64))
        class348_sub49_sub2.writeInt(90.toByte(), WorldMapTextLabel.textures!!.method389(-123))
        class348_sub49_sub2.writeInt(115.toByte(), SceneTilePlaneManager.huffman!!.method389(-113))
        class348_sub49_sub2.writeInt(94.toByte(), TheoraVideoStream.jingles!!.method389(-113))
        class348_sub49_sub2.writeInt(121.toByte(), CameraNodeList.clientScripts!!.method389(-110))
        class348_sub49_sub2.writeInt(123.toByte(), SoftwareSpriteRaster.aJs5Archive_1627!!.method389(72))
        class348_sub49_sub2.writeInt(120.toByte(), GroundDecorOptionState.vorbis!!.method389(37))
        class348_sub49_sub2.writeInt(115.toByte(), HoverActionEntry.aJs5Archive_1815!!.method389(-115))
        class348_sub49_sub2.writeInt(126.toByte(), AnimationFrameState.objects!!.method389(104))
        class348_sub49_sub2.writeInt(93.toByte(), VideoAdChecker.enums!!.method389(28))
        class348_sub49_sub2.writeInt(115.toByte(), FloatGrid.npcs!!.method389(-96))
        class348_sub49_sub2.writeInt(102.toByte(), ScriptOpcodeHolder.items!!.method389(98))
        class348_sub49_sub2.writeInt(97.toByte(), OpenGlRenderNode.animations!!.method389(114))
        class348_sub49_sub2.writeInt(123.toByte(), BufferedRandomAccessFile.gfx!!.method389(-104))
        class348_sub49_sub2.writeInt(97.toByte(), MidiSequencePlayer.varbits!!.method389(-96))
        class348_sub49_sub2.writeInt(111.toByte(), TerrainShadowBuilderGl2.worldMap!!.method389(109))
        class348_sub49_sub2.writeInt(108.toByte(), ModelBatchBase.quickChat!!.method389(-106))
        class348_sub49_sub2.writeInt(102.toByte(), ConfigArchiveLoader.quickChatMenus!!.method389(102))
        class348_sub49_sub2.writeInt(113.toByte(), KeyEventNode.textureMaterials!!.method389(-122))
        class348_sub49_sub2.writeInt(86.toByte(), ClientLoadStateMachine.particles!!.method389(97))
        class348_sub49_sub2.writeInt(96.toByte(), FixedFunctionWaterPass.defaults!!.method389(-6))
        class348_sub49_sub2.writeInt(96.toByte(), NodeDequeStatics.billboards!!.method389(-122))
        class348_sub49_sub2.writeInt(107.toByte(), Crc64Hashable.nativeLibraries!!.method389(-107))
        class348_sub49_sub2.writeInt(125.toByte(), SpriteLoadValidator.shaders!!.method389(-118))
        class348_sub49_sub2.writeInt(90.toByte(), NpcCountAccessor.method1327(31))
        class348_sub49_sub2.writeInt(120.toByte(), method912(0))
        class348_sub49_sub2.writeInt(87.toByte(), HitsplatDefinition.aJs5Archive_2015!!.method389(-94))
    }

    fun method1245(string: String, bool: Boolean): String {
        anInt2122++
        var string_0_ = method1788(115.toByte(), FloorOverlayTypeList.method2031(-1994, string))
        if (string_0_ == null) string_0_ = ""
        return string_0_
    }

    @JvmStatic
    fun method1246(i: Int) {
        aAbstractCameraTransform_2123 = null
    }
}
