import jaclib.memory.Buffer
import jagdx.IDirect3DIndexBuffer
import jagdx.ue.a

class Class142 internal constructor(private val aClass378_8515: Class378, private var aClass68_8518: Class68?, private val aBoolean8519: Boolean) : Interface5_Impl2 {
    private var anInt8516 = 0
    var anIDirect3DIndexBuffer8517: IDirect3DIndexBuffer? = null
    private var aBoolean8520 = false
    private var anInt8521 = 0

    override fun method25(i: Byte): Class68? {
        if (i <= 19) aClass68_8518 = null
        return aClass68_8518
    }

    override fun method22(i: Int): Boolean {
        if (i != -23) anInt8516 = 118
        if (aBoolean8520 && a(this.anIDirect3DIndexBuffer8517!!.Unlock(), false)) {
            aBoolean8520 = false
            return true
        }
        return false
    }

    override fun method23(i: Int, i_0_: Int) {
        if (i != 15959) anInt8516 = -78
        anInt8516 = aClass68_8518!!.anInt1178 * i_0_
        if (anInt8521 < anInt8516) {
            var i_1_ = 8
            val i_2_: Int
            if (aBoolean8519) {
                i_1_ = i_1_ or 0x200
                i_2_ = 0
            } else i_2_ = 1
            if (null != this.anIDirect3DIndexBuffer8517) this.anIDirect3DIndexBuffer8517!!.a(9275)
            this.anIDirect3DIndexBuffer8517 = (aClass378_8515.anIDirect3DDevice9810!!.a(anInt8516, i_1_, if (aClass68_8518 != Class68.aClass68_1184) 102 else 101, i_2_, this.anIDirect3DIndexBuffer8517))
            anInt8521 = anInt8516
        }
    }

    override fun method24(bool: Boolean, bool_3_: Boolean): Buffer? {
        var bool = bool
        if (null == this.anIDirect3DIndexBuffer8517) return null
        if (bool_3_) method23(-111, 54)
        bool = bool and aBoolean8519
        if (!aBoolean8520 && a((this.anIDirect3DIndexBuffer8517!!.Lock(0, anInt8521, if (!bool) 0 else 8192, aClass378_8515.aGeometryBuffer9811)), false)) {
            aBoolean8520 = true
            return aClass378_8515.aGeometryBuffer9811
        }
        return null
    }

    override fun method16(bool: Boolean): Int {
        if (bool) method25(116.toByte())
        return anInt8516
    }

    override fun method21(i: Int) {
        if (null != this.anIDirect3DIndexBuffer8517) {
            this.anIDirect3DIndexBuffer8517!!.a(9275)
            this.anIDirect3DIndexBuffer8517 = null
        }
        if (i != 23315) method23(65, -35)
        anInt8521 = 0
        anInt8516 = 0
    }
}
