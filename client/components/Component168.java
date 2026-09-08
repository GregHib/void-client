/* Component168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component168
/**
 * RENAMED from `Class315` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3944;
    static int anInt3945;
    private final Component315 aClass243_3946 = new Component315();
    static int anInt3947;
    static int anInt3948;
    static int anInt3949;
    static int anInt3950;
    static int anInt3951;
    static int anInt3952;
    String aString3953;
    static int anInt3954;
    static int anInt3955;
    private Component176 aClass293_3956;
    private volatile int anInt3957;

    final void method2353(RenderableObject class318_sub1, boolean bool) {
        class318_sub1.aBoolean6387 = bool;
        anInt3944++;
        synchronized (aClass243_3946) {
            aClass243_3946.method1869(-90, class318_sub1);
            anInt3957++;
        }
        if (aClass293_3956 != null) {
            synchronized (aClass293_3956) {
                aClass293_3956.notify();
            }
        }
    }

    static final boolean method2354(NamedInteger class364, int i) {
        anInt3954++;
        if (i != -1) method2355(-93, (byte) 115, true, null, -92, -67, 6);
        return WaterShaderSub8.WTRC == class364 || AssetCacheLoader.WTQA == class364 || Component83.WTWIP == class364 || class364 == DisplayModeManagerContainer173.WTI;
    }

    static final void method2355(int i, byte i_0_, boolean bool, CacheStore class45, int i_1_, int i_2_, int i_3_) {
        Component255.anInt1059 = i;
        anInt3948++;
        InputHandler.aBoolean4275 = bool;
        DebugPanic.aClass348_Sub16_Sub3_4743 = null;
        Component197.anInt10074 = i_1_;
        Component329.anInt5994 = i_3_;
        PlayerState.anInt7068 = 1;
        if (i_0_ != 50) method2357(-59, null);
        Renderable.anInt3971 = i_2_;
        DisplayModeManagerContainer77.aClass45_1848 = class45;
    }

    final void method2356(Component176 class293, byte i) {
        aClass293_3956 = class293;
        if (i != -108) method2358(-10, -55, 5);
        anInt3949++;
    }

    static final int method2357(int i, Player player) {
        anInt3951++;
        int i_4_ = (player.anInt10560);
        Component241 class225 = player.getDefinition((byte) 72);
        if (i != (player.anInt10268) && !(player.aBoolean10213)) {
            if ((player.anInt10268) != class225.anInt2919 && (player.anInt10268 != class225.anInt2920) && (class225.anInt2949 != (player.anInt10268)) && (player.anInt10268 != class225.anInt2914)) {
                if ((class225.anInt2940 == (player.anInt10268)) || (player.anInt10268 == class225.anInt2924) || (player.anInt10268 == class225.anInt2947) || (player.anInt10268 == class225.anInt2958))
                    i_4_ = player.anInt10526;
            } else i_4_ = player.anInt10519;
        } else i_4_ = player.anInt10535;
        return i_4_;
    }

    static final boolean method2358(int i, int i_5_, int i_6_) {
        if (i >= -106) return true;
        anInt3945++;
        return DisplayModeManagerContainer145.method1087(12644, i_6_, i_5_) || Component224.method2056(i_5_, 107, i_6_);
    }

    final void method2359(RenderableSub2 class318_sub2, int i) {
        if (i != -1) method2362(45);
        synchronized (aClass243_3946) {
            aClass243_3946.method1869(-127, class318_sub2);
            anInt3957++;
        }
        anInt3947++;
        if (aClass293_3956 != null) {
            synchronized (aClass293_3956) {
                aClass293_3956.notify();
            }
        }
    }

    final boolean method2360(int i) {
        int i_7_ = 46 % ((i - 10) / 54);
        anInt3955++;
        return anInt3957 == 0;
    }

    final void method2361(int i, RenderableObject class318_sub1) {
        class318_sub1.aBoolean6387 = true;
        anInt3950++;
        synchronized (aClass243_3946) {
            aClass243_3946.method1869(-122, class318_sub1);
            anInt3957++;
        }
        if (i != -15481) this.aString3953 = null;
        if (aClass293_3956 != null) {
            synchronized (aClass293_3956) {
                aClass293_3956.notify();
            }
        }
    }

    final Renderable method2362(int i) {
        anInt3952++;
        Object object = null;
        Renderable class318;
        synchronized (aClass243_3946) {
            if (i != 25061) method2353(null, true);
            class318 = aClass243_3946.method1872(8);
            class318.unlink(false);
            anInt3957--;
        }
        return class318;
    }

    Component168(String string) {
        this.aString3953 = string;
    }
}
