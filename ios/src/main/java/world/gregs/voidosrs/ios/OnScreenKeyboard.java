package world.gregs.voidosrs.ios;

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.uikit.NSTextAlignment;
import org.robovm.apple.uikit.UIButton;
import org.robovm.apple.uikit.UIButtonType;
import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UIControl;
import org.robovm.apple.uikit.UIControlState;
import org.robovm.apple.uikit.UIEvent;
import org.robovm.apple.uikit.UIFont;
import org.robovm.apple.uikit.UILabel;
import org.robovm.apple.uikit.UIView;

/**
 * Focus / D-pad friendly QWERTY for Apple TV (no system soft keyboard).
 * Keys inject via {@link Listener}; navigation uses the UIKit focus engine.
 */
public class OnScreenKeyboard extends UIView {
    public interface Listener {
        void onChar(char c);
        void onBackspace();
        void onEnter();
        void onDismiss();
    }

    private static final String[] ROWS = {
            "1234567890",
            "qwertyuiop",
            "asdfghjkl",
            "zxcvbnm.",
    };

    private final Listener listener;
    private final UILabel preview;
    private String buffer = "";
    private boolean shift;

    public OnScreenKeyboard(CGRect frame, Listener listener) {
        super(frame);
        this.listener = listener;
        setBackgroundColor(new UIColor(0.08, 0.08, 0.10, 0.96));
        setUserInteractionEnabled(true);

        preview = new UILabel(new CGRect(16, 12, Math.max(100, frame.getWidth() - 32), 36));
        preview.setTextColor(UIColor.white());
        preview.setFont(UIFont.getSystemFont(22));
        preview.setTextAlignment(NSTextAlignment.Left);
        preview.setText("");
        addSubview(preview);

        rebuildKeys();
    }

    public void setBuffer(String text) {
        buffer = text != null ? text : "";
        preview.setText(buffer);
    }

    public String getBuffer() {
        return buffer;
    }

    private void rebuildKeys() {
        // Keep preview; drop key buttons.
        NSArray<UIView> subs = getSubviews();
        if (subs != null) {
            long n = subs.size();
            for (long i = n - 1; i >= 0; i--) {
                UIView sub = subs.get((int) i);
                if (sub != preview) {
                    sub.removeFromSuperview();
                }
            }
        }
        double width = getBounds().getWidth();
        double height = getBounds().getHeight();
        if (width < 10 || height < 10) {
            return;
        }
        double top = 56;
        double rowH = Math.min(56, (height - top - 20) / (ROWS.length + 1));
        double gap = 6;
        for (int r = 0; r < ROWS.length; r++) {
            String row = ROWS[r];
            double keyW = Math.min(64, (width - gap * (row.length() + 1)) / row.length());
            double rowWidth = row.length() * keyW + (row.length() - 1) * gap;
            double x0 = (width - rowWidth) / 2;
            for (int c = 0; c < row.length(); c++) {
                char ch = row.charAt(c);
                final char out = shift && Character.isLetter(ch) ? Character.toUpperCase(ch) : ch;
                UIButton b = keyButton(String.valueOf(out));
                b.setFrame(new CGRect(x0 + c * (keyW + gap), top + r * (rowH + gap), keyW, rowH));
                wire(b, new Runnable() {
                    public void run() {
                        typeChar(out);
                    }
                });
                addSubview(b);
            }
        }
        double y = top + ROWS.length * (rowH + gap);
        double actionW = Math.min(140, width / 4);
        UIButton shiftBtn = keyButton(shift ? "ABC" : "abc");
        shiftBtn.setFrame(new CGRect(gap * 2, y, actionW, rowH));
        wire(shiftBtn, new Runnable() {
            public void run() {
                shift = !shift;
                rebuildKeys();
            }
        });
        addSubview(shiftBtn);

        UIButton space = keyButton("space");
        space.setFrame(new CGRect((width - actionW * 1.5) / 2, y, actionW * 1.5, rowH));
        wire(space, new Runnable() {
            public void run() {
                typeChar(' ');
            }
        });
        addSubview(space);

        UIButton bk = keyButton("⌫");
        bk.setFrame(new CGRect(width - actionW - gap * 2, y, actionW, rowH));
        wire(bk, new Runnable() {
            public void run() {
                if (buffer.length() > 0) {
                    buffer = buffer.substring(0, buffer.length() - 1);
                    preview.setText(buffer);
                }
                if (listener != null) {
                    listener.onBackspace();
                }
            }
        });
        addSubview(bk);

        UIButton enter = keyButton("OK");
        enter.setFrame(new CGRect(width - actionW - gap * 2, y + rowH + gap, actionW, rowH));
        wire(enter, new Runnable() {
            public void run() {
                if (listener != null) {
                    listener.onEnter();
                }
            }
        });
        addSubview(enter);

        UIButton dismiss = keyButton("Close");
        dismiss.setFrame(new CGRect(gap * 2, y + rowH + gap, actionW, rowH));
        wire(dismiss, new Runnable() {
            public void run() {
                if (listener != null) {
                    listener.onDismiss();
                }
            }
        });
        addSubview(dismiss);
    }

    private void typeChar(char c) {
        buffer = buffer + c;
        preview.setText(buffer);
        if (listener != null) {
            listener.onChar(c);
        }
    }

    private static UIButton keyButton(String title) {
        UIButton b = new UIButton(UIButtonType.System);
        b.setTitle(title, UIControlState.Normal);
        b.setTitleColor(UIColor.white(), UIControlState.Normal);
        b.setBackgroundColor(new UIColor(0.22, 0.22, 0.26, 1));
        b.getLayer().setCornerRadius(8);
        b.setExclusiveTouch(true);
        return b;
    }

    private static void wire(UIButton b, final Runnable action) {
        b.addOnTouchUpInsideListener(new UIControl.OnTouchUpInsideListener() {
            public void onTouchUpInside(UIControl control, UIEvent event) {
                action.run();
            }
        });
        b.addOnPrimaryActionTriggeredListener(new UIControl.OnPrimaryActionTriggeredListener() {
            public void onPrimaryActionTriggered(UIControl control) {
                action.run();
            }
        });
    }

    @Override
    public void layoutSubviews() {
        super.layoutSubviews();
        CGRect bounds = getBounds();
        preview.setFrame(new CGRect(16, 12, Math.max(100, bounds.getWidth() - 32), 36));
        rebuildKeys();
    }
}
