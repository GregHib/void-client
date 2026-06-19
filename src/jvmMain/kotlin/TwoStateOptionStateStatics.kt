object TwoStateOptionStateStatics {
    @JvmField
            var anInt6134: Int = 0
            @JvmField
            var anInt6135: Int = 0
            @JvmField
            var anInt6136: Int = 0
            @JvmField
            var anInt6137: Int = 0
            @JvmField
            var anInt6138: Int = 0
            @JvmField
            var anInt6139: Int = 0
            @JvmField
            var anInt6140: Int = 0
            @JvmField
            var anInt6141: Int = 0
            @JvmField
            var anInt6142: Int = 0
            @JvmField
            var anInt6143: Int = 0
    
            @JvmStatic
            fun method1842(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int): Boolean {
                anInt6134++
                if (i_1_ != -1) return false
                if (i_3_ >= i + i_5_ || i_3_ - -i_6_ <= i_5_) return false
                return i_0_ + i_7_ > i_4_ && i_0_ < i_2_ + i_4_
            }
    
            @JvmStatic
            fun method1843(i: Int, i_8_: Int, widgetComponent: WidgetComponent, bool: Boolean, i_9_: Int) {
                anInt6135++
                if (i_8_ != -326) method1844(32, -33, false, 1, false, 64, -83)
                val i_10_ = widgetComponent.anInt709
                val i_11_ = widgetComponent.anInt789
                if (widgetComponent.aByte778.toInt() == 0) widgetComponent.anInt709 = widgetComponent.anInt842
                else if (widgetComponent.aByte778.toInt() != 1) {
                    if (widgetComponent.aByte778.toInt() == 2) widgetComponent.anInt709 = widgetComponent.anInt842 * i shr 14
                } else widgetComponent.anInt709 = -widgetComponent.anInt842 + i
                if (widgetComponent.aByte724.toInt() != 0) {
                    if (widgetComponent.aByte724.toInt() != 1) {
                        if (widgetComponent.aByte724.toInt() == 2) widgetComponent.anInt789 = widgetComponent.anInt728 * i_9_ shr 14
                    } else widgetComponent.anInt789 = i_9_ - widgetComponent.anInt728
                } else widgetComponent.anInt789 = widgetComponent.anInt728
                if (widgetComponent.aByte778.toInt() == 4) widgetComponent.anInt709 = (widgetComponent.anInt789 * widgetComponent.anInt710 / widgetComponent.anInt775)
                if (widgetComponent.aByte724.toInt() == 4) widgetComponent.anInt789 = (widgetComponent.anInt775 * widgetComponent.anInt709 / widgetComponent.anInt710)
                if (TextureCubeProviderStatics.aBoolean6327 && (ClientStatics.method105(widgetComponent)!!.anInt7098 != 0 || widgetComponent.anInt774 == 0)) {
                    if (widgetComponent.anInt789 < 5 && widgetComponent.anInt709 < 5) {
                        widgetComponent.anInt789 = 5
                        widgetComponent.anInt709 = 5
                    } else {
                        if (widgetComponent.anInt789 <= 0) widgetComponent.anInt789 = 5
                        if (widgetComponent.anInt709 <= 0) widgetComponent.anInt709 = 5
                    }
                }
                if (RangedGraphicsOptionStateStatics.anInt5943 == widgetComponent.anInt765) AbstractTileShapeStatics.aWidgetComponent_6561 = widgetComponent
                if (bool && widgetComponent.anObjectArray727 != null && (i_10_ != widgetComponent.anInt709 || (i_11_ != widgetComponent.anInt789))) {
                    val class348_sub36 = WidgetActionEntry()
                    class348_sub36.aWidgetComponent_6989 = widgetComponent
                    class348_sub36.anObjectArray6987 = widgetComponent.anObjectArray727
                    HashTileShapeStatics.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                }
            }
    
            @JvmStatic
            fun method1844(i: Int, i_12_: Int, bool: Boolean, i_13_: Int, bool_14_: Boolean, i_15_: Int, i_16_: Int) {
                ShortMatrixNodeStatics.anInt9515 = i_13_
                CollisionMapAccessor.anInt3550 = i_16_
                if (bool_14_ == false) {
                    TileTextureNodeStatics.anInt9406 = i
                    anInt6136++
                    IntKeyNodeStatics.anInt6981 = i_12_
                    GlTextureCubeMapStatics.anInt8537 = i_15_
                    if (bool && GlTextureCubeMapStatics.anInt8537 >= 100) {
                        CompositeRgbNoiseTextureStatics.anInt8685 = 256 + 512 * CollisionMapAccessor.anInt3550
                        GlslMaterialPassStatics.anInt6246 = 256 + IntKeyNodeStatics.anInt6981 * 512
                        ParticleSystemRendererStatics.anInt3855 = (CollisionMapAccessor.method2064(GlslMaterialPassStatics.anInt6246, CompiledScriptCacheStatics.anInt4372, 11219, CompositeRgbNoiseTextureStatics.anInt8685) + -ShortMatrixNodeStatics.anInt9515)
                    }
                    WeaveTextureNodeStatics.anInt9282 = 2
                    SequencedWallEntityStatics.anInt10163 = -1
                    NativeLibraryState.anInt167 = SequencedWallEntityStatics.anInt10163
                }
            }
    
            @JvmStatic
            fun method1846(i: Int, i_18_: Int, i_19_: Int): Boolean {
                if (i_19_ <= 42) return true
                anInt6143++
                return BufferedMessageQueueStatics.method2075(i_18_, -126, i) or ((0x40000 and i_18_) != 0) || BoundsConstraintEntryStatics.method2056(i_18_, 122, i)
            }
    
            @JvmStatic
            fun method1847(strings: Array<String?>?, i: Int): Array<String?> {
                anInt6140++
                val strings_20_ = arrayOfNulls<String>(5)
                for (i_21_ in i..4) {
                    strings_20_[i_21_] = i_21_.toString() + ": "
                    if (strings != null && strings[i_21_] != null) strings_20_[i_21_] = strings_20_[i_21_] + strings[i_21_]
                }
                return strings_20_
            }
}
