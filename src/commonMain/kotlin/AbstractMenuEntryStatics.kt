import lang.Class
import lang.ClassNotFoundException
import lang.SecurityException
import lang.jClass
import kotlin.jvm.JvmStatic

object AbstractMenuEntryStatics {

    var aShort1700: Short = 256

    var anInt1701: Int = 0


    var aAbstractModelRenderer_1706: AbstractModelRenderer? = null

    var anInt1710: Int = 0

    var aBoolean1712: Boolean = false

    /*synthetic*/
    var aClass1713: Class<*>? = null

    /*synthetic*/
    var aClass1714: Class<*>? = null

    @JvmStatic
    fun method1030(i: Int) {
        InboundPacketHeader.aInboundPacketHeader_1702 = null
        aAbstractModelRenderer_1706 = null
        if (i > -19) method1034(-89, null, null, -72)
    }

    @JvmStatic
    fun method1032(i: Int): Int {
        anInt1701++
        var i_1_ = 0
        if (i != -1) method1034(117, null, null, 29)
        val fields = (if (aClass1713 != null) aClass1713 else (DisplaySettingsConfig::class.jClass.also { aClass1713 = it }))!!.getDeclaredFields()
        val fields_2_ = fields
        var i_3_ = 0
        while (fields_2_.size > i_3_) {
            val field = fields_2_[i_3_]
            if ((if (aClass1714 != null) aClass1714 else (GraphicsOptionState::class.jClass.also { aClass1714 = it }))!!.isAssignableFrom(field.getType())) i_1_++
            i_3_++
        }
        return i_1_ - -1
    }

    @JvmStatic
    fun method1034(i: Int, class348_sub49: ByteBuffer?, privilegedOperationWorker: PrivilegedOperationWorker?, i_5_: Int) {
        try {
            anInt1710++
            val class348_sub48 = ModelResourceBundle()
            class348_sub48.anInt7126 = class348_sub49!!.readUnsignedByte(255)
            class348_sub48.anInt7130 = class348_sub49.readInt((-126).toByte())
            class348_sub48.anIntArray7132 = IntArray(class348_sub48.anInt7126)
            class348_sub48.aByteArrayArrayArray7128 = arrayOfNulls<Array<ByteArray?>>(class348_sub48.anInt7126)
            class348_sub48.aLinkedQueueNodeArray7127 = arrayOfNulls<LinkedQueueNode>(class348_sub48.anInt7126)
            if (i_5_ > 90) {
                class348_sub48.aLinkedQueueNodeArray7135 = (arrayOfNulls<LinkedQueueNode>(class348_sub48.anInt7126))
                class348_sub48.anIntArray7131 = IntArray(class348_sub48.anInt7126)
                class348_sub48.anIntArray7136 = IntArray(class348_sub48.anInt7126)
                for (i_6_ in 0..<class348_sub48.anInt7126) {
                    try {
                        val i_7_ = class348_sub49.readUnsignedByte(255)
                        if (i_7_ != 0 && i_7_ != 1 && i_7_ != 2) {
                            if (i_7_ == 3 || i_7_ == 4) {
                                val string = class348_sub49.readString(89.toByte())
                                val string_8_ = class348_sub49.readString((-81).toByte())
                                val i_9_ = class348_sub49.readUnsignedByte(255)
                                val strings = arrayOfNulls<String>(i_9_)
                                var i_10_ = 0
                                while (i_9_ > i_10_) {
                                    strings[i_10_] = class348_sub49.readString((-23).toByte())
                                    i_10_++
                                }
                                val `is` = arrayOfNulls<ByteArray>(i_9_)
                                if (i_7_ == 3) {
                                    for (i_11_ in 0..<i_9_) {
                                        val i_12_ = class348_sub49.readInt((-126).toByte())
                                        `is`[i_11_] = ByteArray(i_12_)
                                        class348_sub49.method3389(2147483647, 0, i_12_, `is`[i_11_]!!)
                                    }
                                }
                                class348_sub48.anIntArray7132!![i_6_] = i_7_
                                val var_classes = arrayOfNulls<Class<*>>(i_9_)
                                var i_13_ = 0
                                while ((i_13_ < i_9_)) {
                                    var_classes[i_13_] = (ColorThresholdEffect.method3052(11012, strings[i_13_]))
                                    i_13_++
                                }
                                class348_sub48.aLinkedQueueNodeArray7127!![i_6_] = (privilegedOperationWorker!!.method2230(var_classes, 76, ColorThresholdEffect.method3052(11012, string), string_8_))
                                class348_sub48.aByteArrayArrayArray7128!![i_6_] = `is`
                            }
                        } else {
                            val string = class348_sub49.readString(103.toByte())
                            val string_14_ = class348_sub49.readString(109.toByte())
                            var i_15_ = 0
                            if (i_7_ == 1) i_15_ = class348_sub49.readInt((-126).toByte())
                            class348_sub48.anIntArray7132!![i_6_] = i_7_
                            class348_sub48.anIntArray7136!![i_6_] = i_15_
                            class348_sub48.aLinkedQueueNodeArray7135!![i_6_] = (privilegedOperationWorker!!.method2243(0, string_14_, ColorThresholdEffect.method3052(11012, string)))
                        }
                    } catch (classnotfoundexception: ClassNotFoundException) {
                        class348_sub48.anIntArray7131!![i_6_] = -1
                    } catch (securityexception: SecurityException) {
                        class348_sub48.anIntArray7131!![i_6_] = -2
                    } catch (nullpointerexception: NullPointerException) {
                        class348_sub48.anIntArray7131!![i_6_] = -3
                    } catch (exception: Exception) {
                        class348_sub48.anIntArray7131!![i_6_] = -4
                    } catch (throwable: Throwable) {
                        class348_sub48.anIntArray7131!![i_6_] = -5
                    }
                }
                Client.aNodeDeque_6978!!.method1999(class348_sub48, -20180)
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("mr.E(" + i + ',' + (if (class348_sub49 != null) "{...}" else "null") + ',' + (if (privilegedOperationWorker != null) "{...}" else "null") + ',' + i_5_ + ')'))
        }
    }
}