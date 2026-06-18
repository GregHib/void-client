import jagdx.IDirect3DBaseTexture
import jagdx.IDirect3DCubeTexture
import jagdx.ue.a

class D3DCubeTexture internal constructor(d3dRenderDevice: D3dRenderDevice, private val anInt6329: Int, bool: Boolean, `is`: Array<IntArray?>?) : D3DBaseTexture(d3dRenderDevice, GroundItemRenderState.aTextureFormatInfo_1662!!, MovementDirection.aMovementDirection_1183!!, bool && d3dRenderDevice.aBoolean9802, 6 * anInt6329 * anInt6329), RenderableCubeTexture {
    private val anIDirect3DCubeTexture6330: IDirect3DCubeTexture

    override fun method63(i: Byte) {
        this.aD3dRenderDevice_3893.method3956((-128).toByte(), this)
        if (i > -21) method2314(88)
    }

    init {
        if (this.aBoolean3892) anIDirect3DCubeTexture6330 = this.aD3dRenderDevice_3893.anIDirect3DDevice9810!!.a(anInt6329, 0, 1024, 21, 1)
        else anIDirect3DCubeTexture6330 = this.aD3dRenderDevice_3893.anIDirect3DDevice9810!!.a(anInt6329, 1, 0, 21, 1)
        val pixelbuffer = (this.aD3dRenderDevice_3893.aPixelBuffer9803)
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

    override fun method64(class209: UnusedToStringStub?, i: Int) {
        super.method64(class209, i)
    }
}
