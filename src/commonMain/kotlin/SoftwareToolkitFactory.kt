/**
 * Common factory for constructing a software-rendered [ha_Sub1].
 *
 * The software-toolkit branch (`i_171_ == 0` in JVM dispatcher) used to be
 * hard-wired inside the jvmMain [Class348_Sub5Statics.method2753]. Extracting it
 * here lets the JS target call [build] directly without going through the JVM
 * GL/D3D dispatcher, and lets the JVM delegate its software branch here too.
 *
 * All constructor-lambda types are already in commonMain ([Interface13],
 * [Interface4], [Class64Base], [SBase], [Class167Base], [Class60Base],
 * [Class105Factory]); only their *concrete implementations* are platform-specific,
 * which is why the lambdas are parameters supplied by the caller.
 *
 * @param interface13Factory      Factory for [Interface13] (raster-clip regions).
 * @param interface4Factory       Factory for [Interface4] (pixel-buffer bridge).
 * @param class64Factory          Factory for [Class64Base] (draw-command batcher).
 * @param sFactory                Factory for [SBase] (sprite-sheet).
 * @param class167Factory         Factory for [Class167Base] (glyph rasterizer).
 * @param class60Factory          Factory for [Class60Base] (palette).
 * @param class324FactoryProvider Curried factory for [Class324Base]: takes the outer
 *                                `bool` flag (controls atlas-alpha variants) and returns
 *                                the per-construction lambda passed to [ha_Sub1].
 *                                This matches how the original JVM lambda closed over
 *                                method2753's `bool` parameter.
 * @param class105FactoryProvider Factory-provider for [Class105Factory] (sprite cache).
 * @param audioInit               Platform audio initialisation hook (no-op on JS).
 * @param screenReleaseCallback   Platform screen-release hook (no-op on JS).
 */
class SoftwareToolkitFactory(
    val interface13Factory: (Int, Int) -> Interface13,
    val interface4Factory: (ha_Sub1, Interface3?, Interface13?) -> Interface4,
    val class64Factory: (ha_Sub1, Class124Base, Int, Int, Int, Int) -> Class64Base,
    val sFactory: (ha_Sub1, Int, Int, Int, Int, Array<IntArray?>, Array<IntArray?>, Int) -> SBase,
    val class167Factory: (ha_Sub1) -> Class167Base,
    val class60Factory: (Int) -> Class60Base,
    val class324FactoryProvider: (outerBool: Boolean) -> (ha_Sub1, Class143Base?, Array<Class207>?, Boolean) -> Class324Base,
    val class105FactoryProvider: (ha_Sub1) -> Class105Factory,
    val audioInit: () -> Unit = {},
    val screenReleaseCallback: () -> Unit = {},
) {
    /**
     * Construct an [ha_Sub1], initialise its display target, and return it as [ha].
     *
     * @param varD               Game data descriptor (may be null during early init).
     * @param gameSurfaceFactory Platform surface factory ([AwtGameSurfaceFactory] on JVM,
     *                           JS equivalent on JS).
     * @param displayTarget      Wraps the platform drawing surface.
     * @param width              Viewport width in pixels.
     * @param height             Viewport height in pixels.
     * @param bool               Passed through to [class324FactoryProvider] (controls
     *                           whether alpha-channel atlas variants are created); always
     *                           `true` from the JVM dispatcher.
     */
    fun build(
        varD: d?,
        gameSurfaceFactory: GameSurfaceFactory,
        displayTarget: DisplayTarget,
        width: Int,
        height: Int,
        bool: Boolean,
    ): ha {
        val haSubObj = ha_Sub1(
            varD,
            gameSurfaceFactory,
            interface13Factory,
            interface4Factory,
            class64Factory,
            sFactory,
            class167Factory,
            class60Factory,
            class324FactoryProvider(bool),
            class105FactoryProvider,
            audioInit,
            screenReleaseCallback,
        )
        haSubObj.method3643(displayTarget, height, width)
        haSubObj.method3677(displayTarget)
        return haSubObj
    }
}
