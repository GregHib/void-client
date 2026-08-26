package awt

import kotlinx.browser.document
import org.w3c.dom.HTMLElement

actual open class Container : Component() {
    override val element: HTMLElement =
        document.createElement("div") as HTMLElement

    private val children = mutableListOf<Component>()

    actual fun add(comp: Component): Component {
        children += comp
        comp.parent = this
        element.appendChild(comp.element)
        return comp
    }

    actual fun remove(comp: Component?) {
        if (children.remove(comp)) {
            comp!!.parent = null
            element.removeChild(comp.element)
        }
    }

    actual fun remove(index: Int) = remove(children[index])

    actual fun removeAll() {
        children.toList().forEach { remove(it) }
    }

    actual fun getComponentCount(): Int = children.size
    actual fun getComponent(n: Int): Component = children[n]

    actual fun isAncestorOf(c: Component): Boolean =
        element.contains(c.element) && c.element !== element

    actual fun validate() { doLayout() }
    actual fun invalidate() { }
    actual fun doLayout() { }
}

actual fun Container.getInsets(): Insets = Insets()

/**
 * Fallback for Component.getParent(), which is non-null in the expect declaration. A detached
 * component has no real parent, and the client only ever uses the result to call setBackground /
 * remove on it, so an empty container is a safe stand-in.
 */
internal val rootContainer: Container by lazy { Container() }
