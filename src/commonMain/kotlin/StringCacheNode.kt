/* Class348_Sub50 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class StringCacheNode : LinkedListNode {
    var aString7211: String? = null

    constructor()

    internal constructor(string: String?) {
        this.aString7211 = string
    }

    companion object {
        var anInt7210: Int = 0
        var aByteArrayArray7212: Array<ByteArray?>? = null
        var anInt7213: Int = 0
        var anInt7214: Int = 0

        @JvmStatic
        fun method3418(i: Int) {
            if (i >= 108) aByteArrayArray7212 = null
        }

        fun method3419(i: Int) {
            WorldMapScene.anIntArray6878 = null
            NamedTimedNode.anIntArray8785 = null
            DisplaceTextureNode.anIntArray9135 = null
            anInt7210++
            if (i != 13022) method3418(-79)
            LoadingScreenImageNode.aBoolean9498 = false
            SplashImageLoadable.anIntArray4692 = null
            FacingDirectionNode.anIntArray6655 = null
        }

        fun method3420(i: Int): Int {
            if (i != 0) method3420(101)
            anInt7214++
            return CipheredPacketBuffer.Companion.method3405(2012104999, false)
        }
    }
}
