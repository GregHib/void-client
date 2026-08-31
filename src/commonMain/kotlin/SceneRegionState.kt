import kotlin.jvm.JvmStatic
import FogOptionState.Companion.method1791

/* Class11 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object SceneRegionState {

    var anInt193: Int = 0

    var anInt194: Int = 0

    var anInt195: Int = 0

    var aHudTabPanel_196: HudTabPanel? = null

    var anInt197: Int = 0

    @JvmStatic
    fun method221(i: Int) {
        if (i != 0) anInt197 = -100
        aHudTabPanel_196 = null
    }

    @JvmStatic
    fun method222(player: Player?, i: Int, i_0_: Byte, i_1_: Int) {
        anInt195++
        if (i_0_.toInt() != 4) anInt194 = -100
        val `is` = IntArray(4)
        ArrayCopyUtil.method1579(`is`, 0, `is`.size, i)
        method1791(23946, `is`, i_1_, player)
    }
}
