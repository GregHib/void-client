import SoftwareSpriteRasterStatics.method958
import GameClock.method599
import java.awt.Canvas
import ViewportTransformStatics.anInt3664

/*
 * Class284
 */
class ViewportTransform {
    @JvmField
    var anInt3666: Int = 0
    @JvmField
    var anInt3667: Int = 0
    @JvmField
    var anInt3668: Int = 0
    @JvmField
    var anInt3669: Int = 0
    @JvmField
    var anInt3670: Int = 0
    @JvmField
    var anInt3671: Int = 0
    @JvmField
    var anInt3672: Int = 0
    @JvmField
    var anInt3673: Int = 0
    @JvmField
    var anInt3675: Int = 0
    @JvmField
    var anInt3678: Int = 0
    @JvmField
    var anInt3679: Int = 0
    @JvmField
    var anInt3680: Int = 0

    fun method2115(viewportTransform_0_: ViewportTransform, bool: Boolean): Boolean {
        if (bool != true) return true
        anInt3664++
        return viewportTransform_0_.anInt3673 == this.anInt3673 && (this.anInt3667 == viewportTransform_0_.anInt3667) && (this.anInt3671 == viewportTransform_0_.anInt3671)
    }
}
