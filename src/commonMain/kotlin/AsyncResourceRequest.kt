import kotlin.concurrent.Volatile

/* Class348_Sub42_Sub16 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class AsyncResourceRequest : HashLinkedListNode() {

    var aBoolean9663: Boolean = false

    @Volatile
    var aBoolean9664: Boolean = true
    var aBoolean9667: Boolean = false
    abstract fun method3257(i: Int): Int

    abstract fun method3259(i: Int): ByteArray?
}