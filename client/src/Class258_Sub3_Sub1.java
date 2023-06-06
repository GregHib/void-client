/* Class258_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class258_Sub3_Sub1 extends Class258_Sub3 {
    float aFloat9937;
    float aFloat9938;
    int anInt9939;
    int anInt9940;
    boolean aBoolean9941;
    static int anInt9942;

    Class258_Sub3_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_0_, int i_1_, int i_2_) {
        super(var_ha_Sub2, i, i_0_, i_1_, i_2_);
        if (this.anInt4849 == 34037) {
            this.aFloat9938 = (float) i_2_;
            this.aBoolean9941 = false;
            this.aFloat9937 = (float) i_1_;
        } else {
            this.aBoolean9941 = true;
            this.aFloat9937 = this.aFloat9938 = 1.0F;
        }
        this.anInt9940 = i_1_;
        this.anInt9939 = i_2_;
    }

    Class258_Sub3_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_3_, int i_4_, int i_5_, int i_6_) {
        super(var_ha_Sub2, 3553, i, i_5_, i_6_);
        this.aFloat9937 = (float) i_3_ / (float) i_5_;
        this.anInt9939 = i_4_;
        this.anInt9940 = i_3_;
        this.aFloat9938 = (float) i_4_ / (float) i_6_;
        this.aBoolean9941 = false;
        this.method1965(false, false, 10243);
    }

    Class258_Sub3_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool) {
        super(var_ha_Sub2, i, i_7_, i_8_, i_9_, i_10_);
        this.anInt9940 = i_9_;
        if (this.anInt4849 == 34037) {
            this.aBoolean9941 = false;
            this.aFloat9937 = (float) i_9_;
            this.aFloat9938 = (float) i_10_;
        } else {
            this.aBoolean9941 = true;
            this.aFloat9937 = this.aFloat9938 = 1.0F;
        }
        this.anInt9939 = i_10_;
    }

    static final void method1971(int i, String string, boolean bool, int i_11_) {
        anInt9942++;
        Class59_Sub1_Sub1.method556(false);
        Class341.method2681(9864);
        Class348_Sub22.method2959(-1);
        Class348_Sub23.method2965(string, i_11_, bool, 0);
        Class348_Sub24.method2994(2);
        Class170.method1311(5139, Class348_Sub8.aHa6654);
        Class369.method3568(Class348_Sub8.aHa6654, 4);
        Class255.method1933(Class21.aClass45_322, Class348_Sub8.aHa6654, true);
        Class274.method2061(-128);
        Class101.method901(Class113.aClass105Array1744, 515880227);
        Class354.method3466(i ^ ~0x4f);
        Class348_Sub40.method3038(-1);
        if (Class240.anInt4674 == 3) Class348_Sub49.method3379(2, 4);
        else if (Class240.anInt4674 == 7) Class348_Sub49.method3379(2, 8);
        else if (Class240.anInt4674 != 10) {
            if (Class240.anInt4674 == 1 || Class240.anInt4674 == 2) InputStreamBuffer.method3616(12639);
        } else Class348_Sub49.method3379(2, 11);
    }

    Class258_Sub3_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool) {
        super(var_ha_Sub2, 3553, i, i_12_, i_15_, i_16_);
        this.anInt9940 = i_13_;
        this.aFloat9938 = (float) i_14_ / (float) i_16_;
        this.aFloat9937 = (float) i_13_ / (float) i_15_;
        this.anInt9939 = i_14_;
        this.aBoolean9941 = false;
        this.method1965(false, false, 10243);
    }

    Class258_Sub3_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_17_, int i_18_, int i_19_, int i_20_, byte[] is, int i_21_) {
        super(var_ha_Sub2, 3553, i, i_19_, i_20_);
        try {
            this.anInt9940 = i_17_;
            this.anInt9939 = i_18_;
            this.method1970(0, 0, i_17_, true, 0, i_18_, i_21_, 127, is, 0);
            this.aFloat9938 = (float) i_18_ / (float) i_20_;
            this.aFloat9937 = (float) i_17_ / (float) i_19_;
            this.aBoolean9941 = false;
            this.method1965(false, false, 10243);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("eba.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + (is != null ? "{...}" : "null") + ',' + i_21_ + ')'));
        }
    }

    Class258_Sub3_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_22_, int i_23_, boolean bool, int[] is, int i_24_, int i_25_) {
        super(var_ha_Sub2, i, 6408, i_22_, i_23_, bool, is, i_24_, i_25_, true);
        try {
            if (this.anInt4849 == 34037) {
                this.aFloat9937 = (float) i_22_;
                this.aBoolean9941 = false;
                this.aFloat9938 = (float) i_23_;
            } else {
                this.aBoolean9941 = true;
                this.aFloat9937 = this.aFloat9938 = 1.0F;
            }
            this.anInt9939 = i_23_;
            this.anInt9940 = i_22_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("eba.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_22_ + ',' + i_23_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_24_ + ',' + i_25_ + ')'));
        }
    }

    Class258_Sub3_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_26_, int i_27_, int i_28_, int[] is) {
        super(var_ha_Sub2, 3553, 6408, i_27_, i_28_);
        try {
            this.anInt9940 = i;
            this.anInt9939 = i_26_;
            this.method1964(true, i_26_, 0, is, 0, (byte) -73, i, 0, 0);
            this.aFloat9937 = (float) i / (float) i_27_;
            this.aFloat9938 = (float) i_26_ / (float) i_28_;
            this.aBoolean9941 = false;
            this.method1965(false, false, 10243);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("eba.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    Class258_Sub3_Sub1(ha_Sub2 var_ha_Sub2, int i, int i_29_, int i_30_, int i_31_, boolean bool, byte[] is, int i_32_) {
        super(var_ha_Sub2, i, i_29_, i_30_, i_31_, bool, is, i_32_, true);
        try {
            this.anInt9940 = i_30_;
            if (this.anInt4849 == 34037) {
                this.aFloat9938 = (float) i_31_;
                this.aBoolean9941 = false;
                this.aFloat9937 = (float) i_30_;
            } else {
                this.aBoolean9941 = true;
                this.aFloat9937 = this.aFloat9938 = 1.0F;
            }
            this.anInt9939 = i_31_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("eba.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_32_ + ')'));
        }
    }
}
