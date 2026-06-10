import jagdx.IDirect3DBaseTexture
import jagdx.IDirect3DCubeTexture
import jagdx.ue.a

class Class310_Sub1 internal constructor(class378: Class378, private val anInt6329: Int, bool: Boolean, `is`: Array<IntArray?>?) : Class310(class378, Class108.aClass304_1662!!, Class68.aClass68_1183!!, bool && class378.aBoolean9802, 6 * anInt6329 * anInt6329), Interface18_Impl2 {
    private val anIDirect3DCubeTexture6330: IDirect3DCubeTexture

    override fun method63(i: Byte) {
        this.aClass378_3893.method3956((-128).toByte(), this)
        if (i > -21) method2314(88)
    }

    init {
        if (this.aBoolean3892) anIDirect3DCubeTexture6330 = this.aClass378_3893.anIDirect3DDevice9810!!.a(anInt6329, 0, 1024, 21, 1)
        else anIDirect3DCubeTexture6330 = this.aClass378_3893.anIDirect3DDevice9810!!.a(anInt6329, 1, 0, 21, 1)
        val pixelbuffer = (this.aClass378_3893.aPixelBuffer9803)
        for (i_0_ in 0..5) {
            val i_1_ = anIDirect3DCubeTexture6330.LockRect(i_0_, 0, 0, 0, anInt6329, anInt6329, 0, pixelbuffer)
            if (a(i_1_, false)) {
                val i_2_ = pixelbuffer!!.rowPitch
                if (i_2_ == anInt6329 * 4) pixelbuffer.a(`is`!![i_0_], 0, 0, anInt6329 * anInt6329)
                else {
                    var i_3_ = 0
                    while (anInt6329 > i_3_) {
                        pixelbuffer.a(`is`!![i_0_], anInt6329 * i_3_, i_3_ * i_2_, anInt6329)
                        i_3_++
                    }
                }
                anIDirect3DCubeTexture6330.UnlockRect(i_0_, 0)
            }
        }
    }

    override fun method2314(i: Int): IDirect3DBaseTexture {
        if (i != 17723) method2314(-17)
        return anIDirect3DCubeTexture6330
    }

    override fun method64(class209: Class209?, i: Int) {
        super.method64(class209, i)
    }
}
