object NativeVertexBufferStatics {
    @JvmField
            var anInt4826: Int = 0
            @JvmField
            var anInt4828: Int = 0
            @JvmField
            var anInt4829: Int = 0
            @JvmField
            var anInt4830: Int = 0
            @JvmField
            var anInt4831: Int = 0
            @JvmField
            var anInt4832: Int = 0
    
            fun method1078(`is`: ShortArray?, i: Int, i_0_: Int): ShortArray {
                anInt4829++
                if (i_0_ < 87) method1078(null, 22, -24)
                val is_1_ = ShortArray(i)
                ArrayCopyUtil.method1576(`is`!!, 0, is_1_, 0, i)
                return is_1_
            }
    
            @JvmStatic
            fun method1079(i: Int, i_2_: Int, i_3_: Int, i_4_: Int): Int {
                var i_2_ = i_2_
                anInt4826++
                if (i != 4095) return 14
                i_2_ = i_2_ and 0x3
                if (i_2_ == 0) return i_3_
                if (i_2_ == 1) return 4095 - i_4_
                if (i_2_ == 2) return 4095 + -i_3_
                return i_4_
            }
}
