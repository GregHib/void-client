import TexGenMaterialPassStatics.method2161
import TypedRecordTableStatics.method2178
import HeightMapNoise.method2278
import ConfigVarProgressStatics.method2312
import ConnectionStateTypeStatics.method527
import MapRegionLoaderStatics.method751
import MapRegionLoaderStatics.method758
import ChatMessageStreamStatics.method136
import java.awt.Frame
import MapElementDecorStatics.anInt10328
import MapElementDecorStatics.anInt10329
import MapElementDecorStatics.anInt10333
import MapElementDecorStatics.anInt10337
import MapElementDecorStatics.anInt10342
import MapElementDecorStatics.anInt10343
import MapElementDecorStatics.anInt10346
import MapElementDecorStatics.anInt10347
import MapElementDecorStatics.anInt10352
import MapElementDecorStatics.anInt10353
import MapElementDecorStatics.anInt10354
import MapElementDecorStatics.anInt10358
import MapElementDecorStatics.anInt10359
import MapElementDecorStatics.anInt10360
import MapElementDecorStatics.anInt10362
import MapElementDecorStatics.anInt10363

class MapElementDecor internal constructor(private val anInt10355: Int, i_34_: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int, i_42_: Int, i_43_: Int, i_44_: Int, i_45_: Int) : GroundDecorEntity(i_36_, i_37_, i_38_, i_39_, i_40_, i_41_, i_42_, i_43_, i_44_, false, 0.toByte()) {
    private var anInt10331 = 0
    private var aWidgetDefinition_10332: WidgetDefinition? = null
    private var anInt10334 = 0
    private var anInt10335 = 0
    private var aBoolean10338 = true
    private var anInt10339 = 0
    private var aClass318_Sub10_10341: SceneGraphContainer? = null
    var aBoolean10345: Boolean = false
    var anInt10349: Int
    private val anInt10350: Int
    private var anInt10356 = 0
    public override fun method2386(i: Int, var_renderer: Renderer?): SceneEntityModel? {
        anInt10352++
        val class64 = method2465(var_renderer, anInt10355, (if (anInt10334 == 0) 0 else 5) or 0x800, (-82).toByte())
        if (class64 == null) return null
        if (anInt10334 != 0) class64.a(anInt10334 * 2048)
        val class101 = var_renderer!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        method2467(class64, var_renderer, -1, class101)
        val class318_sub4 = method136(i, false, false)
        if (ParticleSystemRendererStatics.aBoolean3870) class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), LocalPlayerState.anInt1906, 0)
        else class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        if (aClass318_Sub10_10341 != null) {
            val class98 = aClass318_Sub10_10341!!.method2525()
            if (!ParticleSystemRendererStatics.aBoolean3870) var_renderer.method3684(class98)
            else var_renderer.method3685(class98, LocalPlayerState.anInt1906)
        }
        aBoolean10338 = class64.F()
        anInt10331 = class64.fa()
        anInt10356 = class64.ma()
        return class318_sub4
    }

    public override fun method2394(bool: Boolean): Int {
        if (bool != true) return 18
        anInt10337++
        return anInt10331
    }

    public override fun method2380(var_renderer: Renderer?, i: Int, bool: Boolean, class318_sub1: SceneEntity?, i_0_: Int, i_1_: Byte, i_2_: Int) {
        try {
            anInt10347++
            if (i_1_ > -106) this.aBoolean10345 = false
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("lf.N(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'))
        }
    }

    protected fun finalize() {
        anInt10329++
        if (aClass318_Sub10_10341 != null) aClass318_Sub10_10341!!.method2534()
    }

    public override fun method2392(bool: Boolean) {
        anInt10343++
        if (bool != true) aWidgetDefinition_10332 = null
        throw IllegalStateException()
    }

    public override fun method2376(i: Int): Boolean {
        if (i > -12) return false
        anInt10362++
        return false
    }

    private fun method2465(var_renderer: Renderer?, i: Int, i_26_: Int, i_27_: Byte): AbstractModel? {
        anInt10353++
        if (i_27_.toInt() != -82) return null
        val class368 = ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(122.toByte(), i)
        val var_s = TerrainTileShapeStatics.aTerrainTileArray8801!![this.plane.toInt()]
        val var_s_28_ = (if (this.aByte6376 < 3) (TerrainTileShapeStatics.aTerrainTileArray8801!![1 + this.aByte6376]) else null)
        if (!this.aBoolean10345) return class368.method3565(anInt10339, anInt10335, this.anInt6382, i_26_, true, var_renderer, anInt10350, this.x, -129, ParticleEmitterNodeStatics.aWidgetCache_191, var_s_28_, this.y, var_s)
        return class368.method3565(0, -1, this.anInt6382, i_26_, true, var_renderer, -1, this.x, -129, ParticleEmitterNodeStatics.aWidgetCache_191, var_s_28_, this.y, var_s)
    }

    fun method2466(bool: Boolean) {
        if (bool == false) {
            if (aClass318_Sub10_10341 != null) aClass318_Sub10_10341!!.method2534()
            anInt10359++
        }
    }

    public override fun method2377(i: Byte): Boolean {
        anInt10358++
        if (i.toInt() != 122) method2388(-40)
        return aBoolean10338
    }

    private fun method2467(abstractModel: AbstractModel?, var_renderer: Renderer?, i: Int, abstractCameraTransform: AbstractCameraTransform?) {
        do {
            try {
                abstractModel!!.method620(abstractCameraTransform)
                anInt10360++
                val class129s = abstractModel.method619()
                val class342s = abstractModel.method604()
                if (i == -1) {
                    if ((aClass318_Sub10_10341 == null || (aClass318_Sub10_10341!!.aBoolean6470)) && (class129s != null || class342s != null)) aClass318_Sub10_10341 = SceneGraphContainerStatics.method2526(GlGroundShaderPassStatics.anInt7396, true)
                    if (aClass318_Sub10_10341 == null) break
                    aClass318_Sub10_10341!!.method2536(var_renderer, GlGroundShaderPassStatics.anInt7396.toLong(), class129s, class342s, false)
                    aClass318_Sub10_10341!!.method2533(this.plane.toInt(), this.aShort8743.toInt(), this.aShort8751.toInt(), this.aShort8750.toInt(), this.aShort8747.toInt())
                }
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("lf.BA(" + (if (abstractModel != null) "{...}" else "null") + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + (if (abstractCameraTransform != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    public override fun method2379(i: Int): Int {
        anInt10342++
        if (i != -25675) anInt10334 = 73
        return anInt10356
    }

    public override fun method2381(var_renderer: Renderer?, i: Int): CircleHitbox? {
        if (i != 7) method2387(null, -106)
        anInt10363++
        return null
    }

    public override fun method2388(i: Int): Boolean {
        if (i >= -65) return false
        anInt10328++
        return false
    }

    public override fun method2387(var_renderer: Renderer?, i: Int) {
        if (i >= -125) anInt10331 = 38
        anInt10354++
        val class64 = method2465(var_renderer, anInt10355, 0, (-82).toByte())
        if (class64 != null) {
            val class101 = var_renderer!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            method2467(class64, var_renderer, -1, class101)
        }
    }

    public override fun method2391(var_renderer: Renderer?, i: Int, i_29_: Int, i_30_: Int): Boolean {
        anInt10346++
        if (i_30_ != 0) return false
        return false
    }

    init {
        anInt10350 = -1
        anInt10334 = i_45_
        this.anInt10349 = i_35_ + i_34_
        val class368 = ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(57.toByte(), anInt10355)
        val i_46_ = class368.anInt4503
        if (i_46_ == -1) this.aBoolean10345 = true
        else {
            aWidgetDefinition_10332 = ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(i_46_, 7)
            this.aBoolean10345 = false
        }
        if (this.anInt10349 == i_35_) method2178(this, anInt10335, aWidgetDefinition_10332, -99)
    }

    fun method2470(i: Int, i_47_: Byte) {
        if (i_47_ <= -14) {
            anInt10333++
            if (!this.aBoolean10345) {
                anInt10339 += i
                while (aWidgetDefinition_10332!!.anIntArray267!![anInt10335] < anInt10339) {
                    anInt10339 -= (aWidgetDefinition_10332!!.anIntArray267!![anInt10335])
                    anInt10335++
                    if (aWidgetDefinition_10332!!.anIntArray237.size <= anInt10335) {
                        this.aBoolean10345 = true
                        break
                    }
                }
                if (!this.aBoolean10345) method2178(this, anInt10335, aWidgetDefinition_10332, -59)
            }
        }
    }
}
