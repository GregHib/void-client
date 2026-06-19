import KeyboardInputSourceStatics.method2699
import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState
import jagtheora.vorbis.DSPState
import jagtheora.vorbis.VorbisBlock
import jagtheora.vorbis.VorbisComment
import jagtheora.vorbis.VorbisInfo
import java.net.URL

object VorbisOggDecoderStatics {
    @JvmField
            var anInt8989: Int = 0
            @JvmField
            var anInt8990: Int = 0
            @JvmField
            var anInt8991: Int = 0
            @JvmField
            var aPrivilegedOperationWorker_8992: PrivilegedOperationWorker? = null
            @JvmField
            var aByteArrayArray8996: Array<ByteArray?>? = null
            @JvmField
            var anInt8997: Int = 0
            @JvmField
            var anInt8998: Int = 0
            @JvmField
            var anInt8999: Int = 0
            @JvmField
            var anInt9003: Int = 0
            @JvmField
            var anInt9004: Int = 0
            @JvmStatic
            fun method2967(i: Int, abstractModel: AbstractModel?, i_0_: Int, i_1_: Int, i_2_: Int): CircleHitbox? {
                anInt8991++
                if (i_2_ != 2) aByteArrayArray8996 = null
                if (abstractModel == null) return null
                val circleHitbox = CircleHitbox(i, i_1_, i_0_, abstractModel.na(), abstractModel.V(), abstractModel.RA(), abstractModel.fa(), abstractModel.EA(), abstractModel.HA(), abstractModel.G())
                return circleHitbox
            }
    
            @JvmStatic
            fun method2968(i: Byte) {
                aPrivilegedOperationWorker_8992 = null
                aByteArrayArray8996 = null
                if (i > -114) method2968((-12).toByte())
            }
    
            @JvmStatic
            fun method2970(i: Int, class348_sub49: ByteBuffer): MinimapPolygonDrawer {
                anInt8998++
                if (i != 2) method2972(null, -114, 15)
                return MinimapPolygonDrawer(class348_sub49.readShort(13638), class348_sub49.readShort(i + 13636), class348_sub49.readShort(13638), class348_sub49.readShort(i xor 0x3544), class348_sub49.readShort(13638), class348_sub49.readShort(i + 13636), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255))
            }
    
            @JvmStatic
            fun method2972(string: String?, i: Int, i_3_: Int): Boolean {
                anInt9004++
                if (aPrivilegedOperationWorker_8992!!.aBoolean3777) {
                    CacheStateResetter.aServerConnectionInfo_125 = ServerConnectionInfo()
                    CacheStateResetter.aServerConnectionInfo_125!!.anInt2143 = i
                    CacheStateResetter.aServerConnectionInfo_125!!.aString2147 = string
                    if (NpcAnimationResolverStatics.aNamedIdRecord_165 != OggCacheStreamStatics.aNamedIdRecord_5271) {
                        CacheStateResetter.aServerConnectionInfo_125!!.anInt2138 = 50000 - -CacheStateResetter.aServerConnectionInfo_125!!.anInt2143
                        CacheStateResetter.aServerConnectionInfo_125!!.anInt2148 = 40000 - -CacheStateResetter.aServerConnectionInfo_125!!.anInt2143
                    }
                    if (i < WorldMapImageBuilderStatics.aClass110_Sub1Array1146!!.size && WorldMapImageBuilderStatics.aClass110_Sub1Array1146!![i] != null) ConfigFlagUtilStatics.anInt3234 = (WorldMapImageBuilderStatics.aClass110_Sub1Array1146!![i]!!.anInt1708)
                    return true
                }
                var string_4_ = ""
                if (OggCacheStreamStatics.aNamedIdRecord_5271 != NpcAnimationResolverStatics.aNamedIdRecord_165) string_4_ = ":" + (7000 + i)
                var string_5_ = ""
                if (BloomGraphicsOptionStateStatics.aString5966 != null) string_5_ = "/p=" + BloomGraphicsOptionStateStatics.aString5966
                val string_6_ = ("http://" + string + string_4_ + "/l=" + AnimationFrameDefinitionStatics.anInt6967 + "/a=" + SocketStreamWorkerStatics.anInt2670 + string_5_ + "/j" + (if (!RegionSceneLoader.aBoolean3697) "0" else "1") + ",o" + (if (HashTableContainerStatics.aBoolean6997) "1" else "0") + ",a2")
                try {
                    NpcTypeStatics.aClient1367!!.showDocument(URL(string_6_), "_self")
                    if (i_3_ >= -17) aPrivilegedOperationWorker_8992 = null
                } catch (exception: Exception) {
                    return false
                }
                return true
            }
}
