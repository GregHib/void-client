object AsyncResourceRequestStatics {
    var aCameraRotationStub_9661: CameraRotationStub?

    var anInt9662: Int = 0

    var aString9665: String? = null

    var anInt9668: Int = 0

    @JvmStatic
    fun method3252(i: Int) {
        aCameraRotationStub_9661 = null
        aString9665 = null
        if (i != 353) aCameraRotationStub_9661 = null
    }

    @JvmStatic
    fun method3253(i: Int, i_0_: Int, i_1_: Int, var_class: Class<*>) {
        val class357 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_0_]!![i_1_]
        if (class357 != null) {
            var class148 = class357.aWidgetNodeLink_4396
            while (class148 != null) {
                val class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040!!
                if (var_class.isAssignableFrom(class318_sub1_sub3.javaClass) && (class318_sub1_sub3.aShort8743.toInt() == i_0_) && (class318_sub1_sub3.aShort8750.toInt() == i_1_)) {
                    StringValueNodeStatics.method3320(class318_sub1_sub3, false)
                    break
                }
                class148 = class148.aWidgetNodeLink_2038
            }
        }
    }

    @JvmStatic
    fun method3254(i: Int, i_2_: Int, i_3_: Int, class318_sub1_sub4: ActorEntity, class318_sub1_sub4_4_: ActorEntity?) {
        val class357 = StringValueNodeStatics.method3321(i, i_2_, i_3_)
        if (class357 != null) {
            class357.aClass318_Sub1_Sub4_4406 = class318_sub1_sub4
            class357.aClass318_Sub1_Sub4_4403 = class318_sub1_sub4_4_
            val i_5_ = if (ActorEntity.aTerrainTileArray5191 == ActorEntity.aTerrainTileArray4142) 1 else 0
            if (class318_sub1_sub4.method2376(-109)) {
                if (class318_sub1_sub4.method2377(122.toByte())) {
                    class318_sub1_sub4.aClass318_Sub1_6379 = BackgroundWorkerThread.aClass318_Sub1Array3226!![i_5_]
                    BackgroundWorkerThread.aClass318_Sub1Array3226!![i_5_] = class318_sub1_sub4
                } else {
                    class318_sub1_sub4.aClass318_Sub1_6379 = LinkedListNodeStatics.aClass318_Sub1Array4293!![i_5_]
                    LinkedListNodeStatics.aClass318_Sub1Array4293!![i_5_] = class318_sub1_sub4
                    PcmStreamBuffer.aBoolean8870 = true
                }
            } else {
                class318_sub1_sub4.aClass318_Sub1_6379 = OverlayColorTable.aClass318_Sub1Array1754!![i_5_]
                OverlayColorTable.aClass318_Sub1Array1754!![i_5_] = class318_sub1_sub4
            }
            if (class318_sub1_sub4_4_ != null) {
                if (class318_sub1_sub4_4_.method2376(-118)) {
                    if (class318_sub1_sub4_4_.method2377(122.toByte())) {
                        class318_sub1_sub4_4_.aClass318_Sub1_6379 = BackgroundWorkerThread.aClass318_Sub1Array3226!![i_5_]
                        BackgroundWorkerThread.aClass318_Sub1Array3226!![i_5_] = class318_sub1_sub4_4_
                    } else {
                        class318_sub1_sub4_4_.aClass318_Sub1_6379 = LinkedListNodeStatics.aClass318_Sub1Array4293!![i_5_]
                        LinkedListNodeStatics.aClass318_Sub1Array4293!![i_5_] = class318_sub1_sub4_4_
                        PcmStreamBuffer.aBoolean8870 = true
                    }
                } else {
                    class318_sub1_sub4_4_.aClass318_Sub1_6379 = OverlayColorTable.aClass318_Sub1Array1754!![i_5_]
                    OverlayColorTable.aClass318_Sub1Array1754!![i_5_] = class318_sub1_sub4_4_
                }
            }
        }
    }


    @JvmStatic
    fun method3256(i: Int): Int {
        anInt9662++
        if (AbstractTileShapeStatics.anIntArray6547 == null) return 0
        if (i != 2) aCameraRotationStub_9661 = null
        return 2 * AbstractTileShapeStatics.anIntArray6547!!.size
    }

    @JvmStatic
    fun method3258(i: Int, i_11_: Int, fs: FloatArray?): FloatArray {
        anInt9668++
        val fs_12_ = FloatArray(i_11_)
        ArrayCopyUtil.method1574(fs!!, 0, fs_12_, i, i_11_)
        return fs_12_
    }

    init {
        aCameraRotationStub_9661 = CameraRotationStub()
    }
}
