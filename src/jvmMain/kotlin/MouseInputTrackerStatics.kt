import java.awt.Component
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener

object MouseInputTrackerStatics {
    @JvmField
            var anInt7426: Int = 0
            @JvmField
            var anInt7427: Int = 0
            @JvmField
            var anInt7428: Int = 0
            @JvmField
            var anInt7429: Int = 0
            @JvmField
            var anInt7430: Int = 0
            @JvmField
            var anInt7431: Int = 0
            @JvmField
            var anInt7433: Int = 0
            @JvmField
            var anInt7434: Int = 0
            @JvmField
            var anInt7435: Int = 0
            @JvmField
            var anInt7436: Int = 0
            @JvmField
            var anInt7437: Int = 0
            @JvmField
            var anInt7438: Int = 0
            @JvmField
            var anInt7439: Int = 0
            @JvmField
            var anInt7440: Int = 0
            @JvmField
            var anInt7443: Int = 0
            @JvmField
            var aBoolean7444: Boolean = false
            @JvmField
            var anInt7445: Int = 0
            @JvmField
            var aDataHolderArray7446: Array<DataHolder?>? = null
            @JvmField
            var anInt7447: Int = 0
            @JvmField
            var anInt7449: Int = 0
            @JvmField
            var anInt7451: Int = 0
            @JvmField
            var anInt7452: Int = 0
            @JvmField
            var anInt7455: Int = 0
            @JvmField
            var anInt7457: Int = 0
            @JvmStatic
            fun method3607(i: Int, class348_sub49: ByteBuffer?, i_10_: Int): String {
                val i_11_ = 17 % ((9 - i_10_) / 59)
                anInt7451++
                try {
                    var i_12_ = class348_sub49!!.readSmart(-122)
                    if (i < i_12_) i_12_ = i
                    val `is` = ByteArray(i_12_)
                    class348_sub49.anInt7197 += (AbstractModelStatics.aHuffmanCodec_1131!!.method2226(`is`, class348_sub49.anInt7197, class348_sub49.aByteArray7154, i_12_, -1, 0))
                    val string = FixedFunctionWaterPassStatics.method3546(`is`, 0, i_12_, 0)
                    return string
                } catch (exception: Exception) {
                    return "Cabbage"
                }
            }
    
            @JvmStatic
            fun method3609(i: Byte) {
                val i_14_ = 49 % ((i - -35) / 41)
                aDataHolderArray7446 = null
            }
}
