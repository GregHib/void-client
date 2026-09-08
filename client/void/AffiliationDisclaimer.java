import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Non-affiliation disclaimer shown once before the game starts (desktop + Android + iOS).
 * <p>
 * Persistence: {@code user.home/void-disclaimer.txt} containing {@code accepted}.
 * After the user dismisses the modal, it never shows again on that install.
 * <p>
 * No URLs / deep links — plain text only (user request).
 */
public final class AffiliationDisclaimer {
    public static final String TITLE = "Non-Affiliation Disclaimer";

    /**
     * Full body for README / modal. No hyperlinks.
     * Adapted from the community preservation disclaimer; project name is Void.
     */
    public static final String BODY =
            "Void is a non-commercial, non-profit, community-run preservation project.\n"
                    + "\n"
                    + "Trademarks\n"
                    + "\"RuneScape\", \"Jagex\", and all related names, characters, artwork, music, and game terminology are trademarks or copyrights of Jagex Ltd. or their respective owners. Any use here is descriptive and nominative — we are not the rights holders and we make no claim to that ownership.\n"
                    + "\n"
                    + "We are not affiliated\n"
                    + "Void has not been endorsed, authorised, licensed, sponsored, or officially communicated with by Jagex Ltd., its parents, subsidiaries, or staff. Any opinions expressed here are those of the contributors, not of Jagex.\n"
                    + "\n"
                    + "No money changes hands\n"
                    + "This project is free in every direction: $0 to play, $0 to host, $0 to develop. We do not sell membership, in-game currency, items, accounts, services, advertising, or merchandise. We do not solicit donations to operate the game. There is no \"premium\" tier and there never will be.\n"
                    + "\n"
                    + "This is not a place to play current RuneScape\n"
                    + "You cannot access official RuneScape servers, character data, the Grand Exchange, or any other live Jagex service from this client. To play the official game, use Jagex's official channels.\n"
                    + "\n"
                    + "Original implementation\n"
                    + "The server software is independently written from scratch in our own codebase, based on publicly available research, screenshots, and community knowledge.\n"
                    + "\n"
                    + "Preservation framing\n"
                    + "The knowledge-base articles, screenshots, and news archives published with this project are reproductions of historical RuneScape website content, hosted for educational and archival purposes consistent with the principles of digital preservation. We make no commercial use of this material.\n"
                    + "\n"
                    + "Use at your own risk\n"
                    + "This client is provided \"as-is\", without warranty of any kind. Never reuse a password between this client and any other service — including the official RuneScape account. We are volunteers, not a security-audited operator.\n"
                    + "\n"
                    + "Rights-holder contact\n"
                    + "If you are a rights holder and believe any content in this project infringes your rights, contact the project maintainers. We respond promptly and remove specifically identified material on receipt of a good-faith request, without requiring formal legal process.\n";

    /** Button label — accepting persists and never shows again. */
    public static final String ACCEPT_LABEL = "Don't show this again";

    private AffiliationDisclaimer() {
    }

    /** {@code user.home/void-disclaimer.txt} */
    static File file() {
        String home = System.getProperty("user.home", ".");
        return new File(home, "void-disclaimer.txt");
    }

    /** True after the user has dismissed the first-run modal on this install. */
    public static boolean isAccepted() {
        File f = file();
        if (!f.isFile()) {
            return false;
        }
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(f));
            String line = in.readLine();
            return line != null && line.trim().equalsIgnoreCase("accepted");
        } catch (Throwable ignored) {
            return false;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Throwable ignored) {
                }
            }
        }
    }

    /** Persist acceptance so the modal never appears again. */
    public static void markAccepted() {
        FileWriter w = null;
        try {
            File f = file();
            File parent = f.getParentFile();
            if (parent != null) {
                parent.mkdirs();
            }
            w = new FileWriter(f);
            w.write("accepted\n");
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            if (w != null) {
                try {
                    w.close();
                } catch (Throwable ignored) {
                }
            }
        }
    }
}
