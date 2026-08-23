object CommonClock {

    var aLong5663: Long = 0

    var aLong8728: Long = 0

    var anInt1113: Int = 0

    fun method599(i: Int): Long {
        if (i > -52) return -121L
        anInt1113++
        val l = Clock.millis()
        if (aLong5663 > l) aLong8728 += aLong5663 - l
        aLong5663 = l
        return l + aLong8728
    }
}