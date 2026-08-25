package direct

import com.ms.com.IUnknown
import com.ms.directX.DDSurfaceDesc
import com.ms.directX.DirectDraw
import com.ms.directX.IEnumModesCallback
import com.ms.win32.User32
import awt.Component
import awt.Frame

/*
 * Class134
 */
class DirectDrawDisplayMode : IEnumModesCallback {
    private val aDirectDraw4607 = DirectDraw()
    fun method1144(ddsurfacedesc: DDSurfaceDesc, iunknown: IUnknown?) {
        if (anIntArray4606 == null) anInt4608 += 4
        else {
            anIntArray4606!![anInt4608++] = ddsurfacedesc.width
            anIntArray4606!![anInt4608++] = ddsurfacedesc.height
            anIntArray4606!![anInt4608++] = ddsurfacedesc.rgbBitCount
            anIntArray4606!![anInt4608++] = ddsurfacedesc.refreshRate
        }
    }

    fun method1145(bool: Boolean): IntArray? {
        aDirectDraw4607.enumDisplayModes(0, null, null, this)
        anIntArray4606 = IntArray(anInt4608)
        anInt4608 = 0
        aDirectDraw4607.enumDisplayModes(0, null, null, this)
        if (bool != true) anInt4608 = 52
        val `is`: IntArray? = anIntArray4606
        anIntArray4606 = null
        anInt4608 = 0
        return `is`
    }

    fun getHwnd(component: Component): Long? {
        try {
            val peerField = Component::class.java.getDeclaredField("peer")
            peerField.isAccessible = true
            val peer = peerField.get(component) ?: return null
            val hwndMethod = peer.javaClass.getMethod("getHwnd")
            return hwndMethod.invoke(peer) as? Long
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }

    fun method1146(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, frame: Frame) {
        frame.setVisible(true)
        val i_4_ = getHwnd(frame)!!.toInt()
        User32.SetWindowLong(i_4_, -16, -2147483648)
        User32.SetWindowLong(i_4_, -20, 8)
        aDirectDraw4607.setCooperativeLevel(frame as Component, 17)
        aDirectDraw4607.setDisplayMode(i_1_, i, i_0_, i_3_, 0)
        frame.setBounds(0, 0, i_1_, i)
        frame.toFront()
        frame.requestFocus()
        val i_5_ = -104 / ((32 - i_2_) / 39)
    }

    fun method1147(frame: Frame?, i: Int) {
        aDirectDraw4607.restoreDisplayMode()
        aDirectDraw4607.setCooperativeLevel(frame as Component?, i)
    }

    init {
        aDirectDraw4607.initialize(null)
    }

    companion object {
        private var anIntArray4606: IntArray? = null
        private var anInt4608 = 0
    }
}
