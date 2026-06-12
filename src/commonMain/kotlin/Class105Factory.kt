/**
 * Factory for creating Class105_Sub3 instances (opaque/transparent sprite textures).
 * Lives in commonMain so ha_Sub1 can reference it without pulling in jvmMain types.
 * The JVM implementation is JvmClass105Factory in jvmMain.
 */
interface Class105Factory {
    /** Create from a pre-built ARGB pixel array (w×h). transparent=true → Sub3 (alpha), false → Sub1 (opaque). */
    fun createFromPixels(pixels: IntArray, w: Int, h: Int, transparent: Boolean): Class105

    /** Create from a sub-region of a pixel buffer (arbitrary srcOffset/stride). */
    fun createFromPixelRegion(pixels: IntArray, srcOffset: Int, srcStride: Int, w: Int, h: Int, flipH: Boolean, transparent: Boolean): Class105

    /** Create an empty (solid-colour) sprite of size w×h. transparent=true → Sub3, false → Sub1. */
    fun createEmpty(w: Int, h: Int, transparent: Boolean): Class105
}
