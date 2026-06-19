import ChatEffectsOptionState.Companion.method1728

/* Class239 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class GraphicsOptionState {
    var aClass348_Sub51_3136: DisplaySettingsConfig
    var anInt3138: Int
    abstract fun method1710(i: Int): Int

    abstract fun method1712(i: Int, i_2_: Int)

    abstract fun method1714(i: Int, i_3_: Int): Int

    abstract fun method1716(bool: Boolean)

    internal constructor(class348_sub51: DisplaySettingsConfig) {
        this.aClass348_Sub51_3136 = class348_sub51
        this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) {
        this.aClass348_Sub51_3136 = class348_sub51
        this.anInt3138 = i
    }

    fun method1718(i: Int, i_7_: Int) {
        if (i_7_ < 3) method1712(12, 42)
        anInt3139++
        if (method1714(3, i) != 3) method1712(124, i)
    }

    companion object {

        var anInt3134: Int = 0

        var aInboundPacketHeader_3135: InboundPacketHeader? = InboundPacketHeader(108, 5)

        var anInt3137: Int = 0

        var anInt3139: Int = 0

        var anInt3140: Int = 0

        var anInt3141: Int = 0

        var anInt3142: Int = 0

        var aInboundPacketHeader_3143: InboundPacketHeader?

        var aByteArray3144: ByteArray? = ByteArray(520)

        var aInboundPacketHeader_3145: InboundPacketHeader? = null

        var aJs5Archive_3146: Js5Archive? = null

        var aItemDefinitionLoader_3147: ItemDefinitionLoader? = null

        @JvmStatic
        fun method1709(i: Int): Array<HudTabPanel?> {
            if (i > -110) method1715(97)
            anInt3141++
            return (arrayOf<HudTabPanel?>(Client.aHudTabPanel_1189, NoiseTextureNode.aHudTabPanel_9263, ParticleEmitterDef.aHudTabPanel_4953))
        }

        @JvmStatic
        fun method1711(i: Int, js5Archive: Js5Archive?, i_0_: Int, js5Archive_1_: Js5Archive?) {
            try {
                TextureMaterialGroup.aJs5Archive_4843 = js5Archive_1_
                anInt3140++
                if (i != 7) aJs5Archive_3146 = null
                TextureMaterialGroup.aJs5Archive_1940 = js5Archive
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("su.Q(" + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + i_0_ + ',' + (if (js5Archive_1_ != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method1713(bool: Boolean, i: Int) {
            method1728(GameDisplayManager.anInt10432, -1, RenderNodeStatics.anInt9721, bool, LocTypeDefinition.anInt4017)
            if (i == 520) anInt3137++
        }

        @JvmStatic
        fun method1715(i: Int) {
            aInboundPacketHeader_3145 = null
            aInboundPacketHeader_3143 = null
            aJs5Archive_3146 = null
            aInboundPacketHeader_3135 = null
            aByteArray3144 = null
            aItemDefinitionLoader_3147 = null
            if (i < 13) method1709(-99)
        }
        var aByteArrayArrayArray6962: Array<Array<ByteArray?>?>? = null

        fun method3024(i: Int) {
            CutsceneSequenceData.aGzipDecompressor_6955 = null
            aByteArrayArrayArray6962 = null
        }

        @JvmStatic
        fun method1717(i: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
            aByteArrayArrayArray6962 = Array<Array<ByteArray?>?>(i_6_) { Array<ByteArray?>(i_5_) { ByteArray(i_4_) } }
            if (i != 19278) method1717(35, 126, -83, 85)
            anInt3134++
        }

        init {
            aInboundPacketHeader_3143 = InboundPacketHeader(7, 3)
        }
    }
}
