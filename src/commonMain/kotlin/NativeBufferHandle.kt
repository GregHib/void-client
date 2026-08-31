import kotlin.jvm.JvmStatic
import RingBufferInputStream.Companion.method3620

/* Class89 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NativeBufferHandle internal constructor(glRenderDevice: GlRenderDevice?, l: Long, glShaderObjectHandles: Array<GlShaderObjectHandle?>?) {
    private val aGlRenderDevice_1506: GlRenderDevice?
    var aLong1510: Long = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt1509++
        aGlRenderDevice_1506!!.method3966(this.aLong1510, 34192)
//        super.finalize()
    }

    init {
        try {
            this.aLong1510 = l
            aGlRenderDevice_1506 = glRenderDevice
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("lha.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + l + ',' + (if (glShaderObjectHandles != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        var aLong1507: Long = 0

        var anInt1509: Int = 0

        var anInt1511: Int = 0

        @JvmStatic
        fun method849(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
            anInt1511++
            val i_6_ = i_0_ + i
            val i_7_ = -i + i_3_
            for (i_8_ in i_0_..<i_6_) GlElementArrayBuffer.method1156(-27, i_2_, WidgetDefinition.anIntArrayArray255!![i_8_]!!, i_1_, i_5_)
            val i_9_ = -i + i_2_
            for (i_10_ in i_3_ downTo i_7_ + 1) GlElementArrayBuffer.method1156(-27, i_2_, WidgetDefinition.anIntArrayArray255!![i_10_]!!, i_1_, i_5_)
            val i_11_ = i + i_1_
            var i_12_ = i_6_
            while (i_7_ >= i_12_) {
                val `is`: IntArray = WidgetDefinition.anIntArrayArray255!![i_12_]!!
                GlElementArrayBuffer.method1156(-27, i_11_, `is`, i_1_, i_5_)
                GlElementArrayBuffer.method1156(-27, i_2_, `is`, i_9_, i_5_)
                i_12_++
            }
        }

        @JvmStatic
        fun method850(class318_sub1_sub3: GroundDecorEntity, bool: Boolean): Boolean {
            val bool_13_ = ActorEntity.aTerrainTileArray5191 == ActorEntity.aTerrainTileArray4142
            var i = 0
            var i_14_: Short = 0
            var i_15_: Byte = 0
            class318_sub1_sub3.method2409((-116).toByte())
            if (class318_sub1_sub3.aShort8743 < 0 || class318_sub1_sub3.aShort8750 < 0 || (class318_sub1_sub3.aShort8751 >= ActorEntity.anInt6451) || (class318_sub1_sub3.aShort8747 >= ActorEntity.anInt7054)) return false
            var i_16_: Short = 0
            for (i_17_ in class318_sub1_sub3.aShort8743..class318_sub1_sub3.aShort8751) {
                for (i_18_ in class318_sub1_sub3.aShort8750..class318_sub1_sub3.aShort8747) {
                    val class357 = StringValueNode.method3321(class318_sub1_sub3.plane.toInt(), i_17_, i_18_)
                    if (class357 != null) {
                        val class148 = method3620(class318_sub1_sub3, 118)
                        var class148_19_ = class357.aWidgetNodeLink_4396
                        if (class148_19_ == null) class357.aWidgetNodeLink_4396 = class148
                        else {
                            while ( /**/class148_19_!!.aWidgetNodeLink_2038 != null) {
                                class148_19_ = class148_19_.aWidgetNodeLink_2038
                            }
                            class148_19_.aWidgetNodeLink_2038 = class148
                        }
                        if (bool_13_ && (LoadingBarRenderer.anIntArrayArray4253!![i_17_]!![i_18_] and 0xffffff.inv()) != 0) {
                            i = LoadingBarRenderer.anIntArrayArray4253!![i_17_]!![i_18_]
                            i_14_ = FlickeringGraphicsOptionState.aShortArrayArray5847!![i_17_]!![i_18_]
                            i_15_ = (HashTileShape.aByteArrayArray8816!![i_17_]!![i_18_])
                        }
                        if (!bool && (class357.aClass318_Sub1_Sub1_4402 != null) && (class357.aClass318_Sub1_Sub1_4402!!.aShort8727) > i_16_) i_16_ = (class357.aClass318_Sub1_Sub1_4402!!.aShort8727)
                    }
                }
            }
            if (bool_13_ && (i and 0xffffff.inv()) != 0) {
                for (i_20_ in class318_sub1_sub3.aShort8743..class318_sub1_sub3.aShort8751) {
                    var i_21_ = (class318_sub1_sub3.aShort8750).toInt()
                    while ((i_21_ <= class318_sub1_sub3.aShort8747)) {
                        if ((LoadingBarRenderer.anIntArrayArray4253!![i_20_]!![i_21_] and 0xffffff.inv()) == 0) {
                            LoadingBarRenderer.anIntArrayArray4253!![i_20_]!![i_21_] = i
                            FlickeringGraphicsOptionState.aShortArrayArray5847!![i_20_]!![i_21_] = i_14_
                            HashTileShape.aByteArrayArray8816!![i_20_]!![i_21_] = i_15_
                        }
                        i_21_++
                    }
                }
            }
            if (bool) ModelDataCache.aClass318_Sub1_Sub3Array357!![DrawListState.anInt1477++] = class318_sub1_sub3
            else {
                val i_22_ = if (ActorEntity.aTerrainTileArray5191 == ActorEntity.aTerrainTileArray4142) 1 else 0
                if (class318_sub1_sub3.method2376(-118)) {
                    if (class318_sub1_sub3.method2377(122.toByte())) {
                        class318_sub1_sub3.aClass318_Sub1_6379 = BackgroundWorkerThread.aClass318_Sub1Array3226!![i_22_]
                        BackgroundWorkerThread.aClass318_Sub1Array3226!![i_22_] = class318_sub1_sub3
                    } else {
                        class318_sub1_sub3.aClass318_Sub1_6379 = LinkedListNodeStatics.aClass318_Sub1Array4293!![i_22_]
                        LinkedListNodeStatics.aClass318_Sub1Array4293!![i_22_] = class318_sub1_sub3
                        PcmStreamBuffer.aBoolean8870 = true
                    }
                } else {
                    class318_sub1_sub3.aClass318_Sub1_6379 = OverlayColorTable.aClass318_Sub1Array1754!![i_22_]
                    OverlayColorTable.aClass318_Sub1Array1754!![i_22_] = class318_sub1_sub3
                }
            }
            if (bool) class318_sub1_sub3.anInt6382 -= i_16_.toInt()
            return true
        }

    }
}
