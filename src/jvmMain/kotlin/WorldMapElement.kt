import WorldMapElementStatics.anInt4633
import WorldMapElementStatics.anInt4634
import WorldMapElementStatics.anInt4639
import WorldMapElementStatics.anInt4641

/* Class5 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class WorldMapElement(js5Archive: Js5Archive?, js5Archive_15_: Js5Archive, worldMapLabel: WorldMapLabel?) : Lifecycle {
    private var anInt4630 = 0
    private val aJs5Archive_4631: Js5Archive = js5Archive_15_
    @JvmField
    var aJs5Archive_4632: Js5Archive? = null
    @JvmField
    var aWorldMapLabel_4635: WorldMapLabel? = null
    private var aFont_4637: Font? = null
    private var aLong4640: Long = 0
    abstract fun method178(i: Int, bool: Boolean, i_0_: Byte, i_1_: Int)

    override fun method8(i: Byte): Boolean {
        val i_2_ = -94 % ((i - 25) / 52)
        anInt4641++
        var bool = true
        if (!this.aJs5Archive_4632!!.method421(false, this.aWorldMapLabel_4635!!.anInt4965)) bool = false
        if (!aJs5Archive_4631!!.method421(false, this.aWorldMapLabel_4635!!.anInt4965)) bool = false
        return bool
    }

    override fun method7(i: Int) {
        anInt4639++
        if (i == 10286) {
            val class143 = RangedGraphicsOptionStateStatics.method1766((-85).toByte(), (this.aWorldMapLabel_4635!!.anInt4965), aJs5Archive_4631)
            aFont_4637 = (FacingDirectionNodeStatics.aRenderer6654!!.method3686(class143, SpriteImageStatics.method1523(this.aJs5Archive_4632!!, (this.aWorldMapLabel_4635!!.anInt4965)), true))
        }
    }

    abstract fun method182(i: Int, i_6_: Int, i_7_: Int, bool: Boolean)

    fun method183(i: Int): Int {
        anInt4633++
        if (i <= 16) this.aWorldMapLabel_4635 = null
        val i_8_ = NpcConfigStatics.aResourceLoaderThread_897!!.method2320(106.toByte())
        var i_9_ = 100 * i_8_
        if (anInt4630 != i_8_ || i_8_ == 0) {
            anInt4630 = i_8_
            aLong4640 = GameClock.method599(-125)
        } else {
            val i_10_ = NpcConfigStatics.aResourceLoaderThread_897!!.method2315(121.toByte())
            if (i_8_ < i_10_) {
                val l = aLong4640 - NpcConfigStatics.aResourceLoaderThread_897!!.method2323(0)
                if (l > 0L) {
                    val l_11_ = (i_10_ - i_8_).toLong() * (10000L * l / i_8_.toLong())
                    val l_12_ = (-aLong4640 + GameClock.method599(-89)) * 10000L
                    if (l_11_ > l_12_) i_9_ = ((i_8_ * 100).toLong() + ((i_10_ + -i_8_).toLong() * (l_12_ * 100L) / l_11_)).toInt()
                    else i_9_ = i_10_ * 100
                }
            }
        }
        return i_9_
    }

    override fun method9(i: Byte, bool: Boolean) {
        if (i.toInt() == -49) {
            anInt4634++
            val i_13_ = ((this.aWorldMapLabel_4635!!.aScreenAnchorAlignment_4968!!.method1607(NpcSpawnDecoder.anInt1524, this.aWorldMapLabel_4635!!.anInt4971, (-123).toByte())) + this.aWorldMapLabel_4635!!.anInt4970)
            val i_14_ = ((this.aWorldMapLabel_4635!!.aTileRenderState_4973!!.method2679(OpenGlRendererStatics.anInt7666, this.aWorldMapLabel_4635!!.anInt4963, i.toInt() xor 0x60b.inv())) + this.aWorldMapLabel_4635!!.anInt4959)
            method178(i_13_, bool, (-84).toByte(), i_14_)
            method182(63, i_14_, i_13_, bool)
            var string = NpcConfigStatics.aResourceLoaderThread_897!!.method2318(i.toInt() xor 0x245b)
            if (-aLong4640 + GameClock.method599(-100) > 10000L) string += " (" + NpcConfigStatics.aResourceLoaderThread_897!!.method2324(i + 149)!!.method525(-117) + ")"
            aFont_4637!!.method2575(115.toByte(), (i_13_ + this.aWorldMapLabel_4635!!.anInt4971 / 2), this.aWorldMapLabel_4635!!.anInt4961, string, -1, (this.aWorldMapLabel_4635!!.anInt4966 + 4 + (i_14_ - -(this.aWorldMapLabel_4635!!.anInt4963 / 2))))
        }
    }

    init {
        try {

            this.aJs5Archive_4632 = js5Archive
            this.aWorldMapLabel_4635 = worldMapLabel
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("gl.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_15_ != null) "{...}" else "null") + ',' + (if (worldMapLabel != null) "{...}" else "null") + ')'))
        }
    }
}
