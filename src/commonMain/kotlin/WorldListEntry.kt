import kotlin.jvm.JvmStatic
/* Class19 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WorldListEntry {

    var aString306: String? = null

    var anInt308: Int = 0

    var aByte310: Byte = 0
    var aString312: String? = null

    var aString313: String? = null

    var aString314: String? = null

    companion object {

        var anInt305: Int = 0

        var anInt307: Int = 0

        var anInt309: Int = 0

        fun method283(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
            var class318_sub5 = NpcDefinition.aDoublyLinkedNodeList_2957!!.method1872(8) as SceneTextLabel?
            while (class318_sub5 != null) {
                if (class318_sub5.anInt6421 <= GlGroundShaderPass.anInt7396) class318_sub5.method2373(false)
                else {
                    SceneTextLabel.method2505(i_0_ shr 1, class318_sub5.anInt6420 * 2, 0, i_5_, i_2_ shr 1, class318_sub5.anInt6418, 256 + (class318_sub5.anInt6422 shl 9), i_1_, (class318_sub5.anInt6419 shl 9) + 256)
                    NodeDequeStatics.aRSFont_3326!!.method2575(122.toByte(), i_3_ - -RemoveRoofsOptionState.anIntArray6062!![0], 0xffffff.inv() or class318_sub5.anInt6415, class318_sub5.aString6416, 0, i_4_ - -RemoveRoofsOptionState.anIntArray6062!![1])
                }
                class318_sub5 = (NpcDefinition.aDoublyLinkedNodeList_2957!!.method1878(0.toByte()) as SceneTextLabel?)
            }
            anInt305++
            if (i >= -108) InboundPacketHeader.aInboundPacketHeader_304 = null
        }

        @JvmStatic
        fun method284(i: Byte) {
            InboundPacketHeader.aInboundPacketHeader_315 = null
            InboundPacketHeader.aInboundPacketHeader_304 = null
            SpotAnimDefCache.aSpotAnimVectorArray311s = null
        }

        @JvmStatic
        fun method285(i: Int): Array<ProjectileFactory?> {
            anInt309++
            return (arrayOf<ProjectileFactory?>(ModelDefinitionCache.aProjectileFactory_2868, ByteBufferStatics.aProjectileFactory_7175, SkyboxGradient.aProjectileFactory_3934, MapSceneDefLoader.aProjectileFactory_2489, MatrixCameraTransform.aProjectileFactory_5689, WeaveTextureNode.aProjectileFactory_9274, ItemNameResolver.aProjectileFactory_4997, TypedRecordTable.aProjectileFactory_2307, OrientationRotator.aProjectileFactory_2045, LocTypeDefLoader.aProjectileFactory_2507))
        }

        @JvmStatic
        fun method286(i: Byte, privilegedOperationWorker: PrivilegedOperationWorker): Array<MapSceneTile?> {
            anInt307++
            if (!privilegedOperationWorker.method2247(-4)) return arrayOfNulls<MapSceneTile>(0)
            val i_6_ = 52 / ((39 - i) / 61)
            val class144 = privilegedOperationWorker.method2240(972476528)
            while (class144!!.anInt1997 == 0) TexGenMaterialPass.method2161((-97).toByte(), 10L)
            if (class144.anInt1997 == 2) return arrayOfNulls<MapSceneTile>(0)
            val `is` = class144.anObject1998 as IntArray
            val mapSceneTiles = arrayOfNulls<MapSceneTile>(`is`.size shr 2)
            var i_7_ = 0
            while (mapSceneTiles.size > i_7_) {
                val mapSceneTile = MapSceneTile()
                mapSceneTiles[i_7_] = mapSceneTile
                mapSceneTile.anInt1047 = `is`[i_7_ shl 2]
                mapSceneTile.anInt1054 = `is`[1 + (i_7_ shl 2)]
                mapSceneTile.anInt1046 = `is`[2 + (i_7_ shl 2)]
                mapSceneTile.anInt1052 = `is`[(i_7_ shl 2) + 3]
                i_7_++
            }
            return mapSceneTiles
        }

    }
}
