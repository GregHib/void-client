package jaclib.memory

object StreamStatics {
    @JvmStatic
            external fun floatToRawIntBits(arg0: Float): Int
    
            @JvmStatic
            private external fun getLSB(arg0: Int): Byte
    
            @JvmStatic
            fun c(): Boolean {
                return getLSB(-65536).toInt() == -1
            }
}
