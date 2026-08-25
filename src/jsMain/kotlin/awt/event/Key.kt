package awt.event

actual object Key {
    actual val KEY_PRESSED: Int = 401
    actual val KEY_RELEASED: Int = 402
    actual val KEY_TYPED: Int = 400

    // Numerically identical to java.awt.event.KeyEvent.VK_* so code that only
    // compares codes behaves the same on JVM and JS. These are NOT taken from
    // the browser KeyboardEvent.keyCode table (which differs in places) -
    // they're just the AWT constants hardcoded, since there's nothing to read
    // them from on this target.
    actual val VK_UNDEFINED: Int = 0
    actual val VK_ENTER: Int = 10
    actual val VK_BACK_SPACE: Int = 8
    actual val VK_TAB: Int = 9
    actual val VK_SHIFT: Int = 16
    actual val VK_CONTROL: Int = 17
    actual val VK_ALT: Int = 18
    actual val VK_ESCAPE: Int = 27
    actual val VK_SPACE: Int = 32
    actual val VK_LEFT: Int = 37
    actual val VK_UP: Int = 38
    actual val VK_RIGHT: Int = 39
    actual val VK_DOWN: Int = 40
    actual val VK_DELETE: Int = 127
    actual val VK_HOME: Int = 36
    actual val VK_END: Int = 35
    actual val VK_PAGE_UP: Int = 33
    actual val VK_PAGE_DOWN: Int = 34

    actual val VK_0: Int = 48
    actual val VK_1: Int = 49
    actual val VK_2: Int = 50
    actual val VK_3: Int = 51
    actual val VK_4: Int = 52
    actual val VK_5: Int = 53
    actual val VK_6: Int = 54
    actual val VK_7: Int = 55
    actual val VK_8: Int = 56
    actual val VK_9: Int = 57

    actual val VK_A: Int = 65
    actual val VK_B: Int = 66
    actual val VK_C: Int = 67
    actual val VK_D: Int = 68
    actual val VK_E: Int = 69
    actual val VK_F: Int = 70
    actual val VK_G: Int = 71
    actual val VK_H: Int = 72
    actual val VK_I: Int = 73
    actual val VK_J: Int = 74
    actual val VK_K: Int = 75
    actual val VK_L: Int = 76
    actual val VK_M: Int = 77
    actual val VK_N: Int = 78
    actual val VK_O: Int = 79
    actual val VK_P: Int = 80
    actual val VK_Q: Int = 81
    actual val VK_R: Int = 82
    actual val VK_S: Int = 83
    actual val VK_T: Int = 84
    actual val VK_U: Int = 85
    actual val VK_V: Int = 86
    actual val VK_W: Int = 87
    actual val VK_X: Int = 88
    actual val VK_Y: Int = 89
    actual val VK_Z: Int = 90
}