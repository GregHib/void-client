import PlayerUpdateDecoder.method1142
import java.io.File

object HeapInfoRecordStatics {
    var anInt4933: Int = 0
            var aHashtable_4934: Hashtable? = Hashtable(8)
            @JvmField
            var aCircleRasterizer_4938: CircleRasterizer? = null
            var anInt4939: Int = 0
            var anInt4941: Int = 0
    
            /*synthetic*/
            var aClass4949: Class<*>? = null
    
            fun method1247(file: File, bool: Boolean, bool_0_: Boolean) {
                if (HeapDiagnosticsHolder.anObject2256 == null) method1142(26.toByte())
                anInt4939++
                if (bool_0_ != false) aCircleRasterizer_4938 = null
                try {
    //                val method = (HotSpotDiagnosticMXBean::class.java.getDeclaredMethod("dumpHeap", (if (aClass4949 != null) aClass4949 else (String::class.java.also { aClass4949 = it })), java.lang.Boolean.TYPE))
    //                method.invoke(Class168.anObject2256, file.getAbsolutePath(), bool)
                } catch (exception: Exception) {
                    println("HeapDump error:")
                    exception.printStackTrace()
                }
            }
    
            @JvmStatic
            fun method1248(i: Int): Array<ScreenAnchorAlignment?> {
                anInt4933++
                if (i < 11) aCircleRasterizer_4938 = null
                return (arrayOf<ScreenAnchorAlignment?>(ScrollbarComponentStatics.aScreenAnchorAlignment_8344, SoftwareSpriteRasterStatics.aScreenAnchorAlignment_1620, ProjectileFactoryStatics.aScreenAnchorAlignment_2893))
            }
    
            @JvmStatic
            fun method1249(bool: Boolean) {
                if (bool != true) method1248(-21)
                aHashtable_4934 = null
                aCircleRasterizer_4938 = null
            }
}
