import CompositeRgbNoiseTexture.Companion.method573

/* Class60 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LruByteCache @JvmOverloads internal constructor(private var anInt1086: Int, i_10_: Int = anInt1086) {
    private val anInt1084: Int
    private var aLinkedNodeListIterator_1089: LinkedNodeListIterator? = LinkedNodeListIterator()
    private val aHashtable_1100: Hashtable
    fun method575(i: Int): Int {
        anInt1101++
        var i_0_ = i
        var class348_sub42_sub8 = aLinkedNodeListIterator_1089!!.method1011(-84) as CacheEntryReference?
        while (class348_sub42_sub8 != null) {
            if (!class348_sub42_sub8.method3195(-4)) i_0_++
            class348_sub42_sub8 = (aLinkedNodeListIterator_1089!!.method1003(79.toByte()) as CacheEntryReference?)
        }
        return i_0_
    }

    fun method577(i: Int): Int {
        if (i != -4) method577(19)
        anInt1097++
        return anInt1084
    }

    fun method578(i: Int, i_2_: Int) {
        if (i == 2) {
            anInt1093++
            if (MatrixCameraTransform.aParticleEmitterFactory_5675 != null) {
                var class348_sub42_sub8 = (aLinkedNodeListIterator_1089!!.method1011(-59) as CacheEntryReference?)
                while (class348_sub42_sub8 != null) {
                    if (!class348_sub42_sub8.method3195(-4)) {
                        if (i_2_.toLong() < ++class348_sub42_sub8.aLong7057) {
                            val class348_sub42_sub8_3_ = MatrixCameraTransform.aParticleEmitterFactory_5675!!.method1888(3, class348_sub42_sub8)
                            aHashtable_1100.method3483(86.toByte(), (class348_sub42_sub8.aLong4291), class348_sub42_sub8_3_)
                            method573(class348_sub42_sub8_3_, class348_sub42_sub8, 63.toByte())
                            class348_sub42_sub8.method2715(116.toByte())
                            class348_sub42_sub8.method3162(true)
                        }
                    } else if (class348_sub42_sub8.method3193(100) == null) {
                        class348_sub42_sub8.method2715(60.toByte())
                        class348_sub42_sub8.method3162(true)
                        anInt1086 += (class348_sub42_sub8.anInt9545)
                    }
                    class348_sub42_sub8 = (aLinkedNodeListIterator_1089!!.method1003(97.toByte()) as CacheEntryReference?)
                }
            }
        }
    }

    fun method579(i: Int): Any? {
        anInt1094++
        var class348_sub42_sub8 = aHashtable_1100.method3482(0) as CacheEntryReference?
        while (class348_sub42_sub8 != null) {
            val `object` = class348_sub42_sub8.method3193(114)
            if (`object` != null) return `object`
            val class348_sub42_sub8_4_: CacheEntryReference? = class348_sub42_sub8
            class348_sub42_sub8 = aHashtable_1100.method3482(0) as CacheEntryReference?
            class348_sub42_sub8_4_!!.method2715(92.toByte())
            class348_sub42_sub8_4_.method3162(true)
            anInt1086 += class348_sub42_sub8_4_.anInt9545
        }
        if (i > -67) aRenderer1098 = null
        return null
    }

    fun method580(i: Int, `object`: Any?, l: Long, i_5_: Int) {
        try {
            anInt1092++
            check(i_5_ <= anInt1084) { "s>cs" }
            method586(l, 0)
            anInt1086 -= i_5_
            while (anInt1086 < 0) {
                val class348_sub42_sub8 = (aLinkedNodeListIterator_1089!!.method1008(i xor 0x7c8a) as CacheEntryReference?)
                method585(class348_sub42_sub8, i xor 0x7cfa.inv())
            }
            val class348_sub42_sub8_sub2 = HardCacheEntryReference(`object`, i_5_)
            aHashtable_1100.method3483(54.toByte(), l, class348_sub42_sub8_sub2)
            if (i != 31902) anInt1086 = -106
            aLinkedNodeListIterator_1089!!.method1005(true, class348_sub42_sub8_sub2)
            class348_sub42_sub8_sub2.aLong7057 = 0L
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("jr.E(" + i + ',' + (if (`object` != null) "{...}" else "null") + ',' + l + ',' + i_5_ + ')'))
        }
    }

    fun method581(i: Int): Int {
        if (i != -18529) method583(-64L, 37)
        anInt1099++
        return anInt1086
    }

    fun method582(`object`: Any?, l: Long, i: Byte) {
        try {
            if (i >= -92) method589(null, -7)
            anInt1095++
            method580(31902, `object`, l, 1)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("jr.B(" + (if (`object` != null) "{...}" else "null") + ',' + l + ',' + i + ')'))
        }
    }

    fun method583(l: Long, i: Int): Any? {
        try {
            val i_6_ = -59 % ((i - 2) / 47)
            anInt1085++
            val class348_sub42_sub8 = aHashtable_1100.method3480(l, -6008) as CacheEntryReference?
            if (class348_sub42_sub8 == null) return null
            val `object` = class348_sub42_sub8.method3193(86)
            if (`object` == null) {
                class348_sub42_sub8.method2715(102.toByte())
                class348_sub42_sub8.method3162(true)
                anInt1086 += class348_sub42_sub8.anInt9545
                return null
            }
            if (class348_sub42_sub8.method3195(-4)) {
                val class348_sub42_sub8_sub2 = HardCacheEntryReference(`object`, (class348_sub42_sub8.anInt9545))
                aHashtable_1100.method3483(90.toByte(), (class348_sub42_sub8.aLong4291), class348_sub42_sub8_sub2)
                aLinkedNodeListIterator_1089!!.method1005(true, class348_sub42_sub8_sub2)
                class348_sub42_sub8_sub2.aLong7057 = 0L
                class348_sub42_sub8.method2715(112.toByte())
                class348_sub42_sub8.method3162(true)
            } else {
                aLinkedNodeListIterator_1089!!.method1005(true, class348_sub42_sub8)
                class348_sub42_sub8.aLong7057 = 0L
            }
            return `object`
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "jr.K(" + l + ',' + i + ')')
        }
    }

    private fun method585(class348_sub42_sub8: CacheEntryReference?, i: Int) {
        val i_8_ = 80 / ((i - 6) / 36)
        anInt1102++
        if (class348_sub42_sub8 != null) {
            class348_sub42_sub8.method2715(117.toByte())
            class348_sub42_sub8.method3162(true)
            anInt1086 += class348_sub42_sub8.anInt9545
        }
    }

    private fun method586(l: Long, i: Int) {
        try {
            if (i != 0) aLinkedNodeListIterator_1089 = null
            anInt1090++
            val class348_sub42_sub8 = aHashtable_1100.method3480(l, -6008) as CacheEntryReference?
            method585(class348_sub42_sub8, -57)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, "jr.J(" + l + ',' + i + ')')
        }
    }

    fun method587(i: Int) {
        anInt1096++
        var class348_sub42_sub8 = aLinkedNodeListIterator_1089!!.method1011(-71) as CacheEntryReference?
        while (class348_sub42_sub8 != null) {
            if (class348_sub42_sub8.method3195(-4)) {
                class348_sub42_sub8.method2715(118.toByte())
                class348_sub42_sub8.method3162(true)
                anInt1086 += class348_sub42_sub8.anInt9545
            }
            class348_sub42_sub8 = (aLinkedNodeListIterator_1089!!.method1003(50.toByte()) as CacheEntryReference?)
        }
        if (i >= -75) method587(-97)
    }

    fun method588(i: Int): Any? {
        anInt1087++
        var class348_sub42_sub8 = aHashtable_1100.method3484(0) as CacheEntryReference?
        if (i != -5052) method577(77)
        while (class348_sub42_sub8 != null) {
            val `object` = class348_sub42_sub8.method3193(119)
            if (`object` == null) {
                val class348_sub42_sub8_9_: CacheEntryReference? = class348_sub42_sub8
                class348_sub42_sub8 = aHashtable_1100.method3482(0) as CacheEntryReference?
                class348_sub42_sub8_9_!!.method2715(41.toByte())
                class348_sub42_sub8_9_.method3162(true)
                anInt1086 += (class348_sub42_sub8_9_.anInt9545)
            } else return `object`
        }
        return null
    }

    fun method590(i: Int) {
        anInt1091++
        aLinkedNodeListIterator_1089!!.method1009(i + 2110355138)
        aHashtable_1100.method3481(i)
        anInt1086 = anInt1084
    }

    init {
        anInt1084 = anInt1086
        var i_11_: Int
        i_11_ = 1
        while (anInt1086 > i_11_ + i_11_ && i_10_ > i_11_) {
            i_11_ += i_11_
        }
        aHashtable_1100 = Hashtable(i_11_)
    }

    companion object {
        @JvmField
        var anInt1085: Int = 0
        @JvmField
        var anInt1087: Int = 0
        @JvmField
        var anInt1088: Int = 0
        @JvmField
        var anInt1090: Int = 0
        @JvmField
        var anInt1091: Int = 0
        @JvmField
        var anInt1092: Int = 0
        @JvmField
        var anInt1093: Int = 0
        @JvmField
        var anInt1094: Int = 0
        @JvmField
        var anInt1095: Int = 0
        @JvmField
        var anInt1096: Int = 0
        @JvmField
        var anInt1097: Int = 0
        @JvmField
        var aRenderer1098: Renderer? = null
        @JvmField
        var anInt1099: Int = 0
        @JvmField
        var anInt1101: Int = 0
        @JvmField
        var anInt1102: Int = 0
        @JvmField
        var anInt1103: Int = 0

        fun method576(i: Int, i_1_: Int): Boolean {
            if (i_1_ <= 21) method589(null, -21)
            anInt1088++
            return i == 2 || i == 3
        }

        @JvmStatic
        fun method584(i: Byte) {
            aRenderer1098 = null
            val i_7_ = -19 % ((i - 59) / 55)
        }

        @JvmStatic
        fun method589(structConfig: StructConfig?, i: Int): Boolean {
            anInt1103++
            if (structConfig == null) return false
            if (i != -4) return false
            if (!structConfig.aBoolean574) return false
            if (!structConfig.method373(MapRegionLoader.anVarResolver_1244!!, i xor 0x2d.inv())) return false
            if (HeapInfoRecord.aHashtable_4934!!.method3480(structConfig.anInt581.toLong(), i xor 0x1774) != null) return false
            return HardKeyedCacheEntryReference.aHashtable_10442!!.method3480(structConfig.anInt596.toLong(), i + -6004) == null
        }
    }
}
