object WeaveTextureNodeStatics {
    @JvmField
            var anInt9267: Int = 0
            @JvmField
            var anInt9268: Int = 0
            @JvmField
            var anInt9270: Int = 0
            @JvmField
            var anInt9271: Int = 0
            @JvmField
            var anInt9272: Int = 0
            @JvmField
            var anInt9273: Int = 0
            @JvmField
            var aProjectileFactory_9274: ProjectileFactory?
            @JvmField
            var aStringArray9275: Array<String?>? = arrayOfNulls<String>(100)
            @JvmField
            var anInt9280: Int
            @JvmField
            var anInt9282: Int = 0
            @JvmField
            var aLongArray9283: LongArray?
    
            @JvmStatic
            fun method3106(i: Byte) {
                aLongArray9283 = null
                aStringArray9275 = null
                aProjectileFactory_9274 = null
                val i_12_ = 69 % ((19 - i) / 41)
            }
    
            fun method3107(i: Byte, renderTarget: RenderTarget, i_15_: Int, i_16_: Int): Long {
                anInt9270++
                val l = 4194304L
                val l_17_: Long = Long.MIN_VALUE
                val npcConfig: NpcConfig = GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2005(0, renderTarget.method42(-107))
                var l_18_ = (renderTarget.method39(-14) shl 14 or (i_16_ or (i_15_ shl 7)) or (renderTarget.method41(-32228) shl 20) or 0x40000000).toLong()
                if (npcConfig.anInt874 == 0) l_18_ = l_18_ or l_17_
                if (npcConfig.anInt895 == 1) l_18_ = l_18_ or l
                val i_19_ = 57 % ((-24 - i) / 57)
                l_18_ = l_18_ or (renderTarget.method42(-102).toLong() shl 32)
                return l_18_
            }
    
            init {
                aProjectileFactory_9274 = ProjectileFactory(5, 1)
                anInt9280 = 0
                aLongArray9283 = LongArray(256)
                for (i in 0..255) {
                    var l = i.toLong()
                    for (i_24_ in 0..7) {
                        if ((0x1L and l) == 1L) l = 0x3693a86a2878f0bdL.inv() xor (l ushr 1)
                        else l = l ushr 1
                    }
                    aLongArray9283!![i] = l
                }
            }
}
