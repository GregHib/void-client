/* BasicMouseHandler - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Fallback AWT mouse handler without wheel support.
 * Used when {@link AwtMouseHandler} construction fails (see {@link NodeSub18#createMouseHandler}).
 * Also hosts unrelated static dump fields left by the obfuscator.
 */
final class BasicMouseHandler extends MouseHandler implements MouseListener, MouseMotionListener {
    static int anInt7426;
    static int anInt7427;
    static int anInt7428;
    static int anInt7429;
    static int anInt7430;
    static int anInt7431;
    /** Published button bitfield: 1=left, 2=middle, 4=right. */
    private int buttonState;
    static int anInt7433;
    static int anInt7434;
    static int anInt7435;
    static int anInt7436;
    static int anInt7437;
    static int anInt7438;
    static int anInt7439;
    static int anInt7440;
    /** Events ready for {@link #popEvent}. */
    private NodeList eventQueue = new NodeList();
    /** Published cursor X. */
    private int cursorX;
    static int anInt7443;
    static boolean aBoolean7444 = false;
    static int anInt7445;
    static Component69[] aClass283Array7446;
    static int anInt7447;
    /** Published cursor Y. */
    private int cursorY;
    static int anInt7449;
    /** Events enqueued this frame before sync. */
    private NodeList pendingEvents = new NodeList();
    static int anInt7451;
    static int anInt7452;
    private int pendingY;
    private int pendingX;
    static int anInt7455;
    private int pendingButtons;
    static int anInt7457;
    /** When true, motion synthesises type=-1 events. */
    private final boolean recordMotionEvents;
    /** Canvas Component listeners are attached to. */
    private Component target;

    private final void attachListeners(byte i, Component component) {
        anInt7447++;
        if (i >= -83) mouseExited(null);
        detachListeners(85);
        target = component;
        target.addMouseListener(this);
        target.addMouseMotionListener(this);
    }

    public final synchronized void mouseDragged(MouseEvent mouseevent) {
        updateCursor(mouseevent.getY(), (byte) -76, mouseevent.getX());
        anInt7427++;
    }

    public final synchronized void mouseEntered(MouseEvent mouseevent) {
        updateCursor(mouseevent.getY(), (byte) -76, mouseevent.getX());
        anInt7426++;
    }

    private final int buttonMask(int i, MouseEvent mouseevent) {
        anInt7436++;
        int i_0_ = mouseevent.getModifiers();
        boolean bool = (0x10 & i_0_) != 0;
        boolean bool_1_ = (i_0_ & 0x8) != 0;
        boolean bool_2_ = (0x4 & i_0_) != 0;
        if (bool_1_ && (bool || bool_2_)) bool_1_ = false;
        if (bool && bool_2_) return 4;
        if (bool) return 1;
        if (bool_1_) return 2;
        if (i != -6345) popEvent(-12);
        if (bool_2_) return 4;
        return 0;
    }

    public final synchronized void mouseExited(MouseEvent mouseevent) {
        updateCursor(mouseevent.getY(), (byte) -76, mouseevent.getX());
        anInt7452++;
    }

    final boolean isRightButtonDown(byte i) {
        anInt7457++;
        if (i <= 112) enqueueEvent(-77, 6, -104, -59, 86);
        return (buttonState & 0x4) != 0;
    }

    final synchronized void syncEvents(int i) {
        if (i != 0) syncEvents(-46);
        buttonState = pendingButtons;
        anInt7440++;
        cursorY = pendingY;
        cursorX = pendingX;
        NodeList class262 = eventQueue;
        eventQueue = pendingEvents;
        pendingEvents = class262;
        pendingEvents.clear(i ^ 0x66);
    }

    public final synchronized void mouseMoved(MouseEvent mouseevent) {
        anInt7435++;
        updateCursor(mouseevent.getY(), (byte) -76, mouseevent.getX());
    }

    private final void updateCursor(int i, byte i_3_, int i_4_) {
        anInt7445++;
        pendingX = i_4_;
        if (i_3_ != -76) anInt7429 = 51;
        pendingY = i;
        if (recordMotionEvents) enqueueEvent(-1, i, i_4_, 0, -125);
    }

    final int getCursorY(byte i) {
        anInt7430++;
        if (i <= 69) return -123;
        return cursorY;
    }

    final NodeSub45 popEvent(int i) {
        if (i != 0) mouseReleased(null);
        anInt7437++;
        return (NodeSub45) eventQueue.peekFirst(i + 8);
    }

    private final void enqueueEvent(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
        anInt7439++;
        NodeSub45Sub2 class348_sub45_sub2 = new NodeSub45Sub2();
        class348_sub45_sub2.x = i_6_;
        class348_sub45_sub2.y = i_5_;
        class348_sub45_sub2.clickCount = i_7_;
        class348_sub45_sub2.eventType = i;
        class348_sub45_sub2.when = Component240.currentTimeMillis(-110);
        pendingEvents.addTail(class348_sub45_sub2, -20180);
        if (i_8_ >= -110) readJagStringLimited(28, null, -68);
    }

    public final synchronized void mouseClicked(MouseEvent mouseevent) {
        if (mouseevent.isPopupTrigger()) mouseevent.consume();
        anInt7438++;
    }

    final void destroy(int i) {
        if (i != 0) getCursorX(false);
        anInt7433++;
        detachListeners(84);
    }

    final boolean isMiddleButtonDown(int i) {
        int i_9_ = -108 % ((-38 - i) / 48);
        anInt7434++;
        return (buttonState & 0x2) != 0;
    }

    final boolean isLeftButtonDown(int i) {
        anInt7455++;
        if (i >= -67) mouseExited(null);
        return (buttonState & 0x1) != 0;
    }

    /** Reads a length-capped Jagex string from {@code class348_sub49} (returns {@code "Cabbage"} on error). */
    static final String readJagStringLimited(int i, Buffer class348_sub49, int i_10_) {
        int i_11_ = 17 % ((9 - i_10_) / 59);
        anInt7451++;
        try {
            int i_12_ = class348_sub49.readSmart(-122);
            if (i < i_12_) i_12_ = i;
            byte[] is = new byte[i_12_];
            class348_sub49.offset += (DisplayModeManagerContainer370.huffman.decompress(is, class348_sub49.offset, class348_sub49.payload, i_12_, -1, 0));
            String string = WaterShaderSub8.decodeCp1252(is, 0, i_12_, 0);
            return string;
        } catch (Exception exception) {
            return "Cabbage";
        }
    }

    public final synchronized void mouseReleased(MouseEvent mouseevent) {
        anInt7428++;
        int i = buttonMask(-6345, mouseevent);
        if ((i & pendingButtons) == 0) i = pendingButtons;
        if ((i & 0x1) != 0) enqueueEvent(3, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -116);
        if ((0x4 & i) != 0) enqueueEvent(5, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -119);
        if ((0x2 & i) != 0) enqueueEvent(4, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -117);
        pendingButtons &= ~i;
        if (mouseevent.isPopupTrigger()) mouseevent.consume();
    }

    private final void detachListeners(int i) {
        anInt7431++;
        if (target != null) {
            target.removeMouseMotionListener(this);
            target.removeMouseListener(this);
            target = null;
            eventQueue = null;
            pendingEvents = null;
            cursorX = cursorY = buttonState = 0;
            int i_13_ = -106 / ((-57 - i) / 46);
            pendingX = pendingY = pendingButtons = 0;
        }
    }

    final int getCursorX(boolean bool) {
        if (bool != true) pendingY = -101;
        anInt7443++;
        return cursorX;
    }

    public final synchronized void mousePressed(MouseEvent mouseevent) {
        anInt7449++;
        int i = buttonMask(-6345, mouseevent);
        if (i != 1) {
            if (i == 4) enqueueEvent(2, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -112);
            else if (i == 2) enqueueEvent(1, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -121);
        } else enqueueEvent(0, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -126);
        pendingButtons |= i;
        if (mouseevent.isPopupTrigger()) mouseevent.consume();
    }

    public static void clearStatics(byte i) {
        int i_14_ = 49 % ((i - -35) / 41);
        aClass283Array7446 = null;
    }

    BasicMouseHandler(Component component, boolean bool) {
        attachListeners((byte) -108, component);
        recordMotionEvents = bool;
    }
}
