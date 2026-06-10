/* Class197 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class197 {
    private var anIntArray2602: IntArray
    var anInt2603: Int = 0
    private var anInt2604 = 2
    private var anIntArray2605 = IntArray(2)
    var anInt2606: Int = 0
    var anInt2607: Int = 0
    private var anInt2608 = 0
    private var anInt2609 = 0
    private var anInt2610 = 0
    private var anInt2611 = 0
    private var anInt2612 = 0

    fun method1451(i: Int): Int {
        if (anInt2609 >= anInt2610) {
            anInt2612 = anIntArray2602[anInt2611++] shl 15
            if (anInt2611 >= anInt2604) anInt2611 = anInt2604 - 1
            anInt2610 = (anIntArray2605[anInt2611].toDouble() / 65536.0 * i.toDouble()).toInt()
            if (anInt2610 > anInt2609) anInt2608 = (((anIntArray2602[anInt2611] shl 15) - anInt2612) / (anInt2610 - anInt2609))
        }
        anInt2612 += anInt2608
        anInt2609++
        return anInt2612 - anInt2608 shr 15
    }

    fun method1452(class348_sub49: Class348_Sub49) {
        this.anInt2603 = class348_sub49.readUnsignedByte(255)
        this.anInt2607 = class348_sub49.readInt((-126).toByte())
        this.anInt2606 = class348_sub49.readInt((-126).toByte())
        method1454(class348_sub49)
    }

    fun method1453() {
        anInt2610 = 0
        anInt2611 = 0
        anInt2608 = 0
        anInt2612 = 0
        anInt2609 = 0
    }

    init {
        anIntArray2602 = IntArray(2)
        anIntArray2605[0] = 0
        anIntArray2605[1] = 65535
        anIntArray2602[0] = 0
        anIntArray2602[1] = 65535
    }

    fun method1454(class348_sub49: Class348_Sub49) {
        anInt2604 = class348_sub49.readUnsignedByte(255)
        anIntArray2605 = IntArray(anInt2604)
        anIntArray2602 = IntArray(anInt2604)
        for (i in 0..<anInt2604) {
            anIntArray2605[i] = class348_sub49.readUnsignedShort(842397944)
            anIntArray2602[i] = class348_sub49.readUnsignedShort(842397944)
        }
    }
}
