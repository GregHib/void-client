package world.gregs.voidosrs.ios;

import org.robovm.apple.uikit.UIDevice;
import org.robovm.apple.uikit.UIUserInterfaceIdiom;

/**
 * Runtime tvOS detection for the shared iOS/tvOS RoboVM host.
 * Build flavor also sets {@code -Dvoid.platform=tvos} / {@code robovm.iosPlatform=AppleTVOS}.
 */
public final class TvHost {
    private static Boolean cached;

    private TvHost() {}

    /** True on Apple TV (UIUserInterfaceIdiom.TV) or when built with the tvOS flavor property. */
    public static boolean isTvOS() {
        if (cached != null) {
            return cached.booleanValue();
        }
        boolean prop = "tvos".equalsIgnoreCase(System.getProperty("void.platform", ""));
        boolean idiom = false;
        try {
            idiom = UIDevice.getCurrentDevice().getUserInterfaceIdiom() == UIUserInterfaceIdiom.TV;
        } catch (Throwable ignored) {
            // early boot / missing UIKit
        }
        cached = Boolean.valueOf(prop || idiom);
        return cached.booleanValue();
    }
}
