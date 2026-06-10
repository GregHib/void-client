import jaggl.OpenGL.Companion.glGenTextures
import jaggl.OpenGL.Companion.glGenerateMipmapEXT
import jaggl.OpenGL.Companion.glTexParameteri

abstract class Class258 internal constructor(var aHa_Sub2_4851: ha_Sub2, var anInt4849: Int, var anInt4858: Int, private var anInt4847: Int, private var aBoolean4860: Boolean) : Interface9 {
    private var aBoolean4856 = false
    var anInt4859: Int
    fun method1950(i: Int): Boolean {
        anInt4852++
        val i_0_ = 22 / ((i - -31) / 50)
        if (this.aHa_Sub2_4851.aBoolean7820) {
            val i_1_ = method1951(-120)
            this.aHa_Sub2_4851.method3771((-102).toByte(), this)
            glGenerateMipmapEXT(this.anInt4849)
            aBoolean4860 = true
            method1956(true)
            method1954(i_1_, 121)
            return true
        }
        return false
    }

    private fun method1951(i: Int): Int {
        anInt4861++
        if (i >= -96) anInt4847 = -92
        val i_2_ = (this.aHa_Sub2_4851.method3798(this.anInt4858, 2) * anInt4847)
        if (aBoolean4860) return i_2_ * 4 / 3
        return i_2_
    }

    fun method1952(i: Int) {
        anInt4863++
        if (this.anInt4859 > 0) {
            this.aHa_Sub2_4851.method3737((this.anInt4859), 121.toByte(), method1951(i + 19838))
            this.anInt4859 = 0
        }
        if (i != -19948) this.anInt4859 = -40
    }

    fun method1953(i: Int): Int {
        anInt4853++
        if (i < 29) method1956(true)
        return this.anInt4859
    }

    private fun method1954(i: Int, i_3_: Int) {
        anInt4854++
        if (i_3_ < 17) aBoolean4856 = true
        this.aHa_Sub2_4851.anInt7748 -= i
        this.aHa_Sub2_4851.anInt7748 += method1951(-106)
    }

    fun method1955(bool: Boolean, i: Byte) {
        if (i.toInt() != -123) method1953(50)
        if (aBoolean4860 == !bool) {
            val i_4_ = method1951(-119)
            aBoolean4860 = true
            method1956(true)
            method1954(i_4_, 115)
        }
        anInt4850++
    }

    private fun method1956(bool: Boolean) {
        anInt4857++
        if (bool != true) this.anInt4849 = -74
        this.aHa_Sub2_4851.method3771((-87).toByte(), this)
        if (aBoolean4856) {
            glTexParameteri(this.anInt4849, 10241, if (aBoolean4860) 9987 else 9729)
            glTexParameteri(this.anInt4849, 10240, 9729)
        } else {
            glTexParameteri(this.anInt4849, 10241, if (aBoolean4860) 9984 else 9728)
            glTexParameteri(this.anInt4849, 10240, 9728)
        }
    }

    fun method1957(i: Int, bool: Boolean) {
        if (!aBoolean4856 == bool) {
            aBoolean4856 = bool
            method1956(true)
        }
        anInt4855++
        if (i != 9728) method1956(false)
    }

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt4862++
        method1952(-19948)
//        super.finalize()
    }

    init {
        glGenTextures(1, Class286_Sub5.anIntArray6260, 0)
        this.anInt4859 = Class286_Sub5.anIntArray6260!![0]
        method1954(0, 94)
    }

    abstract override fun method37(i: Int)

    companion object {
        @JvmField
        var anInt4848: Int = 0
        @JvmField
        var anInt4850: Int = 0
        @JvmField
        var anInt4852: Int = 0
        @JvmField
        var anInt4853: Int = 0
        @JvmField
        var anInt4854: Int = 0
        @JvmField
        var anInt4855: Int = 0
        @JvmField
        var anInt4857: Int = 0
        @JvmField
        var anInt4861: Int = 0
        @JvmField
        var anInt4862: Int = 0
        @JvmField
        var anInt4863: Int = 0
    }
}
