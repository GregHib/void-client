class AnimationFrameDefinition internal constructor(@JvmField var anInt6958: Int, `is`: ByteArray?) : LinkedListNode() {
    var aBooleanArray6954: BooleanArray?
    var anIntArray6957: IntArray?
    var anIntArrayArray6959: Array<IntArray?>?
    var anIntArray6960: IntArray?
    var anInt6965: Int

    init {
        val class348_sub49 = ByteBuffer(`is`)
        this.anInt6965 = class348_sub49.readUnsignedByte(255)
        this.anIntArrayArray6959 = arrayOfNulls<IntArray>(this.anInt6965)
        this.anIntArray6957 = IntArray(this.anInt6965)
        this.anIntArray6960 = IntArray(this.anInt6965)
        this.aBooleanArray6954 = BooleanArray(this.anInt6965)
        var i_8_ = 0
        while ((i_8_ < this.anInt6965)) {
            this.anIntArray6957!![i_8_] = class348_sub49.readUnsignedByte(255)
            if (this.anIntArray6957!![i_8_] == 6) this.anIntArray6957!![i_8_] = 2
            i_8_++
        }
        var i_9_ = 0
        while ((i_9_ < this.anInt6965)) {
            this.aBooleanArray6954!![i_9_] = class348_sub49.readUnsignedByte(255) == 1
            i_9_++
        }
        var i_10_ = 0
        while ((i_10_ < this.anInt6965)) {
            this.anIntArray6960!![i_10_] = class348_sub49.readUnsignedShort(842397944)
            i_10_++
        }
        var i_11_ = 0
        while ((this.anInt6965 > i_11_)) {
            this.anIntArrayArray6959!![i_11_] = IntArray(class348_sub49.readUnsignedByte(255))
            i_11_++
        }
        for (i_12_ in 0..<this.anInt6965) {
            var i_13_ = 0
            while ((i_13_ < this.anIntArrayArray6959!![i_12_]!!.size)) {
                this.anIntArrayArray6959!![i_12_]!![i_13_] = class348_sub49.readUnsignedByte(255)
                i_13_++
            }
        }
    }
}