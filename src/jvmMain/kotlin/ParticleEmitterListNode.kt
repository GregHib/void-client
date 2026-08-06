import SpotAnimEntity.Companion.method2510

/* Class348_Sub42_Sub18 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleEmitterListNode internal constructor(var aClass318_Sub1_Sub3_Sub5_9682: TrackedGroundDecor?) : HashLinkedListNode() {
    companion object {
        var anInt9681: Int = 0
        var anInt9683: Int = 0
        var aOutgoingPacketHeader_9684: OutgoingPacketHeader? = OutgoingPacketHeader(81, 3)
        var aConfigFlagUtil_9685: ConfigFlagUtil? = ConfigFlagUtil()
        var anInt9686: Int = 0

        fun method3273(bool: Boolean, i: Int, class348_sub16_sub3: MidiSequencePlayer?) {
            if (i > -55) method3275(117, -54, 56)
            ClientLoadStateMachine.aSoundChannelMixer_7042!!.method2088(false, class348_sub16_sub3)
            anInt9681++
            if (bool) method2510(ClientLoadStateMachine.aJs5Archive_1878, class348_sub16_sub3, LightingOptionState.aJs5Archive_5878, false, ClientLoadStateMachine.aSoundChannelMixer_7042, HoverActionEntry.aJs5Archive_1815)
        }

        @JvmStatic
        fun method3274(bool: Boolean) {
            if (bool != true) method3273(true, -84, null)
            aOutgoingPacketHeader_9684 = null
            aConfigFlagUtil_9685 = null
        }

        fun method3275(i: Int, i_0_: Int, i_1_: Int) {
            anInt9683++
            if (i != 1) aOutgoingPacketHeader_9684 = null
            if (Client.aSceneProjector_10434 != GlRectangleTexture.aSceneProjector_8638) {
                if (!PixelBlender.method2252(false, i_1_, i_0_, (-108).toByte(), 1, 0, 1, -3, 0)) PixelBlender.method2252(false, i_1_, i_0_, (-99).toByte(), 1, 0, 1, -2, 0)
            } else if (!PixelBlender.method2252(false, i_1_, i_0_, (-128).toByte(), 1, 0, 1, -2, 0)) PixelBlender.method2252(false, i_1_, i_0_, (-115).toByte(), 1, 0, 1, -3, 0)
        }
    }
}
