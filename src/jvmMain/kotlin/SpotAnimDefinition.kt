import kotlin.math.asin
import kotlin.math.atan2
import kotlin.math.sqrt
import SpotAnimDefinitionStatics.anInt2378
import SpotAnimDefinitionStatics.anInt2396
import SpotAnimDefinitionStatics.anInt2400
import SpotAnimDefinitionStatics.method1369

/* Class181 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpotAnimDefinition {
    @JvmField
    var anInt2373: Int = 0
    private var anInt2375 = 100
    @JvmField
    var aBoolean2376: Boolean = true
    @JvmField
    var anInt2377: Int = 0
    @JvmField
    var anInt2379: Int = 0
    @JvmField
    var anIntArray2380: IntArray = intArrayOf()
    @JvmField
    var anInt2381: Int = 0
    @JvmField
    var aBoolean2382: Boolean = false
    @JvmField
    var anInt2383: Int = 0
    @JvmField
    var anInt2384: Int
    @JvmField
    var anIntArray2385: IntArray? = null
    @JvmField
    var anInt2386: Int = 0
    @JvmField
    var anInt2387: Int = -1
    @JvmField
    var anInt2388: Int = 0
    @JvmField
    var anInt2389: Int = 0
    @JvmField
    var anInt2390: Int = 0
    @JvmField
    var anInt2391: Int = 0
    @JvmField
    var anInt2392: Int = 0
    @JvmField
    var anInt2393: Int
    @JvmField
    var anInt2394: Int = 0
    @JvmField
    var anIntArray2395: IntArray = intArrayOf()
    @JvmField
    var aBoolean2397: Boolean = false
    @JvmField
    var anInt2399: Int = 0
    private var anInt2401 = 100
    @JvmField
    var anIntArray2402: IntArray = intArrayOf()
    @JvmField
    var anInt2403: Int = 0
    @JvmField
    var anInt2404: Int = -1
    @JvmField
    var anInt2405: Int = 0
    @JvmField
    var aBoolean2406: Boolean = true
    @JvmField
    var anInt2407: Int = 0
    @JvmField
    var anInt2408: Int = 0
    @JvmField
    var anInt2410: Int = 0
    @JvmField
    var aBoolean2411: Boolean = true
    private var anInt2412 = 0
    @JvmField
    var anInt2413: Int = 0
    @JvmField
    var anInt2414: Int
    @JvmField
    var aShort2415: Short = 0
    @JvmField
    var anInt2416: Int = 0
    @JvmField
    var anInt2417: Int = 0
    @JvmField
    var aShort2418: Short = 0
    private var anInt2419 = 0
    private var anInt2420 = 0
    @JvmField
    var anInt2421: Int = 0
    @JvmField
    var anInt2422: Int = 0
    @JvmField
    var anInt2423: Int
    @JvmField
    var aBoolean2424: Boolean = false
    @JvmField
    var anInt2425: Int
    @JvmField
    var anInt2426: Int = 0
    @JvmField
    var anInt2427: Int
    private var anInt2428 = 0
    @JvmField
    var anInt2429: Int = 0
    @JvmField
    var aBoolean2430: Boolean = true
    @JvmField
    var aShort2431: Short = 0
    private var anInt2432 = 100
    @JvmField
    var anInt2433: Int = 0
    private var anInt2434 = 0
    @JvmField
    var aBoolean2435: Boolean = true
    @JvmField
    var anInt2436: Int = 0
    @JvmField
    var anInt2437: Int = 0
    @JvmField
    var anInt2438: Int = 0
    @JvmField
    var anInt2439: Int = 0
    private var anInt2440 = 100
    @JvmField
    var aShort2441: Short = 0
    @JvmField
    var anInt2442: Int = 0
    @JvmField
    var aBoolean2443: Boolean = true
    private var anInt2444 = 0

    private fun method1368(i: Int, class348_sub49: ByteBuffer, i_16_: Int) {
        if (i >= -43) method1369((-111).toByte())
        anInt2396++
        if (i_16_ == 1) {
            this.aShort2431 = class348_sub49.readUnsignedShort(842397944).toShort()
            this.aShort2415 = class348_sub49.readUnsignedShort(842397944).toShort()
            this.aShort2418 = class348_sub49.readUnsignedShort(842397944).toShort()
            this.aShort2441 = class348_sub49.readUnsignedShort(842397944).toShort()
            val i_23_ = 3
            this.aShort2431 = (this.aShort2431.toInt() shl i_23_).toShort()
            this.aShort2418 = (this.aShort2418.toInt() shl i_23_).toShort()
            this.aShort2441 = (this.aShort2441.toInt() shl i_23_).toShort()
            this.aShort2415 = (this.aShort2415.toInt() shl i_23_).toShort()
        } else if (i_16_ == 2) class348_sub49.readUnsignedByte(255)
        else if (i_16_ == 3) {
            this.anInt2392 = class348_sub49.readInt((-126).toByte())
            this.anInt2438 = class348_sub49.readInt((-126).toByte())
        } else if (i_16_ == 4) {
            this.anInt2436 = class348_sub49.readUnsignedByte(255)
            this.anInt2437 = class348_sub49.readByte(-115).toInt()
        } else if (i_16_ != 5) {
            if (i_16_ == 6) {
                anInt2428 = class348_sub49.readInt((-126).toByte())
                anInt2434 = class348_sub49.readInt((-126).toByte())
            } else if (i_16_ == 7) {
                this.anInt2394 = class348_sub49.readUnsignedShort(842397944)
                this.anInt2407 = class348_sub49.readUnsignedShort(842397944)
            } else if (i_16_ == 8) {
                this.anInt2391 = class348_sub49.readUnsignedShort(842397944)
                this.anInt2389 = class348_sub49.readUnsignedShort(842397944)
            } else if (i_16_ == 9) {
                val i_21_ = class348_sub49.readUnsignedByte(255)
                this.anIntArray2402 = IntArray(i_21_)
                for (i_22_ in 0..<i_21_) this.anIntArray2402[i_22_] = class348_sub49.readUnsignedShort(842397944)
            } else if (i_16_ == 10) {
                val i_19_ = class348_sub49.readUnsignedByte(255)
                this.anIntArray2395 = IntArray(i_19_)
                var i_20_ = 0
                while ((i_20_ < i_19_)) {
                    this.anIntArray2395[i_20_] = class348_sub49.readUnsignedShort(842397944)
                    i_20_++
                }
            } else if (i_16_ == 12) this.anInt2384 = class348_sub49.readByte(-112).toInt()
            else if (i_16_ != 13) {
                if (i_16_ == 14) this.anInt2422 = class348_sub49.readUnsignedShort(842397944)
                else if (i_16_ != 15) {
                    if (i_16_ == 16) {
                        this.aBoolean2406 = class348_sub49.readUnsignedByte(255) == 1
                        this.anInt2393 = class348_sub49.readUnsignedShort(842397944)
                        this.anInt2425 = class348_sub49.readUnsignedShort(842397944)
                        this.aBoolean2411 = class348_sub49.readUnsignedByte(255) == 1
                    } else if (i_16_ == 17) this.anInt2387 = class348_sub49.readUnsignedShort(842397944)
                    else if (i_16_ == 18) this.anInt2386 = class348_sub49.readInt((-126).toByte())
                    else if (i_16_ != 19) {
                        if (i_16_ == 20) anInt2375 = class348_sub49.readUnsignedByte(255)
                        else if (i_16_ != 21) {
                            if (i_16_ == 22) this.anInt2404 = (class348_sub49.readInt((-126).toByte()))
                            else if (i_16_ != 23) {
                                if (i_16_ != 24) {
                                    if (i_16_ == 25) {
                                        val i_17_ = (class348_sub49.readUnsignedByte(255))
                                        this.anIntArray2380 = (IntArray(i_17_))
                                        var i_18_ = 0
                                        while (i_17_ > i_18_) {
                                            this.anIntArray2380[i_18_] = (class348_sub49.readUnsignedShort(842397944))
                                            i_18_++
                                        }
                                    } else if (i_16_ != 26) {
                                        if (i_16_ == 27) this.anInt2427 = ((class348_sub49.readUnsignedShort(842397944)) shl -755800980 shl 80752930)
                                        else if (i_16_ == 28) anInt2432 = (class348_sub49.readUnsignedByte(255))
                                        else if (i_16_ != 29) {
                                            if (i_16_ != 30) {
                                                if (i_16_ == 31) {
                                                    this.anInt2442 = class348_sub49.readUnsignedShort(842397944) shl 2097170348 shl -1512556382
                                                    this.anInt2417 = class348_sub49.readUnsignedShort(842397944) shl -355565332 shl -2060812222
                                                } else if (i_16_ != 32) {
                                                    if (i_16_ != 33) {
                                                        if (i_16_ == 34) this.aBoolean2376 = false
                                                    } else this.aBoolean2424 = true
                                                } else this.aBoolean2430 = false
                                            } else this.aBoolean2382 = true
                                        } else class348_sub49.readShort(13638)
                                    } else this.aBoolean2435 = false
                                } else this.aBoolean2443 = false
                            } else anInt2401 = class348_sub49.readUnsignedByte(255)
                        } else anInt2440 = class348_sub49.readUnsignedByte(255)
                    } else this.anInt2379 = class348_sub49.readUnsignedByte(255)
                } else this.anInt2414 = class348_sub49.readUnsignedShort(842397944)
            } else this.anInt2423 = class348_sub49.readByte(-124).toInt()
        } else {
            this.anInt2417 = (class348_sub49.readUnsignedShort(842397944) shl -374037204 shl 1009462498)
            this.anInt2442 = this.anInt2417
        }
    }

    fun method1370(i: Int, class348_sub49: ByteBuffer) {
        anInt2400++
        while (true) {
            val i_24_ = class348_sub49.readUnsignedByte(255)
            if (i_24_ == 0) break
            method1368(-75, class348_sub49, i_24_)
        }
        val i_25_ = 117 / ((i - -51) / 43)
    }

    fun method1371(i: Int) {
        this.anInt2429 = (0xff8084 and anInt2428) shr 16
        anInt2420 = anInt2434 shr 16 and 0xff
        if (this.anInt2384 > -2 || this.anInt2423 > -2) this.aBoolean2397 = true
        anInt2378++
        anInt2419 = anInt2434 shr 8 and 0xff
        this.anInt2390 = 0xff and (anInt2428 shr 8)
        this.anInt2433 = -this.anInt2429 + anInt2420
        anInt2412 = 0xff and anInt2434
        this.anInt2399 = anInt2428 and 0xff
        this.anInt2403 = anInt2419 - this.anInt2390
        if (i != 4) this.aBoolean2376 = false
        this.anInt2413 = anInt2428 shr 24 and 0xff
        this.anInt2408 = anInt2412 - this.anInt2399
        anInt2444 = 0xff and (anInt2434 shr 24)
        this.anInt2410 = -this.anInt2413 + anInt2444
        if (this.anInt2427 != -1) {
            this.anInt2388 = this.anInt2407 * anInt2432 / 100
            if (this.anInt2388 == 0) this.anInt2388 = 1
            this.anInt2439 = ((this.anInt2427 + -((this.anInt2417 - this.anInt2442) / 2) + -this.anInt2442) / this.anInt2388)
        }
        if (this.anInt2386 != 0) {
            this.anInt2381 = this.anInt2407 * anInt2440 / 100
            this.anInt2373 = anInt2375 * this.anInt2407 / 100
            if (this.anInt2373 == 0) this.anInt2373 = 1
            this.anInt2426 = ((((this.anInt2386 and 0xff61a1) shr 16) + (-this.anInt2429 - this.anInt2433 / 2)) shl 8) / this.anInt2373
            this.anInt2405 = (((0xff and this.anInt2386) - (this.anInt2399 - -(this.anInt2408 / 2))) shl 8) / this.anInt2373
            if (this.anInt2381 == 0) this.anInt2381 = 1
            this.anInt2421 = ((-(this.anInt2403 / 2) + -this.anInt2390 + ((this.anInt2386 and 0xff16) shr 8)) shl 8) / this.anInt2373
            val class181_26_ = this
            class181_26_.anInt2426 = (class181_26_.anInt2426 + (if (this.anInt2426 > 0) -4 else 4))
            val class181_27_ = this
            class181_27_.anInt2405 = (class181_27_.anInt2405 + (if (this.anInt2405 <= 0) 4 else -4))
            this.anInt2416 = (((this.anInt2386 shr 24 and 0xff) - this.anInt2410 / 2 - this.anInt2413) shl 8) / this.anInt2381
            val class181_28_ = this
            class181_28_.anInt2421 = (class181_28_.anInt2421 + (if (this.anInt2421 > 0) -4 else 4))
            val class181_29_ = this
            class181_29_.anInt2416 = (class181_29_.anInt2416 + (if (this.anInt2416 <= 0) 4 else -4))
        }
        if (this.anInt2404 != -1) {
            this.anInt2383 = anInt2401 * this.anInt2407 / 100
            if (this.anInt2383 == 0) this.anInt2383 = 1
            this.anInt2377 = ((-this.anInt2392 + (-((this.anInt2438 + -this.anInt2392) / 2) + this.anInt2404)) / this.anInt2383)
        }
    }

    init {
        this.anInt2384 = -2
        this.anInt2393 = -1
        this.anInt2423 = -2
        this.anInt2427 = -1
        this.anInt2425 = -1
        this.anInt2414 = -1
    }
}
