/**
 * Platform seam for opening a game/JS5 connection.
 *
 * The connection contract itself is [Class238] (read/write/close, non-blocking poll
 * semantics — see Class376/Class208 for the JVM reference pumps). A [SocketOpener]
 * turns a host+port into one of those connections, hiding the transport:
 *
 *  - JVM ([JvmSocketOpener]) opens a `java.net.Socket` (direct or via the SOCKS proxy
 *    helper) and wraps it in `Class238_Sub1`.
 *  - JS ([JsSocketOpener]) opens a browser `WebSocket` and wraps it in
 *    `WebSocketConnection`. Browsers cannot open raw TCP, so the far end is either a
 *    WebSocket-native game server or a WebSocket->TCP proxy; either way the bytes on
 *    the wire are the raw game protocol (binary passthrough).
 *
 * Opening may be asynchronous (the JS `WebSocket` handshake completes on a later event
 * loop turn). Implementations therefore return a connection immediately and surface any
 * connect failure through the connection's own read/write calls (as an [IOException]),
 * exactly as the JVM reader pump surfaces a mid-stream error. This matches how callers
 * already poll the connection (see Class202 / the game-connect path).
 *
 * @param proxy when true, route through the proxy variant (JVM SOCKS / a proxy-flavoured
 *        WebSocket endpoint); when false, connect directly.
 */
interface SocketOpener {
    fun open(proxy: Boolean, host: String?, port: Int): Class238
}

/**
 * The active opener, installed once at startup by the platform bootstrap
 * (JVM: the Loader/signlink wiring; JS: the web bootstrap `main`).
 *
 * Kept as a plain settable global rather than `expect/actual` so it stays testable and
 * mockable, per the migration plan's "plain interfaces injected at startup" guidance for
 * the large seams.
 */
object Connections {
    private var opener: SocketOpener? = null

    fun install(opener: SocketOpener) {
        this.opener = opener
    }

    fun opener(): SocketOpener =
        opener ?: throw IllegalStateException("No SocketOpener installed")

    fun open(proxy: Boolean, host: String?, port: Int): Class238 =
        opener().open(proxy, host, port)
}
