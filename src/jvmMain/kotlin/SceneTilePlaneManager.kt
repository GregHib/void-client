/* Class16 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object SceneTilePlaneManager {
    @JvmField
    var anInt230: Int = 0
    @JvmField
    var aWidgetNodeLink_231: WidgetNodeLink? = null
    @JvmField
    var anInt232: Int = 0
    @JvmField
    var aJs5Archive_233: Js5Archive? = null
    @JvmField
    var anInt234: Int = 0

    @JvmStatic
    fun method258(i: Int, i_0_: Int) {
        val class357 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![0]!![i]!![i_0_]
        for (i_1_ in 0..2) {
            val class357_2_ = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_1_ + 1]!![i]!![i_0_].also { HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_1_]!![i]!![i_0_] = it })
            if (class357_2_ != null) {
                var class148 = class357_2_.aWidgetNodeLink_4396
                while (class148 != null) {
                    val class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040!!
                    if ((class318_sub1_sub3.aShort8743.toInt() == i) && (class318_sub1_sub3.aShort8750).toInt() == i_0_) class318_sub1_sub3.plane--
                    class148 = class148.aWidgetNodeLink_2038
                }
                if (class357_2_.aClass318_Sub1_Sub1_4402 != null) class357_2_.aClass318_Sub1_Sub1_4402!!.plane--
                if (class357_2_.aClass318_Sub1_Sub4_4406 != null) class357_2_.aClass318_Sub1_Sub4_4406!!.plane--
                if (class357_2_.aClass318_Sub1_Sub4_4403 != null) class357_2_.aClass318_Sub1_Sub4_4403!!.plane--
                if (class357_2_.aClass318_Sub1_Sub5_4395 != null) class357_2_.aClass318_Sub1_Sub5_4395!!.plane--
                if (class357_2_.aClass318_Sub1_Sub5_4407 != null) class357_2_.aClass318_Sub1_Sub5_4407!!.plane--
            }
        }
        if (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![0]!![i]!![i_0_] == null) {
            HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![0]!![i]!![i_0_] = SceneCollisionEntry(0)
            HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![0]!![i]!![i_0_]!!.aByte4399 = 1.toByte()
        }
        HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![0]!![i]!![i_0_]!!.aSceneCollisionEntry_4400 = class357
        HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![3]!![i]!![i_0_] = null
    }

    @JvmStatic
    fun method259(i: Int, i_3_: Int, bool: Boolean, string: String?, i_4_: Int) {
        anInt230++
        ScriptOpcodeHolder.method1356(false, null, i, i_4_, bool, string, true)
        val i_5_ = -1 / ((i_3_ - -33) / 63)
    }

    @JvmStatic
    fun method260(bool: Boolean): Int {
        if (bool != false) aJs5Archive_233 = null
        anInt232++
        if (ByteBuffer.anInt7207 == 1) return PerlinNoiseTextureNode.anInt9157
        return 0
    }

    @JvmStatic
    fun method261(i: Byte) {
        aJs5Archive_233 = null
        aWidgetNodeLink_231 = null
        if (i.toInt() != -120) method262(-23)
    }

    @JvmStatic
    fun method262(i: Int) {
        anInt234++
        if (i != 0) aWidgetNodeLink_231 = null
        if (!KeyboardLayoutConfig.aBoolean2130) {
            KeyboardLayoutConfig.aBoolean2130 = true
            CircleDrawer.aFloat2687 += (-CircleDrawer.aFloat2687 + -24.0f) / 2.0f
            WorldMapPolygonIconLabel.aBoolean10174 = true
        }
    }
}
