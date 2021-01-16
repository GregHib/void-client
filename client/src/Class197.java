/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class197 {
    private int[] anIntArray2602;
    int anInt2603;
    private int anInt2604 = 2;
    private int[] anIntArray2605 = new int[2];
    int anInt2606;
    int anInt2607;
    private int anInt2608;
    private int anInt2609;
    private int anInt2610;
    private int anInt2611;
    private int anInt2612;

    final int method1451(int i) {
        if (anInt2609 >= anInt2610) {
            anInt2612 = anIntArray2602[anInt2611++] << 15;
            if (anInt2611 >= anInt2604) anInt2611 = anInt2604 - 1;
            anInt2610 = (int) ((double) anIntArray2605[anInt2611] / 65536.0 * (double) i);
            if (anInt2610 > anInt2609) anInt2608 = (((anIntArray2602[anInt2611] << 15) - anInt2612) / (anInt2610 - anInt2609));
        }
        anInt2612 += anInt2608;
        anInt2609++;
        return anInt2612 - anInt2608 >> 15;
    }

    final void method1452(Class348_Sub49 class348_sub49) {
        this.anInt2603 = class348_sub49.method3387(255);
        this.anInt2607 = class348_sub49.method3385((byte) -126);
        this.anInt2606 = class348_sub49.method3385((byte) -126);
        method1454(class348_sub49);
    }

    final void method1453() {
        anInt2610 = 0;
        anInt2611 = 0;
        anInt2608 = 0;
        anInt2612 = 0;
        anInt2609 = 0;
    }

    public Class197() {
        anIntArray2602 = new int[2];
        anIntArray2605[0] = 0;
        anIntArray2605[1] = 65535;
        anIntArray2602[0] = 0;
        anIntArray2602[1] = 65535;
    }

    final void method1454(Class348_Sub49 class348_sub49) {
        anInt2604 = class348_sub49.method3387(255);
        anIntArray2605 = new int[anInt2604];
        anIntArray2602 = new int[anInt2604];
        for (int i = 0; i < anInt2604; i++) {
            anIntArray2605[i] = class348_sub49.method3330(842397944);
            anIntArray2602[i] = class348_sub49.method3330(842397944);
        }
    }
}
