/* Component118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Component118
/**
 * RENAMED from `Class288` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface12 {
    int anInt4950;
    int anInt4951;
    DisplayModeManagerContainer196 aClass341_4952;
    /** Work-in-progress channel ({@code id}=2). */
    static BuildType WIP = new BuildType("WIP", 2);
    static int anInt4954;
    Component85 aClass221_4955;
    static int anInt4956;
    static int anInt4957;
    int anInt4958;

    public static void method2185(int i) {
        WIP = null;
        if (i != 2) WIP = null;
    }

    static final int method2186(byte i, String string) {
        anInt4954++;
        if (i != -114) method2187(-85, -44, 56);
        return string.length() + 2;
    }

    static final boolean method2187(int i, int i_0_, int i_1_) {
        anInt4956++;
        if (i_0_ > -70) method2187(-57, -121, 54);
        return ((Node.method2709(i_1_, i, -1) | DisplayModeManagerContainer369.method1613(false, i_1_, i) | Component40.method2259(0, i_1_, i)) & DisplayModeManagerContainer370.method616(2, i, i_1_));
    }

    public DisplayModeManagerContainer369 method51(byte i) {
        if (i <= 116) method2186((byte) 116, null);
        anInt4957++;
        return DefinitionSub21.aClass223_9274;
    }

    Component118(int i, Component85 class221, DisplayModeManagerContainer196 class341, int i_2_, int i_3_) {
        try {
            this.anInt4950 = i_2_;
            this.anInt4958 = i;
            this.anInt4951 = i_3_;
            this.aClass221_4955 = class221;
            this.aClass341_4952 = class341;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("vr.<init>(" + i + ',' + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ')'));
        }
    }
}
