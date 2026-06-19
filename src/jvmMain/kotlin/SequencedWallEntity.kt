import ModelHeaderCacheStatics.method1935
import VorbisOggDecoderStatics.method2967
import ChatMessageStreamStatics.method136
import jaggl.OpenGLStatics.glAttachObjectARB
import jaggl.OpenGLStatics.glCreateProgramObjectARB
import jaggl.OpenGLStatics.glDeleteObjectARB
import jaggl.OpenGLStatics.glDetachObjectARB
import jaggl.OpenGLStatics.glGetInfoLogARB
import jaggl.OpenGLStatics.glGetObjectParameterivARB
import jaggl.OpenGLStatics.glLinkProgramARB
import SequencedWallEntityStatics.anInt10151
import SequencedWallEntityStatics.anInt10152
import SequencedWallEntityStatics.anInt10154
import SequencedWallEntityStatics.anInt10156
import SequencedWallEntityStatics.anInt10157
import SequencedWallEntityStatics.anInt10158
import SequencedWallEntityStatics.anInt10159
import SequencedWallEntityStatics.anInt10160
import SequencedWallEntityStatics.anInt10161
import SequencedWallEntityStatics.anInt10162
import SequencedWallEntityStatics.anInt10165
import SequencedWallEntityStatics.anInt10166
import SequencedWallEntityStatics.anInt10169
import SequencedWallEntityStatics.anInt10170
import SequencedWallEntityStatics.anInt10171

class SequencedWallEntity internal constructor(var_renderer: Renderer?, npcConfig: NpcConfig?, i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, bool: Boolean, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int) : WallEntity(i_6_, i_7_, i_8_, i, i_5_, i_9_, i_10_), RenderTarget {
    private var aBoolean10148 = false
    private var aCircleHitbox_10150: CircleHitbox? = null
    private var aBoolean10153 = false
    var aSceneObjectAnimator_10155: SceneObjectAnimator? = null
    override fun method43(var_renderer: Renderer?, i: Int) {
        anInt10151++
        this.aSceneObjectAnimator_10155!!.method1674(i + 14217, var_renderer)
        if (i != -14218) method40(127)
    }

    public override fun method2394(bool: Boolean): Int {
        anInt10157++
        if (bool != true) aBoolean10153 = false
        return this.aSceneObjectAnimator_10155!!.method1663(101)
    }

    override fun method41(i: Int): Int {
        anInt10170++
        if (i != -32228) method2387(null, 89)
        return (this.aSceneObjectAnimator_10155!!.anInt3052)
    }

    override fun method38(i: Int): Boolean {
        anInt10162++
        if (i != -18443) aBoolean10148 = false
        return this.aSceneObjectAnimator_10155!!.method1665(i + 18445)
    }

    override fun method44(i: Int, var_renderer: Renderer?) {
        if (i == 836) {
            this.aSceneObjectAnimator_10155!!.method1667(116.toByte(), var_renderer)
            anInt10165++
        }
    }

    override fun method42(i: Int): Int {
        anInt10171++
        if (i > -62) return 40
        return (this.aSceneObjectAnimator_10155!!.anInt3063)
    }

    public override fun method2387(var_renderer: Renderer?, i: Int) {
        if (i >= -125) aBoolean10148 = false
        anInt10154++
        val class64 = this.aSceneObjectAnimator_10155!!.method1668(false, true, -127, 262144, var_renderer)
        if (class64 != null) {
            val i_0_ = this.x shr 9
            val i_1_ = this.y shr 9
            val class101 = var_renderer!!.method3705()
            class101.method894(this.x, this.anInt6382, this.y)
            this.aSceneObjectAnimator_10155!!.method1670(i_0_, class101, i_1_, var_renderer, i_0_, class64, false, (-73).toByte(), i_1_)
        }
    }

    override fun method39(i: Int): Int {
        anInt10161++
        val i_2_ = -29 % ((-91 - i) / 35)
        return (this.aSceneObjectAnimator_10155!!.anInt3079)
    }

    public override fun method2376(i: Int): Boolean {
        if (i >= -12) return false
        anInt10166++
        return false
    }

    public override fun method2386(i: Int, var_renderer: Renderer?): SceneEntityModel? {
        anInt10159++
        val class64 = this.aSceneObjectAnimator_10155!!.method1668(false, true, -127, 2048, var_renderer)
        if (class64 == null) return null
        val class101 = var_renderer!!.method3705()
        class101.method894((this.x + this.aShort8781), this.anInt6382, (this.y + this.aShort8769))
        val class318_sub4 = method136(i, aBoolean10153, false)
        val i_3_ = this.x shr 9
        val i_4_ = this.y shr 9
        this.aSceneObjectAnimator_10155!!.method1670(i_3_, class101, i_4_, var_renderer, i_3_, class64, true, (-73).toByte(), i_4_)
        if (!ParticleSystemRendererStatics.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), 0)
        else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414!![0]), LocalPlayerState.anInt1906, 0)
        if ((this.aSceneObjectAnimator_10155!!.aClass318_Sub10_3081) != null) {
            val class98 = this.aSceneObjectAnimator_10155!!.aClass318_Sub10_3081!!.method2525()
            if (!ParticleSystemRendererStatics.aBoolean3870) var_renderer.method3684(class98)
            else var_renderer.method3685(class98, LocalPlayerState.anInt1906)
        }
        aBoolean10148 = class64.F() || (this.aSceneObjectAnimator_10155!!.aClass318_Sub10_3081) != null
        if (aCircleHitbox_10150 == null) aCircleHitbox_10150 = (method2967(this.x, class64, this.y, this.anInt6382, 2))
        else method1935(this.y, this.anInt6382, aCircleHitbox_10150, class64, false, this.x)
        return class318_sub4
    }

    public override fun method2381(var_renderer: Renderer?, i: Int): CircleHitbox? {
        anInt10169++
        if (i != 7) return null
        return aCircleHitbox_10150
    }

    public override fun method2377(i: Byte): Boolean {
        anInt10158++
        if (i.toInt() != 122) return false
        return aBoolean10148
    }

    public override fun method2391(var_renderer: Renderer?, i: Int, i_14_: Int, i_15_: Int): Boolean {
        anInt10152++
        val class64 = this.aSceneObjectAnimator_10155!!.method1668(false, false, -128, 131072, var_renderer)
        if (class64 == null) return false
        if (i_15_ != 0) return true
        val class101 = var_renderer!!.method3705()
        class101.method894((this.aShort8781 + this.x), this.anInt6382, (this.aShort8769 + this.y))
        if (ParticleSystemRendererStatics.aBoolean3870) return class64.method623(i_14_, i, class101, false, 0, LocalPlayerState.anInt1906)
        return class64.method628(i_14_, i, class101, false, 0)
    }

    public override fun method2379(i: Int): Int {
        anInt10160++
        if (i != -25675) aBoolean10153 = false
        return this.aSceneObjectAnimator_10155!!.method1664(-119)
    }

    override fun method40(i: Int) {
        if (i == -12031) anInt10156++
    }

    init {
        try {
            this.aSceneObjectAnimator_10155 = SceneObjectAnimator(var_renderer, npcConfig, i_11_, i_12_, this.plane.toInt(), i_5_, this, bool, i_13_)
            aBoolean10153 = npcConfig!!.anInt874 != 0 && !bool
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("pw.<init>(" + (if (var_renderer != null) "{...}" else "null") + ',' + (if (npcConfig != null) "{...}" else "null") + ',' + i + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ')'))
        }
    }
}
