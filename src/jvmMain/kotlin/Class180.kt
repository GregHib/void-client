object Class180 {
    var anIntArray2370: IntArray? = IntArray(13)
    var aRectangleArray2371: Array<Rect?>? = arrayOfNulls<Rect>(100)
    var aClass196_2372: Class196?

    fun method1366(i: Byte) {
        aClass196_2372 = null
        anIntArray2370 = null
        aRectangleArray2371 = null
        if (i.toInt() != -43) aRectangleArray2371 = null
    }

    init {
        for (i in 0..99) aRectangleArray2371!![i] = Rect()
        aClass196_2372 = Class196()
    }
}
