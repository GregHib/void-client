/* Class225 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class225 {
    var anInt2901: Int = 0
    var anInt2904: Int = 0
    var anInt2905: Int
    @JvmField
    var anIntArray2906: IntArray = intArrayOf()
    var anIntArray2907: IntArray? = null
    var anInt2908: Int = -1
    var anInt2909: Int
    @JvmField
    var anIntArrayArray2910: Array<IntArray?>? = null
    var anInt2911: Int
    @JvmField
    var anInt2912: Int = 0
    @JvmField
    var aBoolean2913: Boolean = true
    @JvmField
    var anInt2914: Int
    var anIntArray2915: IntArray? = null
    var anInt2916: Int
    var anInt2917: Int = 0
    var anInt2918: Int
    @JvmField
    var anInt2919: Int
    @JvmField
    var anInt2920: Int
    var anInt2922: Int
    var anInt2923: Int
    @JvmField
    var anInt2924: Int
    private var aClass101Array2925: Array<Class101?>? = null
    @JvmField
    var anInt2926: Int = 0
    var anInt2927: Int
    var anInt2928: Int
    var anIntArray2929: IntArray? = null
    private var anInt2930 = 0
    @JvmField
    var anInt2932: Int = 0
    var anInt2934: Int
    var anInt2935: Int = 0
    var anInt2936: Int = 0
    var anInt2937: Int
    var anInt2938: Int
    @JvmField
    var anIntArrayArray2939: Array<IntArray?>? = null
    @JvmField
    var anInt2940: Int
    @JvmField
    var anInt2941: Int = 0
    private val anInt2942: Int
    @JvmField
    var anInt2943: Int = 0
    var anInt2945: Int
    @JvmField
    var anInt2947: Int
    var anInt2948: Int = 0
    @JvmField
    var anInt2949: Int
    @JvmField
    var anInt2950: Int = 0
    var anInt2951: Int
    var anInt2953: Int
    var anInt2954: Int
    @JvmField
    var anInt2958: Int

    fun method1618(var_ha: ha, i: Int): Array<Class101?>? {
        anInt2952++
        if (aClass101Array2925 != null && var_ha.anInt4567 == anInt2942) return aClass101Array2925
        if (this.anIntArrayArray2939 == null) return null
        aClass101Array2925 = arrayOfNulls<Class101>(this.anIntArrayArray2939!!.size)
        var i_0_ = i
        while ((this.anIntArrayArray2939!!.size > i_0_)) {
            var i_1_ = 0
            var i_2_ = 0
            var i_3_ = 0
            var i_4_ = 0
            var i_5_ = 0
            var i_6_ = 0
            if (this.anIntArrayArray2939!![i_0_] != null) {
                i_2_ = this.anIntArrayArray2939!![i_0_]!![1]
                i_3_ = this.anIntArrayArray2939!![i_0_]!![2]
                i_4_ = (this.anIntArrayArray2939!![i_0_]!![3] shl 3)
                i_1_ = this.anIntArrayArray2939!![i_0_]!![0]
                i_5_ = (this.anIntArrayArray2939!![i_0_]!![4] shl 3)
                i_6_ = (this.anIntArrayArray2939!![i_0_]!![5] shl 3)
            }
            if (i_1_ != 0 || i_2_ != 0 || i_3_ != 0 || i_4_ != 0 || i_5_ != 0 || i_6_ != 0) {
                aClass101Array2925!![i_0_] = var_ha.method3654()
                val class101 = aClass101Array2925!![i_0_]!!
                if (i_6_ != 0) class101.method908(i_6_)
                if (i_4_ != 0) class101.method900(i_4_)
                if (i_5_ != 0) class101.method896(i_5_)
                class101.method891(i_1_, i_2_, i_3_)
            }
            i_0_++
        }
        return aClass101Array2925
    }

    fun method1620(class348_sub49: Class348_Sub49, i: Int) {
        while (true) {
            val i_8_ = class348_sub49.readUnsignedByte(255)
            if (i_8_ == 0) break
            method1622(class348_sub49, 48, i_8_)
        }
        if (i >= -27) method1621(109.toByte())
        anInt2933++
    }

    fun method1621(i: Byte): Int {
        anInt2921++
        if (this.anInt2918 != -1) return this.anInt2918
        if (this.anIntArray2915 != null) {
            var i_9_ = (anInt2930.toDouble() * Math.random()).toInt()
            var i_10_: Int
            i_10_ = 0
            while (i_9_ >= this.anIntArray2929!![i_10_]) {
                i_9_ -= this.anIntArray2929!![i_10_]
                i_10_++
            }
            return this.anIntArray2915!![i_10_]
        }
        val i_11_ = -62 % ((-71 - i) / 52)
        return -1
    }

    private fun method1622(class348_sub49: Class348_Sub49, i: Int, i_12_: Int) {
        anInt2903++
        if (i_12_ == 1) {
            this.anInt2918 = class348_sub49.readUnsignedShort(i xor 0x3235f8c8)
            this.anInt2951 = class348_sub49.readUnsignedShort(842397944)
            if (this.anInt2951 == 65535) this.anInt2951 = -1
            if (this.anInt2918 == 65535) this.anInt2918 = -1
        } else if (i_12_ != 2) {
            if (i_12_ == 3) this.anInt2924 = class348_sub49.readUnsignedShort(i + 842397896)
            else if (i_12_ == 4) this.anInt2958 = class348_sub49.readUnsignedShort(842397944)
            else if (i_12_ == 5) this.anInt2947 = class348_sub49.readUnsignedShort(842397944)
            else if (i_12_ != 6) {
                if (i_12_ == 7) this.anInt2920 = class348_sub49.readUnsignedShort(842397944)
                else if (i_12_ != 8) {
                    if (i_12_ != 9) {
                        if (i_12_ == 26) {
                            this.anInt2932 = (class348_sub49.readUnsignedByte(i xor 0xcf) * 4).toShort().toInt()
                            this.anInt2941 = (class348_sub49.readUnsignedByte(255) * 4).toShort().toInt()
                        } else if (i_12_ == 27) {
                            if (this.anIntArrayArray2939 == null) this.anIntArrayArray2939 = arrayOfNulls<IntArray>(12)
                            val i_13_ = class348_sub49.readUnsignedByte(255)
                            this.anIntArrayArray2939!![i_13_] = IntArray(6)
                            for (i_14_ in 0..5) this.anIntArrayArray2939!![i_13_]!![i_14_] = class348_sub49.readShort(13638)
                        } else if (i_12_ == 28) {
                            this.anIntArray2906 = IntArray(12)
                            for (i_21_ in 0..11) {
                                this.anIntArray2906[i_21_] = class348_sub49.readUnsignedByte(255)
                                if ((this.anIntArray2906[i_21_]) == 255) this.anIntArray2906[i_21_] = -1
                            }
                        } else if (i_12_ != 29) {
                            if (i_12_ == 30) this.anInt2917 = class348_sub49.readUnsignedShort(842397944)
                            else if (i_12_ != 31) {
                                if (i_12_ == 32) this.anInt2935 = class348_sub49.readUnsignedShort(842397944)
                                else if (i_12_ == 33) this.anInt2950 = class348_sub49.readShort(13638)
                                else if (i_12_ != 34) {
                                    if (i_12_ != 35) {
                                        if (i_12_ != 36) {
                                            if (i_12_ == 37) this.anInt2945 = (class348_sub49.readUnsignedByte(255))
                                            else if (i_12_ != 38) {
                                                if (i_12_ != 39) {
                                                    if (i_12_ == 40) this.anInt2938 = (class348_sub49.readUnsignedShort(842397944))
                                                    else if (i_12_ == 41) this.anInt2937 = (class348_sub49.readUnsignedShort(i + 842397896))
                                                    else if (i_12_ != 42) {
                                                        if (i_12_ == 43) this.anInt2909 = (class348_sub49.readUnsignedShort(842397944))
                                                        else if (i_12_ != 44) {
                                                            if (i_12_ != 45) {
                                                                if (i_12_ != 46) {
                                                                    if (i_12_ == 47) this.anInt2927 = class348_sub49.readUnsignedShort(842397944)
                                                                    else if (i_12_ != 48) {
                                                                        if (i_12_ == 49) this.anInt2911 = class348_sub49.readUnsignedShort(842397944)
                                                                        else if (i_12_ == 50) this.anInt2934 = class348_sub49.readUnsignedShort(842397944)
                                                                        else if (i_12_ != 51) {
                                                                            if (i_12_ == 52) {
                                                                                val i_15_ = class348_sub49.readUnsignedByte(i xor 0xcf)
                                                                                this.anIntArray2915 = IntArray(i_15_)
                                                                                this.anIntArray2929 = IntArray(i_15_)
                                                                                for (i_16_ in 0..<i_15_) {
                                                                                    this.anIntArray2915!![i_16_] = class348_sub49.readUnsignedShort(842397944)
                                                                                    val i_17_ = class348_sub49.readUnsignedByte(255)
                                                                                    this.anIntArray2929!![i_16_] = i_17_
                                                                                    anInt2930 += i_17_
                                                                                }
                                                                            } else if (i_12_ == 53) this.aBoolean2913 = false
                                                                            else if (i_12_ == 54) {
                                                                                this.anInt2912 = class348_sub49.readUnsignedByte(255) shl 6
                                                                                this.anInt2943 = class348_sub49.readUnsignedByte(i + 207) shl 6
                                                                            } else if (i_12_ == 55) {
                                                                                if (this.anIntArray2907 == null) this.anIntArray2907 = IntArray(12)
                                                                                val i_18_ = class348_sub49.readUnsignedByte(i xor 0xcf)
                                                                                this.anIntArray2907!![i_18_] = class348_sub49.readUnsignedShort(i + 842397896)
                                                                            } else if (i_12_ == 56) {
                                                                                if (this.anIntArrayArray2910 == null) this.anIntArrayArray2910 = arrayOfNulls<IntArray>(12)
                                                                                val i_19_ = class348_sub49.readUnsignedByte(255)
                                                                                this.anIntArrayArray2910!![i_19_] = IntArray(3)
                                                                                for (i_20_ in 0..2) this.anIntArrayArray2910!![i_19_]!![i_20_] = class348_sub49.readShort(i + 13590)
                                                                            }
                                                                        } else this.anInt2953 = class348_sub49.readUnsignedShort(842397944)
                                                                    } else this.anInt2905 = class348_sub49.readUnsignedShort(842397944)
                                                                } else this.anInt2908 = class348_sub49.readUnsignedShort(842397944)
                                                            } else this.anInt2928 = class348_sub49.readUnsignedShort(842397944)
                                                        } else this.anInt2923 = (class348_sub49.readUnsignedShort(842397944))
                                                    } else this.anInt2954 = (class348_sub49.readUnsignedShort(842397944))
                                                } else this.anInt2922 = (class348_sub49.readUnsignedShort(842397944))
                                            } else this.anInt2916 = (class348_sub49.readUnsignedShort(842397944))
                                        } else this.anInt2926 = (class348_sub49.readShort(i xor 0x3576))
                                    } else this.anInt2904 = (class348_sub49.readUnsignedShort(i + 842397896))
                                } else this.anInt2936 = class348_sub49.readUnsignedByte(255)
                            } else this.anInt2901 = class348_sub49.readUnsignedByte(255)
                        } else this.anInt2948 = class348_sub49.readUnsignedByte(255)
                    } else this.anInt2949 = class348_sub49.readUnsignedShort(842397944)
                } else this.anInt2914 = class348_sub49.readUnsignedShort(842397944)
            } else this.anInt2919 = class348_sub49.readUnsignedShort(842397944)
        } else this.anInt2940 = class348_sub49.readUnsignedShort(i + 842397896)
        if (i != 48) this.anInt2928 = -71
    }

    fun method1623(i: Int, i_22_: Int): Boolean {
        anInt2902++
        if (i == -1) return false
        if (this.anInt2918 == i) return true
        if (this.anIntArray2915 != null) {
            var i_23_ = 0
            while (this.anIntArray2915!!.size > i_23_) {
                if (this.anIntArray2915!![i_23_] == i) return true
                i_23_++
            }
        }
        return false
    }

    init {
        this.anInt2911 = -1
        this.anInt2923 = -1
        this.anInt2918 = -1
        this.anInt2909 = -1
        this.anInt2920 = -1
        this.anInt2916 = -1
        this.anInt2922 = -1
        this.anInt2914 = -1
        this.anInt2919 = -1
        this.anInt2927 = -1
        this.anInt2937 = -1
        this.anInt2928 = -1
        this.anInt2938 = -1
        this.anInt2945 = -1
        this.anInt2905 = -1
        this.anInt2940 = -1
        this.anInt2934 = -1
        anInt2942 = -1
        this.anInt2951 = -1
        this.anInt2949 = -1
        this.anInt2947 = -1
        this.anInt2924 = -1
        this.anInt2954 = -1
        this.anInt2953 = -1
        this.anInt2958 = -1
    }

    companion object {
        var anInt2902: Int = 0
        var anInt2903: Int = 0
        var anInt2921: Int = 0
        var aClass225_2931: Class225? = Class225()
        var anInt2933: Int = 0
        var aClass173_2944: Class173?
        @JvmField
        var anInt2946: Int = 0
        var anInt2952: Int = 0
        @JvmField
        var anInt2955: Int
        @JvmField
        var anInt2956: Int = 0
        @JvmField
        var aClass243_2957: Class243?
        @JvmStatic
        fun method1619(i: Byte) {
            aClass225_2931 = null
            aClass173_2944 = null
            val i_7_ = 86 / ((i - 41) / 40)
            aClass243_2957 = null
        }

        init {
            aClass173_2944 = Class173()
            anInt2955 = 0
            aClass243_2957 = Class243()
        }
    }
}
