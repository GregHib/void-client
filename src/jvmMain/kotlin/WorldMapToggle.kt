import BrightnessOptionState.Companion.method1745
import WaterMaterialPass.Companion.method2148
import external.oa
import java.awt.Canvas

/*
 * Class306
 */
object WorldMapToggle {
    @JvmField
    var anInt3872: Int = -1
    var anIntArray3873: IntArray? = IntArray(13)
    @JvmField
    var anInt3874: Int = 0
    var anInt3875: Int = 0
    var anInt3876: Int = 0

    fun method2297(i: Int, i_0_: Int, var_renderConfig: RenderConfig?, canvas: Canvas?, i_1_: Int): Renderer {
        try {
            if (i != -6) method2297(23, -44, null, null, -57)
            anInt3875++
            return oa(canvas, var_renderConfig, i_1_, i_0_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("ws.C(" + i + ',' + i_0_ + ',' + (if (var_renderConfig != null) "{...}" else "null") + ',' + (if (canvas != null) "{...}" else "null") + ',' + i_1_ + ')'))
        }
    }

    fun method2298(i: Byte, string: String) {
        anInt3876++
        if (HostPingThread.aWorldListEntryArray2261 != null) {
            NativeIndexBuffer.anInt4698++
            val class348_sub47 = method2148(SceneCollisionEntry.aFontMetaRef_4405, TheoraVideoStream.aIsaacCipher_9029, -97)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65))
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
            if (i > -50) method2297(104, 26, null, null, -19)
            InterfaceComponentGroup.method3243(-43, class348_sub47)
        }
    }

    @JvmStatic
    fun method2299(i: Byte) {
        anIntArray3873 = null
        if (i.toInt() != -128) method2297(66, -48, null, null, 100)
    }
}
