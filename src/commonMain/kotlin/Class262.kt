/* Class262 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class262 {
    var aClass348_3334: Class348 = Class348()
    private var aClass348_3342: Class348? = null

    fun method1988(class262_0_: Class262?, i: Byte) {
        if (i.toInt() != -115) method1995(-53)
        method1989((this.aClass348_3334.aClass348_4294), false, class262_0_)
        anInt3340++
    }

    private fun method1989(class348: Class348?, bool: Boolean, class262_1_: Class262?) {
        do {
            try {
                anInt3325++
                val class348_2_ = (this.aClass348_3334.aClass348_4295)
                this.aClass348_3334.aClass348_4295 = class348!!.aClass348_4295
                class348.aClass348_4295!!.aClass348_4294 = this.aClass348_3334
                if (this.aClass348_3334 !== class348) {
                    class348.aClass348_4295 = (class262_1_!!.aClass348_3334.aClass348_4295)
                    class348.aClass348_4295!!.aClass348_4294 = class348
                    class262_1_.aClass348_3334.aClass348_4295 = class348_2_
                    class348_2_!!.aClass348_4294 = class262_1_.aClass348_3334
                }
                if (bool == false) break
            } catch (runtimeexception: RuntimeException) {
                throw RuntimeException("uh.K(" + (if (class348 != null) "{...}" else "null") + ',' + bool + ',' + (if (class262_1_ != null) "{...}" else "null") + ')')
            }
            break
        } while (false)
    }

    fun method1990(i: Byte): Class348? {
        anInt3329++
        if (i < 29) aClass348_3342 = null
        val class348 = aClass348_3342
        if (this.aClass348_3334 === class348) {
            aClass348_3342 = null
            return null
        }
        aClass348_3342 = class348!!.aClass348_4294
        return class348
    }

    fun method1993(i: Int): Class348? {
        anInt3336++
        val class348 = this.aClass348_3334.aClass348_4295
        if (this.aClass348_3334 === class348) {
            aClass348_3342 = null
            return null
        }
        aClass348_3342 = class348!!.aClass348_4295
        if (i > -65) method1993(67)
        return class348
    }

    fun method1995(i: Int): Class348? {
        anInt3332++
        val class348 = this.aClass348_3334.aClass348_4294
        if (class348 === this.aClass348_3334) {
            aClass348_3342 = null
            return null
        }
        aClass348_3342 = class348!!.aClass348_4294
        return class348
    }

    fun method1996(i: Int) {
        if (i > 97) {
            anInt3339++
            while (true) {
                val class348 = (this.aClass348_3334.aClass348_4294)
                if (this.aClass348_3334 === class348) break
                class348!!.method2715(24.toByte())
            }
            aClass348_3342 = null
        }
    }

    fun method1997(i: Int): Class348? {
        anInt3341++
        val class348 = this.aClass348_3334.aClass348_4294
        if (this.aClass348_3334 === class348) return null
        class348!!.method2715(114.toByte())
        return class348
    }

    fun method1998(i: Int): Int {
        anInt3333++
        var i_22_ = i
        var class348 = this.aClass348_3334.aClass348_4294
        while (class348 !== this.aClass348_3334) {
            class348 = class348!!.aClass348_4294
            i_22_++
        }
        return i_22_
    }

    fun method1999(class348: Class348, i: Int) {
        if (class348.aClass348_4295 != null) class348.method2715(91.toByte())
        anInt3328++
        class348.aClass348_4294 = this.aClass348_3334
        class348.aClass348_4295 = this.aClass348_3334.aClass348_4295
        class348.aClass348_4295!!.aClass348_4294 = class348
        class348.aClass348_4294!!.aClass348_4295 = class348
    }

    fun method2001(class348: Class348, i: Int) {
        anInt3330++
        if (class348.aClass348_4295 != null) class348.method2715(63.toByte())
        class348.aClass348_4295 = this.aClass348_3334
        class348.aClass348_4294 = this.aClass348_3334.aClass348_4294
        class348.aClass348_4295!!.aClass348_4294 = class348
        class348.aClass348_4294!!.aClass348_4295 = class348
    }

    fun method2002(i: Byte): Boolean {
        anInt3327++
        return this.aClass348_3334 === this.aClass348_3334.aClass348_4294
    }

    fun method2003(i: Int): Class348? {
        anInt3337++
        val class348 = aClass348_3342
        if (class348 === this.aClass348_3334) {
            aClass348_3342 = null
            return null
        }
        val i_24_ = -111 / ((i - -88) / 38)
        aClass348_3342 = class348!!.aClass348_4295
        return class348
    }

    init {
        this.aClass348_3334.aClass348_4295 = this.aClass348_3334
        this.aClass348_3334.aClass348_4294 = this.aClass348_3334
    }

    companion object {
        var anInt3324: Int = 0
        var anInt3325: Int = 0
        var anInt3327: Int = 0
        var anInt3328: Int = 0
        var anInt3329: Int = 0
        var anInt3330: Int = 0
        var anInt3332: Int = 0
        var anInt3333: Int = 0
        var anInt3336: Int = 0
        var anInt3337: Int = 0
        var anInt3338: Int = 0
        var anInt3339: Int = 0
        var anInt3340: Int = 0
        var anInt3341: Int = 0
    }
}
