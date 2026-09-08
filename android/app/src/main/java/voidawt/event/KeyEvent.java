package voidawt.event;

import voidawt.Component;

public class KeyEvent extends AWTEvent {
    public static final int KEY_TYPED = 400;
    public static final int KEY_PRESSED = 401;
    public static final int KEY_RELEASED = 402;
    public static final int VK_ENTER = 10;
    public static final int VK_BACK_SPACE = 8;
    public static final int VK_TAB = 9;
    public static final int VK_ESCAPE = 27;
    public static final int VK_SPACE = 32;
    public static final int VK_LEFT = 37;
    public static final int VK_UP = 38;
    public static final int VK_RIGHT = 39;
    public static final int VK_DOWN = 40;
    public static final int VK_DELETE = 127;
    public static final int VK_SHIFT = 16;
    public static final int VK_CONTROL = 17;
    public static final int VK_ALT = 18;
    public static final int CHAR_UNDEFINED = 65535;

    private final int keyCode;
    private final char keyChar;

    public KeyEvent(Component source, int id, long when, int modifiers, int keyCode, char keyChar) {
        super(source, id);
        this.keyCode = keyCode;
        this.keyChar = keyChar;
    }

    public int getKeyCode() {
        return keyCode;
    }

    public char getKeyChar() {
        return keyChar;
    }
}
