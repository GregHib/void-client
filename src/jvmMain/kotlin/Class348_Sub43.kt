import Class14_Sub4.Companion.method250
import kotlin.math.max
import kotlin.math.min

/* Class348_Sub43 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub43 : Class348() {
    var anInt7066: Int = 0
    var anInt7067: Int = 0
    var anInt7069: Int = 0
    var anInt7070: Int = 0
    var anInt7071: Int = 0
    var anInt7072: Int = 0
    var anInt7074: Int = 0
    var aClass23_7075: Class23? = null
    var anInt7076: Int = 0
    var aClass348_Sub19_Sub1_7077: Class348_Sub19_Sub1? = null
    var anInt7080: Int = 0
    var aClass348_Sub16_Sub5_7081: Class348_Sub16_Sub5? = null
    var anInt7082: Int = 0
    var anInt7083: Int = 0
    var anInt7084: Int = 0
    var aClass348_Sub17_7085: Class348_Sub17? = null
    var anInt7086: Int = 0
    var anInt7087: Int = 0
    var anInt7088: Int = 0
    var anInt7089: Int = 0
    var anInt7090: Int = 0

    fun method3299(i: Byte) {
        anInt7078++
        this.aClass348_Sub16_Sub5_7081 = null
        this.aClass348_Sub19_Sub1_7077 = null
        val i_10_ = 71 / ((i - -26) / 58)
        this.aClass23_7075 = null
        this.aClass348_Sub17_7085 = null
    }

    companion object {
        var aClass348_Sub16_Sub4_7065: Class348_Sub16_Sub4? = null
        var anInt7068: Int
        var anInt7073: Int = 0
        var anInt7078: Int = 0
        var anIntArrayArrayArray7079: Array<Array<IntArray?>?>? = arrayOfNulls<Array<IntArray?>>(2)
        fun method3298(i: Byte, bool: Boolean, player: Player) {
            anInt7073++
            if (Class73.anInt4776 < 400) {
                if (Class132.aPlayer_1907 == player) {
                    if (r.aBoolean9722 && (Class38.anInt500 and 0x10) != 0) {
                        Class32.anInt450++
                        Class50_Sub3.method466(false, (Class28.aString5000 + " -> <col=ffffff>" + Class274.aClass274_3520!!.method2063(Class348_Sub33.anInt6967, 544)), 0, (-109).toByte(), false, 0, -1, true, 50, player.anInt10290.toLong(), Class28.aString5001, 0L, Class348_Sub49_Sub1.Companion.anInt9747)
                    }
                } else {
                    val string: String?
                    if (player.anInt10564 == 0) {
                        var bool_0_ = true
                        if ((Class132.aPlayer_1907!!.anInt10561) != -1 && player.anInt10561 != -1) {
                            val i_1_ = (max(player.anInt10516, (Class132.aPlayer_1907!!.anInt10516)))
                            val i_2_ = (min((Class132.aPlayer_1907!!.anInt10561), player.anInt10561))
                            val i_3_ = 5 - (-(10 * i_1_ / 100) + -i_2_)
                            var i_4_ = (-player.anInt10516 + (Class132.aPlayer_1907!!.anInt10516))
                            if (i_4_ < 0) i_4_ = -i_4_
                            if (i_3_ < i_4_) bool_0_ = false
                        }
                        val string_5_ = (if (Class14_Sub4.aClass230_8638 == Class348_Sub42_Sub8_Sub2.aClass230_10434) Class274.aClass274_3513!!.method2063(Class348_Sub33.anInt6967, 544) else Class274.aClass274_3511!!.method2063(Class348_Sub33.anInt6967, 544))
                        if (player.anInt10516 >= player.anInt10557) string = (player.method2456(true, 255) + (if (!bool_0_) "<col=ffffff>" else (method250((Class132.aPlayer_1907!!.anInt10516), true, (player.anInt10516)))) + " (" + string_5_ + player.anInt10516 + ")")
                        else string = (player.method2456(true, 255) + (if (bool_0_) (method250((Class132.aPlayer_1907!!.anInt10516), true, (player.anInt10516))) else "<col=ffffff>") + " (" + string_5_ + player.anInt10516 + "+" + (-player.anInt10516 + player.anInt10557) + ")")
                    } else if (player.anInt10564 == -1) string = player.method2456(true, 255)
                    else string = (player.method2456(true, 255) + " (" + Class274.aClass274_3512!!.method2063(Class348_Sub33.anInt6967, 544) + player.anInt10564 + ")")
                    if (r.aBoolean9722 && !bool && (0x8 and Class38.anInt500) != 0) {
                        Class50_Sub3.method466(false, Class28.aString5000 + " -> <col=ffffff>" + string, 0, (-109).toByte(), false, 0, -1, true, 51, player.anInt10290.toLong(), Class28.aString5001, player.anInt10290.toLong(), Class348_Sub49_Sub1.Companion.anInt9747)
                        Class341.anInt4228++
                    }
                    if (i <= 89) anInt7068 = -113
                    if (bool) Class50_Sub3.method466(true, "", 0, (-115).toByte(), false, 0, 0, false, -1, player.anInt10290.toLong(), "<col=cccccc>" + string, 0L, -1)
                    else {
                        for (i_6_ in 7 downTo 0) {
                            if (Class318_Sub1_Sub2_Sub1.aStringArray10195!![i_6_] != null) {
                                var i_7_: Short = 0
                                if ((Class348_Sub42_Sub8_Sub2.aClass230_10434 != Class10.aClass230_186) || !(Class318_Sub1_Sub2_Sub1.aStringArray10195!![i_6_].equals(Class274.aClass274_3506!!.method2063(Class348_Sub33.anInt6967, 544), ignoreCase = true))) {
                                    if (Class71.aBooleanArray1214!![i_6_]) i_7_ = 2000.toShort()
                                } else {
                                    if ((Class132.aPlayer_1907!!.anInt10516) < (player.anInt10516)) i_7_ = 2000.toShort()
                                    if ((Class132.aPlayer_1907!!.anInt10542) != 0 && (player.anInt10542) != 0) {
                                        if ((player.anInt10542) != (Class132.aPlayer_1907!!.anInt10542)) i_7_ = 0.toShort()
                                        else i_7_ = 2000.toShort()
                                    }
                                }
                                val i_8_ = (i_7_ + (Class348_Sub49_Sub2.Companion.aShortArray9768!![i_6_])).toShort()
                                val i_9_ = (if (Canvas_Sub1.anIntArray60!![i_6_] == -1) Class38.anInt506 else Canvas_Sub1.anIntArray60!![i_6_])
                                Class50_Sub3.method466(false, "<col=ffffff>" + string, 0, (-105).toByte(), false, 0, -1, true, i_8_.toInt(), player.anInt10290.toLong(), (Class318_Sub1_Sub2_Sub1.aStringArray10195!![i_6_]), player.anInt10290.toLong(), i_9_)
                                Canvas_Sub1.anInt69++
                            }
                        }
                    }
                    if (!bool) {
                        var class348_sub42_sub12 = Class348_Sub40_Sub4.aClass262_9111!!.method1995(4) as Class348_Sub42_Sub12?
                        while (class348_sub42_sub12 != null) {
                            if ((class348_sub42_sub12.anInt9608) == 19) {
                                class348_sub42_sub12.aString9595 = "<col=ffffff>" + string
                                break
                            }
                            class348_sub42_sub12 = (Class348_Sub40_Sub4.aClass262_9111!!.method1990(105.toByte()) as Class348_Sub42_Sub12?)
                        }
                    }
                }
            }
        }

        @JvmStatic
        fun method3300(i: Int) {
            anIntArrayArrayArray7079 = null
            aClass348_Sub16_Sub4_7065 = null
            if (i != 0) method3300(-61)
        }

        init {
            anInt7068 = 0
        }
    }
}
