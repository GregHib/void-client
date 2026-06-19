import java.net.URL
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sin

object MidiSequencePlayerStatics {
    @JvmField
            var anInt8889: Int = 0
            @JvmField
            var anInt8890: Int = 0
            @JvmField
            var anInt8892: Int = 0
            @JvmField
            var anInt8893: Int = 0
            @JvmField
            var anInt8897: Int = 0
            @JvmField
            var anInt8898: Int = 0
            @JvmField
            var anInt8900: Int = 0
            @JvmField
            var anInt8901: Int = 0
            @JvmField
            var anInt8903: Int = 0
            @JvmField
            var anInt8905: Int = 0
            @JvmField
            var anInt8907: Int = 0
            @JvmField
            var anInt8908: Int = 0
            @JvmField
            var anInt8909: Int = 0
            @JvmField
            var anIntArrayArray8910: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(0, 1, 2, 3), intArrayOf(1, 2, 3, 0), intArrayOf(1, 2, -1, 0), intArrayOf(2, 0, -1, 1), intArrayOf(0, 1, -1, 2), intArrayOf(1, 2, -1, 0), intArrayOf(-1, 4, -1, 1), intArrayOf(-1, 1, 3, -1), intArrayOf(-1, 0, 2, -1), intArrayOf(3, 5, 2, 0), intArrayOf(0, 2, 5, 3), intArrayOf(0, 2, 3, 5), intArrayOf(0, 1, 2, 3))
            @JvmField
            var anInt8911: Int = 0
            @JvmField
            var anInt8912: Int = 0
            @JvmField
            var anInt8913: Int = 0
            @JvmField
            var anInt8917: Int = 0
            @JvmField
            var anInt8918: Int = 0
            @JvmField
            var anInt8919: Int = 0
            @JvmField
            var anInt8920: Int = 0
            @JvmField
            var anInt8922: Int = 0
            @JvmField
            var anInt8923: Int = 0
            @JvmField
            var anInt8924: Int = 0
            @JvmField
            var aJs5Archive_8926: Js5Archive? = null
            @JvmField
            var anInt8927: Int = 0
            @JvmField
            var anInt8929: Int = 0
            @JvmField
            var anInt8930: Int = 0
            @JvmField
            var anInt8931: Int = 0
            @JvmField
            var anInt8932: Int = 0
            @JvmField
            var anInt8934: Int = 0
            @JvmField
            var anInt8935: Int = 0
            @JvmField
            var anInt8936: Int = 0
            @JvmField
            var anInt8938: Int = 0
            @JvmField
            var anInt8940: Int = 0
            @JvmField
            var anInt8941: Int = 0
            @JvmField
            var anInt8943: Int = 0
            @JvmField
            var anInt8946: Int = 0
            @JvmField
            var anInt8948: Int = 0
            @JvmField
            var anInt8949: Int = 0
            @JvmField
            var anInt8950: Int = 0
            @JvmField
            var anInt8951: Int = 0
            @JvmField
            var anInt8952: Int = 0
            @JvmField
            var anInt8954: Int = 0
            @JvmField
            var anInt8955: Int = 0
            @JvmStatic
            fun method2839(i: Int, i_0_: Int, i_1_: Int) {
                anInt8890++
                TextureMetadataProviderStatics.anInt4609 = i - MapRegionLoaderStatics.anInt1266
                ColourAdjustmentStatics.anInt859 = i_1_ + -MapRegionLoaderStatics.anInt1263
                if (i_0_ != -17) method2839(-112, -58, -95)
            }
    
            @JvmStatic
            fun method2862(privilegedOperationWorker: PrivilegedOperationWorker?, string: String?, i: Int, i_71_: Int): LinkedQueueNode? {
                try {
                    val i_72_ = 16 % ((-37 - i) / 51)
                    anInt8911++
                    if (i_71_ == 0) return privilegedOperationWorker!!.method2245(string, 16)
                    if (i_71_ == 1) {
                        try {
                            JavaScriptBridge.method1616("openjs", (arrayOf<Any?>(URL(JagGlToolkitFactory.anApplet1530!!.getCodeBase(), string).toString())), JagGlToolkitFactory.anApplet1530, 38.toByte())
                            val linkedQueueNode = LinkedQueueNode()
                            linkedQueueNode.anInt1997 = 1
                            return linkedQueueNode
                        } catch (throwable: Throwable) {
                            val linkedQueueNode = LinkedQueueNode()
                            linkedQueueNode.anInt1997 = 2
                            return linkedQueueNode
                        }
                    }
                    if (i_71_ == 2) {
                        try {
                            JagGlToolkitFactory.anApplet1530!!.showDocument(URL(JagGlToolkitFactory.anApplet1530!!.getCodeBase(), string), "_blank")
                            val linkedQueueNode = LinkedQueueNode()
                            linkedQueueNode.anInt1997 = 1
                            return linkedQueueNode
                        } catch (exception: Exception) {
                            val linkedQueueNode = LinkedQueueNode()
                            linkedQueueNode.anInt1997 = 2
                            return linkedQueueNode
                        }
                    }
                    if (i_71_ == 3) {
                        try {
                            JavaScriptBridge.method1617(125.toByte(), JagGlToolkitFactory.anApplet1530, "loggedout")
                        } catch (throwable: Throwable) {
                            /* empty */
                        }
                        try {
                            JagGlToolkitFactory.anApplet1530!!.showDocument(URL(JagGlToolkitFactory.anApplet1530!!.getCodeBase(), string), "_top")
                            val linkedQueueNode = LinkedQueueNode()
                            linkedQueueNode.anInt1997 = 1
                            return linkedQueueNode
                        } catch (exception: Exception) {
                            val linkedQueueNode = LinkedQueueNode()
                            linkedQueueNode.anInt1997 = 2
                            return linkedQueueNode
                        }
                    }
                    throw IllegalArgumentException()
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("ma.EA(" + (if (privilegedOperationWorker != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_71_ + ')'))
                }
            }
    
            @JvmStatic
            fun method2871(i: Int) {
                anIntArrayArray8910 = null
                if (i != -65) method2862(null, null, 96, -71)
                aJs5Archive_8926 = null
            }
    
            @JvmStatic
            fun method2878(i: Int, i_103_: Int, i_104_: Int): TileSceneEntity? {
                val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_103_]!![i_104_]
                if (class357 == null || class357.aClass318_Sub1_Sub1_4402 == null) return null
                return class357.aClass318_Sub1_Sub1_4402
            }
    
            @JvmStatic
            fun method2879(i: Int, i_105_: Int, i_106_: Int) {
                val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_105_]!![i_106_]
                if (class357 != null) {
                    ParticleDefLoaderStatics.method1376(class357.aClass318_Sub1_Sub1_4402)
                    if (class357.aClass318_Sub1_Sub1_4402 != null) class357.aClass318_Sub1_Sub1_4402 = null
                }
            }
}
