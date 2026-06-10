import jaclib.peer.hb
import jagdx.*
import jagdx.IDirect3D.Companion.a
import jagdx.ue.a
import java.awt.Canvas
import java.awt.Rectangle

class Class378 private constructor(i: Int, i_38_: Int, canvas: Canvas?, var_hb: hb, idirect3d: IDirect3D?, idirect3ddevice: IDirect3DDevice, class53: Class53?, d3dpresent_parameters: D3DPRESENT_PARAMETERS?, d3dcaps: D3DCAPS?, var_d: d?, class45: Class45?, i_39_: Int) : ha_Sub3(canvas, class53, var_d, class45, i_39_, 0) {
    private val aBooleanArray9784: BooleanArray
    private var anInt9785 = 0
    private var aBooleanArray9786: BooleanArray?
    private var aClass53_9787: Class53? = null
    var aHb9788: hb? = null
    private val aD3DLIGHT9789: D3DLIGHT
    @JvmField
    var aD3DCAPS9791: D3DCAPS? = null
    @JvmField
    var aBoolean9792: Boolean = false
    private var anIDirect3D9793: IDirect3D? = null
    private var anIDirect3DVertexShader9794: IDirect3DVertexShader? = null
    private var aClass209Array9795: Array<Class209?>?
    private var aD3DLIGHT9796: D3DLIGHT? = null
    @JvmField
    var aBoolean9798: Boolean = false
    private val anInt9799: Int
    private var aD3DPRESENT_PARAMETERS9800: D3DPRESENT_PARAMETERS? = null
    private var aBoolean9801 = false
    @JvmField
    var aBoolean9802: Boolean = false
    @JvmField
    var aPixelBuffer9803: PixelBuffer? = null
    private val aBooleanArray9804: BooleanArray
    private var anIntArray9805: IntArray?
    private val aBooleanArray9806: BooleanArray
    private var anInt9807 = 0
    private val aD3DLIGHT9808: D3DLIGHT
    @JvmField
    var anIDirect3DDevice9810: IDirect3DDevice? = null
    @JvmField
    var aGeometryBuffer9811: GeometryBuffer? = null

    override fun method3928(i: Int) {
        aD3DLIGHT9789.SetAmbient(this.aFloat8180 * this.aFloat8093, this.aFloat8093 * this.aFloat8087, this.aFloat8168 * this.aFloat8093, i.toFloat())
        aBoolean9801 = false
    }

    override fun method3829(class70: Class70?, i: Int, i_0_: Byte, bool: Boolean) {
        if (i_0_.toInt() == 80) {
            var i_1_ = 0
            val i_2_ = i
            val i_3_: Int
            while_232_@ do {
                do {
                    if (i_2_ == 1) {
                        i_3_ = 6
                        break@while_232_
                    } else if (i_2_ != 2) break
                    i_3_ = 27
                    break@while_232_
                } while (false)
                i_3_ = 5
            } while (false)
            if (bool) i_1_ = i_1_ or 0x10
            this.anIDirect3DDevice9810!!.SetTextureStageState(this.anInt8175, i_3_, method3961(class70, i_0_ + -78) or i_1_)
        }
    }

    override fun na(i: Int, i_4_: Int, i_5_: Int, i_6_: Int): IntArray? {
        var `is`: IntArray? = null
        val idirect3dsurface = this.anIDirect3DDevice9810!!.c(0)
        val idirect3dsurface_7_ = this.anIDirect3DDevice9810!!.a(i_5_, i_6_, 21, 0, 0, true)
        if (a((this.anIDirect3DDevice9810!!.StretchRect(idirect3dsurface, i, i_4_, i_5_, i_6_, idirect3dsurface_7_, 0, 0, i_5_, i_6_, 0)), false) && a(idirect3dsurface_7_.LockRect(0, 0, i_5_, i_6_, 16, (this.aPixelBuffer9803)), false)) {
            `is` = IntArray(i_6_ * i_5_)
            val i_8_ = this.aPixelBuffer9803!!.rowPitch
            if (i_8_ != 4 * i_5_) {
                var i_9_ = 0
                while (i_6_ > i_9_) {
                    this.aPixelBuffer9803!!.b(`is`, i_9_ * i_5_, i_9_ * i_8_, i_5_)
                    i_9_++
                }
            } else this.aPixelBuffer9803!!.b(`is`, 0, 0, i_5_ * i_6_)
            idirect3dsurface_7_.UnlockRect()
        }
        idirect3dsurface.a(9275)
        idirect3dsurface_7_.a(9275)
        return `is`
    }

    override fun method3868(bool: Boolean) {
        if (bool) method3832(-4, (-39).toByte())
    }

    override fun method3862(i: Int, class130: Class130?) {
        val var_dxVertexLayout = class130 as dxVertexLayout
        this.anIDirect3DDevice9810!!.SetVertexDeclaration(var_dxVertexLayout.anIDirect3DVertexDeclaration5803)
        if (i != 0) method3910((-110).toByte(), 113)
    }

    fun method3954(i: Int, class310_sub2: Class310_Sub2) {
        method3956((-56).toByte(), class310_sub2)
        if (aBooleanArray9786!![this.anInt8175] == !class310_sub2.aBoolean6334) {
            this.anIDirect3DDevice9810!!.SetSamplerState(this.anInt8175, 1, if (!class310_sub2.aBoolean6334) 3 else 1)
            aBooleanArray9786!![this.anInt8175] = class310_sub2.aBoolean6334
        }
        if (i == 13700) {
            if (!aBooleanArray9806[this.anInt8175] == class310_sub2.aBoolean6335) {
                this.anIDirect3DDevice9810!!.SetSamplerState(this.anInt8175, 2, if (!class310_sub2.aBoolean6335) 3 else 1)
                aBooleanArray9806[this.anInt8175] = class310_sub2.aBoolean6335
            }
        }
    }

    override fun method3841(i: Byte) {
        this.anIDirect3DDevice9810!!.a(14, ((this.aBoolean8124) && (this.aBoolean8118)))
        if (i.toInt() != -116) method3960(true)
    }

    override fun method3698() {
        /* empty */
    }

    override fun method3872(i: Int, i_10_: Int, class304: Class304?, bool: Boolean, i_11_: Int, `is`: ByteArray?): Interface18_Impl1? {
        if (bool != true) return null
        return Class310_Sub3(this, class304!!, i_10_, i_11_, i, `is`)
    }

    override fun method3827(i: Byte) {
        if (i > -30) aClass53_9787 = null
        this.anIDirect3DDevice9810!!.a(28, (this.aBoolean8148 && this.aBoolean8123 && this.anInt8091 >= 0))
    }

    override fun method3901(i: Byte) {
        if (this.aBoolean8069) {
            aFloatArray9797!![1] = 0.0f
            aFloatArray9797!![2] = 0.0f
            aFloatArray9797!![15] = 1.0f
            aFloatArray9797!![3] = 0.0f
            aFloatArray9797!![9] = 0.0f
            aFloatArray9797!![6] = 0.0f
            aFloatArray9797!![0] = 1.0f
            aFloatArray9797!![7] = 0.0f
            aFloatArray9797!![11] = 0.0f
            aFloatArray9797!![13] = 0.0f
            aFloatArray9797!![10] = 1.0f
            aFloatArray9797!![8] = 0.0f
            aFloatArray9797!![12] = 0.0f
            aFloatArray9797!![5] = 1.0f
            aFloatArray9797!![14] = 0.0f
            aFloatArray9797!![4] = 0.0f
        } else this.aClass101_Sub2_8074.method918(aFloatArray9797!!, 0)
        if (i < -18) this.anIDirect3DDevice9810!!.SetTransform(256, aFloatArray9797)
    }

    override fun method3926(i: Byte, bool: Boolean) {
        if (i < 34) this.aBoolean9798 = false
        this.anIDirect3DDevice9810!!.a(161, bool)
    }

    override fun method3924(bool: Boolean, bool_12_: Boolean, i: Int, class70: Class70?, bool_13_: Boolean) {
        val i_14_ = i
        val i_15_: Int
        while_233_@ do {
            do {
                if (1 == i_14_) {
                    i_15_ = 3
                    break@while_233_
                } else if (i_14_ != 2) break
                i_15_ = 26
                break@while_233_
            } while (false)
            i_15_ = 2
        } while (false)
        var i_16_ = 0
        if (bool) i_16_ = i_16_ or 0x20
        if (bool_12_) aD3DPRESENT_PARAMETERS9800 = null
        if (bool_13_) i_16_ = i_16_ or 0x10
        this.anIDirect3DDevice9810!!.SetTextureStageState(this.anInt8175, i_15_, i_16_ or method3961(class70, 2))
    }

    override fun method3892(i: Int) {
        aD3DLIGHT9789.SetDirection(-this.aFloatArray8170[0], -this.aFloatArray8170[1], -this.aFloatArray8170[2])
        aD3DLIGHT9796!!.SetDirection(-this.aFloatArray8102[i], -this.aFloatArray8102[1], -this.aFloatArray8102[2])
        aBoolean9801 = false
    }

    override fun method3624(i: Int, i_17_: Int): Interface13? {
        return null
    }

    override fun method3910(i: Byte, i_18_: Int) {
        if (i.toInt() != -26) this.aD3DCAPS9791 = null
        this.anIDirect3DDevice9810!!.SetTextureStageState(this.anInt8175, 11, i_18_)
    }

    override fun method3911(canvas: Canvas?, i: Int, `object`: Any?) {
        if (i != 1) anIDirect3D9793 = null
    }

    fun method3956(i: Byte, class310: Class310) {
        this.anIDirect3DDevice9810!!.SetTexture(this.anInt8175, class310.method2314(17723))
        if (i <= -53) {
            if (aClass209Array9795!![this.anInt8175] == class310.aClass209_3894) {
                if (aBooleanArray9804[this.anInt8175] == !class310.aBoolean3892) {
                    this.anIDirect3DDevice9810!!.SetSamplerState(this.anInt8175, 7, (if (class310.aBoolean3892) method3952(class310.aClass209_3894, 86.toByte()) else 0))
                    aBooleanArray9804[this.anInt8175] = class310.aBoolean3892
                }
            } else {
                val i_22_: Int = method3952(class310.aClass209_3894, 82.toByte())
                this.anIDirect3DDevice9810!!.SetSamplerState(this.anInt8175, 6, i_22_)
                this.anIDirect3DDevice9810!!.SetSamplerState(this.anInt8175, 5, i_22_)
                aClass209Array9795!![this.anInt8175] = class310.aClass209_3894
                if (aBooleanArray9804[this.anInt8175] != class310.aBoolean3892) {
                    this.anIDirect3DDevice9810!!.SetSamplerState(this.anInt8175, 7, (if (!class310.aBoolean3892) 0 else method3952(class310.aClass209_3894, 68.toByte())))
                    aBooleanArray9804[this.anInt8175] = class310.aBoolean3892
                }
            }
            if (!aBooleanArray9784[this.anInt8175]) {
                aBooleanArray9784[this.anInt8175] = true
                method3935(-123)
                method3920(10)
            }
        }
    }

    override fun method3665(i: Int, i_23_: Int): Interface3? {
        return null
    }

    override fun method3813(bool: Boolean) {
        this.anIDirect3DDevice9810!!.SetTransform(3, this.aFloatArray8135)
        if (bool != true) method3963(-7, null)
    }

    fun method3957(idirect3dvertexshader: IDirect3DVertexShader?, i: Byte) {
        if (i.toInt() == -89) {
            anIDirect3DVertexShader9794 = idirect3dvertexshader
            this.anIDirect3DDevice9810!!.SetVertexShader(idirect3dvertexshader)
            method3940(1)
        }
    }

    override fun method3938(class21: Class21?, i: Int, interface5_impl2: Interface5_Impl2?, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int) {
        this.anIDirect3DDevice9810!!.SetIndices((interface5_impl2 as Class142).anIDirect3DIndexBuffer8517)
        this.anIDirect3DDevice9810!!.DrawIndexedPrimitive(Companion.method3953(class21, (-111).toByte()), 0, i_24_, i_26_, i_25_, i)
        if (i_27_ < 46) method3931(true, null, null)
    }

    override fun method3634(interface3: Interface3?, interface13: Interface13?): Interface4? {
        return null
    }

    override fun method3672() {
        /* empty */
    }

    override fun method3888(i: Int) {
        if (i != 6259) method3882((-77).toByte())
        this.anIDirect3DDevice9810!!.SetScissorRect(this.anInt8181 - -this.anInt8106, this.anInt8109 - -this.anInt8165, this.anInt8183, this.anInt8096)
    }

    @Throws(Exception_Sub1::class)
    override fun method3707(rectangles: Array<Rectangle?>?, i: Int, i_28_: Int, i_29_: Int) {
        method3626(i_28_, i_29_)
    }

    override fun method3931(bool: Boolean, class304: Class304?, class68: Class68?): Boolean {
        val d3ddisplaymode = D3DDISPLAYMODE()
        if (bool != true) aBooleanArray9786 = null
        return (a(anIDirect3D9793!!.a(anInt9799, d3ddisplaymode), !bool) && a((anIDirect3D9793!!.CheckDeviceFormat(anInt9799, anInt9807, d3ddisplaymode.Format, 0, 4, method3958(22, class68, class304))), false))
    }

    override fun method3881(`object`: Any?, i: Byte, canvas: Canvas?) {
        if (i.toInt() == 99) aClass53_9787 = `object` as Class53?
    }

    override fun method3842(bool: Boolean) {
        val f = (if (!this.aBoolean8110) 0.0f else this.aFloat8174)
        val f_30_ = (if (!this.aBoolean8110) 0.0f else -this.aFloat8186)
        aD3DLIGHT9789.SetDiffuse(f * this.aFloat8180, this.aFloat8087 * f, f * this.aFloat8168, 0.0f)
        if (bool == true) {
            aD3DLIGHT9796!!.SetDiffuse(this.aFloat8180 * f_30_, this.aFloat8087 * f_30_, this.aFloat8168 * f_30_, 0.0f)
            aBoolean9801 = false
        }
    }

    override fun method3666(): Boolean {
        return false
    }

    override fun method3633() {
        val idirect3deventquery = this.anIDirect3DDevice9810!!.b()
        if (a(idirect3deventquery!!.Issue(), false)) {
            while (true) {
                val i = idirect3deventquery.IsSignaled()
                if (i != 1) break
                Thread.yield()
            }
        }
        idirect3deventquery.a(9275)
    }

    override fun F(i: Int, i_31_: Int) {
        /* empty */
    }

    override fun method3945(i: Int) {
        this.anIDirect3DDevice9810!!.SetRenderState(60, this.anInt8119)
        if (i > -107) this.aBoolean9802 = false
    }

    override fun method3706(class299: Class299?, class299_32_: Class299?, f: Float, class299_33_: Class299?): Class299? {
        return if (0.5f > f) class299 else class299_32_
    }

    override fun method3647(bool: Boolean) {
        /* empty */
    }

    override fun method3823(i: Byte) {
        val i_34_ = -115 % ((i - -39) / 62)
        var i_35_: Int
        i_35_ = 0
        while (this.anInt8151 > i_35_) {
            val class348_sub1 = this.aClass348_Sub1Array8132[i_35_]!!
            val i_36_ = i_35_ - -2
            val i_37_ = class348_sub1.method2720(-1)
            val f = class348_sub1.method2721(-115) / 255.0f
            aD3DLIGHT9808.SetPosition(class348_sub1.method2724(-1).toFloat(), class348_sub1.method2722(123).toFloat(), class348_sub1.method2717(115.toByte()).toFloat())
            aD3DLIGHT9808.SetDiffuse(f * ((i_37_ and 0xff34ed) shr 16).toFloat(), (0xff and (i_37_ shr 8)).toFloat() * f, f * (i_37_ and 0xff).toFloat(), 0.0f)
            aD3DLIGHT9808.SetAttenuation(0.0f, 0.0f, 1.0f / (class348_sub1.method2723(-1) * class348_sub1.method2723(-1)).toFloat())
            aD3DLIGHT9808.SetRange(class348_sub1.method2723(-1).toFloat())
            this.anIDirect3DDevice9810!!.SetLight(i_36_, aD3DLIGHT9808)
            this.anIDirect3DDevice9810!!.LightEnable(i_36_, true)
            i_35_++
        }
        while ( /**/i_35_ < this.anInt8122) {
            this.anIDirect3DDevice9810!!.LightEnable(i_35_ - -2, false)
            i_35_++
        }
        super.method3823(57.toByte())
    }

    override fun method3819(i: Byte) {
        if (aBooleanArray9784[this.anInt8175]) {
            aBooleanArray9784[this.anInt8175] = false
            this.anIDirect3DDevice9810!!.SetTexture(this.anInt8175, null)
            method3935(-110)
            method3920(10)
        }
        if (i >= -19) method3855(null, -78, 86, null, false, 82, 55, -34)
    }

    init {
        try {
            this.aHb9788 = var_hb
            aD3DPRESENT_PARAMETERS9800 = d3dpresent_parameters
            anInt9807 = i_38_
            anIDirect3D9793 = idirect3d
            anInt9799 = i
            aClass53_9787 = class53
            this.anIDirect3DDevice9810 = idirect3ddevice
            this.aD3DCAPS9791 = d3dcaps
            aD3DLIGHT9789 = D3DLIGHT(this.aHb9788)
            aD3DLIGHT9796 = D3DLIGHT(this.aHb9788)
            aD3DLIGHT9808 = D3DLIGHT(this.aHb9788)
            this.aPixelBuffer9803 = PixelBuffer(this.aHb9788)
            this.aGeometryBuffer9811 = GeometryBuffer(this.aHb9788)
            GeometryBuffer(this.aHb9788)
            this.aBoolean8101 = (0x800 and this.aD3DCAPS9791!!.TextureCaps) != 0
            this.aBoolean9798 = (0x4000 and this.aD3DCAPS9791!!.TextureCaps) != 0
            this.aBoolean9792 = (0x2 and this.aD3DCAPS9791!!.TextureCaps) == 0
            this.aBoolean9802 = (this.aD3DCAPS9791!!.TextureCaps and 0x10000) != 0
            this.anInt8138 = (if (this.aD3DCAPS9791!!.MaxActiveLights <= 0) 8 else this.aD3DCAPS9791!!.MaxActiveLights)
            this.aBoolean8159 = (this.aD3DCAPS9791!!.TextureCaps and 0x2000) != 0
            this.anInt8090 = this.aD3DCAPS9791!!.MaxSimultaneousTextures
            this.aBoolean8182 = (this.anInt8117 > 0 || ((anIDirect3D9793!!.CheckDeviceMultiSampleType(anInt9799, anInt9807, aD3DPRESENT_PARAMETERS9800!!.BackBufferFormat, true, 2)) == 0))
            aBooleanArray9806 = BooleanArray(this.anInt8090)
            aBooleanArray9804 = BooleanArray(this.anInt8090)
            aBooleanArray9784 = BooleanArray(this.anInt8090)
            aClass209Array9795 = arrayOfNulls<Class209>(this.anInt8090)
            anIntArray9805 = IntArray(this.anInt8090)
            aBooleanArray9786 = BooleanArray(this.anInt8090)
            this.anIDirect3DDevice9810!!.BeginScene()
        } catch (throwable: Throwable) {
            throwable.printStackTrace()
            method3635((-39).toByte())
            throw RuntimeException("")
        }
    }

    override fun method3898(i: Int) {
        if (i != 12) method3634(null, null)
        if (this.aClass196_8184.method1450(-32)) this.aClass101_Sub2_8083.method918(aFloatArray9797!!, 0)
        else {
            aFloatArray9797!![1] = 0.0f
            aFloatArray9797!![7] = 0.0f
            aFloatArray9797!![12] = 0.0f
            aFloatArray9797!![0] = 1.0f
            aFloatArray9797!![5] = 1.0f
            aFloatArray9797!![13] = 0.0f
            aFloatArray9797!![2] = 0.0f
            aFloatArray9797!![11] = 0.0f
            aFloatArray9797!![9] = 0.0f
            aFloatArray9797!![10] = 1.0f
            aFloatArray9797!![14] = 0.0f
            aFloatArray9797!![8] = 0.0f
            aFloatArray9797!![4] = 0.0f
            aFloatArray9797!![15] = 1.0f
            aFloatArray9797!![6] = 0.0f
            aFloatArray9797!![3] = 0.0f
        }
        this.anIDirect3DDevice9810!!.SetTransform(2, aFloatArray9797)
    }

    override fun method3652() {
        this.aHb9788!!.a(13.toByte())
        super.method3652()
    }

    override fun method3840(i: Int, bool: Boolean): Interface5_Impl2 {
        if (i != -28633) method3937(102.toByte())
        return Class142(this, Class68.aClass68_1184, bool)
    }

    override fun GA(i: Int) {
        this.anIDirect3DDevice9810!!.Clear(1, i, 0.0f, 0)
    }

    override fun I(): Int {
        return 0
    }

    override fun method3851(i: Int) {
        this.aFloat8115 = (this.anInt8154 + -this.anInt8105).toFloat()
        this.aFloat8173 = (-this.anInt8091.toFloat() + this.aFloat8115)
        if (this.aFloat8173 < this.anInt8095.toFloat()) this.aFloat8173 = this.anInt8095.toFloat()
        this.anIDirect3DDevice9810!!.a(36, this.aFloat8173)
        if (i != 25644) aD3DLIGHT9796 = null
        this.anIDirect3DDevice9810!!.a(37, this.aFloat8115)
        this.anIDirect3DDevice9810!!.SetRenderState(34, this.anInt8144)
    }

    override fun method3855(class304: Class304?, i: Int, i_40_: Int, fs: FloatArray?, bool: Boolean, i_41_: Int, i_42_: Int, i_43_: Int): Interface18_Impl3? {
        if (i_42_ != 2) aD3DLIGHT9796 = null
        return null
    }

    override fun method3884(i: Byte) {
        if (!aBoolean9801) {
            this.anIDirect3DDevice9810!!.LightEnable(0, false)
            this.anIDirect3DDevice9810!!.LightEnable(1, false)
            this.anIDirect3DDevice9810!!.SetLight(0, aD3DLIGHT9789)
            this.anIDirect3DDevice9810!!.SetLight(1, aD3DLIGHT9796)
            this.anIDirect3DDevice9810!!.LightEnable(0, true)
            this.anIDirect3DDevice9810!!.LightEnable(1, true)
            aBoolean9801 = true
        }
        if (i.toInt() != 101) anIntArray9805 = null
    }

    override fun method3671(): Boolean {
        return false
    }

    override fun method3937(i: Byte) {
        if (i.toInt() != -33) method3962(-41, null)
        this.anIDirect3DDevice9810!!.SetViewport(this.anInt8181, this.anInt8109, this.anInt7931, this.anInt7962, 0.0f, 1.0f)
    }

    fun method3959(i: Int, class310_sub3: Class310_Sub3) {
        method3956((-73).toByte(), class310_sub3)
        if (!aBooleanArray9786!![this.anInt8175]) {
            this.anIDirect3DDevice9810!!.SetSamplerState(this.anInt8175, 1, 1)
            aBooleanArray9786!![this.anInt8175] = true
        }
        if (!aBooleanArray9806[this.anInt8175]) {
            this.anIDirect3DDevice9810!!.SetSamplerState(this.anInt8175, 2, 1)
            aBooleanArray9806[this.anInt8175] = true
        }
        val i_44_ = 82 % ((i - 44) / 56)
    }

    override fun method3899(i: Int, i_45_: Int, class21: Class21?, bool: Boolean) {
        this.anIDirect3DDevice9810!!.DrawPrimitive(Companion.method3953(class21, (-111).toByte()), i_45_, i)
        if (bool != true) aClass209Array9795 = null
    }

    override fun method3658(i: Int, i_46_: Int, i_47_: Int, i_48_: Int) {
        /* empty */
    }

    override fun method3818(bool: Boolean) {
        if (bool != true) method3633()
        method3842(bool)
        method3884(101.toByte())
    }

    override fun method3673() {
        /* empty */
    }

    override fun method3947(i: Int) {
        if (i == 4) this.anIDirect3DDevice9810!!.a(27, this.aBoolean8116)
    }

    override fun method3859(i: Int) {
        this.anIDirect3DDevice9810!!.a(7, this.aBoolean8164)
        if (i != 3) method3882(51.toByte())
    }

    override fun method3843(i: Int, i_49_: Int, i_50_: Int, i_51_: Int, `is`: ByteArray?, class304: Class304?, i_52_: Int, bool: Boolean): Interface18_Impl3 {
        if (i_52_ != 32) anInt9785 = 94
        return Class310_Sub2(this, class304!!, i_50_, i, bool, `is`, i_49_, i_51_)
    }

    @Synchronized
    override fun method3646(i: Int) {
        this.aHb9788!!.b((-82).toByte())
        super.method3646(i)
    }

    override fun method3858(bool: Boolean): Float {
        if (bool) aBoolean9801 = true
        return -0.5f
    }

    override fun method3876(i: Int, canvas: Canvas?): Any? {
        if (i != -1) return null
        return null
    }

    private fun method3960(bool: Boolean): Boolean {
        val i = this.anIDirect3DDevice9810!!.TestCooperativeLevel()
        if (bool) method3880(null, null, (-68).toByte())
        if (i == 0 || -2005530519 == i) {
            val class53 = this.anObject7919 as Class53
            method3922(false)
            class53.method496(84.toByte())
            aD3DPRESENT_PARAMETERS9800!!.BackBufferHeight = 0
            aD3DPRESENT_PARAMETERS9800!!.BackBufferWidth = 0
            if (Companion.method3964(aD3DPRESENT_PARAMETERS9800!!, 0, anInt9799, anIDirect3D9793!!, anInt9807, this.anInt8117)) {
                val i_53_ = this.anIDirect3DDevice9810!!.Reset(aD3DPRESENT_PARAMETERS9800)
                if (a(i_53_, false)) {
                    class53.method497(this.anIDirect3DDevice9810!!.b(0), (-107).toByte(), this.anIDirect3DDevice9810!!.c())
                    method3902((-42).toByte())
                    method3882(113.toByte())
                    return true
                }
            }
        }
        return false
    }

    override fun method3920(i: Int) {
        val i_54_ = (if (aBooleanArray9784[this.anInt8175]) method3955(24, (this.aClass229Array8086[this.anInt8175])) else 1)
        if (i != 10) I()
        this.anIDirect3DDevice9810!!.SetTextureStageState(this.anInt8175, 1, i_54_)
    }

    override fun method3830(i: Int, `is`: IntArray?, bool: Boolean, i_55_: Byte, i_56_: Int, i_57_: Int, i_58_: Int): Interface18_Impl3 {
        val i_59_ = -31 % ((-21 - i_55_) / 46)
        return Class310_Sub2(this, i, i_58_, bool, `is`, i_56_, i_57_)
    }

    override fun method3687(interface4: Interface4?) {
        /* empty */
    }

    override fun method3900(`is`: Array<IntArray?>?, bool: Boolean, i: Int, i_60_: Int): Interface18_Impl2 {
        if (i <= 1) aFloatArray9797 = null
        return Class310_Sub1(this, i_60_, bool, `is`)
    }

    override fun method3939(i: Byte) {
        this.anIDirect3DDevice9810!!.a(15, this.aBoolean8141)
        if (i.toInt() != 100) anIntArray9805 = null
    }

    override fun method3812(i: Int, class58s: Array<Class58>): Class130 {
        if (i != 0) anInt9807 = 29
        return dxVertexLayout(this, class58s)
    }

    fun method3962(i: Int, idirect3dpixelshader: IDirect3DPixelShader?) {
        if (i != 22927) aFloatArray9797 = null
        this.anIDirect3DDevice9810!!.SetPixelShader(idirect3dpixelshader)
    }

    override fun method3710() {
        /* empty */
    }

    override fun method3889(bool: Boolean, i: Int): Interface5_Impl1 {
        return Class366(this, bool)
    }

    override fun method3921(i: Int) {
        this.anIDirect3DDevice9810!!.a(174, this.aBoolean8209)
        if (i != 1) method3858(true)
    }

    override fun b(i: Int, i_61_: Int, i_62_: Int, i_63_: Int, d: Double) {
        /* empty */
    }

    override fun method3832(i: Int, i_64_: Byte): Class367? {
        if (i_64_ >= -57) aClass209Array9795 = null
        val i_65_ = i
        while_234_@ do {
            do {
                if (i_65_ != 3) {
                    if (i_65_ != 4) {
                        if (8 == i_65_) break
                        break@while_234_
                    }
                } else return Class367_Sub5(this, this.aClass45_8039)
                return Class367_Sub6(this, this.aClass45_8039, this.aClass269_7937)
            } while (false)
            return Class367_Sub7(this, this.aClass45_8039, this.aClass269_7937!!)
        } while (false)
        return super.method3832(i, (-74).toByte())
    }

    override fun method3700(f: Float, f_66_: Float, f_67_: Float) {
        /* empty */
    }

    override fun method3871(class113: Class113?, i: Int) {
        var i_68_ = i
        if (Class31.aClass113_430 == class113) i_68_ = 65536
        else if (za_Sub1.aClass113_9773 == class113) i_68_ = 131072
        else if (class113 == Class261.aClass113_3314) i_68_ = 196608
        this.anIDirect3DDevice9810!!.SetTextureStageState(this.anInt8175, 11, this.anInt8175 or i_68_)
    }

    override fun method3880(class68: Class68?, class304: Class304?, i: Byte): Boolean {
        val d3ddisplaymode = D3DDISPLAYMODE()
        val i_69_ = 96 / ((i - 85) / 37)
        return (a(anIDirect3D9793!!.a(anInt9799, d3ddisplaymode), false) && a((anIDirect3D9793!!.CheckDeviceFormat(anInt9799, anInt9807, d3ddisplaymode.Format, 0, 3, method3958(22, class68, class304))), false))
    }

    override fun method3882(i: Byte) {
        for (i_70_ in 0..<this.anInt8090) {
            this.anIDirect3DDevice9810!!.SetSamplerState(i_70_, 7, 0)
            this.anIDirect3DDevice9810!!.SetSamplerState(i_70_, 6, 2)
            this.anIDirect3DDevice9810!!.SetSamplerState(i_70_, 5, 2)
            this.anIDirect3DDevice9810!!.SetSamplerState(i_70_, 1, 1)
            this.anIDirect3DDevice9810!!.SetSamplerState(i_70_, 2, 1)
            aClass209Array9795!![i_70_] = Class71.aClass209_1212
            aBooleanArray9806[i_70_] = true
            aBooleanArray9786!![i_70_] = aBooleanArray9806[i_70_]
            aBooleanArray9804[i_70_] = false
            anIntArray9805!![i_70_] = 0
        }
        this.anIDirect3DDevice9810!!.SetTextureStageState(0, 6, 1)
        this.anIDirect3DDevice9810!!.SetRenderState(9, 2)
        this.anIDirect3DDevice9810!!.SetRenderState(23, 4)
        this.anIDirect3DDevice9810!!.SetRenderState(25, 5)
        this.anIDirect3DDevice9810!!.SetRenderState(24, 0)
        this.anIDirect3DDevice9810!!.SetRenderState(22, 2)
        this.anIDirect3DDevice9810!!.SetRenderState(147, 1)
        this.anIDirect3DDevice9810!!.SetRenderState(145, 1)
        this.anIDirect3DDevice9810!!.a(38, 0.95f)
        this.anIDirect3DDevice9810!!.SetRenderState(140, 3)
        aD3DLIGHT9789.SetType(3)
        aD3DLIGHT9796!!.SetType(3)
        aD3DLIGHT9808.SetType(1)
        aBoolean9801 = false
        super.method3882(63.toByte())
    }

    override fun c(): Class365 {
        val d3dadapter_identifier = anIDirect3D9793!!.a(anInt9799, 0)
        return Class365(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion)
    }

    override fun method3935(i: Int) {
        if (i <= -99) {
            val i_71_ = (if (aBooleanArray9784[this.anInt8175]) method3955(50, (this.aClass229Array8092[this.anInt8175])) else 1)
            this.anIDirect3DDevice9810!!.SetTextureStageState(this.anInt8175, 4, i_71_)
        }
    }

    override fun method3940(i: Int) {
        if (anIDirect3DVertexShader9794 == null && ((this.aClass251Array8113[this.anInt8175]) != Class348_Sub42_Sub18.aClass251_9685)) {
            if (Class239_Sub18.aClass251_6030 == (this.aClass251Array8113[this.anInt8175])) this.anIDirect3DDevice9810!!.SetTransform(this.anInt8175 + 16, this.aClass101_Sub2Array8131[this.anInt8175]!!.method928(aFloatArray9797!!, i))
            else this.anIDirect3DDevice9810!!.SetTransform(16 - -this.anInt8175, this.aClass101_Sub2Array8131[this.anInt8175]!!.method918(aFloatArray9797!!, i xor 0x1))
            val i_72_: Int = method3963(594, (this.aClass251Array8113[this.anInt8175]))
            if (anIntArray9805!![this.anInt8175] != i_72_) {
                this.anIDirect3DDevice9810!!.SetTextureStageState(this.anInt8175, 24, i_72_)
                anIntArray9805!![this.anInt8175] = i_72_
            }
        } else {
            this.anIDirect3DDevice9810!!.SetTextureStageState(this.anInt8175, 24, 0)
            anIntArray9805!![this.anInt8175] = 0
        }
        if (i != 1) aBoolean9801 = true
    }

    override fun method3861(i: Int, i_73_: Byte, i_74_: Int, class68: Class68?, class304: Class304?): Interface18_Impl3 {
        return Class310_Sub2(this, class304!!, class68!!, i_74_, i)
    }

    override fun method3844(i: Int, canvas: Canvas?, `object`: Any?) {
        if (canvas === this.aCanvas7925) {
            val dimension = canvas!!.getSize()
            if (dimension.width > 0 && 0 < dimension.height) {
                this.anIDirect3DDevice9810!!.EndScene()
                method3960(false)
                this.anIDirect3DDevice9810!!.BeginScene()
            }
        }
        if (i != 12727) method3953(null, 28.toByte())
    }

    override fun method3883(i: Int) {
        val i_87_ = 60 % ((i - 20) / 36)
        this.anIDirect3DDevice9810!!.a(137, ((this.aBoolean8145) && !(this.aBoolean8149)))
    }

    override fun method3950(i: Int) {
        if (i != 0) anIntArray9809 = null
        if (Class348_Sub4.aClass173_6602 == this.aClass173_8163) {
            this.anIDirect3DDevice9810!!.SetRenderState(19, 5)
            this.anIDirect3DDevice9810!!.SetRenderState(20, 6)
        } else if (this.aClass173_8163 == Class69.aClass173_1201) {
            this.anIDirect3DDevice9810!!.SetRenderState(19, 2)
            this.anIDirect3DDevice9810!!.SetRenderState(20, 2)
        } else if (Class273.aClass173_5169 == this.aClass173_8163) {
            this.anIDirect3DDevice9810!!.SetRenderState(19, 9)
            this.anIDirect3DDevice9810!!.SetRenderState(20, 2)
        }
    }

    @Throws(Exception_Sub1::class)
    override fun method3626(i: Int, i_88_: Int) {
        this.anIDirect3DDevice9810!!.EndScene()
        if (aClass53_9787!!.method498(-107)) {
            anInt9785 = 0
            if (a(97.toByte(), aClass53_9787!!.method495(91.toByte(), 0))) method3960(false)
        } else {
            if (50 < ++anInt9785) throw Exception_Sub1()
            method3960(false)
        }
        this.anIDirect3DDevice9810!!.BeginScene()
    }

    override fun method3925(i: Int, interface5_impl1: Interface5_Impl1?, i_89_: Int) {
        val i_90_ = -112 % ((i - -26) / 39)
        val class366 = interface5_impl1 as Class366
        this.anIDirect3DDevice9810!!.SetStreamSource(i_89_, class366.anIDirect3DVertexBuffer8511, 0, class366.method3519(3545))
    }

    override fun ya() {
        method3946(-32, true)
        this.anIDirect3DDevice9810!!.Clear(2, 0, 1.0f, 0)
    }

    companion object {
        private var anIntArray9790: IntArray? = intArrayOf(22, 23)
        private var aFloatArray9797: FloatArray? = FloatArray(16)
        private var anIntArray9809: IntArray? = intArrayOf(77, 80)
        private fun method3952(class209: Class209?, i: Byte): Int {
            if (Class71.aClass209_1212 == class209) return 2
            if (Class206.aClass209_4874 == class209) return 1
            if (i <= 57) anIntArray9790 = null
            throw IllegalArgumentException()
        }

        private fun method3953(class21: Class21?, i: Byte): Int {
            if (i.toInt() != -111) Companion.method3952(null, (-118).toByte())
            if (class21 == Class249.aClass21_3217) return 2
            if (Class348_Sub5_Sub1.aClass21_8832 == class21) return 3
            if (Class277.aClass21_3572 == class21) return 1
            if (class21 == Class247.aClass21_3181) return 4
            if (Class348_Sub42_Sub16.aClass21_9661 == class21) return 6
            if (class21 == s_Sub3.aClass21_8320) return 5
            throw IllegalArgumentException("")
        }

        private fun method3955(i: Int, class229: Class229?): Int {
            if (Class328_Sub3.aClass229_6519 == class229) return 2
            if (Class167.aClass229_2207 == class229) return 4
            if (Class248.aClass229_3196 != class229) {
                if (class229 != Class348_Sub23_Sub2.aClass229_9011) {
                    if (class229 == Class348_Sub7.aClass229_6644) return 10
                } else return 7
            } else return 26
            if (i <= 16) method3955(-116, null)
            throw IllegalArgumentException()
        }

        @JvmStatic
        fun createToolkit(canvas: Canvas?, var_d: d?, class45: Class45?, integer: Int): ha {
            var class378: Class378? = null
            val class378_19_: Class378?
            try {
                val i = 0
                val i_20_ = 1
                val var_hb = hb()
                val idirect3d = a(-2147483616, var_hb)
                val d3dcaps = idirect3d.b(i, i_20_)
                if ((d3dcaps.RasterCaps and 0x1000000) == 0) throw RuntimeException("")
                if (d3dcaps.MaxSimultaneousTextures < 2) throw RuntimeException("")
                if ((0x2 and d3dcaps.TextureOpCaps) == 0) throw RuntimeException("")
                if ((d3dcaps.TextureOpCaps and 0x8) == 0) throw RuntimeException("")
                if ((0x40 and d3dcaps.TextureOpCaps) == 0) throw RuntimeException("")
                if ((0x200 and d3dcaps.TextureOpCaps) == 0) throw RuntimeException("")
                if ((0x2000000 and d3dcaps.TextureOpCaps) == 0) throw RuntimeException("")
                if (0 == (0x10 and (d3dcaps.DestBlendCaps and d3dcaps.SrcBlendCaps))) throw RuntimeException("")
                if ((d3dcaps.DestBlendCaps and d3dcaps.SrcBlendCaps and 0x20) == 0) throw RuntimeException("")
                if (0 == (d3dcaps.SrcBlendCaps and d3dcaps.DestBlendCaps and 0x2)) throw RuntimeException("")
                if (0 < d3dcaps.MaxActiveLights && 2 > d3dcaps.MaxActiveLights) throw RuntimeException("")
                if (d3dcaps.MaxStreams < 5) throw RuntimeException("")
                val d3dpresent_parameters = D3DPRESENT_PARAMETERS(canvas)
                if (!method3964(d3dpresent_parameters, 0, i, idirect3d, i_20_, integer)) throw RuntimeException("")
                d3dpresent_parameters.PresentationInterval = -2147483648
                d3dpresent_parameters.EnableAutoDepthStencil = true
                d3dpresent_parameters.Windowed = true
                var i_21_ = 2
                if ((0x100000 and d3dcaps.DevCaps) != 0) i_21_ = i_21_ or 0x10
                val `object`: Any? = null
                var idirect3ddevice: IDirect3DDevice?
                try {
                    idirect3ddevice = idirect3d.a(i, i_20_, canvas, i_21_ or 0x40, d3dpresent_parameters)
                } catch (var_fda: fda) {
                    idirect3ddevice = idirect3d.a(i, i_20_, canvas, i_21_ or 0x20, d3dpresent_parameters)
                }
                val class53 = Class53(idirect3ddevice.b(0), idirect3ddevice.c())
                class378 = Class378(i, i_20_, canvas, var_hb, idirect3d, idirect3ddevice, class53, d3dpresent_parameters, d3dcaps, var_d, class45, integer)
                class378.method3930(26.toByte())
                class378_19_ = class378
            } catch (runtimeexception: RuntimeException) {
                if (class378 != null) class378.method3652()
                throw runtimeexception
            }
            return class378_19_
        }

        @JvmStatic
        fun method3958(i: Int, class68: Class68?, class304: Class304?): Int {
            if (class68 == Class68.aClass68_1183) {
                if (Class348_Sub45.aClass304_7103 != class304) {
                    if (Class108.aClass304_1662 == class304) return 21
                    if (Class348_Sub40_Sub38.aClass304_9471 == class304) return 28
                    if (Class348_Sub40_Sub22.aClass304_9303 == class304) return 50
                    if (class304 == Class191.aClass304_2571) return 51
                    if (class304 == Class318.aClass304_3977) return 77
                } else return 22
            }
            if (i != 22) anIntArray9790 = null
            throw IllegalArgumentException("")
        }

        private fun method3961(class70: Class70?, i: Int): Int {
            if (i != 2) aFloatArray9797 = null
            if (Class342.aClass70_4247 == class70) return 2
            if (class70 == Class285_Sub2.aClass70_8503) return 0
            if (Class318_Sub1_Sub2.aClass70_8737 != class70) {
                if (Class348_Sub40_Sub39.aClass70_9485 == class70) return 3
            } else return 1
            throw IllegalArgumentException()
        }

        private fun method3963(i: Int, class251: Class251?): Int {
            if (i != 594) return 7
            if (class251 == Class135_Sub2.aClass251_4835) return 1
            if (class251 != Class239_Sub18.aClass251_6030) {
                if (class251 != Class348_Sub40_Sub38.aClass251_9477) {
                    if (Class57.aClass251_1051 == class251) return 4
                    if (class251 == Class239_Sub14.aClass251_5989) return 256
                } else return 3
            } else return 2
            return 0
        }

        private fun method3964(d3dpresent_parameters: D3DPRESENT_PARAMETERS, i: Int, j: Int, idirect3d: IDirect3D, k: Int, l: Int): Boolean {
            var l = l
            try {
                var i1: Int
                var j1: Int
                var k1: Int
                i1 = 0
                j1 = 0
                k1 = i
                val d3ddisplaymode = D3DDISPLAYMODE()
                if (a(97.toByte(), idirect3d.a(j, d3ddisplaymode))) return false
                label0@ while (l >= 0) {
                    if (1 == l) {
                        l--
                        continue
                    }
                    k1 = l + 0
                    label1@ for (l1 in anIntArray9790!!.indices) {
                        if (idirect3d.CheckDeviceType(j, k, d3ddisplaymode.Format, anIntArray9790!![l1], true) != 0 || idirect3d.CheckDeviceFormat(j, k, d3ddisplaymode.Format, 1, 1, anIntArray9790!![l1]) != 0 || l != 0 && idirect3d.CheckDeviceMultiSampleType(j, k, anIntArray9790!![l1], true, k1) != 0) continue
                        var i2 = 0
                        do {
                            if (anIntArray9809!!.size <= i2) continue@label1
                            if (idirect3d.CheckDeviceFormat(j, k, d3ddisplaymode.Format, 2, 1, anIntArray9809!![i2]) == 0 && idirect3d.CheckDepthStencilMatch(j, k, d3ddisplaymode.Format, anIntArray9790!![l1], anIntArray9809!![i2]) == 0 && (l == 0 || idirect3d.CheckDeviceMultiSampleType(j, k, anIntArray9809!![l1], true, k1) == 0)) {
                                i1 = anIntArray9809!![i2]
                                j1 = anIntArray9790!![l1]
                                break@label0
                            }
                            i2++
                        } while (true)
                    }

                    l--
                }

                if (l < 0 || j1 == 0 || i1 == 0) return false
                d3dpresent_parameters.MultiSampleType = k1
                d3dpresent_parameters.AutoDepthStencilFormat = i1
                d3dpresent_parameters.MultiSampleQuality = 0
                d3dpresent_parameters.BackBufferFormat = j1
                return true
            } catch (t: Throwable) {
                return false
            }
        }
    }
}
