/* Class352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class352 {
    static int anInt4330;
    static Class114 aClass114_4331 = new Class114(31, -1);
    FontRenderer aFontRenderer_4332;
    FontMetrics aFontMetrics_4333 = null;
    static int anInt4334;
    static int anInt4335;
    static int anInt4336;
    static int anInt4337 = -2;

    public static void method3458(int i) {
        if (i != 2672) method3459(null, -32, 14, -44, 95);
        aClass114_4331 = null;
    }

    static final void method3459(Class348_Sub34 class348_sub34, int i, int i_0_, int i_1_, int i_2_) {
        anInt4330++;
        long l = i_0_ << 14 | i << 28 | i_1_;
        Class348_Sub37 class348_sub37 = (Class348_Sub37) Class130.aClass356_1895.method3480(l, -6008);
        if (class348_sub37 == null) {
            class348_sub37 = new Class348_Sub37();
            Class130.aClass356_1895.method3483((byte) 50, l, class348_sub37);
            class348_sub37.aClass262_6998.method1999(class348_sub34, -20180);
        } else {
            ItemDefinition itemDefinition = Exception_Sub1.aClass255_112.method1940(i_2_ ^ ~0x72, (class348_sub34.anInt6973));
            int i_3_ = itemDefinition.anInt2819;
            if (i_2_ == (~itemDefinition.anInt2820)) i_3_ *= 1 + class348_sub34.anInt6971;
            for (Class348_Sub34 class348_sub34_4_ = (Class348_Sub34) class348_sub37.aClass262_6998.method1995(i_2_ + 6); class348_sub34_4_ != null; class348_sub34_4_ = (Class348_Sub34) class348_sub37.aClass262_6998.method1990((byte) 34)) {
                itemDefinition = (Exception_Sub1.aClass255_112.method1940(104, class348_sub34_4_.anInt6973));
                int i_5_ = itemDefinition.anInt2819;
                if (itemDefinition.anInt2820 == 1) i_5_ *= class348_sub34_4_.anInt6971 - -1;
                if (i_3_ > i_5_) {
                    Class348_Sub42_Sub16_Sub2.method3265(i_2_ ^ 0x6c, class348_sub34, class348_sub34_4_);
                    return;
                }
            }
            class348_sub37.aClass262_6998.method1999(class348_sub34, i_2_ ^ 0x4ed2);
        }
    }

    Class352(FontRenderer fontRenderer) {
        this.aFontRenderer_4332 = null;
        this.aFontRenderer_4332 = fontRenderer;
    }

    Class352(FontRenderer fontRenderer, FontMetrics fontMetrics) {
        this.aFontRenderer_4332 = null;
        try {
            this.aFontMetrics_4333 = fontMetrics;
            this.aFontRenderer_4332 = fontRenderer;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("el.<init>(" + (fontRenderer != null ? "{...}" : "null") + ',' + (fontMetrics != null ? "{...}" : "null") + ')'));
        }
    }
}
