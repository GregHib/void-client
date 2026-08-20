import AntialiasOptionState.Companion.method1819
import java.awt.Canvas

object HslColorConfigStatics {
    var anInt328: Int = 0

    var anInt338: Int = 0

    var anInt339: Int = 0

    @JvmStatic
    fun method293(i: Byte) {
        InboundPacketHeader.aInboundPacketHeader_330 = null
    }

    @JvmStatic
    fun method294(var_renderer: Renderer?, i: Int) {
        anInt328++
        if (ProportionalScrollbarComponent.aNodeDeque_9931!!.method1998(i) != 0) {
            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 0) {
                var class348_sub7 = (ProportionalScrollbarComponent.aNodeDeque_9931!!.method1995(4) as RegionTileNode?)
                while (class348_sub7 != null) {
                    ClientExceptionStatics.aModelHeaderCache_112!!.method1932(var_renderer, class348_sub7.anInt6647, class348_sub7.anInt6648, WorldMapRenderer.aRSFont_4684, (if (!class348_sub7.aBoolean6650) null else (LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536)), class348_sub7.anInt6642, false, 83.toByte(), var_renderer, class348_sub7.anInt6649, false, class348_sub7.anInt6645)
                    class348_sub7.method2715(29.toByte())
                    class348_sub7 = ProportionalScrollbarComponent.aNodeDeque_9931!!.method1990(31.toByte()) as RegionTileNode?
                }
                TextureCache.method3466(i + -113)
            } else {
                if (IntPairStatics.aRenderer6968 == null) {
                    val canvas = Canvas()
                    canvas.setSize(36, 32)
                    IntPairStatics.aRenderer6968 = SoftwareSpriteRaster.method958(true, 0, SourceRowTextureNode.aRenderConfig9113, 0, canvas, SpriteLoadValidatorStatics.aJs5Archive_4796)
                    EdgeDetectTextureNode.aRSFont_9173 = (IntPairStatics.aRenderer6968!!.method3686(method1819(ConnectionStateTypeStatics.anInt1044, 0, -44, SoftwareSpriteRaster.aJs5Archive_1627!!), SpriteImage.method1519(CameraRotationStubStatics.aJs5Archive_322!!, ConnectionStateTypeStatics.anInt1044, 0), true))
                }
                var class348_sub7 = (ProportionalScrollbarComponent.aNodeDeque_9931!!.method1995(i + 4) as RegionTileNode?)
                while (class348_sub7 != null) {
                    ClientExceptionStatics.aModelHeaderCache_112!!.method1932(IntPairStatics.aRenderer6968, class348_sub7.anInt6647, class348_sub7.anInt6648, EdgeDetectTextureNode.aRSFont_9173, (if (class348_sub7.aBoolean6650) (LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536) else null), class348_sub7.anInt6642, false, 83.toByte(), var_renderer, class348_sub7.anInt6649, false, class348_sub7.anInt6645)
                    class348_sub7.method2715(21.toByte())
                    class348_sub7 = ProportionalScrollbarComponent.aNodeDeque_9931!!.method1990(118.toByte()) as RegionTileNode?
                }
            }
        }
    }

    @JvmStatic
    fun method295(i: Int, i_11_: Int, i_12_: Int, `is`: ByteArray, i_13_: Int, is_14_: ByteArray, i_15_: Int, i_16_: Int, i_17_: Int) {
        var i_11_ = i_11_
        var i_13_ = i_13_
        var i_16_ = i_16_
        try {
            anInt338++
            val i_18_ = -(i_13_ shr 2)
            i_13_ = -(0x3 and i_13_)
            if (i_12_ != 256) anInt339 = -63
            for (i_19_ in -i_15_..-1) {
                for (i_20_ in i_18_..-1) {
                    is_14_[i_16_] = (is_14_[i_16_++] + `is`[i_11_++]).toByte()
                    is_14_[i_16_] = (is_14_[i_16_++] + `is`[i_11_++]).toByte()
                    is_14_[i_16_] = (is_14_[i_16_++] + `is`[i_11_++]).toByte()
                    is_14_[i_16_] = (is_14_[i_16_++] + `is`[i_11_++]).toByte()
                }
                for (i_21_ in i_13_..-1) is_14_[i_16_] = (is_14_[i_16_++] + `is`[i_11_++]).toByte()
                i_16_ += i_17_
                i_11_ += i
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("hk.E(" + i + ',' + i_11_ + ',' + i_12_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_13_ + ',' + (if (is_14_ != null) "{...}" else "null") + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'))
        }
    }
}
