package voidawt.event;

public class ActionEvent extends AWTEvent {
    public static final int ACTION_PERFORMED = 1001;

    public ActionEvent(Object source, int id, String command) {
        super(source, id);
    }
}
