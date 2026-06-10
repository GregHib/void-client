import java.awt.DisplayMode
import java.awt.Frame
import java.awt.GraphicsDevice
import java.awt.GraphicsEnvironment
import kotlin.math.abs

class Class7 {
    private var aGraphicsDevice157: GraphicsDevice?
    private var aDisplayMode158: DisplayMode? = null

    fun method209(frame: Frame, i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
        var i_2_ = i_2_
        aDisplayMode158 = aGraphicsDevice157!!.getDisplayMode()
        if (aDisplayMode158 == null) throw NullPointerException()
        frame.setUndecorated(true)
        frame.enableInputMethods(false)
        method212(frame, 51.toByte())
        if (0 == i_2_) {
            val i_3_ = aDisplayMode158!!.getRefreshRate()
            val displaymodes = aGraphicsDevice157!!.getDisplayModes()
            var bool = false
            for (i_4_ in displaymodes.indices) {
                if (i == displaymodes[i_4_]!!.getWidth() && i_0_ == displaymodes[i_4_]!!.getHeight() && displaymodes[i_4_]!!.getBitDepth() == i_1_) {
                    val i_5_ = displaymodes[i_4_]!!.getRefreshRate()
                    if (!bool || abs(-i_3_ + i_5_) < abs(i_2_ + -i_3_)) {
                        bool = true
                        i_2_ = i_5_
                    }
                }
            }
            if (!bool) i_2_ = i_3_
        }
        aGraphicsDevice157!!.setDisplayMode(DisplayMode(i, i_0_, i_1_, i_2_))
    }

    fun method210(): IntArray {
        val displaymodes = aGraphicsDevice157!!.getDisplayModes()
        val `is` = IntArray(displaymodes.size shl 2)
        for (i in displaymodes.indices) {
            `is`[i shl 2] = displaymodes[i]!!.getWidth()
            `is`[1 + (i shl 2)] = displaymodes[i]!!.getHeight()
            `is`[(i shl 2) + 2] = displaymodes[i]!!.getBitDepth()
            `is`[(i shl 2) + 3] = displaymodes[i]!!.getRefreshRate()
        }
        return `is`
    }

    fun method211() {
        if (aDisplayMode158 != null) {
            aGraphicsDevice157!!.setDisplayMode(aDisplayMode158)
            if (!aGraphicsDevice157!!.getDisplayMode().equals(aDisplayMode158)) throw RuntimeException("Did not return to correct resolution!")
            aDisplayMode158 = null
        }
        method212(null, 104.toByte())
    }

    init {
        val graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment()
        aGraphicsDevice157 = graphicsenvironment.getDefaultScreenDevice()
        if (!aGraphicsDevice157!!.isFullScreenSupported()) {
            val graphicsdevices = graphicsenvironment.getScreenDevices()
            val graphicsdevices_6_ = graphicsdevices
            var i = 0
            while (graphicsdevices_6_.size > i) {
                val graphicsdevice = graphicsdevices_6_[i]
                if (null != graphicsdevice && graphicsdevice.isFullScreenSupported()) {
                    aGraphicsDevice157 = graphicsdevice
                    break
                }
                i++
            }
            throw Exception()
        }
    }

    private fun method212(frame: Frame?, i: Byte) {
        var bool = false
        if (i <= 47) method212(null, (-25).toByte())
        try {
            val field = GraphicsDevice::class.java.getDeclaredField("valid")
            field.setAccessible(true)
            val bool_7_ = (field.get(aGraphicsDevice157) as Boolean)
            if (bool_7_) {
                field.set(aGraphicsDevice157, java.lang.Boolean.FALSE)
                bool = true
            }
        } catch (throwable: Throwable) {
            if (Loader.trace) {
                throwable.printStackTrace()
            }
            /* empty */
        }
        try {
            aGraphicsDevice157!!.setFullScreenWindow(frame)
        } catch (`object`: Throwable) {
            if (bool) {
                try {
                    val field = GraphicsDevice::class.java.getDeclaredField("valid")
                    field.set(aGraphicsDevice157, java.lang.Boolean.TRUE)
                } catch (e: Exception) {
                    if (Loader.trace) {
                        e.printStackTrace()
                    }
                }
            }
        }
        if (bool) {
            try {
                val field = GraphicsDevice::class.java.getDeclaredField("valid")
                field.set(aGraphicsDevice157, java.lang.Boolean.TRUE)
            } catch (throwable: Throwable) {
                if (Loader.trace) {
                    throwable.printStackTrace()
                }
                /* empty */
            }
        }
    }
}
