import jaclib.memory.heap.NativeHeap

object NativeShaderProgramStatics {
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
                if (ByteBufferStatics.anInt7207 == 1) return SynthVoiceGroupStatics.anInt8854
                return GrayscaleNoiseTextureStatics.anInt5283
            }
    
            @JvmStatic
            fun method3441(i: Int) {
                aCameraNodeList_9773 = null
                if (i != 1) method3439(-118)
            }
}
