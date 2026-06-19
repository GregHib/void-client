import jagex3.jagmisc.jagmisc.quit
import java.awt.Color
import java.awt.Container
import java.awt.Frame
import java.awt.Graphics
import java.awt.Panel
import java.awt.event.FocusEvent
import java.awt.event.FocusListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import java.io.IOException
import java.net.URL
import java.util.*
import GameAppletFrameStatics.anInt1
import GameAppletFrameStatics.anInt2
import GameAppletFrameStatics.anInt3
import GameAppletFrameStatics.anInt4
import GameAppletFrameStatics.anInt5
import GameAppletFrameStatics.anInt7
import GameAppletFrameStatics.anInt8
import GameAppletFrameStatics.anInt9
import GameAppletFrameStatics.anInt10
import GameAppletFrameStatics.anInt12
import GameAppletFrameStatics.anInt14
import GameAppletFrameStatics.anInt15
import GameAppletFrameStatics.anInt16
import GameAppletFrameStatics.anInt18
import GameAppletFrameStatics.anInt21
import GameAppletFrameStatics.anInt22
import GameAppletFrameStatics.anInt23
import GameAppletFrameStatics.anInt24
import GameAppletFrameStatics.anInt25
import GameAppletFrameStatics.anInt26
import GameAppletFrameStatics.anInt28
import GameAppletFrameStatics.anInt29
import GameAppletFrameStatics.anInt30
import GameAppletFrameStatics.anInt31
import GameAppletFrameStatics.anInt33
import GameAppletFrameStatics.anInt34
import GameAppletFrameStatics.anInt35
import GameAppletFrameStatics.anInt36
import GameAppletFrameStatics.anInt37
import GameAppletFrameStatics.anInt39
import GameAppletFrameStatics.anInt40

/*
 * Applet_Sub1
 */
abstract class GameAppletFrame : Panel(), GameApplet, Runnable, FocusListener, WindowListener {
    private var aBoolean17 = false
    private var aBoolean27 = false
    abstract fun method80(i: Int)

    fun stop() {
        anInt24++
        if (this === EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169 && !SpriteArchiveLoaderStatics.aBoolean384) CameraNodeListStatics.aLong1739 = GameClock.method599(-73) - -4000L
    }

    override fun getParameter(string: String?): String? {
        anInt3++
        if (RsaVarbitHandlerStatics.aFrame4904 != null) return null
        if (JagGlToolkitFactory.anApplet1530 != null && JagGlToolkitFactory.anApplet1530 !== this) return JagGlToolkitFactory.anApplet1530!!.getParameter(string)
        return null
    }

    open fun method81(i: Byte): String? {
        anInt1++
        if (i <= 40) run()
        return null
    }

    fun method82(i: Int, string: String?) {
        val i_0_ = 88 / ((i - -5) / 54)
        anInt22++
        if (!aBoolean27) {
            aBoolean27 = true
            println("error_game_" + string)
            try {
                JavaScriptBridge.method1617(125.toByte(), JagGlToolkitFactory.anApplet1530, "loggedout")
            } catch (throwable: Throwable) {
                /* empty */
            }
            try {
                showDocument(URL(getCodeBase(), ("error_game_" + string + ".ws")), "_top")
            } catch (exception: Exception) {
                /* empty */
            }
        }
    }

    override fun windowActivated(windowevent: WindowEvent?) {
        anInt16++
    }

    fun method83(bool: Boolean): Boolean {
        if (bool != true) getDocumentBase()
        anInt5++
        return BlankTextureNodeStatics.method3098(-30282, "jagmisc")
    }

    override fun focusLost(focusevent: FocusEvent?) {
        anInt9++
        CombineTextureNodeStatics.aBoolean9229 = false
    }

    private fun method84(i: Int) {
        anInt8++
        val l = GameClock.method599(i + -88)
        val l_1_ = MaterialTypeVariant.aLongArray8800!![TextureMetadataProviderStatics.anInt4613]
        MaterialTypeVariant.aLongArray8800!![TextureMetadataProviderStatics.anInt4613] = l
        TextureMetadataProviderStatics.anInt4613 = 0x1f and 1 + TextureMetadataProviderStatics.anInt4613
        if (l_1_ != 0L && l > l_1_) {
            /* empty */
        }
        synchronized(this) {
            SizeBoundedSoftCacheStatics.aBoolean2329 = CombineTextureNodeStatics.aBoolean9229
        }
        method99(93.toByte())
        if (i != -1) aBoolean27 = true
    }

    override fun update(graphics: Graphics) {
        anInt34++
        paint(graphics)
    }

    override fun windowClosing(windowevent: WindowEvent?) {
        anInt15++
        destroy()
    }

    override fun getDocumentBase(): URL? {
        anInt30++
        if (RsaVarbitHandlerStatics.aFrame4904 != null) return null
        if (JagGlToolkitFactory.anApplet1530 != null && this !== JagGlToolkitFactory.anApplet1530) return JagGlToolkitFactory.anApplet1530!!.getDocumentBase()
        return getCodeBase()
    }

    override fun windowDeactivated(windowevent: WindowEvent?) {
        anInt12++
    }

    @Synchronized
    open fun method87(i: Byte) {
        if (i > -11) paint(null)
        if (ParticleSystemRendererStatics.aCanvas3869 != null) {
            ParticleSystemRendererStatics.aCanvas3869!!.removeFocusListener(this)
            ParticleSystemRendererStatics.aCanvas3869!!.getParent().setBackground(Color.black)
            ParticleSystemRendererStatics.aCanvas3869!!.getParent().remove(ParticleSystemRendererStatics.aCanvas3869)
        }
        anInt7++
        val container: Container
        if (SkeletalAnimFrameLoaderStatics.aFrame476 == null) {
            if (RsaVarbitHandlerStatics.aFrame4904 == null) {
                if (JagGlToolkitFactory.anApplet1530 == null) container = EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169!!
                else container = JagGlToolkitFactory.anApplet1530!!.getPulseComponent() as Container
            } else container = RsaVarbitHandlerStatics.aFrame4904 as Container
        } else container = SkeletalAnimFrameLoaderStatics.aFrame476 as Container
        container.setLayout(null)
        ParticleSystemRendererStatics.aCanvas3869 = DelegatingRenderCanvas(this)
        container.add(ParticleSystemRendererStatics.aCanvas3869)
        ParticleSystemRendererStatics.aCanvas3869!!.setSize(LocTypeDefinitionStatics.anInt4017, HardCacheEntryReferenceStatics.anInt10432)
        ParticleSystemRendererStatics.aCanvas3869!!.setVisible(true)
        if (container === RsaVarbitHandlerStatics.aFrame4904) {
            val insets = (RsaVarbitHandlerStatics.aFrame4904 as Container).getInsets()
            ParticleSystemRendererStatics.aCanvas3869!!.setLocation((insets.left + ModelResourceBundleStatics.anInt7129), insets.top - -TimingCounters.anInt4167)
        } else ParticleSystemRendererStatics.aCanvas3869!!.setLocation(ModelResourceBundleStatics.anInt7129, TimingCounters.anInt4167)
        ParticleSystemRendererStatics.aCanvas3869!!.addFocusListener(this)
        ParticleSystemRendererStatics.aCanvas3869!!.requestFocus()
        CombineTextureNodeStatics.aBoolean9229 = true
        SizeBoundedSoftCacheStatics.aBoolean2329 = true
        SpriteRenderableStatics.aBoolean4726 = true
        ProjectileSpawner.aBoolean2674 = false
        BoundingBoxNodeStatics.aLong6748 = GameClock.method599(-106)
    }

    override fun windowOpened(windowevent: WindowEvent?) {
        anInt39++
    }

    @Synchronized
    override fun paint(graphics: Graphics?) {
        anInt18++
        if (this === EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169 && !SpriteArchiveLoaderStatics.aBoolean384) {
            SpriteRenderableStatics.aBoolean4726 = true
            if (GlCubemapLightPassStatics.aBoolean7320 && -BoundingBoxNodeStatics.aLong6748 + GameClock.method599(-57) > 1000) {
                val rectangle = graphics?.getClipBounds()
                if (rectangle == null || (rectangle.width >= SocketFactoryStatics.anInt3473 && (NpcReferenceStatics.anInt6857 <= rectangle.height))) ProjectileSpawner.aBoolean2674 = true
            }
        }
    }

    private fun method88(i: Int) {
        anInt2++
        val l = GameClock.method599(-119)
        val l_2_ = ByteBufferStatics.aLongArray7206!![GzipDecompressorStatics.anInt2071]
        ByteBufferStatics.aLongArray7206!![GzipDecompressorStatics.anInt2071] = l
        if (l_2_ != 0L && l_2_ < l) {
            val i_3_ = (l - l_2_).toInt()
            SimpleToggleOptionStateStatics.anInt5891 = (32000 + (i_3_ shr 1)) / i_3_
        }
        GzipDecompressorStatics.anInt2071 = GzipDecompressorStatics.anInt2071 - -1 and 0x1f
        if (ParticleAmountConfigStatics.anInt2127++ > 50) {
            ParticleAmountConfigStatics.anInt2127 -= 50
            SpriteRenderableStatics.aBoolean4726 = true
            ParticleSystemRendererStatics.aCanvas3869!!.setSize(LocTypeDefinitionStatics.anInt4017, HardCacheEntryReferenceStatics.anInt10432)
            ParticleSystemRendererStatics.aCanvas3869!!.setVisible(true)
            if (RsaVarbitHandlerStatics.aFrame4904 != null && SkeletalAnimFrameLoaderStatics.aFrame476 == null) {
                val insets = RsaVarbitHandlerStatics.aFrame4904!!.getInsets()
                ParticleSystemRendererStatics.aCanvas3869!!.setLocation((insets.left - -ModelResourceBundleStatics.anInt7129), (insets.top + TimingCounters.anInt4167))
            } else ParticleSystemRendererStatics.aCanvas3869!!.setLocation(ModelResourceBundleStatics.anInt7129, TimingCounters.anInt4167)
        }
        method93(-11018)
        if (i > -107) method90(true, true)
    }

    override fun windowDeiconified(windowevent: WindowEvent?) {
        anInt35++
    }

    override fun focusGained(focusevent: FocusEvent?) {
        anInt23++
        CombineTextureNodeStatics.aBoolean9229 = true
        SpriteRenderableStatics.aBoolean4726 = true
    }

    override fun windowClosed(windowevent: WindowEvent?) {
        anInt33++
    }

    fun method89(i: Int): Boolean {
        anInt40++
        return true
        /*if (i <= 19) return true;
        String string = getDocumentBase().getHost().toLowerCase();
        if (string.equals("jagex.com") || string.endsWith(".jagex.com")) return true;
        if (string.equals("runescape.com") || string.endsWith(".runescape.com")) return true;
        if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com")) return true;
        if (string.endsWith("127.0.0.1")) return true;
        for (*/
        /**/ /*; string.length() > 0 && string.charAt(-1 + string.length()) >= 48; string = string.substring(0, string.length() - 1)) {
            if (string.charAt(string.length() - 1) > 57) {
                break;
            }
        }
        if (string.endsWith("192.168.1.")) return true;
        method82(53, "invalidhost");
        return false;*/
    }

    private fun method90(bool: Boolean, bool_4_: Boolean) {
        anInt26++
        synchronized(this) {
            if (SpriteArchiveLoaderStatics.aBoolean384) return
            SpriteArchiveLoaderStatics.aBoolean384 = true
        }
        println("Shutdown start - clean:" + bool)
        if (JagGlToolkitFactory.anApplet1530 != null) JagGlToolkitFactory.anApplet1530!!.destroy()
        if (bool_4_ != false) aBoolean17 = false
        try {
            method80(0)
        } catch (exception: Exception) {
            /* empty */
        }
        if (aBoolean17) {
            try {
                quit()
            } catch (throwable: Throwable) {
                /* empty */
            }
            aBoolean17 = false
        }
        RequestGate.method1945((-128).toByte(), true)
        NativeLibraryUnloader.method1629(!bool_4_)
        if (ParticleSystemRendererStatics.aCanvas3869 != null) {
            try {
                ParticleSystemRendererStatics.aCanvas3869!!.removeFocusListener(this)
                ParticleSystemRendererStatics.aCanvas3869!!.getParent().remove(ParticleSystemRendererStatics.aCanvas3869!!)
            } catch (exception: Exception) {
                /* empty */
            }
        }
        if (VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992 != null) {
            try {
                VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.method2234(103.toByte())
            } catch (exception: Exception) {
                /* empty */
            }
        }
        method91(108.toByte())
        if (RsaVarbitHandlerStatics.aFrame4904 != null) {
            RsaVarbitHandlerStatics.aFrame4904!!.setVisible(false)
            RsaVarbitHandlerStatics.aFrame4904!!.dispose()
            RsaVarbitHandlerStatics.aFrame4904 = null
        }
        println("Shutdown complete - clean:" + bool)
    }

    abstract fun method91(i: Byte)

    override fun getCodeBase(): URL? {
        anInt29++
        if (RsaVarbitHandlerStatics.aFrame4904 != null) return null
        if (JagGlToolkitFactory.anApplet1530 != null && this !== JagGlToolkitFactory.anApplet1530) return JagGlToolkitFactory.anApplet1530!!.getCodeBase()
        return null
    }

    abstract fun init()

    override fun destroy() {
        anInt21++
        if (EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169 === this && !SpriteArchiveLoaderStatics.aBoolean384) {
            CameraNodeListStatics.aLong1739 = GameClock.method599(-108)
            TexGenMaterialPassStatics.method2161(77.toByte(), 5000L)
            HudTabPanelStatics.aPrivilegedOperationWorker_2993 = null
            method90(false, false)
        }
    }

    override fun run() {
        anInt28++
        do {
            try {
                if (PrivilegedOperationWorkerStatics.aString3782 != null) {
                    val string = PrivilegedOperationWorkerStatics.aString3782!!.lowercase(Locale.getDefault())
                    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
                        val string_5_ = PrivilegedOperationWorkerStatics.aString3796!!
                        if (string_5_ == "1.1" || string_5_.startsWith("1.1.") || string_5_ == "1.2" || string_5_.startsWith("1.2.")) {
                            method82(-119, "wrongjava")
                            break
                        }
                    } else if (string.indexOf("ibm") != -1 && (PrivilegedOperationWorkerStatics.aString3796 == null || PrivilegedOperationWorkerStatics.aString3796 == "1.4.2")) {
                        method82(81, "wrongjava")
                        break
                    }
                }
                if (PrivilegedOperationWorkerStatics.aString3796 != null && PrivilegedOperationWorkerStatics.aString3796!!.startsWith("1.")) {
                    var i = 2
                    var i_6_ = 0
                    while (PrivilegedOperationWorkerStatics.aString3796!!.length > i) {
                        val i_7_ = PrivilegedOperationWorkerStatics.aString3796!!.get(i).code
                        if (i_7_ < 48 || i_7_ > 57) break
                        i++
                        i_6_ = 10 * i_6_ - (-i_7_ + 48)
                    }
                    if (i_6_ >= 5) GlCubemapLightPassStatics.aBoolean7320 = true
                }
                var applet: Panel? = EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169
                if (JagGlToolkitFactory.anApplet1530 != null) {
                    val container = JagGlToolkitFactory.anApplet1530!!.getPulseComponent() as? Container
                    if (container != null) {
                        applet = container as Panel
                    }
                }
                val method = PrivilegedOperationWorkerStatics.aMethod3786
                if (method != null) {
                    try {
                        method.invoke(applet, java.lang.Boolean.TRUE)
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                }
                RasterSpriteStatics.method168(103.toByte())
                ScrollingWidgetComponentNodeStatics.method1119(false)
                method87((-97).toByte())
                method92(28740)
                FacingDirectionNodeStatics.aBufferPositionTracker_6660 = RenderConfigFactoryStatics.method1631(false)
                while (CameraNodeListStatics.aLong1739 == 0L || (GameClock.method599(-124) < CameraNodeListStatics.aLong1739)) {
                    FloatCameraTransformStatics.anInt5744 = FacingDirectionNodeStatics.aBufferPositionTracker_6660!!.method1861(0, FileExistsConditionStatics.aLong4783)
                    var i = 0
                    while (FloatCameraTransformStatics.anInt5744 > i) {
                        method84(-1)
                        i++
                    }
                    method88(-119)
                    WorldMapPolygonIconLabelStatics.method3578((-42).toByte(), ParticleSystemRendererStatics.aCanvas3869, (VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992))
                }
            } catch (throwable: Throwable) {
                LinkedListIteratorStatics.method1242(method81(109.toByte()), throwable, 15004)
                method82(123, "crash")
            } finally {
                method90(true, false)
            }
        } while (false)
    }

    abstract fun method92(i: Int)

    abstract fun method93(i: Int)

    fun method95(i: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, string: String?, i_19_: Int) {
        anInt25++
        try {
            if (EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169 == null) {
                ModelResourceBundleStatics.anInt7129 = 0
                HardCacheEntryReferenceStatics.anInt10432 = i_16_
                NpcReferenceStatics.anInt6857 = HardCacheEntryReferenceStatics.anInt10432
                LocTypeDefinitionStatics.anInt4017 = i
                SocketFactoryStatics.anInt3473 = LocTypeDefinitionStatics.anInt4017
                TimingCounters.anInt4167 = 0
                ParticleTileShapeStatics.anInt8818 = i_15_
                EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169 = this
                FacingDirectionNodeStatics.anApplet6662 = JagGlToolkitFactory.anApplet1530
                VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992 = PrivilegedOperationWorker(i_17_, string, i_18_, JagGlToolkitFactory.anApplet1530 != null)
                HudTabPanelStatics.aPrivilegedOperationWorker_2993 = VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992
                val class144 = VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.method2236(this, -10240, 1)
                if (i_19_ != 50) anInt37 = -13
                while (class144.anInt1997 == 0) TexGenMaterialPassStatics.method2161((-126).toByte(), 10L)
            } else {
                DisplaySettingsConfigStatics.anInt7252++
                if (DisplaySettingsConfigStatics.anInt7252 >= 3) method82(112, "alreadyloaded")
                else showDocument(getDocumentBase(), "_self")
            }
        } catch (throwable: Throwable) {
            LinkedListIteratorStatics.method1242(null, throwable, 15004)
            method82(52, "crash")
        }
    }

    fun method96(i: Int, i_20_: Int, bool: Boolean, i_21_: Int, i_22_: Int, string: String?, i_23_: Int, i_24_: Int) {
        try {
            if (i_23_ != 23499) return
            LocTypeDefinitionStatics.anInt4017 = i_20_
            SocketFactoryStatics.anInt3473 = LocTypeDefinitionStatics.anInt4017
            HardCacheEntryReferenceStatics.anInt10432 = i_24_
            NpcReferenceStatics.anInt6857 = HardCacheEntryReferenceStatics.anInt10432
            EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169 = this
            TimingCounters.anInt4167 = 0
            ModelResourceBundleStatics.anInt7129 = 0
            ParticleTileShapeStatics.anInt8818 = i_21_
            FacingDirectionNodeStatics.anApplet6662 = null
            RsaVarbitHandlerStatics.aFrame4904 = Frame()
            RsaVarbitHandlerStatics.aFrame4904!!.setTitle("Jagex")
            RsaVarbitHandlerStatics.aFrame4904!!.setResizable(true)
            RsaVarbitHandlerStatics.aFrame4904!!.addWindowListener(this)
            RsaVarbitHandlerStatics.aFrame4904!!.setVisible(true)
            RsaVarbitHandlerStatics.aFrame4904!!.toFront()
            val insets = RsaVarbitHandlerStatics.aFrame4904!!.getInsets()
            RsaVarbitHandlerStatics.aFrame4904!!.setSize(insets.right + (insets.left + SocketFactoryStatics.anInt3473), (insets.bottom + (NpcReferenceStatics.anInt6857 + insets.top)))
            VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992 = PrivilegedOperationWorker(i, string, i_22_, true)
            HudTabPanelStatics.aPrivilegedOperationWorker_2993 = VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992
            val class144 = VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.method2236(this, i_23_ + -33739, 1)
            while (class144.anInt1997 == 0) TexGenMaterialPassStatics.method2161(21.toByte(), 10L)
        } catch (exception: Exception) {
            LinkedListIteratorStatics.method1242(null, exception, i_23_ + -8495)
        }
        anInt31++
    }

    override fun windowIconified(windowevent: WindowEvent?) {
        anInt14++
    }

    fun method97(i: Int): Boolean {
        if (i != -1) method88(-104)
        anInt4++
        return BlankTextureNodeStatics.method3098(-30282, "jaclib")
    }

    fun start() {
        anInt36++
        if (this === EdgeDetectTextureNodeStatics.anGameApplet_Frame_9169 && !SpriteArchiveLoaderStatics.aBoolean384) CameraNodeListStatics.aLong1739 = 0L
    }

    abstract fun method99(i: Byte)

    fun method100(i: Int): Boolean {
        anInt10++
        if (i != 10) return true
        return BlankTextureNodeStatics.method3098(-30282, "jagtheora")
    }
}
