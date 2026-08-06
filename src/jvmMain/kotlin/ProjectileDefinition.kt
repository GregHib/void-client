import GlArrayBufferObject.Companion.method1153
import HeapInfoRecord.Companion.method1248
import HudTabPanel.Companion.method1642
import WaterMaterialPass.Companion.method2148
import GameClock.method596

/* Class303 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ProjectileDefinition {
    var anInt3843: Int = 0

    var anInt3844: Int = 1
    var anInt3845: Int = 0
    var anInt3846: Int = 0

    fun method2285(bool: Boolean, i: Byte, i_0_: Int) {
        if (i > -61) InboundPacketHeader.aInboundPacketHeader_3842 = null
        anInt3843++
        if (bool) {
            val class348_sub47 = method2148(BufferPositionTracker.aOutgoingPacketHeader_3150, TheoraVideoStream.aIsaacCipher_9029, -126)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_0_)
            InterfaceComponentGroup.method3243(42, class348_sub47)
        } else ChatCommandProcessor.method701(TextureDefinitionLoader.aBoundsConstraintEntry_1966!!, i_0_, -1)
    }

    @JvmStatic
    fun method2286(i: Int) {
        InboundPacketHeader.aInboundPacketHeader_3842 = null
        if (i != 114) anInt3844 = 87
    }

    fun method2287(class348_sub49: ByteBuffer, i: Byte): MinimapSpriteRenderer {
        anInt3846++
        val i_1_ = class348_sub49.readUnsignedByte(255)
        val class221 = method1248(87)[class348_sub49.readUnsignedByte(255)]
        val class341 = method596(20000)[class348_sub49.readUnsignedByte(255)]
        val i_2_ = class348_sub49.readShort(13638)
        val i_3_ = class348_sub49.readShort(13638)
        val i_4_ = class348_sub49.readUnsignedShort(842397944)
        val i_5_ = class348_sub49.readUnsignedShort(842397944)
        val i_6_ = class348_sub49.readInt((-126).toByte())
        val i_7_ = class348_sub49.readInt((-126).toByte())
        val i_8_ = class348_sub49.readInt((-126).toByte())
        val i_9_ = -54 / ((i - -45) / 61)
        val bool = class348_sub49.readUnsignedByte(255) == 1
        return MinimapSpriteRenderer(i_1_, class221, class341, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, bool)
    }

    @JvmStatic
    fun method2288(bool: Boolean, var_renderer: Renderer) {
        anInt3845++
        if (!PlayerSequenceSelector.aBoolean1211) method1642(108.toByte(), var_renderer)
        else method1153(var_renderer, 16)
        if (bool != false) anInt3844 = -97
    }

}
