import LinkedListIteratorStatics.method1242
import TexGenMaterialPassStatics.method2161
import java.io.EOFException
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import java.net.Socket
import SocketStreamWorkerStatics.anInt2646
import SocketStreamWorkerStatics.anInt2647
import SocketStreamWorkerStatics.anInt2650
import SocketStreamWorkerStatics.anInt2651
import SocketStreamWorkerStatics.anInt2655
import SocketStreamWorkerStatics.anInt2660
import SocketStreamWorkerStatics.anInt2664
import SocketStreamWorkerStatics.aIntRange_2665
import SocketStreamWorkerStatics.anInt2666
import SocketStreamWorkerStatics.anInt2667

/*
 * Class202
 */
class SocketStreamWorker internal constructor(socket: Socket?, privilegedOperationWorker: PrivilegedOperationWorker?, i: Int) : Runnable {
    private var anInt2648 = 0
    private val aPrivilegedOperationWorker_2649: PrivilegedOperationWorker?
    private var anInputStream2652: InputStream? = null
    private var aBoolean2654 = false
    private var anInt2656 = 0
    private var anOutputStream2657: OutputStream? = null
    private var aLinkedQueueNode_2658: LinkedQueueNode? = null
    private var aBoolean2659 = false
    private var aByteArray2663: ByteArray? = null
    private val aSocket2668: Socket?
    private val anInt2669: Int

    @Throws(IOException::class)
    fun method1467(i: Byte): Int {
        anInt2651++
        if (i.toInt() != 83) aIntRange_2665 = null
        if (aBoolean2654) return 0
        return anInputStream2652!!.available()
    }

    fun method1468(i: Int) {
        anInt2667++
        if (!aBoolean2654) {
            if (i < 63) anOutputStream2657 = null
            anInputStream2652 = InputStream_Sub2()
            anOutputStream2657 = ChatMessageStream()
        }
    }

    @Throws(IOException::class)
    fun method1470(`is`: ByteArray, i: Int, i_5_: Int, i_6_: Int) {
        anInt2655++
        if (!aBoolean2654) {
            if (aBoolean2659) {
                aBoolean2659 = false
                throw IOException()
            }
            if (aByteArray2663 == null) aByteArray2663 = ByteArray(anInt2669)
            synchronized(this) {
                if (i_6_ == -1) {
                    for (i_7_ in 0..<i) {
                        aByteArray2663!![anInt2648] = `is`[i_7_ + i_5_]
                        anInt2648 = (anInt2648 - -1) % anInt2669
                        if (anInt2648 == (anInt2656 - (-anInt2669 - -100)) % anInt2669) throw IOException()
                    }
                    if (aLinkedQueueNode_2658 == null) aLinkedQueueNode_2658 = aPrivilegedOperationWorker_2649!!.method2236(this, -10240, 3)
                    (this as Object).notifyAll()
                } else {
                    /* empty */
                }
            }
        }
    }

    @Throws(IOException::class)
    fun method1472(bool: Boolean) {
        anInt2650++
        if (bool == true && !aBoolean2654) {
            if (aBoolean2659) {
                aBoolean2659 = false
                throw IOException()
            }
        }
    }

    @Throws(IOException::class)
    fun method1473(i: Int): Int {
        anInt2647++
        if (aBoolean2654) return 0
        if (i != 0) return 38
        return anInputStream2652!!.read()
    }
    
    override fun run() {
        try {
            while (true) {
                val i: Int
                val i_8_: Int
                if (anInt2648 == anInt2656 && aBoolean2654) {
                    break
                }
                synchronized(this) {
                    if (anInt2648 == anInt2656) {
//                        if (aBoolean2654) break
                        try {
                            (this as Object).wait()
                        } catch (interruptedexception: InterruptedException) {
                            /* empty */
                        }
                    }
                    i = anInt2656
                    if (anInt2656 > anInt2648) i_8_ = anInt2669 - anInt2656
                    else i_8_ = -anInt2656 + anInt2648
                }
                if (i_8_ > 0) {
                    try {
                        anOutputStream2657!!.write(aByteArray2663, i, i_8_)
                    } catch (ioexception: IOException) {
                        aBoolean2659 = true
                    }
                    anInt2656 = (i_8_ + anInt2656) % anInt2669
                    try {
                        if (anInt2648 == anInt2656) anOutputStream2657!!.flush()
                    } catch (ioexception: IOException) {
                        aBoolean2659 = true
                    }
                }
            }
            try {
                if (anInputStream2652 != null) anInputStream2652!!.close()
                if (anOutputStream2657 != null) anOutputStream2657!!.close()
                if (aSocket2668 != null) aSocket2668.close()
            } catch (ioexception: IOException) {
                /* empty */
            }
            aByteArray2663 = null
        } catch (exception: Exception) {
            method1242(null, exception, 15004)
        }
        anInt2664++
    }

    @Throws(IOException::class)
    fun method1474(`is`: ByteArray, i: Int, i_9_: Byte, i_10_: Int) {
        var i = i
        var i_10_ = i_10_
        anInt2666++
        if (!aBoolean2654) {
            while (i_10_ > 0) {
                val i_11_ = anInputStream2652!!.read(`is`, i, i_10_)
                if (i_11_ <= 0) throw EOFException()
                i_10_ -= i_11_
                i += i_11_
            }
            if (i_9_.toInt() != -72) run()
        }
    }

    protected fun finalize() {
        anInt2646++
        method1476((-126).toByte())
    }

    fun method1476(i: Byte) {
        anInt2660++
        if (!aBoolean2654) {
            synchronized(this) {
                aBoolean2654 = true
                if (i > -120) method1476((-105).toByte())
                (this as Object).notifyAll()
            }
            if (aLinkedQueueNode_2658 != null) {
                while (aLinkedQueueNode_2658!!.anInt1997 == 0) method2161(105.toByte(), 1L)
                if (aLinkedQueueNode_2658!!.anInt1997 == 1) {
                    try {
                        (aLinkedQueueNode_2658!!.anObject1998 as Thread).join()
                    } catch (interruptedexception: InterruptedException) {
                        /* empty */
                    }
                }
            }
            aLinkedQueueNode_2658 = null
        }
    }

    init {
        try {
            aSocket2668 = socket
            aPrivilegedOperationWorker_2649 = privilegedOperationWorker
            aSocket2668!!.setSoTimeout(30000)
            aSocket2668.setTcpNoDelay(true)
            anInputStream2652 = aSocket2668.getInputStream()
            anOutputStream2657 = aSocket2668.getOutputStream()
            anInt2669 = i
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("re.<init>(" + (if (socket != null) "{...}" else "null") + ',' + (if (privilegedOperationWorker != null) "{...}" else "null") + ',' + i + ')'))
        }
    }
}
