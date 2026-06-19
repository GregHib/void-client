/* Class50_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MinimapSquareDrawer internal constructor(private var anInt5214: Int, private val anInt5212: Int, private val anInt5213: Int, private val anInt5222: Int, i_9_: Int, i_10_: Int, i_11_: Int) : MinimapShapeDrawer(i_9_, i_10_, i_11_) {
    public override fun method455(i: Int, i_0_: Int, i_1_: Int) {
        anInt5220++
        if (i_1_ >= -98) aBoolean5221 = false
        val i_2_ = anInt5214 * i shr 12
        val i_3_ = i * anInt5213 shr 12
        val i_4_ = anInt5212 * i_0_ shr 12
        val i_5_ = i_0_ * anInt5222 shr 12
        method2267(10499, i_5_, i_2_, this.anInt865, this.anInt864, this.anInt862, i_4_, i_3_)
    }

    public override fun method457(i: Int, i_12_: Int, i_13_: Int) {
        anInt5211++
        if (i_13_ >= -29) method460(-42)
    }

    public override fun method456(i: Int, i_14_: Int, i_15_: Int) {
        if (i <= 87) anInt5214 = -17
        anInt5218++
        val i_16_ = i_14_ * anInt5214 shr 12
        val i_17_ = anInt5213 * i_14_ shr 12
        val i_18_ = anInt5212 * i_15_ shr 12
        val i_19_ = i_15_ * anInt5222 shr 12
        Renderer.method3641(i_18_, i_19_, (-75).toByte(), this.anInt864, i_17_, i_16_)
    }

    companion object {
        @JvmField
        var aAbstractCameraTransform_5209: AbstractCameraTransform? = null
        @JvmField
        var anInt5210: Int = 0
        @JvmField
        var anInt5211: Int = 0
        @JvmField
        var anInt5216: Int = 0
        var aFontMetaRef_5217: FontMetaRef?
        @JvmField
        var anInt5218: Int = 0
        @JvmField
        var aBoolean5219: Boolean = true
        @JvmField
        var anInt5220: Int = 0
        @JvmField
        var aBoolean5221: Boolean = false
        @JvmField
        var aStringArray5223: Array<String?>? = null
        @JvmField
        var aBoolean5224: Boolean
        @JvmField
        var aBooleanArrayArray5225: Array<BooleanArray?>?
        var aBoolean5226: Boolean

        @JvmStatic
        fun method460(i: Int) {
            if (i != 2) method460(-52)
            aAbstractCameraTransform_5209 = null
            aBooleanArrayArray5225 = null
            aStringArray5223 = null
            aFontMetaRef_5217 = null
        }


        @JvmStatic
        fun method462(i: Byte, i_20_: Int): Char {
            anInt5216++
            var i_21_ = 0xff and i.toInt()
            require(i_21_ != 0) { "Non cp1252 character 0x" + i_21_.toString(16) + " provided" }
            if (i_21_ >= 128 && i_21_ < 160) {
                var i_22_ = ByteBuffer.aCharArray625!![i_21_ + -128].code
                if (i_22_ == 0) i_22_ = 63
                i_21_ = i_22_
            }
            return i_21_.toChar()
        }

        @JvmStatic
        fun method463(class348_sub47: OutgoingPacketNode, bool: Boolean): IntArray {
            anInt5210++
            val class348_sub49 = ByteBuffer(518)
            val `is` = IntArray(4)
            for (i in 0..3) `is`[i] = (Math.random() * 9.9999999E7).toInt()
            class348_sub49.writeByte(bool, 10)
            class348_sub49.writeInt(114.toByte(), `is`[0])
            class348_sub49.writeInt(97.toByte(), `is`[1])
            class348_sub49.writeInt(109.toByte(), `is`[2])
            class348_sub49.writeInt(105.toByte(), `is`[3])
            for (i in 0..9) class348_sub49.writeInt(120.toByte(), (9.9999999E7 * Math.random()).toInt())
            class348_sub49.writeShort(107.toByte(), (9.9999999E7 * Math.random()).toInt())
            class348_sub49.method3390(AbstractFrameBufferSurface.aBigInteger6921, (-98).toByte(), SceneNodeDeque.aBigInteger8762)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, 80)
            return `is`
        }

        init {
            aFontMetaRef_5217 = FontMetaRef(17, 8)
            aBooleanArrayArray5225 = (arrayOf<BooleanArray?>(
                BooleanArray(4),
                booleanArrayOf(false, true, true, false),
                booleanArrayOf(true, false, true, false),
                booleanArrayOf(true, false, true, false),
                booleanArrayOf(false, false, true, false),
                booleanArrayOf(false, false, true, false),
                booleanArrayOf(true, false, true, false),
                booleanArrayOf(true, false, false, true),
                booleanArrayOf(true, false, false, true),
                booleanArrayOf(true, true, false, false),
                BooleanArray(4),
                booleanArrayOf(false, true, false, true),
                BooleanArray(4)
            ))
            aBoolean5226 = false
            aBoolean5224 = false
        }
        var anInt6324: Int = 0
        fun method2267(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
            anInt6324++
            if (i_6_ == i_0_) Npc.method2441(i_2_, i_6_, i_4_, -22728, i_5_, i_3_, i_1_)
            else if (WorldMapLabel.anInt4960 > -i_6_ + i_1_ || i_6_ + i_1_ > CameraNodeList.anInt1745 || -i_0_ + i_5_ < LocalPlayerState.anInt1910 || i_0_ + i_5_ > WidgetTextConfig.anInt513) method3041(i_6_, i_1_, i_5_, i xor 0x2903.inv(), i_0_, i_3_, i_2_, i_4_)
            else AbstractFrameBufferSurface.method3012(i_0_, i_3_, i_6_, i_2_, i_1_, (-117).toByte(), i_5_, i_4_)
        }

        var anInt7030: Int = 0
        fun method3041(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
            anInt7030++
            var i_12_ = 0
            var i_13_ = i_8_
            var i_14_ = 0
            val i_15_ = -i_11_ + i
            val i_16_ = i_8_ - i_11_
            val i_17_ = i * i
            val i_18_ = i_8_ * i_8_
            val i_19_ = i_15_ * i_15_
            val i_20_ = i_16_ * i_16_
            val i_21_ = i_18_ shl 1
            val i_22_ = i_17_ shl 1
            val i_23_ = i_20_ shl 1
            val i_24_ = i_19_ shl 1
            val i_25_ = i_8_ shl 1
            val i_26_ = i_16_ shl 1
            var i_27_ = i_21_ + i_17_ * (-i_25_ + 1)
            var i_28_ = i_18_ + -(i_22_ * (-1 + i_25_))
            var i_29_ = (1 - i_26_) * i_19_ + i_23_
            var i_30_ = i_20_ + -(i_24_ * (-1 + i_26_))
            val i_31_ = i_17_ shl 2
            val i_32_ = i_18_ shl 2
            val i_33_ = i_19_ shl 2
            val i_34_ = i_20_ shl 2
            var i_35_ = 3 * i_21_
            var i_36_ = i_22_ * (-3 + i_25_)
            var i_37_ = 3 * i_23_
            var i_38_ = (i_26_ - 3) * i_24_
            var i_39_ = i_32_
            var i_40_ = i_31_ * (i_7_ + i_8_)
            var i_41_ = i_34_
            var i_42_ = i_33_ * (-1 + i_16_)
            if (i_6_ >= LocalPlayerState.anInt1910 && WidgetTextConfig.anInt513 >= i_6_) {
                val `is` = WidgetDefinition.anIntArrayArray255!![i_6_]!!
                val i_43_ = WhirlpoolHash.method831(CameraNodeList.anInt1745, i_5_ + -i, WorldMapLabel.anInt4960, 77)
                val i_44_ = WhirlpoolHash.method831(CameraNodeList.anInt1745, i + i_5_, WorldMapLabel.anInt4960, -68)
                val i_45_ = WhirlpoolHash.method831(CameraNodeList.anInt1745, i_5_ + -i_15_, WorldMapLabel.anInt4960, i_7_ + -115)
                val i_46_ = WhirlpoolHash.method831(CameraNodeList.anInt1745, i_5_ + i_15_, WorldMapLabel.anInt4960, 97)
                GlElementArrayBuffer.method1156(-27, i_45_, `is`, i_43_, i_10_)
                GlElementArrayBuffer.method1156(-27, i_46_, `is`, i_45_, i_9_)
                GlElementArrayBuffer.method1156(-27, i_44_, `is`, i_46_, i_10_)
            }
            while (i_13_ > 0) {
                val bool = i_16_ >= i_13_
                if (bool) {
                    if (i_29_ < 0) {
                        while (i_29_ < 0) {
                            i_29_ += i_37_
                            i_30_ += i_41_
                            i_41_ += i_34_
                            i_14_++
                            i_37_ += i_34_
                        }
                    }
                    if (i_30_ < 0) {
                        i_29_ += i_37_
                        i_30_ += i_41_
                        i_41_ += i_34_
                        i_37_ += i_34_
                        i_14_++
                    }
                    i_29_ += -i_42_
                    i_30_ += -i_38_
                    i_42_ -= i_33_
                    i_38_ -= i_33_
                }
                if (i_27_ < 0) {
                    while (i_27_ < 0) {
                        i_27_ += i_35_
                        i_28_ += i_39_
                        i_12_++
                        i_39_ += i_32_
                        i_35_ += i_32_
                    }
                }
                if (i_28_ < 0) {
                    i_28_ += i_39_
                    i_27_ += i_35_
                    i_35_ += i_32_
                    i_12_++
                    i_39_ += i_32_
                }
                i_27_ += -i_40_
                i_28_ += -i_36_
                i_13_--
                i_36_ -= i_31_
                i_40_ -= i_31_
                val i_47_ = -i_13_ + i_6_
                val i_48_ = i_13_ + i_6_
                if (i_48_ >= LocalPlayerState.anInt1910 && WidgetTextConfig.anInt513 >= i_47_) {
                    val i_49_ = WhirlpoolHash.method831(CameraNodeList.anInt1745, i_12_ + i_5_, WorldMapLabel.anInt4960, 36)
                    val i_50_ = WhirlpoolHash.method831(CameraNodeList.anInt1745, -i_12_ + i_5_, WorldMapLabel.anInt4960, 97)
                    if (bool) {
                        val i_51_ = WhirlpoolHash.method831(CameraNodeList.anInt1745, i_5_ - -i_14_, WorldMapLabel.anInt4960, i_7_ xor 0x5c.inv())
                        val i_52_ = WhirlpoolHash.method831(CameraNodeList.anInt1745, -i_14_ + i_5_, WorldMapLabel.anInt4960, 32)
                        if (LocalPlayerState.anInt1910 <= i_47_) {
                            val `is` = WidgetDefinition.anIntArrayArray255!![i_47_]!!
                            GlElementArrayBuffer.method1156(-27, i_52_, `is`, i_50_, i_10_)
                            GlElementArrayBuffer.method1156(-27, i_51_, `is`, i_52_, i_9_)
                            GlElementArrayBuffer.method1156(i_7_ + -26, i_49_, `is`, i_51_, i_10_)
                        }
                        if (WidgetTextConfig.anInt513 >= i_48_) {
                            val `is` = WidgetDefinition.anIntArrayArray255!![i_48_]!!
                            GlElementArrayBuffer.method1156(i_7_ xor 0x1a, i_52_, `is`, i_50_, i_10_)
                            GlElementArrayBuffer.method1156(-27, i_51_, `is`, i_52_, i_9_)
                            GlElementArrayBuffer.method1156(-27, i_49_, `is`, i_51_, i_10_)
                        }
                    } else {
                        if (i_47_ >= LocalPlayerState.anInt1910) GlElementArrayBuffer.method1156(-27, i_49_, (WidgetDefinition.anIntArrayArray255!![i_47_]!!), i_50_, i_10_)
                        if (i_48_ <= WidgetTextConfig.anInt513) GlElementArrayBuffer.method1156(-27, i_49_, (WidgetDefinition.anIntArrayArray255!![i_48_]!!), i_50_, i_10_)
                    }
                }
            }
        }
    }
}
