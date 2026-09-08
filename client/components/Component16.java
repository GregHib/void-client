/* Component16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component16
/**
 * RENAMED from `Class172` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2277;
    static int anInt2278;
    static Component183 aClass114_2279 = new Component183(60, 0);
    /** Friend chat ranks / privilege bytes. */
    static int[] friendRanks = new int[200];
    static int anInt2281;

    public static void method1325(int i) {
        friendRanks = null;
        if (i <= -123) aClass114_2279 = null;
    }

    static final BrowserUrlOpener method1326(BrowserUrlOpener class348_sub16_sub3, int i) {
        anInt2278++;
        BrowserUrlOpener class348_sub16_sub3_0_ = (class348_sub16_sub3 == null ? new BrowserUrlOpener() : new BrowserUrlOpener(class348_sub16_sub3));
        class348_sub16_sub3_0_.flushPending(i, -94, 128);
        return class348_sub16_sub3_0_;
    }

    static final int method1327(int i) {
        if (i <= 17) friendRanks = null;
        anInt2277++;
        return Sprite.anInt6924;
    }

    static final void method1328(int i) {
        if (i != -26162) friendRanks = null;
        StringCache.aClass60_4327.purgeSoftReferences(-118);
        anInt2281++;
        Component142.aClass60_4417.purgeSoftReferences(-89);
        ColoredText.aClass60_6096.purgeSoftReferences(-87);
        DefinitionSub9.aClass60_9171.purgeSoftReferences(-95);
    }
}
