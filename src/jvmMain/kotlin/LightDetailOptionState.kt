import java.io.IOException
import LightDetailOptionStateStatics.anInt6029
import LightDetailOptionStateStatics.anInt6031
import LightDetailOptionStateStatics.anInt6032
import LightDetailOptionStateStatics.anInt6034
import LightDetailOptionStateStatics.anIntArray6035
import LightDetailOptionStateStatics.anInt6036
import LightDetailOptionStateStatics.anInt6037

class LightDetailOptionState : GraphicsOptionState {
    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1714(i: Int, i_1_: Int): Int {
        anInt6034++
        if (i != 3) return -46
        if (this.aClass348_Sub51_3136.method3425(-62)) return 3
        if (i_1_ == 0 || this.aClass348_Sub51_3136.aClass239_Sub9_7256!!.method1759(-32350) == 1) return 1
        return 2
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) anIntArray6035 = null
        anInt6029++
        return 1
    }

    fun method1800(i: Int): Int {
        anInt6031++
        if (i != -32350) anIntArray6035 = null
        return this.anInt3138
    }

    override fun method1716(bool: Boolean) {
        anInt6036++
        if (bool == false) {
            if (this.aClass348_Sub51_3136.method3425(-94)) this.anInt3138 = 0
            if (this.anInt3138 < 0 && this.anInt3138 > 2) this.anInt3138 = method1710(20014)
        }
    }

    fun method1801(i: Int): Boolean {
        if (i <= 85) method1800(90)
        anInt6037++
        return !this.aClass348_Sub51_3136.method3425(-70)
    }

    override fun method1712(i: Int, i_3_: Int) {
        this.anInt3138 = i_3_
        anInt6032++
        val i_4_ = 65 / ((82 - i) / 35)
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)
}
