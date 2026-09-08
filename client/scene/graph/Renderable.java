/* Renderable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class318` (JODE-obfuscated).
 * Base class for renderable scene objects. Doubly-linked via {@link #next}/{@link #previous};
 * {@link #unlink} removes from the scene-graph chain (also used by {@link DebugOverlay#linkRenderable}).
 */
class Renderable {
    /** Next renderable in the scene-graph link chain. */
    Renderable next;
    static int anInt3971;
    static int anInt3972;
    static int anInt3973;
    static Component315[] aClass243Array3974 = new Component315[5];
    static int anInt3975;
    /** Previous renderable in the scene-graph link chain. */
    Renderable previous;
    static DisplayModeManagerContainer42 aClass304_3977;

    final void unlink(boolean bool) {
        anInt3975++;
        if (this.previous != null) {
            this.previous.next = this.next;
            this.next.previous = this.previous;
            this.next = null;
            if (bool == false) this.previous = null;
        }
    }

    public static void method2374(byte i) {
        aClass304_3977 = null;
        int i_0_ = 108 / ((i - -83) / 41);
        aClass243Array3974 = null;
    }

    static final void method2375(int i) {
        anInt3972++;
        Connection.aClass60_2671.clear(0);
        if (i != 16127) anInt3971 = -113;
    }

    public Renderable() {
        /* empty */
    }

    static {
        for (int i = 0; aClass243Array3974.length > i; i++)
            aClass243Array3974[i] = new Component315();
        aClass304_3977 = new DisplayModeManagerContainer42(1);
    }
}
