import kotlinx.coroutines.Runnable

/**
 * Thin interface extracted from [SoftwareRenderer] so that other CPU-rasterizer
 * implementations (e.g. the JS `oa` renderer) can construct the same collaborator
 * classes ([SoftwareModel], [SoftwareModelRenderer] and subclasses, the Software*Font
 * classes, [SoftwareTerrainTile], [SpriteRenderable], [ParticleSystemState], [ShadowProjector])
 * without depending on the concrete [SoftwareRenderer] class.
 *
 * Every member here already exists with a matching name/type on [SoftwareRenderer].
 *
 * Note: aRenderConfig4579, K, T, KA, C, ya and method3645 are ALSO declared on the common
 * [Renderer] base class, but are re-declared here too (with identical signatures) because
 * the dependent classes (SoftwareModel, SoftwareModelRenderer, SoftwareTerrainTile,
 * ShadowProjector, etc.) hold their renderer reference typed as this interface alone -
 * not as `Renderer` - so those members must be reachable through this interface as well.
 * A class implementing both `Renderer` and this interface satisfies both requirements with
 * a single `override` per member, since the signatures are identical.
 */
interface SoftwareRasterHost {
    val aRenderConfig4579: RenderConfig?
    val anIntArray7483: IntArray?
    val aFloatArray7511: FloatArray?
    val aFloatArray7502: FloatArray?
    val anInt7477: Int
    val anInt7476: Int
    val anInt7503: Int
    val anInt7496: Int
    val anInt7507: Int
    val anInt7482: Int
    val anInt7485: Int
    val anInt7490: Int
    val anInt7491: Int
    val anInt7497: Int
    val anInt7500: Int
    val anInt7501: Int
    val anInt7504: Int
    val anInt7506: Int
    val anInt7508: Int
    val anInt7509: Int
    val anInt7510: Int
    val anInt7494: Int
    val anInt7473: Int
    val anInt7474: Int
    val anInt7478: Int
    val anInt7479: Int
    val anInt7484: Int
    val aClass101_Sub1_7492: MatrixCameraTransform?
    val aClass348_Sub31_7469: AbstractFrameBufferSurface?

    fun method3716(): Boolean
    fun method3718(i: Int): IntArray?
    fun method3719(i: Int): IntArray?
    fun method3720(i: Int, i_377_: Int, i_378_: Int, i_379_: Int, i_380_: Int, i_381_: Int, i_382_: Int, i_383_: Int, i_384_: Int, i_385_: Int)
    fun method3722(i: Int): Int
    fun method3724(runnable: Runnable?): ParticleSystemState?
    fun method3725(i: Int): Boolean
    fun method3726(i: Int): Int
    fun method3727(i: Int): Boolean
    fun method3714(i: Int): Boolean

    // Re-declared from Renderer (see class doc) so they're reachable through this
    // interface type alone.
    fun K(`is`: IntArray?)
    fun T(i: Int, i_148_: Int, i_149_: Int, i_150_: Int)
    fun KA(i: Int, i_177_: Int, i_178_: Int, i_179_: Int)
    fun C(bool: Boolean)
    fun ya()
    fun method3645(i: Int, i_41_: Int, i_42_: Int, i_43_: Int, i_44_: Int, i_45_: Int)
}
