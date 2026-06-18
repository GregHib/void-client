import GraphicsOptionState.Companion.method1713

/* Class348_Sub42_Sub8 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class CacheEntryReference internal constructor(@JvmField var anInt9545: Int) : HashLinkedListNode() {
    abstract fun method3193(i: Int): Any?

    abstract fun method3195(i: Int): Boolean

    companion object {
        @JvmField
        var anInt9546: Int = 0
        @JvmField
        var anInt9547: Int = 0
        @JvmField
        var anInt9548: Int = 0
        @JvmField
        var anInt9549: Int = 0
        @JvmField
        var aIntRange_9550: IntRange? = IntRange(109, 7)
        @JvmField
        var anInt9551: Int = 0
        @JvmField
        var aIntRange_9552: IntRange? = IntRange(72, 0)
        @JvmField
        var aFontMetaRef_9553: FontMetaRef? = FontMetaRef(36, 7)
        @JvmField
        var aString9554: String? = null
        @JvmField
        var aShort9555: Short = 1

        @JvmStatic
        fun method3194(i: Int, i_0_: Int, i_1_: Byte): Boolean {
            anInt9551++
            if (i_1_ <= 118) method3196(122, -41)
            return false
        }

        @JvmStatic
        fun method3196(i: Int, i_2_: Int): Boolean {
            if (i_2_ >= -39) return false
            anInt9546++
            return i == 3 || i == 4 || i == 5 || i == 6
        }

        @JvmStatic
        fun method3197(i: Int, i_3_: Byte): Boolean {
            anInt9549++
            if (i_3_.toInt() != 56) aIntRange_9552 = null
            return i == 7 || i == 9
        }

        @JvmStatic
        fun method3198(bool: Boolean, i: Byte) {
            anInt9547++
            if (i.toInt() != -45) aShort9555 = (-74).toShort()
            if (bool) {
                if (RenderNode.anInt9721 != -1) GlTextureBase.method235(RenderNode.anInt9721, (-113).toByte())
                var class348_sub41 = MinimapSpriteRenderer.aHashtable_4915!!.method3484(0) as RegionSceneShifter?
                while (class348_sub41 != null) {
                    if (!class348_sub41.method2712(4.toByte())) {
                        class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3484(i.toInt() xor 0x2c.inv()) as RegionSceneShifter?)
                        if (class348_sub41 == null) break
                    }
                    ScrollingWidgetComponentNode.method1118(true, false, class348_sub41, 2533)
                    class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3482(0) as RegionSceneShifter?)
                }
                RenderNode.anInt9721 = -1
                MinimapSpriteRenderer.aHashtable_4915 = Hashtable(8)
                Class99.method882(11.toByte())
                RenderNode.anInt9721 = GlBufferObject.anInt4737
                method1713(false, 520)
                TextureCache.method3466(100)
                Class66.method703(RenderNode.anInt9721)
            }
            ProjectileFactory.aBoolean2895 = false
            TextureGenerator.aString2496 = ""
            Class64_Sub3.aString5600 = TextureGenerator.aString2496
            RenderableGroup.method1448(-56)
            Tooltip.anInt4458 = -1
            CacheArchiveIndexLoader.method338(i + 45, StreamingResourceRequest.anInt10447)
            LocalPlayerState.aPlayer_1907 = Player()
            LocalPlayerState.aPlayer_1907!!.x = 512 * Class367_Sub4.anInt7319 / 2
            LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0] = Class367_Sub4.anInt7319 / 2
            LocalPlayerState.aPlayer_1907!!.y = 512 * RangeThresholdTextureNode.anInt9109 / 2
            LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0] = RangeThresholdTextureNode.anInt9109 / 2
            Class59_Sub2_Sub2.anInt8685 = 0
            GlslMaterialPass.anInt6246 = Class59_Sub2_Sub2.anInt8685
            if (WeaveTextureNode.anInt9282 == 2) {
                GlslMaterialPass.anInt6246 = IntKeyNode.anInt6981 shl 9
                Class59_Sub2_Sub2.anInt8685 = CollisionMapAccessor.anInt3550 shl 9
            } else CameraSplineNode.method2954(62.toByte())
            Class76.method773(true)
        }

        @JvmStatic
        fun method3199(i: Int) {
            aIntRange_9550 = null
            if (i < 17) method3196(60, -85)
            aIntRange_9552 = null
            aFontMetaRef_9553 = null
            aString9554 = null
        }
    }
}
