/* Class114 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class InboundPacketHeader internal constructor(private var anInt1747: Int, var anInt1749: Int) {
    fun method1058(i: Byte): Int {
        if (i <= 108) anInt1747 = 110
        anInt1746++
        return anInt1747
    }

    override fun toString(): String {
        anInt1750++
        throw IllegalStateException()
    }

    companion object {

        @JvmStatic
        fun method287(i: Int) {
            if (i == 51) {
                aInboundPacketHeader_316 = null
                aInboundPacketHeader_318 = null
            }
        }

        var anInt1746: Int = 0

        var anInt1750: Int = 0
        var aInboundPacketHeader_2285: InboundPacketHeader? = InboundPacketHeader(77, 4)

        var anInt1748: Int = 0
        fun method1059(i: Byte, i_1_: Int): GrowableStringList {
            anInt1748++
            val growableStringList = GrowableStringList(i_1_, false)
            return growableStringList
        }

        var aInboundPacketHeader_3135: InboundPacketHeader? = InboundPacketHeader(108, 5)
        var aInboundPacketHeader_3143: InboundPacketHeader? = InboundPacketHeader(7, 3)

        var aInboundPacketHeader_3145: InboundPacketHeader? = null
        var aInboundPacketHeader_2717: InboundPacketHeader? = InboundPacketHeader(118, -2)
        var aInboundPacketHeader_1702: InboundPacketHeader? = InboundPacketHeader(24, 6)
        var aInboundPacketHeader_6340: InboundPacketHeader? = InboundPacketHeader(74, 28)
        var aInboundPacketHeader_6528: InboundPacketHeader? = InboundPacketHeader(14, 2)
        var aInboundPacketHeader_7301: InboundPacketHeader? = InboundPacketHeader(21, -1)
        var aInboundPacketHeader_5949: InboundPacketHeader? = InboundPacketHeader(69, 12)
        var aInboundPacketHeader_5950: InboundPacketHeader? = InboundPacketHeader(64, 2)

        var aInboundPacketHeader_9254: InboundPacketHeader? = InboundPacketHeader(73, 3)
        var aInboundPacketHeader_9257: InboundPacketHeader? = InboundPacketHeader(102, 3)
        var aInboundPacketHeader_9216: InboundPacketHeader? = InboundPacketHeader(91, 2)
        var aInboundPacketHeader_123: InboundPacketHeader? = InboundPacketHeader(110, 10)
        var aInboundPacketHeader_9285: InboundPacketHeader? = InboundPacketHeader(104, 1)
        var aInboundPacketHeader_229: InboundPacketHeader? = InboundPacketHeader(51, 17)
        var aInboundPacketHeader_4388: InboundPacketHeader? = InboundPacketHeader(3, 3)
        var aInboundPacketHeader_9550: InboundPacketHeader? = InboundPacketHeader(109, 7)
        var aInboundPacketHeader_2693: InboundPacketHeader? = InboundPacketHeader(94, -1)
        var aInboundPacketHeader_2305: InboundPacketHeader? = InboundPacketHeader(57, 10)
        var aInboundPacketHeader_9552: InboundPacketHeader? = InboundPacketHeader(72, 0)
        var aInboundPacketHeader_6383: InboundPacketHeader? = InboundPacketHeader(11, 6)
        var aInboundPacketHeader_1234: InboundPacketHeader? = InboundPacketHeader(54, 4)
        var aInboundPacketHeader_6424: InboundPacketHeader? = InboundPacketHeader(82, 4)
        var aInboundPacketHeader_4433: InboundPacketHeader? = InboundPacketHeader(22, 0)
        var aInboundPacketHeader_1722: InboundPacketHeader? = InboundPacketHeader(8, -2)
        var aInboundPacketHeader_9225: InboundPacketHeader? = InboundPacketHeader(28, -2)
        var aInboundPacketHeader_3368: InboundPacketHeader? = InboundPacketHeader(112, 4)
        var aInboundPacketHeader_3371: InboundPacketHeader? = InboundPacketHeader(63, 5)
        var aInboundPacketHeader_8683: InboundPacketHeader? = InboundPacketHeader(100, -1)
        var aInboundPacketHeader_316: InboundPacketHeader? = InboundPacketHeader(95, 10)
        var aInboundPacketHeader_318: InboundPacketHeader? = InboundPacketHeader(19, -2)
        var aInboundPacketHeader_6121: InboundPacketHeader? = InboundPacketHeader(32, 6)
        var aInboundPacketHeader_1540: InboundPacketHeader? = InboundPacketHeader(113, 1)
        var aInboundPacketHeader_3264: InboundPacketHeader? = InboundPacketHeader(6, 2)
        var aInboundPacketHeader_4779: InboundPacketHeader? = InboundPacketHeader(76, 6)
        var aInboundPacketHeader_7363: InboundPacketHeader? = InboundPacketHeader(103, 8)
        var aInboundPacketHeader_6056: InboundPacketHeader? = InboundPacketHeader(26, 11)
        var aInboundPacketHeader_5742: InboundPacketHeader? = InboundPacketHeader(119, 6)
        var aInboundPacketHeader_4027: InboundPacketHeader? = InboundPacketHeader(90, 10)
        var aInboundPacketHeader_4707: InboundPacketHeader? = InboundPacketHeader(39, 8)
        var aInboundPacketHeader_7323: InboundPacketHeader? = InboundPacketHeader(105, -2)

        var aInboundPacketHeader_7324: InboundPacketHeader? = InboundPacketHeader(96, 8)

        var aInboundPacketHeader_7367: InboundPacketHeader? = InboundPacketHeader(37, 7)

        var aInboundPacketHeader_7398: InboundPacketHeader? = InboundPacketHeader(16, 6)
        var aInboundPacketHeader_9197: InboundPacketHeader? = InboundPacketHeader(61, -1)

        var aInboundPacketHeader_9324: InboundPacketHeader? = InboundPacketHeader(85, 4)

        var aInboundPacketHeader_8756: InboundPacketHeader? = InboundPacketHeader(107, 6)
        var aInboundPacketHeader_3641: InboundPacketHeader? = InboundPacketHeader(79, 3)

        var aInboundPacketHeader_8817: InboundPacketHeader? = InboundPacketHeader(83, 2)
        var aInboundPacketHeader_2068: InboundPacketHeader? = InboundPacketHeader(68, 6)
        var aInboundPacketHeader_2248: InboundPacketHeader? = InboundPacketHeader(25, 6)

        var aInboundPacketHeader_2255: InboundPacketHeader? = InboundPacketHeader(99, -1)
        var aInboundPacketHeader_330: InboundPacketHeader? = InboundPacketHeader(65, -1)
        var aInboundPacketHeader_3773: InboundPacketHeader? = InboundPacketHeader(55, 0)
        var aInboundPacketHeader_1762: InboundPacketHeader? = InboundPacketHeader(50, -1)
        var aInboundPacketHeader_79: InboundPacketHeader? = InboundPacketHeader(75, 6)
        var aInboundPacketHeader_90: InboundPacketHeader? = InboundPacketHeader(42, -1)
        var aInboundPacketHeader_2183: InboundPacketHeader? = InboundPacketHeader(0, -1)
        var aInboundPacketHeader_4998: InboundPacketHeader? = InboundPacketHeader(59, 3)

        var aInboundPacketHeader_5883: InboundPacketHeader? = InboundPacketHeader(34, 12)
        var aInboundPacketHeader_9503: InboundPacketHeader? = InboundPacketHeader(9, -1)
        var aInboundPacketHeader_3751: InboundPacketHeader? = InboundPacketHeader(1, 2)

        var aInboundPacketHeader_4500: InboundPacketHeader? = InboundPacketHeader(117, 1)
        var aInboundPacketHeader_4015: InboundPacketHeader? = InboundPacketHeader(116, 6)
        var aInboundPacketHeader_4798: InboundPacketHeader? = InboundPacketHeader(29, 7)
        var aInboundPacketHeader_2527: InboundPacketHeader? = InboundPacketHeader(98, -2)
        var aInboundPacketHeader_2483: InboundPacketHeader?= InboundPacketHeader(47, 6)

        var aInboundPacketHeader_220: InboundPacketHeader? = InboundPacketHeader(40, -1)
        var aInboundPacketHeader_1871: InboundPacketHeader? = InboundPacketHeader(52, -1)
        var aInboundPacketHeader_3265: InboundPacketHeader? = InboundPacketHeader(48, -2)
        var aInboundPacketHeader_843: InboundPacketHeader? = InboundPacketHeader(66, 8)
        var aInboundPacketHeader_2972: InboundPacketHeader? = InboundPacketHeader(49, 4)

        var aInboundPacketHeader_1068: InboundPacketHeader? = InboundPacketHeader(35, 0)
        var aInboundPacketHeader_2279: InboundPacketHeader? = InboundPacketHeader(60, 0)
        var aInboundPacketHeader_7124: InboundPacketHeader? = InboundPacketHeader(62, 4)
        var aInboundPacketHeader_1901: InboundPacketHeader? = InboundPacketHeader(38, -1)
        var aInboundPacketHeader_3467: InboundPacketHeader? = InboundPacketHeader(45, 8)

        var aInboundPacketHeader_4269: InboundPacketHeader? = InboundPacketHeader(87, 1)

        var aInboundPacketHeader_4272: InboundPacketHeader? = InboundPacketHeader(67, 3)
        var aInboundPacketHeader_2196: InboundPacketHeader? = InboundPacketHeader(111, -1)
        var aInboundPacketHeader_2331: InboundPacketHeader? = InboundPacketHeader(120, -2)
        var aInboundPacketHeader_2335: InboundPacketHeader? = InboundPacketHeader(80, 0)
        var aInboundPacketHeader_3809: InboundPacketHeader? = InboundPacketHeader(44, 6)
        var aInboundPacketHeader_1914: InboundPacketHeader? = InboundPacketHeader(84, 7)
        var aInboundPacketHeader_1917: InboundPacketHeader? = InboundPacketHeader(20, -2)
        var aInboundPacketHeader_3842: InboundPacketHeader? = InboundPacketHeader(114, 4)
        var aInboundPacketHeader_7052: InboundPacketHeader? = InboundPacketHeader(86, 6)

        var aInboundPacketHeader_6058: InboundPacketHeader? = InboundPacketHeader(46, -1)
        var aInboundPacketHeader_4331: InboundPacketHeader? = InboundPacketHeader(31, -1)
        var aInboundPacketHeader_4477: InboundPacketHeader? = InboundPacketHeader(88, 10)

        var aInboundPacketHeader_2860: InboundPacketHeader? = InboundPacketHeader(106, 8)

        var aInboundPacketHeader_9456: InboundPacketHeader? = null
        var aInboundPacketHeader_82: InboundPacketHeader? = InboundPacketHeader(71, 7)
        var aInboundPacketHeader_6089: InboundPacketHeader? = InboundPacketHeader(41, 3)
        var aInboundPacketHeader_1120: InboundPacketHeader? = InboundPacketHeader(53, -2)

        var aInboundPacketHeader_1123: InboundPacketHeader? = InboundPacketHeader(78, -1)
        var aInboundPacketHeader_1959: InboundPacketHeader? = InboundPacketHeader(81, 6)
        var aInboundPacketHeader_2338: InboundPacketHeader? = InboundPacketHeader(92, -1)
        var aInboundPacketHeader_8384: InboundPacketHeader? = InboundPacketHeader(18, 0)
        var aInboundPacketHeader_8385: InboundPacketHeader? = InboundPacketHeader(10, -2)
        var aInboundPacketHeader_10149: InboundPacketHeader? = InboundPacketHeader(23, 6)
        var aInboundPacketHeader_10168: InboundPacketHeader? = InboundPacketHeader(2, 6)

        var aInboundPacketHeader_6075: InboundPacketHeader? = InboundPacketHeader(89, 0)
        var aInboundPacketHeader_3427: InboundPacketHeader? = InboundPacketHeader(93, -2)
        var aInboundPacketHeader_3240: InboundPacketHeader? = InboundPacketHeader(43, 4)
        var aInboundPacketHeader_2665: InboundPacketHeader? = InboundPacketHeader(12, 0)

        var aInboundPacketHeader_8365: InboundPacketHeader? = InboundPacketHeader(30, -1)
        var aInboundPacketHeader_7113: InboundPacketHeader? = InboundPacketHeader(97, 0)
        var aInboundPacketHeader_7015: InboundPacketHeader? = InboundPacketHeader(33, 3)
        var aInboundPacketHeader_4421: InboundPacketHeader? = InboundPacketHeader(13, -2)

        var aInboundPacketHeader_5997: InboundPacketHeader? = InboundPacketHeader(115, 11)
        var aInboundPacketHeader_7105: InboundPacketHeader? = InboundPacketHeader(101, 20)


        var aInboundPacketHeader_3133: InboundPacketHeader? = null
        var aInboundPacketHeader_7106: InboundPacketHeader? = InboundPacketHeader(36, -2)
        var aInboundPacketHeader_4126: InboundPacketHeader? = InboundPacketHeader(5, 8)
        var aInboundPacketHeader_3307: InboundPacketHeader? = InboundPacketHeader(56, 2)

        var aInboundPacketHeader_5992: InboundPacketHeader? = InboundPacketHeader(17, 4)
        var aInboundPacketHeader_250: InboundPacketHeader? = InboundPacketHeader(4, 1)
        var aInboundPacketHeader_3925: InboundPacketHeader? = InboundPacketHeader(27, 3)

        var aInboundPacketHeader_304: InboundPacketHeader? = InboundPacketHeader(70, -2)
        var aInboundPacketHeader_315: InboundPacketHeader? = InboundPacketHeader(15, 16)

        var aInboundPacketHeader_8590: InboundPacketHeader? = InboundPacketHeader(58, 2)

        var aInboundPacketHeader_6584: InboundPacketHeader? = null
    }
}