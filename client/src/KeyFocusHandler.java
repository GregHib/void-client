/* KeyFocusHandler - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class346_Sub1` (JODE-obfuscated).
 * Keyboard + focus input handler. Extends InputHandler and implements KeyListener, FocusListener; queues Interface6 events via NodeLists.
 */

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

final class KeyFocusHandler extends InputHandler implements KeyListener, FocusListener {
    static int anInt6525;
    static int anInt6526;
    static int anInt6527;
    static Component183 aClass114_6528 = new Component183(14, 2);
    static int anInt6529;
    static int anInt6530;
    static int anInt6531;
    static int anInt6532;
    static int anInt6533;
    static int anInt6534;
    static int anInt6535;
    static int anInt6536;
    static int anInt6537;
    static int anInt6538;
    static int anInt6539;
    static int anInt6540;
    /** Key events ready for {@link #popKeyEvent}. */
    private final NodeList eventQueue = new NodeList();
    /** Raw AWT key events before {@link #sync}. */
    private NodeList pendingEvents = new NodeList();
    /** Held-key bitmap (client key codes 0..111). */
    private boolean[] keysDown = new boolean[112];
    /** Canvas Component listeners attach to. */
    private Component target;

    final Interface6 popKeyEvent(int i) {
        if (i != 0) keysDown = null;
        anInt6525++;
        return (Interface6) eventQueue.peekFirst(8);
    }

    final boolean isKeyDown(int i, int i_0_) {
        if (i_0_ >= -120) detachListeners((byte) 119);
        anInt6539++;
        if (i < 0 || i >= 112) return false;
        return keysDown[i];
    }

    private final void detachListeners(byte i) {
        if (i == -104) {
            anInt6533++;
            if (target != null) {
                target.removeKeyListener(this);
                target.removeFocusListener(this);
                target = null;
                for (int i_1_ = 0; i_1_ < 112; i_1_++)
                    keysDown[i_1_] = false;
                eventQueue.clear(116);
                pendingEvents.clear(i ^ ~0x1b);
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent keyevent) {
        anInt6526++;
        handleKey(keyevent, 0, 0);
    }

    private final void handleKey(KeyEvent keyevent, int i, int i_2_) {
        anInt6538++;
        int i_3_ = keyevent.getKeyCode();
        if (i_3_ != 0) {
            if (i_3_ >= 0 && DebugPanicSub2.anIntArray8507.length > i_3_) {
                i_3_ = DebugPanicSub2.anIntArray8507[i_3_];
                if (i_2_ == 0 && (i_3_ & 0x80) != 0) i_3_ = 0;
                else i_3_ &= ~0x80;
            } else i_3_ = 0;
        } else i_3_ = 0;
        if (i != i_3_) {
            enqueueKeyEvent(i_3_, 128, '\0', i_2_);
            keyevent.consume();
        }
    }

    final void reset(int i) {
        anInt6530++;
        detachListeners((byte) -104);
        if (i != 14174) pendingEvents = null;
    }

    private final void enqueueKeyEvent(int i, int i_4_, char c, int i_5_) {
        anInt6532++;
        NodeSub11 class348_sub11 = new NodeSub11();
        class348_sub11.eventType = i_5_;
        class348_sub11.keyCode = i;
        class348_sub11.keyChar = c;
        class348_sub11.when = Component240.currentTimeMillis(-102);
        pendingEvents.addTail(class348_sub11, -20180);
        if (i_4_ != 128) target = null;
    }

    public final synchronized void keyReleased(KeyEvent keyevent) {
        anInt6529++;
        handleKey(keyevent, 0, 1);
    }

    public final synchronized void keyTyped(KeyEvent keyevent) {
        anInt6527++;
        char c = keyevent.getKeyChar();
        if (c != 0 && DisplayModeManagerContainer145.isCp1252Char(-125, c)) {
            enqueueKeyEvent(-1, 128, c, 3);
            keyevent.consume();
        }
    }

    public final void focusGained(FocusEvent focusevent) {
        anInt6540++;
    }

    /** Set client varp slot ({@code i_6_},{@code i_7_}) to {@code i} (or default if null). */
    static final void setClientVarp(int i, int i_6_, int i_7_, byte i_8_) {
        anInt6536++;
        DisplayModeManagerContainer56 class190 = NodeList.aClass190ArrayArray3335[i_6_][i_7_];
        if (i_8_ == -13) DisplayModeManagerContainer254.method1260(false, i, (class190 == null ? FriendsIgnoreList.aClass190_3547 : class190));
    }

    private final int modifierFlags(byte i) {
        anInt6531++;
        int i_9_ = 0;
        if (keysDown[81]) i_9_ |= 0x1;
        if (i != 127) return 25;
        if (keysDown[82]) i_9_ |= 0x4;
        if (keysDown[86]) i_9_ |= 0x2;
        return i_9_;
    }

    final synchronized void sync(int i) {
        anInt6534++;
        eventQueue.clear(110);
        if (i >= 51) {
            for (NodeSub11 class348_sub11 = (NodeSub11) pendingEvents.peekFirst(8); class348_sub11 != null; class348_sub11 = (NodeSub11) pendingEvents.peekFirst(8)) {
                class348_sub11.modifiers = modifierFlags((byte) 127);
                if (class348_sub11.eventType == 0) {
                    if (!keysDown[class348_sub11.keyCode]) {
                        NodeSub11 class348_sub11_10_ = new NodeSub11();
                        class348_sub11_10_.keyCode = class348_sub11.keyCode;
                        class348_sub11_10_.eventType = 0;
                        class348_sub11_10_.keyChar = '\0';
                        class348_sub11_10_.modifiers = class348_sub11.modifiers;
                        class348_sub11_10_.when = class348_sub11.when;
                        eventQueue.addTail(class348_sub11_10_, -20180);
                        keysDown[(class348_sub11.keyCode)] = true;
                    }
                    class348_sub11.eventType = 2;
                    eventQueue.addTail(class348_sub11, -20180);
                } else if (class348_sub11.eventType != 1) {
                    if (class348_sub11.eventType == -1) {
                        for (int i_11_ = 0; i_11_ < 112; i_11_++) {
                            if (keysDown[i_11_]) {
                                NodeSub11 class348_sub11_12_ = new NodeSub11();
                                class348_sub11_12_.keyChar = '\0';
                                class348_sub11_12_.keyCode = i_11_;
                                class348_sub11_12_.modifiers = (class348_sub11.modifiers);
                                class348_sub11_12_.eventType = 1;
                                class348_sub11_12_.when = (class348_sub11.when);
                                eventQueue.addTail(class348_sub11_12_, -20180);
                                keysDown[i_11_] = false;
                            }
                        }
                    } else if (class348_sub11.eventType == 3) eventQueue.addTail(class348_sub11, -20180);
                } else if (keysDown[class348_sub11.keyCode]) {
                    eventQueue.addTail(class348_sub11, -20180);
                    keysDown[(class348_sub11.keyCode)] = false;
                }
            }
        }
    }

    public final synchronized void focusLost(FocusEvent focusevent) {
        anInt6537++;
        enqueueKeyEvent(0, 128, '\0', -1);
    }

    public static void clearStatics(int i) {
        aClass114_6528 = null;
        if (i != 14645) clearStatics(1);
    }

    private final void attachListeners(Component component, int i) {
        detachListeners((byte) -104);
        if (i != 2) clearStatics(-19);
        anInt6535++;
        target = component;
        Method method = ReflectionInvoker.aMethod3783;
        if (method != null) {
            try {
                method.invoke(target, Boolean.FALSE);
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        target.addKeyListener(this);
        target.addFocusListener(this);
    }

    KeyFocusHandler(Component component) {
        Component182.method3402((byte) -82);
        attachListeners(component, 2);
    }
}
