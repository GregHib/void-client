import jaclib.memory.heap.NativeHeap

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

    companion object {
        @JvmField
        var anInt9771: Int = 0
        @JvmField
        var anInt9772: Int = 0
        @JvmField
        var aCameraNodeList_9773: CameraNodeList? = CameraNodeList()
        @JvmField
        var anInt9774: Int = 0
        @JvmField
        var anInt9775: Int = -1
        @JvmField
        var anInt9776: Int = 0

        @JvmStatic
        fun method3439(i: Int): Int {
            anInt9771++
            if (i <= 92) return 99
            if (Buffer.anInt7207 == 1) return SynthVoiceGroup.anInt8854
            return Class59_Sub1.anInt5283
        }

        @JvmStatic
        fun method3441(i: Int) {
            aCameraNodeList_9773 = null
            if (i != 1) method3439(-118)
        }
    }
}
