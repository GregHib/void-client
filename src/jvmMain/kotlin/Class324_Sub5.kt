import Class371.Companion.method3583
import jaggl.OpenGL.Companion.glBegin
import jaggl.OpenGL.Companion.glColor4ub
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glEnd
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glTexCoord2f
import jaggl.OpenGL.Companion.glTexGenfv
import jaggl.OpenGL.Companion.glTexGeni
import jaggl.OpenGL.Companion.glTranslatef
import jaggl.OpenGL.Companion.glVertex2i

class Class324_Sub5 internal constructor(private val aHa_Sub2_6509: ha_Sub2, class143: Class143?, class207s: Array<Class207>, bool: Boolean) : Class324(aHa_Sub2_6509, class143) {
    private val aClass61_6510: Class61
    private val aClass258_Sub3_Sub1_6511: Class258_Sub3_Sub1?
    private val aBoolean6512: Boolean

    init {
        var i = 0
        for (i_0_ in 0..255) {
            val class207 = class207s[i_0_]!!
            if (class207.anInt2696 > i) i = class207.anInt2696
            if (class207.anInt2702 > i) i = class207.anInt2702
        }
        val i_1_ = i * 16
        if (bool) {
            val `is` = ByteArray(i_1_ * i_1_)
            for (i_2_ in 0..255) {
                val class207 = class207s[i_2_]!!
                val i_3_ = class207.anInt2696
                val i_4_ = class207.anInt2702
                val i_5_ = i_2_ % 16 * i
                val i_6_ = i_2_ / 16 * i
                var i_7_ = i_6_ * i_1_ + i_5_
                var i_8_ = 0
                if (class207.aByteArray2695 == null) {
                    val is_9_ = class207.aByteArray2699
                    for (i_10_ in 0..<i_3_) {
                        for (i_11_ in 0..<i_4_) `is`[i_7_++] = (if (is_9_[i_8_++].toInt() == 0) 0 else -1).toByte()
                        i_7_ += i_1_ - i_4_
                    }
                } else {
                    val is_12_ = class207.aByteArray2695!!
                    for (i_13_ in 0..<i_3_) {
                        for (i_14_ in 0..<i_4_) `is`[i_7_++] = is_12_[i_8_++]
                        i_7_ += i_1_ - i_4_
                    }
                }
            }
            aClass258_Sub3_Sub1_6511 = method3583(false, `is`, 6406, i_1_, aHa_Sub2_6509, -86, 6406, i_1_)
            aBoolean6512 = true
        } else {
            val `is` = IntArray(i_1_ * i_1_)
            for (i_15_ in 0..255) {
                val class207 = class207s[i_15_]!!
                val is_16_ = class207.anIntArray2697
                val is_17_ = class207.aByteArray2695
                val is_18_ = class207.aByteArray2699
                val i_19_ = class207.anInt2696
                val i_20_ = class207.anInt2702
                val i_21_ = i_15_ % 16 * i
                val i_22_ = i_15_ / 16 * i
                var i_23_ = i_22_ * i_1_ + i_21_
                var i_24_ = 0
                if (is_17_ == null) {
                    for (i_27_ in 0..<i_19_) {
                        for (i_28_ in 0..<i_20_) {
                            val i_29_: Int
                            if ((is_18_[i_24_++].also { i_29_ = it.toInt() }).toInt() != 0) `is`[i_23_++] = 0xffffff.inv() or is_16_[i_29_ and 0xff]
                            else i_23_++
                        }
                        i_23_ += i_1_ - i_20_
                    }
                } else {
                    for (i_25_ in 0..<i_19_) {
                        for (i_26_ in 0..<i_20_) {
                            `is`[i_23_++] = (is_17_[i_24_].toInt() shl 24 or is_16_[is_18_[i_24_].toInt() and 0xff])
                            i_24_++
                        }
                        i_23_ += i_1_ - i_20_
                    }
                }
            }
            aClass258_Sub3_Sub1_6511 = Class348_Sub40_Sub32.method3132(`is`, 0, 0, i_1_, i_1_, aHa_Sub2_6509, false, 12.toByte())
            aBoolean6512 = false
        }
        aClass258_Sub3_Sub1_6511!!.method1957(9728, false)
        aClass61_6510 = Class61(aHa_Sub2_6509, 256)
        val f = (aClass258_Sub3_Sub1_6511.aFloat9937 / (aClass258_Sub3_Sub1_6511.anInt9940).toFloat())
        val f_30_ = (aClass258_Sub3_Sub1_6511.aFloat9938 / (aClass258_Sub3_Sub1_6511.anInt9939).toFloat())
        for (i_31_ in 0..255) {
            val class207 = class207s[i_31_]!!
            val i_32_ = class207.anInt2696
            val i_33_ = class207.anInt2702
            val i_34_ = class207.anInt2700
            val i_35_ = class207.anInt2703
            val f_36_ = (i_31_ % 16 * i).toFloat()
            val f_37_ = (i_31_ / 16 * i).toFloat()
            val f_38_ = f_36_ * f
            val f_39_ = f_37_ * f_30_
            val f_40_ = (f_36_ + i_33_.toFloat()) * f
            val f_41_ = (f_37_ + i_32_.toFloat()) * f_30_
            aClass61_6510.method595(123.toByte(), i_31_)
            glBegin(7)
            glTexCoord2f(f_38_, aClass258_Sub3_Sub1_6511.aFloat9938 - f_39_)
            glVertex2i(i_35_, i_34_)
            glTexCoord2f(f_38_, aClass258_Sub3_Sub1_6511.aFloat9938 - f_41_)
            glVertex2i(i_35_, i_34_ + i_32_)
            glTexCoord2f(f_40_, aClass258_Sub3_Sub1_6511.aFloat9938 - f_41_)
            glVertex2i(i_35_ + i_33_, i_34_ + i_32_)
            glTexCoord2f(f_40_, aClass258_Sub3_Sub1_6511.aFloat9938 - f_39_)
            glVertex2i(i_35_ + i_33_, i_34_)
            glEnd()
            aClass61_6510.method591(-1)
        }
    }

    override fun method2578(c: Char, i: Int, i_42_: Int, i_43_: Int, bool: Boolean, var_aa: aa?, i_44_: Int, i_45_: Int) {
        val var_aa_Sub1 = var_aa as aa_Sub1
        val class258_sub3_sub1 = var_aa_Sub1.aClass258_Sub3_Sub1_5193
        aHa_Sub2_6509.method3735(9473)
        aHa_Sub2_6509.method3771((-109).toByte(), aClass258_Sub3_Sub1_6511)
        if (aBoolean6512 || bool) {
            aHa_Sub2_6509.method3729(7681, (-38).toByte(), 8448)
            aHa_Sub2_6509.method3762(34168, 768, (-87).toByte(), 0)
        } else aHa_Sub2_6509.method3729(7681, (-55).toByte(), 7681)
        aHa_Sub2_6509.method3738(-15039, 1)
        aHa_Sub2_6509.method3771((-127).toByte(), class258_sub3_sub1)
        aHa_Sub2_6509.method3729(7681, 97.toByte(), 8448)
        aHa_Sub2_6509.method3762(34168, 768, (-87).toByte(), 0)
        glTexGeni(8192, 9472, 9216)
        glTexGeni(8193, 9472, 9216)
        val f = (class258_sub3_sub1!!.aFloat9937 / class258_sub3_sub1.anInt9940.toFloat())
        val f_46_ = (class258_sub3_sub1.aFloat9938 / class258_sub3_sub1.anInt9939.toFloat())
        glTexGenfv(8192, 9474, floatArrayOf(f, 0.0f, 0.0f, -i_44_.toFloat() * f), 0)
        glTexGenfv(8193, 9474, floatArrayOf(0.0f, f_46_, 0.0f, -i_45_.toFloat() * f_46_), 0)
        glEnable(3168)
        glEnable(3169)
        glColor4ub((i_43_ shr 16).toByte(), (i_43_ shr 8).toByte(), i_43_.toByte(), (i_43_ shr 24).toByte())
        glTranslatef(i.toFloat(), i_42_.toFloat(), 0.0f)
        aClass61_6510.method594(c, 28666)
        glLoadIdentity()
        glDisable(3168)
        glDisable(3169)
        aHa_Sub2_6509.method3762(5890, 768, (-87).toByte(), 0)
        aHa_Sub2_6509.method3729(8448, (-96).toByte(), 8448)
        aHa_Sub2_6509.method3771((-91).toByte(), null)
        aHa_Sub2_6509.method3738(-15039, 0)
        if (aBoolean6512 || bool) aHa_Sub2_6509.method3762(5890, 768, (-87).toByte(), 0)
    }

    override fun fa(c: Char, i: Int, i_47_: Int, i_48_: Int, bool: Boolean) {
        aHa_Sub2_6509.method3735(9473)
        aHa_Sub2_6509.method3771((-96).toByte(), aClass258_Sub3_Sub1_6511)
        if (aBoolean6512 || bool) {
            aHa_Sub2_6509.method3729(7681, 117.toByte(), 8448)
            aHa_Sub2_6509.method3762(34168, 768, (-87).toByte(), 0)
        } else aHa_Sub2_6509.method3729(7681, 117.toByte(), 7681)
        glColor4ub((i_48_ shr 16).toByte(), (i_48_ shr 8).toByte(), i_48_.toByte(), (i_48_ shr 24).toByte())
        glTranslatef(i.toFloat(), i_47_.toFloat(), 0.0f)
        aClass61_6510.method594(c, 28666)
        glLoadIdentity()
        if (aBoolean6512 || bool) aHa_Sub2_6509.method3762(5890, 768, (-87).toByte(), 0)
    }
}
