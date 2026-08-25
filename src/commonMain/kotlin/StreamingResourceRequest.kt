import kotlinx.datetime.LocalDate
import kotlin.jvm.JvmStatic
import kotlinx.datetime.TimeZone
import kotlinx.datetime.isoDayNumber
import kotlinx.datetime.number
import kotlinx.datetime.toLocalDateTime
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

class StreamingResourceRequest : AsyncResourceRequest() {

    var aByte10449: Byte = 0

    var aClass348_Sub49_10453: ByteBuffer? = null

    var anInt10456: Int = 0

    override fun method3259(i: Int): ByteArray? {
        anInt10454++
        if (i != 16) return null
        if (this.aBoolean9664 || (this.aClass348_Sub49_10453!!.anInt7197 < (-this.aByte10449 + (this.aClass348_Sub49_10453!!.aByteArray7154)!!.size))) throw RuntimeException()
        return (this.aClass348_Sub49_10453!!.aByteArray7154)
    }

    override fun method3257(i: Int): Int {
        if (i != 16) this.aByte10449 = (-4).toByte()
        anInt10452++
        if (this.aClass348_Sub49_10453 == null) return 0
        return (100 * this.aClass348_Sub49_10453!!.anInt7197 / (-this.aByte10449 + (this.aClass348_Sub49_10453!!.aByteArray7154)!!.size))
    }

    companion object {

        var anInt10447: Int = -1

        var anInt10448: Int = 0

        var aBoolean10450: Boolean = false

        var anInt10451: Int = 0

        var anInt10452: Int = 0

        var anInt10454: Int = 0

        var anInt10455: Int = 0
        @JvmStatic
        fun method3260(i: Int) {
            var class348_sub15 = ProjectileConfigUtil.aHashtable_389!!.method3484(0) as? MenuActionNode?
            while (class348_sub15 != null) {
                if (class348_sub15.aClass55_Sub1_6768!!.method510((-125).toByte())) OpenGlModel.method690(70.toByte(), (class348_sub15.anInt6773))
                else {
                    class348_sub15.aClass55_Sub1_6768!!.method522((-91).toByte())
                    try {
                        class348_sub15.aClass55_Sub1_6768!!.method517(-2)
                    } catch (exception: Exception) {
                        LinkedListIterator.method1242("TV: " + class348_sub15.anInt6773, exception, 15004)
                        OpenGlModel.method690(15.toByte(), (class348_sub15.anInt6773))
                    }
                    if (!class348_sub15.aBoolean6783 && !class348_sub15.aBoolean6781) {
                        val class348_sub23_sub1 = class348_sub15.aClass55_Sub1_6768!!.method512(0)
                        if (class348_sub23_sub1 != null) {
                            val class348_sub16_sub2 = class348_sub23_sub1.method2971(-61)
                            if (class348_sub16_sub2 != null) {
                                class348_sub16_sub2.method2827(-17708, (class348_sub15.anInt6782))
                                SpriteDefinition.aClass348_Sub16_Sub4_7065!!.method2883(class348_sub16_sub2)
                                class348_sub15.aBoolean6783 = true
                            }
                        }
                    }
                }
                class348_sub15 = ProjectileConfigUtil.aHashtable_389!!.method3482(0) as? MenuActionNode?
            }
            val i_0_ = 48 % ((-17 - i) / 63)
            anInt10448++
        }

        @OptIn(ExperimentalTime::class)
        @JvmStatic
        fun method3261(l: Long, i: Int): String {
            try {
                WaterMaterialPass.aCalendar6221 = Instant.fromEpochMilliseconds(l)
                anInt10455++
                val ldt = WaterMaterialPass.aCalendar6221!!.toLocalDateTime(TimeZone.UTC)
                val i_1_ = (ldt.date.dayOfWeek.isoDayNumber % 7) + 1
                val i_2_ = ldt.date.day
                if (i <= 53) aBoolean10450 = false
                val i_3_ = ldt.date.month.number - 1
                val i_4_ = ldt.date.year
                val i_5_ = ldt.time.hour
                val i_6_ = ldt.time.minute
                val i_7_ = ldt.time.second
                return (JagGlToolkitFactory.aStringArray1531!![i_1_ - 1] + ", " + i_2_ / 10 + i_2_ % 10 + "-" + CalendarUtil.aStringArray4129!![i_3_] + "-" + i_4_ + " " + i_5_ / 10 + i_5_ % 10 + ":" + i_6_ / 10 + i_6_ % 10 + ":" + i_7_ / 10 + i_7_ % 10 + " GMT")
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, "mba.I(" + l + ',' + i + ')')
            }
        }

        @JvmStatic
        fun method3262(i: Int, i_8_: Int, i_9_: Int): Boolean {
            if (i_9_ <= 75) aBoolean10450 = false
            anInt10451++
            return (i and 0x10) != 0
        }
    }
}
