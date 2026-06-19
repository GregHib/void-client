/* aa_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class IndexedSprite : Sprite {
    @JvmField
    var anInterface18_Impl3_5196: Renderable2dTexture? = null

    constructor(var_ha_Sub3: NativeRenderer?, i: Int, i_16_: Int, `is`: ByteArray?) {
        try {
            this.anInterface18_Impl3_5196 = var_ha_Sub3!!.method3944(`is`, i, ClampTextureNodeStatics.aTextureFormatInfo_9471, 2, false, i_16_)
            this.anInterface18_Impl3_5196!!.method66(false, false, 25688)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("lp.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_16_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    constructor(var_ha_Sub3: NativeRenderer?, i: Int, i_17_: Int, `is`: IntArray?) {
        try {
            this.anInterface18_Impl3_5196 = var_ha_Sub3!!.method3839(i_17_, i, -15137, false, `is`)
            this.anInterface18_Impl3_5196!!.method66(false, false, 25688)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("lp.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_17_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }
}
