import SoundBankPatchStatics.method2929
import GameClock.method599
import jaggl.OpenGLStatics.glCompileShaderARB
import jaggl.OpenGLStatics.glCreateShaderObjectARB
import jaggl.OpenGLStatics.glDeleteObjectARB
import jaggl.OpenGLStatics.glGetInfoLogARB
import jaggl.OpenGLStatics.glGetObjectParameterivARB
import jaggl.OpenGLStatics.glShaderSourceARB
import java.math.BigInteger
import TimedTileQueueEntryStatics.anInt9646
import TimedTileQueueEntryStatics.anInt9647
import TimedTileQueueEntryStatics.anInt9648
import TimedTileQueueEntryStatics.anInt9649
import TimedTileQueueEntryStatics.anInt9653
import TimedTileQueueEntryStatics.aAbstractModelRenderer_9658
import TimedTileQueueEntryStatics.aAbstractModelRenderer_9659

class TimedTileQueueEntry internal constructor(i: Int, i_2_: Int) : HashLinkedListNode() {
    var anInt9650: Int = 0
    var anInt9651: Int = 0
    @JvmField
    var anInt9652: Int = 0
    var aString9654: String? = null
    fun method3245(bool: Boolean): Int {
        anInt9646++
        if (bool != true) method3248(-60)
        return (this.aLong4291 ushr 32 and 0xffL).toInt()
    }

    fun method3246(i: Int) {
        this.aLong7057 = this.aLong7057 or 0x7fffffffffffffffL.inv()
        anInt9653++
        if (method3250((-89).toByte()) == 0L) GlCubemapLightPassStatics.aLinkedNodeListIterator_7325!!.method1005(true, this)
        if (i != -25490) aAbstractModelRenderer_9659 = null
    }

    fun method3248(i: Int): Int {
        if (i != 1) return -110
        anInt9647++
        return this.aLong4291.toInt()
    }

    fun method3250(i: Byte): Long {
        anInt9649++
        if (i >= -37) method3250(79.toByte())
        return this.aLong7057 and 0x7fffffffffffffffL
    }

    init {
        this.aLong4291 = i.toLong() shl 32 or i_2_.toLong()
    }

    fun method3251(i: Int) {
        anInt9648++
        this.aLong7057 = (0x7fffffffffffffffL.inv() and this.aLong7057 or method599(-120) + 500L)
        OpenGlTerrainTileStatics.aLinkedNodeListIterator_8241!!.method1005(true, this)
        if (i != -16058) aAbstractModelRenderer_9658 = null
    }
}
