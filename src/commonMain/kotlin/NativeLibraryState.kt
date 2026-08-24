import kotlin.jvm.JvmStatic
import BlankTextureNode.Companion.method3098

/* Class9 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object NativeLibraryState {

    var anInt167: Int = 0
    var anIntArray168: IntArray? = intArrayOf(28, 35, 40, 44)

    var anInt169: Int = -1

    var anInt170: Int = 0

    var aRenderer171: Renderer? = null

    @JvmStatic
    fun method215(i: Int): Boolean {
        anInt170++
        if (i != 27165) return false
        if (!method3098(-30282, "jaclib")) return false
        return method3098(-30282, "hw3d")
    }

    @JvmStatic
    fun method216(bool: Boolean) {
        anIntArray168 = null
        if (bool != false) method216(true)
        aRenderer171 = null
    }
}
