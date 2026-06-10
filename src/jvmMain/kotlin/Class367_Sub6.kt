import jagdx.IDirect3DVertexShader

class Class367_Sub6 internal constructor(private var aClass378_7340: Class378, class45: Class45?, private var aClass269_7339: Class269?) : Class367(aClass378_7340) {
    private val anIDirect3DVertexShader7341: IDirect3DVertexShader?

    override fun method3527(i: Int, interface18: Interface18?, i_0_: Int) {
        if (i_0_ != -16776) method3526(30, 118, -114)
    }

    override fun method3521(bool: Boolean, i: Byte) {
        this.aHa_Sub3_4479.method3874(Class348_Sub23_Sub2.aClass229_9011, 127, Class248.aClass229_3196)
        if (i.toInt() != -103) method3524(55)
    }

    override fun method3526(i: Int, i_1_: Int, i_2_: Int) {
        val idirect3ddevice = aClass378_7340!!.anIDirect3DDevice9810
        if (aClass269_7339!!.aBoolean3458) {
            val f = (((this.aHa_Sub3_4479.anInt8146) % 4000).toFloat() / 4000.0f)
            this.aHa_Sub3_4479.method3850((-52).toByte(), aClass269_7339!!.anInterface18_Impl1_3452)
            idirect3ddevice!!.a(11, f, 0.0f, 0.0f, 0.0f)
        } else {
            val i_3_ = 16 * ((this.aHa_Sub3_4479.anInt8146) % 4000) / 4000
            this.aHa_Sub3_4479.method3850(122.toByte(), (aClass269_7339!!.anInterface18_Impl3Array3459!![i_3_]))
            idirect3ddevice!!.a(11, 0.0f, 0.0f, 0.0f, 0.0f)
        }
        if (i != 10756) aClass269_7339 = null
    }

    init {
        if (null == class45 || !aClass269_7339!!.method2039(123) || (257 > (aClass378_7340!!.aD3DCAPS9791!!.VertexShaderVersion and 0xffff))) anIDirect3DVertexShader7341 = null
        else anIDirect3DVertexShader7341 = aClass378_7340!!.anIDirect3DDevice9810!!.b(class45.method391("dx", "transparent_water", -29832))
    }

    override fun method3523(i: Byte) {
        if (anIDirect3DVertexShader7341 != null) {
            val idirect3ddevice = aClass378_7340.anIDirect3DDevice9810
            val class101_sub2 = aClass378_7340.method3948(-22036)
            idirect3ddevice!!.a(0, class101_sub2.method924(i.toInt() xor 0x7, aFloatArray7338))
        }
    }

    override fun method3520(i: Byte) {
        if (i.toInt() == 87) {
            aClass378_7340!!.method3957(null, (-89).toByte())
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
            this.aHa_Sub3_4479.method3849(47.toByte(), 1, Class285_Sub2.aClass70_8503)
            this.aHa_Sub3_4479.method3849(47.toByte(), 2, Class348_Sub40_Sub39.aClass70_9485)
            this.aHa_Sub3_4479.method3852(9, true)
        }
    }

    override fun method3524(i: Int) {
        if (anIDirect3DVertexShader7341 != null) {
            val idirect3ddevice = aClass378_7340!!.anIDirect3DDevice9810
            idirect3ddevice!!.a(4, this.aHa_Sub3_4479.method3835(aFloatArray7338, -104))
        }
    }

    override fun method3532(i: Int) {
        if (anIDirect3DVertexShader7341 != null) {
            val idirect3ddevice = aClass378_7340!!.anIDirect3DDevice9810
            val class101_sub2 = this.aHa_Sub3_4479.method3848(5)!!
            class101_sub2.method915(aFloatArray7338, i xor 0x28b8)
            aFloatArray7338[0] *= 0.25f
            aFloatArray7338[2] *= 0.25f
            aFloatArray7338[3] *= 0.25f
            aFloatArray7338[6] *= 0.25f
            aFloatArray7338[5] *= 0.25f
            aFloatArray7338[1] *= 0.25f
            aFloatArray7338[7] *= 0.25f
            aFloatArray7338[4] *= 0.25f
            idirect3ddevice!!.SetVertexShaderConstantF(8, aFloatArray7338, 2)
        }
    }

    override fun method3530(i: Int): Boolean {
        if (i >= -57) method3522(-94)
        return anIDirect3DVertexShader7341 != null
    }

    override fun method3531(bool: Boolean) {
        if (null != anIDirect3DVertexShader7341) {
            val idirect3ddevice = aClass378_7340!!.anIDirect3DDevice9810
            val class101_sub2 = aClass378_7340!!.method3948(-22036)
            idirect3ddevice!!.a(0, class101_sub2.method924(11, aFloatArray7338))
        }
        if (bool) method3524(46)
    }

    override fun method3522(i: Int) {
        if (anIDirect3DVertexShader7341 != null) {
            val idirect3ddevice = aClass378_7340!!.anIDirect3DDevice9810
            if (this.aHa_Sub3_4479.anInt8091 <= 0) idirect3ddevice!!.a(10, 0.0f, 0.0f, 0.0f, 0.0f)
            else {
                val f = (this.aHa_Sub3_4479.aFloat8115)
                val f_4_ = (this.aHa_Sub3_4479.aFloat8173)
                val f_5_ = f_4_ - 512.0f
                idirect3ddevice!!.a(10, f_5_, 1.0f / (-f_5_ + f_4_), f_4_, 1.0f / (-f_4_ + f))
            }
            this.aHa_Sub3_4479.method3894(-28186, this.aHa_Sub3_4479.anInt8144)
        }
    }

    override fun method3525(i: Int, bool: Boolean) {
        if (i != 15192) method3531(true)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
        this.aHa_Sub3_4479.method3849(47.toByte(), 1, Class348_Sub40_Sub39.aClass70_9485)
        this.aHa_Sub3_4479.method3924(false, false, 2, Class285_Sub2.aClass70_8503, true)
        this.aHa_Sub3_4479.method3852(9, false)
        aClass378_7340!!.method3957(anIDirect3DVertexShader7341, (-89).toByte())
        method3523(12.toByte())
        method3532(10425)
        method3524(-14775)
        method3522(-16252)
    }

    companion object {
        private val aFloatArray7338 = FloatArray(16)
    }
}
