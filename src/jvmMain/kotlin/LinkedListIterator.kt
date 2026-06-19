import GlBloomEffectStatics.method2766
import SceneNodeDequeStatics.method847
import java.io.DataInputStream
import java.net.URL
import LinkedListIteratorStatics.aStringArray2113
import LinkedListIteratorStatics.anInt2114
import LinkedListIteratorStatics.anInt2120

/*
 * Class156
 */
class LinkedListIterator {
    private var aClass348_Sub42_2115: HashLinkedListNode? = null
    private var aLinkedNodeListIterator_2118: LinkedNodeListIterator? = null
    fun method1240(i: Int): HashLinkedListNode? {
        anInt2114++
        if (i <= 7) method1240(79)
        val class348_sub42 = (aLinkedNodeListIterator_2118!!.aClass348_Sub42_1647.aClass348_Sub42_7063)
        if (class348_sub42 === aLinkedNodeListIterator_2118!!.aClass348_Sub42_1647) {
            aClass348_Sub42_2115 = null
            return null
        }
        aClass348_Sub42_2115 = class348_sub42!!.aClass348_Sub42_7063
        return class348_sub42
    }

    constructor()

    fun method1243(i: Byte): HashLinkedListNode? {
        anInt2120++
        if (i < 44) aStringArray2113 = null
        val class348_sub42 = aClass348_Sub42_2115
        if (class348_sub42 === aLinkedNodeListIterator_2118!!.aClass348_Sub42_1647) {
            aClass348_Sub42_2115 = null
            return null
        }
        aClass348_Sub42_2115 = class348_sub42!!.aClass348_Sub42_7063
        return class348_sub42
    }

    internal constructor(linkedNodeListIterator: LinkedNodeListIterator) {
        aLinkedNodeListIterator_2118 = linkedNodeListIterator
    }
}
