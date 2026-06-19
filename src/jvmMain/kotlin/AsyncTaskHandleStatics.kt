object AsyncTaskHandleStatics {
    var anInt2573: Int = 0
            var anInt2575: Int = 0
            @JvmField
            var anInt2578: Int = 0
            var aShortArray2579: ShortArray? = null
            var anInt2580: Int = 0
            @JvmField
            var anInt2581: Int = 0
            var anInt2582: Int = 0
    
            fun method1434(i: Int) {
                anInt2573++
                var class318_sub6 = InputStream_Sub2Statics.aDoublyLinkedNodeList_83!!.method1875(60) as SceneEffectMarker?
                while (class318_sub6 != null) {
                    MapElementDecorStatics.method2461(class318_sub6, true)
                    class318_sub6 = (InputStream_Sub2Statics.aDoublyLinkedNodeList_83!!.method1875(60) as SceneEffectMarker?)
                }
                val i_0_: Int
                val i_1_: Int
                if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 1) {
                    i_0_ = 0
                    i_1_ = 3
                } else {
                    i_1_ = ParticleSystemStateStatics.anInt2204
                    i_0_ = i_1_
                }
                ClientStatics.method115()
                for (i_2_ in i_0_..i_1_) {
                    ClientStatics.method109()
                    ClientStatics.method117(i_2_)
                    ClientStatics.method104(i_2_)
                }
                ClientStatics.method106()
                if (i == -14988) ClientStatics.method112()
            }
    
            @JvmStatic
            fun method1436(i: Int, i_3_: Int): Boolean {
                val i_4_ = 22 % ((i - 16) / 35)
                anInt2582++
                return i_3_ == (i_3_ and -i_3_)
            }
    
            @JvmStatic
            fun method1438(i: Int) {
                val i_5_ = 85 % ((i - -28) / 60)
                aShortArray2579 = null
            }
}
