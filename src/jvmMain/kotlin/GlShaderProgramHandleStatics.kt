import ParticleEmitterDefStatics.method2187
import ParticleEmitterDefExtStatics.method2189
import LinkedListNodeStatics.method2709

object GlShaderProgramHandleStatics {
    var aFloatArrayArray4174: Array<FloatArray?>? =
                arrayOf<FloatArray?>(floatArrayOf(-0.333333f, -0.333333f, -0.333333f), floatArrayOf(0.333333f, -0.333333f, -0.333333f), floatArrayOf(-0.333333f, 0.333333f, -0.333333f), floatArrayOf(0.333333f, 0.333333f, -0.333333f), floatArrayOf(-0.333333f, -0.333333f, 0.333333f), floatArrayOf(0.333333f, -0.333333f, 0.333333f), floatArrayOf(-0.333333f, 0.333333f, 0.333333f), floatArrayOf(0.333333f, 0.333333f, 0.333333f))
            var anInt4175: Int = 0
            var anInt4176: Int = 0
            @JvmField
            var anObject4177: Any? = null
            @JvmField
            var anInt4179: Int = -1
            var anInt4180: Int = 0
    
            @JvmStatic
            fun method2658(bool: Boolean) {
                aFloatArrayArray4174 = null
                anObject4177 = null
                if (bool != true) aFloatArrayArray4174 = null
            }
    
            fun method2659(i: Byte, i_0_: Int, i_1_: Int): Boolean {
                val i_2_ = 24 % ((i - 76) / 42)
                anInt4176++
                return ((0x70000 and i_0_) != 0) or method2709(i_1_, i_0_, -1) || method2187(i_0_, -84, i_1_)
            }
    
            fun method2660(i: Byte, class348_sub49: ByteBuffer): ParticleEmitterDefExt? {
                anInt4180++
                if (i.toInt() != 26) return null
                val class288 = method2189(class348_sub49, i + 59)
                val i_3_ = class348_sub49.method3369(125.toByte())
                return ParticleEmitterDefExt(class288.anInt4958, class288.aScreenAnchorAlignment_4955, class288.aTileRenderState_4952, class288.anInt4950, class288.anInt4951, i_3_)
            }
}
