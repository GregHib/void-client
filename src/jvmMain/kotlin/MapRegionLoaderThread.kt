import TextureQualityOptionStateStatics.method1783
import ConfigFlagUtilStatics.method1916
import MinimapTileEntryStatics.method381
import SolidFillComponentStatics.method196
import ChatCommandProcessor.method705
import java.io.BufferedReader
import java.io.DataInputStream
import java.io.IOException
import java.io.InputStreamReader
import java.net.MalformedURLException
import java.net.URL
import kotlin.concurrent.Volatile
import MapRegionLoaderThreadStatics.anInt4203
import MapRegionLoaderThreadStatics.anInt4208
import MapRegionLoaderThreadStatics.anInt4210

/*
 * Class339
 */
class MapRegionLoaderThread : Runnable {
    private var aLinkedQueueNode_4201: LinkedQueueNode? = null
    private var aLocalizedTextTripleArray4204: Array<LocalizedTextTriple?>? = null

    @Volatile
    private var aBoolean4205 = false
    private var aThread4206: Thread? = null
    override fun run() {
        anInt4203++
        try {
            val bufferedreader = BufferedReader(InputStreamReader((aLinkedQueueNode_4201!!.anObject1998) as DataInputStream?))
            var string = bufferedreader.readLine()
            val class179 = method381(68.toByte())
            while ( /**/string != null) {
                class179.method1364(-1, string)
                string = bufferedreader.readLine()
            }
            val strings = class179.method1361(63)
            if (strings.size % 3 != 0) return
            aLocalizedTextTripleArray4204 = arrayOfNulls<LocalizedTextTriple>(strings.size / 3)
            var i = 0
            while (i < strings.size) {
                aLocalizedTextTripleArray4204!![i / 3] = LocalizedTextTriple(strings[i], strings[i + 1], strings[2 + i])
                i += 3
            }
        } catch (ioexception: IOException) {
            /* empty */
        }
        aBoolean4205 = true
    }

    fun method2667(bool: Boolean, i: Int): LocalizedTextTriple? {
        anInt4210++
        if (bool != false) return null
        if (aLocalizedTextTripleArray4204 == null || i < 0 || i >= aLocalizedTextTripleArray4204!!.size) return null
        return aLocalizedTextTripleArray4204!![i]
    }

    fun method2668(i: Int): Boolean {
        anInt4208++
        if (aBoolean4205) return true
        if (aLinkedQueueNode_4201 == null) {
            try {
                val i_15_ = (if (NpcAnimationResolverStatics.aNamedIdRecord_165 == OggCacheStreamStatics.aNamedIdRecord_5271) 80 else 7000 - -(GlElementArrayBufferStatics.aServerConnectionInfo_4839!!.anInt2143))
                aLinkedQueueNode_4201 = (VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.method2237(URL("http://" + (GlElementArrayBufferStatics.aServerConnectionInfo_4839!!.aString2147) + ":" + i_15_ + "/news.ws?game=" + HardCacheEntryReferenceStatics.aSceneProjector_10434!!.anInt2987), 8362))
            } catch (malformedurlexception: MalformedURLException) {
                return true
            }
        }
        if (aLinkedQueueNode_4201 == null || aLinkedQueueNode_4201!!.anInt1997 == 2) return true
        if (i != -21913) return false
        if (aLinkedQueueNode_4201!!.anInt1997 != 1) return false
        if (aThread4206 == null) {
            aThread4206 = Thread(this)
            aThread4206!!.start()
        }
        return aBoolean4205
    }
}
