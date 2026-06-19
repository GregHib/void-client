import VorbisOggDecoderStatics.method2970

object RenderListTextureNodeStatics {
    @JvmField
            var anInt9482: Int = 0
            @JvmField
            var anInt9483: Int = 0
            @JvmField
            var anInt9484: Int = 0
            @JvmField
            var aTrigLookupTables_9485: TrigLookupTables? = TrigLookupTables()
            @JvmField
            var anInt9486: Int = 0
            @JvmField
            var anInt9487: Int = 0
    
            @JvmStatic
            fun method3152(i: Int) {
                aTrigLookupTables_9485 = null
                if (i != 255) method3152(-42)
            }
    
            @JvmStatic
            fun method3153(i: Int) {
                anInt9482++
                var class348_sub42_sub13 = (ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1011(-49) as ContactList?)
                while (class348_sub42_sub13 != null) {
                    if (class348_sub42_sub13.anInt9615 > 1) {
                        class348_sub42_sub13.anInt9615 = 0
                        KeyboardLayoutCacheStatics.aLruByteCache_3301!!.method582(class348_sub42_sub13, (class348_sub42_sub13.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as ContactEntry).aLong9600, (-108).toByte())
                        class348_sub42_sub13.aLinkedNodeListIterator_9621.method1009(i xor 0x7dc976c2)
                    }
                    class348_sub42_sub13 = (ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1003(51.toByte()) as ContactList?)
                }
                NpcAnimationResolverStatics.anInt166 = 0
                FileExistsConditionStatics.anInt4776 = i
                SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1996(125)
                ContactEntryStatics.aHashtable_9603!!.method3481(0)
                ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1009(2110355138)
                ScrollbarComponentStatics.aBoolean8335 = false
            }
}
