import kotlin.concurrent.Volatile
import kotlinx.coroutines.CompletableDeferred

/* Class144 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LinkedQueueNode {

    // P0: PrivilegedOperationWorker used to notify() this instance's monitor on completion, but
    // nothing ever waited on it - every consumer instead busy-polled anInt1997 with a sleep
    // (a CPU-bound spin, gotcha #3). This is the real completion signal consumers should await.
    val completion = CompletableDeferred<Unit>()

    var anInt1994: Int = 0

    var aLinkedQueueNode_1995: LinkedQueueNode? = null

    var anObject1996: Any? = null


    @Volatile
    var anInt1997: Int = 0


    @Volatile
    var anObject1998: Any? = null

    var anInt1999: Int = 0

    var anInt2000: Int = 0
}
