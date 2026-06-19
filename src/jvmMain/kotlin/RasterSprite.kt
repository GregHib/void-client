class RasterSprite(i: Int, i_3_: Int, `is`: IntArray?, is_4_: IntArray?) : Sprite() {
    @JvmField
    var anIntArray5201: IntArray?
    @JvmField
    var anIntArray5202: IntArray?

    init {
        try {
            this.anIntArray5201 = `is`
            this.anIntArray5202 = is_4_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("nba.<init>(" + i + ',' + i_3_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_4_ != null) "{...}" else "null") + ')'))
        }
    }
}
