object ModelTransformParamsStatics {
    var anInt4315: Int = 0
            var anInt4318: Int = 0
            var anInt4319: Int = 0
            var anInt4321: Int = 0
    
            fun method3452(i: Int, i_0_: Byte, i_1_: Int): Int {
                if (i_0_.toInt() != -15) method3452(80, 123.toByte(), -88)
                anInt4315++
                val i_2_ = i_1_ + -1 and (i shr 31)
                return (i + (i ushr 31)) % i_1_ + i_2_
            }
}
