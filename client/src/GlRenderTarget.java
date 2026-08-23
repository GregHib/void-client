/**
 * Reconstructed offscreen render target for the GL toolkit (ha_Sub2).
 *
 * The decompiled source lost ha_Sub2's entire Interface4 implementation and
 * gutted the four methods that build and bind it (method3665 / method3624 /
 * method3634 / method3687 were bare stubs), so the resizable and fullscreen
 * HUD modes - which render the 3D scene into an offscreen target and then
 * scale-blit it to the window - crashed on the first world frame. Nobody hit
 * this in a decade because the GL toolkit's natives never loaded on modern
 * machines; the pure-Java backend resurrected the code path.
 *
 * Shape reconstructed from the surviving pieces: Class206 (a complete FBO
 * wrapper), ha_Sub2.method3672 (the intact frame-end: assert bound target ==
 * aClass206_7739, detach color slot 0 + depth slot 8, pop), Class49 (the
 * software toolkit's Interface4, defining blit semantics), and the engine's
 * call sequence in Class230/Class85.
 */
final class GlRenderTarget implements Interface4 {

    final ha_Sub2 toolkit;
    final GlColorTarget color;
    final GlDepthTarget depth;

    GlRenderTarget(ha_Sub2 toolkit, GlColorTarget color, GlDepthTarget depth) {
        this.toolkit = toolkit;
        this.color = color;
        this.depth = depth;
    }

    /** Scale-blit the target's color texture to the window: draw the srcW x
     * srcH region into a dstW x dstH rectangle at (x, y). */
    public final void method14(int srcW, int srcH, int dstW, int dstH, int x, int y, boolean smoothH, boolean smoothV) {
        toolkit.blitRenderTarget(this, srcW, srcH, dstW, dstH, x, y, smoothH || smoothV);
    }

    public final void method15(int srcW, int srcH, int dstW, int dstH, int x, int y, boolean smoothH, boolean smoothV) {
        toolkit.blitRenderTarget(this, srcW, srcH, dstW, dstH, x, y, smoothH || smoothV);
    }
}

/** Color attachment: an RGBA texture the scene renders into. */
final class GlColorTarget implements Interface3 {
    final Class258_Sub3 texture;
    final int width;
    final int height;

    GlColorTarget(Class258_Sub3 texture, int width, int height) {
        this.texture = texture;
        this.width = width;
        this.height = height;
    }
}

/** Depth attachment: a DEPTH_COMPONENT24 renderbuffer. */
final class GlDepthTarget implements Interface13 {
    final Class348_Sub42_Sub2 buffer;

    GlDepthTarget(Class348_Sub42_Sub2 buffer) {
        this.buffer = buffer;
    }
}
