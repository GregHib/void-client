object HardKeyedCacheEntryReferenceStatics {
    @JvmField
            var anInt10439: Int = 0
            @JvmField
            var anInt10441: Int = 0
            @JvmField
            var aHashtable_10442: Hashtable?
            @JvmField
            var anInt10443: Int = 2
            @JvmField
            var anInt10444: Int = 0
            @JvmField
            var anInt10445: Int = 0
    
            @JvmStatic
            fun method3207(i: Byte) {
                val i_1_ = -126 % ((i - -27) / 61)
                aHashtable_10442 = null
            }
    
            @JvmStatic
            fun method3208(class318_sub1_sub3_sub3: ProjectedGroundDecor, i: Int, i_2_: Int) {
                anInt10439++
                if (class318_sub1_sub3_sub3.anIntArray10236 != null) {
                    val i_3_ = (class318_sub1_sub3_sub3.anIntArray10236!![1 + i])
                    if (i_3_ != class318_sub1_sub3_sub3.anInt10286) {
                        class318_sub1_sub3_sub3.anInt10322 = (class318_sub1_sub3_sub3.anInt10319)
                        class318_sub1_sub3_sub3.anInt10286 = i_3_
                        class318_sub1_sub3_sub3.anInt10244 = 1
                        class318_sub1_sub3_sub3.anInt10232 = 0
                        class318_sub1_sub3_sub3.anInt10294 = 0
                        class318_sub1_sub3_sub3.anInt10267 = 0
                        if ((class318_sub1_sub3_sub3.anInt10286) != -1) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, class318_sub1_sub3_sub3.anInt10267, (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(class318_sub1_sub3_sub3.anInt10286, 7)), -83)
                    }
                }
                if (i_2_ > -4) method3207((-83).toByte())
            }
    
            init {
                aHashtable_10442 = Hashtable(8)
            }
}
