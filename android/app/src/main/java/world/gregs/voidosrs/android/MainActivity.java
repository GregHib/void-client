package world.gregs.voidosrs.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import java.io.PrintStream;
import java.io.OutputStream;
import android.util.Log;
import android.os.Handler;
import android.os.Looper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.InputType;
import android.hardware.input.InputManager;
import android.view.Gravity;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.speech.tts.TextToSpeech;
import java.util.Locale;

import java.util.List;

import voidawt.AwtHost;
import voidawt.event.MouseEvent;
import world.gregs.voidosrs.AffiliationDisclaimer;
import world.gregs.voidosrs.ServerPrefs;

public class MainActivity extends Activity {
    private TextToSpeech dialogueTts;
    private volatile boolean clientStarted;
    private TextView debugHud;
    private static volatile MainActivity instance;
    private EditText imeInput;
    private TextView keyboardBall;
    private GameView game;
    private FrameLayout rootLayout;
    private View serverOverlay;
    private EditText serverField;
    private TextView changeServerBtn;
    private TextView serverTitle;
    private TextView serverSubtitle;
    private View serverCancel;
    private LinearLayout serverHistoryRow;
    private int lastServerPollState = Integer.MIN_VALUE;
    private boolean connectFailOverlayShown;
    private boolean keyboardOpen;
    private String typedBuffer = "";
    private boolean syncingText;
    /** Largest surface size we have accepted (ignores transient resume/IME shrinks). */
    private int stableSurfaceW;
    private int stableSurfaceH;
    /** Ignore / don't commit shrinks until this uptime (resume inset flash). */
    private long resumeGraceUntilMs;
    private final Handler uiHandler = new Handler(Looper.getMainLooper());
    private final Runnable deferredShrinkApply = new Runnable() {
        public void run() {
            if (game == null || keyboardOpen) {
                return;
            }
            if (android.os.SystemClock.uptimeMillis() < resumeGraceUntilMs) {
                uiHandler.postDelayed(this, 200);
                return;
            }
            int w = game.getWidth();
            int h = game.getHeight();
            if (w > 0 && h > 0) {
                applySurfaceSize(w, h, "deferred-shrink", true);
            }
        }
    };
    private final Runnable resumeSizeRestore = new Runnable() {
        public void run() {
            hideSystemUi();
            if (game == null) {
                return;
            }
            int[] win = windowSizePx();
            int vw = game.getWidth();
            int vh = game.getHeight();
            int w = vw > 0 ? vw : win[0];
            int h = vh > 0 ? vh : win[1];
            // If the view is still transiently shrunk, pin client to the larger of
            // last stable size and real window metrics (not the shrunk view).
            long viewArea = (long) Math.max(0, vw) * Math.max(0, vh);
            long stableArea = (long) stableSurfaceW * stableSurfaceH;
            long winArea = (long) win[0] * win[1];
            if (stableArea > 0 && viewArea > 0 && viewArea * 100 < stableArea * 85) {
                w = Math.max(stableSurfaceW, win[0]);
                h = Math.max(stableSurfaceH, win[1]);
            } else if (winArea > viewArea && win[0] > 0 && win[1] > 0) {
                w = win[0];
                h = win[1];
            }
            // Exclusive FS: pin logical 800x600 (aFrame476 is often null for a beat
            // after resume) and only re-stretch the View — do not inflate the AWT
            // buffer to the phone size (that letterboxes black bars).
            if (AwtHost.isExclusiveFullscreen()) {
                if (w > 0 && h > 0 && (stableSurfaceW < w || stableSurfaceH < h
                        || stableSurfaceW == 0)) {
                    stableSurfaceW = Math.max(stableSurfaceW, w);
                    stableSurfaceH = Math.max(stableSurfaceH, h);
                }
                AwtHost.setDisplaySize(AwtHost.GAME_WIDTH, AwtHost.GAME_HEIGHT, true);
            } else if (w > 0 && h > 0) {
                applySurfaceSize(w, h, "resume-restore", true);
            }
            game.requestLayout();
            game.invalidate();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.setProperty("user.home", getFilesDir().getAbsolutePath());
        // adb reverse listens on IPv4 127.0.0.1 only — avoid IPv6 dual-stack ECONNREFUSED.
        System.setProperty("java.net.preferIPv4Stack", "true");

        game = new GameView(this);
        imeInput = buildImeField();
        keyboardBall = buildKeyboardBall();

        FrameLayout root = new FrameLayout(this);
        rootLayout = root;
        root.setBackgroundColor(Color.BLACK);
        root.setClipChildren(true);
        root.setClipToPadding(true);
        root.addView(game, new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        FrameLayout.LayoutParams imeLp = new FrameLayout.LayoutParams(1, 1);
        imeLp.gravity = Gravity.BOTTOM | Gravity.START;
        root.addView(imeInput, imeLp);

        // Keyboard ball hidden — soft keyboard opens on in-game text-field taps.
        // Keep instance for emergency toggle via long-press on empty corner if needed.
        keyboardBall.setVisibility(View.GONE);

        buildServerOverlay(root);
        changeServerBtn = buildChangeServerButton();
        FrameLayout.LayoutParams serverBtnLp = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        serverBtnLp.gravity = Gravity.TOP | Gravity.START;
        serverBtnLp.topMargin = 16;
        serverBtnLp.leftMargin = 16;
        root.addView(changeServerBtn, serverBtnLp);

        setContentView(root);
        installKeyboardPan(root);
        hideSystemUi();
        requestAudioFocus();
        instance = this;
        // DISABLED 2026-08-30 with DialogueTts.ENABLED=false: Android TextToSpeech + per-tick
        // chatbox scan was freezing the client hard. Re-enable together with DialogueTts.
        /*
        dialogueTts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int language = dialogueTts.setLanguage(Locale.US);
                    if (language == TextToSpeech.LANG_MISSING_DATA
                            || language == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.w("void-osrs", "void-tts: en-US voice data unavailable");
                    }
                }
            }
        });
        AwtHost.setSpeechHandler(new AwtHost.SpeechHandler() {
            public void speak(String text, boolean female) {
                if (dialogueTts == null) return;
                dialogueTts.setPitch(female ? 1.15f : 0.85f);
                dialogueTts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "void-dialogue");
            }
            public void stop() {
                if (dialogueTts != null) dialogueTts.stop();
            }
        });
        */
        installLogBridge();
        // On-screen debug HUD off — still mirrors to logcat via installLogBridge.
        // debugHud = buildDebugHud();
        // root.addView(debugHud);
        AwtHost.presenter = game;
        AwtHost.softKeyboardListener = new AwtHost.SoftKeyboardListener() {
            public void showSoftKeyboard(String reason) {
                Log.i("void-osrs", "softKeyboard show: " + reason);
                runOnUiThread(() -> showKeyboard());
            }

            public void hideSoftKeyboard(String reason) {
                Log.i("void-osrs", "softKeyboard hide: " + reason);
                runOnUiThread(() -> hideKeyboard());
            }

            public void toggleSoftKeyboard(String reason) {
                Log.i("void-osrs", "softKeyboard toggle: " + reason + " open=" + keyboardOpen);
                runOnUiThread(() -> {
                    if (keyboardOpen) {
                        hideKeyboard();
                    } else {
                        showKeyboard();
                    }
                });
            }

            public void syncSoftKeyboardToDevConsole() {
                // No-op: delayed sync raced the game thread and re-opened the IME on close.
            }
        };
        game.requestFocus();
        maybeShowDisclaimerThenContinue();
        pollLoginButton();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AwtHost.stopSpeech();
        AwtHost.setSpeechHandler(null);
        if (dialogueTts != null) {
            dialogueTts.shutdown();
            dialogueTts = null;
        }
    }

    /**
     * First launch only: scrollable non-affiliation disclaimer before server picker / client boot.
     * Acceptance is persisted in {@code user.home/void-disclaimer.txt}.
     */
    private void maybeShowDisclaimerThenContinue() {
        if (AffiliationDisclaimer.isAccepted()) {
            continueAfterDisclaimer();
            return;
        }
        TextView msg = new TextView(this);
        msg.setText(AffiliationDisclaimer.BODY);
        msg.setTextSize(13);
        msg.setTextColor(CREAM);
        msg.setPadding(48, 24, 48, 24);
        msg.setLineSpacing(0f, 1.15f);
        ScrollView scroll = new ScrollView(this);
        scroll.addView(msg);
        new AlertDialog.Builder(this)
                .setTitle(AffiliationDisclaimer.TITLE)
                .setView(scroll)
                .setCancelable(false)
                .setPositiveButton(AffiliationDisclaimer.ACCEPT_LABEL, (d, w) -> {
                    AffiliationDisclaimer.markAccepted();
                    continueAfterDisclaimer();
                })
                .show();
    }

    /** Resume normal boot after disclaimer is accepted (or was already). */
    private void continueAfterDisclaimer() {
        if (resolveBootHost() == null) {
            showServerOverlay(false);
        }
        if (game != null) {
            int w = game.getWidth();
            int h = game.getHeight();
            if (w <= 0 || h <= 0) {
                int[] win = windowSizePx();
                w = win[0];
                h = win[1];
            }
            startClientIfReady(w, h);
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (game != null && game.handlePadKey(event)) {
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        if (game != null && game.handlePadMotion(event)) {
            return true;
        }
        return super.onGenericMotionEvent(event);
    }

    @Override
    protected void onPause() {
        uiHandler.removeCallbacks(resumeSizeRestore);
        uiHandler.removeCallbacks(deferredShrinkApply);
        if (game != null) {
            game.stopPadTick();
        }
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        requestAudioFocus();
        hideSystemUi();
        resumeGraceUntilMs = android.os.SystemClock.uptimeMillis() + 750;
        if (game != null) {
            game.requestFocus();
            game.kickPadTick();
            // System bars flash on resume and briefly shrink the SurfaceView; that used
            // to stick the client viewport at ~half size. Re-hide + re-apply after settle.
            uiHandler.removeCallbacks(resumeSizeRestore);
            uiHandler.removeCallbacks(deferredShrinkApply);
            uiHandler.post(resumeSizeRestore);
            uiHandler.postDelayed(resumeSizeRestore, 120);
            uiHandler.postDelayed(resumeSizeRestore, 400);
        }
    }

    /** Real window pixel size (includes cutout area when immersive). */
    private int[] windowSizePx() {
        if (Build.VERSION.SDK_INT >= 30) {
            android.graphics.Rect b = getWindowManager().getCurrentWindowMetrics().getBounds();
            return new int[]{Math.max(1, b.width()), Math.max(1, b.height())};
        }
        android.util.DisplayMetrics dm = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getRealMetrics(dm);
        return new int[]{Math.max(1, dm.widthPixels), Math.max(1, dm.heightPixels)};
    }

    /**
     * Push surface size into the AWT client. Ignores transient shrinks (keyboard /
     * immersive bar flash) so the viewport does not stick at a tiny size.
     */
    private void applySurfaceSize(int width, int height, String reason, boolean force) {
        if (width <= 0 || height <= 0) {
            return;
        }
        if (keyboardOpen && !force) {
            return;
        }
        long area = (long) width * height;
        long stableArea = (long) stableSurfaceW * stableSurfaceH;
        boolean significantShrink = stableArea > 0 && area * 100 < stableArea * 85;
        boolean inResumeGrace = android.os.SystemClock.uptimeMillis() < resumeGraceUntilMs;
        boolean pinExclusive = inResumeGrace || "resume-restore".equals(reason)
                || "resume-stable".equals(reason);
        // Transient inset flash on resume / IME — do not teach the client a tiny viewport.
        if (significantShrink && (inResumeGrace || !force || !"deferred-shrink".equals(reason))) {
            Log.w("void-osrs", "ignore shrink " + width + "x" + height
                    + " vs stable " + stableSurfaceW + "x" + stableSurfaceH
                    + " (" + reason + (inResumeGrace ? " grace" : "") + ")");
            if (!inResumeGrace && !force) {
                uiHandler.removeCallbacks(deferredShrinkApply);
                uiHandler.postDelayed(deferredShrinkApply, 400);
            }
            if (stableSurfaceW > 0 && stableSurfaceH > 0
                    && (force || "surfaceChanged".equals(reason) || "layout".equals(reason))) {
                // Keep client at last good size while the view catches up.
                // pinExclusive: notification/resume often nulls aFrame476 briefly.
                AwtHost.setDisplaySize(stableSurfaceW, stableSurfaceH, pinExclusive);
            }
            return;
        }
        uiHandler.removeCallbacks(deferredShrinkApply);
        if (area >= stableArea || "deferred-shrink".equals(reason)) {
            stableSurfaceW = width;
            stableSurfaceH = height;
        }
        Log.i("void-osrs", "surface size " + width + "x" + height
                + " stable=" + stableSurfaceW + "x" + stableSurfaceH
                + " (" + reason + (force ? " force" : "") + ")");
        AwtHost.setDisplaySize(width, height, pinExclusive);
        startClientIfReady(width, height);
    }

    private String defaultHostHint() {
        return isEmulator() ? "10.0.2.2" : "192.168.18.188";
    }

    private String resolveBootHost() {
        String override = readServerOverride();
        if (override != null && !override.isEmpty()) {
            String n = ServerPrefs.normalize(override);
            if (n != null) {
                return n;
            }
        }
        return ServerPrefs.load();
    }

    private static final int GOLD = Color.rgb(212, 168, 71);
    private static final int CREAM = Color.rgb(247, 242, 224);
    private static final int INK = Color.rgb(26, 20, 10);

    private TextView buildChangeServerButton() {
        TextView t = styleButton("Server", false);
        t.setTextSize(13);
        t.setVisibility(View.GONE);
        t.setOnClickListener(v -> showServerOverlay(false));
        return t;
    }

    private void buildServerOverlay(FrameLayout root) {
        FrameLayout overlay = new FrameLayout(this);
        overlay.setBackgroundColor(Color.argb(158, 5, 3, 3));
        overlay.setVisibility(View.GONE);
        overlay.setClickable(true);

        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(44, 40, 44, 44);
        GradientDrawable cardBg = new GradientDrawable();
        cardBg.setColor(Color.argb(247, 18, 15, 13));
        cardBg.setCornerRadius(32);
        cardBg.setStroke(2, Color.argb(178, 212, 168, 71));
        card.setBackground(cardBg);

        serverTitle = new TextView(this);
        serverTitle.setText("Server");
        serverTitle.setTextColor(CREAM);
        serverTitle.setTextSize(22);
        serverTitle.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        serverTitle.setPadding(0, 0, 0, 4);

        serverSubtitle = new TextView(this);
        serverSubtitle.setTextColor(Color.rgb(237, 158, 122));
        serverSubtitle.setTextSize(13);
        serverSubtitle.setPadding(0, 8, 0, 4);
        serverSubtitle.setVisibility(View.GONE);

        serverField = new EditText(this);
        serverField.setHint(defaultHostHint());
        serverField.setHintTextColor(Color.argb(140, 180, 170, 150));
        serverField.setTextColor(CREAM);
        serverField.setTextSize(16);
        serverField.setSingleLine(true);
        serverField.setPadding(28, 26, 28, 26);
        serverField.setBackground(roundRect(Color.rgb(31, 28, 23), Color.argb(90, 212, 168, 71), 20));
        serverField.setInputType(InputType.TYPE_TEXT_VARIATION_URI);
        serverField.setImeOptions(EditorInfo.IME_ACTION_GO | EditorInfo.IME_FLAG_NO_FULLSCREEN);
        serverField.setOnEditorActionListener((v, actionId, event) -> {
            applyServerFromOverlay();
            return true;
        });
        LinearLayout.LayoutParams fieldLp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        fieldLp.topMargin = 20;

        serverHistoryRow = new LinearLayout(this);
        serverHistoryRow.setOrientation(LinearLayout.VERTICAL);
        serverHistoryRow.setPadding(0, 8, 0, 0);

        LinearLayout buttons = new LinearLayout(this);
        buttons.setOrientation(LinearLayout.HORIZONTAL);
        buttons.setPadding(0, 20, 0, 0);

        TextView cancel = styleButton("Cancel", false);
        serverCancel = cancel;
        cancel.setOnClickListener(v -> hideServerOverlay());
        TextView connect = styleButton("Connect", true);
        connect.setOnClickListener(v -> applyServerFromOverlay());

        LinearLayout.LayoutParams half = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1);
        half.rightMargin = 16;
        buttons.addView(cancel, half);
        buttons.addView(connect, new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1));

        card.addView(serverTitle);
        card.addView(serverSubtitle);
        card.addView(serverField, fieldLp);
        card.addView(serverHistoryRow, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        card.addView(buttons);

        FrameLayout.LayoutParams cardLp = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        cardLp.gravity = Gravity.CENTER;
        cardLp.leftMargin = 56;
        cardLp.rightMargin = 56;
        overlay.addView(card, cardLp);
        root.addView(overlay, new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        serverOverlay = overlay;
    }

    private GradientDrawable roundRect(int fill, int stroke, int radiusDp) {
        GradientDrawable bg = new GradientDrawable();
        bg.setColor(fill);
        bg.setCornerRadius(radiusDp);
        if (stroke != 0) {
            bg.setStroke(2, stroke);
        }
        return bg;
    }

    private TextView styleButton(String label, boolean primary) {
        TextView t = new TextView(this);
        t.setText(label);
        t.setTextSize(15);
        t.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        t.setGravity(Gravity.CENTER);
        t.setPadding(20, 26, 20, 26);
        if (primary) {
            t.setTextColor(INK);
            t.setBackground(roundRect(GOLD, 0, 20));
        } else {
            t.setTextColor(CREAM);
            t.setBackground(roundRect(Color.rgb(36, 33, 28), Color.argb(115, 212, 168, 71), 20));
        }
        return t;
    }

    private TextView historyRow(String host, boolean selected) {
        TextView t = new TextView(this);
        t.setText(host);
        t.setTextSize(14);
        t.setGravity(Gravity.CENTER_VERTICAL | Gravity.START);
        t.setPadding(28, 22, 28, 22);
        if (selected) {
            t.setTextColor(GOLD);
            t.setBackground(roundRect(Color.argb(36, 212, 168, 71), GOLD, 20));
        } else {
            t.setTextColor(Color.rgb(219, 214, 199));
            t.setBackground(roundRect(Color.rgb(33, 31, 26), Color.argb(16, 255, 255, 255), 20));
        }
        return t;
    }

    private void showServerOverlay(boolean connectionFailed) {
        String current = resolveBootHost();
        if (current == null) {
            current = defaultHostHint();
        }
        serverField.setText(current);
        if (serverTitle != null) {
            if (connectionFailed) {
                serverTitle.setText("Can't reach server");
                serverSubtitle.setText(current + " isn't working. Try another server, then reopen the app.");
                serverSubtitle.setVisibility(View.VISIBLE);
            } else {
                serverTitle.setText("Server");
                serverSubtitle.setVisibility(View.GONE);
            }
        }
        if (serverCancel != null) {
            serverCancel.setVisibility(clientStarted ? View.VISIBLE : View.GONE);
        }
        serverOverlay.setVisibility(View.VISIBLE);
        if (changeServerBtn != null) {
            changeServerBtn.setVisibility(View.GONE);
        }
        refreshServerHistory();
        hideKeyboard();
        serverField.requestFocus();
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.showSoftInput(serverField, InputMethodManager.SHOW_IMPLICIT);
        }
    }

    private void hideServerOverlay() {
        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.hideSoftInputFromWindow(serverField.getWindowToken(), 0);
        }
        serverOverlay.setVisibility(View.GONE);
    }

    private void refreshServerHistory() {
        if (serverHistoryRow == null) {
            return;
        }
        serverHistoryRow.removeAllViews();
        String[] history = ServerPrefs.loadAll();
        serverHistoryRow.setVisibility(history.length == 0 ? View.GONE : View.VISIBLE);
        if (history.length > 0) {
            TextView recent = new TextView(this);
            recent.setText("RECENT");
            recent.setTextColor(Color.argb(191, 212, 168, 71));
            recent.setTextSize(11);
            recent.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
            recent.setPadding(4, 20, 0, 10);
            serverHistoryRow.addView(recent);
        }
        String selected = ServerPrefs.normalize(serverField.getText().toString());
        for (int i = 0; i < history.length; i++) {
            final String host = history[i];
            TextView chip = historyRow(host, host.equals(selected));
            chip.setOnClickListener(v -> {
                serverField.setText(host);
                refreshServerHistory();
            });
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            if (i > 0) {
                lp.topMargin = 10;
            }
            serverHistoryRow.addView(chip, lp);
        }
    }

    private void applyServerFromOverlay() {
        String host = ServerPrefs.normalize(serverField.getText().toString());
        if (host == null) {
            host = ServerPrefs.normalize(defaultHostHint());
        }
        if (host == null) {
            return;
        }
        if (!clientStarted) {
            ServerPrefs.save(host);
            hideServerOverlay();
            int w = game != null ? game.getWidth() : 0;
            int h = game != null ? game.getHeight() : 0;
            if (w <= 0 || h <= 0) {
                int[] win = windowSizePx();
                w = win[0];
                h = win[1];
            }
            startClientIfReady(w, h);
            return;
        }
        String previous = ServerPrefs.load();
        if (host.equals(previous)) {
            hideServerOverlay();
            return;
        }
        final String target = host;
        new AlertDialog.Builder(this)
                .setTitle("Switch server?")
                .setMessage("The app will close. Open it again to connect to the new server.")
                .setNegativeButton("Cancel", null)
                .setPositiveButton("OK", (d, w) -> {
                    ServerPrefs.save(target);
                    hideServerOverlay();
                    finishAffinity();
                    Runtime.getRuntime().exit(0);
                })
                .show();
    }

    private void pollLoginButton() {
        uiHandler.postDelayed(() -> {
            boolean overlayUp = serverOverlay != null && serverOverlay.getVisibility() == View.VISIBLE;
            int state = ServerPrefs.gameState();
            boolean failing = ServerPrefs.isConnectFailing();
            boolean show = clientStarted && !overlayUp && ServerPrefs.showsServerPicker();
            if (ServerPrefs.isLoginScreen()) {
                connectFailOverlayShown = false;
            }
            if (state != lastServerPollState) {
                lastServerPollState = state;
            }
            if (clientStarted && !overlayUp && failing && !connectFailOverlayShown) {
                connectFailOverlayShown = true;
                showServerOverlay(true);
            }
            if (changeServerBtn != null) {
                changeServerBtn.setVisibility(show ? View.VISIBLE : View.GONE);
            }
            pollLoginButton();
        }, 200);
    }

    private void requestAudioFocus() {
        AudioManager am = (AudioManager) getSystemService(AUDIO_SERVICE);
        if (am == null) {
            return;
        }
        try {
            AudioAttributes attrs = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();
            AudioFocusRequest req = new AudioFocusRequest.Builder(AudioManager.AUDIOFOCUS_GAIN)
                    .setAudioAttributes(attrs)
                    .setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() {
                        public void onAudioFocusChange(int focusChange) {
                        }
                    })
                    .build();
            am.requestAudioFocus(req);
        } catch (Throwable t) {
            Log.w("void-osrs", "audio focus", t);
        }
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUi();
            resumeGraceUntilMs = Math.max(resumeGraceUntilMs,
                    android.os.SystemClock.uptimeMillis() + 400);
            uiHandler.removeCallbacks(resumeSizeRestore);
            uiHandler.post(resumeSizeRestore);
            uiHandler.postDelayed(resumeSizeRestore, 200);
        }
    }

    /** Sticky immersive: hide status (clock) + nav (back/home). */
    private void hideSystemUi() {
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams lp = window.getAttributes();
            lp.layoutInDisplayCutoutMode =
                    WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
            window.setAttributes(lp);
        }
        View decor = window.getDecorView();
        // Must run after setContentView — DecorView is null before that on some OEMs.
        if (decor == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
            WindowInsetsController c = decor.getWindowInsetsController();
            if (c != null) {
                c.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                c.setSystemBarsBehavior(WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
            }
        } else {
            decor.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN);
        }
    }

    private EditText buildImeField() {
        EditText input = new EditText(this);
        input.setBackgroundColor(Color.TRANSPARENT);
        input.setTextColor(Color.TRANSPARENT);
        input.setHintTextColor(Color.TRANSPARENT);
        input.setCursorVisible(false);
        input.setSingleLine(true);
        input.setImeOptions(EditorInfo.IME_ACTION_DONE | EditorInfo.IME_FLAG_NO_FULLSCREEN);
        input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        input.setImportantForAutofill(View.IMPORTANT_FOR_AUTOFILL_NO);
        input.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE
                    || actionId == EditorInfo.IME_ACTION_GO
                    || actionId == EditorInfo.IME_ACTION_SEND
                    || (event != null && event.getKeyCode() == android.view.KeyEvent.KEYCODE_ENTER)) {
                injectEnter();
                hideKeyboard();
                return true;
            }
            return false;
        });
        input.addTextChangedListener(new android.text.TextWatcher() {
            private String last = "";

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (syncingText) {
                    last = s == null ? "" : s.toString();
                    return;
                }
                String now = s == null ? "" : s.toString();
                if (now.length() > last.length()) {
                    for (int i = last.length(); i < now.length(); i++) {
                        injectChar(now.charAt(i));
                    }
                } else if (now.length() < last.length()) {
                    int removed = last.length() - now.length();
                    for (int i = 0; i < removed; i++) {
                        injectBackspace();
                    }
                }
                last = now;
                typedBuffer = now;
            }

            public void afterTextChanged(android.text.Editable s) {
            }
        });
        input.setOnFocusChangeListener((v, hasFocus) -> {
            if (!hasFocus && keyboardOpen) {
                hideKeyboard();
            }
        });
        return input;
    }

    private TextView buildKeyboardBall() {
        TextView ball = new TextView(this);
        ball.setText("⌨");
        ball.setTextSize(16f);
        ball.setGravity(Gravity.CENTER);
        ball.setTextColor(Color.WHITE);
        ball.setContentDescription("Open keyboard");
        GradientDrawable bg = new GradientDrawable();
        bg.setShape(GradientDrawable.OVAL);
        bg.setColor(0xF2222222);
        bg.setStroke(dp(1), 0xFFE0B040);
        ball.setBackground(bg);
        ball.setElevation(dp(4));
        ball.setOnClickListener(v -> {
            if (keyboardOpen) {
                hideKeyboard();
            } else {
                showKeyboard();
            }
        });
        return ball;
    }

    /** Slide the game canvas up so chat sits above the IME; size stays full-screen. */
    private void installKeyboardPan(View root) {
        if (Build.VERSION.SDK_INT >= 30) {
            ImePan30.install(root, this);
            return;
        }
        root.getViewTreeObserver().addOnGlobalLayoutListener(() -> applyImePan(visibleImeCoverPx(root)));
    }

    private int visibleImeCoverPx(View root) {
        Rect r = new Rect();
        root.getWindowVisibleDisplayFrame(r);
        int covered = Math.max(0, root.getHeight() - r.bottom);
        int minIme = (int) (80f * getResources().getDisplayMetrics().density);
        return covered < minIme ? 0 : covered;
    }

    void applyImePan(int imeBottom) {
        if (game != null && game.getTranslationY() != 0f) {
            game.setTranslationY(0f);
        }
        boolean overlay = serverOverlay != null && serverOverlay.getVisibility() == View.VISIBLE;
        int vh = game != null ? Math.max(1, game.getHeight()) : 1;
        int inset = (!overlay && imeBottom > 0) ? imeBottom : 0;
        AwtHost.setKeyboardInset(inset, vh);
    }

    @android.annotation.TargetApi(30)
    private static final class ImePan30 {
        static void install(View root, MainActivity host) {
            root.setOnApplyWindowInsetsListener((v, insets) -> {
                host.applyImePan(insets.getInsets(WindowInsets.Type.ime()).bottom);
                return v.onApplyWindowInsets(insets);
            });
            root.setWindowInsetsAnimationCallback(new WindowInsetsAnimation.Callback(
                    WindowInsetsAnimation.Callback.DISPATCH_MODE_CONTINUE_ON_SUBTREE) {
                @Override
                public WindowInsets onProgress(WindowInsets insets,
                        List<WindowInsetsAnimation> runningAnimations) {
                    host.applyImePan(insets.getInsets(WindowInsets.Type.ime()).bottom);
                    return insets;
                }
            });
        }
    }

    private void showKeyboard() {
        if (serverOverlay != null && serverOverlay.getVisibility() == View.VISIBLE) {
            return;
        }
        Log.i("void-osrs", "showKeyboard");
        keyboardOpen = true;
        uiHandler.removeCallbacks(forceHideImeRunnable);
        if (keyboardBall != null) {
            keyboardBall.setAlpha(0.35f);
        }
        if (imeInput == null) {
            return;
        }
        syncingText = true;
        imeInput.setText(typedBuffer);
        imeInput.setSelection(typedBuffer.length());
        syncingText = false;
        imeInput.setFocusable(true);
        imeInput.setFocusableInTouchMode(true);
        imeInput.requestFocus();
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            imm.restartInput(imeInput);
            imm.showSoftInput(imeInput, InputMethodManager.SHOW_FORCED);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            View decor = getWindow().getDecorView();
            WindowInsetsController c = decor.getWindowInsetsController();
            if (c != null) {
                c.show(WindowInsets.Type.ime());
            }
        }
    }

    private final Runnable forceHideImeRunnable = new Runnable() {
        public void run() {
            if (keyboardOpen) {
                return;
            }
            forceHideIme();
        }
    };

    private void forceHideIme() {
        View decor = getWindow() != null ? getWindow().getDecorView() : null;
        if (Build.VERSION.SDK_INT >= 30 && decor != null) {
            WindowInsetsController c = decor.getWindowInsetsController();
            if (c != null) {
                c.hide(WindowInsets.Type.ime());
            }
        }
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            if (imeInput != null && imeInput.getWindowToken() != null) {
                imm.hideSoftInputFromWindow(imeInput.getWindowToken(), 0);
            }
            if (game != null && game.getWindowToken() != null) {
                imm.hideSoftInputFromWindow(game.getWindowToken(), 0);
            }
            if (decor != null && decor.getWindowToken() != null) {
                imm.hideSoftInputFromWindow(decor.getWindowToken(), 0);
            }
        }
    }

    private void hideKeyboard() {
        Log.i("void-osrs", "hideKeyboard");
        keyboardOpen = false;
        applyImePan(0);
        if (keyboardBall != null) {
            keyboardBall.setAlpha(1f);
        }
        if (imeInput != null) {
            imeInput.clearFocus();
            // Drop focusability so the IME cannot linger on this field.
            imeInput.setFocusable(false);
            imeInput.setFocusableInTouchMode(false);
        }
        if (game != null) {
            game.requestFocus();
            game.requestFocusFromTouch();
        }
        forceHideIme();
        // IME often ignores the first hide while still animating in.
        uiHandler.removeCallbacks(forceHideImeRunnable);
        uiHandler.postDelayed(forceHideImeRunnable, 50);
        uiHandler.postDelayed(forceHideImeRunnable, 200);
        uiHandler.postDelayed(forceHideImeRunnable, 450);
    }

    private boolean isImeVisible() {
        if (Build.VERSION.SDK_INT >= 30) {
            View decor = getWindow() != null ? getWindow().getDecorView() : null;
            if (decor != null) {
                android.view.WindowInsets insets = decor.getRootWindowInsets();
                if (insets != null) {
                    return insets.isVisible(WindowInsets.Type.ime());
                }
            }
        }
        return keyboardOpen;
    }

    private void injectChar(char c) {
        int code = Character.toUpperCase(c);
        AwtHost.injectKey(voidawt.event.KeyEvent.KEY_PRESSED, code, c);
        AwtHost.injectKey(voidawt.event.KeyEvent.KEY_TYPED, 0, c);
        AwtHost.injectKey(voidawt.event.KeyEvent.KEY_RELEASED, code, c);
    }

    private void injectBackspace() {
        AwtHost.injectKey(voidawt.event.KeyEvent.KEY_PRESSED, voidawt.event.KeyEvent.VK_BACK_SPACE, '\b');
        AwtHost.injectKey(voidawt.event.KeyEvent.KEY_TYPED, 0, '\b');
        AwtHost.injectKey(voidawt.event.KeyEvent.KEY_RELEASED, voidawt.event.KeyEvent.VK_BACK_SPACE, '\b');
    }

    private void injectEnter() {
        AwtHost.injectKey(voidawt.event.KeyEvent.KEY_PRESSED, voidawt.event.KeyEvent.VK_ENTER, '\n');
        AwtHost.injectKey(voidawt.event.KeyEvent.KEY_TYPED, 0, '\n');
        AwtHost.injectKey(voidawt.event.KeyEvent.KEY_RELEASED, voidawt.event.KeyEvent.VK_ENTER, '\n');
        typedBuffer = "";
        syncingText = true;
        imeInput.setText("");
        syncingText = false;
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    private TextView buildDebugHud() {
        TextView tv = new TextView(this);
        tv.setTextSize(11f);
        tv.setTextColor(0xFFE8E8E8);
        tv.setBackgroundColor(0x99000000);
        tv.setPadding(dp(8), dp(4), dp(8), dp(4));
        tv.setText("void debug…");
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        lp.gravity = Gravity.BOTTOM;
        tv.setLayoutParams(lp);
        return tv;
    }

    static void hud(final String msg) {
        Log.i("void-osrs", msg);
        final MainActivity a = instance;
        if (a == null || a.debugHud == null) return;
        a.runOnUiThread(() -> a.debugHud.setText(msg));
    }

    private static void installLogBridge() {
        PrintStream ps = new PrintStream(new OutputStream() {
            private final StringBuilder buf = new StringBuilder();

            @Override
            public synchronized void write(int b) {
                if (b == '\n') flushLine();
                else buf.append((char) b);
            }

            @Override
            public synchronized void write(byte[] b, int off, int len) {
                for (int i = 0; i < len; i++) write(b[off + i] & 0xff);
            }

            private void flushLine() {
                String line = buf.toString();
                buf.setLength(0);
                if (line.isEmpty()) return;
                Log.i("void-osrs", line);
                if (line.startsWith("Connect:")
                        || line.startsWith("Connect ")
                        || line.startsWith("js5")
                        || line.startsWith("load ")
                        || line.startsWith("error_game_")
                        || line.startsWith("boot ")) {
                    hud(line);
                }
            }
        }, true);
        System.setOut(ps);
        System.setErr(ps);
    }

    /** First host that accepts a TCP connect within a short timeout. */
    private static String pickReachableServer(int port, String... hosts) {
        for (String host : hosts) {
            long t0 = System.currentTimeMillis();
            try {
                java.net.Socket s = new java.net.Socket();
                s.connect(new java.net.InetSocketAddress(host, port), 800);
                s.close();
                Log.i("void-osrs", "probe OK " + host + ":" + port
                        + " in " + (System.currentTimeMillis() - t0) + "ms");
                return host;
            } catch (Throwable e) {
                Log.w("void-osrs", "probe FAIL " + host + ":" + port
                        + " (" + e.getClass().getSimpleName() + ": " + e.getMessage() + ")"
                        + " in " + (System.currentTimeMillis() - t0) + "ms");
            }
        }
        String fallback = hosts.length > 0 ? hosts[0] : "127.0.0.1";
        Log.e("void-osrs", "no reachable JS5 host — falling back to " + fallback
                + " (run: adb reverse tcp:" + port + " tcp:" + port + ")");
        return fallback;
    }

    /** Reads debug.void.server (setprop) or -Dvoid.server. */
    private static String readServerOverride() {
        String fromProp = System.getProperty("void.server");
        if (fromProp != null && !fromProp.isEmpty()) {
            return fromProp.trim();
        }
        try {
            Class<?> sp = Class.forName("android.os.SystemProperties");
            String v = (String) sp.getMethod("get", String.class, String.class)
                    .invoke(null, "debug.void.server", "");
            if (v != null && !v.isEmpty()) {
                return v.trim();
            }
        } catch (Throwable ignored) {
        }
        return null;
    }

    private static boolean isEmulator() {
        String fingerprint = Build.FINGERPRINT;
        String model = Build.MODEL;
        String product = Build.PRODUCT;
        return fingerprint.startsWith("generic")
                || fingerprint.contains("emulator")
                || model.contains("Emulator")
                || model.contains("sdk_gphone")
                || product.contains("sdk")
                || product.contains("emulator");
    }

    private void startClientIfReady(int width, int height) {
        if (clientStarted || width <= 0 || height <= 0) {
            return;
        }
        if (!AffiliationDisclaimer.isAccepted()) {
            return;
        }
        final String server = resolveBootHost();
        if (server == null) {
            return;
        }
        clientStarted = true;
        AwtHost.setDisplaySize(width, height);
        new Thread(() -> {
            try {
                Class<?> loaderCl = Class.forName("Loader");
                Log.i("void-osrs", "boot server=" + server + ":43594"
                        + " emu=" + isEmulator()
                        + " override=" + readServerOverride());
                hud("boot " + server + ":43594");
                loaderCl.getField("address").set(null, server);
                loaderCl.getField("port").setInt(null, 43594);
                loaderCl.getField("debug").set(null, true);
                loaderCl.getField("trace").set(null, true);
                Object loader = loaderCl.getDeclaredConstructor().newInstance();
                loaderCl.getMethod("setSize", int.class, int.class).invoke(loader, AwtHost.GAME_WIDTH, AwtHost.GAME_HEIGHT);
                AwtHost.setRoot((voidawt.Component) loader);
                loaderCl.getMethod("init").invoke(loader);
            } catch (Throwable t) {
                Log.e("void-osrs", "client boot failed", t);
                hud("boot FAIL: " + t.getMessage());
            }
        }, "void-client").start();
    }

    final class GameView extends View implements AwtHost.Presenter {
        private Bitmap frame;
        private final Paint paint = new Paint(Paint.FILTER_BITMAP_FLAG);
        private final Paint cursorPaint = new Paint(Paint.FILTER_BITMAP_FLAG | Paint.ANTI_ALIAS_FLAG);
        private final Rect src = new Rect();
        private final Rect dst = new Rect();
        private final RectF cursorDst = new RectF();
        private Bitmap cursorBmp;
        private float cursorHotX;
        private float cursorHotY;
        private float cursorDrawW;
        private float cursorDrawH;
        private boolean down;
        private boolean multiTouch;
        private boolean dragging;
        private boolean longPressFired;
        /** Fired once while 4+ fingers are down; reset when all fingers lift. */
        private boolean fourFingerConsoleFired;
        private int multiTouchMaxCount;
        /** After a 2-finger gesture, ignore leftover single-finger UP/MOVE until a fresh DOWN. */
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
        private static final float PINCH_PX_PER_NOTCH = 28f;
        /**
         * Hold still within this → long-press right-click.
         * Move past this before timeout → left-button mouse drag (map, items, …).
         * Two-finger pan → camera orbit; pinch → zoom; pad right stick also orbits.
         */
        private static final float LONG_PRESS_CANCEL_SLOP = 28f;
        private final Handler touchHandler = new Handler(Looper.getMainLooper());
        // DualShock / gamepad → virtual mouse
        private static final float PAD_DEADZONE = 0.15f;
        private static final float PAD_CURSOR_SPEED = 14f;
        private static final float PAD_ORBIT_SCALE = 10f;
        private static final long PAD_ZOOM_INTERVAL_MS = 90L;
        private static final float PAD_TRIGGER_THRESHOLD = 0.35f;
        private float cursorVx = -1f;
        private float cursorVy = -1f;
        private boolean padActive;
        private int padDeviceId = -1;
        private float stickLX;
        private float stickLY;
        private float stickRX;
        private float stickRY;
        private float triggerL2;
        private float triggerR2;
        private boolean r2DigitalHeld;
        private boolean l2DigitalHeld;
        private boolean padLeftDown;
        private boolean padRightDown;
        private boolean padTickRunning;
        private long lastPadZoomAt;
        /** Hat D-pad held state — many DualShock pads only report AXIS_HAT_*, not KEYCODE_DPAD_*. */
        private boolean hatUp;
        private boolean hatDown;
        private boolean hatLeft;
        private boolean hatRight;
        /** Debounce hat + KeyEvent double-delivery of the same D-pad direction. */
        private int lastDpadNotifyCode = -1;
        private long lastDpadNotifyAt;
        private InputManager inputManager;
        private final InputManager.InputDeviceListener padDeviceListener =
                new InputManager.InputDeviceListener() {
                    public void onInputDeviceAdded(int deviceId) {
                    }

                    public void onInputDeviceRemoved(int deviceId) {
                        onPadDeviceGone(deviceId);
                    }

                    public void onInputDeviceChanged(int deviceId) {
                        if (InputDevice.getDevice(deviceId) == null) {
                            onPadDeviceGone(deviceId);
                        }
                    }
                };
        private final Runnable padTick = new Runnable() {
            public void run() {
                padTickRunning = false;
                if (!padActive) {
                    return;
                }
                boolean keep = tickPad();
                if (keep) {
                    padTickRunning = true;
                    touchHandler.postDelayed(this, 16);
                }
            }
        };
        private final Runnable longPressRunnable = new Runnable() {
            public void run() {
                if (!down || multiTouch || dragging || longPressFired || ignoreSingleFinger) {
                    Log.i("void-osrs", "longPress SKIP down=" + down + " drag=" + dragging
                            + " multi=" + multiTouch + " fired=" + longPressFired);
                    return;
                }
                longPressFired = true;
                Log.i("void-osrs", "longPress right-click @ " + downX + "," + downY);
                AwtHost.injectRightClick(downX, downY);
            }
        };

        GameView(MainActivity activity) {
            super(activity);
            setWillNotDraw(false);
            setFocusable(true);
            setFocusableInTouchMode(true);
            cursorBmp = BitmapFactory.decodeResource(getResources(), R.drawable.cursor_normal_select);
            float density = getResources().getDisplayMetrics().density;
            cursorDrawW = 32f * density;
            cursorDrawH = 32f * density;
            cursorHotX = 6f / 32f * cursorDrawW;
            cursorHotY = 6f / 32f * cursorDrawH;
            addOnLayoutChangeListener((v, left, top, right, bottom, oldLeft, oldTop, oldRight, oldBottom) -> {
                if (keyboardOpen) {
                    return;
                }
                int w = Math.max(0, right - left);
                int h = Math.max(0, bottom - top);
                if (w > 0 && h > 0) {
                    applySurfaceSize(w, h, "layout", false);
                    if (cursorVx < 0f) {
                        cursorVx = w * 0.5f;
                        cursorVy = h * 0.5f;
                    } else {
                        cursorVx = Math.min(cursorVx, w - 1);
                        cursorVy = Math.min(cursorVy, h - 1);
                    }
                }
            });
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            inputManager = (InputManager) getContext().getSystemService(Context.INPUT_SERVICE);
            if (inputManager != null) {
                inputManager.registerInputDeviceListener(padDeviceListener, touchHandler);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            if (inputManager != null) {
                inputManager.unregisterInputDeviceListener(padDeviceListener);
                inputManager = null;
            }
            super.onDetachedFromWindow();
        }

        void stopPadTick() {
            touchHandler.removeCallbacks(padTick);
            padTickRunning = false;
        }

        void kickPadTick() {
            if (padActive && !anyPadConnected()) {
                deactivatePad();
                return;
            }
            if (padActive && needsPadTick()) {
                startPadTick();
            }
        }

        private void activatePad(int deviceId) {
            padActive = true;
            if (deviceId >= 0) {
                padDeviceId = deviceId;
            }
            ensureCursor();
            startPadTick();
            AwtHost.setPadConnected(true);
            redraw();
        }

        private void deactivatePad() {
            if (!padActive) {
                return;
            }
            if (padLeftDown || padRightDown) {
                int[] xy = map(cursorVx, cursorVy);
                if (padLeftDown) {
                    AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], MouseEvent.BUTTON1, 1);
                }
                if (padRightDown) {
                    AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], MouseEvent.BUTTON3, 1);
                }
            }
            padActive = false;
            padDeviceId = -1;
            stickLX = 0f;
            stickLY = 0f;
            stickRX = 0f;
            stickRY = 0f;
            triggerL2 = 0f;
            triggerR2 = 0f;
            r2DigitalHeld = false;
            l2DigitalHeld = false;
            padLeftDown = false;
            padRightDown = false;
            hatUp = false;
            hatDown = false;
            hatLeft = false;
            hatRight = false;
            stopPadTick();
            AwtHost.setPadConnected(false);
            redraw();
        }

        private void onPadDeviceGone(int deviceId) {
            if (!padActive) {
                return;
            }
            if (padDeviceId >= 0 && deviceId != padDeviceId && anyPadConnected()) {
                return;
            }
            deactivatePad();
        }

        private boolean isPadDevice(InputDevice device) {
            if (device == null || device.isVirtual()) {
                return false;
            }
            int src = device.getSources();
            return (src & InputDevice.SOURCE_GAMEPAD) == InputDevice.SOURCE_GAMEPAD
                    || (src & InputDevice.SOURCE_JOYSTICK) == InputDevice.SOURCE_JOYSTICK;
        }

        private boolean anyPadConnected() {
            for (int id : InputDevice.getDeviceIds()) {
                if (isPadDevice(InputDevice.getDevice(id))) {
                    return true;
                }
            }
            return false;
        }

        private void ensureCursor() {
            int w = Math.max(1, getWidth());
            int h = Math.max(1, getHeight());
            if (cursorVx < 0f || cursorVy < 0f) {
                cursorVx = w * 0.5f;
                cursorVy = h * 0.5f;
            }
        }

        private void startPadTick() {
            if (padTickRunning) {
                return;
            }
            padTickRunning = true;
            touchHandler.post(padTick);
        }

        private boolean needsPadTick() {
            return Math.abs(stickLX) > PAD_DEADZONE
                    || Math.abs(stickLY) > PAD_DEADZONE
                    || Math.abs(stickRX) > PAD_DEADZONE
                    || Math.abs(stickRY) > PAD_DEADZONE
                    || triggerL2 > PAD_TRIGGER_THRESHOLD
                    || triggerR2 > PAD_TRIGGER_THRESHOLD
                    || l2DigitalHeld
                    || r2DigitalHeld;
        }

        private float dead(float v) {
            return Math.abs(v) < PAD_DEADZONE ? 0f : v;
        }

        private boolean tickPad() {
            ensureCursor();
            float lx = dead(stickLX);
            float ly = dead(stickLY);
            float rx = dead(stickRX);
            float ry = dead(stickRY);
            boolean moved = false;

            if (lx != 0f || ly != 0f) {
                float w = Math.max(1, getWidth());
                float h = Math.max(1, getHeight());
                cursorVx = Math.max(0f, Math.min(w - 1f, cursorVx + lx * PAD_CURSOR_SPEED));
                cursorVy = Math.max(0f, Math.min(h - 1f, cursorVy + ly * PAD_CURSOR_SPEED));
                int[] xy = map(cursorVx, cursorVy);
                if (padLeftDown) {
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

            // Zoom on the "2" triggers only: R2 in, L2 out (L1 freed for aliases).
            boolean zoomIn = triggerR2 > PAD_TRIGGER_THRESHOLD || r2DigitalHeld;
            boolean zoomOut = triggerL2 > PAD_TRIGGER_THRESHOLD || l2DigitalHeld;
            long now = System.currentTimeMillis();
            if ((zoomIn || zoomOut) && now - lastPadZoomAt >= PAD_ZOOM_INTERVAL_MS) {
                int[] xy = map(cursorVx, cursorVy);
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
                redraw();
            }
            return needsPadTick();
        }

        private boolean isDpadCode(int code) {
            return code == KeyEvent.KEYCODE_DPAD_UP
                    || code == KeyEvent.KEYCODE_DPAD_DOWN
                    || code == KeyEvent.KEYCODE_DPAD_LEFT
                    || code == KeyEvent.KEYCODE_DPAD_RIGHT;
        }

        private boolean isGamepad(KeyEvent event) {
            int src = event.getSource();
            if ((src & InputDevice.SOURCE_GAMEPAD) == InputDevice.SOURCE_GAMEPAD
                    || (src & InputDevice.SOURCE_JOYSTICK) == InputDevice.SOURCE_JOYSTICK
                    || (src & InputDevice.SOURCE_DPAD) == InputDevice.SOURCE_DPAD) {
                return true;
            }
            int code = event.getKeyCode();
            return isDpadCode(code)
                    || (code >= KeyEvent.KEYCODE_BUTTON_A && code <= KeyEvent.KEYCODE_BUTTON_MODE);
        }

        /**
         * Forward Learn/alias button press. D-pad may arrive as KeyEvent and hat axis —
         * ignore a second delivery of the same direction within a short window.
         */
        private boolean notifyAliasButton(int code, String label) {
            if (isDpadCode(code)) {
                long now = System.currentTimeMillis();
                if (code == lastDpadNotifyCode && now - lastDpadNotifyAt < 100L) {
                    return true;
                }
                lastDpadNotifyCode = code;
                lastDpadNotifyAt = now;
            }
            return AwtHost.notifyPadButton(code, label);
        }

        boolean handlePadKey(KeyEvent event) {
            int code = event.getKeyCode();
            boolean dpad = isDpadCode(code);
            // D-pad KeyEvents often lack SOURCE_GAMEPAD (SOURCE_DPAD / keyboard only).
            if (!isGamepad(event) && !dpad && code < KeyEvent.KEYCODE_BUTTON_A) {
                return false;
            }
            // Ignore repeats for held zoom / D-pad spam while learning.
            if (event.getAction() == KeyEvent.ACTION_DOWN && event.getRepeatCount() > 0) {
                if (code == KeyEvent.KEYCODE_BUTTON_L2
                        || code == KeyEvent.KEYCODE_BUTTON_R2
                        || dpad) {
                    return true;
                }
                return code >= KeyEvent.KEYCODE_BUTTON_A && code <= KeyEvent.KEYCODE_BUTTON_MODE;
            }
            if ((code < KeyEvent.KEYCODE_BUTTON_A || code > KeyEvent.KEYCODE_BUTTON_MODE) && !dpad) {
                // Still accept if source is gamepad for unknown codes
                if (!isGamepad(event)) {
                    return false;
                }
            }

            activatePad(event.getDeviceId());
            int[] xy = map(cursorVx, cursorVy);
            boolean down = event.getAction() == KeyEvent.ACTION_DOWN;

            switch (code) {
                case KeyEvent.KEYCODE_BUTTON_A: // ✕ Cross → left click
                    if (down) {
                        padLeftDown = true;
                        AwtHost.injectMouse(MouseEvent.MOUSE_PRESSED, xy[0], xy[1], MouseEvent.BUTTON1, 1);
                    } else if (event.getAction() == KeyEvent.ACTION_UP) {
                        padLeftDown = false;
                        AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], MouseEvent.BUTTON1, 1);
                        AwtHost.injectMouse(MouseEvent.MOUSE_CLICKED, xy[0], xy[1], MouseEvent.BUTTON1, 1);
                    }
                    return true;
                case KeyEvent.KEYCODE_BUTTON_B: // ○ Circle → right click
                    if (down) {
                        padRightDown = true;
                        Log.i("void-osrs", "pad ○ right-press @ " + xy[0] + "," + xy[1]);
                        AwtHost.injectMouse(MouseEvent.MOUSE_MOVED, xy[0], xy[1], 0, 0);
                        AwtHost.injectMouse(MouseEvent.MOUSE_PRESSED, xy[0], xy[1], MouseEvent.BUTTON3, 1);
                    } else if (event.getAction() == KeyEvent.ACTION_UP) {
                        padRightDown = false;
                        AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, xy[0], xy[1], MouseEvent.BUTTON3, 1);
                        AwtHost.injectMouse(MouseEvent.MOUSE_CLICKED, xy[0], xy[1], MouseEvent.BUTTON3, 1);
                    }
                    return true;
                case KeyEvent.KEYCODE_BUTTON_L2: // zoom out (digital)
                    l2DigitalHeld = down;
                    if (down) {
                        AwtHost.injectWheel(xy[0], xy[1], 1);
                        lastPadZoomAt = System.currentTimeMillis();
                        startPadTick();
                    }
                    return true;
                case KeyEvent.KEYCODE_BUTTON_R2: // zoom in (digital)
                    r2DigitalHeld = down;
                    if (down) {
                        AwtHost.injectWheel(xy[0], xy[1], -1);
                        lastPadZoomAt = System.currentTimeMillis();
                        startPadTick();
                    }
                    return true;
                default:
                    // L1 / □ / △ / R1 / L3 / R3 / D-pad / Options → alias or map
                    if (down && notifyAliasButton(code, padButtonLabel(code))) {
                        return true;
                    }
                    return dpad
                            || (code >= KeyEvent.KEYCODE_BUTTON_A && code <= KeyEvent.KEYCODE_BUTTON_MODE);
            }
        }

        /** DualShock-ish labels matching {@code JoystickAlias.buttonLabel}.
         * ASCII only — RS bitmap font has no ↑↓←→ / □△ glyphs (they render as '?').
         * Non-static: GameView is an inner class (Java forbids static methods here). */
        private String padButtonLabel(int code) {
            switch (code) {
                case KeyEvent.KEYCODE_BUTTON_X:
                    return "Square";
                case KeyEvent.KEYCODE_BUTTON_Y:
                    return "Triangle";
                case KeyEvent.KEYCODE_BUTTON_L1:
                    return "L1";
                case KeyEvent.KEYCODE_BUTTON_R1:
                    return "R1";
                case KeyEvent.KEYCODE_BUTTON_THUMBL:
                    return "L3";
                case KeyEvent.KEYCODE_BUTTON_THUMBR:
                    return "R3";
                case KeyEvent.KEYCODE_BUTTON_START:
                    return "Options";
                case KeyEvent.KEYCODE_BUTTON_SELECT:
                    return "Share";
                case KeyEvent.KEYCODE_DPAD_UP:
                    return "Up";
                case KeyEvent.KEYCODE_DPAD_DOWN:
                    return "Down";
                case KeyEvent.KEYCODE_DPAD_LEFT:
                    return "Left";
                case KeyEvent.KEYCODE_DPAD_RIGHT:
                    return "Right";
                default:
                    return "Btn" + code;
            }
        }

        boolean handlePadMotion(MotionEvent event) {
            int src = event.getSource();
            boolean joy = (src & InputDevice.SOURCE_CLASS_JOYSTICK) != 0
                    || (src & InputDevice.SOURCE_GAMEPAD) != 0
                    || (src & InputDevice.SOURCE_JOYSTICK) != 0;
            if (!joy) {
                return false;
            }
            int action = event.getActionMasked();
            if (action == MotionEvent.ACTION_CANCEL) {
                onPadDeviceGone(event.getDeviceId());
                return true;
            }
            if (action != MotionEvent.ACTION_MOVE) {
                return false;
            }
            activatePad(event.getDeviceId());
            stickLX = axis(event, MotionEvent.AXIS_X);
            stickLY = axis(event, MotionEvent.AXIS_Y);

            float rz = axis(event, MotionEvent.AXIS_RZ);
            float z = axis(event, MotionEvent.AXIS_Z);
            float rx = axis(event, MotionEvent.AXIS_RX);
            float ry = axis(event, MotionEvent.AXIS_RY);
            // Prefer Z/RZ (common DS4 HID); fall back to RX/RY.
            if (Math.abs(z) > PAD_DEADZONE || Math.abs(rz) > PAD_DEADZONE) {
                stickRX = z;
                stickRY = rz;
            } else {
                stickRX = rx;
                stickRY = ry;
            }

            float lTrigger = axis(event, MotionEvent.AXIS_LTRIGGER);
            float brake = axis(event, MotionEvent.AXIS_BRAKE);
            triggerL2 = Math.max(lTrigger, brake);

            float rTrigger = axis(event, MotionEvent.AXIS_RTRIGGER);
            float gas = axis(event, MotionEvent.AXIS_GAS);
            triggerR2 = Math.max(rTrigger, gas);

            // DualShock / many HID pads: D-pad is only AXIS_HAT_X/Y (no KEYCODE_DPAD_*).
            // Desktop Jamepad and iOS GCController already surface dpad as buttons for Learn.
            updateHatDpad(axis(event, MotionEvent.AXIS_HAT_X), axis(event, MotionEvent.AXIS_HAT_Y));

            startPadTick();
            return true;
        }

        /**
         * Edge-trigger Learn/alias from hat switch. Threshold 0.5 covers digital (±1)
         * and slightly noisy analog hats.
         */
        private void updateHatDpad(float hatX, float hatY) {
            boolean up = hatY < -0.5f;
            boolean down = hatY > 0.5f;
            boolean left = hatX < -0.5f;
            boolean right = hatX > 0.5f;
            if (up && !hatUp) {
                notifyAliasButton(KeyEvent.KEYCODE_DPAD_UP, "Up");
            }
            if (down && !hatDown) {
                notifyAliasButton(KeyEvent.KEYCODE_DPAD_DOWN, "Down");
            }
            if (left && !hatLeft) {
                notifyAliasButton(KeyEvent.KEYCODE_DPAD_LEFT, "Left");
            }
            if (right && !hatRight) {
                notifyAliasButton(KeyEvent.KEYCODE_DPAD_RIGHT, "Right");
            }
            hatUp = up;
            hatDown = down;
            hatLeft = left;
            hatRight = right;
        }

        private float axis(MotionEvent e, int axis) {
            float v = e.getAxisValue(axis);
            return Float.isNaN(v) ? 0f : v;
        }

        public boolean onTouchEvent(MotionEvent event) {
            int action = event.getActionMasked();
            int count = event.getPointerCount();

            if (action == MotionEvent.ACTION_POINTER_DOWN && count >= 2) {
                cancelLongPressWatch();
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
                lastPinchDist = spacing(event);
                pinchAccum = 0f;
                float[] mid = midpoint(event);
                lastPanX = mid[0];
                lastPanY = mid[1];
                panTracked = true;
                // IME covers the view — dismiss so a 4-finger close can finish.
                if (keyboardOpen || isImeVisible()) {
                    hideKeyboard();
                }
                maybeFourFingerConsole();
                return true;
            }

            if (multiTouch) {
                if (action == MotionEvent.ACTION_MOVE && count >= 2) {
                    multiTouchMaxCount = Math.max(multiTouchMaxCount, count);
                    maybeFourFingerConsole();
                    float[] mid = midpoint(event);
                    if (panTracked) {
                        AwtHost.injectCameraOrbit(mid[0] - lastPanX, mid[1] - lastPanY);
                    }
                    lastPanX = mid[0];
                    lastPanY = mid[1];
                    panTracked = true;
                    float dist = spacing(event);
                    if (lastPinchDist > 0f) {
                        pinchAccum += dist - lastPinchDist;
                        while (pinchAccum >= PINCH_PX_PER_NOTCH) {
                            int[] midGame = mapMid(event);
                            AwtHost.injectWheel(midGame[0], midGame[1], -1);
                            pinchAccum -= PINCH_PX_PER_NOTCH;
                        }
                        while (pinchAccum <= -PINCH_PX_PER_NOTCH) {
                            int[] midGame = mapMid(event);
                            AwtHost.injectWheel(midGame[0], midGame[1], 1);
                            pinchAccum += PINCH_PX_PER_NOTCH;
                        }
                    }
                    lastPinchDist = dist;
                    return true;
                }
                if (action == MotionEvent.ACTION_POINTER_UP) {
                    if (count - 1 < 2) {
                        multiTouch = false;
                        ignoreSingleFinger = true;
                        down = false;
                        dragging = false;
                        longPressFired = false;
                        lastPinchDist = -1f;
                        pinchAccum = 0f;
                        panTracked = false;
                        finishFourFingerGesture();
                    } else {
                        lastPinchDist = spacingAfterPointerUp(event);
                        float[] mid = midpointAfterPointerUp(event);
                        lastPanX = mid[0];
                        lastPanY = mid[1];
                        panTracked = true;
                    }
                    return true;
                }
                if (action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL) {
                    multiTouch = false;
                    ignoreSingleFinger = false;
                    lastPinchDist = -1f;
                    pinchAccum = 0f;
                    panTracked = false;
                    down = false;
                    dragging = false;
                    longPressFired = false;
                    finishFourFingerGesture();
                    return true;
                }
                return true;
            }

            if (ignoreSingleFinger) {
                if (action == MotionEvent.ACTION_DOWN) {
                    ignoreSingleFinger = false;
                } else if (action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL) {
                    ignoreSingleFinger = false;
                    down = false;
                    dragging = false;
                    longPressFired = false;
                    cancelLongPressWatch();
                    return true;
                } else {
                    return true;
                }
            }

            int[] xy = map(event.getX(), event.getY());
            int x = xy[0];
            int y = xy[1];
            if (action == MotionEvent.ACTION_DOWN) {
                down = true;
                dragging = false;
                longPressFired = false;
                downVx = event.getX();
                downVy = event.getY();
                downX = x;
                downY = y;
                cancelLongPressWatch();
                long timeout = Math.max(175, ViewConfiguration.getLongPressTimeout() / 2);
                Log.i("void-osrs", "longPress SCHEDULE " + timeout + "ms @ " + downX + "," + downY);
                touchHandler.postDelayed(longPressRunnable, timeout);
            } else if (action == MotionEvent.ACTION_MOVE && down && !longPressFired) {
                float moved = Math.max(Math.abs(event.getX() - downVx), Math.abs(event.getY() - downVy));
                if (!dragging && moved > LONG_PRESS_CANCEL_SLOP) {
                    // Finger slid → left-button drag (same path as pad ✕ held + stick).
                    dragging = true;
                    cancelLongPressWatch();
                    Log.i("void-osrs", "drag START moved=" + moved);
                    AwtHost.injectMouse(MouseEvent.MOUSE_MOVED, downX, downY, 0, 0);
                    AwtHost.injectMouse(MouseEvent.MOUSE_PRESSED, downX, downY, MouseEvent.BUTTON1, 1);
                    AwtHost.injectMouse(MouseEvent.MOUSE_DRAGGED, x, y, MouseEvent.BUTTON1, 0);
                } else if (dragging) {
                    AwtHost.injectMouse(MouseEvent.MOUSE_DRAGGED, x, y, MouseEvent.BUTTON1, 0);
                }
            } else if (action == MotionEvent.ACTION_UP || action == MotionEvent.ACTION_CANCEL) {
                cancelLongPressWatch();
                if (!down) {
                    // leftover
                } else if (longPressFired) {
                    Log.i("void-osrs", "longPress UP after right-click");
                } else if (dragging) {
                    Log.i("void-osrs", "drag END @ " + x + "," + y);
                    AwtHost.injectMouse(MouseEvent.MOUSE_RELEASED, x, y, MouseEvent.BUTTON1, 1);
                } else if (action == MotionEvent.ACTION_UP) {
                    Log.i("void-osrs", "tap left-click @ " + downX + "," + downY
                            + " frac=" + String.format(java.util.Locale.US, "%.3f,%.3f",
                                downX / (float) Math.max(1, frameW),
                                downY / (float) Math.max(1, frameH))
                            + " frame=" + frameW + "x" + frameH);
                    AwtHost.injectLeftClick(downX, downY);
                    // IME only from the --> write strip. History taps re-run in the client
                    // and must not raise/hide the keyboard.
                    if (AwtHost.isDevConsoleOpen()) {
                        if (AwtHost.isConsolePromptTap(downX, downY)) {
                            if (isImeVisible() || keyboardOpen) {
                                hideKeyboard();
                            } else {
                                showKeyboard();
                            }
                        }
                    } else if (isImeVisible() || keyboardOpen) {
                        hideKeyboard();
                    }
                }
                down = false;
                dragging = false;
                longPressFired = false;
            }
            return true;
        }

        private void cancelLongPressWatch() {
            touchHandler.removeCallbacks(longPressRunnable);
        }

        private void maybeFourFingerConsole() {
            if (fourFingerConsoleFired || multiTouchMaxCount < 4) {
                return;
            }
            fourFingerConsoleFired = true;
            boolean wasOpen = AwtHost.isDevConsoleOpen();
            Log.i("void-osrs", "4-finger tap → developer console (wasOpen=" + wasOpen + ")");
            if (wasOpen) {
                AwtHost.setDevConsoleOpen(false);
                hideKeyboard();
            } else {
                // Open console only — do not raise IME/chat. Tap later toggles keyboard if needed.
                AwtHost.setDevConsoleOpen(true);
            }
        }

        private void finishFourFingerGesture() {
            fourFingerConsoleFired = false;
            multiTouchMaxCount = 0;
        }

        private float spacing(MotionEvent e) {
            float dx = e.getX(0) - e.getX(1);
            float dy = e.getY(0) - e.getY(1);
            return (float) Math.hypot(dx, dy);
        }

        private float spacingAfterPointerUp(MotionEvent e) {
            int up = e.getActionIndex();
            int a = -1;
            int b = -1;
            for (int i = 0; i < e.getPointerCount(); i++) {
                if (i == up) {
                    continue;
                }
                if (a < 0) {
                    a = i;
                } else {
                    b = i;
                    break;
                }
            }
            if (a < 0 || b < 0) {
                return -1f;
            }
            float dx = e.getX(a) - e.getX(b);
            float dy = e.getY(a) - e.getY(b);
            return (float) Math.hypot(dx, dy);
        }

        private float[] midpoint(MotionEvent e) {
            return new float[]{(e.getX(0) + e.getX(1)) * 0.5f, (e.getY(0) + e.getY(1)) * 0.5f};
        }

        private float[] midpointAfterPointerUp(MotionEvent e) {
            int up = e.getActionIndex();
            float sx = 0f;
            float sy = 0f;
            int n = 0;
            for (int i = 0; i < e.getPointerCount(); i++) {
                if (i == up) {
                    continue;
                }
                sx += e.getX(i);
                sy += e.getY(i);
                n++;
            }
            if (n == 0) {
                return new float[]{0f, 0f};
            }
            return new float[]{sx / n, sy / n};
        }

        private int[] mapMid(MotionEvent e) {
            float[] mid = midpoint(e);
            return map(mid[0], mid[1]);
        }

        private int[] map(float vx, float vy) {
            int vw = Math.max(1, getWidth());
            int vh = Math.max(1, getHeight());
            int gw = Math.max(1, frameW);
            int gh = Math.max(1, frameH);
            int x = (int) (vx * gw / (float) vw);
            int y = (int) (vy * gh / (float) vh);
            x = Math.max(0, Math.min(gw - 1, x));
            y = Math.max(0, Math.min(gh - 1, y));
            return new int[]{x, y};
        }

        public void present(Bitmap bitmap) {
            Bitmap old = frame;
            frame = bitmap;
            frameW = bitmap.getWidth();
            frameH = bitmap.getHeight();
            if (old != null && old != bitmap) {
                old.recycle();
            }
            // View.onDraw always uses the layout size — avoids SurfaceView buffer
            // sticking at ~half width after resume on some OEM devices.
            postInvalidateOnAnimation();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            drawFrame(canvas);
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            super.onSizeChanged(w, h, oldw, oldh);
            if (w > 0 && h > 0 && !keyboardOpen) {
                applySurfaceSize(w, h, "sizeChanged", false);
            }
        }

        private void drawFrame(Canvas canvas) {
            canvas.drawColor(0xff000000);
            Bitmap bmp = frame;
            if (bmp != null) {
                int bw = bmp.getWidth();
                int bh = bmp.getHeight();
                int srcW = bw;
                int srcH = bh;
                // If present somehow still has a phone-sized letterboxed buffer,
                // only stretch the logical FS content (top-left).
                int gw = Math.max(1, AwtHost.GAME_WIDTH);
                int gh = Math.max(1, AwtHost.GAME_HEIGHT);
                if (bw > gw || bh > gh) {
                    srcW = Math.min(gw, bw);
                    srcH = Math.min(gh, bh);
                }
                src.set(0, 0, srcW, srcH);
                int dw = Math.max(1, getWidth());
                int dh = Math.max(1, getHeight());
                dst.set(0, 0, dw, dh);
                canvas.drawBitmap(bmp, src, dst, paint);
            }
            if (padActive && cursorVx >= 0f && cursorVy >= 0f && cursorBmp != null) {
                float left = cursorVx - cursorHotX;
                float top = cursorVy - cursorHotY;
                cursorDst.set(left, top, left + cursorDrawW, top + cursorDrawH);
                canvas.drawBitmap(cursorBmp, null, cursorDst, cursorPaint);
            }
        }

        void redraw() {
            invalidate();
        }
    }
}
