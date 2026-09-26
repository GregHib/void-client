import awt.UiScale
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.KeyboardEvent
import org.w3c.dom.events.KeyboardEventInit
import org.w3c.dom.events.MouseEvent

/** The global `Object.defineProperty`, used to patch `keyCode`/`which` onto a synthetic event
 * (browsers ignore those fields in the KeyboardEvent constructor's init dict - a long-standing
 * spec quirk - so awt.event.KeyEvent.from, which reads event.keyCode, would otherwise see 0). */
@Suppress("UnsafeCastFromDynamic")
private fun definePropertyGetter(target: dynamic, name: String, value: Int) {
    val descriptor = js("({})")
    descriptor.get = { value }
    js("Object").defineProperty(target, name, descriptor)
}

/**
 * On touch-only devices (no mouse/trackpad) the game canvas can be focused, but browsers won't pop
 * up an on-screen keyboard for a canvas - only for real form fields. This keeps a hidden, always
 * up-to-date `<input>` around purely to drive that keyboard: focusing it opens the keyboard, blurring
 * it closes it, and its key events are re-dispatched onto the canvas so the game's existing keydown/
 * keyup handling (see awt.Component.ensureDomListeners) picks them up exactly like a physical key.
 */
private fun isTouchOnlyDevice(): Boolean =
    window.matchMedia("(pointer: coarse)").matches && !window.matchMedia("(any-pointer: fine)").matches

fun setupTouchKeyboard() {
    if (!isTouchOnlyDevice()) return

    val hiddenInput = (document.createElement("input") as HTMLInputElement).apply {
        setAttribute("type", "text")
        setAttribute("autocomplete", "off")
        setAttribute("autocapitalize", "off")
        setAttribute("autocorrect", "off")
        setAttribute("spellcheck", "false")
        style.position = "fixed"
        style.top = "0"
        style.left = "0"
        style.width = "1px"
        style.height = "1px"
        style.opacity = "0"
        style.border = "0"
        style.padding = "0"
        style.zIndex = "-1"
    }
    document.body?.appendChild(hiddenInput)

    fun canvas(): HTMLCanvasElement? = document.querySelector("canvas") as? HTMLCanvasElement

    fun forward(type: String, source: KeyboardEvent) {
        val target = canvas() ?: return
        val evt = KeyboardEvent(
            type,
            KeyboardEventInit(
                key = source.key, code = source.asDynamic().code as? String, bubbles = true, cancelable = true,
                shiftKey = source.shiftKey, ctrlKey = source.ctrlKey, altKey = source.altKey, metaKey = source.metaKey
            )
        )
        definePropertyGetter(evt, "keyCode", source.keyCode)
        definePropertyGetter(evt, "which", source.asDynamic().which as Int)
        target.dispatchEvent(evt)
    }

    hiddenInput.addEventListener("keydown", { event ->
        val keyboardEvent = event as KeyboardEvent
        forward("keydown", keyboardEvent)
        if (keyboardEvent.key == "Enter") hiddenInput.blur()
    })
    hiddenInput.addEventListener("keyup", { event ->
        forward("keyup", event as KeyboardEvent)
    })

    window.addEventListener("click", { event ->
        val mouseEvent = event as MouseEvent
        val canvasElement = canvas() ?: return@addEventListener
        if (mouseEvent.target != canvasElement) {
            hiddenInput.blur()
            return@addEventListener
        }
        val x = mouseEvent.offsetX.toInt() / UiScale.factor
        val y = mouseEvent.offsetY.toInt() / UiScale.factor
        val bounds = IdentKitRecolor.chatBoxBounds()
        val insideChatBox = x >= bounds[0] && x < bounds[0] + bounds[2] && y >= bounds[1] && y < bounds[1] + bounds[3]
        if (insideChatBox) hiddenInput.focus() else hiddenInput.blur()
    })
}
