import ModelBatchBaseStatics.method1130
import HostPingThreadStatics.method1301
import VorbisOggDecoderStatics.method2967
import ChatMessageStreamStatics.method136

object GroundDecorSceneEntityStatics {
    var anInt9969: Int = 0
            var anInt9970: Int = 0
            var anInt9971: Int = 0
            var anInt9972: Int = 0
            var anInt9973: Int = 0
            var anInt9975: Int = 0
            var anInt9977: Int = 0
            var anInt9978: Int = 0
            var anInt9979: Int = 0
            @JvmField
            var anIntArray9981: IntArray? = IntArray(5)
            var anInt9982: Int = 0
            var anInt9984: Int = 0
            var anInt9985: Int = 0
            var anInt9986: Int = 0
            var anInt9987: Int = 0
            var anInt9990: Int = 0
            var anInt9992: Int = 0
            var anInt9994: Int = 0
            var anInt9995: Int = 0
            var anInt9996: Int = 0
            @JvmField
            var anInt9997: Int = 1
            var anInt9998: Int = 0
            var anInt10000: Int = 0
            var anInt10001: Int = 0
            var anInt10002: Int = 0
    
            @JvmStatic
            fun method2400(i: Byte) {
                if (i.toInt() != 3) anIntArray9981 = null
                anIntArray9981 = null
            }
    
            @JvmStatic
            fun method2402(i: Int, i_6_: Byte): Boolean {
                anInt9994++
                if (i_6_ >= -52) return true
                return i == 4 || i == 8 || i == 11
            }
    
            fun method2403(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int) {
                anInt9977++
                if (i_10_ != 19206) method2402(-3, 46.toByte())
                val class302s = MultiFieldRecordStatics.aMinimapPositionStateArray6897s!!
                for (i_13_ in class302s.indices) {
                    val class302 = class302s[i_13_]
                    if (class302 != null && class302.anInt3840 == 2) {
                        SceneTextLabelStatics.method2505(i_9_ shr 1, 2 * class302.anInt3839, 0, i_12_, i_11_ shr 1, class302.anInt3838, class302.anInt3832, i_7_, class302.anInt3835)
                        if (RemoveRoofsOptionStateStatics.anIntArray6062!![0] > -1 && GlGroundShaderPassStatics.anInt7396 % 20 < 10) {
                            val class105 = (CustomCursorsOptionStateStatics.aAbstractModelRendererArray5933!![class302.anInt3831])
                            val i_14_ = -12 + (i - -RemoveRoofsOptionStateStatics.anIntArray6062!![0])
                            val i_15_ = i_8_ - -RemoveRoofsOptionStateStatics.anIntArray6062!![1] - 28
                            class105!!.method974(i_14_, i_15_)
                            MapTileShapeStatics.method2663(-5590, i_14_, i_14_ - -class105.method966(), i_15_, class105.method980() + i_15_)
                        }
                    }
                }
            }
}
