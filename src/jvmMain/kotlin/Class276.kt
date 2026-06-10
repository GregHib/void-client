import Class348_Sub10.Companion.method2788
import Class348_Sub10.Companion.method2789

/* Class276 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class276 internal constructor() {
    var anIntArray3554: IntArray?
    var anInt3555: Int
    var anIntArray3556: IntArray?
    var anInt3557: Int = 0

    init {
        method2789(16)
        this.anInt3555 = (if (method2788() != 0) method2789(4) + 1 else 1)
        if (method2788() != 0) method2789(8)
        method2789(2)
        if (this.anInt3555 > 1) this.anInt3557 = method2789(4)
        this.anIntArray3556 = IntArray(this.anInt3555)
        this.anIntArray3554 = IntArray(this.anInt3555)
        for (i in 0..<this.anInt3555) {
            method2789(8)
            this.anIntArray3556!![i] = method2789(8)
            this.anIntArray3554!![i] = method2789(8)
        }
    }
}
