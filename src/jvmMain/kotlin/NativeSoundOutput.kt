import java.awt.Component
import NativeSoundOutputStatics.anAudioDeviceController_6182

class NativeSoundOutput internal constructor(privilegedOperationWorker: PrivilegedOperationWorker, private val anInt6181: Int) : SoundChannelMixer() {
    override fun method2083() {
        anAudioDeviceController_6182!!.method77(98.toByte(), anInt6181)
    }

    override fun method2081(): Int {
        return anAudioDeviceController_6182!!.method75((-93).toByte(), anInt6181)
    }

    override fun method2091() {
        anAudioDeviceController_6182!!.method74(anInt6181, 122.toByte())
    }

    @Throws(Exception::class)
    override fun method2095(component: Component?) {
        anAudioDeviceController_6182!!.method78(HslColorConfigStatics.anInt339, NpcEntityUpdater.aBoolean3652, component, 27929)
    }

    override fun method2094() {
        anAudioDeviceController_6182!!.method76(anInt6181, this.anIntArray3603!!)
    }

    init {
        anAudioDeviceController_6182 = privilegedOperationWorker.method2244(21) as AudioDeviceController?
    }

    @Throws(Exception::class)
    override fun method2082(i: Int) {
        require(i <= 32768)
        anAudioDeviceController_6182!!.method79(i, anInt6181, 112.toByte())
    }
}
