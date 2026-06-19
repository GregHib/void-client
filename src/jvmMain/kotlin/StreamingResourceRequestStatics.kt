import java.util.*

object StreamingResourceRequestStatics {
    @JvmField
            var anInt10447: Int = -1
            @JvmField
            var anInt10448: Int = 0
            @JvmField
            var aBoolean10450: Boolean = false
            @JvmField
            var anInt10451: Int = 0
            @JvmField
            var anInt10452: Int = 0
            @JvmField
            var anInt10454: Int = 0
            @JvmField
            var anInt10455: Int = 0
            @JvmStatic
            fun method3260(i: Int) {
                var class348_sub15 = ProjectileConfigUtil.aHashtable_389!!.method3484(0) as? MenuActionNode?
                while (class348_sub15 != null) {
                    if (class348_sub15.aClass55_Sub1_6768!!.method510((-125).toByte())) OpenGlModelStatics.method690(70.toByte(), (class348_sub15.anInt6773))
                    else {
                        class348_sub15.aClass55_Sub1_6768!!.method522((-91).toByte())
                        try {
                            class348_sub15.aClass55_Sub1_6768!!.method517(-2)
                        } catch (exception: Exception) {
                            LinkedListIteratorStatics.method1242("TV: " + class348_sub15.anInt6773, exception, 15004)
                            OpenGlModelStatics.method690(15.toByte(), (class348_sub15.anInt6773))
                        }
                        if (!class348_sub15.aBoolean6783 && !class348_sub15.aBoolean6781) {
                            val class348_sub23_sub1 = class348_sub15.aClass55_Sub1_6768!!.method512(0)
                            if (class348_sub23_sub1 != null) {
                                val class348_sub16_sub2 = class348_sub23_sub1.method2971(-61)
                                if (class348_sub16_sub2 != null) {
                                    class348_sub16_sub2.method2827(-17708, (class348_sub15.anInt6782))
                                    SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065!!.method2883(class348_sub16_sub2)
                                    class348_sub15.aBoolean6783 = true
                                }
                            }
                        }
                    }
                    class348_sub15 = ProjectileConfigUtil.aHashtable_389!!.method3482(0) as? MenuActionNode?
                }
                val i_0_ = 48 % ((-17 - i) / 63)
                anInt10448++
            }
    
            @JvmStatic
            fun method3261(l: Long, i: Int): String {
                try {
                    WaterMaterialPassStatics.aCalendar6221!!.setTime(Date(l))
                    anInt10455++
                    val i_1_ = WaterMaterialPassStatics.aCalendar6221!!.get(7)
                    val i_2_ = WaterMaterialPassStatics.aCalendar6221!!.get(5)
                    if (i <= 53) aBoolean10450 = false
                    val i_3_ = WaterMaterialPassStatics.aCalendar6221!!.get(2)
                    val i_4_ = WaterMaterialPassStatics.aCalendar6221!!.get(1)
                    val i_5_ = WaterMaterialPassStatics.aCalendar6221!!.get(11)
                    val i_6_ = WaterMaterialPassStatics.aCalendar6221!!.get(12)
                    val i_7_ = WaterMaterialPassStatics.aCalendar6221!!.get(13)
                    return (JagGlToolkitFactory.aStringArray1531!![i_1_ - 1] + ", " + i_2_ / 10 + i_2_ % 10 + "-" + CalendarUtil.aStringArray4129!![i_3_] + "-" + i_4_ + " " + i_5_ / 10 + i_5_ % 10 + ":" + i_6_ / 10 + i_6_ % 10 + ":" + i_7_ / 10 + i_7_ % 10 + " GMT")
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, "mba.I(" + l + ',' + i + ')')
                }
            }
    
            @JvmStatic
            fun method3262(i: Int, i_8_: Int, i_9_: Int): Boolean {
                if (i_9_ <= 75) aBoolean10450 = false
                anInt10451++
                return (i and 0x10) != 0
            }
}
