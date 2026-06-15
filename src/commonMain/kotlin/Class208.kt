class Class208 internal constructor(private var anOutputStream2712: CommonOutputStream, i: Int) {
    private var anIOException2704: IOException? = null
    private var anInt2705 = 0
    private val aByteArray2706: ByteArray
    private val aThread2708: WorkerHandle
    private var anInt2713 = 0
    private val anInt2715: Int

    fun run() {
        anInt2710++
        while (true) {
            var i = 0
            withLock(this) {
                while (true) {
                    if (anIOException2704 != null) return
                    if (anInt2705 > anInt2713) i = -anInt2705 + anInt2715 - -anInt2713
                    else i = anInt2713 - anInt2705
                    if (i > 0) break
                    monitorWait(this)
                }
            }
            try {
                if (anInt2715 >= anInt2705 - -i) anOutputStream2712.write(aByteArray2706, anInt2705, i)
                else {
                    val i_0_ = -anInt2705 + anInt2715
                    anOutputStream2712.write(aByteArray2706, anInt2705, i_0_)
                    anOutputStream2712.write(aByteArray2706, 0, -i_0_ + i)
                }
            } catch (ioexception: IOException) {
                withLock(this) {
                    anIOException2704 = ioexception
                }
                break
            }
            withLock(this) {
                anInt2705 = (anInt2705 + i) % anInt2715
            }
        }
    }

    fun method1526(i: Byte) {
        withLock(this) {
            if (anIOException2704 == null) anIOException2704 = IOException("")
            monitorNotifyAll(this)
        }
        anInt2714++
        if (i.toInt() != -99) anIOException2704 = null
        aThread2708.join()
    }

    fun method1527(i: Int) {
        if (i != -21179) method1525(113.toByte())
        anInt2711++
        anOutputStream2712 = CommonOutputStreams.createNoop()
    }

    @Throws(IOException::class)
    fun method1528(i: Byte, i_1_: Int, i_2_: Int, `is`: ByteArray) {
        anInt2709++
        if (i_1_ < 0 || i_2_ < 0 || i_1_ + i_2_ > `is`.size) throw IOException()
        withLock(this) {
            if (anIOException2704 != null) throw IOException(anIOException2704.toString())
            val i_3_: Int
            if (anInt2705 <= anInt2713) i_3_ = anInt2705 + anInt2715 - (anInt2713 - -1)
            else i_3_ = -1 + (-anInt2713 + anInt2705)
            if (i_3_ < i_1_) throw IOException("")
            if (i < 4) method1527(65)
            if (i_1_ + anInt2713 > anInt2715) {
                val i_4_ = anInt2715 - anInt2713
                Class214.method1577(`is`, i_2_, aByteArray2706, anInt2713, i_4_)
                Class214.method1577(`is`, i_2_ - -i_4_, aByteArray2706, 0, -i_4_ + i_1_)
            } else Class214.method1577(`is`, i_2_, aByteArray2706, anInt2713, i_1_)
            anInt2713 = (i_1_ + anInt2713) % anInt2715
            monitorNotifyAll(this)
        }
    }

    init {
        anInt2715 = 1 + i
        aByteArray2706 = ByteArray(anInt2715)
        aThread2708 = Workers.start({ run() }, daemon = true)
    }

    companion object {
        var aClass262_2707: Class262? = Class262()
        var anInt2709: Int = 0
        var anInt2710: Int = 0
        var anInt2711: Int = 0
        var anInt2714: Int = 0
        fun method1525(i: Byte) {
            if (i.toInt() != 4) aClass262_2707 = null
            aClass262_2707 = null
        }
    }
}
