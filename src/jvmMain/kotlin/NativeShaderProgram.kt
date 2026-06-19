import jaclib.memory.heap.NativeHeap
import NativeShaderProgramStatics.anInt9772

class NativeShaderProgram(i: Int) : ShaderProgram() {
    @JvmField
    var aNativeHeap9770: NativeHeap

    init {
        this.aNativeHeap9770 = NativeHeap(i)
    }

    fun method3440(i: Int) {
        anInt9772++
        this.aNativeHeap9770.b()
        val i_0_ = -30 / ((i - -26) / 52)
    }
}
