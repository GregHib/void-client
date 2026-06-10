import com.ms.com.ComFailException
import com.ms.directX.*
import java.awt.Component

class Class1 : Interface20 {
    private val aDSBufferDescArray5152: Array<DSBufferDesc?>
    private val aDirectSoundBufferArray5153: Array<DirectSoundBuffer?>
    private lateinit var anIntArray5154: IntArray
    private val aDSCursorsArray5155 = arrayOfNulls<DSCursors>(2)
    private val aBooleanArray5156: BooleanArray
    private var anInt5157 = 0
    private var anInt5158 = 0
    private val aByteArrayArray5159: Array<ByteArray?>
    private val anIntArray5160: IntArray
    private var anInt5161 = 0
    private var aDirectSound5162: DirectSound?
    private val aWaveFormatEx5163: WaveFormatEx
    private val anIntArray5164: IntArray

    override fun method77(i: Byte, i_0_: Int) {
        try {
            aDirectSoundBufferArray5153[i_0_]!!.stop()
        } catch (e: ComFailException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }
        aBooleanArray5156[i_0_] = false
        if (i > 96) {
            aDirectSoundBufferArray5153[i_0_]!!.setCurrentPosition(0)
            anIntArray5160[i_0_] = 0
        }
    }

    override fun method74(i: Int, i_1_: Byte) {
        if (aDirectSoundBufferArray5153[i] != null) {
            try {
                aDirectSoundBufferArray5153[i]!!.stop()
            } catch (comfailexception: ComFailException) {
                /* empty */
            }
            aDirectSoundBufferArray5153[i] = null
        }
        val i_2_ = 73 / ((i_1_ - 79) / 43)
    }

    override fun method76(i: Int, `is`: IntArray) {
        val i_3_ = `is`.size
        require(i_3_ == 256 * anInt5157)
        val i_4_ = anIntArray5160[i] * anInt5161
        for (i_5_ in 0..<i_3_) {
            var i_6_ = `is`[i_5_]
            if ((i_6_ + 8388608 and 0xffffff.inv()) != 0) i_6_ = 0x7fffff xor (i_6_ shr 31)
            aByteArrayArray5159[i]!![i_4_ + i_5_ * 2] = (i_6_ shr 8).toByte()
            aByteArrayArray5159[i]!![i_4_ + i_5_ * 2 + 1] = (i_6_ shr 16).toByte()
        }
        aDirectSoundBufferArray5153[i]!!.writeBuffer(i_4_, i_3_ * 2, aByteArrayArray5159[i], 0)
        anIntArray5160[i] = anIntArray5160[i] + i_3_ / anInt5157 and 0xffff
        if (!aBooleanArray5156[i]) {
            aDirectSoundBufferArray5153[i]!!.play(1)
            aBooleanArray5156[i] = true
        }
    }

    override fun method75(i: Byte, i_7_: Int): Int {
        if (i >= -79) return -15
        if (!aBooleanArray5156[i_7_]) return 0
        aDirectSoundBufferArray5153[i_7_]!!.getCurrentPosition(aDSCursorsArray5155[i_7_])
        val i_8_ = aDSCursorsArray5155[i_7_]!!.write / anInt5161
        var i_9_ = anIntArray5160[i_7_] + -i_8_ and 0xffff
        if (i_9_ > anIntArray5164[i_7_]) {
            var i_10_ = 0xffff and i_8_ + -anIntArray5160[i_7_]
            while (i_10_ > 0) {
                method76(i_7_, anIntArray5154)
                i_10_ -= 256
            }
            i_9_ = 0xffff and -i_8_ + anIntArray5160[i_7_]
        }
        return i_9_
    }

    @Throws(Exception::class)
    override fun method78(i: Int, bool: Boolean, component: Component?, i_11_: Int) {
        if (anInt5158 == 0) {
            require(!(i < 8000 || i > 48000))
            anInt5157 = if (!bool) 1 else 2
            if (i_11_ != 27929) aDirectSound5162 = null
            anInt5161 = if (bool) 4 else 2
            anIntArray5154 = IntArray(anInt5157 * 256)
            aDirectSound5162!!.initialize(null)
            aDirectSound5162!!.setCooperativeLevel(component, 2)
            for (i_12_ in 0..1) aDSBufferDescArray5152[i_12_]!!.flags = 16384
            aWaveFormatEx5163.avgBytesPerSec = anInt5161 * i
            aWaveFormatEx5163.formatTag = 1
            aWaveFormatEx5163.bitsPerSample = 16
            aWaveFormatEx5163.blockAlign = anInt5161
            aWaveFormatEx5163.channels = anInt5157
            anInt5158 = i
            aWaveFormatEx5163.samplesPerSec = i
        }
    }

    @Throws(Exception::class)
    override fun method79(i: Int, i_13_: Int, i_14_: Byte) {
        check(!(anInt5158 == 0 || aDirectSoundBufferArray5153[i_13_] != null))
        val i_15_ = anInt5161 * 65536
        if (aByteArrayArray5159[i_13_] == null || i_15_ != aByteArrayArray5159[i_13_]!!.size) {
            aByteArrayArray5159[i_13_] = ByteArray(i_15_)
            aDSBufferDescArray5152[i_13_]!!.bufferBytes = i_15_
        }
        aDirectSoundBufferArray5153[i_13_] = aDirectSound5162!!.createSoundBuffer(aDSBufferDescArray5152[i_13_], aWaveFormatEx5163)
        aBooleanArray5156[i_13_] = false
        if (i_14_ < 106) method74(-6, (-123).toByte())
        anIntArray5160[i_13_] = 0
        anIntArray5164[i_13_] = i
    }

    init {
        aDSBufferDescArray5152 = arrayOfNulls<DSBufferDesc>(2)
        aBooleanArray5156 = BooleanArray(2)
        aDirectSoundBufferArray5153 = arrayOfNulls<DirectSoundBuffer>(2)
        aByteArrayArray5159 = arrayOfNulls<ByteArray>(2)
        anIntArray5160 = IntArray(2)
        anIntArray5164 = IntArray(2)
        aDirectSound5162 = DirectSound()
        aWaveFormatEx5163 = WaveFormatEx()
        for (i in 0..1) aDSBufferDescArray5152[i] = DSBufferDesc()
        for (i in 0..1) aDSCursorsArray5155[i] = DSCursors()
    }
}
