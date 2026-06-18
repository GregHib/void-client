import jagdx.IDirect3DBaseTexture

/*
 * Class310
 */
abstract class D3DBaseTexture internal constructor(var aD3dRenderDevice_3893: D3dRenderDevice, var aTextureFormatInfo_3896: TextureFormatInfo, var aMovementDirection_3895: MovementDirection, var aBoolean3892: Boolean, i: Int) {
    var aClass209_3894: UnusedToStringStub? = Class71.aClass209_1212

    open fun method64(class209: UnusedToStringStub?, i: Int) {
        this.aClass209_3894 = class209
        if (i != -22095) method64(null, -80)
    }

    abstract fun method2314(i: Int): IDirect3DBaseTexture?
}
