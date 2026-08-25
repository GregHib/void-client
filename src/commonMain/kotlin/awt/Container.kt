package awt

expect open class Container : Component {
    fun add(comp: Component): Component
    fun remove(comp: Component)
    fun remove(index: Int)
    fun removeAll()
    fun getComponentCount(): Int
    fun getComponent(n: Int): Component
    fun isAncestorOf(c: Component): Boolean
    fun validate()
    fun invalidate()
    fun doLayout()
}
