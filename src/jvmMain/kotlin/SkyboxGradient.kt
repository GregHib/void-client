import WaterMaterialPass.Companion.method2148

/* Class313 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object SkyboxGradient {
    var anInt3933: Int = 0
    var aProjectileFactory_3934: ProjectileFactory? = ProjectileFactory(2, 2)
    var aFloat3935: Float = 0f

    var anInt3936: Int = 0
    var anInt3937: Int = 0

    @JvmStatic
    fun method2333(bool: Boolean) {
        if (bool == false) aProjectileFactory_3934 = null
    }

    @JvmStatic
    fun method2334(i: Int) {
        MapElementDecor.anInt10340++
        if (i != 0) method2333(true)
        anInt3933++
        val class348_sub47 = method2148(RasterSpriteStatics.aOutgoingPacketHeader_5200, TheoraVideoStream.aIsaacCipher_9029, i xor 0x53.inv())
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), GlArrayBufferObject.anInt4718)
        InterfaceComponentGroup.method3243(118, class348_sub47)
    }
}
