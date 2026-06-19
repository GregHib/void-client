/* Class322 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ImageFrameCache internal constructor(i: Int, i_9_: Int, i_10_: Int) {
    private val anInt4020: Int
    private var aNodeDeque_4021: NodeDeque?
    private var anInt4022: Int
    private val anInt4024: Int
    private var anInt4025 = 0
    private var anIntArrayArrayArray4029: Array<Array<IntArray?>?>?
    private var aClass348_Sub24Array4033: Array<ClientGameLoopNode?>?
    var aBoolean4035: Boolean
    fun method2553(i: Int): Array<Array<IntArray?>?>? {
        anInt4018++
        if (anInt4024 != anInt4020) throw RuntimeException("Can only retrieve a full image cache")
        for (i_2_ in i..<anInt4020) aClass348_Sub24Array4033!![i_2_] = aClass348_Sub24_4226
        return anIntArrayArrayArray4029
    }

    fun method2557(i: Int, i_6_: Int): Array<IntArray?>? {
        anInt4034++
        if (anInt4020 != anInt4024) {
            if (anInt4020 == 1) {
                this.aBoolean4035 = i_6_ != anInt4022
                anInt4022 = i_6_
                return anIntArrayArrayArray4029!![0]
            }
            var class348_sub24 = aClass348_Sub24Array4033!![i_6_]
            if (class348_sub24 == null) {
                this.aBoolean4035 = true
                if (anInt4020 <= anInt4025) {
                    val class348_sub24_7_ = aNodeDeque_4021!!.method1993(-126) as ClientGameLoopNode?
                    class348_sub24 = ClientGameLoopNode(i_6_, class348_sub24_7_!!.anInt6875)
                    aClass348_Sub24Array4033!![class348_sub24_7_.anInt6872] = null
                    class348_sub24_7_.method2715(56.toByte())
                } else {
                    class348_sub24 = ClientGameLoopNode(i_6_, anInt4025)
                    anInt4025++
                }
                aClass348_Sub24Array4033!![i_6_] = class348_sub24
            } else this.aBoolean4035 = false
            aNodeDeque_4021!!.method2001(class348_sub24, -110)
            return (anIntArrayArrayArray4029!![class348_sub24.anInt6875])
        }
        this.aBoolean4035 = aClass348_Sub24Array4033!![i_6_] == null
        aClass348_Sub24Array4033!![i_6_] = aClass348_Sub24_4226
        return anIntArrayArrayArray4029!![i_6_]
    }

    fun method2558(i: Int) {
        anInt4019++
        if (i != 6144) anIntArrayArrayArray4029 = null
        var i_8_ = 0
        while (anInt4020 > i_8_) {
            anIntArrayArrayArray4029!![i_8_]!![0] = null
            anIntArrayArrayArray4029!![i_8_]!![1] = null
            anIntArrayArrayArray4029!![i_8_]!![2] = null
            anIntArrayArrayArray4029!![i_8_] = null
            i_8_++
        }
        aClass348_Sub24Array4033 = null
        anIntArrayArrayArray4029 = null
        aNodeDeque_4021!!.method1996(99)
        aNodeDeque_4021 = null
    }

    init {
        anInt4022 = -1
        aNodeDeque_4021 = NodeDeque()
        this.aBoolean4035 = false
        anInt4020 = i
        anInt4024 = i_9_
        aClass348_Sub24Array4033 = arrayOfNulls<ClientGameLoopNode>(anInt4024)
        anIntArrayArrayArray4029 = Array<Array<IntArray?>?>(anInt4020) { Array<IntArray?>(3) { IntArray(i_10_) } }
    }

    companion object {
        var anInt4018: Int = 0
        var anInt4019: Int = 0
        var anInt4034: Int = 0
        var aClass348_Sub24_4226: ClientGameLoopNode? = ClientGameLoopNode(0, 0)
    }
}