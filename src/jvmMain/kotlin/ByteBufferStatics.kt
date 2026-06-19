import LinkedNodeListIteratorStatics.method1006
import HeadIconRendererStatics.method1213
import LoadProgressCountersStatics.method1372
import CameraConfigDefinitionStatics.method1922
import CacheIndexManagerStatics.method2355
import RsaPacketDecoderStatics.method2672
import SoundBankPatchStatics.method2929
import AbstractFrameBufferSurfaceStatics.method3007
import CombineTextureNodeStatics.method3088
import SpriteRgbTextureNodeStatics.method3093
import AsyncResourceRequestStatics.method3255
import LoadingScreenImageNodeStatics.method3177
import CacheEntryReferenceStatics.method3196
import ByteArrayPool.method359
import java.math.BigInteger

object ByteBufferStatics {
    var anInt7137: Int = 0
    var anInt7138: Int = 0
    var anInt7139: Int = 0
    var anInt7140: Int = 0
    var anInt7141: Int = 0
    var anInt7142: Int = 0
    var anInt7143: Int = 0
    var anInt7144: Int = 0
    var anInt7145: Int = 0
    var anInt7146: Int = 0
    var anInt7147: Int = 0
    var anInt7148: Int = 0
    var anInt7149: Int = 0
    var anInt7150: Int = 0
    var anInt7151: Int = 0
    var anInt7152: Int = 0
    var anInt7153: Int = 0
    var anInt7155: Int = 0
    var anInt7156: Int = 0
    var anInt7157: Int = 0
    var anInt7158: Int = 0
    var anInt7159: Int = 0
    var anInt7160: Int = 0
    var anInt7161: Int = 0
    var anInt7162: Int = 0
    var anInt7163: Int = 0
    var anInt7164: Int = 0
    var anInt7165: Int = 0
    var anInt7166: Int = 0
    var anInt7167: Int = 0
    var anInt7168: Int = 0
    var anInt7169: Int = 0
    var anInt7170: Int = 0
    var anInt7171: Int = 0
    var anInt7172: Int = 0
    var anInt7173: Int = 0
    var anInt7174: Int = 0
    var aProjectileFactory_7175: ProjectileFactory? = ProjectileFactory(1, 2)
    var anInt7176: Int = 0
    var anInt7177: Int = 0
    var anInt7178: Int = 0
    var anInt7179: Int = 0
    var anInt7180: Int = 0
    var anInt7181: Int = 0
    var anInt7182: Int = 0
    var anInt7183: Int = 0
    var anInt7184: Int = 0
    var anInt7185: Int = 0
    var anInt7186: Int = 0
    var anInt7187: Int = 0
    var anInt7188: Int = 0
    var anInt7189: Int = 0
    var anInt7190: Int = 0
    var anInt7191: Int = 0
    var anInt7192: Int = 0
    var anInt7193: Int = 0
    var anInt7194: Int = 0
    var anInt7195: Int = 0
    var anInt7196: Int = 0
    var anInt7198: Int = 0
    var anInt7199: Int = 0
    var anInt7200: Int = 0
    var anInt7201: Int = 0
    var anInt7202: Int = 0
    var anInt7203: Int = 0
    var anInt7204: Int = 0
    var anInt7205: Int = 0
    var aLongArray7206: LongArray? = LongArray(32)
    var anInt7207: Int = 0
    var anInt7208: Int = 0
    var anInt7209: Int = 0

    fun method3331(i: Int, i_0_: Byte, i_1_: Int): Int {
        var i = i
        var i_1_ = i_1_
        anInt7161++
        var i_2_ = 1
        while ( /**/i > 1) {
            if ((0x1 and i) != 0) i_2_ *= i_1_
            i_1_ *= i_1_
            i = i shr 1
        }
        val i_3_ = 3 / ((i_0_ - -24) / 46)
        if (i == 1) return i_2_ * i_1_
        return i_2_
    }

    fun method3354(i: Int) {
        if (IntPairStatics.aRenderer6968 != null) {
            IntPairStatics.aRenderer6968!!.method3635((-44).toByte())
            EdgeDetectTextureNodeStatics.aFont_9173 = null
            IntPairStatics.aRenderer6968 = null
        }
        val i_37_ = -97 % ((i - -14) / 37)
        anInt7173++
    }

    @JvmStatic
    fun method3376(i: Int) {
        aLongArray7206 = null
        aProjectileFactory_7175 = null
        if (i != -2) method3376(-87)
    }

    fun method3379(i: Int, i_71_: Int) {
        anInt7201++
        if (i_71_ != WorldMapRendererStatics.anInt4674) {
            if (i_71_ == 13) {
                if (NullOggStreamStatics.aString9043 != null) GlElementArrayBufferStatics.method1157(TextureLoadExceptionStatics.anInt4596, (-81).toByte())
                else method1922(TextureGeneratorStatics.aString2496, TextureLoadExceptionStatics.anInt4596, OpenGlModelStatics.aString5600, true)
            }
            if (i_71_ != 13 && ItemDefinitionStatics.aAbstractGameSocket_2773 != null) {
                ItemDefinitionStatics.aAbstractGameSocket_2773!!.method1700(36.toByte())
                ItemDefinitionStatics.aAbstractGameSocket_2773 = null
            }
            if (i_71_ == 3) CacheEntryReferenceStatics.method3198((GlBufferObjectStatics.anInt4737 != RenderNodeStatics.anInt9721), (-45).toByte())
            if (i_71_ == 7) method1006((RenderNodeStatics.anInt9721 != FloorOverlayDefinitionStatics.anInt970), 102.toByte())
            if (i_71_ == 5) {
                if (NullOggStreamStatics.aString9043 == null) method1213(OpenGlModelStatics.aString5600, TextureGeneratorStatics.aString2496, -124)
                else method1372(-1)
            } else if (i_71_ != 6) {
                if (i_71_ == 9) {
                    if (NullOggStreamStatics.aString9043 != null) GlElementArrayBufferStatics.method1157((TextureLoadExceptionStatics.anInt4596), (-120).toByte())
                    else method1922(TextureGeneratorStatics.aString2496, TextureLoadExceptionStatics.anInt4596, OpenGlModelStatics.aString5600, true)
                } else if (i_71_ == 12) {
                    if (NullOggStreamStatics.aString9043 == null) method1213(OpenGlModelStatics.aString5600, TextureGeneratorStatics.aString2496, -98)
                    else method1372(-1)
                }
            } else if (NullOggStreamStatics.aString9043 == null) method1922(TextureGeneratorStatics.aString2496, TextureLoadExceptionStatics.anInt4596, OpenGlModelStatics.aString5600, true)
            else GlElementArrayBufferStatics.method1157(TextureLoadExceptionStatics.anInt4596, (-99).toByte())
            if (GroundDecorSceneEntityStatics.method2402(WorldMapRendererStatics.anInt4674, (-78).toByte())) {
                DirectionUtil.aJs5Archive_1541!!.anInt634 = 2
                VideoAdChecker.aJs5Archive_3183!!.anInt634 = 2
                AnimationFrameState.aJs5Archive_1538!!.anInt634 = 2
                FloatGridStatics.aJs5Archive_4975!!.anInt634 = 2
                SpotAnimVectorStatics.aJs5Archive_2306!!.anInt634 = 2
                OpenGlRenderNodeStatics.aJs5Archive_10480!!.anInt634 = 2
                BufferedRandomAccessFileStatics.aJs5Archive_1322!!.anInt634 = 2
            }
            if (GroundDecorSceneEntityStatics.method2402(i_71_, (-119).toByte())) {
                ItemModelDefinitionStatics.anInt443 = 1
                AnimationFrameTable.anInt489 = 0
                StringValueNodeStatics.anInt7115 = 1
                CompositeNpcModelBuilderStatics.anInt2101 = 0
                LocDefinitionCacheStatics.anInt3441 = 0
                method3177(-111, true)
                DirectionUtil.aJs5Archive_1541!!.anInt634 = 1
                VideoAdChecker.aJs5Archive_3183!!.anInt634 = 1
                AnimationFrameState.aJs5Archive_1538!!.anInt634 = 1
                FloatGridStatics.aJs5Archive_4975!!.anInt634 = 1
                SpotAnimVectorStatics.aJs5Archive_2306!!.anInt634 = 1
                OpenGlRenderNodeStatics.aJs5Archive_10480!!.anInt634 = 1
                BufferedRandomAccessFileStatics.aJs5Archive_1322!!.anInt634 = 1
            }
            if (i_71_ == 11 || i_71_ == 3) method3088(9)
            val bool = (i == i_71_ || method3196(i_71_, i xor 0x58.inv()) || method2672(i_71_, -100))
            val bool_72_ = (WorldMapRendererStatics.anInt4674 == 2 || method3196(WorldMapRendererStatics.anInt4674, -110) || method2672(WorldMapRendererStatics.anInt4674, -128))
            if (bool != bool_72_) {
                if (bool) {
                    SlotBindingStatics.anInt3428 = ParticleProcessorStatics.anInt4270
                    if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7245!!.method1838(-32350) != 0) {
                        method2355(IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7245!!.method1838(-32350), 50.toByte(), false, CachedRgbNoiseTextureStatics.aJs5Archive_8667, ParticleProcessorStatics.anInt4270, 0, 2)
                        method3093(i xor 0x66)
                    } else method3007(2, 22684)
                    ClientMachineInfoStatics.aMediaStreamClient_6601!!.method1892(-117, false)
                } else {
                    method3007(2, 22684)
                    ClientMachineInfoStatics.aMediaStreamClient_6601!!.method1892(i xor 0x4b.inv(), true)
                }
            }
            if (GroundDecorSceneEntityStatics.method2402(i_71_, (-64).toByte()) || i_71_ == 13) FacingDirectionNodeStatics.aRenderer6654!!.method3673()
            WorldMapRendererStatics.anInt4674 = i_71_
        }
    }
}
