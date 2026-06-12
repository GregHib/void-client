/**
 * JVM implementation of Class105Factory — delegates to the concrete Sub1/Sub3 constructors
 * that live in jvmMain and take a ha_Sub1 reference.
 */
class JvmClass105Factory(private val ha: ha_Sub1) : Class105Factory {
    override fun createFromPixels(pixels: IntArray, w: Int, h: Int, transparent: Boolean): Class105 =
        if (transparent) Class105_Sub3_Sub3(ha, pixels, w, h)
        else Class105_Sub3_Sub1(ha, pixels, w, h)

    override fun createFromPixelRegion(pixels: IntArray, srcOffset: Int, srcStride: Int, w: Int, h: Int, flipH: Boolean, transparent: Boolean): Class105 =
        if (transparent) Class105_Sub3_Sub3(ha, pixels, srcOffset, srcStride, w, h, flipH)
        else Class105_Sub3_Sub1(ha, pixels, srcOffset, srcStride, w, h, flipH)

    override fun createEmpty(w: Int, h: Int, transparent: Boolean): Class105 =
        if (transparent) Class105_Sub3_Sub3(ha, w, h)
        else Class105_Sub3_Sub1(ha, w, h)
}
