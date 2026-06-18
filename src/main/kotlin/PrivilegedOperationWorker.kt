import FileStoreLocator.method1464
import FileStoreLocator.method1466
import Class62.method599
import java.awt.*
import java.awt.datatransfer.Transferable
import java.io.DataInputStream
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.lang.reflect.Method
import java.net.InetAddress
import java.net.Socket
import java.net.URL
import java.util.*
import kotlin.concurrent.Volatile

/*
 * Class297
 */
class PrivilegedOperationWorker internal constructor(i: Int, aString3789: String?, i_22_: Int, bool: Boolean) : Runnable {
    private var aNativeCursorCallback__3776: NativeCursorCallback? = null
    @JvmField
    var aBoolean3777: Boolean = false
    @JvmField
    var aRandomAccessFileOnDisk_3779: RandomAccessFileOnDisk? = null
    @JvmField
    var aRandomAccessFileOnDisk_3785: RandomAccessFileOnDisk? = null
    private var anObject3787: Any? = null
    @JvmField
    var aRandomAccessFileOnDisk_3788: RandomAccessFileOnDisk? = null
    private val aThread3790: Thread
    private var anObject3791: Any? = null
    private var anObject3793: Any? = null
    @JvmField
    var aBoolean3794: Boolean = false
    @JvmField
    var aRandomAccessFileOnDiskArray3795: Array<RandomAccessFileOnDisk?>? = null
    private var aLinkedQueueNode_3797: LinkedQueueNode? = null
    private var aLinkedQueueNode_3798: LinkedQueueNode? = null
    var anEventQueue3799: EventQueue? = null
    private var aBoolean3801 = false
    private var aDirectDrawDisplayMode_3802: DirectDrawDisplayMode? = null

    fun method2229(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Byte): LinkedQueueNode {
        if (i_3_.toInt() != -11) aLong3781 = 34L
        return method2246(8, (i_1_ shl 16) - -i, 6, i_0_ + (i_2_ shl 16), null)
    }

    fun method2230(var_classes: Array<Class<*>?>?, i: Int, var_class: Class<*>?, string: String?): LinkedQueueNode? {
        if (i < 49) return null
        return method2246(8, 0, 8, 0, arrayOf<Any?>(var_class, string, var_classes))
    }

    fun method2232(i: Int, i_4_: Int): LinkedQueueNode {
        if (i <= 20) method2236(null, -123, -128)
        return method2246(8, 0, 3, i_4_, null)
    }

    fun method2233(i: Byte, string: String?, bool: Boolean): LinkedQueueNode? {
        if (i.toInt() != -46) return null
        if (!bool) return method2246(8, 0, 13, 0, string)
        return method2246(8, 0, 12, 0, string)
    }

    override fun run() {
        while (true) {
            val linkedQueueNode: LinkedQueueNode?
            synchronized(this) {
                while (true) {
                    if (aBoolean3801) return
                    if (aLinkedQueueNode_3797 != null) {
                        linkedQueueNode = aLinkedQueueNode_3797
                        aLinkedQueueNode_3797 = aLinkedQueueNode_3797!!.aLinkedQueueNode_1995
                        if (aLinkedQueueNode_3797 == null) aLinkedQueueNode_3798 = null
                        break
                    }
                    try {
                        (this as Object).wait()
                    } catch (interruptedexception: InterruptedException) {
                        /* empty */
                    }
                }
            }
            try {
                val i = linkedQueueNode!!.anInt1994
                if (i == 1) {
                    if (aLong3781 > method599(-53)) throw IOException()
                    if (Loader.debug) {
                        println("Connect: " + linkedQueueNode.anObject1996 + " " + linkedQueueNode.anInt2000)
                    }
                    linkedQueueNode.anObject1998 = Socket(InetAddress.getByName((linkedQueueNode.anObject1996) as String?), linkedQueueNode.anInt2000)
                } else if (i == 22) {
                    if (aLong3781 > method599(-92)) throw IOException()
                    try {
                        linkedQueueNode.anObject1998 = GlDisplayListFont.method593(linkedQueueNode.anInt2000, (-90).toByte(), (linkedQueueNode.anObject1996 as String?))!!.method2050(-112)
                    } catch (ioexception_sub1: IOException_Sub1) {
                        linkedQueueNode.anObject1998 = ioexception_sub1.message
                        throw ioexception_sub1
                    }
                } else if (i == 2) {
                    val thread = Thread((linkedQueueNode.anObject1996) as Runnable?)
                    thread.setDaemon(true)
                    thread.start()
                    thread.setPriority(linkedQueueNode.anInt2000)
                    linkedQueueNode.anObject1998 = thread
                } else if (i == 4) {
                    if (method599(-73) < aLong3781) throw IOException()
                    linkedQueueNode.anObject1998 = DataInputStream(((linkedQueueNode.anObject1996) as URL).openStream())
                } else if (i == 8) {
                    val objects = (linkedQueueNode.anObject1996 as Array<Any?>?)
                    if (this.aBoolean3777 && ((objects!![0] as Class<*>).getClassLoader() == null)) throw SecurityException()
                    linkedQueueNode.anObject1998 = ((objects!![0] as Class<*>).getDeclaredMethod(objects[1] as String?, *(objects[2] as Array<Class<*>?>)))
                } else if (i == 9) {
                    val objects = (linkedQueueNode.anObject1996 as Array<Any?>?)
                    if (this.aBoolean3777 && ((objects!![0] as Class<*>).getClassLoader() == null)) throw SecurityException()
                    linkedQueueNode.anObject1998 = ((objects!![0] as Class<*>).getDeclaredField(objects[1] as String?))
                } else if (i == 18) {
                    val clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()
                    linkedQueueNode.anObject1998 = clipboard.getContents(null)
                } else if (i == 19) {
                    val transferable = ((linkedQueueNode.anObject1996) as Transferable?)
                    val clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()
                    clipboard.setContents(transferable, null)
                } else if (this.aBoolean3777) {
                    if (i == 3) {
                        if (aLong3781 > method599(-123)) throw IOException()
                        val string = (((0xff and (linkedQueueNode.anInt2000 shr 24))).toString() + "." + (0xff and (linkedQueueNode.anInt2000 shr 16)) + "." + ((linkedQueueNode.anInt2000 shr 8) and 0xff) + "." + (0xff and linkedQueueNode.anInt2000))
                        linkedQueueNode.anObject1998 = InetAddress.getByName(string).getHostName()
                    } else if (i == 21) {
                        if (method599(-82) < aLong3781) throw IOException()
                        linkedQueueNode.anObject1998 = InetAddress.getByName((linkedQueueNode.anObject1996) as String?).getAddress()
                    } else if (i != 5) {
                        if (i == 6) {
                            val frame = (Frame("Jagex Full Screen"))
                            linkedQueueNode.anObject1998 = frame
                            frame.setResizable(false)
                            if (this.aBoolean3794) aDirectDrawDisplayMode_3802!!.method1146((linkedQueueNode.anInt2000 and 0xffff), (linkedQueueNode.anInt1999 shr 16), (linkedQueueNode.anInt2000 ushr 16), -43, 0xffff and (linkedQueueNode.anInt1999), frame)
                            else (anObject3793 as Class7).method209(frame, ((linkedQueueNode.anInt2000) ushr 16), (0xffff and (linkedQueueNode.anInt2000)), ((linkedQueueNode.anInt1999) shr 16), ((linkedQueueNode.anInt1999) and 0xffff))
                        } else if (i == 7) {
                            if (this.aBoolean3794) aDirectDrawDisplayMode_3802!!.method1147(((linkedQueueNode.anObject1996) as Frame?), 8)
                            else (anObject3793 as Class7).method211()
                        } else if (i == 12) {
                            val randomAccessFileOnDisk: RandomAccessFileOnDisk? = (method2241(((linkedQueueNode.anObject1996) as String?), 12606, Companion.aString3789, anInt3792))
                            linkedQueueNode.anObject1998 = randomAccessFileOnDisk
                        } else if (i == 13) {
                            val randomAccessFileOnDisk: RandomAccessFileOnDisk? = (method2241(((linkedQueueNode.anObject1996) as String?), 12606, "", anInt3792))
                            linkedQueueNode.anObject1998 = randomAccessFileOnDisk
                        } else if ((this.aBoolean3777) && i == 14) {
                            val i_5_ = (linkedQueueNode.anInt2000)
                            val i_6_ = (linkedQueueNode.anInt1999)
                            if (this.aBoolean3794) aNativeCursorCallback__3776!!.method3621(i_5_, 115.toByte(), i_6_)
                            else (anObject3791 as RobotMouseController).method1280((i_5_), (i_6_))
                        } else if ((this.aBoolean3777) && (i == 15)) {
                            val bool = ((linkedQueueNode.anInt2000) != 0)
                            val component = ((linkedQueueNode.anObject1996) as Component?)
                            if (this.aBoolean3794) aNativeCursorCallback__3776!!.method3622(bool, 13259, component!!)
                            else (anObject3791 as RobotMouseController).method1281(component, (bool))
                        } else if (!(this.aBoolean3794) && (i == 17)) {
                            val objects = ((linkedQueueNode.anObject1996) as Array<Any?>?)
                            (anObject3791 as RobotMouseController).method1282((objects!![0] as java.awt.Component?)!!, objects[1] as IntArray?, (linkedQueueNode.anInt2000), (linkedQueueNode.anInt1999), objects[2] as Point?)
                        } else if (i == 16) {
                            try {
                                if (!aString3803.startsWith("win")) throw Exception()
                                val string = ((linkedQueueNode.anObject1996) as String?)
                                if (!(string!!.startsWith("http://")) && !(string.startsWith("https://"))) throw Exception()
                                val string_7_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"
                                var i_8_ = 0
                                while ((i_8_ < (string.length))) {
                                    if ((string_7_.indexOf(string.get(i_8_))) == -1) throw Exception()
                                    i_8_++
                                }
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string + "\"")
                                linkedQueueNode.anObject1998 = null
                            } catch (exception: Exception) {
                                linkedQueueNode.anObject1998 = exception
                                throw exception
                            }
                        } else throw Exception("")
                    } else if (!this.aBoolean3794) linkedQueueNode.anObject1998 = (anObject3793 as Class7).method210()
                    else linkedQueueNode.anObject1998 = aDirectDrawDisplayMode_3802!!.method1145(true)
                } else throw Exception("")
                linkedQueueNode.anInt1997 = 1
            } catch (throwable: Throwable) {
                if (Loader.trace) {
                    throwable.printStackTrace()
                }
                linkedQueueNode!!.anInt1997 = 2
            }
            synchronized(linkedQueueNode) {
                (linkedQueueNode as Object).notify()
            }
        }
    }

    fun method2234(i: Byte) {
        synchronized(this) {
            aBoolean3801 = true
            (this as Object).notifyAll()
        }
        try {
            aThread3790.join()
            if (i.toInt() != 103) this.aRandomAccessFileOnDisk_3788 = null
        } catch (interruptedexception: InterruptedException) {
            /* empty */
        }
        if (this.aRandomAccessFileOnDisk_3785 != null) {
            try {
                this.aRandomAccessFileOnDisk_3785!!.method1657(false)
            } catch (ioexception: IOException) {
                /* empty */
            }
        }
        if (this.aRandomAccessFileOnDisk_3779 != null) {
            try {
                this.aRandomAccessFileOnDisk_3779!!.method1657(false)
            } catch (ioexception: IOException) {
                /* empty */
            }
        }
        if (this.aRandomAccessFileOnDiskArray3795 != null) {
            for (i_9_ in this.aRandomAccessFileOnDiskArray3795!!.indices) {
                if (this.aRandomAccessFileOnDiskArray3795!![i_9_] != null) {
                    try {
                        this.aRandomAccessFileOnDiskArray3795!![i_9_]!!.method1657(false)
                    } catch (ioexception: IOException) {
                        /* empty */
                    }
                }
            }
        }
        do {
            if (this.aRandomAccessFileOnDisk_3788 != null) {
                try {
                    this.aRandomAccessFileOnDisk_3788!!.method1657(false)
                } catch (ioexception: IOException) {
                    break
                }
                break
            }
        } while (false)
    }

    fun method2235(bool: Boolean, i: Int, string: String?, i_10_: Int): LinkedQueueNode? {
        if (i_10_ != 28225) return null
        return method2246(i_10_ xor 0x6e49, 0, if (bool) 22 else 1, i, string)
    }

    fun method2236(runnable: Runnable?, i: Int, i_11_: Int): LinkedQueueNode {
        return method2246(8, 0, 2, i_11_, runnable)
    }

    fun method2237(url: URL?, i: Int): LinkedQueueNode? {
        if (i != 8362) return null
        return method2246(8, 0, 4, 0, url)
    }

    fun method2238(i: Int, `is`: IntArray?, i_12_: Int, point: Point?, component: Component?, i_13_: Int): LinkedQueueNode {
        if (i_12_ != 17) method2240(-75)
        return method2246(i_12_ + -9, i, 17, i_13_, arrayOf<Any?>(component, `is`, point))
    }

    fun method2239(i: Int) {
        if (i > -90) this.aRandomAccessFileOnDisk_3779 = null
        aLong3781 = 5000L + method599(-107)
    }

    fun method2240(i: Int): LinkedQueueNode? {
        if (i != 972476528) return null
        return method2246(8, 0, 5, 0, null)
    }

    fun method2242(`is`: ByteArray, i: Byte, file: File): Boolean {
        try {
            val fileoutputstream = FileOutputStream(file)
            fileoutputstream.write(`is`, 0, `is`.size)
            if (i.toInt() != -104) return false
            fileoutputstream.close()
            return true
        } catch (ioexception: IOException) {
            throw RuntimeException()
        }
    }

    fun method2243(i: Int, string: String?, var_class: Class<*>?): LinkedQueueNode {
        if (i != 0) method2239(-13)
        return method2246(8, 0, 9, 0, arrayOf<Any?>(var_class, string))
    }

    fun method2244(i: Int): Any? {
        if (i != 21) method2237(null, 23)
        return anObject3787
    }

    fun method2245(string: String?, i: Int): LinkedQueueNode? {
        if (i != 16) return null
        return method2246(i + -8, 0, 16, 0, string)
    }

    private fun method2246(i: Int, i_19_: Int, i_20_: Int, i_21_: Int, `object`: Any?): LinkedQueueNode {
        val linkedQueueNode = LinkedQueueNode()
        linkedQueueNode.anObject1996 = `object`
        linkedQueueNode.anInt1999 = i_19_
        linkedQueueNode.anInt1994 = i_20_
        linkedQueueNode.anInt2000 = i_21_
        synchronized(this) {
            if (aLinkedQueueNode_3798 == null) {
                aLinkedQueueNode_3797 = linkedQueueNode
                aLinkedQueueNode_3798 = aLinkedQueueNode_3797
            } else {
                aLinkedQueueNode_3798!!.aLinkedQueueNode_1995 = linkedQueueNode
                aLinkedQueueNode_3798 = linkedQueueNode
            }
            (this as Object).notify()
            if (i != 8) method2235(false, 76, null, 37)
        }
        return linkedQueueNode
    }

    fun method2247(i: Int): Boolean {
        if (i != -4) method2245(null, 50)
        if (!this.aBoolean3777) return false
        if (this.aBoolean3794) {
            return aDirectDrawDisplayMode_3802 != null
        }
        return anObject3793 != null
    }

    fun method2248(i: Byte, frame: Frame?): LinkedQueueNode? {
        if (i.toInt() != 89) return null
        return method2246(i.toInt() xor 0x51, 0, 7, 0, frame)
    }

    init {
        Companion.aString3789 = aString3789
        this.aBoolean3777 = bool
        aString3796 = "1.1"
        aString3782 = "Unknown"
        anInt3792 = i
        try {
            aString3782 = System.getProperty("java.vendor")
            aString3796 = System.getProperty("java.version")
        } catch (exception: Exception) {
            /* empty */
        }
        if (aString3782!!.lowercase(Locale.getDefault()).indexOf("microsoft") != -1) this.aBoolean3794 = true
        try {
            aString3784 = System.getProperty("os.name")
        } catch (exception: Exception) {
            aString3784 = "Unknown"
        }
        aString3803 = aString3784!!.lowercase(Locale.getDefault())
        try {
            aString3780 = System.getProperty("os.arch").lowercase(Locale.getDefault())
        } catch (exception: Exception) {
            aString3780 = ""
        }
        try {
            aString3778 = System.getProperty("os.version").lowercase(Locale.getDefault())
        } catch (exception: Exception) {
            aString3778 = ""
        }
        try {
            aString3800 = System.getProperty("user.home")
            if (aString3800 != null) aString3800 += "/"
        } catch (exception: Exception) {
            /* empty */
        }
        if (aString3800 == null) aString3800 = "~/"
        try {
            this.anEventQueue3799 = Toolkit.getDefaultToolkit().getSystemEventQueue()
        } catch (throwable: Throwable) {
            /* empty */
        }
        if (!this.aBoolean3794) {
            try {
                aMethod3783 = Component::class.java.getDeclaredMethod("setFocusTraversalKeysEnabled", java.lang.Boolean.TYPE)
            } catch (exception: Exception) {
                /* empty */
            }
            try {
                aMethod3786 = (Container::class.java.getDeclaredMethod("setFocusCycleRoot", java.lang.Boolean.TYPE))
            } catch (exception: Exception) {
                /* empty */
            }
        }
        FileStoreLocator.method1465((-121).toByte(), Companion.aString3789, anInt3792)
        if (this.aBoolean3777) {
            this.aRandomAccessFileOnDisk_3788 = RandomAccessFileOnDisk(method1464(0, anInt3792, "random.dat", null), "rw", 25L)
            this.aRandomAccessFileOnDisk_3785 = RandomAccessFileOnDisk(method1466(-2, "main_file_cache.dat2"), "rw", 209715200L)
            this.aRandomAccessFileOnDisk_3779 = RandomAccessFileOnDisk(method1466(-2, "main_file_cache.idx255"), "rw", 1048576L)
            this.aRandomAccessFileOnDiskArray3795 = arrayOfNulls<RandomAccessFileOnDisk>(i_22_)
            var i_23_ = 0
            while (i_22_ > i_23_) {
                this.aRandomAccessFileOnDiskArray3795!![i_23_] = RandomAccessFileOnDisk(method1466(-2, ("main_file_cache.idx" + i_23_)), "rw", 1048576L)
                i_23_++
            }
            if (this.aBoolean3794) {
                try {
                    anObject3787 = DirectSoundAudioChannel()
                } catch (throwable: Throwable) {
                    /* empty */
                }
            }
            try {
                if (!this.aBoolean3794) anObject3793 = Class7()
                else aDirectDrawDisplayMode_3802 = DirectDrawDisplayMode()
            } catch (throwable: Throwable) {
                /* empty */
            }
            try {
                if (!this.aBoolean3794) anObject3791 = RobotMouseController()
                else aNativeCursorCallback__3776 = NativeCursorCallback()
            } catch (throwable: Throwable) {
                /* empty */
            }
        }
        if (this.aBoolean3777 && !this.aBoolean3794) {
            var threadgroup = Thread.currentThread().getThreadGroup()
            var threadgroup_24_ = threadgroup!!.getParent()
            while (threadgroup_24_ != null) {
                threadgroup = threadgroup_24_
                threadgroup_24_ = threadgroup.getParent()
            }
            val threads = arrayOfNulls<Thread>(1000)
            threadgroup.enumerate(threads)
            var i_25_ = 0
            while (threads.size > i_25_) {
                if (threads[i_25_] != null && threads[i_25_]!!.getName().startsWith("AWT")) threads[i_25_]!!.setPriority(1)
                i_25_++
            }
        }
        aBoolean3801 = false
        aThread3790 = Thread(this)
        aThread3790.setPriority(10)
        aThread3790.setDaemon(true)
        aThread3790.start()
    }

    companion object {
        var aString3778: String? = null
        @JvmField
        var aString3780: String? = null

        @Volatile
        private var aLong3781 = 0L
        @JvmField
        var aString3782: String? = null
        @JvmField
        var aMethod3783: Method? = null
        private var aString3784: String? = null
        var aMethod3786: Method? = null
        var anInt3792: Int = -1
        var aString3796: String? = null
        private var aString3800: String? = null
        lateinit var aString3803: String
        private var aString3789: String? = null

        /*synthetic*/
        var aClass3804: Class<*>? = null

        /*synthetic*/
        var aClass3805: Class<*>? = null

        /*synthetic*/
        var aClass3806: Class<*>? = null

        /*synthetic*/
        var aClass3807: Class<*>? = null

        fun method2231(string: String?, i: Int): RandomAccessFileOnDisk? {
            if (i != -1141472112) return null
            return method2241(string, 12606, Companion.aString3789, anInt3792)
        }

        private fun method2241(string: String?, i: Int, string_14_: String?, i_15_: Int): RandomAccessFileOnDisk? {
            val string_16_: String?
            if (i_15_ == 33) string_16_ = "jagex_" + string_14_ + "_preferences" + string + "_rc.dat"
            else if (i_15_ != 34) string_16_ = "jagex_" + string_14_ + "_preferences" + string + ".dat"
            else string_16_ = "jagex_" + string_14_ + "_preferences" + string + "_wip.dat"
            if (i != 12606) return null
            val strings = arrayOf<String>("c:/rscache/", "/rscache/", aString3800!!, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "")
            var i_17_ = 0
            while (strings.size > i_17_) {
                val string_18_ = strings[i_17_]
                if (string_18_.length <= 0 || File(string_18_).exists()) {
                    try {
                        val randomAccessFileOnDisk = RandomAccessFileOnDisk(File(string_18_, string_16_), "rw", 10000L)
                        return randomAccessFileOnDisk
                    } catch (exception: Exception) {
                        /* empty */
                    }
                }
                i_17_++
            }
            return null
        }
    }
}
