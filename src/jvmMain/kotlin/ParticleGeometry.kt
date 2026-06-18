
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
            throw TextureLoadException.method2929(runtimeexception, ("ew.<init>(" + (if (`is` != null) "{...}" else "null") + ',' + (if (is_1_ != null) "{...}" else "null") + ',' + (if (is_2_ != null) "{...}" else "null") + ',' + (if (fs != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt4411: Int = 0
        var anInt4413: Int = 0
        var aLruByteCache_4417: LruByteCache? = LruByteCache(50)
        var aFontMetaRef_4418: FontMetaRef? = FontMetaRef(33, 8)

        @JvmStatic
        fun method3488(i: Int) {
            if (i < 25) method3489(30)
            aFontMetaRef_4418 = null
            aLruByteCache_4417 = null
        }

        fun method3489(i: Int) {
            LruByteCache.aRenderer1098!!.xa((IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub10_7232!!.method1764(-32350).toFloat() * 0.1f + 0.7f) * 1.1523438f)
            anInt4413++
            LruByteCache.aRenderer1098!!.ZA(LocDefinitionCache.anInt3439, 0.69921875f, 1.2f, -200.0f, -240.0f, -200.0f)
            LruByteCache.aRenderer1098!!.L(LocDefinitionCache.anInt3444, -1, 0)
            val i_0_ = -35 / ((45 - i) / 44)
            LruByteCache.aRenderer1098!!.method3653(ParameterizedText.aCircleRasterizer_9571)
        }
    }
}
