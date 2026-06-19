import MidiSequencePlayerStatics.method2862
import NativeRendererStatics.method3873

object GrowableStringListStatics {
    var anInt2355: Int = 0
            var anInt2356: Int = 0
            var anInt2357: Int = 0
            var anInt2358: Int = 0
            var anInt2359: Int = 0
            var anInt2361: Int = 1
            var anInt2362: Int = 0
            var anInt2363: Int = 0
            var anInt2366: Int = 0
            var anInt2368: Int = 0
            var anInt2369: Int = 0
    
            @JvmStatic
            fun method1357(`is`: ByteArray?, bool: Boolean, i: Byte): Any? {
                if (i < 73) anInt2361 = -51
                anInt2363++
                if (`is` == null) return null
                if (`is`.size > 136 && !WidgetDefinitionStatics.aBoolean247) {
                    try {
                        val byteStore: ByteStore = NioByteStore()
                        byteStore.method2691(62.toByte(), `is`)
                        return byteStore
                    } catch (throwable: Throwable) {
                        WidgetDefinitionStatics.aBoolean247 = true
                    }
                }
                if (bool) return method3873(`is`, 0)
                return `is`
            }
    
            @JvmStatic
            fun method1359(bool: Boolean, i: Int): Int {
                anInt2368++
                if (bool != true) anInt2361 = -32
                return i ushr 10
            }
    
            fun method1360(string: String?, privilegedOperationWorker: PrivilegedOperationWorker?, bool: Boolean, bool_3_: Boolean, i: Int) {
                try {
                    anInt2369++
                    if (bool_3_) {
                        if (PrivilegedOperationWorkerStatics.aString3803.startsWith("win") && privilegedOperationWorker!!.aBoolean3777) {
                            var string_4_: String? = null
                            if (JagGlToolkitFactory.anApplet1530 != null) string_4_ = JagGlToolkitFactory.anApplet1530!!.getParameter("haveie6")
                            if (string_4_ == null || string_4_ != "1") {
                                val class144 = method2862(privilegedOperationWorker, string, -117, 0)
                                WallEntityStatics.aLinkedQueueNode_8766 = class144
                                RenderableGroupStatics.aPrivilegedOperationWorker_5017 = privilegedOperationWorker
                                CacheEntryReferenceStatics.aString9554 = string
                                return
                            }
                        }
                        if (PrivilegedOperationWorkerStatics.aString3803.startsWith("mac")) {
                            var string_5_: String? = null
                            if (JagGlToolkitFactory.anApplet1530 != null) string_5_ = JagGlToolkitFactory.anApplet1530!!.getParameter("havefirefox")
                            if (string_5_ != null && string_5_ == "1" && bool) {
                                method2862(privilegedOperationWorker, string, 42, 1)
                                return
                            }
                        }
                        method2862(privilegedOperationWorker, string, 96, 2)
                    } else method2862(privilegedOperationWorker, string, -96, 3)
                    val i_6_ = -6 / ((i - 20) / 44)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("bo.C(" + (if (string != null) "{...}" else "null") + ',' + (if (privilegedOperationWorker != null) "{...}" else "null") + ',' + bool + ',' + bool_3_ + ',' + i + ')'))
                }
            }
    
            fun method1365(i: Int, i_11_: Byte, class348_sub49: ByteBuffer) {
                if (i_11_ > -113) anInt2361 = -64
                if (BufferedFileReader.aBufferedRandomAccessFile_4538 != null) {
                    try {
                        BufferedFileReader.aBufferedRandomAccessFile_4538!!.method789(0L, 59.toByte())
                        BufferedFileReader.aBufferedRandomAccessFile_4538!!.method783(i, 24, true, (class348_sub49.aByteArray7154))
                    } catch (exception: Exception) {
                        /* empty */
                    }
                }
                anInt2355++
            }
}
