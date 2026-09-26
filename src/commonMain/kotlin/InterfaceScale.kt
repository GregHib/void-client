/**
 * Integer interface scaling (the `uiscale` console command). The browser client lays interfaces out
 * and draws them [scale] times larger while the 3D scene still renders at full resolution; the JVM
 * client does not support it.
 *
 * Returns the message to print to the console.
 */
expect fun setInterfaceScale(scale: Int): String

/** The current interface scale, 1 where scaling is unsupported. */
expect fun getInterfaceScale(): Int
