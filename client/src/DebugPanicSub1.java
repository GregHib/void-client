/* DebugPanicSub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Source;

final class DebugPanicSub1
/**
 * RENAMED from `Class285_Sub1`
 * Evidence: subclass of DebugPanic (hierarchy)
 */ extends DebugPanic implements Interface5_Impl1 {
    static int anInt8483;
    static int anInt8484;
    static int anInt8485;
    static int anInt8486;
    static int anInt8487;
    static int anInt8488;
    static int anInt8489;
    static int anInt8490;
    private byte aByte8491;
    static int anInt8492 = 0;
    static int anInt8493;
    static int anInt8494;
    static int anInt8495;

    static final String method2127(int i, String string) {
        if (i != 2) return null;
        anInt8483++;
        if (string == null) return null;
        int i_0_ = 0;
        int i_1_;
        for (i_1_ = string.length(); i_1_ > i_0_; i_0_++) {
            if (!AssetCacheLoader.method311((byte) 113, string.charAt(i_0_))) break;
        }
        for (/**/; (i_0_ < i_1_ && AssetCacheLoader.method311((byte) 104, string.charAt(i_1_ + -1))); i_1_--) {
            /* empty */
        }
        int i_2_ = i_1_ + -i_0_;
        if (i_2_ < 1 || i_2_ > 12) return null;
        StringBuffer stringbuffer = new StringBuffer(i_2_);
        for (int i_3_ = i_0_; i_1_ > i_3_; i_3_++) {
            char c = string.charAt(i_3_);
            if (Component284.method1849(c, i + 108)) {
                char c_4_ = DisplayModeManagerContainer260.method2184(c, -10072);
                if (c_4_ != 0) stringbuffer.append(c_4_);
            }
        }
        if (stringbuffer.length() == 0) return null;
        return stringbuffer.toString();
    }

    static final DummyClass method2128(int i, Buffer class348_sub49) {
        anInt8495++;
        Component76 class369_sub3 = NodeSub46.method3322(0, class348_sub49);
        int i_5_ = class348_sub49.readShort(13638);
        return (new DummyClass(class369_sub3.aClass221_4968, class369_sub3.aClass341_4973, class369_sub3.anInt4970, class369_sub3.anInt4959, class369_sub3.anInt4971, class369_sub3.anInt4963, class369_sub3.anInt4966, class369_sub3.anInt4965, class369_sub3.anInt4961, class369_sub3.anInt8599, class369_sub3.anInt8595, class369_sub3.anInt8603, class369_sub3.anInt8602, class369_sub3.anInt8600, class369_sub3.anInt8597, i_5_));
    }

    static final void method2129(byte i) {
        anInt8494++;
        Component158.aHa326.loadModelviewMatrix(r.aClass101_9720);
        if (i < 9) anInt8492 = -40;
        Component158.aHa326.DA(Component253.anInt3202, DisplayModeManagerContainer348.anInt5886, DisplayModeManagerContainer288.anInt8630, DisplayModeManagerContainer91.anInt394);
    }

    public final void method21(int i) {
        super.method21(i);
        anInt8485++;
    }

    public final boolean method18(int i) {
        if (i != 6331) anInt8492 = -14;
        anInt8489++;
        return super.method2123((this.aClass377_4759.aMapBuffer9915), i ^ 0x18bb);
    }

    final int method2130(int i) {
        if (i != 3545) return -18;
        anInt8487++;
        return aByte8491;
    }

    public final jaclib.memory.Buffer method19(boolean bool, int i) {
        anInt8490++;
        if (i != 26775) aByte8491 = (byte) 7;
        return super.method2120(0, (this.aClass377_4759.aMapBuffer9915), bool);
    }

    public final int method16(boolean bool) {
        anInt8486++;
        if (bool != false) method18(-20);
        return super.method16(bool);
    }

    public final boolean method17(Source source, int i, int i_6_, byte i_7_) {
        anInt8484++;
        aByte8491 = (byte) i;
        if (i_7_ >= -15) aByte8491 = (byte) 62;
        super.method2121(25625, source, i_6_);
        return true;
    }

    DebugPanicSub1(GlExtensionManager class377, boolean bool) {
        super(class377, 34962, bool);
    }

    public final boolean method20(int i, byte i_8_, int i_9_) {
        anInt8488++;
        aByte8491 = (byte) i_9_;
        super.method23(15959, i);
        if (i_8_ <= 122) method18(-86);
        return true;
    }

    static final void method2131(int i) {
        if (i == 0) {
            if (Npc.anInt10503 == 2) {
                LoggedOutDefinition.aClass293Array9432[0].method2206(Component144.aClass315Array3982[0]);
                LoggedOutDefinition.aClass293Array9432[1].method2206(Component144.aClass315Array3982[1]);
            } else if (Npc.anInt10503 == 3) {
                LoggedOutDefinition.aClass293Array9432[0].method2206(Component144.aClass315Array3982[0]);
                LoggedOutDefinition.aClass293Array9432[1].method2206(Component144.aClass315Array3982[1]);
                LoggedOutDefinition.aClass293Array9432[2].method2206(Component144.aClass315Array3982[2]);
            } else {
                LoggedOutDefinition.aClass293Array9432[0].method2206(Component144.aClass315Array3982[0]);
                LoggedOutDefinition.aClass293Array9432[1].method2206(Component144.aClass315Array3982[1]);
                LoggedOutDefinition.aClass293Array9432[2].method2206(Component144.aClass315Array3982[2]);
                LoggedOutDefinition.aClass293Array9432[3].method2206(Component144.aClass315Array3982[3]);
            }
        } else if (i == 1) {
            if (Npc.anInt10503 == 2) LoggedOutDefinition.aClass293Array9432[0].method2206(Component144.aClass315Array3982[2]);
            else if (Npc.anInt10503 == 3) {
                LoggedOutDefinition.aClass293Array9432[0].method2206(Component144.aClass315Array3982[3]);
                LoggedOutDefinition.aClass293Array9432[1].method2206(Component144.aClass315Array3982[4]);
            } else {
                LoggedOutDefinition.aClass293Array9432[0].method2206(Component144.aClass315Array3982[4]);
                LoggedOutDefinition.aClass293Array9432[1].method2206(Component144.aClass315Array3982[5]);
                LoggedOutDefinition.aClass293Array9432[2].method2206(Component144.aClass315Array3982[6]);
            }
        } else if (i == 2) {
            if (Npc.anInt10503 == 2) LoggedOutDefinition.aClass293Array9432[0].method2206(Component144.aClass315Array3982[3]);
            else if (Npc.anInt10503 == 3) LoggedOutDefinition.aClass293Array9432[0].method2206(Component144.aClass315Array3982[5]);
            else LoggedOutDefinition.aClass293Array9432[0].method2206(Component144.aClass315Array3982[7]);
        }
    }
}
