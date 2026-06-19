import StreamingResourceRequest.Companion.method3261

/* Class43 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MinimapTileEntry {
    @JvmField
    var aClass348_Sub42_Sub10_614: ParameterizedText? = null
    @JvmField
    var anInt615: Int = 0
    @JvmField
    var anIntArray617: IntArray? = null

    companion object {
        @JvmField
        var aJs5Archive_611: Js5Archive? = null
        @JvmField
        var anInt612: Int = 0
        @JvmField
        var anInt613: Int = 0
        @JvmField
        var anInt616: Int = 0
        @JvmField
        var aFontMetaRef_618: FontMetaRef? = FontMetaRef(5, 3)
        @JvmField
        var anIntArray619: IntArray? = intArrayOf(0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4)
        @JvmField
        var anInt620: Int = 0

        @JvmStatic
        fun method380(i: Int) {
            aFontMetaRef_618 = null
            anIntArray619 = null
            if (i == 0) aJs5Archive_611 = null
        }

        @JvmStatic
        fun method381(i: Byte): GrowableStringList {
            anInt616++
            if (i.toInt() != 68) Companion.method381((-42).toByte())
            return IntRange.method1059(95.toByte(), 1)
        }

        fun method382(string: String, bool: Boolean) {
            anInt613++
            BloomGraphicsOptionState.aString5966 = string
            if (bool != true) Companion.method381((-48).toByte())
            if (JagGlToolkitFactory.anApplet1530 != null) {
                try {
                    val string_0_ = JagGlToolkitFactory.anApplet1530!!.getParameter("cookieprefix")
                    val string_1_ = JagGlToolkitFactory.anApplet1530!!.getParameter("cookiehost")
                    var string_2_ = (string_0_ + "settings=" + string + "; version=1; path=/; domain=" + string_1_)
                    if (string.length == 0) string_2_ += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0"
                    else string_2_ += ("; Expires=" + (method3261(GameClock.method599(-53) + 94608000000L, 63)) + "; Max-Age=" + 94608000L)
                    JavaScriptBridge.method1615(JagGlToolkitFactory.anApplet1530, -15092, "document.cookie=\"" + string_2_ + "\"")
                } catch (throwable: Throwable) {
                    /* empty */
                }
            }
        }

        @JvmStatic
        fun method383(i: Int) {
            var i_3_ = i
            while (WhirlpoolHash.anInt3225 > i_3_) {
                val i_4_ = (ModelDefinition.method3452(MaterialPass.anInt3682 + i_3_, (-15).toByte(), WhirlpoolHash.anInt3225) * WhirlpoolHash.anInt425)
                var i_5_ = 0
                while (WhirlpoolHash.anInt425 > i_5_) {
                    val i_6_ = (ModelDefinition.method3452(i_5_ - -SceneryDetailOptionState.anInt6095, (-15).toByte(), WhirlpoolHash.anInt425) + i_4_)
                    if (LocalPlayerState.anIntArray1909!![i_6_] == GroundDecorSceneEntity.anInt9997) NpcSpawnDecoder.anSpriteDrawTargetArray1525!![i_6_]!!.method14(0, 0, WhirlpoolHash.anInt1067, WhirlpoolHash.anInt4267, i_5_ * WhirlpoolHash.anInt1067, WhirlpoolHash.anInt4267 * i_3_, true, true)
                    i_5_++
                }
                i_3_++
            }
            anInt612++
        }
    }
}
