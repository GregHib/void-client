import VoronoiNoiseTextureNode.Companion.method3060
import kotlin.math.sqrt

/* Class46 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WidgetComponent {

    var anObjectArray671: Array<Any?>? = null

    var anInt672: Int = 0

    var anInt673: Int = 0

    var anInt674: Int = 0

    var anInt675: Int = 0

    var aBoolean676: Boolean = false

    var anIntArray677: IntArray? = null

    var anInt678: Int = 2

    var anObjectArray679: Array<Any?>? = null

    var anObjectArray680: Array<Any?>? = null

    var aByte681: Byte

    var aBoolean682: Boolean = false

    var anObjectArray683: Array<Any?>? = null

    var anObjectArray685: Array<Any?>? = null

    var anIntArray686: IntArray? = null

    var anObjectArray687: Array<Any?>? = null

    var anInt688: Int = 0

    var aBoolean689: Boolean = false

    var anInt690: Int = 1

    var anObjectArray692: Array<Any?>? = null

    var anInt693: Int = 0

    var anInt695: Int

    var anInt696: Int = 0

    var aBoolean697: Boolean = false

    var anInt698: Int = 0

    var anInt699: Int

    var anInt700: Int = 0

    var anObjectArray701: Array<Any?>? = null

    var anInt702: Int = -1

    var anInt703: Int = 0

    var anInt704: Int

    var anInt705: Int

    var anIntArray706: IntArray? = null

    var anIntArray707: IntArray = intArrayOf()

    var anObjectArray708: Array<Any?>? = null

    var anInt709: Int = 0

    var anInt710: Int = 1
    private var aHashtable_711: Hashtable? = null

    var anInt713: Int

    var anObjectArray714: Array<Any?>? = null

    var anInt715: Int = 0

    var anInt716: Int = 100

    var anInt717: Int = 0

    var anInt719: Int

    var aBoolean720: Boolean = false

    var aString721: String? = null

    var anInt723: Int = 0

    var aByte724: Byte

    var anInt725: Int = 0

    var anInt726: Int

    var anObjectArray727: Array<Any?>? = null

    var anInt728: Int = 0

    var anInt729: Int = 0

    var anInt730: Int = 1

    var anIntArray731: IntArray? = null

    var anInt732: Int = 0

    var anInt733: Int = 0

    var anObjectArray734: Array<Any?>? = null

    var aBoolean735: Boolean = false

    var aBoolean737: Boolean = false

    var anInt738: Int = 0

    var anInt739: Int = 0
    var aClass318_Sub10_740: SceneGraphContainer? = null

    var anObjectArray741: Array<Any?>? = null

    var anObjectArray742: Array<Any?>? = null

    var aBoolean744: Boolean = false

    var aBoolean745: Boolean = false

    var aByteArray746: ByteArray = byteArrayOf()

    var anInt747: Int = 0

    var aClass348_Sub44_748: PackedFlagsAccessor?

    var anInt749: Int = 0

    var anInt750: Int = 0

    var anObjectArray751: Array<Any?>? = null

    var aString752: String? = ""

    var anInt753: Int = 0
    var aBoolean754: Boolean = false

    var anInt755: Int = 0

    var anInt756: Int

    var anInt757: Int = 0

    var anInt759: Int = 0

    var anInt760: Int

    var anObjectArray761: Array<Any?>? = null

    var anInt762: Int = 0

    var anObjectArray763: Array<Any?>? = null

    var anObjectArray764: Array<Any?>? = null

    var anInt765: Int = 0

    var aBoolean769: Boolean = false

    var anInt770: Int = 1

    var anIntArray771: IntArray? = null

    var anIntArray772: IntArray? = null

    var anInt773: Int = 0

    var anInt774: Int = 0

    var anInt775: Int = 1

    var aBoolean776: Boolean = false

    var anObjectArray777: Array<Any?>? = null

    var aByte778: Byte

    var anInt779: Int

    var aString780: String? = ""

    var anInt781: Int = 0

    var aWidgetComponent_782: WidgetComponent? = null
    var aBoolean784: Boolean = false

    var anObjectArray785: Array<Any?>? = null

    var anInt786: Int = 0
    var anInt787: Int = 0

    var anInt788: Int = 0

    var anInt789: Int = 0

    var aBoolean790: Boolean = false

    var anInt791: Int = 0

    var aString792: String? = ""

    var aBoolean793: Boolean = false

    var anInt794: Int

    var anInt795: Int = 0

    var anInt796: Int = 0

    var anInt797: Int

    var aWidgetComponentArray798: Array<WidgetComponent?>? = null

    var anInt799: Int = 0

    var anInt800: Int = 0

    var anIntArray801: IntArray? = null

    var anObjectArray803: Array<Any?>? = null

    var anObjectArray805: Array<Any?>? = null

    var anInt806: Int

    var anObjectArray807: Array<Any?>? = null

    var anInt808: Int = 0

    var anInt809: Int = 0

    var aBoolean810: Boolean = false

    var anObjectArray811: Array<Any?>? = null

    var anInt812: Int

    var aBoolean813: Boolean = false

    var anInt814: Int = 0

    var anObjectArray815: Array<Any?>? = null

    var aString816: String? = null

    var aByte817: Byte

    var anIntArray818: IntArray? = null

    var anObjectArray820: Array<Any?>? = null

    var anObjectArray822: Array<Any?>? = null

    var anObjectArray823: Array<Any?>? = null

    var anInt824: Int

    var anInt826: Int = 0

    var anInt828: Int = 0

    var anInt830: Int

    var anIntArray831: IntArray? = null

    var aByteArray832: ByteArray = byteArrayOf()

    var aStringArray833: Array<String?>? = null

    var anInt834: Int

    var anInt835: Int = 0

    var anObjectArray836: Array<Any?>? = null

    var anObjectArray839: Array<Any?>? = null

    var anObjectArray840: Array<Any?>? = null

    var anInt841: Int = 0

    var anInt842: Int = 0

    fun method425(var_renderer: Renderer, i: Byte): Sprite? {
        anInt767++
        var var_sprite = SceneryDetailOptionState.aLruByteCache_6096!!.method583(this.anInt830.toLong(), 119) as Sprite?
        if (var_sprite != null) return var_sprite
        val spriteImage = SpriteImage.method1521(GroundDecorEntity.aJs5Archive_8755!!, this.anInt756, 0)
        if (spriteImage == null) return null
        val i_10_ = (spriteImage.anInt2703 + (spriteImage.anInt2702 + spriteImage.anInt2698))
        val i_11_ = (spriteImage.anInt2700 + (spriteImage.anInt2696 + spriteImage.anInt2701))
        this.anIntArray772 = IntArray(i_11_)
        this.anIntArray677 = IntArray(i_11_)
        var i_12_ = 0
        while ((i_12_ < spriteImage.anInt2696)) {
            var i_13_ = 0
            var i_14_ = 0
            while ((i_14_ < spriteImage.anInt2702)) {
                if ((spriteImage.aByteArray2699[spriteImage.anInt2702 * i_12_ + i_14_]).toInt() != 0) {
                    i_13_ = i_14_
                    break
                }
                i_14_++
            }
            var i_15_ = i_10_
            var i_16_ = i_13_
            while ((i_16_ < spriteImage.anInt2702)) {
                if ((spriteImage.aByteArray2699[spriteImage.anInt2702 * i_12_ + i_16_]).toInt() == 0) {
                    i_15_ = i_16_
                    break
                }
                i_16_++
            }
            this.anIntArray677!![(spriteImage.anInt2700 + i_12_)] = spriteImage.anInt2703 + i_13_
            this.anIntArray772!![(i_12_ + spriteImage.anInt2700)] = i_15_ + -i_13_
            i_12_++
        }
        var_sprite = var_renderer.method3661(i_10_, i_11_, this.anIntArray677, this.anIntArray772)
        SceneryDetailOptionState.aLruByteCache_6096!!.method582(var_sprite, this.anInt830.toLong(), (-104).toByte())
        return var_sprite
    }

    fun method426(var_renderer: Renderer?, i: Byte): RSFont? {
        anInt827++
        val class324 = GlTextureBase.method232(var_renderer, (-53).toByte(), false, this.anInt702)
        if (i.toInt() != 68) method436(-71, -56, -125)
        ContactList.aBoolean9616 = class324 == null
        return class324
    }

    fun method428(i: Int, i_18_: Int, i_19_: Int): Int {
        anInt736++
        if (aHashtable_711 == null) return i
        if (i_19_ >= -124) this.anInt700 = 46
        val class348_sub35 = aHashtable_711!!.method3480(i_18_.toLong(), -6008) as IntKeyNode?
        if (class348_sub35 == null) return i
        return class348_sub35.anInt6976
    }

    fun method429(i: Int, string: String?, i_20_: Int): String? {
        anInt783++
        if (i_20_ != -1) method437(-123, null, null, -35, null)
        if (aHashtable_711 == null) return string
        val class348_sub50 = aHashtable_711!!.method3480(i.toLong(), -6008) as StringCacheNode?
        if (class348_sub50 == null) return string
        return class348_sub50.aString7211
    }

    fun method430(modelDefinitionLoader: ModelDefinitionLoader?, widgetCache: WidgetCache?, i: Int, var_renderer: Renderer?, i_21_: Int, i_22_: Int, modelHeaderCache: ModelHeaderCache?, varResolver: VarResolver?, i_23_: Int, compositeNpcModelBuilder: CompositeNpcModelBuilder?, widgetDefinition: WidgetDefinition?, npcDefinitionCache: NpcDefinitionCache?, bufferedMessageQueue: BufferedMessageQueue?, i_24_: Int): AbstractModel? {
        var i = i
        try {
            anInt684++
            ContactList.aBoolean9616 = false
            if (this.anInt770 == 0) return null
            if (this.anInt770 == 1 && this.anInt753 == -1) return null
            if (this.anInt770 == 1) {
                val i_25_ = i
                if (widgetDefinition != null) i = i or widgetDefinition.method263(i_24_, 106, i_21_, true)
                val l = (this.anInt753 + ((this.anInt770 shl 16) + (var_renderer!!.anInt4567 shl 29))).toLong()
                var abstractModel = ParticleGeometryStatics.aLruByteCache_4417!!.method583(l, -90) as AbstractModel?
                if (abstractModel == null || var_renderer.method3667(abstractModel.ua(), i) != 0) {
                    if (abstractModel != null) i = var_renderer.method3679(i, abstractModel.ua())
                    val class124 = ParticleConfigParser.method2277(0, (ScatterTextureNode.aJs5Archive_9365!!), this.anInt753, -1)
                    if (class124 == null) {
                        ContactList.aBoolean9616 = true
                        return null
                    }
                    if (class124.anInt1830 < 13) class124.method1092(2, 114)
                    abstractModel = var_renderer.method3625(class124, i, Gl3dTexture.anInt8628, 64, 768)
                    ParticleGeometryStatics.aLruByteCache_4417!!.method582(abstractModel, l, (-125).toByte())
                }
                if (widgetDefinition != null) abstractModel = widgetDefinition.method269(-101, abstractModel, i_24_, i_22_, i, i_21_)
                abstractModel!!.s(i_25_)
                return abstractModel
            }
            if (this.anInt770 == 2) {
                val class64 = (bufferedMessageQueue!!.method2079(this.anInt753, -1).method803(varResolver, var_renderer, i_22_, i_24_, widgetDefinition, widgetCache, i_21_, 104, i))
                if (class64 == null) {
                    ContactList.aBoolean9616 = true
                    return null
                }
                return class64
            }
            if (this.anInt770 == 3) {
                if (compositeNpcModelBuilder == null) return null
                val class64 = compositeNpcModelBuilder.method1230(modelHeaderCache, -402058072, widgetCache, modelDefinitionLoader, varResolver, bufferedMessageQueue, i_21_, i_24_, i, widgetDefinition, i_22_, var_renderer)
                if (class64 == null) {
                    ContactList.aBoolean9616 = true
                    return null
                }
                return class64
            }
            if (this.anInt770 == 4) {
                val class213 = modelHeaderCache!!.method1940(i_23_ + -365, this.anInt753)
                val class64 = class213.method1559(compositeNpcModelBuilder, widgetDefinition, var_renderer, i, i_22_, 10, i_21_, 88.toByte(), i_24_)
                if (class64 == null) {
                    ContactList.aBoolean9616 = true
                    return null
                }
                return class64
            }
            if (this.anInt770 == 6) {
                val class64 = (bufferedMessageQueue!!.method2079(this.anInt753, -1).method800(0, null, widgetCache, false, null, 0, npcDefinitionCache, i_21_, widgetDefinition, varResolver, var_renderer, 0, null, i_24_, 0, i, i_22_))
                if (class64 == null) {
                    ContactList.aBoolean9616 = true
                    return null
                }
                return class64
            }
            if (this.anInt770 == 7) {
                if (compositeNpcModelBuilder == null) return null
                val i_26_ = this.anInt753 ushr 16
                val i_27_ = 0xffff and this.anInt753
                val i_28_ = this.anInt779
                val class64 = compositeNpcModelBuilder.method1232(i_24_, i, i_28_, i_27_, widgetCache, modelDefinitionLoader, -15331, i_26_, i_22_, var_renderer, i_21_, widgetDefinition)
                if (class64 == null) {
                    ContactList.aBoolean9616 = true
                    return null
                }
                return class64
            }
            return null
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(
                runtimeexception,
                ("at.G(" + (if (modelDefinitionLoader != null) "{...}" else "null") + ',' + (if (widgetCache != null) "{...}" else "null") + ',' + i + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_21_ + ',' + i_22_ + ',' + (if (modelHeaderCache != null) "{...}" else "null") + ',' + (if (varResolver != null) "{...}" else "null") + ',' + i_23_ + ',' + (if (compositeNpcModelBuilder != null) "{...}" else "null") + ',' + (if (widgetDefinition != null) "{...}" else "null") + ',' + (if (npcDefinitionCache != null) "{...}" else "null") + ',' + (if (bufferedMessageQueue != null) "{...}" else "null") + ',' + i_24_ + ')')
            )
        }
    }

    fun method431(i: Int, i_29_: Int, i_30_: Byte) {
        anInt712++
        if (this.anIntArray706 == null || (i >= this.anIntArray706!!.size)) {
            val `is` = IntArray(1 + i)
            if (this.anIntArray706 != null) {
                var i_31_ = 0
                while ((i_31_ < this.anIntArray706!!.size)) {
                    `is`[i_31_] = this.anIntArray706!![i_31_]
                    i_31_++
                }
                var i_32_ = this.anIntArray706!!.size
                while (i > i_32_) {
                    `is`[i_32_] = -1
                    i_32_++
                }
            }
            this.anIntArray706 = `is`
        }
        this.anIntArray706!![i] = i_29_
        if (i_30_ > -18) this.anInt779 = 13
    }

    private fun method432(class348_sub49: ByteBuffer, i: Int): Array<Any?>? {
        if (i != -1) return null
        anInt691++
        val i_33_ = class348_sub49.readUnsignedByte(255)
        if (i_33_ == 0) return null
        val objects = arrayOfNulls<Any>(i_33_)
        for (i_34_ in 0..<i_33_) {
            val i_35_ = class348_sub49.readUnsignedByte(255)
            if (i_35_ != 0) {
                if (i_35_ == 1) objects[i_34_] = class348_sub49.readString(124.toByte())
            } else objects[i_34_] = class348_sub49.readInt((-126).toByte())
        }
        this.aBoolean682 = true
        return objects
    }

    fun method433(class348_sub49: ByteBuffer, bool: Boolean) {
        anInt743++
        var i = class348_sub49.readUnsignedByte(255)
        if (i == 255) i = -1
        this.anInt774 = class348_sub49.readUnsignedByte(255)
        if ((0x80 and this.anInt774) != 0) {
            this.anInt774 = this.anInt774 and 0x7f
            this.aString721 = class348_sub49.readString((-72).toByte())
        }
        this.anInt765 = class348_sub49.readUnsignedShort(842397944)
        this.anInt788 = class348_sub49.readShort(13638)
        this.anInt739 = class348_sub49.readShort(13638)
        this.anInt842 = class348_sub49.readUnsignedShort(842397944)
        this.anInt728 = class348_sub49.readUnsignedShort(842397944)
        this.aByte778 = class348_sub49.readByte(-96)
        this.aByte724 = class348_sub49.readByte(-87)
        this.aByte817 = class348_sub49.readByte(-86)
        this.aByte681 = class348_sub49.readByte(-108)
        this.anInt834 = class348_sub49.readUnsignedShort(842397944)
        if (this.anInt834 == 65535) this.anInt834 = -1
        else this.anInt834 = ((0xffff.inv() and this.anInt830) + this.anInt834)
        val i_36_ = class348_sub49.readUnsignedByte(255)
        if (i >= 0) this.aBoolean776 = (0x2 and i_36_) != 0
        this.aBoolean813 = (0x1 and i_36_) != 0
        if (this.anInt774 == 0) {
            this.anInt698 = class348_sub49.readUnsignedShort(842397944)
            this.anInt791 = class348_sub49.readUnsignedShort(842397944)
            if (i < 0) this.aBoolean776 = class348_sub49.readUnsignedByte(255) == 1
        }
        if (this.anInt774 == 5) {
            this.anInt756 = class348_sub49.readInt((-126).toByte())
            this.anInt828 = class348_sub49.readUnsignedShort(842397944)
            val i_37_ = class348_sub49.readUnsignedByte(255)
            this.aBoolean697 = (i_37_ and 0x1) != 0
            this.aBoolean745 = (0x2 and i_37_) != 0
            this.anInt696 = class348_sub49.readUnsignedByte(255)
            this.anInt672 = class348_sub49.readUnsignedByte(255)
            this.anInt809 = class348_sub49.readInt((-126).toByte())
            this.aBoolean790 = class348_sub49.readUnsignedByte(255) == 1
            this.aBoolean735 = class348_sub49.readUnsignedByte(255) == 1
            this.anInt749 = class348_sub49.readInt((-126).toByte())
        }
        if (this.anInt774 == 6) {
            this.anInt770 = 1
            this.anInt753 = class348_sub49.readUnsignedShort(842397944)
            if (this.anInt753 == 65535) this.anInt753 = -1
            val i_38_ = class348_sub49.readUnsignedByte(255)
            this.aBoolean784 = (0x2 and i_38_) == 2
            val bool_39_ = (i_38_ and 0x1) == 1
            this.aBoolean689 = (i_38_ and 0x4) == 4
            this.aBoolean754 = (i_38_ and 0x8) == 8
            if (bool_39_) {
                this.anInt688 = class348_sub49.readShort(13638)
                this.anInt799 = class348_sub49.readShort(13638)
                this.anInt757 = class348_sub49.readUnsignedShort(842397944)
                this.anInt675 = class348_sub49.readUnsignedShort(842397944)
                this.anInt717 = class348_sub49.readUnsignedShort(842397944)
                this.anInt716 = class348_sub49.readUnsignedShort(842397944)
            } else if (this.aBoolean784) {
                this.anInt688 = class348_sub49.readShort(13638)
                this.anInt799 = class348_sub49.readShort(13638)
                this.anInt787 = class348_sub49.readShort(13638)
                this.anInt757 = class348_sub49.readUnsignedShort(842397944)
                this.anInt675 = class348_sub49.readUnsignedShort(842397944)
                this.anInt717 = class348_sub49.readUnsignedShort(842397944)
                this.anInt716 = class348_sub49.readShort(13638)
            }
            this.anInt699 = class348_sub49.readUnsignedShort(842397944)
            if (this.anInt699 == 65535) this.anInt699 = -1
            if (this.aByte778.toInt() != 0) this.anInt796 = class348_sub49.readUnsignedShort(842397944)
            if (this.aByte724.toInt() != 0) this.anInt826 = class348_sub49.readUnsignedShort(842397944)
        }
        if (this.anInt774 == 4) {
            this.anInt702 = class348_sub49.readUnsignedShort(842397944)
            if (this.anInt702 == 65535) this.anInt702 = -1
            this.aString792 = class348_sub49.readString(111.toByte())
            this.anInt673 = class348_sub49.readUnsignedByte(255)
            this.anInt762 = class348_sub49.readUnsignedByte(255)
            this.anInt700 = class348_sub49.readUnsignedByte(255)
            this.aBoolean769 = class348_sub49.readUnsignedByte(255) == 1
            this.anInt749 = class348_sub49.readInt((-126).toByte())
            this.anInt696 = class348_sub49.readUnsignedByte(255)
            if (i >= 0) this.anInt773 = class348_sub49.readUnsignedByte(255)
        }
        if (this.anInt774 == 3) {
            this.anInt749 = class348_sub49.readInt((-126).toByte())
            this.aBoolean810 = class348_sub49.readUnsignedByte(255) == 1
            this.anInt696 = class348_sub49.readUnsignedByte(255)
        }
        if (this.anInt774 == 9) {
            this.anInt690 = class348_sub49.readUnsignedByte(255)
            this.anInt749 = class348_sub49.readInt((-126).toByte())
            this.aBoolean744 = class348_sub49.readUnsignedByte(255) == 1
        }
        val i_40_ = class348_sub49.readMedium(-1)
        var i_41_ = class348_sub49.readUnsignedByte(255)
        if (i_41_ != 0) {
            this.aByteArray832 = ByteArray(11)
            this.aByteArray746 = ByteArray(11)
            this.anIntArray707 = IntArray(11)
            while ( /**/i_41_ != 0) {
                val i_42_ = -1 + (i_41_ shr 4)
                i_41_ = i_41_ shl 8 or class348_sub49.readUnsignedByte(255)
                i_41_ = i_41_ and 0xfff
                if (i_41_ == 4095) i_41_ = -1
                val i_43_ = class348_sub49.readByte(-87)
                if (i_43_.toInt() != 0) this.aBoolean676 = true
                val i_44_ = class348_sub49.readByte(-102)
                this.anIntArray707[i_42_] = i_41_
                this.aByteArray746[i_42_] = i_43_
                this.aByteArray832[i_42_] = i_44_
                i_41_ = class348_sub49.readUnsignedByte(255)
            }
        }
        this.aString752 = class348_sub49.readString(82.toByte())
        val i_45_ = class348_sub49.readUnsignedByte(255)
        val i_46_ = 0xf and i_45_
        if (i_46_ > 0) {
            this.aStringArray833 = arrayOfNulls<String>(i_46_)
            for (i_47_ in 0..<i_46_) this.aStringArray833!![i_47_] = class348_sub49.readString((-68).toByte())
        }
        val i_48_ = i_45_ shr 4
        if (i_48_ > 0) {
            val i_49_ = class348_sub49.readUnsignedByte(255)
            this.anIntArray706 = IntArray(1 + i_49_)
            for (i_50_ in this.anIntArray706!!.indices) this.anIntArray706!![i_50_] = -1
            this.anIntArray706!![i_49_] = class348_sub49.readUnsignedShort(842397944)
        }
        if (i_48_ > 1) {
            val i_51_ = class348_sub49.readUnsignedByte(255)
            this.anIntArray706!![i_51_] = class348_sub49.readUnsignedShort(842397944)
        }
        this.aString816 = class348_sub49.readString(95.toByte())
        if (this.aString816 == "") this.aString816 = null
        this.anInt729 = class348_sub49.readUnsignedByte(255)
        this.anInt703 = class348_sub49.readUnsignedByte(255)
        this.anInt797 = class348_sub49.readUnsignedByte(255)
        this.aString780 = class348_sub49.readString((-87).toByte())
        var i_52_ = -1
        if (method3060(i_40_, bool) != 0) {
            i_52_ = class348_sub49.readUnsignedShort(842397944)
            this.anInt824 = class348_sub49.readUnsignedShort(842397944)
            if (i_52_ == 65535) i_52_ = -1
            if (this.anInt824 == 65535) this.anInt824 = -1
            this.anInt695 = class348_sub49.readUnsignedShort(842397944)
            if (this.anInt695 == 65535) this.anInt695 = -1
        }
        if (i >= 0) {
            this.anInt719 = class348_sub49.readUnsignedShort(842397944)
            if (this.anInt719 == 65535) this.anInt719 = -1
        }
        this.aClass348_Sub44_748 = PackedFlagsAccessor(i_40_, i_52_)
        if (i >= 0) {
            val i_53_ = class348_sub49.readUnsignedByte(255)
            var i_54_ = 0
            while (i_53_ > i_54_) {
                val i_55_ = class348_sub49.readMedium(-1)
                val i_56_ = class348_sub49.readInt((-126).toByte())
                aHashtable_711!!.method3483(120.toByte(), i_55_.toLong(), IntKeyNode(i_56_))
                i_54_++
            }
            val i_57_ = class348_sub49.readUnsignedByte(255)
            for (i_58_ in 0..<i_57_) {
                val i_59_ = class348_sub49.readMedium(-1)
                val string = class348_sub49.method3371(-13487)
                aHashtable_711!!.method3483(119.toByte(), i_59_.toLong(), StringCacheNode(string))
            }
        }
        this.anObjectArray815 = method432(class348_sub49, -1)
        this.anObjectArray811 = method432(class348_sub49, -1)
        this.anObjectArray683 = method432(class348_sub49, -1)
        this.anObjectArray680 = method432(class348_sub49, -1)
        this.anObjectArray714 = method432(class348_sub49, -1)
        this.anObjectArray777 = method432(class348_sub49, -1)
        this.anObjectArray751 = method432(class348_sub49, -1)
        this.anObjectArray671 = method432(class348_sub49, -1)
        this.anObjectArray764 = method432(class348_sub49, -1)
        this.anObjectArray741 = method432(class348_sub49, -1)
        if (i >= 0) this.anObjectArray679 = method432(class348_sub49, -1)
        this.anObjectArray839 = method432(class348_sub49, -1)
        this.anObjectArray763 = method432(class348_sub49, -1)
        this.anObjectArray785 = method432(class348_sub49, -1)
        this.anObjectArray742 = method432(class348_sub49, -1)
        this.anObjectArray805 = method432(class348_sub49, -1)
        this.anObjectArray823 = method432(class348_sub49, -1)
        this.anObjectArray692 = method432(class348_sub49, -1)
        this.anObjectArray803 = method432(class348_sub49, -1)
        this.anObjectArray685 = method432(class348_sub49, -1)
        this.anObjectArray708 = method432(class348_sub49, -1)
        this.anIntArray686 = method441(!bool, class348_sub49)
        this.anIntArray771 = method441(!bool, class348_sub49)
        this.anIntArray731 = method441(!bool, class348_sub49)
        this.anIntArray818 = method441(false, class348_sub49)
        this.anIntArray831 = method441(false, class348_sub49)
    }

    fun method434(bool: Boolean) {
        this.anIntArray771 = null
        this.anIntArray731 = null
        this.anObjectArray820 = null
        this.anIntArray686 = null
        this.anObjectArray839 = null
        this.anObjectArray763 = null
        this.anIntArray831 = null
        this.anObjectArray741 = null
        this.anObjectArray764 = null
        this.anObjectArray836 = null
        this.anObjectArray701 = null
        this.anObjectArray751 = null
        this.anObjectArray822 = null
        this.anObjectArray714 = null
        this.anObjectArray671 = null
        this.anObjectArray785 = null
        this.anObjectArray727 = null
        this.anObjectArray811 = null
        this.anObjectArray683 = null
        this.anIntArray818 = null
        this.anObjectArray708 = null
        this.anObjectArray687 = null
        this.anObjectArray803 = null
        this.anObjectArray823 = null
        this.anObjectArray805 = null
        anInt829++
        this.anObjectArray685 = null
        this.anObjectArray815 = null
        this.anObjectArray692 = null
        this.anObjectArray679 = null
        if (bool != false) this.anInt799 = 96
        this.anObjectArray742 = null
        this.anObjectArray840 = null
        this.anObjectArray777 = null
        this.anObjectArray807 = null
        this.anObjectArray761 = null
        this.anObjectArray734 = null
        this.anObjectArray680 = null
    }

    fun method435(i: Int, i_60_: Int) {
        anInt802++
        if (aHashtable_711 != null) {
            val class348 = aHashtable_711!!.method3480(i.toLong(), -6008)
            if (class348 != null) class348.method2715(63.toByte())
        }
    }

    fun method436(i: Int, i_61_: Int, i_62_: Int) {
        anInt694++
        if (aHashtable_711 == null) {
            aHashtable_711 = Hashtable(16)
            aHashtable_711!!.method3483(60.toByte(), i_61_.toLong(), IntKeyNode(i_62_))
        } else if (i < -38) {
            val class348_sub35 = (aHashtable_711!!.method3480(i_61_.toLong(), -6008) as IntKeyNode?)
            if (class348_sub35 == null) aHashtable_711!!.method3483(67.toByte(), i_61_.toLong(), IntKeyNode(i_62_))
            else class348_sub35.anInt6976 = i_62_
        }
    }

    fun method437(i: Int, abstractModel: AbstractModel?, var_renderer: Renderer?, i_63_: Int, abstractCameraTransform: AbstractCameraTransform?) {
        do {
            try {
                if (i != -20154) method438(15, -50, null)
                anInt718++
                abstractModel!!.method620(abstractCameraTransform)
                val class129s = abstractModel.method619()
                val class342s = abstractModel.method604()
                if ((this.aClass318_Sub10_740 == null || this.aClass318_Sub10_740!!.aBoolean6470) && (class129s != null || class342s != null)) this.aClass318_Sub10_740 = SceneGraphContainer.method2526(i_63_, false)
                if (this.aClass318_Sub10_740 == null) break
                this.aClass318_Sub10_740!!.method2536(var_renderer, i_63_.toLong(), class129s, class342s, false)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("at.J(" + i + ',' + (if (abstractModel != null) "{...}" else "null") + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_63_ + ',' + (if (abstractCameraTransform != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    fun method438(i: Int, i_64_: Int, string: String?) {
        if (this.aStringArray833 == null || i >= this.aStringArray833!!.size) {
            val strings = arrayOfNulls<String>(i + 1)
            if (this.aStringArray833 != null) {
                var i_65_ = 0
                while ((this.aStringArray833!!.size > i_65_)) {
                    strings[i_65_] = this.aStringArray833!![i_65_]
                    i_65_++
                }
            }
            this.aStringArray833 = strings
        }
        if (i_64_ > 77) {
            anInt766++
            this.aStringArray833!![i] = string
        }
    }

    fun method439(i: Int, i_66_: Int, string: String?) {
        anInt758++
        if (i != 0) this.anInt756 = -106
        if (aHashtable_711 == null) {
            aHashtable_711 = Hashtable(16)
            aHashtable_711!!.method3483(86.toByte(), i_66_.toLong(), StringCacheNode(string))
        } else {
            val class348_sub50 = (aHashtable_711!!.method3480(i_66_.toLong(), -6008) as StringCacheNode?)
            if (class348_sub50 == null) aHashtable_711!!.method3483(73.toByte(), i_66_.toLong(), StringCacheNode(string))
            else class348_sub50.aString7211 = string
        }
    }

    private fun method441(bool: Boolean, class348_sub49: ByteBuffer): IntArray? {
        anInt722++
        val i = class348_sub49.readUnsignedByte(255)
        if (bool != false) return null
        if (i == 0) return null
        val `is` = IntArray(i)
        for (i_68_ in 0..<i) `is`[i_68_] = class348_sub49.readInt((-126).toByte())
        return `is`
    }

    fun method443(var_renderer: Renderer, i: Byte): AbstractModelRenderer? {
        anInt819++
        ContactList.aBoolean9616 = false
        val l = ((this.anInt809.toLong() shl 40) + (((if (this.aBoolean790) 1L else 0L) shl 38) + ((this.anInt672.toLong() shl 36) + ((if (this.aBoolean745) 1L else 0L) shl 35))) + (this.anInt756.toLong() + ((if (!this.aBoolean735) 0L else 1L) shl 39)))
        var abstractModelRenderer = OutgoingPacketHeader.aLruByteCache_4327!!.method583(l, -71) as AbstractModelRenderer?
        if (i > -27) method434(true)
        if (abstractModelRenderer != null) return abstractModelRenderer
        val spriteImage = SpriteImage.method1521(GroundDecorEntity.aJs5Archive_8755!!, this.anInt756, 0)
        if (spriteImage == null) {
            ContactList.aBoolean9616 = true
            return null
        }
        if (this.aBoolean790) spriteImage.method1514()
        if (this.aBoolean735) spriteImage.method1518()
        if (this.anInt672 > 0) spriteImage.method1513(this.anInt672)
        else if (this.anInt809 != 0) spriteImage.method1513(1)
        if (this.anInt672 >= 1) spriteImage.method1515(1)
        if (this.anInt672 >= 2) spriteImage.method1515(16777215)
        if (this.anInt809 != 0) spriteImage.method1511(0xffffff.inv() or this.anInt809)
        abstractModelRenderer = var_renderer.method3691(spriteImage, true)
        OutgoingPacketHeader.aLruByteCache_4327!!.method580(31902, abstractModelRenderer, l, (abstractModelRenderer!!.method971() * abstractModelRenderer.method969() * 4))
        return abstractModelRenderer
    }

    fun method444(bool: Boolean, spriteStore: SpriteStore?, mapSceneCache: MapSceneCache?): ParticleSystemRenderer? {
        try {
            if (bool != false) method424(122, -123, null, -111, 40, 28, -109, null, 76, 127, -66, 8, -45)
            anInt804++
            if (this.anInt705 == -1) return null
            val l = ((this.anInt693.toLong() shl 16 and (65535L shl 16)) or ((this.anInt733.toLong() shl 32 and (65535L shl 32)) or (this.anInt674.toLong() shl 48 and (65535L shl 48))) or (this.anInt705.toLong() and 0xffffL))
            var particleSystemRenderer = (EdgeDetectTextureNode.aLruByteCache_9171!!.method583(l, 78) as ParticleSystemRenderer?)
            if (particleSystemRenderer == null) {
                particleSystemRenderer = mapSceneCache!!.method823(this.anInt733, this.anInt693, this.anInt674, -43, spriteStore!!, this.anInt705)
                EdgeDetectTextureNode.aLruByteCache_9171!!.method582(particleSystemRenderer, l, (-120).toByte())
            }
            return particleSystemRenderer
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("at.N(" + bool + ',' + (if (spriteStore != null) "{...}" else "null") + ',' + (if (mapSceneCache != null) "{...}" else "null") + ')'))
        }
    }

    init {
        this.anInt695 = -1
        this.anInt726 = -1
        this.anInt704 = -1
        this.anInt756 = -1
        this.anInt699 = -1
        this.anInt713 = -1
        this.anInt797 = InputStream_Sub1.anInt78
        this.anInt779 = -1
        this.anInt719 = -1
        this.aClass348_Sub44_748 = CircleDrawer.aClass348_Sub44_2692
        this.anInt760 = -1
        this.aByte778 = 0.toByte()
        this.aByte724 = 0.toByte()
        this.anInt794 = -1
        this.anInt824 = -1
        this.anInt830 = -1
        this.aByte681 = 0.toByte()
        this.anInt834 = -1
        this.anInt705 = -1
        this.anInt812 = -1
        this.anInt806 = -1
        this.aByte817 = 0.toByte()
    }

    companion object {

        var anInt684: Int = 0

        var anInt691: Int = 0

        var anInt694: Int = 0

        var anInt712: Int = 0

        var anInt718: Int = 0

        var anInt722: Int = 0

        var anInt736: Int = 0

        var anInt743: Int = 0

        var anInt758: Int = 0

        var anInt766: Int = 0

        var anInt767: Int = 0

        var anInt783: Int = 0

        var anInt802: Int = 0

        var anInt804: Int = 0

        var anInt819: Int = 0
        var aByteArray821: ByteArray? = ByteArray(32896)

        var anInt825: Int = 0

        var anInt827: Int = 0

        var anInt829: Int = 0

        var aSingletonMarker_838: SingletonMarker?

        var anInt768: Int = 0
        @JvmStatic
        fun method424(i: Int, i_0_: Int, var_renderer: Renderer?, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, `is`: Array<Array<ByteArray?>?>?, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) {
            var i_4_ = i_4_
            var i_7_ = i_7_
            try {
                anInt768++
                if (i_7_ != i_1_ && i_3_ != 0) {
                    if (i_7_ == 9) {
                        i_7_ = 1
                        i_4_ = i_4_ - -1 and 0x3
                    }
                    if (i_7_ == 10) {
                        i_4_ = 3 + i_4_ and 0x3
                        i_7_ = 1
                    }
                    if (i_7_ == 11) {
                        i_4_ = i_4_ + 3 and 0x3
                        i_7_ = 8
                    }
                    var_renderer!!.Q(i_6_, i_9_, i_5_, i_8_, i_0_, i, `is`!![i_7_ - 1]!![i_4_], i_3_, i_2_)
                }
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("at.S(" + i + ',' + i_0_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
            }
        }

        fun method440(i: Int, i_67_: Byte) {
            BlankTextureNode.anIntArray9259 = IntArray(i)
            if (i_67_.toInt() == -61) {
                ConnectionStateType.anIntArray1045 = IntArray(i)
                LinkedListIteratorStatics.anIntArray2117 = IntArray(i)
                anInt825++
                CharCodeMap.anIntArray1127 = IntArray(i)
                FileIoUtil.anIntArray4097 = IntArray(i)
            }
        }

        @JvmStatic
        fun method442(i: Byte) {
            if (i <= -8) {
                aSingletonMarker_838 = null
                aByteArray821 = null
            }
        }

        init {
            var i = 0
            for (i_69_ in 0..255) {
                var i_70_ = 0
                while (i_69_ >= i_70_) {
                    aByteArray821!![i++] = (255.0 / sqrt((((i_69_ * i_69_) + (i_70_ * i_70_) - -65535).toFloat() / 65535.0f).toDouble())).toInt().toByte()
                    i_70_++
                }
            }
            aSingletonMarker_838 = SingletonMarker()
        }
    }
}
