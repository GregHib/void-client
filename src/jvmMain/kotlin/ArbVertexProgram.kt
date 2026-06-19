import jaclib.memory.heap.NativeHeap
import jaggl.OpenGLStatics.glBindProgramARB
import jaggl.OpenGLStatics.glGenProgramARB
import jaggl.OpenGLStatics.glGetIntegerv
import jaggl.OpenGLStatics.glProgramRawARB
import kotlin.math.atan2
import ArbVertexProgramStatics.anInt9777
import ArbVertexProgramStatics.regionTileX

class ArbVertexProgram(i: Int) : ShaderProgram() {
    @JvmField
    var aNativeHeap9782: NativeHeap
    fun method3445(i: Int) {
        this.aNativeHeap9782.b()
        if (i != -9503) regionTileX = -29
        anInt9777++
    }

    init {
        this.aNativeHeap9782 = NativeHeap(i)
    }
}
