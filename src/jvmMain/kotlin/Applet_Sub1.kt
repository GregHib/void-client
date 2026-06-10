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

abstract class Applet_Sub1 : Panel(), GameApplet, Runnable, FocusListener, WindowListener {
    private var aBoolean17 = false
    private var aBoolean27 = false
    abstract fun method80(i: Int)

    fun stop() {
        anInt24++
        if (this === Class348_Sub40_Sub9.anApplet_Sub1_9169 && !Class26.aBoolean384) Class113.aLong1739 = Class62.method599(-73) - -4000L
    }

    override fun getParameter(string: String?): String? {
        anInt3++
        if (Class52.aFrame4904 != null) return null
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
        return Class348_Sub40_Sub19.method3098(-30282, "jagmisc")
    }

    override fun focusLost(focusevent: FocusEvent?) {
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
        synchronized(this) {
            Class175.aBoolean2329 = Class348_Sub40_Sub16.aBoolean9229
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
        if (Class52.aFrame4904 != null) return null
        if (Class93.anApplet1530 != null && this !== Class93.anApplet1530) return Class93.anApplet1530!!.getDocumentBase()
        return getCodeBase()
    }

    override fun windowDeactivated(windowevent: WindowEvent?) {
        anInt12++
    }

    @Synchronized
    open fun method87(i: Byte) {
        if (i > -11) paint(null)
        if (Class305.aCanvas3869 != null) {
            Class305.aCanvas3869!!.removeFocusListener(this)
            Class305.aCanvas3869!!.getParent().setBackground(Color.black)
            Class305.aCanvas3869!!.getParent().remove(Class305.aCanvas3869)
        }
        anInt7++
        val container: Container
        if (Class34.aFrame476 == null) {
            if (Class52.aFrame4904 == null) {
                if (Class93.anApplet1530 == null) container = Class348_Sub40_Sub9.anApplet_Sub1_9169!!
                else container = Class93.anApplet1530!!.getPulseComponent() as Container
            } else container = Class52.aFrame4904 as Container
        } else container = Class34.aFrame476 as Container
        container.setLayout(null)
        Class305.aCanvas3869 = Canvas_Sub1(this)
        container.add(Class305.aCanvas3869)
        Class305.aCanvas3869!!.setSize(Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432)
        Class305.aCanvas3869!!.setVisible(true)
        if (container === Class52.aFrame4904) {
            val insets = (Class52.aFrame4904 as Container).getInsets()
            Class305.aCanvas3869!!.setLocation((insets.left + Class348_Sub48.anInt7129), insets.top - -Class335.anInt4167)
        } else Class305.aCanvas3869!!.setLocation(Class348_Sub48.anInt7129, Class335.anInt4167)
        Class305.aCanvas3869!!.addFocusListener(this)
        Class305.aCanvas3869!!.requestFocus()
        Class348_Sub40_Sub16.aBoolean9229 = true
        Class175.aBoolean2329 = true
        Class49.aBoolean4726 = true
        Class203.aBoolean2674 = false
        Class348_Sub12.aLong6748 = Class62.method599(-106)
    }

    override fun windowOpened(windowevent: WindowEvent?) {
        anInt39++
    }

    @Synchronized
    override fun paint(graphics: Graphics?) {
        anInt18++
        if (this === Class348_Sub40_Sub9.anApplet_Sub1_9169 && !Class26.aBoolean384) {
            Class49.aBoolean4726 = true
            if (Class367_Sub4.aBoolean7320 && -Class348_Sub12.aLong6748 + Class62.method599(-57) > 1000) {
                val rectangle = graphics?.getClipBounds()
                if (rectangle == null || (rectangle.width >= Class272.anInt3473 && (Class348_Sub22.anInt6857 <= rectangle.height))) Class203.aBoolean2674 = true
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
            Class305.aCanvas3869!!.setSize(Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432)
            Class305.aCanvas3869!!.setVisible(true)
            if (Class52.aFrame4904 != null && Class34.aFrame476 == null) {
                val insets = Class52.aFrame4904!!.getInsets()
                Class305.aCanvas3869!!.setLocation((insets.left - -Class348_Sub48.anInt7129), (insets.top + Class335.anInt4167))
            } else Class305.aCanvas3869!!.setLocation(Class348_Sub48.anInt7129, Class335.anInt4167)
        }
        method93(-11018)
        if (i > -107) method90(true, true)
    }

    override fun windowDeiconified(windowevent: WindowEvent?) {
        anInt35++
    }

    override fun focusGained(focusevent: FocusEvent?) {
        anInt23++
        Class348_Sub40_Sub16.aBoolean9229 = true
        Class49.aBoolean4726 = true
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
        if (Class305.aCanvas3869 != null) {
            try {
                Class305.aCanvas3869!!.removeFocusListener(this)
                Class305.aCanvas3869!!.getParent().remove(Class305.aCanvas3869!!)
            } catch (exception: Exception) {
                /* empty */
            }
        }
        if (Class348_Sub23_Sub1.aClass297_8992 != null) {
            try {
                Class348_Sub23_Sub1.aClass297_8992!!.method2234(103.toByte())
            } catch (exception: Exception) {
                /* empty */
            }
        }
        method91(108.toByte())
        if (Class52.aFrame4904 != null) {
            Class52.aFrame4904!!.setVisible(false)
            Class52.aFrame4904!!.dispose()
            Class52.aFrame4904 = null
        }
        println("Shutdown complete - clean:" + bool)
    }

    abstract fun method91(i: Byte)

    override fun getCodeBase(): URL? {
        anInt29++
        if (Class52.aFrame4904 != null) return null
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

    override fun run() {
        anInt28++
        do {
            try {
                if (Class297.aString3782 != null) {
                    val string = Class297.aString3782!!.lowercase(Locale.getDefault())
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
                var applet: Panel? = Class348_Sub40_Sub9.anApplet_Sub1_9169
                if (Class93.anApplet1530 != null) {
                    val container = Class93.anApplet1530!!.getPulseComponent() as? Container
                    if (container != null) {
                        applet = container as Panel
                    }
                }
                val method = Class297.aMethod3786
                if (method != null) {
                    try {
                        method.invoke(applet, java.lang.Boolean.TRUE)
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                }
                aa_Sub3.method168(103.toByte())
                Class127_Sub1.method1119(false)
                method87((-97).toByte())
                method92(28740)
                Class348_Sub8.aClass241_6660 = Class229.method1631(false)
                while (Class113.aLong1739 == 0L || (Class62.method599(-124) < Class113.aLong1739)) {
                    Class101_Sub2.anInt5744 = Class348_Sub8.aClass241_6660!!.method1861(0, Class73.aLong4783)
                    var i = 0
                    while (Class101_Sub2.anInt5744 > i) {
                        method84(-1)
                        i++
                    }
                    method88(-119)
                    Class369_Sub3_Sub1.method3578((-42).toByte(), Class305.aCanvas3869, (Class348_Sub23_Sub1.aClass297_8992))
                }
            } catch (throwable: Throwable) {
                Class156.method1242(method81(109.toByte()), throwable, 15004)
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
            if (Class348_Sub40_Sub9.anApplet_Sub1_9169 == null) {
                Class348_Sub48.anInt7129 = 0
                Class348_Sub42_Sub8_Sub2.anInt10432 = i_16_
                Class348_Sub22.anInt6857 = Class348_Sub42_Sub8_Sub2.anInt10432
                Class321.anInt4017 = i
                Class272.anInt3473 = Class321.anInt4017
                Class335.anInt4167 = 0
                Class348_Sub1_Sub3.anInt8818 = i_15_
                Class348_Sub40_Sub9.anApplet_Sub1_9169 = this
                Class348_Sub8.anApplet6662 = Class93.anApplet1530
                Class348_Sub23_Sub1.aClass297_8992 = Class297(i_17_, string, i_18_, Class93.anApplet1530 != null)
                Class231.aClass297_2993 = Class348_Sub23_Sub1.aClass297_8992
                val class144 = Class348_Sub23_Sub1.aClass297_8992!!.method2236(this, -10240, 1)
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
            Class272.anInt3473 = Class321.anInt4017
            Class348_Sub42_Sub8_Sub2.anInt10432 = i_24_
            Class348_Sub22.anInt6857 = Class348_Sub42_Sub8_Sub2.anInt10432
            Class348_Sub40_Sub9.anApplet_Sub1_9169 = this
            Class335.anInt4167 = 0
            Class348_Sub48.anInt7129 = 0
            Class348_Sub1_Sub3.anInt8818 = i_21_
            Class348_Sub8.anApplet6662 = null
            Class52.aFrame4904 = Frame()
            Class52.aFrame4904!!.setTitle("Jagex")
            Class52.aFrame4904!!.setResizable(true)
            Class52.aFrame4904!!.addWindowListener(this)
            Class52.aFrame4904!!.setVisible(true)
            Class52.aFrame4904!!.toFront()
            val insets = Class52.aFrame4904!!.getInsets()
            Class52.aFrame4904!!.setSize(insets.right + (insets.left + Class272.anInt3473), (insets.bottom + (Class348_Sub22.anInt6857 + insets.top)))
            Class348_Sub23_Sub1.aClass297_8992 = Class297(i, string, i_22_, true)
            Class231.aClass297_2993 = Class348_Sub23_Sub1.aClass297_8992
            val class144 = Class348_Sub23_Sub1.aClass297_8992!!.method2236(this, i_23_ + -33739, 1)
            while (class144.anInt1997 == 0) Class286_Sub5.method2161(21.toByte(), 10L)
        } catch (exception: Exception) {
            Class156.method1242(null, exception, i_23_ + -8495)
        }
        anInt31++
    }

    override fun windowIconified(windowevent: WindowEvent?) {
        anInt14++
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
        var aClass324_20: Class324? = null
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
        fun method85(i: Int, class45: Class45?) {
            anInt32++
            Class369_Sub3.aClass45_8601 = class45
            if (i != 0) anInt37 = 101
        }

        @JvmStatic
        fun method86(string: String?, i: Int): Boolean {
            anInt13++
            if (i != 0) return true
            return Class275.aHashtable3548!!.containsKey(string)
        }

        @JvmStatic
        fun provideLoaderApplet(applet: GameApplet) {
            anInt11++
            Class93.anApplet1530 = applet
        }

        @JvmStatic
        fun set(string: String) {
            Class363.aString4461 = string
            Class348_Sub38.anInt7006 = string.length
        }

        @JvmStatic
        fun method94(string: String, i: Int) {
            anInt6++
            if (Class286_Sub1.aStringArray6200 == null) Class14_Sub3.method249(2)
            Class286_Sub3.aCalendar6221!!.setTime(Date(Class62.method599(-102)))
            val i_8_ = Class286_Sub3.aCalendar6221!!.get(11)
            val i_9_ = Class286_Sub3.aCalendar6221!!.get(12)
            val i_10_ = Class286_Sub3.aCalendar6221!!.get(13)
            val string_11_ = ((i_8_ / 10).toString() + i_8_ % 10 + ":" + i_9_ / 10 + i_9_ % 10 + ":" + i_10_ / 10 + i_10_ % 10)
            val strings = Class348_Sub40_Sub23.method3113('\n', true, string)
            for (i_12_ in strings.indices) {
                for (i_13_ in Class369_Sub2.anInt8587 downTo 1) Class286_Sub1.aStringArray6200!![i_13_] = Class286_Sub1.aStringArray6200!![-1 + i_13_]
                Class286_Sub1.aStringArray6200!![0] = string_11_ + ": " + strings[i_12_]
                if (Class299_Sub1.aFileOutputStream6323 != null) {
                    try {
                        Class299_Sub1.aFileOutputStream6323!!.write(Class348_Sub24.method2992(((Class286_Sub1.aStringArray6200!![0]) + "\n"), (-20).toByte()))
                    } catch (ioexception: IOException) {
                        /* empty */
                    }
                }
                if (-1 + Class286_Sub1.aStringArray6200!!.size > Class369_Sub2.anInt8587) {
                    Class369_Sub2.anInt8587++
                    if (Class284.anInt3676 > 0) Class284.anInt3676++
                }
            }
        }

        @JvmStatic
        fun method98(i: Int) {
            anIntArray38 = null
            aClass324_20 = null
            if (i != 32717) method86(null, 65)
        }
    }
}
