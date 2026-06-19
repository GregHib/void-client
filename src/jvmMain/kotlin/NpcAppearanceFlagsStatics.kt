object NpcAppearanceFlagsStatics {
    @JvmField
            var anInt210: Int = 0
            @JvmField
            var anInt214: Int = 0
            fun method223(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Byte) {
                if (i_2_ > i) GlElementArrayBufferStatics.method1156(-27, i_2_, WidgetDefinitionStatics.anIntArrayArray255!![i_1_]!!, i, i_0_)
                else GlElementArrayBufferStatics.method1156(-27, i, WidgetDefinitionStatics.anIntArrayArray255!![i_1_]!!, i_2_, i_0_)
                anInt214++
                if (i_3_ >= 20) {
                    /* empty */
                }
            }
    
            fun method224(i: Byte, `is`: Array<IntArray?>?) {
                WidgetDefinitionStatics.anIntArrayArray255 = `is`
                anInt210++
            }
}
