import java.awt.Component
import java.awt.event.*

class Class373_Sub1(component: Component?, bool: Boolean) : Class373(), MouseListener, MouseMotionListener, MouseWheelListener {
    private var anInt7416 = 0
    private var anInt7417 = 0
    private var aClass262_7418: Class262? = Class262()
    private var anInt7419 = 0
    private var aClass262_7420: Class262? = Class262()
    private var anInt7421 = 0
    private var anInt7422 = 0
    private var anInt7423 = 0
    private val aBoolean7424: Boolean
    private var aComponent7425: Component? = null

    override fun method3588(i: Int): Boolean {
        val i_0_ = -59 % ((i - -38) / 48)
        return (anInt7419 and 0x2) != 0
    }

    private fun method3598(i: Int, i_1_: Int, i_2_: Int, i_3_: Int, bool: Boolean) {
        val class348_sub45_sub1 = Class348_Sub45_Sub1()
        class348_sub45_sub1.anInt9725 = i_3_
        class348_sub45_sub1.anInt9728 = i_1_
        class348_sub45_sub1.anInt9729 = i
        class348_sub45_sub1.aLong9726 = Class62.method599(-115)
        class348_sub45_sub1.anInt9727 = i_2_
        if (bool) mouseDragged(null)
        aClass262_7420!!.method1999(class348_sub45_sub1, -20180)
    }

    @Synchronized
    override fun mouseReleased(mouseevent: MouseEvent?) {
        var i = method3600(mouseevent, -75)
        if ((i and anInt7422) == 0) i = anInt7422
        if (0 != (0x1 and i)) method3598(mouseevent!!.getX(), 3, mouseevent.getClickCount(), mouseevent.getY(), false)
        if ((i and 0x4) != 0) method3598(mouseevent!!.getX(), 5, mouseevent.getClickCount(), mouseevent.getY(), false)
        if ((0x2 and i) != 0) method3598(mouseevent!!.getX(), 4, mouseevent.getClickCount(), mouseevent.getY(), false)
        anInt7422 = anInt7422 and i.inv()
        if (mouseevent!!.isPopupTrigger()) mouseevent.consume()
    }

    override fun method3594(i: Byte): Int {
        if (i < 69) method3598(92, 34, 59, 2, false)
        return anInt7416
    }

    private fun method3599(i: Int, i_4_: Int, i_5_: Int) {
        if (i_4_ == -1) {
            anInt7421 = i_5_
            anInt7423 = i
            if (aBoolean7424) method3598(i, -1, 0, i_5_, false)
        }
    }

    override fun method3590(i: Byte): Boolean {
        if (i <= 112) return false
        return (anInt7419 and 0x4) != 0
    }

    @Synchronized
    override fun mousePressed(mouseevent: MouseEvent) {
        val i = method3600(mouseevent, -90)
        if (1 == i) method3598(mouseevent.getX(), 0, mouseevent.getClickCount(), mouseevent.getY(), false)
        else if (i == 4) method3598(mouseevent.getX(), 2, mouseevent.getClickCount(), mouseevent.getY(), false)
        else if (i == 2) method3598(mouseevent.getX(), 1, mouseevent.getClickCount(), mouseevent.getY(), false)
        anInt7422 = anInt7422 or i
        if (mouseevent.isPopupTrigger()) mouseevent.consume()
    }

    override fun method3597(bool: Boolean): Int {
        if (bool != true) return 27
        return anInt7417
    }

    private fun method3600(mouseevent: MouseEvent?, i: Int): Int {
        if (mouseevent!!.getButton() == 1) {
            if (mouseevent.isMetaDown()) return 4
            return 1
        }
        if (mouseevent.getButton() == 2) return 2
        val i_6_ = -27 % ((57 - i) / 63)
        if (mouseevent.getButton() == 3) return 4
        return 0
    }

    @Synchronized
    override fun mouseEntered(mouseevent: MouseEvent) {
        method3599(mouseevent.getX(), -1, mouseevent.getY())
    }

    @Synchronized
    override fun mouseClicked(mouseevent: MouseEvent) {
        if (mouseevent.isPopupTrigger()) mouseevent.consume()
    }

    override fun method3595(i: Int): Boolean {
        if (i >= -67) mouseMoved(null)
        return (anInt7419 and 0x1) != 0
    }

    override fun method3596(i: Int): Class348_Sub45? {
        if (i != 0) mouseReleased(null)
        return aClass262_7418!!.method1997(8) as Class348_Sub45?
    }

    @Synchronized
    override fun mouseMoved(mouseevent: MouseEvent?) {
        method3599(mouseevent!!.getX(), -1, mouseevent.getY())
    }

    private fun method3601(i: Int) {
        if (null != aComponent7425) {
            val i_7_ = 11 % ((i - -21) / 55)
            aComponent7425!!.removeMouseWheelListener(this)
            aComponent7425!!.removeMouseMotionListener(this)
            aComponent7425!!.removeMouseListener(this)
            aComponent7425 = null
            anInt7422 = 0
            anInt7421 = anInt7422
            anInt7423 = anInt7421
            anInt7419 = 0
            anInt7416 = anInt7419
            anInt7417 = anInt7416
            aClass262_7418 = null
            aClass262_7420 = null
        }
    }

    @Synchronized
    override fun method3589(i: Int) {
        anInt7416 = anInt7421
        anInt7417 = anInt7423
        anInt7419 = anInt7422
        if (i == 0) {
            val class262 = aClass262_7418
            aClass262_7418 = aClass262_7420
            aClass262_7420 = class262
            aClass262_7420!!.method1996(127)
        }
    }

    @Synchronized
    override fun mouseWheelMoved(mousewheelevent: MouseWheelEvent) {
        val i = mousewheelevent.getX()
        val i_8_ = mousewheelevent.getY()
        val i_9_ = mousewheelevent.getWheelRotation()
        method3598(i, 6, i_9_, i_8_, false)
        mousewheelevent.consume()
    }

    @Synchronized
    override fun mouseExited(mouseevent: MouseEvent) {
        method3599(mouseevent.getX(), -1, mouseevent.getY())
    }

    @Synchronized
    override fun mouseDragged(mouseevent: MouseEvent?) {
        method3599(mouseevent!!.getX(), -1, mouseevent.getY())
    }

    override fun method3592(i: Int) {
        if (i == 0) method3601(46)
    }

    private fun method3602(i: Int, component: Component?) {
        method3601(i xor 0x6e)
        aComponent7425 = component
        if (i != 0) aComponent7425 = null
        aComponent7425!!.addMouseListener(this)
        aComponent7425!!.addMouseMotionListener(this)
        aComponent7425!!.addMouseWheelListener(this)
    }

    init {
        method3602(0, component)
        aBoolean7424 = bool
    }
}
