import java.awt.Frame
import SkeletalAnimFrameLoaderStatics.method351
import SkeletalAnimFrameLoaderStatics.anInt467
import SkeletalAnimFrameLoaderStatics.anInt468
import SkeletalAnimFrameLoaderStatics.anInt470
import SkeletalAnimFrameLoaderStatics.anInt471
import SkeletalAnimFrameLoaderStatics.anInt478
import SkeletalAnimFrameLoaderStatics.anInt479
import SkeletalAnimFrameLoaderStatics.aLong482

/*
 * Class34
 */
class SkeletalAnimFrameLoader {
    private val anIntArray464 = intArrayOf(-1, -1, -1, -1, -1)
    private var aShortArray465: ShortArray? = null
    private var anIntArray472: IntArray? = null
    private var aShortArray474: ShortArray? = null
    @JvmField
    var aModelDefinitionLoader_475: ModelDefinitionLoader? = null
    private lateinit var aShortArray477: ShortArray
    private lateinit var aShortArray480: ShortArray

    fun method341(i: Int): ModelDefinition? {
        anInt468++
        if (anIntArray472 == null) return null
        val modelDefinitions = arrayOfNulls<ModelDefinition>(anIntArray472!!.size)
        synchronized(this.aModelDefinitionLoader_475!!.aJs5Archive_2054!!) {
            for (i_0_ in anIntArray472!!.indices) modelDefinitions[i_0_] = ParticleConfigParserStatics.method2277(0, (this.aModelDefinitionLoader_475!!.aJs5Archive_2054!!), anIntArray472!![i_0_], -1)
        }
        var i_1_ = 0
        while (anIntArray472!!.size > i_1_) {
            if (modelDefinitions[i_1_]!!.anInt1830 < 13) modelDefinitions[i_1_]!!.method1092(2, 113)
            i_1_++
        }
        val modelDefinition: ModelDefinition?
        if (modelDefinitions.size != 1) modelDefinition = ModelDefinition(modelDefinitions, modelDefinitions.size)
        else modelDefinition = modelDefinitions[0]
        if (modelDefinition == null) return null
        if (i < 53) method341(-22)
        if (aShortArray474 != null) {
            for (i_2_ in aShortArray474!!.indices) modelDefinition.method1098(aShortArray474!![i_2_], 126.toByte(), aShortArray480[i_2_])
        }
        if (aShortArray465 != null) {
            for (i_3_ in aShortArray465!!.indices) modelDefinition.method1095(aShortArray465!![i_3_], 0, aShortArray477[i_3_])
        }
        return modelDefinition
    }

    fun method342(i: Byte): Boolean {
        anInt470++
        var bool = true
        synchronized(this.aModelDefinitionLoader_475!!.aJs5Archive_2054!!) {
            for (i_4_ in 0..4) {
                if (anIntArray464[i_4_] != -1 && !this.aModelDefinitionLoader_475!!.aJs5Archive_2054!!.method420(-10499, anIntArray464[i_4_], 0)) bool = false
            }
            if (i <= 87) method351(96)
        }
        return bool
    }

    fun method343(i: Byte): ModelDefinition? {
        anInt471++
        val modelDefinitions = arrayOfNulls<ModelDefinition>(5)
        var i_5_ = 0
        synchronized(this.aModelDefinitionLoader_475!!.aJs5Archive_2054!!) {
            for (i_6_ in 0..4) {
                if (anIntArray464[i_6_] != -1) modelDefinitions[i_5_++] = ParticleConfigParserStatics.method2277(0, (this.aModelDefinitionLoader_475!!.aJs5Archive_2054!!), anIntArray464[i_6_], -1)
            }
        }
        for (i_7_ in 0..4) {
            if (modelDefinitions[i_7_] != null && modelDefinitions[i_7_]!!.anInt1830 < 13) modelDefinitions[i_7_]!!.method1092(2, 99)
        }
        if (i > -27) return null
        val modelDefinition = ModelDefinition(modelDefinitions, i_5_)
        if (aShortArray474 != null) {
            var i_8_ = 0
            while (aShortArray474!!.size > i_8_) {
                modelDefinition.method1098(aShortArray474!![i_8_], 126.toByte(), aShortArray480[i_8_])
                i_8_++
            }
        }
        if (aShortArray465 != null) {
            var i_9_ = 0
            while (aShortArray465!!.size > i_9_) {
                modelDefinition.method1095(aShortArray465!![i_9_], 0, aShortArray477[i_9_])
                i_9_++
            }
        }
        return modelDefinition
    }

    private fun method344(i: Int, class348_sub49: ByteBuffer, i_10_: Byte) {
        if (i != 1) {
            if (i == 2) {
                val i_11_ = class348_sub49.readUnsignedByte(i_10_ + 320)
                anIntArray472 = IntArray(i_11_)
                for (i_12_ in 0..<i_11_) anIntArray472!![i_12_] = class348_sub49.readUnsignedShort(842397944)
            } else if (i != 3) {
                if (i == 40) {
                    val i_13_ = class348_sub49.readUnsignedByte(i_10_.toInt() xor 0xbf.inv())
                    aShortArray480 = ShortArray(i_13_)
                    aShortArray474 = ShortArray(i_13_)
                    for (i_14_ in 0..<i_13_) {
                        aShortArray474!![i_14_] = class348_sub49.readUnsignedShort(842397944).toShort()
                        aShortArray480[i_14_] = class348_sub49.readUnsignedShort(842397944).toShort()
                    }
                } else if (i == 41) {
                    val i_15_ = class348_sub49.readUnsignedByte(255)
                    aShortArray465 = ShortArray(i_15_)
                    aShortArray477 = ShortArray(i_15_)
                    var i_16_ = 0
                    while (i_15_ > i_16_) {
                        aShortArray465!![i_16_] = class348_sub49.readUnsignedShort(i_10_ + 842398009).toShort()
                        aShortArray477[i_16_] = class348_sub49.readUnsignedShort(842397944).toShort()
                        i_16_++
                    }
                } else if (i >= 60 && i < 70) anIntArray464[i + -60] = class348_sub49.readUnsignedShort(842397944)
            }
        } else class348_sub49.readUnsignedByte(i_10_ + 320)
        anInt479++
        if (i_10_.toInt() != -65) aLong482 = -90L
    }

    fun method346(i: Int, class348_sub49: ByteBuffer) {
        anInt467++
        while (true) {
            val i_18_ = class348_sub49.readUnsignedByte(255)
            if (i_18_ == 0) break
            method344(i_18_, class348_sub49, (-65).toByte())
        }
        val i_19_ = -5 / ((73 - i) / 49)
    }

    fun method348(i: Byte): Boolean {
        anInt478++
        if (i.toInt() != 34) method348((-15).toByte())
        if (anIntArray472 == null) return true
        var bool = true
        synchronized(this.aModelDefinitionLoader_475!!.aJs5Archive_2054!!) {
            var i_31_ = 0
            while (anIntArray472!!.size > i_31_) {
                if (!this.aModelDefinitionLoader_475!!.aJs5Archive_2054!!.method420(-10499, anIntArray472!![i_31_], 0)) bool = false
                i_31_++
            }
        }
        return bool
    }
}
