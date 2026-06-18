import AntialiasOptionState.Companion.method1819
import java.awt.Canvas

/*
 * Class22
 */
class HslColorConfig {
    @JvmField
    var anInt331: Int = -1
    @JvmField
    var anInt332: Int = 0
    @JvmField
    var aBoolean334: Boolean = true
    @JvmField
    var anInt335: Int = 0
    @JvmField
    var anInt336: Int = 512
    private var anInt337 = 0
    @JvmField
    var anInt341: Int = 0
    @JvmField
    var aBoolean342: Boolean = true
    @JvmField
    var anInt343: Int = 0

    fun method290(class348_sub49: Buffer, i: Int) {
        if (i != -1) this.anInt332 = 25
        while (true) {
            val i_0_ = class348_sub49.readUnsignedByte(255)
            if (i_0_ == 0) break
            method291(i_0_, -4, class348_sub49)
        }
        anInt329++
    }

    private fun method291(i: Int, i_1_: Int, class348_sub49: Buffer) {
        if (i == 1) {
            anInt337 = class348_sub49.readMedium(-1)
            method292(anInt337, 117.toByte())
        } else if (i == 2) {
            this.anInt331 = class348_sub49.readUnsignedShort(i_1_ + 842397948)
            if (this.anInt331 == 65535) this.anInt331 = -1
        } else if (i != 3) {
            if (i != 4) {
                if (i == 5) this.aBoolean334 = false
            } else this.aBoolean342 = false
        } else this.anInt336 = class348_sub49.readUnsignedShort(842397944) shl 2
        anInt333++
    }

    private fun method292(i: Int, i_2_: Byte) {
        anInt340++
        val d = (0xff and (i shr 16)).toDouble() / 256.0
        val d_3_ = ((0xff2b and i) shr 8).toDouble() / 256.0
        val d_4_ = (0xff and i).toDouble() / 256.0
        var d_5_ = d
        if (d_3_ < d_5_) d_5_ = d_3_
        if (d_4_ < d_5_) d_5_ = d_4_
        var d_6_ = d
        if (d_3_ > d_6_) d_6_ = d_3_
        if (d_4_ > d_6_) d_6_ = d_4_
        var d_7_ = 0.0
        var d_8_ = 0.0
        val d_9_ = (d_5_ + d_6_) / 2.0
        if (d_6_ != d_5_) {
            if (d_9_ < 0.5) d_8_ = (d_6_ - d_5_) / (d_5_ + d_6_)
            if (d != d_6_) {
                if (d_6_ != d_3_) {
                    if (d_6_ == d_4_) d_7_ = (d - d_3_) / (-d_5_ + d_6_) + 4.0
                } else d_7_ = (-d + d_4_) / (d_6_ - d_5_) + 2.0
            } else d_7_ = (-d_4_ + d_3_) / (d_6_ - d_5_)
            if (d_9_ >= 0.5) d_8_ = (d_6_ - d_5_) / (-d_5_ + (2.0 - d_6_))
        }
        this.anInt332 = (256.0 * d_8_).toInt()
        d_7_ /= 6.0
        this.anInt335 = (256.0 * d_9_).toInt()
        if (this.anInt332 >= 0) {
            if (this.anInt332 > 255) this.anInt332 = 255
        } else this.anInt332 = 0
        if (d_9_ > 0.5) this.anInt343 = (512.0 * ((1.0 - d_9_) * d_8_)).toInt()
        else this.anInt343 = (512.0 * (d_9_ * d_8_)).toInt()
        if (this.anInt335 < 0) this.anInt335 = 0
        else if (this.anInt335 > 255) this.anInt335 = 255
        if (this.anInt343 < 1) this.anInt343 = 1
        val i_10_ = 39 % ((i_2_ - 61) / 55)
        this.anInt341 = (d_7_ * this.anInt343.toDouble()).toInt()
    }

    companion object {
        @JvmField
        var anInt328: Int = 0
        @JvmField
        var anInt329: Int = 0
        var aIntRange_330: IntRange? = IntRange(65, -1)
        @JvmField
        var anInt333: Int = 0
        @JvmField
        var anInt338: Int = 0
        @JvmField
        var anInt339: Int = 0
        @JvmField
        var anInt340: Int = 0
        @JvmStatic
        fun method293(i: Byte) {
            aIntRange_330 = null
        }

        @JvmStatic
        fun method294(var_renderer: Renderer?, i: Int) {
            anInt328++
            if (ProportionalScrollbarComponent.aNodeDeque_9931!!.method1998(i) != 0) {
                if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 0) {
                    var class348_sub7 = (ProportionalScrollbarComponent.aNodeDeque_9931!!.method1995(4) as RegionTileNode?)
                    while (class348_sub7 != null) {
                        ClientException.aModelHeaderCache_112!!.method1932(var_renderer, class348_sub7.anInt6647, class348_sub7.anInt6648, WorldMapRenderer.aFont_4684, (if (!class348_sub7.aBoolean6650) null else (LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536)), class348_sub7.anInt6642, false, 83.toByte(), var_renderer, class348_sub7.anInt6649, false, class348_sub7.anInt6645)
                        class348_sub7.method2715(29.toByte())
                        class348_sub7 = ProportionalScrollbarComponent.aNodeDeque_9931!!.method1990(31.toByte()) as RegionTileNode?
                    }
                    TextureCache.method3466(i + -113)
                } else {
                    if (IntPair.aRenderer6968 == null) {
                        val canvas = Canvas()
                        canvas.setSize(36, 32)
                        IntPair.aRenderer6968 = SoftwareSpriteRaster.method958(true, 0, SourceRowTextureNode.aRenderConfig9113, 0, canvas, SpriteLoadValidator.aJs5Archive_4796)
                        EdgeDetectTextureNode.aFont_9173 = (IntPair.aRenderer6968!!.method3686(method1819(ConnectionStateType.anInt1044, 0, -44, SoftwareSpriteRaster.aJs5Archive_1627!!), SpriteImage.method1519(CameraRotationStub.Companion.aJs5Archive_322!!, ConnectionStateType.anInt1044, 0), true))
                    }
                    var class348_sub7 = (ProportionalScrollbarComponent.aNodeDeque_9931!!.method1995(i + 4) as RegionTileNode?)
                    while (class348_sub7 != null) {
                        ClientException.aModelHeaderCache_112!!.method1932(IntPair.aRenderer6968, class348_sub7.anInt6647, class348_sub7.anInt6648, EdgeDetectTextureNode.aFont_9173, (if (class348_sub7.aBoolean6650) (LocalPlayerState.aPlayer_1907!!.aCompositeNpcModelBuilder_10536) else null), class348_sub7.anInt6642, false, 83.toByte(), var_renderer, class348_sub7.anInt6649, false, class348_sub7.anInt6645)
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
                throw SoundBankPatch.method2929(runtimeexception, ("hk.E(" + i + ',' + i_11_ + ',' + i_12_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_13_ + ',' + (if (is_14_ != null) "{...}" else "null") + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'))
            }
        }
    }
}
