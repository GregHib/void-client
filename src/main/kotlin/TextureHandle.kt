import java.awt.Component

/*
 * Class193
 */
class TextureHandle internal constructor(private val aClass377_2585: Class377, i: Int, var anInt2584: Int) {
    @Throws(Throwable::class)
    protected fun finalize() {
        anInt2588++
        aClass377_2585.method3971(16386, this.anInt2584)
//        super.finalize()
    }

    companion object {
        var anInt2583: Int = 0
        var anInt2586: Int = 0
        @JvmField
        var aClass351_2587: Class351? = Class351(38, 7)
        var anInt2588: Int = 0
        @JvmField
        var aSocketStreamWorker_2589: SocketStreamWorker? = null
        @JvmField
        var anInt2590: Int = 0

        fun method1439(i: Int, privilegedOperationWorker: PrivilegedOperationWorker?, component: Component?, i_0_: Int, i_1_: Int): SoundChannelMixer {
            var i = i
            try {
                anInt2583++
                check(HslColorConfig.anInt339 != 0)
                require(!(i_0_ < 0 || i_0_ >= 2))
                if (i < 256) i = 256
                try {
                    val soundChannelMixer: SoundChannelMixer = JavaSoundOutput()
                    soundChannelMixer.anInt3620 = i
                    soundChannelMixer.anIntArray3603 = IntArray((if (NpcEntityUpdater.aBoolean3652) 2 else 1) * 256)
                    soundChannelMixer.method2095(component)
                    soundChannelMixer.anInt3613 = (i and 0x3ff.inv()) + 1024
                    if (soundChannelMixer.anInt3613 > 16384) soundChannelMixer.anInt3613 = 16384
                    soundChannelMixer.method2082(soundChannelMixer.anInt3613)
                    if (CameraConfigDefinition.anInt3248 > 0 && ParticleDefLoader.aBackgroundWorkerThread_2462 == null) {
                        ParticleDefLoader.aBackgroundWorkerThread_2462 = BackgroundWorkerThread()
                        ParticleDefLoader.aBackgroundWorkerThread_2462!!.aPrivilegedOperationWorker_3228 = privilegedOperationWorker
                        privilegedOperationWorker!!.method2236(ParticleDefLoader.aBackgroundWorkerThread_2462, -10240, CameraConfigDefinition.anInt3248)
                    }
                    if (ParticleDefLoader.aBackgroundWorkerThread_2462 != null) {
                        require((ParticleDefLoader.aBackgroundWorkerThread_2462!!.aSoundChannelMixerArray3218s[i_0_]) == null)
                        ParticleDefLoader.aBackgroundWorkerThread_2462!!.aSoundChannelMixerArray3218s[i_0_] = soundChannelMixer
                    }
                    if (i_1_ != 7) method1440(107)
                    return soundChannelMixer
                } catch (throwable: Throwable) {
                    try {
                        val class279_sub2 = NativeSoundOutput(privilegedOperationWorker!!, i_0_)
                        class279_sub2.anInt3620 = i
                        class279_sub2.anIntArray3603 = IntArray((if (!NpcEntityUpdater.aBoolean3652) 1 else 2) * 256)
                        class279_sub2.method2095(component)
                        class279_sub2.anInt3613 = 16384
                        class279_sub2.method2082(class279_sub2.anInt3613)
                        if (CameraConfigDefinition.anInt3248 > 0 && ParticleDefLoader.aBackgroundWorkerThread_2462 == null) {
                            ParticleDefLoader.aBackgroundWorkerThread_2462 = BackgroundWorkerThread()
                            ParticleDefLoader.aBackgroundWorkerThread_2462!!.aPrivilegedOperationWorker_3228 = privilegedOperationWorker
                            privilegedOperationWorker!!.method2236(ParticleDefLoader.aBackgroundWorkerThread_2462, -10240, CameraConfigDefinition.anInt3248)
                        }
                        if (ParticleDefLoader.aBackgroundWorkerThread_2462 != null) {
                            require((ParticleDefLoader.aBackgroundWorkerThread_2462!!.aSoundChannelMixerArray3218s[i_0_]) == null)
                            ParticleDefLoader.aBackgroundWorkerThread_2462!!.aSoundChannelMixerArray3218s[i_0_] = class279_sub2
                        }
                        return class279_sub2
                    } catch (throwable_2_: Throwable) {
                        return SoundChannelMixer()
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qr.A(" + i + ',' + (if (privilegedOperationWorker != null) "{...}" else "null") + ',' + (if (component != null) "{...}" else "null") + ',' + i_0_ + ',' + i_1_ + ')'))
            }
        }

        @JvmStatic
        fun method1440(i: Int) {
            aSocketStreamWorker_2589 = null
            val i_4_ = -79 / ((i - -45) / 46)
            aClass351_2587 = null
        }
    }
}
