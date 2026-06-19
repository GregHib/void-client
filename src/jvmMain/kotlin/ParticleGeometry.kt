import SoundBankPatchStatics.method2929

/* Class358 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleGeometry internal constructor(`is`: IntArray?, is_1_: IntArray?, is_2_: IntArray?, fs: Array<FloatArray?>?) {
    var aFloatArrayArray4412: Array<FloatArray?>?
    var anIntArray4414: IntArray?
    var anIntArray4415: IntArray?
    var anIntArray4416: IntArray?

    init {
        try {
            this.anIntArray4414 = is_2_
            this.aFloatArrayArray4412 = fs
            this.anIntArray4415 = is_1_
            this.anIntArray4416 = `is`
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("ew.<init>(" + (if (`is` != null) "{...}" else "null") + ',' + (if (is_1_ != null) "{...}" else "null") + ',' + (if (is_2_ != null) "{...}" else "null") + ',' + (if (fs != null) "{...}" else "null") + ')'))
        }
    }
}
