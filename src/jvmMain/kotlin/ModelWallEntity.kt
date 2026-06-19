import ModelBatchBaseStatics.method1130
import WidgetNodeLinkStatics.method1197
import HostPingThreadStatics.method1301
import ParticleDetailOptionStateStatics.method1796
import RemoveRoofsOptionStateStatics.method1813
import VorbisOggDecoderStatics.method2967
import FixedFunctionWaterPassStatics.method3549
import ChatMessageStreamStatics.method136
import ModelWallEntityStatics.anInt10119
import ModelWallEntityStatics.anInt10121
import ModelWallEntityStatics.anInt10122
import ModelWallEntityStatics.anInt10123
import ModelWallEntityStatics.aNodeDeque_10125
import ModelWallEntityStatics.anInt10126
import ModelWallEntityStatics.anInt10131
import ModelWallEntityStatics.anInt10132
import ModelWallEntityStatics.anInt10133
import ModelWallEntityStatics.anInt10136
import ModelWallEntityStatics.anInt10139
import ModelWallEntityStatics.anInt10140
import ModelWallEntityStatics.anInt10141
import ModelWallEntityStatics.anInt10142
import ModelWallEntityStatics.anInt10143
import ModelWallEntityStatics.anInt10144
import ModelWallEntityStatics.anInt10146
import ModelWallEntityStatics.anInt10147

/* Class318_Sub1_Sub5_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ModelWallEntity internal constructor(var_renderer: Renderer?, npcConfig: NpcConfig?, i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, bool: Boolean, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int) : WallEntity(i_8_, i_9_, i_10_, i, i_7_, i_11_, i_12_), RenderTarget {
    private val aByte10118: Byte
    private var aAbstractModel_10124: AbstractModel? = null
    private var aCircleHitbox_10127: CircleHitbox? = null
    private var aRenderNode10128: RenderNode? = null
    private val aShort10129: Short
    private var aBoolean10130 = false
    private var aBoolean10137 = false
    private var aBoolean10138 = false
    private var aByte10145: Byte = 0
    private fun method2488(i: Int, i_0_: Int, var_renderer: Renderer): AbstractModel? {
        if (i_0_ != 0) return null
        anInt10126++
        if (aAbstractModel_10124 != null && var_renderer.method3667(aAbstractModel_10124!!.ua(), i) == 0) return aAbstractModel_10124
        val class2 = method2491((-51).toByte(), false, i, var_renderer)
        if (class2 == null) return null
        return class2.aAbstractModel_119
    }

    public override fun method2386(i: Int, var_renderer: Renderer?): SceneEntityModel? {
        anInt10122++
        if (aAbstractModel_10124 == null) return null
        val class101 = var_renderer!!.method3705()
        class101.method894((this.x - -this.aShort8781), this.anInt6382, (this.y - -this.aShort8769))
        val class318_sub4 = method136(i, aBoolean10130, false)
        if (ParticleSystemRendererStatics.aBoolean3870) aAbstractModel_10124!!.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), LocalPlayerState.anInt1906, 0)
        else aAbstractModel_10124!!.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        return class318_sub4
    }

    override fun method40(i: Int) {
        if (i != -12031) aByte10145 = (-104).toByte()
        anInt10147++
        if (aAbstractModel_10124 != null) aAbstractModel_10124!!.method612()
    }

    public override fun method2377(i: Byte): Boolean {
        if (i.toInt() != 122) aBoolean10137 = false
        anInt10131++
        if (aAbstractModel_10124 != null) return aAbstractModel_10124!!.F()
        return false
    }

    override fun method42(i: Int): Int {
        anInt10143++
        if (i >= -62) method39(-120)
        return 0xffff and aShort10129.toInt()
    }

    public override fun method2379(i: Int): Int {
        anInt10123++
        if (i != -25675) aAbstractModel_10124 = null
        if (aAbstractModel_10124 != null) return aAbstractModel_10124!!.ma()
        return 0
    }

    public override fun method2391(var_renderer: Renderer?, i: Int, i_2_: Int, i_3_: Int): Boolean {
        anInt10119++
        val class64 = method2488(131072, i_3_, var_renderer!!)
        if (class64 != null) {
            val class101 = var_renderer.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            if (ParticleSystemRendererStatics.aBoolean3870) return class64.method623(i_2_, i, class101, false, 0, LocalPlayerState.anInt1906)
            return class64.method628(i_2_, i, class101, false, 0)
        }
        return false
    }

    public override fun method2376(i: Int): Boolean {
        anInt10136++
        if (i > -12) return false
        if (aAbstractModel_10124 != null) {
            return !aAbstractModel_10124!!.r()
        }
        return true
    }

    override fun method39(i: Int): Int {
        anInt10141++
        val i_4_ = -57 % ((-91 - i) / 35)
        return aByte10145.toInt()
    }

    override fun method43(var_renderer: Renderer?, i: Int) {
        if (i != -14218) aCircleHitbox_10127 = null
        anInt10144++
        val `object`: Any? = null
        val var_renderNode: RenderNode?
        if (aRenderNode10128 != null || !aBoolean10137) {
            var_renderNode = aRenderNode10128
            aRenderNode10128 = null
        } else {
            val class2 = method2491((-51).toByte(), true, 262144, var_renderer)
            var_renderNode = if (class2 == null) null else class2.aRenderNode118
        }
        if (var_renderNode != null) method1301(var_renderNode, this.aByte6376.toInt(), this.x, this.y, null)
    }

    public override fun method2387(var_renderer: Renderer?, i: Int) {
        if (i < -125) anInt10133++
    }

    override fun method44(i: Int, var_renderer: Renderer?) {
        anInt10121++
        val `object`: Any? = null
        val var_renderNode: RenderNode?
        if (aRenderNode10128 == null && aBoolean10137) {
            val class2 = method2491((-51).toByte(), true, 262144, var_renderer)
            var_renderNode = if (class2 == null) null else class2.aRenderNode118
        } else {
            var_renderNode = aRenderNode10128
            aRenderNode10128 = null
        }
        if (var_renderNode != null) method1130(var_renderNode, this.aByte6376.toInt(), this.x, this.y, null)
        if (i != 836) method2391(null, -123, 0, -64)
    }

    public override fun method2381(var_renderer: Renderer?, i: Int): CircleHitbox? {
        if (i != 7) method2381(null, -71)
        if (aCircleHitbox_10127 == null) aCircleHitbox_10127 = (method2967(this.x, method2488(0, 0, var_renderer!!), this.y, this.anInt6382, 2))
        anInt10140++
        return aCircleHitbox_10127
    }

    private fun method2491(i: Byte, bool: Boolean, i_5_: Int, var_renderer: Renderer?): ModelOrSpriteHolder? {
        if (i.toInt() != -51) aNodeDeque_10125 = null
        anInt10142++
        val class51 = GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2005(0, 0xffff and aShort10129.toInt())
        val var_terrainTile: TerrainTile?
        val var_terrainTile_6_: TerrainTile?
        if (aBoolean10138) {
            var_terrainTile = SoundCacheState.aTerrainTileArray4142!![this.aByte6376.toInt()]
            var_terrainTile_6_ = TerrainTileShapeStatics.aTerrainTileArray8801!![0]
        } else {
            var_terrainTile = (TerrainTileShapeStatics.aTerrainTileArray8801!![this.aByte6376.toInt()])
            if (this.aByte6376 < 3) var_terrainTile_6_ = (TerrainTileShapeStatics.aTerrainTileArray8801!![this.aByte6376 - -1])
            else var_terrainTile_6_ = null
        }
        return class51.method476(var_renderer, var_terrainTile_6_, aByte10145.toInt(), i_5_, this.x, bool, var_terrainTile, this.anInt6382, this.y, aByte10118.toInt(), 128)
    }

    public override fun method2394(bool: Boolean): Int {
        if (bool != true) aBoolean10138 = false
        anInt10139++
        if (aAbstractModel_10124 != null) return aAbstractModel_10124!!.fa()
        return 0
    }

    init {
        do {
            try {
                aBoolean10130 = npcConfig!!.anInt874 != 0 && !bool
                aByte10145 = i_13_.toByte()
                aShort10129 = npcConfig.anInt941.toShort()
                this.y = i_10_
                aBoolean10138 = bool
                this.x = i_8_
                aByte10118 = i_14_.toByte()
                aBoolean10137 = (var_renderer!!.method3682() && npcConfig.aBoolean894 && !aBoolean10138 && IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350) != 0)
                val class2 = method2491((-51).toByte(), aBoolean10137, 2048, var_renderer)
                if (class2 == null) break
                aAbstractModel_10124 = class2.aAbstractModel_119
                aRenderNode10128 = class2.aRenderNode118
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("co.<init>(" + (if (var_renderer != null) "{...}" else "null") + ',' + (if (npcConfig != null) "{...}" else "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'))
            }
            break
        } while (false)
    }

    override fun method41(i: Int): Int {
        if (i != -32228) aBoolean10130 = true
        anInt10146++
        return aByte10118.toInt()
    }

    override fun method38(i: Int): Boolean {
        anInt10132++
        if (i != -18443) aCircleHitbox_10127 = null
        return aBoolean10137
    }
}
