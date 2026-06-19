import NpcSummaryDefinitionStatics.method1166
import EmoteDefinitionStatics.method1928
import TypedRecordTableStatics.method2178

object SoundBankPatchStatics {
    @JvmField
            var aBoolean6788: Boolean = false
            var anInt6789: Int = 0
            var anInt6790: Int = 0
            var aLong6791: Long = 0L
            var anInt6794: Int = 0
            var anInt6801: Int = 0
            @JvmField
            var aTextureAtlasStateArray6802s: Array<TextureAtlasState?>? = arrayOfNulls<TextureAtlasState>(2048)
            var anInt6803: Int = 0
    
            fun method2928(bool: Boolean) {
                if (bool == true) {
                    GlTextureCubeMapStatics.aParticleEmitterNodeArray8531s = arrayOfNulls<ParticleEmitterNode>(50)
                    anInt6790++
                    HintArrowOrMessageStatics.anInt2021 = 0
                }
            }
    
            @JvmStatic
            fun method2929(throwable: Throwable, string: String?): TextureLoadException {
                anInt6789++
                if (LoaderStatics.trace) {
                    throwable.printStackTrace()
                }
                val runtimeexception_sub1: TextureLoadException
                if (throwable is TextureLoadException) {
                    runtimeexception_sub1 = throwable
                    runtimeexception_sub1.aString4594 += ' '.toString() + string
                } else runtimeexception_sub1 = TextureLoadException(throwable, string)
                return runtimeexception_sub1
            }
    
            @JvmStatic
            fun method2930(i: Byte) {
                aTextureAtlasStateArray6802s = null
                val i_0_ = -14 / ((i - 61) / 43)
            }
    
            fun method2931(i: Int, i_1_: Byte, `is`: IntArray?, npc: Npc?) {
                do {
                    try {
                        anInt6801++
                        if ((npc!!.anIntArray10236) != null) {
                            var bool = true
                            for (i_2_ in npc.anIntArray10236!!.indices) {
                                if ((npc.anIntArray10236!![i_2_]) != `is`!![i_2_]) {
                                    bool = false
                                    break
                                }
                            }
                            if (bool && npc.anInt10286 != -1) {
                                val class17 = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(npc.anInt10286, 7))
                                val i_3_ = class17.anInt248
                                if (i_3_ == 1) {
                                    npc.anInt10232 = 0
                                    npc.anInt10218 = i
                                    npc.anInt10294 = 0
                                    npc.anInt10267 = 0
                                    npc.anInt10244 = 1
                                    if (!npc.aBoolean10309) method2178(npc, npc.anInt10267, class17, -72)
                                }
                                if (i_3_ == 2) npc.anInt10294 = 0
                            }
                        }
                        var bool = true
                        var i_4_ = 0
                        while (`is`!!.size > i_4_) {
                            if (`is`[i_4_] != -1) bool = false
                            if (npc.anIntArray10236 == null || (npc.anIntArray10236!![i_4_]) == -1 || (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(`is`[i_4_], 7).anInt239 >= ParticleEmitterNodeStatics.aWidgetCache_191!!.method835((npc.anIntArray10236!![i_4_]), 7).anInt239)) {
                                npc.anInt10218 = i
                                npc.anInt10322 = npc.anInt10319
                                npc.anIntArray10236 = `is`
                            }
                            i_4_++
                        }
                        if (i_1_ <= 31) method2931(-66, 125.toByte(), null, null)
                        if (!bool) break
                        npc.anIntArray10236 = `is`
                        npc.anInt10218 = i
                        npc.anInt10322 = (npc.anInt10319)
                    } catch (runtimeexception: RuntimeException) {
                        throw method2929(runtimeexception, ("jf.E(" + i + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (npc != null) "{...}" else "null") + ')'))
                    }
                    break
                } while (false)
            }
}
