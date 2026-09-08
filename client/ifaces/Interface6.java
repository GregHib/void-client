/* Interface6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * Queued keyboard event API implemented by {@link NodeSub11}.
 * Popped via {@link InputHandler#popKeyEvent}.
 * <p>
 * {@link #getEventType}: 0=press, 1=release, 2=repeat/held, 3=typed, -1=focus lost.
 */
interface Interface6 {
    /** Modifier bitfield (shift/ctrl/alt style flags from focus handler). */
    int getModifiers(int i);

    /** Press / release / typed / focus-lost kind. */
    int getEventType(int i);

    /** Typed character, or {@code '\0'} for non-typed events. */
    char getKeyChar(byte i);

    /** Enqueue timestamp (client millis). */
    long getWhen(byte i);

    /** Mapped key code (client keymap), or held-key index. */
    int getKeyCode(boolean bool);
}
