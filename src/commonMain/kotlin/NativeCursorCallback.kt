import com.ms.dll.Callback
import com.ms.dll.Root.alloc
import com.ms.win32.User32
import com.ms.win32.User32.CallWindowProc
import com.ms.win32.User32.GetWindowLong
import com.ms.win32.User32.LoadCursor
import com.ms.win32.User32.SendMessage
import com.ms.win32.User32.SetCursor
import com.ms.win32.User32.SetCursorPos
import com.ms.win32.User32.SetWindowLong
import java.awt.Component
import kotlin.concurrent.Volatile

/*
 * Callback_Sub1
 */
class NativeCursorCallback : Callback() {
    @Volatile
    private var aBoolean7460 = true

    @Volatile
    private var anInt7461 = 0
    private var anInt7462 = 0

    @Volatile
    private var anInt7463 = 0
    private var aBoolean7464 = false

    fun method3621(i: Int, i_0_: Byte, i_1_: Int) {
        if (i_0_ >= 65) SetCursorPos(i, i_1_)
    }

    fun getTopHwnd(component: Component): Long? {
        try {
            val peerField = Component::class.java.getDeclaredField("peer")
            peerField.isAccessible = true
            val peer = peerField.get(component) ?: return null
            val hwndMethod = peer.javaClass.getMethod("getTopHwnd")
            return hwndMethod.invoke(peer) as? Long
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }

    fun method3622(bool: Boolean, i: Int, component: Component) {
        val i_2_ = getTopHwnd(component)!!.toInt()
        if (i_2_ != anInt7461 || !bool == aBoolean7460) {
            if (!aBoolean7464) {
                anInt7462 = LoadCursor(0, 32512)
                alloc(this)
                aBoolean7464 = true
            }
            if (anInt7461 != i_2_) {
                if (anInt7461 != 0) {
                    aBoolean7460 = true
                    SendMessage(i_2_, 101024, 0, 0)
                    withLock(this) {
                        User32.SetWindowLong(anInt7461, -4, anInt7463)
                    }
                }
                withLock(this) {
                    anInt7461 = i_2_
                    anInt7463 = SetWindowLong(anInt7461, -4, this as Any)
                }
            }
            aBoolean7460 = bool
            SendMessage(i_2_, 101024, 0, 0)
        }
    }

    @Synchronized
    fun method3623(i: Int, i_3_: Int, i_4_: Int, i_5_: Int): Int {
        if (i != anInt7461) {
            val i_6_ = GetWindowLong(i, -4)
            return CallWindowProc(i_6_, i, i_3_, i_4_, i_5_)
        }
        if (i_3_ == 32) {
            val i_7_ = 0xffff and i_5_
            if (i_7_ == 1) {
                SetCursor(if (aBoolean7460) anInt7462 else 0)
                return 0
            }
        }
        if (i_3_ == 101024) {
            SetCursor(if (!aBoolean7460) 0 else anInt7462)
            return 0
        }
        if (i_3_ == 1) {
            anInt7461 = 0
            aBoolean7460 = true
        }
        return CallWindowProc(anInt7463, i, i_3_, i_4_, i_5_)
    }
}
