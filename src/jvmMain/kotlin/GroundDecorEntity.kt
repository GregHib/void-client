import RSFont.Companion.method2570

/* Class318_Sub1_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class GroundDecorEntity internal constructor(i: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int, bool: Boolean, i_18_: Byte) : SceneEntity() {

    var aBoolean8741: Boolean

    var aShort8743: Short

    var aByte8745: Byte

    var aShort8747: Short

    var aShort8750: Short

    var aShort8751: Short
    override fun method2378(i: Int): Boolean {
        anInt8740++
        if (i != 0) this.aShort8747 = (-75).toShort()
        for (i_0_ in this.aShort8743..this.aShort8751) {
            var i_1_ = this.aShort8750.toInt()
            while ((i_1_ <= this.aShort8747)) {
                val i_2_ = (-ActorEntity.anInt6111 + i_0_ + ActorEntity.anInt10084)
                if (i_2_ >= 0 && (ActorEntity.aBooleanArrayArray1572!!.size > i_2_)) {
                    val i_3_ = (ActorEntity.anInt10084 + (i_1_ - ActorEntity.anInt8502))
                    if (i_3_ >= 0 && (ActorEntity.aBooleanArrayArray1572!!.size > i_3_) && ActorEntity.aBooleanArrayArray1572!![i_2_]!![i_3_]) return true
                }
                i_1_++
            }
        }
        return false
    }

    override fun method2382(i: Byte): Boolean {
        anInt8748++
        if (i > -51) return true
        return SceneModelBuilder.method2499(this.aByte6376.toInt(), this.aShort8747.toInt(), this.aShort8750.toInt(), this.method2394(true), this.aShort8743.toInt(), 116.toByte(), (this.aShort8751).toInt())
    }

    open fun method2409(i: Byte) {
        if (i <= -109) anInt8746++
    }

    init {
        this.anInt6382 = i_12_
        this.aBoolean8741 = bool
        this.aShort8747 = i_17_.toShort()
        this.x = i_11_
        this.aByte8745 = i_18_
        this.aShort8751 = i_15_.toShort()
        this.y = i_13_
        this.plane = i.toByte()
        this.aShort8750 = i_16_.toShort()
        this.aShort8743 = i_14_.toShort()
        this.aByte6376 = i_10_.toByte()
    }

    override fun method2384(class348_sub1s: Array<AbstractTileShape?>?, i: Int): Int {
        anInt8753++
        var i_19_ = 0
        var i_20_ = this.aShort8743.toInt()
        while_104_@ while ((i_20_ <= this.aShort8751)) {
            var i_21_ = this.aShort8750.toInt()
            while (this.aShort8747 >= i_21_) {
                val l = (SceneEntity.aLongArrayArrayArray10431!![this.plane.toInt()]!![i_20_]!![i_21_])
                var l_22_ = 0L
                while_103_@ while (l_22_ <= 48L) {
                    val i_23_ = (l ushr l_22_.toInt() and 0xffffL).toInt()
                    if (i_23_ <= 0) break
                    val class211 = SceneEntity.aSoundEnvelopeArray5993!![-1 + i_23_]
                    var i_24_ = 0
                    while (i_19_ > i_24_) {
                        if (class211!!.aClass348_Sub1_2745 === class348_sub1s!![i_24_]) {
                            l_22_ += 16L
                            continue@while_103_
                        }
                        i_24_++
                    }
                    class348_sub1s!![i_19_++] = class211!!.aClass348_Sub1_2745
                    if (i_19_ == 4) break@while_104_
                    l_22_ += 16L
                }
                i_21_++
            }
            i_20_++
        }
        val i_25_ = 17 % ((i - -14) / 61)
        for (i_26_ in i_19_..3) class348_sub1s!![i_26_] = null
        if (this.aByte8745.toInt() != 0) {
            val i_27_ = (this.aShort8743 + -ActorEntity.anInt6111)
            val i_28_ = (-ActorEntity.anInt8502 + this.aShort8750)
            val i_29_: Int
            val i_30_: Short
            val i_31_: Int
            val i_32_: Short
            if (this.aByte8745.toInt() == 1) {
                if (i_27_ >= i_28_) {
                    i_32_ = this.aShort8743
                    i_30_ = this.aShort8750
                    i_31_ = this.aShort8750 - -1
                    i_29_ = this.aShort8743 - 1
                } else {
                    i_30_ = this.aShort8750
                    i_31_ = this.aShort8750 + -1
                    i_32_ = this.aShort8743
                    i_29_ = 1 + this.aShort8743
                }
            } else if (-i_27_ < i_28_) {
                i_29_ = this.aShort8743 + -1
                i_30_ = this.aShort8750
                i_31_ = -1 + this.aShort8750
                i_32_ = this.aShort8743
            } else {
                i_31_ = this.aShort8750 + 1
                i_32_ = this.aShort8743
                i_30_ = this.aShort8750
                i_29_ = 1 + this.aShort8743
            }
            var i_33_ = 0
            while_106_@ while ( /**/i_19_ > i_33_) {
                var l = (SceneEntity.aLongArrayArrayArray10431!![this.plane.toInt()]!![i_32_.toInt()]!![i_31_])
                while (l != 0L) {
                    val class211 = (SceneEntity.aSoundEnvelopeArray5993!![(-1L + (l and 0xffffL)).toInt()])
                    l = l ushr 16
                    if (class211!!.aClass348_Sub1_2745 === class348_sub1s!![i_33_]) {
                        i_33_++
                        continue@while_106_
                    }
                }
                l = (SceneEntity.aLongArrayArrayArray10431!![this.plane.toInt()]!![i_29_]!![i_30_.toInt()])
                while (l != 0L) {
                    val class211 = (SceneEntity.aSoundEnvelopeArray5993!![(-1L + (0xffffL and l)).toInt()])
                    l = l ushr 16
                    if (class348_sub1s!![i_33_] === class211!!.aClass348_Sub1_2745) {
                        i_33_++
                        continue@while_106_
                    }
                }
                for (i_34_ in i_33_..<i_19_ - 1) class348_sub1s!![i_34_] = class348_sub1s[i_34_ - -1]
                i_19_--
                i_33_++
            }
        }
        return i_19_
    }

    companion object {

        var anInt8739: Int = 0

        var anInt8740: Int = 0

        var anInt8742: Int = 0

        var aNodeDeque_8744: NodeDeque? = NodeDeque()

        var anInt8746: Int = 0

        var anInt8748: Int = 0

        var anInt8749: Int = 0

        var anInt8752: Int = 0

        var anInt8753: Int = 0

        var anInt8754: Int = 0

        var aJs5Archive_8755: Js5Archive? = null

        @JvmStatic
        fun method2408(i: Byte): Int {
            anInt8754++
            val i_4_ = -71 % ((-2 - i) / 44)
            return TileTextureNode.anInt9411++
        }

        @JvmStatic
        fun method2410(i: Byte, i_5_: Int, i_6_: Int): Boolean {
            anInt8752++
            if (i >= -21) return true
            if (!ScrollbarComponent.aBoolean8335) return false
            val i_7_ = i_6_ shr 16
            val i_8_ = i_6_ and 0xffff
            if (WarpTextureNode.aWidgetComponentArrayArray9427!![i_7_] == null || WarpTextureNode.aWidgetComponentArrayArray9427!![i_7_]!![i_8_] == null) return false
            val class46 = WarpTextureNode.aWidgetComponentArrayArray9427!![i_7_]!![i_8_]
            if (i_5_ == -1 && class46!!.anInt774 == 0) {
                var class348_sub42_sub12 = (SourceRowTextureNode.aNodeDeque_9111!!.method1995(4) as? ContactEntry?)
                while (class348_sub42_sub12 != null) {
                    if (class348_sub42_sub12.anInt9608 == 6 || class348_sub42_sub12.anInt9608 == 1011 || (class348_sub42_sub12.anInt9608 == 13) || (class348_sub42_sub12.anInt9608 == 18) || (class348_sub42_sub12.anInt9608 == 16)) {
                        var class46_9_ = method2570(1512932720, (class348_sub42_sub12.anInt9607))
                        while (class46_9_ != null) {
                            if (class46_9_.anInt830 == class46!!.anInt830) return true
                            class46_9_ = WorldMapScene.method1687(class46_9_, 3)
                        }
                    }
                    class348_sub42_sub12 = SourceRowTextureNode.aNodeDeque_9111!!.method1990(56.toByte()) as? ContactEntry?
                }
            } else {
                var class348_sub42_sub12 = (SourceRowTextureNode.aNodeDeque_9111!!.method1995(4) as? ContactEntry?)
                while (class348_sub42_sub12 != null) {
                    if ((class348_sub42_sub12.anInt9602 == i_5_) && (class348_sub42_sub12.anInt9607 == class46!!.anInt830) && ((class348_sub42_sub12.anInt9608) == 6 || (class348_sub42_sub12.anInt9608) == 1011 || (class348_sub42_sub12.anInt9608) == 13 || (class348_sub42_sub12.anInt9608) == 18 || (class348_sub42_sub12.anInt9608) == 16)) return true
                    class348_sub42_sub12 = SourceRowTextureNode.aNodeDeque_9111!!.method1990(93.toByte()) as? ContactEntry?
                }
            }
            return false
        }

        fun method2411(cameraNodeList: CameraNodeList?, i: Int): Int {
            anInt8742++
            if (cameraNodeList == NativeShaderProgram.aCameraNodeList_9773) return 9216
            if (cameraNodeList == ItemModelDefinition.aCameraNodeList_430) return 34065
            if (NpcDefinitionCache.aCameraNodeList_3314 == cameraNodeList) return 34066
            throw IllegalArgumentException()
        }

        @JvmStatic
        fun method2412(bool: Boolean) {
            aJs5Archive_8755 = null
            InboundPacketHeader.aInboundPacketHeader_8756 = null
            aNodeDeque_8744 = null
            if (bool != true) Companion.method2408((-121).toByte())
        }

        @JvmStatic
        fun method2413(i: Int, class348_sub49_sub2: CipheredPacketBuffer): Int {
            anInt8749++
            val i_35_ = class348_sub49_sub2.readBits((-24).toByte(), 2)
            if (i != 1) aNodeDeque_8744 = null
            val i_36_: Int
            if (i_35_ != 0) {
                if (i_35_ == 1) i_36_ = class348_sub49_sub2.readBits((-24).toByte(), 5)
                else if (i_35_ != 2) i_36_ = class348_sub49_sub2.readBits((-24).toByte(), 11)
                else i_36_ = class348_sub49_sub2.readBits((-24).toByte(), 8)
            } else i_36_ = 0
            return i_36_
        }
    }
}
