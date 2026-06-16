object Class348Sub40Sub1Statics {
    fun method3051(i: Int, i_3_: Int): Int {
        if (i_3_ != 4096) return -68
        Class348_Sub40_Sub1.anInt9085++
        var i_4_ = i ushr 1
        i_4_ = i_4_ or (i_4_ ushr 1)
        i_4_ = i_4_ or (i_4_ ushr 2)
        i_4_ = i_4_ or (i_4_ ushr 4)
        i_4_ = i_4_ or (i_4_ ushr 8)
        i_4_ = i_4_ or (i_4_ ushr 16)
        return (i_4_.inv()) and i
    }
}
