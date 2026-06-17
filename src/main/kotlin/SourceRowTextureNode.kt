/* Class348_Sub40_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SourceRowTextureNode : AbstractProceduralTextureNode(0, true) {
    override fun method3042(i: Int, i_0_: Int): IntArray? {
        anInt9115++
        if (i_0_ != 255) aNodeDeque_9111 = null
        val `is` = this.aSpriteSheetCache_7032!!.method1433(0, i)!!
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) ArrayCopyUtil.method1579(`is`, 0, DisplaceTextureNode.Companion.anInt9139, LightDetailOptionState.anIntArray6035!![i])
        return `is`
    }

    companion object {
        @JvmField
        var aNodeDeque_9111: NodeDeque? = NodeDeque()
        @JvmField
        var anInt9112: Int = 0
        @JvmField
        var aRenderConfig9113: RenderConfig? = null
        @JvmField
        var aAbstractCameraTransform_9114: AbstractCameraTransform? = null
        @JvmField
        var anInt9115: Int = 0

        @JvmStatic
        fun method3057(i: Byte) {
            if (i > -32) method3058(-76, 25, -12)
            aAbstractCameraTransform_9114 = null
            aNodeDeque_9111 = null
            aRenderConfig9113 = null
        }

        @JvmStatic
        fun method3058(i: Int, i_1_: Int, i_2_: Int) {
            val class357 = HintArrowOrMessage.aClass357ArrayArrayArray2029!![i]!![i_1_]!![i_2_]
            if (class357 != null) {
                ParticleDefLoader.method1376(class357.aClass318_Sub1_Sub4_4406)
                ParticleDefLoader.method1376(class357.aClass318_Sub1_Sub4_4403)
                if (class357.aClass318_Sub1_Sub4_4406 != null) class357.aClass318_Sub1_Sub4_4406 = null
                if (class357.aClass318_Sub1_Sub4_4403 != null) class357.aClass318_Sub1_Sub4_4403 = null
            }
        }
    }
}
