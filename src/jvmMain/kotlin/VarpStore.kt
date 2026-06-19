import ChatEffectsOptionStateStatics.method1730
import MidiSequencePlayerStatics.method2862
import FixedFunctionWaterPassStatics.method3548
import WorldMapElementStatics.method181
import GameClock.method599
import TrigLookupTablesStatics.method726
import NativeTerrainTileStatics.method4004
import VarpStoreStatics.method1308
import VarpStoreStatics.anInt5065
import VarpStoreStatics.anInt5066
import VarpStoreStatics.anInt5068
import VarpStoreStatics.anInt5069
import VarpStoreStatics.anInt5071
import VarpStoreStatics.anInt5073
import VarpStoreStatics.anInt5074
import VarpStoreStatics.anInt5076
import VarpStoreStatics.anInt5081

/* Class170 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class VarpStore : VarResolver {
    var anIntArray5063: IntArray
    private var aHashtable_5070 = Hashtable(128)
    private val anIntArray5078: IntArray
    fun method1305(i: Byte, bool: Boolean): Int {
        anInt5071++
        if (i >= -124) method1308(-105, 89, -65, -52, 76.toByte(), 37, -61, 73)
        val l = method599(-79)
        var class348_sub14 = (if (bool) aHashtable_5070.method3484(0) as LongKeyNode? else aHashtable_5070.method3482(0) as LongKeyNode?)
        while (class348_sub14 != null) {
            if (l > (class348_sub14.aLong6762 and 0x3fffffffffffffffL)) {
                if ((0x4000000000000000L and class348_sub14.aLong6762) != 0L) {
                    val i_0_ = class348_sub14.aLong4291.toInt()
                    this.anIntArray5063[i_0_] = anIntArray5078[i_0_]
                    class348_sub14.method2715(31.toByte())
                    return i_0_
                }
                class348_sub14.method2715(75.toByte())
            }
            class348_sub14 = aHashtable_5070.method3482(0) as LongKeyNode?
        }
        return -1
    }

    fun method1306(i: Byte, i_1_: Int, i_2_: Int) {
        if (i.toInt() == -78) {
            anInt5066++
            this.anIntArray5063[i_2_] = i_1_
            var class348_sub14 = (aHashtable_5070.method3480(i_2_.toLong(), -6008) as LongKeyNode?)
            if (class348_sub14 == null) {
                class348_sub14 = LongKeyNode(500L + method599(-122))
                aHashtable_5070.method3483(73.toByte(), i_2_.toLong(), class348_sub14)
            } else class348_sub14.aLong6762 = method599(-88) - -500L
        }
    }

    override fun method62(i: Int, i_3_: Int): Int {
        anInt5068++
        val class146 = RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1446(i, -1)
        val i_4_ = class146!!.anInt2019
        if (i_3_ != -65536) return -52
        val i_5_ = class146.anInt2016
        val i_6_ = class146.anInt2020
        val i_7_ = ModelFacePriorityNodeStatics.anIntArray1885!![-i_5_ + i_6_]
        return this.anIntArray5063[i_4_] shr i_5_ and i_7_
    }

    fun method1307(i: Int, i_8_: Int, i_9_: Int) {
        var i_9_ = i_9_
        anInt5074++
        val class146 = RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1446(i, -1)
        val i_10_ = class146!!.anInt2019
        val i_11_ = class146.anInt2016
        val i_12_ = class146.anInt2020
        var i_13_ = ModelFacePriorityNodeStatics.anIntArray1885!![-i_11_ + i_12_]
        if (i_8_ < (i_9_.inv()) || i_13_ < i_9_) i_9_ = 0
        i_13_ = i_13_ shl i_11_
        method1306((-78).toByte(), i_9_ shl i_11_ and i_13_ or ((this.anIntArray5063[i_10_]) and (i_13_.inv())), i_10_)
    }

    fun method1313(i: Byte, i_24_: Int, i_25_: Int) {
        anInt5073++
        if (i.toInt() != 42) anInt5065 = -16
        anIntArray5078[i_25_] = i_24_
        var class348_sub14 = (aHashtable_5070.method3480(i_25_.toLong(), i + -6050) as LongKeyNode?)
        if (class348_sub14 == null) {
            class348_sub14 = LongKeyNode(4611686018427387905L)
            aHashtable_5070.method3483(19.toByte(), i_25_.toLong(), class348_sub14)
        } else if (class348_sub14.aLong6762 != 4611686018427387905L) class348_sub14.aLong6762 = 0x4000000000000000L or 500L + method599(-108)
    }

    fun method1314(i: Byte) {
        var i_26_ = 0
        while ((i_26_ < NormalMapGeneratorStatics.aParticleAmountCache_3453!!.anInt2845)) {
            val class159 = NormalMapGeneratorStatics.aParticleAmountCache_3453!!.method1588(-105, i_26_)
            if (class159 != null && class159.anInt2125 == 0) {
                anIntArray5078[i_26_] = 0
                this.anIntArray5063[i_26_] = 0
            }
            i_26_++
        }
        anInt5076++
        aHashtable_5070 = Hashtable(128)
        val i_27_ = -69 % ((25 - i) / 39)
    }

    override fun method61(i: Int, i_28_: Byte): Int {
        anInt5081++
        if (i_28_.toInt() != -16) anInt5065 = 51
        return this.anIntArray5063[i]
    }

    fun method1316(i: Byte, i_30_: Int, i_31_: Int) {
        var i_31_ = i_31_
        anInt5069++
        val class146 = RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1446(i_30_, -1)
        val i_32_ = class146!!.anInt2019
        val i_33_ = class146.anInt2016
        if (i < -56) {
            val i_34_ = class146.anInt2020
            var i_35_ = ModelFacePriorityNodeStatics.anIntArray1885!![i_34_ - i_33_]
            if (i_31_ < 0 || i_35_ < i_31_) i_31_ = 0
            i_35_ = i_35_ shl i_33_
            method1313(42.toByte(), (i_31_ shl i_33_ and i_35_ or ((i_35_.inv()) and anIntArray5078[i_32_])), i_32_)
        }
    }

    init {
        this.anIntArray5063 = IntArray(NormalMapGeneratorStatics.aParticleAmountCache_3453!!.anInt2845)
        anIntArray5078 = IntArray(NormalMapGeneratorStatics.aParticleAmountCache_3453!!.anInt2845)
    }
}
