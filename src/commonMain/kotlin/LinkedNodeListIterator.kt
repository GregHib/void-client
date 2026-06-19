/* Class107 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LinkedNodeListIterator {

    var aClass348_Sub42_1647: HashLinkedListNode = HashLinkedListNode()
    private var aClass348_Sub42_1652: HashLinkedListNode? = null
    fun method1002(i: Int): Int {
        anInt1643++
        var i_0_ = i
        var class348_sub42 = (aClass348_Sub42_1647.aClass348_Sub42_7063)
        while (this.aClass348_Sub42_1647 !== class348_sub42) {
            i_0_++
            class348_sub42 = class348_sub42!!.aClass348_Sub42_7063
        }
        return i_0_
    }

    fun method1003(i: Byte): HashLinkedListNode? {
        anInt1644++
        if (i <= 41) return null
        val class348_sub42 = aClass348_Sub42_1652
        if (class348_sub42 === this.aClass348_Sub42_1647) {
            aClass348_Sub42_1652 = null
            return null
        }
        aClass348_Sub42_1652 = class348_sub42!!.aClass348_Sub42_7063
        return class348_sub42
    }

    fun method1005(bool: Boolean, class348_sub42: HashLinkedListNode) {
        if (class348_sub42.aClass348_Sub42_7060 != null) class348_sub42.method3162(bool)
        anInt1654++
        class348_sub42.aClass348_Sub42_7063 = this.aClass348_Sub42_1647
        class348_sub42.aClass348_Sub42_7060 = (aClass348_Sub42_1647.aClass348_Sub42_7060)
        if (bool == true) {
            class348_sub42.aClass348_Sub42_7060!!.aClass348_Sub42_7063 = class348_sub42
            class348_sub42.aClass348_Sub42_7063!!.aClass348_Sub42_7060 = class348_sub42
        }
    }

    fun method1008(i: Int): HashLinkedListNode? {
        if (i != 20) aClass348_Sub42_1652 = null
        anInt1653++
        val class348_sub42 = (aClass348_Sub42_1647.aClass348_Sub42_7063)
        if (class348_sub42 === this.aClass348_Sub42_1647) return null
        class348_sub42!!.method3162(true)
        return class348_sub42
    }

    fun method1009(i: Int) {
        anInt1646++
        if (i == 2110355138) {
            while (true) {
                val class348_sub42 = (aClass348_Sub42_1647.aClass348_Sub42_7063)
                if (this.aClass348_Sub42_1647 === class348_sub42) break
                class348_sub42!!.method3162(true)
            }
            aClass348_Sub42_1652 = null
        }
    }

    fun method1011(i: Int): HashLinkedListNode? {
        anInt1649++
        val class348_sub42 = (aClass348_Sub42_1647.aClass348_Sub42_7063)
        if (class348_sub42 === this.aClass348_Sub42_1647) {
            aClass348_Sub42_1652 = null
            return null
        }
        aClass348_Sub42_1652 = class348_sub42!!.aClass348_Sub42_7063
        return class348_sub42
    }

    init {
        aClass348_Sub42_1647.aClass348_Sub42_7060 = this.aClass348_Sub42_1647
        aClass348_Sub42_1647.aClass348_Sub42_7063 = this.aClass348_Sub42_1647
    }

    companion object {

        var anInt1643: Int = 0

        var anInt1644: Int = 0

        var anInt1646: Int = 0

        var anInt1649: Int = 0

        var anInt1653: Int = 0

        var anInt1654: Int = 0

    }
}