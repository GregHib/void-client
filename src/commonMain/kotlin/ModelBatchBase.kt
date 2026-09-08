import kotlin.jvm.JvmStatic
/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
abstract class ModelBatchBase {
    companion object {

        var aLruByteCache_1894: LruByteCache? = LruByteCache(5)

        var aHashtable_1895: Hashtable? = Hashtable(64)

        var anInt1896: Int = 0

        var quickChat: Js5Archive? = null

        var anInt1898: Int = 0

        var aBoolean1899: Boolean = false

        var aBoolean1900: Boolean = false

        @JvmStatic
        fun method1127(i: Int) {
            quickChat = null
            aHashtable_1895 = null
            if (i == 5125) aLruByteCache_1894 = null
        }

        @JvmStatic
        fun method1128(i: Int, movementDirection: MovementDirection?): Int {
            anInt1896++
            if (MovementDirection.aMovementDirection_1179 != movementDirection) {
                if (movementDirection != MovementDirection.aMovementDirection_1181) {
                    if (movementDirection == MovementDirection.aMovementDirection_1182) return 5124
                    if (MovementDirection.aMovementDirection_1183 != movementDirection) {
                        if (movementDirection != MovementDirection.aMovementDirection_1184) {
                            if (movementDirection == MovementDirection.aMovementDirection_1185) return 5125
                            if (MovementDirection.aMovementDirection_1186 != movementDirection) {
                                if (MovementDirection.aMovementDirection_1187 == movementDirection) return 5126
                            } else return 5131
                        } else return 5123
                    } else return 5121
                } else return 5122
            } else return 5120
            if (i > -19) method1129(-7, -90)
            throw IllegalArgumentException("")
        }

        @JvmStatic
        fun method1129(i: Int, i_0_: Int) {
            GlEnvMappedWaterPass.anInt7379 = 3
            ClientLoadStateMachine.anInt2173 = i_0_
            SkeletalAnimFrameLoader.anInt481 = -1
            HslAdjustTextureNode.anInt9399 = i
            anInt1898++
        }

        @JvmStatic
        fun method1130(var_renderNode: RenderNode?, i: Int, i_1_: Int, i_2_: Int, bools: BooleanArray?): Boolean {
            var bool = false
            if (ActorEntity.aTerrainTileArray5191 != ActorEntity.aTerrainTileArray4142) {
                val i_3_ = TerrainTileShape.aTerrainTileArray8801!![i]!!.method3986(i_1_, i_2_, (-109).toByte())
                var i_4_ = 0
                while ( /**/i_4_ <= i) {
                    val var_s = TerrainTileShape.aTerrainTileArray8801!![i_4_]
                    if (var_s != null) {
                        val i_5_ = i_3_ - var_s.method3986(i_1_, i_2_, 72.toByte())
                        if (bools != null) {
                            bools[i_4_] = var_s.method3989(var_renderNode, i_1_, i_5_, i_2_, 0, false)
                            if (!bools[i_4_]) {
                                i_4_++
                                continue
                            }
                        }
                        var_s.CA(var_renderNode, i_1_, i_5_, i_2_, 0, false)
                        bool = true
                    }
                    i_4_++
                }
            }
            return bool
        }
    }
}
