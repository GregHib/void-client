import Class135_Sub1.Companion.method1153
import Class158.Companion.method1248
import Class231.Companion.method1642
import Class286_Sub3.Companion.method2148
import Class62.method596

/* Class303 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class303 {
    var aClass114_3842: Class114?
    var anInt3843: Int = 0
    @JvmField
    var anInt3844: Int = 1
    var anInt3845: Int = 0
    var anInt3846: Int = 0

    fun method2285(bool: Boolean, i: Byte, i_0_: Int) {
        if (i > -61) aClass114_3842 = null
        anInt3843++
        if (bool) {
            val class348_sub47 = method2148(Class241.aClass351_3150, Class348_Sub23_Sub2.aClass77_9029, -126)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_0_)
            Class348_Sub42_Sub14.method3243(42, class348_sub47)
        } else Class66.method701(Class141.aClass273_1966!!, i_0_, -1)
    }

    @JvmStatic
    fun method2286(i: Int) {
        aClass114_3842 = null
        if (i != 114) anInt3844 = 87
    }

    fun method2287(class348_sub49: Class348_Sub49, i: Byte): Class125 {
        anInt3846++
        val i_1_ = class348_sub49.readUnsignedByte(255)
        val class221 = method1248(87)[class348_sub49.readUnsignedByte(255)]
        val class341 = method596(20000)[class348_sub49.readUnsignedByte(255)]
        val i_2_ = class348_sub49.readShort(13638)
        val i_3_ = class348_sub49.readShort(13638)
        val i_4_ = class348_sub49.readUnsignedShort(842397944)
        val i_5_ = class348_sub49.readUnsignedShort(842397944)
        val i_6_ = class348_sub49.readInt((-126).toByte())
        val i_7_ = class348_sub49.readInt((-126).toByte())
        val i_8_ = class348_sub49.readInt((-126).toByte())
        val i_9_ = -54 / ((i - -45) / 61)
        val bool = class348_sub49.readUnsignedByte(255) == 1
        return Class125(i_1_, class221, class341, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, bool)
    }

    @JvmStatic
    fun method2288(bool: Boolean, var_ha: ha) {
        anInt3845++
        if (!Class71.aBoolean1211) method1642(108.toByte(), var_ha)
        else method1153(var_ha, 16)
        if (bool != false) anInt3844 = -97
    }

    init {
        aClass114_3842 = Class114(114, 4)
    }
}
