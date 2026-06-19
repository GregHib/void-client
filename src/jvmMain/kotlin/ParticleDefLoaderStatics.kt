import DetailLevelOptionStateStatics.method1837
import CacheEntryReferenceStatics.method3194

object ParticleDefLoaderStatics {
    var anInt2457: Int = 0
            var anInt2459: Int = 0
            var anInt2460: Int = 0
            @JvmField
            var aBackgroundWorkerThread_2462: BackgroundWorkerThread? = null
            var anInt2463: Int = 0
            @JvmField
            var anInt2464: Int = 0
            var anInt2465: Int = 0
            var anIntArray2466: IntArray? = IntArray(14)
            var anInt2467: Int = 0
    
            @JvmStatic
            fun method1376(class318_sub1: SceneEntity?) {
                if (class318_sub1 != null) {
                    for (i in 0..1) {
                        var class318_sub1_0_: SceneEntity? = null
                        var class318_sub1_1_ = LinkedListNodeStatics.aClass318_Sub1Array4293!![i]
                        while (class318_sub1_1_ != null) {
                            if (class318_sub1_1_ === class318_sub1) {
                                if (class318_sub1_0_ != null) class318_sub1_0_.aClass318_Sub1_6379 = (class318_sub1_1_.aClass318_Sub1_6379)
                                else LinkedListNodeStatics.aClass318_Sub1Array4293!![i] = (class318_sub1_1_.aClass318_Sub1_6379)
                                PcmStreamBufferStatics.aBoolean8870 = true
                                return
                            }
                            class318_sub1_0_ = class318_sub1_1_
                            class318_sub1_1_ = (class318_sub1_1_.aClass318_Sub1_6379)
                        }
                        class318_sub1_0_ = null
                        var class318_sub1_2_ = BackgroundWorkerThreadStatics.aClass318_Sub1Array3226!![i]
                        while (class318_sub1_2_ != null) {
                            if (class318_sub1_2_ === class318_sub1) {
                                if (class318_sub1_0_ != null) class318_sub1_0_.aClass318_Sub1_6379 = (class318_sub1_2_.aClass318_Sub1_6379)
                                else BackgroundWorkerThreadStatics.aClass318_Sub1Array3226!![i] = (class318_sub1_2_.aClass318_Sub1_6379)
                                PcmStreamBufferStatics.aBoolean8870 = true
                                return
                            }
                            class318_sub1_0_ = class318_sub1_2_
                            class318_sub1_2_ = (class318_sub1_2_.aClass318_Sub1_6379)
                        }
                        class318_sub1_0_ = null
                        var class318_sub1_3_: SceneEntity? = OverlayColorTable.aClass318_Sub1Array1754!![i]
                        while (class318_sub1_3_ != null) {
                            if (class318_sub1_3_ === class318_sub1) {
                                if (class318_sub1_0_ != null) class318_sub1_0_.aClass318_Sub1_6379 = (class318_sub1_3_.aClass318_Sub1_6379)
                                else OverlayColorTable.aClass318_Sub1Array1754!![i] = (class318_sub1_3_.aClass318_Sub1_6379!!)
                                PcmStreamBufferStatics.aBoolean8870 = true
                                return
                            }
                            class318_sub1_0_ = class318_sub1_3_
                            class318_sub1_3_ = (class318_sub1_3_.aClass318_Sub1_6379)
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method1378(i: Int) {
                aBackgroundWorkerThread_2462 = null
                anIntArray2466 = null
                if (i != 14) method1382(99, -102)
            }
    
            fun method1379(i: Int, i_4_: Int, i_5_: Int): Boolean {
                anInt2459++
                if (i != 4) return true
                return (method3194(i_5_, i_4_, 126.toByte()) and method1837(i_4_, 46, i_5_))
            }
    
            fun method1382(i: Int, i_6_: Int): Int {
                anInt2463++
                if (i != 6406) {
                    if (i != 6409) {
                        if (i == 32841) return 1
                        if (i != 6410) {
                            if (i == 6407) return 3
                            if (i == 6408) return 4
                        } else return 2
                    } else return 1
                } else return 1
                if (i_6_ != -6409) anIntArray2466 = null
                throw IllegalArgumentException("")
            }
}
