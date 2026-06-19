/* Class191 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteSheetCache internal constructor(i: Int, i_16_: Int, i_17_: Int) {
    private var anInt2557 = 0
    private val anInt2559: Int
    private var aNodeDeque_2561: NodeDeque?
    private var anInt2562 = -1
    private var aClass348_Sub6Array2563: Array<HslColorTableNode?>?
    private var anIntArrayArray2564: Array<IntArray?>?
    private var anInt2565: Int
    var aBoolean2570: Boolean
    fun method1427(i: Byte): Array<IntArray?>? {
        anInt2558++
        if (anInt2559 != anInt2565) throw RuntimeException("Can only retrieve a full image cache")
        var i_0_ = 0
        while (anInt2559 > i_0_) {
            aClass348_Sub6Array2563!![i_0_] = aClass348_Sub6_5206
            i_0_++
        }
        if (i.toInt() != 16) method1427((-42).toByte())
        return anIntArrayArray2564
    }

    fun method1432(i: Byte) {
        for (i_13_ in 0..<anInt2559) anIntArrayArray2564!![i_13_] = null
        anInt2556++
        aClass348_Sub6Array2563 = null
        anIntArrayArray2564 = null
        aNodeDeque_2561!!.method1996(112)
        if (i.toInt() != 124) anInt2565 = -126
        aNodeDeque_2561 = null
    }

    fun method1433(i: Int, i_14_: Int): IntArray? {
        if (i != 0) method1427(108.toByte())
        anInt2566++
        if (anInt2559 == anInt2565) {
            this.aBoolean2570 = aClass348_Sub6Array2563!![i_14_] == null
            aClass348_Sub6Array2563!![i_14_] = aClass348_Sub6_5206
            return anIntArrayArray2564!![i_14_]
        }
        if (anInt2559 != 1) {
            var class348_sub6 = aClass348_Sub6Array2563!![i_14_]
            if (class348_sub6 == null) {
                this.aBoolean2570 = true
                if (anInt2557 < anInt2559) {
                    class348_sub6 = HslColorTableNode(i_14_, anInt2557)
                    anInt2557++
                } else {
                    val class348_sub6_15_ = aNodeDeque_2561!!.method1993(i + -123) as HslColorTableNode?
                    class348_sub6 = HslColorTableNode(i_14_, class348_sub6_15_!!.anInt6636)
                    aClass348_Sub6Array2563!![class348_sub6_15_.anInt6630] = null
                    class348_sub6_15_.method2715(80.toByte())
                }
                aClass348_Sub6Array2563!![i_14_] = class348_sub6
            } else this.aBoolean2570 = false
            aNodeDeque_2561!!.method2001(class348_sub6, -90)
            return (anIntArrayArray2564!![class348_sub6.anInt6636])
        }
        this.aBoolean2570 = i_14_ != anInt2562
        anInt2562 = i_14_
        return anIntArrayArray2564!![0]
    }

    init {
        aNodeDeque_2561 = NodeDeque()
        this.aBoolean2570 = false
        anInt2559 = i
        anInt2565 = i_16_
        aClass348_Sub6Array2563 = arrayOfNulls<HslColorTableNode>(anInt2565)
        anIntArrayArray2564 = Array<IntArray?>(anInt2559) { IntArray(i_17_) }
    }

    companion object {
        var anInt2556: Int = 0
        var anInt2558: Int = 0
        var anInt2566: Int = 0
        var aClass348_Sub6_5206: HslColorTableNode? = HslColorTableNode(0, 0)
    }
}