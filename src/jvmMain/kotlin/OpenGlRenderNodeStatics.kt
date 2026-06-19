object OpenGlRenderNodeStatics {
    @JvmField
            var aJs5Archive_10480: Js5Archive? = null
            @JvmField
            var anInt10481: Int = 0
            @JvmField
            var anInt10483: Int = 0
            @JvmField
            var anInt10485: Int = 0
            @JvmField
            var aSmoothingBuffer_10488: SmoothingBuffer? = null
            @JvmField
            var anInt10490: Int = 0
            @JvmField
            var anInt10491: Int = 0
            @JvmField
            var aNodeDeque_10492: NodeDeque? = NodeDeque()
    
            @JvmStatic
            fun method3295(i: Int) {
                aJs5Archive_10480 = null
                aSmoothingBuffer_10488 = null
                aNodeDeque_10492 = null
                if (i != -1) method3295(109)
            }
    
            @JvmStatic
            fun method3297(i: Int, i_20_: Int, i_21_: Int): ActorEntity? {
                val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_20_]!![i_21_]
                if (class357 == null) return null
                return class357.aClass318_Sub1_Sub4_4406
            }
}
