/**
 * JVM software-mixed audio output. The javax.sound.sampled device handling now lives behind the
 * commonMain [AudioSink] interface (impl: [JavaSoundAudioSink]); this class is the thin adapter that
 * drives that sink from the Class279 synth engine. Behaviour is unchanged from the former inline
 * SourceDataLine implementation.
 */
class Class279_Sub1 : Class279() {
    private val sink: AudioSink = AudioSinks.create()

    override fun method2091() {
        sink.close()
    }

    @Throws(Exception::class)
    override fun method2082(i: Int) {
        sink.open(i)
    }

    override fun method2095(component: Any?) {
        sink.init(Class22.anInt339, Class282.aBoolean3652)
    }

    override fun method2081(): Int {
        return sink.available()
    }

    @Throws(Exception::class)
    override fun method2083() {
        sink.flush()
    }

    override fun method2094() {
        sink.write(this.anIntArray3603!!, 256, Class282.aBoolean3652)
    }
}
