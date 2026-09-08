package world.gregs.voidosrs.ios;

import org.robovm.apple.coregraphics.CGPoint;
import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.dispatch.DispatchQueue;
import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSSet;
import org.robovm.apple.gamecontroller.GCController;
import org.robovm.apple.gamecontroller.GCControllerButtonInput;
import org.robovm.apple.gamecontroller.GCControllerDirectionPad;
import org.robovm.apple.gamecontroller.GCExtendedGamepad;
import org.robovm.apple.gamecontroller.GCMicroGamepad;
import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UIEvent;
import org.robovm.apple.uikit.UIImage;
import org.robovm.apple.uikit.UIImageView;
import org.robovm.apple.uikit.UITouch;
import org.robovm.apple.uikit.UIView;
import org.robovm.apple.uikit.UIViewContentMode;
import org.robovm.objc.block.VoidBlock1;
import org.robovm.objc.block.VoidBlock3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import voidawt.AwtHost;
import voidawt.event.MouseEvent;

/**
 * iOS game surface: blits each {@link AwtHost} frame into an {@link UIImageView}
 * and maps multitouch to AWT mouse / wheel (same gestures as Android).
 *
 * <p>Tap → left click, long-press (hold still) → right click,
 * one-finger drag → left-button mouse drag (map, items, …),
 * two-finger pan → camera orbit, pinch → zoom,
 * 4-finger tap → developer console (no auto IME; tap later toggles keyboard).
 * Soft keyboard open for chat/login is owned by {@link GameController} /
 * {@code MobileKeyboard}; this view dismisses IME on tap-outside while
 * {@link AwtHost#SOFT_KEYBOARD_OPEN} is true.
 *
 * <p>Apple TV <b>Siri Remote</b> ({@link GCMicroGamepad} — Apple “Controlling Input on tvOS”):
 * touch-surface swipe → analog dpad (cursor), firm click on touchpad → {@code buttonA}
 * (left click), Play/Pause → {@code buttonX} (right click). Requires the host VC to be a
 * {@code GCEventViewController} with {@code controllerUserInteractionEnabled=false}
 * during gameplay so UIKit does not steal Select / swipes.
 * DualShock / Xbox / MFi ({@link GCController}): left stick moves a drawn
 * cursor, ✕ left-click, ○ right-click, L2/R2 zoom, right stick camera orbit —
 * same mapping as Android {@code MainActivity.GameView} pad path.
 *
 * <p>Window resize (Stage Manager / split): the image view stretches immediately;
 * {@link AwtHost#setDisplaySize} (client layout redraw) runs only after the size
 * has been quiet for {@value #RESIZE_SETTLE_MS} ms.
 */
public class GameView extends UIView implements AwtHost.Presenter {
    private static final float PINCH_PX_PER_NOTCH = 28f;
    private static final float CURSOR_SIZE = 32f;
    private static final float CURSOR_HOT_X = 6f;
    private static final float CURSOR_HOT_Y = 6f;
    /**
     * Hold still within this → long-press right-click.
     * Move past this before timeout → left-button mouse drag (map, items, …).
     * Two-finger pan → camera orbit; pinch → zoom; pad right stick also orbits.
     */
    private static final float TOUCH_SLOP = 28f;
    /** DualShock / gamepad → virtual mouse (mirrors Android constants). */
    private static final float PAD_DEADZONE = 0.15f;
    private static final float PAD_CURSOR_SPEED = 14f;
    private static final float PAD_ORBIT_SCALE = 10f;
    private static final long PAD_ZOOM_INTERVAL_MS = 90L;
    private static final float PAD_TRIGGER_THRESHOLD = 0.35f;
    private static final long PAD_TICK_MS = 16L;

    private final UIImageView imageView;
    private final UIImageView cursorView;
    /** Strong ref so RoboVM GC cannot drop the frame while UIImageView displays it. */
    private UIImage lastFrame;
    private int presentCount;
    private final Map<Long, CGPoint> active = new LinkedHashMap<Long, CGPoint>();
    private boolean down;
    private boolean multiTouch;
    private boolean dragging;
    private boolean longPressFired;
    /** Fired once while 4+ fingers are down; reset when all fingers lift. */
    private boolean fourFingerConsoleFired;
    private int multiTouchMaxCount;
    private boolean ignoreSingleFinger;
    private float downVx;
    private float downVy;
    private int downX;
    private int downY;
    private float lastPinchDist = -1f;
    private float pinchAccum;
    /** Midpoint of the last two-finger sample (camera pan). */
    private float lastPanX;
    private float lastPanY;
    private boolean panTracked;
    private int frameW = AwtHost.GAME_WIDTH;
    private int frameH = AwtHost.GAME_HEIGHT;
    private CGPoint lastTouchPoint = new CGPoint(0, 0);
    private Runnable sizeListener;
    /** Bumped to cancel a pending long-press callback. */
    private int pressGeneration;
    /**
     * Last size pushed into {@link AwtHost#setDisplaySize}. While the user is
     * still dragging a Stage Manager / split window, we only stretch the
     * existing framebuffer ({@link UIViewContentMode#ScaleToFill}) and defer
     * the client viewport relayout until the size has been stable for
     * {@link #RESIZE_SETTLE_MS}.
     */
    private int appliedW;
    private int appliedH;
    private int pendingW;
    private int pendingH;
    /** Bumped to cancel a pending settled-resize callback. */
    private int resizeGeneration;
    /** Quiet period after the last layout change before adapting the game layout. */
    private static final long RESIZE_SETTLE_MS = 3000;

    // DualShock / gamepad → virtual mouse
    private float cursorVx = -1f;
    private float cursorVy = -1f;
    private boolean padActive;
    private GCController padController;
    private float stickLX;
    private float stickLY;
    private float stickRX;
    private float stickRY;
    private float triggerL2;
    private float triggerR2;
    private boolean padLeftDown;
    private boolean padRightDown;
    private boolean padTickRunning;
    private long lastPadZoomAt;
    /** Bumped to cancel a pending pad-tick callback. */
    private int padTickGeneration;
    private NSObject padConnectObserver;
    private NSObject padDisconnectObserver;
    /**
     * Siri Remote ({@link GCMicroGamepad}) bound.
     * <p>
     * Force-click on the touchpad ({@code buttonA}): short = left, hold ≥450ms = right.
     * Soft contact during dpad swipes is ignored. Play/Pause remains the same mapping
     * as backup.
     */
    private boolean padIsMicro;
    private long lastSiriSteerAt;
    /** Play/Pause hold tracking for right-click (long press). */
    private long siriXDownAt;
    private boolean siriXDown;
    private static final long SIRI_X_RIGHT_CLICK_MS = 450L;
    /** Touchpad force-click ({@code buttonA}) → left / hold-right, swipe-filtered. */
    private boolean siriADown;
    private boolean siriACancelled;
    private float siriAPeak;
    private long siriADownAt;
    /** Bumped to cancel a deferred force-click after swipe-start A pulses. */
    private int siriAClickGeneration;
    /** Min analog pressure to treat A as a firm click (soft swipe contact is often lower). */
    private static final float SIRI_FORCE_MIN = 0.40f;
    /** After A-up, wait this long so a following dpad swipe can cancel the click. */
    private static final long SIRI_A_CLICK_DELAY_MS = 80L;
    /** Ignore A if the touchpad steered within this window (before/during/after). */
    private static final long SIRI_STEER_GRACE_MS = 180L;

    public GameView(CGRect frame) {
        super(frame);
        // Apple TV has no touch screen — ignore multitouch; Siri Remote is GC-only.
        if (TvHost.isTvOS()) {
            setMultipleTouchEnabled(false);
            // Keep interaction for focus/GCEventViewController; touches* are no-ops.
            setUserInteractionEnabled(true);
        } else {
            setMultipleTouchEnabled(true);
            setUserInteractionEnabled(true);
        }
        setBackgroundColor(UIColor.black());
        imageView = new UIImageView(getBounds());
        imageView.setContentMode(UIViewContentMode.ScaleToFill);
        imageView.setUserInteractionEnabled(false);
        addSubview(imageView);
        cursorView = new UIImageView(new CGRect(0, 0, CURSOR_SIZE, CURSOR_SIZE));
        UIImage cursor = UIImage.getImage("cursor_normal_select");
        if (cursor == null) {
            cursor = UIImage.getImage("cursor_normal_select.png");
        }
        cursorView.setImage(cursor);
        cursorView.setContentMode(UIViewContentMode.ScaleToFill);
        cursorView.setUserInteractionEnabled(false);
        cursorView.setHidden(true);
        addSubview(cursorView);
        startPadListening();
        if (TvHost.isTvOS()) {
            // Always show a cursor on Apple TV — no touch surface for gameplay.
            ensureCursor();
            setPadCursor(cursorVx, cursorVy, true);
        }
    }

    /**
     * Optional HUD hit-test ahead of AWT mouse inject (tvOS Server chip, …).
     * {@code viewX}/{@code viewY} are in this view’s bounds (same as the cursor).
     */
    public interface HudClickHandler {
        /** @return true if the click was consumed (skip game inject) */
        boolean onHudClick(float viewX, float viewY);
    }

    private HudClickHandler hudClickHandler;

    public void setHudClickHandler(HudClickHandler handler) {
        this.hudClickHandler = handler;
    }

    /**
     * Hold tvOS focus on the game surface so overlay chips cannot steal Select.
     * Gameplay input still comes from {@link GCController}, not UIKit focus.
     */
    @Override
    public boolean canBecomeFocused() {
        return TvHost.isTvOS() || super.canBecomeFocused();
    }

    /**
     * Subscribe to {@link GCController} connect/disconnect and pick up any pad
     * already paired. Call once from the constructor.
     */
    private void startPadListening() {
        padConnectObserver = GCController.Notifications.observeDidConnect(
                new VoidBlock1<GCController>() {
                    public void invoke(GCController controller) {
                        System.out.println("void-osrs pad connect vendor="
                                + (controller != null ? controller.getVendorName() : null));
                        try {
                            attachPad(controller);
                        } catch (Throwable t) {
                            System.out.println("void-osrs pad attach failed: " + t);
                            t.printStackTrace();
                        }
                    }
                });
        padDisconnectObserver = GCController.Notifications.observeDidDisconnect(
                new VoidBlock1<GCController>() {
                    public void invoke(GCController controller) {
                        System.out.println("void-osrs pad disconnect vendor="
                                + (controller != null ? controller.getVendorName() : null));
                        if (padController != null && padController.equals(controller)) {
                            deactivatePad();
                        } else if (!anyPadConnected()) {
                            deactivatePad();
                        }
                    }
                });
        // Bluetooth DualShock discovery (no-op if already connected).
        GCController.startWirelessControllerDiscovery(new Runnable() {
            public void run() {
                System.out.println("void-osrs pad wireless discovery finished");
            }
        });
        NSArray<GCController> already = GCController.getControllers();
        if (already != null) {
            // tvOS: bind Siri Remote (micro) first — that's the primary input.
            if (TvHost.isTvOS()) {
                long n = already.size();
                for (int i = 0; i < n; i++) {
                    GCController c = already.get(i);
                    if (c != null && hasMicro(c)) {
                        attachPad(c);
                        if (padActive) {
                            break;
                        }
                    }
                }
            }
            if (!padActive) {
                long n = already.size();
                for (int i = 0; i < n; i++) {
                    attachPad(already.get(i));
                    if (padActive) {
                        break;
                    }
                }
            }
        }
    }

    private static boolean hasMicro(GCController c) {
        try {
            return c.getMicroGamepad() != null;
        } catch (Throwable ignored) {
            return false;
        }
    }

    private boolean anyPadConnected() {
        NSArray<GCController> list = GCController.getControllers();
        if (list == null) {
            return false;
        }
        long n = list.size();
        for (int i = 0; i < n; i++) {
            GCController c = list.get(i);
            if (c != null) {
                try {
                    if (c.getExtendedGamepad() != null) {
                        return true;
                    }
                } catch (Throwable ignored) {
                }
                try {
                    if (c.getMicroGamepad() != null) {
                        return true;
                    }
                } catch (Throwable ignored) {
                }
            }
        }
        return false;
    }

    private void attachPad(GCController controller) {
        if (controller == null) {
            return;
        }
        // Profiles: getMicroGamepad()/getExtendedGamepad() can ClassCastException on
        // RoboVM when the native profile doesn't match — catch per call.
        GCExtendedGamepad extended = null;
        GCMicroGamepad micro = null;
        try {
            micro = controller.getMicroGamepad();
        } catch (Throwable ignored) {
        }
        try {
            extended = controller.getExtendedGamepad();
        } catch (Throwable ignored) {
        }
        // Apple TV: Siri Remote = GCMicroGamepad. Prefer it over an extended pad
        // that may also be connected (user is on the Remote).
        boolean useMicro = micro != null && (TvHost.isTvOS() || extended == null);
        if (!useMicro && extended == null) {
            return;
        }
        // Prefer the newly connected pad; rebind handlers every time.
        if (padController != null && padController != controller) {
            clearPadHandlers(padController);
        }
        padController = controller;
        controller.setHandlerQueue(DispatchQueue.getMainQueue());
        // Menu on Siri Remote: stay in-app (GCEventViewController + pause handler)
        // instead of bouncing to the tvOS Home Screen while gameplay owns input.
        try {
            controller.setControllerPausedHandler(new VoidBlock1<GCController>() {
                public void invoke(GCController c) {
                    System.out.println("void-osrs siri Menu (pause handler)");
                }
            });
        } catch (Throwable ignored) {
        }
        if (useMicro) {
            padIsMicro = true;
            bindMicroPadHandlers(micro);
            System.out.println("void-osrs pad profile=SiriRemote/micro vendor="
                    + controller.getVendorName());
        } else {
            padIsMicro = false;
            bindPadHandlers(extended);
            System.out.println("void-osrs pad profile=extended vendor="
                    + controller.getVendorName());
        }
        activatePad();
    }

    private void clearPadHandlers(GCController controller) {
        if (controller == null) {
            return;
        }
        try {
            GCExtendedGamepad pad = controller.getExtendedGamepad();
            if (pad != null) {
                pad.getLeftThumbstick().setValueChangedHandler(null);
                pad.getRightThumbstick().setValueChangedHandler(null);
                pad.getButtonA().setPressedChangedHandler(null);
                pad.getButtonB().setPressedChangedHandler(null);
                pad.getButtonX().setPressedChangedHandler(null);
                pad.getButtonY().setPressedChangedHandler(null);
                pad.getLeftShoulder().setPressedChangedHandler(null);
                pad.getRightShoulder().setPressedChangedHandler(null);
                pad.getLeftTrigger().setValueChangedHandler(null);
                pad.getLeftTrigger().setPressedChangedHandler(null);
                pad.getRightTrigger().setValueChangedHandler(null);
                pad.getRightTrigger().setPressedChangedHandler(null);
                clearButton(pad.getDpad() != null ? pad.getDpad().getUp() : null);
                clearButton(pad.getDpad() != null ? pad.getDpad().getDown() : null);
                clearButton(pad.getDpad() != null ? pad.getDpad().getLeft() : null);
                clearButton(pad.getDpad() != null ? pad.getDpad().getRight() : null);
                clearButton(pad.getLeftThumbstickButton());
                clearButton(pad.getRightThumbstickButton());
                clearButton(pad.getButtonMenu());
            }
        } catch (Throwable ignored) {
        }
        try {
            GCMicroGamepad micro = controller.getMicroGamepad();
            if (micro != null) {
                if (micro.getDpad() != null) {
                    micro.getDpad().setValueChangedHandler(null);
                }
                if (micro.getButtonA() != null) {
                    micro.getButtonA().setValueChangedHandler(null);
                    micro.getButtonA().setPressedChangedHandler(null);
                }
                clearButton(micro.getButtonX());
                clearButton(micro.getButtonMenu());
            }
        } catch (Throwable ignored) {
        }
    }

    /**
     * Siri Remote ({@link GCMicroGamepad}):
     * <ul>
     *   <li>Touch surface swipe → {@code dpad} → move cursor (never a mouse button)</li>
     *   <li>Force-click touchpad ({@code buttonA}) → short = left; hold ≥450ms = right</li>
     *   <li>Play/Pause → short = left click; hold ≥450ms = right click</li>
     *   <li>Menu → {@code controllerPausedHandler}</li>
     * </ul>
     */
    private void bindMicroPadHandlers(final GCMicroGamepad pad) {
        pad.setReportsAbsoluteDpadValues(false);
        try {
            pad.setAllowsRotation(false);
        } catch (Throwable ignored) {
        }
        if (pad.getDpad() != null) {
            pad.getDpad().setValueChangedHandler(
                    new VoidBlock3<GCControllerDirectionPad, Float, Float>() {
                        public void invoke(GCControllerDirectionPad dpad, Float x, Float y) {
                            stickLX = x != null ? x.floatValue() : 0f;
                            stickLY = y != null ? -y.floatValue() : 0f;
                            if (Math.abs(stickLX) > PAD_DEADZONE || Math.abs(stickLY) > PAD_DEADZONE) {
                                lastSiriSteerAt = System.currentTimeMillis();
                                // Swipe kills any in-flight force-click (A-down or deferred).
                                siriACancelled = true;
                                siriAClickGeneration++;
                                if (padLeftDown) {
                                    forceReleaseLeft("siri-steer");
                                }
                            }
                            startPadTick();
                        }
                    });
        }
        // Force-click: valueChanged gives pressure; click only on clean A-up (no swipe).
        pad.getButtonA().setValueChangedHandler(
                new VoidBlock3<GCControllerButtonInput, Float, Boolean>() {
                    public void invoke(GCControllerButtonInput button, Float value, Boolean pressed) {
                        onSiriForceClick(
                                pressed != null && pressed.booleanValue(),
                                value != null ? value.floatValue() : 0f);
                    }
                });
        // Play/Pause: backup left / hold-right on the Siri Remote.
        pad.getButtonX().setPressedChangedHandler(
                new VoidBlock3<GCControllerButtonInput, Float, Boolean>() {
                    public void invoke(GCControllerButtonInput button, Float value, Boolean pressed) {
                        onSiriPlayPause(pressed != null && pressed.booleanValue());
                    }
                });
        System.out.println("void-osrs siri map: swipe=move force-click=left (hold=right) Play/Pause=same");
    }

    private boolean siriSteeringRecently() {
        long now = System.currentTimeMillis();
        return Math.abs(stickLX) > PAD_DEADZONE
                || Math.abs(stickLY) > PAD_DEADZONE
                || (now - lastSiriSteerAt) < SIRI_STEER_GRACE_MS;
    }

    /**
     * Touchpad force-click ({@code buttonA}): short = left, hold ≥450ms = right.
     * Soft contact during swipes also asserts A on real remotes, so we only fire
     * after A-up when pressure looked firm and no dpad motion happened around it.
     */
    private void onSiriForceClick(boolean pressed, float value) {
        long now = System.currentTimeMillis();
        if (pressed) {
            if (!siriADown) {
                siriADown = true;
                siriADownAt = now;
                siriAPeak = value;
                siriACancelled = siriSteeringRecently();
                siriAClickGeneration++; // cancel any prior deferred click
                if (siriACancelled) {
                    System.out.println("void-osrs siri A down ignored (steering) v=" + value);
                }
            } else {
                if (value > siriAPeak) {
                    siriAPeak = value;
                }
                if (siriSteeringRecently()) {
                    siriACancelled = true;
                }
            }
            return;
        }
        if (!siriADown) {
            return;
        }
        siriADown = false;
        if (siriSteeringRecently()) {
            siriACancelled = true;
        }
        final float peak = siriAPeak;
        final long held = now - siriADownAt;
        final boolean right = held >= SIRI_X_RIGHT_CLICK_MS;
        siriAPeak = 0f;
        if (siriACancelled || peak < SIRI_FORCE_MIN) {
            System.out.println("void-osrs siri A cancel peak=" + peak
                    + " cancelled=" + siriACancelled + " held=" + held + "ms");
            return;
        }
        // Defer: swipe-start often pulses A before dpad moves — give steer a beat to cancel.
        final int gen = ++siriAClickGeneration;
        DispatchQueue.getMainQueue().after(SIRI_A_CLICK_DELAY_MS, TimeUnit.MILLISECONDS, new Runnable() {
            public void run() {
                if (gen != siriAClickGeneration) {
                    return;
                }
                if (siriSteeringRecently()) {
                    System.out.println("void-osrs siri A deferred cancel (steer) peak=" + peak);
                    return;
                }
                fireSiriClick("force", peak, right, held);
            }
        });
    }

    private void fireSiriClick(String reason, float peak, boolean right, long heldMs) {
        ensureCursor();
        if (!right && hudClickHandler != null
                && hudClickHandler.onHudClick(cursorVx, cursorVy)) {
            redrawCursor();
            return;
        }
        int[] xy = mapCursor();
        System.out.println("void-osrs siri " + reason + " " + (right ? "right" : "left")
                + "-click @" + xy[0] + "," + xy[1] + " peak=" + peak + " held=" + heldMs + "ms");
        int button = right ? MouseEvent.BUTTON3 : MouseEvent.BUTTON1;
        AwtHost.injectMouse(MouseEvent.MOUSE_MOVED, xy[0], xy[1], 0, 0);
        AwtHost.injectMouse(MouseEvent.MOUSE_PRESSED, xy[0], xy[1], button, 1);
        AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], button, 1);
        AwtHost.injectMouse(MouseEvent.MOUSE_CLICKED, xy[0], xy[1], button, 1);
        redrawCursor();
    }

    /**
     * Siri Remote Play/Pause: short = left click, long-press = right click.
     */
    private void onSiriPlayPause(boolean pressed) {
        ensureCursor();
        long now = System.currentTimeMillis();
        if (pressed) {
            siriXDown = true;
            siriXDownAt = now;
            redrawCursor();
            return;
        }
        if (!siriXDown) {
            return;
        }
        siriXDown = false;
        long held = now - siriXDownAt;
        boolean right = held >= SIRI_X_RIGHT_CLICK_MS;
        fireSiriClick("Play/Pause", 1f, right, held);
    }

    private void forceReleaseLeft(String reason) {
        if (!padLeftDown) {
            return;
        }
        padLeftDown = false;
        int[] xy = mapCursor();
        AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], MouseEvent.BUTTON1, 1);
        System.out.println("void-osrs force left-up (" + reason + ")");
    }

    private static void clearButton(GCControllerButtonInput input) {
        if (input != null) {
            input.setPressedChangedHandler(null);
        }
    }

    private void bindPadHandlers(final GCExtendedGamepad pad) {
        // GCController Y: +up; screen Y: +down — negate both sticks.
        pad.getLeftThumbstick().setValueChangedHandler(
                new VoidBlock3<GCControllerDirectionPad, Float, Float>() {
                    public void invoke(GCControllerDirectionPad dpad, Float x, Float y) {
                        stickLX = x != null ? x.floatValue() : 0f;
                        stickLY = y != null ? -y.floatValue() : 0f;
                        startPadTick();
                    }
                });
        pad.getRightThumbstick().setValueChangedHandler(
                new VoidBlock3<GCControllerDirectionPad, Float, Float>() {
                    public void invoke(GCControllerDirectionPad dpad, Float x, Float y) {
                        stickRX = x != null ? x.floatValue() : 0f;
                        stickRY = y != null ? -y.floatValue() : 0f;
                        startPadTick();
                    }
                });
        // ✕ Cross → left click (Apple maps Cross to buttonA on DualShock)
        pad.getButtonA().setPressedChangedHandler(
                new VoidBlock3<GCControllerButtonInput, Float, Boolean>() {
                    public void invoke(GCControllerButtonInput button, Float value, Boolean pressed) {
                        onPadClick(true, pressed != null && pressed.booleanValue());
                    }
                });
        // ○ Circle → right click
        pad.getButtonB().setPressedChangedHandler(
                new VoidBlock3<GCControllerButtonInput, Float, Boolean>() {
                    public void invoke(GCControllerButtonInput button, Float value, Boolean pressed) {
                        onPadClick(false, pressed != null && pressed.booleanValue());
                    }
                });
        // Square / Triangle / L1 / R1 / L3 / R3 / D-pad → learn alias or fire binding.
        // Labels are ASCII — RS bitmap font cannot draw ↑↓ / □△ (shows '?').
        // D-pad: GameController already exposes discrete buttons with Android
        // KEYCODE_DPAD_* ids (19–22). No hat-axis bridge needed (unlike Android
        // DualShock AXIS_HAT_* → MainActivity.updateHatDpad).
        bindAliasButton(pad.getButtonX(), 99, "Square");
        bindAliasButton(pad.getButtonY(), 100, "Triangle");
        bindAliasButton(pad.getLeftShoulder(), 102, "L1");
        bindAliasButton(pad.getRightShoulder(), 103, "R1");
        bindAliasButton(pad.getLeftThumbstickButton(), 106, "L3");
        bindAliasButton(pad.getRightThumbstickButton(), 107, "R3");
        if (pad.getDpad() != null) {
            bindAliasButton(pad.getDpad().getUp(), 19, "Up");
            bindAliasButton(pad.getDpad().getDown(), 20, "Down");
            bindAliasButton(pad.getDpad().getLeft(), 21, "Left");
            bindAliasButton(pad.getDpad().getRight(), 22, "Right");
        }
        // Options / Menu → world map (Android KEYCODE_BUTTON_START = 108)
        bindAliasButton(pad.getButtonMenu(), 108, "Options");
        // L2 analog → zoom out (also treat digital press)
        pad.getLeftTrigger().setValueChangedHandler(
                new VoidBlock3<GCControllerButtonInput, Float, Boolean>() {
                    public void invoke(GCControllerButtonInput button, Float value, Boolean pressed) {
                        triggerL2 = value != null ? value.floatValue() : 0f;
                        startPadTick();
                    }
                });
        pad.getLeftTrigger().setPressedChangedHandler(
                new VoidBlock3<GCControllerButtonInput, Float, Boolean>() {
                    public void invoke(GCControllerButtonInput button, Float value, Boolean pressed) {
                        if (pressed != null && pressed.booleanValue()) {
                            ensureCursor();
                            int[] xy = mapCursor();
                            AwtHost.injectWheel(xy[0], xy[1], 1);
                            lastPadZoomAt = System.currentTimeMillis();
                            startPadTick();
                        }
                    }
                });
        // R2 analog → zoom in
        pad.getRightTrigger().setValueChangedHandler(
                new VoidBlock3<GCControllerButtonInput, Float, Boolean>() {
                    public void invoke(GCControllerButtonInput button, Float value, Boolean pressed) {
                        triggerR2 = value != null ? value.floatValue() : 0f;
                        startPadTick();
                    }
                });
        pad.getRightTrigger().setPressedChangedHandler(
                new VoidBlock3<GCControllerButtonInput, Float, Boolean>() {
                    public void invoke(GCControllerButtonInput button, Float value, Boolean pressed) {
                        if (pressed != null && pressed.booleanValue()) {
                            ensureCursor();
                            int[] xy = mapCursor();
                            AwtHost.injectWheel(xy[0], xy[1], -1);
                            lastPadZoomAt = System.currentTimeMillis();
                            startPadTick();
                        }
                    }
                });
    }

    private void bindAliasButton(GCControllerButtonInput input, final int buttonId, final String label) {
        if (input == null) {
            return;
        }
        input.setPressedChangedHandler(
                new VoidBlock3<GCControllerButtonInput, Float, Boolean>() {
                    public void invoke(GCControllerButtonInput button, Float value, Boolean pressed) {
                        if (pressed != null && pressed.booleanValue()) {
                            AwtHost.notifyPadButton(buttonId, label);
                        }
                    }
                });
    }

    private void onPadClick(boolean left, boolean pressed) {
        ensureCursor();
        // UIKit HUD overlays (tvOS Server chip) sit above the framebuffer — consume
        // before AWT inject so a real touchpad click on the chip opens prefs.
        if (left && pressed && hudClickHandler != null
                && hudClickHandler.onHudClick(cursorVx, cursorVy)) {
            redrawCursor();
            return;
        }
        injectPadButton(left, pressed);
        redrawCursor();
    }

    private void injectPadButton(boolean left, boolean pressed) {
        int[] xy = mapCursor();
        if (left) {
            if (pressed) {
                padLeftDown = true;
                AwtHost.injectMouse(MouseEvent.MOUSE_PRESSED, xy[0], xy[1], MouseEvent.BUTTON1, 1);
            } else if (padLeftDown) {
                padLeftDown = false;
                AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], MouseEvent.BUTTON1, 1);
                AwtHost.injectMouse(MouseEvent.MOUSE_CLICKED, xy[0], xy[1], MouseEvent.BUTTON1, 1);
            }
        } else {
            if (pressed) {
                padRightDown = true;
                System.out.println("void-osrs siri Play/Pause right-press @ " + xy[0] + "," + xy[1]);
                AwtHost.injectMouse(MouseEvent.MOUSE_MOVED, xy[0], xy[1], 0, 0);
                AwtHost.injectMouse(MouseEvent.MOUSE_PRESSED, xy[0], xy[1], MouseEvent.BUTTON3, 1);
            } else if (padRightDown) {
                padRightDown = false;
                AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], MouseEvent.BUTTON3, 1);
                AwtHost.injectMouse(MouseEvent.MOUSE_CLICKED, xy[0], xy[1], MouseEvent.BUTTON3, 1);
            }
        }
    }

    private void activatePad() {
        padActive = true;
        ensureCursor();
        startPadTick();
        AwtHost.setPadConnected(true);
        redrawCursor();
    }

    private void deactivatePad() {
        if (!padActive && padController == null) {
            return;
        }
        if (padLeftDown || padRightDown) {
            int[] xy = mapCursor();
            if (padLeftDown) {
                AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], MouseEvent.BUTTON1, 1);
            }
            if (padRightDown) {
                AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], MouseEvent.BUTTON3, 1);
            }
        }
        clearPadHandlers(padController);
        padActive = false;
        padController = null;
        stickLX = 0f;
        stickLY = 0f;
        stickRX = 0f;
        stickRY = 0f;
        triggerL2 = 0f;
        triggerR2 = 0f;
        padLeftDown = false;
        padRightDown = false;
        padIsMicro = false;
        siriXDown = false;
        stopPadTick();
        AwtHost.setPadConnected(false);
        redrawCursor();
    }

    private void ensureCursor() {
        float w = Math.max(1f, (float) getBounds().getWidth());
        float h = Math.max(1f, (float) getBounds().getHeight());
        if (cursorVx < 0f || cursorVy < 0f) {
            cursorVx = w * 0.5f;
            cursorVy = h * 0.5f;
        } else {
            cursorVx = Math.max(0f, Math.min(w - 1f, cursorVx));
            cursorVy = Math.max(0f, Math.min(h - 1f, cursorVy));
        }
    }

    private int[] mapCursor() {
        return map(new CGPoint(cursorVx, cursorVy));
    }

    private void redrawCursor() {
        setPadCursor(cursorVx, cursorVy, padActive || TvHost.isTvOS());
    }

    public void setPadCursor(float x, float y, boolean visible) {
        cursorView.setHidden(!visible);
        if (!visible) {
            return;
        }
        cursorView.setFrame(new CGRect(x - CURSOR_HOT_X, y - CURSOR_HOT_Y, CURSOR_SIZE, CURSOR_SIZE));
        bringSubviewToFront(cursorView);
    }

    private void stopPadTick() {
        padTickGeneration++;
        padTickRunning = false;
    }

    private void startPadTick() {
        if (!padActive) {
            return;
        }
        if (padTickRunning) {
            return;
        }
        padTickRunning = true;
        final int gen = ++padTickGeneration;
        // First tick ASAP (mirrors Android Handler.post); then every PAD_TICK_MS.
        DispatchQueue.getMainQueue().async(new Runnable() {
            public void run() {
                runPadTick(gen);
            }
        });
    }

    private void runPadTick(final int gen) {
        if (gen != padTickGeneration) {
            return;
        }
        boolean keep = tickPad();
        if (!keep) {
            padTickRunning = false;
            return;
        }
        DispatchQueue.getMainQueue().after(PAD_TICK_MS, TimeUnit.MILLISECONDS, new Runnable() {
            public void run() {
                runPadTick(gen);
            }
        });
    }

    private boolean needsPadTick() {
        return Math.abs(stickLX) > PAD_DEADZONE
                || Math.abs(stickLY) > PAD_DEADZONE
                || Math.abs(stickRX) > PAD_DEADZONE
                || Math.abs(stickRY) > PAD_DEADZONE
                || triggerL2 > PAD_TRIGGER_THRESHOLD
                || triggerR2 > PAD_TRIGGER_THRESHOLD;
    }

    private float dead(float v) {
        return Math.abs(v) < PAD_DEADZONE ? 0f : v;
    }

    private boolean tickPad() {
        if (!padActive) {
            return false;
        }
        ensureCursor();
        float lx = dead(stickLX);
        float ly = dead(stickLY);
        float rx = dead(stickRX);
        float ry = dead(stickRY);
        boolean moved = false;

        if (lx != 0f || ly != 0f) {
            float w = Math.max(1f, (float) getBounds().getWidth());
            float h = Math.max(1f, (float) getBounds().getHeight());
            cursorVx = Math.max(0f, Math.min(w - 1f, cursorVx + lx * PAD_CURSOR_SPEED));
            cursorVy = Math.max(0f, Math.min(h - 1f, cursorVy + ly * PAD_CURSOR_SPEED));
            if (padIsMicro) {
                lastSiriSteerAt = System.currentTimeMillis();
            }
            int[] xy = mapCursor();
            // Siri path: never hold left button from touchpad; only Play/Pause clicks.
            if (padLeftDown && !padIsMicro) {
                AwtHost.injectMouse(MouseEvent.MOUSE_DRAGGED, xy[0], xy[1], MouseEvent.BUTTON1, 0);
            } else if (padRightDown) {
                AwtHost.injectMouse(MouseEvent.MOUSE_DRAGGED, xy[0], xy[1], MouseEvent.BUTTON3, 0);
            } else {
                AwtHost.injectMouse(MouseEvent.MOUSE_MOVED, xy[0], xy[1], 0, 0);
            }
            moved = true;
        }

        if (rx != 0f || ry != 0f) {
            AwtHost.injectCameraOrbit(rx * PAD_ORBIT_SCALE, ry * PAD_ORBIT_SCALE);
            moved = true;
        }

        // Zoom on the "2" triggers only: R2 in, L2 out.
        boolean zoomIn = triggerR2 > PAD_TRIGGER_THRESHOLD;
        boolean zoomOut = triggerL2 > PAD_TRIGGER_THRESHOLD;
        long now = System.currentTimeMillis();
        if ((zoomIn || zoomOut) && now - lastPadZoomAt >= PAD_ZOOM_INTERVAL_MS) {
            int[] xy = mapCursor();
            if (zoomIn) {
                AwtHost.injectWheel(xy[0], xy[1], -1);
            }
            if (zoomOut) {
                AwtHost.injectWheel(xy[0], xy[1], 1);
            }
            lastPadZoomAt = now;
            moved = true;
        }

        if (moved) {
            redrawCursor();
        }
        return needsPadTick();
    }

    public void setSizeListener(Runnable listener) {
        this.sizeListener = listener;
    }

    @Override
    public void layoutSubviews() {
        super.layoutSubviews();
        CGRect bounds = getBounds();
        imageView.setFrame(bounds);
        bringSubviewToFront(cursorView);
        int w = Math.max(0, (int) Math.round(bounds.getWidth()));
        int h = Math.max(0, (int) Math.round(bounds.getHeight()));
        if (w <= 0 || h <= 0) {
            return;
        }
        if (cursorVx >= 0f) {
            cursorVx = Math.min(cursorVx, w - 1);
            cursorVy = Math.min(cursorVy, h - 1);
            if (padActive || TvHost.isTvOS()) {
                redrawCursor();
            }
        }
        pendingW = w;
        pendingH = h;
        // Boot path: need a real size immediately so Loader can start.
        if (appliedW == 0 || appliedH == 0) {
            applyDisplaySize(w, h);
            return;
        }
        if (w == appliedW && h == appliedH) {
            return;
        }
        // Still resizing — stretch pixels only; settle before client redraw.
        scheduleSettledResize();
    }

    /**
     * After {@link #RESIZE_SETTLE_MS} with no further size changes, push the
     * pending view size into the AWT / Jagex viewport so HUD / gameframe
     * reflow. Cancelled if the user keeps dragging.
     */
    private void scheduleSettledResize() {
        final int gen = ++resizeGeneration;
        DispatchQueue.getMainQueue().after(RESIZE_SETTLE_MS, TimeUnit.MILLISECONDS, new Runnable() {
            public void run() {
                if (gen != resizeGeneration) {
                    return;
                }
                if (pendingW <= 0 || pendingH <= 0) {
                    return;
                }
                if (pendingW == appliedW && pendingH == appliedH) {
                    return;
                }
                applyDisplaySize(pendingW, pendingH);
            }
        });
    }

    private void applyDisplaySize(int w, int h) {
        appliedW = w;
        appliedH = h;
        AwtHost.setDisplaySize(w, h);
        if (sizeListener != null) {
            sizeListener.run();
        }
    }

    public int viewWidth() {
        return Math.max(1, (int) Math.round(getBounds().getWidth()));
    }

    public int viewHeight() {
        return Math.max(1, (int) Math.round(getBounds().getHeight()));
    }

    public void present(int[] argb, int width, int height) {
        frameW = width;
        frameH = height;
        UIImage img = ArgbBridge.toImage(argb, width, height);
        if (img == null) {
            System.out.println("void-osrs present null frame " + width + "x" + height);
            return;
        }
        lastFrame = img;
        imageView.setImage(img);
        presentCount++;
        if (presentCount <= 3 || (presentCount % 120) == 0) {
            int sample = 0;
            int n = Math.min(argb.length, width * height);
            for (int i = 0; i < n; i += 64) {
                if ((argb[i] & 0x00ffffff) != 0) {
                    sample++;
                }
            }
            System.out.println("void-osrs present #" + presentCount
                    + " " + width + "x" + height + " lit~" + sample);
        }
    }

    private void scheduleLongPress() {
        final int gen = ++pressGeneration;
        DispatchQueue.getMainQueue().after(225, TimeUnit.MILLISECONDS, new Runnable() {
            public void run() {
                if (gen != pressGeneration) {
                    return;
                }
                if (!down || multiTouch || dragging || longPressFired || ignoreSingleFinger) {
                    return;
                }
                longPressFired = true;
                System.out.println("longPress right-click @ " + downX + "," + downY);
                AwtHost.injectRightClick(downX, downY);
            }
        });
    }

    private void cancelLongPress() {
        pressGeneration++;
    }

    private void maybeFourFingerConsole() {
        if (fourFingerConsoleFired || multiTouchMaxCount < 4) {
            return;
        }
        fourFingerConsoleFired = true;
        boolean wasOpen = AwtHost.isDevConsoleOpen();
        System.out.println("void-osrs 4-finger tap → developer console (wasOpen=" + wasOpen + ")");
        if (wasOpen) {
            AwtHost.setDevConsoleOpen(false);
            AwtHost.requestHideSoftKeyboard("dev-console-close");
        } else {
            // Open console only — do not raise IME/chat. Tap later toggles keyboard if needed.
            AwtHost.setDevConsoleOpen(true);
        }
    }

    private void finishFourFingerGesture() {
        fourFingerConsoleFired = false;
        multiTouchMaxCount = 0;
    }

    @Override
    public void touchesBegan(NSSet<UITouch> touches, UIEvent event) {
        // Apple TV: Siri Remote must not go through the iPad multitouch→mouse path.
        // Focused GameView can receive synthesized touches for trackpad swipes, which
        // became left-clicks / drags no matter what GCMicroGamepad did with buttonA.
        if (TvHost.isTvOS()) {
            return;
        }
        updateActive(touches, false);
        int count = active.size();
        if (count >= 2) {
            cancelLongPress();
            // Second finger: abort any in-progress left drag so BUTTON1 isn't stuck.
            if (dragging) {
                AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, downX, downY, MouseEvent.BUTTON1, 1);
            }
            down = false;
            dragging = false;
            longPressFired = false;
            ignoreSingleFinger = true;
            if (!multiTouch) {
                multiTouchMaxCount = 0;
            }
            multiTouch = true;
            multiTouchMaxCount = Math.max(multiTouchMaxCount, count);
            lastPinchDist = spacing();
            pinchAccum = 0f;
            CGPoint mid = midpoint();
            lastPanX = (float) mid.getX();
            lastPanY = (float) mid.getY();
            panTracked = true;
            AwtHost.requestHideSoftKeyboard("multi-touch");
            maybeFourFingerConsole();
            return;
        }
        if (ignoreSingleFinger) {
            ignoreSingleFinger = false;
        }
        CGPoint p = firstPoint();
        int[] xy = map(p);
        down = true;
        dragging = false;
        longPressFired = false;
        downVx = (float) p.getX();
        downVy = (float) p.getY();
        downX = xy[0];
        downY = xy[1];
        scheduleLongPress();
    }

    @Override
    public void touchesMoved(NSSet<UITouch> touches, UIEvent event) {
        if (TvHost.isTvOS()) {
            return;
        }
        updateActive(touches, false);
        if (multiTouch) {
            multiTouchMaxCount = Math.max(multiTouchMaxCount, active.size());
            maybeFourFingerConsole();
            if (active.size() >= 2) {
                CGPoint mid = midpoint();
                float mx = (float) mid.getX();
                float my = (float) mid.getY();
                if (panTracked) {
                    AwtHost.injectCameraOrbit(mx - lastPanX, my - lastPanY);
                }
                lastPanX = mx;
                lastPanY = my;
                panTracked = true;
                float dist = spacing();
                if (lastPinchDist > 0f) {
                    pinchAccum += dist - lastPinchDist;
                    while (pinchAccum >= PINCH_PX_PER_NOTCH) {
                        int[] midGame = map(mid);
                        AwtHost.injectWheel(midGame[0], midGame[1], -1);
                        pinchAccum -= PINCH_PX_PER_NOTCH;
                    }
                    while (pinchAccum <= -PINCH_PX_PER_NOTCH) {
                        int[] midGame = map(mid);
                        AwtHost.injectWheel(midGame[0], midGame[1], 1);
                        pinchAccum += PINCH_PX_PER_NOTCH;
                    }
                }
                lastPinchDist = dist;
            }
            return;
        }
        if (ignoreSingleFinger || !down || longPressFired) {
            return;
        }
        CGPoint p = firstPoint();
        int[] xy = map(p);
        float moved = Math.max(Math.abs((float) p.getX() - downVx), Math.abs((float) p.getY() - downVy));
        if (!dragging && moved > TOUCH_SLOP) {
            // Finger slid → left-button drag (same path as pad ✕ held + stick).
            dragging = true;
            cancelLongPress();
            AwtHost.injectMouse(MouseEvent.MOUSE_MOVED, downX, downY, 0, 0);
            AwtHost.injectMouse(MouseEvent.MOUSE_PRESSED, downX, downY, MouseEvent.BUTTON1, 1);
            AwtHost.injectMouse(MouseEvent.MOUSE_DRAGGED, xy[0], xy[1], MouseEvent.BUTTON1, 0);
        } else if (dragging) {
            AwtHost.injectMouse(MouseEvent.MOUSE_DRAGGED, xy[0], xy[1], MouseEvent.BUTTON1, 0);
        }
    }

    @Override
    public void touchesEnded(NSSet<UITouch> touches, UIEvent event) {
        if (TvHost.isTvOS()) {
            return;
        }
        finishTouches(touches, false);
    }

    @Override
    public void touchesCancelled(NSSet<UITouch> touches, UIEvent event) {
        if (TvHost.isTvOS()) {
            return;
        }
        finishTouches(touches, true);
    }

    private void finishTouches(NSSet<UITouch> touches, boolean cancelled) {
        if (multiTouch) {
            updateActive(touches, true);
            if (active.size() < 2) {
                multiTouch = false;
                ignoreSingleFinger = active.size() == 1;
                down = false;
                dragging = false;
                longPressFired = false;
                lastPinchDist = -1f;
                pinchAccum = 0f;
                panTracked = false;
                cancelLongPress();
                finishFourFingerGesture();
            } else {
                lastPinchDist = spacing();
                CGPoint mid = midpoint();
                lastPanX = (float) mid.getX();
                lastPanY = (float) mid.getY();
                panTracked = true;
            }
            return;
        }
        if (ignoreSingleFinger) {
            updateActive(touches, true);
            ignoreSingleFinger = false;
            down = false;
            dragging = false;
            longPressFired = false;
            cancelLongPress();
            return;
        }
        updateActive(touches, true);
        cancelLongPress();
        if (!down) {
            // leftover
        } else if (longPressFired) {
            // right-click already injected
        } else if (dragging) {
            CGPoint p = firstPoint();
            int[] xy = map(p);
            AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], MouseEvent.BUTTON1, 1);
        } else if (!cancelled) {
            System.out.println("void-osrs tap left-click @ " + downX + "," + downY
                    + " frac=" + String.format(java.util.Locale.US, "%.3f,%.3f",
                        downX / (float) Math.max(1, frameW),
                        downY / (float) Math.max(1, frameH))
                    + " frame=" + frameW + "x" + frameH);
            AwtHost.injectLeftClick(downX, downY);
            // IME only from the --> write strip. History taps re-run in the client
            // and must not raise/hide the keyboard.
            if (AwtHost.isDevConsoleOpen()) {
                if (AwtHost.isConsolePromptTap(downX, downY)) {
                    AwtHost.requestToggleSoftKeyboard("dev-console-prompt");
                }
            } else if (AwtHost.SOFT_KEYBOARD_OPEN) {
                AwtHost.requestHideSoftKeyboard("tap-dismiss");
            }
        }
        down = false;
        dragging = false;
        longPressFired = false;
    }

    private void updateActive(NSSet<UITouch> touches, boolean remove) {
        NSArray<UITouch> arr = touches.getValues();
        int n = (int) arr.size();
        for (int i = 0; i < n; i++) {
            UITouch t = arr.get(i);
            CGPoint loc = t.getLocationInView(this);
            lastTouchPoint = loc;
            if (remove) {
                active.remove(t.getHandle());
            } else {
                active.put(t.getHandle(), loc);
            }
        }
    }

    private CGPoint firstPoint() {
        if (active.isEmpty()) {
            return lastTouchPoint;
        }
        return active.values().iterator().next();
    }

    private float spacing() {
        List<CGPoint> pts = points();
        if (pts.size() < 2) {
            return -1f;
        }
        CGPoint a = pts.get(0);
        CGPoint b = pts.get(1);
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return (float) Math.hypot(dx, dy);
    }

    private CGPoint midpoint() {
        List<CGPoint> pts = points();
        if (pts.size() < 2) {
            return firstPoint();
        }
        CGPoint a = pts.get(0);
        CGPoint b = pts.get(1);
        return new CGPoint((a.getX() + b.getX()) * 0.5, (a.getY() + b.getY()) * 0.5);
    }

    private List<CGPoint> points() {
        return new ArrayList<CGPoint>(active.values());
    }

    private int[] map(CGPoint p) {
        int vw = viewWidth();
        int vh = viewHeight();
        int gw = Math.max(1, frameW);
        int gh = Math.max(1, frameH);
        int x = (int) (p.getX() * gw / (double) vw);
        int y = (int) (p.getY() * gh / (double) vh);
        x = Math.max(0, Math.min(gw - 1, x));
        y = Math.max(0, Math.min(gh - 1, y));
        return new int[]{x, y};
    }
}
