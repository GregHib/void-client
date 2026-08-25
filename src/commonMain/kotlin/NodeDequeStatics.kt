import kotlin.jvm.JvmStatic
import awt.Canvas

object NodeDequeStatics {

    var aJs5Archive_3323: Js5Archive? = null
    var anInt3324: Int = 0

    var aRSFont_3326: RSFont? = null
    var anObject3331: Any? = null
    var aModelLightingConfigArrayArray3335: Array<Array<ModelLightingConfig?>?>? = null
    var anInt3338: Int = 0
    fun method1991(f: Float, f_3_: Float, fs: FloatArray?, i: Int, i_4_: Int, bool: Boolean, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, f_9_: Float, fs_10_: FloatArray?, i_11_: Int, i_12_: Int) {
        var i = i
        var i_7_ = i_7_
        var i_8_ = i_8_
        do {
            try {
                anInt3338++
                i_7_ -= i_6_
                i -= i_4_
                i_8_ -= i_11_
                val f_13_ = fs!![2] * i.toFloat() + (fs[1] * i_8_.toFloat() + fs[0] * i_7_.toFloat())
                val f_14_ = (i_7_.toFloat() * fs[3] + i_8_.toFloat() * fs[4] + i.toFloat() * fs[5])
                val f_15_ = fs[8] * i.toFloat() + (fs[6] * i_7_.toFloat() + i_8_.toFloat() * fs[7])
                var f_16_: Float
                var f_17_: Float
                if (i_12_ == 0) {
                    f_16_ = 0.5f + (f_3_ + f_13_)
                    f_17_ = -f_15_ + f + 0.5f
                } else if (i_12_ == 1) {
                    f_17_ = 0.5f + (f_15_ + f)
                    f_16_ = 0.5f + (f_3_ + f_13_)
                } else if (i_12_ == 2) {
                    f_16_ = 0.5f + (-f_13_ + f_3_)
                    f_17_ = -f_14_ + f_9_ + 0.5f
                } else if (i_12_ == 3) {
                    f_17_ = -f_14_ + f_9_ + 0.5f
                    f_16_ = f_13_ + f_3_ + 0.5f
                } else if (i_12_ == 4) {
                    f_16_ = f_15_ + f + 0.5f
                    f_17_ = -f_14_ + f_9_ + 0.5f
                } else {
                    f_16_ = 0.5f + (f + -f_15_)
                    f_17_ = -f_14_ + f_9_ + 0.5f
                }
                if (i_5_ == 1) {
                    val f_18_ = f_16_
                    f_16_ = -f_17_
                    f_17_ = f_18_
                } else if (i_5_ == 2) {
                    f_17_ = -f_17_
                    f_16_ = -f_16_
                } else if (i_5_ == 3) {
                    val f_19_ = f_16_
                    f_16_ = f_17_
                    f_17_ = -f_19_
                }
                fs_10_!![1] = f_17_
                fs_10_[0] = f_16_
                if (bool == false) break
                method1991(0.31271333f, 1.5829445f, null, -17, 88, true, -70, -107, 8, 5, -0.347415f, null, -24, -19)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("uh.B(" + f + ',' + f_3_ + ',' + (if (fs != null) "{...}" else "null") + ',' + i + ',' + i_4_ + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + f_9_ + ',' + (if (fs_10_ != null) "{...}" else "null") + ',' + i_11_ + ',' + i_12_ + ')'))
            }
            break
        } while (false)
    }

    @JvmStatic
    fun method1992(class318_sub1: SceneEntity, i: Int, i_20_: Int, i_21_: Int) {
        if (i_20_ < ActorEntity.anInt6451) {
            val class357 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_20_ + 1]!![i_21_]
            if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402!!.method2388(-107)) class318_sub1.method2380(NativeLibraryState.aRenderer171, 0, true, (class357.aClass318_Sub1_Sub1_4402), 0, (-116).toByte(), ActorEntity.anInt3465)
        }
        if (i_21_ < ActorEntity.anInt6451) {
            val class357 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_20_]!![i_21_ + 1]
            if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402!!.method2388(-92)) class318_sub1.method2380(NativeLibraryState.aRenderer171, 0, true, (class357.aClass318_Sub1_Sub1_4402), ActorEntity.anInt3465, (-128).toByte(), 0)
        }
        if (i_20_ < ActorEntity.anInt6451 && i_21_ < ActorEntity.anInt7054) {
            val class357 = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_20_ + 1]!![i_21_ + 1])
            if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402!!.method2388(-107)) class318_sub1.method2380(NativeLibraryState.aRenderer171, 0, true, (class357.aClass318_Sub1_Sub1_4402), ActorEntity.anInt3465, (-117).toByte(), ActorEntity.anInt3465)
        }
        if (i_20_ < ActorEntity.anInt6451 && i_21_ > 0) {
            val class357 = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_20_ + 1]!![i_21_ - 1])
            if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402!!.method2388(-90)) class318_sub1.method2380(NativeLibraryState.aRenderer171, 0, true, (class357.aClass318_Sub1_Sub1_4402), -ActorEntity.anInt3465, (-116).toByte(), ActorEntity.anInt3465)
        }
    }

    @JvmStatic
    fun method1994(i: Int) {
        aModelLightingConfigArrayArray3335 = null
        anObject3331 = null
        if (i != -13722) method2000(-104, 106, null, null)
        aJs5Archive_3323 = null
        aRSFont_3326 = null
    }

    fun method2000(i: Int, i_23_: Int, canvas: Canvas?, var_renderConfig: RenderConfig?): Renderer {
        try {
            anInt3324++
            return OpenGlRenderer(canvas, var_renderConfig, i_23_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("uh.D(" + i + ',' + i_23_ + ',' + (if (canvas != null) "{...}" else "null") + ',' + (if (var_renderConfig != null) "{...}" else "null") + ')'))
        }
    }
}