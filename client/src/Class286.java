/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class286 {
    static int anInt3681;
    static int anInt3682;
    static Class348_Sub2 aClass348_Sub2_3683;
    ha_Sub2 aHa_Sub2_3684;

    abstract void method2133(int i);

    abstract void method2134(boolean bool, boolean bool_0_);

    public static void method2135(int i) {
        if (i == 0) aClass348_Sub2_3683 = null;
    }

    abstract void method2136(int i, int i_1_, byte i_2_);

    abstract boolean method2137(int i);

    static final boolean method2138(int i) {
        anInt3681++;
        Class348_Sub48 class348_sub48 = (Class348_Sub48) Class348_Sub35.aClass262_6978.method1995(4);
        if (class348_sub48 == null) return false;
        int i_3_ = 118 % ((-40 - i) / 50);
        for (int i_4_ = 0; (class348_sub48.anInt7126 > i_4_); i_4_++) {
            if ((class348_sub48.aClass144Array7135[i_4_] != null) && (class348_sub48.aClass144Array7135[i_4_].anInt1997) == 0) return false;
            if ((class348_sub48.aClass144Array7127[i_4_] != null) && (class348_sub48.aClass144Array7127[i_4_].anInt1997) == 0) return false;
        }
        return true;
    }

    abstract void method2139(boolean bool, byte i);

    abstract void method2140(Class258 class258, byte i, int i_5_);

    Class286(ha_Sub2 var_ha_Sub2) {
        this.aHa_Sub2_3684 = var_ha_Sub2;
    }
}
