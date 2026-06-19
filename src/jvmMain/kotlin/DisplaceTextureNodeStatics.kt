object DisplaceTextureNodeStatics {
    @JvmField
            var anInt9131: Int = 0
            @JvmField
            var anInt9132: Int = 0
            @JvmField
            var aByteArrayArrayArray9134: Array<Array<ByteArray?>?>? = null
            @JvmField
            var anIntArray9135: IntArray? = null
            @JvmField
            var anInt9136: Int = 0
            @JvmField
            var anInt9137: Int = 0
            @JvmField
            var anInt9138: Int = 0
            @JvmField
            var anInt9139: Int = 0
    
            @JvmStatic
            fun method3062(bool: Boolean) {
                if (bool != true) aByteArrayArrayArray9134 = null
                anIntArray9135 = null
                aByteArrayArrayArray9134 = null
            }
    
            @JvmStatic
            fun method3063(bool: Boolean): Int {
                anInt9132++
                val i = TimedTileQueueEntryStatics.aConnectionStateType_9660!!.method525(-125)
                if (bool != false) anIntArray9135 = null
                if (i < MaterialTypeMarkerStatics.aConnectionStateTypeArray6515!!.size + -1) TimedTileQueueEntryStatics.aConnectionStateType_9660 = MaterialTypeMarkerStatics.aConnectionStateTypeArray6515!![1 + i]
                return 100
            }
}
