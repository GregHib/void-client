import Class239_Sub27.Companion.method1839
import Class55.Companion.method515
import java.awt.Canvas

/**
 * JVM-only statics that were formerly in ha's companion object.
 * Extracted so ha itself can live in commonMain.
 */
object haStatics {

    // ---------------------------------------------------------------------------
    // GL hardware-renderer seam — exposes selected ha_Sub2/ha_Sub3/Class14_Sub*
    // state that Client.kt needs, so Client never names those concrete GL classes.
    // ---------------------------------------------------------------------------

    /** Software-renderer canvas width (default 503, 480 for stellardawn). */
    var rendererWidth: Int
        get() = ha_Sub2.anInt7666
        set(v) { ha_Sub2.anInt7666 = v }

    /** GL debug/wireframe overlay mode flag (0 = off, 3 = overlay). Read by Client. */
    val glDebugMode: Int
        get() = ha_Sub3.anInt8045

    /** GL frame-state slot written by Client during frame processing. */
    var glFrameState: Int
        get() = ha_Sub3.anInt8001
        set(v) { ha_Sub3.anInt8001 = v }

    /** World-sentinel Class230 value from the GL texture variant (Class14_Sub4). */
    val glWorldSentinel: Class230?
        get() = Class14_Sub4.aClass230_8638

    /** Applet "additionalInfo" parameter forwarded into the GL texture pipeline (Class14_Sub1). */
    var glAdditionalInfo: String?
        get() = Class14_Sub1.aString8605
        set(v) { Class14_Sub1.aString8605 = v }

    /**
     * Forwarding delegates for ha_Sub2/ha_Sub3/Class377 companion methods used
     * in Client's init sequence. Client imports these from haStatics so it never
     * names those concrete GL classes directly.
     */ fun method3736(i: Byte) = ha_Sub2.method3736(i) fun method3870(i: Int) = ha_Sub3.method3870(i) fun method3968(i: Int) = Class377.method3968(i)

    // ---------------------------------------------------------------------------
    // Forwarding delegates for Class14_Sub* companion methods used in Client.kt
    // ---------------------------------------------------------------------------

    /** Camera/view interpolation tick (Class14_Sub1.method241). */ fun method241(i: Byte) = Class14_Sub1.method241(i)

    /** Clear additionalInfo parameter (Class14_Sub1.method242). */ fun method242(bool: Boolean) = Class14_Sub1.method242(bool)

    /** Cache-open trigger (Class14_Sub2.method243). */ fun method243(i: Int) = Class14_Sub2.method243(i)

    /** JS5 load trigger returning Class348_Sub51 (Class14_Sub3.method247). */ fun method247(i: Int): Class348_Sub51? = Class14_Sub3.method247(i)

    /** Teardown GL texture variant resources (Class14_Sub4.method251). */ fun method251(i: Byte) = Class14_Sub4.method251(i)
    var aClass351_4571: Class351? = Class351(73, -1)

    /** Renderer slot allocation table; now lives in ha companion (commonMain). */
    val rendererSlots: BooleanArray
        get() = ha.rendererSlots

    fun method3641(i: Int, i_35_: Int, i_36_: Byte, i_37_: Int, i_38_: Int, i_39_: Int) {
        ha.anInt4575++
        if (i_36_.toInt() != -75) ha.anInt4581 = 73
        if (i_35_ == i_38_) Class127.method1116(i, i_37_, i_39_, i_38_, (-99).toByte())
        else if (Class369.anInt4960 <= i_39_ + -i_38_ && Class113.anInt1745 >= i_39_ - -i_38_ && -i_35_ + i >= Class132.anInt1910 && Class38.anInt513 >= i + i_35_) method515(i_37_, i_39_, i, i_35_, i_38_, -122)
        else method1839(i_39_, i_35_, i, i_36_.toInt() xor 0x4a, i_37_, i_38_)
    }

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
                val i_92_ = Class124Statics.method1097(95.toByte(), i_91_, random)
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

    fun method3680(i: Int) {
        if (i != -24016) ha.anIntArray4578 = null
        ha.anIntArray4578 = null
        aClass351_4571 = null
    }

    @Synchronized
    fun method3692(i: Int, i_168_: Int, i_169_: Int, class45: Class45?, i_170_: Int, var_d: d?, canvas: Canvas?, i_171_: Int): ha? {
        try {
            ha.anInt4576++
            if (i_170_ == i_171_) return JvmSoftwareToolkitFactory.build(var_d, AwtGameSurfaceFactory, canvas?.let { AwtDisplayTarget(it) }!!, i_168_, i_169_, true)
            if (i_171_ == 2) return Class306.method2297(-6, i_168_, var_d, canvas, i_169_)
            if (i_171_ == 1) return Class262Statics.method2000(3, i, canvas, var_d)
            if (i_171_ == 5) return Class93Statics.method862(canvas, var_d, class45, 25542, i)
            if (i_171_ == 3) return Class96.method870(i, i_170_ xor 0x4a31, var_d!!, class45!!, canvas!!)
            throw IllegalArgumentException("UM")
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ha.TJ(" + i + ',' + i_168_ + ',' + i_169_ + ',' + (if (class45 != null) "{...}" else "null") + ',' + i_170_ + ',' + (if (var_d != null) "{...}" else "null") + ',' + (if (canvas != null) "{...}" else "null") + ',' + i_171_ + ')'))
        }
    }
}
