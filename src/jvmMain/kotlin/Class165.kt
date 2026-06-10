import java.awt.Component
import java.awt.Point
import java.awt.Robot
import java.awt.image.BufferedImage

class Class165 internal constructor() {
    private val aRobot2176: Robot
    private var aComponent2177: Component? = null

    fun method1280(i: Int, i_0_: Int) {
        aRobot2176.mouseMove(i, i_0_)
    }

    fun method1281(component: Component?, bool: Boolean) {
        var component = component
        if (bool) component = null
        else if (component == null) throw NullPointerException()
        if (component !== aComponent2177) {
            if (null != aComponent2177) {
                aComponent2177!!.setCursor(null)
                aComponent2177 = null
            }
            if (null != component) {
                component.setCursor(component.getToolkit().createCustomCursor(BufferedImage(1, 1, 2), Point(0, 0), null))
                aComponent2177 = component
            }
        }
    }

    fun method1282(component: Component, `is`: IntArray?, i: Int, i_1_: Int, point: Point?) {
        if (`is` != null) {
            val bufferedimage = BufferedImage(i, i_1_, 2)
            bufferedimage.setRGB(0, 0, i, i_1_, `is`, 0, i)
            component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null))
        } else component.setCursor(null)
    }

    init {
        aRobot2176 = Robot()
    }
}
