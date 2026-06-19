import kotlin.math.max
import CameraOrModelTransformStatics.method2647
import CameraOrModelTransformStatics.anInt4159
import CameraOrModelTransformStatics.anInt4163

/* Class334 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CameraOrModelTransform {
    var anInt4151: Int = 0
    var anInt4154: Int = 0
    var anInt4156: Int
    var anInt4158: Int = 0
    var anInt4162: Int = 128
    var anInt4165: Int = 128

    fun method2648(cameraOrModelTransform_0_: CameraOrModelTransform, i: Byte) {
        this.anInt4158 = cameraOrModelTransform_0_.anInt4158
        this.anInt4151 = cameraOrModelTransform_0_.anInt4151
        if (i.toInt() != 118) method2647(true, '\uffe5')
        anInt4159++
        this.anInt4156 = cameraOrModelTransform_0_.anInt4156
        this.anInt4165 = cameraOrModelTransform_0_.anInt4165
        this.anInt4154 = cameraOrModelTransform_0_.anInt4154
        this.anInt4162 = cameraOrModelTransform_0_.anInt4162
    }

    fun method2649(i: Int): CameraOrModelTransform {
        anInt4163++
        return CameraOrModelTransform(this.anInt4156, this.anInt4165, this.anInt4162, this.anInt4158, this.anInt4154, this.anInt4151)
    }

    internal constructor(i: Int) {
        this.anInt4156 = i
    }

    private constructor(i: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int) {
        this.anInt4156 = i
        this.anInt4165 = i_23_
        this.anInt4154 = i_26_
        this.anInt4158 = i_25_
        this.anInt4162 = i_24_
        this.anInt4151 = i_27_
    }
}
