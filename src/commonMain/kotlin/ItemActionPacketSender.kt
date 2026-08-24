import WaterMaterialPass.Companion.method2148
import ChatCommandProcessor.method705

/* Class155 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ItemActionPacketSender {
    var anInt2108: Int = 0
    var aFontMetaRef_2109: FontMetaRef? = FontMetaRef(19, -1)

    var aBoolean2110: Boolean = false

    @JvmStatic
    fun method1236(i: Byte) {
        aFontMetaRef_2109 = null
    }

    @JvmStatic
    fun method1237(i: Byte, widgetComponent: WidgetComponent) {
        anInt2108++
        if (i < 69) method1236((-52).toByte())
        if (RenderNodeStatics.aBoolean9722) {
            HuffmanCodec.anInt3775++
            if (widgetComponent.anObjectArray679 != null) {
                val class46_0_ = NpcReference.method2957(NativeLibraryState.anInt169, (-54).toByte(), OrientationRotator.anInt2046)
                if (class46_0_ != null) {
                    val class348_sub36 = WidgetActionEntry()
                    class348_sub36.aWidgetComponent_6989 = widgetComponent
                    class348_sub36.aWidgetComponent_6983 = class46_0_
                    class348_sub36.anObjectArray6987 = widgetComponent.anObjectArray679
                    method705(class348_sub36)
                }
            }
            val class348_sub47 = method2148(aFontMetaRef_4266, TheoraVideoStream.aIsaacCipher_9029, -120)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(100.toByte(), widgetComponent.anInt830)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeIntInverseMiddle(OrientationRotator.anInt2046, -4086)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-123, NativeLibraryState.anInt169)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), HeightMapNoise.anInt3829)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(92, widgetComponent.anInt704)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), widgetComponent.anInt812)
            InterfaceComponentGroup.method3243(-89, class348_sub47)
        }
    }
    var aFontMetaRef_4266: FontMetaRef? = FontMetaRef(72, 16)
}
