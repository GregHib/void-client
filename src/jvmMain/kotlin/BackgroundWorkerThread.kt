import LinkedListIteratorStatics.method1242
import kotlin.concurrent.Volatile
import BackgroundWorkerThreadStatics.anInt3224

/* Class250 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BackgroundWorkerThread : Runnable {
    @JvmField
    @Volatile
    var aSoundChannelMixerArray3218s: Array<SoundChannelMixer?> = arrayOfNulls<SoundChannelMixer>(2)

    @JvmField
    @Volatile
    var aBoolean3221: Boolean = false

    @JvmField
    @Volatile
    var aBoolean3223: Boolean = false
    var aPrivilegedOperationWorker_3228: PrivilegedOperationWorker? = null

    override fun run() {
        this.aBoolean3223 = true
        anInt3224++
        try {
            while (!this.aBoolean3221) {
                for (i in 0..1) {
                    val class279 = this.aSoundChannelMixerArray3218s[i]
                    if (class279 != null) class279.method2084(-6858)
                }
                TexGenMaterialPassStatics.method2161((-107).toByte(), 10L)
                WorldMapPolygonIconLabelStatics.method3578((-42).toByte(), null, (this.aPrivilegedOperationWorker_3228))
            }
        } catch (exception: Exception) {
            method1242(null, exception, 15004)
        } finally {
            this.aBoolean3223 = false
        }
    }
}
