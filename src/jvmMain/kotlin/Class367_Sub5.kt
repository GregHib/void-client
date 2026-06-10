import jagdx.IDirect3DVertexShader

class Class367_Sub5 internal constructor(private var aClass378_7328: Class378, class45: Class45?) : Class367(aClass378_7328) {
    private var aBoolean7326 = false
    private val aBoolean7329: Boolean
    private var anIDirect3DVertexShader7330: IDirect3DVertexShader? = null
    private var anInterface18_Impl3_7331: Interface18_Impl3? = null
    private var anIDirect3DVertexShader7332: IDirect3DVertexShader? = null
    private var anIDirect3DVertexShader7333: IDirect3DVertexShader? = null
    private var anIDirect3DVertexShader7334: IDirect3DVertexShader? = null
    private var anIDirect3DVertexShader7335: IDirect3DVertexShader? = null
    private var aBoolean7336 = false

    init {
        if (null == class45 || ((aClass378_7328!!.aD3DCAPS9791!!.VertexShaderVersion) and 0xffff) < 257) aBoolean7329 = false
        else {
            anIDirect3DVertexShader7332 = aClass378_7328!!.anIDirect3DDevice9810!!.b(class45.method391("dx", "uw_ground_unlit", -29832))
            anIDirect3DVertexShader7330 = aClass378_7328!!.anIDirect3DDevice9810!!.b(class45.method391("dx", "uw_ground_lit", -29832))
            anIDirect3DVertexShader7334 = aClass378_7328!!.anIDirect3DDevice9810!!.b(class45.method391("dx", "uw_model_unlit", -29832))
            anIDirect3DVertexShader7335 = aClass378_7328!!.anIDirect3DDevice9810!!.b(class45.method391("dx", "uw_model_lit", -29832))
            if ((null != anIDirect3DVertexShader7332) and (anIDirect3DVertexShader7330 != null) and (anIDirect3DVertexShader7334 != null) and (null != anIDirect3DVertexShader7335)) {
                anInterface18_Impl3_7331 = (this.aHa_Sub3_4479.method3839(1, 2, -15137, false, intArrayOf(0, -1)))
                anInterface18_Impl3_7331!!.method66(false, false, 25688)
                aBoolean7329 = true
            } else aBoolean7329 = false
        }
    }

    override fun method3528(i: Int) {
        if (i < 45) aFloatArray7327 = null
        val idirect3ddevice = aClass378_7328!!.anIDirect3DDevice9810
        val i_0_ = this.aHa_Sub3_4479.method3941(-103)
        val class101_sub2 = this.aHa_Sub3_4479.method3887(61.toByte())
        val idirect3dvertexshader: IDirect3DVertexShader?
        if (aBoolean7336) idirect3dvertexshader = (if (i_0_ != 2147483647) anIDirect3DVertexShader7335 else anIDirect3DVertexShader7330)
        else idirect3dvertexshader = (if (i_0_ == 2147483647) anIDirect3DVertexShader7332 else anIDirect3DVertexShader7334)
        if (anIDirect3DVertexShader7333 != idirect3dvertexshader) {
            anIDirect3DVertexShader7333 = idirect3dvertexshader
            aClass378_7328!!.method3957(idirect3dvertexshader, (-89).toByte())
            method3545(121)
            method3524(-14775)
            method3532(10425)
            method3523(12.toByte())
            method3531(false)
            method3522(-16252)
        }
        class101_sub2.method919(0.0f, aFloatArray7327!!, -1.0f, 0.0f, i_0_.toFloat(), (-120).toByte())
        idirect3ddevice!!.a(12, aFloatArray7327!!)
    }

    override fun method3526(i: Int, i_1_: Int, i_2_: Int) {
        if (i != 10756) method3531(false)
    }

    override fun method3520(i: Byte) {
        if (i.toInt() != 87) method3527(55, null, -69)
        this.aHa_Sub3_4479.method3897(1, -4382)
        this.aHa_Sub3_4479.method3850(82.toByte(), null)
        this.aHa_Sub3_4479.method3874(Class167.aClass229_2207, i + 25, Class167.aClass229_2207)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
        this.aHa_Sub3_4479.method3849(47.toByte(), 2, Class348_Sub40_Sub39.aClass70_9485)
        this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
        this.aHa_Sub3_4479.method3897(0, i.toInt() xor 0x114a.inv())
        if (aBoolean7326) {
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
            this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
            aBoolean7326 = false
        }
        if (null != anIDirect3DVertexShader7333) {
            aClass378_7328!!.method3957(null, (-89).toByte())
            anIDirect3DVertexShader7333 = null
        }
    }

    override fun method3530(i: Int): Boolean {
        return aBoolean7329
    }

    override fun method3523(i: Byte) {
        if (i.toInt() != 12) method3521(false, (-54).toByte())
        if (null != anIDirect3DVertexShader7333) {
            val idirect3ddevice = aClass378_7328!!.anIDirect3DDevice9810
            val class101_sub2 = aClass378_7328!!.method3948(i + -22048)!!
            idirect3ddevice!!.a(0, class101_sub2.method924(11, aFloatArray7337))
        }
    }

    override fun method3524(i: Int) {
        if (i == -14775) {
            if (null != anIDirect3DVertexShader7333) {
                val idirect3ddevice = aClass378_7328!!.anIDirect3DDevice9810
                idirect3ddevice!!.a(4, this.aHa_Sub3_4479.method3835(aFloatArray7337, -101))
            }
        }
    }

    override fun method3527(i: Int, interface18: Interface18?, i_3_: Int) {
        if (interface18 == null) {
            if (!aBoolean7326) {
                this.aHa_Sub3_4479.method3850((-43).toByte(), (this.aHa_Sub3_4479.anInterface18_8147))
                this.aHa_Sub3_4479.method3923(true, 1)
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class318_Sub1_Sub2.aClass70_8737)
                this.aHa_Sub3_4479.method3885(0, true, Class318_Sub1_Sub2.aClass70_8737)
                aBoolean7326 = true
            }
        } else {
            if (aBoolean7326) {
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
                this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
                aBoolean7326 = false
            }
            this.aHa_Sub3_4479.method3850((-103).toByte(), interface18)
            this.aHa_Sub3_4479.method3923(true, i)
        }
        if (i_3_ != -16776) anIDirect3DVertexShader7332 = null
    }

    override fun method3522(i: Int) {
        if (i != -16252) method3521(true, (-11).toByte())
        if (null != anIDirect3DVertexShader7333) {
            val idirect3ddevice = aClass378_7328!!.anIDirect3DDevice9810
            val i_4_ = this.aHa_Sub3_4479.XA()
            val i_5_ = this.aHa_Sub3_4479.i()
            val f = -(0.125f * (i_4_ + -i_5_).toFloat()) + i_4_.toFloat()
            val f_6_ = i_4_.toFloat() - (-i_5_ + i_4_).toFloat() * 0.25f
            idirect3ddevice!!.a(10, f_6_, 1.0f / (-f_6_ + f), f, 1.0f / (-f + i_4_.toFloat()))
            idirect3ddevice.a(11, 1.0f / this.aHa_Sub3_4479.method3833((-58).toByte()).toFloat(), this.aHa_Sub3_4479.method3826((-70).toByte()).toFloat() / 255.0f, this.aHa_Sub3_4479.aFloat8115, 1.0f / (-(this.aHa_Sub3_4479.aFloat8173) + (this.aHa_Sub3_4479.aFloat8115)))
            this.aHa_Sub3_4479.method3894(-28186, this.aHa_Sub3_4479.method3863(-103))
        }
    }

    override fun method3525(i: Int, bool: Boolean) {
        aBoolean7336 = bool
        this.aHa_Sub3_4479.method3897(1, -4382)
        this.aHa_Sub3_4479.method3850(95.toByte(), anInterface18_Impl3_7331)
        if (i != 15192) method3520((-41).toByte())
        this.aHa_Sub3_4479.method3874(Class328_Sub3.aClass229_6519, 105, Class248.aClass229_3196)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class348_Sub40_Sub39.aClass70_9485)
        this.aHa_Sub3_4479.method3924(true, false, 2, Class342.aClass70_4247, false)
        this.aHa_Sub3_4479.method3885(0, true, Class318_Sub1_Sub2.aClass70_8737)
        this.aHa_Sub3_4479.method3897(0, -4382)
        method3528(106)
    }

    override fun method3521(bool: Boolean, i: Byte) {
        if (i.toInt() != -103) aBoolean7326 = true
    }

    private fun method3545(i: Int) {
        if (i > 95) {
            if (null != anIDirect3DVertexShader7333 && aBoolean7336) {
                val class101_sub2 = this.aHa_Sub3_4479.method3854(111.toByte())
                val idirect3ddevice = aClass378_7328!!.anIDirect3DDevice9810
                idirect3ddevice!!.a(13, ((this.aHa_Sub3_4479.aFloat8093) * (this.aHa_Sub3_4479.aFloat8180)), ((this.aHa_Sub3_4479.aFloat8087) * (this.aHa_Sub3_4479.aFloat8093)), ((this.aHa_Sub3_4479.aFloat8168) * (this.aHa_Sub3_4479.aFloat8093)), 1.0f)
                idirect3ddevice.a(14, ((this.aHa_Sub3_4479.aFloat8174) * (this.aHa_Sub3_4479.aFloat8180)), ((this.aHa_Sub3_4479.aFloat8087) * (this.aHa_Sub3_4479.aFloat8174)), ((this.aHa_Sub3_4479.aFloat8174) * (this.aHa_Sub3_4479.aFloat8168)), 1.0f)
                idirect3ddevice.a(16, ((this.aHa_Sub3_4479.aFloat8180) * (this.aHa_Sub3_4479.aFloat8186)), ((this.aHa_Sub3_4479.aFloat8087) * (this.aHa_Sub3_4479.aFloat8186)), ((this.aHa_Sub3_4479.aFloat8168) * (this.aHa_Sub3_4479.aFloat8186)), 1.0f)
                class101_sub2.method923((this.aHa_Sub3_4479.aFloatArray8170[0]), (this.aHa_Sub3_4479.aFloatArray8170[1]), (-97).toByte(), (this.aHa_Sub3_4479.aFloatArray8170[2]), aFloatArray7327!!)
                idirect3ddevice.SetVertexShaderConstantF(15, aFloatArray7327, 1)
                class101_sub2.method923((this.aHa_Sub3_4479.aFloatArray8102[0]), (this.aHa_Sub3_4479.aFloatArray8102[1]), (-99).toByte(), (this.aHa_Sub3_4479.aFloatArray8102[2]), aFloatArray7327!!)
                idirect3ddevice.SetVertexShaderConstantF(17, aFloatArray7327, 1)
            }
        }
    }

    override fun method3531(bool: Boolean) {
        if (bool) method3528(89)
        if (anIDirect3DVertexShader7333 != null) {
            val idirect3ddevice = aClass378_7328!!.anIDirect3DDevice9810
            val class101_sub2 = aClass378_7328!!.method3948(-22036)
            idirect3ddevice!!.a(0, class101_sub2.method924(11, aFloatArray7337))
        }
    }

    override fun method3532(i: Int) {
        if (i != 10425) method3545(-24)
        if (null != anIDirect3DVertexShader7333) {
            val idirect3ddevice = aClass378_7328!!.anIDirect3DDevice9810
            val class101_sub2 = this.aHa_Sub3_4479.method3848(5)
            idirect3ddevice!!.SetVertexShaderConstantF(8, class101_sub2.method915(aFloatArray7337, i + -10424), 2)
        }
    }

    companion object {
        private var aFloatArray7327: FloatArray? = FloatArray(4)
        private val aFloatArray7337 = FloatArray(16)
    }
}
