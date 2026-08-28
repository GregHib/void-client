package awt

import awt.image.ImageProducer
import kotlinx.browser.document
import org.w3c.dom.HTMLCanvasElement

actual open class Canvas actual constructor() : Component() {
    private var canvasElement: HTMLCanvasElement =
        document.createElement("canvas") as HTMLCanvasElement
    override val element: HTMLCanvasElement get() = canvasElement

    fun replaceWithFreshCanvas(): HTMLCanvasElement {
        val fresh = document.createElement("canvas") as HTMLCanvasElement
        val old = canvasElement
        val hadFocus = document.activeElement === old
        fresh.width = old.width
        fresh.height = old.height
        fresh.className = old.className
        old.getAttribute("style")?.let { fresh.setAttribute("style", it) }
        old.parentNode?.replaceChild(fresh, old)
        canvasElement = fresh
        resetDomListeners()
        if (hadFocus) fresh.focus()
        return fresh
    }

    actual fun createImage(width: Int, height: Int): Image {
        val offscreen = document.createElement("canvas") as HTMLCanvasElement
        offscreen.width = width
        offscreen.height = height
        return CanvasImage(offscreen)
    }

    // Not wired up yet. Deliberately an Exception rather than TODO(): NotImplementedError is an
    // Error and would escape the client's `catch (Exception)` fallbacks instead of triggering them.
    actual fun createImage(producer: ImageProducer): Image =
        throw IllegalArgumentException("ImageProducer-backed images are not supported yet")
}

actual var Canvas.ignoreRepaint: Boolean
    get() = ignoreRepaintFlag
    set(value) { ignoreRepaintFlag = value }

actual val Canvas.pxWidth: Int get() = getWidth()
actual val Canvas.pxHeight: Int get() = getHeight()
