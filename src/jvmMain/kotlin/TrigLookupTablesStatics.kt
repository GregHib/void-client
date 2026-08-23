import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

object TrigLookupTablesStatics {

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
        if (TimedTileQueueEntryStatics.aConnectionStateType_9660 != null) {
            val thread = ResourceLoaderThread()
            ActorEntity.aResourceLoaderThread_897 = thread
            ActorEntity.aResourceLoaderThread_897!!.method2316(TimedTileQueueEntryStatics.aConnectionStateType_9660, TimedTileQueueEntryStatics.aConnectionStateType_9660!!.aLocalizedText_1012!!.method2063(ChatCommandProcessor.anInt6967, 544), TimedTileQueueEntryStatics.aConnectionStateType_9660!!.anInt1025, DataHolderStatics.aLong3660, false)
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
