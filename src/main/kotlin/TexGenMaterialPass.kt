import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glTexGenfv
import jaggl.OpenGL.Companion.glTexGeni
import kotlin.math.min

class TexGenMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer, class83: Class83?) : MaterialPass(var_ha_Sub2) {
    private val aClass61_6254: Class61
    private val aClass83_6259: Class83?
    override fun method2136(i: Int, i_5_: Int, i_6_: Byte) {
        anInt6252++
        val f = -5.0E-4f * (1 + (i and 0x3)).toFloat()
        val f_7_ = 5.0E-4f * (1 + ((i and 0x18) shr 3)).toFloat()
        val f_8_ = if ((i and 0x40) == 0) 4.8828125E-4f else 9.765625E-4f
        val bool = (i and 0x80) != 0
        this.aHa_Sub2_3684.method3738(-15039, 1)
        if (bool) {
            MapLabelMenuEntry.aFloatArray5791!![1] = 0.0f
            MapLabelMenuEntry.aFloatArray5791!![0] = f_8_
            MapLabelMenuEntry.aFloatArray5791!![3] = 0.0f
            MapLabelMenuEntry.aFloatArray5791!![2] = 0.0f
        } else {
            MapLabelMenuEntry.aFloatArray5791!![1] = 0.0f
            MapLabelMenuEntry.aFloatArray5791!![0] = 0.0f
            MapLabelMenuEntry.aFloatArray5791!![2] = f_8_
            MapLabelMenuEntry.aFloatArray5791!![3] = 0.0f
        }
        glTexGenfv(8192, 9474, MapLabelMenuEntry.aFloatArray5791, 0)
        MapLabelMenuEntry.aFloatArray5791!![0] = 0.0f
        MapLabelMenuEntry.aFloatArray5791!![1] = f_8_
        MapLabelMenuEntry.aFloatArray5791!![3] = (f * this.aHa_Sub2_3684.anInt7735.toFloat() % 1.0f)
        if (i_6_ >= -42) method2136(-27, -15, (-43).toByte())
        MapLabelMenuEntry.aFloatArray5791!![2] = 0.0f
        glTexGenfv(8193, 9474, MapLabelMenuEntry.aFloatArray5791, 0)
        if (aClass83_6259!!.aBoolean1442) {
            MapLabelMenuEntry.aFloatArray5791!![0] = 0.0f
            MapLabelMenuEntry.aFloatArray5791!![3] = (this.aHa_Sub2_3684.anInt7735).toFloat() * f_7_ % 1.0f
            MapLabelMenuEntry.aFloatArray5791!![2] = 0.0f
            MapLabelMenuEntry.aFloatArray5791!![1] = 0.0f
            glTexGenfv(8194, 9473, MapLabelMenuEntry.aFloatArray5791, 0)
        } else {
            val i_9_ = (16.0f * (this.aHa_Sub2_3684.anInt7735.toFloat() * f_7_)).toInt()
            this.aHa_Sub2_3684.method3771((-81).toByte(), aClass83_6259.aClass258_Sub3Array1448!![i_9_ % 16])
        }
        this.aHa_Sub2_3684.method3738(-15039, 0)
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_10_: Int) {
        anInt6257++
        this.aHa_Sub2_3684.method3771((-118).toByte(), glTexture)
        this.aHa_Sub2_3684.method3761(0, i_10_)
        if (i > -89) method2140(null, 109.toByte(), -112)
    }

    override fun method2133(i: Int) {
        anInt6249++
        aClass61_6254.method594('\u0001', 28666)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        this.aHa_Sub2_3684.method3771((-113).toByte(), null)
        if (i > -75) anInt6248 = -7
        this.aHa_Sub2_3684.method3738(-15039, 0)
    }

    init {
        try {
            aClass83_6259 = class83
            aClass61_6254 = Class61(var_ha_Sub2, 2)
            aClass61_6254.method595(104.toByte(), 0)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            if (aClass83_6259!!.aBoolean1442) {
                glTexGeni(8194, 9472, 9217)
                glEnable(3170)
            }
            glTexGeni(8192, 9472, 9216)
            glTexGeni(8193, 9472, 9216)
            glEnable(3168)
            glEnable(3169)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aClass61_6254.method591(-1)
            aClass61_6254.method595(117.toByte(), 1)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            if (aClass83_6259.aBoolean1442) glDisable(3170)
            glDisable(3168)
            glDisable(3169)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aClass61_6254.method591(-1)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("gn.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (class83 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method2134(bool: Boolean, bool_11_: Boolean) {
        anInt6250++
        aClass61_6254.method594('\u0000', 28666)
        if (aClass83_6259!!.aBoolean1442) {
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-117).toByte(), (aClass83_6259.aClass258_Sub1_1446))
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
        if (bool_11_ != false) anInt6248 = -68
    }

    override fun method2139(bool: Boolean, i: Byte) {
        anInt6261++
        val i_12_ = -52 % ((i - -60) / 38)
    }

    override fun method2137(i: Int): Boolean {
        if (i >= -5) anInt6248 = 124
        anInt6253++
        return true
    }

    companion object {
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
            if (IntHashSet.aClass348_Sub51_3959 != null) i_0_ = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1818(-32350)
            if (i.toInt() == 56) {
                if (i_0_ == 2) {
                    val i_1_ = (min(SocketFactory.anInt3473, 800))
                    LocTypeDefinition.anInt4017 = i_1_
                    ModelResourceBundle.anInt7129 = (SocketFactory.anInt3473 + -i_1_) / 2
                    val i_2_ = (min(NpcReference.anInt6857, 600))
                    HardCacheEntryReference.anInt10432 = i_2_
                    TimingCounters.anInt4167 = 0
                } else if (i_0_ == 1) {
                    val i_3_ = min(SocketFactory.anInt3473, 1024)
                    ModelResourceBundle.anInt7129 = (SocketFactory.anInt3473 + -i_3_) / 2
                    val i_4_ = (min(NpcReference.anInt6857, 768))
                    LocTypeDefinition.anInt4017 = i_3_
                    TimingCounters.anInt4167 = 0
                    HardCacheEntryReference.anInt10432 = i_4_
                } else {
                    TimingCounters.anInt4167 = 0
                    HardCacheEntryReference.anInt10432 = NpcReference.anInt6857
                    ModelResourceBundle.anInt7129 = 0
                    LocTypeDefinition.anInt4017 = SocketFactory.anInt3473
                }
            }
        }

        @JvmStatic
        fun method2159(i: Byte, class45: Class45) {
            NpcReference.anInt6862 = class45.method417("hitmarks", 0)
            anInt6258++
            DualMaterialContainer.anInt1639 = class45.method417("hitbar_default", 0)
            MouseInputTracker.anInt7429 = class45.method417("timerbar_default", 0)
            Renderer.anInt4562 = class45.method417("headicons_pk", 0)
            Class82.anInt1435 = class45.method417("headicons_prayer", 0)
            OverlayColorTable.anInt1756 = class45.method417("hint_headicons", 0)
            CutsceneSequenceData.anInt3739 = class45.method417("hint_mapmarkers", 0)
            Class86.anInt1481 = class45.method417("mapflag", 0)
            RangedGraphicsOptionState.anInt5948 = class45.method417("cross", 0)
            CameraNodeList.anInt1742 = class45.method417("mapdots", 0)
            NamedIdRecord.anInt4469 = class45.method417("scrollbar", 0)
            ClampTextureNode.anInt9473 = class45.method417("name_icons", 0)
            LocTypeDefLoader.anInt2510 = class45.method417("floorshadows", 0)
            Class52.anInt4895 = class45.method417("compass", 0)
            if (i > -72) method2161(106.toByte(), 125L)
            PerlinTextureProvider.anInt5814 = class45.method417("otherlevel", 0)
            Class5_Sub3.anInt8370 = class45.method417("hint_mapedge", 0)
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
                throw SoundBankPatch.method2929(runtimeexception, "gn.D(" + i + ',' + l + ')')
            }
        }
    }
}
