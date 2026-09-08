/* Component140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component140
/**
 * RENAMED from `Class348_Sub42_Sub9_Sub1` (JODE-obfuscated).
 * Evidence: subclass of ReferenceHolder (hierarchy)
 */ extends ReferenceHolder {
    static int anInt10439;
    private final Object anObject10440;
    static int anInt10441;
    static LruCache aClass356_10442;
    static int anInt10443 = 2;
    static int anInt10444;
    static int anInt10445;

    final Object getReferent(int i) {
        if (i != 65536) getReferent(-30);
        anInt10441++;
        return anObject10440;
    }

    Component140(Interface14 interface14, Object object, int i) {
        super(interface14, i);
        try {
            anObject10440 = object;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ct.<init>(" + (interface14 != null ? "{...}" : "null") + ',' + (object != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final boolean isSoftRef(byte i) {
        int i_0_ = -50 / ((-63 - i) / 61);
        anInt10445++;
        return false;
    }

    public static void method3207(byte i) {
        int i_1_ = -126 % ((i - -27) / 61);
        aClass356_10442 = null;
    }

    static final void method3208(DisplayModeManagerContainer58 class318_sub1_sub3_sub3, int i, int i_2_) {
        anInt10439++;
        if (class318_sub1_sub3_sub3.anIntArray10236 != null) {
            int i_3_ = (class318_sub1_sub3_sub3.anIntArray10236[1 + i]);
            if (i_3_ != class318_sub1_sub3_sub3.anInt10286) {
                class318_sub1_sub3_sub3.anInt10322 = (class318_sub1_sub3_sub3.anInt10319);
                class318_sub1_sub3_sub3.anInt10286 = i_3_;
                class318_sub1_sub3_sub3.anInt10244 = 1;
                class318_sub1_sub3_sub3.anInt10232 = 0;
                class318_sub1_sub3_sub3.anInt10294 = 0;
                class318_sub1_sub3_sub3.anInt10267 = 0;
                if ((class318_sub1_sub3_sub3.anInt10286) != -1) DisplayModeManagerContainer260.method2178(class318_sub1_sub3_sub3, class318_sub1_sub3_sub3.anInt10267, (RunescapeInfo.aClass87_191.getSequence(class318_sub1_sub3_sub3.anInt10286, 7)), -83);
            }
        }
        if (i_2_ > -4) method3207((byte) -83);
    }

    static {
        aClass356_10442 = new LruCache(8);
    }
}
