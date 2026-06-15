import Class133.method1142
import java.io.File

class Class158 internal constructor(string: String?, class221: Class221?, class341: Class341?, i: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) : Interface12 {
    var anInt4931: Int = 0
    var anInt4932: Int = 0
    var anInt4935: Int = 0
    var anInt4936: Int = 0
    var anInt4937: Int = 0
    var anInt4940: Int = 0
    var aString4942: String? = null
    var anInt4943: Int = 0
    var anInt4944: Int = 0
    var aClass341_4945: Class341? = null
    var anInt4946: Int = 0
    var anInt4947: Int = 0
    var aClass221_4948: Class221? = null
    override fun method51(i: Byte): Class223? {
        anInt4941++
        if (i <= 116) aClass299_4938 = null
        return Class174.aClass223_2307
    }

    init {
        try {
            this.anInt4946 = i_3_
            this.anInt4932 = i_1_
            this.anInt4943 = i_2_
            this.anInt4944 = i_7_
            this.aString4942 = string
            this.aClass221_4948 = class221
            this.anInt4931 = i_5_
            this.anInt4940 = i_9_
            this.anInt4947 = i
            this.aClass341_4945 = class341
            this.anInt4936 = i_6_
            this.anInt4935 = i_8_
            this.anInt4937 = i_4_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ot.<init>(" + (if (string != null) "{...}" else "null") + ',' + (if (class221 != null) "{...}" else "null") + ',' + (if (class341 != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
        }
    }

    companion object {
        var anInt4933: Int = 0
        var aClass356_4934: Class356? = Class356(8)
        var aClass299_4938: Class299? = null
        var anInt4939: Int = 0
        var anInt4941: Int = 0

        fun method1247(file: File, bool: Boolean, bool_0_: Boolean) {
            if (Class168.anObject2256 == null) method1142(26.toByte())
            anInt4939++
            if (bool_0_ != false) aClass299_4938 = null
            // HotSpotDiagnosticMXBean heap-dump — dead/disabled
        }

        @JvmStatic
        fun method1248(i: Int): Array<Class221?> {
            anInt4933++
            if (i < 11) aClass299_4938 = null
            return (arrayOf<Class221?>(Class5_Sub1.aClass221_8344, Class104.aClass221_1620, Class223Statics.aClass221_2893))
        }

        @JvmStatic
        fun method1249(bool: Boolean) {
            if (bool != true) method1248(-21)
            aClass356_4934 = null
            aClass299_4938 = null
        }
    }
}
