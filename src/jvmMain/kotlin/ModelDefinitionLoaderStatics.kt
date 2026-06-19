object ModelDefinitionLoaderStatics {
    var aCameraNodeList_2047: CameraNodeList?
            var anInt2049: Int = 0
            var anInt2051: Int = 0
            var anInt2052: Int = 0
            var anInt2053: Int = 0
            var anInt2055: Int = 0
            var anInt2056: Int = 0
            @JvmField
            var anInt2057: Int = 0
    
            @JvmStatic
            fun method1202(i: Int) {
                anInt2052++
                val `is` = IntArray(ClientExceptionStatics.aModelHeaderCache_112!!.anInt3271)
                var i_0_ = i
                var i_1_ = 0
                while (ClientExceptionStatics.aModelHeaderCache_112!!.anInt3271 > i_1_) {
                    val class213 = ClientExceptionStatics.aModelHeaderCache_112!!.method1940(-104, i_1_)
                    if (class213.anInt2815 >= 0 || class213.anInt2788 >= 0) `is`[i_0_++] = i_1_
                    i_1_++
                }
                SpriteStoreStatics.anIntArray369 = IntArray(i_0_)
                for (i_2_ in 0..<i_0_) SpriteStoreStatics.anIntArray369!![i_2_] = `is`[i_2_]
            }
    
            fun method1205(i: Int, bool: Boolean, js5Archive: Js5Archive, i_4_: Int): InterfaceComponentGroup {
                anInt2053++
                val class348_sub49 = ByteBuffer(js5Archive.method410(-1860, i_4_, i))
                if (bool != true) method1208(102)
                val class348_sub42_sub14 = InterfaceComponentGroup(i, class348_sub49.readString(88.toByte()), class348_sub49.readString(120.toByte()), class348_sub49.readInt((-126).toByte()), class348_sub49.readInt((-126).toByte()), class348_sub49.readUnsignedByte(255) == 1, class348_sub49.readUnsignedByte(255), class348_sub49.readUnsignedByte(255))
                val i_5_ = class348_sub49.readUnsignedByte(255)
                for (i_6_ in 0..<i_5_) class348_sub42_sub14.aNodeDeque_9629!!.method1999(
                    InterfaceBounds(
                        class348_sub49.readUnsignedByte(255),
                        class348_sub49.readUnsignedShort(842397944),
                        class348_sub49.readUnsignedShort(842397944),
                        class348_sub49.readUnsignedShort(842397944),
                        class348_sub49.readUnsignedShort(842397944),
                        class348_sub49.readUnsignedShort(842397944),
                        class348_sub49.readUnsignedShort(842397944),
                        class348_sub49.readUnsignedShort(842397944),
                        class348_sub49.readUnsignedShort(842397944)
                    ), -20180
                )
                class348_sub42_sub14.method3240(37.toByte())
                return class348_sub42_sub14
            }
    
            @JvmStatic
            fun method1208(i: Int) {
                aCameraNodeList_2047 = null
                val i_8_ = -65 / ((i - -58) / 57)
            }
    
            init {
                aCameraNodeList_2047 = CameraNodeList()
            }
}
