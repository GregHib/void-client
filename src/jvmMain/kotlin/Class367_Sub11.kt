import Class239.Companion.method1713
import Class286_Sub5.Companion.method2158
import Class299_Sub1_Sub1.Companion.method2260
import jaggl.OpenGL.Companion.glBindProgramARB
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glProgramLocalParameter4fARB
import za_Sub2.Companion.method3442
import java.awt.Container

class Class367_Sub11 internal constructor(class377: Class377, class45: Class45?) : Class367(class377) {
    private var anInterface18_Impl3_7390: Interface18_Impl3? = null
    private val aBoolean7391: Boolean
    private var aClass193_7392: Class193? = null
    private var aClass193_7395: Class193? = null
    private var aBoolean7399 = false
    private var aClass193_7404: Class193? = null
    private var aBoolean7406 = false
    private var aClass193_7407: Class193? = null
    private var aBoolean7411 = false
    private val aFloatArray7413 = FloatArray(4)
    override fun method3528(i: Int) {
        if (i <= 45) method3557(true)
        anInt7401++
        val i_0_ = this.aHa_Sub3_4479.method3941(102)
        val class101_sub2 = this.aHa_Sub3_4479.method3887(98.toByte())
        if (!aBoolean7411) glBindProgramARB(34336, (if (i_0_ != 2147483647) aClass193_7404!!.anInt2584 else aClass193_7395!!.anInt2584))
        else glBindProgramARB(34336, (if (i_0_ == 2147483647) aClass193_7392!!.anInt2584 else aClass193_7407!!.anInt2584))
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
        this.aHa_Sub3_4479.method3874(Class167.aClass229_2207, 116, Class167.aClass229_2207)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
        this.aHa_Sub3_4479.method3849(47.toByte(), 2, Class348_Sub40_Sub39.aClass70_9485)
        this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
        this.aHa_Sub3_4479.method3897(0, -4382)
        if (aBoolean7399) {
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
            this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
            aBoolean7399 = false
        }
        if (i.toInt() != 87) aClass32_7415 = null
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
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
                this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
                aBoolean7399 = false
            }
            this.aHa_Sub3_4479.method3850((-122).toByte(), interface18)
            this.aHa_Sub3_4479.method3923(true, i)
        } else if (!aBoolean7399) {
            this.aHa_Sub3_4479.method3850(99.toByte(), (this.aHa_Sub3_4479.anInterface18_8147))
            this.aHa_Sub3_4479.method3923(true, 1)
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class318_Sub1_Sub2.aClass70_8737)
            this.aHa_Sub3_4479.method3885(0, true, Class318_Sub1_Sub2.aClass70_8737)
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
            if (class45 != null && class377!!.aBoolean9923) {
                aClass193_7395 = method3442(34336, class45.method391("gl", "uw_ground_unlit", -29832), class377, 4)
                aClass193_7392 = method3442(34336, class45.method391("gl", "uw_ground_lit", -29832), class377, 4)
                aClass193_7404 = method3442(34336, class45.method391("gl", "uw_model_unlit", -29832), class377, 4)
                aClass193_7407 = method3442(34336, class45.method391("gl", "uw_model_lit", -29832), class377, 4)
                if ((aClass193_7395 != null) and (aClass193_7392 != null) and (aClass193_7404 != null) and (aClass193_7407 != null)) {
                    anInterface18_Impl3_7390 = this.aHa_Sub3_4479.method3839(1, 2, -15137, false, (intArrayOf(0, -1)))
                    anInterface18_Impl3_7390!!.method66(false, false, 25688)
                    aBoolean7391 = true
                } else aBoolean7391 = false
            } else aBoolean7391 = false
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("or.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3525(i: Int, bool: Boolean) {
        anInt7400++
        aBoolean7411 = bool
        this.aHa_Sub3_4479.method3897(1, i xor 0x2a45.inv())
        this.aHa_Sub3_4479.method3850((-32).toByte(), anInterface18_Impl3_7390)
        this.aHa_Sub3_4479.method3874((Class328_Sub3.aClass229_6519), 109, Class248.aClass229_3196)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class348_Sub40_Sub39.aClass70_9485)
        if (i == 15192) {
            this.aHa_Sub3_4479.method3924(true, false, 2, Class342.aClass70_4247, false)
            this.aHa_Sub3_4479.method3885(0, true, Class318_Sub1_Sub2.aClass70_8737)
            this.aHa_Sub3_4479.method3897(0, i + -19574)
            method3528(75)
        }
    }

    override fun method3521(bool: Boolean, i: Byte) {
        anInt7393++
        if (i.toInt() != -103) aClass193_7392 = null
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
        var aClass114_7398: Class114? = Class114(16, 6)
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
        var aClass32_7415: Class32? = Class32(8)

        @JvmStatic
        fun method3555(class45: Class45?, i: Int, bool: Boolean, l: Long, i_7_: Int, i_8_: Int, i_9_: Int) {
            try {
                anInt7410++
                method2260(i_9_, i_8_, l, 0, bool, class45, 126.toByte(), i_7_)
                val i_10_ = -35 / ((-41 - i) / 38)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("or.Q(" + (if (class45 != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + l + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
            }
        }

        @JvmStatic
        fun method3556(bool: Boolean) {
            anInt7405++
            if (bool == false) {
                synchronized(Class79.aClient1367!!) {
                    if (Class34.aFrame476 == null) {
                        val container: Container
                        if (Class52.aFrame4904 != null) container = Class52.aFrame4904!!
                        else if (Class93.anApplet1530 == null) container = Class348_Sub40_Sub9.anApplet_Sub1_9169!!
                        else container = Class93.anApplet1530!! as Container
                        Class272.anInt3473 = container.getSize().width
                        Class348_Sub22.anInt6857 = container.getSize().height
                        if (Class52.aFrame4904 === container) {
                            val insets = Class52.aFrame4904!!.getInsets()
                            Class272.anInt3473 -= insets.left - -insets.right
                            Class348_Sub22.anInt6857 -= insets.bottom + insets.top
                        }
                        if (Class348_Sub42_Sub12.method3229(-86) == 1) {
                            Class321.anInt4017 = Class92.anInt1524
                            Class335.anInt4167 = 0
                            Class348_Sub48.anInt7129 = (Class272.anInt3473 - Class92.anInt1524) / 2
                            Class348_Sub42_Sub8_Sub2.anInt10432 = ha_Sub2.anInt7666
                        } else method2158(56.toByte())
                        if (Class55_Sub1.aClass364_5271 != Class8.aClass364_165) {
                            if (Class321.anInt4017 < 1024 && Class348_Sub42_Sub8_Sub2.anInt10432 < 768) {
                                /* empty */
                            }
                        }
                        Class305.aCanvas3869!!.setSize(Class321.anInt4017, (Class348_Sub42_Sub8_Sub2.anInt10432))
                        if (Class348_Sub8.aHa6654 != null) {
                            if (Class59_Sub1.aBoolean5300) s.method3980(120, Class305.aCanvas3869!!)
                            else Class348_Sub8.aHa6654!!.method3669(Class305.aCanvas3869, Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432)
                        }
                        if (Class52.aFrame4904 === container) {
                            val insets = Class52.aFrame4904!!.getInsets()
                            Class305.aCanvas3869!!.setLocation(insets.left - -Class348_Sub48.anInt7129, Class335.anInt4167 + insets.top)
                        } else Class305.aCanvas3869!!.setLocation((Class348_Sub48.anInt7129), Class335.anInt4167)
                        if (r.anInt9721 != -1) method1713(true, 520)
                        Class140.method1170((-78).toByte())
                    } else {
                        /* empty */
                    }
                }
            }
        }

        @JvmStatic
        fun method3557(bool: Boolean) {
            anIntArray7397 = null
            aClass32_7415 = null
            if (bool == true) {
                aClass114_7398 = null
                aByteArray7394 = null
            }
        }
    }
}
