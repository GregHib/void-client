import IOException_Sub1Statics.method129

object PcmStreamBufferStatics {
    @JvmField
            var anInt8860: Int = 0
            var anIntArray8862: IntArray?
            @JvmField
            var anInt8863: Int = 0
            @JvmField
            var anInt8864: Int = 0
            @JvmField
            var anInt8865: Int = 0
            @JvmField
            var aLong8866: Long
            @JvmField
            var anInt8867: Int = 0
            @JvmField
            var anInt8868: Int = 0
            @JvmField
            var aDouble8869: Double = 0.0
            @JvmField
            var aBoolean8870: Boolean = true
            @JvmField
            var anInt8871: Int = 0
            @JvmField
            var anInt8872: Int = 0
            @JvmField
            var anInt8873: Int = 0
            @JvmField
            var aBoolean8874: Boolean
            @JvmField
            var anInt8875: Int = 0
            @JvmField
            var anInt8876: Int = 0
            @JvmField
            var anInt8877: Int = 0
            @JvmField
            var anInt8878: Int = 0
            @JvmField
            var anInt8880: Int = 0
            @JvmField
            var anInt8881: Int = 0
            @JvmField
            var anInt8882: Int = 0
            @JvmStatic
            fun method2830(i: Int) {
                anIntArray8862 = null
            }
    
            @JvmStatic
            fun method2832(`is`: IntArray?, ls: LongArray?, i: Int) {
                try {
                    method129(i, i + -107, ls, ls!!.size - 1, `is`)
                    anInt8882++
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("iha.I(" + (if (`is` != null) "{...}" else "null") + ',' + (if (ls != null) "{...}" else "null") + ',' + i + ')'))
                }
            }
    
            @JvmStatic
            fun method2834(i: Byte, class348_sub49: ByteBuffer): WorldMapLabel {
                anInt8876++
                val class221 = HeapInfoRecordStatics.method1248(15)[class348_sub49.readUnsignedByte(255)]
                if (i > -113) aDouble8869 = -1.5911312034627048
                val class341 = GameClock.method596(20000)[class348_sub49.readUnsignedByte(255)]
                val i_7_ = class348_sub49.readShort(13638)
                val i_8_ = class348_sub49.readShort(13638)
                val i_9_ = class348_sub49.readUnsignedShort(842397944)
                val i_10_ = class348_sub49.readUnsignedShort(842397944)
                val i_11_ = class348_sub49.readShort(13638)
                val i_12_ = class348_sub49.readInt((-126).toByte())
                val i_13_ = class348_sub49.readInt((-126).toByte())
                return WorldMapLabel(class221, class341, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_)
            }
    
            init {
                anIntArray8862 = IntArray(4096)
                aBoolean8874 = false
                aLong8866 = 0L
            }
}
