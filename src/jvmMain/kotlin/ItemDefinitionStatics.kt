import CacheArchiveIndexLoaderStatics.method340

object ItemDefinitionStatics {
    var anInt2751: Int = 0
            var anInt2754: Int = 0
            var anInt2768: Int = 0
            @JvmField
            var aAbstractGameSocket_2773: AbstractGameSocket? = null
            var anInt2776: Int = 0
            var anInt2780: Int = 0
            var anInt2782: Int = 0
            @JvmField
            var aLong2789: Long = 0
            var anInt2790: Int = 0
            var anInt2793: Int = 0
            var anInt2796: Int = 0
            @JvmField
            var anInt2798: Int = 0
            var anInt2800: Int = 0
            var anInt2806: Int = 0
            var anInt2809: Int = 0
            var anInt2813: Int = 0
            var anInt2814: Int = 0
            var anInt2816: Int = 0
            var anInt2828: Int = 0
            var anInt2829: Int = 0
            var anInt2832: Int = 0
            @JvmStatic
            fun method1564(i: Int) {
                aAbstractGameSocket_2773 = null
                if (i <= 54) aLong2789 = -74L
            }
    
            fun method1568(`is`: IntArray?, i: Int, i_73_: Int, i_74_: Int, fs: FloatArray?, is_75_: IntArray?, i_76_: Int, i_77_: Int, i_78_: Int, i_79_: Int, i_80_: Int, i_81_: Int, fs_82_: FloatArray?) {
                try {
                    if (i_77_ <= 112) aLong2789 = 95L
                    anInt2782++
                    var i_83_ = i * i_80_ - -i_73_
                    var i_84_ = i_81_ + i_79_ * i_74_
                    val i_85_ = -i_76_ + i_80_
                    val i_86_ = -i_76_ + i_79_
                    if (is_75_ == null) {
                        var i_87_ = 0
                        while (i_78_ > i_87_) {
                            val i_88_ = i_83_ - -i_76_
                            while (i_83_ < i_88_) fs!![i_84_++] = fs_82_!![i_83_++]
                            i_83_ += i_85_
                            i_84_ += i_86_
                            i_87_++
                        }
                    } else if (fs_82_ == null) {
                        for (i_91_ in 0..<i_78_) {
                            val i_92_ = i_76_ + i_83_
                            while (i_83_ < i_92_) `is`!![i_84_++] = is_75_[i_83_++]
                            i_83_ += i_85_
                            i_84_ += i_86_
                        }
                    } else {
                        var i_89_ = 0
                        while (i_78_ > i_89_) {
                            val i_90_ = i_83_ - -i_76_
                            while (i_83_ < i_90_) {
                                `is`!![i_84_] = is_75_[i_83_]
                                fs!![i_84_++] = fs_82_[i_83_++]
                            }
                            i_83_ += i_85_
                            i_84_ += i_86_
                            i_89_++
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("rq.C(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_73_ + ',' + i_74_ + ',' + (if (fs != null) "{...}" else "null") + ',' + (if (is_75_ != null) "{...}" else "null") + ',' + i_76_ + ',' + i_77_ + ',' + i_78_ + ',' + i_79_ + ',' + i_80_ + ',' + i_81_ + ',' + (if (fs_82_ != null) "{...}" else "null") + ')'))
                }
            }
}
