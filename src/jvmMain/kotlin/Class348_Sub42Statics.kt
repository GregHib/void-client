/**
 * JVM-bound static state and helpers split out of [Class348_Sub42]'s companion so the bare
 * [Class348_Sub42] linked-list node could move to commonMain.
 *
 * [aClass2_7058], [method3161], and [method3163] depend on JVM game globals (Class2, Class154,
 * Class259, Class348_Sub17, Class328_Sub1). They stay on JVM; only the counters anInt7059/7061/7062/7064
 * and the list-manipulation instance methods are portable. Members keep their original names and
 * @JvmStatic so call sites read `Class348_Sub42Statics.methodNNNN(...)`.
 */
object Class348_Sub42Statics {
    var aClass2_7058: Class2?

    @JvmStatic
    fun method3161(i: Int) {
        if (i != 0) method3161(-27)
        aClass2_7058 = null
    }

    @JvmStatic
    fun method3163(i: Byte) {
        Class328_Sub1.anInt6513 = 0
        Class348_Sub42.anInt7062++
        if (i.toInt() == -114) {
            for (i_0_ in 0..2047) {
                Class154.aClass348_Sub49Array2105!![i_0_] = null
                Class259.aByteArray3300!![i_0_] = 1.toByte()
                Class348_Sub17.aClass359Array6802!![i_0_] = null
            }
        }
    }

    init {
        aClass2_7058 = Class2()
    }
}

actual fun class348Sub42Method3163(i: Byte) = Class348_Sub42Statics.method3163(i)
