import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glTexGenfv
import jaggl.OpenGLStatics.glTexGeni
import kotlin.math.min

object TexGenMaterialPassStatics {
    @JvmField
            var aRenderConfig6247: RenderConfig? = null
            @JvmField
            var anInt6248: Int = -1
            @JvmField
            var anInt6249: Int = 0
            @JvmField
            var anInt6250: Int = 0
            @JvmField
            var anInt6251: Int = 0
            @JvmField
            var anInt6252: Int = 0
            @JvmField
            var anInt6253: Int = 0
            @JvmField
            var anInt6255: Int = 0
            @JvmField
            var anInt6256: Int = 0
            @JvmField
            var anInt6257: Int = 0
            @JvmField
            var anInt6258: Int = 0
            var anIntArray6260: IntArray? = IntArray(1)
            @JvmField
            var anInt6261: Int = 0
    
            @JvmStatic
            fun method2158(i: Byte) {
                anInt6256++
                var i_0_ = 0
                if (IntHashSetStatics.aClass348_Sub51_3959 != null) i_0_ = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1818(-32350)
                if (i.toInt() == 56) {
                    if (i_0_ == 2) {
                        val i_1_ = (min(SocketFactoryStatics.anInt3473, 800))
                        LocTypeDefinitionStatics.anInt4017 = i_1_
                        ModelResourceBundleStatics.anInt7129 = (SocketFactoryStatics.anInt3473 + -i_1_) / 2
                        val i_2_ = (min(NpcReferenceStatics.anInt6857, 600))
                        HardCacheEntryReferenceStatics.anInt10432 = i_2_
                        TimingCounters.anInt4167 = 0
                    } else if (i_0_ == 1) {
                        val i_3_ = min(SocketFactoryStatics.anInt3473, 1024)
                        ModelResourceBundleStatics.anInt7129 = (SocketFactoryStatics.anInt3473 + -i_3_) / 2
                        val i_4_ = (min(NpcReferenceStatics.anInt6857, 768))
                        LocTypeDefinitionStatics.anInt4017 = i_3_
                        TimingCounters.anInt4167 = 0
                        HardCacheEntryReferenceStatics.anInt10432 = i_4_
                    } else {
                        TimingCounters.anInt4167 = 0
                        HardCacheEntryReferenceStatics.anInt10432 = NpcReferenceStatics.anInt6857
                        ModelResourceBundleStatics.anInt7129 = 0
                        LocTypeDefinitionStatics.anInt4017 = SocketFactoryStatics.anInt3473
                    }
                }
            }
    
            @JvmStatic
            fun method2159(i: Byte, js5Archive: Js5Archive) {
                NpcReferenceStatics.anInt6862 = js5Archive.method417("hitmarks", 0)
                anInt6258++
                DualMaterialContainerStatics.anInt1639 = js5Archive.method417("hitbar_default", 0)
                MouseInputTrackerStatics.anInt7429 = js5Archive.method417("timerbar_default", 0)
                RendererStatics.anInt4562 = js5Archive.method417("headicons_pk", 0)
                ConfigArchiveLoaderStatics.anInt1435 = js5Archive.method417("headicons_prayer", 0)
                OverlayColorTable.anInt1756 = js5Archive.method417("hint_headicons", 0)
                CutsceneSequenceDataStatics.anInt3739 = js5Archive.method417("hint_mapmarkers", 0)
                DrawListState.anInt1481 = js5Archive.method417("mapflag", 0)
                RangedGraphicsOptionStateStatics.anInt5948 = js5Archive.method417("cross", 0)
                CameraNodeListStatics.anInt1742 = js5Archive.method417("mapdots", 0)
                NamedIdRecordStatics.anInt4469 = js5Archive.method417("scrollbar", 0)
                ClampTextureNodeStatics.anInt9473 = js5Archive.method417("name_icons", 0)
                LocTypeDefLoaderStatics.anInt2510 = js5Archive.method417("floorshadows", 0)
                RsaVarbitHandlerStatics.anInt4895 = js5Archive.method417("compass", 0)
                if (i > -72) method2161(106.toByte(), 125L)
                PerlinTextureProviderStatics.anInt5814 = js5Archive.method417("otherlevel", 0)
                SpriteComponentStatics.anInt8370 = js5Archive.method417("hint_mapedge", 0)
            }
    
            @JvmStatic
            fun method2160(i: Int) {
                if (i == 0) {
                    aRenderConfig6247 = null
                    anIntArray6260 = null
                }
            }
    
            @JvmStatic
            fun method2161(i: Byte, l: Long) {
                try {
                    anInt6251++
                    if (l > 0L) {
                        if (l % 10L == 0L) {
                            FileIoUtil.method2606(-125, -1L + l)
                            FileIoUtil.method2606(-125, 1L)
                        } else FileIoUtil.method2606(59, l)
                        val i_13_ = 70 % ((i - -52) / 32)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, "gn.D(" + i + ',' + l + ')')
                }
            }
}
