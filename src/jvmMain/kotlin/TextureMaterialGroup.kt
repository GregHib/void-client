import ParticleDetailOptionStateStatics.method1796
import SoundBankPatchStatics.method2929
import SpriteComponentStatics.method202
import TextureMaterialGroupStatics.method3266
import TextureMaterialGroupStatics.method3269
import TextureMaterialGroupStatics.anInt9670
import TextureMaterialGroupStatics.anInt9675
import TextureMaterialGroupStatics.anInt9676
import TextureMaterialGroupStatics.anInt9677

/* Class348_Sub42_Sub17 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TextureMaterialGroup internal constructor(private val anInt9669: Int) : HashLinkedListNode() {
    private var aByteArrayArray9671: Array<ByteArray?>? = null
    var aNpcModelTransformArray9673: Array<NpcModelTransform?>? = null
    fun method3267(i: Byte, i_0_: Int): Boolean {
        anInt9676++
        if (i >= -91) return false
        return (this.aNpcModelTransformArray9673!![i_0_]!!.aBoolean129)
    }

    fun method3268(i: Int): Boolean {
        anInt9675++
        if (this.aNpcModelTransformArray9673 != null) return true
        if (aByteArrayArray9671 == null) {
            synchronized(RectangleRegionStatics.aJs5Archive_1940!!) {
                if (!RectangleRegionStatics.aJs5Archive_1940!!.method408((-116).toByte(), anInt9669)) return false
                val `is` = RectangleRegionStatics.aJs5Archive_1940!!.method396(anInt9669, 0)
                aByteArrayArray9671 = arrayOfNulls<ByteArray>(`is`!!.size)
                for (i_1_ in `is`.indices) aByteArrayArray9671!![i_1_] = RectangleRegionStatics.aJs5Archive_1940!!.method410(-1860, anInt9669, `is`[i_1_])!!
            }
        }
        var bool = true
        for (i_2_ in aByteArrayArray9671!!.indices) {
            val `is` = aByteArrayArray9671!![i_2_]
            val class348_sub49 = ByteBuffer(`is`)
            class348_sub49.anInt7197 = 1
            val i_3_ = class348_sub49.readUnsignedShort(842397944)
            synchronized(GlElementArrayBufferStatics.aJs5Archive_4843!!) {
                bool = bool and GlElementArrayBufferStatics.aJs5Archive_4843!!.method421(false, i_3_)
            }
        }
        if (!bool) return false
        val nodeDeque = NodeDeque()
        val `is`: IntArray?
        synchronized(RectangleRegionStatics.aJs5Archive_1940!!) {
            val i_4_ = RectangleRegionStatics.aJs5Archive_1940!!.method407(0, anInt9669)
            this.aNpcModelTransformArray9673 = arrayOfNulls<NpcModelTransform>(i_4_)
            `is` = RectangleRegionStatics.aJs5Archive_1940!!.method396(anInt9669, 0)
            if (i > -115) method3266(null, 123, null)
        }
        for (i_5_ in `is`!!.indices) {
            val is_6_ = aByteArrayArray9671!![i_5_]
            val class348_sub49 = ByteBuffer(is_6_)
            class348_sub49.anInt7197 = 1
            val i_7_ = class348_sub49.readUnsignedShort(842397944) //
            var class348_sub33: AnimationFrameDefinition? = null
            var class348_sub33_8_ = nodeDeque.method1995(4) as AnimationFrameDefinition?
            while (class348_sub33_8_ != null) {
                if (class348_sub33_8_.anInt6958 == i_7_) {
                    class348_sub33 = class348_sub33_8_
                    break
                }
                class348_sub33_8_ = nodeDeque.method1990(78.toByte()) as AnimationFrameDefinition?
            }
            if (class348_sub33 == null) {
                synchronized(GlElementArrayBufferStatics.aJs5Archive_4843!!) {
                    class348_sub33 = AnimationFrameDefinition(i_7_, GlElementArrayBufferStatics.aJs5Archive_4843!!.method415(73.toByte(), i_7_))
                }
                nodeDeque.method1999(class348_sub33!!, -20180)
            }
            this.aNpcModelTransformArray9673!![`is`[i_5_]] = NpcModelTransform(is_6_!!, class348_sub33)
        }
        aByteArrayArray9671 = null
        return true
    }

    fun method3271(i: Int, i_9_: Int): Boolean {
        anInt9670++
        if (i_9_ != 14) method3269(false)
        return (this.aNpcModelTransformArray9673!![i]!!.aBoolean139)
    }

    fun method3272(i: Int, i_10_: Int): Boolean {
        anInt9677++
        if (i_10_ != 0) return true
        return (this.aNpcModelTransformArray9673!![i]!!.aBoolean131)
    }
}
