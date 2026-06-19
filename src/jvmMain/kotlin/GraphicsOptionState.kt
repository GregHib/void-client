import ChatEffectsOptionStateStatics.method1728
import GraphicsOptionStateStatics.anInt3139

/* Class239 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class GraphicsOptionState {
    var aClass348_Sub51_3136: DisplaySettingsConfig
    var anInt3138: Int
    abstract fun method1710(i: Int): Int

    abstract fun method1712(i: Int, i_2_: Int)

    abstract fun method1714(i: Int, i_3_: Int): Int

    abstract fun method1716(bool: Boolean)

    internal constructor(class348_sub51: DisplaySettingsConfig) {
        this.aClass348_Sub51_3136 = class348_sub51
        this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) {
        this.aClass348_Sub51_3136 = class348_sub51
        this.anInt3138 = i
    }

    fun method1718(i: Int, i_7_: Int) {
        if (i_7_ < 3) method1712(12, 42)
        anInt3139++
        if (method1714(3, i) != 3) method1712(124, i)
    }
}
