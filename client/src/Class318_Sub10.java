/* Class318_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub10 extends Class318 {
    boolean aBoolean6470;
    private long aLong6471;
    private long aLong6472;
    private boolean aBoolean6473 = false;
    private static boolean[] aBooleanArray6474 = new boolean[32];
    Class318_Sub9_Sub2_Sub1[] aClass318_Sub9_Sub2_Sub1Array6475;
    int anInt6476 = 0;
    private static boolean[] aBooleanArray6477 = new boolean[8];
    private Class243 aClass243_6478;
    Class262 aClass262_6479;
    private int anInt6480;
    Class98 aClass98_6481;
    boolean aBoolean6482;
    int anInt6483;
    private boolean aBoolean6484;
    private int anInt6485;

    final Class98 method2525() {
        return this.aClass98_6481;
    }

    static final Class318_Sub10 method2526(int i, boolean bool) {
        if (Class258_Sub3.anInt8550 != InputStreamBuffer.anInt4559) {
            Class318_Sub10 class318_sub10 = Class348_Sub51.aClass318_Sub10Array7249[InputStreamBuffer.anInt4559];
            InputStreamBuffer.anInt4559 = InputStreamBuffer.anInt4559 + 1 & (Class348_Sub42_Sub9.anIntArray9558[Class348_Sub6.anInt6637]);
            class318_sub10.method2531(i, bool);
            return class318_sub10;
        }
        return new Class318_Sub10(i, bool);
    }

    public static void method2527() {
        aBooleanArray6474 = null;
        aBooleanArray6477 = null;
    }

    final void method2528(ha var_ha) {
        this.aClass98_6481.aClass88_1569.method845((byte) 89);
        for (Class318_Sub7 class318_sub7 = (Class318_Sub7) aClass243_6478.method1872(8); class318_sub7 != null; class318_sub7 = (Class318_Sub7) aClass243_6478.method1878((byte) 126))
            class318_sub7.method2511(true, var_ha, aLong6471);
    }

    final void method2529() {
        aBoolean6484 = true;
    }

    final void method2530() {
        this.aBoolean6470 = true;
        for (Class348_Sub42_Sub20 class348_sub42_sub20 = ((Class348_Sub42_Sub20) this.aClass262_6479.method1995(4)); class348_sub42_sub20 != null; class348_sub42_sub20 = (Class348_Sub42_Sub20) this.aClass262_6479.method1990((byte) 89)) {
            if (class348_sub42_sub20.aClass174_9704.anInt2296 == 1) class348_sub42_sub20.method3162(true);
        }
        for (int i = 0; i < (this.aClass318_Sub9_Sub2_Sub1Array6475).length; i++) {
            if (this.aClass318_Sub9_Sub2_Sub1Array6475[i] != null) {
                this.aClass318_Sub9_Sub2_Sub1Array6475[i].method2520();
                this.aClass318_Sub9_Sub2_Sub1Array6475[i] = null;
            }
        }
        this.anInt6476 = 0;
        aClass243_6478 = new Class243();
        anInt6480 = 0;
        this.aClass262_6479 = new Class262();
        anInt6485 = 0;
        this.method2373(false);
        Class348_Sub51.aClass318_Sub10Array7249[Class258_Sub3.anInt8550] = this;
        Class258_Sub3.anInt8550 = (Class258_Sub3.anInt8550 + 1 & Class348_Sub42_Sub9.anIntArray9558[Class348_Sub6.anInt6637]);
    }

    private final void method2531(int i, boolean bool) {
        Class152.aClass243_2077.method1869(-88, this);
        aLong6472 = i;
        aLong6471 = i;
        aBoolean6484 = true;
        this.aBoolean6482 = bool;
    }

    private final void method2532(ha var_ha, Class129[] class129s, boolean bool) {
        for (int i = 0; i < 32; i++)
            aBooleanArray6474[i] = false;
        while_110_:
        for (Class318_Sub7 class318_sub7 = (Class318_Sub7) aClass243_6478.method1872(8); class318_sub7 != null; class318_sub7 = (Class318_Sub7) aClass243_6478.method1878((byte) -28)) {
            if (class129s != null) {
                for (int i = 0; i < class129s.length; i++) {
                    if ((class318_sub7.aClass129_6436 == class129s[i]) || (class318_sub7.aClass129_6436 == class129s[i].aClass129_1888)) {
                        aBooleanArray6474[i] = true;
                        class318_sub7.method2507(true);
                        class318_sub7.aBoolean6446 = false;
                        continue while_110_;
                    }
                }
            }
            if (!bool) {
                if (class318_sub7.anInt6447 == 0) {
                    class318_sub7.method2373(false);
                    anInt6480--;
                } else class318_sub7.aBoolean6446 = true;
            }
        }
        if (class129s != null) {
            for (int i = 0; i < class129s.length; i++) {
                if (i == 32 || anInt6480 == 32) break;
                if (!aBooleanArray6474[i]) {
                    Class318_Sub7 class318_sub7 = new Class318_Sub7(var_ha, class129s[i], this, aLong6472);
                    aClass243_6478.method1869(-126, class318_sub7);
                    anInt6480++;
                    aBooleanArray6474[i] = true;
                }
            }
        }
    }

    final void method2533(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        this.anInt6483 = i;
    }

    final void method2534() {
        aBoolean6473 = true;
    }

    final boolean method2535(ha var_ha, long l) {
        if (aLong6472 != aLong6471) method2534();
        else method2537();
        if (l - aLong6472 > 750L) {
            method2530();
            return false;
        }
        int i = (int) (l - aLong6471);
        if (aBoolean6484) {
            for (Class318_Sub7 class318_sub7 = (Class318_Sub7) aClass243_6478.method1872(8); class318_sub7 != null; class318_sub7 = (Class318_Sub7) aClass243_6478.method1878((byte) 122)) {
                for (int i_4_ = 0; i_4_ < class318_sub7.aClass181_6441.anInt2422; i_4_++)
                    class318_sub7.method2513(var_ha, 1, l, 3, !aBoolean6473);
            }
            aBoolean6484 = false;
        }
        for (Class318_Sub7 class318_sub7 = (Class318_Sub7) aClass243_6478.method1872(8); class318_sub7 != null; class318_sub7 = (Class318_Sub7) aClass243_6478.method1878((byte) -72))
            class318_sub7.method2513(var_ha, i, l, 3, !aBoolean6473);
        aLong6471 = l;
        return true;
    }

    final void method2536(ha var_ha, long l, Class129[] class129s, Class342[] class342s, boolean bool) {
        if (!this.aBoolean6470) {
            method2532(var_ha, class129s, bool);
            method2538(class342s, bool);
            aLong6472 = l;
        }
    }

    private final void method2537() {
        aBoolean6473 = false;
    }

    private final void method2538(Class342[] class342s, boolean bool) {
        for (int i = 0; i < 8; i++)
            aBooleanArray6477[i] = false;
        while_112_:
        for (Class348_Sub42_Sub20 class348_sub42_sub20 = ((Class348_Sub42_Sub20) this.aClass262_6479.method1995(4)); class348_sub42_sub20 != null; class348_sub42_sub20 = (Class348_Sub42_Sub20) this.aClass262_6479.method1990((byte) 85)) {
            if (class342s != null) {
                for (int i = 0; i < class342s.length; i++) {
                    if ((class348_sub42_sub20.aClass342_9702) == class342s[i] || ((class348_sub42_sub20.aClass342_9702) == class342s[i].aClass342_4248)) {
                        aBooleanArray6477[i] = true;
                        class348_sub42_sub20.method3279(2);
                        continue while_112_;
                    }
                }
            }
            if (!bool) {
                class348_sub42_sub20.method2715((byte) 108);
                anInt6485--;
                if (class348_sub42_sub20.method3164((byte) 1)) {
                    class348_sub42_sub20.method3162(true);
                    Class318_Sub7.anInt6450--;
                }
            }
        }
        if (class342s != null) {
            for (int i = 0; i < class342s.length; i++) {
                if (i == 8 || anInt6485 == 8) break;
                if (!aBooleanArray6477[i]) {
                    Class348_Sub42_Sub20 class348_sub42_sub20 = null;
                    if ((class342s[i].method2685((byte) -13).anInt2296) == 1 && Class318_Sub7.anInt6450 < 32) {
                        class348_sub42_sub20 = new Class348_Sub42_Sub20(class342s[i], this);
                        Class367_Sub11.aClass32_7415.method335(class348_sub42_sub20, -8098, class342s[i].anInt4245);
                        Class318_Sub7.anInt6450++;
                    }
                    if (class348_sub42_sub20 == null) class348_sub42_sub20 = new Class348_Sub42_Sub20(class342s[i], this);
                    this.aClass262_6479.method1999(class348_sub42_sub20, -20180);
                    anInt6485++;
                    aBooleanArray6477[i] = true;
                }
            }
        }
    }

    final Class98 method2539() {
        this.aClass98_6481.aClass88_1569.method845((byte) 43);
        for (int i = 0; i < (this.aClass318_Sub9_Sub2_Sub1Array6475).length; i++) {
            if ((this.aClass318_Sub9_Sub2_Sub1Array6475[i] != null) && this.aClass318_Sub9_Sub2_Sub1Array6475[i].aClass318_Sub7_10419 != null) this.aClass98_6481.aClass88_1569.method844((this.aClass318_Sub9_Sub2_Sub1Array6475[i]), true);
        }
        return this.aClass98_6481;
    }

    final void method2540(long l) {
        aLong6472 = l;
    }

    private Class318_Sub10(int i, boolean bool) {
        this.aBoolean6470 = false;
        aClass243_6478 = new Class243();
        anInt6480 = 0;
        this.aClass262_6479 = new Class262();
        this.aBoolean6482 = false;
        anInt6485 = 0;
        aBoolean6484 = false;
        this.aClass98_6481 = new Class98();
        this.aClass318_Sub9_Sub2_Sub1Array6475 = new Class318_Sub9_Sub2_Sub1[8192];
        method2531(i, bool);
    }
}
