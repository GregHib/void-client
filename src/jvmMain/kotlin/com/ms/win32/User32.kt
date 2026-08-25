package com.ms.win32

import com.ms.dll.Callback
import kotlin.jvm.JvmStatic

actual object User32 {
    @JvmStatic
    actual external fun SetWindowLong(i: Int, i_0_: Int, i_1_: Int): Int

    @JvmStatic
    actual external fun GetWindowLong(i: Int, i_2_: Int): Int

    actual external fun CallWindowProc(
        callback: Callback?, i: Int, i_3_: Int,
        i_4_: Int, i_5_: Int
    ): Int

    @JvmStatic
    actual external fun SetCursor(i: Int): Int

    actual fun SetWindowLong(i: Int, i_6_: Int, callback: Callback?): Int {
        return 0
    }

    @JvmStatic
    actual external fun SetCursorPos(i: Int, i_7_: Int): Boolean

    @JvmStatic
    actual external fun LoadCursor(i: Int, i_8_: Int): Int

    @JvmStatic
    actual external fun SendMessage(
        i: Int, i_9_: Int, i_10_: Int,
        `object`: Any?
    ): Int

    @JvmStatic
    actual fun CallWindowProc(
        i: Int, i_11_: Int, i_12_: Int, i_13_: Int,
        i_14_: Int
    ): Int {
        return 0
    }

    @JvmStatic
    actual fun SetWindowLong(i: Int, i_15_: Int, `object`: Any?): Int {
        return 0
    }
}
