package world.gregs.voidosrs.ios;

import org.robovm.apple.avfoundation.AVAudioSession;
import org.robovm.apple.avfoundation.AVAudioSessionCategory;
import org.robovm.apple.avfoundation.AVAudioSessionCategoryOptions;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIApplicationDelegateAdapter;
import org.robovm.apple.uikit.UIApplicationLaunchOptions;
import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UIDevice;
import org.robovm.apple.uikit.UIScreen;
import org.robovm.apple.uikit.UIUserInterfaceIdiom;
import org.robovm.apple.uikit.UIWindow;

public class Main extends UIApplicationDelegateAdapter {
    private UIWindow window;

    @Override
    public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        // Flavor / runtime marker for shared host code.
        if ("tvos".equalsIgnoreCase(System.getProperty("void.platform", ""))
                || UIDevice.getCurrentDevice().getUserInterfaceIdiom() == UIUserInterfaceIdiom.TV) {
            System.setProperty("void.platform", "tvos");
            // Cap software framebuffer — native 1920×1080 kills splash UIGraphics
            // on device (looks like a black screen). ScaleToFill stretches up.
            voidawt.AwtHost.LOGICAL_MAX_EDGE = 960;
        }
        // Activate Playback early so AudioQueue (voidsound) is not muted / silent
        // until the first line opens on the mixer thread.
        // MixWithOthers: exclusive Playback interrupts PiP / other apps even when
        // in-game volume is 0 — we only need a session for our mixer, not audio focus.
        try {
            AVAudioSession session = AVAudioSession.getSharedInstance();
            session.setCategory(AVAudioSessionCategory.Playback,
                    AVAudioSessionCategoryOptions.MixWithOthers);
            session.setActive(true);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        window = new UIWindow(UIScreen.getMainScreen().getBounds());
        window.setBackgroundColor(UIColor.black());
        // Keep screen from dimming / sleeping while the game is open
        // (UIApplication property — not on UIWindow)
        application.setIdleTimerDisabled(true);
        window.setRootViewController(new GameController());
        window.makeKeyAndVisible();
        return true;
    }

    public static void main(String[] args) {
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(args, null, Main.class);
        pool.close();
    }
}
