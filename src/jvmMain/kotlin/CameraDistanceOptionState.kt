import CameraDistanceOptionStateStatics.anInt5851
import CameraDistanceOptionStateStatics.anInt5852
import CameraDistanceOptionStateStatics.anInt5853
import CameraDistanceOptionStateStatics.anInt5854
import CameraDistanceOptionStateStatics.anInt5856
import CameraDistanceOptionStateStatics.aAbstractModelRendererArray5857

/* Class239_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class CameraDistanceOptionState : GraphicsOptionState {
    override fun method1714(i: Int, i_0_: Int): Int {
        anInt5851++
        if (i != 3) return -26
        return 3
    }

    override fun method1716(bool: Boolean) {
        anInt5854++
        this.anInt3138 = method1710(20014)
        if (bool != false) aAbstractModelRendererArray5857 = null
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) method1716(true)
        anInt5853++
        if (!this.aClass348_Sub51_3136.method3425(-76)) return 0
        return 1
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1712(i: Int, i_13_: Int) {
        val i_14_ = 87 / ((82 - i) / 35)
        this.anInt3138 = i_13_
        anInt5852++
    }

    fun method1726(i: Int): Int {
        anInt5856++
        if (i != -32350) aAbstractModelRendererArray5857 = null
        return this.anInt3138
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)
}
