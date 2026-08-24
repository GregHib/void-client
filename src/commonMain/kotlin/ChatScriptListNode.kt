import kotlin.jvm.JvmStatic
import GameAppletFrame.Companion.method94
import GrayscaleNoiseTexture.Companion.method555
import GameClock.method599

/* Class348_Sub42_Sub6 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ChatScriptListNode internal constructor(var aClass318_Sub1_Sub3_Sub4_9538: MapElementDecor?) : HashLinkedListNode() {
    companion object {
        var aBoolean9535: Boolean = false
        var aLinkedQueueNode_9536: LinkedQueueNode? = null
        var anInt9537: Int = 0
        var anInt9539: Int = 0

        fun method3188(i: Byte, class348_sub49: ByteBuffer) {
            anInt9539++
            for (i_0_ in 0..<NpcDefinition.anInt2956) {
                val i_1_ = class348_sub49.readSmart(-127)
                var i_2_ = class348_sub49.readUnsignedShort(842397944)
                if (i_2_ == 65535) i_2_ = -1
                if (FireParticleStream.aClass110_Sub1Array97!![i_1_] != null) FireParticleStream.aClass110_Sub1Array97!![i_1_]!!.anInt1704 = i_2_
            }
            val i_3_ = -75 / ((53 - i) / 48)
        }

        fun method3189(i: Int, strings: Array<String?>) {
            if (i == 0) {
                anInt9537++
                if (strings.size > 1) {
                    for (i_4_ in strings.indices) {
                        if (strings[i_4_]!!.startsWith("pause")) {
                            var i_5_ = 5
                            try {
                                i_5_ = strings[i_4_]!!.substring(6).toInt()
                            } catch (exception: Exception) {
                                /* empty */
                            }
                            method94(("Pausing for " + i_5_ + " seconds..."), -109)
                            MinimapSquareDrawer.aStringArray5223 = strings
                            MinimapFlagRenderer.anInt1794 = i_4_ - -1
                            CubemapTexture2dSource.aLong8694 = (i_5_ * 1000).toLong() + method599(-104)
                            break
                        }
                        MapElementManager.aString4461 = strings[i_4_]
                        method555(false, 0)
                    }
                } else {
                    MapElementManager.aString4461 += strings[0]
                    TerrainShadowBuilderGl3.anInt7006 += strings[0]!!.length
                }
            }
        }

        @JvmStatic
        fun method3190(bool: Boolean) {
            if (bool != false) aBoolean9535 = true
            aLinkedQueueNode_9536 = null
        }
    }
}
