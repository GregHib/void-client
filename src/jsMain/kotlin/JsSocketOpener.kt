/**
 * JS [SocketOpener]: turns host+port into a [WebSocketConnection].
 *
 * ## URL derivation
 *
 * Browsers can't open raw TCP, so [host]/[port] from the game's connection request
 * can't be dialed directly — they're handed to a WebSocket-native server or a
 * WebSocket->TCP proxy as query parameters. The endpoint base is derived from the page:
 *
 *  - scheme: `wss` when the page is served over https (mixed-content rules forbid `ws`
 *    from an https page), else `ws`.
 *  - authority: the page's own host by default, so the proxy is assumed to be co-hosted
 *    with the client. Override with a `?ws=<base>` page query param (or [baseOverride])
 *    to point at a separate proxy, e.g. `?ws=wss://proxy.example.com/socket`.
 *
 * The game's target host/port travel as `?host=&port=` so the proxy knows where to dial.
 * The [proxy] flag is forwarded as `&proxy=1` for servers that distinguish the SOCKS
 * path; a WS-native server can ignore it.
 *
 * Uses `js()` for `window`/URI helpers to match the existing jsMain style and avoid a
 * kotlinx-browser dependency.
 *
 * @param baseOverride optional explicit ws(s):// base; when null, derived from the page.
 */
class JsSocketOpener(private val baseOverride: String? = null) : SocketOpener {

    override fun open(proxy: Boolean, host: String?, port: Int): Class238 {
        val url = buildUrl(proxy, host, port)
        return WebSocketConnection(url, GAME_CONNECTION_KEY)
    }

    private fun buildUrl(proxy: Boolean, host: String?, port: Int): String {
        val base = baseOverride ?: queryParam("ws") ?: defaultBase()
        val sep = if (base.contains('?')) '&' else '?'
        val h = host ?: ""
        return "$base${sep}host=${encode(h)}&port=$port&proxy=${if (proxy) 1 else 0}"
    }

    private fun defaultBase(): String {
        val protocol = js("window.location.protocol") as String
        val hostPort = js("window.location.host") as String
        val scheme = if (protocol == "https:") "wss" else "ws"
        // Co-hosted proxy endpoint; conventionally mounted at /socket.
        return "$scheme://$hostPort/socket"
    }

    private fun queryParam(name: String): String? {
        val search = js("window.location.search") as String
        if (search.isEmpty()) return null
        val q = search.removePrefix("?")
        for (pair in q.split("&")) {
            val idx = pair.indexOf('=')
            if (idx > 0 && pair.substring(0, idx) == name) {
                return decode(pair.substring(idx + 1))
            }
        }
        return null
    }

    private fun encode(s: String): String = js("encodeURIComponent(s)") as String
    private fun decode(s: String): String = js("decodeURIComponent(s)") as String

    companion object {
        /** Mirror of Class297.GAME_CONNECTION_KEY (the JVM buffer-size hint). */
        const val GAME_CONNECTION_KEY = 7500
    }
}
