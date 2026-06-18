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
            val class143 = RangedGraphicsOptionState.method1766((-85).toByte(), (this.aWorldMapLabel_4635!!.anInt4965), aJs5Archive_4631)
            aFont_4637 = (FacingDirectionNode.aRenderer6654!!.method3686(class143, SpriteImage.method1523(this.aJs5Archive_4632!!, (this.aWorldMapLabel_4635!!.anInt4965)), true))
        }
    }

    abstract fun method182(i: Int, i_6_: Int, i_7_: Int, bool: Boolean)

    fun method183(i: Int): Int {
        anInt4633++
        if (i <= 16) this.aWorldMapLabel_4635 = null
        val i_8_ = NpcConfig.aResourceLoaderThread_897!!.method2320(106.toByte())
        var i_9_ = 100 * i_8_
        if (anInt4630 != i_8_ || i_8_ == 0) {
            anInt4630 = i_8_
            aLong4640 = GameClock.method599(-125)
        } else {
            val i_10_ = NpcConfig.aResourceLoaderThread_897!!.method2315(121.toByte())
            if (i_8_ < i_10_) {
                val l = aLong4640 - NpcConfig.aResourceLoaderThread_897!!.method2323(0)
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
            val i_14_ = ((this.aWorldMapLabel_4635!!.aTileRenderState_4973!!.method2679(OpenGlRenderer.anInt7666, this.aWorldMapLabel_4635!!.anInt4963, i.toInt() xor 0x60b.inv())) + this.aWorldMapLabel_4635!!.anInt4959)
            method178(i_13_, bool, (-84).toByte(), i_14_)
            method182(63, i_14_, i_13_, bool)
            var string = NpcConfig.aResourceLoaderThread_897!!.method2318(i.toInt() xor 0x245b)
            if (-aLong4640 + GameClock.method599(-100) > 10000L) string += " (" + NpcConfig.aResourceLoaderThread_897!!.method2324(i + 149)!!.method525(-117) + ")"
            aFont_4637!!.method2575(115.toByte(), (i_13_ + this.aWorldMapLabel_4635!!.anInt4971 / 2), this.aWorldMapLabel_4635!!.anInt4961, string, -1, (this.aWorldMapLabel_4635!!.anInt4966 + 4 + (i_14_ - -(this.aWorldMapLabel_4635!!.anInt4963 / 2))))
        }
    }

    init {
        try {

            this.aJs5Archive_4632 = js5Archive
            this.aWorldMapLabel_4635 = worldMapLabel
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("gl.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_15_ != null) "{...}" else "null") + ',' + (if (worldMapLabel != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4627: Int = 0
        @JvmField
        var anInt4628: Int = 0
        @JvmField
        var anInt4629: Int = 0
        @JvmField
        var anInt4633: Int = 0
        @JvmField
        var anInt4634: Int = 0
        @JvmField
        var aLruByteCache_4636: LruByteCache? = LruByteCache(64)
        @JvmField
        var anInt4638: Int = 0
        @JvmField
        var anInt4639: Int = 0
        @JvmField
        var anInt4641: Int = 0

        @JvmStatic
        fun method179(i: Int, class348_sub49: Buffer): WorldMapAreaLabel {
            anInt4629++
            val class369 = PcmStreamBuffer.method2834((-127).toByte(), class348_sub49)
            val i_3_ = class348_sub49.readInt((-126).toByte())
            val i_4_ = class348_sub49.readInt((-126).toByte())
            if (i != 16533) aLruByteCache_4636 = null
            val i_5_ = class348_sub49.readUnsignedShort(842397944)
            return WorldMapAreaLabel(class369.aScreenAnchorAlignment_4968, class369.aTileRenderState_4973, class369.anInt4970, class369.anInt4959, class369.anInt4971, class369.anInt4963, class369.anInt4966, class369.anInt4965, class369.anInt4961, i_3_, i_4_, i_5_)
        }

        @JvmStatic
        fun method180(i: Int) {
            aLruByteCache_4636 = null
            if (i != -19960) method180(-71)
        }

        @JvmStatic
        fun method181(bool: Boolean, npc: Npc?) {
            if (bool != true) method180(54)
            anInt4627++
            var class348_sub9 = Client.aNodeDeque_5185!!.method1995(4) as? CharacterRenderState?
            while (class348_sub9 != null) {
                if ((class348_sub9.aNpc_6691) == npc) {
                    if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                        SpriteDefinition.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6676!!)
                        class348_sub9.aClass348_Sub16_Sub5_6676 = null
                    }
                    class348_sub9.method2715(27.toByte())
                    break
                }
                class348_sub9 = (Client.aNodeDeque_5185!!.method1990(78.toByte()) as? CharacterRenderState?)
            }
        }
    }
}
