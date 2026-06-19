import SoundBankPatchStatics.method2929
import AbstractBloomEffectStatics.method2755
import InterfaceComponentGroupStatics.method3244
import InterfaceComponentGroupStatics.anInt9623
import InterfaceComponentGroupStatics.anInt9624
import InterfaceComponentGroupStatics.anInt9636
import InterfaceComponentGroupStatics.anInt9638
import InterfaceComponentGroupStatics.anInt9641

/* Class348_Sub42_Sub14 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class InterfaceComponentGroup internal constructor(i: Int, string: String?, string_20_: String?, i_21_: Int, i_22_: Int, bool: Boolean, i_23_: Int, i_24_: Int) : HashLinkedListNode() {
    var aString9625: String? = null
    var anInt9627: Int = 0
    var anInt9628: Int = 0
    var aNodeDeque_9629: NodeDeque? = null
    var anInt9631: Int
    var aString9632: String? = null
    var anInt9634: Int = -1
    var anInt9635: Int = 0
    var aBoolean9639: Boolean = true
    var anInt9640: Int = 0
    var anInt9643: Int = 12800
    var anInt9644: Int = 12800
    fun method3236(`is`: IntArray, i: Int, i_0_: Int, i_1_: Int, i_2_: Byte): Boolean {
        anInt9623++
        var class348_sub18 = this.aNodeDeque_9629!!.method1995(4) as? InterfaceBounds?
        while (class348_sub18 != null) {
            if (class348_sub18.method2935(i_0_, i, i_1_, true)) {
                class348_sub18.method2940(i_0_, true, `is`, i)
                return true
            }
            class348_sub18 = this.aNodeDeque_9629!!.method1990(117.toByte()) as? InterfaceBounds?
        }
        if (i_2_.toInt() != -28) method3244(123, -16, 116)
        return false
    }

    fun method3238(i: Byte, i_3_: Int, i_4_: Int): Boolean {
        val i_5_ = 113 % ((-26 - i) / 46)
        anInt9641++
        var class348_sub18 = this.aNodeDeque_9629!!.method1995(4) as? InterfaceBounds?
        while (class348_sub18 != null) {
            if (class348_sub18.method2934(3589, i_3_, i_4_)) return true
            class348_sub18 = this.aNodeDeque_9629!!.method1990(117.toByte()) as? InterfaceBounds?
        }
        return false
    }

    fun method3239(bool: Boolean, i: Int, i_6_: Int, `is`: IntArray): Boolean {
        anInt9638++
        if (bool != true) method3238(9.toByte(), -26, -68)
        var class348_sub18 = this.aNodeDeque_9629!!.method1995(4) as? InterfaceBounds?
        while (class348_sub18 != null) {
            if (class348_sub18.method2939(i_6_, 2, i)) {
                class348_sub18.method2937(i_6_, i, -3069, `is`)
                return true
            }
            class348_sub18 = this.aNodeDeque_9629!!.method1990(126.toByte()) as? InterfaceBounds?
        }
        return false
    }

    fun method3240(i: Byte) {
        this.anInt9643 = 12800
        this.anInt9644 = 12800
        this.anInt9627 = 0
        anInt9636++
        this.anInt9635 = 0
        if (i.toInt() != 37) method3244(30, -85, -43)
        var class348_sub18 = this.aNodeDeque_9629!!.method1995(i + -33) as? InterfaceBounds?
        while (class348_sub18 != null) {
            if (this.anInt9643 > class348_sub18.anInt6812) this.anInt9643 = class348_sub18.anInt6812
            if (class348_sub18.anInt6813 > this.anInt9627) this.anInt9627 = class348_sub18.anInt6813
            if (this.anInt9635 < class348_sub18.anInt6819) this.anInt9635 = class348_sub18.anInt6819
            if (class348_sub18.anInt6809 < this.anInt9644) this.anInt9644 = class348_sub18.anInt6809
            class348_sub18 = this.aNodeDeque_9629!!.method1990(52.toByte()) as? InterfaceBounds?
        }
    }

    fun method3242(`is`: IntArray, i: Int, i_15_: Int, i_16_: Int): Boolean {
        anInt9624++
        var class348_sub18 = this.aNodeDeque_9629!!.method1995(4) as? InterfaceBounds?
        while (class348_sub18 != null) {
            if (class348_sub18.method2934(3589, i_16_, i_15_)) {
                class348_sub18.method2940(i_15_, true, `is`, i_16_)
                return true
            }
            class348_sub18 = this.aNodeDeque_9629!!.method1990(115.toByte()) as? InterfaceBounds?
        }
        return false
    }

    init {
        this.anInt9631 = -1
        try {
            this.anInt9631 = i_23_
            this.anInt9640 = i_21_
            this.aString9625 = string
            this.aString9632 = string_20_
            this.anInt9634 = i_22_
            this.anInt9628 = i
            this.aBoolean9639 = bool
            if (this.anInt9631 == 255) this.anInt9631 = 0
            this.aNodeDeque_9629 = NodeDeque()
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("dfa.<init>(" + i + ',' + (if (string != null) "{...}" else "null") + ',' + (if (string_20_ != null) "{...}" else "null") + ',' + i_21_ + ',' + i_22_ + ',' + bool + ',' + i_23_ + ',' + i_24_ + ')'))
        }
    }
}
