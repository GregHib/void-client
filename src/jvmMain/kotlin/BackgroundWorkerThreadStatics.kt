import LinkedListIteratorStatics.method1242
import kotlin.concurrent.Volatile

object BackgroundWorkerThreadStatics {
    var anInt3219: Int = 0
            @JvmField
            var anIntArray3220: IntArray? = null
            var anInt3222: Int = 0
            var anInt3224: Int = 0
            @JvmField
            var anInt3225: Int = 0
            @JvmField
            var aClass318_Sub1Array3226: Array<SceneEntity?>? = null
            @JvmField
            var anInt3227: Int = 0
            fun method1909(i: Byte, string: String): String {
                var string = string
                if (i.toInt() != 31) method1911(87.toByte())
                anInt3222++
                var string_0_: String? = null
                val i_1_ = string.indexOf("--> ")
                if (i_1_ >= 0) {
                    string_0_ = string.substring(0, 4 + i_1_)
                    string = string.substring(i_1_ + 4)
                }
                if (string.startsWith("directlogin ")) {
                    val i_2_ = string.indexOf(" ", "directlogin ".length)
                    if (i_2_ >= 0) {
                        val i_3_ = string.length
                        string = string.substring(0, i_2_) + " "
                        for (i_4_ in 1 + i_2_..<i_3_) string += "*"
                    }
                }
                if (string_0_ == null) return string
                return string_0_ + string
            }
    
            @JvmStatic
            fun method1910(i: Int) {
                anIntArray3220 = null
                if (i != 0) method1910(-18)
                aClass318_Sub1Array3226 = null
            }
    
            @JvmStatic
            fun method1911(i: Byte) {
                if (i.toInt() != 99) anIntArray3220 = null
                GlGroundShaderPassStatics.aLongHashTable_7415 = LongHashTable(8)
                anInt3219++
                SpotAnimEntityStatics.anInt6450 = 0
                var class318_sub10 = GzipDecompressorStatics.aDoublyLinkedNodeList_2077!!.method1872(8) as SceneGraphContainer?
                while (class318_sub10 != null) {
                    class318_sub10.method2530()
                    class318_sub10 = GzipDecompressorStatics.aDoublyLinkedNodeList_2077!!.method1878((-115).toByte()) as SceneGraphContainer?
                }
            }
}
