import HeapInfoRecordStatics.method1248
import GameClock.method596

object ParticleEmitterDefExtStatics {
    var anInt8574: Int = 0
            var aFloatArray8575: FloatArray? = floatArrayOf(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f)
            var anInt8576: Int = 0
            var anInt8578: Int = 0
    
            fun method2188(i: Int): Int {
                anInt8578++
                if (i != -30477) aFloatArray8575 = null
                return 16
            }
    
            @JvmStatic
            fun method2189(class348_sub49: ByteBuffer, i: Int): ParticleEmitterDef {
                anInt8576++
                val i_3_ = class348_sub49.readUnsignedShort(842397944)
                val class221 = method1248(48)[class348_sub49.readUnsignedByte(255)]
                val class341 = method596(20000)[class348_sub49.readUnsignedByte(255)]
                val i_4_ = class348_sub49.readShort(13638)
                val i_5_ = class348_sub49.readShort(13638)
                return ParticleEmitterDef(i_3_, class221, class341, i_4_, i_5_)
            }
    
            @JvmStatic
            fun method2190(bool: Boolean) {
                if (bool != true) aFloatArray8575 = null
                aFloatArray8575 = null
            }
}
