import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage1Dub
import jaggl.OpenGLStatics.glTexParameteri

object GlTexture1DStatics {
    @JvmField
            var aInputTracker_8552: InputTracker? = null
            @JvmField
            var aRectangleRegion_8553: RectangleRegion?
            @JvmField
            var anInt8554: Int = 0
            @JvmField
            var anInt8555: Int = 0
            @JvmField
            var anIntArray8557: IntArray? = IntArray(500)
            @JvmField
            var aBoolean8558: Boolean = false
            @JvmField
            var anInt8559: Int = 0
            @JvmField
            var aFloat8560: Float = 0f
    
            @JvmStatic
            fun method1973(i: Int) {
                aRectangleRegion_8553 = null
                aInputTracker_8552 = null
                if (i == 24885) anIntArray8557 = null
            }
    
            @JvmStatic
            fun method1974(i: Byte, i_3_: Int, bool: Boolean): ModelKeyBuilder? {
                anInt8559++
                val i_4_ = -43 / ((-65 - i) / 55)
                val l = (i_3_ or (if (bool) -2147483648 else 0)).toLong()
                return (AbstractProceduralTextureNodeStatics.aHashtable_7041!!.method3480(l, -6008) as ModelKeyBuilder?)
            }
    
            init {
                aRectangleRegion_8553 = RectangleRegion(9, 0, 4, 1)
            }
}
