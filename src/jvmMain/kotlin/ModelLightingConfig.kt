import TextureQualityOptionStateStatics.method1782
import java.awt.Rectangle
import ModelLightingConfigStatics.anInt2543
import ModelLightingConfigStatics.anInt2553

/*
 * Class190
 */
class ModelLightingConfig {
    var anInt2535: Int = 0
    var aFloat2536: Float = 0f
    var anInt2538: Int = 0
    var anInt2540: Int = 0
    var aCircleRasterizer_2541: CircleRasterizer? = null
    var aFloat2542: Float = 0.25f
    var aFloat2544: Float = 0f
    var aFloat2545: Float = 1.0f
    var anInt2546: Int = 0
    var aFloat2547: Float = 0f
    var anInt2548: Int = 0
    var anInt2549: Int = 0
    var aFloat2551: Float = 1.0f
    fun method1423(i: Int, class348_sub49: ByteBuffer) {
        anInt2553++
        this.aFloat2545 = (class348_sub49.readUnsignedByte(255) * 8).toFloat() / 255.0f
        this.aFloat2542 = (8 * class348_sub49.readUnsignedByte(i + 247)).toFloat() / 255.0f
        this.aFloat2551 = (i * class348_sub49.readUnsignedByte(i + 247)).toFloat() / 255.0f
    }

    fun method1424(modelLightingConfig_4_: ModelLightingConfig, i: Byte): Boolean {
        anInt2543++
        if (i.toInt() != 84) return false
        return (this.anInt2540 == modelLightingConfig_4_.anInt2540) && (this.aFloat2547 == modelLightingConfig_4_.aFloat2547) && (modelLightingConfig_4_.aFloat2544 == this.aFloat2544) && (this.aFloat2536 == modelLightingConfig_4_.aFloat2536) && (modelLightingConfig_4_.aFloat2542 == this.aFloat2542) && (modelLightingConfig_4_.aFloat2545 == this.aFloat2545) && (modelLightingConfig_4_.aFloat2551 == this.aFloat2551) && (modelLightingConfig_4_.anInt2549 == this.anInt2549) && (modelLightingConfig_4_.anInt2546 == this.anInt2546) && (modelLightingConfig_4_.aCircleRasterizer_2541 === this.aCircleRasterizer_2541)
    }

    constructor() {
        this.anInt2535 = -50
        this.aFloat2536 = 1.2f
        this.aCircleRasterizer_2541 = ParameterizedTextStatics.aCircleRasterizer_9571
        this.anInt2546 = 0
        this.anInt2549 = LocDefinitionCacheStatics.anInt3444
        this.anInt2548 = -60
        this.anInt2538 = -50
        this.aFloat2544 = 0.69921875f
        this.anInt2540 = LocDefinitionCacheStatics.anInt3439
        this.aFloat2547 = 1.1523438f
    }

    internal constructor(class348_sub49: ByteBuffer) {
        val i = class348_sub49.readUnsignedByte(255)
        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub28_7230!!.method1845(-32350) != 1 || LruByteCacheStatics.aRenderer1098!!.method3704() <= 0) {
            if ((0x1 and i) != 0) class348_sub49.readInt((-126).toByte())
            if ((0x2 and i) != 0) class348_sub49.readUnsignedShort(842397944)
            if ((i and 0x4) != 0) class348_sub49.readUnsignedShort(842397944)
            if ((0x8 and i) != 0) class348_sub49.readUnsignedShort(842397944)
            this.anInt2540 = LocDefinitionCacheStatics.anInt3439
            this.aFloat2547 = 1.1523438f
            this.aFloat2544 = 0.69921875f
            this.aFloat2536 = 1.2f
        } else {
            if ((i and 0x1) != 0) this.anInt2540 = class348_sub49.readInt((-126).toByte())
            else this.anInt2540 = LocDefinitionCacheStatics.anInt3439
            if ((0x2 and i) != 0) this.aFloat2547 = class348_sub49.readUnsignedShort(842397944).toFloat() / 256.0f
            else this.aFloat2547 = 1.1523438f
            if ((i and 0x4) == 0) this.aFloat2544 = 0.69921875f
            else this.aFloat2544 = class348_sub49.readUnsignedShort(842397944).toFloat() / 256.0f
            if ((0x8 and i) != 0) this.aFloat2536 = class348_sub49.readUnsignedShort(842397944).toFloat() / 256.0f
            else this.aFloat2536 = 1.2f
        }
        if ((i and 0x10) == 0) {
            this.anInt2548 = -60
            this.anInt2535 = -50
            this.anInt2538 = -50
        } else {
            this.anInt2538 = class348_sub49.readShort(13638)
            this.anInt2548 = class348_sub49.readShort(13638)
            this.anInt2535 = class348_sub49.readShort(13638)
        }
        if ((0x20 and i) == 0) this.anInt2549 = LocDefinitionCacheStatics.anInt3444
        else this.anInt2549 = class348_sub49.readInt((-126).toByte())
        if ((i and 0x40) != 0) this.anInt2546 = class348_sub49.readUnsignedShort(842397944)
        else this.anInt2546 = 0
        if ((0x80 and i) != 0) {
            val i_27_ = class348_sub49.readUnsignedShort(842397944)
            val i_28_ = class348_sub49.readUnsignedShort(842397944)
            val i_29_ = class348_sub49.readUnsignedShort(842397944)
            val i_30_ = class348_sub49.readUnsignedShort(842397944)
            val i_31_ = class348_sub49.readUnsignedShort(842397944)
            val i_32_ = class348_sub49.readUnsignedShort(842397944)
            this.aCircleRasterizer_2541 = SceneProjectorStatics.method1636(i_31_, i_30_, i_27_, i_32_, i_28_, -1, i_29_)
        } else this.aCircleRasterizer_2541 = ParameterizedTextStatics.aCircleRasterizer_9571
    }
}
