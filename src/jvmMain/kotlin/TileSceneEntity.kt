import CameraDistanceOptionState.Companion.method1725

/* Class318_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class TileSceneEntity internal constructor(i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) : SceneEntity() {
    @JvmField
    var aShort8727: Short
    override fun method2382(i: Byte): Boolean {
        if (i > -51) aFontMetaRef_8724 = null
        anInt8723++
        return IndexedSprite.method164(this.aByte6376.toInt(), (this.x shr Tooltip.anInt4459), (-97).toByte(), (this.y shr Tooltip.anInt4459))
    }

    override fun method2384(class348_sub1s: Array<AbstractTileShape?>?, i: Int): Int {
        anInt8722++
        val i_0_ = 88 % ((i - -14) / 61)
        return this.method2390(class348_sub1s!!, (this.x shr Tooltip.anInt4459), -2, (this.y shr Tooltip.anInt4459))
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
        if (i != 0) aFontMetaRef_8724 = null
        anInt8721++
        return (SpriteBlitter.aBooleanArrayArray1572!![(NpcActorEntity.anInt10084 + -DisplayModeOptionState.anInt6111 + (this.x shr Tooltip.anInt4459))]!![((this.y shr Tooltip.anInt4459) + -GlIndexBufferArb.anInt8502 + NpcActorEntity.anInt10084)])
    }

    companion object {
        @JvmField
        var anInt8721: Int = 0
        @JvmField
        var anInt8722: Int = 0
        @JvmField
        var anInt8723: Int = 0
        @JvmField
        var aFontMetaRef_8724: FontMetaRef? = FontMetaRef(50, -1)
        @JvmField
        var aFloat8725: Float = 0f
        @JvmField
        var anInt8726: Int = 0
        @JvmField
        var aLong8728: Long = 0

        @JvmStatic
        fun method2395(i: Byte) {
            aFontMetaRef_8724 = null
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
                MapTileShape.anInt4186 = i_2_
                MinimapAreaMarkerNode.anInt9701 = i
            }
            CameraDistanceOptionState.aFloat3938 = i_1_.toFloat()
            SceneObjectSpawner.aFloat1287 = i.toFloat()
            method1725(262144)
            WorldMapPolygonIconLabel.aBoolean10174 = true
        }
    }
}
