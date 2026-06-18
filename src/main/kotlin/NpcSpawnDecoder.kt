/* Class92 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object NpcSpawnDecoder {
    @JvmField
    var anInt1524: Int = 765
    @JvmField
    var anInterface4Array1525: Array<Interface4?>? = null
    @JvmField
    var anInt1526: Int = 0
    @JvmField
    var anInt1527: Int = 0
    var aFloatArray1528: FloatArray? = floatArrayOf(0.0f, -1.0f, 0.0f, 0.0f)

    fun method858(bool: Boolean, player: Player) {
        anInt1526++
        val class348_sub9 = ((CompletedResourceRequest.aHashtable_10465!!.method3480(player.anInt10290.toLong(), -6008)) as CharacterRenderState)
        if (bool == true) {
            if (class348_sub9 == null) ProjectileFactory.method1614(979190089, null, player.plane.toInt(), (player.anIntArray10317!![0]), (player.anIntArray10320!![0]), player, null, 0)
            else class348_sub9.method2781(21.toByte())
        }
    }

    fun method859(i: Int) {
        anInt1527++
        val i_0_ = StringCacheNode.aByteArrayArray7212!!.size
        if (i < -125) {
            var i_1_ = 0
            while (i_0_ > i_1_) {
                if (StringCacheNode.aByteArrayArray7212!![i_1_] != null) {
                    var i_2_ = -1
                    for (i_3_ in 0..<ProjectileConfigUtil.anInt388) {
                        if (WidgetRedrawRegion.anIntArray4250!![i_3_] == NullOggStream.anIntArray9042!![i_1_]) {
                            i_2_ = i_3_
                            break
                        }
                    }
                    if (i_2_ == -1) {
                        WidgetRedrawRegion.anIntArray4250!![ProjectileConfigUtil.anInt388] = NullOggStream.anIntArray9042!![i_1_]
                        i_2_ = ProjectileConfigUtil.anInt388++
                    }
                    val class348_sub49 = Buffer(StringCacheNode.aByteArrayArray7212!![i_1_])
                    var i_4_ = 0
                    while (class348_sub49.anInt7197 < StringCacheNode.aByteArrayArray7212!![i_1_]!!.size) {
                        if (i_4_ >= 511 || ModelDefinitionLoader.anInt2057 >= 1023) break
                        val i_5_ = i_2_ or (i_4_++ shl 6)
                        val i_6_ = class348_sub49.readUnsignedShort(842397944)
                        val i_7_ = i_6_ shr 14
                        val i_8_ = 0x3f and (i_6_ shr 7)
                        val i_9_ = i_6_ and 0x3f
                        val i_10_ = (i_8_ + (-ArbVertexProgram.regionTileX + (NullOggStream.anIntArray9042!![i_1_] shr 8) * 64))
                        val i_11_ = (-RegionMapDecoder.regionTileY + (64 * (0xff and (NullOggStream.anIntArray9042!![i_1_])) - -i_9_))
                        val class79 = (MapAreaDefinition.aBufferedMessageQueue_2529!!.method2079(class348_sub49.readUnsignedShort(842397944), -1))
                        val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_5_.toLong(), -6008) as? NpcReference)
                        if (class348_sub22 == null && (class79.aByte1325.toInt() and 0x1) > 0 && i_7_ == ParticleSystemState.anInt2204 && i_10_ >= 0 && (Class367_Sub4.anInt7319 > i_10_ - -class79.anInt1399) && i_11_ >= 0 && (RangeThresholdTextureNode.anInt9109 > i_11_ + class79.anInt1399)) {
                            val npc = Npc()
                            npc.anInt10290 = i_5_
                            val class348_sub22_12_ = (NpcReference(npc))
                            NpcEntityUpdater.aHashtable_3654!!.method3483(91.toByte(), i_5_.toLong(), class348_sub22_12_)
                            TurbulenceTextureNode.aClass348_Sub22Array9319!![TerrainShadowBuilderGl2.anInt6930++] = class348_sub22_12_
                            RgbColorPalette.anIntArray1233!![ModelDefinitionLoader.anInt2057++] = i_5_
                            npc.anInt10306 = Class367_Sub11.anInt7396
                            npc.method2448(class79, -2)
                            npc.method2434(120.toByte(), npc.aNpcType_10505!!.anInt1399)
                            npc.anInt10310 = (npc.aNpcType_10505!!.anInt1329 shl 3)
                            npc.method2435(((-108).toByte()).toByte(), (npc.aNpcType_10505!!.aByte1355 - -4 and 0x631ffff8.inv()) shl 11, true)
                            npc.method2444(i_11_, true, i_10_, 123, npc.method2436(54.toByte()), i_7_)
                        }
                    }
                }
                i_1_++
            }
        }
    }

    @JvmStatic
    fun method860(i: Byte) {
        anInterface4Array1525 = null
        if (i > 43) aFloatArray1528 = null
    }
}
