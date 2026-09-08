/* Component383 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component383
/**
 * RENAMED from `Class288_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Component118 (hierarchy)
 */ extends Component118 {
    static int anInt8574;
    static float[] aFloatArray8575 = {1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
    static int anInt8576;
    int anInt8577;
    static int anInt8578;

    Component383(int i, Component85 class221, DisplayModeManagerContainer196 class341, int i_0_, int i_1_, int i_2_) {
        super(i, class221, class341, i_0_, i_1_);
        try {
            this.anInt8577 = i_2_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("wg.<init>(" + i + ',' + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
        }
    }

    static final int method2188(int i) {
        anInt8578++;
        if (i != -30477) aFloatArray8575 = null;
        return 16;
    }

    static final Component118 method2189(Buffer class348_sub49, int i) {
        anInt8576++;
        int i_3_ = class348_sub49.readUnsignedShort(842397944);
        Component85 class221 = HeapDumpHelper.method1248(48)[class348_sub49.readUnsignedByte(255)];
        DisplayModeManagerContainer196 class341 = Component240.method596(20000)[class348_sub49.readUnsignedByte(255)];
        if (i <= 27) method2189(null, -35);
        int i_4_ = class348_sub49.readShort(13638);
        int i_5_ = class348_sub49.readShort(13638);
        return new Component118(i_3_, class221, class341, i_4_, i_5_);
    }

    public final DisplayModeManagerContainer369 method51(byte i) {
        anInt8574++;
        if (i <= 116) method2190(false);
        return DisplayModeManagerContainer332.aClass223_4997;
    }

    public static void method2190(boolean bool) {
        if (bool != true) aFloatArray8575 = null;
        aFloatArray8575 = null;
    }
}
