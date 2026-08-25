package jagex3.graphics2.hw

actual class NativeInterface actual constructor(arg0: Int, arg1: Int) {
    /*private*/ actual val peer: Long = 0

    init {
        this.init(arg0, arg1)
    }

    actual external fun copyLighting(arg0: ShortArray?, arg1: ByteArray?, arg2: ShortArray?, arg3: ShortArray?, arg4: ShortArray?, arg5: ShortArray?, arg6: ByteArray?, arg7: Int, arg8: Int, arg9: ShortArray?, arg10: Int, arg11: Int, arg12: Int, arg13: Long)

    /*private*/ actual external fun init(arg0: Int, arg1: Int)

    actual external fun copyNormals(arg0: ShortArray?, arg1: ShortArray?, arg2: ShortArray?, arg3: ByteArray?, arg4: Float, arg5: Float, arg6: Int, arg7: Int, arg8: Int, arg9: Long)

    actual external fun copyPositions(arg0: IntArray?, arg1: IntArray?, arg2: IntArray?, arg3: ShortArray?, arg4: Int, arg5: Int, arg6: Int, arg7: Long)

    actual external fun setSunColour(arg0: Float, arg1: Float, arg2: Float, arg3: Float, arg4: Float)

    actual external fun initTextureMetrics(arg0: Int, arg1: Byte, arg2: Byte)

    actual external fun release()

    actual external fun setAmbient(arg0: Float)

    actual external fun copyTexCoords(arg0: FloatArray?, arg1: FloatArray?, arg2: Int, arg3: Int, arg4: Int, arg5: Long)

    actual external fun copyColours(arg0: ShortArray?, arg1: ByteArray?, arg2: ShortArray?, arg3: Int, arg4: ShortArray?, arg5: Int, arg6: Int, arg7: Int, arg8: Long)

    actual external fun setSunDirection(arg0: Float, arg1: Float, arg2: Float)
}
