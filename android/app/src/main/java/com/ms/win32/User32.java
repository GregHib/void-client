package com.ms.win32;

public class User32 {
    public static int GetWindowLong(int hwnd, int nIndex) {
        return 0;
    }

    public static int SetWindowLong(int hwnd, int nIndex, int dwNewLong) {
        return 0;
    }

    public static int SetWindowLong(int hwnd, int nIndex, Object proc) {
        return 0;
    }

    public static boolean SetWindowPos(int hwnd, int hwndInsertAfter, int x, int y, int cx, int cy, int flags) {
        return true;
    }

    public static int ShowWindow(int hwnd, int nCmdShow) {
        return 0;
    }

    public static void SetCursorPos(int x, int y) {
    }

    public static int LoadCursor(int instance, int cursor) {
        return 0;
    }

    public static int SendMessage(int hwnd, int msg, int wParam, int lParam) {
        return 0;
    }

    public static int SetCursor(int cursor) {
        return 0;
    }

    public static int CallWindowProc(int prev, int hwnd, int msg, int wParam, int lParam) {
        return 0;
    }
}
