import Class239_Sub17.Companion.method1796
import Class348_Sub17.Companion.method2929
import Class5_Sub3.Companion.method202

/* Class348_Sub42_Sub17 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub17 internal constructor(private val anInt9669: Int) : Class348_Sub42() {
    private var aByteArrayArray9671: Array<ByteArray?>? = null
    var aClass4Array9673: Array<Class4?>? = null
    fun method3267(i: Byte, i_0_: Int): Boolean {
        anInt9676++
        if (i >= -91) return false
        return (this.aClass4Array9673!![i_0_]!!.aBoolean129)
    }

    fun method3268(i: Int): Boolean {
        anInt9675++
        if (this.aClass4Array9673 != null) return true
        if (aByteArrayArray9671 == null) {
            synchronized(Class138.aClass45_1940!!) {
                if (!Class138.aClass45_1940!!.method408((-116).toByte(), anInt9669)) return false
                val `is` = Class138.aClass45_1940!!.method396(anInt9669, 0)
                aByteArrayArray9671 = arrayOfNulls<ByteArray>(`is`!!.size)
                for (i_1_ in `is`.indices) aByteArrayArray9671!![i_1_] = Class138.aClass45_1940!!.method410(-1860, anInt9669, `is`[i_1_])!!
            }
        }
        var bool = true
        for (i_2_ in aByteArrayArray9671!!.indices) {
            val `is` = aByteArrayArray9671!![i_2_]
            val class348_sub49 = Class348_Sub49(`is`)
            class348_sub49.anInt7197 = 1
            val i_3_ = class348_sub49.readUnsignedShort(842397944)
            synchronized(Class135_Sub2.aClass45_4843!!) {
                bool = bool and Class135_Sub2.aClass45_4843!!.method421(false, i_3_)
            }
        }
        if (!bool) return false
        val class262 = Class262()
        val `is`: IntArray?
        synchronized(Class138.aClass45_1940!!) {
            val i_4_ = Class138.aClass45_1940!!.method407(0, anInt9669)
            this.aClass4Array9673 = arrayOfNulls<Class4>(i_4_)
            `is` = Class138.aClass45_1940!!.method396(anInt9669, 0)
            if (i > -115) method3266(null, 123, null)
        }
        for (i_5_ in `is`!!.indices) {
            val is_6_ = aByteArrayArray9671!![i_5_]
            val class348_sub49 = Class348_Sub49(is_6_)
            class348_sub49.anInt7197 = 1
            val i_7_ = class348_sub49.readUnsignedShort(842397944) //
            var class348_sub33: Class348_Sub33? = null
            var class348_sub33_8_ = class262.method1995(4) as Class348_Sub33?
            while (class348_sub33_8_ != null) {
                if (class348_sub33_8_.anInt6958 == i_7_) {
                    class348_sub33 = class348_sub33_8_
                    break
                }
                class348_sub33_8_ = class262.method1990(78.toByte()) as Class348_Sub33?
            }
            if (class348_sub33 == null) {
                synchronized(Class135_Sub2.aClass45_4843!!) {
                    class348_sub33 = Class348_Sub33(i_7_, Class135_Sub2.aClass45_4843!!.method415(73.toByte(), i_7_))
                }
                class262.method1999(class348_sub33!!, -20180)
            }
            this.aClass4Array9673!![`is`[i_5_]] = Class4(is_6_!!, class348_sub33)
        }
        aByteArrayArray9671 = null
        return true
    }

    fun method3271(i: Int, i_9_: Int): Boolean {
        anInt9670++
        if (i_9_ != 14) method3269(false)
        return (this.aClass4Array9673!![i]!!.aBoolean139)
    }

    fun method3272(i: Int, i_10_: Int): Boolean {
        anInt9677++
        if (i_10_ != 0) return true
        return (this.aClass4Array9673!![i]!!.aBoolean131)
    }

    companion object {
        var anInt9670: Int = 0
        var aClass348_Sub42_Sub17Array9672: Array<Class348_Sub42_Sub17?>? = arrayOfNulls<Class348_Sub42_Sub17>(14)
        var anInt9674: Int = 0
        var anInt9675: Int = 0
        var anInt9676: Int = 0
        var anInt9677: Int = 0
        @JvmField
        var anIntArrayArray9678: Array<IntArray?>? = null
        var aClass351_9679: Class351? = Class351(27, 7)
        var anInt9680: Int = 0

        fun method3266(var_ha: ha?, i: Int, class277: Class277?): Int {
            try {
                anInt9674++
                if (class277!!.anInt3569 == -1) {
                    if (class277.anInt3575 != -1) {
                        val class12 = var_ha!!.aD4579!!.method3(class277.anInt3575, -6662)
                        if (!class12!!.aBoolean209) return class12.aShort208.toInt()
                    }
                } else return class277.anInt3569
                if (i <= 123) return -68
                return class277.anInt3563
            } catch (runtimeexception: RuntimeException) {
                throw method2929(runtimeexception, ("gw.F(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + (if (class277 != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method3269(bool: Boolean) {
            aClass348_Sub42_Sub17Array9672 = null
            aClass351_9679 = null
            anIntArrayArray9678 = null
            if (bool != true) Companion.method3270((-116).toByte())
        }

        fun method3270(i: Byte) {
            if (i <= 106) method3266(null, -91, null)
            var class348_sub42_sub12 = (Class348_Sub40_Sub4.aClass262_9111!!.method1995(4) as Class348_Sub42_Sub12?)
            while (class348_sub42_sub12 != null) {
                if (method1796(69, class348_sub42_sub12.anInt9608)) method202(6, class348_sub42_sub12)
                class348_sub42_sub12 = Class348_Sub40_Sub4.aClass262_9111!!.method1990(115.toByte()) as Class348_Sub42_Sub12?
            }
            anInt9680++
        }
    }
}
