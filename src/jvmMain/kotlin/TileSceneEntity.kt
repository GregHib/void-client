import CameraDistanceOptionState.Companion.method1725

/* Class318_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class TileSceneEntity internal constructor(i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) : SceneEntity() {

    var aShort8727: Short
    override fun method2382(i: Byte): Boolean {
        if (i > -51) aOutgoingPacketHeader_8724 = null
        anInt8723++
        return ActorEntity.method164(this.aByte6376.toInt(), (this.x shr MapTileShape.anInt4459), (-97).toByte(), (this.y shr MapTileShape.anInt4459))
    }

    override fun method2384(class348_sub1s: Array<AbstractTileShape?>?, i: Int): Int {
        anInt8722++
        val i_0_ = 88 % ((i - -14) / 61)
        return this.method2390(class348_sub1s!!, (this.x shr MapTileShape.anInt4459), -2, (this.y shr MapTileShape.anInt4459))
    }

    init {
        this.aByte6376 = i_7_.toByte()
        this.x = i
        this.y = i_5_
        this.aShort8727 = i_8_.toShort()
        this.anInt6382 = i_4_
        this.plane = i_6_.toByte()
    }

    override fun method2378(i: Int): Boolean {
        if (i != 0) aOutgoingPacketHeader_8724 = null
        anInt8721++
        return (ActorEntity.aBooleanArrayArray1572!![(ActorEntity.anInt10084 + -ActorEntity.anInt6111 + (this.x shr MapTileShape.anInt4459))]!![((this.y shr MapTileShape.anInt4459) + -ActorEntity.anInt8502 + ActorEntity.anInt10084)])
    }

    companion object {

        var anInt8721: Int = 0

        var anInt8722: Int = 0

        var anInt8723: Int = 0

        var aOutgoingPacketHeader_8724: OutgoingPacketHeader? = OutgoingPacketHeader(50, -1)

        var aFloat8725: Float = 0f

        var anInt8726: Int = 0

        @JvmStatic
        fun method2395(i: Byte) {
            aOutgoingPacketHeader_8724 = null
            if (i.toInt() != 50) method2395(65.toByte())
        }

        @JvmStatic
        fun method2396(i: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            var i = i
            var i_1_ = i_1_
            var i_2_ = i_2_
            i = i shl i_3_
            anInt8726++
            i_1_ = i_1_ shl 3
            i_2_ = i_2_ shl 3
            if (WeaveTextureNode.anInt9282 == 2) {
                WorldMapElement.anInt4638 = i_1_
                MapTileShapeStatics.anInt4186 = i_2_
                MinimapAreaMarkerNode.anInt9701 = i
            }
            CameraDistanceOptionState.aFloat3938 = i_1_.toFloat()
            SceneObjectSpawner.aFloat1287 = i.toFloat()
            method1725(262144)
            WorldMapPolygonIconLabel.aBoolean10174 = true
        }
    }
}
