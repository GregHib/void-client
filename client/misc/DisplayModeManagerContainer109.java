/* DisplayModeManagerContainer109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer109
/**
 * RENAMED from `Class178` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2336;
    static int anInt2337;
    static Component183 aClass114_2338 = new Component183(92, -1);
    static Component336 aClass29_2339 = new Component336(14, 0);
    static int anInt2340;
    static Component336 aClass29_2341 = new Component336(15, 4);
    static Component336 aClass29_2342 = new Component336(16, -2);
    static Component336 aClass29_2343 = new Component336(17, 0);
    static Component336 aClass29_2344 = new Component336(18, -2);
    static Component336 aClass29_2345 = new Component336(19, -2);
    static Component336 aClass29_2346 = new Component336(20, 6);
    static Component336 aClass29_2347 = new Component336(21, 9);
    static Component336 aClass29_2348 = new Component336(22, -2);
    static Component336 aClass29_2349 = new Component336(23, 4);
    static Component336 aClass29_2350 = new Component336(24, -1);
    static Component336 aClass29_2351 = new Component336(26, 0);
    static Component336 aClass29_2352 = new Component336(27, 0);
    static Component336 aClass29_2353 = new Component336(28, -2);
    private static Component336[] aClass29Array2354 = new Component336[32];

    public static void method1355(int i) {
        aClass29_2346 = null;
        aClass29_2349 = null;
        aClass29_2344 = null;
        aClass29_2352 = null;
        aClass114_2338 = null;
        if (i > -74) method1356(true, null, -116, -47, true, null, true);
        aClass29_2350 = null;
        aClass29Array2354 = null;
        aClass29_2353 = null;
        aClass29_2351 = null;
        aClass29_2339 = null;
        aClass29_2343 = null;
        aClass29_2341 = null;
        aClass29_2345 = null;
        aClass29_2342 = null;
        aClass29_2348 = null;
        aClass29_2347 = null;
    }

    static final void method1356(boolean bool, String string, int i, int i_0_, boolean bool_1_, String string_2_, boolean bool_3_) {
        try {
            anInt2337++;
            RadixParser.aClass45_2306.discardMode = 1;
            string_2_ = string_2_.toLowerCase();
            short[] is = new short[16];
            int i_4_ = -1;
            String string_5_ = null;
            if (i_0_ != -1) {
                Component355 class254 = MatrixSub3.aClass326_5764.method2600(i_0_, 28364);
                if (class254 == null || bool != class254.method1925(!bool_3_)) return;
                if (class254.method1925(!bool_3_)) string_5_ = class254.aString3258;
                else i_4_ = class254.anInt3256;
            }
            int i_6_ = 0;
            int i_7_ = 0;
            if (bool_3_ != true) aClass29_2352 = null;
            for (/**/; i_7_ < Exception_Sub1.itemDefinitions.itemCount; i_7_++) {
                ItemDefinition class213 = Exception_Sub1.itemDefinitions.getItemDefinition(-74, i_7_);
                if ((!bool_1_ || class213.aBoolean2755) && class213.anInt2833 == -1 && class213.anInt2812 == -1 && class213.anInt2799 == 0 && class213.itemName.toLowerCase().indexOf(string_2_) != -1) {
                    if (i_0_ != -1) {
                        if (bool) {
                            if (!string.equals(class213.method1561(string_5_, i_0_, -1511086397))) continue;
                        } else if (class213.method1567(i_4_, -116, i_0_) != i) continue;
                    }
                    if (i_6_ >= 250) {
                        Component353.aShortArray2579 = null;
                        DisplayModeManagerContainer154.anInt1285 = -1;
                        return;
                    }
                    if (is.length <= i_6_) {
                        short[] is_8_ = new short[2 * is.length];
                        for (int i_9_ = 0; i_9_ < i_6_; i_9_++)
                            is_8_[i_9_] = is[i_9_];
                        is = is_8_;
                    }
                    is[i_6_++] = (short) i_7_;
                }
            }
            Component353.aShortArray2579 = is;
            DisplayModeManagerContainer154.anInt1285 = i_6_;
            Component3.anInt2037 = 0;
            String[] strings = new String[DisplayModeManagerContainer154.anInt1285];
            for (int i_10_ = 0; DisplayModeManagerContainer154.anInt1285 > i_10_; i_10_++)
                strings[i_10_] = Exception_Sub1.itemDefinitions.getItemDefinition(123, is[i_10_]).itemName;
            RadixParser.method1333(Component353.aShortArray2579, 26073, strings);
            RadixParser.aClass45_2306.clearUnpacked((byte) 116);
            RadixParser.aClass45_2306.discardMode = 2;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("qa.A(" + bool + ',' + (string != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + bool_1_ + ',' + (string_2_ != null ? "{...}" : "null") + ',' + bool_3_ + ')'));
        }
    }

    static {
        Component336[] class29s = Component364.method188((byte) 59);
        for (int i = 0; i < class29s.length; i++)
            aClass29Array2354[class29s[i].anInt400] = class29s[i];
    }
}
