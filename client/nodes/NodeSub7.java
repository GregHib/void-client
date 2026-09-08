/* NodeSub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub7
/**
 * RENAMED from `Class348_Sub7` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    static int anInt6641;
    int anInt6642;
    static Component170 aClass207_6643;
    static Component267 aClass229_6644 = new Component267();
    int anInt6645;
    static int anInt6646;
    int anInt6647;
    int anInt6648;
    int anInt6649;
    boolean aBoolean6650;
    static long aLong6651 = -1L;
    static int anInt6652 = 0;
    static Component373 aClass33_6653;

    static final void method2772(int i, byte i_0_) {
        anInt6641++;
        if (Component233.method2547(i, (byte) 84) && i_0_ > 105) {
            DisplayModeManagerContainer57[] class46s = DefinitionSub33.openInterfaces[i];
            for (int i_1_ = 0; i_1_ < class46s.length; i_1_++) {
                DisplayModeManagerContainer57 class46 = class46s[i_1_];
                if (class46 != null) {
                    class46.anInt795 = 0;
                    class46.anInt730 = 1;
                    class46.anInt841 = 0;
                }
            }
        }
    }

    public static void method2773(int i) {
        aClass207_6643 = null;
        aClass229_6644 = null;
        if (i == 0) aClass33_6653 = null;
    }

    NodeSub7(int i, int i_2_, int i_3_, int i_4_, int i_5_, boolean bool) {
        this.anInt6647 = i_4_;
        this.anInt6645 = i_3_;
        this.anInt6648 = i_2_;
        this.aBoolean6650 = bool;
        this.anInt6642 = i_5_;
        this.anInt6649 = i;
    }
}
