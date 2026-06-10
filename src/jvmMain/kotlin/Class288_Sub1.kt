import Class158.Companion.method1248
import Class62.method596

/* Class288_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class288_Sub1 internal constructor(i: Int, class221: Class221?, class341: Class341?, i_0_: Int, i_1_: Int, i_2_: Int) : Class288(i, class221, class341, i_0_, i_1_) {
    var anInt8577: Int = 0

    init {
        try {
            this.anInt8577 = i_2_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wg.<init>(" + i + ',' + (if (class221 != null) "{...}" else "null") + ',' + (if (class341 != null) "{...}" else "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'))
        }
    }

    override fun method51(i: Byte): Class223? {
        anInt8574++
        if (i <= 116) method2190(false)
        return Class28.aClass223_4997
    }

    companion object {
        var anInt8574: Int = 0
        var aFloatArray8575: FloatArray? = floatArrayOf(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f)
        var anInt8576: Int = 0
        var anInt8578: Int = 0

        fun method2188(i: Int): Int {
            anInt8578++
            if (i != -30477) aFloatArray8575 = null
            return 16
        }

        @JvmStatic
        fun method2189(class348_sub49: Class348_Sub49, i: Int): Class288 {
            anInt8576++
            val i_3_ = class348_sub49.readUnsignedShort(842397944)
            val class221 = method1248(48)[class348_sub49.readUnsignedByte(255)]
            val class341 = method596(20000)[class348_sub49.readUnsignedByte(255)]
            val i_4_ = class348_sub49.readShort(13638)
            val i_5_ = class348_sub49.readShort(13638)
            return Class288(i_3_, class221, class341, i_4_, i_5_)
        }

        @JvmStatic
        fun method2190(bool: Boolean) {
            if (bool != true) aFloatArray8575 = null
            aFloatArray8575 = null
        }
    }
}
