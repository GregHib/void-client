import java.awt.Component
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener
import MouseInputTrackerStatics.anInt7426
import MouseInputTrackerStatics.anInt7427
import MouseInputTrackerStatics.anInt7428
import MouseInputTrackerStatics.anInt7429
import MouseInputTrackerStatics.anInt7430
import MouseInputTrackerStatics.anInt7431
import MouseInputTrackerStatics.anInt7433
import MouseInputTrackerStatics.anInt7434
import MouseInputTrackerStatics.anInt7435
import MouseInputTrackerStatics.anInt7436
import MouseInputTrackerStatics.anInt7437
import MouseInputTrackerStatics.anInt7438
import MouseInputTrackerStatics.anInt7439
import MouseInputTrackerStatics.anInt7440
import MouseInputTrackerStatics.anInt7443
import MouseInputTrackerStatics.anInt7445
import MouseInputTrackerStatics.anInt7447
import MouseInputTrackerStatics.anInt7449
import MouseInputTrackerStatics.anInt7452
import MouseInputTrackerStatics.anInt7455
import MouseInputTrackerStatics.anInt7457
import MouseInputTrackerStatics.method3607

class MouseInputTracker(component: Component?, bool: Boolean) : InputTracker(), MouseListener, MouseMotionListener {
    private var anInt7432 = 0
    private var aNodeDeque_7441: NodeDeque? = NodeDeque()
    private var anInt7442 = 0
    private var anInt7448 = 0
    private var aNodeDeque_7450: NodeDeque? = NodeDeque()
    private var anInt7453 = 0
    private var anInt7454 = 0
    private var anInt7456 = 0
    private val aBoolean7458: Boolean
    private var aComponent7459: Component? = null

    private fun method3603(i: Byte, component: Component?) {
        anInt7447++
        if (i >= -83) mouseExited(null)
        method3608(85)
        aComponent7459 = component
        aComponent7459!!.addMouseListener(this)
        aComponent7459!!.addMouseMotionListener(this)
    }

    @Synchronized
    override fun mouseDragged(mouseevent: MouseEvent) {
        method3605(mouseevent.getY(), (-76).toByte(), mouseevent.getX())
        anInt7427++
    }

    @Synchronized
    override fun mouseEntered(mouseevent: MouseEvent) {
        method3605(mouseevent.getY(), (-76).toByte(), mouseevent.getX())
        anInt7426++
    }

    private fun method3604(i: Int, mouseevent: MouseEvent): Int {
        anInt7436++
        val i_0_ = mouseevent.getModifiers()
        val bool = (0x10 and i_0_) != 0
        var bool_1_ = (i_0_ and 0x8) != 0
        val bool_2_ = (0x4 and i_0_) != 0
        if (bool_1_ && (bool || bool_2_)) bool_1_ = false
        if (bool && bool_2_) return 4
        if (bool) return 1
        if (bool_1_) return 2
        if (i != -6345) method3596(-12)
        if (bool_2_) return 4
        return 0
    }

    @Synchronized
    override fun mouseExited(mouseevent: MouseEvent?) {
        method3605(mouseevent!!.getY(), (-76).toByte(), mouseevent.getX())
        anInt7452++
    }

    override fun method3590(i: Byte): Boolean {
        anInt7457++
        if (i <= 112) method3606(-77, 6, -104, -59, 86)
        return (anInt7432 and 0x4) != 0
    }

    @Synchronized
    override fun method3589(i: Int) {
        if (i != 0) method3589(-46)
        anInt7432 = anInt7456
        anInt7440++
        anInt7448 = anInt7453
        anInt7442 = anInt7454
        val class262 = aNodeDeque_7441
        aNodeDeque_7441 = aNodeDeque_7450
        aNodeDeque_7450 = class262
        aNodeDeque_7450!!.method1996(i xor 0x66)
    }

    @Synchronized
    override fun mouseMoved(mouseevent: MouseEvent) {
        anInt7435++
        method3605(mouseevent.getY(), (-76).toByte(), mouseevent.getX())
    }

    private fun method3605(i: Int, i_3_: Byte, i_4_: Int) {
        anInt7445++
        anInt7454 = i_4_
        if (i_3_.toInt() != -76) anInt7429 = 51
        anInt7453 = i
        if (aBoolean7458) method3606(-1, i, i_4_, 0, -125)
    }

    override fun method3594(i: Byte): Int {
        anInt7430++
        if (i <= 69) return -123
        return anInt7448
    }

    override fun method3596(i: Int): TimedRecordAccessor? {
        if (i != 0) mouseReleased(null)
        anInt7437++
        return aNodeDeque_7441!!.method1997(i + 8) as TimedRecordAccessor?
    }

    private fun method3606(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
        anInt7439++
        val class348_sub45_sub2 = TimedRecordAccessorB()
        class348_sub45_sub2.anInt9739 = i_6_
        class348_sub45_sub2.anInt9733 = i_5_
        class348_sub45_sub2.anInt9730 = i_7_
        class348_sub45_sub2.anInt9736 = i
        class348_sub45_sub2.aLong9734 = GameClock.method599(-110)
        aNodeDeque_7450!!.method1999(class348_sub45_sub2, -20180)
        if (i_8_ >= -110) method3607(28, null, -68)
    }

    @Synchronized
    override fun mouseClicked(mouseevent: MouseEvent) {
        if (mouseevent.isPopupTrigger()) mouseevent.consume()
        anInt7438++
    }

    override fun method3592(i: Int) {
        if (i != 0) method3597(false)
        anInt7433++
        method3608(84)
    }

    override fun method3588(i: Int): Boolean {
        val i_9_ = -108 % ((-38 - i) / 48)
        anInt7434++
        return (anInt7432 and 0x2) != 0
    }

    override fun method3595(i: Int): Boolean {
        anInt7455++
        if (i >= -67) mouseExited(null)
        return (anInt7432 and 0x1) != 0
    }

    @Synchronized
    override fun mouseReleased(mouseevent: MouseEvent?) {
        anInt7428++
        var i = method3604(-6345, mouseevent!!)
        if ((i and anInt7456) == 0) i = anInt7456
        if ((i and 0x1) != 0) method3606(3, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -116)
        if ((0x4 and i) != 0) method3606(5, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -119)
        if ((0x2 and i) != 0) method3606(4, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -117)
        anInt7456 = anInt7456 and i.inv()
        if (mouseevent.isPopupTrigger()) mouseevent.consume()
    }

    private fun method3608(i: Int) {
        anInt7431++
        if (aComponent7459 != null) {
            aComponent7459!!.removeMouseMotionListener(this)
            aComponent7459!!.removeMouseListener(this)
            aComponent7459 = null
            aNodeDeque_7441 = null
            aNodeDeque_7450 = null
            anInt7432 = 0
            anInt7448 = anInt7432
            anInt7442 = anInt7448
            val i_13_ = -106 / ((-57 - i) / 46)
            anInt7456 = 0
            anInt7453 = anInt7456
            anInt7454 = anInt7453
        }
    }

    override fun method3597(bool: Boolean): Int {
        if (bool != true) anInt7453 = -101
        anInt7443++
        return anInt7442
    }

    @Synchronized
    override fun mousePressed(mouseevent: MouseEvent) {
        anInt7449++
        val i = method3604(-6345, mouseevent)
        if (i != 1) {
            if (i == 4) method3606(2, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -112)
            else if (i == 2) method3606(1, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -121)
        } else method3606(0, mouseevent.getY(), mouseevent.getX(), mouseevent.getClickCount(), -126)
        anInt7456 = anInt7456 or i
        if (mouseevent.isPopupTrigger()) mouseevent.consume()
    }

    init {
        method3603((-108).toByte(), component)
        aBoolean7458 = bool
    }
}
