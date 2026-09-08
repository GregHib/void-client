/* AwtMouseHandler - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.event.*;

/**
 * Desktop AWT mouse handler (preferred): press / motion / wheel listeners on the game canvas.
 * Constructed via reflection from {@link NodeSub18#createMouseHandler}; falls back to
 * {@link BasicMouseHandler} when wheel support is unavailable.
 */
final class AwtMouseHandler extends MouseHandler implements MouseListener, MouseMotionListener, MouseWheelListener {
    /** Published cursor X (swapped from pending each sync). */
    private int cursorX;
    /** Published cursor Y. */
    private int cursorY;
    /** Events ready for {@link #popEvent}. */
    private NodeList eventQueue = new NodeList();
    /** Published button bitfield: 1=left, 2=middle, 4=right. */
    private int buttonState;
    /** Events enqueued this frame before sync. */
    private NodeList pendingEvents = new NodeList();
    private int pendingX;
    private int pendingButtons;
    private int pendingY;
    /** When true, motion also synthesizes type=-1 events. */
    private final boolean recordMotionEvents;
    /** Canvas Component listeners are attached to. */
    private Component target;

    final boolean isMiddleButtonDown(int i) {
        int i_0_ = -59 % ((i - -38) / 48);
        return (buttonState & 0x2) != 0;
    }

    private final void enqueueEvent(int i, int i_1_, int i_2_, int i_3_, boolean bool) {
        NodeSub45Sub1 class348_sub45_sub1 = new NodeSub45Sub1();
        class348_sub45_sub1.y = i_3_;
        class348_sub45_sub1.eventType = i_1_;
        class348_sub45_sub1.x = i;
        class348_sub45_sub1.when = Component240.currentTimeMillis(-115);
        class348_sub45_sub1.clickCount = i_2_;
        if (bool) mouseDragged(null);
        pendingEvents.addTail(class348_sub45_sub1, -20180);
    }

    public final synchronized void mouseReleased(MouseEvent mouseevent) {
        int i = buttonMask(mouseevent, -75);
        if ((i & pendingButtons) == 0) i = pendingButtons;
        if (0 != (0x1 & i)) enqueueEvent(mouseevent.getX(), 3, mouseevent.getClickCount(), mouseevent.getY(), false);
        if ((i & 0x4) != 0) enqueueEvent(mouseevent.getX(), 5, mouseevent.getClickCount(), mouseevent.getY(), false);
        if ((0x2 & i) != 0) enqueueEvent(mouseevent.getX(), 4, mouseevent.getClickCount(), mouseevent.getY(), false);
        pendingButtons &= ~i;
        if (mouseevent.isPopupTrigger()) mouseevent.consume();
    }

    final int getCursorY(byte i) {
        if (i < 69) enqueueEvent(92, 34, 59, 2, false);
        return cursorX;
    }

    private final void updateCursor(int i, int i_4_, int i_5_) {
        if (i_4_ == -1) {
            pendingX = i_5_;
            pendingY = i;
            if (recordMotionEvents) enqueueEvent(i, -1, 0, i_5_, false);
        }
    }

    final boolean isRightButtonDown(byte i) {
        if (i <= 112) return false;
        return (buttonState & 0x4) != 0;
    }

    public final synchronized void mousePressed(MouseEvent mouseevent) {
        int i = buttonMask(mouseevent, -90);
        if (1 == i) enqueueEvent(mouseevent.getX(), 0, mouseevent.getClickCount(), mouseevent.getY(), false);
        else if (i == 4) enqueueEvent(mouseevent.getX(), 2, mouseevent.getClickCount(), mouseevent.getY(), false);
        else if (i == 2) enqueueEvent(mouseevent.getX(), 1, mouseevent.getClickCount(), mouseevent.getY(), false);
        pendingButtons |= i;
        if (mouseevent.isPopupTrigger()) mouseevent.consume();
    }

    final int getCursorX(boolean bool) {
        if (bool != true) return 27;
        return cursorY;
    }

    private final int buttonMask(MouseEvent mouseevent, int i) {
        if (mouseevent.getButton() == 1) {
            if (mouseevent.isMetaDown()) return 4;
            return 1;
        }
        if (mouseevent.getButton() == 2) return 2;
        int i_6_ = -27 % ((57 - i) / 63);
        if (mouseevent.getButton() == 3) return 4;
        return 0;
    }

    public final synchronized void mouseEntered(MouseEvent mouseevent) {
        updateCursor(mouseevent.getX(), -1, mouseevent.getY());
    }

    public final synchronized void mouseClicked(MouseEvent mouseevent) {
        if (mouseevent.isPopupTrigger()) mouseevent.consume();
    }

    final boolean isLeftButtonDown(int i) {
        if (i >= -67) mouseMoved(null);
        return (buttonState & 0x1) != 0;
    }

    final NodeSub45 popEvent(int i) {
        if (i != 0) mouseReleased(null);
        return (NodeSub45) eventQueue.peekFirst(8);
    }

    public final synchronized void mouseMoved(MouseEvent mouseevent) {
        updateCursor(mouseevent.getX(), -1, mouseevent.getY());
    }

    private final void detachListeners(int i) {
        if (null != target) {
            int i_7_ = 11 % ((i - -21) / 55);
            target.removeMouseWheelListener(this);
            target.removeMouseMotionListener(this);
            target.removeMouseListener(this);
            target = null;
            pendingY = pendingX = pendingButtons = 0;
            cursorY = cursorX = buttonState = 0;
            eventQueue = null;
            pendingEvents = null;
        }
    }

    final synchronized void syncEvents(int i) {
        cursorX = pendingX;
        cursorY = pendingY;
        buttonState = pendingButtons;
        if (i == 0) {
            NodeList class262 = eventQueue;
            eventQueue = pendingEvents;
            pendingEvents = class262;
            pendingEvents.clear(127);
        }
    }

    public final synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
        int i = mousewheelevent.getX();
        int i_8_ = mousewheelevent.getY();
        int i_9_ = mousewheelevent.getWheelRotation();
        enqueueEvent(i, 6, i_9_, i_8_, false);
        mousewheelevent.consume();
    }

    public final synchronized void mouseExited(MouseEvent mouseevent) {
        updateCursor(mouseevent.getX(), -1, mouseevent.getY());
    }

    public final synchronized void mouseDragged(MouseEvent mouseevent) {
        updateCursor(mouseevent.getX(), -1, mouseevent.getY());
    }

    final void destroy(int i) {
        if (i == 0) detachListeners(46);
    }

    /** Attach mouse/motion/wheel listeners to {@code component}. */
    private final void attachListeners(int i, Component component) {
        detachListeners(i ^ 0x6e);
        target = component;
        if (i != 0) target = null;
        target.addMouseListener(this);
        target.addMouseMotionListener(this);
        target.addMouseWheelListener(this);
    }

    AwtMouseHandler(Component component, boolean bool) {
        attachListeners(0, component);
        recordMotionEvents = bool;
    }
}
