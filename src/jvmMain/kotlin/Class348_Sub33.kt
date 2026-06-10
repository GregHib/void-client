import java.io.*
import java.lang.reflect.Field
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method

class Class348_Sub33 internal constructor(@JvmField var anInt6958: Int, `is`: ByteArray?) : Class348() {
    var aBooleanArray6954: BooleanArray?
    var anIntArray6957: IntArray?
    var anIntArrayArray6959: Array<IntArray?>?
    var anIntArray6960: IntArray?
    var anInt6965: Int

    init {
        val class348_sub49 = Class348_Sub49(`is`)
        this.anInt6965 = class348_sub49.readUnsignedByte(255)
        this.anIntArrayArray6959 = arrayOfNulls<IntArray>(this.anInt6965)
        this.anIntArray6957 = IntArray(this.anInt6965)
        this.anIntArray6960 = IntArray(this.anInt6965)
        this.aBooleanArray6954 = BooleanArray(this.anInt6965)
        var i_8_ = 0
        while ((i_8_ < this.anInt6965)) {
            this.anIntArray6957!![i_8_] = class348_sub49.readUnsignedByte(255)
            if (this.anIntArray6957!![i_8_] == 6) this.anIntArray6957!![i_8_] = 2
            i_8_++
        }
        var i_9_ = 0
        while ((i_9_ < this.anInt6965)) {
            this.aBooleanArray6954!![i_9_] = class348_sub49.readUnsignedByte(255) == 1
            i_9_++
        }
        var i_10_ = 0
        while ((i_10_ < this.anInt6965)) {
            this.anIntArray6960!![i_10_] = class348_sub49.readUnsignedShort(842397944)
            i_10_++
        }
        var i_11_ = 0
        while ((this.anInt6965 > i_11_)) {
            this.anIntArrayArray6959!![i_11_] = IntArray(class348_sub49.readUnsignedByte(255))
            i_11_++
        }
        for (i_12_ in 0..<this.anInt6965) {
            var i_13_ = 0
            while ((i_13_ < this.anIntArrayArray6959!![i_12_]!!.size)) {
                this.anIntArrayArray6959!![i_12_]!![i_13_] = class348_sub49.readUnsignedByte(255)
                i_13_++
            }
        }
    }

    companion object {
        var aClass152_6955: Class152? = Class152()
        var anInt6956: Int = 0
        var anInt6961: Int = 0
        @JvmField
        var aByteArrayArrayArray6962: Array<Array<ByteArray?>?>? = null
        var aLong6963: Long = 0L
        var anInt6964: Int = 0
        var aLong6966: Long
        @JvmField
        var anInt6967: Int = 0

        @JvmStatic
        fun method3024(i: Int) {
            aClass152_6955 = null
            if (i >= -74) anInt6967 = 12
            aByteArrayArrayArray6962 = null
        }

        fun method3025(i: Byte, class348_sub49_sub2: Class348_Sub49_Sub2) {
            anInt6961++
            val class348_sub48 = Class348_Sub35.Companion.aClass262_6978!!.method1995(4) as Class348_Sub48?
            if (class348_sub48 != null) {
                var bool = false
                for (i_0_ in 0..<class348_sub48.anInt7126) {
                    if (class348_sub48.aClass144Array7135!![i_0_] != null) {
                        if ((class348_sub48.aClass144Array7135!![i_0_]!!.anInt1997) == 2) class348_sub48.anIntArray7131!![i_0_] = -5
                        if ((class348_sub48.aClass144Array7135!![i_0_]!!.anInt1997) == 0) bool = true
                    }
                    if (class348_sub48.aClass144Array7127!![i_0_] != null) {
                        if ((class348_sub48.aClass144Array7127!![i_0_]!!.anInt1997) == 2) class348_sub48.anIntArray7131!![i_0_] = -6
                        if ((class348_sub48.aClass144Array7127!![i_0_]!!.anInt1997) == 0) bool = true
                    }
                }
                if (i < 37) aLong6966 = -3L
                if (!bool) {
                    val i_1_ = class348_sub49_sub2.anInt7197
                    class348_sub49_sub2.writeInt(94.toByte(), class348_sub48.anInt7130)
                    var i_2_ = 0
                    while ((i_2_ < class348_sub48.anInt7126)) {
                        if (class348_sub48.anIntArray7131!![i_2_] == 0) {
                            try {
                                val i_3_ = (class348_sub48.anIntArray7132!![i_2_])
                                if (i_3_ == 0) {
                                    val field = ((class348_sub48.aClass144Array7135!![i_2_]!!.anObject1998) as Field?)
                                    val i_5_ = field!!.getInt(null)
                                    class348_sub49_sub2.writeByte(false, 0)
                                    class348_sub49_sub2.writeInt(108.toByte(), i_5_)
                                } else if (i_3_ == 1) {
                                    val field = ((class348_sub48.aClass144Array7135!![i_2_]!!.anObject1998) as Field?)
                                    field!!.setInt(null, (class348_sub48.anIntArray7136!![i_2_]))
                                    class348_sub49_sub2.writeByte(false, 0)
                                } else if (i_3_ == 2) {
                                    val field = ((class348_sub48.aClass144Array7135!![i_2_]!!.anObject1998) as Field?)
                                    val i_4_ = field!!.getModifiers()
                                    class348_sub49_sub2.writeByte(false, 0)
                                    class348_sub49_sub2.writeInt(122.toByte(), i_4_)
                                }
                                if (i_3_ == 3) {
                                    val method = ((class348_sub48.aClass144Array7127!![i_2_]!!.anObject1998) as Method?)
                                    val `is` = (class348_sub48.aByteArrayArrayArray7128!![i_2_])!!
                                    val objects = arrayOfNulls<Any>(`is`.size)
                                    var i_6_ = 0
                                    while (`is`.size > i_6_) {
                                        val objectinputstream = (ObjectInputStream(ByteArrayInputStream(`is`[i_6_])))
                                        objects[i_6_] = objectinputstream.readObject()
                                        i_6_++
                                    }
                                    val `object` = method!!.invoke(null, *objects)
                                    if (`object` != null) {
                                        if (`object` is Number) {
                                            class348_sub49_sub2.writeByte(false, 1)
                                            class348_sub49_sub2.writeLong(`object`.toLong(), (-81).toByte())
                                        } else if (`object` is String) {
                                            class348_sub49_sub2.writeByte(false, 2)
                                            class348_sub49_sub2.writeString((-5).toByte(), `object`)
                                        } else class348_sub49_sub2.writeByte(false, 4)
                                    } else class348_sub49_sub2.writeByte(false, 0)
                                } else if (i_3_ == 4) {
                                    val method = ((class348_sub48.aClass144Array7127!![i_2_]!!.anObject1998) as Method?)
                                    val i_7_ = method!!.getModifiers()
                                    class348_sub49_sub2.writeByte(false, 0)
                                    class348_sub49_sub2.writeInt(95.toByte(), i_7_)
                                }
                            } catch (classnotfoundexception: ClassNotFoundException) {
                                class348_sub49_sub2.writeByte(false, -10)
                            } catch (invalidclassexception: InvalidClassException) {
                                class348_sub49_sub2.writeByte(false, -11)
                            } catch (streamcorruptedexception: StreamCorruptedException) {
                                class348_sub49_sub2.writeByte(false, -12)
                            } catch (optionaldataexception: OptionalDataException) {
                                class348_sub49_sub2.writeByte(false, -13)
                            } catch (illegalaccessexception: IllegalAccessException) {
                                class348_sub49_sub2.writeByte(false, -14)
                            } catch (illegalargumentexception: IllegalArgumentException) {
                                class348_sub49_sub2.writeByte(false, -15)
                            } catch (invocationtargetexception: InvocationTargetException) {
                                class348_sub49_sub2.writeByte(false, -16)
                            } catch (securityexception: SecurityException) {
                                class348_sub49_sub2.writeByte(false, -17)
                            } catch (ioexception: IOException) {
                                class348_sub49_sub2.writeByte(false, -18)
                            } catch (nullpointerexception: NullPointerException) {
                                class348_sub49_sub2.writeByte(false, -19)
                            } catch (exception: Exception) {
                                class348_sub49_sub2.writeByte(false, -20)
                            } catch (throwable: Throwable) {
                                class348_sub49_sub2.writeByte(false, -21)
                            }
                        } else class348_sub49_sub2.writeByte(false, (class348_sub48.anIntArray7131!![i_2_]))
                        i_2_++
                    }
                    class348_sub49_sub2.method3344(i_1_, false)
                    class348_sub48.method2715(46.toByte())
                }
            }
        }

        init {
            aLong6966 = 0L
        }
    }
}
