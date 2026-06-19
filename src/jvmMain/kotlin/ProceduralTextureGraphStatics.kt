import SoundBankPatchStatics.method2929
import HashTableContainerStatics.method3031
import NpcTypeStatics.method797

object ProceduralTextureGraphStatics {
    var anInt9522: Int = 0
            var anInt9525: Int = 0
            var anInt9526: Int = 0
            var anInt9529: Int = 0
            var aRectangleRegion_9530: RectangleRegion? = RectangleRegion(6, 0, 4, 2)
            var aDouble9531: Double = 0.0
            var anInt9532: Int = 0
            var aFontMetaRef_9533: FontMetaRef?
            @JvmField
            var anCharStreamReaderArray9534s: Array<CharStreamReader?>? = arrayOfNulls<CharStreamReader>(128)
    
            @JvmStatic
            fun method3187(i: Byte) {
                anCharStreamReaderArray9534s = null
                val i_55_ = 19 % ((76 - i) / 39)
                aFontMetaRef_9533 = null
                aRectangleRegion_9530 = null
            }
    
            init {
                aFontMetaRef_9533 = FontMetaRef(57, 3)
            }
}
