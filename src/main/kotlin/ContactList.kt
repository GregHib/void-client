import SceneModelBuilder.Companion.method2496
import Class69.Companion.method721
import kotlin.math.min
import kotlin.math.pow

/* Class348_Sub42_Sub13 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ContactList internal constructor(var aString9617: String?) : HashLinkedListNode() {
    var anInt9615: Int = 0
    var aLinkedNodeListIterator_9621: LinkedNodeListIterator

    fun method3233(class348_sub42_sub12: ContactEntry, i: Int): Boolean {
        anInt9613++
        var bool = true
        class348_sub42_sub12.method3162(true)
        var class348_sub42_sub12_2_ = (this.aLinkedNodeListIterator_9621.method1011(-74) as ContactEntry?)
        while (class348_sub42_sub12_2_ != null) {
            if (method2496(class348_sub42_sub12_2_.anInt9608, class348_sub42_sub12.anInt9608, true)) {
                method721(class348_sub42_sub12_2_, class348_sub42_sub12, -1)
                this.anInt9615++
                return !bool
            }
            class348_sub42_sub12_2_ = this.aLinkedNodeListIterator_9621.method1003(48.toByte()) as ContactEntry?
            bool = false
        }
        this.aLinkedNodeListIterator_9621.method1005(true, class348_sub42_sub12)
        val i_3_ = 80 % ((i - -81) / 33)
        this.anInt9615++
        return bool
    }

    fun method3234(i: Byte, class348_sub42_sub12: ContactEntry): Boolean {
        anInt9614++
        val i_4_ = 41 % ((-30 - i) / 39)
        val i_5_ = method3235(-17937)
        class348_sub42_sub12.method3162(true)
        this.anInt9615--
        if (this.anInt9615 == 0) {
            this.method2715(112.toByte())
            this.method3162(true)
            Class8.anInt166--
            KeyboardLayoutCache.aLruByteCache_3301!!.method582(this, class348_sub42_sub12.aLong9600, (-128).toByte())
            return false
        }
        return i_5_ != method3235(-17937)
    }

    init {
        this.aLinkedNodeListIterator_9621 = LinkedNodeListIterator()
    }

    fun method3235(i: Int): Int {
        if (i != -17937) return 104
        anInt9619++
        if ((this.aLinkedNodeListIterator_9621.aClass348_Sub42_1647) !== this.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063) return (this.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as ContactEntry).anInt9608
        return -1
    }

    companion object {
        var anInt9613: Int = 0
        var anInt9614: Int = 0
        var aBoolean9616: Boolean = false
        var anInt9618: Int = 0
        var anInt9619: Int = 0
        var anInt9620: Int = 0
        fun method3232(d: Double, i: Byte) {
            if (i <= -54) {
                if (d != CubemapTextureImplSource.aDouble8713) {
                    for (i_0_ in 0..255) {
                        val i_1_ = (255.0 * (i_0_.toDouble() / 255.0).pow(d)).toInt()
                        ProjectedGroundDecor.anIntArray10266!![i_0_] = min(i_1_, 255)
                    }
                    CubemapTextureImplSource.aDouble8713 = d
                }
                anInt9618++
            }
        }
    }
}
