object KeyEventNodeStatics {
    var anInt4763: Int = 0
    var aJs5Archive_4770: Js5Archive? = null

    @JvmStatic
    fun method2796(i: Byte) {
        aJs5Archive_4770 = null
//        if (i.toInt() != 104) Companion.method2796((-6).toByte())
    }

    fun method2797(string: String?, i: Byte): Boolean {
        anInt4763++
        if (string == null) return false
        var i_1_ = 0
        while ((i_1_ < HslAdjustTextureNode.anInt9383)) {
            if (string.equals(WaterTextureSet.aStringArray1441!![i_1_], ignoreCase = true)) return true
            i_1_++
        }
        if (string.equals(LocalPlayerState.aPlayer_1907!!.aString10544, ignoreCase = true)) return true
        if (i.toInt() != -63) return false
        return false
    }
}
