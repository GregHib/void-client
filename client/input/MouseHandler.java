/* MouseHandler - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * Mouse input abstraction over the game canvas.
 * Desktop: {@link AwtMouseHandler} (AWT listeners). Mobile: voidawt-backed subclass.
 * <p>
 * Live cursor: {@link #getCursorX} = X, {@link #getCursorY} = Y (canvas pixels).
 * Button held: {@link #isLeftButtonDown} left, {@link #isMiddleButtonDown} middle, {@link #isRightButtonDown} right.
 * Queued events: {@link #popEvent} yields {@link NodeSub45}
 * ({@code getEventType}: 0=left press, 1=middle, 2=right, 3/4/5=releases, 6=wheel).
 * Singleton used by the client: {@link AbstractGlTextureSub4#mouseHandler}.
 */
abstract class MouseHandler {
    static int anInt4533;
    /** Y origin used when laying out the right-click menu. */
    static int menuOriginY;
    static int anInt4535;

    /** Middle mouse button currently held. */
    abstract boolean isMiddleButtonDown(int i);

    /** Sync pending AWT events into the click / motion queues (called once per frame). */
    abstract void syncEvents(int i);

    public MouseHandler() {
        /* empty */
    }

    /** Right mouse button currently held. */
    abstract boolean isRightButtonDown(byte i);

    /**
     * Load {@link Component113} config id {@code i} from archive {@code i_0_} (LRU-cached).
     * Used by floor/static-element renderers.
     */
    static final Component113 getOrLoadConfig(int i, int i_0_) {
        anInt4535++;
        Component113 class181 = (Component113) Component298.aClass60_4636.get(i, i_0_ + -128);
        if (class181 != null) return class181;
        byte[] is = Component205.aClass45_5964.getFile(-1860, i_0_, i);
        class181 = new Component113();
        if (is != null) class181.method1370(24, new Buffer(is));
        class181.method1371(4);
        Component298.aClass60_4636.putOne(class181, i, (byte) -103);
        return class181;
    }

    abstract void destroy(int i);

    /** Any mouse button currently held. */
    final boolean isAnyButtonDown(int i) {
        anInt4533++;
        if (i <= 91) isAnyButtonDown(53);
        return isLeftButtonDown(-83) || isMiddleButtonDown(-121) || isRightButtonDown((byte) 125);
    }

    /** Current cursor Y in canvas pixels. */
    abstract int getCursorY(byte i);

    /** Left mouse button currently held. */
    abstract boolean isLeftButtonDown(int i);

    /** Pop next queued mouse event, or {@code null} when empty. */
    abstract NodeSub45 popEvent(int i);

    /** Current cursor X in canvas pixels. */
    abstract int getCursorX(boolean bool);
}
