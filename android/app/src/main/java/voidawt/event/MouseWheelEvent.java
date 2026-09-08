package voidawt.event;

import voidawt.Component;

public class MouseWheelEvent extends MouseEvent {
    private final int wheelRotation;

    public MouseWheelEvent(Component source, int id, long when, int modifiers, int x, int y, int clickCount, boolean popupTrigger, int wheelRotation) {
        super(source, id, when, modifiers, x, y, clickCount, popupTrigger, 0);
        this.wheelRotation = wheelRotation;
    }

    public int getWheelRotation() {
        return wheelRotation;
    }
}
