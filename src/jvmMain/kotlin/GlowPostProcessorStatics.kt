import RefCountedHandleStatics.method1323
import ModelOrSpriteHolderStatics.method174
import NoiseTextureGeneratorStatics.method545
import AnimationFrameState.method865
import TerrainChunkBuilderStatics.method876
import jaggl.OpenGLStatics.glBegin
import jaggl.OpenGLStatics.glEnd
import jaggl.OpenGLStatics.glGetUniformLocationARB
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glOrtho
import jaggl.OpenGLStatics.glPopAttrib
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushAttrib
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glTexCoord3f
import jaggl.OpenGLStatics.glUniform1fARB
import jaggl.OpenGLStatics.glUniform1iARB
import jaggl.OpenGLStatics.glUniform2fARB
import jaggl.OpenGLStatics.glUseProgramObjectARB
import jaggl.OpenGLStatics.glVertex2f
import jaggl.OpenGLStatics.glViewport

object GlowPostProcessorStatics {
    @JvmField
            var aFontMetaRef_2512: FontMetaRef?
            var aBoolean2514: Boolean = false
            var anInt2515: Int = 0
            var anInt2516: Int = 0
            var anInt2517: Int = 0
            var anInt2518: Int = 0
            var anInt2519: Int = 0
            var anInt2520: Int = 0
    
            @JvmStatic
            fun method1411(bool: Boolean) {
                if (bool != true) method1416(121)
                aFontMetaRef_2512 = null
            }
    
            fun method1412(i: Byte, i_0_: Int, i_1_: Int): Boolean {
                if (i.toInt() != -35) method1411(true)
                anInt2519++
                return (i_1_ and 0x800) != 0 && (0x37 and i_0_) != 0
            }
    
            fun method1415(i: Int, i_6_: Int) {
                anInt2520++
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i, 105.toByte(), 17)
                class348_sub42_sub15.method3251(-16058)
            }
    
            @JvmStatic
            fun method1416(i: Int) {
                RenderConfigFactoryStatics.aLocDefinitionCache_2979!!.method2032(5, -101)
                anInt2515++
                Tooltip.aParticleDefLoader_4460!!.method1383(i xor 0x804c, 5)
                RadialTextureNodeStatics.aModelDefinitionLoader_9342!!.method1207(-17452, 5)
                GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2010(5, i + -6)
                MapAreaDefinitionStatics.aBufferedMessageQueue_2529!!.method2076(5, true)
                ClientExceptionStatics.aModelHeaderCache_112!!.method1937(5, false)
                ParticleEmitterNodeStatics.aWidgetCache_191!!.method836(5, 93)
                ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2544(5, (-41).toByte())
                RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1442(5, 1.toByte())
                NormalMapGeneratorStatics.aParticleAmountCache_3453!!.method1587(5, i xor 0xeab)
                OpenGlModelStatics.aNpcDefinitionCache_5558!!.method1984(119.toByte(), 5)
                TheoraVideoStreamStatics.aConfigDefinitionLoader_9031!!.method1224(5, (-98).toByte())
                ModelOrSpriteHolderStatics.aTextureDefinitionLoader_117!!.method1176(5, 52.toByte())
                ProjectionCameraTransformStatics.aEmoteDefCache_5764!!.method2603(5, 11)
                TheoraVideoStreamStatics.aLocTypeDefLoader_9036!!.method1409(5, -20721)
                CircleHitboxStatics.aMapSceneCache_413!!.method819(74.toByte(), 5)
                HoverActionEntryStatics.aSpriteStore_1813!!.method299(5, 16)
                AbstractTileShapeStatics.aMapSceneDefLoader_6559!!.method1392(88, 5)
                GraphicsOptionStateStatics.aItemDefinitionLoader_3147!!.method1285(i, 8)
                SpriteLoadValidatorStatics.aWorldMapImageBuilder_4787!!.method697(5, 26)
                FileExistsConditionStatics.aModelDefinitionCache_4782!!.method1603(5, -66)
                method876(5, 0)
                method545(50, -1)
                method174(50, -30742)
                method865(-8186, 5)
                method1323(5, 26603)
                TextureMipDescriptorStatics.aLruByteCache_4346!!.method578(i + -3, 5)
                MaterialTypeMarkerStatics.aLruByteCache_6517!!.method578(2, 5)
                TerrainTileShapeStatics.aLruByteCache_8807!!.method578(i xor 0x7, 5)
                SkeletalAnimFrameLoaderStatics.aLruByteCache_463!!.method578(2, 5)
                ChatCommandProcessor.aLruByteCache_1174!!.method578(2, 5)
            }
    
            fun method1417(i: Int, js5Archive: Js5Archive, i_7_: Int): SoundBankPatch? {
                anInt2516++
                if (i != 0) aBoolean2514 = true
                val `is` = js5Archive.method415(73.toByte(), i_7_)
                if (`is` == null) return null
                return SoundBankPatch(`is`)
            }
    
            init {
                aFontMetaRef_2512 = FontMetaRef(16, 7)
            }
}
