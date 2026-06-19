import SoundBankPatchStatics.method2929
import SceneCollisionEntryStatics.method3486
import SceneCollisionEntryStatics.anInt4393

/* Class357 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SceneCollisionEntry internal constructor(i: Int) {
    var aClass318_Sub1_Sub5_4395: WallEntity? = null
    var aWidgetNodeLink_4396: WidgetNodeLink? = null
    var aShort4397: Short = 0
    var aShort4398: Short = 0
    var aByte4399: Byte
    var aSceneCollisionEntry_4400: SceneCollisionEntry? = null
    var aShort4401: Short = 0
    @JvmField
    var aClass318_Sub1_Sub1_4402: TileSceneEntity? = null
    var aClass318_Sub1_Sub4_4403: ActorEntity? = null
    var aClass318_Sub1_Sub4_4406: ActorEntity? = null
    var aClass318_Sub1_Sub5_4407: WallEntity? = null
    var aClass318_Sub1_Sub2_4408: SceneObjectEntity? = null
    var aShort4409: Short = 0
    fun method3485(bool: Boolean) {
        var widgetNodeLink: WidgetNodeLink?
        while ( /**/this.aWidgetNodeLink_4396 != null) {
            widgetNodeLink = this.aWidgetNodeLink_4396!!.aWidgetNodeLink_2038
            this.aWidgetNodeLink_4396!!.method1199((-106).toByte())
            this.aWidgetNodeLink_4396 = widgetNodeLink
        }
        anInt4393++
        if (bool != true) method3486(41, false, -64, 33L, -50)
    }

    init {
        this.aByte4399 = i.toByte()
    }
}
