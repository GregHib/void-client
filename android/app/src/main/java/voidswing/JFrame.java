package voidswing;

import voidawt.BorderLayout;
import voidawt.Container;
import voidawt.Frame;
import voidawt.Image;
import voidawt.Panel;

public class JFrame extends Frame {
    public static final int EXIT_ON_CLOSE = 3;
    private final Container contentPane = new Panel();

    public JFrame() {
        contentPane.setLayout(new BorderLayout());
    }

    public JFrame(String title) {
        super(title);
        contentPane.setLayout(new BorderLayout());
    }

    public Container getContentPane() {
        return contentPane;
    }

    public void setDefaultCloseOperation(int operation) {
    }
}
