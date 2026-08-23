class TimedTileQueueEntry internal constructor(i: Int, i_2_: Int) : HashLinkedListNode() {
    var anInt9650: Int = 0
    var anInt9651: Int = 0

    var anInt9652: Int = 0
    var aString9654: String? = null
    fun method3245(bool: Boolean): Int {
        anInt9646++
        if (bool != true) method3248(-60)
        return (this.aLong4291 ushr 32 and 0xffL).toInt()
    }

    fun method3246(i: Int) {
        this.aLong7057 = this.aLong7057 or 0x7fffffffffffffffL.inv()
        anInt9653++
        if (method3250((-89).toByte()) == 0L) aLinkedNodeListIterator_7325!!.method1005(true, this)
//        if (i != -25490) aAbstractModelRenderer_9659 = null
    }

    fun method3248(i: Int): Int {
        if (i != 1) return -110
        anInt9647++
        return this.aLong4291.toInt()
    }

    fun method3250(i: Byte): Long {
        anInt9649++
        if (i >= -37) method3250(79.toByte())
        return this.aLong7057 and 0x7fffffffffffffffL
    }

    init {
        this.aLong4291 = i.toLong() shl 32 or i_2_.toLong()
    }

    fun method3251(i: Int) {
        anInt9648++
        this.aLong7057 = (0x7fffffffffffffffL.inv() and this.aLong7057 or CommonClock.method599(-120) + 500L)
        aLinkedNodeListIterator_8241!!.method1005(true, this)
//        if (i != -16058) aAbstractModelRenderer_9658 = null
    }

    companion object {
        var anInt9646: Int = 0
        var anInt9647: Int = 0
        var anInt9648: Int = 0
        var anInt9649: Int = 0
        var anInt9653: Int = 0
        var aLinkedNodeListIterator_7325: LinkedNodeListIterator? = LinkedNodeListIterator()
        var aLinkedNodeListIterator_8241: LinkedNodeListIterator? = LinkedNodeListIterator()
    }
}