import CompositeRgbNoiseTextureStatics.method573
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt
import SizeBoundedSoftCacheStatics.anInt2310
import SizeBoundedSoftCacheStatics.anInt2313
import SizeBoundedSoftCacheStatics.anInt2314
import SizeBoundedSoftCacheStatics.anInt2317
import SizeBoundedSoftCacheStatics.anInt2318
import SizeBoundedSoftCacheStatics.anInt2319
import SizeBoundedSoftCacheStatics.anInt2320
import SizeBoundedSoftCacheStatics.anInt2321
import SizeBoundedSoftCacheStatics.anInt2322
import SizeBoundedSoftCacheStatics.anInt2325
import SizeBoundedSoftCacheStatics.aBooleanArray2326

/* Class175 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SizeBoundedSoftCache internal constructor(private var anInt2311: Int) {
    private val aHashtable_2312: Hashtable
    private var aLinkedNodeListIterator_2316: LinkedNodeListIterator? = LinkedNodeListIterator()
    private val anInt2324: Int
    private fun method1338(i: Int, keyedComparable: KeyedComparable) {
        anInt2321++
        val l = keyedComparable.method52(117.toByte())
        var class348_sub42_sub9 = aHashtable_2312.method3480(l, -6008) as KeyedCacheEntryReference?
        while (class348_sub42_sub9 != null) {
            if (class348_sub42_sub9.anKeyedComparable_9559!!.method53(78, keyedComparable)) {
                method1342(class348_sub42_sub9, 79.toByte())
                break
            }
            class348_sub42_sub9 = aHashtable_2312.method3476(true) as KeyedCacheEntryReference?
        }
    }

    fun method1339(i: Int): Int {
        if (i != 100) return -3
        anInt2310++
        return anInt2324
    }

    fun method1340(i: Int, keyedComparable: KeyedComparable): Any? {
        anInt2313++
        val l = keyedComparable.method52(64.toByte())
        var class348_sub42_sub9 = aHashtable_2312.method3480(l, -6008) as KeyedCacheEntryReference?
        while (class348_sub42_sub9 != null) {
            if (class348_sub42_sub9.anKeyedComparable_9559!!.method53(94, keyedComparable)) {
                val `object` = class348_sub42_sub9.method3205(65536)
                if (`object` == null) {
                    class348_sub42_sub9.method2715(36.toByte())
                    class348_sub42_sub9.method3162(true)
                    anInt2311 += (class348_sub42_sub9.anInt9556)
                } else {
                    if (class348_sub42_sub9.method3206((-128).toByte())) {
                        val class348_sub42_sub9_sub1 = (HardKeyedCacheEntryReference(keyedComparable, `object`, (class348_sub42_sub9.anInt9556)))
                        aHashtable_2312.method3483(125.toByte(), (class348_sub42_sub9.aLong4291), class348_sub42_sub9_sub1)
                        aLinkedNodeListIterator_2316!!.method1005(true, class348_sub42_sub9_sub1)
                        class348_sub42_sub9_sub1.aLong7057 = 0L
                        class348_sub42_sub9.method2715(65.toByte())
                        class348_sub42_sub9.method3162(true)
                    } else {
                        aLinkedNodeListIterator_2316!!.method1005(true, class348_sub42_sub9)
                        class348_sub42_sub9.aLong7057 = 0L
                    }
                    return `object`
                }
            }
            class348_sub42_sub9 = aHashtable_2312.method3476(true) as KeyedCacheEntryReference?
        }
        if (i < 66) return null
        return null
    }

    private fun method1341(`object`: Any?, keyedComparable: KeyedComparable?, i: Int, i_0_: Int) {
        try {
            if (i < -84) {
                anInt2314++
                check(anInt2324 >= i_0_) { "s>cs" }
                method1338(7, keyedComparable!!)
                anInt2311 -= i_0_
                while (anInt2311 < 0) {
                    val class348_sub42_sub9 = aLinkedNodeListIterator_2316!!.method1008(20) as KeyedCacheEntryReference?
                    method1342(class348_sub42_sub9, 60.toByte())
                }
                val class348_sub42_sub9_sub1 = HardKeyedCacheEntryReference(keyedComparable, `object`, i_0_)
                aHashtable_2312.method3483(120.toByte(), keyedComparable.method52(120.toByte()), class348_sub42_sub9_sub1)
                aLinkedNodeListIterator_2316!!.method1005(true, class348_sub42_sub9_sub1)
                class348_sub42_sub9_sub1.aLong7057 = 0L
            }
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("pq.L(" + (if (`object` != null) "{...}" else "null") + ',' + (if (keyedComparable != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ')'))
        }
    }

    private fun method1342(class348_sub42_sub9: KeyedCacheEntryReference?, i: Byte) {
        anInt2317++
        if (i < 51) method1341(null, null, -110, 119)
        if (class348_sub42_sub9 != null) {
            class348_sub42_sub9.method2715(42.toByte())
            class348_sub42_sub9.method3162(true)
            anInt2311 += class348_sub42_sub9.anInt9556
        }
    }

    fun method1344(i: Byte) {
        anInt2319++
        var class348_sub42_sub9 = aLinkedNodeListIterator_2316!!.method1011(-87) as KeyedCacheEntryReference?
        while (class348_sub42_sub9 != null) {
            if (class348_sub42_sub9.method3206(5.toByte())) {
                class348_sub42_sub9.method2715(127.toByte())
                class348_sub42_sub9.method3162(true)
                anInt2311 += class348_sub42_sub9.anInt9556
            }
            class348_sub42_sub9 = (aLinkedNodeListIterator_2316!!.method1003(69.toByte()) as KeyedCacheEntryReference?)
        }
        if (i > -34) aBooleanArray2326 = null
    }

    fun method1345(i: Byte) {
        aLinkedNodeListIterator_2316!!.method1009(2110355138)
        anInt2325++
        aHashtable_2312.method3481(0)
        val i_3_ = 18 % ((i - -89) / 35)
        anInt2311 = anInt2324
    }

    fun method1346(i: Int, i_4_: Int) {
        anInt2322++
        if (MinimapDrawController.aParticleProcessor_1607 != null) {
            var class348_sub42_sub9 = aLinkedNodeListIterator_2316!!.method1011(-72) as KeyedCacheEntryReference?
            while (class348_sub42_sub9 != null) {
                if (class348_sub42_sub9.method3206((-124).toByte())) {
                    if (class348_sub42_sub9.method3205(i + 67027) == null) {
                        class348_sub42_sub9.method2715(103.toByte())
                        class348_sub42_sub9.method3162(true)
                        anInt2311 += (class348_sub42_sub9.anInt9556)
                    }
                } else if (++class348_sub42_sub9.aLong7057 > i_4_.toLong()) {
                    val class348_sub42_sub9_5_ = MinimapDrawController.aParticleProcessor_1607!!.method2694(-1, class348_sub42_sub9)
                    aHashtable_2312.method3483(120.toByte(), (class348_sub42_sub9.aLong4291), class348_sub42_sub9_5_)
                    method573(class348_sub42_sub9_5_, class348_sub42_sub9, 63.toByte())
                    class348_sub42_sub9.method2715(70.toByte())
                    class348_sub42_sub9.method3162(true)
                }
                class348_sub42_sub9 = (aLinkedNodeListIterator_2316!!.method1003(59.toByte()) as KeyedCacheEntryReference?)
            }
        }
        if (i != -1491) method1342(null, 51.toByte())
    }

    fun method1348(i: Int, `object`: Any?, keyedComparable: KeyedComparable?) {
        do {
            try {
                anInt2318++
                method1341(`object`, keyedComparable, -114, 1)
                if (i > 62) break
                aLinkedNodeListIterator_2316 = null
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("pq.K(" + i + ',' + (if (`object` != null) "{...}" else "null") + ',' + (if (keyedComparable != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    fun method1350(i: Byte): Int {
        val i_21_ = -9 % ((73 - i) / 53)
        anInt2320++
        return anInt2311
    }

    init {
        anInt2324 = anInt2311
        var i_22_: Int
        i_22_ = 1
        while (i_22_ + i_22_ < anInt2311) {
            i_22_ += i_22_
        }
        aHashtable_2312 = Hashtable(i_22_)
    }
}
