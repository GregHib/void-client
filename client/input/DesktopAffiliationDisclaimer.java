import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;

/**
 * Desktop-only Swing modal for {@link AffiliationDisclaimer}.
 * <p>
 * Excluded from Android/iOS {@code prepareClientSources} (same as {@link DesktopGamepad})
 * because mobile rewrites {@code javax.swing} → {@code voidswing} and those stubs
 * do not include JOptionPane / JTextArea.
 */
final class DesktopAffiliationDisclaimer {
    private DesktopAffiliationDisclaimer() {
    }

    /**
     * Show the disclaimer if not yet accepted.
     * @return {@code true} to continue boot; {@code false} to exit
     */
    static boolean showIfNeeded() {
        if (AffiliationDisclaimer.isAccepted()) {
            return true;
        }
        try {
            JTextArea area = new JTextArea(AffiliationDisclaimer.BODY);
            area.setEditable(false);
            area.setLineWrap(true);
            area.setWrapStyleWord(true);
            area.setColumns(56);
            area.setRows(22);
            area.setCaretPosition(0);
            JScrollPane scroll = new JScrollPane(area);
            scroll.setPreferredSize(new Dimension(520, 420));
            int choice = JOptionPane.showOptionDialog(
                    null,
                    scroll,
                    AffiliationDisclaimer.TITLE,
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    new Object[]{AffiliationDisclaimer.ACCEPT_LABEL},
                    AffiliationDisclaimer.ACCEPT_LABEL);
            if (choice == 0) {
                AffiliationDisclaimer.markAccepted();
                return true;
            }
            return false;
        } catch (Throwable t) {
            System.out.println("void-osrs: disclaimer dialog failed: " + t);
            AffiliationDisclaimer.markAccepted();
            return true;
        }
    }
}
