import jaggl.OpenGLStatics.glCallList
import jaggl.OpenGLStatics.glEndList
import jaggl.OpenGLStatics.glGenLists
import jaggl.OpenGLStatics.glNewList

object GlDisplayListFontStatics {
    @JvmField
            var anInt1104: Int = 0
            @JvmField
            var anInt1105: Int = 0
            @JvmField
            var anInt1106: Int = 0
            @JvmField
            var anInt1107: Int = 0
            @JvmField
            var anInt1108: Int = 0
            @JvmStatic
            fun method592(bool: Boolean, i: Byte, bool_0_: Boolean, i_1_: Int, i_2_: Int): Int {
                anInt1105++
                if (i.toInt() != -128) return -20
                val class348_sub13 = GlTexture1DStatics.method1974((-1).toByte(), i_1_, bool_0_)
                if (class348_sub13 == null) return 0
                var i_3_ = 0
                var i_4_ = 0
                while ((class348_sub13.anIntArray6757!!.size > i_4_)) {
                    if (class348_sub13.anIntArray6757!![i_4_] >= 0 && (ClientExceptionStatics.aModelHeaderCache_112!!.anInt3271 > class348_sub13.anIntArray6757!![i_4_])) {
                        val class213 = (ClientExceptionStatics.aModelHeaderCache_112!!.method1940(-127, (class348_sub13.anIntArray6757!![i_4_])))
                        val i_5_ = class213.method1567((ProjectionCameraTransformStatics.aEmoteDefCache_5764!!.method2600(i_2_, 28364).anInt3256), 107, i_2_)
                        if (!bool) i_3_ += i_5_
                        else i_3_ += i_5_ * (class348_sub13.anIntArray6758[i_4_])
                    }
                    i_4_++
                }
                return i_3_
            }
    
            @JvmStatic
            fun method593(i: Int, i_6_: Byte, string: String?): SocketFactory? {
                anInt1104++
                var socketFactory: SocketFactory?
                try {
                    socketFactory = ProxySocketFactory()
                } catch (throwable: Throwable) {
                    socketFactory = DirectSocketFactory()
                }
                if (i_6_.toInt() != -90) return null
                socketFactory.aString3476 = string
                socketFactory.anInt3470 = i
                return socketFactory
            }
}
