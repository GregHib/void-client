import StreamingResourceRequestStatics.method3261

object MinimapTileEntryStatics {
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
                if (i.toInt() != 68) method381((-42).toByte())
                return IntRangeStatics.method1059(95.toByte(), 1)
            }
    
            fun method382(string: String, bool: Boolean) {
                anInt613++
                BloomGraphicsOptionStateStatics.aString5966 = string
                if (bool != true) method381((-48).toByte())
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
                while (BackgroundWorkerThreadStatics.anInt3225 > i_3_) {
                    val i_4_ = (ModelTransformParamsStatics.method3452(MaterialPassStatics.anInt3682 + i_3_, (-15).toByte(), BackgroundWorkerThreadStatics.anInt3225) * ItemModelDefinitionStatics.anInt425)
                    var i_5_ = 0
                    while (ItemModelDefinitionStatics.anInt425 > i_5_) {
                        val i_6_ = (ModelTransformParamsStatics.method3452(i_5_ - -SceneryDetailOptionStateStatics.anInt6095, (-15).toByte(), ItemModelDefinitionStatics.anInt425) + i_4_)
                        if (LocalPlayerState.anIntArray1909!![i_6_] == GroundDecorSceneEntityStatics.anInt9997) NpcSpawnDecoder.anSpriteDrawTargetArray1525!![i_6_]!!.method14(0, 0, DirectionPathStatics.anInt1067, ByteStoreStatics.anInt4267, i_5_ * DirectionPathStatics.anInt1067, ByteStoreStatics.anInt4267 * i_3_, true, true)
                        i_5_++
                    }
                    i_3_++
                }
                anInt612++
            }
}
