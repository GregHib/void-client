import kotlin.jvm.JvmStatic
/* Class139 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NpcSummaryDefinition {
    var aByteArray1948: ByteArray? = null
    var aShortArray1951: ShortArray? = null
    var aShortArray1953: ShortArray? = null
    var aShortArray1954: ShortArray? = null

    companion object {
        var anInt1949: Int = 0
        var anInt1950: Int = 0

        var aBoolean1952: Boolean = false
        var anInt1955: Int = 0

        fun method1165(i: Int) {
            CircleRasterizer.aClass348_Sub49_Sub2_3813!!.startBitAccess(i xor 0x79.inv())
            anInt1950++
            val i_0_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 8)
            if (i == 1) {
                if (i_0_ < ModelDefinitionLoader.anInt2057) {
                    var i_1_ = i_0_
                    while (ModelDefinitionLoader.anInt2057 > i_1_) {
                        ProportionalScrollbarComponent.anIntArray9932!![ParticleGeometry.anInt4411++] = Client.anIntArray1233!![i_1_]
                        i_1_++
                    }
                }
                if (i_0_ > ModelDefinitionLoader.anInt2057) throw RuntimeException("gnpov1")
                ModelDefinitionLoader.anInt2057 = 0
                for (i_2_ in 0..<i_0_) {
                    val i_3_ = Client.anIntArray1233!![i_2_]
                    val npc = ((NpcEntityUpdater.aHashtable_3654!!.method3480(i_3_.toLong(), -6008) as NpcReference).aNpc_6859)!!
                    val i_4_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                    if (i_4_ == 0) {
                        Client.anIntArray1233!![ModelDefinitionLoader.anInt2057++] = i_3_
                        npc.anInt10306 = NullOggStream.anInt9041
                    } else {
                        val i_5_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 2)
                        if (i_5_ == 0) {
                            Client.anIntArray1233!![ModelDefinitionLoader.anInt2057++] = i_3_
                            npc.anInt10306 = NullOggStream.anInt9041
                            MinimapRectClipper.anIntArray224!![AbstractCameraTransformStatics.anInt1597++] = i_3_
                        } else if (i_5_ == 1) {
                            Client.anIntArray1233!![ModelDefinitionLoader.anInt2057++] = i_3_
                            npc.anInt10306 = NullOggStream.anInt9041
                            val i_6_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                            npc.method2443(i_6_, 1, -10)
                            val i_7_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                            if (i_7_ == 1) MinimapRectClipper.anIntArray224!![AbstractCameraTransformStatics.anInt1597++] = i_3_
                        } else if (i_5_ == 2) {
                            Client.anIntArray1233!![ModelDefinitionLoader.anInt2057++] = i_3_
                            npc.anInt10306 = NullOggStream.anInt9041
                            if (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1) == 1) {
                                val i_9_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                                npc.method2443(i_9_, 2, -10)
                                val i_10_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                                npc.method2443(i_10_, 2, -10)
                            } else {
                                val i_8_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                                npc.method2443(i_8_, 0, i + -11)
                            }
                            val i_11_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                            if (i_11_ == 1) MinimapRectClipper.anIntArray224!![AbstractCameraTransformStatics.anInt1597++] = i_3_
                        } else if (i_5_ == 3) ProportionalScrollbarComponent.anIntArray9932!![ParticleGeometry.anInt4411++] = i_3_
                    }
                }
            }
        }


        @JvmStatic
        fun method1167(i: Int, i_13_: Byte): Boolean {
            anInt1955++
            if (i_13_ >= -45) anInt1949 = 88
            return i == 0 || i == 1 || i == 2
        }
    }
}
