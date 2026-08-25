package jagtheora.theora

import jagtheora.misc.SimplePeer
import kotlin.jvm.JvmField

expect class Frame(@JvmField val a: Int, @JvmField val b: Int) : SimplePeer {

    val pixels: IntArray

    override fun clear()
}
