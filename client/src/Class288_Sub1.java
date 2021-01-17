/* Class288_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class288_Sub1 extends Class288 {
    static int anInt8574;
    static float[] aFloatArray8575 = {1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
    static int anInt8576;
    int anInt8577;
    static int anInt8578;

    Class288_Sub1(int i, Class221 class221, Class341 class341, int i_0_, int i_1_, int i_2_) {
        super(i, class221, class341, i_0_, i_1_);
        try {
            this.anInt8577 = i_2_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("wg.<init>(" + i + ',' + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
        }
    }

    static final int method2188(int i) {
        anInt8578++;
        if (i != -30477) aFloatArray8575 = null;
        return 16;
    }

    static final Class288 method2189(Class348_Sub49 class348_sub49, int i) {
        anInt8576++;
        int i_3_ = class348_sub49.readShort(842397944);
        Class221 class221 = Class158.method1248(48)[class348_sub49.readUnsignedByte(255)];
        Class341 class341 = Class62.method596(20000)[class348_sub49.readUnsignedByte(255)];
        if (i <= 27) method2189(null, -35);
        int i_4_ = class348_sub49.method3372(13638);
        int i_5_ = class348_sub49.method3372(13638);
        return new Class288(i_3_, class221, class341, i_4_, i_5_);
    }

    public final Class223 method51(byte i) {
        anInt8574++;
        if (i <= 116) method2190(false);
        return Class28.aClass223_4997;
    }

    public static void method2190(boolean bool) {
        if (bool != true) aFloatArray8575 = null;
        aFloatArray8575 = null;
    }
}
