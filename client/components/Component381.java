/* Component381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component381
/**
 * RENAMED from `Class369_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Component27 (hierarchy)
 */ extends Component27 {
    static int anInt8579;
    int anInt8580;
    static int anInt8581;
    int anInt8582;
    static int anInt8583 = -1;

    public final DisplayModeManagerContainer369 method51(byte i) {
        if (i <= 116) method51((byte) -95);
        anInt8581++;
        return Component55.aClass223_3934;
    }

    Component381(Component85 class221, DisplayModeManagerContainer196 class341, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        super(class221, class341, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
        try {
            this.anInt8580 = i_7_;
            this.anInt8582 = i_8_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("kh.<init>(" + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
        }
    }

    static final void method3570(boolean bool) {
        if (Definition.aClass279_7042 != null) Definition.aClass279_7042.process(-6858);
        anInt8579++;
        if (Component276.aClass279_2596 != null) Component276.aClass279_2596.process(-6858);
        if (bool != false) anInt8583 = 30;
    }
}
