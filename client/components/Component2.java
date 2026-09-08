/* Component2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component2
/**
 * RENAMED from `Class5_Sub2` (JODE-obfuscated).
 * Evidence: subclass of Component298 (hierarchy)
 */ extends Component298 {
    static int anInt8353;
    static int anInt8354;
    static int anInt8355;
    static Component224 aClass273_8356 = new Component224("", 11);
    static int anInt8357;
    static int anInt8358;
    static int anInt8359;
    static int anInt8360;
    static boolean[][][] aBooleanArrayArrayArray8361;
    static int anInt8362;
    static int anInt8363;
    static int anInt8364;
    static Component183 aClass114_8365 = new Component183(30, -1);

    static final void method191(boolean bool, int i, int i_0_) {
        if (Component21.anInt3655 != 1) {
            if (Component21.anInt3655 == 2) {
                if (!Component210.gameCanvasAttached) DisplayModeManagerContainer42.method2291((byte) -127, i, i_0_);
                else DisplayModeManagerContainer42.method2291((byte) -122, i + BufferCacheSub3.method4008((byte) -128), Component110.method260(!bool) + i_0_);
            }
        } else ColoredTextBuilder.processMenuAction((byte) 101, Component161.aMenuEntry_1946, i_0_, i);
        anInt8354++;
        Component21.anInt3655 = 0;
        Component161.aMenuEntry_1946 = null;
        if (bool != true) method197(true);
    }

    static final void method192(DisplayModeManagerContainer56 class190, int i, int i_1_, int i_2_) {
        NodeList.aClass190ArrayArray3335[i_1_][i_2_] = class190;
        anInt8362++;
        if (i != 10000) anInt8363 = 32;
    }

    public static void method193(int i) {
        if (i == 30) {
            aClass273_8356 = null;
            aBooleanArrayArrayArray8361 = null;
            aClass114_8365 = null;
        }
    }

    static final byte[] method194(int i, int i_3_, int i_4_, float f, int i_5_, float f_6_, float f_7_, float f_8_, float f_9_, DisplayModeManagerContainer51 class186, int i_10_) {
        anInt8353++;
        if (i_3_ != -1922) aClass273_8356 = null;
        byte[] is = new byte[i * i_5_ * i_10_];
        Component193.method1919(i, f_8_, is, f_6_, 0, f_9_, class186, f_7_, i_4_, (byte) 119, i_10_, f, i_5_);
        return is;
    }

    static final boolean method195(int i, boolean bool, int i_11_) {
        anInt8364++;
        ObjectDefinition class51 = GradientPreset.aClass263_9195.getObjectDefinition(0, i_11_);
        if (i == 11) i = 10;
        if (bool != false) return false;
        if (i >= 5 && i <= 8) i = 4;
        return class51.method478(i, -31076);
    }

    Component2(CacheStore class45, CacheStore class45_12_, Component14 class369_sub2) {
        super(class45, class45_12_, class369_sub2);
    }

    static final void method196(boolean bool, int i, int i_13_, int i_14_, int i_15_) {
        if (bool != true) method192(null, -119, 63, 12);
        if (Component72.anInt1910 <= i_15_ && PauseTimer.anInt513 >= i_15_) {
            i_14_ = LogicError.clamp(Component22.anInt1745, i_14_, Component27.anInt4960, 71);
            i = LogicError.clamp(Component22.anInt1745, i, Component27.anInt4960, -87);
            Model.method223(i, i_13_, i_15_, i_14_, (byte) 39);
        }
        anInt8357++;
    }

    static final int method197(boolean bool) {
        anInt8358++;
        if (bool != false) aClass273_8356 = null;
        return NodederUtil.anInt6637;
    }

    final void method178(int i, boolean bool, byte i_16_, int i_17_) {
        NodeSub8.toolkit.fillRect3D(-2 + i, i_17_, 4 + this.aClass369_4635.anInt4971, 2 + this.aClass369_4635.anInt4963, (((Component14) this.aClass369_4635).anInt8585), 0);
        anInt8360++;
        NodeSub8.toolkit.fillRect3D(i - 1, 1 + i_17_, this.aClass369_4635.anInt4971 - -2, this.aClass369_4635.anInt4963, 0, 0);
        if (i_16_ > -6) aClass114_8365 = null;
    }

    final void method182(int i, int i_18_, int i_19_, boolean bool) {
        anInt8355++;
        int i_20_ = -110 / ((-20 - i) / 57);
        int i_21_ = (this.method183(116) * this.aClass369_4635.anInt4971 / 10000);
        NodeSub8.toolkit.fillRect2D(i_19_, 2 + i_18_, i_21_, (this.aClass369_4635.anInt4963) - 2, ((Component14) this.aClass369_4635).anInt8591, 0);
        NodeSub8.toolkit.fillRect2D(i_21_ + i_19_, 2 + i_18_, this.aClass369_4635.anInt4971 - i_21_, this.aClass369_4635.anInt4963 - 2, 0, 0);
    }

    static final void method198(DisplayModeManagerContainer57 class46, boolean bool, int i, int i_22_) {
        TcpSocketStream.anInt5832 = i;
        Component247.anInt4911 = i_22_;
        Component158.aClass46_323 = class46;
        anInt8359++;
        if (bool != false) anInt8363 = 112;
    }
}
