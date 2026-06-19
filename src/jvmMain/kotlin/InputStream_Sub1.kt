import java.io.InputStream

class InputStream_Sub1 : InputStream() {
    override fun read(): Int {
        anInt74++
        TexGenMaterialPass.method2161(31.toByte(), 30000L)
        return -1
    }

    companion object {
        @JvmField
        var anInt71: Int = 0
        @JvmField
        var anInt72: Int = 0
        @JvmField
        var anInt73: Int = 0
        @JvmField
        var anInt74: Int = 0
        @JvmField
        var aFontMetaRef_77: FontMetaRef?
        @JvmField
        var anInt78: Int
        @JvmField
        var aIntRange_79: IntRange?

        @JvmStatic
        fun method124(i: Int) {
            WhirlpoolHash.aLongArrayArray75 = null
            if (i == 2) {
                aFontMetaRef_77 = null
                WhirlpoolHash.aLongArray76 = null
                aIntRange_79 = null
            }
        }

        @JvmStatic
        fun method125(i: Int, i_0_: Int, i_1_: Int, class318_sub1_sub4: ActorEntity?, i_2_: Byte): Boolean {
            anInt72++
            if (!TurbulenceTextureNode.aBoolean9307 || !SkeletalAnimFrameData.aBoolean351) return false
            if (NpcDefinition.anInt2946 < 100) return false
            if (!IndexedSprite.method164(i_1_, i_0_, (-97).toByte(), i)) return false
            val i_3_ = i_0_ shl Tooltip.anInt4459
            val i_4_ = i shl Tooltip.anInt4459
            if (i_2_.toInt() != 120) return false
            val i_5_ = -1 + NativeSprite.aTerrainTileArray5191!![i_1_]!!.method3982((-86).toByte(), i, i_0_)
            val i_6_ = i_5_ + class318_sub1_sub4!!.method2394(true)
            if (class318_sub1_sub4.aShort8759.toInt() == 1) {
                if (!ScrollTexMaterialPass.method2169(i_3_, i_3_, i_4_, i_3_, ArchiveFileConditionWrapper.anInt3465 + i_4_, i_6_, i_6_, i_5_, i_4_, false)) return false
                if (!ScrollTexMaterialPass.method2169(i_3_, i_3_, i_4_, i_3_, ArchiveFileConditionWrapper.anInt3465 + i_4_, i_5_, i_6_, i_5_, i_4_ + ArchiveFileConditionWrapper.anInt3465, false)) return false
                StructConfig.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 2) {
                if (!ScrollTexMaterialPass.method2169(i_3_, i_3_ - -ArchiveFileConditionWrapper.anInt3465, i_4_ - -ArchiveFileConditionWrapper.anInt3465, i_3_, ArchiveFileConditionWrapper.anInt3465 + i_4_, i_6_, i_6_, i_5_, i_4_ - -ArchiveFileConditionWrapper.anInt3465, false)) return false
                if (!ScrollTexMaterialPass.method2169(i_3_, ArchiveFileConditionWrapper.anInt3465 + i_3_, i_4_ + ArchiveFileConditionWrapper.anInt3465, ArchiveFileConditionWrapper.anInt3465 + i_3_, ArchiveFileConditionWrapper.anInt3465 + i_4_, i_6_, i_5_, i_5_, i_4_ - -ArchiveFileConditionWrapper.anInt3465, false)) return false
                StructConfig.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 4) {
                if (!ScrollTexMaterialPass.method2169(i_3_ + ArchiveFileConditionWrapper.anInt3465, ArchiveFileConditionWrapper.anInt3465 + i_3_, i_4_, ArchiveFileConditionWrapper.anInt3465 + i_3_, i_4_ - -ArchiveFileConditionWrapper.anInt3465, i_6_, i_6_, i_5_, i_4_, false)) return false
                if (!ScrollTexMaterialPass.method2169(i_3_ + ArchiveFileConditionWrapper.anInt3465, i_3_ - -ArchiveFileConditionWrapper.anInt3465, i_4_, ArchiveFileConditionWrapper.anInt3465 + i_3_, i_4_ - -ArchiveFileConditionWrapper.anInt3465, i_5_, i_6_, i_5_, ArchiveFileConditionWrapper.anInt3465 + i_4_, false)) return false
                StructConfig.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 8) {
                if (!ScrollTexMaterialPass.method2169(i_3_, ArchiveFileConditionWrapper.anInt3465 + i_3_, i_4_, i_3_, i_4_, i_6_, i_6_, i_5_, i_4_, false)) return false
                if (!ScrollTexMaterialPass.method2169(i_3_, i_3_ + ArchiveFileConditionWrapper.anInt3465, i_4_, ArchiveFileConditionWrapper.anInt3465 + i_3_, i_4_, i_6_, i_5_, i_5_, i_4_, false)) return false
                StructConfig.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 16) {
                if (!MinimapFlagRenderer.method1084(i_6_, TheoraVideoStream.anInt9037, TheoraVideoStream.anInt9037 + i_4_, i_3_, i_5_, TheoraVideoStream.anInt9037, 18507)) return false
                StructConfig.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 32) {
                if (!MinimapFlagRenderer.method1084(i_6_, TheoraVideoStream.anInt9037, TheoraVideoStream.anInt9037 + i_4_, i_3_ + TheoraVideoStream.anInt9037, i_5_, TheoraVideoStream.anInt9037, 18507)) return false
                StructConfig.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 64) {
                if (!MinimapFlagRenderer.method1084(i_6_, TheoraVideoStream.anInt9037, i_4_, TheoraVideoStream.anInt9037 + i_3_, i_5_, TheoraVideoStream.anInt9037, 18507)) return false
                StructConfig.anInt562++
                return true
            }
            if (class318_sub1_sub4.aShort8759.toInt() == 128) {
                if (!MinimapFlagRenderer.method1084(i_6_, TheoraVideoStream.anInt9037, i_4_, i_3_, i_5_, TheoraVideoStream.anInt9037, 18507)) return false
                StructConfig.anInt562++
                return true
            }
            return true
        }

        @JvmStatic
        fun method126(i: Int) {
            ProjectedGroundDecor.method2433()
            anInt73++
            for (i_7_ in 0..3) TimedRecordAccessor.aCollisionMapArray7108s!![i_7_]!!.method3500(700)
            if (i != -16203) Companion.method125(125, -95, 109, null, (-52).toByte())
            MinimapTriangleDrawer.method464(-1)
            InterfaceBounds.method2938(98.toByte())
            BloomGraphicsOptionState.method1772(28)
            System.gc()
            FacingDirectionNode.aRenderer6654!!.ya()
        }

        init {
            aFontMetaRef_77 = FontMetaRef(8, 1)
            anInt78 = 0
            aIntRange_79 = IntRange(75, 6)
        }
    }
}
