import Class179.Companion.method1357
import Class5_Sub2.Companion.method194

/* Class348_Sub37 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub37 : Class348() {
    @JvmField
    var aClass262_6998: Class262 = Class262()

    companion object {
        var anInt6996: Int = 0
        @JvmField
        var aBoolean6997: Boolean = false
        var anInt6999: Int = 0

        fun method3030(i: Int, var_ha_Sub2: ha_Sub2) {
            anInt6999++
            if (Class337.anObject4177 == null) {
                val class59_sub1_sub2 = Class59_Sub1_Sub2()
                val `is` = class59_sub1_sub2.method562(128, 128, 121.toByte(), 16)
                Class337.anObject4177 = method1357(`is`, false, 81.toByte())
            }
            if (Class319.anObject3985 == null) {
                val class59_sub2_sub1 = Class59_Sub2_Sub1()
                val `is` = class59_sub2_sub1.method567(128, 111.toByte(), 16, 128)
                Class319.anObject3985 = method1357(`is`, false, 103.toByte())
            }
            val class188 = var_ha_Sub2.aClass188_7736
            if (class188!!.method1414(35632) && Class369_Sub2.anObject8592 == null) {
                val `is` = method194(128, -1922, 8, 0.6f, 128, 4.0f, 4.0f, 0.5f, 16.0f, Class186_Sub1(419684), 16)
                Class369_Sub2.anObject8592 = method1357(`is`, false, 78.toByte())
            }
        }

        @JvmStatic
        fun method3031(i: Int, class348_sub49: Class348_Sub49): Class348_Sub40? {
            anInt6996++
            class348_sub49.readUnsignedByte(255)
            val i_0_ = class348_sub49.readUnsignedByte(255)
            val class348_sub40 = Class59_Sub1_Sub1.method557(i_0_, (-84).toByte())
            class348_sub40!!.anInt7036 = class348_sub49.readUnsignedByte(255)
            val i_1_ = class348_sub49.readUnsignedByte(255)
            if (i < 123) return null
            var i_2_ = 0
            while (i_1_ > i_2_) {
                val i_3_ = class348_sub49.readUnsignedByte(255)
                class348_sub40.method3049(class348_sub49, i_3_, 31015)
                i_2_++
            }
            class348_sub40.method3044(120)
            return class348_sub40
        }
    }
}
