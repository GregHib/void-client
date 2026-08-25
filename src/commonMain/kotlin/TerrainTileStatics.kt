import kotlin.jvm.JvmStatic
import awt.Canvas

object TerrainTileStatics {

    var aJs5Archive_4585: Js5Archive? = null

    var anInt4586: Int = 0

    var anInt4591: Int = 0

    @JvmStatic
    fun method3980(i: Int, canvas: Canvas) {
        if (i > 85) {
            anInt4586++
            MinimapFlagRenderer.method828(38.toByte(), canvas.getHeight(), canvas.getWidth())
            if (WhirlpoolHash.anInt7207 != 1) CameraRotationStub.aRenderer326!!.method3669(canvas, WhirlpoolHash.anInt5283, WhirlpoolHash.anInt1651)
            else CameraRotationStub.aRenderer326!!.method3669(canvas, WhirlpoolHash.anInt8854, WhirlpoolHash.anInt6008)
        }
    }

    @JvmStatic
    fun method3985(i: Int, i_29_: Int): HintArrowOrMessage? {
        anInt4591++
        if (i_29_ < 0 || i_29_ >= 100) return null
        return SceneModelBuilder.aHintArrowOrMessageArray6400s!![i_29_]
    }

    @JvmStatic
    fun method3988(i: Int) {
        val i_56_ = 49 / ((15 - i) / 40)
        aJs5Archive_4585 = null
    }
}