import kotlin.math.abs
import kotlin.math.pow

/* Class59_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class59_Sub2(i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, f: Float) : Class59(i, i_2_, i_3_, i_4_, i_5_) {
    private var anInt5302 = 0
    private val anIntArray5303 = IntArray(this.anInt1071)
    private var anInt5308 = 0
    private lateinit var aByteArray5309: ByteArray
    public override fun method546(i: Int, i_0_: Int, i_1_: Int) {
        if (i_1_ != -2) method543(false)
        anInt5302 += anIntArray5303[i_0_] * i shr 12
        anInt5304++
    }

    public override fun method543(bool: Boolean) {
        anInt5307++
        anInt5302 = 0
        anInt5308 = 0
        if (bool != true) anInt5302 = -121
    }

    public override fun method541(i: Int) {
        anInt5302 = abs(anInt5302)
        anInt5301++
        if (anInt5302 >= 4096) anInt5302 = 4095
        method563(92.toByte(), anInt5308++, (anInt5302 shr 4).toByte())
        if (i != -1538606516) method546(-74, -93, 118)
        anInt5302 = 0
    }

    init {
        for (i_6_ in 0..<this.anInt1071) anIntArray5303[i_6_] = (f.toDouble().pow(i_6_.toDouble()) * 4096.0).toInt().toShort().toInt()
    }

    open fun method563(i: Byte, i_7_: Int, i_8_: Byte) {
        aByteArray5309[anInt5308++] = (Class139.method1166(127, i_8_.toInt() shr 1) + 127).toByte()
        if (i < 79) method543(true)
        anInt5310++
    }

    companion object {
        @JvmField
        var anInt5301: Int = 0
        @JvmField
        var anInt5304: Int = 0
        var aStringArray5305: Array<String?>? = arrayOf<String?>("en", "de", "fr", "pt", "nl")
        @JvmField
        var anIntArray5306: IntArray? = intArrayOf(36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096)
        @JvmField
        var anInt5307: Int = 0
        @JvmField
        var anInt5310: Int = 0

        @JvmStatic
        fun method564(i: Byte) {
            aStringArray5305 = null
            anIntArray5306 = null
            if (i >= -39) method564(50.toByte())
        }
    }
}
