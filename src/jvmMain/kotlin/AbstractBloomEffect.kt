import LightDetailOptionStateStatics.method1802
import java.awt.Canvas
import java.io.IOException
import java.net.Socket
import AbstractBloomEffectStatics.method2757
import AbstractBloomEffectStatics.anInt6619
import AbstractBloomEffectStatics.anInt6622
import AbstractBloomEffectStatics.anInt6623
import AbstractBloomEffectStatics.aByteArray6624
import AbstractBloomEffectStatics.anInt6626

abstract class AbstractBloomEffect internal constructor(var aHa_Sub2_6618: OpenGlRenderer) : LinkedListNode() {
    @JvmField
    var aBoolean6621: Boolean = false
    abstract fun method2750(class258_sub3: GlTexture2D?, class258_sub3_0_: GlTexture2D?, i: Int, i_1_: Byte)

    abstract fun method2751(bool: Boolean): Boolean

    abstract fun method2754(i: Int, i_5_: Byte, i_6_: Int)

    abstract fun method2756(i: Byte, i_10_: Int)

    abstract fun method2758(i: Int): Boolean

    fun method2759(i: Int): Boolean {
        if (i != 1) return true
        anInt6626++
        return false
    }

    fun method2760(i: Byte): Boolean {
        if (i.toInt() != 1) method2763(37.toByte())
        anInt6619++
        return this.aBoolean6621
    }

    open fun method2761(bool: Boolean): Int {
        anInt6622++
        if (bool != true) method2757(-63)
        return 0
    }

    abstract fun method2763(i: Byte)

    fun method2764(i: Int): Int {
        if (i != 1) aByteArray6624 = null
        anInt6623++
        return 1
    }
}
