class aa_Sub3(i: Int, i_3_: Int, `is`: IntArray?, is_4_: IntArray?) : aa() {
    @JvmField
    var anIntArray5201: IntArray?
    @JvmField
    var anIntArray5202: IntArray?

    init {
        try {
            this.anIntArray5201 = `is`
            this.anIntArray5202 = is_4_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nba.<init>(" + i + ',' + i_3_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_4_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var aClass351_5200: Class351? = Class351(13, 2)
        @JvmField
        var anInt5203: Int = 0
        @JvmField
        var aClass351_5204: Class351? = Class351(15, 8)
        @JvmField
        var anInt5205: Int = 0
        @JvmField
        var aClass348_Sub6_5206: Class348_Sub6? = Class348_Sub6(0, 0)
        @JvmField
        var aClass45_5207: Class45? = null

        /*synthetic*/
        var aClass5208: Class<*>? = null

        @JvmStatic
        fun method166(i: Byte, i_0_: Int, i_1_: Int): Boolean {
            if (i < 5) Companion.method166((-119).toByte(), -93, 73)
            anInt5203++
            return (i_1_ and 0x800) != 0 && (i_0_ and 0x37) != 0
        }

        @JvmStatic
        fun method167(i: Int) {
            if (i != 19612) method167(-70)
            aClass351_5200 = null
            aClass351_5204 = null
            aClass348_Sub6_5206 = null
            aClass45_5207 = null
        }

        fun method168(i: Byte) {
            do {
                if (!Class348_Sub23_Sub1.aClass297_8992!!.aBoolean3794) {
                    try {
                        try {
                            val runtime = Runtime.getRuntime()
                            val var_long = runtime.maxMemory()
                            Class226.anInt2964 = 1 + (var_long / 1048576L).toInt()
                        } catch (throwable: Throwable) {
                            /* empty */
                        }
                        break
                    } catch (exception: Exception) {
                        break
                    }
                }
                Class226.anInt2964 = 96
            } while (false)
            val i_2_ = 15 % (i / 51)
            anInt5205++
        }
    }
}
