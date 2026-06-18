/* Class50_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MinimapLineDrawer internal constructor(private val anInt5255: Int, private val anInt5259: Int, private var anInt5264: Int, private val anInt5258: Int, i_13_: Int, i_14_: Int) : MinimapShapeDrawer(-1, i_13_, i_14_) {
    public override fun method455(i: Int, i_0_: Int, i_1_: Int) {
        anInt5256++
    }

    public override fun method457(i: Int, i_2_: Int, i_3_: Int) {
        anInt5261++
        val i_4_ = i_2_ * anInt5255 shr 12
        if (i_3_ >= -29) anInt5264 = 119
        val i_5_ = i_2_ * anInt5264 shr 12
        val i_6_ = anInt5259 * i shr 12
        val i_7_ = anInt5258 * i shr 12
        MapRegionLoaderThread.method2665(i_4_, 118.toByte(), this.anInt865, i_6_, i_7_, i_5_)
    }

    public override fun method456(i: Int, i_8_: Int, i_9_: Int) {
        if (i < 87) anInt5264 = 33
        anInt5260++
    }

    companion object {
        @JvmField
        var anInt5256: Int = 0
        @JvmField
        var anInt5257: Int = 0
        @JvmField
        var anInt5260: Int = 0
        @JvmField
        var anInt5261: Int = 0
        @JvmField
        var aNanoTimer_5262: NanoTimer? = null
        @JvmField
        var anInt5263: Int = 0
        @JvmStatic
        fun method471(i: Int) {
            if (i == -30065) aNanoTimer_5262 = null
        }

        @JvmStatic
        fun method472(i: Int, class348_sub49: ByteBuffer): HeapInfoRecord? {
            anInt5263++
            val string = class348_sub49.readString(90.toByte())
            val class221 = HeapInfoRecord.method1248(127)[class348_sub49.readUnsignedByte(i xor 0x6c6e.inv())]
            if (i != -27794) return null
            val class341 = GameClock.method596(i + 47794)[class348_sub49.readUnsignedByte(255)]
            val i_15_ = class348_sub49.readShort(13638)
            val i_16_ = class348_sub49.readShort(13638)
            val i_17_ = class348_sub49.readUnsignedByte(255)
            val i_18_ = class348_sub49.readUnsignedByte(255)
            val i_19_ = class348_sub49.readUnsignedByte(255)
            val i_20_ = class348_sub49.readUnsignedShort(i xor 0x32359469.inv())
            val i_21_ = class348_sub49.readUnsignedShort(842397944)
            val i_22_ = class348_sub49.readInt((-126).toByte())
            val i_23_ = class348_sub49.readInt((-126).toByte())
            val i_24_ = class348_sub49.readInt((-126).toByte())
            return HeapInfoRecord(string, class221, class341, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_)
        }

        @JvmStatic
        fun method473(i: Byte, i_25_: Int, class110_sub1: MapLabelMenuEntry?, i_26_: Int, bool: Boolean, bool_27_: Boolean, class110_sub1_28_: MapLabelMenuEntry?): Int {
            try {
                anInt5257++
                val i_29_ = FlickeringEffectsOptionState.method1749(class110_sub1_28_, class110_sub1, bool, i_25_, (-30).toByte())
                if (i_29_ != 0) {
                    if (!bool) return i_29_
                    return -i_29_
                }
                if (i_26_ == -1) return 0
                if (i >= -42) return -65
                val i_30_ = FlickeringEffectsOptionState.method1749(class110_sub1_28_, class110_sub1, bool_27_, i_26_, (-30).toByte())
                if (bool_27_) return -i_30_
                return i_30_
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatch.method2929(runtimeexception, ("o.B(" + i + ',' + i_25_ + ',' + (if (class110_sub1 != null) "{...}" else "null") + ',' + i_26_ + ',' + bool + ',' + bool_27_ + ',' + (if (class110_sub1_28_ != null) "{...}" else "null") + ')'))
            }
        }
    }
}
