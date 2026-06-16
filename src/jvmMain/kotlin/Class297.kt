import Class62.method599
import java.awt.*
import java.awt.datatransfer.Transferable
import java.lang.reflect.Method
import java.net.InetAddress
import java.net.Socket
import java.util.*
import kotlin.concurrent.Volatile

class Class297 internal constructor(i: Int, aString3789: String?, i_22_: Int, bool: Boolean) : Runnable {
    var httpFetcher: HttpFetch = JvmHttpFetch
    private var aCallback_Sub1_3776: Callback_Sub1? = null
    var aBoolean3777: Boolean = false
    internal val aCacheStorage: CacheStorageFactory = CacheStorageFactories.create()
    var aClass234_3779: CacheStore? = null
    var aClass234_3785: CacheStore? = null
    private var anObject3787: Any? = null
    var aClass234_3788: CacheStore? = null
    private lateinit var aThread3790: WorkerHandle
    private var anObject3791: Any? = null
    private var anObject3793: Any? = null
    var aBoolean3794: Boolean = false
    var aClass234Array3795: Array<CacheStore?>? = null
    private var aClass144_3797: Class144? = null
    private var aClass144_3798: Class144? = null
    var anEventQueue3799: EventQueue? = null
    private var aBoolean3801 = false
    private var aClass134_3802: Class134? = null

    fun method2229(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Byte): Class144 {
        if (i_3_.toInt() != -11) aLong3781 = 34L
        return method2246(8, (i_1_ shl 16) - -i, 6, i_0_ + (i_2_ shl 16), null)
    }

    fun method2230(var_classes: Array<Class<*>?>?, i: Int, var_class: Class<*>?, string: String?): Class144? {
        if (i < 49) return null
        return method2246(8, 0, 8, 0, arrayOf<Any?>(var_class, string, var_classes))
    }

    fun method2232(i: Int, i_4_: Int): Class144 {
        if (i <= 20) method2236(null, -123, -128)
        return method2246(8, 0, 3, i_4_, null)
    }

    fun method2233(i: Byte, string: String?, bool: Boolean): Class144? {
        if (i.toInt() != -46) return null
        if (!bool) return method2246(8, 0, 13, 0, string)
        return method2246(8, 0, 12, 0, string)
    }

    override fun run() {
        while (true) {
            val class144: Class144?
            withLock(this) {
                while (true) {
                    if (aBoolean3801) return
                    if (aClass144_3797 != null) {
                        class144 = aClass144_3797
                        aClass144_3797 = aClass144_3797!!.aClass144_1995
                        if (aClass144_3797 == null) aClass144_3798 = null
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
                val i = class144!!.anInt1994
                if (i == 1) {
                    if (aLong3781 > method599(-53)) throw IOException()
                    if (Loader.debug) {
                        println("Connect: " + class144.anObject1996 + " " + class144.anInt2000)
                    }
                    class144.anObject1998 = Class238_Sub1(Socket(InetAddress.getByName((class144.anObject1996) as String?), class144.anInt2000), class144.anInt2000)
                } else if (i == 22) {
                    if (aLong3781 > method599(-92)) throw IOException()
                    try {
                        class144.anObject1998 = Class61.method593(class144.anInt2000, (-90).toByte(), (class144.anObject1996 as String?))!!.method2050(-112)
                    } catch (ioexception_sub1: IOException_Sub1) {
                        class144.anObject1998 = ioexception_sub1.message
                        throw ioexception_sub1
                    }
                } else if (i == 23) {
                    // Direct game connection, wrapped as a Class238 (portable connection
                    // contract) on the privileged thread so consumers never see a raw Socket.
                    if (aLong3781 > method599(-53)) throw IOException()
                    if (Loader.debug) {
                        println("Connect: " + class144.anObject1996 + " " + class144.anInt2000)
                    }
                    val socket = Socket(InetAddress.getByName((class144.anObject1996) as String?), class144.anInt2000)
                    class144.anObject1998 = Class348_Sub23_Sub3.method2982(socket, 24.toByte(), GAME_CONNECTION_KEY)
                } else if (i == 24) {
                    // Proxy game connection, wrapped as a Class238 (see type 23).
                    if (aLong3781 > method599(-92)) throw IOException()
                    try {
                        class144.anObject1998 = Class61.method593(class144.anInt2000, (-90).toByte(), (class144.anObject1996 as String?))!!.method2050(-112)!!
                    } catch (ioexception_sub1: IOException_Sub1) {
                        class144.anObject1998 = ioexception_sub1.message
                        throw ioexception_sub1
                    }
                } else if (i == 2) {
                    val runnable = (class144.anObject1996) as Runnable?
                    class144.anObject1998 = Workers.start(
                        { runnable?.run() },
                        daemon = true,
                        priority = class144.anInt2000
                    )
                } else if (i == 4) {
                    if (method599(-73) < aLong3781) throw IOException()
                    class144.anObject1998 = httpFetcher.fetch((class144.anObject1996) as String)
                } else if (i == 8) {
                    val objects = (class144.anObject1996 as Array<Any?>?)
                    if (this.aBoolean3777 && ((objects!![0] as Class<*>).getClassLoader() == null)) throw SecurityException()
                    class144.anObject1998 = ((objects!![0] as Class<*>).getDeclaredMethod(objects[1] as String?, *(objects[2] as Array<Class<*>?>)))
                } else if (i == 9) {
                    val objects = (class144.anObject1996 as Array<Any?>?)
                    if (this.aBoolean3777 && ((objects!![0] as Class<*>).getClassLoader() == null)) throw SecurityException()
                    class144.anObject1998 = ((objects!![0] as Class<*>).getDeclaredField(objects[1] as String?))
                } else if (i == 18) {
                    val clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()
                    class144.anObject1998 = clipboard.getContents(null)
                } else if (i == 19) {
                    val transferable = ((class144.anObject1996) as Transferable?)
                    val clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()
                    clipboard.setContents(transferable, null)
                } else if (this.aBoolean3777) {
                    if (i == 3) {
                        if (aLong3781 > method599(-123)) throw IOException()
                        val string = (((0xff and (class144.anInt2000 shr 24))).toString() + "." + (0xff and (class144.anInt2000 shr 16)) + "." + ((class144.anInt2000 shr 8) and 0xff) + "." + (0xff and class144.anInt2000))
                        class144.anObject1998 = InetAddress.getByName(string).getHostName()
                    } else if (i == 21) {
                        if (method599(-82) < aLong3781) throw IOException()
                        class144.anObject1998 = InetAddress.getByName((class144.anObject1996) as String?).getAddress()
                    } else if (i != 5) {
                        if (i == 6) {
                            val frame = (Frame("Jagex Full Screen"))
                            class144.anObject1998 = frame
                            frame.setResizable(false)
                            if (this.aBoolean3794) aClass134_3802!!.method1146((class144.anInt2000 and 0xffff), (class144.anInt1999 shr 16), (class144.anInt2000 ushr 16), -43, 0xffff and (class144.anInt1999), frame)
                            else (anObject3793 as Class7).method209(frame, ((class144.anInt2000) ushr 16), (0xffff and (class144.anInt2000)), ((class144.anInt1999) shr 16), ((class144.anInt1999) and 0xffff))
                        } else if (i == 7) {
                            // anObject1996 holds the raw Frame from task-6; Class7 only needs
                            // the GraphicsDevice (stored at construction) so the Frame arg is unused.
                            if (this.aBoolean3794) aClass134_3802!!.method1147(((class144.anObject1996) as? java.awt.Frame), 8)
                            else (anObject3793 as Class7).method211()
                        } else if (i == 12) {
                            val class234: CacheStore? = (method2241(((class144.anObject1996) as String?), 12606, Companion.aString3789, anInt3792))
                            class144.anObject1998 = class234
                        } else if (i == 13) {
                            val class234: CacheStore? = (method2241(((class144.anObject1996) as String?), 12606, "", anInt3792))
                            class144.anObject1998 = class234
                        } else if ((this.aBoolean3777) && i == 14) {
                            val i_5_ = (class144.anInt2000)
                            val i_6_ = (class144.anInt1999)
                            if (this.aBoolean3794) aCallback_Sub1_3776!!.method3621(i_5_, 115.toByte(), i_6_)
                            else (anObject3791 as Class165).method1280((i_5_), (i_6_))
                        } else if ((this.aBoolean3777) && (i == 15)) {
                            val bool = ((class144.anInt2000) != 0)
                            val component = ((class144.anObject1996) as Component?)
                            if (this.aBoolean3794) aCallback_Sub1_3776!!.method3622(bool, 13259, component!!)
                            else (anObject3791 as Class165).method1281(component, (bool))
                        } else if (!(this.aBoolean3794) && (i == 17)) {
                            val objects = ((class144.anObject1996) as Array<Any?>?)
                            (anObject3791 as Class165).method1282((objects!![0] as java.awt.Component?)!!, objects[1] as IntArray?, (class144.anInt2000), (class144.anInt1999), objects[2] as Point?)
                        } else if (i == 16) {
                            try {
                                if (!aString3803.startsWith("win")) throw Exception()
                                val string = ((class144.anObject1996) as String?)
                                if (!(string!!.startsWith("http://")) && !(string.startsWith("https://"))) throw Exception()
                                val string_7_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"
                                var i_8_ = 0
                                while ((i_8_ < (string.length))) {
                                    if ((string_7_.indexOf(string.get(i_8_))) == -1) throw Exception()
                                    i_8_++
                                }
                                RuntimeInfoProvider.instance.exec("cmd /c start \"j\" \"" + string + "\"")
                                class144.anObject1998 = null
                            } catch (exception: Exception) {
                                class144.anObject1998 = exception
                                throw exception
                            }
                        } else throw Exception("")
                    } else if (!this.aBoolean3794) class144.anObject1998 = (anObject3793 as Class7).method210()
                    else class144.anObject1998 = aClass134_3802!!.method1145(true)
                } else throw Exception("")
                class144.anInt1997 = 1
            } catch (throwable: Throwable) {
                if (Loader.trace) {
                    throwable.printStackTrace()
                }
                class144!!.anInt1997 = 2
            }
            withLock(class144) {
                (class144 as Object).notify()
            }
        }
    }

    fun method2234(i: Byte) {
        withLock(this) {
            aBoolean3801 = true
            (this as Object).notifyAll()
        }
        aThread3790.join()
        if (i.toInt() != 103) this.aClass234_3788 = null
        if (this.aClass234_3785 != null) {
            try {
                this.aClass234_3785!!.method1657(false)
            } catch (ioexception: IOException) {
                /* empty */
            }
        }
        if (this.aClass234_3779 != null) {
            try {
                this.aClass234_3779!!.method1657(false)
            } catch (ioexception: IOException) {
                /* empty */
            }
        }
        if (this.aClass234Array3795 != null) {
            for (i_9_ in this.aClass234Array3795!!.indices) {
                if (this.aClass234Array3795!![i_9_] != null) {
                    try {
                        this.aClass234Array3795!![i_9_]!!.method1657(false)
                    } catch (ioexception: IOException) {
                        /* empty */
                    }
                }
            }
        }
        do {
            if (this.aClass234_3788 != null) {
                try {
                    this.aClass234_3788!!.method1657(false)
                } catch (ioexception: IOException) {
                    break
                }
                break
            }
        } while (false)
    }

    fun method2235(bool: Boolean, i: Int, string: String?, i_10_: Int): Class144? {
        if (i_10_ != 28225) return null
        return method2246(i_10_ xor 0x6e49, 0, if (bool) 22 else 1, i, string)
    }

    /**
     * Like [method2235], but the resulting [Class144.anObject1998] is a fully-wrapped
     * [Class238] connection rather than a raw java.net.Socket. Used by BOTH the
     * game-connect path (Class88/Class348_Sub5) and JS5 (Client/Class202) via request
     * types 23 (direct) / 24 (proxy), so no consumer ever sees a raw Socket.
     *
     * The older [method2235] (types 1/22, raw Socket) now has no live callers and is
     * kept only because method2246 references it as an internal guard.
     */
    fun method2235Connection(bool: Boolean, i: Int, string: String?): Class144 {
        return method2246(8, 0, if (bool) 24 else 23, i, string)
    }

    fun method2236(runnable: Runnable?, i: Int, i_11_: Int): Class144 {
        return method2246(8, 0, 2, i_11_, runnable)
    }

    /**
     * Enqueues an HTTP-fetch task. Originally took [java.net.URL]; now takes a
     * plain string so call sites don't need to construct a URL object.
     */
    fun method2237(urlString: String?, i: Int): Class144? {
        if (i != 8362) return null
        return method2246(8, 0, 4, 0, urlString)
    }

    fun method2238(i: Int, `is`: IntArray?, i_12_: Int, point: Point?, component: Component?, i_13_: Int): Class144 {
        if (i_12_ != 17) method2240(-75)
        return method2246(i_12_ + -9, i, 17, i_13_, arrayOf<Any?>(component, `is`, point))
    }

    /**
     * Overload of [method2238] that takes a hot-spot as [hotX]/[hotY] int coordinates
     * instead of a [Point], so callers in common code avoid importing [java.awt.Point].
     * Also accepts [DisplayTarget] instead of [Component]; extracts the AWT component here.
     */
    fun method2238(i: Int, `is`: IntArray?, i_12_: Int, hotX: Int, hotY: Int, target: DisplayTarget?, i_13_: Int): Class144 {
        val component = (target as? AwtDisplayTarget)?.canvas
        val point = if (hotX == 0 && hotY == 0) Point() else Point(hotX, hotY)
        return method2238(i, `is`, i_12_, point, component, i_13_)
    }

    fun method2239(i: Int) {
        if (i > -90) this.aClass234_3779 = null
        aLong3781 = 5000L + method599(-107)
    }

    fun method2240(i: Int): Class144? {
        if (i != 972476528) return null
        return method2246(8, 0, 5, 0, null)
    }

    fun method2243(i: Int, string: String?, var_class: Class<*>?): Class144 {
        if (i != 0) method2239(-13)
        return method2246(8, 0, 9, 0, arrayOf<Any?>(var_class, string))
    }

    fun method2244(i: Int): Any? {
        if (i != 21) method2237(null, 23)
        return anObject3787
    }

    fun method2245(string: String?, i: Int): Class144? {
        if (i != 16) return null
        return method2246(i + -8, 0, 16, 0, string)
    }

    private fun method2246(i: Int, i_19_: Int, i_20_: Int, i_21_: Int, `object`: Any?): Class144 {
        val class144 = Class144()
        class144.anObject1996 = `object`
        class144.anInt1999 = i_19_
        class144.anInt1994 = i_20_
        class144.anInt2000 = i_21_
        withLock(this) {
            if (aClass144_3798 == null) {
                aClass144_3797 = class144
                aClass144_3798 = aClass144_3797
            } else {
                aClass144_3798!!.aClass144_1995 = class144
                aClass144_3798 = class144
            }
            (this as Object).notify()
            if (i != 8) method2235(false, 76, null, 37)
        }
        return class144
    }

    fun method2247(i: Int): Boolean {
        if (i != -4) method2245(null, 50)
        if (!this.aBoolean3777) return false
        if (this.aBoolean3794) {
            return aClass134_3802 != null
        }
        return anObject3793 != null
    }

    fun method2248(i: Byte, shell: AwtWindowShell?): Class144? {
        if (i.toInt() != 89) return null
        return method2246(i.toInt() xor 0x51, 0, 7, 0, shell?.frame)
    }

    /**
     * Wraps the raw [java.awt.Frame] stored in a task-6 result into a transient
     * [AwtWindowShell] so that [Class318_Sub1_Sub3_Sub4.method2463] never imports Frame.
     * Returns null if [obj] is not a Frame.
     */
    fun wrapFullscreenFrame(obj: Any?): AwtWindowShell? {
        val frame = obj as? java.awt.Frame ?: return null
        // Re-use the existing singleton shell if available; otherwise create a transient one.
        val existing = AwtWindowShell.instance
        if (existing != null) {
            existing.setFullscreenFrame(frame)
            return existing
        }
        // Fallback: transient shell wrapping only the fullscreen frame (no applet root needed
        // since only frame.setVisible/dispose are called in the shutdown path).
        val transient = AwtWindowShell(java.awt.Panel())
        transient.setFullscreenFrame(frame)
        return transient
    }

    init {
        Companion.aString3789 = aString3789
        this.aBoolean3777 = bool
        aString3796 = "1.1"
        aString3782 = "Unknown"
        anInt3792 = i
        try {
            aString3782 = systemGetProperty("java.vendor")
            aString3796 = systemGetProperty("java.version")
        } catch (exception: Exception) {
            /* empty */
        }
        if (aString3782!!.lowercase().indexOf("microsoft") != -1) this.aBoolean3794 = true
        try {
            aString3784 = systemGetProperty("os.name")
        } catch (exception: Exception) {
            aString3784 = "Unknown"
        }
        aString3803 = aString3784!!.lowercase()
        try {
            aString3780 = systemGetProperty("os.arch")?.lowercase()
        } catch (exception: Exception) {
            aString3780 = ""
        }
        try {
            aString3778 = systemGetProperty("os.version")?.lowercase()
        } catch (exception: Exception) {
            aString3778 = ""
        }
        try {
            aString3800 = systemGetProperty("user.home")
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
        aCacheStorage.init(Companion.aString3789, anInt3792)
        if (this.aBoolean3777) {
            this.aClass234_3788 = aCacheStorage.openRandomStore(25L)
            this.aClass234_3785 = aCacheStorage.openMainStore("main_file_cache.dat2", 209715200L)
            this.aClass234_3779 = aCacheStorage.openMainStore("main_file_cache.idx255", 1048576L)
            this.aClass234Array3795 = arrayOfNulls<CacheStore>(i_22_)
            var i_23_ = 0
            while (i_22_ > i_23_) {
                this.aClass234Array3795!![i_23_] = aCacheStorage.openMainStore("main_file_cache.idx" + i_23_, 1048576L)
                i_23_++
            }
            if (this.aBoolean3794) {
                try {
                    anObject3787 = Class1()
                } catch (throwable: Throwable) {
                    /* empty */
                }
            }
            try {
                if (!this.aBoolean3794) anObject3793 = Class7()
                else aClass134_3802 = Class134()
            } catch (throwable: Throwable) {
                /* empty */
            }
            try {
                if (!this.aBoolean3794) anObject3791 = Class165()
                else aCallback_Sub1_3776 = Callback_Sub1()
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
        aThread3790 = Workers.start({ run() }, daemon = true, priority = 10)
    }

    companion object {
        /** Buffer-size key passed to method2982 when wrapping a game socket as a Class238. */
        private const val GAME_CONNECTION_KEY = 7500

        var aString3778: String? = null
        var aString3780: String? = null

        @Volatile
        private var aLong3781 = 0L
        var aString3782: String? = null
        var aMethod3783: Method? = null
        private var aString3784: String? = null
        var aMethod3786: Method? = null
        var anInt3792: Int = -1
        var aString3796: String? = null
        private var aString3800: String? = null
        lateinit var aString3803: String
        private var aString3789: String? = null

        fun method2231(string: String?, i: Int): CacheStore? {
            if (i != -1141472112) return null
            return method2241(string, 12606, aString3789, anInt3792)
        }

        private fun method2241(string: String?, i: Int, string_14_: String?, i_15_: Int): CacheStore? {
            if (i != 12606) return null
            return Class348_Sub23_Sub1.aClass297_8992!!.aCacheStorage.openPreferences(string, i_15_)
        }
    }
}
