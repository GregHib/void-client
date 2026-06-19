import CharacterRenderStateStatics.method2778
import jaclib.memory.StreamStatics.floatToRawIntBits
import OpenGlTerrainTileStatics.method4001
import java.util.*
import FloatBufferStatics.anInt9741
import FloatBufferStatics.anInt9744
import FloatBufferStatics.aBoolean9746

class FloatBuffer internal constructor(i: Int) : ByteBuffer(i) {
    fun method3399(i: Int, f: Float) {
        anInt9741++
        val i_23_ = floatToRawIntBits(f)
        this.aByteArray7154!![this.anInt7197++] = i_23_.toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_23_ shr 8).toByte()
        if (i != 18291) aBoolean9746 = true
        this.aByteArray7154!![this.anInt7197++] = (i_23_ shr 16).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_23_ shr 24).toByte()
    }

    fun method3400(f: Float, i: Byte) {
        anInt9744++
        val i_24_ = floatToRawIntBits(f)
        this.aByteArray7154!![this.anInt7197++] = (i_24_ shr 24).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_24_ shr 16).toByte()
        if (i >= -76) aBoolean9746 = true
        this.aByteArray7154!![this.anInt7197++] = (i_24_ shr 8).toByte()
        this.aByteArray7154!![this.anInt7197++] = i_24_.toByte()
    }
}
