import jagdx.IDirect3DBaseTexture

/*
 * Class310
 */
abstract class D3DBaseTexture internal constructor(var aClass378_3893: Class378, var aTextureFormatInfo_3896: TextureFormatInfo, var aClass68_3895: Class68, var aBoolean3892: Boolean, i: Int) {
    var aClass209_3894: UnusedToStringStub? = Class71.aClass209_1212

    open fun method64(class209: UnusedToStringStub?, i: Int) {
        this.aClass209_3894 = class209
        if (i != -22095) method64(null, -80)
    }

    abstract fun method2314(i: Int): IDirect3DBaseTexture?
}
