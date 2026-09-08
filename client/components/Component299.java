/* Component299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component299
/**
 * RENAMED from `Class32` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt447;
    private final int anInt448;
    static int anInt449;
    static int anInt450;
    static int anInt451 = -1;
    private final HashNode[] aClass348_Sub42Array452;
    private long aLong453;
    private HashNode aClass348_Sub42_454;
    static int anInt455;

    final HashNode method334(long l, byte i) {
        try {
            aLong453 = l;
            anInt449++;
            HashNode class348_sub42 = aClass348_Sub42Array452[(int) ((long) (anInt448 - 1) & l)];
            for (aClass348_Sub42_454 = class348_sub42.next; class348_sub42 != aClass348_Sub42_454; aClass348_Sub42_454 = (aClass348_Sub42_454.next)) {
                if (aClass348_Sub42_454.accessAge == l) {
                    HashNode class348_sub42_0_ = aClass348_Sub42_454;
                    aClass348_Sub42_454 = (aClass348_Sub42_454.next);
                    return class348_sub42_0_;
                }
            }
            if (i <= 0) aClass348_Sub42_454 = null;
            aClass348_Sub42_454 = null;
            return null;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "ib.C(" + l + ',' + i + ')');
        }
    }

    final void method335(HashNode class348_sub42, int i, long l) {
        try {
            anInt447++;
            if (i != -8098) aClass348_Sub42_454 = null;
            if (class348_sub42.previous != null) class348_sub42.unlink(true);
            HashNode class348_sub42_1_ = aClass348_Sub42Array452[(int) (l & (long) (anInt448 - 1))];
            class348_sub42.previous = class348_sub42_1_.previous;
            class348_sub42.next = class348_sub42_1_;
            class348_sub42.previous.next = class348_sub42;
            class348_sub42.next.previous = class348_sub42;
            class348_sub42.accessAge = l;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ib.A(" + (class348_sub42 != null ? "{...}" : "null") + ',' + i + ',' + l + ')'));
        }
    }

    Component299(int i) {
        aClass348_Sub42Array452 = new HashNode[i];
        anInt448 = i;
        for (int i_2_ = 0; i_2_ < i; i_2_++) {
            HashNode class348_sub42 = aClass348_Sub42Array452[i_2_] = new HashNode();
            class348_sub42.next = class348_sub42;
            class348_sub42.previous = class348_sub42;
        }
    }

    final HashNode method336(boolean bool) {
        anInt455++;
        if (aClass348_Sub42_454 == null) return null;
        if (bool != true) return null;
        for (HashNode class348_sub42 = aClass348_Sub42Array452[(int) (aLong453 & (long) (-1 + anInt448))]; class348_sub42 != aClass348_Sub42_454; aClass348_Sub42_454 = (aClass348_Sub42_454.next)) {
            if (aLong453 == aClass348_Sub42_454.accessAge) {
                HashNode class348_sub42_3_ = aClass348_Sub42_454;
                aClass348_Sub42_454 = (aClass348_Sub42_454.next);
                return class348_sub42_3_;
            }
        }
        aClass348_Sub42_454 = null;
        return null;
    }
}
