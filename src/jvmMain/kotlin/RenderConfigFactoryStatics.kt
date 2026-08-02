object RenderConfigFactoryStatics {
    var anInt2976: Int = 0
    var anInt2977: Int = 0

    var aJs5Archive_2978: Js5Archive? = null

    var aLocDefinitionCache_2979: LocDefinitionCache? = null
    var anInt2980: Int = 0

    var aVarbitDefLoader_2981: VarbitDefLoader? = null

    fun method1631(bool: Boolean): BufferPositionTracker {
        anInt2980++
        if (bool != false) aVarbitDefLoader_2981 = null
        try {
            return NanoTimerJagex()
        } catch (throwable: Throwable) {
            try {
                return NanoTimerSystem()
            } catch (throwable_0_: Throwable) {
                return NanoTimerHighPrecision()
            }
        }
    }

    @JvmStatic
    fun method1632(i: Int) {
        aJs5Archive_2978 = null
        val i_1_ = -20 / ((-87 - i) / 34)
        aVarbitDefLoader_2981 = null
        aLocDefinitionCache_2979 = null
    }

    fun method1633(bool: Boolean, i: Int, i_2_: Int): Boolean {
        if (bool != false) method1633(false, 85, -80)
        anInt2977++
        return (0x400 and i) != 0
    }
}
