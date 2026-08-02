import TwoStateOptionState.Companion.method1843

/* Class367_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NullRenderPass internal constructor(var_ha_Sub3: NativeRenderer) : AbstractRenderPass(var_ha_Sub3) {
    override fun method3520(i: Byte) {
        anInt7278++
        if (i.toInt() == 87) {
            /* empty */
        }
    }

    override fun method3526(i: Int, i_9_: Int, i_10_: Int) {
        anInt7284++
        if (i != 10756) method3525(-42, false)
    }

    override fun method3525(i: Int, bool: Boolean) {
        anInt7285++
        if (i == 15192) {
            /* empty */
        }
    }

    override fun method3527(i: Int, renderable: Renderable?, i_12_: Int) {
        this.aHa_Sub3_4479.method3850(81.toByte(), renderable)
        anInt7280++
        this.aHa_Sub3_4479.method3923(true, i)
        if (i_12_ == -16776) {
            /* empty */
        }
    }

    override fun method3530(i: Int): Boolean {
        anInt7283++
        if (i >= -57) method3530(-90)
        return false
    }

    override fun method3521(bool: Boolean, i: Byte) {
        anInt7277++
        if (i.toInt() != -103) method3527(-12, null, 67)
    }

    companion object {

        var anInt7277: Int = 0

        var anInt7278: Int = 0

        var anInt7279: Int = 0

        var anInt7280: Int = 0

        var anInt7282: Int = 0

        var anInt7283: Int = 0

        var anInt7284: Int = 0

        var anInt7285: Int = 0


        @JvmStatic
        fun method3534(bool: Boolean, i: Int, i_5_: Int, bool_6_: Boolean, i_7_: Int, widgetComponents: Array<WidgetComponent?>) {
            anInt7279++
            if (bool == false) {
                for (i_8_ in widgetComponents.indices) {
                    val class46 = widgetComponents[i_8_]
                    if (class46 != null && i == class46.anInt834) {
                        method1843(i_5_, -326, class46, bool_6_, i_7_)
                        Gl2dTexture.method239(115.toByte(), i_5_, i_7_, class46)
                        if ((-class46.anInt709 + class46.anInt698) < class46.anInt747) class46.anInt747 = (class46.anInt698 - class46.anInt709)
                        if (class46.anInt747 < 0) class46.anInt747 = 0
                        if ((class46.anInt791 - class46.anInt789) < class46.anInt755) class46.anInt755 = (class46.anInt791 - class46.anInt789)
                        if (class46.anInt755 < 0) class46.anInt755 = 0
                        if (class46.anInt774 == 0) ConfigFlagUtilStatics.method1913(bool_6_, -116, class46)
                    }
                }
            }
        }

        @JvmStatic
        fun method3535(i: Int, i_11_: Int) {
            RefCountedHandle.anInt2275 = i
            anInt7282++
            CharCountUtil.aLruByteCache_225!!.method590(i_11_)
        }
    }
}
