/* DisplayModeManagerContainer154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer154
/**
 * RENAMED from `Class76` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt1278;
    /** Local/dev world-list channel. */
    static NamedInteger LOCAL = new NamedInteger("LOCAL", 4);
    static int anInt1280;
    static int anInt1281;
    Component315 aClass243_1282 = new Component315();
    boolean aBoolean1283 = false;
    static int anInt1284;
    static int anInt1285;
    static RequestProcessor aClass169_1286;
    /** Camera pitch; clamped by {@code clampCameraAngles} (typically 1024..3072/4096). */
    static float cameraPitch = 1024.0F;
    static int anInt1288;

    static final boolean method771(int i, byte i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int[] is, int i_5_) {
        anInt1281++;
        if (i_3_ > Component314.anInt3872) i_3_ = Component314.anInt3872;
        if (i_4_ < 0) i_4_ = 0;
        if (i_0_ != -25) anInt1288 = -32;
        if (i_4_ >= i_3_) return true;
        i_5_ += -1 + i_4_;
        i_1_ += i * i_4_;
        i_2_ = -i_4_ + i_3_ >> 2;
        if (Component360.anInt4319 == 1) {
            Component241.occludedPixelCount += i_2_;
            while (--i_2_ >= 0) {
                if (is[++i_5_] > i_1_) is[i_5_] = i_1_;
                i_1_ += i;
                if (is[++i_5_] > i_1_) is[i_5_] = i_1_;
                i_1_ += i;
                if (i_1_ < is[++i_5_]) is[i_5_] = i_1_;
                i_1_ += i;
                if (is[++i_5_] > i_1_) is[i_5_] = i_1_;
                i_1_ += i;
            }
            i_2_ = 0x3 & i_3_ - i_4_;
            while (--i_2_ >= 0) {
                if (is[++i_5_] > i_1_) is[i_5_] = i_1_;
                i_1_ += i;
            }
        } else {
            i_1_ -= 38400;
            while (--i_2_ >= 0) {
                if (is[++i_5_] > i_1_) return false;
                i_1_ += i;
                if (is[++i_5_] > i_1_) return false;
                i_1_ += i;
                if (i_1_ < is[++i_5_]) return false;
                i_1_ += i;
                if (is[++i_5_] > i_1_) return false;
                i_1_ += i;
            }
            i_2_ = 0x3 & i_3_ - i_4_;
            while (--i_2_ >= 0) {
                if (i_1_ < is[++i_5_]) return false;
                i_1_ += i;
            }
        }
        return true;
    }

    public static void method772(byte i) {
        aClass169_1286 = null;
        LOCAL = null;
        if (i >= -110) method771(-68, (byte) 45, 58, 119, 101, -92, null, 79);
    }

    static final void method773(boolean bool) {
        DefinitionSub10.aBoolean9181 = bool;
        anInt1284++;
    }

    final void method774(RenderableSub4 class318_sub4, int i) {
        anInt1280++;
        RenderableObject class318_sub1 = class318_sub4.aClass318_Sub1_6410;
        boolean bool = true;
        RenderableSub3[] class318_sub3s = class318_sub4.aClass318_Sub3Array6414;
        for (int i_6_ = 0; class318_sub3s.length > i_6_; i_6_++) {
            if (class318_sub3s[i_6_].aBoolean6401) {
                bool = false;
                break;
            }
        }
        if (!bool) {
            if (this.aBoolean1283) {
                for (RenderableSub4 class318_sub4_7_ = ((RenderableSub4) this.aClass243_1282.method1872(8)); class318_sub4_7_ != null; class318_sub4_7_ = (RenderableSub4) this.aClass243_1282.method1878((byte) -103)) {
                    if (class318_sub1 == (class318_sub4_7_.aClass318_Sub1_6410)) {
                        class318_sub4_7_.unlink(false);
                        Component350.method560(class318_sub4_7_, -41);
                    }
                }
            }
            for (RenderableSub4 class318_sub4_8_ = ((RenderableSub4) this.aClass243_1282.method1872(8)); class318_sub4_8_ != null; class318_sub4_8_ = (RenderableSub4) this.aClass243_1282.method1878((byte) -44)) {
                if (class318_sub1.anInt6389 >= class318_sub4_8_.aClass318_Sub1_6410.anInt6389) {
                    DebugOverlay.linkRenderable(class318_sub4_8_, class318_sub4, true);
                    return;
                }
            }
            if (i != 18802) aClass169_1286 = null;
            this.aClass243_1282.method1869(-107, class318_sub4);
        }
    }

    final void method775(byte i) {
        for (; ; ) {
            RenderableSub4 class318_sub4 = ((RenderableSub4) this.aClass243_1282.method1875(60));
            if (class318_sub4 == null) break;
            class318_sub4.unlink(false);
            Component350.method560(class318_sub4, 123);
        }
        anInt1278++;
        if (i != 69) anInt1288 = -20;
    }

    DisplayModeManagerContainer154(boolean bool) {
        this.aBoolean1283 = bool;
    }

    static {
        aClass169_1286 = new RequestProcessor();
    }
}
