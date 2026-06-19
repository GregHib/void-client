import ParticleSystemStateStatics.method1296
import WaterMaterialPassStatics.method2148
import ParticleTileShapeStatics.method2732
import BrightnessTextureNodeStatics.method3086
import jaggl.OpenGLStatics.glBindFramebufferEXT
import jaggl.OpenGLStatics.glCheckFramebufferStatusEXT
import jaggl.OpenGLStatics.glDrawBuffer
import jaggl.OpenGLStatics.glGenFramebuffersEXT
import jaggl.OpenGLStatics.glReadBuffer
import kotlin.math.abs
import kotlin.math.atan2
import FrameBufferObjectStatics.anInt4864
import FrameBufferObjectStatics.anInt4865
import FrameBufferObjectStatics.anInt4866
import FrameBufferObjectStatics.anInt4867
import FrameBufferObjectStatics.anInt4868
import FrameBufferObjectStatics.anInt4869
import FrameBufferObjectStatics.anInt4871
import FrameBufferObjectStatics.aClass209_4874
import FrameBufferObjectStatics.anInt4876
import FrameBufferObjectStatics.anInt4877
import FrameBufferObjectStatics.anInt4878
import FrameBufferObjectStatics.anInt4879
import FrameBufferObjectStatics.anInt4880
import FrameBufferObjectStatics.anInt4881
import FrameBufferObjectStatics.anInt4885
import FrameBufferObjectStatics.anInt4887
import FrameBufferObjectStatics.aBoolean4888
import FrameBufferObjectStatics.anInt4889
import FrameBufferObjectStatics.anInt4892
import FrameBufferObjectStatics.anInt4893

/*
 * Class206
 */
class FrameBufferObject internal constructor(var_ha_Sub2: OpenGlRenderer) : StagedInitializer {
    private var anInt4872 = 0
    private var anInt4873: Int
    private val anIndexedDisposableArray4875 = arrayOfNulls<IndexedDisposable>(9)
    private var anInt4882 = 0
    private val aHa_Sub2_4883: OpenGlRenderer
    private var anInt4884 = 0
    private var anInt4886 = 0
    private var anInt4891: Int
    override fun method45(i: Byte) {
        anInt4865++
        glBindFramebufferEXT(36008, 0)
        if (i.toInt() == -47) {
            anInt4872 = anInt4872 and 0x1.inv()
            anInt4873 = method1504(-114)
        }
    }

    fun method1498(i: Int, i_0_: Int, i_1_: Int, class258_sub2: GlTextureCubeMap) {
        method1502(0, (-38).toByte(), class258_sub2, i, i_1_)
        if (i_0_ < -49) anInt4887++
    }

    override fun method46(i: Int) {
        glBindFramebufferEXT(36160, anInt4891)
        anInt4867++
        anInt4872 = anInt4872 or 0x4
        if (i != -11762) anInt4889 = 110
        anInt4873 = method1504(-115)
    }

    fun method1500(i: Int, i_2_: Int) {
        if (anIndexedDisposableArray4875[i_2_] != null) anIndexedDisposableArray4875[i_2_]!!.method37(-3022)
        if (i != 2983) anInt4891 = -116
        anInt4866++
        anInt4884 = anInt4884 and (1 shl i_2_).inv()
        anIndexedDisposableArray4875[i_2_] = null
    }

    private fun method1502(i: Int, i_20_: Byte, class258_sub2: GlTextureCubeMap, i_21_: Int, i_22_: Int) {
        anInt4876++
        if (anInt4873 == -1) throw RuntimeException()
        val i_23_ = 1 shl i_21_
        if (i_20_ > -16) aBoolean4888 = false
        if ((anInt4884 and (i_23_.inv())) == 0) {
            anInt4882 = class258_sub2.anInt8538
            anInt4886 = class258_sub2.anInt8538
        } else if (class258_sub2.anInt8538 != anInt4882 || anInt4886 != class258_sub2.anInt8538) throw RuntimeException()
        class258_sub2.method1961(anInt4873, i_22_, RgbNoiseTextureStatics.anIntArray5306!![i_21_], i, -1)
        anIndexedDisposableArray4875[i_21_] = class258_sub2
        anInt4884 = anInt4884 or i_23_
    }

    fun method1503(i: Int, i_24_: Byte) {
        anInt4885++
        if (i_24_.toInt() != 3) aClass209_4874 = null
        if (anInt4873 == -1) throw RuntimeException()
        glDrawBuffer(RgbNoiseTextureStatics.anIntArray5306!![i])
    }

    override fun method48(i: Int) {
        anInt4871++
        glBindFramebufferEXT(36160, 0)
        val i_25_ = 46 % ((84 - i) / 32)
        anInt4872 = anInt4872 and 0x4.inv()
        anInt4873 = method1504(-124)
    }

    private fun method1504(i: Int): Int {
        anInt4869++
        if ((0x4 and anInt4872) != 0) return 36160
        if ((0x2 and anInt4872) != 0) return 36009
        if ((0x1 and anInt4872) != 0) return 36008
        return -1
    }

    override fun method50(i: Int) {
        glBindFramebufferEXT(36009, 0)
        anInt4878++
        anInt4872 = anInt4872 and 0x2.inv()
        anInt4873 = method1504(i + 32374)
    }

    fun method1505(i: Int, i_26_: Int) {
        anInt4880++
        if ((anInt4873.inv()) == i) throw RuntimeException()
        glReadBuffer(RgbNoiseTextureStatics.anIntArray5306!![i_26_])
    }

    private fun method1506(i: Int, class258_sub3: GlTexture2D, i_27_: Int, i_28_: Int) {
        anInt4892++
        if (anInt4873 == -1) throw RuntimeException()
        val i_29_ = 1 shl i_27_
        if (i_28_ == (((i_29_.inv()) and anInt4884).inv())) {
            anInt4882 = class258_sub3.anInt8547
            anInt4886 = class258_sub3.anInt8551
        } else if ((anInt4882 != class258_sub3.anInt8547) || class258_sub3.anInt8551 != anInt4886) throw RuntimeException()
        class258_sub3.method1963(anInt4873, i, 0, RgbNoiseTextureStatics.anIntArray5306!![i_27_])
        anIndexedDisposableArray4875[i_27_] = class258_sub3
        anInt4884 = anInt4884 or i_29_
    }

    override fun method47(i: Int) {
        glBindFramebufferEXT(36009, anInt4891)
        anInt4877++
        anInt4872 = anInt4872 or 0x2
        anInt4873 = method1504(i xor 0x2cec)
    }

    fun method1507(i: Int): Boolean {
        anInt4868++
        val i_30_ = glCheckFramebufferStatusEXT(anInt4873)
        val i_31_ = -56 / ((71 - i) / 45)
        return i_30_ == 36053
    }

    fun method1508(i: Int, class348_sub42_sub2: RenderbufferObject, i_32_: Int) {
        anInt4881++
        if (anInt4873 == -1) throw RuntimeException()
        val i_33_ = 1 shl i
        if ((anInt4884 and (i_33_.inv())) == 0) {
            anInt4886 = class348_sub42_sub2.anInt8565
            anInt4882 = class348_sub42_sub2.anInt8572
        } else if ((class348_sub42_sub2.anInt8572 != anInt4882) || (anInt4886 != class348_sub42_sub2.anInt8565)) throw RuntimeException()
        val i_34_ = -68 / ((i_32_ - 64) / 49)
        class348_sub42_sub2.method3173(36161, RgbNoiseTextureStatics.anIntArray5306!![i], anInt4873)
        anIndexedDisposableArray4875[i] = class348_sub42_sub2
        anInt4884 = anInt4884 or i_33_
    }

    fun method1509(class258_sub3: GlTexture2D, i: Int, i_35_: Int) {
        method1506(i, class258_sub3, i_35_, -1)
        anInt4879++
    }

    override fun method49(i: Int) {
        anInt4893++
        glBindFramebufferEXT(36008, anInt4891)
        anInt4872 = anInt4872 or 0x1
        anInt4873 = method1504(i xor 0x6a7c)
        if (i != -27141) aBoolean4888 = false
    }

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt4864++
        aHa_Sub2_4883.method3800(96, anInt4891)
//        super.finalize()
    }

    init {
        anInt4873 = -1
        check(var_ha_Sub2.aBoolean7820) { "" }
        aHa_Sub2_4883 = var_ha_Sub2
        glGenFramebuffersEXT(1, DualMaterialContainerStatics.anIntArray1635, 0)
        anInt4891 = DualMaterialContainerStatics.anIntArray1635!![0]
    }
}
