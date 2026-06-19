import ConfigFlagUtilStatics.method1915
import SoundBankPatchStatics.method2929

object TextureCacheStatics {
    var anInt4352: Int = 0
            var anInt4353: Int = 0
            var anInt4354: Int = 0
            var anIntArrayArrayArray4356: Array<Array<IntArray?>?>? = null
            var anInt4357: Int = 0
            var anInt4358: Int = 0
            var anInt4360: Int = 0
            fun method3464(c: Char, bool: Boolean): Byte {
                anInt4354++
                if (bool != false) method3464('\uffe1', false)
                val i: Byte
                if ((c.code <= 0 || c.code >= 128) && (c.code < 160 || c.code > 255)) {
                    if (c.code != 8364) {
                        if (c.code != 8218) {
                            if (c.code == 402) i = (-125).toByte()
                            else if (c.code == 8222) i = (-124).toByte()
                            else if (c.code == 8230) i = (-123).toByte()
                            else if (c.code == 8224) i = (-122).toByte()
                            else if (c.code == 8225) i = (-121).toByte()
                            else if (c.code != 710) {
                                if (c.code == 8240) i = (-119).toByte()
                                else if (c.code == 352) i = (-118).toByte()
                                else if (c.code == 8249) i = (-117).toByte()
                                else if (c.code == 338) i = (-116).toByte()
                                else if (c.code != 381) {
                                    if (c.code != 8216) {
                                        if (c.code == 8217) i = (-110).toByte()
                                        else if (c.code != 8220) {
                                            if (c.code != 8221) {
                                                if (c.code == 8226) i = (-107).toByte()
                                                else if (c.code != 8211) {
                                                    if (c.code != 8212) {
                                                        if (c.code == 732) i = (-104).toByte()
                                                        else if (c.code == 8482) i = (-103).toByte()
                                                        else if (c.code == 353) i = (-102).toByte()
                                                        else if (c.code != 8250) {
                                                            if (c.code != 339) {
                                                                if (c.code == 382) i = (-98).toByte()
                                                                else if (c.code == 376) i = (-97).toByte()
                                                                else i = 63.toByte()
                                                            } else i = (-100).toByte()
                                                        } else i = (-101).toByte()
                                                    } else i = (-105).toByte()
                                                } else i = (-106).toByte()
                                            } else i = (-108).toByte()
                                        } else i = (-109).toByte()
                                    } else i = (-111).toByte()
                                } else i = (-114).toByte()
                            } else i = (-120).toByte()
                        } else i = (-126).toByte()
                    } else i = (-128).toByte()
                } else i = c.code.toByte()
                return i
            }
    
            fun method3465(i: Int, i_0_: Int, mapTileShape: MapTileShape): Boolean {
                anInt4358++
                SourceRowTextureNodeStatics.aAbstractCameraTransform_9114!!.method897(mapTileShape.anIntArray4187!![i], mapTileShape.anIntArray4191[i], mapTileShape.anIntArray4184[i], SequencedWallEntityStatics.anIntArray10172!!)
                val i_1_ = SequencedWallEntityStatics.anIntArray10172!![2]
                if (i_1_ < 50) return false
                mapTileShape.aShortArray4194!![i] = (CollisionFlagQueryStatics.anInt1202 + (SequencedWallEntityStatics.anIntArray10172!![0] * ScreenBorderFiller.anInt1962 / i_1_)).toShort()
                mapTileShape.aShortArray4183!![i] = ((GlIndexBufferArbStatics.anInt8498 * SequencedWallEntityStatics.anIntArray10172!![i_0_] / i_1_) + CipheredPacketBufferStatics.anInt9759).toShort()
                mapTileShape.aShortArray4188!![i] = i_1_.toShort()
                return true
            }
    
            @JvmStatic
            fun method3466(i: Int) {
                val i_2_ = 22 / ((-2 - i) / 52)
                anInt4352++
                for (i_3_ in 0..99) GzipDecompressorStatics.aBooleanArray2076!![i_3_] = true
            }
    
            @JvmStatic
            fun method3468(i: Int) {
                anIntArrayArrayArray4356 = null
                if (i != -1401) anIntArrayArrayArray4356 = null
            }
}
