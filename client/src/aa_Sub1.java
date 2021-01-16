/* aa_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class aa_Sub1 extends aa {
    static s[] aSArray5191;
    static int[] anIntArray5192;
    Class258_Sub3_Sub1 aClass258_Sub3_Sub1_5193;

    public static void method161(int i) {
        int i_0_ = -70 / ((i - 42) / 48);
        aSArray5191 = null;
        anIntArray5192 = null;
    }

    aa_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_1_, byte[] is) {
        try {
            ((aa_Sub1) this).aClass258_Sub3_Sub1_5193
                    = Class371.method3583(false, is, 6406, i_1_, var_ha_Sub2, -119,
                    6406, i);
            ((aa_Sub1) this).aClass258_Sub3_Sub1_5193.method1965(false, false,
                    10243);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ag.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_1_ + ','
                            + (is != null ? "{...}" : "null")
                            + ')'));
        }
    }
}
