/* Class65 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WorldMapImageBuilder internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_1141: Js5Archive?
    private val aLruByteCache_1145 = LruByteCache(256)
    fun method694(i: Int) {
        anInt1140++
        if (i != -1007) method700(14, 98)
        withLock(aLruByteCache_1145) {
            aLruByteCache_1145.method587(i + 883)
        }
    }

    fun method695(bool: Boolean) {
        if (bool != true) aOutgoingPacketHeader_1144 = null
        withLock(aLruByteCache_1145) {
            aLruByteCache_1145.method590(0)
        }
        anInt1139++
    }

    fun method697(i: Int, i_3_: Int) {
        if (i_3_ == 26) {
            anInt1142++
            withLock(aLruByteCache_1145) {
                aLruByteCache_1145.method578(i_3_ xor 0x18, i)
            }
        }
    }

    fun method700(i: Int, i_8_: Int): ParamMap {
        anInt1143++
        val i_9_ = -128 / ((-3 - i_8_) / 49)
        var class348_sub42_sub1: ParamMap?
        withLock(aLruByteCache_1145) {
            class348_sub42_sub1 = aLruByteCache_1145.method583(i.toLong(), -101) as ParamMap?
        }
        if (class348_sub42_sub1 != null) return class348_sub42_sub1
        val `is`: ByteArray?
        withLock(aJs5Archive_1141!!) {
            `is` = aJs5Archive_1141.method410(-1860, 26, i)
        }
        class348_sub42_sub1 = ParamMap()
        if (`is` != null) class348_sub42_sub1.method3168(ByteBuffer(`is`), (-101).toByte())
        withLock(aLruByteCache_1145) {
            aLruByteCache_1145.method582(class348_sub42_sub1, i.toLong(), (-114).toByte())
        }
        return class348_sub42_sub1
    }

    init {
        try {
            aJs5Archive_1141 = js5Archive
            aJs5Archive_1141!!.method407(0, 26)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("kb.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        var anInt1138: Int = 0

        var anInt1139: Int = 0

        var anInt1140: Int = 0

        var anInt1142: Int = 0

        var anInt1143: Int = 0

        var aOutgoingPacketHeader_1144: OutgoingPacketHeader?

        var aClass110_Sub1Array1146: Array<MapLabelMenuEntry?>? = arrayOfNulls<MapLabelMenuEntry>(0)

        var anInt1147: Int = 0

        var aSceneCollisionEntryArrayArrayArray1148: Array<Array<Array<SceneCollisionEntry?>?>?>? = null

        @JvmStatic
        fun method696(i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
            if (i_2_ == -1007) {
                if (i == 1009) ChatCommandProcessor.method701(FileIoUtil.aBoundsConstraintEntry_4091!!, i_1_, i_0_)
                else if (i != 1012) {
                    if (i == 1002) ChatCommandProcessor.method701(InvertTextureNode.aBoundsConstraintEntry_9415!!, i_1_, i_0_)
                    else if (i == 1003) ChatCommandProcessor.method701(BoundingBoxNode.aBoundsConstraintEntry_6743!!, i_1_, i_0_)
                    else if (i == 1006) ChatCommandProcessor.method701(ParticleDetailOptionState.aBoundsConstraintEntry_6018!!, i_1_, i_0_)
                } else ChatCommandProcessor.method701(SolidFillComponent.aBoundsConstraintEntry_8356!!, i_1_, i_0_)
                anInt1138++
            }
        }

        @JvmStatic
        fun method698(i: Int) {
            aOutgoingPacketHeader_1144 = null
            if (i != 2) aSceneCollisionEntryArrayArrayArray1148 = null
            aSceneCollisionEntryArrayArrayArray1148 = null
            aClass110_Sub1Array1146 = null
        }

        @JvmStatic
        fun method699(js5Archive: Js5Archive?, i: Byte, js5Archive_4_: Js5Archive?, js5Archive_5_: Js5Archive?, js5Archive_6_: Js5Archive?) {
            try {
                ScatterTextureNode.aJs5Archive_9365 = js5Archive_6_
                anInt1147++
                GroundDecorEntity.aJs5Archive_8755 = js5Archive_5_
                RenderConfigFactoryStatics.aJs5Archive_2978 = js5Archive_4_
                WarpTextureNode.aWidgetComponentArrayArray9427 = arrayOfNulls<Array<WidgetComponent?>>(RenderConfigFactoryStatics.aJs5Archive_2978!!.method414(-1))
                AudioResampler.aBooleanArray2162 = BooleanArray(RenderConfigFactoryStatics.aJs5Archive_2978!!.method414(-1))
                val i_7_ = -72 % ((35 - i) / 41)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("kb.F(" + (if (js5Archive != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive_4_ != null) "{...}" else "null") + ',' + (if (js5Archive_5_ != null) "{...}" else "null") + ',' + (if (js5Archive_6_ != null) "{...}" else "null") + ')'))
            }
        }

        init {
            aOutgoingPacketHeader_1144 = OutgoingPacketHeader(37, 2)
        }
    }
}
