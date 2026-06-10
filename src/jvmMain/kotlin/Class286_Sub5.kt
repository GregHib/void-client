import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glTexGenfv
import jaggl.OpenGL.Companion.glTexGeni
import kotlin.math.min

class Class286_Sub5 internal constructor(var_ha_Sub2: ha_Sub2, class83: Class83?) : Class286(var_ha_Sub2) {
    private val aClass61_6254: Class61
    private val aClass83_6259: Class83?
    override fun method2136(i: Int, i_5_: Int, i_6_: Byte) {
        anInt6252++
        val f = -5.0E-4f * (1 + (i and 0x3)).toFloat()
        val f_7_ = 5.0E-4f * (1 + ((i and 0x18) shr 3)).toFloat()
        val f_8_ = if ((i and 0x40) == 0) 4.8828125E-4f else 9.765625E-4f
        val bool = (i and 0x80) != 0
        this.aHa_Sub2_3684.method3738(-15039, 1)
        if (bool) {
            Class110_Sub1.aFloatArray5791!![1] = 0.0f
            Class110_Sub1.aFloatArray5791!![0] = f_8_
            Class110_Sub1.aFloatArray5791!![3] = 0.0f
            Class110_Sub1.aFloatArray5791!![2] = 0.0f
        } else {
            Class110_Sub1.aFloatArray5791!![1] = 0.0f
            Class110_Sub1.aFloatArray5791!![0] = 0.0f
            Class110_Sub1.aFloatArray5791!![2] = f_8_
            Class110_Sub1.aFloatArray5791!![3] = 0.0f
        }
        glTexGenfv(8192, 9474, Class110_Sub1.aFloatArray5791, 0)
        Class110_Sub1.aFloatArray5791!![0] = 0.0f
        Class110_Sub1.aFloatArray5791!![1] = f_8_
        Class110_Sub1.aFloatArray5791!![3] = (f * this.aHa_Sub2_3684.anInt7735.toFloat() % 1.0f)
        if (i_6_ >= -42) method2136(-27, -15, (-43).toByte())
        Class110_Sub1.aFloatArray5791!![2] = 0.0f
        glTexGenfv(8193, 9474, Class110_Sub1.aFloatArray5791, 0)
        if (aClass83_6259!!.aBoolean1442) {
            Class110_Sub1.aFloatArray5791!![0] = 0.0f
            Class110_Sub1.aFloatArray5791!![3] = (this.aHa_Sub2_3684.anInt7735).toFloat() * f_7_ % 1.0f
            Class110_Sub1.aFloatArray5791!![2] = 0.0f
            Class110_Sub1.aFloatArray5791!![1] = 0.0f
            glTexGenfv(8194, 9473, Class110_Sub1.aFloatArray5791, 0)
        } else {
            val i_9_ = (16.0f * (this.aHa_Sub2_3684.anInt7735.toFloat() * f_7_)).toInt()
            this.aHa_Sub2_3684.method3771((-81).toByte(), aClass83_6259.aClass258_Sub3Array1448!![i_9_ % 16])
        }
        this.aHa_Sub2_3684.method3738(-15039, 0)
    }

    override fun method2140(class258: Class258?, i: Byte, i_10_: Int) {
        anInt6257++
        this.aHa_Sub2_3684.method3771((-118).toByte(), class258)
        this.aHa_Sub2_3684.method3761(0, i_10_)
        if (i > -89) method2140(null, 109.toByte(), -112)
    }

    override fun method2133(i: Int) {
        anInt6249++
        aClass61_6254.method594('\u0001', 28666)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        this.aHa_Sub2_3684.method3771((-113).toByte(), null)
        if (i > -75) anInt6248 = -7
        this.aHa_Sub2_3684.method3738(-15039, 0)
    }

    init {
        try {
            aClass83_6259 = class83
            aClass61_6254 = Class61(var_ha_Sub2, 2)
            aClass61_6254.method595(104.toByte(), 0)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            if (aClass83_6259!!.aBoolean1442) {
                glTexGeni(8194, 9472, 9217)
                glEnable(3170)
            }
            glTexGeni(8192, 9472, 9216)
            glTexGeni(8193, 9472, 9216)
            glEnable(3168)
            glEnable(3169)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aClass61_6254.method591(-1)
            aClass61_6254.method595(117.toByte(), 1)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            if (aClass83_6259.aBoolean1442) glDisable(3170)
            glDisable(3168)
            glDisable(3169)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aClass61_6254.method591(-1)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("gn.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (class83 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method2134(bool: Boolean, bool_11_: Boolean) {
        anInt6250++
        aClass61_6254.method594('\u0000', 28666)
        if (aClass83_6259!!.aBoolean1442) {
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-117).toByte(), (aClass83_6259.aClass258_Sub1_1446))
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
        if (bool_11_ != false) anInt6248 = -68
    }

    override fun method2139(bool: Boolean, i: Byte) {
        anInt6261++
        val i_12_ = -52 % ((i - -60) / 38)
    }

    override fun method2137(i: Int): Boolean {
        if (i >= -5) anInt6248 = 124
        anInt6253++
        return true
    }

    companion object {
        @JvmField
        var aD6247: d? = null
        @JvmField
        var anInt6248: Int = -1
        @JvmField
        var anInt6249: Int = 0
        @JvmField
        var anInt6250: Int = 0
        @JvmField
        var anInt6251: Int = 0
        @JvmField
        var anInt6252: Int = 0
        @JvmField
        var anInt6253: Int = 0
        @JvmField
        var anInt6255: Int = 0
        @JvmField
        var anInt6256: Int = 0
        @JvmField
        var anInt6257: Int = 0
        @JvmField
        var anInt6258: Int = 0
        var anIntArray6260: IntArray? = IntArray(1)
        @JvmField
        var anInt6261: Int = 0

        @JvmStatic
        fun method2158(i: Byte) {
            anInt6256++
            var i_0_ = 0
            if (Class316.aClass348_Sub51_3959 != null) i_0_ = Class316.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1818(-32350)
            if (i.toInt() == 56) {
                if (i_0_ == 2) {
                    val i_1_ = (min(Class272.anInt3473, 800))
                    Class321.anInt4017 = i_1_
                    Class348_Sub48.anInt7129 = (Class272.anInt3473 + -i_1_) / 2
                    val i_2_ = (min(Class348_Sub22.anInt6857, 600))
                    Class348_Sub42_Sub8_Sub2.anInt10432 = i_2_
                    Class335.anInt4167 = 0
                } else if (i_0_ == 1) {
                    val i_3_ = min(Class272.anInt3473, 1024)
                    Class348_Sub48.anInt7129 = (Class272.anInt3473 + -i_3_) / 2
                    val i_4_ = (min(Class348_Sub22.anInt6857, 768))
                    Class321.anInt4017 = i_3_
                    Class335.anInt4167 = 0
                    Class348_Sub42_Sub8_Sub2.anInt10432 = i_4_
                } else {
                    Class335.anInt4167 = 0
                    Class348_Sub42_Sub8_Sub2.anInt10432 = Class348_Sub22.anInt6857
                    Class348_Sub48.anInt7129 = 0
                    Class321.anInt4017 = Class272.anInt3473
                }
            }
        }

        @JvmStatic
        fun method2159(i: Byte, class45: Class45) {
            Class348_Sub22.anInt6862 = class45.method417("hitmarks", 0)
            anInt6258++
            Class106.anInt1639 = class45.method417("hitbar_default", 0)
            Class373_Sub2.anInt7429 = class45.method417("timerbar_default", 0)
            ha.anInt4562 = class45.method417("headicons_pk", 0)
            Class82.anInt1435 = class45.method417("headicons_prayer", 0)
            Class115.anInt1756 = class45.method417("hint_headicons", 0)
            Class291.anInt3739 = class45.method417("hint_mapmarkers", 0)
            Class86.anInt1481 = class45.method417("mapflag", 0)
            Class239_Sub10.anInt5948 = class45.method417("cross", 0)
            Class113.anInt1742 = class45.method417("mapdots", 0)
            Class364.anInt4469 = class45.method417("scrollbar", 0)
            Class348_Sub40_Sub38.anInt9473 = class45.method417("name_icons", 0)
            Class187.anInt2510 = class45.method417("floorshadows", 0)
            Class52.anInt4895 = class45.method417("compass", 0)
            if (i > -72) method2161(106.toByte(), 125L)
            Class186_Sub1.anInt5814 = class45.method417("otherlevel", 0)
            Class5_Sub3.anInt8370 = class45.method417("hint_mapedge", 0)
        }

        @JvmStatic
        fun method2160(i: Int) {
            if (i == 0) {
                aD6247 = null
                anIntArray6260 = null
            }
        }

        @JvmStatic
        fun method2161(i: Byte, l: Long) {
            try {
                anInt6251++
                if (l > 0L) {
                    if (l % 10L == 0L) {
                        Class327.method2606(-125, -1L + l)
                        Class327.method2606(-125, 1L)
                    } else Class327.method2606(59, l)
                    val i_13_ = 70 % ((i - -52) / 32)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "gn.D(" + i + ',' + l + ')')
            }
        }
    }
}
