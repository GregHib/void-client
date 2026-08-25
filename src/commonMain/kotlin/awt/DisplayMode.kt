package awt

expect class DisplayMode(width: Int, height: Int, bitDepth: Int, refreshRate: Int) {
    fun getWidth(): Int
    fun getHeight(): Int
    fun getBitDepth(): Int
    fun getRefreshRate(): Int
}
