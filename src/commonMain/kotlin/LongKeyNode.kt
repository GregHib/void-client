/* Class348_Sub14 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LongKeyNode : LinkedListNode {
    var aLong6762: Long = 0

    constructor()

    internal constructor(l: Long) {
        try {
            this.aLong6762 = l
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "ij.<init>(" + l + ')')
        }
    }
}