import Class239_Sub27.Companion.method1839
import Class348_Sub5Statics.method2753
import Class55.Companion.method515
import java.awt.Canvas

/**
 * JVM-only statics that were formerly in ha's companion object.
 * Extracted so ha itself can live in commonMain.
 */
object haStatics {
    var aClass351_4571: Class351? = Class351(73, -1)

    /** Renderer slot allocation table; now lives in ha companion (commonMain). */
    val rendererSlots: BooleanArray
        get() = ha.rendererSlots

    @JvmStatic
    fun method3641(i: Int, i_35_: Int, i_36_: Byte, i_37_: Int, i_38_: Int, i_39_: Int) {
        ha.anInt4575++
        if (i_36_.toInt() != -75) ha.anInt4581 = 73
        if (i_35_ == i_38_) Class127.method1116(i, i_37_, i_39_, i_38_, (-99).toByte())
        else if (Class369.anInt4960 <= i_39_ + -i_38_ && Class113.anInt1745 >= i_39_ - -i_38_ && -i_35_ + i >= Class132.anInt1910 && Class38.anInt513 >= i + i_35_) method515(i_37_, i_39_, i, i_35_, i_38_, -122)
        else method1839(i_39_, i_35_, i, i_36_.toInt() xor 0x4a, i_37_, i_38_)
    }

    @JvmStatic
    fun method3664(i: Int, i_88_: Int): ByteArray {
        ha.anInt4564++
        if (i_88_ <= 21) ha.anInt4583 = 60
        var class348_sub42_sub3 = (Class348_Sub1_Sub2.aClass308_8815!!.method2302(i.toLong(), (-120).toByte()) as Class348_Sub42_Sub3?)
        if (class348_sub42_sub3 == null) {
            val `is` = ByteArray(512)
            val random = JavaRandom(i.toLong())
            for (i_89_ in 0..254) `is`[i_89_] = i_89_.toByte()
            for (i_90_ in 0..254) {
                val i_91_ = -i_90_ + 255
                val i_92_ = Class124.method1097(95.toByte(), i_91_, random)
                val i_93_ = `is`[i_92_]
                `is`[i_92_] = `is`[i_91_]
                `is`[511 + -i_90_] = i_93_
                `is`[i_91_] = `is`[511 + -i_90_]
            }
            class348_sub42_sub3 = Class348_Sub42_Sub3(`is`)
            Class348_Sub1_Sub2.aClass308_8815!!.method2305(i.toLong(), class348_sub42_sub3, -1)
        }
        return class348_sub42_sub3.aByteArray9499!!
    }

    @JvmStatic
    fun method3680(i: Int) {
        if (i != -24016) ha.anIntArray4578 = null
        ha.anIntArray4578 = null
        aClass351_4571 = null
    }

    @JvmStatic
    @Synchronized
    fun method3692(i: Int, i_168_: Int, i_169_: Int, class45: Class45?, i_170_: Int, var_d: d?, canvas: Canvas?, i_171_: Int): ha? {
        try {
            ha.anInt4576++
            if (i_170_ == i_171_) return method2753(true, i_168_, i_169_, canvas?.let { AwtDisplayTarget(it) }, var_d, AwtGameSurfaceFactory)
            if (i_171_ == 2) return Class306.method2297(-6, i_168_, var_d, canvas, i_169_)
            if (i_171_ == 1) return Class262Statics.method2000(3, i, canvas, var_d)
            if (i_171_ == 5) return Class93.method862(canvas, var_d, class45, 25542, i)
            if (i_171_ == 3) return Class96.method870(i, i_170_ xor 0x4a31, var_d!!, class45!!, canvas!!)
            throw IllegalArgumentException("UM")
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ha.TJ(" + i + ',' + i_168_ + ',' + i_169_ + ',' + (if (class45 != null) "{...}" else "null") + ',' + i_170_ + ',' + (if (var_d != null) "{...}" else "null") + ',' + (if (canvas != null) "{...}" else "null") + ',' + i_171_ + ')'))
        }
    }
}
