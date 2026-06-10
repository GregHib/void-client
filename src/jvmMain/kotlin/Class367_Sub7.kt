import jagdx.IDirect3DPixelShader
import jagdx.IDirect3DVertexShader
import kotlin.math.abs

class Class367_Sub7 internal constructor(private var aClass378_7346: Class378, class45: Class45?, private val aClass269_7348: Class269) : Class367(aClass378_7346) {
    private var anIDirect3DPixelShader7343: IDirect3DPixelShader? = null
    private var aBoolean7344 = false
    private var anIDirect3DVertexShader7345: IDirect3DVertexShader? = null
    private val aBoolean7347: Boolean

    override fun method3526(i: Int, i_0_: Int, i_1_: Int) {
        if (i != 10756) method3527(-80, null, 80)
        if (aBoolean7344) {
            val idirect3ddevice = aClass378_7346!!.anIDirect3DDevice9810
            val i_2_ = 1 shl (i_0_ and 0x3)
            val f = (1 shl ((0x38 and i_0_) shr 3)).toFloat() / 32.0f
            val i_3_ = i_1_ and 0xffff
            val f_4_ = ((i_1_ and 0x320d7) shr 16).toFloat() / 8.0f
            idirect3ddevice!!.a(14, (this.aHa_Sub3_4479.anInt8146 * i_2_ % 40000).toFloat() / 40000.0f, 0.0f, 0.0f, 0.0f)
            idirect3ddevice.a(15, f, 0.0f, 0.0f, 0.0f)
            idirect3ddevice.b(4, i_3_.toFloat(), 0.0f, 0.0f, 0.0f)
            idirect3ddevice.b(5, f_4_, 0.0f, 0.0f, 0.0f)
        }
    }

    override fun method3521(bool: Boolean, i: Byte) {
        if (i.toInt() != -103) aBoolean7344 = true
    }

    override fun method3532(i: Int) {
        if (aBoolean7344) {
            val idirect3ddevice = aClass378_7346!!.anIDirect3DDevice9810
            val class101_sub2 = this.aHa_Sub3_4479.method3848(i + -10420)!!
            idirect3ddevice!!.SetVertexShaderConstantF(12, class101_sub2.method915(aFloatArray7342!!, 1), 2)
        }
        if (i != 10425) anIDirect3DVertexShader7345 = null
    }

    override fun method3527(i: Int, interface18: Interface18?, i_5_: Int) {
        if (i_5_ != -16776) method3532(16)
    }

    override fun method3522(i: Int) {
        if (aBoolean7344) {
            val idirect3ddevice = aClass378_7346!!.anIDirect3DDevice9810
            if (this.aHa_Sub3_4479.anInt8091 <= 0) idirect3ddevice!!.a(16, 0.0f, 0.0f, 0.0f, 0.0f)
            else {
                val f = (this.aHa_Sub3_4479.aFloat8115)
                val f_6_ = (this.aHa_Sub3_4479.aFloat8173)
                idirect3ddevice!!.a(16, f, 1.0f / (f - f_6_), 0.0f, 0.0f)
            }
            idirect3ddevice.b(0, ((this.aHa_Sub3_4479.anInt8144 shr 16) and 0xff).toFloat() / 255.0f, ((this.aHa_Sub3_4479.anInt8144 shr 8) and 0xff).toFloat() / 255.0f, (this.aHa_Sub3_4479.anInt8144 and 0xff).toFloat() / 255.0f, 0.0f)
        }
    }

    init {
        if (null == class45 || !this.aHa_Sub3_4479.aBoolean8101 || !this.aHa_Sub3_4479.aBoolean8159 || (aClass378_7346!!.aD3DCAPS9791!!.VertexShaderVersion and 0xffff) < 257) {
            anIDirect3DVertexShader7345 = null
            aBoolean7347 = false
            anIDirect3DPixelShader7343 = null
        } else {
            anIDirect3DVertexShader7345 = (aClass378_7346!!.anIDirect3DDevice9810!!.b(class45.method391("dx", "environment_mapped_water_v", -29832)))
            anIDirect3DPixelShader7343 = (aClass378_7346!!.anIDirect3DDevice9810!!.a(class45.method391("dx", "environment_mapped_water_f", -29832)))
            aBoolean7347 = (anIDirect3DVertexShader7345 != null && null != anIDirect3DPixelShader7343 && aClass269_7348.method2041(49.toByte()))
        }
    }

    override fun method3525(i: Int, bool: Boolean) {
        if (i == 15192) {
            val interface18_impl2 = this.aHa_Sub3_4479.method3834(-16777216)
            if (aBoolean7347 && null != interface18_impl2) {
                val idirect3ddevice = aClass378_7346!!.anIDirect3DDevice9810
                aClass378_7346!!.method3957(anIDirect3DVertexShader7345, (-89).toByte())
                aClass378_7346!!.method3962(22927, anIDirect3DPixelShader7343)
                this.aHa_Sub3_4479.method3897(1, -4382)
                this.aHa_Sub3_4479.method3850(63.toByte(), interface18_impl2)
                this.aHa_Sub3_4479.method3897(0, -4382)
                this.aHa_Sub3_4479.method3850((-127).toByte(), aClass269_7348.anInterface18_Impl1_3455)
                aBoolean7344 = true
                method3531(false)
                method3532(10425)
                method3524(-14775)
                method3522(-16252)
                idirect3ddevice!!.b(1, -(this.aHa_Sub3_4479.aFloatArray8170[0]), -(this.aHa_Sub3_4479.aFloatArray8170[1]), -(this.aHa_Sub3_4479.aFloatArray8170[2]), 0.0f)
                idirect3ddevice.b(2, this.aHa_Sub3_4479.aFloat8180, this.aHa_Sub3_4479.aFloat8087, this.aHa_Sub3_4479.aFloat8168, 1.0f)
                idirect3ddevice.b(3, (928.0f * abs(this.aHa_Sub3_4479.aFloatArray8170[1]) + 96.0f), 0.0f, 0.0f, 0.0f)
            }
        }
    }

    override fun method3530(i: Int): Boolean {
        if (i > -57) anIDirect3DPixelShader7343 = null
        return aBoolean7347
    }

    override fun method3523(i: Byte) {
        if (aBoolean7344) {
            val idirect3ddevice = aClass378_7346!!.anIDirect3DDevice9810
            val class101_sub2 = aClass378_7346!!.method3948(-22036)
            idirect3ddevice!!.a(0, class101_sub2.method924(11, aFloatArray7342!!))
        }
        if (i.toInt() != 12) aFloatArray7342 = null
    }

    override fun method3520(i: Byte) {
        if (aBoolean7344) {
            aClass378_7346!!.method3957(null, (-89).toByte())
            aClass378_7346!!.method3962(22927, null)
            this.aHa_Sub3_4479.method3897(1, -4382)
            this.aHa_Sub3_4479.method3850((-98).toByte(), null)
            this.aHa_Sub3_4479.method3897(0, -4382)
            this.aHa_Sub3_4479.method3850((-124).toByte(), null)
            aBoolean7344 = false
        }
        if (i.toInt() != 87) method3531(true)
    }

    override fun method3524(i: Int) {
        if (i == -14775) {
            if (aBoolean7344) {
                val idirect3ddevice = aClass378_7346!!.anIDirect3DDevice9810
                idirect3ddevice!!.a(8, this.aHa_Sub3_4479.method3835(aFloatArray7342, i + 14651))
            }
        }
    }

    override fun method3531(bool: Boolean) {
        if (!bool) {
            if (aBoolean7344) {
                val idirect3ddevice = aClass378_7346!!.anIDirect3DDevice9810
                val class101_sub2 = aClass378_7346!!.method3887((-123).toByte())
                val class101_sub2_7_ = aClass378_7346!!.method3948(-22036)
                idirect3ddevice!!.a(0, class101_sub2_7_.method924(11, aFloatArray7342!!))
                idirect3ddevice.a(4, class101_sub2.method930(0, aFloatArray7342!!))
            }
        }
    }

    companion object {
        private var aFloatArray7342: FloatArray? = FloatArray(16)
    }
}
