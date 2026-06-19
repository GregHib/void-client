import FlickeringEffectsOptionStateStatics.method1752
import FacingDirectionNodeStatics.method2777
import kotlin.math.min
import WhirlpoolHashStatics.method830
import WhirlpoolHashStatics.anInt1462
import WhirlpoolHashStatics.anInt1464
import WhirlpoolHashStatics.anInt1466
import WhirlpoolHashStatics.anInt1470

/* Class85 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WhirlpoolHash {
    private var anInt1463 = 0
    private val aByteArray1465 = ByteArray(32)
    private var anInt1468 = 0
    private val aLongArray1469: LongArray
    private val aLongArray1471 = LongArray(8)
    private val aLongArray1472: LongArray
    private val aLongArray1473: LongArray
    private val aLongArray1474: LongArray
    private val aByteArray1475: ByteArray
    private fun method827(i: Int) {
        anInt1462++
        var i_0_ = 0
        var i_1_ = i
        while ( /**/i_0_ < 8) {
            aLongArray1473[i_0_] = (GlSpriteRendererStatics.method993(
                (GlSpriteRendererStatics.method993(
                    (method2777(255L, aByteArray1475[i_1_ + 6].toLong()) shl 8),
                    (GlSpriteRendererStatics.method993(
                        method2777(((aByteArray1475[i_1_ - -5]).toLong() shl 16), 255L shl 16),
                        (GlSpriteRendererStatics.method993((GlSpriteRendererStatics.method993(method2777(255L shl 32, ((aByteArray1475[i_1_ + 3]).toLong() shl 32)), (GlSpriteRendererStatics.method993(GlSpriteRendererStatics.method993((method2777(255L shl 48, ((aByteArray1475[1 + i_1_]).toLong() shl 48))), ((aByteArray1475[i_1_]).toLong() shl 56)), method2777(((aByteArray1475[i_1_ + 2]).toLong() shl 40), 255L shl 40))))), method2777(aByteArray1475[4 + i_1_].toLong(), 255L) shl 24))
                    ))
                )), method2777(255L, aByteArray1475[i_1_ - -7].toLong())
            ))
            i_1_ += 8
            i_0_++
        }
        for (i_2_ in 0..7) aLongArray1469[i_2_] = GlSpriteRendererStatics.method993(aLongArray1473[i_2_], (aLongArray1474[i_2_].also { aLongArray1472[i_2_] = it }))
        for (i_3_ in 1..10) {
            for (i_4_ in 0..7) {
                aLongArray1471[i_4_] = 0L
                var i_5_ = 0
                var i_6_ = 56
                while ( /**/i_5_ < 8) {
                    aLongArray1471[i_4_] = (GlSpriteRendererStatics.method993(aLongArray1471[i_4_], (InputStream_Sub1Statics.aLongArrayArray75!![i_5_]!![(NpcSummaryDefinitionStatics.method1166(255, ((aLongArray1472[NpcSummaryDefinitionStatics.method1166(7, i_4_ - i_5_)]) ushr i_6_).toInt()))])))
                    i_6_ -= 8
                    i_5_++
                }
            }
            for (i_7_ in 0..7) aLongArray1472[i_7_] = aLongArray1471[i_7_]
            aLongArray1472[0] = GlSpriteRendererStatics.method993(aLongArray1472[0], InputStream_Sub1Statics.aLongArray76!![i_3_])
            for (i_8_ in 0..7) {
                aLongArray1471[i_8_] = aLongArray1472[i_8_]
                var i_9_ = 0
                var i_10_ = 56
                while ( /**/i_9_ < 8) {
                    aLongArray1471[i_8_] = (GlSpriteRendererStatics.method993(aLongArray1471[i_8_], (InputStream_Sub1Statics.aLongArrayArray75!![i_9_]!![(NpcSummaryDefinitionStatics.method1166(255, ((aLongArray1469[NpcSummaryDefinitionStatics.method1166(-i_9_ + i_8_, 7)]) ushr i_10_).toInt()))])))
                    i_10_ -= 8
                    i_9_++
                }
            }
            for (i_11_ in 0..7) aLongArray1469[i_11_] = aLongArray1471[i_11_]
        }
        for (i_12_ in 0..7) aLongArray1474[i_12_] = (GlSpriteRendererStatics.method993(aLongArray1474[i_12_], GlSpriteRendererStatics.method993(aLongArray1473[i_12_], aLongArray1469[i_12_])))
    }

    fun method829(i: Int) {
        anInt1466++
        val i_18_ = -69 % ((i - 33) / 43)
        for (i_19_ in 0..31) aByteArray1465[i_19_] = 0.toByte()
        aByteArray1475[0] = 0.toByte()
        anInt1468 = 0
        anInt1463 = anInt1468
        for (i_20_ in 0..7) aLongArray1474[i_20_] = 0L
    }

    fun method832(l: Long, `is`: ByteArray?, i: Int) {
        var l = l
        try {
            anInt1464++
            var i_29_ = 0
            val i_30_ = 8 - (l.toInt() and 0x7) and 0x7
            val i_31_ = anInt1463 and 0x7
            var l_32_ = l
            var i_33_ = 31
            var i_34_ = 0
            while ( /**/i_33_ >= 0) {
                i_34_ += (0xff and aByteArray1465[i_33_].toInt()) - -(0xff and l_32_.toInt())
                aByteArray1465[i_33_] = i_34_.toByte()
                l_32_ = l_32_ ushr 8
                i_34_ = i_34_ ushr 8
                i_33_--
            }
            val i_35_ = 6 % ((i - 64) / 52)
            while (l > 8L) {
                val i_36_ = (`is`!![i_29_].toInt() shl i_30_ and 0xff or ((0xff and `is`[1 + i_29_].toInt()) ushr 8 + -i_30_))
                if (i_36_ < 0 || i_36_ >= 256) throw RuntimeException("LOGIC ERROR")
                aByteArray1475[anInt1468] = BoundsConstraintEntryStatics.method2057(aByteArray1475[anInt1468].toInt(), i_36_ ushr i_31_).toByte()
                anInt1468++
                anInt1463 += 8 - i_31_
                if (anInt1463 == 512) {
                    method827(0)
                    anInt1468 = 0
                    anInt1463 = anInt1468
                }
                aByteArray1475[anInt1468] = NpcSummaryDefinitionStatics.method1166(i_36_ shl -i_31_ + 8, 255).toByte()
                i_29_++
                l -= 8L
                anInt1463 += i_31_
            }
            val i_37_: Int
            if (l > 0L) {
                i_37_ = 0xff and (`is`!![i_29_].toInt() shl i_30_)
                aByteArray1475[anInt1468] = BoundsConstraintEntryStatics.method2057(aByteArray1475[anInt1468].toInt(), i_37_ ushr i_31_).toByte()
            } else i_37_ = 0
            if (l + i_31_.toLong() >= 8) {
                anInt1463 += 8 - i_31_
                l -= (-i_31_ + 8).toLong()
                anInt1468++
                if (anInt1463 == 512) {
                    method827(0)
                    anInt1468 = 0
                    anInt1463 = anInt1468
                }
                aByteArray1475[anInt1468] = NpcSummaryDefinitionStatics.method1166(i_37_ shl 8 + -i_31_, 255).toByte()
                anInt1463 += l.toInt()
            } else anInt1463 += l.toInt()
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("lda.B(" + l + ',' + (if (`is` != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    fun method833(bool: Boolean, i: Int, `is`: ByteArray) {
        anInt1470++
        aByteArray1475[anInt1468] = BoundsConstraintEntryStatics.method2057(aByteArray1475[anInt1468].toInt(), 128 ushr NpcSummaryDefinitionStatics.method1166(anInt1463, 7)).toByte()
        anInt1468++
        if (anInt1468 > 32) {
            while (anInt1468 < 64) aByteArray1475[anInt1468++] = 0.toByte()
            method827(0)
            anInt1468 = 0
        }
        while (anInt1468 < 32) aByteArray1475[anInt1468++] = 0.toByte()
        ArrayCopyUtil.method1577(aByteArray1465, 0, aByteArray1475, 32, 32)
        method827(0)
        var i_38_ = 0
        if (bool != true) method830(-1, -123, 39.toByte(), false, 61)
        var i_39_ = i
        while (i_38_ < 8) {
            val l = aLongArray1474[i_38_]
            `is`[i_39_] = (l ushr 56).toInt().toByte()
            `is`[i_39_ + 1] = (l ushr 48).toInt().toByte()
            `is`[2 + i_39_] = (l ushr 40).toInt().toByte()
            `is`[i_39_ - -3] = (l ushr 32).toInt().toByte()
            `is`[i_39_ + 4] = (l ushr 24).toInt().toByte()
            `is`[i_39_ + 5] = (l ushr 16).toInt().toByte()
            `is`[6 + i_39_] = (l ushr 8).toInt().toByte()
            `is`[i_39_ + 7] = l.toInt().toByte()
            i_38_++
            i_39_ += 8
        }
    }

    init {
        aLongArray1472 = LongArray(8)
        aLongArray1473 = LongArray(8)
        aByteArray1475 = ByteArray(64)
        aLongArray1469 = LongArray(8)
        aLongArray1474 = LongArray(8)
    }
}
