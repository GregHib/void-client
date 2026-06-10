import Class378.Companion.method3958
import jagdx.IDirect3DBaseTexture
import jagdx.IDirect3DVolumeTexture
import jagdx.ue.a

class Class310_Sub3 internal constructor(class378: Class378, class304: Class304, private var anInt6338: Int, private val anInt6339: Int, private val anInt6337: Int, `is`: ByteArray?) : Class310(class378, class304, Class68.aClass68_1183!!, false, anInt6337 * anInt6339 * anInt6338), Interface18_Impl1 {
    private val anIDirect3DVolumeTexture6336: IDirect3DVolumeTexture

    override fun method63(i: Byte) {
        this.aClass378_3893.method3959(-101, this)
        if (i >= -21) method2314(78)
    }

    override fun method2314(i: Int): IDirect3DBaseTexture {
        if (i != 17723) anInt6338 = -39
        return anIDirect3DVolumeTexture6336
    }

    override fun method64(class209: Class209?, i: Int) {
        super.method64(class209, i)
    }

    init {
        anIDirect3DVolumeTexture6336 = (this.aClass378_3893.anIDirect3DDevice9810!!.a(anInt6338, anInt6339, anInt6337, 1, 0, method3958(22, this.aClass68_3895, class304), 1))
        val pixelbuffer = (this.aClass378_3893.aPixelBuffer9803)
        val i_2_ = anIDirect3DVolumeTexture6336.LockBox(0, 0, 0, 0, anInt6338, anInt6339, anInt6337, 0, pixelbuffer)
        if (a(i_2_, false)) {
            val i_3_ = (this.aClass304_3896.anInt3850 * anInt6338)
            val i_4_ = i_3_ * anInt6339
            val i_5_ = pixelbuffer!!.slicePitch
            if (i_5_ == i_4_) pixelbuffer.a(`is`, 0, 0, anInt6337 * (i_3_ * anInt6339))
            else {
                val i_6_ = pixelbuffer.rowPitch
                if (i_3_ == i_6_) {
                    var i_9_ = 0
                    while (anInt6337 > i_9_) {
                        pixelbuffer.a(`is`, i_4_ * i_9_, i_9_ * i_5_, i_4_)
                        i_9_++
                    }
                } else {
                    for (i_7_ in 0..<anInt6337) {
                        var i_8_ = 0
                        while (anInt6339 > i_8_) {
                            pixelbuffer.a(`is`, i_3_ * i_8_ + i_4_ * i_7_, i_8_ * i_6_ + i_7_ * i_5_, i_3_)
                            i_8_++
                        }
                    }
                }
            }
            anIDirect3DVolumeTexture6336.UnlockBox(0)
        }
    }
}
