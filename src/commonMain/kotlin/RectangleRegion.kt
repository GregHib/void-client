/* Class138 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RectangleRegion internal constructor(var anInt1941: Int, @JvmField var anInt1945: Int, @JvmField var anInt1943: Int, @JvmField var anInt1944: Int) {
    override fun toString(): String {
        anInt1947++
        throw IllegalStateException()
    }

    companion object {
        var anInt1947: Int = 0
        var aRectangleRegion_3044: RectangleRegion? = RectangleRegion(0, 2, 2, 1)
        @JvmStatic
        fun method1659(i: Byte) {
//            if (i >= -2) method1659(126.toByte())
            aRectangleRegion_3044 = null
        }


        var aRectangleRegion_6321: RectangleRegion? = RectangleRegion(1, 2, 2, 0)
        @JvmStatic
        fun method2258(i: Byte) {
            aRectangleRegion_6321 = null
//            if (i < -119) aFileOutputStream6323 = null
        }

        var aRectangleRegion_4062: RectangleRegion? = RectangleRegion(2, 4, 4, 0)

        @JvmStatic
        fun method2572(i: Byte) {
            aRectangleRegion_4062 = null
//            if (i.toInt() != 23) aRectangleRegion_4062 = null
        }
        var aOutgoingPacketHeader_2892: OutgoingPacketHeader? = OutgoingPacketHeader(39, 8)
        var aRectangleRegion_2885: RectangleRegion? = RectangleRegion(4, 1, 1, 1)
        @JvmStatic
        fun method1609(i: Byte) {
            aOutgoingPacketHeader_2892 = null
            aRectangleRegion_2885 = null
        }
        var aOutgoingPacketHeader_9533: OutgoingPacketHeader? = OutgoingPacketHeader(57, 3)

        var anCharStreamReaderArray9534s: Array<CharStreamReader?>? = arrayOfNulls<CharStreamReader>(128)

        var aRectangleRegion_9530: RectangleRegion? = RectangleRegion(6, 0, 4, 2)
        @JvmStatic
        fun method3187(i: Byte) {
            anCharStreamReaderArray9534s = null
            aOutgoingPacketHeader_9533 = null
            aRectangleRegion_9530 = null
        }

        var aOutgoingPacketHeader_9743: OutgoingPacketHeader? = OutgoingPacketHeader(84, -1)
        var aRectangleRegion_9748: RectangleRegion? = RectangleRegion(7, 0, 1, 1)
        var aOutgoingPacketHeader_9749: OutgoingPacketHeader? = OutgoingPacketHeader(45, 7)
        @JvmStatic
        fun method3403(i: Int) {
            if (i >= 58) {
                aRectangleRegion_9748 = null
                aOutgoingPacketHeader_9749 = null
                aOutgoingPacketHeader_9743 = null
            }
        }

        var aInputTracker_8552: InputTracker? = null
        var aRectangleRegion_8553: RectangleRegion? = RectangleRegion(9, 0, 4, 1)
        var anIntArray8557: IntArray? = IntArray(500)

        @JvmStatic
        fun method1973(i: Int) {
            aRectangleRegion_8553 = null
            aInputTracker_8552 = null
            if (i == 24885) anIntArray8557 = null
        }
        var aRectangleRegion_7274: RectangleRegion? = RectangleRegion(10, 2, 2, 0)

        @JvmStatic
        fun method3438(i: Byte) {
            if (i > 39) aRectangleRegion_7274 = null
            aRectangleRegion_1213 = null
            aRectangleRegion_4901 = null
        }

        var aRectangleRegion_1213: RectangleRegion? = RectangleRegion(11, 0, 1, 2)

        var aRectangleRegion_4901: RectangleRegion? = RectangleRegion(12, 0, 1, 0)

        var aRectangleRegion_10194: RectangleRegion? = RectangleRegion(13, 0, 1, 0)

        var aStringArray10195: Array<String?>? = arrayOfNulls<String>(8)

        @JvmStatic
        fun method2407(bool: Boolean) {
            aStringArray10195 = null
            aRectangleRegion_10194 = null
//            if (bool != false) method2407(true)
        }

        var aRectangleRegion_9781: RectangleRegion? = RectangleRegion(14, 0, 4, 1)
        @JvmStatic
        fun method3444(i: Int) {
            if (i <= -85) aRectangleRegion_9781 = null
        }

        var aRectangleRegion_9860: RectangleRegion? = RectangleRegion(15, 0, 1, 0)

        @JvmStatic
        fun method3968(i: Int) {
            aRectangleRegion_9860 = null
        }
        var anInt6901: Int = 0

        fun method3002(i: Byte): Array<RectangleRegion?> {
//        if (i.toInt() != -97) aMinimapPositionStateArray6897s = null
            anInt6901++
            return (arrayOf<RectangleRegion?>(
                aRectangleRegion_3044,
                aRectangleRegion_6321,
                aRectangleRegion_4062,
                aRectangleRegion_2885,
                aRectangleRegion_9530,
                aRectangleRegion_9748,
                SpriteMaskShape.aRectangleRegion_4082,
                aRectangleRegion_8553,
                aRectangleRegion_7274,
                aRectangleRegion_1213,
                aRectangleRegion_4901,
                aRectangleRegion_10194,
                aRectangleRegion_9781,
                aRectangleRegion_9860
            ))
        }


        var anInt6625: Int = 0

        @JvmStatic
        fun method2752(i: Int, i_2_: Int): RectangleRegion? {
            anInt6625++
            val class138s = method3002((-97).toByte())
            var i_3_ = i_2_
            while (class138s.size > i_3_) {
                if (i == class138s[i_3_]!!.anInt1941) return class138s[i_3_]
                i_3_++
            }
            return null
        }
    }
}