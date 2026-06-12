import Class348_Sub1_Sub3.Companion.method2732

/* Class40 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class40 internal constructor() {
    var anInt522: Int = 0
    var aBooleanArray523: BooleanArray?
    var anInt524: Int = 0
    var anIntArray525: IntArray = IntArray(6)
    var anInt526: Int = 0
    var aByteArray527: ByteArray? = null
    var aByteArray528: ByteArray?
    var anIntArrayArray529: Array<IntArray?>?
    var anInt530: Int = 0
    var aByteArray531: ByteArray = ByteArray(18002)
    var aBooleanArray532: BooleanArray?
    var anInt533: Int = 0
    var aByteArray534: ByteArray? = null
    var anIntArray535: IntArray?
    var anInt536: Int = 0
    var anInt537: Int = 0
    var anInt538: Int = 0
    var aByte539: Byte = 0
    var anIntArray540: IntArray?
    var anInt541: Int = 0
    var aByteArray544: ByteArray?
    var aByteArray545: ByteArray?
    var anInt546: Int = 0
    var anInt548: Int = 0
    var aByteArrayArray549: Array<ByteArray?>?
    var anInt550: Int = 0
    var anInt552: Int = 0
    var anIntArrayArray553: Array<IntArray?>?
    var anInt554: Int = 0
    var anInt555: Int = 0
    var anIntArrayArray556: Array<IntArray?>?
    var anIntArray557: IntArray?

    init {
        this.anIntArrayArray529 = Array<IntArray?>(6) { IntArray(258) }
        this.anIntArray535 = IntArray(256)
        this.aByteArray544 = ByteArray(18002)
        this.aBooleanArray523 = BooleanArray(256)
        this.aByteArray528 = ByteArray(256)
        this.aByteArrayArray549 = Array<ByteArray?>(6) { ByteArray(258) }
        this.aByteArray545 = ByteArray(4096)
        this.anIntArray540 = IntArray(16)
        this.aBooleanArray532 = BooleanArray(16)
        this.anIntArrayArray553 = Array<IntArray?>(6) { IntArray(258) }
        this.anIntArrayArray556 = Array<IntArray?>(6) { IntArray(258) }
        this.anIntArray557 = IntArray(257)
    }

    companion object {
        var anInt542: Int = 0
        var anIntArray543: IntArray? = null
        var anInt547: Int = 0
        var anInt551: Int = 0
        var anInt558: Int = -1

        @JvmStatic
        fun method368(i: Int, i_0_: Int, bool: Boolean, i_1_: Int, class45: Class45?, i_2_: Int, i_3_: Int) {
            if (i_0_ != 18002) anInt558 = 41
            anInt551++
            if (i_3_ > 0) {
                Class346.aBoolean4275 = bool
                Class348_Sub43.anInt7068 = 1
                Class124.aClass45_1848 = class45
                Class318_Sub1_Sub4_Sub1.anInt10074 = i_1_
                Class285.aClass348_Sub16_Sub3_4743 = null
                Class318Statics.anInt3971 = i_2_
                Class58.anInt1059 = i
                Class239_Sub14.anInt5994 = (Class98.aClass348_Sub16_Sub3_1564!!.method2844(103.toByte()) / i_3_)
                if (Class239_Sub14.anInt5994 < 1) Class239_Sub14.anInt5994 = 1
            } else method2732(i_2_, i_1_, bool, 123, class45, i)
        }

        @JvmStatic
        fun method369(i: Int) {
            Class348_Sub45Statics.aClass105Array7107 = null
            Class239_Sub2.aClass105Array5857 = null
            Class348_Sub12.aClass105Array6742 = null
            Class240.aClass105Array4679 = null
            if (i != -29776) method370(true)
            Class79.aClass105_1365 = null
            Class25.aClass105Array367 = null
            Class239_Sub9.aClass105Array5933 = null
            Class200.aClass105Array2640 = null
            Class348_Sub40_Sub37.aClass105Array9467 = null
            Class262Statics.aClass324_3326 = null
            Class239_Sub24.aClass105_6097 = null
            Applet_Sub1.aClass324_20 = null
            Class240.aClass324_4684 = null
            Class169.aClass105Array2260 = null
            Class113.aClass105Array1744 = null
            Class264.aClass105Array3378 = null
            Class59_Sub1.aClass105Array5294 = null
            Class318_Sub1_Sub1_Sub1.aClass105Array9959 = null
            anInt542++
        }

        @JvmStatic
        fun method370(bool: Boolean) {
            if (bool != true) anIntArray543 = null
            anIntArray543 = null
        }

        @JvmStatic
        fun method371(i: Int, i_4_: Int, i_5_: Int): Boolean {
            if (i_4_ != 256) return true
            anInt547++
            return (i and 0x180) != 0
        }
    }
}
