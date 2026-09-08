/* CacheNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub42_Sub8` (JODE-obfuscated).
 * Abstract HashNode subclass used as a cacheable, indexed entry. Declares getValue(Object getter) / isSoft(contains); subclasses CacheNode_Sub1/_Sub2.
 */

abstract class CacheNode extends HashNode {
    int weight;
    static int anInt9546;
    static int anInt9547;
    static int anInt9548;
    static int anInt9549;
    static Component183 aClass114_9550 = new Component183(109, 7);
    static int anInt9551;
    static Component183 aClass114_9552 = new Component183(72, 0);
    static StringCache aClass351_9553 = new StringCache(36, 7);
    static String aString9554;
    static short aShort9555 = 1;

    abstract Object getValue(int i);

    static final boolean method3194(int i, int i_0_, byte i_1_) {
        anInt9551++;
        if (i_1_ <= 118) method3196(122, -41);
        return false;
    }

    abstract boolean isSoft(int i);

    static final boolean method3196(int i, int i_2_) {
        if (i_2_ >= -39) return false;
        anInt9546++;
        return i == 3 || i == 4 || i == 5 || i == 6;
    }

    CacheNode(int i) {
        this.weight = i;
    }

    static final boolean method3197(int i, byte i_3_) {
        anInt9549++;
        if (i_3_ != 56) aClass114_9552 = null;
        return i == 7 || i == 9;
    }

    static final void method3198(boolean bool, byte i) {
        anInt9547++;
        if (i != -45) aShort9555 = (short) -74;
        if (bool) {
            if (r.anInt9721 != -1) DisplayModeManagerContainer194.method235(r.anInt9721, (byte) -113);
            for (NodeSub41 class348_sub41 = (NodeSub41) Component15.aClass356_4915.first(0); class348_sub41 != null; class348_sub41 = ((NodeSub41) Component15.aClass356_4915.next(0))) {
                if (!class348_sub41.isLinked((byte) 4)) {
                    class348_sub41 = ((NodeSub41) Component15.aClass356_4915.first(i ^ ~0x2c));
                    if (class348_sub41 == null) break;
                }
                Component162.method1118(true, false, class348_sub41, 2533);
            }
            r.anInt9721 = -1;
            Component15.aClass356_4915 = new LruCache(8);
            DisplayModeManagerContainer153.method882((byte) 11);
            r.anInt9721 = DebugPanic.anInt4737;
            Component339.method1713(false, 520);
            Component160.method3466(100);
            ClientScriptExecutor.runInterfaceScripts(r.anInt9721);
        }
        DisplayModeManagerContainer369.aBoolean2895 = false;
        DisplayModeManagerContainer282.username = DisplayModeManagerContainer51.password = "";
        Component195.method1448(-56);
        Component149.widgetCursorId = -1;
        Component373.applyCustomCursor(i + 45, HashNodeSub16Sub1.defaultCursorId);
        Component72.localPlayer = new Player();
        Component72.localPlayer.x = 512 * AbstractShaderSub4.anInt7319 / 2;
        Component72.localPlayer.anIntArray10320[0] = AbstractShaderSub4.anInt7319 / 2;
        Component72.localPlayer.y = 512 * ParametricDefinition.anInt9109 / 2;
        Component72.localPlayer.anIntArray10317[0] = ParametricDefinition.anInt9109 / 2;
        WaterSurfaceShader.anInt6246 = Component317.anInt8685 = 0;
        if (DefinitionSub21.cameraMode == 2) {
            WaterSurfaceShader.anInt6246 = NodeSub35.anInt6981 << 9;
            Component317.anInt8685 = Component300.anInt3550 << 9;
        } else NodeSub21.method2954((byte) 62);
        DisplayModeManagerContainer154.method773(true);
    }

    public static void method3199(int i) {
        aClass114_9550 = null;
        if (i < 17) method3196(60, -85);
        aClass114_9552 = null;
        aClass351_9553 = null;
        aString9554 = null;
    }
}
