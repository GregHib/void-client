package jagex3.graphics2.hw

class NativeInterface(arg0: Int, arg1: Int) {
    private val peer: Long = 0

    init {
        this.init(arg0, arg1)
    }

    external fun copyLighting(arg0: ShortArray?, arg1: ByteArray?, arg2: ShortArray?, arg3: ShortArray?, arg4: ShortArray?, arg5: ShortArray?, arg6: ByteArray?, arg7: Int, arg8: Int, arg9: ShortArray?, arg10: Int, arg11: Int, arg12: Int, arg13: Long)

    private external fun init(arg0: Int, arg1: Int)

    external fun copyNormals(arg0: ShortArray?, arg1: ShortArray?, arg2: ShortArray?, arg3: ByteArray?, arg4: Float, arg5: Float, arg6: Int, arg7: Int, arg8: Int, arg9: Long)

    external fun copyPositions(arg0: IntArray?, arg1: IntArray?, arg2: IntArray?, arg3: ShortArray?, arg4: Int, arg5: Int, arg6: Int, arg7: Long)

    external fun setSunColour(arg0: Float, arg1: Float, arg2: Float, arg3: Float, arg4: Float)

    external fun initTextureMetrics(arg0: Int, arg1: Byte, arg2: Byte)

    external fun release()

    external fun setAmbient(arg0: Float)

    external fun copyTexCoords(arg0: FloatArray?, arg1: FloatArray?, arg2: Int, arg3: Int, arg4: Int, arg5: Long)

    external fun copyColours(arg0: ShortArray?, arg1: ByteArray?, arg2: ShortArray?, arg3: Int, arg4: ShortArray?, arg5: Int, arg6: Int, arg7: Int, arg8: Long)

    external fun setSunDirection(arg0: Float, arg1: Float, arg2: Float)
}
