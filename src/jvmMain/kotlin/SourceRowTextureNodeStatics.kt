object SourceRowTextureNodeStatics {
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
                val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_1_]!![i_2_]
                if (class357 != null) {
                    ParticleDefLoaderStatics.method1376(class357.aClass318_Sub1_Sub4_4406)
                    ParticleDefLoaderStatics.method1376(class357.aClass318_Sub1_Sub4_4403)
                    if (class357.aClass318_Sub1_Sub4_4406 != null) class357.aClass318_Sub1_Sub4_4406 = null
                    if (class357.aClass318_Sub1_Sub4_4403 != null) class357.aClass318_Sub1_Sub4_4403 = null
                }
            }
}
