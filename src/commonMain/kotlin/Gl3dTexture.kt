import kotlin.jvm.JvmStatic
import GameAppletFrame.Companion.method94
import RangeThresholdTextureNode.Companion.method3055
import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage3Dub
import java.io.IOException

class Gl3dTexture internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, i: Int, i_0_: Int, i_1_: Int, `is`: ByteArray?) : GlTextureBase(glRenderDevice, 32879, textureFormatInfo, MovementDirection.aMovementDirection_1183, i_0_ * (i * i_1_), false), Renderable3dTexture {
    private val anInt8626: Int
    private val anInt8629: Int
    private val anInt8631: Int

    init {
        try {
            anInt8626 = i_1_
            anInt8631 = i
            anInt8629 = i_0_
            this.aGlRenderDevice_5082!!.method3850(86.toByte(), this)
            glPixelStorei(3317, 1)
            glTexImage3Dub(this.anInt5093, 0, this.method228(105), anInt8631, anInt8629, anInt8626, 0, method3055(109, this.aTextureFormatInfo_5084), 5121, `is`, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("qba.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        var anInt8624: Int = 0

        var anInt8625: Int = 0

        var anInt8627: Int = 0

        var anInt8628: Int = 0

        var anInt8630: Int = 0

        var anInt8632: Int = 0

        @JvmStatic
        fun method247(i: Int): DisplaySettingsConfig? {
            anInt8632++
            var randomAccessFileOnDisk: RandomAccessFileOnDisk? = null
            var class348_sub51 = DisplaySettingsConfig(Client.aSceneProjector_10434, 0)
            try {
                val class144 = VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2233((-46).toByte(), "", true)
                while (class144!!.anInt1997 == 0) TexGenMaterialPass.method2161((-85).toByte(), 1L)
                if (class144.anInt1997 == 1) {
                    randomAccessFileOnDisk = class144.anObject1998 as RandomAccessFileOnDisk?
                    val `is` = ByteArray(randomAccessFileOnDisk!!.method1662((-46).toByte()).toInt())
                    var i_2_: Int
                    var i_3_ = 0
                    while (`is`.size > i_3_) {
                        i_2_ = randomAccessFileOnDisk.method1656(`is`, i_3_, (-49).toByte(), -i_3_ + `is`.size)
                        if (i_2_ == -1) throw IOException("EOF")
                        i_3_ += i_2_
                    }
                    class348_sub51 = DisplaySettingsConfig(ByteBuffer(`is`), (Client.aSceneProjector_10434), 0)
                }
            } catch (exception: Exception) {
                /* empty */
            }
            if (i != 24916) return null
            try {
                if (randomAccessFileOnDisk != null) randomAccessFileOnDisk.method1657(false)
            } catch (exception: Exception) {
                /* empty */
            }
            return class348_sub51
        }

        @JvmStatic
        fun method248(i: Int): Array<InboundPacketHeader?> {
            anInt8624++
            if (i != -11271) method249(39)
            return (arrayOf<InboundPacketHeader?>(
                InboundPacketHeader.aInboundPacketHeader_2183,
                InboundPacketHeader.aInboundPacketHeader_3751,
                InboundPacketHeader.aInboundPacketHeader_10168,
                InboundPacketHeader.aInboundPacketHeader_4388,
                InboundPacketHeader.aInboundPacketHeader_250,
                InboundPacketHeader.aInboundPacketHeader_4126,
                InboundPacketHeader.aInboundPacketHeader_3264,
                InboundPacketHeader.aInboundPacketHeader_3143,
                InboundPacketHeader.aInboundPacketHeader_1722,
                InboundPacketHeader.aInboundPacketHeader_9503,
                InboundPacketHeader.aInboundPacketHeader_8385,
                InboundPacketHeader.aInboundPacketHeader_6383,
                InboundPacketHeader.aInboundPacketHeader_2665,
                InboundPacketHeader.aInboundPacketHeader_4421,
                InboundPacketHeader.aInboundPacketHeader_6528,
                InboundPacketHeader.aInboundPacketHeader_315,
                InboundPacketHeader.aInboundPacketHeader_7398,
                InboundPacketHeader.aInboundPacketHeader_5992,
                InboundPacketHeader.aInboundPacketHeader_8384,
                InboundPacketHeader.aInboundPacketHeader_318,
                InboundPacketHeader.aInboundPacketHeader_1917,
                InboundPacketHeader.aInboundPacketHeader_7301,
                InboundPacketHeader.aInboundPacketHeader_4433,
                InboundPacketHeader.aInboundPacketHeader_10149,
                InboundPacketHeader.aInboundPacketHeader_1702,
                InboundPacketHeader.aInboundPacketHeader_2248,
                InboundPacketHeader.aInboundPacketHeader_6056,
                InboundPacketHeader.aInboundPacketHeader_3925,
                InboundPacketHeader.aInboundPacketHeader_9225,
                InboundPacketHeader.aInboundPacketHeader_4798,
                InboundPacketHeader.aInboundPacketHeader_8365,
                InboundPacketHeader.aInboundPacketHeader_4331,
                InboundPacketHeader.aInboundPacketHeader_6121,
                InboundPacketHeader.aInboundPacketHeader_7015,
                InboundPacketHeader.aInboundPacketHeader_5883,
                InboundPacketHeader.aInboundPacketHeader_1068,
                InboundPacketHeader.aInboundPacketHeader_7106,
                InboundPacketHeader.aInboundPacketHeader_7367,
                InboundPacketHeader.aInboundPacketHeader_1901,
                InboundPacketHeader.aInboundPacketHeader_4707,
                InboundPacketHeader.aInboundPacketHeader_220,
                InboundPacketHeader.aInboundPacketHeader_6089,
                InboundPacketHeader.aInboundPacketHeader_90,
                InboundPacketHeader.aInboundPacketHeader_3240,
                InboundPacketHeader.aInboundPacketHeader_3809,
                InboundPacketHeader.aInboundPacketHeader_3467,
                InboundPacketHeader.aInboundPacketHeader_6058,
                InboundPacketHeader.aInboundPacketHeader_2483,
                InboundPacketHeader.aInboundPacketHeader_3265,
                InboundPacketHeader.aInboundPacketHeader_2972,
                InboundPacketHeader.aInboundPacketHeader_1762,
                InboundPacketHeader.aInboundPacketHeader_229,
                InboundPacketHeader.aInboundPacketHeader_1871,
                InboundPacketHeader.aInboundPacketHeader_1120,
                InboundPacketHeader.aInboundPacketHeader_1234,
                InboundPacketHeader.aInboundPacketHeader_3773,
                InboundPacketHeader.aInboundPacketHeader_3307,
                InboundPacketHeader.aInboundPacketHeader_2305,
                InboundPacketHeader.aInboundPacketHeader_8590,
                InboundPacketHeader.aInboundPacketHeader_4998,
                InboundPacketHeader.aInboundPacketHeader_2279,
                InboundPacketHeader.aInboundPacketHeader_9197,
                InboundPacketHeader.aInboundPacketHeader_7124,
                InboundPacketHeader.aInboundPacketHeader_3371,
                InboundPacketHeader.aInboundPacketHeader_5950,
                InboundPacketHeader.aInboundPacketHeader_330,
                InboundPacketHeader.aInboundPacketHeader_843,
                InboundPacketHeader.aInboundPacketHeader_4272,
                InboundPacketHeader.aInboundPacketHeader_2068,
                InboundPacketHeader.aInboundPacketHeader_5949,
                InboundPacketHeader.aInboundPacketHeader_304,
                InboundPacketHeader.aInboundPacketHeader_82,
                InboundPacketHeader.aInboundPacketHeader_9552,
                InboundPacketHeader.aInboundPacketHeader_9254,
                InboundPacketHeader.aInboundPacketHeader_6340,
                InboundPacketHeader.aInboundPacketHeader_79,
                InboundPacketHeader.aInboundPacketHeader_4779,
                InboundPacketHeader.aInboundPacketHeader_2285,
                InboundPacketHeader.aInboundPacketHeader_1123,
                InboundPacketHeader.aInboundPacketHeader_3641,
                InboundPacketHeader.aInboundPacketHeader_2335,
                InboundPacketHeader.aInboundPacketHeader_1959,
                InboundPacketHeader.aInboundPacketHeader_6424,
                InboundPacketHeader.aInboundPacketHeader_8817,
                InboundPacketHeader.aInboundPacketHeader_1914,
                InboundPacketHeader.aInboundPacketHeader_9324,
                InboundPacketHeader.aInboundPacketHeader_7052,
                InboundPacketHeader.aInboundPacketHeader_4269,
                InboundPacketHeader.aInboundPacketHeader_4477,
                InboundPacketHeader.aInboundPacketHeader_6075,
                InboundPacketHeader.aInboundPacketHeader_4027,
                InboundPacketHeader.aInboundPacketHeader_9216,
                InboundPacketHeader.aInboundPacketHeader_2338,
                InboundPacketHeader.aInboundPacketHeader_3427,
                InboundPacketHeader.aInboundPacketHeader_2693,
                InboundPacketHeader.aInboundPacketHeader_316,
                InboundPacketHeader.aInboundPacketHeader_7324,
                InboundPacketHeader.aInboundPacketHeader_7113,
                InboundPacketHeader.aInboundPacketHeader_2527,
                InboundPacketHeader.aInboundPacketHeader_2255,
                InboundPacketHeader.aInboundPacketHeader_8683,
                InboundPacketHeader.aInboundPacketHeader_7105,
                InboundPacketHeader.aInboundPacketHeader_9257,
                InboundPacketHeader.aInboundPacketHeader_7363,
                InboundPacketHeader.aInboundPacketHeader_9285,
                InboundPacketHeader.aInboundPacketHeader_7323,
                InboundPacketHeader.aInboundPacketHeader_2860,
                InboundPacketHeader.aInboundPacketHeader_8756,
                InboundPacketHeader.aInboundPacketHeader_3135,
                InboundPacketHeader.aInboundPacketHeader_9550,
                InboundPacketHeader.aInboundPacketHeader_123,
                InboundPacketHeader.aInboundPacketHeader_2196,
                InboundPacketHeader.aInboundPacketHeader_3368,
                InboundPacketHeader.aInboundPacketHeader_1540,
                InboundPacketHeader.aInboundPacketHeader_3842,
                InboundPacketHeader.aInboundPacketHeader_5997,
                InboundPacketHeader.aInboundPacketHeader_4015,
                InboundPacketHeader.aInboundPacketHeader_4500,
                InboundPacketHeader.aInboundPacketHeader_2717,
                InboundPacketHeader.aInboundPacketHeader_5742,
                InboundPacketHeader.aInboundPacketHeader_2331
            ))
        }

        @JvmStatic
        fun method249(i: Int) {
            anInt8627++
            ArbFogMaterialPass.aStringArray6200 = arrayOfNulls<String>(500)
            ProducerImageSurface.anInt9077 = 2 + (WorldMapLabel.aFontDefinition_4962!!.anInt1993 + WorldMapLabel.aFontDefinition_4962!!.anInt1988)
            MovementDirection.anInt1188 = (ParticleEmitterFactoryStatics.aFontDefinition_3179!!.anInt1988 - (-ParticleEmitterFactoryStatics.aFontDefinition_3179!!.anInt1993 - i))
            var i_4_ = 0
            while ((i_4_ < ArbFogMaterialPass.aStringArray6200!!.size)) {
                ArbFogMaterialPass.aStringArray6200!![i_4_] = ""
                i_4_++
            }
            method94(LocalizedText.aLocalizedText_3483!!.method2063(ChatCommandProcessor.anInt6967, 544)!!, 67)
        }
    }
}
