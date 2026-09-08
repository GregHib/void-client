/**
 * Platform mouse backend for Microbot VirtualMouse.
 * Desktop dispatches AWT events on {@link DisplayModeManagerContainer50#gameCanvas}; mobile uses
 * voidawt {@code AwtHost} inject APIs (resolved by reflection so desktop builds
 * do not hard-depend on android sources).
 */
interface MicrobotMouseBackend {

    void mouseMoved(int x, int y);

    void mousePressed(int x, int y, int button);

    void mouseReleased(int x, int y, int button);

    void mouseClicked(int x, int y, int button);

    int canvasWidth();

    int canvasHeight();
}
