import Class101.Companion.method904
import Class186_Sub1.Companion.method1401
import Class348_Sub40_Sub32.Companion.method3132
import jaggl.OpenGL.Companion.glBegin
import jaggl.OpenGL.Companion.glColor3f
import jaggl.OpenGL.Companion.glColor4ub
import jaggl.OpenGL.Companion.glEnd
import jaggl.OpenGL.Companion.glMultiTexCoord2f
import jaggl.OpenGL.Companion.glPixelTransferf
import jaggl.OpenGL.Companion.glPopMatrix
import jaggl.OpenGL.Companion.glPushMatrix
import jaggl.OpenGL.Companion.glTexCoord2f
import jaggl.OpenGL.Companion.glTranslatef
import jaggl.OpenGL.Companion.glVertex2f
import jaggl.OpenGL.Companion.glVertex2i

class Class105_Sub2 : Class105 {
    private var aBoolean8427: Boolean
    private var anInt8429 = 0
    private val aHa_Sub2_8430: ha_Sub2?
    private var aClass258_Sub3_Sub1_8431: Class258_Sub3_Sub1? = null
    private var anInt8432 = 0
    private val aClass258_Sub3_Sub1_8434: Class258_Sub3_Sub1
    private var anInt8446: Int
    private var anInt8447: Int
    private var anInt8449: Int

    override fun method962(f: Float, f_0_: Float, f_1_: Float, f_2_: Float, f_3_: Float, f_4_: Float, i: Int, i_5_: Int, i_6_: Int, i_7_: Int) {
        var f = f
        var f_0_ = f_0_
        var f_1_ = f_1_
        var f_2_ = f_2_
        var f_3_ = f_3_
        var f_4_ = f_4_
        anInt8435++
        if (aBoolean8427) {
            val f_8_ = method966().toFloat()
            val f_9_ = method980().toFloat()
            val f_10_ = (f_1_ - f) / f_8_
            val f_11_ = (f_2_ - f_0_) / f_8_
            val f_12_ = (-f + f_3_) / f_9_
            val f_13_ = (-f_0_ + f_4_) / f_9_
            val f_14_ = anInt8446.toFloat() * f_12_
            val f_15_ = anInt8446.toFloat() * f_13_
            val f_16_ = anInt8447.toFloat() * f_10_
            val f_17_ = anInt8447.toFloat() * f_11_
            val f_18_ = -f_10_ * anInt8449.toFloat()
            val f_19_ = anInt8449.toFloat() * -f_11_
            val f_20_ = -f_12_ * anInt8432.toFloat()
            f_3_ = f_20_ + (f_3_ + f_16_)
            f_1_ = f_1_ + f_18_ + f_14_
            val f_21_ = anInt8432.toFloat() * -f_13_
            f_2_ = f_2_ + f_19_ + f_15_
            f = f + f_16_ + f_14_
            f_0_ = f_15_ + (f_17_ + f_0_)
            f_4_ = f_21_ + (f_4_ + f_17_)
        }
        val f_22_ = f_1_ - f + f_3_
        val f_23_ = -f_0_ + f_4_ + f_2_
        aClass258_Sub3_Sub1_8434.method1957(9728, (i_7_ and 0x1) != 0)
        aHa_Sub2_8430!!.method3792(59)
        aHa_Sub2_8430.method3771(((-93).toByte()).toByte(), aClass258_Sub3_Sub1_8434)
        aHa_Sub2_8430.method3753(i_6_, 1)
        aHa_Sub2_8430.method3761(0, i)
        glColor4ub((i_5_ shr 16).toByte(), (i_5_ shr 8).toByte(), i_5_.toByte(), (i_5_ shr 24).toByte())
        glBegin(7)
        glTexCoord2f(0.0f, (aClass258_Sub3_Sub1_8434.aFloat9938))
        glVertex2f(f, f_0_)
        glTexCoord2f(0.0f, 0.0f)
        glVertex2f(f_3_, f_4_)
        glTexCoord2f((aClass258_Sub3_Sub1_8434.aFloat9937), 0.0f)
        glVertex2f(f_22_, f_23_)
        glTexCoord2f((aClass258_Sub3_Sub1_8434.aFloat9937), (aClass258_Sub3_Sub1_8434.aFloat9938))
        glVertex2f(f_1_, f_2_)
        glEnd()
    }

    override fun method969(): Int {
        anInt8439++
        return aClass258_Sub3_Sub1_8434.anInt9939
    }

    override fun method968(i: Int, i_24_: Int, i_25_: Int) {
        anInt8438++
        glPixelTransferf(3348, 0.5f)
        glPixelTransferf(3349, 0.499f)
        glPixelTransferf(3352, 0.5f)
        glPixelTransferf(3353, 0.499f)
        glPixelTransferf(3354, 0.5f)
        glPixelTransferf(3355, 0.499f)
        aClass258_Sub3_Sub1_8431 = method1401(aHa_Sub2_8430!!, i, 34037, aClass258_Sub3_Sub1_8434.anInt9940, i_24_, aClass258_Sub3_Sub1_8434.anInt9939)
        anInt8429 = i_25_
        glPixelTransferf(3348, 1.0f)
        glPixelTransferf(3349, 0.0f)
        glPixelTransferf(3352, 1.0f)
        glPixelTransferf(3353, 0.0f)
        glPixelTransferf(3354, 1.0f)
        glPixelTransferf(3355, 0.0f)
    }

    override fun method984(`is`: IntArray?) {
        `is`!![1] = anInt8446
        anInt8445++
        `is`[3] = anInt8432
        `is`[0] = anInt8447
        `is`[2] = anInt8449
    }

    override fun method980(): Int {
        anInt8433++
        return (anInt8446 + aClass258_Sub3_Sub1_8434.anInt9939 + anInt8432)
    }

    override fun method979(i: Int, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int) {
        anInt8436++
        aClass258_Sub3_Sub1_8434.method1967(i, i_28_, i_30_, i_26_, i_29_, ((-120).toByte()).toByte(), i_27_)
    }

    override fun method963(i: Int, i_31_: Int, var_aa: aa?, i_32_: Int, i_33_: Int) {
        var i = i
        var i_31_ = i_31_
        anInt8424++
        val var_aa_Sub1 = var_aa as aa_Sub1?
        val class258_sub3_sub1 = var_aa_Sub1!!.aClass258_Sub3_Sub1_5193
        aClass258_Sub3_Sub1_8434.method1957(9728, false)
        aHa_Sub2_8430!!.method3792(75)
        aHa_Sub2_8430.method3771(((-99).toByte()).toByte(), aClass258_Sub3_Sub1_8434)
        aHa_Sub2_8430.method3761(0, 1)
        aHa_Sub2_8430.method3738(-15039, 1)
        aHa_Sub2_8430.method3771(((-123).toByte()).toByte(), class258_sub3_sub1)
        aHa_Sub2_8430.method3729(7681, ((-101).toByte()).toByte(), 8448)
        aHa_Sub2_8430.method3762(34168, 768, ((-87).toByte()).toByte(), 0)
        aHa_Sub2_8430.method3753(1, 1)
        i += anInt8447
        i_31_ += anInt8446
        val i_34_ = aClass258_Sub3_Sub1_8434.anInt9940 + i
        val i_35_ = (i_31_ - -aClass258_Sub3_Sub1_8434.anInt9939)
        val f = (class258_sub3_sub1!!.aFloat9937 / class258_sub3_sub1.anInt9940.toFloat())
        val f_36_ = (class258_sub3_sub1.aFloat9938 / class258_sub3_sub1.anInt9939.toFloat())
        val f_37_ = f * (-i_32_ + i).toFloat()
        val f_38_ = f * (i_34_ - i_32_).toFloat()
        val f_39_ = (class258_sub3_sub1.aFloat9938 - f_36_ * (i_31_ - i_33_).toFloat())
        val f_40_ = (-((i_35_ + -i_33_).toFloat() * f_36_) + class258_sub3_sub1.aFloat9938)
        glBegin(7)
        glColor3f(1.0f, 1.0f, 1.0f)
        glMultiTexCoord2f(33984, 0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
        glMultiTexCoord2f(33985, f_37_, f_39_)
        glVertex2i(i, i_31_)
        glMultiTexCoord2f(33984, 0.0f, 0.0f)
        glMultiTexCoord2f(33985, f_37_, f_40_)
        glVertex2i(i, i_31_ - -aClass258_Sub3_Sub1_8434.anInt9939)
        glMultiTexCoord2f(33984, aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
        glMultiTexCoord2f(33985, f_38_, f_40_)
        glVertex2i(i - -(aClass258_Sub3_Sub1_8434.anInt9940), (aClass258_Sub3_Sub1_8434.anInt9939) + i_31_)
        glMultiTexCoord2f(33984, aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
        glMultiTexCoord2f(33985, f_38_, f_39_)
        glVertex2i((aClass258_Sub3_Sub1_8434.anInt9940) + i, i_31_)
        glEnd()
        aHa_Sub2_8430.method3762(5890, 768, ((-87).toByte()).toByte(), 0)
        aHa_Sub2_8430.method3761(0, 0)
        aHa_Sub2_8430.method3771(((-105).toByte()).toByte(), null)
        aHa_Sub2_8430.method3738(-15039, 0)
    }

    override fun method985(i: Int, i_41_: Int, i_42_: Int, i_43_: Int) {
        anInt8447 = i
        anInt8449 = i_42_
        anInt8446 = i_41_
        anInt8426++
        anInt8432 = i_43_
        aBoolean8427 = (anInt8447 != 0 || anInt8446 != 0 || anInt8449 != 0 || anInt8432 != 0)
    }

    private fun method991(i: Byte) {
        anInt8428++
        if (i.toInt() == 9) {
            aHa_Sub2_8430!!.method3738(-15039, 1)
            aHa_Sub2_8430.method3771(((-78).toByte()).toByte(), null)
            aHa_Sub2_8430.method3729(8448, ((-79).toByte()).toByte(), 8448)
            aHa_Sub2_8430.method3762(34168, 768, ((-87).toByte()).toByte(), 1)
            aHa_Sub2_8430.method3775(false, 0, 770, 5890)
            aHa_Sub2_8430.method3738(-15039, 0)
            aHa_Sub2_8430.method3762(34168, 768, ((-87).toByte()).toByte(), 1)
        }
    }

    override fun method983(f: Float, f_44_: Float, f_45_: Float, f_46_: Float, f_47_: Float, f_48_: Float, i: Int, var_aa: aa?, i_49_: Int, i_50_: Int) {
        var f = f
        var f_44_ = f_44_
        var f_45_ = f_45_
        var f_46_ = f_46_
        var f_47_ = f_47_
        var f_48_ = f_48_
        anInt8448++
        val class258_sub3_sub1 = (var_aa as aa_Sub1).aClass258_Sub3_Sub1_5193
        if (aBoolean8427) {
            val f_51_ = method966().toFloat()
            val f_52_ = method980().toFloat()
            val f_53_ = (-f + f_45_) / f_51_
            val f_54_ = (-f_44_ + f_46_) / f_51_
            val f_55_ = (-f + f_47_) / f_52_
            val f_56_ = (-f_44_ + f_48_) / f_52_
            val f_57_ = f_55_ * anInt8446.toFloat()
            val f_58_ = f_56_ * anInt8446.toFloat()
            val f_59_ = anInt8447.toFloat() * f_53_
            val f_60_ = anInt8447.toFloat() * f_54_
            val f_61_ = -f_53_ * anInt8449.toFloat()
            val f_62_ = -f_54_ * anInt8449.toFloat()
            val f_63_ = -f_55_ * anInt8432.toFloat()
            f_46_ = f_46_ + f_62_ + f_58_
            f_45_ = f_61_ + f_45_ + f_57_
            f_47_ = f_63_ + (f_59_ + f_47_)
            f = f_59_ + f + f_57_
            f_44_ = f_58_ + (f_44_ + f_60_)
            val f_64_ = -f_56_ * anInt8432.toFloat()
            f_48_ = f_60_ + f_48_ + f_64_
        }
        val f_65_ = -f + f_45_ + f_47_
        aClass258_Sub3_Sub1_8434.method1957(9728, (0x1 and i) != 0)
        val f_66_ = f_48_ - f_44_ + f_46_
        aHa_Sub2_8430!!.method3792(106)
        aHa_Sub2_8430.method3771(((-123).toByte()).toByte(), aClass258_Sub3_Sub1_8434)
        aHa_Sub2_8430.method3761(0, 1)
        aHa_Sub2_8430.method3738(-15039, 1)
        aHa_Sub2_8430.method3771(((-98).toByte()).toByte(), class258_sub3_sub1)
        aHa_Sub2_8430.method3729(7681, ((-17).toByte()).toByte(), 8448)
        aHa_Sub2_8430.method3762(34168, 768, ((-87).toByte()).toByte(), 0)
        aHa_Sub2_8430.method3753(1, 1)
        val f_67_ = (class258_sub3_sub1!!.aFloat9937 / class258_sub3_sub1.anInt9940.toFloat())
        val f_68_ = (class258_sub3_sub1.aFloat9938 / class258_sub3_sub1.anInt9939.toFloat())
        glBegin(7)
        glColor3f(1.0f, 1.0f, 1.0f)
        glMultiTexCoord2f(33984, 0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
        glMultiTexCoord2f(33985, f_67_ * (f - i_49_.toFloat()), ((class258_sub3_sub1.aFloat9938) - f_68_ * (-i_50_.toFloat() + f_44_)))
        glVertex2f(f, f_44_)
        glMultiTexCoord2f(33984, 0.0f, 0.0f)
        glMultiTexCoord2f(33985, (-i_49_.toFloat() + f_47_) * f_67_, (-(f_68_ * (f_48_ - i_50_.toFloat())) + (class258_sub3_sub1.aFloat9938)))
        glVertex2f(f_47_, f_48_)
        glMultiTexCoord2f(33984, aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
        glMultiTexCoord2f(33985, (f_65_ - i_49_.toFloat()) * f_67_, (-(f_68_ * (f_66_ - i_50_.toFloat())) + (class258_sub3_sub1.aFloat9938)))
        glVertex2f(f_65_, f_66_)
        glMultiTexCoord2f(33984, aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
        glMultiTexCoord2f(33985, f_67_ * (-i_49_.toFloat() + f_45_), ((class258_sub3_sub1.aFloat9938) - f_68_ * (f_46_ - i_50_.toFloat())))
        glVertex2f(f_45_, f_46_)
        glEnd()
        aHa_Sub2_8430.method3762(5890, 768, ((-87).toByte()).toByte(), 0)
        aHa_Sub2_8430.method3761(0, 0)
        aHa_Sub2_8430.method3771(((-84).toByte()).toByte(), null)
        aHa_Sub2_8430.method3738(-15039, 0)
    }

    override fun method966(): Int {
        anInt8440++
        return (anInt8447 + aClass258_Sub3_Sub1_8434.anInt9940 - -anInt8449)
    }

    override fun method964(i: Int, i_69_: Int, i_70_: Int, i_71_: Int, i_72_: Int) {
        var i = i
        var i_69_ = i_69_
        aClass258_Sub3_Sub1_8434.method1957(9728, false)
        anInt8425++
        aHa_Sub2_8430!!.method3792(121)
        aHa_Sub2_8430.method3753(i_72_, 1)
        glColor4ub((i_71_ shr 16).toByte(), (i_71_ shr 8).toByte(), i_71_.toByte(), (i_71_ shr 24).toByte())
        i += anInt8447
        i_69_ += anInt8446
        if (aClass258_Sub3_Sub1_8431 == null) {
            aHa_Sub2_8430.method3771(((-127).toByte()).toByte(), aClass258_Sub3_Sub1_8434)
            aHa_Sub2_8430.method3761(0, i_70_)
            glBegin(7)
            glTexCoord2f(0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
            glVertex2i(i, i_69_)
            glTexCoord2f(0.0f, 0.0f)
            glVertex2i(i, i_69_ - -aClass258_Sub3_Sub1_8434.anInt9939)
            glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
            glVertex2i((aClass258_Sub3_Sub1_8434.anInt9940) + i, (aClass258_Sub3_Sub1_8434.anInt9939) + i_69_)
            glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
            glVertex2i((aClass258_Sub3_Sub1_8434.anInt9940) + i, i_69_)
            glEnd()
        } else {
            method992(i_70_, 3)
            aClass258_Sub3_Sub1_8431!!.method1957(9728, false)
            glBegin(7)
            glMultiTexCoord2f(33985, 0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
            glTexCoord2f(0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
            glVertex2i(i, i_69_)
            glMultiTexCoord2f(33985, 0.0f, 0.0f)
            glTexCoord2f(0.0f, 0.0f)
            glVertex2i(i, i_69_ + aClass258_Sub3_Sub1_8434.anInt9939)
            glMultiTexCoord2f(33985, aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
            glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
            glVertex2i((aClass258_Sub3_Sub1_8434.anInt9940) + i, (aClass258_Sub3_Sub1_8434.anInt9939) + i_69_)
            glMultiTexCoord2f(33985, aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
            glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
            glVertex2i(i + aClass258_Sub3_Sub1_8434.anInt9940, i_69_)
            glEnd()
            method991(9.toByte())
        }
    }

    private fun method992(i: Int, i_73_: Int) {
        aHa_Sub2_8430!!.method3738(-15039, 1)
        anInt8441++
        aHa_Sub2_8430.method3771(((-82).toByte()).toByte(), aClass258_Sub3_Sub1_8434)
        aHa_Sub2_8430.method3729(aHa_Sub2_8430.method3781(17.toByte(), i), ((-61).toByte()).toByte(), 7681)
        aHa_Sub2_8430.method3762(34167, 768, ((-87).toByte()).toByte(), 1)
        if (i_73_ != 3) method964(46, -15, -58, 122, 11)
        aHa_Sub2_8430.method3775(false, 0, 770, 34168)
        aHa_Sub2_8430.method3738(-15039, 0)
        aHa_Sub2_8430.method3771(((-108).toByte()).toByte(), aClass258_Sub3_Sub1_8431)
        aHa_Sub2_8430.method3729(34479, ((-47).toByte()).toByte(), 7681)
        aHa_Sub2_8430.method3762(34166, 768, ((-87).toByte()).toByte(), 1)
        if (anInt8429 != 0) {
            if (anInt8429 == 1) aHa_Sub2_8430.method3749(0.0f, 0.5f, 0.5f, 64.toByte(), 1.0f)
            else if (anInt8429 != 2) {
                if (anInt8429 == 3) aHa_Sub2_8430.method3749(0.0f, 128.5f, 128.5f, 63.toByte(), 128.5f)
            } else aHa_Sub2_8430.method3749(0.0f, 0.5f, 1.0f, 95.toByte(), 0.5f)
        } else aHa_Sub2_8430.method3749(0.0f, 1.0f, 0.5f, 50.toByte(), 0.5f)
    }

    override fun method965(i: Int, i_74_: Int, i_75_: Int, i_76_: Int, i_77_: Int, i_78_: Int, i_79_: Int) {
        anInt8442++
        val i_80_ = i_75_ + i
        val i_81_ = i_76_ + i_74_
        aClass258_Sub3_Sub1_8434.method1957(9728, false)
        aHa_Sub2_8430!!.method3792(54)
        aHa_Sub2_8430.method3771(((-88).toByte()).toByte(), aClass258_Sub3_Sub1_8434)
        aHa_Sub2_8430.method3753(i_79_, 1)
        aHa_Sub2_8430.method3761(0, i_77_)
        glColor4ub((i_78_ shr 16).toByte(), (i_78_ shr 8).toByte(), i_78_.toByte(), (i_78_ shr 24).toByte())
        if (aClass258_Sub3_Sub1_8434.aBoolean9941 && !aBoolean8427) {
            val f = (aClass258_Sub3_Sub1_8434.aFloat9938 * i_76_.toFloat() / (aClass258_Sub3_Sub1_8434.anInt9939).toFloat())
            val f_82_ = (i_75_.toFloat() * aClass258_Sub3_Sub1_8434.aFloat9937 / (aClass258_Sub3_Sub1_8434.anInt9940).toFloat())
            glBegin(7)
            glTexCoord2f(0.0f, f)
            glVertex2i(i, i_74_)
            glTexCoord2f(0.0f, 0.0f)
            glVertex2i(i, i_81_)
            glTexCoord2f(f_82_, 0.0f)
            glVertex2i(i_80_, i_81_)
            glTexCoord2f(f_82_, f)
            glVertex2i(i_80_, i_74_)
            glEnd()
        } else {
            glPushMatrix()
            glTranslatef(anInt8447.toFloat(), anInt8446.toFloat(), 0.0f)
            val i_83_ = method966()
            val i_84_ = method980()
            var i_85_ = i_74_ - -(aClass258_Sub3_Sub1_8434.anInt9939)
            glBegin(7)
            var i_86_ = i_74_
            while ( /**/i_85_ <= i_81_) {
                var i_87_ = i + (aClass258_Sub3_Sub1_8434.anInt9940)
                var i_88_ = i
                while ( /**/i_80_ >= i_87_) {
                    glTexCoord2f(0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
                    glVertex2i(i_88_, i_86_)
                    glTexCoord2f(0.0f, 0.0f)
                    glVertex2i(i_88_, i_85_)
                    glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
                    glVertex2i(i_87_, i_85_)
                    glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
                    glVertex2i(i_87_, i_86_)
                    i_88_ += i_83_
                    i_87_ += i_83_
                }
                if (i_88_ < i_80_) {
                    val f = ((i_80_ + -i_88_).toFloat() * (aClass258_Sub3_Sub1_8434.aFloat9937) / aClass258_Sub3_Sub1_8434.anInt9940.toFloat())
                    glTexCoord2f(0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
                    glVertex2i(i_88_, i_86_)
                    glTexCoord2f(0.0f, 0.0f)
                    glVertex2i(i_88_, i_85_)
                    glTexCoord2f(f, 0.0f)
                    glVertex2i(i_80_, i_85_)
                    glTexCoord2f(f, aClass258_Sub3_Sub1_8434.aFloat9938)
                    glVertex2i(i_80_, i_86_)
                }
                i_86_ += i_84_
                i_85_ += i_84_
            }
            if (i_86_ < i_81_) {
                val f = ((aClass258_Sub3_Sub1_8434.aFloat9938) * (aClass258_Sub3_Sub1_8434.anInt9939 + (-i_81_ + i_86_)).toFloat() / aClass258_Sub3_Sub1_8434.anInt9939.toFloat())
                var i_89_ = i + (aClass258_Sub3_Sub1_8434.anInt9940)
                var i_90_ = i
                while (i_80_ >= i_89_) {
                    glTexCoord2f(0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
                    glVertex2i(i_90_, i_86_)
                    glTexCoord2f(0.0f, f)
                    glVertex2i(i_90_, i_81_)
                    glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, f)
                    glVertex2i(i_89_, i_81_)
                    glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
                    glVertex2i(i_89_, i_86_)
                    i_89_ += i_83_
                    i_90_ += i_83_
                }
                if (i_80_ > i_90_) {
                    val f_91_ = ((i_80_ - i_90_).toFloat() * (aClass258_Sub3_Sub1_8434.aFloat9937) / aClass258_Sub3_Sub1_8434.anInt9940.toFloat())
                    glTexCoord2f(0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
                    glVertex2i(i_90_, i_86_)
                    glTexCoord2f(0.0f, f)
                    glVertex2i(i_90_, i_81_)
                    glTexCoord2f(f_91_, f)
                    glVertex2i(i_80_, i_81_)
                    glTexCoord2f(f_91_, aClass258_Sub3_Sub1_8434.aFloat9938)
                    glVertex2i(i_80_, i_86_)
                }
            }
            glEnd()
            glPopMatrix()
        }
    }

    override fun method971(): Int {
        anInt8437++
        return aClass258_Sub3_Sub1_8434.anInt9940
    }

    override fun method982(i: Int, i_92_: Int, i_93_: Int, i_94_: Int, i_95_: Int, i_96_: Int, i_97_: Int, i_98_: Int) {
        anInt8443++
        aClass258_Sub3_Sub1_8434.method1957(9728, (0x1 and i_98_) != 0)
        aHa_Sub2_8430!!.method3792(103)
        aHa_Sub2_8430.method3753(i_97_, 1)
        glColor4ub((i_96_ shr 16).toByte(), (i_96_ shr 8).toByte(), i_96_.toByte(), (i_96_ shr 24).toByte())
        if (aBoolean8427) {
            val f = i_93_.toFloat() / method966().toFloat()
            val f_99_ = i_94_.toFloat() / method980().toFloat()
            val f_100_ = i.toFloat() + f * anInt8447.toFloat()
            val f_101_ = anInt8446.toFloat() * f_99_ + i_92_.toFloat()
            val f_102_ = f_100_ + f * aClass258_Sub3_Sub1_8434.anInt9940.toFloat()
            val f_103_ = (f_101_ + (aClass258_Sub3_Sub1_8434.anInt9939).toFloat() * f_99_)
            if (aClass258_Sub3_Sub1_8431 == null) {
                aHa_Sub2_8430.method3771(((-85).toByte()).toByte(), aClass258_Sub3_Sub1_8434)
                aHa_Sub2_8430.method3761(0, i_95_)
                glBegin(7)
                glTexCoord2f(0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
                glVertex2f(f_100_, f_101_)
                glTexCoord2f(0.0f, 0.0f)
                glVertex2f(f_100_, f_103_)
                glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
                glVertex2f(f_102_, f_103_)
                glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
                glVertex2f(f_102_, f_101_)
                glEnd()
            } else {
                method992(i_95_, 3)
                aClass258_Sub3_Sub1_8431!!.method1957(9728, true)
                glBegin(7)
                glMultiTexCoord2f(33985, 0.0f, (aClass258_Sub3_Sub1_8434.aFloat9938))
                glTexCoord2f(0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
                glVertex2f(f_100_, f_101_)
                glMultiTexCoord2f(33985, 0.0f, 0.0f)
                glTexCoord2f(0.0f, 0.0f)
                glVertex2f(f_100_, f_103_)
                glMultiTexCoord2f(33985, aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
                glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
                glVertex2f(f_102_, f_103_)
                glMultiTexCoord2f(33985, aClass258_Sub3_Sub1_8434.aFloat9937, (aClass258_Sub3_Sub1_8434.aFloat9938))
                glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
                glVertex2f(f_102_, f_101_)
                glEnd()
                method991(9.toByte())
            }
        } else if (aClass258_Sub3_Sub1_8431 == null) {
            aHa_Sub2_8430.method3771(((-101).toByte()).toByte(), aClass258_Sub3_Sub1_8434)
            aHa_Sub2_8430.method3761(0, i_95_)
            glBegin(7)
            glTexCoord2f(0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
            glVertex2i(i, i_92_)
            glTexCoord2f(0.0f, 0.0f)
            glVertex2i(i, i_92_ - -i_94_)
            glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
            glVertex2i(i_93_ + i, i_94_ + i_92_)
            glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
            glVertex2i(i - -i_93_, i_92_)
            glEnd()
        } else {
            method992(i_95_, 3)
            aClass258_Sub3_Sub1_8431!!.method1957(9728, true)
            glBegin(7)
            glMultiTexCoord2f(33985, 0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
            glTexCoord2f(0.0f, aClass258_Sub3_Sub1_8434.aFloat9938)
            glVertex2i(i, i_92_)
            glMultiTexCoord2f(33985, 0.0f, 0.0f)
            glTexCoord2f(0.0f, 0.0f)
            glVertex2i(i, i_94_ + i_92_)
            glMultiTexCoord2f(33985, aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
            glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, 0.0f)
            glVertex2i(i - -i_93_, i_92_ + i_94_)
            glMultiTexCoord2f(33985, aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
            glTexCoord2f(aClass258_Sub3_Sub1_8434.aFloat9937, aClass258_Sub3_Sub1_8434.aFloat9938)
            glVertex2i(i_93_ + i, i_92_)
            glEnd()
            method991(9.toByte())
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, i_105_: Int, bool: Boolean) {
        aBoolean8427 = false
        anInt8446 = 0
        anInt8447 = 0
        anInt8449 = 0
        aHa_Sub2_8430 = var_ha_Sub2
        aClass258_Sub3_Sub1_8434 = method904(81, var_ha_Sub2, if (bool) 6408 else 6407, i, i_105_)
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_106_: Int, i_107_: Int, i_108_: Int) {
        aBoolean8427 = false
        anInt8446 = 0
        anInt8447 = 0
        anInt8449 = 0
        aHa_Sub2_8430 = var_ha_Sub2
        aClass258_Sub3_Sub1_8434 = method1401(var_ha_Sub2, i, 34037, i_107_, i_106_, i_108_)
    }

    internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, i_109_: Int, `is`: IntArray?, i_110_: Int, i_111_: Int) {
        aBoolean8427 = false
        anInt8446 = 0
        anInt8447 = 0
        anInt8449 = 0
        try {
            aHa_Sub2_8430 = var_ha_Sub2
            aClass258_Sub3_Sub1_8434 = method3132(`is`, i_110_, i_111_, i_109_, i, var_ha_Sub2, false, 12.toByte())
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nda.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_109_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_110_ + ',' + i_111_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt8424: Int = 0
        @JvmField
        var anInt8425: Int = 0
        @JvmField
        var anInt8426: Int = 0
        @JvmField
        var anInt8428: Int = 0
        @JvmField
        var anInt8433: Int = 0
        @JvmField
        var anInt8435: Int = 0
        @JvmField
        var anInt8436: Int = 0
        @JvmField
        var anInt8437: Int = 0
        @JvmField
        var anInt8438: Int = 0
        @JvmField
        var anInt8439: Int = 0
        @JvmField
        var anInt8440: Int = 0
        @JvmField
        var anInt8441: Int = 0
        @JvmField
        var anInt8442: Int = 0
        @JvmField
        var anInt8443: Int = 0
        @JvmField
        var anInt8444: Int = 0
        @JvmField
        var anInt8445: Int = 0
        @JvmField
        var anInt8448: Int = 0
        fun method990(c: Char, i: Byte): Char {
            anInt8444++
            if (c.code == 198) return 'E'
            if (c.code == 230) return 'e'
            if (c.code == 223) return 's'
            if (c.code == 338) return 'E'
            if (c.code == 339) return 'e'
            if (i >= -18) return 'M'
            return '\u0000'
        }

        fun method993(l: Long, l_104_: Long): Long {
            try {
                return l xor l_104_
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "nda.Q($l,$l_104_)")
            }
        }
    }
}
