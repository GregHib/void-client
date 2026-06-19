import Gl2dTextureStatics.method239
import WorldListEntryStatics.method285
import TwoStateOptionStateStatics.method1843
import java.util.*
import CollisionMapRegionStatics.anInt1717
import CollisionMapRegionStatics.anInt1719
import CollisionMapRegionStatics.anInt1721

/*
 * Class111
 */
class CollisionMapRegion internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val anInt1715: Int
    private val aJs5Archive_1718: Js5Archive?
    private var anIntArrayArray1724: Array<IntArray?>?
    private val aBooleanArray1725: BooleanArray

    fun method1043(i: Int, i_0_: Byte): TypedRecordTable? {
        anInt1721++
        val `is` = aJs5Archive_1718!!.method410(-1860, 1, i)
        if (i_0_ < 12) return null
        val typedRecordTable = TypedRecordTable()
        typedRecordTable.method2183(ByteBuffer(`is`), 21890)
        return typedRecordTable
    }

    fun method1044(i: Int): Boolean {
        if (i < 15) anIntArrayArray1724 = null
        anInt1717++
        return anInt1715 != -1
    }

    fun method1046(i: Int, i_8_: Int): IntArray? {
        anInt1719++
        if (i < 0 || anIntArrayArray1724!!.size <= i) {
            if (anInt1715 == -1) return IntArray(0)
            return intArrayOf(anInt1715)
        }
        if (!aBooleanArray1725[i] || anIntArrayArray1724!![i]!!.size <= 1) return anIntArrayArray1724!![i]
        val i_9_ = if (i_8_ == (anInt1715.inv())) 0 else 1
        val random = Random()
        val `is` = IntArray(anIntArrayArray1724!![i]!!.size)
        ArrayCopyUtil.method1578(anIntArrayArray1724!![i]!!, 0, `is`, 0, `is`.size)
        var i_10_ = i_9_
        while (`is`.size > i_10_) {
            val i_11_ = i_9_ + ModelDefinitionStatics.method1097(80.toByte(), `is`.size - i_9_, random)
            val i_12_ = `is`[i_10_]
            `is`[i_10_] = `is`[i_11_]
            `is`[i_11_] = i_12_
            i_10_++
        }
        return `is`
    }

    init {
        try {
            aJs5Archive_1718 = js5Archive
            aJs5Archive_1718!!.method407(0, 1)
            val class348_sub49 = ByteBuffer(aJs5Archive_1718.method410(-1860, 0, 0))
            val i_17_ = class348_sub49.readUnsignedByte(255)
            if (i_17_ > 3) {
                anIntArrayArray1724 = arrayOfNulls(0)
                aBooleanArray1725 = BooleanArray(0)
                anInt1715 = -1
            } else {
                val i_18_ = class348_sub49.readUnsignedByte(255)
                val class223s = method285(-122)
                var bool = true
                if (class223s.size == i_18_) {
                    var i_19_ = 0
                    while ((class223s.size > i_19_)) {
                        val i_20_ = class348_sub49.readUnsignedByte(255)
                        if (i_20_ != class223s[i_19_]!!.anInt2896) {
                            bool = false
                            break
                        }
                        i_19_++
                    }
                } else bool = false
                if (bool) {
                    val i_21_ = class348_sub49.readUnsignedByte(255)
                    val i_22_ = class348_sub49.readUnsignedByte(255)
                    anInt1715 = if (i_17_ > 2) class348_sub49.readShort(13638)
                    else -1
                    anIntArrayArray1724 = arrayOfNulls(i_22_ - -1)
                    aBooleanArray1725 = BooleanArray(i_22_ + 1)
                    var i_23_ = 0
                    while (i_21_ > i_23_) {
                        val i_24_ = class348_sub49.readUnsignedByte(255)
                        aBooleanArray1725[i_24_] = class348_sub49.readUnsignedByte(255) == 1
                        val i_25_ = class348_sub49.readUnsignedShort(842397944)
                        if (anInt1715 == -1) {
                            anIntArrayArray1724!![i_24_] = IntArray(i_25_)
                            var i_26_ = 0
                            while (i_25_ > i_26_) {
                                anIntArrayArray1724!![i_24_]!![i_26_] = class348_sub49.readUnsignedShort(842397944)
                                i_26_++
                            }
                        } else {
                            anIntArrayArray1724!![i_24_] = IntArray(1 + i_25_)
                            anIntArrayArray1724!![i_24_]!![0] = anInt1715
                            var i_27_ = 0
                            while (i_25_ > i_27_) {
                                anIntArrayArray1724!![i_24_]!![1 + i_27_] = class348_sub49.readUnsignedShort(842397944)
                                i_27_++
                            }
                        }
                        i_23_++
                    }
                    var i_28_ = 0
                    while (i_22_ + 1 > i_28_) {
                        if (anIntArrayArray1724!![i_28_] == null) {
                            if (anInt1715 != -1) anIntArrayArray1724!![i_28_] = intArrayOf(anInt1715)
                            else anIntArrayArray1724!![i_28_] = IntArray(0)
                        }
                        i_28_++
                    }
                } else {
                    aBooleanArray1725 = BooleanArray(0)
                    anIntArrayArray1724 = arrayOfNulls(0)
                    anInt1715 = -1
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("mt.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }
}
