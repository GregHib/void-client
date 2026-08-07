/* Class3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object CacheStateResetter {

    var anInt124: Int = 0

    var aServerConnectionInfo_125: ServerConnectionInfo? = null

    @JvmStatic
    fun method175(i: Byte) {
        LocalizedTextTripleStatics.anInt3760 = -1
        WidgetDefinition.anSpriteDrawTarget_252 = null
        RenderNodeStatics.aAbstractCameraTransform_9720 = null
        LocalPlayerState.anIntArray1909 = null
        NpcSpawnDecoder.anSpriteDrawTargetArray1525 = null
        CameraRotationStubStatics.aRenderer326 = null
        MapSceneRenderer.aAbstractCameraTransform_624 = null
        anInt124++
        val i_0_ = 9 / ((62 - i) / 47)
        ProjectileConfigUtil.anInt396 = -1
        NpcConfig.aAbstractCameraTransform_905 = null
        WhirlpoolHash.anInt7207 = -1
        WorldMapAreaLabel.anInt8583 = -1
        FireParticleStream.aSceneObjectSpawner_10436!!.method775(69.toByte())
    }

    @JvmStatic
    fun method176(i: Int) {
        InboundPacketHeader.aInboundPacketHeader_123 = null
        aServerConnectionInfo_125 = null
        if (i != -1) method176(-19)
    }
}
