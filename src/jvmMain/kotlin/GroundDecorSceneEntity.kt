import ModelBatchBaseStatics.method1130
import HostPingThreadStatics.method1301
import VorbisOggDecoderStatics.method2967
import ChatMessageStreamStatics.method136
import GroundDecorSceneEntityStatics.method2402
import GroundDecorSceneEntityStatics.anInt9969
import GroundDecorSceneEntityStatics.anInt9970
import GroundDecorSceneEntityStatics.anInt9972
import GroundDecorSceneEntityStatics.anInt9973
import GroundDecorSceneEntityStatics.anInt9975
import GroundDecorSceneEntityStatics.anInt9978
import GroundDecorSceneEntityStatics.anInt9979
import GroundDecorSceneEntityStatics.anInt9982
import GroundDecorSceneEntityStatics.anInt9984
import GroundDecorSceneEntityStatics.anInt9985
import GroundDecorSceneEntityStatics.anInt9986
import GroundDecorSceneEntityStatics.anInt9987
import GroundDecorSceneEntityStatics.anInt9990
import GroundDecorSceneEntityStatics.anInt9992
import GroundDecorSceneEntityStatics.anInt9995
import GroundDecorSceneEntityStatics.anInt9996
import GroundDecorSceneEntityStatics.anInt9997
import GroundDecorSceneEntityStatics.anInt9998
import GroundDecorSceneEntityStatics.anInt10000
import GroundDecorSceneEntityStatics.anInt10001
import GroundDecorSceneEntityStatics.anInt10002

/* Class318_Sub1_Sub1_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class GroundDecorSceneEntity internal constructor(var_renderer: Renderer?, npcConfig: NpcConfig, i: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, bool: Boolean, i_24_: Int, bool_25_: Boolean) : TileSceneEntity(i_21_, i_22_, i_23_, i, i_20_, npcConfig.anInt930), RenderTarget {
    private val aBoolean9974: Boolean
    private var aRenderNode9976: RenderNode? = null
    private val aByte9980: Byte
    private var aBoolean9983 = false
    private val aBoolean9988: Boolean
    private var aBoolean9989 = false
    private var aShort9991: Short = 0
    private var aAbstractModel_9993: AbstractModel? = null
    private var aCircleHitbox_9999: CircleHitbox? = null
    public override fun method2380(var_renderer: Renderer?, i: Int, bool: Boolean, class318_sub1: SceneEntity?, i_0_: Int, i_1_: Byte, i_2_: Int) {
        do {
            try {
                anInt9970++
                if (i_1_ > -106) method2402(-5, 56.toByte())
                if (class318_sub1 !is GroundDecorSceneEntity) break
                val class318_sub1_sub1_sub2_3_ = class318_sub1
                if (aAbstractModel_9993 == null || class318_sub1_sub1_sub2_3_.aAbstractModel_9993 == null) break
                aAbstractModel_9993!!.method613((class318_sub1_sub1_sub2_3_.aAbstractModel_9993), i_2_, i, i_0_, bool)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("uo.N(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'))
            }
            break
        } while (false)
    }

    public override fun method2379(i: Int): Int {
        anInt10000++
        if (i != -25675) return -120
        if (aAbstractModel_9993 == null) return 0
        return aAbstractModel_9993!!.ma()
    }

    override fun method43(var_renderer: Renderer?, i: Int) {
        anInt9995++
        val `object`: Any? = null
        val var_renderNode: RenderNode?
        if (aRenderNode9976 == null && aBoolean9988) {
            val class2 = method2401(var_renderer, 262144, true, 22)
            var_renderNode = if (class2 == null) null else class2.aRenderNode118
        } else {
            var_renderNode = aRenderNode9976
            aRenderNode9976 = null
        }
        if (var_renderNode != null) method1301(var_renderNode, this.aByte6376.toInt(), this.x, this.y, null)
    }

    private fun method2401(var_renderer: Renderer?, i: Int, bool: Boolean, i_4_: Int): ModelOrSpriteHolder? {
        anInt9985++
        val class51 = GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2005(0, aShort9991.toInt() and 0xffff)
        val var_terrainTile: TerrainTile?
        val var_terrainTile_5_: TerrainTile?
        if (aBoolean9983) {
            var_terrainTile = SoundCacheState.aTerrainTileArray4142!![this.aByte6376.toInt()]
            var_terrainTile_5_ = TerrainTileShapeStatics.aTerrainTileArray8801!![0]
        } else {
            var_terrainTile = (TerrainTileShapeStatics.aTerrainTileArray8801!![this.aByte6376.toInt()])
            if (this.aByte6376 < 3) var_terrainTile_5_ = (TerrainTileShapeStatics.aTerrainTileArray8801!![1 + this.aByte6376])
            else var_terrainTile_5_ = null
        }
        return class51.method476(var_renderer, var_terrainTile_5_, 22, i, this.x, bool, var_terrainTile, this.anInt6382, this.y, aByte9980.toInt(), 128)
    }

    public override fun method2392(bool: Boolean) {
        anInt9972++
        if (bool == true) {
            aBoolean9989 = false
            if (aAbstractModel_9993 != null) aAbstractModel_9993!!.s(0x10000.inv() and aAbstractModel_9993!!.ua())
        }
    }

    override fun method42(i: Int): Int {
        anInt9969++
        if (i >= -62) return -1
        return aShort9991.toInt() and 0xffff
    }

    public override fun method2386(i: Int, var_renderer: Renderer?): SceneEntityModel? {
        anInt9990++
        if (aAbstractModel_9993 == null) return null
        val class101 = var_renderer!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        val class318_sub4 = method136(i, aBoolean9974, false)
        if (ParticleSystemRendererStatics.aBoolean3870) aAbstractModel_9993!!.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), LocalPlayerState.anInt1906, 0)
        else aAbstractModel_9993!!.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        return class318_sub4
    }

    override fun method38(i: Int): Boolean {
        if (i != -18443) aCircleHitbox_9999 = null
        anInt10002++
        return aBoolean9988
    }

    public override fun method2388(i: Int): Boolean {
        if (i > -65) return true
        anInt9978++
        return aBoolean9989
    }

    public override fun method2376(i: Int): Boolean {
        if (i >= -12) method2392(true)
        anInt9975++
        if (aAbstractModel_9993 != null) {
            return !aAbstractModel_9993!!.r()
        }
        return true
    }

    public override fun method2394(bool: Boolean): Int {
        anInt9979++
        if (bool != true) method38(-4)
        if (aAbstractModel_9993 != null) return aAbstractModel_9993!!.fa()
        return 0
    }

    override fun method41(i: Int): Int {
        anInt10001++
        if (i != -32228) method2394(false)
        return aByte9980.toInt()
    }

    override fun method40(i: Int) {
        if (i == -12031) {
            anInt9982++
            if (aAbstractModel_9993 != null) aAbstractModel_9993!!.method612()
        }
    }

    public override fun method2377(i: Byte): Boolean {
        if (i.toInt() != 122) method40(3)
        anInt9973++
        if (aAbstractModel_9993 == null) return false
        return aAbstractModel_9993!!.F()
    }

    override fun method44(i: Int, var_renderer: Renderer?) {
        anInt9986++
        val `object`: Any? = null
        val var_renderNode: RenderNode?
        if (aRenderNode9976 != null || !aBoolean9988) {
            var_renderNode = aRenderNode9976
            aRenderNode9976 = null
        } else {
            val class2 = method2401(var_renderer, 262144, true, 22)
            var_renderNode = if (class2 == null) null else class2.aRenderNode118
        }
        if (var_renderNode != null) method1130(var_renderNode, this.aByte6376.toInt(), this.x, this.y, null)
        if (i != 836) aShort9991 = 86.toShort()
    }

    public override fun method2391(var_renderer: Renderer?, i: Int, i_16_: Int, i_17_: Int): Boolean {
        if (i_17_ != 0) anInt9997 = -51
        anInt9996++
        val class64 = method2404(var_renderer!!, 69, 131072)
        if (class64 != null) {
            val class101 = var_renderer!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            if (ParticleSystemRendererStatics.aBoolean3870) return class64.method623(i_16_, i, class101, false, 0, LocalPlayerState.anInt1906)
            return class64.method628(i_16_, i, class101, false, 0)
        }
        return false
    }

    private fun method2404(var_renderer: Renderer, i: Int, i_18_: Int): AbstractModel? {
        anInt9984++
        val i_19_ = 65 / ((-34 - i) / 53)
        if (aAbstractModel_9993 != null && var_renderer.method3667(aAbstractModel_9993!!.ua(), i_18_) == 0) return aAbstractModel_9993
        val class2 = method2401(var_renderer, i_18_, false, 22)
        if (class2 != null) return class2.aAbstractModel_119
        return null
    }

    init {
        do {
            try {
                aBoolean9983 = bool
                aBoolean9974 = (npcConfig.anInt874 != 0 && !bool)
                this.y = i_23_
                aBoolean9989 = bool_25_
                this.x = i_21_
                aByte9980 = i_24_.toByte()
                aShort9991 = npcConfig.anInt941.toShort()
                aBoolean9988 = (var_renderer!!.method3682() && npcConfig.aBoolean894 && !aBoolean9983 && IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350) != 0)
                var i_26_ = 2048
                if (aBoolean9989) i_26_ = i_26_ or 0x10000
                val class2 = method2401(var_renderer, i_26_, aBoolean9988, 22)
                if (class2 == null) break
                aAbstractModel_9993 = class2.aAbstractModel_119
                aRenderNode9976 = class2.aRenderNode118
                if (!aBoolean9989) break
                aAbstractModel_9993 = aAbstractModel_9993!!.method614(0.toByte(), i_26_, false)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("uo.<init>(" + (if (var_renderer != null) "{...}" else "null") + ',' + (if (npcConfig != null) "{...}" else "null") + ',' + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + bool + ',' + i_24_ + ',' + bool_25_ + ')'))
            }
            break
        } while (false)
    }

    public override fun method2381(var_renderer: Renderer?, i: Int): CircleHitbox? {
        if (aCircleHitbox_9999 == null) aCircleHitbox_9999 = (method2967(this.x, method2404(var_renderer!!, 86, 0), this.y, this.anInt6382, i xor 0x5))
        if (i != 7) return null
        anInt9998++
        return aCircleHitbox_9999
    }

    public override fun method2387(var_renderer: Renderer?, i: Int) {
        if (i >= -125) aBoolean9983 = false
        anInt9987++
    }

    override fun method39(i: Int): Int {
        val i_27_ = -125 % ((i - -91) / 35)
        anInt9992++
        return 22
    }
}
