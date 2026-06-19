import AbstractMenuEntryStatics.method1032
import SoundBankPatchStatics.method2929
import java.util.*
import kotlin.math.max
import DisplaySettingsConfigStatics.method3430
import DisplaySettingsConfigStatics.anInt7217
import DisplaySettingsConfigStatics.anInt7219
import DisplaySettingsConfigStatics.anInt7225
import DisplaySettingsConfigStatics.anInt7233
import DisplaySettingsConfigStatics.anInt7237
import DisplaySettingsConfigStatics.anInt7239
import DisplaySettingsConfigStatics.anInt7242
import DisplaySettingsConfigStatics.anInt7258
import DisplaySettingsConfigStatics.anInt7266
import DisplaySettingsConfigStatics.aClass7273

class DisplaySettingsConfig : LinkedListNode {
    var aClass239_Sub26_7215: DetailLevelOptionState? = null
    @JvmField
    var aClass239_Sub20_7216: FogOptionState? = null
    var aClass239_Sub4_7220: LightingOptionState? = null
    private var aLoadingScreenState_7221: LoadingScreenState? = null
    var aClass239_Sub3_7222: ChatEffectsOptionState? = null
    var aClass239_Sub15_7224: TextureQualityOptionState? = null
    var aClass239_Sub6_7226: BrightnessOptionState? = null
    @JvmField
    var aClass239_Sub8_7227: FlickeringEffectsOptionState? = null
    var aClass239_Sub2_7228: CameraDistanceOptionState? = null
    var aClass239_Sub29_7229: MultiLevelOptionState? = null
    @JvmField
    var aClass239_Sub28_7230: TwoStateOptionState? = null
    var aClass239_Sub23_7231: AntialiasOptionState? = null
    @JvmField
    var aClass239_Sub10_7232: RangedGraphicsOptionState? = null
    var aClass239_Sub26_7234: DetailLevelOptionState? = null
    @JvmField
    var aClass239_Sub24_7235: SceneryDetailOptionState? = null
    @JvmField
    var aClass239_Sub13_7236: GroundDecorOptionState? = null
    @JvmField
    var aClass239_Sub7_7238: IdleAnimationsOptionState? = null
    var aClass239_Sub5_7240: SimpleToggleOptionState? = null
    @JvmField
    var aClass239_Sub12_7243: BloomGraphicsOptionState? = null
    var aClass239_Sub26_7245: DetailLevelOptionState? = null
    var aClass239_Sub1_7246: BooleanGraphicsOptionState? = null
    var aClass239_Sub16_7247: ShadowQualityOptionState? = null
    var aClass239_Sub20_7248: FogOptionState? = null
    var aClass239_Sub14_7250: WaterDetailOptionState? = null
    var aClass239_Sub25_7251: DisplayModeOptionState? = null
    var aClass239_Sub22_7253: SimpleBinaryOptionState? = null
    var aClass239_Sub8_7254: FlickeringEffectsOptionState? = null
    var aClass239_Sub27_7255: DefaultGraphicsOptionState? = null
    var aClass239_Sub9_7256: CustomCursorsOptionState? = null
    var aClass239_Sub19_7257: NoOpGraphicsOptionState? = null
    @JvmField
    var aClass239_Sub18_7259: LightDetailOptionState? = null
    var aClass239_Sub26_7260: DetailLevelOptionState? = null
    @JvmField
    var aClass239_Sub27_7261: DefaultGraphicsOptionState? = null
    @JvmField
    var aClass239_Sub17_7263: ParticleDetailOptionState? = null
    var aClass239_Sub14_7264: WaterDetailOptionState? = null
    @JvmField
    var aClass239_Sub11_7265: BinaryGraphicsOptionState? = null
    private val aSceneProjector_7269: SceneProjector?
    @JvmField
    var aClass239_Sub21_7270: RemoveRoofsOptionState? = null
    @JvmField
    var aClass239_Sub25_7271: DisplayModeOptionState? = null
    var aClass239_Sub26_7272: DetailLevelOptionState? = null
    private fun method3421(i: Int, class348_sub49: ByteBuffer?, i_0_: Int) {
        do {
            try {
                this.aClass239_Sub10_7232 = RangedGraphicsOptionState(class348_sub49!!.readUnsignedByte(255), this)
                anInt7233++
                this.aClass239_Sub27_7255 = DefaultGraphicsOptionState(class348_sub49.readUnsignedByte(i xor 0x7860), this)
                this.aClass239_Sub14_7250 = WaterDetailOptionState(1 + class348_sub49.readUnsignedByte(255), this)
                this.aClass239_Sub4_7220 = LightingOptionState(class348_sub49.readUnsignedByte(255), this)
                this.aClass239_Sub2_7228 = CameraDistanceOptionState(class348_sub49.readUnsignedByte(i xor 0x7860), this)
                this.aClass239_Sub13_7236 = GroundDecorOptionState(class348_sub49.readUnsignedByte(255), this)
                this.aClass239_Sub1_7246 = BooleanGraphicsOptionState(class348_sub49.readUnsignedByte(255), this)
                class348_sub49.readUnsignedByte(i xor 0x7860)
                this.aClass239_Sub21_7270 = RemoveRoofsOptionState(class348_sub49.readUnsignedByte(255), this)
                val i_1_ = class348_sub49.readUnsignedByte(i xor 0x7860)
                var i_2_ = 0
                if (i_0_ >= 17) i_2_ = class348_sub49.readUnsignedByte(255)
                this.aClass239_Sub7_7238 = IdleAnimationsOptionState((max(i_1_, i_2_)), this)
                var bool = true
                var bool_3_ = true
                if (i_0_ >= 2) {
                    bool = class348_sub49.readUnsignedByte(i + -30624) == 1
                    if (i_0_ >= 17) bool_3_ = class348_sub49.readUnsignedByte(255) == 1
                } else {
                    bool = class348_sub49.readUnsignedByte(255) == 1
                    class348_sub49.readUnsignedByte(255)
                }
                this.aClass239_Sub28_7230 = TwoStateOptionState(if (!(bool or bool_3_)) 0 else 1, this)
                this.aClass239_Sub18_7259 = LightDetailOptionState(class348_sub49.readUnsignedByte(255), this)
                this.aClass239_Sub16_7247 = ShadowQualityOptionState(class348_sub49.readUnsignedByte(i xor 0x7860), this)
                this.aClass239_Sub20_7216 = FogOptionState(class348_sub49.readUnsignedByte(255), this)
                this.aClass239_Sub5_7240 = SimpleToggleOptionState(class348_sub49.readUnsignedByte(255), this)
                this.aClass239_Sub26_7272 = DetailLevelOptionState(class348_sub49.readUnsignedByte(i + -30624), this)
                if (i_0_ >= 20) this.aClass239_Sub26_7215 = DetailLevelOptionState(class348_sub49.readUnsignedByte(255), this)
                else this.aClass239_Sub26_7215 = DetailLevelOptionState(this.aClass239_Sub26_7272!!.method1838(-32350), this)
                this.aClass239_Sub26_7260 = DetailLevelOptionState(class348_sub49.readUnsignedByte(255), this)
                this.aClass239_Sub26_7234 = DetailLevelOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i_0_ >= 21) this.aClass239_Sub26_7245 = DetailLevelOptionState(class348_sub49.readUnsignedByte(255), this)
                else this.aClass239_Sub26_7245 = DetailLevelOptionState(this.aClass239_Sub26_7260!!.method1838(-32350), this)
                if (i_0_ >= 1) {
                    class348_sub49.readUnsignedShort(842397944)
                    class348_sub49.readUnsignedShort(842397944)
                }
                if (i_0_ >= 3 && i_0_ < 6) class348_sub49.readUnsignedByte(255)
                if (i_0_ >= 4) this.aClass239_Sub15_7224 = TextureQualityOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i != 30879) method3428((-10).toByte())
                class348_sub49.readInt((-126).toByte())
                if (i_0_ >= 6) this.aClass239_Sub8_7227 = FlickeringEffectsOptionState(class348_sub49.readUnsignedByte(i xor 0x7860), this)
                if (i_0_ >= 7) this.aClass239_Sub11_7265 = BinaryGraphicsOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i_0_ >= 8) class348_sub49.readUnsignedByte(255)
                if (i_0_ >= 9) this.aClass239_Sub6_7226 = BrightnessOptionState(class348_sub49.readUnsignedByte(i xor 0x7860), this)
                if (i_0_ >= 10) this.aClass239_Sub12_7243 = BloomGraphicsOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i_0_ >= 11) this.aClass239_Sub22_7253 = SimpleBinaryOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i_0_ >= 12) this.aClass239_Sub13_7236 = GroundDecorOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i_0_ >= 13) this.aClass239_Sub9_7256 = CustomCursorsOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i_0_ >= 14) this.aClass239_Sub25_7251 = DisplayModeOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i_0_ >= 15) this.aClass239_Sub17_7263 = ParticleDetailOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i_0_ >= 16) this.aClass239_Sub24_7235 = SceneryDetailOptionState(class348_sub49.readUnsignedByte(i xor 0x7860), this)
                if (i_0_ >= 18) this.aClass239_Sub29_7229 = MultiLevelOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i_0_ >= 19) this.aClass239_Sub23_7231 = AntialiasOptionState(class348_sub49.readUnsignedByte(255), this)
                if (i_0_ < 22) break
                this.aClass239_Sub19_7257 = NoOpGraphicsOptionState(class348_sub49.readUnsignedByte(255), this)
            } catch (runtimeexception: RuntimeException) {
                throw method2929(runtimeexception, ("dh.I(" + i + ',' + (if (class348_sub49 != null) "{...}" else "null") + ',' + i_0_ + ')'))
            }
            break
        } while (false)
    }

    fun method3422(i: Int): SceneProjector? {
        anInt7258++
        if (i != 674) method3425(45)
        return aSceneProjector_7269
    }

    private fun method3423(bool: Boolean, i: Int) {
        if (bool || this.aClass239_Sub20_7216 == null) this.aClass239_Sub20_7216 = FogOptionState(this)
        anInt7242++
        if (bool || this.aClass239_Sub20_7248 == null) this.aClass239_Sub20_7248 = FogOptionState(this.aClass239_Sub20_7216!!.method1808(i + -63636), this)
        if (bool || this.aClass239_Sub12_7243 == null) this.aClass239_Sub12_7243 = BloomGraphicsOptionState(this)
        if (bool || this.aClass239_Sub10_7232 == null) this.aClass239_Sub10_7232 = RangedGraphicsOptionState(this)
        if (bool || this.aClass239_Sub6_7226 == null) this.aClass239_Sub6_7226 = BrightnessOptionState(this)
        if (bool || this.aClass239_Sub1_7246 == null) this.aClass239_Sub1_7246 = BooleanGraphicsOptionState(this)
        if (bool || this.aClass239_Sub16_7247 == null) this.aClass239_Sub16_7247 = ShadowQualityOptionState(this)
        if (bool || this.aClass239_Sub9_7256 == null) this.aClass239_Sub9_7256 = CustomCursorsOptionState(this)
        if (bool || this.aClass239_Sub4_7220 == null) this.aClass239_Sub4_7220 = LightingOptionState(this)
        if (i != 31286) this.aClass239_Sub4_7220 = null
        if (bool || this.aClass239_Sub13_7236 == null) this.aClass239_Sub13_7236 = GroundDecorOptionState(this)
        if (bool || this.aClass239_Sub28_7230 == null) this.aClass239_Sub28_7230 = TwoStateOptionState(this)
        if (bool || this.aClass239_Sub7_7238 == null) this.aClass239_Sub7_7238 = IdleAnimationsOptionState(this)
        if (bool || this.aClass239_Sub3_7222 == null) this.aClass239_Sub3_7222 = ChatEffectsOptionState(this)
        if (bool || this.aClass239_Sub15_7224 == null) this.aClass239_Sub15_7224 = TextureQualityOptionState(this)
        if (bool || this.aClass239_Sub14_7250 == null) this.aClass239_Sub14_7250 = WaterDetailOptionState(this)
        if (bool || this.aClass239_Sub14_7264 == null) this.aClass239_Sub14_7264 = WaterDetailOptionState(this.aClass239_Sub14_7250!!.method1778(-32350), this)
        if (bool || this.aClass239_Sub23_7231 == null) this.aClass239_Sub23_7231 = AntialiasOptionState(this)
        if (bool || this.aClass239_Sub21_7270 == null) this.aClass239_Sub21_7270 = RemoveRoofsOptionState(this)
        if (bool || this.aClass239_Sub2_7228 == null) this.aClass239_Sub2_7228 = CameraDistanceOptionState(this)
        if (bool || this.aClass239_Sub24_7235 == null) this.aClass239_Sub24_7235 = SceneryDetailOptionState(this)
        if (bool || this.aClass239_Sub25_7251 == null) this.aClass239_Sub25_7251 = DisplayModeOptionState(this)
        if (bool || this.aClass239_Sub25_7271 == null) this.aClass239_Sub25_7271 = DisplayModeOptionState(this.aClass239_Sub25_7251!!.method1829(-32350), this)
        if (bool || this.aClass239_Sub27_7255 == null) this.aClass239_Sub27_7255 = DefaultGraphicsOptionState(this)
        if (bool || this.aClass239_Sub27_7261 == null) this.aClass239_Sub27_7261 = DefaultGraphicsOptionState(this.aClass239_Sub27_7255!!.method1840(-32350), this)
        if (bool || this.aClass239_Sub18_7259 == null) this.aClass239_Sub18_7259 = LightDetailOptionState(this)
        if (bool || this.aClass239_Sub8_7227 == null) this.aClass239_Sub8_7227 = FlickeringEffectsOptionState(this)
        if (bool || this.aClass239_Sub8_7254 == null) this.aClass239_Sub8_7254 = FlickeringEffectsOptionState(this.aClass239_Sub8_7227!!.method1751(-32350), this)
        if (bool || this.aClass239_Sub22_7253 == null) this.aClass239_Sub22_7253 = SimpleBinaryOptionState(this)
        if (bool || this.aClass239_Sub29_7229 == null) this.aClass239_Sub29_7229 = MultiLevelOptionState(this)
        if (bool || this.aClass239_Sub17_7263 == null) this.aClass239_Sub17_7263 = ParticleDetailOptionState(this)
        if (bool || this.aClass239_Sub19_7257 == null) this.aClass239_Sub19_7257 = NoOpGraphicsOptionState(this)
        if (bool || this.aClass239_Sub11_7265 == null) this.aClass239_Sub11_7265 = BinaryGraphicsOptionState(this)
        if (bool || this.aClass239_Sub26_7272 == null) this.aClass239_Sub26_7272 = DetailLevelOptionState(this)
        if (bool || this.aClass239_Sub26_7234 == null) this.aClass239_Sub26_7234 = DetailLevelOptionState(this)
        if (bool || this.aClass239_Sub26_7215 == null) this.aClass239_Sub26_7215 = DetailLevelOptionState(this)
        if (bool || this.aClass239_Sub26_7260 == null) this.aClass239_Sub26_7260 = DetailLevelOptionState(this)
        if (bool || this.aClass239_Sub26_7245 == null) this.aClass239_Sub26_7245 = DetailLevelOptionState(this)
        if (bool || this.aClass239_Sub5_7240 == null) this.aClass239_Sub5_7240 = SimpleToggleOptionState(this)
    }

    private fun method3424(i: Int, class348_sub49: ByteBuffer?) {
        try {
            if (i == 925) {
                anInt7266++
                if (class348_sub49 != null && (class348_sub49.aByteArray7154 != null)) {
                    val i_4_ = class348_sub49.readUnsignedByte(i + -670)
                    if (i_4_ >= 23) {
                        if (i_4_ > 24) method3423(true, 31286)
                        else {
                            this.aClass239_Sub20_7216 = FogOptionState(class348_sub49.readUnsignedByte(i + -670), this)
                            this.aClass239_Sub20_7248 = FogOptionState((this.aClass239_Sub20_7216!!.method1808(i xor 0x7dc0.inv())), this)
                            this.aClass239_Sub12_7243 = BloomGraphicsOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub10_7232 = RangedGraphicsOptionState(class348_sub49.readUnsignedByte(i + -670), this)
                            this.aClass239_Sub6_7226 = BrightnessOptionState(class348_sub49.readUnsignedByte(i + -670), this)
                            this.aClass239_Sub1_7246 = BooleanGraphicsOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub16_7247 = ShadowQualityOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub9_7256 = CustomCursorsOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub4_7220 = LightingOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub13_7236 = GroundDecorOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub28_7230 = TwoStateOptionState(class348_sub49.readUnsignedByte(i + -670), this)
                            this.aClass239_Sub7_7238 = IdleAnimationsOptionState(class348_sub49.readUnsignedByte(255), this)
                            if (i_4_ >= 24) this.aClass239_Sub3_7222 = ChatEffectsOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub15_7224 = TextureQualityOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub14_7250 = WaterDetailOptionState(class348_sub49.readUnsignedByte(i + -670), this)
                            this.aClass239_Sub14_7264 = WaterDetailOptionState(this.aClass239_Sub14_7250!!.method1778(-32350), this)
                            this.aClass239_Sub23_7231 = AntialiasOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub21_7270 = RemoveRoofsOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub2_7228 = CameraDistanceOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub24_7235 = SceneryDetailOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub25_7251 = DisplayModeOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub25_7271 = DisplayModeOptionState(this.aClass239_Sub25_7251!!.method1829(-32350), this)
                            this.aClass239_Sub27_7255 = DefaultGraphicsOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub27_7261 = DefaultGraphicsOptionState(this.aClass239_Sub27_7255!!.method1840(-32350), this)
                            this.aClass239_Sub18_7259 = LightDetailOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub8_7227 = FlickeringEffectsOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub8_7254 = (FlickeringEffectsOptionState(this.aClass239_Sub8_7227!!.method1751(i + -33275), this))
                            this.aClass239_Sub22_7253 = SimpleBinaryOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub29_7229 = MultiLevelOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub17_7263 = ParticleDetailOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub19_7257 = NoOpGraphicsOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub11_7265 = BinaryGraphicsOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub26_7272 = DetailLevelOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub26_7234 = DetailLevelOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub26_7215 = DetailLevelOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub26_7260 = DetailLevelOptionState(class348_sub49.readUnsignedByte(255), this)
                            this.aClass239_Sub26_7245 = DetailLevelOptionState(class348_sub49.readUnsignedByte(i + -670), this)
                            this.aClass239_Sub5_7240 = SimpleToggleOptionState(class348_sub49.readUnsignedByte(255), this)
                            method3423(false, 31286)
                        }
                    } else {
                        try {
                            method3421(i + 29954, class348_sub49, i_4_)
                        } catch (exception: Exception) {
                            method3423(true, 31286)
                        }
                        method3423(false, 31286)
                    }
                } else method3423(true, 31286)
                method3426(36.toByte())
            }
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("dh.C(" + i + ',' + (if (class348_sub49 != null) "{...}" else "null") + ')'))
        }
    }

    fun method3425(i: Int): Boolean {
        if (i > -61) method3424(21, null)
        anInt7217++
        return this.aClass239_Sub25_7271!!.method1830((-120).toByte()) && (this.aClass239_Sub25_7271!!.method1829(-32350) == 0) && aLoadingScreenState_7221!!.method1458(-23688) < 96
    }

    private fun method3426(i: Byte) {
        anInt7219++
        try {
            val fields = this.javaClass.getDeclaredFields()
            if (i.toInt() != 36) aLoadingScreenState_7221 = null
            val fields_5_ = fields
            var i_6_ = 0
            while (fields_5_.size > i_6_) {
                val field = fields_5_[i_6_]
                if ((if (aClass7273 != null) aClass7273 else (GraphicsOptionState::class.java.also { aClass7273 = it }))!!.isAssignableFrom(field.getType())) {
                    val graphicsOptionState = field.get(this) as GraphicsOptionState
                    graphicsOptionState.method1716(false)
                }
                i_6_++
            }
        } catch (illegalaccessexception: IllegalAccessException) {
            if (LoaderStatics.trace) {
                illegalaccessexception.printStackTrace()
            }
            /* empty */
        }
    }

    fun method3427(i: Int): ByteBuffer {
        anInt7237++
        val class348_sub49 = ByteBuffer(method1032(i xor 0x18.inv()))
        class348_sub49.writeByte(false, i)
        class348_sub49.writeByte(false, this.aClass239_Sub20_7216!!.method1808(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub12_7243!!.method1771(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub10_7232!!.method1764(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub6_7226!!.method1743(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub1_7246!!.method1720(i xor 0x7e45.inv()))
        class348_sub49.writeByte(false, this.aClass239_Sub16_7247!!.method1789(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub9_7256!!.method1759(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub4_7220!!.method1737(i + -32374))
        class348_sub49.writeByte(false, this.aClass239_Sub13_7236!!.method1776(i + -32374))
        class348_sub49.writeByte(false, this.aClass239_Sub28_7230!!.method1845(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub7_7238!!.method1748(i xor 0x7e45.inv()))
        class348_sub49.writeByte(false, this.aClass239_Sub3_7222!!.method1727(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub15_7224!!.method1784(i + -32374))
        class348_sub49.writeByte(false, this.aClass239_Sub14_7250!!.method1778(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub23_7231!!.method1818(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub21_7270!!.method1812(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub2_7228!!.method1726(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub24_7235!!.method1820(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub25_7251!!.method1829(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub27_7255!!.method1840(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub18_7259!!.method1800(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub8_7227!!.method1751(i + -32374))
        class348_sub49.writeByte(false, this.aClass239_Sub22_7253!!.method1815(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub29_7229!!.method1848(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub17_7263!!.method1798(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub19_7257!!.method1805(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub11_7265!!.method1768(i xor 0x7e45.inv()))
        class348_sub49.writeByte(false, this.aClass239_Sub26_7272!!.method1838(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub26_7234!!.method1838(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub26_7215!!.method1838(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub26_7260!!.method1838(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub26_7245!!.method1838(-32350))
        class348_sub49.writeByte(false, this.aClass239_Sub5_7240!!.method1739(-32350))
        return class348_sub49
    }

    fun method3428(i: Byte): LoadingScreenState? {
        anInt7225++
        if (i >= -73) method3430(false)
        return aLoadingScreenState_7221
    }

    fun method3429(i: Byte, graphicsOptionState: GraphicsOptionState?, i_7_: Int) {
        try {
            anInt7239++
            if (i.toInt() != 74) method3425(-10)
            graphicsOptionState!!.method1718(i_7_, 72)
            method3426(36.toByte())
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("dh.A(" + i + ',' + (if (graphicsOptionState != null) "{...}" else "null") + ',' + i_7_ + ')'))
        }
    }

    internal constructor(sceneProjector: SceneProjector?, i: Int) {
        try {
            aSceneProjector_7269 = sceneProjector
            aLoadingScreenState_7221 = LoadingScreenState((VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.aBoolean3777), TextureDefinitionCacheStatics.anInt2964, TextureMapImageNodeStatics.anInt9372, PrivilegedOperationWorkerStatics.aString3780!!.lowercase(Locale.getDefault()).indexOf("arm") != -1)
            this.aClass239_Sub25_7271 = DisplayModeOptionState(i, this)
            method3423(true, 31286)
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("dh.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    internal constructor(class348_sub49: ByteBuffer?, sceneProjector: SceneProjector?, i: Int) {
        try {
            aSceneProjector_7269 = sceneProjector
            aLoadingScreenState_7221 = LoadingScreenState((VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.aBoolean3777), TextureDefinitionCacheStatics.anInt2964, TextureMapImageNodeStatics.anInt9372, PrivilegedOperationWorkerStatics.aString3780!!.indexOf("arm") != -1)
            this.aClass239_Sub25_7271 = DisplayModeOptionState(i, this)
            method3424(925, class348_sub49)
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("dh.<init>(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ')'))
        }
    }
}
