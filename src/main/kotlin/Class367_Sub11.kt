import GraphicsOptionState.Companion.method1713
import TexGenMaterialPass.Companion.method2158
import CubemapTexture2dSource.Companion.method2260
import jaggl.OpenGL.Companion.glBindProgramARB
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glProgramLocalParameter4fARB
import ArbVertexProgram.Companion.method3442
import java.awt.Container

class Class367_Sub11 internal constructor(glRenderDevice: GlRenderDevice, js5Archive: Js5Archive?) : AbstractRenderPass(glRenderDevice) {
    private var anInterface18_Impl3_7390: Interface18_Impl3? = null
    private val aBoolean7391: Boolean
    private var aTextureHandle_7392: TextureHandle? = null
    private var aTextureHandle_7395: TextureHandle? = null
    private var aBoolean7399 = false
    private var aTextureHandle_7404: TextureHandle? = null
    private var aBoolean7406 = false
    private var aTextureHandle_7407: TextureHandle? = null
    private var aBoolean7411 = false
    private val aFloatArray7413 = FloatArray(4)
    override fun method3528(i: Int) {
        if (i <= 45) method3557(true)
        anInt7401++
        val i_0_ = this.aHa_Sub3_4479.method3941(102)
        val class101_sub2 = this.aHa_Sub3_4479.method3887(98.toByte())
        if (!aBoolean7411) glBindProgramARB(34336, (if (i_0_ != 2147483647) aTextureHandle_7404!!.anInt2584 else aTextureHandle_7395!!.anInt2584))
        else glBindProgramARB(34336, (if (i_0_ == 2147483647) aTextureHandle_7392!!.anInt2584 else aTextureHandle_7407!!.anInt2584))
        glEnable(34336)
        aBoolean7406 = true
        class101_sub2.method919(0.0f, aFloatArray7413, -1.0f, 0.0f, i_0_.toFloat(), (-120).toByte())
        glProgramLocalParameter4fARB(34336, 1, aFloatArray7413[0], aFloatArray7413[1], aFloatArray7413[2], aFloatArray7413[3])
        method3522(-16252)
    }

    override fun method3530(i: Int): Boolean {
        anInt7414++
        if (i > -57) return false
        return aBoolean7391
    }

    override fun method3520(i: Byte) {
        anInt7408++
        this.aHa_Sub3_4479.method3897(1, -4382)
        this.aHa_Sub3_4479.method3850((-128).toByte(), null)
        this.aHa_Sub3_4479.method3874(ParticleSystemState.aRenderConfigFactory_2207, 116, ParticleSystemState.aRenderConfigFactory_2207)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegion.aClass70_4247)
        this.aHa_Sub3_4479.method3849(47.toByte(), 2, RenderListTextureNode.aClass70_9485)
        this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegion.aClass70_4247)
        this.aHa_Sub3_4479.method3897(0, -4382)
        if (aBoolean7399) {
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegion.aClass70_4247)
            this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegion.aClass70_4247)
            aBoolean7399 = false
        }
        if (i.toInt() != 87) aLongHashTable_7415 = null
        if (aBoolean7406) {
            glBindProgramARB(34336, 0)
            glDisable(34820)
            glDisable(34336)
            aBoolean7406 = false
        }
    }

    override fun method3526(i: Int, i_1_: Int, i_2_: Int) {
        if (i != 10756) method3527(113, null, 113)
        anInt7402++
    }

    override fun method3527(i: Int, interface18: Interface18?, i_3_: Int) {
        if (interface18 != null) {
            if (aBoolean7399) {
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegion.aClass70_4247)
                this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegion.aClass70_4247)
                aBoolean7399 = false
            }
            this.aHa_Sub3_4479.method3850((-122).toByte(), interface18)
            this.aHa_Sub3_4479.method3923(true, i)
        } else if (!aBoolean7399) {
            this.aHa_Sub3_4479.method3850(99.toByte(), (this.aHa_Sub3_4479.anInterface18_8147))
            this.aHa_Sub3_4479.method3923(true, 1)
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, SceneObjectEntity.aClass70_8737)
            this.aHa_Sub3_4479.method3885(0, true, SceneObjectEntity.aClass70_8737)
            aBoolean7399 = true
        }
        if (i_3_ != -16776) method3525(16, true)
        anInt7409++
    }

    override fun method3522(i: Int) {
        if (i != -16252) aBoolean7411 = true
        if (aBoolean7406) {
            val i_4_ = this.aHa_Sub3_4479.XA()
            val i_5_ = this.aHa_Sub3_4479.i()
            val f = i_4_.toFloat() - 0.125f * (-i_5_ + i_4_).toFloat()
            val f_6_ = -(0.25f * (-i_5_ + i_4_).toFloat()) + i_4_.toFloat()
            glProgramLocalParameter4fARB(34336, 0, f_6_, f, 1.0f / this.aHa_Sub3_4479.method3833((-58).toByte()).toFloat(), this.aHa_Sub3_4479.method3826((-70).toByte()).toFloat() / 255.0f)
            this.aHa_Sub3_4479.method3897(1, -4382)
            this.aHa_Sub3_4479.method3894(-28186, this.aHa_Sub3_4479.method3863(-104))
            this.aHa_Sub3_4479.method3897(0, -4382)
        }
        anInt7412++
    }

    init {
        try {
            if (js5Archive != null && glRenderDevice!!.aBoolean9923) {
                aTextureHandle_7395 = method3442(34336, js5Archive.method391("gl", "uw_ground_unlit", -29832), glRenderDevice, 4)
                aTextureHandle_7392 = method3442(34336, js5Archive.method391("gl", "uw_ground_lit", -29832), glRenderDevice, 4)
                aTextureHandle_7404 = method3442(34336, js5Archive.method391("gl", "uw_model_unlit", -29832), glRenderDevice, 4)
                aTextureHandle_7407 = method3442(34336, js5Archive.method391("gl", "uw_model_lit", -29832), glRenderDevice, 4)
                if ((aTextureHandle_7395 != null) and (aTextureHandle_7392 != null) and (aTextureHandle_7404 != null) and (aTextureHandle_7407 != null)) {
                    anInterface18_Impl3_7390 = this.aHa_Sub3_4479.method3839(1, 2, -15137, false, (intArrayOf(0, -1)))
                    anInterface18_Impl3_7390!!.method66(false, false, 25688)
                    aBoolean7391 = true
                } else aBoolean7391 = false
            } else aBoolean7391 = false
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("or.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3525(i: Int, bool: Boolean) {
        anInt7400++
        aBoolean7411 = bool
        this.aHa_Sub3_4479.method3897(1, i xor 0x2a45.inv())
        this.aHa_Sub3_4479.method3850((-32).toByte(), anInterface18_Impl3_7390)
        this.aHa_Sub3_4479.method3874((RenderQueueState.aRenderConfigFactory_6519), 109, MediaStreamClient.aRenderConfigFactory_3196)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, RenderListTextureNode.aClass70_9485)
        if (i == 15192) {
            this.aHa_Sub3_4479.method3924(true, false, 2, WidgetRedrawRegion.aClass70_4247, false)
            this.aHa_Sub3_4479.method3885(0, true, SceneObjectEntity.aClass70_8737)
            this.aHa_Sub3_4479.method3897(0, i + -19574)
            method3528(75)
        }
    }

    override fun method3521(bool: Boolean, i: Byte) {
        anInt7393++
        if (i.toInt() != -103) aTextureHandle_7392 = null
    }

    companion object {
        @JvmField
        var anInt7393: Int = 0
        @JvmField
        var aByteArray7394: ByteArray? = null
        @JvmField
        var anInt7396: Int = 0
        @JvmField
        var anIntArray7397: IntArray? = IntArray(4096)
        @JvmField
        var aIntRange_7398: IntRange? = IntRange(16, 6)
        @JvmField
        var anInt7400: Int = 0
        @JvmField
        var anInt7401: Int = 0
        @JvmField
        var anInt7402: Int = 0
        @JvmField
        var anInt7403: Int = 0
        @JvmField
        var anInt7405: Int = 0
        @JvmField
        var anInt7408: Int = 0
        @JvmField
        var anInt7409: Int = 0
        @JvmField
        var anInt7410: Int = 0
        @JvmField
        var anInt7412: Int = 0
        @JvmField
        var anInt7414: Int = 0
        @JvmField
        var aLongHashTable_7415: LongHashTable? = LongHashTable(8)

        @JvmStatic
        fun method3555(js5Archive: Js5Archive?, i: Int, bool: Boolean, l: Long, i_7_: Int, i_8_: Int, i_9_: Int) {
            try {
                anInt7410++
                method2260(i_9_, i_8_, l, 0, bool, js5Archive, 126.toByte(), i_7_)
                val i_10_ = -35 / ((-41 - i) / 38)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatch.method2929(runtimeexception, ("or.Q(" + (if (js5Archive != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + l + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
            }
        }

        @JvmStatic
        fun method3556(bool: Boolean) {
            anInt7405++
            if (bool == false) {
                synchronized(Class79.aClient1367!!) {
                    if (SkeletalAnimFrameLoader.aFrame476 == null) {
                        val container: Container
                        if (RsaVarbitHandler.aFrame4904 != null) container = RsaVarbitHandler.aFrame4904!!
                        else if (Class93.anApplet1530 == null) container = EdgeDetectTextureNode.anGameApplet_Frame_9169!!
                        else container = Class93.anApplet1530!! as Container
                        SocketFactory.anInt3473 = container.getSize().width
                        NpcReference.anInt6857 = container.getSize().height
                        if (RsaVarbitHandler.aFrame4904 === container) {
                            val insets = RsaVarbitHandler.aFrame4904!!.getInsets()
                            SocketFactory.anInt3473 -= insets.left - -insets.right
                            NpcReference.anInt6857 -= insets.bottom + insets.top
                        }
                        if (ContactEntry.method3229(-86) == 1) {
                            LocTypeDefinition.anInt4017 = Class92.anInt1524
                            TimingCounters.anInt4167 = 0
                            ModelResourceBundle.anInt7129 = (SocketFactory.anInt3473 - Class92.anInt1524) / 2
                            HardCacheEntryReference.anInt10432 = OpenGlRenderer.anInt7666
                        } else method2158(56.toByte())
                        if (OggCacheStream.aNamedIdRecord_5271 != Class8.aNamedIdRecord_165) {
                            if (LocTypeDefinition.anInt4017 < 1024 && HardCacheEntryReference.anInt10432 < 768) {
                                /* empty */
                            }
                        }
                        ParticleSystemRenderer.aCanvas3869!!.setSize(LocTypeDefinition.anInt4017, (HardCacheEntryReference.anInt10432))
                        if (FacingDirectionNode.aRenderer6654 != null) {
                            if (GrayscaleNoiseTexture.aBoolean5300) TerrainTile.method3980(120, ParticleSystemRenderer.aCanvas3869!!)
                            else FacingDirectionNode.aRenderer6654!!.method3669(ParticleSystemRenderer.aCanvas3869, LocTypeDefinition.anInt4017, HardCacheEntryReference.anInt10432)
                        }
                        if (RsaVarbitHandler.aFrame4904 === container) {
                            val insets = RsaVarbitHandler.aFrame4904!!.getInsets()
                            ParticleSystemRenderer.aCanvas3869!!.setLocation(insets.left - -ModelResourceBundle.anInt7129, TimingCounters.anInt4167 + insets.top)
                        } else ParticleSystemRenderer.aCanvas3869!!.setLocation((ModelResourceBundle.anInt7129), TimingCounters.anInt4167)
                        if (RenderNode.anInt9721 != -1) method1713(true, 520)
                        ScreenBorderFiller.method1170((-78).toByte())
                    } else {
                        /* empty */
                    }
                }
            }
        }

        @JvmStatic
        fun method3557(bool: Boolean) {
            anIntArray7397 = null
            aLongHashTable_7415 = null
            if (bool == true) {
                aIntRange_7398 = null
                aByteArray7394 = null
            }
        }
    }
}
