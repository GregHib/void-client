import HeadIconRendererStatics.method1211
import WorldListEntryStatics.method285
import java.util.zip.CRC32
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.min
import kotlin.math.sin
import TypedRecordTableStatics.method2180
import TypedRecordTableStatics.anInt3692
import TypedRecordTableStatics.anInt3693

/*
 * Class287
 */
class TypedRecordTable {
    var anInt3687: Int = 0
    var anConfigTypeProviderArray3688: Array<ConfigTypeProvider?> = emptyArray()
    var anInt3690: Int = 0
    private fun method2182(bool: Boolean, projectileFactory: ProjectileFactory?, class348_sub49: ByteBuffer?): ConfigTypeProvider? {
        try {
            anInt3692++
            if (ModelDefinitionCacheStatics.aProjectileFactory_2868 == projectileFactory) return VarpStoreStatics.method1312(64.toByte(), class348_sub49!!)
            if (ByteBufferStatics.aProjectileFactory_7175 == projectileFactory) return AnimatedModelRendererStatics.method987(743571200, class348_sub49!!)
            if (MatrixCameraTransformStatics.aProjectileFactory_5689 == projectileFactory) return ProjectileDefinition.method2287(class348_sub49!!, (-112).toByte())
            if (projectileFactory == ItemNameResolverStatics.aProjectileFactory_4997) return GlShaderProgramHandleStatics.method2660(26.toByte(), class348_sub49!!)
            if (bool != true) method2180((-104).toByte())
            if (projectileFactory == WeaveTextureNodeStatics.aProjectileFactory_9274) return ParticleEmitterDefExtStatics.method2189(class348_sub49!!, 86)
            if (projectileFactory == SkyboxGradient.aProjectileFactory_3934) return WorldMapElementStatics.method179(16533, class348_sub49!!)
            if (MapSceneDefLoaderStatics.aProjectileFactory_2489 == projectileFactory) return StringValueNodeStatics.method3322(0, class348_sub49!!)
            if (projectileFactory == SpotAnimVectorStatics.aProjectileFactory_2307) return MinimapLineDrawerStatics.method472(-27794, class348_sub49!!)
            if (OrientationRotator.aProjectileFactory_2045 == projectileFactory) return MaterialTypeMarkerStatics.method2612(class348_sub49!!, true)
            if (LocTypeDefLoaderStatics.aProjectileFactory_2507 == projectileFactory) return GlVertexBufferArbStatics.method2128(-1730, class348_sub49!!)
            return null
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("vp.F(" + bool + ',' + (if (projectileFactory != null) "{...}" else "null") + ',' + (if (class348_sub49 != null) "{...}" else "null") + ')'))
        }
    }

    fun method2183(class348_sub49: ByteBuffer, i: Int) {
        this.anInt3690 = class348_sub49.readMedium(-1)
        anInt3693++
        this.anInt3687 = class348_sub49.readUnsignedShort(842397944)
        this.anConfigTypeProviderArray3688 = arrayOfNulls<ConfigTypeProvider>(class348_sub49.readUnsignedByte(i xor 0x557d))
        val class223s = method285(-99)
        var i_27_ = 0
        if (i != 21890) method2180(25.toByte())
        while ( /**/this.anConfigTypeProviderArray3688.size > i_27_) {
            this.anConfigTypeProviderArray3688[i_27_] = method2182(true, class223s[(class348_sub49.readUnsignedByte(CameraSplineNodeStatics.method2955(i, 21885)))], class348_sub49)
            i_27_++
        }
    }
}
