/* Class293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class293 implements Runnable {
    private long aLong3742;
    private Class315 aClass315_3743;
    private volatile boolean aBoolean3744;
    private volatile boolean aBoolean3745;
    private final ha aHa3746;
    private final int[] anIntArray3747;
    private final Class348_Sub1[] aClass348_Sub1Array3748 = new Class348_Sub1[8];
    private final int anInt3749;
    private volatile boolean aBoolean3750;

    final long method2204() {
        return aLong3742;
    }

    public final void run() {
        while (aBoolean3745)
            method2207();
    }

    final void method2205() {
        aBoolean3750 = false;
        aBoolean3745 = false;
        synchronized (this) {
            this.notify();
        }
    }

    final void method2206(Class315 class315) {
        if (aClass315_3743 != null)
            aClass315_3743.method2356(null, (byte) -108);
        aClass315_3743 = class315;
        if (aClass315_3743 != null)
            aClass315_3743.method2356(this, (byte) -108);
    }

    private final void method2207() {
        aHa3746.method3659(anInt3749);
        while (!aBoolean3750 && aBoolean3745) {
            if (aClass315_3743 == null || aClass315_3743.method2360(-112)) {
                aBoolean3744 = false;
                aLong3742 = Class50_Sub4.aClass47_5262.method446(1);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            } else {
                aBoolean3744 = true;
                Class318 class318 = aClass315_3743.method2362(25061);
                if (class318 instanceof Class318_Sub1) {
                    Class318_Sub1 class318_sub1 = (Class318_Sub1) class318;
                    if (class318_sub1.aBoolean6387)
                        class318_sub1.method2387(Class9.aHa171, -127);
                    else {
                        Class38.method365(class318_sub1,
                                aClass348_Sub1Array3748);
                        if (Class362.aClass324_4456 != null)
                            Class362.aClass324_4456.method2576
                                    (aClass315_3743.aString3953, -256,
                                            class318_sub1.anInt6380,
                                            class318_sub1.anInt6386,
                                            -16777216, -114);
                    }
                } else {
                    int i
                            = ((Class318_Sub2) class318).anInt6394;
                    if (i >= 1 && i <= 4) {
                        s var_s = aa_Sub1.aSArray5191[i - 1];
                        for (int i_0_ = 0;
                             i_0_ < (Class318_Sub1_Sub4_Sub1.anInt10084
                                     + Class318_Sub1_Sub4_Sub1.anInt10084);
                             i_0_++) {
                            for (int i_1_ = 0;
                                 i_1_ < (Class318_Sub1_Sub4_Sub1.anInt10084
                                         + Class318_Sub1_Sub4_Sub1.anInt10084);
                                 i_1_++) {
                                if (Class115.aBooleanArrayArrayArray1751[i - 1]
                                        [i_0_][i_1_]) {
                                    int i_2_
                                            = (Class239_Sub25.anInt6111
                                            - Class318_Sub1_Sub4_Sub1.anInt10084
                                            + i_0_);
                                    int i_3_
                                            = (Class285_Sub2.anInt8502
                                            - Class318_Sub1_Sub4_Sub1.anInt10084
                                            + i_1_);
                                    if (i_2_ >= 0
                                            && i_2_ < var_s.anInt4587
                                            && i_3_ >= 0
                                            && i_3_ < var_s.anInt4590) {
                                        Class9.aHa171.H
                                                (i_2_ << Class362.anInt4459,
                                                        var_s.method3982((byte) -86, i_3_,
                                                                i_2_),
                                                        i_3_ << Class362.anInt4459,
                                                        anIntArray3747);
                                        if (Class286_Sub4
                                                .method2154(anIntArray3747[0])
                                                == anInt3749 - 1)
                                            var_s.method3979(i_2_, i_3_);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        aHa3746.method3678(anInt3749);
        while (aBoolean3750 && aBoolean3745) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException interruptedexception) {
                    /* empty */
                }
            }
        }
    }

    final void method2208() {
        aBoolean3750 = true;
        synchronized (this) {
            this.notify();
        }
    }

    final void method2209() {
        aBoolean3750 = false;
        synchronized (this) {
            this.notify();
        }
    }

    final boolean method2210() {
        return aClass315_3743 == null
                || (!aBoolean3744 && aClass315_3743.method2360(70));
    }

    Class293(int i, ha var_ha) {
        anIntArray3747 = new int[3];
        aBoolean3750 = true;
        aBoolean3745 = true;
        aBoolean3744 = false;
        anInt3749 = i;
        aHa3746 = var_ha;
    }
}
