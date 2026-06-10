import Class324.Companion.method2570

class Class127_Sub1 internal constructor(class45: Class45?, class288_sub1: Class288_Sub1?) : Class127(class45, class288_sub1) {
    private var anInt8383 = 0
    override fun method9(i: Byte, bool: Boolean) {
        anInt8379++
        val i_0_ = ((this.aClass288_4659!!.aClass221_4955!!.method1607(Class92.anInt1524, this.aClass105_4655!!.method966(), (-117).toByte())) - -this.aClass288_4659!!.anInt4950)
        val i_1_ = ((this.aClass288_4659!!.aClass341_4952!!.method2679(ha_Sub2.anInt7666, this.aClass105_4655!!.method980(), 1595)) + this.aClass288_4659!!.anInt4951)
        this.aClass105_4655!!.method981((this.aClass105_4655!!.method966() / 2 + i_0_).toFloat(), (this.aClass105_4655!!.method980() / 2 + i_1_).toFloat(), 4096, anInt8383)
        anInt8383 += (this.aClass288_4659 as Class288_Sub1).anInt8577
        if (i.toInt() != -49) method9((-26).toByte(), true)
    }

    companion object {
        @JvmField
        var aClass271_8378: Class271? = null
        @JvmField
        var anInt8379: Int = 0
        @JvmField
        var anInt8380: Int = 0
        @JvmField
        var anInt8381: Int = 0
        @JvmField
        var anInt8382: Int = 0
        var aClass114_8384: Class114? = Class114(18, 0)
        var aClass114_8385: Class114?
        @JvmField
        var aBoolean8386: Boolean = false
        @JvmField
        var anInt8387: Int = 0
        @JvmField
        var anInt8388: Int

        /*synthetic*/
        var aClass8389: Class<*>? = null

        @JvmStatic
        fun method1118(bool: Boolean, bool_2_: Boolean, class348_sub41: Class348_Sub41, i: Int) {
            anInt8382++
            val i_3_ = class348_sub41.anInt7050
            val i_4_ = class348_sub41.aLong4291.toInt()
            if (i == 2533) {
                class348_sub41.method2715(35.toByte())
                if (bool) Class14.method235(i_3_, (-116).toByte())
                Class166.method1288(i xor 0x9e2.inv(), i_3_)
                val class46 = method2570(1512932720, i_4_)
                if (class46 != null) Class251.method1916(-9343, class46)
                Class348_Sub42_Sub17.method3270(119.toByte())
                if (!bool_2_ && r.anInt9721 != -1) Class239_Sub12.method1775((-8).toByte(), r.anInt9721, 1)
                val class333 = Class333(Class125.Companion.aClass356_4915!!)
                var class348_sub41_5_ = class333.method2644(123.toByte()) as? Class348_Sub41?
                while (class348_sub41_5_ != null) {
                    if (!class348_sub41_5_.method2712(4.toByte())) {
                        class348_sub41_5_ = class333.method2644(123.toByte()) as? Class348_Sub41?
                        if (class348_sub41_5_ == null) break
                    }
                    if (class348_sub41_5_.anInt7053 == 3) {
                        val i_6_ = class348_sub41_5_.aLong4291.toInt()
                        if (i_3_ == i_6_ ushr 16) method1118(true, bool_2_, class348_sub41_5_, 2533)
                    }
                    class348_sub41_5_ = class333.method2646(99.toByte()) as? Class348_Sub41?
                }
            }
        }

        fun method1119(bool: Boolean) {
            anInt8381++
            try {
                try {
                    val runtime = Runtime.getRuntime()
                    val integer = runtime.availableProcessors()
                    Class348_Sub40_Sub29.anInt9372 = integer
                } catch (throwable: Throwable) {
                    /* empty */
                }
            } catch (exception: Exception) {
                /* empty */
            }
        }

        @JvmStatic
        fun method1120(i: Int) {
            aClass114_8384 = null
            aClass271_8378 = null
            aClass114_8385 = null
            if (i != 1) method1119(true)
        }

        init {
            aClass114_8385 = Class114(10, -2)
            anInt8388 = 0
        }
    }
}
