package awt

import awt.image.ImageObserver
import kotlinx.browser.document
import org.w3c.dom.HTMLElement

actual open class Container : Component() {
    override val element: HTMLElement =
        document.createElement("div") as HTMLElement

    private val children = mutableListOf<Component>()

    actual fun add(comp: Component): Component {
        children += comp
        element.appendChild(comp.element)
        return comp
    }

    actual fun remove(comp: Component) {
        if (children.remove(comp)) element.removeChild(comp.element)
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
    actual override fun drawImage(img: Image?, x: Int, y: Int, observer: Canvas?): Boolean {
        TODO("Not yet implemented")
    }
}
