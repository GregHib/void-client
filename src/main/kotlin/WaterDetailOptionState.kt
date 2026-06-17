class WaterDetailOptionState : GraphicsOptionState {
    fun method1778(i: Int): Int {
        if (i != -32350) aModelLightingConfig_5990 = null
        anInt5984++
        return this.anInt3138
    }

    override fun method1716(bool: Boolean) {
        if (this.aClass348_Sub51_3136.aClass239_Sub3_7222!!.method1735(bool) && this.anInt3138 == 2) this.anInt3138 = 1
        anInt5988++
        if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1712(i: Int, i_8_: Int) {
        this.anInt3138 = i_8_
        anInt5987++
        val i_9_ = -73 / ((82 - i) / 35)
    }

    override fun method1710(i: Int): Int {
        anInt5982++
        if (i != 20014) aSoundEnvelopeArray5993 = null
        return 2
    }

    override fun method1714(i: Int, i_10_: Int): Int {
        if (i != 3) return 23
        anInt5986++
        return 1
    }

    companion object {
        @JvmField
        var anInt5982: Int = 0
        @JvmField
        var anInt5983: Int = 0
        @JvmField
        var anInt5984: Int = 0
        @JvmField
        var anInt5985: Int = 0
        @JvmField
        var anInt5986: Int = 0
        @JvmField
        var anInt5987: Int = 0
        @JvmField
        var anInt5988: Int = 0
        var aConfigFlagUtil_5989: ConfigFlagUtil? = ConfigFlagUtil()
        @JvmField
        var aModelLightingConfig_5990: ModelLightingConfig? = null
        @JvmField
        var anIntArrayArray5991: Array<IntArray?>? = arrayOfNulls<IntArray>(6)
        @JvmField
        var aIntRange_5992: IntRange? = IntRange(17, 4)
        @JvmField
        var aSoundEnvelopeArray5993: Array<SoundEnvelope?>? = null
        @JvmField
        var anInt5994: Int = 0
        @JvmField
        var aClass259_5995: Class259? = null

        @JvmStatic
        fun method1779(i: Byte) {
            anInt5985++
            Class364.method3517(73)
            Class262.aModelLightingConfigArrayArray3335 = null
            Class60.aRenderer1098 = null
            if (i <= 89) anInt5994 = -75
            SceneryDetailOptionState.aClass299_6098 = null
            HeapInfoRecord.aClass299_4938 = null
            Class348_Sub42_Sub10.aClass299_9571 = null
        }

        @JvmStatic
        fun method1780(i: Int) {
            aIntRange_5992 = null
            val i_0_ = 108 % ((-24 - i) / 54)
            aConfigFlagUtil_5989 = null
            anIntArrayArray5991 = null
            aClass259_5995 = null
            aSoundEnvelopeArray5993 = null
            aModelLightingConfig_5990 = null
        }

        @JvmStatic
        fun method1781(i: Int, i_1_: Int, i_2_: Int): Int {
            anInt5983++
            if (Class348_Sub31.anInt6923 == -1) return 1
            if (i != Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)) {
                Class258_Sub3_Sub1.method1971(-2, Class274.aClass274_3496!!.method2063(Class348_Sub33.anInt6967, 544), true, i)
                if (i != Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)) return -1
            }
            try {
                val dimension = Class305.aCanvas3869!!.getSize()
                Class362.method3511(true, GameAppletFrame.aClass324_20, ParticleEmitterFactory.aFontDefinition_3179, Class274.aClass274_3496!!.method2063(Class348_Sub33.anInt6967, 544), 2, Class348_Sub8.aRenderer6654)
                val class124 = Class300.method2277(0, RasterSprite.aClass45_5207!!, Class348_Sub31.anInt6923, -1)
                val l = Class62.method599(-88)
                Class348_Sub8.aRenderer6654!!.la()
                SettingsCrcWriter.aAbstractCameraTransform_2123!!.method894(0, Class348_Sub23_Sub2.anInt9037, 0)
                Class348_Sub8.aRenderer6654!!.method3638(SettingsCrcWriter.aAbstractCameraTransform_2123)
                Class348_Sub8.aRenderer6654!!.DA(dimension.width / 2, dimension.height / 2, 512, 512)
                Class348_Sub8.aRenderer6654!!.xa(1.0f)
                if (i_1_ >= -66) aModelLightingConfig_5990 = null
                Class348_Sub8.aRenderer6654!!.ZA(16777215, 0.5f, 0.5f, 20.0f, -50.0f, 30.0f)
                val class64 = Class348_Sub8.aRenderer6654!!.method3625(class124, 2048, 64, 64, 768)
                var i_3_ = 0
                while_80_@ for (i_4_ in 0..499) {
                    Class348_Sub8.aRenderer6654!!.GA(0)
                    Class348_Sub8.aRenderer6654!!.ya()
                    for (i_5_ in 15 downTo 0) {
                        for (i_6_ in 0..i_5_) {
                            Class50_Sub1.aAbstractCameraTransform_5209!!.method894(((-(i_5_.toFloat() / 2.0f) + i_6_.toFloat()) * Class270.anInt3465.toFloat()).toInt(), 0, (i_5_ + 1) * Class270.anInt3465)
                            i_3_++
                            class64.method615(Class50_Sub1.aAbstractCameraTransform_5209, null, 0)
                            if (Class62.method599(-105) + -l >= i_2_.toLong()) break@while_80_
                        }
                    }
                }
                Class348_Sub8.aRenderer6654!!.method3633()
                val l_7_ = (1000 * i_3_).toLong() / (Class62.method599(-86) + -l)
                Class348_Sub8.aRenderer6654!!.GA(0)
                Class348_Sub8.aRenderer6654!!.ya()
                return l_7_.toInt()
            } catch (throwable: Throwable) {
                throwable.printStackTrace()
                return -1
            }
        }
    }
}
