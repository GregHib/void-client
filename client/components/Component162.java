/* Component162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Method;

final class Component162
/**
 * RENAMED from `Class127_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Component296 (hierarchy)
 */ extends Component296 {
    static DisplayModeManagerContainer130 aClass271_8378;
    static int anInt8379;
    static int anInt8380;
    static int anInt8381;
    static int anInt8382;
    private int anInt8383 = 0;
    static Component183 aClass114_8384 = new Component183(18, 0);
    static Component183 aClass114_8385;
    static boolean aBoolean8386 = false;
    static int anInt8387;
    static int anInt8388;
    /*synthetic*/ static Class aClass8389;

    public final void method9(byte i, boolean bool) {
        anInt8379++;
        int i_0_ = ((this.aClass288_4659.aClass221_4955.method1607(DisplayModeManagerContainer23.canvasWidth, this.aClass105_4655.method966(), (byte) -117)) - -this.aClass288_4659.anInt4950);
        int i_1_ = ((this.aClass288_4659.aClass341_4952.getAlignedOffset(GlToolkitSub2.canvasHeight, this.aClass105_4655.method980(), 1595)) + this.aClass288_4659.anInt4951);
        this.aClass105_4655.method981((float) (this.aClass105_4655.method966() / 2 + i_0_), (float) (this.aClass105_4655.method980() / 2 + i_1_), 4096, anInt8383);
        anInt8383 += ((Component383) this.aClass288_4659).anInt8577;
        if (i != -49) method9((byte) -26, true);
    }

    static final void method1118(boolean bool, boolean bool_2_, NodeSub41 class348_sub41, int i) {
        anInt8382++;
        int i_3_ = class348_sub41.anInt7050;
        int i_4_ = (int) class348_sub41.key;
        if (i == 2533) {
            class348_sub41.unlink((byte) 35);
            if (bool) DisplayModeManagerContainer194.method235(i_3_, (byte) -116);
            CursorDefinitionCache.method1288(i ^ ~0x9e2, i_3_);
            DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(1512932720, i_4_);
            if (class46 != null) Component111.markInterfaceDirty(-9343, class46);
            HashNodeSub17.method3270((byte) 119);
            if (!bool_2_ && r.anInt9721 != -1) Component205.method1775((byte) -8, r.anInt9721, 1);
            Component79 class333 = new Component79(Component15.aClass356_4915);
            for (NodeSub41 class348_sub41_5_ = (NodeSub41) class333.method2644((byte) 123); class348_sub41_5_ != null; class348_sub41_5_ = (NodeSub41) class333.method2646((byte) 99)) {
                if (!class348_sub41_5_.isLinked((byte) 4)) {
                    class348_sub41_5_ = (NodeSub41) class333.method2644((byte) 123);
                    if (class348_sub41_5_ == null) break;
                }
                if (class348_sub41_5_.anInt7053 == 3) {
                    int i_6_ = (int) class348_sub41_5_.key;
                    if (i_3_ == i_6_ >>> 16) method1118(true, bool_2_, class348_sub41_5_, 2533);
                }
            }
        }
    }

    Component162(CacheStore class45, Component383 class288_sub1) {
        super(class45, class288_sub1);
    }

    static final void method1119(boolean bool) {
        anInt8381++;
        try {
            if (bool != false) method1118(false, false, null, -35);
            try {
                Runtime runtime = Runtime.getRuntime();
                Integer integer = runtime.availableProcessors();
                DefinitionSub29.anInt9372 = integer.intValue();
            } catch (Throwable throwable) {
                /* empty */
            }
        } catch (Exception exception) {
            /* empty */
        }
    }

    public static void method1120(int i) {
        aClass114_8384 = null;
        aClass271_8378 = null;
        aClass114_8385 = null;
        if (i != 1) method1119(true);
    }

    static {
        aClass114_8385 = new Component183(10, -2);
        anInt8388 = 0;
    }
}
