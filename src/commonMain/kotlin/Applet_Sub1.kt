abstract class Applet_Sub1 : GameApplet, AppletWindowCallbacks {
    private var aBoolean17 = false
    private var aBoolean27 = false
    abstract fun method80(i: Int)

    fun stop() {
        anInt24++
        if (this === AppletRoot.instance && !Class26Statics.aBoolean384) Class113Statics.aLong1739 = clockMillis() - -4000L
    }

    override fun getParameter(string: String?): String? {
        anInt3++
        if (WindowShells.instance?.isFullscreen == true) return null
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
                Class224Statics.method1617(125.toByte(), Class93.anApplet1530, "loggedout")
            } catch (throwable: Throwable) {
                /* empty */
            }
            try {
                showDocument(getCodeBase()?.let { it + "error_game_" + string + ".ws" }, "_top")
            } catch (exception: Exception) {
                /* empty */
            }
        }
    }

    fun method83(bool: Boolean): Boolean {
        if (bool != true) getDocumentBase()
        anInt5++
        return Class348Sub40Sub19Statics.method3098(-30282, "jagmisc")
    }

    override fun onFocusLost() {
        anInt9++
        Class348Sub40Sub16Statics.aBoolean9229 = false
    }

    private fun method84(i: Int) {
        anInt8++
        val l = clockMillis()
        val l_1_ = Class328Sub2Sub1Statics.aLongArray8800!![Class244Statics.anInt4613]
        Class328Sub2Sub1Statics.aLongArray8800!![Class244Statics.anInt4613] = l
        Class244Statics.anInt4613 = 0x1f and 1 + Class244Statics.anInt4613
        if (l_1_ != 0L && l > l_1_) {
            /* empty */
        }
        withLock(this) {
            Class175Statics.aBoolean2329 = Class348Sub40Sub16Statics.aBoolean9229
        }
        method99(93.toByte())
        if (i != -1) aBoolean27 = true
    }

    override fun onWindowClosing() {
        anInt15++
        destroy()
    }

    override fun getDocumentBase(): String? {
        anInt30++
        if (WindowShells.instance?.isFullscreen == true) return null
        if (Class93.anApplet1530 != null && this !== Class93.anApplet1530) return Class93.anApplet1530!!.getDocumentBase()
        return getCodeBase()
    }

    open fun method87(i: Byte) = withLock(this) {
        if (i > -11) onRepaintRequested(true)
        anInt7++
        // Delegate canvas teardown + creation to WindowShell so this class has no direct AWT dep.
        WindowShells.instance!!.provideDisplayTarget(
            x = Class348Sub48Statics.anInt7129,
            y = Class335Statics.anInt4167,
            width = Class321Statics.anInt4017,
            height = Class348Sub42Sub8Sub2Statics.anInt10432,
            callbacks = this,
        )
        Class348Sub40Sub16Statics.aBoolean9229 = true
        Class175Statics.aBoolean2329 = true
        Class49Statics.aBoolean4726 = true
        Class203Statics.aBoolean2674 = false
        Class348Sub12Statics.aLong6748 = clockMillis()
    }

    override fun onRepaintRequested(fullSurface: Boolean) = withLock(this) {
        anInt18++
        if (this === AppletRoot.instance && !Class26Statics.aBoolean384) {
            Class49Statics.aBoolean4726 = true
            if (fullSurface && Class367Sub4Statics.aBoolean7320 && -Class348Sub12Statics.aLong6748 + clockMillis() > 1000) {
                Class203Statics.aBoolean2674 = true
            }
        }
    }

    private fun method88(i: Int) {
        anInt2++
        val l = clockMillis()
        val l_2_ = Class348Sub49Statics.aLongArray7206!![Class152Statics.anInt2071]
        Class348Sub49Statics.aLongArray7206!![Class152Statics.anInt2071] = l
        if (l_2_ != 0L && l_2_ < l) {
            val i_3_ = (l - l_2_).toInt()
            Class239Sub5Statics.anInt5891 = (32000 + (i_3_ shr 1)) / i_3_
        }
        Class152Statics.anInt2071 = Class152Statics.anInt2071 - -1 and 0x1f
        if (Class159Statics.anInt2127++ > 50) {
            Class159Statics.anInt2127 -= 50
            Class49Statics.aBoolean4726 = true
            WindowShells.instance!!.repositionCanvas(Class348Sub48Statics.anInt7129, Class335Statics.anInt4167, Class321Statics.anInt4017, Class348Sub42Sub8Sub2Statics.anInt10432)
        }
        method93(-11018)
        if (i > -107) method90(true, true)
    }

    override fun onFocusGained() {
        anInt23++
        Class348Sub40Sub16Statics.aBoolean9229 = true
        Class49Statics.aBoolean4726 = true
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
        withLock(this) {
            if (Class26Statics.aBoolean384) return
            Class26Statics.aBoolean384 = true
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
                RuntimeInfoProvider.instance.quit()
            } catch (throwable: Throwable) {
                /* empty */
            }
            aBoolean17 = false
        }
        Class257Statics.method1945((-128).toByte(), true)
        Class228Statics.method1629(!bool_4_)
        try {
            WindowShells.instance!!.releaseDisplayTarget(this)
        } catch (exception: Exception) {
            /* empty */
        }
        shutdownConnection()
        method91(108.toByte())
        WindowShells.instance!!.shutdown()
        println("Shutdown complete - clean:" + bool)
    }

    abstract fun method91(i: Byte)

    /** Stop the active [Class297] connection on shutdown; overridden in jvmMain [Client]. */
    protected abstract fun shutdownConnection()

    /** Pump the AWT event queue each frame; overridden in jvmMain [Client]. */
    protected abstract fun pumpAwtEventQueue()

    override fun getCodeBase(): String? {
        anInt29++
        if (WindowShells.instance?.isFullscreen == true) return null
        if (Class93.anApplet1530 != null && this !== Class93.anApplet1530) return Class93.anApplet1530!!.getCodeBase()
        return null
    }

    abstract fun init()

    override fun destroy() {
        anInt21++
        if (AppletRoot.instance === this && !Class26Statics.aBoolean384) {
            Class113Statics.aLong1739 = clockMillis()
            Class286_Sub5Statics.method2161(77.toByte(), 5000L)
            shutdownConnection()
            method90(false, false)
        }
    }

    fun run() {
        anInt28++
        do {
            try {
                val runtimeVendor = RuntimeInfoProvider.instance.javaVendor
                val runtimeVersion = RuntimeInfoProvider.instance.javaVersion
                if (runtimeVendor.isNotEmpty()) {
                    val string = runtimeVendor.lowercase()
                    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
                        val string_5_ = runtimeVersion
                        if (string_5_ == "1.1" || string_5_.startsWith("1.1.") || string_5_ == "1.2" || string_5_.startsWith("1.2.")) {
                            method82(-119, "wrongjava")
                            break
                        }
                    } else if (string.indexOf("ibm") != -1 && (runtimeVersion.isEmpty() || runtimeVersion == "1.4.2")) {
                        method82(81, "wrongjava")
                        break
                    }
                }
                if (runtimeVersion.isNotEmpty() && runtimeVersion.startsWith("1.")) {
                    var i = 2
                    var i_6_ = 0
                    while (runtimeVersion.length > i) {
                        val i_7_ = runtimeVersion[i].code
                        if (i_7_ < 48 || i_7_ > 57) break
                        i++
                        i_6_ = 10 * i_6_ - (-i_7_ + 48)
                    }
                    if (i_6_ >= 5) Class367Sub4Statics.aBoolean7320 = true
                }
                // Gate setFocusCycleRoot behind RuntimeInfo so this call site is AWT-free.
                RuntimeInfoProvider.instance.setFocusCycleRoot(AppletRoot.instance)
                aa_Sub3StaticsCommon.method168(103.toByte())
                Class127Sub1Statics.method1119(false)
                method87((-97).toByte())
                method92(28740)
                Class348_Sub8.aClass241_6660 = Class229.method1631(false)
                GameLoops.run(::runFrame)
            } catch (throwable: Throwable) {
                Class156Statics.method1242(method81(109.toByte()), throwable, 15004)
                method82(123, "crash")
            } finally {
                method90(true, false)
            }
        } while (false)
    }

    /**
     * One iteration of the client frame loop, extracted from run() behind the
     * GameLoop seam. Returns false when the shutdown deadline has passed (the
     * original `while` guard), true to continue.
     */
    private fun runFrame(): Boolean {
        if (!(Class113Statics.aLong1739 == 0L || (clockMillis() < Class113Statics.aLong1739))) return false
        Class101Sub2Statics.anInt5744 = Class241Statics.method1861(0, Class73Statics.aLong4783)
        var i = 0
        while (Class101Sub2Statics.anInt5744 > i) {
            method84(-1)
            i++
        }
        method88(-119)
        pumpAwtEventQueue()
        return true
    }

    abstract fun method92(i: Int)

    abstract fun method93(i: Int)

    abstract fun method95(i: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, string: String?, i_19_: Int)

    abstract fun method96(i: Int, i_20_: Int, bool: Boolean, i_21_: Int, i_22_: Int, string: String?, i_23_: Int, i_24_: Int)

    fun method97(i: Int): Boolean {
        if (i != -1) method88(-104)
        anInt4++
        return Class348Sub40Sub19Statics.method3098(-30282, "jaclib")
    }

    fun start() {
        anInt36++
        if (this === AppletRoot.instance && !Class26Statics.aBoolean384) Class113Statics.aLong1739 = 0L
    }

    abstract fun method99(i: Byte)

    fun method100(i: Int): Boolean {
        anInt10++
        if (i != 10) return true
        return Class348Sub40Sub19Statics.method3098(-30282, "jagtheora")
    }

    companion object {
        var anInt1: Int = 0
        var anInt2: Int = 0
        var anInt3: Int = 0
        var anInt4: Int = 0
        var anInt5: Int = 0
        var anInt6: Int = 0
        var anInt7: Int = 0
        var anInt8: Int = 0
        var anInt9: Int = 0
        var anInt10: Int = 0
        var anInt11: Int = 0
        var anInt12: Int = 0
        var anInt13: Int = 0
        var anInt14: Int = 0
        var anInt15: Int = 0
        var anInt16: Int = 0
        var anInt18: Int = 0
        var anInt19: Int = 0
        var aClass324_20: Class324Base? = null
        var anInt21: Int = 0
        var anInt22: Int = 0
        var anInt23: Int = 0
        var anInt24: Int = 0
        var anInt25: Int = 0
        var anInt26: Int = 0
        var anInt28: Int = 0
        var anInt29: Int = 0
        var anInt30: Int = 0
        var anInt31: Int = 0
        var anInt32: Int = 0
        var anInt33: Int = 0
        var anInt34: Int = 0
        var anInt35: Int = 0
        var anInt36: Int = 0
        var anInt37: Int = 0
        var anIntArray38: IntArray? = null
        var anInt39: Int = 0
        var anInt40: Int = 0
        var aBoolean41: Boolean = false
    }
}
