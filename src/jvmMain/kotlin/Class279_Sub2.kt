import java.awt.Component

class Class279_Sub2 internal constructor(class297: Class297, private val anInt6181: Int) : Class279() {
    override fun method2083() {
        anInterface20_6182!!.method77(98.toByte(), anInt6181)
    }

    override fun method2081(): Int {
        return anInterface20_6182!!.method75((-93).toByte(), anInt6181)
    }

    override fun method2091() {
        anInterface20_6182!!.method74(anInt6181, 122.toByte())
    }

    @Throws(Exception::class)
    override fun method2095(component: Component?) {
        anInterface20_6182!!.method78(Class22.anInt339, Class282.aBoolean3652, component, 27929)
    }

    override fun method2094() {
        anInterface20_6182!!.method76(anInt6181, this.anIntArray3603!!)
    }

    init {
        anInterface20_6182 = class297.method2244(21) as Interface20?
    }

    @Throws(Exception::class)
    override fun method2082(i: Int) {
        require(i <= 32768)
        anInterface20_6182!!.method79(i, anInt6181, 112.toByte())
    }

    companion object {
        private var anInterface20_6182: Interface20? = null

        @JvmStatic
        fun method2097() {
            anInterface20_6182 = null
        }
    }
}
