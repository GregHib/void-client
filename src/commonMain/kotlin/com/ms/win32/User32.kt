package com.ms.win32

import com.ms.dll.Callback

object User32 {
    @JvmStatic
    external fun SetWindowLong(i: Int, i_0_: Int, i_1_: Int): Int

    @JvmStatic
    external fun GetWindowLong(i: Int, i_2_: Int): Int

    external fun CallWindowProc(
        callback: Callback?, i: Int, i_3_: Int,
        i_4_: Int, i_5_: Int
    ): Int

    @JvmStatic
    external fun SetCursor(i: Int): Int

    fun SetWindowLong(i: Int, i_6_: Int, callback: Callback?): Int {
        return 0
    }

    @JvmStatic
    external fun SetCursorPos(i: Int, i_7_: Int): Boolean

    @JvmStatic
    external fun LoadCursor(i: Int, i_8_: Int): Int

    @JvmStatic
    external fun SendMessage(
        i: Int, i_9_: Int, i_10_: Int,
        `object`: Any?
    ): Int

    @JvmStatic
    fun CallWindowProc(
        i: Int, i_11_: Int, i_12_: Int, i_13_: Int,
        i_14_: Int
    ): Int {
        return 0
    }

    @JvmStatic
    fun SetWindowLong(i: Int, i_15_: Int, `object`: Any?): Int {
        return 0
    }
}
