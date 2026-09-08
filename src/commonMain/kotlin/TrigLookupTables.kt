import kotlin.jvm.JvmStatic
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/* Class70 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TrigLookupTables {
    override fun toString(): String {
        anInt1203++
        throw IllegalStateException()
    }

    companion object {

        var anInt1203: Int = 0

        var anInt1205: Int = 0

        var anInt1206: Int = 0

        @JvmStatic
        fun method725(i: Int) {
            SpotAnimVector.anIntArray1207 = null
            SpotAnimVector.anIntArray1204 = null
        }

        @JvmStatic
        fun method726(i: Int) {
            anInt1206++
            if (TimedTileQueueEntry.aConnectionStateType_9660 != null) {
                val thread = ResourceLoaderThread()
                ActorEntity.aResourceLoaderThread_897 = thread
                ActorEntity.aResourceLoaderThread_897!!.method2316(TimedTileQueueEntry.aConnectionStateType_9660, TimedTileQueueEntry.aConnectionStateType_9660!!.aLocalizedText_1012!!.method2063(ChatCommandProcessor.language, 544), TimedTileQueueEntry.aConnectionStateType_9660!!.anInt1025, DataHolder.aLong3660, false)
                TerrainShadowBuilderGl2.job = GlobalScope.launch(Dispatchers.Default) { thread.run() }
            }
        }

        fun method727(i: Byte, i_0_: Int, i_1_: Int, i_2_: Int) {
            anInt1205++
            val class348_sub42_sub15 = NamedTimedNode.method2516(i_2_, 105.toByte(), 9)
            class348_sub42_sub15.method3246(i + -25427)
            class348_sub42_sub15.anInt9652 = i_1_
            class348_sub42_sub15.anInt9651 = i_0_
        }

    }
}
