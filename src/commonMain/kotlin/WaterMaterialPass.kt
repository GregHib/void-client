import kotlin.jvm.JvmStatic
import LightingDetailOptionState.Companion.method1847
import MinimapShapeDrawer.Companion.method459
import jaggl.OpenGL.Companion.glBindProgramARB
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glLoadMatrixf
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glProgramLocalParameter4fARB
import jaggl.OpenGL.Companion.glProgramLocalParameter4fvARB
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

@OptIn(ExperimentalTime::class)
class WaterMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer, waterTextureSet: WaterTextureSet?) : MaterialPass(var_ha_Sub2) {
    private var aFloatArray6218: FloatArray? = null
    private var anInt6219 = 0
    private var aRefCountedHandle_6220: RefCountedHandle? = null
    private var aGlDisplayListFont_6222: GlDisplayListFont? = null
    private var aFloat6225 = 0f
    private val aWaterTextureSet_6227: WaterTextureSet?
    override fun method2136(i: Int, i_0_: Int, i_1_: Byte) {
        anInt6224++
        if (aGlDisplayListFont_6222 != null) {
            if (i_1_ >= -42) method2149(-65)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            if ((i and 0x80) != 0) this.aHa_Sub2_3684.method3771((-122).toByte(), null)
            else if ((0x1 and i_0_) != 1) {
                if (!aWaterTextureSet_6227!!.aBoolean1442) this.aHa_Sub2_3684.method3771((-84).toByte(), aWaterTextureSet_6227.aClass258_Sub3Array1444!![0])
                else this.aHa_Sub2_3684.method3771((-97).toByte(), aWaterTextureSet_6227.aClass258_Sub1_1440)
                glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f)
            } else if (aWaterTextureSet_6227!!.aBoolean1442) {
                this.aHa_Sub2_3684.method3771((-83).toByte(), aWaterTextureSet_6227.aClass258_Sub1_1440)
                glProgramLocalParameter4fARB(34336, 65, aFloat6225, 0.0f, 0.0f, 1.0f)
            } else {
                val i_2_ = (this.aHa_Sub2_3684.anInt7735 % 4000 * 16 / 4000)
                this.aHa_Sub2_3684.method3771((-88).toByte(), aWaterTextureSet_6227.aClass258_Sub3Array1444!![i_2_])
                glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f)
            }
            this.aHa_Sub2_3684.method3738(-15039, 0)
            if ((0x40 and i) == 0) {
                ParamMap.aFloatArray9491!![2] = (this.aHa_Sub2_3684.aFloat7823 * (this.aHa_Sub2_3684.aFloat7768))
                ParamMap.aFloatArray9491!![0] = (this.aHa_Sub2_3684.aFloat7781 * (this.aHa_Sub2_3684.aFloat7768))
                ParamMap.aFloatArray9491!![1] = (this.aHa_Sub2_3684.aFloat7768 * (this.aHa_Sub2_3684.aFloat7816))
                glProgramLocalParameter4fvARB(34336, 66, (ParamMap.aFloatArray9491), 0)
            } else glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f)
            val i_3_ = i and 0x3
            if (i_3_ == 2) glProgramLocalParameter4fARB(34336, 64, 0.05f, 1.0f, 1.0f, 1.0f)
            else if (i_3_ == 3) glProgramLocalParameter4fARB(34336, 64, 0.1f, 1.0f, 1.0f, 1.0f)
            else glProgramLocalParameter4fARB(34336, 64, 0.025f, 1.0f, 1.0f, 1.0f)
        }
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_4_: Int) {
        if (i <= -89) {
            anInt6216++
            this.aHa_Sub2_3684.method3771((-115).toByte(), glTexture)
            this.aHa_Sub2_3684.method3761(0, i_4_)
        }
    }

    init {
        do {
            try {
                aWaterTextureSet_6227 = waterTextureSet
                if (!this.aHa_Sub2_3684.aBoolean7841 || (this.aHa_Sub2_3684.anInt7795 < 2)) break
                aRefCountedHandle_6220 = (method459(
                    34336,
                    this.aHa_Sub2_3684,
                    "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND",
                    false
                ))
                if (aRefCountedHandle_6220 != null) {
                    val `is` = CipheredPacketBuffer.method3413(4, 3, 64, 4, 256, true, 0, 0.4f, false)
                    val is_5_ = CipheredPacketBuffer.method3413(4, 3, 64, 4, 256, true, 8, 0.4f, false)
                    aFloatArray6218 = FloatArray(32768)
                    var i = 0
                    for (i_6_ in 0..255) {
                        val is_7_ = `is`[i_6_]!!
                        val is_8_ = is_5_[i_6_]!!
                        for (i_9_ in 0..63) {
                            aFloatArray6218!![i++] = is_7_[i_9_].toFloat() / 4096.0f
                            aFloatArray6218!![i++] = is_8_[i_9_].toFloat() / 4096.0f
                        }
                    }
                    method2149(-25)
                }
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("em.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (waterTextureSet != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    private fun method2149(i: Int) {
        anInt6217++
        aGlDisplayListFont_6222 = GlDisplayListFont(this.aHa_Sub2_3684, 2)
        aGlDisplayListFont_6222!!.method595(103.toByte(), 0)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        this.aHa_Sub2_3684.method3808(-16777216, 118)
        this.aHa_Sub2_3684.method3729(260, 114.toByte(), 7681)
        this.aHa_Sub2_3684.method3775(false, 0, 770, 34166)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        glBindProgramARB(34336, aRefCountedHandle_6220!!.anInt2270)
        glEnable(34336)
        aGlDisplayListFont_6222!!.method591(-1)
        aGlDisplayListFont_6222!!.method595(127.toByte(), 1)
        val i_10_ = 65 / ((i - 62) / 49)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        glMatrixMode(5890)
        glLoadIdentity()
        glMatrixMode(5888)
        this.aHa_Sub2_3684.method3761(0, 0)
        this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        glBindProgramARB(34336, 0)
        glDisable(34336)
        glDisable(34820)
        aGlDisplayListFont_6222!!.method591(-1)
    }

    override fun method2137(i: Int): Boolean {
        if (i >= -5) return true
        anInt6215++
        return true
    }

    override fun method2133(i: Int) {
        anInt6231++
        if (aGlDisplayListFont_6222 != null) {
            if (i >= -75) method2134(true, false)
            aGlDisplayListFont_6222!!.method594('\u0001', 28666)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-103).toByte(), null)
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
    }

    override fun method2134(bool: Boolean, bool_11_: Boolean) {
        anInt6232++
        if (aGlDisplayListFont_6222 != null) {
            aGlDisplayListFont_6222!!.method594('\u0000', 28666)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            glMatrixMode(5890)
            if (bool_11_ == false) {
                glLoadMatrixf(this.aHa_Sub2_3684.aClass101_Sub3_7767.method940(1), 0)
                glMatrixMode(5888)
                this.aHa_Sub2_3684.method3738(-15039, 0)
                if (this.aHa_Sub2_3684.anInt7735 != anInt6219) {
                    var i = ((this.aHa_Sub2_3684.anInt7735) % 5000 * 128 / 5000)
                    for (i_12_ in 0..63) {
                        glProgramLocalParameter4fvARB(34336, i_12_, aFloatArray6218, i)
                        i += 2
                    }
                    if (aWaterTextureSet_6227!!.aBoolean1442) aFloat6225 = (this.aHa_Sub2_3684.anInt7735 % 4000).toFloat() / 4000.0f
                    else glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f)
                    anInt6219 = (this.aHa_Sub2_3684.anInt7735)
                }
            }
        }
    }

    override fun method2139(bool: Boolean, i: Byte) {
        val i_13_ = 22 % ((-60 - i) / 38)
        anInt6229++
    }

    companion object {

        var anInt6214: Int = 0

        var anInt6215: Int = 0

        var anInt6216: Int = 0

        var anInt6217: Int = 0

        var aCalendar6221: Instant? = kotlin.time.Clock.System.now()

        var anInt6223: Int = 0

        var anInt6224: Int = 0

        var anInt6226: Int = 0

        var anInt6229: Int = 0

        var anInt6230: Int = 0

        var anInt6231: Int = 0

        var anInt6232: Int = 0

        @JvmStatic
        fun method2148(fontMetaRef: FontMetaRef?, isaacCipher: IsaacCipher?, i: Int): OutgoingPacketNode {
            try {
                anInt6230++
                val class348_sub47 = ParticleConfigParser.method2273((-103).toByte())!!
                if (i >= -80) aCalendar6221 = null
                class348_sub47.anInt7122 = fontMetaRef!!.anInt4323
                class348_sub47.aFontMetaRef_7118 = fontMetaRef
                if (class348_sub47.anInt7122 != -1) {
                    if (class348_sub47.anInt7122 == -2) class348_sub47.aClass348_Sub49_Sub2_7116 = CipheredPacketBuffer(10000)
                    else if (class348_sub47.anInt7122 <= 18) class348_sub47.aClass348_Sub49_Sub2_7116 = CipheredPacketBuffer(20)
                    else if (class348_sub47.anInt7122 <= 98) class348_sub47.aClass348_Sub49_Sub2_7116 = CipheredPacketBuffer(100)
                    else class348_sub47.aClass348_Sub49_Sub2_7116 = CipheredPacketBuffer(260)
                } else class348_sub47.aClass348_Sub49_Sub2_7116 = CipheredPacketBuffer(260)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3416(-17, isaacCipher!!)

                if (Config.debug) {
                    println("Encode packet " + class348_sub47.aFontMetaRef_7118!!.method3456(200))
                }
                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3408(class348_sub47.aFontMetaRef_7118!!.method3456(200), 18676)
                class348_sub47.anInt7119 = 0
                return class348_sub47
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("em.C(" + (if (fontMetaRef != null) "{...}" else "null") + ',' + (if (isaacCipher != null) "{...}" else "null") + ',' + i + ')'))
            }
        }

        fun method2150(bool: Boolean, bool_14_: Boolean, npc: Npc) {
            anInt6226++
            if (FileExistsCondition.anInt4776 < 400) {
                var class79 = (npc.aNpcType_10505)
                if (class79!!.anIntArray1377 != null) {
                    class79 = class79.method794((ProjectedGroundDecor.aVarpStore_10209!!), -1)
                    if (class79 == null) return
                }
                if (class79.aBoolean1396) {
                    var string = class79.aString1372
                    if (class79.anInt1361 != 0) {
                        val string_15_ = (if (GlRectangleTexture.aSceneProjector_8638 != Client.mode) LocalizedText.aLocalizedText_3511!!.method2063(ChatCommandProcessor.language, 544) else LocalizedText.aLocalizedText_3513!!.method2063(ChatCommandProcessor.language, 544))
                        string += ((GlRectangleTexture.method250((LocalPlayerState.aPlayer_1907!!.anInt10516), true, class79.anInt1361)) + " (" + string_15_ + class79.anInt1361 + ")")
                    }
                    if (RenderNodeStatics.aBoolean9722 && !bool) {
                        val class254 = (if (ParticleEmitterFactoryStatics.anInt3176 == -1) null else ProjectionCameraTransform.aParamTypeList_5764!!.method2600(ParticleEmitterFactoryStatics.anInt3176, 28364))
                        if ((WidgetTextConfig.anInt500 and 0x2) != 0 && (class254 == null || (class79.method805((class254.anInt3256), ParticleEmitterFactoryStatics.anInt3176, 61) != class254.anInt3256))) {
                            MinimapPolygonDrawer.method466(false, ItemNameResolver.aString5000 + " -> <col=ffff00>" + string, 0, (-81).toByte(), false, 0, -1, true, 30, npc.anInt10290.toLong(), ItemNameResolver.aString5001, npc.anInt10290.toLong(), FloatBuffer.anInt9747)
                            TextureHandle.anInt2586++
                        }
                    }
                    if (!bool) {
                        var strings: Array<String?>? = class79.aStringArray1349
                        if (ArbVertexProgram.aBoolean9783) strings = method1847(strings, 0)
                        if (strings != null) {
                            for (i in 4 downTo 0) {
                                if (strings[i] != null && (class79.aByte1384.toInt() == 0 || !(strings[i].equals(LocalizedText.aLocalizedText_3506!!.method2063(ChatCommandProcessor.language, 544), ignoreCase = true)))) {
                                    var i_16_ = 0
                                    if (i == 0) i_16_ = 25
                                    var i_17_ = WidgetTextConfig.anInt506
                                    if (i == 1) i_16_ = 20
                                    if (i == 2) i_16_ = 44
                                    if (i == 3) i_16_ = 46
                                    if (class79.anInt1335 == i) i_17_ = class79.anInt1371
                                    if (i == 4) i_16_ = 60
                                    if (i == class79.anInt1385) i_17_ = class79.anInt1338
                                    RenderConfigFactory.anInt2976++
                                    MinimapPolygonDrawer.method466(false, "<col=ffff00>" + string, 0, (-93).toByte(), false, 0, -1, true, i_16_, npc.anInt10290.toLong(), strings[i], npc.anInt10290.toLong(), (if (!(strings[i].equals(LocalizedText.aLocalizedText_3506!!.method2063(ChatCommandProcessor.language, 544), ignoreCase = true))) i_17_ else class79.anInt1401))
                                }
                            }
                        }
                        if (class79.aByte1384.toInt() == 1 && strings != null) {
                            for (i in 4 downTo 0) {
                                if (strings[i] != null && (strings[i].equals(LocalizedText.aLocalizedText_3506!!.method2063(ChatCommandProcessor.language, 544), ignoreCase = true))) {
                                    var i_18_: Short = 0
                                    if ((LocalPlayerState.aPlayer_1907!!.anInt10516) < class79.anInt1361) i_18_ = 2000.toShort()
                                    var i_19_: Short = 0
                                    if (i == 0) i_19_ = 25.toShort()
                                    if (i == 1) i_19_ = 20.toShort()
                                    if (i == 2) i_19_ = 44.toShort()
                                    if (i == 3) i_19_ = 46.toShort()
                                    if (i == 4) i_19_ = 60.toShort()
                                    if (i_19_.toInt() != 0) i_19_ = (i_19_ + i_18_).toShort()
                                    LocConfigModelBuilder.anInt4510++
                                    MinimapPolygonDrawer.method466(false, "<col=ffff00>" + string, 0, (-101).toByte(), false, 0, -1, true, i_19_.toInt(), npc.anInt10290.toLong(), strings[i], npc.anInt10290.toLong(), class79.anInt1401)
                                }
                            }
                        }
                    }
                    CircleDrawer.anInt2690++
                    val npcX = (npc.x shr 9) + ArbVertexProgram.regionTileX - npc.aNpcType_10505!!.anInt1399 + 1
                    val npcY = (npc.y shr 9) + RegionMapDecoder.regionTileY - npc.aNpcType_10505!!.anInt1399 + 1
                    MinimapPolygonDrawer.method466(bool, "<col=ffff00>" + string + Config.getDebug(class79.anInt1344, npcX, npcY, npc.plane.toInt()), 0, (-105).toByte(), bool_14_, 0, -1, true, 1008, npc.anInt10290.toLong(), LocalizedText.aLocalizedText_3505!!.method2063(ChatCommandProcessor.language, 544), npc.anInt10290.toLong(), CubeMapMaterialPass.Companion.anInt6299)
                }
            }
        }

        @JvmStatic
        fun method2151(i: Int) {
            CompressedBlockDecoder.anIntArray6228 = null
            if (i > -72) method2148(null, null, 77)
            aCalendar6221 = null
        }

        @JvmStatic
        fun method2152(bool: Boolean) {
            for (i in 0..<CollisionFlagQuery.anInt1200) MapElementDecor.aMapTileShapeArray10330!![i] = null
            anInt6223++
            CollisionFlagQuery.anInt1200 = 0
            run {
                var i = 0
                while (MapAreaDefinition.anInt2524 > i) {
                    for (i_20_ in 0..<ActorEntity.anInt6451) {
                        var i_21_ = 0
                        while ((i_21_ < ActorEntity.anInt7054)) {
                            val class357 = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_21_]!![i_20_])
                            if (class357 != null) {
                                if (class357.aShort4398 > 0) class357.aShort4398 = (class357.aShort4398 * -1).toShort()
                                if (class357.aShort4409 > 0) class357.aShort4409 = (class357.aShort4409 * -1).toShort()
                            }
                            i_21_++
                        }
                    }
                    i++
                }
            }
            var i = 0
            while (MapAreaDefinition.anInt2524 > i) {
                for (i_22_ in 0..<ActorEntity.anInt6451) {
                    var i_23_ = 0
                    while (ActorEntity.anInt7054 > i_23_) {
                        val class357 = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_23_]!![i_22_])
                        if (class357 != null) {
                            val bool_24_ = ((HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![0]!![i_23_]!![i_22_]) != null && (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![0]!![i_23_]!![i_22_]!!.aSceneCollisionEntry_4400) != null)
                            if (class357.aShort4409 < 0) {
                                var i_25_ = i_22_
                                var i_26_ = i_22_
                                val i_27_ = i
                                val i_28_ = i
                                var class357_29_ = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_23_]!![i_25_ + -1])
                                val i_30_: Int
                                i_30_ = (TerrainTileShape.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, i_23_))
                                while ((i_25_ > 0 && class357_29_ != null && class357_29_.aShort4409 < 0 && (class357_29_.aShort4409 == class357.aShort4409) && (class357.aShort4401 == class357_29_.aShort4401) && ((TerrainTileShape.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), -1 + i_25_, i_23_)) == i_30_))) {
                                    if (-1 + i_25_ > 0 && i_30_ != (TerrainTileShape.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_25_ + -2, i_23_))) break
                                    i_25_--
                                    class357_29_ = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_23_]!![i_25_ + -1])
                                }
                                class357_29_ = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_23_]!![1 + i_26_])
                                while (((ActorEntity.anInt7054 > i_26_) && class357_29_ != null && class357_29_.aShort4409 < 0 && (class357_29_.aShort4409 == class357.aShort4409) && (class357.aShort4401 == class357_29_.aShort4401) && i_30_ == (TerrainTileShape.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_26_ - -1, i_23_)))) {
                                    if ((ActorEntity.anInt7054 > 1 + i_26_) && i_30_ != (TerrainTileShape.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_26_ + 2, i_23_))) break
                                    i_26_++
                                    class357_29_ = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_23_]!![i_26_ + 1])
                                }
                                val i_31_ = 1 + (-i_27_ + i_28_)
                                val i_32_ = TerrainTileShape.aTerrainTileArray8801!![if (bool_24_) 1 + i_27_ else i_27_]!!.method3982((-86).toByte(), i_25_, i_23_)
                                val i_33_ = (class357.aShort4409 * i_31_ + i_32_)
                                val i_34_ = (TerrainTileShape.aTerrainTileArray8801!![if (!bool_24_) i_27_ else i_27_ + 1]!!.method3982((-86).toByte(), 1 + i_26_, i_23_))
                                val i_35_ = (i_34_ - -(i_31_ * class357.aShort4409))
                                val i_36_ = i_23_ shl ActorEntity.anInt4459
                                val i_37_ = i_25_ shl ActorEntity.anInt4459
                                val i_38_ = (ActorEntity.anInt3465 + (i_26_ shl ActorEntity.anInt4459))
                                MapElementDecor.aMapTileShapeArray10330!![CollisionFlagQuery.anInt1200++] = (MapTileShape(1, i_28_, class357.aShort4401 + i_36_, class357.aShort4401 + i_36_, class357.aShort4401 + i_36_, class357.aShort4401 + i_36_, i_32_, i_34_, i_35_, i_33_, i_37_, i_38_, i_38_, i_37_))
                                var i_39_ = i_27_
                                while (i_28_ >= i_39_) {
                                    var i_40_ = i_25_
                                    while (i_26_ >= i_40_) {
                                        HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_39_]!![i_23_]!![i_40_]!!.aShort4409 = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_39_]!![i_23_]!![i_40_]!!.aShort4409 * -1).toShort()
                                        i_40_++
                                    }
                                    i_39_++
                                }
                            }
                            if (class357.aShort4398 < 0) {
                                var i_41_ = i_23_
                                var i_42_ = i_23_
                                val i_43_ = i
                                val i_44_ = i
                                var class357_45_ = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_41_ - 1]!![i_22_])
                                val i_46_: Int
                                i_46_ = (TerrainTileShape.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, i_23_))
                                while ((i_41_ > 0 && class357_45_ != null && class357_45_.aShort4398 < 0 && (class357.aShort4398 == class357_45_.aShort4398) && (class357.aShort4397 == class357_45_.aShort4397) && ((TerrainTileShape.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, -1 + i_41_)) == i_46_))) {
                                    if (i_41_ + -1 > 0 && ((TerrainTileShape.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, -2 + i_41_)) != i_46_)) break
                                    i_41_--
                                    class357_45_ = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_41_ - 1]!![i_22_])
                                }
                                class357_45_ = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_42_ - -1]!![i_22_])
                                while ((i_42_ < ActorEntity.anInt6451 && class357_45_ != null && class357_45_.aShort4398 < 0 && (class357.aShort4398 == class357_45_.aShort4398) && (class357_45_.aShort4397 == class357.aShort4397) && ((TerrainTileShape.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, i_42_ + 1)) == i_46_))) {
                                    if (ActorEntity.anInt6451 > i_42_ + 1 && ((TerrainTileShape.aTerrainTileArray8801!![i]!!.method3982((-86).toByte(), i_22_, 2 + i_42_)) != i_46_)) break
                                    i_42_++
                                    class357_45_ = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![1 + i_42_]!![i_22_])
                                }
                                val i_47_ = 1 + -i_43_ + i_44_
                                val i_48_ = TerrainTileShape.aTerrainTileArray8801!![if (!bool_24_) i_43_ else 1 + i_43_]!!.method3982((-86).toByte(), i_22_, i_41_)
                                val i_49_ = (i_48_ - -(i_47_ * class357.aShort4398))
                                val i_50_ = (TerrainTileShape.aTerrainTileArray8801!![if (!bool_24_) i_43_ else 1 + i_43_]!!.method3982((-86).toByte(), i_22_, 1 + i_42_))
                                val i_51_ = (class357.aShort4398 * i_47_ + i_50_)
                                val i_52_ = i_41_ shl ActorEntity.anInt4459
                                val i_53_ = ((i_42_ shl ActorEntity.anInt4459) + ActorEntity.anInt3465)
                                val i_54_ = i_22_ shl ActorEntity.anInt4459
                                MapElementDecor.aMapTileShapeArray10330!![CollisionFlagQuery.anInt1200++] = (MapTileShape(2, i_44_, i_52_, i_53_, i_53_, i_52_, i_48_, i_50_, i_51_, i_49_, i_54_ + class357.aShort4397, i_54_ + class357.aShort4397, class357.aShort4397 + i_54_, (i_54_ - -class357.aShort4397)))
                                for (i_55_ in i_43_..i_44_) {
                                    var i_56_ = i_41_
                                    while ((i_42_ >= i_56_)) {
                                        HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_55_]!![i_56_]!![i_22_]!!.aShort4398 = (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_55_]!![i_56_]!![i_22_]!!.aShort4398 * -1).toShort()
                                        i_56_++
                                    }
                                }
                            }
                        }
                        i_23_++
                    }
                }
                i++
            }
            MinimapSquareDrawer.aBoolean5226 = true
        }

        @JvmStatic
        fun method2153(i: Int) {
            anInt6214++
            if (!KeyboardLayoutConfig.aBoolean2130 && i <= -37) {
                KeyboardLayoutConfig.aBoolean2130 = true
                CircleDrawer.aFloat2687 += (-CircleDrawer.aFloat2687 + 24.0f) / 2.0f
                WorldMapPolygonIconLabel.aBoolean10174 = true
            }
        }
    }
}
