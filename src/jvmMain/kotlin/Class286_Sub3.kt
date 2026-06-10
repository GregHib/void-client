import Class239_Sub28.Companion.method1847
import Class50.Companion.method459
import jaggl.OpenGL.Companion.glBindProgramARB
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glLoadMatrixf
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glProgramLocalParameter4fARB
import jaggl.OpenGL.Companion.glProgramLocalParameter4fvARB
import java.util.*

class Class286_Sub3 internal constructor(var_ha_Sub2: ha_Sub2, class83: Class83?) : Class286(var_ha_Sub2) {
    private var aFloatArray6218: FloatArray? = null
    private var anInt6219 = 0
    private var aClass171_6220: Class171? = null
    private var aClass61_6222: Class61? = null
    private var aFloat6225 = 0f
    private val aClass83_6227: Class83?
    override fun method2136(i: Int, i_0_: Int, i_1_: Byte) {
        anInt6224++
        if (aClass61_6222 != null) {
            if (i_1_ >= -42) method2149(-65)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            if ((i and 0x80) != 0) this.aHa_Sub2_3684.method3771((-122).toByte(), null)
            else if ((0x1 and i_0_) != 1) {
                if (!aClass83_6227!!.aBoolean1442) this.aHa_Sub2_3684.method3771((-84).toByte(), aClass83_6227.aClass258_Sub3Array1444!![0])
                else this.aHa_Sub2_3684.method3771((-97).toByte(), aClass83_6227.aClass258_Sub1_1440)
                glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f)
            } else if (aClass83_6227!!.aBoolean1442) {
                this.aHa_Sub2_3684.method3771((-83).toByte(), aClass83_6227.aClass258_Sub1_1440)
                glProgramLocalParameter4fARB(34336, 65, aFloat6225, 0.0f, 0.0f, 1.0f)
            } else {
                val i_2_ = (this.aHa_Sub2_3684.anInt7735 % 4000 * 16 / 4000)
                this.aHa_Sub2_3684.method3771((-88).toByte(), aClass83_6227.aClass258_Sub3Array1444!![i_2_])
                glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f)
            }
            this.aHa_Sub2_3684.method3738(-15039, 0)
            if ((0x40 and i) == 0) {
                Class348_Sub42_Sub1.aFloatArray9491!![2] = (this.aHa_Sub2_3684.aFloat7823 * (this.aHa_Sub2_3684.aFloat7768))
                Class348_Sub42_Sub1.aFloatArray9491!![0] = (this.aHa_Sub2_3684.aFloat7781 * (this.aHa_Sub2_3684.aFloat7768))
                Class348_Sub42_Sub1.aFloatArray9491!![1] = (this.aHa_Sub2_3684.aFloat7768 * (this.aHa_Sub2_3684.aFloat7816))
                glProgramLocalParameter4fvARB(34336, 66, (Class348_Sub42_Sub1.aFloatArray9491), 0)
            } else glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f)
            val i_3_ = i and 0x3
            if (i_3_ == 2) glProgramLocalParameter4fARB(34336, 64, 0.05f, 1.0f, 1.0f, 1.0f)
            else if (i_3_ == 3) glProgramLocalParameter4fARB(34336, 64, 0.1f, 1.0f, 1.0f, 1.0f)
            else glProgramLocalParameter4fARB(34336, 64, 0.025f, 1.0f, 1.0f, 1.0f)
        }
    }

    override fun method2140(class258: Class258?, i: Byte, i_4_: Int) {
        if (i <= -89) {
            anInt6216++
            this.aHa_Sub2_3684.method3771((-115).toByte(), class258)
            this.aHa_Sub2_3684.method3761(0, i_4_)
        }
    }

    init {
        do {
            try {
                aClass83_6227 = class83
                if (!this.aHa_Sub2_3684.aBoolean7841 || (this.aHa_Sub2_3684.anInt7795 < 2)) break
                aClass171_6220 = (method459(
                    34336,
                    this.aHa_Sub2_3684,
                    "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND",
                    false
                ))
                if (aClass171_6220 != null) {
                    val `is` = Class348_Sub49_Sub2.method3413(4, 3, 64, 4, 256, true, 0, 0.4f, false)
                    val is_5_ = Class348_Sub49_Sub2.method3413(4, 3, 64, 4, 256, true, 8, 0.4f, false)
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
                throw Class348_Sub17.method2929(runtimeexception, ("em.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (class83 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    private fun method2149(i: Int) {
        anInt6217++
        aClass61_6222 = Class61(this.aHa_Sub2_3684, 2)
        aClass61_6222!!.method595(103.toByte(), 0)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        this.aHa_Sub2_3684.method3808(-16777216, 118)
        this.aHa_Sub2_3684.method3729(260, 114.toByte(), 7681)
        this.aHa_Sub2_3684.method3775(false, 0, 770, 34166)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        glBindProgramARB(34336, aClass171_6220!!.anInt2270)
        glEnable(34336)
        aClass61_6222!!.method591(-1)
        aClass61_6222!!.method595(127.toByte(), 1)
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
        aClass61_6222!!.method591(-1)
    }

    override fun method2137(i: Int): Boolean {
        if (i >= -5) return true
        anInt6215++
        return true
    }

    override fun method2133(i: Int) {
        anInt6231++
        if (aClass61_6222 != null) {
            if (i >= -75) method2134(true, false)
            aClass61_6222!!.method594('\u0001', 28666)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-103).toByte(), null)
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
    }

    override fun method2134(bool: Boolean, bool_11_: Boolean) {
        anInt6232++
        if (aClass61_6222 != null) {
            aClass61_6222!!.method594('\u0000', 28666)
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
                    if (aClass83_6227!!.aBoolean1442) aFloat6225 = (this.aHa_Sub2_3684.anInt7735 % 4000).toFloat() / 4000.0f
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
        @JvmField
        var anInt6214: Int = 0
        @JvmField
        var anInt6215: Int = 0
        @JvmField
        var anInt6216: Int = 0
        @JvmField
        var anInt6217: Int = 0
        @JvmField
        var aCalendar6221: Calendar? = Calendar.getInstance(TimeZone.getTimeZone("GMT"))
        @JvmField
        var anInt6223: Int = 0
        @JvmField
        var anInt6224: Int = 0
        @JvmField
        var anInt6226: Int = 0
        @JvmField
        var anIntArray6228: IntArray? = null
        @JvmField
        var anInt6229: Int = 0
        @JvmField
        var anInt6230: Int = 0
        @JvmField
        var anInt6231: Int = 0
        @JvmField
        var anInt6232: Int = 0

        @JvmStatic
        fun method2148(class351: Class351?, class77: Class77?, i: Int): Class348_Sub47 {
            try {
                anInt6230++
                val class348_sub47 = Class300.method2273((-103).toByte())!!
                if (i >= -80) aCalendar6221 = null
                class348_sub47.anInt7122 = class351!!.anInt4323
                class348_sub47.aClass351_7118 = class351
                if (class348_sub47.anInt7122 != -1) {
                    if (class348_sub47.anInt7122 == -2) class348_sub47.aClass348_Sub49_Sub2_7116 = Class348_Sub49_Sub2(10000)
                    else if (class348_sub47.anInt7122 <= 18) class348_sub47.aClass348_Sub49_Sub2_7116 = Class348_Sub49_Sub2(20)
                    else if (class348_sub47.anInt7122 <= 98) class348_sub47.aClass348_Sub49_Sub2_7116 = Class348_Sub49_Sub2(100)
                    else class348_sub47.aClass348_Sub49_Sub2_7116 = Class348_Sub49_Sub2(260)
                } else class348_sub47.aClass348_Sub49_Sub2_7116 = Class348_Sub49_Sub2(260)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3416(-17, class77!!)

                if (Loader.debug) {
                    println("Encode packet " + class348_sub47.aClass351_7118!!.method3456(200))
                }
                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3408(class348_sub47.aClass351_7118!!.method3456(200), 18676)
                class348_sub47.anInt7119 = 0
                return class348_sub47
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("em.C(" + (if (class351 != null) "{...}" else "null") + ',' + (if (class77 != null) "{...}" else "null") + ',' + i + ')'))
            }
        }

        fun method2150(bool: Boolean, bool_14_: Boolean, npc: Npc) {
            anInt6226++
            if (Class73.anInt4776 < 400) {
                var class79 = (npc.aClass79_10505)
                if (class79!!.anIntArray1377 != null) {
                    class79 = class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), -1)
                    if (class79 == null) return
                }
                if (class79.aBoolean1396) {
                    var string = class79.aString1372
                    if (class79.anInt1361 != 0) {
                        val string_15_ = (if (Class14_Sub4.aClass230_8638 != Class348_Sub42_Sub8_Sub2.aClass230_10434) Class274.aClass274_3511!!.method2063(Class348_Sub33.anInt6967, 544) else Class274.aClass274_3513!!.method2063(Class348_Sub33.anInt6967, 544))
                        string += ((Class14_Sub4.method250((Class132.aPlayer_1907!!.anInt10516), true, class79.anInt1361)) + " (" + string_15_ + class79.anInt1361 + ")")
                    }
                    if (r.aBoolean9722 && !bool) {
                        val class254 = (if (Class246.anInt3176 == -1) null else Class101_Sub3.aClass326_5764!!.method2600(Class246.anInt3176, 28364))
                        if ((Class38.anInt500 and 0x2) != 0 && (class254 == null || (class79.method805((class254.anInt3256), Class246.anInt3176, 61) != class254.anInt3256))) {
                            Class50_Sub3.method466(false, Class28.aString5000 + " -> <col=ffff00>" + string, 0, (-81).toByte(), false, 0, -1, true, 30, npc.anInt10290.toLong(), Class28.aString5001, npc.anInt10290.toLong(), Class348_Sub49_Sub1.anInt9747)
                            Class193.anInt2586++
                        }
                    }
                    if (!bool) {
                        var strings: Array<String?>? = class79.aStringArray1349
                        if (za_Sub2.aBoolean9783) strings = method1847(strings, 0)
                        if (strings != null) {
                            for (i in 4 downTo 0) {
                                if (strings[i] != null && (class79.aByte1384.toInt() == 0 || !(strings[i].equals(Class274.aClass274_3506!!.method2063(Class348_Sub33.anInt6967, 544), ignoreCase = true)))) {
                                    var i_16_ = 0
                                    if (i == 0) i_16_ = 25
                                    var i_17_ = Class38.anInt506
                                    if (i == 1) i_16_ = 20
                                    if (i == 2) i_16_ = 44
                                    if (i == 3) i_16_ = 46
                                    if (class79.anInt1335 == i) i_17_ = class79.anInt1371
                                    if (i == 4) i_16_ = 60
                                    if (i == class79.anInt1385) i_17_ = class79.anInt1338
                                    Class229.anInt2976++
                                    Class50_Sub3.method466(false, "<col=ffff00>" + string, 0, (-93).toByte(), false, 0, -1, true, i_16_, npc.anInt10290.toLong(), strings[i], npc.anInt10290.toLong(), (if (!(strings[i].equals(Class274.aClass274_3506!!.method2063(Class348_Sub33.anInt6967, 544), ignoreCase = true))) i_17_ else class79.anInt1401))
                                }
                            }
                        }
                        if (class79.aByte1384.toInt() == 1 && strings != null) {
                            for (i in 4 downTo 0) {
                                if (strings[i] != null && (strings[i].equals(Class274.aClass274_3506!!.method2063(Class348_Sub33.anInt6967, 544), ignoreCase = true))) {
                                    var i_18_: Short = 0
                                    if ((Class132.aPlayer_1907!!.anInt10516) < class79.anInt1361) i_18_ = 2000.toShort()
                                    var i_19_: Short = 0
                                    if (i == 0) i_19_ = 25.toShort()
                                    if (i == 1) i_19_ = 20.toShort()
                                    if (i == 2) i_19_ = 44.toShort()
                                    if (i == 3) i_19_ = 46.toShort()
                                    if (i == 4) i_19_ = 60.toShort()
                                    if (i_19_.toInt() != 0) i_19_ = (i_19_ + i_18_).toShort()
                                    Class368.anInt4510++
                                    Class50_Sub3.method466(false, "<col=ffff00>" + string, 0, (-101).toByte(), false, 0, -1, true, i_19_.toInt(), npc.anInt10290.toLong(), strings[i], npc.anInt10290.toLong(), class79.anInt1401)
                                }
                            }
                        }
                    }
                    Class205.anInt2690++
                    val npcX = (npc.x shr 9) + za_Sub2.regionTileX - npc.aClass79_10505!!.anInt1399 + 1
                    val npcY = (npc.y shr 9) + Class90.regionTileY - npc.aClass79_10505!!.anInt1399 + 1
                    Class50_Sub3.method466(bool, "<col=ffff00>" + string + Loader.getDebug(class79.anInt1344, npcX, npcY, npc.plane.toInt()), 0, (-105).toByte(), bool_14_, 0, -1, true, 1008, npc.anInt10290.toLong(), Class274.aClass274_3505!!.method2063(Class348_Sub33.anInt6967, 544), npc.anInt10290.toLong(), Class286_Sub8.Companion.anInt6299)
                }
            }
        }

        @JvmStatic
        fun method2151(i: Int) {
            anIntArray6228 = null
            if (i > -72) method2148(null, null, 77)
            aCalendar6221 = null
        }

        @JvmStatic
        fun method2152(bool: Boolean) {
            for (i in 0..<Class69.anInt1200) Class318_Sub1_Sub3_Sub4.aClass338Array10330!![i] = null
            anInt6223++
            Class69.anInt1200 = 0
            run {
                var i = 0
                while (Class189.anInt2524 > i) {
                    for (i_20_ in 0..<Class318_Sub7.anInt6451) {
                        var i_21_ = 0
                        while ((i_21_ < Class348_Sub41.anInt7054)) {
                            val class357 = (Class147.aClass357ArrayArrayArray2029!![i]!![i_21_]!![i_20_])
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
            if (bool != false) anIntArray6228 = null
            var i = 0
            while (Class189.anInt2524 > i) {
                for (i_22_ in 0..<Class318_Sub7.anInt6451) {
                    var i_23_ = 0
                    while (Class348_Sub41.anInt7054 > i_23_) {
                        val class357 = (Class147.aClass357ArrayArrayArray2029!![i]!![i_23_]!![i_22_])
                        if (class357 != null) {
                            val bool_24_ = ((Class147.aClass357ArrayArrayArray2029!![0]!![i_23_]!![i_22_]) != null && (Class147.aClass357ArrayArrayArray2029!![0]!![i_23_]!![i_22_]!!.aClass357_4400) != null)
                            if (class357.aShort4409 < 0) {
                                var i_25_ = i_22_
                                var i_26_ = i_22_
                                val i_27_ = i
                                val i_28_ = i
                                var class357_29_ = (Class147.aClass357ArrayArrayArray2029!![i]!![i_23_]!![i_25_ + -1])
                                val i_30_: Int
                                i_30_ = (Class348_Sub1_Sub1.aSArray8801!![i]!!.method3982((-86).toByte(), i_22_, i_23_))
                                while ((i_25_ > 0 && class357_29_ != null && class357_29_.aShort4409 < 0 && (class357_29_.aShort4409 == class357.aShort4409) && (class357.aShort4401 == class357_29_.aShort4401) && ((Class348_Sub1_Sub1.aSArray8801!![i]!!.method3982((-86).toByte(), -1 + i_25_, i_23_)) == i_30_))) {
                                    if (-1 + i_25_ > 0 && i_30_ != (Class348_Sub1_Sub1.aSArray8801!![i]!!.method3982((-86).toByte(), i_25_ + -2, i_23_))) break
                                    i_25_--
                                    class357_29_ = (Class147.aClass357ArrayArrayArray2029!![i]!![i_23_]!![i_25_ + -1])
                                }
                                class357_29_ = (Class147.aClass357ArrayArrayArray2029!![i]!![i_23_]!![1 + i_26_])
                                while (((Class348_Sub41.anInt7054 > i_26_) && class357_29_ != null && class357_29_.aShort4409 < 0 && (class357_29_.aShort4409 == class357.aShort4409) && (class357.aShort4401 == class357_29_.aShort4401) && i_30_ == (Class348_Sub1_Sub1.aSArray8801!![i]!!.method3982((-86).toByte(), i_26_ - -1, i_23_)))) {
                                    if ((Class348_Sub41.anInt7054 > 1 + i_26_) && i_30_ != (Class348_Sub1_Sub1.aSArray8801!![i]!!.method3982((-86).toByte(), i_26_ + 2, i_23_))) break
                                    i_26_++
                                    class357_29_ = (Class147.aClass357ArrayArrayArray2029!![i]!![i_23_]!![i_26_ + 1])
                                }
                                val i_31_ = 1 + (-i_27_ + i_28_)
                                val i_32_ = Class348_Sub1_Sub1.aSArray8801!![if (bool_24_) 1 + i_27_ else i_27_]!!.method3982((-86).toByte(), i_25_, i_23_)
                                val i_33_ = (class357.aShort4409 * i_31_ + i_32_)
                                val i_34_ = (Class348_Sub1_Sub1.aSArray8801!![if (!bool_24_) i_27_ else i_27_ + 1]!!.method3982((-86).toByte(), 1 + i_26_, i_23_))
                                val i_35_ = (i_34_ - -(i_31_ * class357.aShort4409))
                                val i_36_ = i_23_ shl Class362.anInt4459
                                val i_37_ = i_25_ shl Class362.anInt4459
                                val i_38_ = (Class270.anInt3465 + (i_26_ shl Class362.anInt4459))
                                Class318_Sub1_Sub3_Sub4.aClass338Array10330!![Class69.anInt1200++] = (Class338(1, i_28_, class357.aShort4401 + i_36_, class357.aShort4401 + i_36_, class357.aShort4401 + i_36_, class357.aShort4401 + i_36_, i_32_, i_34_, i_35_, i_33_, i_37_, i_38_, i_38_, i_37_))
                                var i_39_ = i_27_
                                while (i_28_ >= i_39_) {
                                    var i_40_ = i_25_
                                    while (i_26_ >= i_40_) {
                                        Class147.aClass357ArrayArrayArray2029!![i_39_]!![i_23_]!![i_40_]!!.aShort4409 = (Class147.aClass357ArrayArrayArray2029!![i_39_]!![i_23_]!![i_40_]!!.aShort4409 * -1).toShort()
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
                                var class357_45_ = (Class147.aClass357ArrayArrayArray2029!![i]!![i_41_ - 1]!![i_22_])
                                val i_46_: Int
                                i_46_ = (Class348_Sub1_Sub1.aSArray8801!![i]!!.method3982((-86).toByte(), i_22_, i_23_))
                                while ((i_41_ > 0 && class357_45_ != null && class357_45_.aShort4398 < 0 && (class357.aShort4398 == class357_45_.aShort4398) && (class357.aShort4397 == class357_45_.aShort4397) && ((Class348_Sub1_Sub1.aSArray8801!![i]!!.method3982((-86).toByte(), i_22_, -1 + i_41_)) == i_46_))) {
                                    if (i_41_ + -1 > 0 && ((Class348_Sub1_Sub1.aSArray8801!![i]!!.method3982((-86).toByte(), i_22_, -2 + i_41_)) != i_46_)) break
                                    i_41_--
                                    class357_45_ = (Class147.aClass357ArrayArrayArray2029!![i]!![i_41_ - 1]!![i_22_])
                                }
                                class357_45_ = (Class147.aClass357ArrayArrayArray2029!![i]!![i_42_ - -1]!![i_22_])
                                while ((i_42_ < Class318_Sub7.anInt6451 && class357_45_ != null && class357_45_.aShort4398 < 0 && (class357.aShort4398 == class357_45_.aShort4398) && (class357_45_.aShort4397 == class357.aShort4397) && ((Class348_Sub1_Sub1.aSArray8801!![i]!!.method3982((-86).toByte(), i_22_, i_42_ + 1)) == i_46_))) {
                                    if (Class318_Sub7.anInt6451 > i_42_ + 1 && ((Class348_Sub1_Sub1.aSArray8801!![i]!!.method3982((-86).toByte(), i_22_, 2 + i_42_)) != i_46_)) break
                                    i_42_++
                                    class357_45_ = (Class147.aClass357ArrayArrayArray2029!![i]!![1 + i_42_]!![i_22_])
                                }
                                val i_47_ = 1 + -i_43_ + i_44_
                                val i_48_ = Class348_Sub1_Sub1.aSArray8801!![if (!bool_24_) i_43_ else 1 + i_43_]!!.method3982((-86).toByte(), i_22_, i_41_)
                                val i_49_ = (i_48_ - -(i_47_ * class357.aShort4398))
                                val i_50_ = (Class348_Sub1_Sub1.aSArray8801!![if (!bool_24_) i_43_ else 1 + i_43_]!!.method3982((-86).toByte(), i_22_, 1 + i_42_))
                                val i_51_ = (class357.aShort4398 * i_47_ + i_50_)
                                val i_52_ = i_41_ shl Class362.anInt4459
                                val i_53_ = ((i_42_ shl Class362.anInt4459) + Class270.anInt3465)
                                val i_54_ = i_22_ shl Class362.anInt4459
                                Class318_Sub1_Sub3_Sub4.aClass338Array10330!![Class69.anInt1200++] = (Class338(2, i_44_, i_52_, i_53_, i_53_, i_52_, i_48_, i_50_, i_51_, i_49_, i_54_ + class357.aShort4397, i_54_ + class357.aShort4397, class357.aShort4397 + i_54_, (i_54_ - -class357.aShort4397)))
                                for (i_55_ in i_43_..i_44_) {
                                    var i_56_ = i_41_
                                    while ((i_42_ >= i_56_)) {
                                        Class147.aClass357ArrayArrayArray2029!![i_55_]!![i_56_]!![i_22_]!!.aShort4398 = (Class147.aClass357ArrayArrayArray2029!![i_55_]!![i_56_]!![i_22_]!!.aShort4398 * -1).toShort()
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
            Class50_Sub1.aBoolean5226 = true
        }

        @JvmStatic
        fun method2153(i: Int) {
            anInt6214++
            if (!Class160.aBoolean2130 && i <= -37) {
                Class160.aBoolean2130 = true
                Class205.aFloat2687 += (-Class205.aFloat2687 + 24.0f) / 2.0f
                Class369_Sub3_Sub1.aBoolean10174 = true
            }
        }
    }
}
