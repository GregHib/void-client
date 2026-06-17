import Class62.method599

/* Class195 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RenderableGroup internal constructor(typedRecordTable: TypedRecordTable?, dualMaterialContainer: DualMaterialContainer?) : Interface16 {
    private val aTypedRecordTable_5006: TypedRecordTable?
    private var aRenderer5010: Renderer? = null
    private var aBoolean5011 = false
    private val anInterface1Array5012: Array<Interface1?>
    override fun method57(i: Int) {
        anInt5004++
        if (aRenderer5010 !== FacingDirectionNode.aRenderer6654) {
            aRenderer5010 = FacingDirectionNode.aRenderer6654
            aBoolean5011 = true
        }
        aRenderer5010!!.GA(0)
        val interface1s = anInterface1Array5012
        var i_0_ = 0
        while (interface1s.size > i_0_) {
            val interface1 = interface1s[i_0_]
            if (interface1 != null) interface1.method7(10286)
            i_0_++
        }
        if (i <= 84) method56(2.toByte(), 40L)
    }

    override fun method58(bool: Boolean, i: Int) {
        var bool = bool
        anInt5018++
        bool = true
        val interface1s = anInterface1Array5012
        var i_1_ = 0
        while (interface1s.size > i_1_) {
            val interface1 = interface1s[i_1_]
            if (interface1 != null) interface1.method9((-49).toByte(), bool || aBoolean5011)
            i_1_++
        }
        if (i > -69) method1447(-38)
        aBoolean5011 = false
    }

    override fun method59(i: Int) {
        anInt5008++
        if (i != -9719) aClass351_5015 = null
    }

    override fun method55(i: Byte): Int {
        anInt5009++
        if (i.toInt() != -58) method58(false, -122)
        return aTypedRecordTable_5006!!.anInt3687
    }

    override fun method56(i: Byte, l: Long): Boolean {
        try {
            anInt5005++
            if (i < 30) method1449(-81, 10, -115)
            return l - -aTypedRecordTable_5006!!.anInt3690.toLong() <= method599(-97)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, "qt.I(" + i + ',' + l + ')')
        }
    }

    override fun method60(i: Int): Int {
        if (i != -19079) method58(false, 116)
        anInt5014++
        var i_4_ = 0
        val interface1s = anInterface1Array5012
        var i_5_ = 0
        while (interface1s.size > i_5_) {
            val interface1 = interface1s[i_5_]
            if (interface1 == null || interface1.method8((-121).toByte())) i_4_++
            i_5_++
        }
        return i_4_ * 100 / anInterface1Array5012.size
    }

    init {
        try {
            aTypedRecordTable_5006 = typedRecordTable
            anInterface1Array5012 = arrayOfNulls<Interface1>((aTypedRecordTable_5006!!.anInterface12Array3688).size)
            var i = 0
            while ((i < anInterface1Array5012.size)) {
                anInterface1Array5012[i] = dualMaterialContainer!!.method1000(true, (aTypedRecordTable_5006.anInterface12Array3688[i]))
                i++
            }
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("qt.<init>(" + (if (typedRecordTable != null) "{...}" else "null") + ',' + (if (dualMaterialContainer != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt5003: Int = 0
        var anInt5004: Int = 0
        var anInt5005: Int = 0
        var anIntArray5007: IntArray? = IntArray(4)
        var anInt5008: Int = 0
        var anInt5009: Int = 0
        var aBoolean5013: Boolean = false
        var anInt5014: Int = 0
        @JvmField
        var aClass351_5015: Class351?
        @JvmField
        var anInt5016: Int = 0
        var aPrivilegedOperationWorker_5017: PrivilegedOperationWorker? = null
        var anInt5018: Int = 0
        @JvmField
        var anInt5019: Int

        @JvmStatic
        fun method1447(i: Int) {
            if (i == 76) {
                anIntArray5007 = null
                aPrivilegedOperationWorker_5017 = null
                aClass351_5015 = null
            }
        }

        fun method1448(i: Int) {
            anInt5003++
            if (i <= -55) FlipTextureNode.aClass348_Sub42_Sub12_9144 = ContactEntry((LocalizedText.aLocalizedText_3487!!.method2063(AnimationFrameDefinition.anInt6967, 544)), "", Class362.anInt4458, 1004, -1, 0L, 0, 0, true, false, 0L, true)
        }

        @JvmStatic
        fun method1449(i: Int, i_2_: Int, i_3_: Int): WidgetNodeLink? {
            val class357 = HintArrowOrMessage.aClass357ArrayArrayArray2029!![i]!![i_2_]!![i_3_]
            if (class357 == null) return null
            return class357.aWidgetNodeLink_4396
        }

        init {
            aClass351_5015 = Class351(76, 4)
            anInt5019 = 0
        }
    }
}
