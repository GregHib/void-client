import ClientLoadStateMachine.method1277
import PerlinTextureProviderStatics.method1402
import SocketGameConnectionStatics.method1707
import DisplayModeOptionStateStatics.method1828
import ModelDataCache.method297
import CompassSmootherStatics.method2017
import IntHashSetStatics.method2368
import SceneLinkedListNodeStatics.method2375
import WorldMapIconLabelStatics.method3573
import MapSceneCacheStatics.method821
import java.awt.Component
import java.lang.reflect.Constructor
import kotlin.math.sin
import InterfaceBoundsStatics.method2941
import InterfaceBoundsStatics.anInt6807
import InterfaceBoundsStatics.anInt6816
import InterfaceBoundsStatics.anInt6817
import InterfaceBoundsStatics.anInt6821
import InterfaceBoundsStatics.anInt6822

class InterfaceBounds internal constructor(private val anInt6815: Int, private val anInt6820: Int, private var anInt6811: Int, private val anInt6806: Int, private var anInt6810: Int, @JvmField var anInt6809: Int, @JvmField var anInt6812: Int, @JvmField var anInt6819: Int, @JvmField var anInt6813: Int) : LinkedListNode() {
    fun method2934(i: Int, i_0_: Int, i_1_: Int): Boolean {
        anInt6822++
        if (i != 3589) method2941(null, 70, false)
        return i_0_ >= anInt6820 && i_0_ <= anInt6806 && i_1_ >= anInt6811 && anInt6810 >= i_1_
    }

    fun method2935(i: Int, i_2_: Int, i_3_: Int, bool: Boolean): Boolean {
        anInt6821++
        if (bool != true) anInt6811 = -84
        return i_3_ == anInt6815 && i_2_ >= anInt6820 && anInt6806 >= i_2_ && i >= anInt6811 && anInt6810 >= i
    }

    fun method2937(i: Int, i_4_: Int, i_5_: Int, `is`: IntArray) {
        anInt6816++
        `is`[0] = anInt6815
        `is`[1] = -this.anInt6809 - -anInt6820 + i
        `is`[2] = i_4_ + (-this.anInt6812 + anInt6811)
        if (i_5_ != -3069) anInt6810 = -14
    }

    fun method2939(i: Int, i_7_: Int, i_8_: Int): Boolean {
        anInt6807++
        if (i_7_ != 2) return true
        return this.anInt6809 <= i && this.anInt6819 >= i && (i_8_ >= this.anInt6812) && this.anInt6813 >= i_8_
    }

    fun method2940(i: Int, bool: Boolean, `is`: IntArray, i_9_: Int) {
        anInt6817++
        `is`[0] = 0
        `is`[2] = i + -anInt6811 + this.anInt6812
        `is`[1] = i_9_ - anInt6820 - -this.anInt6809
        if (bool != true) this.anInt6812 = -26
    }
}
