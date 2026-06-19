import DoublyLinkedNodeListStatics.method1879
import WalkingTypeUtil.method1978
import SynthVoiceGroupStatics.method2826
import SoundBankPatchStatics.method2929
import TimedRecordAccessorStatics.method3309
import jaggl.OpenGLStatics.glBindRenderbufferEXT
import jaggl.OpenGLStatics.glFramebufferRenderbufferEXT
import jaggl.OpenGLStatics.glGenRenderbuffersEXT
import jaggl.OpenGLStatics.glRenderbufferStorageEXT
import jaggl.OpenGLStatics.glRenderbufferStorageMultisampleEXT
import kotlin.math.sqrt
import RenderbufferObjectStatics.method3171
import RenderbufferObjectStatics.anInt8561
import RenderbufferObjectStatics.anInt8566
import RenderbufferObjectStatics.anInt8568
import RenderbufferObjectStatics.anInt8570

class RenderbufferObject : HashLinkedListNode, IndexedDisposable {
    private var anInt8562 = -1
    private var anInt8563 = -1
    private val aHa_Sub2_8564: OpenGlRenderer?
    var anInt8565: Int = 0
    private val anInt8567: Int
    private var anInt8569 = 0
    private val anInt8571: Int
    var anInt8572: Int = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt8570++
        method3172(4)
//        super.finalize()
    }

    fun method3172(i: Int) {
        anInt8566++
        if (anInt8569 > 0) {
            aHa_Sub2_8564!!.method3810(anInt8569, anInt8571, -101)
            anInt8569 = 0
        }
        if (i != 4) method3171(null, 57, 49, -22, 43, -43, -45, true, true)
    }

    fun method3173(i: Int, i_9_: Int, i_10_: Int) {
        glFramebufferRenderbufferEXT(i_10_, i_9_, i, anInt8569)
        anInt8568++
        anInt8562 = i_10_
        anInt8563 = i_9_
    }

    override fun method37(i: Int) {
        anInt8561++
        if (i != -3022) this.anInt8572 = 15
        glFramebufferRenderbufferEXT(anInt8562, anInt8563, 36161, 0)
        anInt8562 = -1
        anInt8563 = -1
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, i_11_: Int, i_12_: Int) {
        try {
            this.anInt8572 = i_11_
            aHa_Sub2_8564 = var_ha_Sub2
            this.anInt8565 = i_12_
            anInt8567 = i
            glGenRenderbuffersEXT(1, NormalMapTextureNodeStatics.anIntArray9431, 0)
            anInt8569 = NormalMapTextureNodeStatics.anIntArray9431!![0]
            glBindRenderbufferEXT(36161, anInt8569)
            glRenderbufferStorageEXT(36161, anInt8567, (this.anInt8572), (this.anInt8565))
            anInt8571 = (this.anInt8565 * this.anInt8572 * aHa_Sub2_8564!!.method3798(anInt8567, 2))
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("kw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_11_ + ',' + i_12_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, i_13_: Int, i_14_: Int, i_15_: Int) {
        try {
            this.anInt8572 = i_13_
            anInt8567 = i
            this.anInt8565 = i_14_
            aHa_Sub2_8564 = var_ha_Sub2
            glGenRenderbuffersEXT(1, NormalMapTextureNodeStatics.anIntArray9431, 0)
            anInt8569 = NormalMapTextureNodeStatics.anIntArray9431!![0]
            glBindRenderbufferEXT(36161, anInt8569)
            glRenderbufferStorageMultisampleEXT(36161, i_15_, anInt8567, this.anInt8572, this.anInt8565)
            anInt8571 = (this.anInt8565 * this.anInt8572 * aHa_Sub2_8564!!.method3798(anInt8567, 2))
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("kw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'))
        }
    }
}
