import Class246.Companion.method1885
import Class25.Companion.method303
import Class348_Sub16_Sub2.Companion.method2832
import Class59_Sub2_Sub1.Companion.method565
import Class6.Companion.method206
import kotlin.math.sqrt

/* Class64_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class64_Sub1 : Class64 {
    private var aShortArray5311: ShortArray? = null
    private var anIntArray5312: IntArray? = null
    private var aClass360Array5313: Array<Class360?>? = null
    private var aFloatArrayArray5314: Array<FloatArray?>? = null
    private lateinit var anIntArray5315: IntArray
    private var anInt5316 = 0
    private lateinit var aShortArray5317: ShortArray
    private lateinit var anIntArray5318: IntArray
    private var aClass64_Sub1_5319: Class64_Sub1? = null
    private var aClass101_Sub1_5320: Class101_Sub1? = null
    private lateinit var anIntArray5321: IntArray
    private var aClass129Array5322: Array<Class129?>? = null
    private var aBoolean5323 = false
    private var aShort5324: Short = 0
    private var aByteArray5325: ByteArray? = null
    private lateinit var anIntArray5326: IntArray
    private var aShortArray5327: ShortArray? = null
    private var aClass64_Sub1_5328: Class64_Sub1? = null
    private var aShort5329: Short = 0
    private var anIntArrayArray5330: Array<IntArray?>? = null
    private var aShort5331: Short = 0
    private var anIntArray5332: IntArray? = null
    private var aShortArray5333: ShortArray? = null
    private var anIntArrayArray5334: Array<IntArray?>? = null
    private var aClass342Array5335: Array<Class342?>? = null
    private var aClass167_5336: Class167? = null
    private var anIntArray5337: IntArray? = null
    private var anInt5338 = 0
    private var aClass64_Sub1_5339: Class64_Sub1? = null
    private var anInt5340 = 0
    private var anInt5342 = 0
    private lateinit var anIntArray5343: IntArray
    private var anInt5344 = 0
    private var aFloatArrayArray5345: Array<FloatArray?>? = null
    private var aClass64_Sub1_5347: Class64_Sub1? = null
    private var aShort5348: Short = 0
    private var anInt5349 = 0
    private var anInt5351: Int
    private var aShort5352: Short = 0
    private val aHa_Sub1_5353: ha_Sub1
    private var anInt5354: Int
    private lateinit var anIntArray5355: IntArray
    private var anIntArray5356: IntArray? = null
    private var aBoolean5357 = false
    private var aByteArray5358: ByteArray? = null
    private lateinit var anIntArray5359: IntArray
    private var aClass360Array5360: Array<Class360?>? = null
    private var aClass6Array5361: Array<Class6?>? = null
    private lateinit var anIntArray5362: IntArray
    private var aClass350Array5363: Array<Class350?>? = null
    private lateinit var aShortArray5364: ShortArray
    private var aShort5365: Short = 0
    private var anIntArray5366: IntArray? = null
    private var aClass167_5367: Class167? = null
    private var anIntArray5368: IntArray? = null
    private var aBoolean5369: Boolean
    private var aShortArray5370: ShortArray? = null
    private lateinit var anIntArray5371: IntArray
    private var aBoolean5372: Boolean
    private lateinit var anIntArray5373: IntArray
    private var aClass64_Sub1_5374: Class64_Sub1? = null
    private var anInt5375 = 0
    private var aClass64_Sub1_5376: Class64_Sub1? = null
    private lateinit var anIntArray5377: IntArray
    private var aClass64_Sub1_5378: Class64_Sub1? = null
    private var anIntArrayArray5379: Array<IntArray?>? = null
    private var aBoolean5380 = false
    private lateinit var anIntArray5381: IntArray
    private var aBoolean5382: Boolean
    private var aClass109_5383: Class109? = null
    private lateinit var anIntArray5384: IntArray
    private var aClass41Array5385: Array<Class41?>? = null
    private var aByteArray5386: ByteArray? = null
    private var anInt5387: Int
    private var aShortArray5388: ShortArray? = null
    private var anInt5389 = 0
    private var aClass64_Sub1_5390: Class64_Sub1? = null
    private var aBoolean5391: Boolean
    private lateinit var anIntArray5392: IntArray
    private var aShort5393: Short = 0
    private lateinit var aShortArray5394: ShortArray
    private var aShort5395: Short = 0
    private var aClass64_Sub1_5396: Class64_Sub1? = null
    private var aClass64_Sub1_5397: Class64_Sub1? = null
    private lateinit var anIntArray5398: IntArray
    private lateinit var anIntArray5399: IntArray
    private var anIntArray5400: IntArray? = null

    private fun method629(i: Int): Boolean {
        if (aByteArray5325 == null) return false
        return aByteArray5325!![i].toInt() != 0
    }

    private fun method630(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int): Boolean {
        if (i_0_ < i_1_ && i_0_ < i_2_ && i_0_ < i_3_) return false
        if (i_0_ > i_1_ && i_0_ > i_2_ && i_0_ > i_3_) return false
        if (i < i_4_ && i < i_5_ && i < i_6_) return false
        return i <= i_4_ || i <= i_5_ || i <= i_6_
    }

    private fun method631() {
        aClass360Array5360 = null
        aClass360Array5313 = null
        aClass41Array5385 = null
        aBoolean5323 = false
    }

    public override fun EA(): Int {
        if (!aBoolean5323) method655()
        return aShort5365.toInt()
    }

    private fun method632(thread: Thread?) {
        val class167: Class167 = aHa_Sub1_5353.method3724(thread)!!
        aClass109_5383 = class167.aClass109_2220
        if (class167 != aClass167_5367) {
            aClass167_5367 = class167
            anIntArray5362 = aClass167_5367!!.anIntArray2222!!
            anIntArray5399 = aClass167_5367!!.anIntArray2244!!
            anIntArray5384 = aClass167_5367!!.anIntArray2214!!
            anIntArray5392 = aClass167_5367!!.anIntArray2237!!
            anIntArray5321 = aClass167_5367!!.anIntArray2234!!
            anIntArray5343 = aClass167_5367!!.anIntArray2230!!
            anIntArray5355 = aClass167_5367!!.anIntArray2213!!
            anIntArray5359 = aClass167_5367!!.anIntArray2218!!
            anIntArray5373 = aClass167_5367!!.anIntArray2241!!
            anIntArray5398 = aClass167_5367!!.anIntArray2245!!
            anIntArray5315 = aClass167_5367!!.anIntArray2238!!
            anIntArray5371 = aClass167_5367!!.anIntArray2247!!
            anIntArray5381 = aClass167_5367!!.anIntArray2235!!
            anIntArray5377 = aClass167_5367!!.anIntArray2240!!
            anIntArray5326 = aClass167_5367!!.anIntArray2236!!
            anIntArray5318 = aClass167_5367!!.anIntArray2216!!
            anIntArray5400 = aClass167_5367!!.anIntArray2242!!
        }
    }

    private fun method633(class64_sub1_7_: Class64_Sub1, class64_sub1_8_: Class64_Sub1, i: Int, bool: Boolean, bool_9_: Boolean): Class64 {
        class64_sub1_7_.aBoolean5323 = aBoolean5323
        if (aBoolean5323) {
            class64_sub1_7_.aShort5393 = aShort5393
            class64_sub1_7_.aShort5365 = aShort5365
            class64_sub1_7_.aShort5331 = aShort5331
            class64_sub1_7_.aShort5395 = aShort5395
            class64_sub1_7_.aShort5329 = aShort5329
            class64_sub1_7_.aShort5352 = aShort5352
            class64_sub1_7_.aShort5324 = aShort5324
            class64_sub1_7_.aShort5348 = aShort5348
        }
        class64_sub1_7_.anInt5344 = anInt5344
        class64_sub1_7_.anInt5349 = anInt5349
        class64_sub1_7_.anInt5340 = anInt5340
        class64_sub1_7_.anInt5387 = anInt5387
        class64_sub1_7_.anInt5351 = anInt5351
        class64_sub1_7_.anInt5389 = anInt5389
        if ((i and 0x100) != 0) class64_sub1_7_.aBoolean5382 = true
        else class64_sub1_7_.aBoolean5382 = aBoolean5382
        class64_sub1_7_.aBoolean5391 = aBoolean5391
        val bool_10_ = ((i and 0x7) == 7) or ((i and 0x20) != 0)
        val bool_11_ = bool_10_ || (i and 0x1) != 0
        val bool_12_ = bool_10_ || (i and 0x2) != 0
        val bool_13_ = bool_10_ || (i and 0x4) != 0 || (i and 0x10) != 0
        if (bool_11_ || bool_12_ || bool_13_) {
            if (bool_11_) {
                if (class64_sub1_8_.anIntArray5356 == null || class64_sub1_8_.anIntArray5356!!.size < anInt5340) {
                    class64_sub1_8_.anIntArray5356 = IntArray(anInt5340)
                    class64_sub1_7_.anIntArray5356 = class64_sub1_8_.anIntArray5356
                } else class64_sub1_7_.anIntArray5356 = class64_sub1_8_.anIntArray5356
                for (i_14_ in 0..<anInt5340) class64_sub1_7_.anIntArray5356!![i_14_] = anIntArray5356!![i_14_]
            } else class64_sub1_7_.anIntArray5356 = anIntArray5356
            if (bool_12_) {
                if (class64_sub1_8_.anIntArray5332 == null || class64_sub1_8_.anIntArray5332!!.size < anInt5340) {
                    class64_sub1_8_.anIntArray5332 = IntArray(anInt5340)
                    class64_sub1_7_.anIntArray5332 = class64_sub1_8_.anIntArray5332
                } else class64_sub1_7_.anIntArray5332 = class64_sub1_8_.anIntArray5332
                for (i_15_ in 0..<anInt5340) class64_sub1_7_.anIntArray5332!![i_15_] = anIntArray5332!![i_15_]
            } else class64_sub1_7_.anIntArray5332 = anIntArray5332
            if (bool_13_) {
                if (class64_sub1_8_.anIntArray5312 == null || class64_sub1_8_.anIntArray5312!!.size < anInt5340) {
                    class64_sub1_8_.anIntArray5312 = IntArray(anInt5340)
                    class64_sub1_7_.anIntArray5312 = class64_sub1_8_.anIntArray5312
                } else class64_sub1_7_.anIntArray5312 = class64_sub1_8_.anIntArray5312
                for (i_16_ in 0..<anInt5340) class64_sub1_7_.anIntArray5312!![i_16_] = anIntArray5312!![i_16_]
            } else class64_sub1_7_.anIntArray5312 = anIntArray5312
        } else {
            class64_sub1_7_.anIntArray5356 = anIntArray5356
            class64_sub1_7_.anIntArray5332 = anIntArray5332
            class64_sub1_7_.anIntArray5312 = anIntArray5312
        }
        if ((i and 0x84080) != 0) {
            if (class64_sub1_8_.aShortArray5311 == null || class64_sub1_8_.aShortArray5311!!.size < anInt5351) {
                val i_17_ = anInt5351
                class64_sub1_8_.aShortArray5311 = ShortArray(i_17_)
                class64_sub1_7_.aShortArray5311 = class64_sub1_8_.aShortArray5311
            } else class64_sub1_7_.aShortArray5311 = class64_sub1_8_.aShortArray5311
            for (i_18_ in 0..<anInt5351) class64_sub1_7_.aShortArray5311!![i_18_] = aShortArray5311!![i_18_]
        } else class64_sub1_7_.aShortArray5311 = aShortArray5311
        if ((i and 0x97018) != 0) {
            class64_sub1_7_.anInt5354 = 0
            class64_sub1_7_.anIntArray5366 = null
            class64_sub1_7_.anIntArray5337 = class64_sub1_7_.anIntArray5366
            class64_sub1_7_.anIntArray5368 = class64_sub1_7_.anIntArray5337
        } else if ((i and 0x80) == 0) {
            if (bool_9_) method634(false)
            class64_sub1_7_.anIntArray5368 = anIntArray5368
            class64_sub1_7_.anIntArray5337 = anIntArray5337
            class64_sub1_7_.anIntArray5366 = anIntArray5366
            class64_sub1_7_.anInt5354 = anInt5354
        } else {
            if (bool_9_) method634(false)
            if (anIntArray5368 != null) {
                if (class64_sub1_8_.anIntArray5368 == null || class64_sub1_8_.anIntArray5368!!.size < anInt5351) {
                    val i_19_ = anInt5351
                    class64_sub1_8_.anIntArray5368 = IntArray(i_19_)
                    class64_sub1_7_.anIntArray5368 = class64_sub1_8_.anIntArray5368
                    class64_sub1_8_.anIntArray5337 = IntArray(i_19_)
                    class64_sub1_7_.anIntArray5337 = class64_sub1_8_.anIntArray5337
                    class64_sub1_8_.anIntArray5366 = IntArray(i_19_)
                    class64_sub1_7_.anIntArray5366 = class64_sub1_8_.anIntArray5366
                } else {
                    class64_sub1_7_.anIntArray5368 = class64_sub1_8_.anIntArray5368
                    class64_sub1_7_.anIntArray5337 = class64_sub1_8_.anIntArray5337
                    class64_sub1_7_.anIntArray5366 = class64_sub1_8_.anIntArray5366
                }
                for (i_20_ in 0..<anInt5351) {
                    class64_sub1_7_.anIntArray5368!![i_20_] = anIntArray5368!![i_20_]
                    class64_sub1_7_.anIntArray5337!![i_20_] = anIntArray5337!![i_20_]
                    class64_sub1_7_.anIntArray5366!![i_20_] = anIntArray5366!![i_20_]
                }
            }
            class64_sub1_7_.anInt5354 = anInt5354
        }
        if ((i and 0x100) != 0) {
            if (class64_sub1_8_.aByteArray5325 == null || class64_sub1_8_.aByteArray5325!!.size < anInt5351) {
                val i_21_ = anInt5351
                class64_sub1_8_.aByteArray5325 = ByteArray(i_21_)
                class64_sub1_7_.aByteArray5325 = class64_sub1_8_.aByteArray5325
            } else class64_sub1_7_.aByteArray5325 = class64_sub1_8_.aByteArray5325
            if (aByteArray5325 == null) {
                for (i_23_ in 0..<anInt5351) class64_sub1_7_.aByteArray5325!![i_23_] = 0.toByte()
            } else {
                for (i_22_ in 0..<anInt5351) class64_sub1_7_.aByteArray5325!![i_22_] = aByteArray5325!![i_22_]
            }
        } else class64_sub1_7_.aByteArray5325 = aByteArray5325
        if ((i and 0x8) != 0 || (i and 0x10) != 0) {
            if (class64_sub1_8_.aClass360Array5360 == null || class64_sub1_8_.aClass360Array5360!!.size < anInt5387) {
                val i_24_ = anInt5387
                class64_sub1_8_.aClass360Array5360 = arrayOfNulls<Class360>(i_24_)
                class64_sub1_7_.aClass360Array5360 = class64_sub1_8_.aClass360Array5360
            } else class64_sub1_7_.aClass360Array5360 = class64_sub1_8_.aClass360Array5360
            if (aClass360Array5360 != null) {
                for (i_25_ in 0..<anInt5387) class64_sub1_7_.aClass360Array5360!![i_25_] = Class360(aClass360Array5360!![i_25_]!!)
            } else class64_sub1_7_.aClass360Array5360 = null
            if (aClass41Array5385 != null) {
                if (class64_sub1_8_.aClass41Array5385 == null || class64_sub1_8_.aClass41Array5385!!.size < anInt5351) {
                    val i_26_ = anInt5351
                    class64_sub1_8_.aClass41Array5385 = arrayOfNulls<Class41>(i_26_)
                    class64_sub1_7_.aClass41Array5385 = class64_sub1_8_.aClass41Array5385
                } else class64_sub1_7_.aClass41Array5385 = class64_sub1_8_.aClass41Array5385
                for (i_27_ in 0..<anInt5351) class64_sub1_7_.aClass41Array5385!![i_27_] = (if (aClass41Array5385!![i_27_] != null) Class41(aClass41Array5385!![i_27_]!!) else null)
            } else class64_sub1_7_.aClass41Array5385 = null
        } else {
            if (bool_9_) method636()
            class64_sub1_7_.aClass360Array5360 = aClass360Array5360
            class64_sub1_7_.aClass41Array5385 = aClass41Array5385
        }
        if ((i and 0x8000) != 0) {
            if (aShortArray5388 == null) class64_sub1_7_.aShortArray5388 = null
            else {
                if (class64_sub1_8_.aShortArray5388 == null || class64_sub1_8_.aShortArray5388!!.size < anInt5351) {
                    val i_28_ = anInt5351
                    class64_sub1_8_.aShortArray5388 = ShortArray(i_28_)
                    class64_sub1_7_.aShortArray5388 = class64_sub1_8_.aShortArray5388
                } else class64_sub1_7_.aShortArray5388 = class64_sub1_8_.aShortArray5388
                for (i_29_ in 0..<anInt5351) class64_sub1_7_.aShortArray5388!![i_29_] = aShortArray5388!![i_29_]
            }
        } else class64_sub1_7_.aShortArray5388 = aShortArray5388
        if ((i and 0x10000) != 0) {
            if (aByteArray5386 == null) class64_sub1_7_.aByteArray5386 = null
            else {
                if (class64_sub1_8_.aByteArray5386 == null || class64_sub1_8_.aByteArray5386!!.size < anInt5351) {
                    val i_30_ = if (bool) anInt5351 + 100 else anInt5351
                    class64_sub1_8_.aByteArray5386 = ByteArray(i_30_)
                    class64_sub1_7_.aByteArray5386 = class64_sub1_8_.aByteArray5386
                } else class64_sub1_7_.aByteArray5386 = class64_sub1_8_.aByteArray5386
                for (i_31_ in 0..<anInt5351) class64_sub1_7_.aByteArray5386!![i_31_] = aByteArray5386!![i_31_]
            }
        } else class64_sub1_7_.aByteArray5386 = aByteArray5386
        if ((i and 0xc580) != 0) {
            if (class64_sub1_8_.aClass350Array5363 == null || class64_sub1_8_.aClass350Array5363!!.size < anInt5389) {
                val i_32_ = anInt5389
                class64_sub1_8_.aClass350Array5363 = arrayOfNulls<Class350>(i_32_)
                class64_sub1_7_.aClass350Array5363 = class64_sub1_8_.aClass350Array5363
                for (i_33_ in 0..<anInt5389) class64_sub1_7_.aClass350Array5363!![i_33_] = aClass350Array5363!![i_33_]!!.method3453(true)
            } else {
                class64_sub1_7_.aClass350Array5363 = class64_sub1_8_.aClass350Array5363
                for (i_34_ in 0..<anInt5389) class64_sub1_7_.aClass350Array5363!![i_34_]!!.method3454(aClass350Array5363!![i_34_]!!, true)
            }
        } else class64_sub1_7_.aClass350Array5363 = aClass350Array5363
        if (aFloatArrayArray5314 == null || (i and 0x10) == 0) {
            class64_sub1_7_.aFloatArrayArray5314 = aFloatArrayArray5314
            class64_sub1_7_.aFloatArrayArray5345 = aFloatArrayArray5345
        } else {
            if (class64_sub1_8_.aFloatArrayArray5314 == null || class64_sub1_8_.aFloatArrayArray5314!!.size < anInt5351) {
                val i_35_ = if (bool) anInt5351 + 100 else anInt5351
                class64_sub1_8_.aFloatArrayArray5314 = Array<FloatArray?>(i_35_) { FloatArray(3) }
                class64_sub1_7_.aFloatArrayArray5314 = class64_sub1_8_.aFloatArrayArray5314
            } else class64_sub1_7_.aFloatArrayArray5314 = class64_sub1_8_.aFloatArrayArray5314
            for (i_36_ in 0..<anInt5351) {
                if (aFloatArrayArray5314!![i_36_] != null) {
                    class64_sub1_7_.aFloatArrayArray5314!![i_36_]!![0] = aFloatArrayArray5314!![i_36_]!![0]
                    class64_sub1_7_.aFloatArrayArray5314!![i_36_]!![1] = aFloatArrayArray5314!![i_36_]!![1]
                    class64_sub1_7_.aFloatArrayArray5314!![i_36_]!![2] = aFloatArrayArray5314!![i_36_]!![2]
                }
            }
            if (class64_sub1_8_.aFloatArrayArray5345 == null || class64_sub1_8_.aFloatArrayArray5345!!.size < anInt5351) {
                val i_37_ = if (bool) anInt5351 + 100 else anInt5351
                class64_sub1_8_.aFloatArrayArray5345 = Array<FloatArray?>(i_37_) { FloatArray(3) }
                class64_sub1_7_.aFloatArrayArray5345 = class64_sub1_8_.aFloatArrayArray5345
            } else class64_sub1_7_.aFloatArrayArray5345 = class64_sub1_8_.aFloatArrayArray5345
            for (i_38_ in 0..<anInt5351) {
                if (aFloatArrayArray5345!![i_38_] != null) {
                    class64_sub1_7_.aFloatArrayArray5345!![i_38_]!![0] = aFloatArrayArray5345!![i_38_]!![0]
                    class64_sub1_7_.aFloatArrayArray5345!![i_38_]!![1] = aFloatArrayArray5345!![i_38_]!![1]
                    class64_sub1_7_.aFloatArrayArray5345!![i_38_]!![2] = aFloatArrayArray5345!![i_38_]!![2]
                }
            }
        }
        class64_sub1_7_.anIntArrayArray5334 = anIntArrayArray5334
        class64_sub1_7_.anIntArrayArray5330 = anIntArrayArray5330
        class64_sub1_7_.anIntArrayArray5379 = anIntArrayArray5379
        class64_sub1_7_.aShortArray5333 = aShortArray5333
        class64_sub1_7_.aShortArray5370 = aShortArray5370
        class64_sub1_7_.aByteArray5358 = aByteArray5358
        class64_sub1_7_.aShortArray5317 = aShortArray5317
        class64_sub1_7_.aShortArray5394 = aShortArray5394
        class64_sub1_7_.aShortArray5364 = aShortArray5364
        class64_sub1_7_.aClass129Array5322 = aClass129Array5322
        class64_sub1_7_.aClass342Array5335 = aClass342Array5335
        class64_sub1_7_.aClass6Array5361 = aClass6Array5361
        class64_sub1_7_.aShortArray5327 = aShortArray5327
        class64_sub1_7_.anInt5316 = i
        return class64_sub1_7_
    }

    private fun method634(bool: Boolean) {
        if (aHa_Sub1_5353.anInt7485 > 1) {
            synchronized(this) {
                method657(bool)
            }
        } else method657(bool)
    }

    public override fun method619(): Array<Class129?>? {
        return aClass129Array5322
    }

    public override fun V(): Int {
        if (!aBoolean5323) method655()
        return aShort5395.toInt()
    }

    private fun method635(i: Int) {
        val i_39_ = aShortArray5317[i]
        val i_40_ = aShortArray5394[i]
        val i_41_ = aShortArray5364[i]
        if (aShortArray5388 == null || aShortArray5388!![i].toInt() == -1) {
            if (aByteArray5325 == null) aClass109_5383!!.anInt1674 = 0
            else aClass109_5383!!.anInt1674 = aByteArray5325!![i].toInt() and 0xff
            if (anIntArray5366!![i] == -1) aClass109_5383!!.method1018(
                anIntArray5343[i_39_.toInt()].toFloat(),
                anIntArray5343[i_40_.toInt()].toFloat(),
                anIntArray5343[i_41_.toInt()].toFloat(),
                anIntArray5321[i_39_.toInt()].toFloat(),
                anIntArray5321[i_40_.toInt()].toFloat(),
                anIntArray5321[i_41_.toInt()].toFloat(),
                anIntArray5355[i_39_.toInt()].toFloat(),
                anIntArray5355[i_40_.toInt()].toFloat(),
                anIntArray5355[i_41_.toInt()].toFloat(),
                (Class126.anIntArray4983!![anIntArray5368!![i] and 0xffff])
            )
            else aClass109_5383!!.method1022(
                anIntArray5343[i_39_.toInt()].toFloat(),
                anIntArray5343[i_40_.toInt()].toFloat(),
                anIntArray5343[i_41_.toInt()].toFloat(),
                anIntArray5321[i_39_.toInt()].toFloat(),
                anIntArray5321[i_40_.toInt()].toFloat(),
                anIntArray5321[i_41_.toInt()].toFloat(),
                anIntArray5355[i_39_.toInt()].toFloat(),
                anIntArray5355[i_40_.toInt()].toFloat(),
                anIntArray5355[i_41_.toInt()].toFloat(),
                (anIntArray5368!![i] and 0xffff).toFloat(),
                (anIntArray5337!![i] and 0xffff).toFloat(),
                (anIntArray5366!![i] and 0xffff).toFloat()
            )
        } else {
            var i_42_ = -16777216
            if (aByteArray5325 != null) i_42_ = 255 - (aByteArray5325!![i].toInt() and 0xff) shl 24
            if (anIntArray5366!![i] == -1) {
                val i_43_ = i_42_ or (anIntArray5368!![i] and 0xffffff)
                aClass109_5383!!.method1024(
                    anIntArray5343[i_39_.toInt()].toFloat(),
                    anIntArray5343[i_40_.toInt()].toFloat(),
                    anIntArray5343[i_41_.toInt()].toFloat(),
                    anIntArray5321[i_39_.toInt()].toFloat(),
                    anIntArray5321[i_40_.toInt()].toFloat(),
                    anIntArray5321[i_41_.toInt()].toFloat(),
                    anIntArray5355[i_39_.toInt()].toFloat(),
                    anIntArray5355[i_40_.toInt()].toFloat(),
                    anIntArray5355[i_41_.toInt()].toFloat(),
                    aFloatArrayArray5314!![i]!![0],
                    aFloatArrayArray5314!![i]!![1],
                    aFloatArrayArray5314!![i]!![2],
                    aFloatArrayArray5345!![i]!![0],
                    aFloatArrayArray5345!![i]!![1],
                    aFloatArrayArray5345!![i]!![2],
                    i_43_,
                    i_43_,
                    i_43_,
                    aClass167_5367!!.anInt2192,
                    0,
                    0,
                    0,
                    aShortArray5388!![i].toInt()
                )
            } else aClass109_5383!!.method1024(
                anIntArray5343[i_39_.toInt()].toFloat(),
                anIntArray5343[i_40_.toInt()].toFloat(),
                anIntArray5343[i_41_.toInt()].toFloat(),
                anIntArray5321[i_39_.toInt()].toFloat(),
                anIntArray5321[i_40_.toInt()].toFloat(),
                anIntArray5321[i_41_.toInt()].toFloat(),
                anIntArray5355[i_39_.toInt()].toFloat(),
                anIntArray5355[i_40_.toInt()].toFloat(),
                anIntArray5355[i_41_.toInt()].toFloat(),
                aFloatArrayArray5314!![i]!![0],
                aFloatArrayArray5314!![i]!![1],
                aFloatArrayArray5314!![i]!![2],
                aFloatArrayArray5345!![i]!![0],
                aFloatArrayArray5345!![i]!![1],
                aFloatArrayArray5345!![i]!![2],
                i_42_ or (anIntArray5368!![i] and 0xffffff),
                i_42_ or (anIntArray5337!![i] and 0xffffff),
                i_42_ or (anIntArray5366!![i] and 0xffffff),
                (aClass167_5367!!.anInt2192),
                0,
                0,
                0,
                aShortArray5388!![i].toInt()
            )
        }
    }

    public override fun method615(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int) {
        method654(class101, class318_sub3, -1, i)
    }

    public override fun HA(): Int {
        if (!aBoolean5323) method655()
        return aShort5352.toInt()
    }

    public override fun method605(i: Int, `is`: IntArray, i_44_: Int, i_45_: Int, i_46_: Int, i_47_: Int, bool: Boolean) {
        var i_44_ = i_44_
        var i_45_ = i_45_
        var i_46_ = i_46_
        val i_48_ = `is`.size
        if (i == 0) {
            i_44_ = i_44_ shl 4
            i_45_ = i_45_ shl 4
            i_46_ = i_46_ shl 4
            if (!aBoolean5372) {
                for (i_49_ in 0..<anInt5340) {
                    anIntArray5356!![i_49_] = anIntArray5356!![i_49_] shl 4
                    anIntArray5332!![i_49_] = anIntArray5332!![i_49_] shl 4
                    anIntArray5312!![i_49_] = anIntArray5312!![i_49_] shl 4
                }
                aBoolean5372 = true
            }
            var i_50_ = 0
            anInt5338 = 0
            anInt5375 = 0
            anInt5342 = 0
            for (i_51_ in 0..<i_48_) {
                val i_52_ = `is`[i_51_]
                if (i_52_ < anIntArrayArray5334!!.size) {
                    val is_53_ = anIntArrayArray5334!![i_52_]!!
                    for (i_54_ in is_53_.indices) {
                        val i_55_ = is_53_[i_54_]
                        anInt5338 += anIntArray5356!![i_55_]
                        anInt5375 += anIntArray5332!![i_55_]
                        anInt5342 += anIntArray5312!![i_55_]
                        i_50_++
                    }
                }
            }
            if (i_50_ > 0) {
                anInt5338 = anInt5338 / i_50_ + i_44_
                anInt5375 = anInt5375 / i_50_ + i_45_
                anInt5342 = anInt5342 / i_50_ + i_46_
            } else {
                anInt5338 = i_44_
                anInt5375 = i_45_
                anInt5342 = i_46_
            }
        } else if (i == 1) {
            i_44_ = i_44_ shl 4
            i_45_ = i_45_ shl 4
            i_46_ = i_46_ shl 4
            if (!aBoolean5372) {
                for (i_56_ in 0..<anInt5340) {
                    anIntArray5356!![i_56_] = anIntArray5356!![i_56_] shl 4
                    anIntArray5332!![i_56_] = anIntArray5332!![i_56_] shl 4
                    anIntArray5312!![i_56_] = anIntArray5312!![i_56_] shl 4
                }
                aBoolean5372 = true
            }
            for (i_57_ in 0..<i_48_) {
                val i_58_ = `is`[i_57_]
                if (i_58_ < anIntArrayArray5334!!.size) {
                    val is_59_ = anIntArrayArray5334!![i_58_]!!
                    for (i_60_ in is_59_.indices) {
                        val i_61_ = is_59_[i_60_]
                        anIntArray5356!![i_61_] += i_44_
                        anIntArray5332!![i_61_] += i_45_
                        anIntArray5312!![i_61_] += i_46_
                    }
                }
            }
        } else if (i == 2) {
            for (i_62_ in 0..<i_48_) {
                val i_63_ = `is`[i_62_]
                if (i_63_ < anIntArrayArray5334!!.size) {
                    val is_64_ = anIntArrayArray5334!![i_63_]!!
                    if ((i_47_ and 0x1) == 0) {
                        for (i_65_ in is_64_.indices) {
                            val i_66_ = is_64_[i_65_]
                            anIntArray5356!![i_66_] -= anInt5338
                            anIntArray5332!![i_66_] -= anInt5375
                            anIntArray5312!![i_66_] -= anInt5342
                            if (i_46_ != 0) {
                                val i_67_ = Class70.anIntArray1207!![i_46_]
                                val i_68_ = Class70.anIntArray1204!![i_46_]
                                val i_69_ = ((anIntArray5332!![i_66_] * i_67_ + anIntArray5356!![i_66_] * i_68_ + 16383) shr 14)
                                anIntArray5332!![i_66_] = (anIntArray5332!![i_66_] * i_68_ - anIntArray5356!![i_66_] * i_67_ + 16383) shr 14
                                anIntArray5356!![i_66_] = i_69_
                            }
                            if (i_44_ != 0) {
                                val i_70_ = Class70.anIntArray1207!![i_44_]
                                val i_71_ = Class70.anIntArray1204!![i_44_]
                                val i_72_ = ((anIntArray5332!![i_66_] * i_71_ - anIntArray5312!![i_66_] * i_70_ + 16383) shr 14)
                                anIntArray5312!![i_66_] = (anIntArray5332!![i_66_] * i_70_ + anIntArray5312!![i_66_] * i_71_ + 16383) shr 14
                                anIntArray5332!![i_66_] = i_72_
                            }
                            if (i_45_ != 0) {
                                val i_73_ = Class70.anIntArray1207!![i_45_]
                                val i_74_ = Class70.anIntArray1204!![i_45_]
                                val i_75_ = ((anIntArray5312!![i_66_] * i_73_ + anIntArray5356!![i_66_] * i_74_ + 16383) shr 14)
                                anIntArray5312!![i_66_] = (anIntArray5312!![i_66_] * i_74_ - anIntArray5356!![i_66_] * i_73_ + 16383) shr 14
                                anIntArray5356!![i_66_] = i_75_
                            }
                            anIntArray5356!![i_66_] += anInt5338
                            anIntArray5332!![i_66_] += anInt5375
                            anIntArray5312!![i_66_] += anInt5342
                        }
                    } else {
                        for (i_76_ in is_64_.indices) {
                            val i_77_ = is_64_[i_76_]
                            anIntArray5356!![i_77_] -= anInt5338
                            anIntArray5332!![i_77_] -= anInt5375
                            anIntArray5312!![i_77_] -= anInt5342
                            if (i_44_ != 0) {
                                val i_78_ = Class70.anIntArray1207!![i_44_]
                                val i_79_ = Class70.anIntArray1204!![i_44_]
                                val i_80_ = ((anIntArray5332!![i_77_] * i_79_ - anIntArray5312!![i_77_] * i_78_ + 16383) shr 14)
                                anIntArray5312!![i_77_] = (anIntArray5332!![i_77_] * i_78_ + anIntArray5312!![i_77_] * i_79_ + 16383) shr 14
                                anIntArray5332!![i_77_] = i_80_
                            }
                            if (i_46_ != 0) {
                                val i_81_ = Class70.anIntArray1207!![i_46_]
                                val i_82_ = Class70.anIntArray1204!![i_46_]
                                val i_83_ = ((anIntArray5332!![i_77_] * i_81_ + anIntArray5356!![i_77_] * i_82_ + 16383) shr 14)
                                anIntArray5332!![i_77_] = (anIntArray5332!![i_77_] * i_82_ - anIntArray5356!![i_77_] * i_81_ + 16383) shr 14
                                anIntArray5356!![i_77_] = i_83_
                            }
                            if (i_45_ != 0) {
                                val i_84_ = Class70.anIntArray1207!![i_45_]
                                val i_85_ = Class70.anIntArray1204!![i_45_]
                                val i_86_ = ((anIntArray5312!![i_77_] * i_84_ + anIntArray5356!![i_77_] * i_85_ + 16383) shr 14)
                                anIntArray5312!![i_77_] = (anIntArray5312!![i_77_] * i_85_ - anIntArray5356!![i_77_] * i_84_ + 16383) shr 14
                                anIntArray5356!![i_77_] = i_86_
                            }
                            anIntArray5356!![i_77_] += anInt5338
                            anIntArray5332!![i_77_] += anInt5375
                            anIntArray5312!![i_77_] += anInt5342
                        }
                    }
                }
            }
        } else if (i == 3) {
            for (i_87_ in 0..<i_48_) {
                val i_88_ = `is`[i_87_]
                if (i_88_ < anIntArrayArray5334!!.size) {
                    val is_89_ = anIntArrayArray5334!![i_88_]!!
                    for (i_90_ in is_89_.indices) {
                        val i_91_ = is_89_[i_90_]
                        anIntArray5356!![i_91_] -= anInt5338
                        anIntArray5332!![i_91_] -= anInt5375
                        anIntArray5312!![i_91_] -= anInt5342
                        anIntArray5356!![i_91_] = anIntArray5356!![i_91_] * i_44_ / 128
                        anIntArray5332!![i_91_] = anIntArray5332!![i_91_] * i_45_ / 128
                        anIntArray5312!![i_91_] = anIntArray5312!![i_91_] * i_46_ / 128
                        anIntArray5356!![i_91_] += anInt5338
                        anIntArray5332!![i_91_] += anInt5375
                        anIntArray5312!![i_91_] += anInt5342
                    }
                }
            }
        } else if (i == 5) {
            if (anIntArrayArray5330 != null && aByteArray5325 != null) {
                for (i_92_ in 0..<i_48_) {
                    val i_93_ = `is`[i_92_]
                    if (i_93_ < anIntArrayArray5330!!.size) {
                        val is_94_ = anIntArrayArray5330!![i_93_]!!
                        for (i_95_ in is_94_.indices) {
                            val i_96_ = is_94_[i_95_]
                            var i_97_ = (aByteArray5325!![i_96_].toInt() and 0xff) + i_44_ * 8
                            if (i_97_ < 0) i_97_ = 0
                            else if (i_97_ > 255) i_97_ = 255
                            aByteArray5325!![i_96_] = i_97_.toByte()
                        }
                    }
                }
                if (aClass6Array5361 != null) {
                    for (i_98_ in 0..<anInt5389) {
                        val class6 = aClass6Array5361!![i_98_]!!
                        val class350 = aClass350Array5363!![i_98_]!!
                        class350.anInt4313 = (class350.anInt4313 and 0xffffff or ((255 - (aByteArray5325!![class6.anInt144].toInt() and 0xff)) shl 24))
                    }
                }
            }
        } else if (i == 7) {
            if (anIntArrayArray5330 != null) {
                for (i_99_ in 0..<i_48_) {
                    val i_100_ = `is`[i_99_]
                    if (i_100_ < anIntArrayArray5330!!.size) {
                        val is_101_ = anIntArrayArray5330!![i_100_]!!
                        for (i_102_ in is_101_.indices) {
                            val i_103_ = is_101_[i_102_]
                            val i_104_ = aShortArray5311!![i_103_].toInt() and 0xffff
                            var i_105_ = i_104_ shr 10 and 0x3f
                            var i_106_ = i_104_ shr 7 and 0x7
                            var i_107_ = i_104_ and 0x7f
                            i_105_ = i_105_ + i_44_ and 0x3f
                            i_106_ += i_45_
                            if (i_106_ < 0) i_106_ = 0
                            else if (i_106_ > 7) i_106_ = 7
                            i_107_ += i_46_
                            if (i_107_ < 0) i_107_ = 0
                            else if (i_107_ > 127) i_107_ = 127
                            aShortArray5311!![i_103_] = (i_105_ shl 10 or (i_106_ shl 7) or i_107_).toShort()
                        }
                        aBoolean5380 = true
                    }
                }
                if (aClass6Array5361 != null) {
                    for (i_108_ in 0..<anInt5389) {
                        val class6 = aClass6Array5361!![i_108_]!!
                        val class350 = aClass350Array5363!![i_108_]!!
                        class350.anInt4313 = (class350.anInt4313 and 0xffffff.inv() or ((Class126.anIntArray4983!![method303((aShortArray5311!![(class6.anInt144)]).toInt() and 0xffff, 30).toInt() and 0xffff]) and 0xffffff))
                    }
                }
            }
        } else if (i == 8) {
            if (anIntArrayArray5379 != null) {
                for (i_109_ in 0..<i_48_) {
                    val i_110_ = `is`[i_109_]
                    if (i_110_ < anIntArrayArray5379!!.size) {
                        val is_111_ = anIntArrayArray5379!![i_110_]!!
                        for (i_112_ in is_111_.indices) {
                            val class350 = aClass350Array5363!![is_111_[i_112_]]!!
                            class350.anInt4316 += i_44_
                            class350.anInt4317 += i_45_
                        }
                    }
                }
            }
        } else if (i == 10) {
            if (anIntArrayArray5379 != null) {
                for (i_113_ in 0..<i_48_) {
                    val i_114_ = `is`[i_113_]
                    if (i_114_ < anIntArrayArray5379!!.size) {
                        val is_115_ = anIntArrayArray5379!![i_114_]!!
                        for (i_116_ in is_115_.indices) {
                            val class350 = aClass350Array5363!![is_115_[i_116_]]!!
                            class350.anInt4314 = class350.anInt4314 * i_44_ shr 7
                            class350.anInt4311 = class350.anInt4311 * i_45_ shr 7
                        }
                    }
                }
            }
        } else if (i == 9 && anIntArrayArray5379 != null) {
            for (i_117_ in 0..<i_48_) {
                val i_118_ = `is`[i_117_]
                if (i_118_ < anIntArrayArray5379!!.size) {
                    val is_119_ = anIntArrayArray5379!![i_118_]!!
                    for (i_120_ in is_119_.indices) {
                        val class350 = aClass350Array5363!![is_119_[i_120_]]!!
                        class350.anInt4308 = class350.anInt4308 + i_44_ and 0x3fff
                    }
                }
            }
        }
    }

    public override fun FA(i: Int) {
        check((anInt5316 and 0x6) == 6)
        val i_121_ = Class70.anIntArray1207!![i]
        val i_122_ = Class70.anIntArray1204!![i]
        synchronized(this) {
            for (i_123_ in 0..<anInt5340) {
                val i_124_ = ((anIntArray5332!![i_123_] * i_122_ - anIntArray5312!![i_123_] * i_121_) shr 14)
                anIntArray5312!![i_123_] = (anIntArray5332!![i_123_] * i_121_ + anIntArray5312!![i_123_] * i_122_) shr 14
                anIntArray5332!![i_123_] = i_124_
            }
            method631()
        }
    }

    public override fun method622() {
        if (aHa_Sub1_5353.anInt7485 > 1) {
            synchronized(this) {
                while (this.aBoolean1124) {
                    try {
                        (this as Object).wait()
                    } catch (interruptedexception: InterruptedException) {
                        /* empty */
                    }
                }
                this.aBoolean1124 = true
            }
        }
    }

    public override fun G(): Int {
        if (!aBoolean5323) method655()
        return aShort5331.toInt()
    }

    public override fun I(i: Int, `is`: IntArray, i_125_: Int, i_126_: Int, i_127_: Int, bool: Boolean, i_128_: Int, is_129_: IntArray?) {
        var i_125_ = i_125_
        var i_126_ = i_126_
        var i_127_ = i_127_
        val i_130_ = `is`.size
        if (i == 0) {
            i_125_ = i_125_ shl 4
            i_126_ = i_126_ shl 4
            i_127_ = i_127_ shl 4
            if (!aBoolean5372) {
                for (i_131_ in 0..<anInt5340) {
                    anIntArray5356!![i_131_] = anIntArray5356!![i_131_] shl 4
                    anIntArray5332!![i_131_] = anIntArray5332!![i_131_] shl 4
                    anIntArray5312!![i_131_] = anIntArray5312!![i_131_] shl 4
                }
                aBoolean5372 = true
            }
            var i_132_ = 0
            anInt5338 = 0
            anInt5375 = 0
            anInt5342 = 0
            for (i_133_ in 0..<i_130_) {
                val i_134_ = `is`[i_133_]
                if (i_134_ < anIntArrayArray5334!!.size) {
                    val is_135_ = anIntArrayArray5334!![i_134_]!!
                    for (i_136_ in is_135_.indices) {
                        val i_137_ = is_135_[i_136_]
                        if (aShortArray5333 == null || (i_128_ and aShortArray5333!![i_137_].toInt()) != 0) {
                            anInt5338 += anIntArray5356!![i_137_]
                            anInt5375 += anIntArray5332!![i_137_]
                            anInt5342 += anIntArray5312!![i_137_]
                            i_132_++
                        }
                    }
                }
            }
            if (i_132_ > 0) {
                anInt5338 = anInt5338 / i_132_ + i_125_
                anInt5375 = anInt5375 / i_132_ + i_126_
                anInt5342 = anInt5342 / i_132_ + i_127_
                aBoolean5369 = true
            } else {
                anInt5338 = i_125_
                anInt5375 = i_126_
                anInt5342 = i_127_
            }
        } else if (i == 1) {
            if (is_129_ != null) {
                val i_138_ = ((is_129_[0] * i_125_ + is_129_[1] * i_126_ + is_129_[2] * i_127_ + 8192) shr 14)
                val i_139_ = ((is_129_[3] * i_125_ + is_129_[4] * i_126_ + is_129_[5] * i_127_ + 8192) shr 14)
                val i_140_ = ((is_129_[6] * i_125_ + is_129_[7] * i_126_ + is_129_[8] * i_127_ + 8192) shr 14)
                i_125_ = i_138_
                i_126_ = i_139_
                i_127_ = i_140_
            }
            i_125_ = i_125_ shl 4
            i_126_ = i_126_ shl 4
            i_127_ = i_127_ shl 4
            if (!aBoolean5372) {
                for (i_141_ in 0..<anInt5340) {
                    anIntArray5356!![i_141_] = anIntArray5356!![i_141_] shl 4
                    anIntArray5332!![i_141_] = anIntArray5332!![i_141_] shl 4
                    anIntArray5312!![i_141_] = anIntArray5312!![i_141_] shl 4
                }
                aBoolean5372 = true
            }
            for (i_142_ in 0..<i_130_) {
                val i_143_ = `is`[i_142_]
                if (i_143_ < anIntArrayArray5334!!.size) {
                    val is_144_ = anIntArrayArray5334!![i_143_]!!
                    for (i_145_ in is_144_.indices) {
                        val i_146_ = is_144_[i_145_]
                        if (aShortArray5333 == null || (i_128_ and aShortArray5333!![i_146_].toInt()) != 0) {
                            anIntArray5356!![i_146_] += i_125_
                            anIntArray5332!![i_146_] += i_126_
                            anIntArray5312!![i_146_] += i_127_
                        }
                    }
                }
            }
        } else if (i == 2) {
            if (is_129_ == null) {
                for (i_196_ in 0..<i_130_) {
                    val i_197_ = `is`[i_196_]
                    if (i_197_ < anIntArrayArray5334!!.size) {
                        val is_198_ = anIntArrayArray5334!![i_197_]!!
                        for (i_199_ in is_198_.indices) {
                            val i_200_ = is_198_[i_199_]
                            if (aShortArray5333 == null || (i_128_ and aShortArray5333!![i_200_].toInt()) != 0) {
                                anIntArray5356!![i_200_] -= anInt5338
                                anIntArray5332!![i_200_] -= anInt5375
                                anIntArray5312!![i_200_] -= anInt5342
                                if (i_127_ != 0) {
                                    val i_201_ = Class70.anIntArray1207!![i_127_]
                                    val i_202_ = Class70.anIntArray1204!![i_127_]
                                    val i_203_ = ((anIntArray5332!![i_200_] * i_201_ + anIntArray5356!![i_200_] * i_202_ + 16383) shr 14)
                                    anIntArray5332!![i_200_] = (anIntArray5332!![i_200_] * i_202_ - anIntArray5356!![i_200_] * i_201_ + 16383) shr 14
                                    anIntArray5356!![i_200_] = i_203_
                                }
                                if (i_125_ != 0) {
                                    val i_204_ = Class70.anIntArray1207!![i_125_]
                                    val i_205_ = Class70.anIntArray1204!![i_125_]
                                    val i_206_ = ((anIntArray5332!![i_200_] * i_205_ - anIntArray5312!![i_200_] * i_204_ + 16383) shr 14)
                                    anIntArray5312!![i_200_] = (anIntArray5332!![i_200_] * i_204_ + anIntArray5312!![i_200_] * i_205_ + 16383) shr 14
                                    anIntArray5332!![i_200_] = i_206_
                                }
                                if (i_126_ != 0) {
                                    val i_207_ = Class70.anIntArray1207!![i_126_]
                                    val i_208_ = Class70.anIntArray1204!![i_126_]
                                    val i_209_ = ((anIntArray5312!![i_200_] * i_207_ + anIntArray5356!![i_200_] * i_208_ + 16383) shr 14)
                                    anIntArray5312!![i_200_] = (anIntArray5312!![i_200_] * i_208_ - anIntArray5356!![i_200_] * i_207_ + 16383) shr 14
                                    anIntArray5356!![i_200_] = i_209_
                                }
                                anIntArray5356!![i_200_] += anInt5338
                                anIntArray5332!![i_200_] += anInt5375
                                anIntArray5312!![i_200_] += anInt5342
                            }
                        }
                    }
                }
            } else {
                if (!aBoolean5372) {
                    for (i_147_ in 0..<anInt5340) {
                        anIntArray5356!![i_147_] = anIntArray5356!![i_147_] shl 4
                        anIntArray5332!![i_147_] = anIntArray5332!![i_147_] shl 4
                        anIntArray5312!![i_147_] = anIntArray5312!![i_147_] shl 4
                    }
                    aBoolean5372 = true
                }
                val i_148_ = is_129_[9] shl 4
                val i_149_ = is_129_[10] shl 4
                val i_150_ = is_129_[11] shl 4
                val i_151_ = is_129_[12] shl 4
                val i_152_ = is_129_[13] shl 4
                val i_153_ = is_129_[14] shl 4
                if (aBoolean5369) {
                    var i_154_ = ((is_129_[0] * anInt5338 + is_129_[3] * anInt5375 + is_129_[6] * anInt5342 + 8192) shr 14)
                    var i_155_ = ((is_129_[1] * anInt5338 + is_129_[4] * anInt5375 + is_129_[7] * anInt5342 + 8192) shr 14)
                    var i_156_ = ((is_129_[2] * anInt5338 + is_129_[5] * anInt5375 + is_129_[8] * anInt5342 + 8192) shr 14)
                    i_154_ += i_151_
                    i_155_ += i_152_
                    i_156_ += i_153_
                    anInt5338 = i_154_
                    anInt5375 = i_155_
                    anInt5342 = i_156_
                    aBoolean5369 = false
                }
                val is_157_ = IntArray(9)
                val i_158_ = Class70.anIntArray1204!![i_125_]
                val i_159_ = Class70.anIntArray1207!![i_125_]
                val i_160_ = Class70.anIntArray1204!![i_126_]
                val i_161_ = Class70.anIntArray1207!![i_126_]
                val i_162_ = Class70.anIntArray1204!![i_127_]
                val i_163_ = Class70.anIntArray1207!![i_127_]
                val i_164_ = i_159_ * i_162_ + 8192 shr 14
                val i_165_ = i_159_ * i_163_ + 8192 shr 14
                is_157_[0] = i_160_ * i_162_ + i_161_ * i_165_ + 8192 shr 14
                is_157_[1] = -i_160_ * i_163_ + i_161_ * i_164_ + 8192 shr 14
                is_157_[2] = i_161_ * i_158_ + 8192 shr 14
                is_157_[3] = i_158_ * i_163_ + 8192 shr 14
                is_157_[4] = i_158_ * i_162_ + 8192 shr 14
                is_157_[5] = -i_159_
                is_157_[6] = -i_161_ * i_162_ + i_160_ * i_165_ + 8192 shr 14
                is_157_[7] = i_161_ * i_163_ + i_160_ * i_164_ + 8192 shr 14
                is_157_[8] = i_160_ * i_158_ + 8192 shr 14
                val i_166_ = (is_157_[0] * -anInt5338 + is_157_[1] * -anInt5375 + is_157_[2] * -anInt5342 + 8192) shr 14
                val i_167_ = (is_157_[3] * -anInt5338 + is_157_[4] * -anInt5375 + is_157_[5] * -anInt5342 + 8192) shr 14
                val i_168_ = (is_157_[6] * -anInt5338 + is_157_[7] * -anInt5375 + is_157_[8] * -anInt5342 + 8192) shr 14
                val i_169_ = i_166_ + anInt5338
                val i_170_ = i_167_ + anInt5375
                val i_171_ = i_168_ + anInt5342
                val is_172_ = IntArray(9)
                for (i_173_ in 0..2) {
                    for (i_174_ in 0..2) {
                        var i_175_ = 0
                        for (i_176_ in 0..2) i_175_ += (is_157_[i_173_ * 3 + i_176_] * is_129_[i_174_ * 3 + i_176_])
                        is_172_[i_173_ * 3 + i_174_] = i_175_ + 8192 shr 14
                    }
                }
                var i_177_ = ((is_157_[0] * i_151_ + is_157_[1] * i_152_ + is_157_[2] * i_153_ + 8192) shr 14)
                var i_178_ = ((is_157_[3] * i_151_ + is_157_[4] * i_152_ + is_157_[5] * i_153_ + 8192) shr 14)
                var i_179_ = ((is_157_[6] * i_151_ + is_157_[7] * i_152_ + is_157_[8] * i_153_ + 8192) shr 14)
                i_177_ += i_169_
                i_178_ += i_170_
                i_179_ += i_171_
                val is_180_ = IntArray(9)
                for (i_181_ in 0..2) {
                    for (i_182_ in 0..2) {
                        var i_183_ = 0
                        for (i_184_ in 0..2) i_183_ += (is_129_[i_181_ * 3 + i_184_] * is_172_[i_182_ + i_184_ * 3])
                        is_180_[i_181_ * 3 + i_182_] = i_183_ + 8192 shr 14
                    }
                }
                var i_185_ = ((is_129_[0] * i_177_ + is_129_[1] * i_178_ + is_129_[2] * i_179_ + 8192) shr 14)
                var i_186_ = ((is_129_[3] * i_177_ + is_129_[4] * i_178_ + is_129_[5] * i_179_ + 8192) shr 14)
                var i_187_ = ((is_129_[6] * i_177_ + is_129_[7] * i_178_ + is_129_[8] * i_179_ + 8192) shr 14)
                i_185_ += i_148_
                i_186_ += i_149_
                i_187_ += i_150_
                for (i_188_ in 0..<i_130_) {
                    val i_189_ = `is`[i_188_]
                    if (i_189_ < anIntArrayArray5334!!.size) {
                        val is_190_ = anIntArrayArray5334!![i_189_]!!
                        for (i_191_ in is_190_.indices) {
                            val i_192_ = is_190_[i_191_]
                            if (aShortArray5333 == null || (i_128_ and aShortArray5333!![i_192_].toInt()) != 0) {
                                var i_193_ = ((is_180_[0] * anIntArray5356!![i_192_] + is_180_[1] * anIntArray5332!![i_192_] + is_180_[2] * anIntArray5312!![i_192_] + 8192) shr 14)
                                var i_194_ = ((is_180_[3] * anIntArray5356!![i_192_] + is_180_[4] * anIntArray5332!![i_192_] + is_180_[5] * anIntArray5312!![i_192_] + 8192) shr 14)
                                var i_195_ = ((is_180_[6] * anIntArray5356!![i_192_] + is_180_[7] * anIntArray5332!![i_192_] + is_180_[8] * anIntArray5312!![i_192_] + 8192) shr 14)
                                i_193_ += i_185_
                                i_194_ += i_186_
                                i_195_ += i_187_
                                anIntArray5356!![i_192_] = i_193_
                                anIntArray5332!![i_192_] = i_194_
                                anIntArray5312!![i_192_] = i_195_
                            }
                        }
                    }
                }
            }
        } else if (i == 3) {
            if (is_129_ == null) {
                for (i_249_ in 0..<i_130_) {
                    val i_250_ = `is`[i_249_]
                    if (i_250_ < anIntArrayArray5334!!.size) {
                        val is_251_ = anIntArrayArray5334!![i_250_]!!
                        for (i_252_ in is_251_.indices) {
                            val i_253_ = is_251_[i_252_]
                            if (aShortArray5333 == null || (i_128_ and aShortArray5333!![i_253_].toInt()) != 0) {
                                anIntArray5356!![i_253_] -= anInt5338
                                anIntArray5332!![i_253_] -= anInt5375
                                anIntArray5312!![i_253_] -= anInt5342
                                anIntArray5356!![i_253_] = anIntArray5356!![i_253_] * i_125_ / 128
                                anIntArray5332!![i_253_] = anIntArray5332!![i_253_] * i_126_ / 128
                                anIntArray5312!![i_253_] = anIntArray5312!![i_253_] * i_127_ / 128
                                anIntArray5356!![i_253_] += anInt5338
                                anIntArray5332!![i_253_] += anInt5375
                                anIntArray5312!![i_253_] += anInt5342
                            }
                        }
                    }
                }
            } else {
                if (!aBoolean5372) {
                    for (i_210_ in 0..<anInt5340) {
                        anIntArray5356!![i_210_] = anIntArray5356!![i_210_] shl 4
                        anIntArray5332!![i_210_] = anIntArray5332!![i_210_] shl 4
                        anIntArray5312!![i_210_] = anIntArray5312!![i_210_] shl 4
                    }
                    aBoolean5372 = true
                }
                val i_211_ = is_129_[9] shl 4
                val i_212_ = is_129_[10] shl 4
                val i_213_ = is_129_[11] shl 4
                val i_214_ = is_129_[12] shl 4
                val i_215_ = is_129_[13] shl 4
                val i_216_ = is_129_[14] shl 4
                if (aBoolean5369) {
                    var i_217_ = ((is_129_[0] * anInt5338 + is_129_[3] * anInt5375 + is_129_[6] * anInt5342 + 8192) shr 14)
                    var i_218_ = ((is_129_[1] * anInt5338 + is_129_[4] * anInt5375 + is_129_[7] * anInt5342 + 8192) shr 14)
                    var i_219_ = ((is_129_[2] * anInt5338 + is_129_[5] * anInt5375 + is_129_[8] * anInt5342 + 8192) shr 14)
                    i_217_ += i_214_
                    i_218_ += i_215_
                    i_219_ += i_216_
                    anInt5338 = i_217_
                    anInt5375 = i_218_
                    anInt5342 = i_219_
                    aBoolean5369 = false
                }
                val i_220_ = i_125_ shl 15 shr 7
                val i_221_ = i_126_ shl 15 shr 7
                val i_222_ = i_127_ shl 15 shr 7
                val i_223_ = i_220_ * -anInt5338 + 8192 shr 14
                val i_224_ = i_221_ * -anInt5375 + 8192 shr 14
                val i_225_ = i_222_ * -anInt5342 + 8192 shr 14
                val i_226_ = i_223_ + anInt5338
                val i_227_ = i_224_ + anInt5375
                val i_228_ = i_225_ + anInt5342
                val is_229_ = IntArray(9)
                is_229_[0] = i_220_ * is_129_[0] + 8192 shr 14
                is_229_[1] = i_220_ * is_129_[3] + 8192 shr 14
                is_229_[2] = i_220_ * is_129_[6] + 8192 shr 14
                is_229_[3] = i_221_ * is_129_[1] + 8192 shr 14
                is_229_[4] = i_221_ * is_129_[4] + 8192 shr 14
                is_229_[5] = i_221_ * is_129_[7] + 8192 shr 14
                is_229_[6] = i_222_ * is_129_[2] + 8192 shr 14
                is_229_[7] = i_222_ * is_129_[5] + 8192 shr 14
                is_229_[8] = i_222_ * is_129_[8] + 8192 shr 14
                var i_230_ = i_220_ * i_214_ + 8192 shr 14
                var i_231_ = i_221_ * i_215_ + 8192 shr 14
                var i_232_ = i_222_ * i_216_ + 8192 shr 14
                i_230_ += i_226_
                i_231_ += i_227_
                i_232_ += i_228_
                val is_233_ = IntArray(9)
                for (i_234_ in 0..2) {
                    for (i_235_ in 0..2) {
                        var i_236_ = 0
                        for (i_237_ in 0..2) i_236_ += (is_129_[i_234_ * 3 + i_237_] * is_229_[i_235_ + i_237_ * 3])
                        is_233_[i_234_ * 3 + i_235_] = i_236_ + 8192 shr 14
                    }
                }
                var i_238_ = ((is_129_[0] * i_230_ + is_129_[1] * i_231_ + is_129_[2] * i_232_ + 8192) shr 14)
                var i_239_ = ((is_129_[3] * i_230_ + is_129_[4] * i_231_ + is_129_[5] * i_232_ + 8192) shr 14)
                var i_240_ = ((is_129_[6] * i_230_ + is_129_[7] * i_231_ + is_129_[8] * i_232_ + 8192) shr 14)
                i_238_ += i_211_
                i_239_ += i_212_
                i_240_ += i_213_
                for (i_241_ in 0..<i_130_) {
                    val i_242_ = `is`[i_241_]
                    if (i_242_ < anIntArrayArray5334!!.size) {
                        val is_243_ = anIntArrayArray5334!![i_242_]!!
                        for (i_244_ in is_243_.indices) {
                            val i_245_ = is_243_[i_244_]
                            if (aShortArray5333 == null || (i_128_ and aShortArray5333!![i_245_].toInt()) != 0) {
                                var i_246_ = ((is_233_[0] * anIntArray5356!![i_245_] + is_233_[1] * anIntArray5332!![i_245_] + is_233_[2] * anIntArray5312!![i_245_] + 8192) shr 14)
                                var i_247_ = ((is_233_[3] * anIntArray5356!![i_245_] + is_233_[4] * anIntArray5332!![i_245_] + is_233_[5] * anIntArray5312!![i_245_] + 8192) shr 14)
                                var i_248_ = ((is_233_[6] * anIntArray5356!![i_245_] + is_233_[7] * anIntArray5332!![i_245_] + is_233_[8] * anIntArray5312!![i_245_] + 8192) shr 14)
                                i_246_ += i_238_
                                i_247_ += i_239_
                                i_248_ += i_240_
                                anIntArray5356!![i_245_] = i_246_
                                anIntArray5332!![i_245_] = i_247_
                                anIntArray5312!![i_245_] = i_248_
                            }
                        }
                    }
                }
            }
        } else if (i == 5) {
            if (anIntArrayArray5330 != null && aByteArray5325 != null) {
                for (i_254_ in 0..<i_130_) {
                    val i_255_ = `is`[i_254_]
                    if (i_255_ < anIntArrayArray5330!!.size) {
                        val is_256_ = anIntArrayArray5330!![i_255_]!!
                        for (i_257_ in is_256_.indices) {
                            val i_258_ = is_256_[i_257_]
                            if (aShortArray5370 == null || (i_128_ and aShortArray5370!![i_258_].toInt()) != 0) {
                                var i_259_ = ((aByteArray5325!![i_258_].toInt() and 0xff) + i_125_ * 8)
                                if (i_259_ < 0) i_259_ = 0
                                else if (i_259_ > 255) i_259_ = 255
                                aByteArray5325!![i_258_] = i_259_.toByte()
                            }
                        }
                    }
                }
                if (aClass6Array5361 != null) {
                    for (i_260_ in 0..<anInt5389) {
                        val class6 = aClass6Array5361!![i_260_]!!
                        val class350 = aClass350Array5363!![i_260_]!!
                        class350.anInt4313 = (class350.anInt4313 and 0xffffff or ((255 - (aByteArray5325!![class6.anInt144].toInt() and 0xff)) shl 24))
                    }
                }
            }
        } else if (i == 7) {
            if (anIntArrayArray5330 != null) {
                for (i_261_ in 0..<i_130_) {
                    val i_262_ = `is`[i_261_]
                    if (i_262_ < anIntArrayArray5330!!.size) {
                        val is_263_ = anIntArrayArray5330!![i_262_]!!
                        for (i_264_ in is_263_.indices) {
                            val i_265_ = is_263_[i_264_]
                            if (aShortArray5370 == null || (i_128_ and aShortArray5370!![i_265_].toInt()) != 0) {
                                val i_266_ = aShortArray5311!![i_265_].toInt() and 0xffff
                                var i_267_ = i_266_ shr 10 and 0x3f
                                var i_268_ = i_266_ shr 7 and 0x7
                                var i_269_ = i_266_ and 0x7f
                                i_267_ = i_267_ + i_125_ and 0x3f
                                i_268_ += i_126_
                                if (i_268_ < 0) i_268_ = 0
                                else if (i_268_ > 7) i_268_ = 7
                                i_269_ += i_127_
                                if (i_269_ < 0) i_269_ = 0
                                else if (i_269_ > 127) i_269_ = 127
                                aShortArray5311!![i_265_] = (i_267_ shl 10 or (i_268_ shl 7) or i_269_).toShort()
                            }
                        }
                        aBoolean5380 = true
                    }
                }
                if (aClass6Array5361 != null) {
                    for (i_270_ in 0..<anInt5389) {
                        val class6 = aClass6Array5361!![i_270_]!!
                        val class350 = aClass350Array5363!![i_270_]!!
                        class350.anInt4313 = (class350.anInt4313 and 0xffffff.inv() or ((Class126.anIntArray4983!![method303((aShortArray5311!![(class6.anInt144)]).toInt() and 0xffff, 30).toInt() and 0xffff]) and 0xffffff))
                    }
                }
            }
        } else if (i == 8) {
            if (anIntArrayArray5379 != null) {
                for (i_271_ in 0..<i_130_) {
                    val i_272_ = `is`[i_271_]
                    if (i_272_ < anIntArrayArray5379!!.size) {
                        val is_273_ = anIntArrayArray5379!![i_272_]!!
                        for (i_274_ in is_273_.indices) {
                            val class350 = aClass350Array5363!![is_273_[i_274_]]!!
                            class350.anInt4316 += i_125_
                            class350.anInt4317 += i_126_
                        }
                    }
                }
            }
        } else if (i == 10) {
            if (anIntArrayArray5379 != null) {
                for (i_275_ in 0..<i_130_) {
                    val i_276_ = `is`[i_275_]
                    if (i_276_ < anIntArrayArray5379!!.size) {
                        val is_277_ = anIntArrayArray5379!![i_276_]!!
                        for (i_278_ in is_277_.indices) {
                            val class350 = aClass350Array5363!![is_277_[i_278_]]!!
                            class350.anInt4314 = (class350.anInt4314 * i_125_ shr 7)
                            class350.anInt4311 = (class350.anInt4311 * i_126_ shr 7)
                        }
                    }
                }
            }
        } else if (i == 9 && anIntArrayArray5379 != null) {
            for (i_279_ in 0..<i_130_) {
                val i_280_ = `is`[i_279_]
                if (i_280_ < anIntArrayArray5379!!.size) {
                    val is_281_ = anIntArrayArray5379!![i_280_]!!
                    for (i_282_ in is_281_.indices) {
                        val class350 = aClass350Array5363!![is_281_[i_282_]]!!
                        class350.anInt4308 = (class350.anInt4308 + i_125_ and 0x3fff)
                    }
                }
            }
        }
    }

    private fun method636() {
        if (anInt5354 == 0 && aClass360Array5360 == null) {
            if (aHa_Sub1_5353.anInt7485 > 1) {
                synchronized(this) {
                    method649()
                }
            } else method649()
        }
    }

    public override fun wa() {
        if (aBoolean5372) {
            for (i in 0..<anInt5340) {
                anIntArray5356!![i] = anIntArray5356!![i] + 7 shr 4
                anIntArray5332!![i] = anIntArray5332!![i] + 7 shr 4
                anIntArray5312!![i] = anIntArray5312!![i] + 7 shr 4
            }
            aBoolean5372 = false
        }
        if (aBoolean5380) {
            method647()
            aBoolean5380 = false
        }
        aBoolean5323 = false
    }

    public override fun fa(): Int {
        if (!aBoolean5323) method655()
        return aShort5329.toInt()
    }

    private fun method637(i: Int, i_283_: Int): Int {
        var i_283_ = i_283_
        i_283_ = i_283_ * (i and 0x7f) shr 7
        if (i_283_ < 2) i_283_ = 2
        else if (i_283_ > 126) i_283_ = 126
        return (i and 0xff80) + i_283_
    }

    private fun method638(i: Int): Boolean {
        if (anIntArray5400 == null) return false
        return anIntArray5400!![i] != -1
    }

    public override fun da(): Int {
        return anInt5349
    }

    private fun method639() {
        synchronized(this) {
            for (i in 0..<anInt5340) {
                val i_284_ = anIntArray5312!![i]
                anIntArray5312!![i] = anIntArray5356!![i]
                anIntArray5356!![i] = -i_284_
            }
            method631()
        }
    }

    public override fun method618(): Boolean {
        if (aShortArray5388 == null) return true
        for (i in aShortArray5388!!.indices) {
            if (aShortArray5388!![i].toInt() != -1 && !aHa_Sub1_5353.method3725(aShortArray5388!![i].toInt())) return false
        }
        return true
    }

    public override fun method620(class101: Class101?) {
        val class101_sub1 = class101 as Class101_Sub1
        if (aClass129Array5322 != null) {
            for (i in aClass129Array5322!!.indices) {
                val class129 = aClass129Array5322!![i]!!
                var class129_285_: Class129? = class129
                if (class129.aClass129_1888 != null) class129_285_ = class129.aClass129_1888
                class129_285_!!.anInt1882 = (class101_sub1.aFloat5686 + ((class101_sub1.aFloat5672 * (anIntArray5356!![class129.anInt1881]).toFloat()) + (class101_sub1.aFloat5673 * (anIntArray5332!![(class129.anInt1881)]).toFloat()) + (class101_sub1.aFloat5669 * (anIntArray5312!![(class129.anInt1881)]).toFloat()))).toInt()
                class129_285_.anInt1891 = (class101_sub1.aFloat5685 + ((class101_sub1.aFloat5655 * (anIntArray5356!![class129.anInt1881]).toFloat()) + (class101_sub1.aFloat5678 * (anIntArray5332!![(class129.anInt1881)]).toFloat()) + (class101_sub1.aFloat5666 * (anIntArray5312!![(class129.anInt1881)]).toFloat()))).toInt()
                class129_285_.anInt1889 = (class101_sub1.aFloat5681 + ((class101_sub1.aFloat5662 * (anIntArray5356!![class129.anInt1881]).toFloat()) + (class101_sub1.aFloat5680 * (anIntArray5332!![(class129.anInt1881)]).toFloat()) + (class101_sub1.aFloat5664 * (anIntArray5312!![(class129.anInt1881)]).toFloat()))).toInt()
                class129_285_.anInt1883 = (class101_sub1.aFloat5686 + ((class101_sub1.aFloat5672 * (anIntArray5356!![class129.anInt1877]).toFloat()) + (class101_sub1.aFloat5673 * (anIntArray5332!![(class129.anInt1877)]).toFloat()) + (class101_sub1.aFloat5669 * (anIntArray5312!![(class129.anInt1877)]).toFloat()))).toInt()
                class129_285_.anInt1890 = (class101_sub1.aFloat5685 + ((class101_sub1.aFloat5655 * (anIntArray5356!![class129.anInt1877]).toFloat()) + (class101_sub1.aFloat5678 * (anIntArray5332!![(class129.anInt1877)]).toFloat()) + (class101_sub1.aFloat5666 * (anIntArray5312!![(class129.anInt1877)]).toFloat()))).toInt()
                class129_285_.anInt1880 = (class101_sub1.aFloat5681 + ((class101_sub1.aFloat5662 * (anIntArray5356!![class129.anInt1877]).toFloat()) + (class101_sub1.aFloat5680 * (anIntArray5332!![(class129.anInt1877)]).toFloat()) + (class101_sub1.aFloat5664 * (anIntArray5312!![(class129.anInt1877)]).toFloat()))).toInt()
                class129_285_.anInt1876 = (class101_sub1.aFloat5686 + ((class101_sub1.aFloat5672 * (anIntArray5356!![class129.anInt1892]).toFloat()) + (class101_sub1.aFloat5673 * (anIntArray5332!![(class129.anInt1892)]).toFloat()) + (class101_sub1.aFloat5669 * (anIntArray5312!![(class129.anInt1892)]).toFloat()))).toInt()
                class129_285_.anInt1874 = (class101_sub1.aFloat5685 + ((class101_sub1.aFloat5655 * (anIntArray5356!![class129.anInt1892]).toFloat()) + (class101_sub1.aFloat5678 * (anIntArray5332!![(class129.anInt1892)]).toFloat()) + (class101_sub1.aFloat5666 * (anIntArray5312!![(class129.anInt1892)]).toFloat()))).toInt()
                class129_285_.anInt1884 = (class101_sub1.aFloat5681 + ((class101_sub1.aFloat5662 * (anIntArray5356!![class129.anInt1892]).toFloat()) + (class101_sub1.aFloat5680 * (anIntArray5332!![(class129.anInt1892)]).toFloat()) + (class101_sub1.aFloat5664 * (anIntArray5312!![(class129.anInt1892)]).toFloat()))).toInt()
            }
        }
        if (aClass342Array5335 != null) {
            for (i in aClass342Array5335!!.indices) {
                val class342 = aClass342Array5335!![i]!!
                var class342_286_: Class342? = class342
                if (class342.aClass342_4248 != null) class342_286_ = class342.aClass342_4248
                if (class342.aClass101_4252 != null) class342.aClass101_4252!!.method898(class101_sub1)
                else class342.aClass101_4252 = class101_sub1.method907()
                class342_286_!!.anInt4238 = (class101_sub1.aFloat5686 + ((class101_sub1.aFloat5672 * (anIntArray5356!![class342.anInt4244]).toFloat()) + (class101_sub1.aFloat5673 * (anIntArray5332!![(class342.anInt4244)]).toFloat()) + (class101_sub1.aFloat5669 * (anIntArray5312!![(class342.anInt4244)]).toFloat()))).toInt()
                class342_286_.anInt4239 = (class101_sub1.aFloat5685 + ((class101_sub1.aFloat5655 * (anIntArray5356!![class342.anInt4244]).toFloat()) + (class101_sub1.aFloat5678 * (anIntArray5332!![(class342.anInt4244)]).toFloat()) + (class101_sub1.aFloat5666 * (anIntArray5312!![(class342.anInt4244)]).toFloat()))).toInt()
                class342_286_.anInt4240 = (class101_sub1.aFloat5681 + ((class101_sub1.aFloat5662 * (anIntArray5356!![class342.anInt4244]).toFloat()) + (class101_sub1.aFloat5680 * (anIntArray5332!![(class342.anInt4244)]).toFloat()) + (class101_sub1.aFloat5664 * (anIntArray5312!![(class342.anInt4244)]).toFloat()))).toInt()
            }
        }
    }

    private fun method640() {
        for (i in 0..<anInt5351) {
            val i_287_: Short = if (aShortArray5388 != null) aShortArray5388!![i] else (-1).toShort()
            if (i_287_.toInt() == -1) {
                val i_288_ = aShortArray5311!![i].toInt() and 0xffff
                val i_289_ = (i_288_ and 0x7f) * anInt5344 shr 7
                val i_290_ = method303(i_288_ and 0x7f.inv() or i_289_, 30)
                if (anIntArray5366!![i] == -1) {
                    val i_291_ = anIntArray5368!![i] and 0x1ffff.inv()
                    anIntArray5368!![i] = i_291_ or Class291.method2198(0, i_291_ shr 17, i_290_.toInt())
                } else if (anIntArray5366!![i] != -2) {
                    var i_292_ = anIntArray5368!![i] and 0x1ffff.inv()
                    anIntArray5368!![i] = i_292_ or Class291.method2198(0, i_292_ shr 17, i_290_.toInt())
                    i_292_ = anIntArray5337!![i] and 0x1ffff.inv()
                    anIntArray5337!![i] = i_292_ or Class291.method2198(0, i_292_ shr 17, i_290_.toInt())
                    i_292_ = anIntArray5366!![i] and 0x1ffff.inv()
                    anIntArray5366!![i] = i_292_ or Class291.method2198(0, i_292_ shr 17, i_290_.toInt())
                }
            }
        }
        anInt5354 = 2
    }

    public override fun k(i: Int) {
        check((anInt5316 and 0xd) == 13)
        if (aClass360Array5360 != null) {
            if (i == 4096) method653()
            else if (i == 8192) method652()
            else if (i == 12288) method641()
            else {
                val i_293_ = Class70.anIntArray1207!![i]
                val i_294_ = Class70.anIntArray1204!![i]
                synchronized(this) {
                    for (i_295_ in 0..<anInt5387) {
                        var i_296_ = ((anIntArray5312!![i_295_] * i_293_ + anIntArray5356!![i_295_] * i_294_) shr 14)
                        anIntArray5312!![i_295_] = (anIntArray5312!![i_295_] * i_294_ - anIntArray5356!![i_295_] * i_293_) shr 14
                        anIntArray5356!![i_295_] = i_296_
                        if (aClass360Array5360!![i_295_] != null) {
                            i_296_ = ((aClass360Array5360!![i_295_]!!.anInt4427) * i_293_ + (aClass360Array5360!![i_295_]!!.anInt4430) * i_294_) shr 14
                            aClass360Array5360!![i_295_]!!.anInt4427 = ((aClass360Array5360!![i_295_]!!.anInt4427) * i_294_ - (aClass360Array5360!![i_295_]!!.anInt4430) * i_293_) shr 14
                            aClass360Array5360!![i_295_]!!.anInt4430 = i_296_
                        }
                    }
                    if (aClass41Array5385 != null) {
                        for (i_297_ in 0..<anInt5351) {
                            if (aClass41Array5385!![i_297_] != null) {
                                val i_298_ = ((aClass41Array5385!![i_297_]!!.anInt559) * i_293_ + (aClass41Array5385!![i_297_]!!.anInt561) * i_294_) shr 14
                                aClass41Array5385!![i_297_]!!.anInt559 = ((aClass41Array5385!![i_297_]!!.anInt559) * i_294_ - (aClass41Array5385!![i_297_]!!.anInt561) * i_293_) shr 14
                                aClass41Array5385!![i_297_]!!.anInt561 = i_298_
                            }
                        }
                    }
                    for (i_299_ in anInt5387..<anInt5340) {
                        val i_300_ = ((anIntArray5312!![i_299_] * i_293_ + anIntArray5356!![i_299_] * i_294_) shr 14)
                        anIntArray5312!![i_299_] = (anIntArray5312!![i_299_] * i_294_ - anIntArray5356!![i_299_] * i_293_) shr 14
                        anIntArray5356!![i_299_] = i_300_
                    }
                    anInt5354 = 0
                    aBoolean5323 = false
                }
            }
        } else a(i)
    }

    public override fun method610(class101: Class101, i: Int, bool: Boolean) {
        if (aShortArray5333 != null) {
            val `is` = IntArray(3)
            for (i_301_ in 0..<anInt5387) {
                if ((i and aShortArray5333!![i_301_].toInt()) != 0) {
                    if (bool) class101.method892(anIntArray5356!![i_301_], anIntArray5332!![i_301_], anIntArray5312!![i_301_], `is`)
                    else class101.method897(anIntArray5356!![i_301_], anIntArray5332!![i_301_], anIntArray5312!![i_301_], `is`)
                    anIntArray5356!![i_301_] = `is`[0]
                    anIntArray5332!![i_301_] = `is`[1]
                    anIntArray5312!![i_301_] = `is`[2]
                }
            }
        }
    }

    public override fun method612() {
        /* empty */
    }

    private fun method641() {
        synchronized(this) {
            for (i in 0..<anInt5387) {
                var i_302_ = anIntArray5312!![i]
                anIntArray5312!![i] = anIntArray5356!![i]
                anIntArray5356!![i] = -i_302_
                if (aClass360Array5360!![i] != null) {
                    i_302_ = aClass360Array5360!![i]!!.anInt4427
                    aClass360Array5360!![i]!!.anInt4427 = aClass360Array5360!![i]!!.anInt4430
                    aClass360Array5360!![i]!!.anInt4430 = -i_302_
                }
            }
            if (aClass41Array5385 != null) {
                for (i in 0..<anInt5351) {
                    if (aClass41Array5385!![i] != null) {
                        val i_303_ = aClass41Array5385!![i]!!.anInt559
                        aClass41Array5385!![i]!!.anInt559 = aClass41Array5385!![i]!!.anInt561
                        aClass41Array5385!![i]!!.anInt561 = -i_303_
                    }
                }
            }
            for (i in anInt5387..<anInt5340) {
                val i_304_ = anIntArray5312!![i]
                anIntArray5312!![i] = anIntArray5356!![i]
                anIntArray5356!![i] = -i_304_
            }
            anInt5354 = 0
            aBoolean5323 = false
        }
    }

    private fun method642(i: Int, i_305_: Short, i_306_: Int): Int {
        var i_307_ = Class10.anIntArray179!![method637(i, i_306_)]
        val class12 = aHa_Sub1_5353.aD4579!!.method3(i_305_.toInt() and 0xffff, -6662)
        val i_308_ = class12!!.aByte201.toInt() and 0xff
        if (i_308_ != 0) {
            val i_309_ = 131586 * i_306_
            if (i_308_ == 256) i_307_ = i_309_
            else {
                val i_310_ = i_308_
                val i_311_ = 256 - i_308_
                i_307_ = ((((i_309_ and 0xff00ff) * i_310_ + (i_307_ and 0xff00ff) * i_311_) and 0xff00ff.inv()) + (((i_309_ and 0xff00) * i_310_ + (i_307_ and 0xff00) * i_311_) and 0xff0000)) shr 8
            }
        }
        var i_312_ = class12.aByte216.toInt() and 0xff
        if (i_312_ != 0) {
            i_312_ += 256
            var i_313_ = ((i_307_ and 0xff0000) shr 16) * i_312_
            if (i_313_ > 65535) i_313_ = 65535
            var i_314_ = ((i_307_ and 0xff00) shr 8) * i_312_
            if (i_314_ > 65535) i_314_ = 65535
            var i_315_ = (i_307_ and 0xff) * i_312_
            if (i_315_ > 65535) i_315_ = 65535
            i_307_ = (i_313_ shl 8 and 0xff0000) + (i_314_ and 0xff00) + (i_315_ shr 8)
        }
        return i_307_
    }

    public override fun method608(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int, i_316_: Int) {
        method654(class101, class318_sub3, i, i_316_)
    }

    public override fun NA(): Boolean {
        if (anIntArrayArray5334 == null) return false
        anInt5338 = 0
        anInt5375 = 0
        anInt5342 = 0
        return true
    }

    private fun method643(i: Int, bool: Boolean, bool_317_: Boolean) {
        if (anIntArray5366!![i] != -2) {
            val i_318_ = aShortArray5317[i]
            val i_319_ = aShortArray5394[i]
            val i_320_ = aShortArray5364[i]
            val i_321_ = anIntArray5321[i_318_.toInt()]
            val i_322_ = anIntArray5321[i_319_.toInt()]
            val i_323_ = anIntArray5321[i_320_.toInt()]
            if (bool && (i_321_ == -5000 || i_322_ == -5000 || i_323_ == -5000)) {
                var i_324_ = anIntArray5399[i_318_.toInt()]
                val i_325_ = anIntArray5399[i_319_.toInt()]
                var i_326_ = anIntArray5399[i_320_.toInt()]
                var i_327_ = anIntArray5384[i_318_.toInt()]
                val i_328_ = anIntArray5384[i_319_.toInt()]
                var i_329_ = anIntArray5384[i_320_.toInt()]
                var i_330_ = anIntArray5392[i_318_.toInt()]
                val i_331_ = anIntArray5392[i_319_.toInt()]
                var i_332_ = anIntArray5392[i_320_.toInt()]
                i_324_ -= i_325_
                i_326_ -= i_325_
                i_327_ -= i_328_
                i_329_ -= i_328_
                i_330_ -= i_331_
                i_332_ -= i_331_
                val i_333_ = i_327_ * i_332_ - i_330_ * i_329_
                val i_334_ = i_330_ * i_326_ - i_324_ * i_332_
                val i_335_ = i_324_ * i_329_ - i_327_ * i_326_
                if (i_325_ * i_333_ + i_328_ * i_334_ + i_331_ * i_335_ > 0) method646(i)
            } else if (anIntArray5400!![i] != -1 || ((i_321_ - i_322_) * (anIntArray5343[i_320_.toInt()] - anIntArray5343[i_319_.toInt()]) - ((anIntArray5343[i_318_.toInt()] - anIntArray5343[i_319_.toInt()]) * (i_323_ - i_322_))) > 0) {
                aClass109_5383!!.aBoolean1671 = i_321_ < 0 || i_322_ < 0 || i_323_ < 0 || i_321_ > aClass167_5367!!.anInt2221 || i_322_ > aClass167_5367!!.anInt2221 || i_323_ > aClass167_5367!!.anInt2221
                if (bool_317_) {
                    val i_336_ = anIntArray5400!![i]
                    if (i_336_ == -1 || !aClass6Array5361!![i_336_]!!.aBoolean145) method658(i)
                } else {
                    val i_337_ = anIntArray5400!![i]
                    if (i_337_ != -1) {
                        val class6 = aClass6Array5361!![i_337_]!!
                        val class350 = aClass350Array5363!![i_337_]!!
                        if (!class6.aBoolean145) method635(i)
                        aHa_Sub1_5353.method3720(class350.anInt4312, class350.anInt4310, class350.anInt4320, class350.anInt4309, class350.anInt4307, class350.anInt4308, class6.aShort146.toInt() and 0xffff, class350.anInt4313, class6.aByte148.toInt(), class6.aByte156.toInt())
                    } else method635(i)
                }
            }
        }
    }

    public override fun F(): Boolean {
        return aBoolean5382
    }

    public override fun P(i: Int, i_338_: Int, i_339_: Int, i_340_: Int) {
        if (i == 0) {
            var i_341_ = 0
            anInt5338 = 0
            anInt5375 = 0
            anInt5342 = 0
            for (i_342_ in 0..<anInt5340) {
                anInt5338 += anIntArray5356!![i_342_]
                anInt5375 += anIntArray5332!![i_342_]
                anInt5342 += anIntArray5312!![i_342_]
                i_341_++
            }
            if (i_341_ > 0) {
                anInt5338 = anInt5338 / i_341_ + i_338_
                anInt5375 = anInt5375 / i_341_ + i_339_
                anInt5342 = anInt5342 / i_341_ + i_340_
            } else {
                anInt5338 = i_338_
                anInt5375 = i_339_
                anInt5342 = i_340_
            }
        } else if (i == 1) {
            for (i_343_ in 0..<anInt5340) {
                anIntArray5356!![i_343_] += i_338_
                anIntArray5332!![i_343_] += i_339_
                anIntArray5312!![i_343_] += i_340_
            }
        } else if (i == 2) {
            for (i_344_ in 0..<anInt5340) {
                anIntArray5356!![i_344_] -= anInt5338
                anIntArray5332!![i_344_] -= anInt5375
                anIntArray5312!![i_344_] -= anInt5342
                if (i_340_ != 0) {
                    val i_345_ = Class70.anIntArray1207!![i_340_]
                    val i_346_ = Class70.anIntArray1204!![i_340_]
                    val i_347_ = ((anIntArray5332!![i_344_] * i_345_ + anIntArray5356!![i_344_] * i_346_ + 16383) shr 14)
                    anIntArray5332!![i_344_] = (anIntArray5332!![i_344_] * i_346_ - anIntArray5356!![i_344_] * i_345_ + 16383) shr 14
                    anIntArray5356!![i_344_] = i_347_
                }
                if (i_338_ != 0) {
                    val i_348_ = Class70.anIntArray1207!![i_338_]
                    val i_349_ = Class70.anIntArray1204!![i_338_]
                    val i_350_ = ((anIntArray5332!![i_344_] * i_349_ - anIntArray5312!![i_344_] * i_348_ + 16383) shr 14)
                    anIntArray5312!![i_344_] = (anIntArray5332!![i_344_] * i_348_ + anIntArray5312!![i_344_] * i_349_ + 16383) shr 14
                    anIntArray5332!![i_344_] = i_350_
                }
                if (i_339_ != 0) {
                    val i_351_ = Class70.anIntArray1207!![i_339_]
                    val i_352_ = Class70.anIntArray1204!![i_339_]
                    val i_353_ = ((anIntArray5312!![i_344_] * i_351_ + anIntArray5356!![i_344_] * i_352_ + 16383) shr 14)
                    anIntArray5312!![i_344_] = (anIntArray5312!![i_344_] * i_352_ - anIntArray5356!![i_344_] * i_351_ + 16383) shr 14
                    anIntArray5356!![i_344_] = i_353_
                }
                anIntArray5356!![i_344_] += anInt5338
                anIntArray5332!![i_344_] += anInt5375
                anIntArray5312!![i_344_] += anInt5342
            }
        } else if (i == 3) {
            for (i_354_ in 0..<anInt5340) {
                anIntArray5356!![i_354_] -= anInt5338
                anIntArray5332!![i_354_] -= anInt5375
                anIntArray5312!![i_354_] -= anInt5342
                anIntArray5356!![i_354_] = anIntArray5356!![i_354_] * i_338_ / 128
                anIntArray5332!![i_354_] = anIntArray5332!![i_354_] * i_339_ / 128
                anIntArray5312!![i_354_] = anIntArray5312!![i_354_] * i_340_ / 128
                anIntArray5356!![i_354_] += anInt5338
                anIntArray5332!![i_354_] += anInt5375
                anIntArray5312!![i_354_] += anInt5342
            }
        } else if (i == 5) {
            for (i_355_ in 0..<anInt5351) {
                var i_356_ = (aByteArray5325!![i_355_].toInt() and 0xff) + i_338_ * 8
                if (i_356_ < 0) i_356_ = 0
                else if (i_356_ > 255) i_356_ = 255
                aByteArray5325!![i_355_] = i_356_.toByte()
            }
            if (aClass6Array5361 != null) {
                for (i_357_ in 0..<anInt5389) {
                    val class6 = aClass6Array5361!![i_357_]!!
                    val class350 = aClass350Array5363!![i_357_]!!
                    class350.anInt4313 = (class350.anInt4313 and 0xffffff or (255 - (aByteArray5325!![class6.anInt144].toInt() and 0xff) shl 24))
                }
            }
        } else if (i == 7) {
            for (i_358_ in 0..<anInt5351) {
                val i_359_ = aShortArray5311!![i_358_].toInt() and 0xffff
                var i_360_ = i_359_ shr 10 and 0x3f
                var i_361_ = i_359_ shr 7 and 0x7
                var i_362_ = i_359_ and 0x7f
                i_360_ = i_360_ + i_338_ and 0x3f
                i_361_ += i_339_
                if (i_361_ < 0) i_361_ = 0
                else if (i_361_ > 7) i_361_ = 7
                i_362_ += i_340_
                if (i_362_ < 0) i_362_ = 0
                else if (i_362_ > 127) i_362_ = 127
                aShortArray5311!![i_358_] = (i_360_ shl 10 or (i_361_ shl 7) or i_362_).toShort()
            }
            aBoolean5380 = true
            if (aClass6Array5361 != null) {
                for (i_363_ in 0..<anInt5389) {
                    val class6 = aClass6Array5361!![i_363_]!!
                    val class350 = aClass350Array5363!![i_363_]!!
                    class350.anInt4313 = (class350.anInt4313 and 0xffffff.inv() or ((Class126.anIntArray4983!![method303((aShortArray5311!![(class6.anInt144)]).toInt() and 0xffff, 30).toInt() and 0xffff]) and 0xffffff))
                }
            }
        } else if (i == 8) {
            for (i_364_ in 0..<anInt5389) {
                val class350 = aClass350Array5363!![i_364_]!!
                class350.anInt4316 += i_338_
                class350.anInt4317 += i_339_
            }
        } else if (i == 10) {
            for (i_365_ in 0..<anInt5389) {
                val class350 = aClass350Array5363!![i_365_]!!
                class350.anInt4314 = class350.anInt4314 * i_338_ shr 7
                class350.anInt4311 = class350.anInt4311 * i_339_ shr 7
            }
        } else if (i == 9) {
            for (i_366_ in 0..<anInt5389) {
                val class350 = aClass350Array5363!![i_366_]!!
                class350.anInt4308 = class350.anInt4308 + i_338_ and 0x3fff
            }
        }
    }

    public override fun na(): Int {
        if (!aBoolean5323) method655()
        return aShort5324.toInt()
    }

    public override fun ba(var_r: r?): r? {
        return null
    }

    public override fun p(i: Int, i_367_: Int, var_s: s?, var_s_368_: s?, i_369_: Int, i_370_: Int, i_371_: Int) {
        if (i == 3) {
            check((anInt5316 and 0x7) == 7)
        } else check((anInt5316 and 0x2) == 2)
        if (!aBoolean5323) method655()
        var i_372_ = i_369_ + aShort5395
        var i_373_ = i_369_ + aShort5393
        var i_374_ = i_371_ + aShort5352
        var i_375_ = i_371_ + aShort5331
        if (i == 4 || (i_372_ >= 0 && (i_373_ + var_s!!.anInt4592 shr var_s.anInt4588 < var_s.anInt4587) && i_374_ >= 0 && (i_375_ + var_s.anInt4592 shr var_s.anInt4588 < var_s.anInt4590))) {
            val `is` = var_s!!.anIntArrayArray4584
            var is_376_: Array<IntArray?>? = null
            if (var_s_368_ != null) is_376_ = var_s_368_.anIntArrayArray4584
            if (i == 4 || i == 5) {
                if (var_s_368_ == null || (i_372_ < 0 || ((i_373_ + var_s_368_.anInt4592 shr var_s_368_.anInt4588) >= var_s_368_.anInt4587) || i_374_ < 0 || ((i_375_ + var_s_368_.anInt4592 shr var_s_368_.anInt4588) >= var_s_368_.anInt4590))) return
            } else {
                i_372_ = i_372_ shr var_s.anInt4588
                i_373_ = (i_373_ + (var_s.anInt4592 - 1) shr var_s.anInt4588)
                i_374_ = i_374_ shr var_s.anInt4588
                i_375_ = (i_375_ + (var_s.anInt4592 - 1) shr var_s.anInt4588)
                if (`is`[i_372_]!![i_374_] == i_370_ && `is`[i_373_]!![i_374_] == i_370_ && `is`[i_372_]!![i_375_] == i_370_ && `is`[i_373_]!![i_375_] == i_370_) return
            }
            synchronized(this) {
                if (i == 1) {
                    val i_377_ = var_s.anInt4592 - 1
                    for (i_378_ in 0..<anInt5387) {
                        val i_379_ = anIntArray5356!![i_378_] + i_369_
                        val i_380_ = anIntArray5312!![i_378_] + i_371_
                        val i_381_ = i_379_ and i_377_
                        val i_382_ = i_380_ and i_377_
                        val i_383_ = i_379_ shr var_s.anInt4588
                        val i_384_ = i_380_ shr var_s.anInt4588
                        val i_385_ = ((`is`[i_383_]!![i_384_] * (var_s.anInt4592 - i_381_) + `is`[i_383_ + 1]!![i_384_] * i_381_) shr var_s.anInt4588)
                        val i_386_ = ((`is`[i_383_]!![i_384_ + 1] * (var_s.anInt4592 - i_381_) + `is`[i_383_ + 1]!![i_384_ + 1] * i_381_) shr var_s.anInt4588)
                        val i_387_ = (i_385_ * (var_s.anInt4592 - i_382_) + i_386_ * i_382_ shr var_s.anInt4588)
                        anIntArray5332!![i_378_] = anIntArray5332!![i_378_] + i_387_ - i_370_
                    }
                    for (i_388_ in anInt5387..<anInt5340) {
                        val i_389_ = anIntArray5356!![i_388_] + i_369_
                        val i_390_ = anIntArray5312!![i_388_] + i_371_
                        val i_391_ = i_389_ and i_377_
                        val i_392_ = i_390_ and i_377_
                        val i_393_ = i_389_ shr var_s.anInt4588
                        val i_394_ = i_390_ shr var_s.anInt4588
                        if (i_393_ >= 0 && i_393_ < `is`.size - 1 && i_394_ >= 0 && i_394_ < `is`[0]!!.size - 1) {
                            val i_395_ = ((`is`[i_393_]!![i_394_] * (var_s.anInt4592 - i_391_) + `is`[i_393_ + 1]!![i_394_] * i_391_) shr var_s.anInt4588)
                            val i_396_ = (((`is`[i_393_]!![i_394_ + 1] * (var_s.anInt4592 - i_391_)) + `is`[i_393_ + 1]!![i_394_ + 1] * i_391_) shr var_s.anInt4588)
                            val i_397_ = (i_395_ * (var_s.anInt4592 - i_392_) + i_396_ * i_392_ shr var_s.anInt4588)
                            anIntArray5332!![i_388_] = anIntArray5332!![i_388_] + i_397_ - i_370_
                        }
                    }
                } else if (i == 2) {
                    val i_398_ = var_s.anInt4592 - 1
                    for (i_399_ in 0..<anInt5387) {
                        val i_400_ = (anIntArray5332!![i_399_] shl 16) / aShort5329
                        if (i_400_ < i_367_) {
                            val i_401_ = anIntArray5356!![i_399_] + i_369_
                            val i_402_ = anIntArray5312!![i_399_] + i_371_
                            val i_403_ = i_401_ and i_398_
                            val i_404_ = i_402_ and i_398_
                            val i_405_ = i_401_ shr var_s.anInt4588
                            val i_406_ = i_402_ shr var_s.anInt4588
                            val i_407_ = ((`is`[i_405_]!![i_406_] * (var_s.anInt4592 - i_403_) + `is`[i_405_ + 1]!![i_406_] * i_403_) shr var_s.anInt4588)
                            val i_408_ = (((`is`[i_405_]!![i_406_ + 1] * (var_s.anInt4592 - i_403_)) + `is`[i_405_ + 1]!![i_406_ + 1] * i_403_) shr var_s.anInt4588)
                            val i_409_ = (i_407_ * (var_s.anInt4592 - i_404_) + i_408_ * i_404_ shr var_s.anInt4588)
                            anIntArray5332!![i_399_] = anIntArray5332!![i_399_] + ((i_409_ - i_370_) * (i_367_ - i_400_) / i_367_)
                        } else anIntArray5332!![i_399_] = anIntArray5332!![i_399_]
                    }
                    for (i_410_ in anInt5387..<anInt5340) {
                        val i_411_ = (anIntArray5332!![i_410_] shl 16) / aShort5329
                        if (i_411_ < i_367_) {
                            val i_412_ = anIntArray5356!![i_410_] + i_369_
                            val i_413_ = anIntArray5312!![i_410_] + i_371_
                            val i_414_ = i_412_ and i_398_
                            val i_415_ = i_413_ and i_398_
                            val i_416_ = i_412_ shr var_s.anInt4588
                            val i_417_ = i_413_ shr var_s.anInt4588
                            if (i_416_ >= 0 && i_416_ < var_s.anInt4587 - 1 && i_417_ >= 0 && i_417_ < var_s.anInt4590 - 1) {
                                val i_418_ = (((`is`[i_416_]!![i_417_] * (var_s.anInt4592 - i_414_)) + `is`[i_416_ + 1]!![i_417_] * i_414_) shr var_s.anInt4588)
                                val i_419_ = (((`is`[i_416_]!![i_417_ + 1] * (var_s.anInt4592 - i_414_)) + `is`[i_416_ + 1]!![i_417_ + 1] * i_414_) shr var_s.anInt4588)
                                val i_420_ = (i_418_ * (var_s.anInt4592 - i_415_) + i_419_ * i_415_ shr var_s.anInt4588)
                                anIntArray5332!![i_410_] = (anIntArray5332!![i_410_] + ((i_420_ - i_370_) * (i_367_ - i_411_) / i_367_))
                            }
                        } else anIntArray5332!![i_410_] = anIntArray5332!![i_410_]
                    }
                } else if (i == 3) {
                    val i_421_ = (i_367_ and 0xff) * 4
                    val i_422_ = (i_367_ shr 8 and 0xff) * 4
                    val i_423_ = (i_367_ shr 16 and 0xff) shl 6
                    val i_424_ = (i_367_ shr 24 and 0xff) shl 6
                    if (i_369_ - (i_421_ shr 1) < 0 || (i_369_ + (i_421_ shr 1) + var_s.anInt4592 >= var_s.anInt4587 shl var_s.anInt4588) || i_371_ - (i_422_ shr 1) < 0 || (i_371_ + (i_422_ shr 1) + var_s.anInt4592 >= var_s.anInt4590 shl var_s.anInt4588)) return
                    this.method626(i_421_, 10947, i_424_, i_369_, i_422_, i_370_, i_423_, var_s, i_371_)
                } else if (i == 4) {
                    val i_425_ = var_s_368_!!.anInt4592 - 1
                    val i_426_ = aShort5365 - aShort5329
                    for (i_427_ in 0..<anInt5387) {
                        val i_428_ = anIntArray5356!![i_427_] + i_369_
                        val i_429_ = anIntArray5312!![i_427_] + i_371_
                        val i_430_ = i_428_ and i_425_
                        val i_431_ = i_429_ and i_425_
                        val i_432_ = i_428_ shr var_s_368_.anInt4588
                        val i_433_ = i_429_ shr var_s_368_.anInt4588
                        val i_434_ = (((is_376_!![i_432_]!![i_433_] * (var_s_368_.anInt4592 - i_430_)) + is_376_[i_432_ + 1]!![i_433_] * i_430_) shr var_s_368_.anInt4588)
                        val i_435_ = (((is_376_[i_432_]!![i_433_ + 1] * (var_s_368_.anInt4592 - i_430_)) + is_376_[i_432_ + 1]!![i_433_ + 1] * i_430_) shr var_s_368_.anInt4588)
                        val i_436_ = (i_434_ * (var_s_368_.anInt4592 - i_431_) + i_435_ * i_431_ shr var_s_368_.anInt4588)
                        anIntArray5332!![i_427_] = (anIntArray5332!![i_427_] + (i_436_ - i_370_) + i_426_)
                    }
                    for (i_437_ in anInt5387..<anInt5340) {
                        val i_438_ = anIntArray5356!![i_437_] + i_369_
                        val i_439_ = anIntArray5312!![i_437_] + i_371_
                        val i_440_ = i_438_ and i_425_
                        val i_441_ = i_439_ and i_425_
                        val i_442_ = i_438_ shr var_s_368_.anInt4588
                        val i_443_ = i_439_ shr var_s_368_.anInt4588
                        if (i_442_ >= 0 && i_442_ < var_s_368_.anInt4587 - 1 && i_443_ >= 0 && i_443_ < var_s_368_.anInt4590 - 1) {
                            val i_444_ = (((is_376_!![i_442_]!![i_443_] * (var_s_368_.anInt4592 - i_440_)) + is_376_[i_442_ + 1]!![i_443_] * i_440_) shr var_s_368_.anInt4588)
                            val i_445_ = (((is_376_[i_442_]!![i_443_ + 1] * (var_s_368_.anInt4592 - i_440_)) + is_376_[i_442_ + 1]!![i_443_ + 1] * i_440_) shr var_s_368_.anInt4588)
                            val i_446_ = (i_444_ * (var_s_368_.anInt4592 - i_441_) + i_445_ * i_441_ shr var_s_368_.anInt4588)
                            anIntArray5332!![i_437_] = (anIntArray5332!![i_437_] + (i_446_ - i_370_) + i_426_)
                        }
                    }
                } else if (i == 5) {
                    val i_447_ = var_s_368_!!.anInt4592 - 1
                    val i_448_ = aShort5365 - aShort5329
                    for (i_449_ in 0..<anInt5387) {
                        val i_450_ = anIntArray5356!![i_449_] + i_369_
                        val i_451_ = anIntArray5312!![i_449_] + i_371_
                        val i_452_ = i_450_ and i_447_
                        val i_453_ = i_451_ and i_447_
                        val i_454_ = i_450_ shr var_s.anInt4588
                        val i_455_ = i_451_ shr var_s.anInt4588
                        var i_456_ = ((`is`[i_454_]!![i_455_] * (var_s.anInt4592 - i_452_) + `is`[i_454_ + 1]!![i_455_] * i_452_) shr var_s.anInt4588)
                        var i_457_ = ((`is`[i_454_]!![i_455_ + 1] * (var_s.anInt4592 - i_452_) + `is`[i_454_ + 1]!![i_455_ + 1] * i_452_) shr var_s.anInt4588)
                        val i_458_ = (i_456_ * (var_s.anInt4592 - i_453_) + i_457_ * i_453_ shr var_s.anInt4588)
                        i_456_ = (((is_376_!![i_454_]!![i_455_] * (var_s_368_.anInt4592 - i_452_)) + is_376_[i_454_ + 1]!![i_455_] * i_452_) shr var_s_368_.anInt4588)
                        i_457_ = (((is_376_[i_454_]!![i_455_ + 1] * (var_s_368_.anInt4592 - i_452_)) + is_376_[i_454_ + 1]!![i_455_ + 1] * i_452_) shr var_s_368_.anInt4588)
                        val i_459_ = (i_456_ * (var_s_368_.anInt4592 - i_453_) + i_457_ * i_453_ shr var_s_368_.anInt4588)
                        val i_460_ = i_458_ - i_459_ - i_367_
                        anIntArray5332!![i_449_] = ((anIntArray5332!![i_449_] shl 8) / i_448_ * i_460_ shr 8) - (i_370_ - i_458_)
                    }
                    for (i_461_ in anInt5387..<anInt5340) {
                        val i_462_ = anIntArray5356!![i_461_] + i_369_
                        val i_463_ = anIntArray5312!![i_461_] + i_371_
                        val i_464_ = i_462_ and i_447_
                        val i_465_ = i_463_ and i_447_
                        val i_466_ = i_462_ shr var_s.anInt4588
                        val i_467_ = i_463_ shr var_s.anInt4588
                        if (i_466_ >= 0 && i_466_ < var_s.anInt4587 - 1 && i_466_ < var_s_368_.anInt4587 - 1 && i_467_ >= 0 && i_467_ < var_s.anInt4590 - 1 && i_467_ < var_s_368_.anInt4590 - 1) {
                            var i_468_ = ((`is`[i_466_]!![i_467_] * (var_s.anInt4592 - i_464_) + `is`[i_466_ + 1]!![i_467_] * i_464_) shr var_s.anInt4588)
                            var i_469_ = (((`is`[i_466_]!![i_467_ + 1] * (var_s.anInt4592 - i_464_)) + `is`[i_466_ + 1]!![i_467_ + 1] * i_464_) shr var_s.anInt4588)
                            val i_470_ = (i_468_ * (var_s.anInt4592 - i_465_) + i_469_ * i_465_ shr var_s.anInt4588)
                            i_468_ = (((is_376_!![i_466_]!![i_467_] * (var_s_368_.anInt4592 - i_464_)) + is_376_[i_466_ + 1]!![i_467_] * i_464_) shr var_s_368_.anInt4588)
                            i_469_ = (((is_376_[i_466_]!![i_467_ + 1] * (var_s_368_.anInt4592 - i_464_)) + is_376_[i_466_ + 1]!![i_467_ + 1] * i_464_) shr var_s_368_.anInt4588)
                            val i_471_ = (i_468_ * (var_s_368_.anInt4592 - i_465_) + i_469_ * i_465_ shr var_s_368_.anInt4588)
                            val i_472_ = i_470_ - i_471_ - i_367_
                            anIntArray5332!![i_461_] = (((anIntArray5332!![i_461_] shl 8) / i_448_ * i_472_) shr 8) - (i_370_ - i_470_)
                        }
                    }
                }
                aBoolean5323 = false
            }
        }
    }

    public override fun C(i: Int) {
        check((anInt5316 and 0x1000) == 4096)
        anInt5344 = i
        anInt5354 = 0
    }

    private fun method644() {
        synchronized(this) {
            for (i in 0..<anInt5340) {
                val i_473_ = anIntArray5356!![i]
                anIntArray5356!![i] = anIntArray5312!![i]
                anIntArray5312!![i] = -i_473_
            }
            method631()
        }
    }

    public override fun RA(): Int {
        if (!aBoolean5323) method655()
        return aShort5393.toInt()
    }

    public override fun method623(i: Int, i_474_: Int, class101: Class101?, bool: Boolean, i_475_: Int, i_476_: Int): Boolean {
        return method645(i, i_474_, class101, bool, i_475_, i_476_)
    }

    public override fun method604(): Array<Class342?>? {
        return aClass342Array5335
    }

    public override fun WA(): Int {
        return anInt5344
    }

    public override fun s(i: Int) {
        if (aHa_Sub1_5353.anInt7485 > 1) {
            synchronized(this) {
                if ((anInt5316 and 0x10000) == 65536 && (i and 0x10000) == 0) method634(true)
                anInt5316 = i
            }
        } else {
            if ((anInt5316 and 0x10000) == 65536 && (i and 0x10000) == 0) method634(true)
            anInt5316 = i
        }
    }

    public override fun method621() {
        if (aHa_Sub1_5353.anInt7485 > 1) {
            synchronized(this) {
                this.aBoolean1124 = false
                (this as Object).notifyAll()
            }
        }
    }

    public override fun method624(i: Int, i_477_: Int, i_478_: Int, i_479_: Int) {
        check((anInt5316 and 0x80000) == 524288) { "FMT" }
        for (i_480_ in 0..<anInt5351) {
            val i_481_ = aShortArray5311!![i_480_].toInt() and 0xffff
            var i_482_ = i_481_ shr 10 and 0x3f
            var i_483_ = i_481_ shr 7 and 0x7
            var i_484_ = i_481_ and 0x7f
            if (i != -1) i_482_ += (i - i_482_) * i_479_ shr 7
            if (i_477_ != -1) i_483_ += (i_477_ - i_483_) * i_479_ shr 7
            if (i_478_ != -1) i_484_ += (i_478_ - i_484_) * i_479_ shr 7
            aShortArray5311!![i_480_] = (i_482_ shl 10 or (i_483_ shl 7) or i_484_).toShort()
        }
        if (aClass6Array5361 != null) {
            for (i_485_ in 0..<anInt5389) {
                val class6 = aClass6Array5361!![i_485_]!!
                val class350 = aClass350Array5363!![i_485_]!!
                class350.anInt4313 = (class350.anInt4313 and 0xffffff.inv() or ((Class126.anIntArray4983!![method303(((aShortArray5311!![class6.anInt144]).toInt() and 0xffff), 30).toInt()]) and 0xffffff))
            }
        }
        if (anInt5354 == 2) anInt5354 = 1
    }

    public override fun method628(i: Int, i_486_: Int, class101: Class101?, bool: Boolean, i_487_: Int): Boolean {
        return method645(i, i_486_, class101, bool, i_487_, -1)
    }

    public override fun ma(): Int {
        if (!aBoolean5323) method655()
        return aShort5348.toInt()
    }

    private fun method645(i: Int, i_488_: Int, class101: Class101?, bool: Boolean, i_489_: Int, i_490_: Int): Boolean {
        aClass101_Sub1_5320 = class101 as Class101_Sub1
        val class101_sub1 = aHa_Sub1_5353.aClass101_Sub1_7492
        val f = (class101_sub1!!.aFloat5686 + ((class101_sub1.aFloat5672 * aClass101_Sub1_5320!!.aFloat5686) + (class101_sub1.aFloat5673 * aClass101_Sub1_5320!!.aFloat5685) + (class101_sub1.aFloat5669 * aClass101_Sub1_5320!!.aFloat5681)))
        val f_491_ = (class101_sub1.aFloat5685 + ((class101_sub1.aFloat5655 * aClass101_Sub1_5320!!.aFloat5686) + (class101_sub1.aFloat5678 * aClass101_Sub1_5320!!.aFloat5685) + (class101_sub1.aFloat5666 * aClass101_Sub1_5320!!.aFloat5681)))
        val f_492_ = (class101_sub1.aFloat5681 + ((class101_sub1.aFloat5662 * aClass101_Sub1_5320!!.aFloat5686) + (class101_sub1.aFloat5680 * aClass101_Sub1_5320!!.aFloat5685) + (class101_sub1.aFloat5664 * aClass101_Sub1_5320!!.aFloat5681)))
        val f_493_ = ((class101_sub1.aFloat5672 * aClass101_Sub1_5320!!.aFloat5672) + (class101_sub1.aFloat5673 * aClass101_Sub1_5320!!.aFloat5655) + (class101_sub1.aFloat5669 * aClass101_Sub1_5320!!.aFloat5662))
        val f_494_ = ((class101_sub1.aFloat5672 * aClass101_Sub1_5320!!.aFloat5673) + (class101_sub1.aFloat5673 * aClass101_Sub1_5320!!.aFloat5678) + (class101_sub1.aFloat5669 * aClass101_Sub1_5320!!.aFloat5680))
        val f_495_ = ((class101_sub1.aFloat5672 * aClass101_Sub1_5320!!.aFloat5669) + (class101_sub1.aFloat5673 * aClass101_Sub1_5320!!.aFloat5666) + (class101_sub1.aFloat5669 * aClass101_Sub1_5320!!.aFloat5664))
        val f_496_ = ((class101_sub1.aFloat5655 * aClass101_Sub1_5320!!.aFloat5672) + (class101_sub1.aFloat5678 * aClass101_Sub1_5320!!.aFloat5655) + (class101_sub1.aFloat5666 * aClass101_Sub1_5320!!.aFloat5662))
        val f_497_ = ((class101_sub1.aFloat5655 * aClass101_Sub1_5320!!.aFloat5673) + (class101_sub1.aFloat5678 * aClass101_Sub1_5320!!.aFloat5678) + (class101_sub1.aFloat5666 * aClass101_Sub1_5320!!.aFloat5680))
        val f_498_ = ((class101_sub1.aFloat5655 * aClass101_Sub1_5320!!.aFloat5669) + (class101_sub1.aFloat5678 * aClass101_Sub1_5320!!.aFloat5666) + (class101_sub1.aFloat5666 * aClass101_Sub1_5320!!.aFloat5664))
        val f_499_ = ((class101_sub1.aFloat5662 * aClass101_Sub1_5320!!.aFloat5672) + (class101_sub1.aFloat5680 * aClass101_Sub1_5320!!.aFloat5655) + (class101_sub1.aFloat5664 * aClass101_Sub1_5320!!.aFloat5662))
        val f_500_ = ((class101_sub1.aFloat5662 * aClass101_Sub1_5320!!.aFloat5673) + (class101_sub1.aFloat5680 * aClass101_Sub1_5320!!.aFloat5678) + (class101_sub1.aFloat5664 * aClass101_Sub1_5320!!.aFloat5680))
        val f_501_ = ((class101_sub1.aFloat5662 * aClass101_Sub1_5320!!.aFloat5669) + (class101_sub1.aFloat5680 * aClass101_Sub1_5320!!.aFloat5666) + (class101_sub1.aFloat5664 * aClass101_Sub1_5320!!.aFloat5664))
        var bool_502_ = false
        val i_503_ = aHa_Sub1_5353.anInt7510
        val i_504_ = aHa_Sub1_5353.anInt7504
        val i_505_ = aHa_Sub1_5353.anInt7491
        val i_506_ = aHa_Sub1_5353.anInt7497
        var i_507_ = 2147483647
        var i_508_ = -2147483648
        var i_509_ = 2147483647
        var i_510_ = -2147483648
        method632(Thread.currentThread())
        if (!aBoolean5323) method655()
        val i_511_ = aShort5393 - aShort5395 shr 1
        val i_512_ = aShort5365 - aShort5329 shr 1
        val i_513_ = aShort5331 - aShort5352 shr 1
        val i_514_ = aShort5395 + i_511_
        val i_515_ = aShort5329 + i_512_
        val i_516_ = aShort5352 + i_513_
        val i_517_ = i_514_ - (i_511_ shl i_489_)
        val i_518_ = i_515_ - (i_512_ shl i_489_)
        val i_519_ = i_516_ - (i_513_ shl i_489_)
        val i_520_ = i_514_ + (i_511_ shl i_489_)
        val i_521_ = i_515_ + (i_512_ shl i_489_)
        val i_522_ = i_516_ + (i_513_ shl i_489_)
        anIntArray5359[0] = i_517_
        anIntArray5373[0] = i_518_
        anIntArray5398[0] = i_519_
        anIntArray5359[1] = i_520_
        anIntArray5373[1] = i_518_
        anIntArray5398[1] = i_519_
        anIntArray5359[2] = i_517_
        anIntArray5373[2] = i_521_
        anIntArray5398[2] = i_519_
        anIntArray5359[3] = i_520_
        anIntArray5373[3] = i_521_
        anIntArray5398[3] = i_519_
        anIntArray5359[4] = i_517_
        anIntArray5373[4] = i_518_
        anIntArray5398[4] = i_522_
        anIntArray5359[5] = i_520_
        anIntArray5373[5] = i_518_
        anIntArray5398[5] = i_522_
        anIntArray5359[6] = i_517_
        anIntArray5373[6] = i_521_
        anIntArray5398[6] = i_522_
        anIntArray5359[7] = i_520_
        anIntArray5373[7] = i_521_
        anIntArray5398[7] = i_522_
        for (i_523_ in 0..7) {
            val i_524_ = anIntArray5359[i_523_]
            val i_525_ = anIntArray5373[i_523_]
            val i_526_ = anIntArray5398[i_523_]
            val f_527_ = f + (f_493_ * i_524_.toFloat() + f_494_ * i_525_.toFloat() + f_495_ * i_526_.toFloat())
            val f_528_ = f_491_ + (f_496_ * i_524_.toFloat() + f_497_ * i_525_.toFloat() + f_498_ * i_526_.toFloat())
            var f_529_ = f_492_ + (f_499_ * i_524_.toFloat() + f_500_ * i_525_.toFloat() + f_501_ * i_526_.toFloat())
            if (f_529_ >= aHa_Sub1_5353.anInt7482.toFloat()) {
                if (i_490_ > 0) f_529_ = i_490_.toFloat()
                val i_530_ = i_503_ + (f_527_ * i_505_.toFloat() / f_529_).toInt()
                val i_531_ = i_504_ + (f_528_ * i_506_.toFloat() / f_529_).toInt()
                if (i_530_ < i_507_) i_507_ = i_530_
                if (i_530_ > i_508_) i_508_ = i_530_
                if (i_531_ < i_509_) i_509_ = i_531_
                if (i_531_ > i_510_) i_510_ = i_531_
                bool_502_ = true
            }
        }
        if (bool_502_ && i > i_507_ && i < i_508_ && i_488_ > i_509_ && i_488_ < i_510_) {
            if (bool) return true
            for (i_532_ in 0..<anInt5340) {
                val i_533_ = anIntArray5356!![i_532_]
                val i_534_ = anIntArray5332!![i_532_]
                val i_535_ = anIntArray5312!![i_532_]
                val f_536_ = f + (f_493_ * i_533_.toFloat() + f_494_ * i_534_.toFloat() + f_495_ * i_535_.toFloat())
                val f_537_ = f_491_ + (f_496_ * i_533_.toFloat() + f_497_ * i_534_.toFloat() + f_498_ * i_535_.toFloat())
                var f_538_ = f_492_ + (f_499_ * i_533_.toFloat() + f_500_ * i_534_.toFloat() + f_501_ * i_535_.toFloat())
                if (f_538_ >= aHa_Sub1_5353.anInt7482.toFloat()) {
                    if (i_490_ > 0) f_538_ = i_490_.toFloat()
                    anIntArray5321[i_532_] = i_503_ + (f_536_ * i_505_.toFloat() / f_538_).toInt()
                    anIntArray5343[i_532_] = i_504_ + (f_537_ * i_506_.toFloat() / f_538_).toInt()
                } else anIntArray5321[i_532_] = -999999
            }
            for (i_539_ in 0..<anInt5351) {
                if (anIntArray5321[aShortArray5317[i_539_].toInt()] != -999999 && anIntArray5321[aShortArray5394[i_539_].toInt()] != -999999 && anIntArray5321[aShortArray5364[i_539_].toInt()] != -999999 && method630(
                        i,
                        i_488_,
                        anIntArray5343[aShortArray5317[i_539_].toInt()],
                        anIntArray5343[aShortArray5394[i_539_].toInt()],
                        anIntArray5343[aShortArray5364[i_539_].toInt()],
                        anIntArray5321[aShortArray5317[i_539_].toInt()],
                        anIntArray5321[aShortArray5394[i_539_].toInt()],
                        anIntArray5321[aShortArray5364[i_539_].toInt()]
                    )
                ) return true
            }
        }
        return false
    }

    private fun method646(i: Int) {
        var i_540_ = 0
        val i_541_ = aHa_Sub1_5353.anInt7482
        val i_542_ = aShortArray5317[i]
        val i_543_ = aShortArray5394[i]
        val i_544_ = aShortArray5364[i]
        var i_545_ = anIntArray5392[i_542_.toInt()]
        var i_546_ = anIntArray5392[i_543_.toInt()]
        var i_547_ = anIntArray5392[i_544_.toInt()]
        if (aByteArray5325 == null) aClass109_5383!!.anInt1674 = 0
        else aClass109_5383!!.anInt1674 = aByteArray5325!![i].toInt() and 0xff
        if (i_545_ >= i_541_) {
            anIntArray5315[i_540_] = anIntArray5321[i_542_.toInt()]
            anIntArray5371[i_540_] = anIntArray5343[i_542_.toInt()]
            anIntArray5381[i_540_] = anIntArray5355[i_542_.toInt()]
            anIntArray5377[i_540_++] = anIntArray5368!![i] and 0xffff
        } else {
            val i_548_ = anIntArray5399[i_542_.toInt()]
            val i_549_ = anIntArray5384[i_542_.toInt()]
            val i_550_ = anIntArray5368!![i] and 0xffff
            if (i_547_ >= i_541_) {
                val i_551_ = (i_541_ - i_545_) * (65536 / (i_547_ - i_545_))
                anIntArray5315[i_540_] = (aClass167_5367!!.anInt2229 + ((i_548_ + ((anIntArray5399[i_544_.toInt()] - i_548_) * i_551_ shr 16)) * aHa_Sub1_5353.anInt7491 / i_541_))
                anIntArray5371[i_540_] = (aClass167_5367!!.anInt2215 + ((i_549_ + ((anIntArray5384[i_544_.toInt()] - i_549_) * i_551_ shr 16)) * aHa_Sub1_5353.anInt7497 / i_541_))
                anIntArray5381[i_540_] = i_541_
                anIntArray5377[i_540_++] = (i_550_ + (((anIntArray5366!![i] and 0xffff) - i_550_) * i_551_ shr 16))
            }
            if (i_546_ >= i_541_) {
                val i_552_ = (i_541_ - i_545_) * (65536 / (i_546_ - i_545_))
                anIntArray5315[i_540_] = (aClass167_5367!!.anInt2229 + ((i_548_ + ((anIntArray5399[i_543_.toInt()] - i_548_) * i_552_ shr 16)) * aHa_Sub1_5353.anInt7491 / i_541_))
                anIntArray5371[i_540_] = (aClass167_5367!!.anInt2215 + ((i_549_ + ((anIntArray5384[i_543_.toInt()] - i_549_) * i_552_ shr 16)) * aHa_Sub1_5353.anInt7497 / i_541_))
                anIntArray5381[i_540_] = i_541_
                anIntArray5377[i_540_++] = (i_550_ + (((anIntArray5337!![i] and 0xffff) - i_550_) * i_552_ shr 16))
            }
        }
        if (i_546_ >= i_541_) {
            anIntArray5315[i_540_] = anIntArray5321[i_543_.toInt()]
            anIntArray5371[i_540_] = anIntArray5343[i_543_.toInt()]
            anIntArray5381[i_540_] = anIntArray5355[i_543_.toInt()]
            anIntArray5377[i_540_++] = anIntArray5337!![i] and 0xffff
        } else {
            val i_553_ = anIntArray5399[i_543_.toInt()]
            val i_554_ = anIntArray5384[i_543_.toInt()]
            val i_555_ = anIntArray5337!![i] and 0xffff
            if (i_545_ >= i_541_) {
                val i_556_ = (i_541_ - i_546_) * (65536 / (i_545_ - i_546_))
                anIntArray5315[i_540_] = (aClass167_5367!!.anInt2229 + ((i_553_ + ((anIntArray5399[i_542_.toInt()] - i_553_) * i_556_ shr 16)) * aHa_Sub1_5353.anInt7491 / i_541_))
                anIntArray5371[i_540_] = (aClass167_5367!!.anInt2215 + ((i_554_ + ((anIntArray5384[i_542_.toInt()] - i_554_) * i_556_ shr 16)) * aHa_Sub1_5353.anInt7497 / i_541_))
                anIntArray5381[i_540_] = i_541_
                anIntArray5377[i_540_++] = (i_555_ + (((anIntArray5368!![i] and 0xffff) - i_555_) * i_556_ shr 16))
            }
            if (i_547_ >= i_541_) {
                val i_557_ = (i_541_ - i_546_) * (65536 / (i_547_ - i_546_))
                anIntArray5315[i_540_] = (aClass167_5367!!.anInt2229 + ((i_553_ + ((anIntArray5399[i_544_.toInt()] - i_553_) * i_557_ shr 16)) * aHa_Sub1_5353.anInt7491 / i_541_))
                anIntArray5371[i_540_] = (aClass167_5367!!.anInt2215 + ((i_554_ + ((anIntArray5384[i_544_.toInt()] - i_554_) * i_557_ shr 16)) * aHa_Sub1_5353.anInt7497 / i_541_))
                anIntArray5381[i_540_] = i_541_
                anIntArray5377[i_540_++] = (i_555_ + (((anIntArray5366!![i] and 0xffff) - i_555_) * i_557_ shr 16))
            }
        }
        if (i_547_ >= i_541_) {
            anIntArray5315[i_540_] = anIntArray5321[i_544_.toInt()]
            anIntArray5371[i_540_] = anIntArray5343[i_544_.toInt()]
            anIntArray5381[i_540_] = anIntArray5355[i_544_.toInt()]
            anIntArray5377[i_540_++] = anIntArray5366!![i] and 0xffff
        } else {
            val i_558_ = anIntArray5399[i_544_.toInt()]
            val i_559_ = anIntArray5384[i_544_.toInt()]
            val i_560_ = anIntArray5366!![i] and 0xffff
            if (i_546_ >= i_541_) {
                val i_561_ = (i_541_ - i_547_) * (65536 / (i_546_ - i_547_))
                anIntArray5315[i_540_] = (aClass167_5367!!.anInt2229 + ((i_558_ + ((anIntArray5399[i_543_.toInt()] - i_558_) * i_561_ shr 16)) * aHa_Sub1_5353.anInt7491 / i_541_))
                anIntArray5371[i_540_] = (aClass167_5367!!.anInt2215 + ((i_559_ + ((anIntArray5384[i_543_.toInt()] - i_559_) * i_561_ shr 16)) * aHa_Sub1_5353.anInt7497 / i_541_))
                anIntArray5381[i_540_] = i_541_
                anIntArray5377[i_540_++] = (i_560_ + (((anIntArray5337!![i] and 0xffff) - i_560_) * i_561_ shr 16))
            }
            if (i_545_ >= i_541_) {
                val i_562_ = (i_541_ - i_547_) * (65536 / (i_545_ - i_547_))
                anIntArray5315[i_540_] = (aClass167_5367!!.anInt2229 + ((i_558_ + ((anIntArray5399[i_542_.toInt()] - i_558_) * i_562_ shr 16)) * aHa_Sub1_5353.anInt7491 / i_541_))
                anIntArray5371[i_540_] = (aClass167_5367!!.anInt2215 + ((i_559_ + ((anIntArray5384[i_542_.toInt()] - i_559_) * i_562_ shr 16)) * aHa_Sub1_5353.anInt7497 / i_541_))
                anIntArray5381[i_540_] = i_541_
                anIntArray5377[i_540_++] = (i_560_ + (((anIntArray5368!![i] and 0xffff) - i_560_) * i_562_ shr 16))
            }
        }
        val i_563_ = anIntArray5315[0]
        val i_564_ = anIntArray5315[1]
        val i_565_ = anIntArray5315[2]
        val i_566_ = anIntArray5371[0]
        val i_567_ = anIntArray5371[1]
        val i_568_ = anIntArray5371[2]
        i_545_ = anIntArray5381[0]
        i_546_ = anIntArray5381[1]
        i_547_ = anIntArray5381[2]
        aClass109_5383!!.aBoolean1671 = false
        if (i_540_ == 3) {
            if (i_563_ < 0 || i_564_ < 0 || i_565_ < 0 || i_563_ > aClass167_5367!!.anInt2221 || i_564_ > aClass167_5367!!.anInt2221 || i_565_ > aClass167_5367!!.anInt2221) aClass109_5383!!.aBoolean1671 = true
            if (aShortArray5388 == null || aShortArray5388!![i].toInt() == -1) {
                if (anIntArray5366!![i] == -1) aClass109_5383!!.method1018(i_566_.toFloat(), i_567_.toFloat(), i_568_.toFloat(), i_563_.toFloat(), i_564_.toFloat(), i_565_.toFloat(), i_545_.toFloat(), i_546_.toFloat(), i_547_.toFloat(), (Class126.anIntArray4983!![anIntArray5368!![i] and 0xffff]))
                else aClass109_5383!!.method1022(i_566_.toFloat(), i_567_.toFloat(), i_568_.toFloat(), i_563_.toFloat(), i_564_.toFloat(), i_565_.toFloat(), i_545_.toFloat(), i_546_.toFloat(), i_547_.toFloat(), anIntArray5377[0].toFloat(), anIntArray5377[1].toFloat(), anIntArray5377[2].toFloat())
            } else {
                var i_569_ = -16777216
                if (aByteArray5325 != null) i_569_ = 255 - (aByteArray5325!![i].toInt() and 0xff) shl 24
                val i_570_ = i_569_ or (anIntArray5368!![i] and 0xffffff)
                if (anIntArray5366!![i] == -1) aClass109_5383!!.method1024(
                    i_566_.toFloat(),
                    i_567_.toFloat(),
                    i_568_.toFloat(),
                    i_563_.toFloat(),
                    i_564_.toFloat(),
                    i_565_.toFloat(),
                    i_545_.toFloat(),
                    i_546_.toFloat(),
                    i_547_.toFloat(),
                    aFloatArrayArray5314!![i]!![0],
                    aFloatArrayArray5314!![i]!![1],
                    aFloatArrayArray5314!![i]!![2],
                    aFloatArrayArray5345!![i]!![0],
                    aFloatArrayArray5345!![i]!![1],
                    aFloatArrayArray5345!![i]!![2],
                    i_570_,
                    i_570_,
                    i_570_,
                    (aClass167_5367!!.anInt2192),
                    0,
                    0,
                    0,
                    aShortArray5388!![i].toInt()
                )
                else aClass109_5383!!.method1024(
                    i_566_.toFloat(),
                    i_567_.toFloat(),
                    i_568_.toFloat(),
                    i_563_.toFloat(),
                    i_564_.toFloat(),
                    i_565_.toFloat(),
                    i_545_.toFloat(),
                    i_546_.toFloat(),
                    i_547_.toFloat(),
                    aFloatArrayArray5314!![i]!![0],
                    aFloatArrayArray5314!![i]!![1],
                    aFloatArrayArray5314!![i]!![2],
                    aFloatArrayArray5345!![i]!![0],
                    aFloatArrayArray5345!![i]!![1],
                    aFloatArrayArray5345!![i]!![2],
                    i_570_,
                    i_570_,
                    i_570_,
                    (aClass167_5367!!.anInt2192),
                    0,
                    0,
                    0,
                    aShortArray5388!![i].toInt()
                )
            }
        }
        if (i_540_ == 4) {
            if (i_563_ < 0 || i_564_ < 0 || i_565_ < 0 || i_563_ > aClass167_5367!!.anInt2221 || i_564_ > aClass167_5367!!.anInt2221 || i_565_ > aClass167_5367!!.anInt2221 || anIntArray5315[3] < 0 || anIntArray5315[3] > aClass167_5367!!.anInt2221) aClass109_5383!!.aBoolean1671 = true
            if (aShortArray5388 == null || aShortArray5388!![i].toInt() == -1) {
                if (anIntArray5366!![i] == -1) {
                    val i_571_ = Class126.anIntArray4983!![anIntArray5368!![i] and 0xffff]
                    aClass109_5383!!.method1018(i_566_.toFloat(), i_567_.toFloat(), i_568_.toFloat(), i_563_.toFloat(), i_564_.toFloat(), i_565_.toFloat(), i_545_.toFloat(), i_546_.toFloat(), i_547_.toFloat(), i_571_)
                    aClass109_5383!!.method1018(i_566_.toFloat(), i_568_.toFloat(), anIntArray5371[3].toFloat(), i_563_.toFloat(), i_565_.toFloat(), anIntArray5315[3].toFloat(), i_545_.toFloat(), i_546_.toFloat(), anIntArray5381[3].toFloat(), i_571_)
                } else {
                    aClass109_5383!!.method1022(i_566_.toFloat(), i_567_.toFloat(), i_568_.toFloat(), i_563_.toFloat(), i_564_.toFloat(), i_565_.toFloat(), i_545_.toFloat(), i_546_.toFloat(), i_547_.toFloat(), anIntArray5377[0].toFloat(), anIntArray5377[1].toFloat(), anIntArray5377[2].toFloat())
                    aClass109_5383!!.method1022(i_566_.toFloat(), i_568_.toFloat(), anIntArray5371[3].toFloat(), i_563_.toFloat(), i_565_.toFloat(), anIntArray5315[3].toFloat(), i_545_.toFloat(), i_546_.toFloat(), anIntArray5381[3].toFloat(), anIntArray5377[0].toFloat(), anIntArray5377[2].toFloat(), anIntArray5377[3].toFloat())
                }
            } else {
                var i_572_ = -16777216
                if (aByteArray5325 != null) i_572_ = 255 - (aByteArray5325!![i].toInt() and 0xff) shl 24
                val i_573_ = i_572_ or (anIntArray5368!![i] and 0xffffff)
                if (anIntArray5366!![i] == -1) {
                    aClass109_5383!!.method1024(
                        i_566_.toFloat(),
                        i_567_.toFloat(),
                        i_568_.toFloat(),
                        i_563_.toFloat(),
                        i_564_.toFloat(),
                        i_565_.toFloat(),
                        i_545_.toFloat(),
                        i_546_.toFloat(),
                        i_547_.toFloat(),
                        aFloatArrayArray5314!![i]!![0],
                        aFloatArrayArray5314!![i]!![1],
                        aFloatArrayArray5314!![i]!![2],
                        aFloatArrayArray5345!![i]!![0],
                        aFloatArrayArray5345!![i]!![1],
                        aFloatArrayArray5345!![i]!![2],
                        i_573_,
                        i_573_,
                        i_573_,
                        (aClass167_5367!!.anInt2192),
                        0,
                        0,
                        0,
                        aShortArray5388!![i].toInt()
                    )
                    aClass109_5383!!.method1024(
                        i_566_.toFloat(),
                        i_568_.toFloat(),
                        anIntArray5371[3].toFloat(),
                        i_563_.toFloat(),
                        i_565_.toFloat(),
                        anIntArray5315[3].toFloat(),
                        i_545_.toFloat(),
                        i_547_.toFloat(),
                        anIntArray5381[3].toFloat(),
                        aFloatArrayArray5314!![i]!![0],
                        aFloatArrayArray5314!![i]!![1],
                        aFloatArrayArray5314!![i]!![2],
                        aFloatArrayArray5345!![i]!![0],
                        aFloatArrayArray5345!![i]!![1],
                        aFloatArrayArray5345!![i]!![2],
                        i_573_,
                        i_573_,
                        i_573_,
                        (aClass167_5367!!.anInt2192),
                        0,
                        0,
                        0,
                        aShortArray5388!![i].toInt()
                    )
                } else {
                    aClass109_5383!!.method1024(
                        i_566_.toFloat(),
                        i_567_.toFloat(),
                        i_568_.toFloat(),
                        i_563_.toFloat(),
                        i_564_.toFloat(),
                        i_565_.toFloat(),
                        i_545_.toFloat(),
                        i_546_.toFloat(),
                        i_547_.toFloat(),
                        aFloatArrayArray5314!![i]!![0],
                        aFloatArrayArray5314!![i]!![1],
                        aFloatArrayArray5314!![i]!![2],
                        aFloatArrayArray5345!![i]!![0],
                        aFloatArrayArray5345!![i]!![1],
                        aFloatArrayArray5345!![i]!![2],
                        i_573_,
                        i_573_,
                        i_573_,
                        (aClass167_5367!!.anInt2192),
                        0,
                        0,
                        0,
                        aShortArray5388!![i].toInt()
                    )
                    aClass109_5383!!.method1024(
                        i_566_.toFloat(),
                        i_568_.toFloat(),
                        anIntArray5371[3].toFloat(),
                        i_563_.toFloat(),
                        i_565_.toFloat(),
                        anIntArray5315[3].toFloat(),
                        i_545_.toFloat(),
                        i_547_.toFloat(),
                        anIntArray5381[3].toFloat(),
                        aFloatArrayArray5314!![i]!![0],
                        aFloatArrayArray5314!![i]!![1],
                        aFloatArrayArray5314!![i]!![2],
                        aFloatArrayArray5345!![i]!![0],
                        aFloatArrayArray5345!![i]!![1],
                        aFloatArrayArray5345!![i]!![2],
                        i_573_,
                        i_573_,
                        i_573_,
                        (aClass167_5367!!.anInt2192),
                        0,
                        0,
                        0,
                        aShortArray5388!![i].toInt()
                    )
                }
            }
        }
    }

    private fun method647() {
        if (anInt5354 == 0) method634(false)
        else if (aHa_Sub1_5353.anInt7485 > 1) {
            synchronized(this) {
                method640()
            }
        } else method640()
    }

    private fun method648(thread: Thread?) {
        val class167: Class167 = aHa_Sub1_5353.method3724(thread)!!
        if (class167 != aClass167_5336) {
            aClass167_5336 = class167
            aClass64_Sub1_5378 = aClass167_5336!!.aClass64_Sub1_2243
            aClass64_Sub1_5339 = aClass167_5336!!.aClass64_Sub1_2224
            aClass64_Sub1_5396 = aClass167_5336!!.aClass64_Sub1_2219
            aClass64_Sub1_5347 = aClass167_5336!!.aClass64_Sub1_2239
            aClass64_Sub1_5390 = aClass167_5336!!.aClass64_Sub1_2233
            aClass64_Sub1_5374 = aClass167_5336!!.aClass64_Sub1_2231
            aClass64_Sub1_5328 = aClass167_5336!!.aClass64_Sub1_2223
            aClass64_Sub1_5376 = aClass167_5336!!.aClass64_Sub1_2227
            aClass64_Sub1_5397 = aClass167_5336!!.aClass64_Sub1_2246
            aClass64_Sub1_5319 = aClass167_5336!!.aClass64_Sub1_2225
        }
    }

    public override fun LA(i: Int) {
        check((anInt5316 and 0x2000) == 8192)
        anInt5349 = i
        anInt5354 = 0
    }

    public override fun VA(i: Int) {
        check((anInt5316 and 0x3) == 3)
        val i_574_ = Class70.anIntArray1207!![i]
        val i_575_ = Class70.anIntArray1204!![i]
        synchronized(this) {
            for (i_576_ in 0..<anInt5340) {
                val i_577_ = ((anIntArray5332!![i_576_] * i_574_ + anIntArray5356!![i_576_] * i_575_) shr 14)
                anIntArray5332!![i_576_] = (anIntArray5332!![i_576_] * i_575_ - anIntArray5356!![i_576_] * i_574_) shr 14
                anIntArray5356!![i_576_] = i_577_
            }
            method631()
        }
    }

    public override fun a(i: Int) {
        check((anInt5316 and 0x5) == 5)
        if (i == 4096) method644()
        else if (i == 8192) method651()
        else if (i == 12288) method639()
        else {
            val i_578_ = Class70.anIntArray1207!![i]
            val i_579_ = Class70.anIntArray1204!![i]
            synchronized(this) {
                for (i_580_ in 0..<anInt5340) {
                    val i_581_ = ((anIntArray5312!![i_580_] * i_578_ + anIntArray5356!![i_580_] * i_579_) shr 14)
                    anIntArray5312!![i_580_] = (anIntArray5312!![i_580_] * i_579_ - anIntArray5356!![i_580_] * i_578_) shr 14
                    anIntArray5356!![i_580_] = i_581_
                }
                method631()
            }
        }
    }

    public override fun aa(i: Short, i_582_: Short) {
        if (aShortArray5388 != null) {
            if (!aBoolean5391 && i_582_ >= 0) {
                val class12 = aHa_Sub1_5353.aD4579!!.method3(i_582_.toInt() and 0xffff, -6662)
                if (class12!!.aByte198.toInt() != 0 || class12.aByte211.toInt() != 0) aBoolean5391 = true
            }
            for (i_583_ in 0..<anInt5351) {
                if (aShortArray5388!![i_583_] == i) aShortArray5388!![i_583_] = i_582_
            }
        }
    }

    public override fun method613(class64: Class64?, i: Int, i_584_: Int, i_585_: Int, bool: Boolean) {
        val class64_sub1_586_ = class64 as Class64_Sub1
        check((anInt5316 and 0x10000) == 65536) { "" }
        check((class64_sub1_586_.anInt5316 and 0x10000) == 65536) { "" }
        method632(Thread.currentThread())
        method655()
        method636()
        class64_sub1_586_.method655()
        class64_sub1_586_.method636()
        anInt5341++
        var i_587_ = 0
        val `is` = class64_sub1_586_.anIntArray5356
        val i_588_ = class64_sub1_586_.anInt5387
        for (i_589_ in 0..<anInt5387) {
            val class360 = aClass360Array5360!![i_589_]!!
            if (class360.anInt4429 != 0) {
                val i_590_ = anIntArray5332!![i_589_] - i_584_
                if (i_590_ >= class64_sub1_586_.aShort5329 && i_590_ <= class64_sub1_586_.aShort5365) {
                    val i_591_ = anIntArray5356!![i_589_] - i
                    if (i_591_ >= class64_sub1_586_.aShort5395 && i_591_ <= class64_sub1_586_.aShort5393) {
                        val i_592_ = anIntArray5312!![i_589_] - i_585_
                        if (i_592_ >= class64_sub1_586_.aShort5352 && i_592_ <= class64_sub1_586_.aShort5331) {
                            for (i_593_ in 0..<i_588_) {
                                val class360_594_ = (class64_sub1_586_.aClass360Array5360!![i_593_])!!
                                if (i_591_ == `is`!![i_593_] && i_592_ == (class64_sub1_586_.anIntArray5312!![i_593_]) && i_590_ == (class64_sub1_586_.anIntArray5332!![i_593_]) && (class360_594_.anInt4429 != 0)) {
                                    if (aClass360Array5313 == null) aClass360Array5313 = arrayOfNulls<Class360>(anInt5387)
                                    if (class64_sub1_586_.aClass360Array5313 == null) class64_sub1_586_.aClass360Array5313 = arrayOfNulls<Class360>(i_588_)
                                    var class360_595_ = aClass360Array5313!![i_589_]
                                    if (class360_595_ == null) {
                                        aClass360Array5313!![i_589_] = Class360(class360)
                                        class360_595_ = aClass360Array5313!![i_589_]!!
                                    }
                                    var class360_596_ = (class64_sub1_586_.aClass360Array5313!![i_593_])
                                    if (class360_596_ == null) {
                                        class64_sub1_586_.aClass360Array5313!![i_593_] = Class360(class360_594_)
                                        class360_596_ = class64_sub1_586_.aClass360Array5313!![i_593_]!!
                                    }
                                    class360_595_.anInt4430 += (class360_594_.anInt4430)
                                    class360_595_.anInt4428 += (class360_594_.anInt4428)
                                    class360_595_.anInt4427 += (class360_594_.anInt4427)
                                    class360_595_.anInt4429 += (class360_594_.anInt4429)
                                    class360_596_.anInt4430 += class360.anInt4430
                                    class360_596_.anInt4428 += class360.anInt4428
                                    class360_596_.anInt4427 += class360.anInt4427
                                    class360_596_.anInt4429 += class360.anInt4429
                                    i_587_++
                                    anIntArray5326[i_589_] = anInt5341
                                    anIntArray5318[i_593_] = anInt5341
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i_587_ >= 3 && bool) {
            for (i_597_ in 0..<anInt5351) {
                if (anIntArray5326[aShortArray5317[i_597_].toInt()] == anInt5341 && anIntArray5326[aShortArray5394[i_597_].toInt()] == anInt5341 && anIntArray5326[aShortArray5364[i_597_].toInt()] == anInt5341) {
                    if (aByteArray5386 == null) aByteArray5386 = ByteArray(anInt5351)
                    aByteArray5386!![i_597_] = 2.toByte()
                }
            }
            for (i_598_ in 0..<class64_sub1_586_.anInt5351) {
                if ((anIntArray5318[class64_sub1_586_.aShortArray5317[i_598_].toInt()] == anInt5341) && anIntArray5318[(class64_sub1_586_.aShortArray5394[i_598_]).toInt()] == anInt5341 && anIntArray5318[(class64_sub1_586_.aShortArray5364[i_598_]).toInt()] == anInt5341) {
                    if (class64_sub1_586_.aByteArray5386 == null) class64_sub1_586_.aByteArray5386 = ByteArray(class64_sub1_586_.anInt5351)
                    class64_sub1_586_.aByteArray5386!![i_598_] = 2.toByte()
                }
            }
        }
    }

    private fun method649() {
        aClass360Array5360 = arrayOfNulls<Class360>(anInt5387)
        for (i in 0..<anInt5387) aClass360Array5360!![i] = Class360()
        for (i in 0..<anInt5351) {
            val i_599_ = aShortArray5317[i]
            val i_600_ = aShortArray5394[i]
            val i_601_ = aShortArray5364[i]
            val i_602_ = anIntArray5356!![i_600_.toInt()] - anIntArray5356!![i_599_.toInt()]
            val i_603_ = anIntArray5332!![i_600_.toInt()] - anIntArray5332!![i_599_.toInt()]
            val i_604_ = anIntArray5312!![i_600_.toInt()] - anIntArray5312!![i_599_.toInt()]
            val i_605_ = anIntArray5356!![i_601_.toInt()] - anIntArray5356!![i_599_.toInt()]
            val i_606_ = anIntArray5332!![i_601_.toInt()] - anIntArray5332!![i_599_.toInt()]
            val i_607_ = anIntArray5312!![i_601_.toInt()] - anIntArray5312!![i_599_.toInt()]
            var i_608_ = i_603_ * i_607_ - i_606_ * i_604_
            var i_609_ = i_604_ * i_605_ - i_607_ * i_602_
            var i_610_: Int
            i_610_ = i_602_ * i_606_ - i_605_ * i_603_
            while ((i_608_ > 8192 || i_609_ > 8192 || i_610_ > 8192 || i_608_ < -8192 || i_609_ < -8192 || i_610_ < -8192)) {
                i_608_ = i_608_ shr 1
                i_609_ = i_609_ shr 1
                i_610_ = i_610_ shr 1
            }
            var i_611_ = sqrt((i_608_ * i_608_ + i_609_ * i_609_ + i_610_ * i_610_).toDouble()).toInt()
            if (i_611_ <= 0) i_611_ = 1
            i_608_ = i_608_ * 256 / i_611_
            i_609_ = i_609_ * 256 / i_611_
            i_610_ = i_610_ * 256 / i_611_
            val i_612_: Byte
            if (aByteArray5386 == null) i_612_ = 0.toByte()
            else i_612_ = aByteArray5386!![i]
            if (i_612_.toInt() == 0) {
                var class360 = aClass360Array5360!![i_599_.toInt()]!!
                class360.anInt4430 += i_608_
                class360.anInt4428 += i_609_
                class360.anInt4427 += i_610_
                class360.anInt4429++
                class360 = aClass360Array5360!![i_600_.toInt()]!!
                class360.anInt4430 += i_608_
                class360.anInt4428 += i_609_
                class360.anInt4427 += i_610_
                class360.anInt4429++
                class360 = aClass360Array5360!![i_601_.toInt()]!!
                class360.anInt4430 += i_608_
                class360.anInt4428 += i_609_
                class360.anInt4427 += i_610_
                class360.anInt4429++
            } else if (i_612_.toInt() == 1) {
                if (aClass41Array5385 == null) aClass41Array5385 = arrayOfNulls<Class41>(anInt5351)
                aClass41Array5385!![i] = Class41()
                val class41 = aClass41Array5385!![i]!!
                class41.anInt561 = i_608_
                class41.anInt560 = i_609_
                class41.anInt559 = i_610_
            }
        }
    }

    public override fun H(i: Int, i_613_: Int, i_614_: Int) {
        check(!(i != 0 && (anInt5316 and 0x1) != 1))
        check(!(i_613_ != 0 && (anInt5316 and 0x2) != 2))
        check(!(i_614_ != 0 && (anInt5316 and 0x4) != 4))
        synchronized(this) {
            for (i_615_ in 0..<anInt5340) {
                anIntArray5356!![i_615_] += i
                anIntArray5332!![i_615_] += i_613_
                anIntArray5312!![i_615_] += i_614_
            }
        }
    }

    public override fun v() {
        check((anInt5316 and 0x10) == 16)
        synchronized(this) {
            for (i in 0..<anInt5340) anIntArray5312!![i] = -anIntArray5312!![i]
            if (aClass360Array5360 != null) {
                for (i in 0..<anInt5387) {
                    if (aClass360Array5360!![i] != null) aClass360Array5360!![i]!!.anInt4427 = -aClass360Array5360!![i]!!.anInt4427
                }
            }
            if (aClass360Array5313 != null) {
                for (i in 0..<anInt5387) {
                    if (aClass360Array5313!![i] != null) aClass360Array5313!![i]!!.anInt4427 = -aClass360Array5313!![i]!!.anInt4427
                }
            }
            if (aClass41Array5385 != null) {
                for (i in 0..<anInt5351) {
                    if (aClass41Array5385!![i] != null) aClass41Array5385!![i]!!.anInt559 = -aClass41Array5385!![i]!!.anInt559
                }
            }
            val `is` = aShortArray5317
            aShortArray5317 = aShortArray5364
            aShortArray5364 = `is`
            if (aFloatArrayArray5314 != null) {
                for (i in 0..<anInt5351) {
                    if (aFloatArrayArray5314!![i] != null) {
                        val f = aFloatArrayArray5314!![i]!![0]
                        aFloatArrayArray5314!![i]!![0] = aFloatArrayArray5314!![i]!![2]
                        aFloatArrayArray5314!![i]!![2] = f
                    }
                    if (aFloatArrayArray5345!![i] != null) {
                        val f = aFloatArrayArray5345!![i]!![0]
                        aFloatArrayArray5345!![i]!![0] = aFloatArrayArray5345!![i]!![2]
                        aFloatArrayArray5345!![i]!![2] = f
                    }
                }
            }
            aBoolean5323 = false
            anInt5354 = 0
        }
    }

    private fun method650(bool: Boolean, bool_616_: Boolean, i: Int, i_617_: Int) {
        if (aClass6Array5361 != null) {
            for (i_618_ in 0..<anInt5389) {
                val class6 = aClass6Array5361!![i_618_]!!
                anIntArray5400!![class6.anInt144] = i_618_
            }
        }
        if (aBoolean5382 || aClass6Array5361 != null) {
            if ((anInt5316 and 0x100) == 0 && aShortArray5327 != null) {
                for (i_619_ in 0..<anInt5351) {
                    val i_620_ = aShortArray5327!![i_619_]
                    method643(i_620_.toInt(), bool, bool_616_)
                }
            } else {
                for (i_621_ in 0..<anInt5351) {
                    if (!method629(i_621_) && !method638(i_621_)) method643(i_621_, bool, bool_616_)
                }
                if (aByteArray5358 == null) {
                    for (i_622_ in 0..<anInt5351) {
                        if (method629(i_622_) || method638(i_622_)) method643(i_622_, bool, bool_616_)
                    }
                } else {
                    for (i_623_ in 0..11) {
                        for (i_624_ in 0..<anInt5351) {
                            if (aByteArray5358!![i_624_].toInt() == i_623_ && (method629(i_624_) || method638(i_624_))) method643(i_624_, bool, bool_616_)
                        }
                    }
                }
            }
        } else {
            for (i_625_ in 0..<anInt5351) method643(i_625_, bool, bool_616_)
        }
    }

    private fun method651() {
        synchronized(this) {
            for (i in 0..<anInt5340) {
                anIntArray5356!![i] = -anIntArray5356!![i]
                anIntArray5312!![i] = -anIntArray5312!![i]
            }
            method631()
        }
    }

    public override fun ia(i: Short, i_626_: Short) {
        for (i_627_ in 0..<anInt5351) {
            if (aShortArray5311!![i_627_] == i) aShortArray5311!![i_627_] = i_626_
        }
        if (aClass6Array5361 != null) {
            for (i_628_ in 0..<anInt5389) {
                val class6 = aClass6Array5361!![i_628_]!!
                val class350 = aClass350Array5363!![i_628_]!!
                class350.anInt4313 = (class350.anInt4313 and 0xffffff.inv() or ((Class126.anIntArray4983!![method303((aShortArray5311!![class6.anInt144]).toInt(), 30).toInt() and 0xffff]) and 0xffffff))
            }
        }
        if (anInt5354 == 2) anInt5354 = 1
    }

    private fun method652() {
        synchronized(this) {
            for (i in 0..<anInt5387) {
                anIntArray5356!![i] = -anIntArray5356!![i]
                anIntArray5312!![i] = -anIntArray5312!![i]
                if (aClass360Array5360!![i] != null) {
                    aClass360Array5360!![i]!!.anInt4430 = -aClass360Array5360!![i]!!.anInt4430
                    aClass360Array5360!![i]!!.anInt4427 = -aClass360Array5360!![i]!!.anInt4427
                }
            }
            if (aClass41Array5385 != null) {
                for (i in 0..<anInt5351) {
                    if (aClass41Array5385!![i] != null) {
                        aClass41Array5385!![i]!!.anInt561 = -aClass41Array5385!![i]!!.anInt561
                        aClass41Array5385!![i]!!.anInt559 = -aClass41Array5385!![i]!!.anInt559
                    }
                }
            }
            for (i in anInt5387..<anInt5340) {
                anIntArray5356!![i] = -anIntArray5356!![i]
                anIntArray5312!![i] = -anIntArray5312!![i]
            }
            anInt5354 = 0
            aBoolean5323 = false
        }
    }

    private fun method653() {
        synchronized(this) {
            for (i in 0..<anInt5387) {
                var i_629_ = anIntArray5356!![i]
                anIntArray5356!![i] = anIntArray5312!![i]
                anIntArray5312!![i] = -i_629_
                if (aClass360Array5360!![i] != null) {
                    i_629_ = aClass360Array5360!![i]!!.anInt4430
                    aClass360Array5360!![i]!!.anInt4430 = aClass360Array5360!![i]!!.anInt4427
                    aClass360Array5360!![i]!!.anInt4427 = -i_629_
                }
            }
            if (aClass41Array5385 != null) {
                for (i in 0..<anInt5351) {
                    if (aClass41Array5385!![i] != null) {
                        val i_630_ = aClass41Array5385!![i]!!.anInt561
                        aClass41Array5385!![i]!!.anInt561 = aClass41Array5385!![i]!!.anInt559
                        aClass41Array5385!![i]!!.anInt559 = -i_630_
                    }
                }
            }
            for (i in anInt5387..<anInt5340) {
                val i_631_ = anIntArray5356!![i]
                anIntArray5356!![i] = anIntArray5312!![i]
                anIntArray5312!![i] = -i_631_
            }
            anInt5354 = 0
            aBoolean5323 = false
        }
    }

    private fun method654(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int, i_632_: Int) {
        if (anInt5387 >= 1) {
            aClass101_Sub1_5320 = class101 as Class101_Sub1
            val class101_sub1 = aHa_Sub1_5353.aClass101_Sub1_7492
            if (!aBoolean5323) method655()
            var bool = false
            if (aClass101_Sub1_5320!!.aFloat5672 == 16384.0f && aClass101_Sub1_5320!!.aFloat5673 == 0.0f && aClass101_Sub1_5320!!.aFloat5669 == 0.0f && aClass101_Sub1_5320!!.aFloat5655 == 0.0f && aClass101_Sub1_5320!!.aFloat5678 == 16384.0f && aClass101_Sub1_5320!!.aFloat5666 == 0.0f && aClass101_Sub1_5320!!.aFloat5662 == 0.0f && aClass101_Sub1_5320!!.aFloat5680 == 0.0f && (aClass101_Sub1_5320!!.aFloat5664 == 16384.0f)) bool = true
            val f = (class101_sub1!!.aFloat5681 + (class101_sub1.aFloat5662 * aClass101_Sub1_5320!!.aFloat5686) + (class101_sub1.aFloat5680 * aClass101_Sub1_5320!!.aFloat5685) + (class101_sub1.aFloat5664 * aClass101_Sub1_5320!!.aFloat5681))
            val f_633_ = (if (bool) class101_sub1.aFloat5680 else ((class101_sub1.aFloat5662 * aClass101_Sub1_5320!!.aFloat5673) + (class101_sub1.aFloat5680 * aClass101_Sub1_5320!!.aFloat5678) + (class101_sub1.aFloat5664 * aClass101_Sub1_5320!!.aFloat5680)))
            val i_634_ = (f + aShort5329.toFloat() * f_633_).toInt()
            val i_635_ = (f + aShort5365.toFloat() * f_633_).toInt()
            val i_636_: Int
            val i_637_: Int
            if (i_634_ > i_635_) {
                i_636_ = i_635_ - aShort5324
                i_637_ = i_634_ + aShort5324
            } else {
                i_636_ = i_634_ - aShort5324
                i_637_ = i_635_ + aShort5324
            }
            if (i_636_ < aHa_Sub1_5353.anInt7494 && i_637_ > aHa_Sub1_5353.anInt7482) {
                val f_638_ = (class101_sub1.aFloat5686 + (class101_sub1.aFloat5672 * aClass101_Sub1_5320!!.aFloat5686) + (class101_sub1.aFloat5673 * aClass101_Sub1_5320!!.aFloat5685) + (class101_sub1.aFloat5669 * aClass101_Sub1_5320!!.aFloat5681))
                val f_639_ = (if (bool) class101_sub1.aFloat5673 else ((class101_sub1.aFloat5672 * aClass101_Sub1_5320!!.aFloat5673) + (class101_sub1.aFloat5673 * (aClass101_Sub1_5320!!.aFloat5678)) + (class101_sub1.aFloat5669 * (aClass101_Sub1_5320!!.aFloat5680))))
                val i_640_ = (f_638_ + aShort5329.toFloat() * f_639_).toInt()
                val i_641_ = (f_638_ + aShort5365.toFloat() * f_639_).toInt()
                val i_642_: Int
                val i_643_: Int
                if (i_640_ > i_641_) {
                    i_642_ = ((i_641_ - aShort5324) * aHa_Sub1_5353.anInt7491)
                    i_643_ = ((i_640_ + aShort5324) * aHa_Sub1_5353.anInt7491)
                } else {
                    i_642_ = ((i_640_ - aShort5324) * aHa_Sub1_5353.anInt7491)
                    i_643_ = ((i_641_ + aShort5324) * aHa_Sub1_5353.anInt7491)
                }
                if (i == -1) {
                    if (i_642_ / i_637_ >= aHa_Sub1_5353.anInt7508 || (i_643_ / i_637_ <= aHa_Sub1_5353.anInt7509)) return
                } else if (i_642_ / i >= aHa_Sub1_5353.anInt7508 || (i_643_ / i <= aHa_Sub1_5353.anInt7509)) return
                val f_644_ = (class101_sub1.aFloat5685 + (class101_sub1.aFloat5655 * aClass101_Sub1_5320!!.aFloat5686) + (class101_sub1.aFloat5678 * aClass101_Sub1_5320!!.aFloat5685) + (class101_sub1.aFloat5666 * aClass101_Sub1_5320!!.aFloat5681))
                val f_645_ = (if (bool) class101_sub1.aFloat5678 else ((class101_sub1.aFloat5655 * aClass101_Sub1_5320!!.aFloat5673) + (class101_sub1.aFloat5678 * (aClass101_Sub1_5320!!.aFloat5678)) + (class101_sub1.aFloat5666 * (aClass101_Sub1_5320!!.aFloat5680))))
                val i_646_ = (f_644_ + aShort5329.toFloat() * f_645_).toInt()
                val i_647_ = (f_644_ + aShort5365.toFloat() * f_645_).toInt()
                val i_648_: Int
                val i_649_: Int
                if (i_646_ > i_647_) {
                    i_648_ = ((i_647_ - aShort5324) * aHa_Sub1_5353.anInt7497)
                    i_649_ = ((i_646_ + aShort5324) * aHa_Sub1_5353.anInt7497)
                } else {
                    i_648_ = ((i_646_ - aShort5324) * aHa_Sub1_5353.anInt7497)
                    i_649_ = ((i_647_ + aShort5324) * aHa_Sub1_5353.anInt7497)
                }
                if (i == -1) {
                    if (i_648_ / i_637_ >= aHa_Sub1_5353.anInt7506 || (i_649_ / i_637_ <= aHa_Sub1_5353.anInt7490)) return
                } else if (i_648_ / i >= aHa_Sub1_5353.anInt7506 || (i_649_ / i <= aHa_Sub1_5353.anInt7490)) return
                val f_650_: Float
                val f_651_: Float
                val f_652_: Float
                val f_653_: Float
                val f_654_: Float
                val f_655_: Float
                if (bool) {
                    f_650_ = class101_sub1.aFloat5672
                    f_651_ = class101_sub1.aFloat5655
                    f_652_ = class101_sub1.aFloat5662
                    f_653_ = class101_sub1.aFloat5669
                    f_654_ = class101_sub1.aFloat5666
                    f_655_ = class101_sub1.aFloat5664
                } else {
                    f_650_ = ((class101_sub1.aFloat5672 * aClass101_Sub1_5320!!.aFloat5672) + (class101_sub1.aFloat5673 * (aClass101_Sub1_5320!!.aFloat5655)) + (class101_sub1.aFloat5669 * (aClass101_Sub1_5320!!.aFloat5662)))
                    f_651_ = ((class101_sub1.aFloat5655 * aClass101_Sub1_5320!!.aFloat5672) + (class101_sub1.aFloat5678 * (aClass101_Sub1_5320!!.aFloat5655)) + (class101_sub1.aFloat5666 * (aClass101_Sub1_5320!!.aFloat5662)))
                    f_652_ = ((class101_sub1.aFloat5662 * aClass101_Sub1_5320!!.aFloat5672) + (class101_sub1.aFloat5680 * (aClass101_Sub1_5320!!.aFloat5655)) + (class101_sub1.aFloat5664 * (aClass101_Sub1_5320!!.aFloat5662)))
                    f_653_ = ((class101_sub1.aFloat5672 * aClass101_Sub1_5320!!.aFloat5669) + (class101_sub1.aFloat5673 * (aClass101_Sub1_5320!!.aFloat5666)) + (class101_sub1.aFloat5669 * (aClass101_Sub1_5320!!.aFloat5664)))
                    f_654_ = ((class101_sub1.aFloat5655 * aClass101_Sub1_5320!!.aFloat5669) + (class101_sub1.aFloat5678 * (aClass101_Sub1_5320!!.aFloat5666)) + (class101_sub1.aFloat5666 * (aClass101_Sub1_5320!!.aFloat5664)))
                    f_655_ = ((class101_sub1.aFloat5662 * aClass101_Sub1_5320!!.aFloat5669) + (class101_sub1.aFloat5680 * (aClass101_Sub1_5320!!.aFloat5666)) + (class101_sub1.aFloat5664 * (aClass101_Sub1_5320!!.aFloat5664)))
                }
                if (aHa_Sub1_5353.anInt7485 > 1) {
                    synchronized(this) {
                        while (aBoolean5357) {
                            try {
                                (this as Object).wait()
                            } catch (interruptedexception: InterruptedException) {
                                /* empty */
                            }
                        }
                        aBoolean5357 = true
                    }
                }
                method632(Thread.currentThread())
                aClass109_5383!!.method1023((i_632_ and 0x2) != 0)
                var bool_656_ = false
                val bool_657_ = i_636_ <= aHa_Sub1_5353.anInt7482
                val bool_658_ = (bool_657_ || aClass129Array5322 != null || aClass342Array5335 != null)
                aClass167_5367!!.anInt2221 = aClass109_5383!!.anInt1679
                aClass167_5367!!.anInt2229 = aClass109_5383!!.anInt1665
                aClass167_5367!!.anInt2215 = aClass109_5383!!.anInt1668
                val i_659_ = aHa_Sub1_5353.anInt7491
                val i_660_ = aHa_Sub1_5353.anInt7497
                val i_661_ = aHa_Sub1_5353.anInt7482
                if (i == -1) {
                    for (i_662_ in 0..<anInt5340) {
                        val i_663_ = anIntArray5356!![i_662_]
                        val i_664_ = anIntArray5332!![i_662_]
                        val i_665_ = anIntArray5312!![i_662_]
                        val f_666_ = (f_638_ + f_650_ * i_663_.toFloat() + f_639_ * i_664_.toFloat() + f_653_ * i_665_.toFloat())
                        val f_667_ = (f_644_ + f_651_ * i_663_.toFloat() + f_645_ * i_664_.toFloat() + f_654_ * i_665_.toFloat())
                        val f_668_ = (f + f_652_ * i_663_.toFloat() + f_633_ * i_664_.toFloat() + f_655_ * i_665_.toFloat())
                        anIntArray5355[i_662_] = f_668_.toInt()
                        if (f_668_ >= i_661_.toFloat()) {
                            anIntArray5321[i_662_] = (aClass167_5367!!.anInt2229 + (f_666_ * i_659_.toFloat() / f_668_).toInt())
                            anIntArray5343[i_662_] = (aClass167_5367!!.anInt2215 + (f_667_ * i_660_.toFloat() / f_668_).toInt())
                        } else {
                            anIntArray5321[i_662_] = -5000
                            bool_656_ = true
                        }
                        if (bool_658_) {
                            anIntArray5399[i_662_] = f_666_.toInt()
                            anIntArray5384[i_662_] = f_667_.toInt()
                            anIntArray5392[i_662_] = f_668_.toInt()
                        }
                        if (aClass167_5367!!.aBoolean2195) anIntArray5362[i_662_] = ((aClass101_Sub1_5320!!.aFloat5685) + ((aClass101_Sub1_5320!!.aFloat5655 * i_663_.toFloat()) + (aClass101_Sub1_5320!!.aFloat5678 * i_664_.toFloat()) + (aClass101_Sub1_5320!!.aFloat5666 * i_665_.toFloat()))).toInt()
                    }
                    if (aClass6Array5361 != null) {
                        for (i_669_ in 0..<anInt5389) {
                            val class6 = aClass6Array5361!![i_669_]!!
                            val class350 = aClass350Array5363!![i_669_]!!
                            val i_670_ = aShortArray5317[class6.anInt144]
                            val i_671_ = aShortArray5394[class6.anInt144]
                            val i_672_ = aShortArray5364[class6.anInt144]
                            val i_673_ = ((anIntArray5356!![i_670_.toInt()] + anIntArray5356!![i_671_.toInt()] + anIntArray5356!![i_672_.toInt()]) / 3)
                            val i_674_ = ((anIntArray5332!![i_670_.toInt()] + anIntArray5332!![i_671_.toInt()] + anIntArray5332!![i_672_.toInt()]) / 3)
                            val i_675_ = ((anIntArray5312!![i_670_.toInt()] + anIntArray5312!![i_671_.toInt()] + anIntArray5312!![i_672_.toInt()]) / 3)
                            val f_676_ = (class350.anInt4316.toFloat() + (f_638_ + f_650_ * i_673_.toFloat() + f_639_ * i_674_.toFloat() + f_653_ * i_675_.toFloat()))
                            val f_677_ = (class350.anInt4317.toFloat() + (f_644_ + f_651_ * i_673_.toFloat() + f_645_ * i_674_.toFloat() + f_654_ * i_675_.toFloat()))
                            val f_678_ = (f + f_652_ * i_673_.toFloat() + f_633_ * i_674_.toFloat() + f_655_ * i_675_.toFloat())
                            if (f_678_ > (aHa_Sub1_5353.anInt7482).toFloat()) {
                                class350.anInt4312 = (aHa_Sub1_5353.anInt7510 + (f_676_ * i_659_.toFloat() / f_678_).toInt())
                                class350.anInt4310 = (aHa_Sub1_5353.anInt7504 + (f_677_ * i_660_.toFloat() / f_678_).toInt())
                                class350.anInt4320 = (f_678_.toInt() - class6.anInt154)
                                class350.anInt4309 = (((class350.anInt4314) * (class6.aShort150) * i_659_).toFloat() / (f_678_ * 128.0f)).toInt()
                                class350.anInt4307 = (((class350.anInt4311) * (class6.aShort143) * i_660_).toFloat() / (f_678_ * 128.0f)).toInt()
                            } else {
                                class350.anInt4307 = 0
                                class350.anInt4309 = class350.anInt4307
                            }
                        }
                    }
                } else {
                    for (i_679_ in 0..<anInt5340) {
                        val i_680_ = anIntArray5356!![i_679_]
                        val i_681_ = anIntArray5332!![i_679_]
                        val i_682_ = anIntArray5312!![i_679_]
                        val f_683_ = (f_638_ + f_650_ * i_680_.toFloat() + f_639_ * i_681_.toFloat() + f_653_ * i_682_.toFloat())
                        val f_684_ = (f_644_ + f_651_ * i_680_.toFloat() + f_645_ * i_681_.toFloat() + f_654_ * i_682_.toFloat())
                        val f_685_ = (f + f_652_ * i_680_.toFloat() + f_633_ * i_681_.toFloat() + f_655_ * i_682_.toFloat())
                        anIntArray5355[i_679_] = f_685_.toInt()
                        anIntArray5321[i_679_] = (aClass167_5367!!.anInt2229 + (f_683_ * i_659_.toFloat() / i.toFloat()).toInt())
                        anIntArray5343[i_679_] = (aClass167_5367!!.anInt2215 + (f_684_ * i_660_.toFloat() / i.toFloat()).toInt())
                        if (bool_658_) {
                            anIntArray5399[i_679_] = f_683_.toInt()
                            anIntArray5384[i_679_] = f_684_.toInt()
                            anIntArray5392[i_679_] = i
                        }
                        if (aClass167_5367!!.aBoolean2195) anIntArray5362[i_679_] = ((aClass101_Sub1_5320!!.aFloat5685) + ((aClass101_Sub1_5320!!.aFloat5655 * i_680_.toFloat()) + (aClass101_Sub1_5320!!.aFloat5678 * i_681_.toFloat()) + (aClass101_Sub1_5320!!.aFloat5666 * i_682_.toFloat()))).toInt()
                    }
                    if (aClass6Array5361 != null) {
                        for (i_686_ in 0..<anInt5389) {
                            val class6 = aClass6Array5361!![i_686_]!!
                            val class350 = aClass350Array5363!![i_686_]!!
                            val i_687_ = aShortArray5317[class6.anInt144]
                            val i_688_ = aShortArray5394[class6.anInt144]
                            val i_689_ = aShortArray5364[class6.anInt144]
                            val i_690_ = ((anIntArray5356!![i_687_.toInt()] + anIntArray5356!![i_688_.toInt()] + anIntArray5356!![i_689_.toInt()]) / 3)
                            val i_691_ = ((anIntArray5332!![i_687_.toInt()] + anIntArray5332!![i_688_.toInt()] + anIntArray5332!![i_689_.toInt()]) / 3)
                            val i_692_ = ((anIntArray5312!![i_687_.toInt()] + anIntArray5312!![i_688_.toInt()] + anIntArray5312!![i_689_.toInt()]) / 3)
                            val f_693_ = (f_638_ + f_650_ * i_690_.toFloat() + f_639_ * i_691_.toFloat() + f_653_ * i_692_.toFloat())
                            val f_694_ = (f_644_ + f_651_ * i_690_.toFloat() + f_645_ * i_691_.toFloat() + f_654_ * i_692_.toFloat())
                            val f_695_ = (f + f_652_ * i_690_.toFloat() + f_633_ * i_691_.toFloat() + f_655_ * i_692_.toFloat())
                            class350.anInt4312 = (aHa_Sub1_5353.anInt7510 + (f_693_ * i_659_.toFloat() / i.toFloat()).toInt())
                            class350.anInt4310 = (aHa_Sub1_5353.anInt7504 + (f_694_ * i_660_.toFloat() / i.toFloat()).toInt())
                            class350.anInt4320 = i - class6.anInt154
                            class350.anInt4309 = (class350.anInt4314 * class6.aShort150 * i_659_ / (i shl 7))
                            class350.anInt4307 = (class350.anInt4311 * class6.aShort143 * i_660_ / (i shl 7))
                        }
                    }
                }
                if (class318_sub3 != null) {
                    var bool_696_ = false
                    var bool_697_ = true
                    val i_698_ = aShort5395 + aShort5393 shr 1
                    val i_699_ = aShort5352 + aShort5331 shr 1
                    var i_700_ = i_698_
                    var i_701_ = aShort5329
                    var i_702_ = i_699_
                    val f_703_ = (f_638_ + f_650_ * i_700_.toFloat() + f_639_ * i_701_.toFloat() + f_653_ * i_702_.toFloat())
                    val f_704_ = (f_644_ + f_651_ * i_700_.toFloat() + f_645_ * i_701_.toFloat() + f_654_ * i_702_.toFloat())
                    val f_705_ = (f + f_652_ * i_700_.toFloat() + f_633_ * i_701_.toFloat() + f_655_ * i_702_.toFloat())
                    if (f_705_ >= i_661_.toFloat()) {
                        var i_706_ = f_705_.toInt()
                        if (i != -1) i_706_ = i
                        class318_sub3.anInt6405 = (aHa_Sub1_5353.anInt7510 + (f_703_ * i_659_.toFloat() / i_706_.toFloat()).toInt())
                        class318_sub3.anInt6402 = (aHa_Sub1_5353.anInt7504 + (f_704_ * i_660_.toFloat() / i_706_.toFloat()).toInt())
                    } else bool_696_ = true
                    i_700_ = i_698_
                    i_701_ = aShort5365
                    i_702_ = i_699_
                    val f_707_ = (f_638_ + f_650_ * i_700_.toFloat() + f_639_ * i_701_.toFloat() + f_653_ * i_702_.toFloat())
                    val f_708_ = (f_644_ + f_651_ * i_700_.toFloat() + f_645_ * i_701_.toFloat() + f_654_ * i_702_.toFloat())
                    val f_709_ = (f + f_652_ * i_700_.toFloat() + f_633_ * i_701_.toFloat() + f_655_ * i_702_.toFloat())
                    if (f_709_ >= i_661_.toFloat()) {
                        var i_710_ = f_709_.toInt()
                        if (i != -1) i_710_ = i
                        class318_sub3.anInt6406 = (aHa_Sub1_5353.anInt7510 + (f_707_ * i_659_.toFloat() / i_710_.toFloat()).toInt())
                        class318_sub3.anInt6404 = (aHa_Sub1_5353.anInt7504 + (f_708_ * i_660_.toFloat() / i_710_.toFloat()).toInt())
                    } else bool_696_ = true
                    if (bool_696_) {
                        if (f_705_ < i_661_.toFloat() && f_709_ < i_661_.toFloat()) bool_697_ = false
                        else if (f_705_ < i_661_.toFloat()) {
                            val f_711_ = ((f_709_ - (aHa_Sub1_5353.anInt7482).toFloat()) / (f_709_ - f_705_))
                            val i_712_ = (f_707_ + (f_707_ - f_703_) * f_711_).toInt()
                            val i_713_ = (f_708_ + (f_708_ - f_704_) * f_711_).toInt()
                            var i_714_ = i_661_
                            if (i != -1) i_714_ = i
                            class318_sub3.anInt6405 = (aHa_Sub1_5353.anInt7510 + i_712_ * i_659_ / i_714_)
                            class318_sub3.anInt6402 = (aHa_Sub1_5353.anInt7504 + i_713_ * i_660_ / i_714_)
                        } else if (f_709_ < i_661_.toFloat()) {
                            val f_715_ = ((f_705_ - i_661_.toFloat()) / (f_705_ - f_709_))
                            val i_716_ = (f_703_ + (f_703_ - f_707_) * f_715_).toInt()
                            val i_717_ = (f_704_ + (f_704_ - f_708_) * f_715_).toInt()
                            var i_718_ = i_661_
                            if (i != -1) i_718_ = i
                            class318_sub3.anInt6405 = (aHa_Sub1_5353.anInt7510 + i_716_ * i_659_ / i_718_)
                            class318_sub3.anInt6402 = (aHa_Sub1_5353.anInt7504 + i_717_ * i_660_ / i_718_)
                        }
                    }
                    if (bool_697_) {
                        if (f_705_ > f_709_) {
                            var i_719_ = f_705_.toInt()
                            if (i != -1) i_719_ = i
                            class318_sub3.anInt6403 = (aHa_Sub1_5353.anInt7510 + ((f_703_ + aShort5324.toFloat()) * i_659_.toFloat() / i_719_.toFloat()).toInt() - (class318_sub3.anInt6405))
                        } else {
                            var i_720_ = f_709_.toInt()
                            if (i != -1) i_720_ = i
                            class318_sub3.anInt6403 = (aHa_Sub1_5353.anInt7510 + ((f_707_ + aShort5324.toFloat()) * i_659_.toFloat() / i_720_.toFloat()).toInt() - (class318_sub3.anInt6406))
                        }
                        class318_sub3.aBoolean6401 = true
                    }
                }
                method634(true)
                aClass109_5383!!.aBoolean1669 = (i_632_ and 0x1) == 0
                aClass109_5383!!.aBoolean1667 = false
                try {
                    method650(bool_656_, ((aClass167_5367!!.aBoolean2201 && (i_637_ > aClass167_5367!!.anInt2210)) || aClass167_5367!!.aBoolean2195), i_636_, i_637_ - i_636_)
                } catch (exception: Exception) {
                    /* empty */
                }
                if (aClass6Array5361 != null) {
                    for (i_721_ in 0..<anInt5351) anIntArray5400!![i_721_] = -1
                }
                aClass109_5383 = null
                if (aHa_Sub1_5353.anInt7485 > 1) {
                    synchronized(this) {
                        aBoolean5357 = false
                        (this as Object).notifyAll()
                    }
                }
            }
        }
    }

    public override fun r(): Boolean {
        return aBoolean5391
    }

    private fun method655() {
        if (!aBoolean5323) {
            var i = 0
            var i_722_ = 0
            var i_723_ = 32767
            var i_724_ = 32767
            var i_725_ = 32767
            var i_726_ = -32768
            var i_727_ = -32768
            var i_728_ = -32768
            for (i_729_ in 0..<anInt5387) {
                val i_730_ = anIntArray5356!![i_729_]
                val i_731_ = anIntArray5332!![i_729_]
                val i_732_ = anIntArray5312!![i_729_]
                if (i_730_ < i_723_) i_723_ = i_730_
                if (i_730_ > i_726_) i_726_ = i_730_
                if (i_731_ < i_724_) i_724_ = i_731_
                if (i_731_ > i_727_) i_727_ = i_731_
                if (i_732_ < i_725_) i_725_ = i_732_
                if (i_732_ > i_728_) i_728_ = i_732_
                var i_733_ = i_730_ * i_730_ + i_732_ * i_732_
                if (i_733_ > i) i = i_733_
                i_733_ += i_731_ * i_731_
                if (i_733_ > i_722_) i_722_ = i_733_
            }
            aShort5395 = i_723_.toShort()
            aShort5393 = i_726_.toShort()
            aShort5329 = i_724_.toShort()
            aShort5365 = i_727_.toShort()
            aShort5352 = i_725_.toShort()
            aShort5331 = i_728_.toShort()
            aShort5324 = (sqrt(i.toDouble()) + 0.99).toInt().toShort()
            aShort5348 = (sqrt(i_722_.toDouble()) + 0.99).toInt().toShort()
            aBoolean5323 = true
        }
    }

    private fun method656(i: Int): Int {
        var i = i
        if (i < 2) i = 2
        else if (i > 126) i = 126
        return i
    }

    private fun method657(bool: Boolean) {
        if (anInt5354 == 1) method647()
        else if (anInt5354 == 2) {
            if ((anInt5316 and 0x97098) == 0 && aFloatArrayArray5314 == null) aShortArray5311 = null
            if (bool) aByteArray5386 = null
        } else {
            method636()
            val i = aHa_Sub1_5353.anInt7484
            val i_734_ = aHa_Sub1_5353.anInt7473
            val i_735_ = aHa_Sub1_5353.anInt7479
            val i_736_ = aHa_Sub1_5353.anInt7500 shr 8
            val i_737_ = aHa_Sub1_5353.anInt7474 * 768 / anInt5349
            val i_738_ = aHa_Sub1_5353.anInt7478 * 768 / anInt5349
            if (anIntArray5368 == null) {
                anIntArray5368 = IntArray(anInt5351)
                anIntArray5337 = IntArray(anInt5351)
                anIntArray5366 = IntArray(anInt5351)
            }
            for (i_739_ in 0..<anInt5351) {
                var i_740_: Byte
                if (aByteArray5386 == null) i_740_ = 0.toByte()
                else i_740_ = aByteArray5386!![i_739_]
                val i_741_: Byte
                if (aByteArray5325 == null) i_741_ = 0.toByte()
                else i_741_ = aByteArray5325!![i_739_]
                val i_742_: Short
                if (aShortArray5388 == null) i_742_ = (-1).toShort()
                else i_742_ = aShortArray5388!![i_739_]
                if (i_741_.toInt() == -2) i_740_ = 3.toByte()
                if (i_741_.toInt() == -1) i_740_ = 2.toByte()
                if (i_742_.toInt() == -1) {
                    if (i_740_.toInt() == 0) {
                        val i_743_ = aShortArray5311!![i_739_].toInt() and 0xffff
                        val i_744_ = (i_743_ and 0x7f) * anInt5344 shr 7
                        val i_745_ = method303(i_743_ and 0x7f.inv() or i_744_, 30)
                        var class360: Class360
                        if (aClass360Array5313 != null && (aClass360Array5313!![aShortArray5317[i_739_].toInt()] != null)) class360 = aClass360Array5313!![aShortArray5317[i_739_].toInt()]!!
                        else class360 = aClass360Array5360!![aShortArray5317[i_739_].toInt()]!!
                        var i_746_ = (((i * class360.anInt4430 + i_734_ * class360.anInt4428 + i_735_ * class360.anInt4427) / class360.anInt4429) shr 16)
                        var i_747_ = if (i_746_ > 256) i_737_ else i_738_
                        var i_748_ = (i_736_ shr 1) + (i_747_ * i_746_ shr 17)
                        anIntArray5368!![i_739_] = i_748_ shl 17 or Class291.method2198(0, i_748_, i_745_.toInt())
                        if (aClass360Array5313 != null && (aClass360Array5313!![aShortArray5394[i_739_].toInt()] != null)) class360 = aClass360Array5313!![aShortArray5394[i_739_].toInt()]!!
                        else class360 = aClass360Array5360!![aShortArray5394[i_739_].toInt()]!!
                        i_746_ = ((i * class360.anInt4430 + i_734_ * class360.anInt4428 + i_735_ * class360.anInt4427) / class360.anInt4429) shr 16
                        i_747_ = if (i_746_ > 256) i_737_ else i_738_
                        i_748_ = (i_736_ shr 1) + (i_747_ * i_746_ shr 17)
                        anIntArray5337!![i_739_] = i_748_ shl 17 or Class291.method2198(0, i_748_, i_745_.toInt())
                        if (aClass360Array5313 != null && (aClass360Array5313!![aShortArray5364[i_739_].toInt()] != null)) class360 = aClass360Array5313!![aShortArray5364[i_739_].toInt()]!!
                        else class360 = aClass360Array5360!![aShortArray5364[i_739_].toInt()]!!
                        i_746_ = ((i * class360.anInt4430 + i_734_ * class360.anInt4428 + i_735_ * class360.anInt4427) / class360.anInt4429) shr 16
                        i_747_ = if (i_746_ > 256) i_737_ else i_738_
                        i_748_ = (i_736_ shr 1) + (i_747_ * i_746_ shr 17)
                        anIntArray5366!![i_739_] = i_748_ shl 17 or Class291.method2198(0, i_748_, i_745_.toInt())
                    } else if (i_740_.toInt() == 1) {
                        val i_749_ = aShortArray5311!![i_739_].toInt() and 0xffff
                        val i_750_ = (i_749_ and 0x7f) * anInt5344 shr 7
                        val i_751_ = method303(i_749_ and 0x7f.inv() or i_750_, 30)
                        val class41 = aClass41Array5385!![i_739_]!!
                        val i_752_ = ((i * class41.anInt561 + i_734_ * class41.anInt560 + i_735_ * class41.anInt559) shr 16)
                        val i_753_ = if (i_752_ > 256) i_737_ else i_738_
                        val i_754_ = (i_736_ shr 1) + (i_753_ * i_752_ shr 17)
                        anIntArray5368!![i_739_] = i_754_ shl 17 or Class291.method2198(0, i_754_, i_751_.toInt())
                        anIntArray5366!![i_739_] = -1
                    } else if (i_740_.toInt() == 3) {
                        anIntArray5368!![i_739_] = 128
                        anIntArray5366!![i_739_] = -1
                    } else anIntArray5366!![i_739_] = -2
                } else {
                    val i_755_ = aShortArray5311!![i_739_].toInt() and 0xffff
                    if (i_740_.toInt() == 0) {
                        var class360: Class360
                        if (aClass360Array5313 != null && (aClass360Array5313!![aShortArray5317[i_739_].toInt()] != null)) class360 = aClass360Array5313!![aShortArray5317[i_739_].toInt()]!!
                        else class360 = aClass360Array5360!![aShortArray5317[i_739_].toInt()]!!
                        var i_756_ = (((i * class360.anInt4430 + i_734_ * class360.anInt4428 + i_735_ * class360.anInt4427) / class360.anInt4429) shr 16)
                        var i_757_ = if (i_756_ > 256) i_737_ else i_738_
                        var i_758_ = method656((i_736_ shr 2) + (i_757_ * i_756_ shr 18))
                        anIntArray5368!![i_739_] = i_758_ shl 24 or method642(i_755_, i_742_, i_758_)
                        if (aClass360Array5313 != null && (aClass360Array5313!![aShortArray5394[i_739_].toInt()] != null)) class360 = aClass360Array5313!![aShortArray5394[i_739_].toInt()]!!
                        else class360 = aClass360Array5360!![aShortArray5394[i_739_].toInt()]!!
                        i_756_ = ((i * class360.anInt4430 + i_734_ * class360.anInt4428 + i_735_ * class360.anInt4427) / class360.anInt4429) shr 16
                        i_757_ = if (i_756_ > 256) i_737_ else i_738_
                        i_758_ = method656((i_736_ shr 2) + (i_757_ * i_756_ shr 18))
                        anIntArray5337!![i_739_] = i_758_ shl 24 or method642(i_755_, i_742_, i_758_)
                        if (aClass360Array5313 != null && (aClass360Array5313!![aShortArray5364[i_739_].toInt()] != null)) class360 = aClass360Array5313!![aShortArray5364[i_739_].toInt()]!!
                        else class360 = aClass360Array5360!![aShortArray5364[i_739_].toInt()]!!
                        i_756_ = ((i * class360.anInt4430 + i_734_ * class360.anInt4428 + i_735_ * class360.anInt4427) / class360.anInt4429) shr 16
                        i_757_ = if (i_756_ > 256) i_737_ else i_738_
                        i_758_ = method656((i_736_ shr 2) + (i_757_ * i_756_ shr 18))
                        anIntArray5366!![i_739_] = i_758_ shl 24 or method642(i_755_, i_742_, i_758_)
                    } else if (i_740_.toInt() == 1) {
                        val class41 = aClass41Array5385!![i_739_]!!
                        val i_759_ = ((i * class41.anInt561 + i_734_ * class41.anInt560 + i_735_ * class41.anInt559) shr 16)
                        val i_760_ = if (i_759_ > 256) i_737_ else i_738_
                        val i_761_ = method656((i_736_ shr 2) + (i_760_ * i_759_ shr 18))
                        anIntArray5368!![i_739_] = i_761_ shl 24 or method642(i_755_, i_742_, i_761_)
                        anIntArray5366!![i_739_] = -1
                    } else anIntArray5366!![i_739_] = -2
                }
            }
            aClass360Array5360 = null
            aClass360Array5313 = null
            aClass41Array5385 = null
            if ((anInt5316 and 0x97098) == 0 && aFloatArrayArray5314 == null) aShortArray5311 = null
            if (bool) aByteArray5386 = null
            anInt5354 = 2
        }
    }

    public override fun method614(i: Byte, i_762_: Int, bool: Boolean): Class64 {
        method648(Thread.currentThread())
        val class64_sub1_763_: Class64_Sub1
        val class64_sub1_764_: Class64_Sub1
        if (i.toInt() == 1) {
            class64_sub1_763_ = aClass64_Sub1_5374!!
            class64_sub1_764_ = aClass64_Sub1_5378!!
        } else if (i.toInt() == 2) {
            class64_sub1_763_ = aClass64_Sub1_5328!!
            class64_sub1_764_ = aClass64_Sub1_5339!!
        } else if (i.toInt() == 3) {
            class64_sub1_763_ = aClass64_Sub1_5376!!
            class64_sub1_764_ = aClass64_Sub1_5396!!
        } else if (i.toInt() == 4) {
            class64_sub1_763_ = aClass64_Sub1_5397!!
            class64_sub1_764_ = aClass64_Sub1_5347!!
        } else if (i.toInt() == 5) {
            class64_sub1_763_ = aClass64_Sub1_5319!!
            class64_sub1_764_ = aClass64_Sub1_5390!!
        } else {
            class64_sub1_763_ = Class64_Sub1(aHa_Sub1_5353)
            class64_sub1_764_ = class64_sub1_763_
        }
        return method633(class64_sub1_764_, class64_sub1_763_, i_762_, i.toInt() != 0, bool)
    }

    public override fun O(i: Int, i_765_: Int, i_766_: Int) {
        check(!(i != 128 && (anInt5316 and 0x1) != 1))
        check(!(i_765_ != 128 && (anInt5316 and 0x2) != 2))
        check(!(i_766_ != 128 && (anInt5316 and 0x4) != 4))
        synchronized(this) {
            for (i_767_ in 0..<anInt5340) {
                anIntArray5356!![i_767_] = anIntArray5356!![i_767_] * i shr 7
                anIntArray5332!![i_767_] = anIntArray5332!![i_767_] * i_765_ shr 7
                anIntArray5312!![i_767_] = anIntArray5312!![i_767_] * i_766_ shr 7
            }
            aBoolean5323 = false
        }
    }

    public override fun ua(): Int {
        return anInt5316
    }

    private fun method658(i: Int) {
        if (aClass167_5367!!.aBoolean2195) {
            val i_777_ = aShortArray5317[i]
            val i_778_ = aShortArray5394[i]
            val i_779_ = aShortArray5364[i]
            var i_780_ = 0
            var i_781_ = 0
            var i_782_ = 0
            if (anIntArray5362[i_777_.toInt()] > aClass167_5367!!.anInt2197) i_780_ = 255
            else if (anIntArray5362[i_777_.toInt()] > aClass167_5367!!.anInt2211) i_780_ = ((aClass167_5367!!.anInt2211 - anIntArray5362[i_777_.toInt()]) * 255 / (aClass167_5367!!.anInt2211 - aClass167_5367!!.anInt2197))
            if (anIntArray5362[i_778_.toInt()] > aClass167_5367!!.anInt2197) i_781_ = 255
            else if (anIntArray5362[i_778_.toInt()] > aClass167_5367!!.anInt2211) i_781_ = ((aClass167_5367!!.anInt2211 - anIntArray5362[i_778_.toInt()]) * 255 / (aClass167_5367!!.anInt2211 - aClass167_5367!!.anInt2197))
            if (anIntArray5362[i_779_.toInt()] > aClass167_5367!!.anInt2197) i_782_ = 255
            else if (anIntArray5362[i_779_.toInt()] > aClass167_5367!!.anInt2211) i_782_ = ((aClass167_5367!!.anInt2211 - anIntArray5362[i_779_.toInt()]) * 255 / (aClass167_5367!!.anInt2211 - aClass167_5367!!.anInt2197))
            if (aByteArray5325 == null) aClass109_5383!!.anInt1674 = 0
            else aClass109_5383!!.anInt1674 = aByteArray5325!![i].toInt() and 0xff
            if (aShortArray5388 == null || aShortArray5388!![i].toInt() == -1) {
                if (anIntArray5366!![i] == -1) aClass109_5383!!.method1027(
                    anIntArray5343[i_777_.toInt()].toFloat(),
                    anIntArray5343[i_778_.toInt()].toFloat(),
                    anIntArray5343[i_779_.toInt()].toFloat(),
                    anIntArray5321[i_777_.toInt()].toFloat(),
                    anIntArray5321[i_778_.toInt()].toFloat(),
                    anIntArray5321[i_779_.toInt()].toFloat(),
                    anIntArray5355[i_777_.toInt()].toFloat(),
                    anIntArray5355[i_778_.toInt()].toFloat(),
                    anIntArray5355[i_779_.toInt()].toFloat(),
                    method206((Class126.anIntArray4983!![anIntArray5368!![i] and 0xffff]), (i_780_ shl 24 or (aClass167_5367!!.anInt2192)), 255),
                    method206((Class126.anIntArray4983!![anIntArray5368!![i] and 0xffff]), (i_781_ shl 24 or (aClass167_5367!!.anInt2192)), 255),
                    method206((Class126.anIntArray4983!![anIntArray5368!![i] and 0xffff]), (i_782_ shl 24 or (aClass167_5367!!.anInt2192)), 255)
                )
                else aClass109_5383!!.method1027(
                    anIntArray5343[i_777_.toInt()].toFloat(),
                    anIntArray5343[i_778_.toInt()].toFloat(),
                    anIntArray5343[i_779_.toInt()].toFloat(),
                    anIntArray5321[i_777_.toInt()].toFloat(),
                    anIntArray5321[i_778_.toInt()].toFloat(),
                    anIntArray5321[i_779_.toInt()].toFloat(),
                    anIntArray5355[i_777_.toInt()].toFloat(),
                    anIntArray5355[i_778_.toInt()].toFloat(),
                    anIntArray5355[i_779_.toInt()].toFloat(),
                    method206((Class126.anIntArray4983!![anIntArray5368!![i] and 0xffff]), (i_780_ shl 24 or (aClass167_5367!!.anInt2192)), 255),
                    method206((Class126.anIntArray4983!![anIntArray5337!![i] and 0xffff]), (i_781_ shl 24 or (aClass167_5367!!.anInt2192)), 255),
                    method206((Class126.anIntArray4983!![anIntArray5366!![i] and 0xffff]), (i_782_ shl 24 or (aClass167_5367!!.anInt2192)), 255)
                )
            } else {
                var i_783_ = -16777216
                if (aByteArray5325 != null) i_783_ = 255 - (aByteArray5325!![i].toInt() and 0xff) shl 24
                if (anIntArray5366!![i] == -1) {
                    val i_784_ = i_783_ or (anIntArray5368!![i] and 0xffffff)
                    aClass109_5383!!.method1024(
                        anIntArray5343[i_777_.toInt()].toFloat(),
                        anIntArray5343[i_778_.toInt()].toFloat(),
                        anIntArray5343[i_779_.toInt()].toFloat(),
                        anIntArray5321[i_777_.toInt()].toFloat(),
                        anIntArray5321[i_778_.toInt()].toFloat(),
                        anIntArray5321[i_779_.toInt()].toFloat(),
                        anIntArray5355[i_777_.toInt()].toFloat(),
                        anIntArray5355[i_778_.toInt()].toFloat(),
                        anIntArray5355[i_779_.toInt()].toFloat(),
                        aFloatArrayArray5314!![i]!![0],
                        aFloatArrayArray5314!![i]!![1],
                        aFloatArrayArray5314!![i]!![2],
                        aFloatArrayArray5345!![i]!![0],
                        aFloatArrayArray5345!![i]!![1],
                        aFloatArrayArray5345!![i]!![2],
                        i_784_,
                        i_784_,
                        i_784_,
                        (aClass167_5367!!.anInt2192),
                        i_780_,
                        i_781_,
                        i_782_,
                        aShortArray5388!![i].toInt()
                    )
                } else aClass109_5383!!.method1024(
                    anIntArray5343[i_777_.toInt()].toFloat(),
                    anIntArray5343[i_778_.toInt()].toFloat(),
                    anIntArray5343[i_779_.toInt()].toFloat(),
                    anIntArray5321[i_777_.toInt()].toFloat(),
                    anIntArray5321[i_778_.toInt()].toFloat(),
                    anIntArray5321[i_779_.toInt()].toFloat(),
                    anIntArray5355[i_777_.toInt()].toFloat(),
                    anIntArray5355[i_778_.toInt()].toFloat(),
                    anIntArray5355[i_779_.toInt()].toFloat(),
                    aFloatArrayArray5314!![i]!![0],
                    aFloatArrayArray5314!![i]!![1],
                    aFloatArrayArray5314!![i]!![2],
                    aFloatArrayArray5345!![i]!![0],
                    aFloatArrayArray5345!![i]!![1],
                    aFloatArrayArray5345!![i]!![2],
                    i_783_ or (anIntArray5368!![i] and 0xffffff),
                    i_783_ or (anIntArray5337!![i] and 0xffffff),
                    i_783_ or (anIntArray5366!![i] and 0xffffff),
                    aClass167_5367!!.anInt2192,
                    i_780_,
                    i_781_,
                    i_782_,
                    aShortArray5388!![i].toInt()
                )
            }
        } else {
            val i_768_ = aShortArray5317[i]
            val i_769_ = aShortArray5394[i]
            val i_770_ = aShortArray5364[i]
            var i_771_ = (anIntArray5355[i_768_.toInt()] - aClass167_5367!!.anInt2210)
            if (i_771_ > 255) i_771_ = 255
            else if (i_771_ < 0) i_771_ = 0
            var i_772_ = (anIntArray5355[i_769_.toInt()] - aClass167_5367!!.anInt2210)
            if (i_772_ > 255) i_772_ = 255
            else if (i_772_ < 0) i_772_ = 0
            var i_773_ = (anIntArray5355[i_770_.toInt()] - aClass167_5367!!.anInt2210)
            if (i_773_ > 255) i_773_ = 255
            else if (i_773_ < 0) i_773_ = 0
            val i_774_ = i_771_ + i_772_ + i_773_
            if (i_774_ != 765) {
                if (i_774_ == 0) method635(i)
                else {
                    if (aByteArray5325 == null) aClass109_5383!!.anInt1674 = 0
                    else aClass109_5383!!.anInt1674 = aByteArray5325!![i].toInt() and 0xff
                    if (aShortArray5388 == null || aShortArray5388!![i].toInt() == -1) {
                        if (anIntArray5366!![i] == -1) aClass109_5383!!.method1027(
                            anIntArray5343[i_768_.toInt()].toFloat(),
                            anIntArray5343[i_769_.toInt()].toFloat(),
                            anIntArray5343[i_770_.toInt()].toFloat(),
                            anIntArray5321[i_768_.toInt()].toFloat(),
                            anIntArray5321[i_769_.toInt()].toFloat(),
                            anIntArray5321[i_770_.toInt()].toFloat(),
                            anIntArray5355[i_768_.toInt()].toFloat(),
                            anIntArray5355[i_769_.toInt()].toFloat(),
                            anIntArray5355[i_770_.toInt()].toFloat(),
                            method206((Class126.anIntArray4983!![(anIntArray5368!![i] and 0xffff)]), (i_771_ shl 24 or (aClass167_5367!!.anInt2192)), 255),
                            method206((Class126.anIntArray4983!![(anIntArray5368!![i] and 0xffff)]), (i_772_ shl 24 or (aClass167_5367!!.anInt2192)), 255),
                            method206((Class126.anIntArray4983!![(anIntArray5368!![i] and 0xffff)]), (i_773_ shl 24 or (aClass167_5367!!.anInt2192)), 255)
                        )
                        else aClass109_5383!!.method1027(
                            anIntArray5343[i_768_.toInt()].toFloat(),
                            anIntArray5343[i_769_.toInt()].toFloat(),
                            anIntArray5343[i_770_.toInt()].toFloat(),
                            anIntArray5321[i_768_.toInt()].toFloat(),
                            anIntArray5321[i_769_.toInt()].toFloat(),
                            anIntArray5321[i_770_.toInt()].toFloat(),
                            anIntArray5355[i_768_.toInt()].toFloat(),
                            anIntArray5355[i_769_.toInt()].toFloat(),
                            anIntArray5355[i_770_.toInt()].toFloat(),
                            method206((Class126.anIntArray4983!![(anIntArray5368!![i] and 0xffff)]), (i_771_ shl 24 or (aClass167_5367!!.anInt2192)), 255),
                            method206((Class126.anIntArray4983!![(anIntArray5337!![i] and 0xffff)]), (i_772_ shl 24 or (aClass167_5367!!.anInt2192)), 255),
                            method206((Class126.anIntArray4983!![(anIntArray5366!![i] and 0xffff)]), (i_773_ shl 24 or (aClass167_5367!!.anInt2192)), 255)
                        )
                    } else {
                        var i_775_ = -16777216
                        if (aByteArray5325 != null) i_775_ = 255 - (aByteArray5325!![i].toInt() and 0xff) shl 24
                        if (anIntArray5366!![i] == -1) {
                            val i_776_ = i_775_ or (anIntArray5368!![i] and 0xffffff)
                            aClass109_5383!!.method1024(
                                anIntArray5343[i_768_.toInt()].toFloat(),
                                anIntArray5343[i_769_.toInt()].toFloat(),
                                anIntArray5343[i_770_.toInt()].toFloat(),
                                anIntArray5321[i_768_.toInt()].toFloat(),
                                anIntArray5321[i_769_.toInt()].toFloat(),
                                anIntArray5321[i_770_.toInt()].toFloat(),
                                anIntArray5355[i_768_.toInt()].toFloat(),
                                anIntArray5355[i_769_.toInt()].toFloat(),
                                anIntArray5355[i_770_.toInt()].toFloat(),
                                aFloatArrayArray5314!![i]!![0],
                                aFloatArrayArray5314!![i]!![1],
                                aFloatArrayArray5314!![i]!![2],
                                aFloatArrayArray5345!![i]!![0],
                                aFloatArrayArray5345!![i]!![1],
                                aFloatArrayArray5345!![i]!![2],
                                i_776_,
                                i_776_,
                                i_776_,
                                aClass167_5367!!.anInt2192,
                                i_771_,
                                i_772_,
                                i_773_,
                                aShortArray5388!![i].toInt()
                            )
                        } else aClass109_5383!!.method1024(
                            anIntArray5343[i_768_.toInt()].toFloat(),
                            anIntArray5343[i_769_.toInt()].toFloat(),
                            anIntArray5343[i_770_.toInt()].toFloat(),
                            anIntArray5321[i_768_.toInt()].toFloat(),
                            anIntArray5321[i_769_.toInt()].toFloat(),
                            anIntArray5321[i_770_.toInt()].toFloat(),
                            anIntArray5355[i_768_.toInt()].toFloat(),
                            anIntArray5355[i_769_.toInt()].toFloat(),
                            anIntArray5355[i_770_.toInt()].toFloat(),
                            aFloatArrayArray5314!![i]!![0],
                            aFloatArrayArray5314!![i]!![1],
                            aFloatArrayArray5314!![i]!![2],
                            aFloatArrayArray5345!![i]!![0],
                            aFloatArrayArray5345!![i]!![1],
                            aFloatArrayArray5345!![i]!![2],
                            i_775_ or (anIntArray5368!![i] and 0xffffff),
                            i_775_ or (anIntArray5337!![i] and 0xffffff),
                            i_775_ or (anIntArray5366!![i] and 0xffffff),
                            aClass167_5367!!.anInt2192,
                            i_771_,
                            i_772_,
                            i_773_,
                            aShortArray5388!![i].toInt()
                        )
                    }
                }
            }
        }
    }

    internal constructor(var_ha_Sub1: ha_Sub1) {
        anInt5354 = 0
        aBoolean5369 = false
        anInt5351 = 0
        aBoolean5372 = false
        aBoolean5391 = false
        anInt5387 = 0
        aBoolean5382 = false
        aHa_Sub1_5353 = var_ha_Sub1
    }

    internal constructor(var_ha_Sub1: ha_Sub1, class124: Class124, i: Int, i_785_: Int, i_786_: Int, i_787_: Int) {
        anInt5354 = 0
        aBoolean5369 = false
        anInt5351 = 0
        aBoolean5372 = false
        aBoolean5391 = false
        anInt5387 = 0
        aBoolean5382 = false
        aHa_Sub1_5353 = var_ha_Sub1
        anInt5316 = i
        anInt5344 = i_785_
        anInt5349 = i_786_
        val var_d = aHa_Sub1_5353.aD4579
        anInt5340 = class124.anInt1836
        anInt5387 = class124.anInt1821
        anIntArray5356 = class124.anIntArray1841
        anIntArray5332 = class124.anIntArray1847
        anIntArray5312 = class124.anIntArray1852
        anInt5351 = class124.anInt1817
        aShortArray5317 = class124.aShortArray1863
        aShortArray5394 = class124.aShortArray1835!!
        aShortArray5364 = class124.aShortArray1855
        aByteArray5358 = class124.aByteArray1839
        aShortArray5311 = class124.aShortArray1862
        aByteArray5325 = class124.aByteArray1834
        aShortArray5370 = class124.aShortArray1856
        aByteArray5386 = class124.aByteArray1843
        aClass129Array5322 = class124.aClass129Array1846
        aClass342Array5335 = class124.aClass342Array1866
        aShortArray5333 = class124.aShortArray1842
        val `is` = IntArray(anInt5351)
        for (i_788_ in 0..<anInt5351) `is`[i_788_] = i_788_
        val ls = LongArray(anInt5351)
        val bool = (anInt5316 and 0x100) != 0
        for (i_789_ in 0..<anInt5351) {
            val i_790_ = `is`[i_789_]
            var class12: Class12? = null
            var i_791_ = 0
            var i_792_ = 0
            var i_793_ = 0
            var i_794_ = 0
            if (class124.aClass162Array1832 != null) {
                var bool_795_ = false
                for (i_796_ in class124.aClass162Array1832!!.indices) {
                    val class162 = class124.aClass162Array1832!![i_796_]!!
                    if (i_790_ == class162.anInt2155) {
                        val class189 = Class73.method742(104, (class162.anInt2153))
                        if (class189.aBoolean2531) bool_795_ = true
                        if (class189.anInt2525 != -1) {
                            val class12_797_ = var_d!!.method3((class189.anInt2525), -6662)
                            if (class12_797_!!.anInt200 == 2) aBoolean5382 = true
                        }
                    }
                }
                if (bool_795_) ls[i_789_] = 9223372036854775807L
            }
            var i_798_ = -1
            if (class124.aShortArray1822 != null) {
                i_798_ = class124.aShortArray1822!![i_790_].toInt()
                if (i_798_ != -1) {
                    class12 = var_d!!.method3(i_798_ and 0xffff, -6662)
                    if ((i_787_ and 0x40) == 0 || !class12!!.aBoolean209) {
                        i_793_ = class12!!.aByte213.toInt()
                        i_794_ = class12.aByte202.toInt()
                    } else i_798_ = -1
                }
            }
            val bool_799_ = (aByteArray5325 != null && aByteArray5325!![i_790_].toInt() != 0 || class12 != null && class12.anInt200 == 2)
            if ((bool || bool_799_) && aByteArray5358 != null) i_791_ += aByteArray5358!![i_790_].toInt() shl 17
            if (bool_799_) i_791_ += 65536
            i_791_ += (i_793_ and 0xff) shl 8
            i_791_ += i_794_ and 0xff
            i_792_ += (i_798_ and 0xffff) shl 16
            i_792_ += i_789_ and 0xffff
            ls[i_789_] = (i_791_.toLong() shl 32) + i_792_.toLong()
            aBoolean5382 = aBoolean5382 or bool_799_
        }
        method2832(`is`, ls, 0)
        if (class124.aClass162Array1832 != null) {
            anInt5389 = class124.aClass162Array1832!!.size
            aClass6Array5361 = arrayOfNulls<Class6>(anInt5389)
            aClass350Array5363 = arrayOfNulls<Class350>(anInt5389)
            for (i_800_ in class124.aClass162Array1832!!.indices) {
                val class162 = class124.aClass162Array1832!![i_800_]!!
                val class189 = Class73.method742(104, class162.anInt2153)
                var i_801_ = ((Class126.anIntArray4983!![(class124.aShortArray1862[class162.anInt2155]).toInt() and 0xffff]) and 0xffffff)
                i_801_ = (i_801_ or (255 - (if (class124.aByteArray1834 != null) (class124.aByteArray1834!![class162.anInt2155]).toInt() and 0xff else 0) shl 24))
                aClass6Array5361!![i_800_] = Class6(class162.anInt2155, (class124.aShortArray1863[class162.anInt2155]).toInt(), (class124.aShortArray1835!![class162.anInt2155]).toInt(), (class124.aShortArray1855[class162.anInt2155]).toInt(), class189.anInt2526, class189.anInt2530, class189.anInt2525, class189.anInt2533, class189.anInt2534, class189.aBoolean2531, class162.anInt2158)
                aClass350Array5363!![i_800_] = Class350(i_801_)
            }
        }
        aFloatArrayArray5314 = arrayOfNulls<FloatArray>(anInt5351)
        aFloatArrayArray5345 = arrayOfNulls<FloatArray>(anInt5351)
        val class358 = method565(255, anInt5351, class124, `is`)!!
        val class167: Class167 = aHa_Sub1_5353.method3724(Thread.currentThread())!!
        val fs = class167.aFloatArray2226!!
        var bool_802_ = false
        for (i_803_ in 0..<anInt5351) {
            val i_804_ = `is`[i_803_]
            var i_805_: Int
            if (class124.aByteArray1820 == null) i_805_ = -1
            else i_805_ = class124.aByteArray1820!![i_804_].toInt()
            var i_806_ = (if (class124.aShortArray1822 == null) -1 else class124.aShortArray1822!![i_804_]).toInt()
            if (i_806_ != -1 && (i_787_ and 0x40) != 0) {
                val class12 = var_d!!.method3(i_806_ and 0xffff, -6662)
                if (class12!!.aBoolean209) i_806_ = -1
            }
            if (i_806_ != -1) {
                bool_802_ = true
                aFloatArrayArray5314!![i_804_] = FloatArray(3)
                val fs_807_ = aFloatArrayArray5314!![i_804_]!!
                aFloatArrayArray5345!![i_804_] = FloatArray(3)
                val fs_808_ = aFloatArrayArray5345!![i_804_]!!
                val bool_809_ = false
                if (i_805_ == -1) {
                    fs_807_[0] = 0.0f
                    fs_808_[0] = 1.0f
                    fs_807_[1] = 1.0f
                    fs_808_[1] = 1.0f
                    fs_807_[2] = 0.0f
                    fs_808_[2] = 0.0f
                } else {
                    i_805_ = i_805_ and 0xff
                    val i_810_ = class124.aByteArray1823[i_805_]
                    if (i_810_.toInt() == 0) {
                        val i_811_ = aShortArray5317[i_804_]
                        val i_812_ = aShortArray5394[i_804_]
                        val i_813_ = aShortArray5364[i_804_]
                        val i_814_ = class124.aShortArray1829[i_805_]
                        val i_815_ = class124.aShortArray1849[i_805_]
                        val i_816_ = class124.aShortArray1825[i_805_]
                        val f = anIntArray5356!![i_814_.toInt()].toFloat()
                        val f_817_ = anIntArray5332!![i_814_.toInt()].toFloat()
                        val f_818_ = anIntArray5312!![i_814_.toInt()].toFloat()
                        val f_819_ = anIntArray5356!![i_815_.toInt()].toFloat() - f
                        val f_820_ = anIntArray5332!![i_815_.toInt()].toFloat() - f_817_
                        val f_821_ = anIntArray5312!![i_815_.toInt()].toFloat() - f_818_
                        val f_822_ = anIntArray5356!![i_816_.toInt()].toFloat() - f
                        val f_823_ = anIntArray5332!![i_816_.toInt()].toFloat() - f_817_
                        val f_824_ = anIntArray5312!![i_816_.toInt()].toFloat() - f_818_
                        val f_825_ = anIntArray5356!![i_811_.toInt()].toFloat() - f
                        val f_826_ = anIntArray5332!![i_811_.toInt()].toFloat() - f_817_
                        val f_827_ = anIntArray5312!![i_811_.toInt()].toFloat() - f_818_
                        val f_828_ = anIntArray5356!![i_812_.toInt()].toFloat() - f
                        val f_829_ = anIntArray5332!![i_812_.toInt()].toFloat() - f_817_
                        val f_830_ = anIntArray5312!![i_812_.toInt()].toFloat() - f_818_
                        val f_831_ = anIntArray5356!![i_813_.toInt()].toFloat() - f
                        val f_832_ = anIntArray5332!![i_813_.toInt()].toFloat() - f_817_
                        val f_833_ = anIntArray5312!![i_813_.toInt()].toFloat() - f_818_
                        val f_834_ = f_820_ * f_824_ - f_821_ * f_823_
                        val f_835_ = f_821_ * f_822_ - f_819_ * f_824_
                        val f_836_ = f_819_ * f_823_ - f_820_ * f_822_
                        var f_837_ = f_823_ * f_836_ - f_824_ * f_835_
                        var f_838_ = f_824_ * f_834_ - f_822_ * f_836_
                        var f_839_ = f_822_ * f_835_ - f_823_ * f_834_
                        var f_840_ = 1.0f / (f_837_ * f_819_ + f_838_ * f_820_ + f_839_ * f_821_)
                        fs_807_[0] = (f_837_ * f_825_ + f_838_ * f_826_ + f_839_ * f_827_) * f_840_
                        fs_807_[1] = (f_837_ * f_828_ + f_838_ * f_829_ + f_839_ * f_830_) * f_840_
                        fs_807_[2] = (f_837_ * f_831_ + f_838_ * f_832_ + f_839_ * f_833_) * f_840_
                        f_837_ = f_820_ * f_836_ - f_821_ * f_835_
                        f_838_ = f_821_ * f_834_ - f_819_ * f_836_
                        f_839_ = f_819_ * f_835_ - f_820_ * f_834_
                        f_840_ = 1.0f / (f_837_ * f_822_ + f_838_ * f_823_ + f_839_ * f_824_)
                        fs_808_[0] = (f_837_ * f_825_ + f_838_ * f_826_ + f_839_ * f_827_) * f_840_
                        fs_808_[1] = (f_837_ * f_828_ + f_838_ * f_829_ + f_839_ * f_830_) * f_840_
                        fs_808_[2] = (f_837_ * f_831_ + f_838_ * f_832_ + f_839_ * f_833_) * f_840_
                    } else {
                        val i_841_ = aShortArray5317[i_804_]
                        val i_842_ = aShortArray5394[i_804_]
                        val i_843_ = aShortArray5364[i_804_]
                        val i_844_ = class358.anIntArray4416!![i_805_]
                        val i_845_ = class358.anIntArray4415!![i_805_]
                        val i_846_ = class358.anIntArray4414!![i_805_]
                        val fs_847_ = (class358.aFloatArrayArray4412!![i_805_])!!
                        val i_848_ = class124.aByteArray1853[i_805_]
                        val f = ((class124.anIntArray1867[i_805_]).toFloat() / 256.0f)
                        if (i_810_.toInt() == 1) {
                            val f_849_ = ((class124.anIntArray1844[i_805_]).toFloat() / 1024.0f)
                            method1885(i_846_, anIntArray5312!![i_841_.toInt()], i_848_.toInt(), 8, anIntArray5356!![i_841_.toInt()], fs, anIntArray5332!![i_841_.toInt()], f, i_845_, i_844_, f_849_, fs_847_)
                            fs_807_[0] = fs[0]
                            fs_808_[0] = fs[1]
                            method1885(i_846_, anIntArray5312!![i_842_.toInt()], i_848_.toInt(), 8, anIntArray5356!![i_842_.toInt()], fs, anIntArray5332!![i_842_.toInt()], f, i_845_, i_844_, f_849_, fs_847_)
                            fs_807_[1] = fs[0]
                            fs_808_[1] = fs[1]
                            method1885(i_846_, anIntArray5312!![i_843_.toInt()], i_848_.toInt(), 8, anIntArray5356!![i_843_.toInt()], fs, anIntArray5332!![i_843_.toInt()], f, i_845_, i_844_, f_849_, fs_847_)
                            fs_807_[2] = fs[0]
                            fs_808_[2] = fs[1]
                            val f_850_ = f_849_ / 2.0f
                            if ((i_848_.toInt() and 0x1) == 0) {
                                if (fs_807_[1] - fs_807_[0] > f_850_) fs_807_[1] -= f_849_
                                else if (fs_807_[0] - fs_807_[1] > f_850_) fs_807_[1] += f_849_
                                if (fs_807_[2] - fs_807_[0] > f_850_) fs_807_[2] -= f_849_
                                else if (fs_807_[0] - fs_807_[2] > f_850_) fs_807_[2] += f_849_
                            } else {
                                if (fs_808_[1] - fs_808_[0] > f_850_) fs_808_[1] -= f_849_
                                else if (fs_808_[0] - fs_808_[1] > f_850_) fs_808_[1] += f_849_
                                if (fs_808_[2] - fs_808_[0] > f_850_) fs_808_[2] -= f_849_
                                else if (fs_808_[0] - fs_808_[2] > f_850_) fs_808_[2] += f_849_
                            }
                        } else if (i_810_.toInt() == 2) {
                            val f_851_ = ((class124.anIntArray1857[i_805_]).toFloat() / 256.0f)
                            val f_852_ = ((class124.anIntArray1865[i_805_]).toFloat() / 256.0f)
                            val i_853_ = (anIntArray5356!![i_842_.toInt()] - anIntArray5356!![i_841_.toInt()])
                            val i_854_ = (anIntArray5332!![i_842_.toInt()] - anIntArray5332!![i_841_.toInt()])
                            val i_855_ = (anIntArray5312!![i_842_.toInt()] - anIntArray5312!![i_841_.toInt()])
                            val i_856_ = (anIntArray5356!![i_843_.toInt()] - anIntArray5356!![i_841_.toInt()])
                            val i_857_ = (anIntArray5332!![i_843_.toInt()] - anIntArray5332!![i_841_.toInt()])
                            val i_858_ = (anIntArray5312!![i_843_.toInt()] - anIntArray5312!![i_841_.toInt()])
                            val i_859_ = i_854_ * i_858_ - i_857_ * i_855_
                            val i_860_ = i_855_ * i_856_ - i_858_ * i_853_
                            val i_861_ = i_853_ * i_857_ - i_856_ * i_854_
                            val f_862_ = 64.0f / (class124.anIntArray1859!![i_805_]).toFloat()
                            val f_863_ = 64.0f / (class124.anIntArray1816[i_805_]).toFloat()
                            val f_864_ = 64.0f / (class124.anIntArray1844[i_805_]).toFloat()
                            val f_865_ = ((i_859_.toFloat() * fs_847_[0] + i_860_.toFloat() * fs_847_[1] + i_861_.toFloat() * fs_847_[2]) / f_862_)
                            val f_866_ = ((i_859_.toFloat() * fs_847_[3] + i_860_.toFloat() * fs_847_[4] + i_861_.toFloat() * fs_847_[5]) / f_863_)
                            val f_867_ = ((i_859_.toFloat() * fs_847_[6] + i_860_.toFloat() * fs_847_[7] + i_861_.toFloat() * fs_847_[8]) / f_864_)
                            val i_868_ = Class331.method2635(f_866_, false, f_867_, f_865_)
                            Class262.method1991(f_852_, f, fs_847_, anIntArray5312!![i_841_.toInt()], i_846_, false, i_848_.toInt(), i_844_, anIntArray5356!![i_841_.toInt()], anIntArray5332!![i_841_.toInt()], f_851_, fs, i_845_, i_868_)
                            fs_807_[0] = fs[0]
                            fs_808_[0] = fs[1]
                            Class262.method1991(f_852_, f, fs_847_, anIntArray5312!![i_842_.toInt()], i_846_, false, i_848_.toInt(), i_844_, anIntArray5356!![i_842_.toInt()], anIntArray5332!![i_842_.toInt()], f_851_, fs, i_845_, i_868_)
                            fs_807_[1] = fs[0]
                            fs_808_[1] = fs[1]
                            Class262.method1991(f_852_, f, fs_847_, anIntArray5312!![i_843_.toInt()], i_846_, false, i_848_.toInt(), i_844_, anIntArray5356!![i_843_.toInt()], anIntArray5332!![i_843_.toInt()], f_851_, fs, i_845_, i_868_)
                            fs_807_[2] = fs[0]
                            fs_808_[2] = fs[1]
                        } else if (i_810_.toInt() == 3) {
                            Class181.method1367(i_846_, i_848_.toInt(), f, anIntArray5356!![i_841_.toInt()], fs, anIntArray5312!![i_841_.toInt()], i_844_, anIntArray5332!![i_841_.toInt()], i_845_, -4, fs_847_)
                            fs_807_[0] = fs[0]
                            fs_808_[0] = fs[1]
                            Class181.method1367(i_846_, i_848_.toInt(), f, anIntArray5356!![i_842_.toInt()], fs, anIntArray5312!![i_842_.toInt()], i_844_, anIntArray5332!![i_842_.toInt()], i_845_, -4, fs_847_)
                            fs_807_[1] = fs[0]
                            fs_808_[1] = fs[1]
                            Class181.method1367(i_846_, i_848_.toInt(), f, anIntArray5356!![i_843_.toInt()], fs, anIntArray5312!![i_843_.toInt()], i_844_, anIntArray5332!![i_843_.toInt()], i_845_, -4, fs_847_)
                            fs_807_[2] = fs[0]
                            fs_808_[2] = fs[1]
                            if ((i_848_.toInt() and 0x1) == 0) {
                                if (fs_807_[1] - fs_807_[0] > 0.5f) fs_807_[1]--
                                else if (fs_807_[0] - fs_807_[1] > 0.5f) fs_807_[1]++
                                if (fs_807_[2] - fs_807_[0] > 0.5f) fs_807_[2]--
                                else if (fs_807_[0] - fs_807_[2] > 0.5f) fs_807_[2]++
                            } else {
                                if (fs_808_[1] - fs_808_[0] > 0.5f) fs_808_[1]--
                                else if (fs_808_[0] - fs_808_[1] > 0.5f) fs_808_[1]++
                                if (fs_808_[2] - fs_808_[0] > 0.5f) fs_808_[2]--
                                else if (fs_808_[0] - fs_808_[2] > 0.5f) fs_808_[2]++
                            }
                        }
                    }
                }
            }
        }
        if (!bool_802_) {
            aFloatArrayArray5345 = null
            aFloatArrayArray5314 = aFloatArrayArray5345
        }
        if (class124.anIntArray1868 != null && (anInt5316 and 0x20) != 0) anIntArrayArray5334 = class124.method1100(true, -122)
        if (class124.anIntArray1824 != null && (anInt5316 and 0x180) != 0) anIntArrayArray5330 = class124.method1094(30.toByte())
        if (class124.aClass162Array1832 != null && (anInt5316 and 0x400) != 0) anIntArrayArray5379 = class124.method1093((-75).toByte())
        if (class124.aShortArray1822 != null) {
            aShortArray5388 = ShortArray(anInt5351)
            var bool_869_ = false
            for (i_870_ in 0..<anInt5351) {
                val i_871_ = class124.aShortArray1822!![i_870_]
                if (i_871_.toInt() != -1) {
                    val class12 = aHa_Sub1_5353.aD4579!!.method3(i_871_.toInt(), -6662)
                    if ((i_787_ and 0x40) == 0 || !class12!!.aBoolean209) {
                        aShortArray5388!![i_870_] = i_871_
                        bool_869_ = true
                        if (class12!!.anInt200 == 2) aBoolean5382 = true
                        if (class12.aByte198.toInt() != 0 || class12.aByte211.toInt() != 0) aBoolean5391 = true
                    } else aShortArray5388!![i_870_] = (-1).toShort()
                } else aShortArray5388!![i_870_] = (-1).toShort()
            }
            if (!bool_869_) aShortArray5388 = null
        } else aShortArray5388 = null
        if (aBoolean5382 || aClass6Array5361 != null) {
            aShortArray5327 = ShortArray(anInt5351)
            for (i_872_ in 0..<anInt5351) aShortArray5327!![i_872_] = `is`[i_872_].toShort()
        }
    }

    companion object {
        private var anInt5341: Int
        @JvmField
        var anInt5346: Int = 4096
        @JvmField
        var anInt5350: Int

        init {
            anInt5341 = 0
            anInt5350 = 4096
        }
    }
}
