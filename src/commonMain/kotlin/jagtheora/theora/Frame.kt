package jagtheora.theora

import jagtheora.misc.SimplePeer
import kotlin.jvm.JvmField

expect class Frame(a: Int, b: Int) : SimplePeer {

    val a: Int
    val b: Int
    val pixels: IntArray

    override fun clear()

    companion object {
        /*protected*/ fun init()
    }
}
