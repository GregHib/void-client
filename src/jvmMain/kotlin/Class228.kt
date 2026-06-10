import java.io.File
import java.util.*

object Class228 {
    var anInt2971: Int = 0
    var aClass114_2972: Class114? = Class114(49, 4)
    var anInt2973: Int = 0
    @JvmField
    var aClass57Array2974: Array<Class57?>? = null
    @JvmField
    var anInt2975: Int = 0

    @JvmStatic
    fun method1628(i: Byte) {
        aClass57Array2974 = null
        if (i <= 47) aClass57Array2974 = null
        aClass114_2972 = null
    }

    fun method1629(bool: Boolean): Boolean {
        anInt2973++
        val hashtable: Hashtable<Any?, Any?> = Hashtable<Any?, Any?>()
        var enumeration: Enumeration<*> = Player.aHashtable10565!!.keys()
        while (enumeration.hasMoreElements()) {
            val `object`: Any? = enumeration.nextElement()
            hashtable.put(`object`, Player.aHashtable10565!!.get(`object`))
        }
        try {
            val field = ClassLoader::class.java.getDeclaredField("nativeLibraries")
            if (bool != true) return false
            field.setAccessible(true)
            try {
                enumeration = Player.aHashtable10565!!.keys()
                while (enumeration.hasMoreElements()) {
                    val string = enumeration.nextElement() as String?
                    try {
                        val file = Class275.aHashtable3548!!.get(string) as File
                        val var_class_1_ = Player.aHashtable10565!!.get(string) as Class<*>?
                        val vector = (field.get(var_class_1_!!.getClassLoader()) as Vector<*>)
                        for (i in vector.indices) {
                            try {
                                val `object`: Any = vector.elementAt(i)
                                val field_2_ = `object`.javaClass.getDeclaredField("name")
                                field_2_.setAccessible(true)
                                try {
                                    val string_3_ = field_2_.get(`object`) as String?
                                    if (string_3_ != null && (string_3_.equals(file.getCanonicalPath(), ignoreCase = true))) {
                                        val field_4_ = `object`.javaClass.getDeclaredField("handle")
                                        val method_5_ = (`object`.javaClass.getDeclaredMethod("finalize"))
                                        field_4_.setAccessible(true)
                                        method_5_.setAccessible(true)
                                        try {
                                            method_5_.invoke(`object`)
                                            field_4_.set(`object`, 0)
                                            hashtable.remove(string)
                                        } catch (throwable: Throwable) {
                                            if (Loader.trace) {
                                                throwable.printStackTrace()
                                            }
                                            /* empty */
                                        }
                                        method_5_.setAccessible(false)
                                        field_4_.setAccessible(false)
                                    }
                                } catch (throwable: Throwable) {
                                    if (Loader.trace) {
                                        throwable.printStackTrace()
                                    }
                                    /* empty */
                                }
                                field_2_.setAccessible(false)
                            } catch (throwable: Throwable) {
                                if (Loader.trace) {
                                    throwable.printStackTrace()
                                }
                                /* empty */
                            }
                        }
                    } catch (throwable: Throwable) {
                        if (Loader.trace) {
                            throwable.printStackTrace()
                        }
                        /* empty */
                    }
                }
            } catch (throwable: Throwable) {
                if (Loader.trace) {
                    throwable.printStackTrace()
                }
                /* empty */
            }
            field.setAccessible(false)
        } catch (throwable: Throwable) {
            if (Loader.trace) {
                throwable.printStackTrace()
            }
            /* empty */
        }
        Player.aHashtable10565 = hashtable
        return Player.aHashtable10565!!.isEmpty()
    }

    fun method1630(i: Int, i_6_: Int, i_7_: Int) {
        if (Class75.aFloat1249 > Class75.aFloat1247) {
            Class75.aFloat1247 += (Class75.aFloat1247.toDouble() / 30.0).toFloat()
            if (Class75.aFloat1249 < Class75.aFloat1247) Class75.aFloat1247 = Class75.aFloat1249
            Class348_Sub15.method2811(false)
            Class75.anInt1255 = Class75.aFloat1247.toInt() shr 1
            Class75.aByteArrayArrayArray1251 = Class325.method2596(Class75.anInt1255, 12871)
        } else if (Class75.aFloat1247 > Class75.aFloat1249) {
            Class75.aFloat1247 -= (Class75.aFloat1247.toDouble() / 30.0).toFloat()
            if (Class75.aFloat1249 > Class75.aFloat1247) Class75.aFloat1247 = Class75.aFloat1249
            Class348_Sub15.method2811(false)
            Class75.anInt1255 = Class75.aFloat1247.toInt() shr 1
            Class75.aByteArrayArrayArray1251 = Class325.method2596(Class75.anInt1255, i + 12871)
        }
        anInt2971++
        if (i != (Class244.anInt4609.inv()) && Class48.anInt859 != -1) {
            var i_8_ = Class244.anInt4609 - Class348_Sub36.anInt6992
            if (i_8_ < 2 || i_8_ > 2) i_8_ /= 8
            var i_9_ = -Class245.anInt3170 + Class48.anInt859
            Class348_Sub36.anInt6992 = i_8_ + Class348_Sub36.anInt6992
            if (i_9_ < 2 || i_9_ > 2) i_9_ /= 8
            Class245.anInt3170 -= -i_9_
            if (i_8_ == 0 && i_9_ == 0) {
                Class244.anInt4609 = -1
                Class48.anInt859 = -1
            }
            Class348_Sub15.method2811(false)
        }
        if (Class367_Sub9.anInt7379 > 0) {
            Class164.anInt2173--
            if (Class164.anInt2173 == 0) {
                Class367_Sub9.anInt7379--
                Class164.anInt2173 = 100
            }
        } else {
            Class34.anInt481 = -1
            Class348_Sub40_Sub30.anInt9399 = -1
        }
        if (Class246.aBoolean3174 && Class289.aClass262_3705 != null) {
            var class348_sub12 = Class289.aClass262_3705!!.method1995(4) as Class348_Sub12?
            while (class348_sub12 != null) {
                val class42 = (Class75.aClass153_1238!!.method1225(class348_sub12.aClass348_Sub21_6751!!.anInt6847, 125.toByte()))
                if (class348_sub12.method2799(i_6_, i_7_, 95)) {
                    if (class42!!.aStringArray577 != null) {
                        if (class42.aStringArray577[4] != null) Class50_Sub3.method466(false, class42.aString565, 0, (-100).toByte(), false, class42.anInt596, -1, true, 1006, class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), class42.aStringArray577[4], class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), -1)
                        if (class42.aStringArray577[3] != null) Class50_Sub3.method466(false, class42.aString565, 0, (-127).toByte(), false, class42.anInt596, -1, true, 1003, class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), class42.aStringArray577[3], class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), -1)
                        if (class42.aStringArray577[2] != null) Class50_Sub3.method466(false, class42.aString565, 0, (-108).toByte(), false, class42.anInt596, -1, true, 1002, class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), class42.aStringArray577[2], class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), -1)
                        if (class42.aStringArray577[1] != null) Class50_Sub3.method466(false, class42.aString565, 0, (-69).toByte(), false, class42.anInt596, -1, true, 1012, class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), class42.aStringArray577[1], class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), -1)
                        if (class42.aStringArray577[0] != null) Class50_Sub3.method466(false, class42.aString565, 0, (-92).toByte(), false, class42.anInt596, -1, true, 1009, class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), class42.aStringArray577[0], class348_sub12.aClass348_Sub21_6751!!.anInt6847.toLong(), -1)
                    }
                    if (!class348_sub12.aClass348_Sub21_6751!!.aBoolean6848) {
                        class348_sub12.aClass348_Sub21_6751!!.aBoolean6848 = true
                        Class66.method701(Class90.aClass273_1512!!, class348_sub12.aClass348_Sub21_6751!!.anInt6847, class42.anInt596)
                    }
                    if (class348_sub12.aClass348_Sub21_6751!!.aBoolean6848) Class66.method701(Class59_Sub1_Sub2.aClass273_8664!!, class348_sub12.aClass348_Sub21_6751!!.anInt6847, class42.anInt596)
                } else if (class348_sub12.aClass348_Sub21_6751!!.aBoolean6848) {
                    class348_sub12.aClass348_Sub21_6751!!.aBoolean6848 = false
                    Class66.method701(Class77.aClass273_1298!!, class348_sub12.aClass348_Sub21_6751!!.anInt6847, class42!!.anInt596)
                }
                class348_sub12 = (Class289.aClass262_3705!!.method1990(116.toByte()) as Class348_Sub12?)
            }
        }
    }
}
