/* Class348_Sub1_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class HashTileShape internal constructor(i: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, f: Float) : AbstractTileShape(i, i_9_, i_10_, i_11_, i_12_, f) {
    override fun method2725(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int) {
        this.anInt6553 = i_1_
        this.anInt6548 = i_2_
        anInt8812++
        if (i_0_.toInt() == 70) this.anInt6562 = i
    }

    override fun method2716(i: Int, f: Float) {
        this.aFloat6550 = f
        if (i == -1) anInt8814++
    }

    companion object {
        var anInt8812: Int = 0
        var anInt8814: Int = 0
    }
}