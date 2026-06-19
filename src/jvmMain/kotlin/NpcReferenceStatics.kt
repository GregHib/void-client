import FontStatics.method2570
import ModelVertexColorBufferStatics.method2743
import java.awt.Color

object NpcReferenceStatics {
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
                if (js5Archive.method421(false, DualMaterialContainerStatics.anInt1639)) i_2_++
                if (js5Archive.method421(false, MouseInputTrackerStatics.anInt7429)) i_2_++
                if (js5Archive.method421(false, RendererStatics.anInt4562)) i_2_++
                if (js5Archive.method421(false, ConfigArchiveLoaderStatics.anInt1435)) i_2_++
                if (js5Archive.method421(false, OverlayColorTable.anInt1756)) i_2_++
                if (js5Archive.method421(false, CutsceneSequenceDataStatics.anInt3739)) i_2_++
                if (js5Archive.method421(false, DrawListState.anInt1481)) i_2_++
                if (js5Archive.method421(false, RangedGraphicsOptionStateStatics.anInt5948)) i_2_++
                if (js5Archive.method421(false, CameraNodeListStatics.anInt1742)) i_2_++
                if (js5Archive.method421(false, NamedIdRecordStatics.anInt4469)) i_2_++
                if (i != 22388) return 8
                if (js5Archive.method421(false, ClampTextureNodeStatics.anInt9473)) i_2_++
                if (js5Archive.method421(false, LocTypeDefLoaderStatics.anInt2510)) i_2_++
                if (js5Archive.method421(false, RsaVarbitHandlerStatics.anInt4895)) i_2_++
                if (js5Archive.method421(false, PerlinTextureProviderStatics.anInt5814)) i_2_++
                if (js5Archive.method421(false, SpriteComponentStatics.anInt8370)) i_2_++
                return i_2_
            }
    
            @JvmStatic
            fun method2959(i: Int) {
                LoadProgressCountersStatics.aKeyboardInputSource_2449!!.method2698(14174)
                anInt6860++
                GlTexture1DStatics.aInputTracker_8552!!.method3592(0)
                NpcTypeStatics.aClient1367!!.method87((-49).toByte())
                ParticleSystemRendererStatics.aCanvas3869!!.setBackground(Color.black)
                GlShaderProgramHandleStatics.anInt4179 = i
                LoadProgressCountersStatics.aKeyboardInputSource_2449 = method2743(ParticleSystemRendererStatics.aCanvas3869, 84.toByte())
                GlTexture1DStatics.aInputTracker_8552 = InterfaceBoundsStatics.method2941(ParticleSystemRendererStatics.aCanvas3869, 0, true)
            }
}
