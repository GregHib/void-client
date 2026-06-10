/* Class348_Sub42 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class348_Sub42 : Class348() {
    var aLong7057: Long = 0
    var aClass348_Sub42_7060: Class348_Sub42? = null
    var aClass348_Sub42_7063: Class348_Sub42? = null
    fun method3162(bool: Boolean) {
        anInt7064++
        if (bool != true) method3163(50.toByte())
        if (this.aClass348_Sub42_7060 != null) {
            this.aClass348_Sub42_7060!!.aClass348_Sub42_7063 = this.aClass348_Sub42_7063
            this.aClass348_Sub42_7063!!.aClass348_Sub42_7060 = this.aClass348_Sub42_7060
            this.aClass348_Sub42_7060 = null
            this.aClass348_Sub42_7063 = null
        }
    }

    fun method3164(i: Byte): Boolean {
        anInt7061++
        if (this.aClass348_Sub42_7060 == null) return false
        if (i.toInt() != 1) method3162(false)
        return true
    }

    companion object {
        var aClass2_7058: Class2?
        @JvmField
        var anInt7059: Int = 0
        var anInt7061: Int = 0
        var anInt7062: Int = 0
        var anInt7064: Int = 0

        @JvmStatic
        fun method3161(i: Int) {
            if (i != 0) method3161(-27)
            aClass2_7058 = null
        }

        fun method3163(i: Byte) {
            Class328_Sub1.anInt6513 = 0
            anInt7062++
            if (i.toInt() == -114) {
                for (i_0_ in 0..2047) {
                    Class154.aClass348_Sub49Array2105!![i_0_] = null
                    Class259.aByteArray3300!![i_0_] = 1.toByte()
                    Class348_Sub17.aClass359Array6802!![i_0_] = null
                }
            }
        }

        init {
            aClass2_7058 = Class2()
        }
    }
}
