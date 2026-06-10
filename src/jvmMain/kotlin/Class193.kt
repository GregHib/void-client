import java.awt.Component

class Class193 internal constructor(private val aClass377_2585: Class377, i: Int, var anInt2584: Int) {
    @Throws(Throwable::class)
    protected fun finalize() {
        anInt2588++
        aClass377_2585.method3971(16386, this.anInt2584)
//        super.finalize()
    }

    companion object {
        var anInt2583: Int = 0
        var anInt2586: Int = 0
        @JvmField
        var aClass351_2587: Class351? = Class351(38, 7)
        var anInt2588: Int = 0
        @JvmField
        var aClass202_2589: Class202? = null
        @JvmField
        var anInt2590: Int = 0

        fun method1439(i: Int, class297: Class297?, component: Component?, i_0_: Int, i_1_: Int): Class279 {
            var i = i
            try {
                anInt2583++
                check(Class22.anInt339 != 0)
                require(!(i_0_ < 0 || i_0_ >= 2))
                if (i < 256) i = 256
                try {
                    val class279: Class279 = Class279_Sub1()
                    class279.anInt3620 = i
                    class279.anIntArray3603 = IntArray((if (Class282.aBoolean3652) 2 else 1) * 256)
                    class279.method2095(component)
                    class279.anInt3613 = (i and 0x3ff.inv()) + 1024
                    if (class279.anInt3613 > 16384) class279.anInt3613 = 16384
                    class279.method2082(class279.anInt3613)
                    if (Class253.anInt3248 > 0 && Class183.aClass250_2462 == null) {
                        Class183.aClass250_2462 = Class250()
                        Class183.aClass250_2462!!.aClass297_3228 = class297
                        class297!!.method2236(Class183.aClass250_2462, -10240, Class253.anInt3248)
                    }
                    if (Class183.aClass250_2462 != null) {
                        require((Class183.aClass250_2462!!.aClass279Array3218[i_0_]) == null)
                        Class183.aClass250_2462!!.aClass279Array3218[i_0_] = class279
                    }
                    if (i_1_ != 7) method1440(107)
                    return class279
                } catch (throwable: Throwable) {
                    try {
                        val class279_sub2 = Class279_Sub2(class297!!, i_0_)
                        class279_sub2.anInt3620 = i
                        class279_sub2.anIntArray3603 = IntArray((if (!Class282.aBoolean3652) 1 else 2) * 256)
                        class279_sub2.method2095(component)
                        class279_sub2.anInt3613 = 16384
                        class279_sub2.method2082(class279_sub2.anInt3613)
                        if (Class253.anInt3248 > 0 && Class183.aClass250_2462 == null) {
                            Class183.aClass250_2462 = Class250()
                            Class183.aClass250_2462!!.aClass297_3228 = class297
                            class297!!.method2236(Class183.aClass250_2462, -10240, Class253.anInt3248)
                        }
                        if (Class183.aClass250_2462 != null) {
                            require((Class183.aClass250_2462!!.aClass279Array3218[i_0_]) == null)
                            Class183.aClass250_2462!!.aClass279Array3218[i_0_] = class279_sub2
                        }
                        return class279_sub2
                    } catch (throwable_2_: Throwable) {
                        return Class279()
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qr.A(" + i + ',' + (if (class297 != null) "{...}" else "null") + ',' + (if (component != null) "{...}" else "null") + ',' + i_0_ + ',' + i_1_ + ')'))
            }
        }

        @JvmStatic
        fun method1440(i: Int) {
            aClass202_2589 = null
            val i_4_ = -79 / ((i - -45) / 46)
            aClass351_2587 = null
        }
    }
}
