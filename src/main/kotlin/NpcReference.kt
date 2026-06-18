import Font.Companion.method2570
import ModelVertexColorBuffer.Companion.method2743
import java.awt.Color

class NpcReference internal constructor(@JvmField var aNpc_6859: Npc?) : LinkedListNode() {
    companion object {
        @JvmField
        var anInt6857: Int = 0
        var anInt6858: Int = 0
        var anInt6860: Int = 0
        var anInt6861: Int = 0
        var anInt6862: Int = 0

        @JvmStatic
        fun method2957(i: Int, i_0_: Byte, i_1_: Int): WidgetComponent? {
            anInt6858++
            val class46 = method2570(i_0_ + 1512932774, i_1_)
            if (i == -1) return class46
            if (class46 == null || class46.aWidgetComponentArray798 == null || (i >= class46.aWidgetComponentArray798!!.size)) return null
            return class46.aWidgetComponentArray798!![i]
        }

        fun method2958(i: Int, js5Archive: Js5Archive): Int {
            anInt6861++
            var i_2_ = 0
            if (js5Archive.method421(false, anInt6862)) i_2_++
            if (js5Archive.method421(false, DualMaterialContainer.anInt1639)) i_2_++
            if (js5Archive.method421(false, MouseInputTracker.anInt7429)) i_2_++
            if (js5Archive.method421(false, Renderer.anInt4562)) i_2_++
            if (js5Archive.method421(false, Class82.anInt1435)) i_2_++
            if (js5Archive.method421(false, OverlayColorTable.anInt1756)) i_2_++
            if (js5Archive.method421(false, CutsceneSequenceData.anInt3739)) i_2_++
            if (js5Archive.method421(false, Class86.anInt1481)) i_2_++
            if (js5Archive.method421(false, RangedGraphicsOptionState.anInt5948)) i_2_++
            if (js5Archive.method421(false, CameraNodeList.anInt1742)) i_2_++
            if (js5Archive.method421(false, NamedIdRecord.anInt4469)) i_2_++
            if (i != 22388) return 8
            if (js5Archive.method421(false, ClampTextureNode.anInt9473)) i_2_++
            if (js5Archive.method421(false, LocTypeDefLoader.anInt2510)) i_2_++
            if (js5Archive.method421(false, Class52.anInt4895)) i_2_++
            if (js5Archive.method421(false, PerlinTextureProvider.anInt5814)) i_2_++
            if (js5Archive.method421(false, SpriteComponent.anInt8370)) i_2_++
            return i_2_
        }

        @JvmStatic
        fun method2959(i: Int) {
            LoadProgressCounters.aKeyboardInputSource_2449!!.method2698(14174)
            anInt6860++
            GlTexture1D.aInputTracker_8552!!.method3592(0)
            Class79.aClient1367!!.method87((-49).toByte())
            ParticleSystemRenderer.aCanvas3869!!.setBackground(Color.black)
            GlShaderProgramHandle.anInt4179 = i
            LoadProgressCounters.aKeyboardInputSource_2449 = method2743(ParticleSystemRenderer.aCanvas3869, 84.toByte())
            GlTexture1D.aInputTracker_8552 = InterfaceBounds.Companion.method2941(ParticleSystemRenderer.aCanvas3869, 0, true)
        }
    }
}
