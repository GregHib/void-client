import Font.Companion.method2570

class ScrollingWidgetComponentNode internal constructor(js5Archive: Js5Archive?, class288_sub1: ParticleEmitterDefExt?) : WidgetComponentNode(js5Archive, class288_sub1) {
    private var anInt8383 = 0
    override fun method9(i: Byte, bool: Boolean) {
        anInt8379++
        val i_0_ = ((this.aParticleEmitterDef_4659!!.aScreenAnchorAlignment_4955!!.method1607(NpcSpawnDecoder.anInt1524, this.aAbstractModelRenderer_4655!!.method966(), (-117).toByte())) - -this.aParticleEmitterDef_4659!!.anInt4950)
        val i_1_ = ((this.aParticleEmitterDef_4659!!.aTileRenderState_4952!!.method2679(OpenGlRenderer.anInt7666, this.aAbstractModelRenderer_4655!!.method980(), 1595)) + this.aParticleEmitterDef_4659!!.anInt4951)
        this.aAbstractModelRenderer_4655!!.method981((this.aAbstractModelRenderer_4655!!.method966() / 2 + i_0_).toFloat(), (this.aAbstractModelRenderer_4655!!.method980() / 2 + i_1_).toFloat(), 4096, anInt8383)
        anInt8383 += (this.aParticleEmitterDef_4659 as ParticleEmitterDefExt).anInt8577
        if (i.toInt() != -49) method9((-26).toByte(), true)
    }

    companion object {

        var aParticleEffectCache_8378: ParticleEffectCache? = null

        var anInt8379: Int = 0

        var anInt8380: Int = 0

        var anInt8381: Int = 0

        var anInt8382: Int = 0
        var aInboundPacketHeader_8384: InboundPacketHeader? = InboundPacketHeader(18, 0)
        var aInboundPacketHeader_8385: InboundPacketHeader?

        var aBoolean8386: Boolean = false

        var anInt8387: Int = 0

        var anInt8388: Int

        /*synthetic*/
        var aClass8389: Class<*>? = null

        @JvmStatic
        fun method1118(bool: Boolean, bool_2_: Boolean, class348_sub41: RegionSceneShifter, i: Int) {
            anInt8382++
            val i_3_ = class348_sub41.anInt7050
            val i_4_ = class348_sub41.aLong4291.toInt()
            if (i == 2533) {
                class348_sub41.method2715(35.toByte())
                if (bool) GlTextureBase.method235(i_3_, (-116).toByte())
                ItemDefinitionLoader.method1288(i xor 0x9e2.inv(), i_3_)
                val class46 = method2570(1512932720, i_4_)
                if (class46 != null) ConfigFlagUtil.method1916(-9343, class46)
                MapTileShape.method3270(119.toByte())
                if (!bool_2_ && RenderNodeStatics.anInt9721 != -1) BloomGraphicsOptionState.method1775((-8).toByte(), RenderNodeStatics.anInt9721, 1)
                val mapElementLookup = MapElementLookup(MinimapSpriteRenderer.Companion.aHashtable_4915!!)
                var class348_sub41_5_ = mapElementLookup.method2644(123.toByte()) as? RegionSceneShifter?
                while (class348_sub41_5_ != null) {
                    if (!class348_sub41_5_.method2712(4.toByte())) {
                        class348_sub41_5_ = mapElementLookup.method2644(123.toByte()) as? RegionSceneShifter?
                        if (class348_sub41_5_ == null) break
                    }
                    if (class348_sub41_5_.anInt7053 == 3) {
                        val i_6_ = class348_sub41_5_.aLong4291.toInt()
                        if (i_3_ == i_6_ ushr 16) method1118(true, bool_2_, class348_sub41_5_, 2533)
                    }
                    class348_sub41_5_ = mapElementLookup.method2646(99.toByte()) as? RegionSceneShifter?
                }
            }
        }

        fun method1119(bool: Boolean) {
            anInt8381++
            try {
                try {
                    val runtime = Runtime.getRuntime()
                    val integer = runtime.availableProcessors()
                    ActorEntity.anInt9372 = integer
                } catch (throwable: Throwable) {
                    /* empty */
                }
            } catch (exception: Exception) {
                /* empty */
            }
        }

        @JvmStatic
        fun method1120(i: Int) {
            aInboundPacketHeader_8384 = null
            aParticleEffectCache_8378 = null
            aInboundPacketHeader_8385 = null
            if (i != 1) method1119(true)
        }

        init {
            aInboundPacketHeader_8385 = InboundPacketHeader(10, -2)
            anInt8388 = 0
        }
    }
}
