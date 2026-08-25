package com.ms.win32

import com.ms.dll.Callback

expect object User32 {
    fun SetWindowLong(i: Int, i_0_: Int, i_1_: Int): Int

    fun GetWindowLong(i: Int, i_2_: Int): Int

    fun CallWindowProc(
        callback: Callback?, i: Int, i_3_: Int,
        i_4_: Int, i_5_: Int
    ): Int

    fun SetCursor(i: Int): Int

    fun SetWindowLong(i: Int, i_6_: Int, callback: Callback?): Int

    fun SetCursorPos(i: Int, i_7_: Int): Boolean

    fun LoadCursor(i: Int, i_8_: Int): Int

    fun SendMessage(
        i: Int, i_9_: Int, i_10_: Int,
        `object`: Any?
    ): Int

    fun CallWindowProc(
        i: Int, i_11_: Int, i_12_: Int, i_13_: Int,
        i_14_: Int
    ): Int

    fun SetWindowLong(i: Int, i_15_: Int, `object`: Any?): Int
}