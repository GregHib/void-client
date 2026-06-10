import java.awt.Component
import java.awt.event.FocusEvent
import java.awt.event.FocusListener
import java.awt.event.KeyEvent
import java.awt.event.KeyListener

class Class346_Sub1 internal constructor(component: Component?) : Class346(), KeyListener, FocusListener {
    private val aClass262_6541 = Class262()
    private var aClass262_6542: Class262? = Class262()
    private var aBooleanArray6543: BooleanArray? = BooleanArray(112)
    private var aComponent6544: Component? = null

    override fun method2697(i: Int): Interface6? {
        if (i != 0) aBooleanArray6543 = null
        anInt6525++
        return aClass262_6541.method1997(8) as Interface6?
    }

    override fun method2696(i: Int, i_0_: Int): Boolean {
        if (i_0_ >= -120) method2700(119.toByte())
        anInt6539++
        if (i < 0 || i >= 112) return false
        return aBooleanArray6543!![i]
    }

    private fun method2700(i: Byte) {
        if (i.toInt() == -104) {
            anInt6533++
            if (aComponent6544 != null) {
                aComponent6544!!.removeKeyListener(this)
                aComponent6544!!.removeFocusListener(this)
                aComponent6544 = null
                for (i_1_ in 0..111) aBooleanArray6543!![i_1_] = false
                aClass262_6541.method1996(116)
                aClass262_6542!!.method1996(i.toInt() xor 0x1b.inv())
            }
        }
    }

    @Synchronized
    override fun keyPressed(keyevent: KeyEvent) {
        anInt6526++
        method2701(keyevent, 0, 0)
    }

    private fun method2701(keyevent: KeyEvent, i: Int, i_2_: Int) {
        anInt6538++
        var i_3_ = keyevent.getKeyCode()
        if (i_3_ != 0) {
            if (i_3_ >= 0 && Class285_Sub2.anIntArray8507!!.size > i_3_) {
                i_3_ = Class285_Sub2.anIntArray8507!![i_3_]
                if (i_2_ == 0 && (i_3_ and 0x80) != 0) i_3_ = 0
                else i_3_ = i_3_ and 0x80.inv()
            } else i_3_ = 0
        } else i_3_ = 0
        if (i != i_3_) {
            method2702(i_3_, 128, '\u0000', i_2_)
            keyevent.consume()
        }
    }

    override fun method2698(i: Int) {
        anInt6530++
        method2700((-104).toByte())
        if (i != 14174) aClass262_6542 = null
    }

    private fun method2702(i: Int, i_4_: Int, c: Char, i_5_: Int) {
        anInt6532++
        val class348_sub11 = Class348_Sub11()
        class348_sub11.anInt4771 = i_5_
        class348_sub11.anInt4767 = i
        class348_sub11.aChar4761 = c
        class348_sub11.aLong4764 = Class62.method599(-102)
        aClass262_6542!!.method1999(class348_sub11, -20180)
        if (i_4_ != 128) aComponent6544 = null
    }

    @Synchronized
    override fun keyReleased(keyevent: KeyEvent) {
        anInt6529++
        method2701(keyevent, 0, 1)
    }

    @Synchronized
    override fun keyTyped(keyevent: KeyEvent) {
        anInt6527++
        val c = keyevent.getKeyChar()
        if (c.code != 0 && Class122.method1089(-125, c)) {
            method2702(-1, 128, c, 3)
            keyevent.consume()
        }
    }

    override fun focusGained(focusevent: FocusEvent?) {
        anInt6540++
    }

    private fun method2704(i: Byte): Int {
        anInt6531++
        var i_9_ = 0
        if (aBooleanArray6543!![81]) i_9_ = i_9_ or 0x1
        if (i.toInt() != 127) return 25
        if (aBooleanArray6543!![82]) i_9_ = i_9_ or 0x4
        if (aBooleanArray6543!![86]) i_9_ = i_9_ or 0x2
        return i_9_
    }

    @Synchronized
    override fun method2695(i: Int) {
        anInt6534++
        aClass262_6541.method1996(110)
        if (i >= 51) {
            var class348_sub11 = aClass262_6542!!.method1997(8) as Class348_Sub11?
            while (class348_sub11 != null) {
                class348_sub11.anInt4766 = method2704(127.toByte())
                if (class348_sub11.anInt4771 == 0) {
                    if (!aBooleanArray6543!![class348_sub11.anInt4767]) {
                        val class348_sub11_10_ = Class348_Sub11()
                        class348_sub11_10_.anInt4767 = class348_sub11.anInt4767
                        class348_sub11_10_.anInt4771 = 0
                        class348_sub11_10_.aChar4761 = '\u0000'
                        class348_sub11_10_.anInt4766 = class348_sub11.anInt4766
                        class348_sub11_10_.aLong4764 = class348_sub11.aLong4764
                        aClass262_6541.method1999(class348_sub11_10_, -20180)
                        aBooleanArray6543!![(class348_sub11.anInt4767)] = true
                    }
                    class348_sub11.anInt4771 = 2
                    aClass262_6541.method1999(class348_sub11, -20180)
                } else if (class348_sub11.anInt4771 != 1) {
                    if (class348_sub11.anInt4771 == -1) {
                        for (i_11_ in 0..111) {
                            if (aBooleanArray6543!![i_11_]) {
                                val class348_sub11_12_ = Class348_Sub11()
                                class348_sub11_12_.aChar4761 = '\u0000'
                                class348_sub11_12_.anInt4767 = i_11_
                                class348_sub11_12_.anInt4766 = (class348_sub11.anInt4766)
                                class348_sub11_12_.anInt4771 = 1
                                class348_sub11_12_.aLong4764 = (class348_sub11.aLong4764)
                                aClass262_6541.method1999(class348_sub11_12_, -20180)
                                aBooleanArray6543!![i_11_] = false
                            }
                        }
                    } else if (class348_sub11.anInt4771 == 3) aClass262_6541.method1999(class348_sub11, -20180)
                } else if (aBooleanArray6543!![class348_sub11.anInt4767]) {
                    aClass262_6541.method1999(class348_sub11, -20180)
                    aBooleanArray6543!![(class348_sub11.anInt4767)] = false
                }
                class348_sub11 = aClass262_6542!!.method1997(8) as Class348_Sub11?
            }
        }
    }

    @Synchronized
    override fun focusLost(focusevent: FocusEvent?) {
        anInt6537++
        method2702(0, 128, '\u0000', -1)
    }

    private fun method2706(component: Component?, i: Int) {
        method2700((-104).toByte())
        if (i != 2) method2705(-19)
        anInt6535++
        aComponent6544 = component
        val method = Class297.aMethod3783
        if (method != null) {
            try {
                method.invoke(aComponent6544, java.lang.Boolean.FALSE)
            } catch (throwable: Throwable) {
                /* empty */
            }
        }
        aComponent6544!!.addKeyListener(this)
        aComponent6544!!.addFocusListener(this)
    }

    init {
        Class348_Sub49_Sub1.method3402((-82).toByte())
        method2706(component, 2)
    }

    companion object {
        @JvmField
        var anInt6525: Int = 0
        @JvmField
        var anInt6526: Int = 0
        @JvmField
        var anInt6527: Int = 0
        @JvmField
        var aClass114_6528: Class114? = Class114(14, 2)
        @JvmField
        var anInt6529: Int = 0
        @JvmField
        var anInt6530: Int = 0
        @JvmField
        var anInt6531: Int = 0
        @JvmField
        var anInt6532: Int = 0
        @JvmField
        var anInt6533: Int = 0
        @JvmField
        var anInt6534: Int = 0
        @JvmField
        var anInt6535: Int = 0
        @JvmField
        var anInt6536: Int = 0
        @JvmField
        var anInt6537: Int = 0
        @JvmField
        var anInt6538: Int = 0
        @JvmField
        var anInt6539: Int = 0
        @JvmField
        var anInt6540: Int = 0
        @JvmStatic
        fun method2703(i: Int, i_6_: Int, i_7_: Int, i_8_: Byte) {
            anInt6536++
            val class190 = Class262.aClass190ArrayArray3335!![i_6_]!![i_7_]
            if (i_8_.toInt() == -13) Class161.method1260(false, i, (if (class190 == null) Class274.aClass190_3547 else class190))
        }

        @JvmStatic
        fun method2705(i: Int) {
            aClass114_6528 = null
            if (i != 14645) method2705(1)
        }
    }
}
