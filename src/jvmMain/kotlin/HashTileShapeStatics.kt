object HashTileShapeStatics {
    @JvmField
            var aNodeDeque_8810: NodeDeque? = NodeDeque()
            @JvmField
            var anInt8811: Int = 0
            @JvmField
            var anInt8812: Int = 0
            @JvmField
            var anInt8813: Int = 0
            @JvmField
            var anInt8814: Int = 0
            @JvmField
            var aCacheLruCache_8815: CacheLruCache? = CacheLruCache(16)
            @JvmField
            var aByteArrayArray8816: Array<ByteArray?>? = null
            @JvmField
            var aIntRange_8817: IntRange? = IntRange(83, 2)
    
            @JvmStatic
            fun method2729(i: Int, i_3_: Int): Int {
                anInt8813++
                if (i_3_ != 16) return 23
                return 0xff and i
            }
    
            @JvmStatic
            fun method2730(i: Int, i_4_: Int, `is`: ByteArray, i_5_: Int): ByteArray {
                anInt8811++
                val is_6_: ByteArray?
                if (i_4_ > 0) {
                    is_6_ = ByteArray(i_5_)
                    var i_7_ = 0
                    while (i_5_ > i_7_) {
                        is_6_[i_7_] = `is`[i_4_ + i_7_]
                        i_7_++
                    }
                } else is_6_ = `is`
                val whirlpoolHash = WhirlpoolHash()
                whirlpoolHash.method829(i + -4682)
                whirlpoolHash.method832((i_5_ * 8).toLong(), is_6_, -69)
                val is_8_ = ByteArray(64)
                whirlpoolHash.method833(true, 0, is_8_)
                return is_8_
            }
    
            @JvmStatic
            fun method2731(i: Byte) {
                aByteArrayArray8816 = null
                aNodeDeque_8810 = null
                aCacheLruCache_8815 = null
                aIntRange_8817 = null
            }
}
