import ModelHeaderCacheStatics.method1935
import VorbisOggDecoderStatics.method2967
import ChatMessageStreamStatics.method136
import jaggl.OpenGLStatics.glAttachObjectARB
import jaggl.OpenGLStatics.glCreateProgramObjectARB
import jaggl.OpenGLStatics.glDeleteObjectARB
import jaggl.OpenGLStatics.glDetachObjectARB
import jaggl.OpenGLStatics.glGetInfoLogARB
import jaggl.OpenGLStatics.glGetObjectParameterivARB
import jaggl.OpenGLStatics.glLinkProgramARB

object SequencedWallEntityStatics {
    var aIntRange_10149: IntRange? = IntRange(23, 6)
            var anInt10151: Int = 0
            var anInt10152: Int = 0
            var anInt10154: Int = 0
            var anInt10156: Int = 0
            var anInt10157: Int = 0
            var anInt10158: Int = 0
            var anInt10159: Int = 0
            var anInt10160: Int = 0
            var anInt10161: Int = 0
            var anInt10162: Int = 0
            @JvmField
            var anInt10163: Int = 0
            @JvmField
            var anInt10164: Int = 0
            var anInt10165: Int = 0
            var anInt10166: Int = 0
            var anInt10167: Int = 0
            var aIntRange_10168: IntRange?
            var anInt10169: Int = 0
            var anInt10170: Int = 0
            var anInt10171: Int = 0
            @JvmField
            var anIntArray10172: IntArray? = IntArray(3)
    
            @JvmStatic
            fun method2492(i: Int) {
                if (i != 1) anInt10163 = -36
                aIntRange_10149 = null
                aIntRange_10168 = null
                anIntArray10172 = null
            }
    
            fun method2493(var_ha_Sub2: OpenGlRenderer?, i: Int, managedGlResources: Array<ManagedGlResource?>?): GlShaderProgramHandle? {
                try {
                    anInt10167++
                    for (i_16_ in managedGlResources!!.indices) {
                        if (managedGlResources[i_16_] == null || managedGlResources[i_16_]!!.aLong3156 <= 0L) return null
                    }
                    val l = glCreateProgramObjectARB()
                    var i_17_ = 0
                    while (managedGlResources.size > i_17_) {
                        glAttachObjectARB(l, (managedGlResources[i_17_]!!.aLong3156))
                        i_17_++
                    }
                    glLinkProgramARB(l)
                    glGetObjectParameterivARB(l, 35714, LocTypeDefLoaderStatics.anIntArray2509, 0)
                    if ((LocTypeDefLoaderStatics.anIntArray2509!![0].inv()) == i) {
                        if (LocTypeDefLoaderStatics.anIntArray2509!![0] == 0) println("Shader linking failed:")
                        glGetObjectParameterivARB(l, 35716, LocTypeDefLoaderStatics.anIntArray2509, 1)
                        if (LocTypeDefLoaderStatics.anIntArray2509!![1] > 1) {
                            val `is` = ByteArray(LocTypeDefLoaderStatics.anIntArray2509!![1])
                            glGetInfoLogARB(l, LocTypeDefLoaderStatics.anIntArray2509!![1], LocTypeDefLoaderStatics.anIntArray2509, 0, `is`, 0)
                            println(String(`is`))
                        }
                        if (LocTypeDefLoaderStatics.anIntArray2509!![0] == 0) {
                            var i_18_ = 0
                            while (managedGlResources.size > i_18_) {
                                glDetachObjectARB(l, (managedGlResources[i_18_]!!.aLong3156))
                                i_18_++
                            }
                            glDeleteObjectARB(l)
                            return null
                        }
                    }
                    return GlShaderProgramHandle(var_ha_Sub2, l, managedGlResources)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("pw.D(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (managedGlResources != null) "{...}" else "null") + ')'))
                }
            }
    
            init {
                aIntRange_10168 = IntRange(2, 6)
            }
}
