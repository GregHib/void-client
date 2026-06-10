import Class286_Sub3.Companion.method2148

/* Class2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class2 {
    @JvmField
    var aR118: r? = null
    @JvmField
    var aClass64_119: Class64? = null

    companion object {
        @JvmField
        var anInt116: Int = 0
        @JvmField
        var aClass141_117: Class141? = null
        @JvmField
        var anInt120: Int = 0
        @JvmField
        var anInt121: Int = 0
        @JvmField
        var anInt122: Int = 0

        @JvmStatic
        fun method170(bool: Boolean): Class110_Sub1? {
            if (bool != true) method174(-106, -36)
            anInt122++
            if (Class348_Sub36.anInt6985 < Class65.aClass110_Sub1Array1146!!.size) return Class65.aClass110_Sub1Array1146!![Class348_Sub36.anInt6985++]
            return null
        }

        @JvmStatic
        fun method171(i: Byte) {
            aClass141_117 = null
            if (i.toInt() != 72) method173(39, null, null)
        }

        fun method172(i: Int, class45: Class45?) {
            if (i != 30284) method170(true)
            anInt116++
            Class59_Sub2_Sub1.aClass45_8670 = class45
        }

        @JvmStatic
        fun method173(i: Int, class46: Class46?, class46_0_: Class46?) {
            try {
                anInt120++
                Class348_Sub38.anInt7009++
                val class348_sub47 = method2148(Class239_Sub9.aClass351_5934, Class348_Sub23_Sub2.aClass77_9029, -104)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(112.toByte(), class46!!.anInt830)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortLittle(class46_0_!!.anInt704, 3.toByte())
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeIntMiddle(class46_0_.anInt830, 44.toByte())
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), class46_0_.anInt812)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, class46.anInt704)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, class46.anInt812)
                if (i > -50) aClass141_117 = null
                Class348_Sub42_Sub14.method3243(-100, class348_sub47)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ak.E(" + i + ',' + (if (class46 != null) "{...}" else "null") + ',' + (if (class46_0_ != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method174(i: Int, i_1_: Int) {
            if (i_1_ != -30742) aClass141_117 = null
            anInt121++
            Class332.aClass60_4139!!.method578(2, i)
        }
    }
}
