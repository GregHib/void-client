import PcmStreamBufferStatics.method2834

object AnimatedModelRendererStatics {
    @JvmField
            var anInt8390: Int = 0
            @JvmField
            var anInt8392: Int = 0
            @JvmField
            var anInt8393: Int = 0
            @JvmField
            var anInt8394: Int = 0
            @JvmField
            var anInt8395: Int = 0
            @JvmField
            var anInt8398: Int = 0
            @JvmField
            var anInt8399: Int = 0
            @JvmField
            var anInt8401: Int = 0
            @JvmField
            var anInt8402: Int = 0
            @JvmField
            var anInt8404: Int = 0
            @JvmField
            var anInt8405: Int = 0
            @JvmField
            var anInt8406: Int = 0
            @JvmField
            var anInt8409: Int = 0
            @JvmField
            var anInt8412: Int = 0
            @JvmField
            var anInt8413: Int = 0
            @JvmField
            var anInt8414: Int = 0
            @JvmField
            var anInt8415: Int = 0
            @JvmField
            var anInt8420: Int = 0
            @JvmField
            var anInt8421: Int = 0
            @JvmField
            var anInt8422: Int = 0
            @JvmField
            var anInt8423: Int = 0
    
            @JvmStatic
            fun method987(i: Int, class348_sub49: ByteBuffer): WorldMapTextLabel {
                anInt8405++
                val class369 = method2834(((-118).toByte()).toByte(), class348_sub49)
                if (i != 743571200) method989(-21, 36, 81)
                val i_8_ = class348_sub49.readInt(((-126).toByte()).toByte())
                val i_9_ = class348_sub49.readInt(((-126).toByte()).toByte())
                return WorldMapTextLabel(class369.aScreenAnchorAlignment_4968, class369.aTileRenderState_4973, class369.anInt4970, class369.anInt4959, class369.anInt4971, class369.anInt4963, class369.anInt4966, class369.anInt4965, class369.anInt4961, i_8_, i_9_)
            }
    
            @JvmStatic
            fun method988(i: Int, i_10_: Int, i_11_: Int): CollisionMap? {
                anInt8415++
                val collisionMap = CollisionMap()
                collisionMap.anInt4437 = 6 + i_11_
                collisionMap.anInt4453 = -1
                collisionMap.anInt4443 = 5 + (i - -1)
                if (i_10_ != 1) return null
                collisionMap.anInt4441 = -1
                collisionMap.anIntArrayArray4438 = (Array(collisionMap.anInt4437) { IntArray(collisionMap.anInt4443) })
                collisionMap.method3500(700)
                return collisionMap
            }
    
            fun method989(i: Int, i_92_: Int, i_93_: Int): Boolean {
                anInt8401++
                if (LinkedListIteratorStatics.method1241(i_93_, i, i_92_ xor 0x1fe) or ((0x10000 and i) != 0) || OutgoingPacketNodeStatics.method3325(i, i_93_, true)) return true
                if (i_92_ != -385) return false
                return (i_93_ and 0x37) == 0 && BoundsConstraintEntryStatics.method2056(i, 120, i_93_)
            }
}
