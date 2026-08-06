/* Class47_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SystemNanoTimer : NanoTimer() {
    init {
        Clock.nanos()
    }

    public override fun method446(i: Int): Long {
        if (i != 1) return -111L
        return Clock.nanos()
    }
}