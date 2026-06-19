import GameClock.method599

/* Class318_Sub9_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NamedTimedNode internal constructor(@JvmField var aString8783: String?, i: Int) : SceneListNode() {
    @JvmField
    var aShort8786: Short
    @JvmField
    var anInt8787: Int = (method599(-92) / 1000L).toInt()

    init {
        this.aShort8786 = i.toShort()
    }
}
