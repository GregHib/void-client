import kotlin.jvm.JvmStatic
import ProjectileSpawner.method1478

/* Class281 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ClanChatRequestSender {
    var aFontMetaRef_3644: FontMetaRef? = FontMetaRef(42, 8)
    var anInt3645: Int = 0

    var anInt3647: Int = 0

    var aFontMetaRef_3648: FontMetaRef? = FontMetaRef(55, 4)

    var aFontDefinition_3649: FontDefinition? = null

    var anInt3650: Int = 0

    fun method2106(string: String?, i: Int) {
        anInt3645++
        val class348_sub47 = method1478(true)
        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeByte(false, ScriptOpcodeHolder.aConfigIdPair_2353!!.anInt400)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 0)
        val i_0_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 634)
        val `is` = MinimapSquareDrawer.method463(class348_sub47, false)
        val i_1_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string!!)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, ChatCommandProcessor.anInt6967)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 += 7
        class348_sub47.aClass348_Sub49_Sub2_7116!!.method3350(i_1_, true, `is`, class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.method3383(1809639944, -i_0_ + (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197))
        InterfaceComponentGroup.method3243(118, class348_sub47)
        GlWaterRenderPass.anInt7297 = 1
        RenderableEntry.anInt4337 = -3
        HostPingThread.anInt2264 = 0
        AnimatedModelRenderer.anInt8398 = 0
    }

    @JvmStatic
    fun method2107(i: Byte) {
        aFontMetaRef_3648 = null
        aFontDefinition_3649 = null
        aFontMetaRef_3644 = null
        if (i.toInt() != 77) ClanChatRequestSender.method2107((-107).toByte())
    }
}
