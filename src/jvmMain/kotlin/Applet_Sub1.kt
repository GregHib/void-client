import jagex3.jagmisc.jagmisc.quit

abstract class Applet_Sub1 : GameApplet, AppletWindowCallbacks {
    private var aBoolean17 = false
    private var aBoolean27 = false
    abstract fun method80(i: Int)

    fun stop() {
        anInt24++
        if (this === Class348_Sub40_Sub9.anApplet_Sub1_9169 && !Class26.aBoolean384) Class113.aLong1739 = Class62.method599(-73) - -4000L
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
                Class224.method1617(125.toByte(), Class93.anApplet1530, "loggedout")
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
        return Class348_Sub40_Sub19.method3098(-30282, "jagmisc")
    }

    override fun onFocusLost() {
        anInt9++
        Class348_Sub40_Sub16.aBoolean9229 = false
    }

    private fun method84(i: Int) {
        anInt8++
        val l = Class62.method599(i + -88)
        val l_1_ = Class328_Sub2_Sub1.aLongArray8800!![Class244.anInt4613]
        Class328_Sub2_Sub1.aLongArray8800!![Class244.anInt4613] = l
        Class244.anInt4613 = 0x1f and 1 + Class244.anInt4613
        if (l_1_ != 0L && l > l_1_) {
            /* empty */
        }
        withLock(this) {
            Class175.aBoolean2329 = Class348_Sub40_Sub16.aBoolean9229
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

    @Synchronized
    open fun method87(i: Byte) {
        if (i > -11) onRepaintRequested(true)
        anInt7++
        // Delegate canvas teardown + creation to WindowShell so this class has no direct AWT dep.
        AwtWindowShell.instance!!.provideDisplayTarget(
            x = Class348_Sub48.anInt7129,
            y = Class335.anInt4167,
            width = Class321.anInt4017,
            height = Class348_Sub42_Sub8_Sub2.anInt10432,
            callbacks = this,
        )
        Class348_Sub40_Sub16.aBoolean9229 = true
        Class175.aBoolean2329 = true
        Class49.aBoolean4726 = true
        Class203.aBoolean2674 = false
        Class348_Sub12.aLong6748 = Class62.method599(-106)
    }

    @Synchronized
    override fun onRepaintRequested(fullSurface: Boolean) {
        anInt18++
        if (this === Class348_Sub40_Sub9.anApplet_Sub1_9169 && !Class26.aBoolean384) {
            Class49.aBoolean4726 = true
            if (fullSurface && Class367_Sub4.aBoolean7320 && -Class348_Sub12.aLong6748 + Class62.method599(-57) > 1000) {
                Class203.aBoolean2674 = true
            }
        }
    }

    private fun method88(i: Int) {
        anInt2++
        val l = Class62.method599(-119)
        val l_2_ = Class348_Sub49.aLongArray7206!![Class152.anInt2071]
        Class348_Sub49.aLongArray7206!![Class152.anInt2071] = l
        if (l_2_ != 0L && l_2_ < l) {
            val i_3_ = (l - l_2_).toInt()
            Class239_Sub5.anInt5891 = (32000 + (i_3_ shr 1)) / i_3_
        }
        Class152.anInt2071 = Class152.anInt2071 - -1 and 0x1f
        if (Class159.anInt2127++ > 50) {
            Class159.anInt2127 -= 50
            Class49.aBoolean4726 = true
            AwtWindowShell.instance!!.repositionCanvas(Class348_Sub48.anInt7129, Class335.anInt4167, Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432)
        }
        method93(-11018)
        if (i > -107) method90(true, true)
    }

    override fun onFocusGained() {
        anInt23++
        Class348_Sub40_Sub16.aBoolean9229 = true
        Class49.aBoolean4726 = true
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
            if (Class26.aBoolean384) return
            Class26.aBoolean384 = true
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
        Class257.method1945((-128).toByte(), true)
        Class228.method1629(!bool_4_)
        try {
            AwtWindowShell.instance!!.releaseDisplayTarget(this)
        } catch (exception: Exception) {
            /* empty */
        }
        if (Class348_Sub23_Sub1.aClass297_8992 != null) {
            try {
                Class348_Sub23_Sub1.aClass297_8992!!.method2234(103.toByte())
            } catch (exception: Exception) {
                /* empty */
            }
        }
        method91(108.toByte())
        AwtWindowShell.instance!!.shutdown()
        println("Shutdown complete - clean:" + bool)
    }

    abstract fun method91(i: Byte)

    override fun getCodeBase(): String? {
        anInt29++
        if (WindowShells.instance?.isFullscreen == true) return null
        if (Class93.anApplet1530 != null && this !== Class93.anApplet1530) return Class93.anApplet1530!!.getCodeBase()
        return null
    }

    abstract fun init()

    override fun destroy() {
        anInt21++
        if (Class348_Sub40_Sub9.anApplet_Sub1_9169 === this && !Class26.aBoolean384) {
            Class113.aLong1739 = Class62.method599(-108)
            Class286_Sub5.method2161(77.toByte(), 5000L)
            Class231.aClass297_2993 = null
            method90(false, false)
        }
    }

    fun run() {
        anInt28++
        do {
            try {
                if (Class297.aString3782 != null) {
                    val string = Class297.aString3782!!.lowercase()
                    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
                        val string_5_ = Class297.aString3796!!
                        if (string_5_ == "1.1" || string_5_.startsWith("1.1.") || string_5_ == "1.2" || string_5_.startsWith("1.2.")) {
                            method82(-119, "wrongjava")
                            break
                        }
                    } else if (string.indexOf("ibm") != -1 && (Class297.aString3796 == null || Class297.aString3796 == "1.4.2")) {
                        method82(81, "wrongjava")
                        break
                    }
                }
                if (Class297.aString3796 != null && Class297.aString3796!!.startsWith("1.")) {
                    var i = 2
                    var i_6_ = 0
                    while (Class297.aString3796!!.length > i) {
                        val i_7_ = Class297.aString3796!!.get(i).code
                        if (i_7_ < 48 || i_7_ > 57) break
                        i++
                        i_6_ = 10 * i_6_ - (-i_7_ + 48)
                    }
                    if (i_6_ >= 5) Class367_Sub4.aBoolean7320 = true
                }
                RuntimeInfoProvider.instance = JvmRuntimeInfo()
                // Gate setFocusCycleRoot behind RuntimeInfo so this call site is AWT-free.
                RuntimeInfoProvider.instance.setFocusCycleRoot(Class348_Sub40_Sub9.anApplet_Sub1_9169)
                aa_Sub3Statics.method168(103.toByte())
                Class127_Sub1.method1119(false)
                method87((-97).toByte())
                method92(28740)
                Class348_Sub8.aClass241_6660 = Class229.method1631(false)
                GameLoops.run(::runFrame)
            } catch (throwable: Throwable) {
                Class156.method1242(method81(109.toByte()), throwable, 15004)
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
        if (!(Class113.aLong1739 == 0L || (Class62.method599(-124) < Class113.aLong1739))) return false
        Class101_Sub2.anInt5744 = Class241Statics.method1861(0, Class73.aLong4783)
        var i = 0
        while (Class101_Sub2.anInt5744 > i) {
            method84(-1)
            i++
        }
        method88(-119)
        Class369_Sub3_Sub1Statics.method3578((-42).toByte(), WindowShells.instance?.currentDisplayTarget, (Class348_Sub23_Sub1.aClass297_8992))
        return true
    }

    abstract fun method92(i: Int)

    abstract fun method93(i: Int)

    fun method95(i: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, string: String?, i_19_: Int) {
        anInt25++
        try {
            if (Class348_Sub40_Sub9.anApplet_Sub1_9169 == null) {
                Class348_Sub48.anInt7129 = 0
                Class348_Sub42_Sub8_Sub2.anInt10432 = i_16_
                Class348_Sub22Statics.anInt6857 = Class348_Sub42_Sub8_Sub2.anInt10432
                Class321.anInt4017 = i
                Class272Statics.anInt3473 = Class321.anInt4017
                Class335.anInt4167 = 0
                Class348_Sub1_Sub3.anInt8818 = i_15_
                Class348_Sub40_Sub9.anApplet_Sub1_9169 = this
                Class348_Sub8.anApplet6662 = Class93.anApplet1530
                Class348_Sub23_Sub1.aClass297_8992 = Class297(i_17_, string, i_18_, Class93.anApplet1530 != null)
                Class231.aClass297_2993 = Class348_Sub23_Sub1.aClass297_8992
                val class144 = Class348_Sub23_Sub1.aClass297_8992!!.method2236(Runnable { run() }, -10240, 1)
                if (i_19_ != 50) anInt37 = -13
                while (class144.anInt1997 == 0) Class286_Sub5.method2161((-126).toByte(), 10L)
            } else {
                Class348_Sub51.anInt7252++
                if (Class348_Sub51.anInt7252 >= 3) method82(112, "alreadyloaded")
                else showDocument(getDocumentBase(), "_self")
            }
        } catch (throwable: Throwable) {
            Class156.method1242(null, throwable, 15004)
            method82(52, "crash")
        }
    }

    fun method96(i: Int, i_20_: Int, bool: Boolean, i_21_: Int, i_22_: Int, string: String?, i_23_: Int, i_24_: Int) {
        try {
            if (i_23_ != 23499) return
            Class321.anInt4017 = i_20_
            Class272Statics.anInt3473 = Class321.anInt4017
            Class348_Sub42_Sub8_Sub2.anInt10432 = i_24_
            Class348_Sub22Statics.anInt6857 = Class348_Sub42_Sub8_Sub2.anInt10432
            Class348_Sub40_Sub9.anApplet_Sub1_9169 = this
            Class335.anInt4167 = 0
            Class348_Sub48.anInt7129 = 0
            Class348_Sub1_Sub3.anInt8818 = i_21_
            Class348_Sub8.anApplet6662 = null
            AwtWindowShell.instance!!.createFrame(Class272Statics.anInt3473, Class348_Sub22Statics.anInt6857, this)
            Class348_Sub23_Sub1.aClass297_8992 = Class297(i, string, i_22_, true)
            Class231.aClass297_2993 = Class348_Sub23_Sub1.aClass297_8992
            val class144 = Class348_Sub23_Sub1.aClass297_8992!!.method2236(Runnable { run() }, i_23_ + -33739, 1)
            while (class144.anInt1997 == 0) Class286_Sub5.method2161(21.toByte(), 10L)
        } catch (exception: Exception) {
            Class156.method1242(null, exception, i_23_ + -8495)
        }
        anInt31++
    }

    fun method97(i: Int): Boolean {
        if (i != -1) method88(-104)
        anInt4++
        return Class348_Sub40_Sub19.method3098(-30282, "jaclib")
    }

    fun start() {
        anInt36++
        if (this === Class348_Sub40_Sub9.anApplet_Sub1_9169 && !Class26.aBoolean384) Class113.aLong1739 = 0L
    }

    abstract fun method99(i: Byte)

    fun method100(i: Int): Boolean {
        anInt10++
        if (i != 10) return true
        return Class348_Sub40_Sub19.method3098(-30282, "jagtheora")
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
        var aClass324_20: Class324? = null
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
