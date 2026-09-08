/* NodeSub45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * Queued mouse event (press / release / wheel) produced by {@link MouseHandler#popEvent}.
 * <p>
 * Desktop: {@link NodeSub45Sub1} from {@link AwtMouseHandler}; fallback:
 * {@link NodeSub45Sub2} from {@link BasicMouseHandler}.
 * <p>
 * {@link #getEventType}: 0=left press, 1=middle, 2=right, 3/4/5=releases, 6=wheel.
 * Coordinates are canvas pixels ({@link #getX}/{@link #getY}); {@link #getWhen} is
 * {@link Component240#currentTimeMillis} at enqueue; {@link #getClickCount} is AWT click count.
 * <p>
 * RENAMED from {@code Class348_Sub45}.
 */
abstract class NodeSub45 extends Node {
    static int anInt7102 = 1400;
    static DisplayModeManagerContainer42 aClass304_7103 = new DisplayModeManagerContainer42(3);
    static int anInt7104;
    static Component183 aClass114_7105 = new Component183(101, 20);
    static Component183 aClass114_7106 = new Component183(36, -2);
    static Component24[] aClass105Array7107;
    static CollisionMap[] aClass361Array7108 = new CollisionMap[4];

    /** Event X in canvas pixels. */
    abstract int getX(byte i);

    static final void method3309(int i) {
        Component160.anIntArrayArrayArray4356 = (new int[Component291.anInt2524][1 + StaticElementRenderer.anInt6451]
                [1 + NodeSub41.anInt7054]);
        anInt7104++;
        ComponentSettings.anInt7101 = 0;
        Component53.anInt194 = Component148.anInt3465;
        DisplayModeManagerContainer104.aClass338Array10330 = new Component103[2000];
        GlToolkitSub2.anInt7714 = Component148.anInt3465;
        Cp1252Decoder.aBoolean5226 = false;
        Component335.aClass338Array2034 = new Component103[500];
        Component325.occluderCountB = 0;
        RadixText.occluderCountA = 0;
        InterfaceRenderer.aClass338Array5060 = new Component103[1000];
        if (i > -113) aClass304_7103 = null;
        HashNodeSub10.activeOccluderCount = 0;
        HashNodeSub19.aClass338Array9700 = new Component103[(int) (500 * Loader.RENDER_DISTANCE_MULTIPLIER)];
        DefinitionSub23.aBoolean9307 = !(JaclibLoader.toolkit instanceof OpenGLToolkit);
    }

    public NodeSub45() {
        /* empty */
    }

    /** Press/release/wheel kind (see class javadoc). */
    abstract int getEventType(int i);

    /** Event Y in canvas pixels. */
    abstract int getY(int i);

    /** Enqueue timestamp (client millis). */
    abstract long getWhen(byte i);

    static final void method3313(int i, s var_s) {
        ShaderSub1.aSArray5191[i] = var_s;
    }

    public static void method3314(int i) {
        aClass114_7106 = null;
        if (i != 5) method3313(-103, null);
        aClass114_7105 = null;
        aClass361Array7108 = null;
        aClass105Array7107 = null;
        aClass304_7103 = null;
    }

    /** AWT click count (or 0 for synthetic / wheel). */
    abstract int getClickCount(int i);
}
