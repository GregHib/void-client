object ParticleConfigParserStatics {
    var anInt3815: Int = 0
    var anInt3816: Int = 0

    var anInt3820: Int = 0
    var anInt3824: Int = 0

    fun method2273(i: Byte): OutgoingPacketNode? {
        anInt3824++
        if (i.toInt() != -103) return null
        if (GroundDecorOptionState.anInt5980 == 0) return OutgoingPacketNode()
        return PingHostListHolder.aClass348_Sub47Array2334!![--GroundDecorOptionState.anInt5980]
    }

    fun method2274(string: String?, i: Int): Int {
        anInt3816++
        if (string == null) return -1
        if (i >= -41) return 97
        var i_0_ = 0
        while ((i_0_ < HslAdjustTextureNode.anInt9383)) {
            if (string.equals(WaterTextureSet.aStringArray1441!![i_0_], ignoreCase = true)) return i_0_
            i_0_++
        }
        return -1
    }

    fun method2277(i: Int, js5Archive: Js5Archive, i_5_: Int, i_6_: Int): ModelDefinition? {
        if (i_6_ != -1) ParticleConfigParser.aBoolean3819 = true
        anInt3815++
        val `is` = js5Archive.method410(-1860, i_5_, i)
        if (`is` == null) return null
        return ModelDefinition(`is`)
    }
}
