import java.io.File
import java.util.Enumeration
import java.util.Hashtable
import java.util.Vector

/*
 * Class228
 */
object NativeLibraryUnloader {
    var anInt2971: Int = 0
    var anInt2973: Int = 0

    var aMapSceneTileArray2974: Array<MapSceneTile?>? = null

    var anInt2975: Int = 0

    @JvmStatic
    fun method1628(i: Byte) {
        aMapSceneTileArray2974 = null
        if (i <= 47) aMapSceneTileArray2974 = null
        InboundPacketHeader.aInboundPacketHeader_2972 = null
    }

    fun method1629(bool: Boolean): Boolean {
        anInt2973++
        val hashtable: Hashtable<Any?, Any?> = Hashtable<Any?, Any?>()
        var enumeration: Enumeration<*> = Player.aHashtable10565!!.keys()
        while (enumeration.hasMoreElements()) {
            val `object`: Any? = enumeration.nextElement()
            hashtable.put(`object`, Player.aHashtable10565!!.get(`object`))
        }
        try {
            val field = ClassLoader::class.java.getDeclaredField("nativeLibraries")
            if (bool != true) return false
            field.setAccessible(true)
            try {
                enumeration = Player.aHashtable10565!!.keys()
                while (enumeration.hasMoreElements()) {
                    val string = enumeration.nextElement() as String?
                    try {
                        val file = CollisionMapAccessor.aHashtable3548!!.get(string) as File
                        val var_class_1_ = Player.aHashtable10565!!.get(string) as Class<*>?
                        val vector = (field.get(var_class_1_!!.getClassLoader()) as Vector<*>)
                        for (i in vector.indices) {
                            try {
                                val `object`: Any = vector.elementAt(i)
                                val field_2_ = `object`.javaClass.getDeclaredField("name")
                                field_2_.setAccessible(true)
                                try {
                                    val string_3_ = field_2_.get(`object`) as String?
                                    if (string_3_ != null && (string_3_.equals(file.getCanonicalPath(), ignoreCase = true))) {
                                        val field_4_ = `object`.javaClass.getDeclaredField("handle")
                                        val method_5_ = (`object`.javaClass.getDeclaredMethod("finalize"))
                                        field_4_.setAccessible(true)
                                        method_5_.setAccessible(true)
                                        try {
                                            method_5_.invoke(`object`)
                                            field_4_.set(`object`, 0)
                                            hashtable.remove(string)
                                        } catch (throwable: Throwable) {
                                            if (Loader.trace) {
                                                throwable.printStackTrace()
                                            }
                                            /* empty */
                                        }
                                        method_5_.setAccessible(false)
                                        field_4_.setAccessible(false)
                                    }
                                } catch (throwable: Throwable) {
                                    if (Loader.trace) {
                                        throwable.printStackTrace()
                                    }
                                    /* empty */
                                }
                                field_2_.setAccessible(false)
                            } catch (throwable: Throwable) {
                                if (Loader.trace) {
                                    throwable.printStackTrace()
                                }
                                /* empty */
                            }
                        }
                    } catch (throwable: Throwable) {
                        if (Loader.trace) {
                            throwable.printStackTrace()
                        }
                        /* empty */
                    }
                }
            } catch (throwable: Throwable) {
                if (Loader.trace) {
                    throwable.printStackTrace()
                }
                /* empty */
            }
            field.setAccessible(false)
        } catch (throwable: Throwable) {
            if (Loader.trace) {
                throwable.printStackTrace()
            }
            /* empty */
        }
        Player.aHashtable10565 = hashtable
        return Player.aHashtable10565!!.isEmpty()
    }

    fun method1630(i: Int, i_6_: Int, i_7_: Int) {
        if (MapRegionLoader.aFloat1249 > MapRegionLoader.aFloat1247) {
            MapRegionLoader.aFloat1247 += (MapRegionLoader.aFloat1247.toDouble() / 30.0).toFloat()
            if (MapRegionLoader.aFloat1249 < MapRegionLoader.aFloat1247) MapRegionLoader.aFloat1247 = MapRegionLoader.aFloat1249
            MenuActionNode.method2811(false)
            MapRegionLoader.anInt1255 = MapRegionLoader.aFloat1247.toInt() shr 1
            MapRegionLoader.aByteArrayArrayArray1251 = SpriteMaskShape.method2596(MapRegionLoader.anInt1255, 12871)
        } else if (MapRegionLoader.aFloat1247 > MapRegionLoader.aFloat1249) {
            MapRegionLoader.aFloat1247 -= (MapRegionLoader.aFloat1247.toDouble() / 30.0).toFloat()
            if (MapRegionLoader.aFloat1249 > MapRegionLoader.aFloat1247) MapRegionLoader.aFloat1247 = MapRegionLoader.aFloat1249
            MenuActionNode.method2811(false)
            MapRegionLoader.anInt1255 = MapRegionLoader.aFloat1247.toInt() shr 1
            MapRegionLoader.aByteArrayArrayArray1251 = SpriteMaskShape.method2596(MapRegionLoader.anInt1255, i + 12871)
        }
        anInt2971++
        if (i != (TextureMetadataProvider.anInt4609.inv()) && ColourAdjustment.anInt859 != -1) {
            var i_8_ = TextureMetadataProvider.anInt4609 - WidgetActionEntry.anInt6992
            if (i_8_ < 2 || i_8_ > 2) i_8_ /= 8
            var i_9_ = -DebugOverlayRenderer.anInt3170 + ColourAdjustment.anInt859
            WidgetActionEntry.anInt6992 = i_8_ + WidgetActionEntry.anInt6992
            if (i_9_ < 2 || i_9_ > 2) i_9_ /= 8
            DebugOverlayRenderer.anInt3170 -= -i_9_
            if (i_8_ == 0 && i_9_ == 0) {
                TextureMetadataProvider.anInt4609 = -1
                ColourAdjustment.anInt859 = -1
            }
            MenuActionNode.method2811(false)
        }
        if (GlEnvMappedWaterPass.anInt7379 > 0) {
            ClientLoadStateMachine.anInt2173--
            if (ClientLoadStateMachine.anInt2173 == 0) {
                GlEnvMappedWaterPass.anInt7379--
                ClientLoadStateMachine.anInt2173 = 100
            }
        } else {
            SkeletalAnimFrameLoader.anInt481 = -1
            HslAdjustTextureNode.anInt9399 = -1
        }
        if (ParticleEmitterFactoryStatics.aBoolean3174 && RegionSceneLoader.aNodeDeque_3705 != null) {
            var class348_sub12 = RegionSceneLoader.aNodeDeque_3705!!.method1995(4) as BoundingBoxNode?
            while (class348_sub12 != null) {
                val class42 = (MapRegionLoader.aConfigDefinitionLoader_1238!!.method1225(class348_sub12.aClass348_Sub21_6751!!.anInt6847, 125.toByte()))
                if (class348_sub12.method2799(i_6_, i_7_, 95)) {
                    if (class42!!.aStringArray577 != null) {
                        if (class42.aStringArray577[4] != null) MinimapPolygonDrawer.method466(false, class42.aString565, 0, (-100).toByte(), false, class42.anInt596, -1, true, 1006, class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), class42.aStringArray577[4], class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), -1)
                        if (class42.aStringArray577[3] != null) MinimapPolygonDrawer.method466(false, class42.aString565, 0, (-127).toByte(), false, class42.anInt596, -1, true, 1003, class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), class42.aStringArray577[3], class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), -1)
                        if (class42.aStringArray577[2] != null) MinimapPolygonDrawer.method466(false, class42.aString565, 0, (-108).toByte(), false, class42.anInt596, -1, true, 1002, class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), class42.aStringArray577[2], class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), -1)
                        if (class42.aStringArray577[1] != null) MinimapPolygonDrawer.method466(false, class42.aString565, 0, (-69).toByte(), false, class42.anInt596, -1, true, 1012, class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), class42.aStringArray577[1], class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), -1)
                        if (class42.aStringArray577[0] != null) MinimapPolygonDrawer.method466(false, class42.aString565, 0, (-92).toByte(), false, class42.anInt596, -1, true, 1009, class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), class42.aStringArray577[0], class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), -1)
                    }
                    if (!class348_sub12.aClass348_Sub21_6751!!.aBoolean6848) {
                        class348_sub12.aClass348_Sub21_6751!!.aBoolean6848 = true
                        ChatCommandProcessor.method701(RegionMapDecoder.aBoundsConstraintEntry_1512!!, class348_sub12.aClass348_Sub21_6751!!.anInt6847, class42.anInt596)
                    }
                    if (class348_sub12.aClass348_Sub21_6751!!.aBoolean6848) ChatCommandProcessor.method701(StaticNoiseTexture.aBoundsConstraintEntry_8664!!, class348_sub12.aClass348_Sub21_6751!!.anInt6847, class42.anInt596)
                } else if (class348_sub12.aClass348_Sub21_6751!!.aBoolean6848) {
                    class348_sub12.aClass348_Sub21_6751!!.aBoolean6848 = false
                    ChatCommandProcessor.method701(IsaacCipher.aBoundsConstraintEntry_1298!!, class348_sub12.aClass348_Sub21_6751!!.anInt6847, class42!!.anInt596)
                }
                class348_sub12 = (RegionSceneLoader.aNodeDeque_3705!!.method1990(116.toByte()) as BoundingBoxNode?)
            }
        }
    }
}
