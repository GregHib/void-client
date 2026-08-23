/* Class47_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MillisNanoTimer : NanoTimer() {
    public override fun method446(i: Int): Long {
        if (i != 1) method446(76)
        return 1000000L * CommonClock.method599(i xor 0x71.inv())
    }
}
