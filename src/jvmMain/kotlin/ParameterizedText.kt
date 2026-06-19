import WhirlpoolHash.Companion.method2057
import ParticleSystemRenderer.Companion.method2296
import ModelVertexColorBuffer.Companion.method2739
import TurbulenceTextureNode.Companion.method3113
import AbstractBloomEffect.Companion.method2752

/* Class348_Sub42_Sub10 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParameterizedText : HashLinkedListNode() {
    var aBoolean9562: Boolean = true
    private var aStringArray9564: Array<String?>? = null
    private lateinit var anIntArrayArray9565: Array<IntArray?>
    var anIntArray9566: IntArray? = null
    @JvmField
    var aCompiledScriptCache_9567: CompiledScriptCache? = null
    private var anIntArray9574: IntArray? = null
    fun method3209(bool: Boolean) {
        if (bool != false) anInt9577 = 26
        anInt9563++
        if (this.anIntArray9566 != null) {
            var i = 0
            while (this.anIntArray9566!!.size > i) {
                this.anIntArray9566!![i] = method2057((this.anIntArray9566!![i]), 32768)
                i++
            }
        }
    }

    fun method3210(i: Byte, `is`: IntArray?, class348_sub49: ByteBuffer?) {
        while_221_@ do {
            try {
                anInt9560++
                val i_0_ = -107 / ((-71 - i) / 50)
                if (anIntArray9574 != null) {
                    var i_1_ = 0
                    while (true) {
                        if (anIntArray9574!!.size <= i_1_) break@while_221_
                        if (i_1_ >= `is`!!.size) break
                        val i_2_ = method3212(0, i_1_)!!.anInt1945
                        if (i_2_ > 0) class348_sub49!!.method3357(i_2_, `is`[i_1_].toLong(), 116.toByte())
                        i_1_++
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("td.C(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (class348_sub49 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    fun method3212(i: Int, i_4_: Int): RectangleRegion? {
        anInt9561++
        if (i != 0) anIntArray9572 = null
        if (anIntArray9574 == null || i_4_ < 0 || anIntArray9574!!.size < i_4_) return null
        return method2752(anIntArray9574!![i_4_], 0)
    }

    fun method3213(i: Int, i_5_: Int, bool: Boolean): Int {
        anInt9576++
        if (bool != true) method3213(41, 104, true)
        if (anIntArray9574 == null || i_5_ < 0 || i_5_ > anIntArray9574!!.size) return -1
        if (anIntArrayArray9565[i_5_] == null || i < 0 || (i > anIntArrayArray9565[i_5_]!!.size)) return -1
        return anIntArrayArray9565[i_5_]!![i]
    }

    private fun method3214(i: Int, class348_sub49: ByteBuffer, i_6_: Int) {
        if (i_6_ == 60) {
            if (i != 1) {
                if (i == 2) {
                    val i_7_ = class348_sub49.readUnsignedByte(255)
                    this.anIntArray9566 = IntArray(i_7_)
                    for (i_8_ in 0..<i_7_) this.anIntArray9566!![i_8_] = class348_sub49.readUnsignedShort(i_6_ + 842397884)
                } else if (i == 3) {
                    val i_9_ = class348_sub49.readUnsignedByte(i_6_ + 195)
                    anIntArrayArray9565 = arrayOfNulls<IntArray>(i_9_)
                    anIntArray9574 = IntArray(i_9_)
                    var i_10_ = 0
                    while (i_9_ > i_10_) {
                        val i_11_ = class348_sub49.readUnsignedShort(842397944)
                        val class138 = method2752(i_11_, i_6_ + -60)
                        if (class138 != null) {
                            anIntArray9574!![i_10_] = i_11_
                            anIntArrayArray9565[i_10_] = IntArray(class138.anInt1944)
                            var i_12_ = 0
                            while ((class138.anInt1944 > i_12_)) {
                                anIntArrayArray9565[i_10_]!![i_12_] = class348_sub49.readUnsignedShort(i_6_ + 842397884)
                                i_12_++
                            }
                        }
                        i_10_++
                    }
                } else if (i == 4) this.aBoolean9562 = false
            } else aStringArray9564 = (method3113('<', true, class348_sub49.readString((-82).toByte())))
            anInt9575++
        }
    }

    fun method3215(i: Byte): Int {
        anInt9570++
        if (i > -32) this.anIntArray9566 = null
        if (anIntArray9574 == null) return 0
        return anIntArray9574!!.size
    }

    fun method3216(class348_sub49: ByteBuffer, i: Byte): String {
        anInt9578++
        if (i < 33) method3219(-91)
        val stringbuffer = StringBuffer(80)
        if (anIntArray9574 != null) {
            for (i_13_ in anIntArray9574!!.indices) {
                stringbuffer.append(aStringArray9564!![i_13_])
                stringbuffer.append(this.aCompiledScriptCache_9567!!.method3472((class348_sub49.method3368((method2752(anIntArray9574!![i_13_], 0)!!.anInt1943), 3060)), anIntArrayArray9565[i_13_], -1, method3212(0, i_13_)))
            }
        }
        stringbuffer.append(aStringArray9564!![aStringArray9564!!.size + -1])
        return stringbuffer.toString()
    }

    fun method3218(class348_sub49: ByteBuffer, i: Int) {
        anInt9568++
        while (true) {
            val i_14_ = class348_sub49.readUnsignedByte(i xor 0xff)
            if (i_14_ == 0) break
            method3214(i_14_, class348_sub49, 60)
        }
        if (i != 0) Companion.method3217((-66).toByte())
    }

    fun method3219(i: Int): String {
        anInt9573++
        if (i < 66) aStringArray9564 = null
        val stringbuffer = StringBuffer(80)
        if (aStringArray9564 == null) return ""
        stringbuffer.append(aStringArray9564!![0])
        for (i_15_ in 1..<aStringArray9564!!.size) {
            stringbuffer.append("...")
            stringbuffer.append(aStringArray9564!![i_15_])
        }
        return stringbuffer.toString()
    }

    companion object {
        var anInt9560: Int = 0
        var anInt9561: Int = 0
        var anInt9563: Int = 0
        var anInt9568: Int = 0
        var anInt9569: Int = 0
        var anInt9570: Int = 0
        @JvmField
        var aCircleRasterizer_9571: CircleRasterizer? = null
        var anIntArray9572: IntArray?
        var anInt9573: Int = 0
        var anInt9575: Int = 0
        var anInt9576: Int = 0
        var anInt9577: Int = 0
        var anInt9578: Int = 0

        fun method3211(i: Byte) {
            NpcType.aClient1367!!.method83(true)
            anInt9569++
            method2739(0)
            RegionSceneLoader.anInt3699 = 0
            SineWaveTextureNode.aIntRange_9456 = null
            StringCacheNode.anInt7213 = 0
            GraphicsOptionState.aIntRange_3145 = null
            CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
            val i_3_ = -122 % ((i - 13) / 45)
            AbstractGameSocketStatics.aIntRange_3133 = null
            method2296(-99)
            HslAdjustTextureNode.anInt9383 = 0
            MinimapShapeDrawer.aString863 = null
            ByteArrayPool.anInt496 = 0
            HostPingThread.aWorldListEntryArray2261 = null
            MinimapSpriteRenderer.anInt4930 = 0
        }

        @JvmStatic
        fun method3217(i: Byte) {
            if (i.toInt() != 61) Companion.method3211((-95).toByte())
            aCircleRasterizer_9571 = null
            anIntArray9572 = null
        }

        init {
            anIntArray9572 = intArrayOf(16, 32, 64, 128)
        }
    }
}
