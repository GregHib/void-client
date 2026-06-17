/* Class318 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class318 {
    var aClass318_3970: Class318? = null
    var aClass318_3976: Class318? = null
    fun method2373(bool: Boolean) {
        anInt3975++
        if (this.aClass318_3976 != null) {
            this.aClass318_3976!!.aClass318_3970 = this.aClass318_3970
            this.aClass318_3970!!.aClass318_3976 = this.aClass318_3976
            this.aClass318_3970 = null
            if (bool == false) this.aClass318_3976 = null
        }
    }

    companion object {
        var anInt3971: Int = 0
        var anInt3972: Int = 0
        var anInt3973: Int = 0
        @JvmField
        var aDoublyLinkedNodeListArray3974s: Array<DoublyLinkedNodeList?>? = arrayOfNulls<DoublyLinkedNodeList>(5)
        var anInt3975: Int = 0
        var aClass304_3977: Class304?

        @JvmStatic
        fun method2374(i: Byte) {
            aClass304_3977 = null
            val i_0_ = 108 / ((i - -83) / 41)
            aDoublyLinkedNodeListArray3974s = null
        }

        @JvmStatic
        fun method2375(i: Int) {
            anInt3972++
            SocketStreamWorker.aClass60_2671!!.method590(0)
            if (i != 16127) anInt3971 = -113
        }

        init {
            var i = 0
            while (aDoublyLinkedNodeListArray3974s!!.size > i) {
                aDoublyLinkedNodeListArray3974s!![i] = DoublyLinkedNodeList()
                i++
            }
            aClass304_3977 = Class304(1)
        }
    }
}
