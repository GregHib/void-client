import java.io.IOException
import java.io.OutputStream

/*
 * OutputStream_Sub2
 */
class ChatMessageStream : OutputStream() {
    @Throws(IOException::class)
    override fun write(i: Int) {
        anInt104++
        throw IOException()
    }

    companion object {

        var anInt101: Int

        var anInt102: Int = 0

        var anInt103: Int = 0

        var anInt104: Int = 0

        var anInt105: Int = 0

        var aAbstractModelRenderer_106: AbstractModelRenderer? = null

        var anInt107: Int = 0

        var aLong108: Long = (Math.random() * 9.999999999E9).toLong()

        @JvmStatic
        fun method135(i: Byte, `is`: ByteArray?, i_0_: Int): ByteArray {
            anInt103++
            if (i < 101) method139(34)
            val is_1_ = ByteArray(i_0_)
            ArrayCopyUtil.method1577(`is`!!, 0, is_1_, 0, i_0_)
            return is_1_
        }

        @JvmStatic
        fun method136(i: Int, bool: Boolean, bool_2_: Boolean): SceneEntityModel {
            anInt105++
            withLock(MapElementManager.aDoublyLinkedNodeListArray3974s!!) {
                val class318_sub4: SceneEntityModel
                if (MapElementManager.aDoublyLinkedNodeListArray3974s!!.size > i && !MapElementManager.aDoublyLinkedNodeListArray3974s!![i]!!.method1871(111.toByte())) {
                    class318_sub4 = MapElementManager.aDoublyLinkedNodeListArray3974s!![i]!!.method1870(-104) as SceneEntityModel
                    class318_sub4.method2373(false)
                    CalendarUtil.anIntArray4128!![i]--
                } else {
                    class318_sub4 = SceneEntityModel()
                    class318_sub4.aClass318_Sub3Array6414 = arrayOfNulls<SceneOcculder>(i)
                    var i_3_ = 0
                    while (i > i_3_) {
                        class318_sub4.aClass318_Sub3Array6414!![i_3_] = SceneOcculder()
                        i_3_++
                    }
                }
                class318_sub4.aBoolean6409 = bool
                if (bool_2_ != false) aLong108 = 43L
                return class318_sub4
            }
        }

        @JvmStatic
        fun method137(i: Int, i_4_: Int, i_5_: Int): Boolean {
            anInt102++
            val i_6_ = -114 / ((i_4_ - 36) / 55)
            return ((0x70000 and i_5_) != 0) or EdgeDetectTextureNode.method3073(i, i_5_, 50.toByte()) || CompassSmootherStatics.method2015(i_5_, i, 7)
        }

        @JvmStatic
        fun method138(class348_sub42_sub12: ContactEntry, bool: Boolean): Int {
            anInt107++
            var string = IntHashSetStatics.method2367((-126).toByte(), class348_sub42_sub12)
            var `is`: IntArray? = null
            if (!WidgetNodeLink.method1197(-12081, (class348_sub42_sub12.anInt9608))) {
                if (class348_sub42_sub12.anInt9599 == -1) {
                    if (FixedFunctionWaterPass.method3549(class348_sub42_sub12.anInt9608, (-44).toByte())) {
                        val class348_sub22 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(class348_sub42_sub12.aLong9605.toInt().toLong(), -6008)) as? NpcReference?)
                        if (class348_sub22 != null) {
                            val npc = (class348_sub22.aNpc_6859)!!
                            var class79 = (npc.aNpcType_10505)
                            if (class79!!.anIntArray1377 != null) class79 = class79.method794((ProjectedGroundDecor.aVarpStore_10209!!), -1)
                            if (class79 != null) `is` = class79.anIntArray1342
                        }
                    } else if (RemoveRoofsOptionState.method1813(8806, (class348_sub42_sub12.anInt9608))) {
                        val `object`: Any? = null
                        var npcConfig: NpcConfig?
                        if ((class348_sub42_sub12.anInt9608) == 1001) npcConfig = (GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, (class348_sub42_sub12.aLong9605).toInt()))
                        else npcConfig = (GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, (0x7fffffffL and ((class348_sub42_sub12.aLong9605) ushr 32)).toInt()))
                        if (npcConfig.anIntArray945 != null) npcConfig = npcConfig.method480((ProjectedGroundDecor.aVarpStore_10209!!), 47.toByte())
                        if (npcConfig != null) `is` = npcConfig.anIntArray917
                    }
                } else `is` = (ClientExceptionStatics.aModelHeaderCache_112!!.method1940(-76, class348_sub42_sub12.anInt9599).anIntArray2772)
            } else `is` = (ClientExceptionStatics.aModelHeaderCache_112!!.method1940(-115, class348_sub42_sub12.aLong9605.toInt()).anIntArray2772)
            if (`is` != null) string += AudioResamplerStatics.method1273(`is`, true)
            var i = WorldMapLabel.aFontDefinition_4962!!.method1186(string, TileRenderState.aAbstractModelRendererArray4234, bool)
            if (class348_sub42_sub12.aBoolean9597) i += SceneryDetailOptionState.aAbstractModelRenderer_6097!!.method971() + 4
            return i
        }

        @JvmStatic
        fun method139(i: Int) {
            if (i > 53) aAbstractModelRenderer_106 = null
        }

        init {
            anInt101 = -1
        }
    }
}
