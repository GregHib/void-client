import java.awt.event.ActionEvent

object WorldMapPolygonIconLabelStatics {
    @JvmField
            var anInt10173: Int = 0
            @JvmField
            var aBoolean10174: Boolean = true
            @JvmField
            var anInt10175: Int = 0
            @JvmField
            var anInt10176: Int = 0
            @JvmField
            var anInt10178: Int = 0
    
            @JvmStatic
            fun method3575(i: Byte, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int) {
                var i_0_ = i_0_
                var i_2_ = i_2_
                var i_3_ = i_3_
                var i_4_ = i_4_
                if (i_3_ <= WidgetTextConfigStatics.anInt513 && i_2_ >= LocalPlayerState.anInt1910) {
                    val bool: Boolean
                    if (WorldMapLabelStatics.anInt4960 <= i_4_) {
                        if (i_4_ <= CameraNodeListStatics.anInt1745) bool = true
                        else {
                            bool = false
                            i_4_ = CameraNodeListStatics.anInt1745
                        }
                    } else {
                        i_4_ = WorldMapLabelStatics.anInt4960
                        bool = false
                    }
                    val bool_5_: Boolean
                    if (WorldMapLabelStatics.anInt4960 > i_0_) {
                        i_0_ = WorldMapLabelStatics.anInt4960
                        bool_5_ = false
                    } else if (CameraNodeListStatics.anInt1745 < i_0_) {
                        i_0_ = CameraNodeListStatics.anInt1745
                        bool_5_ = false
                    } else bool_5_ = true
                    if (i_3_ < LocalPlayerState.anInt1910) i_3_ = LocalPlayerState.anInt1910
                    else GlElementArrayBufferStatics.method1156(-27, i_0_, WidgetDefinitionStatics.anIntArrayArray255!![i_3_++]!!, i_4_, i_1_)
                    if (WidgetTextConfigStatics.anInt513 >= i_2_) GlElementArrayBufferStatics.method1156(-27, i_0_, WidgetDefinitionStatics.anIntArrayArray255!![i_2_--]!!, i_4_, i_1_)
                    else i_2_ = WidgetTextConfigStatics.anInt513
                    if (!bool || !bool_5_) {
                        if (bool) {
                            for (i_7_ in i_3_..i_2_) WidgetDefinitionStatics.anIntArrayArray255!![i_7_]!![i_4_] = i_1_
                        } else if (bool_5_) {
                            for (i_6_ in i_3_..i_2_) WidgetDefinitionStatics.anIntArrayArray255!![i_6_]!![i_0_] = i_1_
                        }
                    } else {
                        var i_8_ = i_3_
                        while (i_2_ >= i_8_) {
                            val `is` = WidgetDefinitionStatics.anIntArrayArray255!![i_8_]!!
                            `is`[i_0_] = i_1_
                            `is`[i_4_] = `is`[i_0_]
                            i_8_++
                        }
                    }
                }
                if (i <= 57) method3578((-97).toByte(), null, null)
                anInt10173++
            }
    
            @JvmStatic
            fun method3576(bool: Boolean, bool_9_: Boolean): Boolean {
                return bool or bool_9_
            }
    
            @JvmStatic
            fun method3577(i: Int, i_10_: Byte, js5Archive: Js5Archive): AbstractModelRenderer? {
                anInt10176++
                var abstractModelRenderer = ParticleProcessorStatics.aLruByteCache_4273!!.method583(i.toLong(), -68) as AbstractModelRenderer?
                val i_11_ = -86 / ((55 - i_10_) / 51)
                if (abstractModelRenderer == null) {
                    if (ScrollTexMaterialPassStatics.aBoolean6289) abstractModelRenderer = FacingDirectionNodeStatics.aRenderer6654!!.method3691(SpriteImageStatics.method1512(js5Archive, i), true)
                    else abstractModelRenderer = GlTexture2DStatics.method1969(js5Archive.method415(73.toByte(), i)!!, -5901)
                    ParticleProcessorStatics.aLruByteCache_4273!!.method582(abstractModelRenderer, i.toLong(), (-108).toByte())
                }
                return abstractModelRenderer
            }
    
            @JvmStatic
            fun method3578(i: Byte, `object`: Any?, privilegedOperationWorker: PrivilegedOperationWorker?) {
                do {
                    try {
                        anInt10178++
                        if (privilegedOperationWorker!!.anEventQueue3799 != null) {
                            var i_12_ = 0
                            if (i.toInt() != -42) method3578(95.toByte(), null, null)
                            while ( /**/i_12_ < 50 && privilegedOperationWorker.anEventQueue3799!!.peekEvent() != null) {
                                TexGenMaterialPassStatics.method2161(30.toByte(), 1L)
                                i_12_++
                            }
                            try {
                                if (`object` == null) break
                                privilegedOperationWorker.anEventQueue3799!!.postEvent(ActionEvent(`object`, 1001, "dummy"))
                            } catch (exception: Exception) {
                                /* empty */
                            }
                            break
                        }
                        break
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("fu.F(" + i + ',' + (if (`object` != null) "{...}" else "null") + ',' + (if (privilegedOperationWorker != null) "{...}" else "null") + ')'))
                    }
                } while (false)
            }
}
