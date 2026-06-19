import TooltipComponentRendererStatics.anInt4642
import TooltipComponentRendererStatics.anInt4644
import TooltipComponentRendererStatics.anInt4647

/* Class67 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TooltipComponentRenderer internal constructor(js5Archive: Js5Archive?, js5Archive_3_: Js5Archive?, heapInfoRecord: HeapInfoRecord?) : Lifecycle {
    private val aHeapInfoRecord_4646: HeapInfoRecord?
    private var aFont_4649: Font? = null
    private val aJs5Archive_4650: Js5Archive?
    private val aJs5Archive_4651: Js5Archive?

    override fun method9(i: Byte, bool: Boolean) {
        if (bool) {
            val i_0_ = ((aHeapInfoRecord_4646!!.aScreenAnchorAlignment_4948!!.method1607(NpcSpawnDecoder.anInt1524, aHeapInfoRecord_4646.anInt4931, (-119).toByte())) + aHeapInfoRecord_4646.anInt4947)
            val i_1_ = ((aHeapInfoRecord_4646.aTileRenderState_4945!!.method2679(OpenGlRendererStatics.anInt7666, aHeapInfoRecord_4646.anInt4936, i + 1644)) + aHeapInfoRecord_4646.anInt4932)
            aFont_4649!!.method2584(null, aHeapInfoRecord_4646.anInt4937, aHeapInfoRecord_4646.anInt4940, null, aHeapInfoRecord_4646.anInt4935, aHeapInfoRecord_4646.anInt4946, aHeapInfoRecord_4646.anInt4936, null, i_1_, 0, 0, aHeapInfoRecord_4646.anInt4931, i_0_, false, aHeapInfoRecord_4646.anInt4943, aHeapInfoRecord_4646.aString4942)
        }
        if (i.toInt() == -49) anInt4642++
    }

    override fun method8(i: Byte): Boolean {
        anInt4644++
        var bool = true
        if (!aJs5Archive_4650!!.method421(false, aHeapInfoRecord_4646!!.anInt4944)) bool = false
        if (!aJs5Archive_4651!!.method421(false, aHeapInfoRecord_4646.anInt4944)) bool = false
        val i_2_ = -53 % ((i - 25) / 52)
        return bool
    }

    override fun method7(i: Int) {
        anInt4647++
        val class143 = RangedGraphicsOptionStateStatics.method1766((-45).toByte(), aHeapInfoRecord_4646!!.anInt4944, aJs5Archive_4651!!)
        if (i == 10286) aFont_4649 = (FacingDirectionNodeStatics.aRenderer6654!!.method3686(class143, SpriteImageStatics.method1523(aJs5Archive_4650!!, aHeapInfoRecord_4646.anInt4944), true))
    }

    init {
        try {
            aJs5Archive_4651 = js5Archive_3_
            aHeapInfoRecord_4646 = heapInfoRecord
            aJs5Archive_4650 = js5Archive
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("kd.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_3_ != null) "{...}" else "null") + ',' + (if (heapInfoRecord != null) "{...}" else "null") + ')'))
        }
    }
}
