/* Class318_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class SceneEntity : SceneLinkedListNode() {

    var aByte6376: Byte = 0

    var x: Int = 0

    var aClass318_Sub1_6379: SceneEntity? = null

    var anInt6380: Int = 0

    var plane: Byte = 0

    var anInt6382: Int = 0

    var anInt6386: Int = 0

    var aBoolean6387: Boolean = false

    var y: Int = 0

    var anInt6389: Int = 0

    var aBoolean6391: Boolean = false
    abstract fun method2376(i: Int): Boolean

    abstract fun method2377(i: Byte): Boolean

    abstract fun method2378(i: Int): Boolean

    abstract fun method2379(i: Int): Int

    abstract fun method2380(var_renderer: Renderer?, i: Int, bool: Boolean, class318_sub1_0_: SceneEntity?, i_1_: Int, i_2_: Byte, i_3_: Int)

    abstract fun method2381(var_renderer: Renderer?, i: Int): CircleHitbox?

    abstract fun method2382(i: Byte): Boolean

    abstract fun method2384(class348_sub1s: Array<AbstractTileShape?>?, i: Int): Int

    abstract fun method2386(i: Int, var_renderer: Renderer?): SceneEntityModel?

    abstract fun method2387(var_renderer: Renderer?, i: Int)

    abstract fun method2388(i: Int): Boolean

    fun method2390(class348_sub1s: Array<AbstractTileShape?>, i: Int, i_30_: Int, i_31_: Int): Int {
        anInt6384++
        if (i_30_ != -2) this.aByte6376 = 33.toByte()
        val l = (aLongArrayArrayArray10431!![this.plane.toInt()]!![i]!![i_31_])
        var l_32_ = 0L
        var i_33_ = 0
        while ( /**/l_32_ <= 48) {
            val i_34_ = (0xffffL and (l shr l_32_.toInt())).toInt()
            if (i_34_ <= 0) break
            class348_sub1s[i_33_++] = (SceneEntity.aSoundEnvelopeArray5993!![i_34_ + -1]!!.aClass348_Sub1_2745)
            l_32_ += 16L
        }
        for (i_35_ in i_33_..3) class348_sub1s[i_35_] = null
        return i_33_
    }

    abstract fun method2391(var_renderer: Renderer?, i: Int, i_36_: Int, i_37_: Int): Boolean

    abstract fun method2392(bool: Boolean)

    open fun method2393(i: Int): Int {
        anInt6378++
        return 0
    }

    abstract fun method2394(bool: Boolean): Int

    companion object {

        var anInt6378: Int = 0

        var anInt6384: Int = 0
        var aLongArrayArrayArray10431: Array<Array<LongArray?>?>? = null
        var aSoundEnvelopeArray5993: Array<SoundEnvelope?>? = null
    }
}
