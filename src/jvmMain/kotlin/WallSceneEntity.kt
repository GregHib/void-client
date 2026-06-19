import BrightnessOptionStateStatics.method1745
import ModelHeaderCacheStatics.method1935
import WaterMaterialPassStatics.method2148
import VorbisOggDecoderStatics.method2967
import ChatMessageStreamStatics.method136
import WallSceneEntityStatics.anInt9943
import WallSceneEntityStatics.anInt9944
import WallSceneEntityStatics.anInt9946
import WallSceneEntityStatics.anInt9947
import WallSceneEntityStatics.anInt9948
import WallSceneEntityStatics.anInt9951
import WallSceneEntityStatics.anInt9952
import WallSceneEntityStatics.anInt9953
import WallSceneEntityStatics.anInt9954
import WallSceneEntityStatics.anInt9956
import WallSceneEntityStatics.anInt9957
import WallSceneEntityStatics.aAbstractModelRendererArray9959
import WallSceneEntityStatics.anInt9960
import WallSceneEntityStatics.anInt9961
import WallSceneEntityStatics.anInt9962
import WallSceneEntityStatics.anInt9963
import WallSceneEntityStatics.anInt9964
import WallSceneEntityStatics.anInt9965
import WallSceneEntityStatics.anInt9968

/* Class318_Sub1_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WallSceneEntity internal constructor(var_renderer: Renderer?, npcConfig: NpcConfig, i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, bool: Boolean, i_11_: Int, i_12_: Int) : TileSceneEntity(i_8_, i_9_, i_10_, i, i_7_, npcConfig.anInt930), RenderTarget {
    private var aBoolean9945 = false
    private var aCircleHitbox_9950: CircleHitbox? = null
    var aSceneObjectAnimator_9955: SceneObjectAnimator? = null
    private var aBoolean9966 = false
    override fun method42(i: Int): Int {
        anInt9943++
        if (i > -62) aCircleHitbox_9950 = null
        return (this.aSceneObjectAnimator_9955!!.anInt3063)
    }

    public override fun method2387(var_renderer: Renderer?, i: Int) {
        anInt9962++
        val class64 = this.aSceneObjectAnimator_9955!!.method1668(true, true, -128, 262144, var_renderer)
        if (class64 != null) {
            val i_0_ = this.x shr 9
            val i_1_ = this.y shr 9
            val class101 = var_renderer!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            this.aSceneObjectAnimator_9955!!.method1670(i_0_, class101, i_1_, var_renderer, i_0_, class64, false, (-73).toByte(), i_1_)
        }
    }

    public override fun method2394(bool: Boolean): Int {
        if (bool != true) return -82
        anInt9963++
        return this.aSceneObjectAnimator_9955!!.method1663(109)
    }

    override fun method40(i: Int) {
        anInt9954++
    }

    override fun method41(i: Int): Int {
        anInt9957++
        if (i != -32228) return -36
        return (this.aSceneObjectAnimator_9955!!.anInt3052)
    }

    public override fun method2386(i: Int, var_renderer: Renderer?): SceneEntityModel? {
        anInt9968++
        val class64 = this.aSceneObjectAnimator_9955!!.method1668(false, true, -128, 2048, var_renderer)
        if (class64 == null) return null
        val class101 = var_renderer!!.method3705()
        class101.method894(this.x, this.anInt6382, this.y)
        val class318_sub4 = method136(i, aBoolean9966, false)
        val i_2_ = this.x shr 9
        val i_3_ = this.y shr 9
        this.aSceneObjectAnimator_9955!!.method1670(i_2_, class101, i_3_, var_renderer, i_2_, class64, true, (-73).toByte(), i_3_)
        if (!ParticleSystemRendererStatics.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), LocalPlayerState.anInt1906, 0)
        if ((this.aSceneObjectAnimator_9955!!.aClass318_Sub10_3081) != null) {
            val class98 = this.aSceneObjectAnimator_9955!!.aClass318_Sub10_3081!!.method2525()
            if (ParticleSystemRendererStatics.aBoolean3870) var_renderer.method3685(class98, LocalPlayerState.anInt1906)
            else var_renderer.method3684(class98)
        }
        aBoolean9945 = (class64.F() || (this.aSceneObjectAnimator_9955!!.aClass318_Sub10_3081) != null)
        if (aCircleHitbox_9950 != null) method1935(this.y, this.anInt6382, aCircleHitbox_9950, class64, false, this.x)
        else aCircleHitbox_9950 = (method2967(this.x, class64, this.y, this.anInt6382, 2))
        return class318_sub4
    }

    public override fun method2380(var_renderer: Renderer?, i: Int, bool: Boolean, class318_sub1: SceneEntity?, i_4_: Int, i_5_: Byte, i_6_: Int) {
        try {
            anInt9946++
            if (i_5_ > -106) this.aSceneObjectAnimator_9955 = null
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("saa.N(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'))
        }
    }

    init {
        try {
            this.aSceneObjectAnimator_9955 = SceneObjectAnimator(var_renderer, npcConfig, 22, i_11_, i, i_7_, this, bool, i_12_)
            aBoolean9966 = npcConfig.anInt874 != 0 && !bool
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("saa.<init>(" + (if (var_renderer != null) "{...}" else "null") + ',' + (if (npcConfig != null) "{...}" else "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ')'))
        }
    }

    public override fun method2377(i: Byte): Boolean {
        anInt9964++
        if (i.toInt() != 122) this.aSceneObjectAnimator_9955 = null
        return aBoolean9945
    }

    public override fun method2379(i: Int): Int {
        if (i != -25675) aAbstractModelRendererArray9959 = null
        anInt9965++
        return this.aSceneObjectAnimator_9955!!.method1664(i xor 0x647d)
    }

    public override fun method2392(bool: Boolean) {
        if (bool != true) this.aSceneObjectAnimator_9955 = null
        anInt9953++
        throw IllegalStateException()
    }

    public override fun method2391(var_renderer: Renderer?, i: Int, i_13_: Int, i_14_: Int): Boolean {
        anInt9952++
        val class64 = this.aSceneObjectAnimator_9955!!.method1668(false, false, -128, 131072, var_renderer)
        if (class64 == null) return false
        val class101 = var_renderer!!.method3705()
        if (i_14_ != 0) return true
        class101.method894(this.x, this.anInt6382, this.y)
        if (ParticleSystemRendererStatics.aBoolean3870) return class64.method623(i_13_, i, class101, false, 0, LocalPlayerState.anInt1906)
        return class64.method628(i_13_, i, class101, false, 0)
    }

    public override fun method2381(var_renderer: Renderer?, i: Int): CircleHitbox? {
        if (i != 7) return null
        anInt9960++
        return aCircleHitbox_9950
    }

    public override fun method2388(i: Int): Boolean {
        anInt9944++
        return i >= -65
    }

    override fun method38(i: Int): Boolean {
        anInt9948++
        if (i != -18443) method2381(null, -3)
        return this.aSceneObjectAnimator_9955!!.method1665(2)
    }

    override fun method43(var_renderer: Renderer?, i: Int) {
        if (i == -14218) {
            this.aSceneObjectAnimator_9955!!.method1674(-1, var_renderer)
            anInt9951++
        }
    }

    public override fun method2376(i: Int): Boolean {
        anInt9956++
        if (i >= -12) aCircleHitbox_9950 = null
        return false
    }

    override fun method39(i: Int): Int {
        val i_16_ = 7 / ((-91 - i) / 35)
        anInt9947++
        return (this.aSceneObjectAnimator_9955!!.anInt3079)
    }

    override fun method44(i: Int, var_renderer: Renderer?) {
        if (i != 836) aBoolean9966 = true
        this.aSceneObjectAnimator_9955!!.method1667(116.toByte(), var_renderer)
        anInt9961++
    }
}
