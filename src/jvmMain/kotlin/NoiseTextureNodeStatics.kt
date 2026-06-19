object NoiseTextureNodeStatics {
    @JvmField
            var anInt9261: Int = 0
            @JvmField
            var anInt9262: Int = 0
            @JvmField
            var aHudTabPanel_9263: HudTabPanel? = HudTabPanel("RC", 1)
            @JvmField
            var aClass348_Sub4_9264: ClientMachineInfo? = null
            @JvmField
            var anInt9265: Int = 0
    
            @JvmStatic
            fun method3102(i: Int) {
                if (i != 22385) aClass348_Sub4_9264 = null
                anInt9265++
                SoundCacheState.aLruByteCache_4139!!.method587(-110)
            }
    
            @JvmStatic
            fun method3104(bool: Boolean) {
                if (bool == false) {
                    aClass348_Sub4_9264 = null
                    aHudTabPanel_9263 = null
                }
            }
    
            init {
                BoundsConstraintEntry("", 73)
            }
}
