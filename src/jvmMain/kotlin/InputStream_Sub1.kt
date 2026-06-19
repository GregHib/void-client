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
        fun method126(i: Int) {
            ProjectedGroundDecor.method2433()
            anInt73++
            for (i_7_ in 0..3) TimedRecordAccessor.aCollisionMapArray7108s!![i_7_]!!.method3500(700)
            if (i != -16203) ActorEntity.method125(125, -95, 109, null, (-52).toByte())
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
