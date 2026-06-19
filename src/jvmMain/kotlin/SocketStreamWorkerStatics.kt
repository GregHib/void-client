import LinkedListIteratorStatics.method1242
import TexGenMaterialPassStatics.method2161
import java.io.EOFException
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.net.Socket

object SocketStreamWorkerStatics {
    var anInt2646: Int = 0
            var anInt2647: Int = 0
            var anInt2650: Int = 0
            var anInt2651: Int = 0
            var anInt2653: Int = 0
            var anInt2655: Int = 0
            var anInt2660: Int = 0
            @JvmField
            var aFontMetaRef_2661: FontMetaRef? = FontMetaRef(24, 7)
            var anInt2662: Int = 0
            var anInt2664: Int = 0
            var aIntRange_2665: IntRange? = IntRange(12, 0)
            var anInt2666: Int = 0
            var anInt2667: Int = 0
            @JvmField
            var anInt2670: Int = 0
            @JvmField
            var aLruByteCache_2671: LruByteCache? = LruByteCache(10)
    
            @JvmStatic
            fun method1469(i: Int) {
                anInt2662++
                MaterialPassStatics.anInt3682 = 0
                SceneryDetailOptionStateStatics.anInt6095 = 0
                val i_0_ = 29 % ((-42 - i) / 63)
                var i_1_ = 0
                while (BackgroundWorkerThreadStatics.anInt3225 > i_1_) {
                    val i_2_ = ItemModelDefinitionStatics.anInt425 * i_1_
                    for (i_3_ in 0..<ItemModelDefinitionStatics.anInt425) {
                        val i_4_ = i_2_ - -i_3_
                        NpcSpawnDecoder.anSpriteDrawTargetArray1525!![i_4_]!!.method15(i_3_ * DirectionPathStatics.anInt1067, i_1_ * ByteStoreStatics.anInt4267, DirectionPathStatics.anInt1067, ByteStoreStatics.anInt4267, 0, 0, true, true)
                    }
                    i_1_++
                }
            }
    
            @JvmStatic
            fun method1471(i: Byte) {
                if (i >= 80) {
                    aLruByteCache_2671 = null
                    aIntRange_2665 = null
                    aFontMetaRef_2661 = null
                }
            }
    
            fun method1475(i: Byte, i_12_: Int, i_13_: Int): Boolean {
                anInt2653++
                if (i > -95) method1469(-48)
                return (SphereMapMaterialPassStatics.method2174((-115).toByte(), i_13_, i_12_) and IndexedFileCacheStatics.method1163(i_12_, (-72).toByte(), i_13_))
            }
}
