import Class239_Sub6.Companion.method1745
import Class285_Sub1.Companion.method2127
import Class286_Sub3.Companion.method2148
import jaggl.OpenGL.Companion.glBindProgramARB
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glProgramLocalParameter4fARB
import za_Sub2.Companion.method3442

class Class367_Sub2 internal constructor(class377: Class377, class45: Class45?, class269: Class269?) : Class367(class377) {
    private val aClass193_7293: Class193?
    private val aClass269_7294: Class269?
    private var aClass377_7296: Class377? = null
    override fun method3527(i: Int, interface18: Interface18?, i_4_: Int) {
        anInt7288++
        if (i_4_ != -16776) aClass377_7296 = null
    }

    override fun method3525(i: Int, bool: Boolean) {
        if (i == 15192) {
            anInt7287++
            glBindProgramARB(34336, aClass193_7293!!.anInt2584)
            glEnable(34336)
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class318_Sub1_Sub2.aClass70_8737)
        }
    }

    init {
        try {
            aClass377_7296 = class377
            aClass269_7294 = class269
            if (class45 == null || !aClass269_7294!!.method2039(100) || !aClass377_7296!!.aBoolean9923) aClass193_7293 = null
            else aClass193_7293 = method3442(34336, class45.method391("gl", "transparent_water", -29832), aClass377_7296, 4)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ov.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class269 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3521(bool: Boolean, i: Byte) {
        if (i.toInt() != -103) aShortArrayArrayArray7290 = null
        this.aHa_Sub3_4479.method3874((Class348_Sub23_Sub2.aClass229_9011), 106, (Class328_Sub3.aClass229_6519))
        anInt7292++
    }

    override fun method3520(i: Byte) {
        anInt7295++
        if (i.toInt() == 87) {
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
            glBindProgramARB(34336, 0)
            glDisable(34820)
            glDisable(34336)
        }
    }

    override fun method3526(i: Int, i_5_: Int, i_6_: Int) {
        anInt7286++
        if (i == 10756) {
            if (aClass269_7294!!.aBoolean3458) {
                val f = ((this.aHa_Sub3_4479.anInt8146) % 4000).toFloat() / 4000.0f
                this.aHa_Sub3_4479.method3850(79.toByte(), aClass269_7294.anInterface18_Impl1_3452)
                glProgramLocalParameter4fARB(34336, 0, f, 0.0f, 0.0f, 1.0f)
            } else {
                val i_7_ = (16 * (this.aHa_Sub3_4479.anInt8146 % 4000) / 4000)
                this.aHa_Sub3_4479.method3850((-118).toByte(), (aClass269_7294.anInterface18_Impl3Array3459!![i_7_]))
                glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f)
            }
        }
    }

    override fun method3530(i: Int): Boolean {
        anInt7289++
        if (i >= -57) return true
        return aClass193_7293 != null
    }

    companion object {
        @JvmField
        var anInt7286: Int = 0
        @JvmField
        var anInt7287: Int = 0
        @JvmField
        var anInt7288: Int = 0
        @JvmField
        var anInt7289: Int = 0
        @JvmField
        var aShortArrayArrayArray7290: Array<Array<ShortArray?>?>? = null
        @JvmField
        var anInt7291: Int = 0
        @JvmField
        var anInt7292: Int = 0
        @JvmField
        var anInt7295: Int = 0
        @JvmField
        var anInt7297: Int = 0

        @JvmStatic
        fun method3536(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, class318_sub1_sub2: Class318_Sub1_Sub2) {
            val class357 = Class348_Sub46.method3321(i, i_0_, i_1_)
            if (class357 != null) {
                class318_sub1_sub2.x = (i_0_ shl Class362.anInt4459) + Class348_Sub23_Sub2.anInt9037
                class318_sub1_sub2.anInt6382 = i_2_
                class318_sub1_sub2.y = (i_1_ shl Class362.anInt4459) + Class348_Sub23_Sub2.anInt9037
                class357.aClass318_Sub1_Sub2_4408 = class318_sub1_sub2
                val i_3_ = if (aa_Sub1.aSArray5191 == Class332.aSArray4142) 1 else 0
                if (class318_sub1_sub2.method2376(-52)) {
                    if (class318_sub1_sub2.method2377(122.toByte())) {
                        class318_sub1_sub2.aClass318_Sub1_6379 = Class250.aClass318_Sub1Array3226!![i_3_]
                        Class250.aClass318_Sub1Array3226!![i_3_] = class318_sub1_sub2
                    } else {
                        class318_sub1_sub2.aClass318_Sub1_6379 = Class348.aClass318_Sub1Array4293!![i_3_]
                        Class348.aClass318_Sub1Array4293!![i_3_] = class318_sub1_sub2
                        Class348_Sub16_Sub2.aBoolean8870 = true
                    }
                } else {
                    class318_sub1_sub2.aClass318_Sub1_6379 = Class115.aClass318_Sub1Array1754!![i_3_]
                    Class115.aClass318_Sub1Array1754!![i_3_] = class318_sub1_sub2
                }
            }
        }

        @JvmStatic
        fun method3537(i: Int) {
            aShortArrayArrayArray7290 = null
            if (i != 34336) anInt7297 = 99
        }

        @JvmStatic
        fun method3538(bool: Boolean, string: String?) {
            var string = string
            anInt7291++
            if (string != null) {
                if (string.startsWith("*")) string = string.substring(1)
                val string_8_ = method2127(2, string)
                if (string_8_ != null) {
                    var i = 0
                    while ((Class348_Sub42_Sub12.anInt9604 > i)) {
                        var string_9_ = Class51.aStringArray932!![i]
                        if (string_9_!!.startsWith("*")) string_9_ = string_9_.substring(1)
                        string_9_ = method2127(2, string_9_)
                        if (string_9_ != null && string_9_ == string_8_) {
                            Class348_Sub42_Sub12.anInt9604--
                            var i_10_ = i
                            while (Class348_Sub42_Sub12.anInt9604 > i_10_) {
                                Class51.aStringArray932!![i_10_] = Class51.aStringArray932!![i_10_ + 1]
                                Class122.aStringArray1808!![i_10_] = Class122.aStringArray1808!![1 + i_10_]
                                Class348_Sub40_Sub21.aStringArray9275!![i_10_] = (Class348_Sub40_Sub21.aStringArray9275!![1 + i_10_])
                                aa_Sub2.aStringArray5197!![i_10_] = aa_Sub2.aStringArray5197!![1 + i_10_]
                                Class367_Sub3.Companion.aBooleanArray7304!![i_10_] = Class367_Sub3.Companion.aBooleanArray7304!![i_10_ - -1]
                                i_10_++
                            }
                            Class285_Sub1.anInt8493++
                            Class126.anInt4985 = Class311.anInt3918
                            val class348_sub47 = method2148(ha.aClass351_4571, (Class348_Sub23_Sub2.aClass77_9029), -123)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                            Class348_Sub42_Sub14.method3243(118, class348_sub47)
                            break
                        }
                        i++
                    }
                }
            }
        }
    }
}
