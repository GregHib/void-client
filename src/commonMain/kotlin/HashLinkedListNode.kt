/* Class348_Sub42 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class HashLinkedListNode : LinkedListNode() {
    var aLong7057: Long = 0
    var aClass348_Sub42_7060: HashLinkedListNode? = null
    var aClass348_Sub42_7063: HashLinkedListNode? = null
    fun method3162(bool: Boolean) {
        anInt7064++
        if (this.aClass348_Sub42_7060 != null) {
            this.aClass348_Sub42_7060!!.aClass348_Sub42_7063 = this.aClass348_Sub42_7063
            this.aClass348_Sub42_7063!!.aClass348_Sub42_7060 = this.aClass348_Sub42_7060
            this.aClass348_Sub42_7060 = null
            this.aClass348_Sub42_7063 = null
        }
    }

    fun method3164(i: Byte): Boolean {
        anInt7061++
        if (this.aClass348_Sub42_7060 == null) return false
        if (i.toInt() != 1) method3162(false)
        return true
    }

    companion object {
        var anInt7061: Int = 0
        var anInt7064: Int = 0
    }
}