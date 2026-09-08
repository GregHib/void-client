/* Component325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component325
/**
 * RENAMED from `Class69` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt1191;
    static int anInt1192;
    static int anInt1193;
    static int anInt1194;
    static Component325 aClass69_1195 = new Component325();
    static int anInt1196;
    static Component325 aClass69_1197 = new Component325();
    static Component325 aClass69_1198 = new Component325();
    static Component325 aClass69_1199 = new Component325();
    static int occluderCountB;
    static Component75 aClass173_1201 = new Component75();
    static int anInt1202;

    static final void method720(int i, int i_0_) {
        anInt1193++;
        Component39.anInt2251 = i;
        synchronized (Component387.aClass60_1894) {
            if (i_0_ != 1226) aClass173_1201 = null;
            Component387.aClass60_1894.clear(0);
        }
        synchronized (DisplayModeManagerContainer310.aClass60_355) {
            DisplayModeManagerContainer310.aClass60_355.clear(0);
        }
    }

    static final void method721(HashNode class348_sub42, HashNode class348_sub42_1_, int i) {
        do {
            try {
                if (class348_sub42_1_.previous != null) class348_sub42_1_.unlink(true);
                anInt1194++;
                class348_sub42_1_.next = class348_sub42;
                class348_sub42_1_.previous = class348_sub42.previous;
                class348_sub42_1_.previous.next = class348_sub42_1_;
                class348_sub42_1_.next.previous = class348_sub42_1_;
                if (i == -1) break;
                aClass69_1199 = null;
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("kea.B(" + (class348_sub42 != null ? "{...}" : "null") + ',' + (class348_sub42_1_ != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    public Component325() {
        /* empty */
    }

    public static void method722(int i) {
        aClass69_1198 = null;
        if (i != 13569) aClass69_1199 = null;
        aClass69_1197 = null;
        aClass69_1195 = null;
        aClass69_1199 = null;
        aClass173_1201 = null;
    }

    static final boolean method723(int i, int i_2_, byte i_3_) {
        anInt1196++;
        if (i_3_ >= -66) return true;
        return (Component219.method2352(113, i_2_, i) & ClientErrorReporter.hasRoofFlag(i, i_2_, -29));
    }

    static final boolean method724(int i, int i_4_, int i_5_) {
        anInt1191++;
        if (i_5_ != 393216) method723(25, 30, (byte) -113);
        return Component219.method2352(124, i_4_, i) | (0x60000 & i) != 0 || Component224.method2056(i, 90, i_4_) || method723(i, i_4_, (byte) -120);
    }

    public final String toString() {
        anInt1192++;
        throw new IllegalStateException();
    }
}
