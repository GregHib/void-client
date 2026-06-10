import jaclib.memory.Buffer
import jaclib.memory.Source
import jagdx.IDirect3DVertexBuffer
import jagdx.ue.a

class Class366 internal constructor(private val aClass378_8512: Class378, private val aBoolean8509: Boolean) : Interface5_Impl1 {
    private var anInt8508 = 0
    private var aBoolean8510 = false
    var anIDirect3DVertexBuffer8511: IDirect3DVertexBuffer? = null
    private var aByte8513: Byte = 0
    private var anInt8514 = 0

    override fun method16(bool: Boolean): Int {
        if (bool) method3519(-55)
        return anInt8508
    }

    override fun method21(i: Int) {
        if (this.anIDirect3DVertexBuffer8511 != null) {
            this.anIDirect3DVertexBuffer8511!!.a(9275)
            this.anIDirect3DVertexBuffer8511 = null
        }
        anInt8514 = 0
        anInt8508 = 0
    }

    override fun method20(i: Int, i_0_: Byte, i_1_: Int): Boolean {
        aByte8513 = i_1_.toByte()
        if (i_0_ < 122) method20(-127, 52.toByte(), -18)
        anInt8508 = i
        if (anInt8508 > anInt8514) {
            var i_2_ = 8
            val i_3_: Int
            if (aBoolean8509) {
                i_2_ = i_2_ or 0x200
                i_3_ = 0
            } else i_3_ = 1
            if (this.anIDirect3DVertexBuffer8511 != null) this.anIDirect3DVertexBuffer8511!!.a(9275)
            this.anIDirect3DVertexBuffer8511 = (aClass378_8512.anIDirect3DDevice9810!!.a(anInt8508, i_2_, 0, i_3_, this.anIDirect3DVertexBuffer8511))
            anInt8514 = anInt8508
        }
        return null != this.anIDirect3DVertexBuffer8511
    }

    override fun method19(bool: Boolean, i: Int): Buffer? {
        var bool = bool
        if (this.anIDirect3DVertexBuffer8511 == null) return null
        bool = bool and aBoolean8509
        if (i != 26775) method21(93)
        if (!aBoolean8510 && a((this.anIDirect3DVertexBuffer8511!!.Lock(0, anInt8514, if (!bool) 0 else 8192, aClass378_8512.aGeometryBuffer9811)), false)) {
            aBoolean8510 = true
            return aClass378_8512.aGeometryBuffer9811
        }
        return null
    }

    override fun method17(source: Source, i: Int, i_4_: Int, i_5_: Byte): Boolean {
        if (method20(i_4_, 125.toByte(), i)) return this.anIDirect3DVertexBuffer8511!!.a(source, 0, 0, anInt8508, if (!aBoolean8509) 0 else 8192)
        if (i_5_ >= -15) anInt8508 = 71
        return false
    }

    override fun method18(i: Int): Boolean {
        if (aBoolean8510 && a(this.anIDirect3DVertexBuffer8511!!.Unlock(), false)) {
            aBoolean8510 = false
            return true
        }
        if (i != 6331) return false
        return false
    }

    fun method3519(i: Int): Int {
        if (i != 3545) method21(-87)
        return aByte8513.toInt()
    }
}
