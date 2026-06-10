import Class378.Companion.method3958
import jagdx.IDirect3DBaseTexture
import jagdx.IDirect3DTexture
import jagdx.ue.a

class Class310_Sub2 : Class310, Interface18_Impl3 {
    private val anInt6331: Int
    private val anIDirect3DTexture6332: IDirect3DTexture
    private val anInt6333: Int
    var aBoolean6334: Boolean = false
    var aBoolean6335: Boolean = false

    internal constructor(class378: Class378, i: Int, i_0_: Int, bool: Boolean, `is`: IntArray?, i_1_: Int, i_2_: Int) : super(class378, Class108.aClass304_1662!!, Class68.aClass68_1183!!, bool && class378.aBoolean9798, i_0_ * i) {
        var i_2_ = i_2_
        if (this.aClass378_3893.aBoolean9792) {
            anInt6331 = i_0_
            anInt6333 = i
        } else {
            anInt6333 = Class33.method340(i, 108.toByte())
            anInt6331 = Class33.method340(i_0_, 108.toByte())
        }
        if (!bool) anIDirect3DTexture6332 = this.aClass378_3893.anIDirect3DDevice9810!!.a(anInt6333, anInt6331, 1, 0, 21, 1)
        else anIDirect3DTexture6332 = this.aClass378_3893.anIDirect3DDevice9810!!.a(anInt6333, anInt6331, 0, 1024, 21, 1)
        val pixelbuffer = (this.aClass378_3893.aPixelBuffer9803)
        val i_3_ = anIDirect3DTexture6332.LockRect(0, 0, 0, i, i_0_, 0, pixelbuffer)
        if (a(i_3_, false)) {
            if (0 == i_2_) i_2_ = i
            val i_4_ = pixelbuffer!!.rowPitch
            if (i_4_ == 4 * i && i == i_2_) pixelbuffer.a(`is`, i_1_, 0, i * i_0_)
            else {
                var i_5_ = 0
                while (i_0_ > i_5_) {
                    pixelbuffer.a(`is`, i_5_ * i_2_ + i_1_, i_4_ * i_5_, i)
                    i_5_++
                }
            }
            anIDirect3DTexture6332.UnlockRect(0)
        }
    }

    internal constructor(class378: Class378, class304: Class304, class68: Class68, i: Int, i_6_: Int) : super(class378, class304, class68, false, i_6_ * i) {
        if (this.aClass378_3893.aBoolean9792) {
            anInt6333 = i
            anInt6331 = i_6_
        } else {
            anInt6333 = Class33.method340(i, 108.toByte())
            anInt6331 = Class33.method340(i_6_, 108.toByte())
        }
        anIDirect3DTexture6332 = (this.aClass378_3893.anIDirect3DDevice9810!!.a(i, i_6_, 1, 0, method3958(22, this.aClass68_3895, this.aClass304_3896), 1))
    }

    override fun method64(class209: Class209?, i: Int) {
        super.method64(class209, i)
    }

    override fun method2314(i: Int): IDirect3DBaseTexture? {
        if (i != 17723) return null
        return anIDirect3DTexture6332
    }

    override fun method69(bool: Boolean): Int {
        if (bool) return -95
        return anInt6333
    }

    override fun method72(i: Int): Int {
        val i_7_ = -47 % ((55 - i) / 63)
        return anInt6331
    }

    override fun method65(i: Int, `is`: IntArray, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Byte, i_12_: Int) {
        if (Class108.aClass304_1662 != this.aClass304_3896 || this.aClass68_3895 != Class68.aClass68_1183) throw RuntimeException()
        if (i_11_.toInt() != 112) this.aBoolean6334 = false
        val pixelbuffer = (this.aClass378_3893.aPixelBuffer9803)
        val i_13_ = anIDirect3DTexture6332.LockRect(0, i, i_9_, i_8_, i_10_, 16, pixelbuffer)
        if (a(i_13_, false)) {
            val i_14_ = pixelbuffer!!.rowPitch
            if (i_14_ != 4 * i_8_) {
                for (i_15_ in 0..<i_10_) pixelbuffer.b(`is`, i_12_ - -(i_8_ * i_15_), i_15_ * i_14_, i_8_)
            } else pixelbuffer.b(`is`, i_12_, 0, `is`.size)
            anIDirect3DTexture6332.UnlockRect(0)
        }
    }

    internal constructor(class378: Class378, class304: Class304, i: Int, i_16_: Int, bool: Boolean, `is`: ByteArray?, i_17_: Int, i_18_: Int) : super(class378, class304, Class68.aClass68_1183!!, bool && class378.aBoolean9798, i * i_16_) {
        var i = i
        var i_18_ = i_18_
        if (this.aClass378_3893.aBoolean9792) {
            anInt6333 = i
            anInt6331 = i_16_
        } else {
            anInt6333 = Class33.method340(i, 108.toByte())
            anInt6331 = Class33.method340(i_16_, 108.toByte())
        }
        if (bool) anIDirect3DTexture6332 = (this.aClass378_3893.anIDirect3DDevice9810!!.a(anInt6333, anInt6331, 0, 1024, method3958(22, Class68.aClass68_1183, this.aClass304_3896), 1))
        else anIDirect3DTexture6332 = (this.aClass378_3893.anIDirect3DDevice9810!!.a(anInt6333, anInt6331, 1, 0, method3958(22, Class68.aClass68_1183, this.aClass304_3896), 1))
        val pixelbuffer = (this.aClass378_3893.aPixelBuffer9803)
        val i_19_ = anIDirect3DTexture6332.LockRect(0, 0, 0, i, i_16_, 0, pixelbuffer)
        if (a(i_19_, false)) {
            if (0 == i_18_) i_18_ = i
            i *= this.aClass304_3896.anInt3850
            i_18_ *= (this.aClass304_3896.anInt3850)
            val i_20_ = pixelbuffer!!.rowPitch
            if (i != i_20_ || i != i_18_) {
                var i_21_ = 0
                while (i_16_ > i_21_) {
                    pixelbuffer.a(`is`, i_21_ * i_18_ + i_17_, i_20_ * i_21_, i)
                    i_21_++
                }
            } else pixelbuffer.a(`is`, i_17_, 0, i * i_16_)
            anIDirect3DTexture6332.UnlockRect(0)
        }
    }

    override fun method71(i: Byte, f: Float): Float {
        if (i > -24) return -0.2576451f
        return f / anInt6331.toFloat()
    }

    override fun method68(i: Int, i_22_: Int, `is`: IntArray?, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int) {
        if (this.aClass304_3896 != Class108.aClass304_1662 || this.aClass68_3895 != Class68.aClass68_1183) throw RuntimeException()
        val pixelbuffer = (this.aClass378_3893.aPixelBuffer9803)
        val i_28_ = anIDirect3DTexture6332.LockRect(0, i_23_, i_26_, i_25_, i_27_, 0, pixelbuffer)
        if (a(i_28_, false)) {
            val i_29_ = pixelbuffer!!.rowPitch
            if (i_29_ != i_25_ * 4 || i_25_ != i) {
                var i_30_ = 0
                while (i_27_ > i_30_) {
                    pixelbuffer.a(`is`, i_24_ + i * i_30_, i_30_ * i_29_, i_25_)
                    i_30_++
                }
            } else pixelbuffer.a(`is`, i_24_, 0, i_27_ * i_25_)
            anIDirect3DTexture6332.UnlockRect(0)
        }
        if (i_22_ != 22809) this.aBoolean6334 = false
    }

    override fun method67(f: Float, i: Int): Float {
        if (i < 69) return 0.44069603f
        return f / anInt6333.toFloat()
    }

    override fun method63(i: Byte) {
        if (i > -21) method64(null, 39)
        this.aClass378_3893.method3954(13700, this)
    }

    override fun method70(i: Int, i_31_: Int, i_32_: Byte, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Int, `is`: ByteArray?, class304: Class304?) {
        var i_33_ = i_33_
        var i_35_ = i_35_
        if (this.aClass304_3896 != class304 || this.aClass68_3895 != Class68.aClass68_1183) throw RuntimeException()
        if (i_32_ < -4) {
            val pixelbuffer = (this.aClass378_3893.aPixelBuffer9803)
            val i_37_ = anIDirect3DTexture6332.LockRect(0, i_36_, i, i_35_, i_34_, 0, pixelbuffer)
            if (a(i_37_, false)) {
                i_33_ *= (this.aClass304_3896.anInt3850)
                i_35_ *= (this.aClass304_3896.anInt3850)
                val i_38_ = pixelbuffer!!.rowPitch
                if (i_38_ == i_35_ && i_33_ == i_35_) pixelbuffer.a(`is`, i_31_, 0, i_35_ * i_34_)
                else {
                    var i_39_ = 0
                    while (i_34_ > i_39_) {
                        pixelbuffer.a(`is`, i_31_ + i_39_ * i_33_, i_39_ * i_38_, i_35_)
                        i_39_++
                    }
                }
                anIDirect3DTexture6332.UnlockRect(0)
            }
        }
    }

    override fun method73(i: Int): Boolean {
        if (i <= 84) method67(1.9572803f, 45)
        return true
    }

    override fun method66(bool: Boolean, bool_40_: Boolean, i: Int) {
        this.aBoolean6335 = bool_40_
        if (i == 25688) this.aBoolean6334 = bool
    }
}
