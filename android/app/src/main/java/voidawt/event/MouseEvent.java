package voidawt.event;

import voidawt.Component;

public class MouseEvent extends AWTEvent {
    public static final int MOUSE_FIRST = 500;
    public static final int MOUSE_CLICKED = 500;
    public static final int MOUSE_PRESSED = 501;
    public static final int MOUSE_RELEASED = 502;
    public static final int MOUSE_MOVED = 503;
    public static final int MOUSE_ENTERED = 504;
    public static final int MOUSE_EXITED = 505;
    public static final int MOUSE_DRAGGED = 506;
    public static final int MOUSE_WHEEL = 507;
    public static final int BUTTON1 = 1;
    public static final int BUTTON2 = 2;
    public static final int BUTTON3 = 3;
    public static final int SHIFT_DOWN_MASK = 1 << 6;
    public static final int CTRL_DOWN_MASK = 1 << 7;
    public static final int META_DOWN_MASK = 1 << 8;
    public static final int ALT_DOWN_MASK = 1 << 9;
    public static final int BUTTON1_DOWN_MASK = 1 << 10;
    public static final int BUTTON2_DOWN_MASK = 1 << 11;
    public static final int BUTTON3_DOWN_MASK = 1 << 12;

    private final int x;
    private final int y;
    private final int clickCount;
    private final boolean popupTrigger;
    private final int button;
    private final int modifiers;

    public MouseEvent(Component source, int id, long when, int modifiers, int x, int y, int clickCount, boolean popupTrigger) {
        this(source, id, when, modifiers, x, y, clickCount, popupTrigger, 0);
    }

    public MouseEvent(Component source, int id, long when, int modifiers, int x, int y, int clickCount, boolean popupTrigger, int button) {
        super(source, id);
        this.modifiers = modifiers;
        this.x = x;
        this.y = y;
        this.clickCount = clickCount;
        this.popupTrigger = popupTrigger;
        this.button = button;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getClickCount() {
        return clickCount;
    }

    public boolean isPopupTrigger() {
        return popupTrigger;
    }

    public int getButton() {
        return button;
    }

    public int getModifiers() {
        return modifiers;
    }

    public boolean isMetaDown() {
        return button == BUTTON3 || (modifiers & 4) != 0;
    }

    public boolean isShiftDown() {
        return (modifiers & 1) != 0;
    }

    public boolean isControlDown() {
        return (modifiers & 2) != 0;
    }

    public boolean isAltDown() {
        return (modifiers & 8) != 0;
    }
}
