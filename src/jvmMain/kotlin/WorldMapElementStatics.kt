object WorldMapElementStatics {
    @JvmField
            var anInt4627: Int = 0
            @JvmField
            var anInt4628: Int = 0
            @JvmField
            var anInt4629: Int = 0
            @JvmField
            var anInt4633: Int = 0
            @JvmField
            var anInt4634: Int = 0
            @JvmField
            var aLruByteCache_4636: LruByteCache? = LruByteCache(64)
            @JvmField
            var anInt4638: Int = 0
            @JvmField
            var anInt4639: Int = 0
            @JvmField
            var anInt4641: Int = 0
    
            @JvmStatic
            fun method179(i: Int, class348_sub49: ByteBuffer): WorldMapAreaLabel {
                anInt4629++
                val class369 = PcmStreamBufferStatics.method2834((-127).toByte(), class348_sub49)
                val i_3_ = class348_sub49.readInt((-126).toByte())
                val i_4_ = class348_sub49.readInt((-126).toByte())
                if (i != 16533) aLruByteCache_4636 = null
                val i_5_ = class348_sub49.readUnsignedShort(842397944)
                return WorldMapAreaLabel(class369.aScreenAnchorAlignment_4968, class369.aTileRenderState_4973, class369.anInt4970, class369.anInt4959, class369.anInt4971, class369.anInt4963, class369.anInt4966, class369.anInt4965, class369.anInt4961, i_3_, i_4_, i_5_)
            }
    
            @JvmStatic
            fun method180(i: Int) {
                aLruByteCache_4636 = null
                if (i != -19960) method180(-71)
            }
    
            @JvmStatic
            fun method181(bool: Boolean, npc: Npc?) {
                if (bool != true) method180(54)
                anInt4627++
                var class348_sub9 = ClientStatics.aNodeDeque_5185!!.method1995(4) as? CharacterRenderState?
                while (class348_sub9 != null) {
                    if ((class348_sub9.aNpc_6691) == npc) {
                        if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                            SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6676!!)
                            class348_sub9.aClass348_Sub16_Sub5_6676 = null
                        }
                        class348_sub9.method2715(27.toByte())
                        break
                    }
                    class348_sub9 = (ClientStatics.aNodeDeque_5185!!.method1990(78.toByte()) as? CharacterRenderState?)
                }
            }
}
