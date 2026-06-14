# Phase 4 · Step 14 — JS Bootstrap Bring-up (Design)

**Goal of step 14:** take everything steps 1–13 produced and actually *start the client in the
browser* — set the applet parameters, register the applet, construct `Client`, run `init()`,
hand the frame loop to `requestAnimationFrame`, and serve the page against a WebSocket→TCP proxy.

This document is a **design/spec only** (per the agreed scope). No `.kt` files are written yet.
It is precise enough to implement directly once the step-1 prerequisite below is cleared.

---

## 0. Blocking prerequisite — step 1 is NOT actually done

The plan in `KMP_MIGRATION.md` lists step 1 as "move `Client.kt` to `commonMain`", and the user
notes steps 1–13 are complete. **On disk this is not true:**

- `Client.kt` is still at `src/jvmMain/kotlin/Client.kt` (2,722 LOC), with `import java.util.*`.
- The git history goes `cd35601 move Applet_Sub1 to commonMain` → straight to the JS-seam commits
  (steps 5–13). There is no "move Client to commonMain" commit.
- `Main.js.kt` already references `Client()`. **That line cannot compile on the JS target today**
  because `Client` is a `jvmMain` class. (`compileKotlinJs` is only green because — verify — the
  reference is currently the last unbuilt edit, or JS main is excluded; confirm with a clean
  `compileKotlinJs` before starting.)

**Implication for step 14:** the bootstrap *must* be able to name `Client`, call `Client.init()`,
and call the (common) `Applet_Sub1.run()`. All three require `Client` to live in `commonMain`.
The good news is the groundwork from steps 2–4 already removed Client's AWT touchpoints behind
seams (`WindowShells.instance?.forceToolkitInit()` at L628, `Clipboards.instance` at L674,
`tryAdoptHostCanvas()` for the applet-canvas grab). The only residual platform import is
`import java.util.*` — that must be audited and replaced with the common shims (Calendar/Random/
collection seams already exist) before/as part of the move.

**Recommended sequencing:** land step 1 (move `Client` to `commonMain`, keep `compileKotlinJvm`
green, rebuild both targets) as its own commit *first*, then implement step 14 on top. Step 14 as
specified below assumes `Client` is common.

---

## 1. What the JVM bootstrap does (the contract to replicate)

`Loader.doApplet()` = `setParms()` then `startClient()`. The ordering that matters for parity:

1. **`setParms()`** — populate `Loader.aProperties1` with ~35 applet params (worldid, lobbyid,
   lobbyaddress, modewhere, modewhat, lang, js, game, affid, advert, settings, colourid,
   sitesettings_member, worldflags, …). `Client.init()` reads ~30 of these via `getParameter()`.
2. **resolve clipboard** (may throw on headless) → pass to `installCommon`.
3. **`provideLoaderApplet(this)`** → sets `Class93.anApplet1530 = <the GameApplet>`. This is the
   object `Applet_Sub1.getParameter()` delegates to (`Applet_Sub1.kt:14`).
4. **ensure `AwtWindowShell.instance`** exists.
5. **`ClientBootstrap.installCommon(...)`** — installs all 11 seams in dependency order.
6. **`Client()` → `init()` → `start()`**.
7. The applet framework subsequently drives **`Applet_Sub1.run()`**, which after env checks calls
   `method92()` and then `GameLoops.run(::runFrame)` (`Applet_Sub1.kt:254`). `GameLoops.run` is
   where the platform loop takes over — on JVM `BlockingGameLoop` (a `while`), on JS `JsGameLoop`
   (rAF). **This is the single handoff point**: once `run()` reaches `GameLoops.run`, the rest is
   platform-agnostic.

Key insight: `init()`/`start()` do *not* themselves start the loop. `run()` does. The JS bootstrap
must therefore call `run()` after `init()` (the JVM applet container does this implicitly; on JS we
do it explicitly). `JsGameLoop.run` returns immediately after scheduling the first rAF, so calling
`run()` from `main()` does not block — correct for the single-threaded web runtime.

---

## 2. The missing piece nobody built yet: a JS `GameApplet` (params provider)

On JVM, `Loader` *is* the `GameApplet`: it owns `aProperties1` and implements `getParameter`,
`getCodeBase`, `getDocumentBase`, `showDocument`, `getPulseComponent`, `destroy`. On JS there is no
`Loader`. `Applet_Sub1.getParameter()` delegates to `Class93.anApplet1530` — so **JS needs a small
`GameApplet` whose only real job is to answer `getParameter()` from a params map.**

### New class: `JsApplet : GameApplet` (jsMain)

```
class JsApplet(
    private val params: Map<String, String>,
    private val codeBase: String,      // e.g. window.location.origin + "/"
) : GameApplet {
    override fun getParameter(name: String?): String? = name?.let { params[it] }
    override fun getCodeBase(): String? = codeBase
    override fun getDocumentBase(): String? = codeBase
    override fun destroy() {}
    override fun getPulseComponent(): DisplayTarget? =
        WindowShells.instance?.currentDisplayTarget       // focus/repaint handle
    override fun showDocument(url: String?, target: String?) {
        url?.let { window.open(it, target ?: "_blank") }
    }
}
```

Notes:
- `getPulseComponent()` returns the shell's current `DisplayTarget` (mirrors how `Loader`
  returns `Class305.aDisplayTarget3869`). Until a surface is vended it is null — acceptable.
- This is *not* the same object as `Client` (which is itself an `Applet_Sub1` and thus also a
  `GameApplet`). `Applet_Sub1.getParameter` explicitly delegates to `anApplet1530` *when it is a
  different object* (`anApplet1530 !== this`). So `JsApplet` must be a distinct instance registered
  as `anApplet1530`, exactly as `Loader` is distinct from `Client` on JVM. **Do not** set
  `anApplet1530 = client`.

### Params source: port `Loader.setParms()`

The simplest faithful port is a `commonMain` (or jsMain) constant map mirroring `setParms()`.
Better: factor the JVM map into a shared `object DefaultAppletParams { val map: Map<String,String> }`
in `commonMain` so JVM and JS use one source of truth (optional cleanup; not required for the
milestone). For the first browser login, hardcoding the same values `setParms()` uses is fine, with
two web-specific overrides:

- `lobbyaddress` → the **proxy-reachable** host (see §6). On JVM it is `address`
  (`127.0.0.1`) when `loadRunescape == false`. On web the WebSocket proxy endpoint is derived by
  `JsSocketOpener` from the page URL / `?ws=` param, so `lobbyaddress` only needs to be a non-empty
  placeholder that the protocol accepts; the actual transport host comes from `JsSocketOpener`.
  **Confirm** how `Client.init()` uses `lobbyaddress` vs. how `Class238`/`JsSocketOpener` choose the
  socket endpoint — if `Client` derives the connect host purely from `lobbyaddress`, the proxy must
  be addressable by that value; if `JsSocketOpener` ignores it and uses `?ws=`, the placeholder is
  fine. (This is the one ambiguity to resolve empirically during bring-up.)
- Optionally allow URL query overrides (`?world=…`, `?lobby=…`) for testing.

---

## 3. `Main.js.kt` — the fully specified bootstrap

Current `Main.js.kt` stops after `installCommon(...)`. It is missing: params, applet registration,
`Client` construction, `init()`, and the `run()` handoff. Target shape:

```
fun main() {
    // 0. Run after DOM is ready (binaries.executable main fires on load; if the script is in
    //    <head> guard with document.readyState / DOMContentLoaded). JsWindowShell appends its
    //    canvas to document.body, so body must exist first.

    // 1. Build the platform shell + seams (steps 5–13 artifacts).
    val windowShell = JsWindowShell()
    val glyphFactory: (DisplayTarget) -> GlyphRasterizer = { _ -> JsGlyphRasterizer() }

    ClientBootstrap.installCommon(
        workers      = JsWorkerFactory,
        gameLoop     = JsGameLoop(),
        sleeper      = JsSleeper,
        logger       = JsGameLogger,                 // step 12 (or inline console.log object)
        runtimeInfo  = JsRuntimeInfo(),
        glyphRasterizerFactory = glyphFactory,
        clipboard    = null,                          // navigator.clipboard wrapper later; null ok
        socketOpener = JsSocketOpener(),
        cacheStorage = { OPFSCacheStorage() },
        audioSink    = { WebAudioSink() },
        windowShell  = windowShell,
    )

    // 2. Register the params-providing applet (the JVM equivalent of provideLoaderApplet(loader)).
    val applet = JsApplet(params = DefaultAppletParams.map, codeBase = window.location.origin + "/")
    Class93.anApplet1530 = applet

    // 3. Construct the (now-common) Client and run the applet lifecycle.
    val client = Client()
    // init() reads ~30 params via getParameter() -> anApplet1530; must run after step 2.
    client.init()
    client.start()        // start() only resets a shutdown timer; harmless but keep for parity.

    // 4. Hand control to the frame loop. run() does env checks, method92(), then
    //    GameLoops.run(::runFrame) -> JsGameLoop schedules the first rAF and returns.
    client.run()
}
```

### Ordering constraints (must hold)

1. `installCommon` **before** anything that touches a seam. In particular `WindowShells.instance`
   is set inside `installCommon`; `JsApplet.getPulseComponent` and `Applet_Sub1.method87` both read
   it.
2. `Class93.anApplet1530 = applet` **before** `client.init()` — `getParameter` returns null
   otherwise and `init()` NPEs on `getParameter("worldid")!!.toInt()`.
3. `client.init()` **before** `client.run()` (run assumes init'd state; `method89` gate is
   currently hardcoded `return true`).
4. `JsWindowShell()` constructed **before** `installCommon` (it is passed in) and **before** any
   `provideDisplayTarget` call (made inside `method87`, reached from `run()`).

### `Class93` visibility

`Class93.anApplet1530` is a `commonMain` field (`Class93.kt:3`, `var anApplet1530: GameApplet?`),
so JS can assign it directly. Good — no new seam needed for applet registration.

---

## 4. Canvas ownership — resolve the double-canvas

There are currently **two** canvases:
- `index.html` ships a static `<canvas id="game" width="765" height="503">`.
- `JsWindowShell` **creates its own** `<canvas id="game-canvas">` and appends it to `document.body`.

These will both appear. Pick one ownership model:

- **Option A (recommended): shell owns the canvas.** Drop the `<canvas>` from `index.html`
  (keep only the `<script>` and a styled container `<div id="app">`). `JsWindowShell` already
  creates and appends. Optionally have it append into `#app` instead of `body` for layout control,
  and set `width=765 height=503` explicitly (it currently relies on defaults — verify it sets the
  backing size, since `JsGameSurface` blits 765×503 `ImageData`).
- **Option B: html owns the canvas.** `JsWindowShell` takes an existing
  `HTMLCanvasElement` (looked up by id) instead of creating one. Cleaner separation of markup vs.
  logic, but requires changing the step-8 shell's constructor.

Either is fine; **A is least code** given the shell already self-creates. Whichever is chosen,
ensure the canvas backing store is exactly 765×503 (logical) and `image-rendering: pixelated` so the
software framebuffer is not smoothed.

---

## 5. `index.html` (final form for Option A)

```
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>void-client (web)</title>
  <style>
    html, body { margin: 0; height: 100%; background: #000; }
    #app { display: flex; justify-content: center; align-items: center; height: 100%; }
    #game-canvas { image-rendering: pixelated; background: #000; }
  </style>
</head>
<body>
  <div id="app"></div>
  <!-- JsWindowShell appends #game-canvas into #app. -->
  <script src="void-client.js"></script>
</body>
</html>
```

Optional `?ws=wss://host/path` query param continues to point `JsSocketOpener` at a specific proxy;
default falls back to `/socket` on the same origin (already implemented per the comment in the
existing html).

---

## 6. Networking — stand up the `proxy/` WebSocket→TCP bridge

Browsers cannot open raw TCP. The login screen pulls background/logo/sprites/fonts from the cache
**and** JS5, and JS5 flows through `Class238` via `JsSocketOpener.WebSocketConnection` — so JS5
connectivity is on the login critical path (per the plan). Required infra:

- **`proxy/` module** — a ~100-line Ktor (JVM) server that:
  - accepts a WebSocket connection (path e.g. `/socket`, optionally `/socket?host=&port=`),
  - opens a TCP socket to the target 634 content/login server,
  - pumps bytes bidirectionally **as binary frames, unframed/passthrough** (matches
    `WebSocketConnection`'s "single-threaded, binary passthrough" design noted in the JS net work),
  - closes both sides together.
- Point it at a local 634-compatible content+login server. Same-origin default means serving
  `index.html`, the JS bundle, and the WS endpoint from one host avoids CORS/mixed-content; otherwise
  use `?ws=wss://…` and ensure TLS if the page is https.
- **Verify the failure-path nuance** flagged in prior net work: happy path is byte-identical to the
  JVM socket, but error/EOF mapping can differ — watch the JS5 handshake closely on first connect.

This proxy is its own deliverable; it does not block writing the bootstrap, but the milestone
(seeing the login screen) needs it running because the login UI assets come over JS5.

---

## 7. Gradle — build + serve the web bundle

- Ensure `kotlin { js(IR) { browser { } ; binaries.executable() } }` is configured (the `js()`
  target already exists since `compileKotlinJs` runs).
- Add the **browser distribution / dev server** wiring:
  - `jsBrowserDevelopmentRun` (or `…ProductionRun`) for a hot dev server, and
    `jsBrowserDistribution` to emit `void-client.js` + processed resources (`index.html`) into
    `build/dist/js/productionExecutable/`.
  - Confirm `commonWebpackConfig`/`outputFileName = "void-client.js"` so the `<script src>` matches.
  - Resources under `src/jsMain/resources/` (the `index.html`) are copied into the dist — verify the
    final `index.html` references `void-client.js` (it does).
- Serving: either the Kotlin webpack dev server (`./gradlew jsBrowserDevelopmentRun`) or any static
  host pointed at the distribution dir, with the proxy reachable from the same origin (or via `?ws=`).
- Per project rule: build with the `void-client [compileKotlinJvm]` / `[compileKotlinJs]` run
  configs, gradle build, and commit after each change.

---

## 8. Implementation checklist (when step 1 is cleared)

1. **(prereq)** Move `Client.kt` → `commonMain`; replace `import java.util.*` with common shims;
   `compileKotlinJvm` + `compileKotlinJs` green; commit.
2. Add `DefaultAppletParams` (shared map ported from `Loader.setParms()`), web overrides for
   `lobbyaddress`/world/lobby as needed.
3. Add `JsApplet : GameApplet` (params + codeBase + showDocument via `window.open`).
4. Add `JsGameLogger` if not present (or keep the inline console.log object already in `main`).
5. Rewrite `Main.js.kt` per §3: install seams → set `Class93.anApplet1530` → `Client()` →
   `init()` → `start()` → `run()`.
6. Resolve canvas ownership per §4; update `index.html` per §5.
7. Add gradle browser dist/run task; confirm bundle name `void-client.js`.
8. Build `proxy/` Ktor bridge (§6); run against a local 634 server.
9. `compileKotlinJs` green → `jsBrowserDevelopmentRun` → open page.

**Milestone check:** software-rendered login screen (title background, logo, buttons, text) in the
browser. Then world login (RSA login block — already common via `BigInt`), then a playability pass.

---

## 9. Open questions to confirm during bring-up

1. **`lobbyaddress` vs. `JsSocketOpener` endpoint** (§2/§6): does `Client` derive the connect host
   from the param, or does `JsSocketOpener` fully own the endpoint via `?ws=`? Determines whether the
   param must be proxy-addressable or can be a placeholder.
2. **`compileKotlinJs` truly green with `Client()` referenced?** If JS main currently excludes the
   `Client()` line or the file, confirm before assuming step 1 is the only blocker.
3. **DOM-readiness of `main()`**: confirm whether the Kotlin/JS `main` runs before `body` exists
   (script placement). `JsWindowShell` requires `document.body` — guard with a `DOMContentLoaded`
   check if the bundle is loaded in `<head>`.
4. **Worker cooperativeness** (step 7): confirm the JS5 pump + cache fetch make progress purely
   inside the rAF loop / microtasks with no real thread, all the way to login-asset load.
