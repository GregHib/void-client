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

/*
 * Applet_Sub1
 */
abstract class GameAppletFrame : Panel(), GameApplet, Runnable, FocusListener, WindowListener {
    private var aBoolean17 = false
    private var aBoolean27 = false
    abstract fun method80(i: Int)

    fun stop() {
        anInt24++
        if (this === EdgeDetectTextureNode.anGameApplet_Frame_9169 && !SpriteArchiveLoader.aBoolean384) CameraNodeList.aLong1739 = GameClock.method599(-73) - -4000L
    }

    override fun getParameter(string: String?): String? {
        anInt3++
        if (RsaVarbitHandler.aFrame4904 != null) return null
        if (Class93.anApplet1530 != null && Class93.anApplet1530 !== this) return Class93.anApplet1530!!.getParameter(string)
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
                JavaScriptBridge.method1617(125.toByte(), Class93.anApplet1530, "loggedout")
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
        return BlankTextureNode.method3098(-30282, "jagmisc")
    }

    override fun focusLost(focusevent: FocusEvent?) {
        anInt9++
        CombineTextureNode.aBoolean9229 = false
    }

    private fun method84(i: Int) {
        anInt8++
        val l = GameClock.method599(i + -88)
        val l_1_ = MaterialTypeVariant.aLongArray8800!![TextureMetadataProvider.anInt4613]
        MaterialTypeVariant.aLongArray8800!![TextureMetadataProvider.anInt4613] = l
        TextureMetadataProvider.anInt4613 = 0x1f and 1 + TextureMetadataProvider.anInt4613
        if (l_1_ != 0L && l > l_1_) {
            /* empty */
        }
        synchronized(this) {
            SizeBoundedSoftCache.aBoolean2329 = CombineTextureNode.aBoolean9229
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
        if (RsaVarbitHandler.aFrame4904 != null) return null
        if (Class93.anApplet1530 != null && this !== Class93.anApplet1530) return Class93.anApplet1530!!.getDocumentBase()
        return getCodeBase()
    }

    override fun windowDeactivated(windowevent: WindowEvent?) {
        anInt12++
    }

    @Synchronized
    open fun method87(i: Byte) {
        if (i > -11) paint(null)
        if (ParticleSystemRenderer.aCanvas3869 != null) {
            ParticleSystemRenderer.aCanvas3869!!.removeFocusListener(this)
            ParticleSystemRenderer.aCanvas3869!!.getParent().setBackground(Color.black)
            ParticleSystemRenderer.aCanvas3869!!.getParent().remove(ParticleSystemRenderer.aCanvas3869)
        }
        anInt7++
        val container: Container
        if (SkeletalAnimFrameLoader.aFrame476 == null) {
            if (RsaVarbitHandler.aFrame4904 == null) {
                if (Class93.anApplet1530 == null) container = EdgeDetectTextureNode.anGameApplet_Frame_9169!!
                else container = Class93.anApplet1530!!.getPulseComponent() as Container
            } else container = RsaVarbitHandler.aFrame4904 as Container
        } else container = SkeletalAnimFrameLoader.aFrame476 as Container
        container.setLayout(null)
        ParticleSystemRenderer.aCanvas3869 = DelegatingRenderCanvas(this)
        container.add(ParticleSystemRenderer.aCanvas3869)
        ParticleSystemRenderer.aCanvas3869!!.setSize(LocTypeDefinition.anInt4017, HardCacheEntryReference.anInt10432)
        ParticleSystemRenderer.aCanvas3869!!.setVisible(true)
        if (container === RsaVarbitHandler.aFrame4904) {
            val insets = (RsaVarbitHandler.aFrame4904 as Container).getInsets()
            ParticleSystemRenderer.aCanvas3869!!.setLocation((insets.left + ModelResourceBundle.anInt7129), insets.top - -TimingCounters.anInt4167)
        } else ParticleSystemRenderer.aCanvas3869!!.setLocation(ModelResourceBundle.anInt7129, TimingCounters.anInt4167)
        ParticleSystemRenderer.aCanvas3869!!.addFocusListener(this)
        ParticleSystemRenderer.aCanvas3869!!.requestFocus()
        CombineTextureNode.aBoolean9229 = true
        SizeBoundedSoftCache.aBoolean2329 = true
        SpriteRenderable.aBoolean4726 = true
        ProjectileSpawner.aBoolean2674 = false
        BoundingBoxNode.aLong6748 = GameClock.method599(-106)
    }

    override fun windowOpened(windowevent: WindowEvent?) {
        anInt39++
    }

    @Synchronized
    override fun paint(graphics: Graphics?) {
        anInt18++
        if (this === EdgeDetectTextureNode.anGameApplet_Frame_9169 && !SpriteArchiveLoader.aBoolean384) {
            SpriteRenderable.aBoolean4726 = true
            if (Class367_Sub4.aBoolean7320 && -BoundingBoxNode.aLong6748 + GameClock.method599(-57) > 1000) {
                val rectangle = graphics?.getClipBounds()
                if (rectangle == null || (rectangle.width >= SocketFactory.anInt3473 && (NpcReference.anInt6857 <= rectangle.height))) ProjectileSpawner.aBoolean2674 = true
            }
        }
    }

    private fun method88(i: Int) {
        anInt2++
        val l = GameClock.method599(-119)
        val l_2_ = Buffer.aLongArray7206!![GzipDecompressor.anInt2071]
        Buffer.aLongArray7206!![GzipDecompressor.anInt2071] = l
        if (l_2_ != 0L && l_2_ < l) {
            val i_3_ = (l - l_2_).toInt()
            SimpleToggleOptionState.anInt5891 = (32000 + (i_3_ shr 1)) / i_3_
        }
        GzipDecompressor.anInt2071 = GzipDecompressor.anInt2071 - -1 and 0x1f
        if (ParticleAmountConfig.anInt2127++ > 50) {
            ParticleAmountConfig.anInt2127 -= 50
            SpriteRenderable.aBoolean4726 = true
            ParticleSystemRenderer.aCanvas3869!!.setSize(LocTypeDefinition.anInt4017, HardCacheEntryReference.anInt10432)
            ParticleSystemRenderer.aCanvas3869!!.setVisible(true)
            if (RsaVarbitHandler.aFrame4904 != null && SkeletalAnimFrameLoader.aFrame476 == null) {
                val insets = RsaVarbitHandler.aFrame4904!!.getInsets()
                ParticleSystemRenderer.aCanvas3869!!.setLocation((insets.left - -ModelResourceBundle.anInt7129), (insets.top + TimingCounters.anInt4167))
            } else ParticleSystemRenderer.aCanvas3869!!.setLocation(ModelResourceBundle.anInt7129, TimingCounters.anInt4167)
        }
        method93(-11018)
        if (i > -107) method90(true, true)
    }

    override fun windowDeiconified(windowevent: WindowEvent?) {
        anInt35++
    }

    override fun focusGained(focusevent: FocusEvent?) {
        anInt23++
        CombineTextureNode.aBoolean9229 = true
        SpriteRenderable.aBoolean4726 = true
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
            if (SpriteArchiveLoader.aBoolean384) return
            SpriteArchiveLoader.aBoolean384 = true
        }
        println("Shutdown start - clean:" + bool)
        if (Class93.anApplet1530 != null) Class93.anApplet1530!!.destroy()
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
        if (ParticleSystemRenderer.aCanvas3869 != null) {
            try {
                ParticleSystemRenderer.aCanvas3869!!.removeFocusListener(this)
                ParticleSystemRenderer.aCanvas3869!!.getParent().remove(ParticleSystemRenderer.aCanvas3869!!)
            } catch (exception: Exception) {
                /* empty */
            }
        }
        if (VorbisOggDecoder.aPrivilegedOperationWorker_8992 != null) {
            try {
                VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2234(103.toByte())
            } catch (exception: Exception) {
                /* empty */
            }
        }
        method91(108.toByte())
        if (RsaVarbitHandler.aFrame4904 != null) {
            RsaVarbitHandler.aFrame4904!!.setVisible(false)
            RsaVarbitHandler.aFrame4904!!.dispose()
            RsaVarbitHandler.aFrame4904 = null
        }
        println("Shutdown complete - clean:" + bool)
    }

    abstract fun method91(i: Byte)

    override fun getCodeBase(): URL? {
        anInt29++
        if (RsaVarbitHandler.aFrame4904 != null) return null
        if (Class93.anApplet1530 != null && this !== Class93.anApplet1530) return Class93.anApplet1530!!.getCodeBase()
        return null
    }

    abstract fun init()

    override fun destroy() {
        anInt21++
        if (EdgeDetectTextureNode.anGameApplet_Frame_9169 === this && !SpriteArchiveLoader.aBoolean384) {
            CameraNodeList.aLong1739 = GameClock.method599(-108)
            TexGenMaterialPass.method2161(77.toByte(), 5000L)
            HudTabPanel.aPrivilegedOperationWorker_2993 = null
            method90(false, false)
        }
    }

    override fun run() {
        anInt28++
        do {
            try {
                if (PrivilegedOperationWorker.aString3782 != null) {
                    val string = PrivilegedOperationWorker.aString3782!!.lowercase(Locale.getDefault())
                    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
                        val string_5_ = PrivilegedOperationWorker.aString3796!!
                        if (string_5_ == "1.1" || string_5_.startsWith("1.1.") || string_5_ == "1.2" || string_5_.startsWith("1.2.")) {
                            method82(-119, "wrongjava")
                            break
                        }
                    } else if (string.indexOf("ibm") != -1 && (PrivilegedOperationWorker.aString3796 == null || PrivilegedOperationWorker.aString3796 == "1.4.2")) {
                        method82(81, "wrongjava")
                        break
                    }
                }
                if (PrivilegedOperationWorker.aString3796 != null && PrivilegedOperationWorker.aString3796!!.startsWith("1.")) {
                    var i = 2
                    var i_6_ = 0
                    while (PrivilegedOperationWorker.aString3796!!.length > i) {
                        val i_7_ = PrivilegedOperationWorker.aString3796!!.get(i).code
                        if (i_7_ < 48 || i_7_ > 57) break
                        i++
                        i_6_ = 10 * i_6_ - (-i_7_ + 48)
                    }
                    if (i_6_ >= 5) Class367_Sub4.aBoolean7320 = true
                }
                var applet: Panel? = EdgeDetectTextureNode.anGameApplet_Frame_9169
                if (Class93.anApplet1530 != null) {
                    val container = Class93.anApplet1530!!.getPulseComponent() as? Container
                    if (container != null) {
                        applet = container as Panel
                    }
                }
                val method = PrivilegedOperationWorker.aMethod3786
                if (method != null) {
                    try {
                        method.invoke(applet, java.lang.Boolean.TRUE)
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                }
                RasterSprite.method168(103.toByte())
                ScrollingWidgetComponentNode.method1119(false)
                method87((-97).toByte())
                method92(28740)
                FacingDirectionNode.aBufferPositionTracker_6660 = RenderConfigFactory.method1631(false)
                while (CameraNodeList.aLong1739 == 0L || (GameClock.method599(-124) < CameraNodeList.aLong1739)) {
                    FloatCameraTransform.anInt5744 = FacingDirectionNode.aBufferPositionTracker_6660!!.method1861(0, Class73.aLong4783)
                    var i = 0
                    while (FloatCameraTransform.anInt5744 > i) {
                        method84(-1)
                        i++
                    }
                    method88(-119)
                    WorldMapPolygonIconLabel.method3578((-42).toByte(), ParticleSystemRenderer.aCanvas3869, (VorbisOggDecoder.aPrivilegedOperationWorker_8992))
                }
            } catch (throwable: Throwable) {
                LinkedListIterator.method1242(method81(109.toByte()), throwable, 15004)
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
            if (EdgeDetectTextureNode.anGameApplet_Frame_9169 == null) {
                ModelResourceBundle.anInt7129 = 0
                HardCacheEntryReference.anInt10432 = i_16_
                NpcReference.anInt6857 = HardCacheEntryReference.anInt10432
                LocTypeDefinition.anInt4017 = i
                SocketFactory.anInt3473 = LocTypeDefinition.anInt4017
                TimingCounters.anInt4167 = 0
                ParticleTileShape.anInt8818 = i_15_
                EdgeDetectTextureNode.anGameApplet_Frame_9169 = this
                FacingDirectionNode.anApplet6662 = Class93.anApplet1530
                VorbisOggDecoder.aPrivilegedOperationWorker_8992 = PrivilegedOperationWorker(i_17_, string, i_18_, Class93.anApplet1530 != null)
                HudTabPanel.aPrivilegedOperationWorker_2993 = VorbisOggDecoder.aPrivilegedOperationWorker_8992
                val class144 = VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2236(this, -10240, 1)
                if (i_19_ != 50) anInt37 = -13
                while (class144.anInt1997 == 0) TexGenMaterialPass.method2161((-126).toByte(), 10L)
            } else {
                DisplaySettingsConfig.anInt7252++
                if (DisplaySettingsConfig.anInt7252 >= 3) method82(112, "alreadyloaded")
                else showDocument(getDocumentBase(), "_self")
            }
        } catch (throwable: Throwable) {
            LinkedListIterator.method1242(null, throwable, 15004)
            method82(52, "crash")
        }
    }

    fun method96(i: Int, i_20_: Int, bool: Boolean, i_21_: Int, i_22_: Int, string: String?, i_23_: Int, i_24_: Int) {
        try {
            if (i_23_ != 23499) return
            LocTypeDefinition.anInt4017 = i_20_
            SocketFactory.anInt3473 = LocTypeDefinition.anInt4017
            HardCacheEntryReference.anInt10432 = i_24_
            NpcReference.anInt6857 = HardCacheEntryReference.anInt10432
            EdgeDetectTextureNode.anGameApplet_Frame_9169 = this
            TimingCounters.anInt4167 = 0
            ModelResourceBundle.anInt7129 = 0
            ParticleTileShape.anInt8818 = i_21_
            FacingDirectionNode.anApplet6662 = null
            RsaVarbitHandler.aFrame4904 = Frame()
            RsaVarbitHandler.aFrame4904!!.setTitle("Jagex")
            RsaVarbitHandler.aFrame4904!!.setResizable(true)
            RsaVarbitHandler.aFrame4904!!.addWindowListener(this)
            RsaVarbitHandler.aFrame4904!!.setVisible(true)
            RsaVarbitHandler.aFrame4904!!.toFront()
            val insets = RsaVarbitHandler.aFrame4904!!.getInsets()
            RsaVarbitHandler.aFrame4904!!.setSize(insets.right + (insets.left + SocketFactory.anInt3473), (insets.bottom + (NpcReference.anInt6857 + insets.top)))
            VorbisOggDecoder.aPrivilegedOperationWorker_8992 = PrivilegedOperationWorker(i, string, i_22_, true)
            HudTabPanel.aPrivilegedOperationWorker_2993 = VorbisOggDecoder.aPrivilegedOperationWorker_8992
            val class144 = VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2236(this, i_23_ + -33739, 1)
            while (class144.anInt1997 == 0) TexGenMaterialPass.method2161(21.toByte(), 10L)
        } catch (exception: Exception) {
            LinkedListIterator.method1242(null, exception, i_23_ + -8495)
        }
        anInt31++
    }

    override fun windowIconified(windowevent: WindowEvent?) {
        anInt14++
    }

    fun method97(i: Int): Boolean {
        if (i != -1) method88(-104)
        anInt4++
        return BlankTextureNode.method3098(-30282, "jaclib")
    }

    fun start() {
        anInt36++
        if (this === EdgeDetectTextureNode.anGameApplet_Frame_9169 && !SpriteArchiveLoader.aBoolean384) CameraNodeList.aLong1739 = 0L
    }

    abstract fun method99(i: Byte)

    fun method100(i: Int): Boolean {
        anInt10++
        if (i != 10) return true
        return BlankTextureNode.method3098(-30282, "jagtheora")
    }

    companion object {
        @JvmField
        var anInt1: Int = 0
        @JvmField
        var anInt2: Int = 0
        @JvmField
        var anInt3: Int = 0
        @JvmField
        var anInt4: Int = 0
        @JvmField
        var anInt5: Int = 0
        @JvmField
        var anInt6: Int = 0
        @JvmField
        var anInt7: Int = 0
        @JvmField
        var anInt8: Int = 0
        @JvmField
        var anInt9: Int = 0
        @JvmField
        var anInt10: Int = 0
        @JvmField
        var anInt11: Int = 0
        @JvmField
        var anInt12: Int = 0
        @JvmField
        var anInt13: Int = 0
        @JvmField
        var anInt14: Int = 0
        @JvmField
        var anInt15: Int = 0
        @JvmField
        var anInt16: Int = 0
        @JvmField
        var anInt18: Int = 0
        @JvmField
        var anInt19: Int = 0
        @JvmField
        var aFont_20: Font? = null
        @JvmField
        var anInt21: Int = 0
        @JvmField
        var anInt22: Int = 0
        @JvmField
        var anInt23: Int = 0
        @JvmField
        var anInt24: Int = 0
        @JvmField
        var anInt25: Int = 0
        @JvmField
        var anInt26: Int = 0
        @JvmField
        var anInt28: Int = 0
        @JvmField
        var anInt29: Int = 0
        @JvmField
        var anInt30: Int = 0
        @JvmField
        var anInt31: Int = 0
        @JvmField
        var anInt32: Int = 0
        @JvmField
        var anInt33: Int = 0
        @JvmField
        var anInt34: Int = 0
        @JvmField
        var anInt35: Int = 0
        @JvmField
        var anInt36: Int = 0
        @JvmField
        var anInt37: Int = 0
        @JvmField
        var anIntArray38: IntArray? = null
        @JvmField
        var anInt39: Int = 0
        @JvmField
        var anInt40: Int = 0
        @JvmField
        var aBoolean41: Boolean = false

        @JvmStatic
        fun method85(i: Int, js5Archive: Js5Archive?) {
            anInt32++
            WorldMapIconLabel.aJs5Archive_8601 = js5Archive
            if (i != 0) anInt37 = 101
        }

        @JvmStatic
        fun method86(string: String?, i: Int): Boolean {
            anInt13++
            if (i != 0) return true
            return CollisionMapAccessor.aHashtable3548!!.containsKey(string)
        }

        @JvmStatic
        fun provideLoaderApplet(applet: GameApplet) {
            anInt11++
            Class93.anApplet1530 = applet
        }

        @JvmStatic
        fun set(string: String) {
            MapElementManager.aString4461 = string
            TerrainShadowBuilderGl3.anInt7006 = string.length
        }

        @JvmStatic
        fun method94(string: String, i: Int) {
            anInt6++
            if (ArbFogMaterialPass.aStringArray6200 == null) Gl3dTexture.method249(2)
            WaterMaterialPass.aCalendar6221!!.setTime(Date(GameClock.method599(-102)))
            val i_8_ = WaterMaterialPass.aCalendar6221!!.get(11)
            val i_9_ = WaterMaterialPass.aCalendar6221!!.get(12)
            val i_10_ = WaterMaterialPass.aCalendar6221!!.get(13)
            val string_11_ = ((i_8_ / 10).toString() + i_8_ % 10 + ":" + i_9_ / 10 + i_9_ % 10 + ":" + i_10_ / 10 + i_10_ % 10)
            val strings = TurbulenceTextureNode.method3113('\n', true, string)
            for (i_12_ in strings.indices) {
                for (i_13_ in WorldMapTextLabel.anInt8587 downTo 1) ArbFogMaterialPass.aStringArray6200!![i_13_] = ArbFogMaterialPass.aStringArray6200!![-1 + i_13_]
                ArbFogMaterialPass.aStringArray6200!![0] = string_11_ + ": " + strings[i_12_]
                if (Texture2DProvider.aFileOutputStream6323 != null) {
                    try {
                        Texture2DProvider.aFileOutputStream6323!!.write(ClientGameLoopNode.method2992(((ArbFogMaterialPass.aStringArray6200!![0]) + "\n"), (-20).toByte()))
                    } catch (ioexception: IOException) {
                        /* empty */
                    }
                }
                if (-1 + ArbFogMaterialPass.aStringArray6200!!.size > WorldMapTextLabel.anInt8587) {
                    WorldMapTextLabel.anInt8587++
                    if (ViewportTransform.anInt3676 > 0) ViewportTransform.anInt3676++
                }
            }
        }

        @JvmStatic
        fun method98(i: Int) {
            anIntArray38 = null
            aFont_20 = null
            if (i != 32717) method86(null, 65)
        }
    }
}
