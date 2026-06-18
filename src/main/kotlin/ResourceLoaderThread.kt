import LinkedListIterator.Companion.method1242
import Class367_Sub10.Companion.method3553
import Class367_Sub11.Companion.method3556
import Class62.method599
import java.awt.Container
import kotlin.concurrent.Volatile

/* Class311 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ResourceLoaderThread : Runnable {
    private var anInterface16_3907: Interface16 = LoadingBarRenderer()
    private var aBoolean3908 = false

    @Volatile
    private var aBoolean3910 = false
    private var aLong3914: Long = 0
    private var anInt3915 = 0
    private var aClass56_3916: Class56? = null
    private var aLong3917: Long = 0
    private var anInterface16_3919: Interface16? = null
    private var anInt3920 = 0
    private var aString3921: String? = null

    fun method2315(i: Byte): Int {
        anInt3909++
        if (aClass56_3916 == null) return 0
        if (i < 103) aLong3917 = -58L
        val i_0_ = aClass56_3916!!.method525(-118)
        if (aClass56_3916!!.aBoolean1016 && (anInt3915 < aClass56_3916!!.anInt1021)) return 1 + anInt3915
        if (i_0_ < 0 || -1 + MaterialTypeMarker.aClass56Array6515!!.size <= i_0_) return 100
        if (aClass56_3916!!.anInt1025 == anInt3915) return aClass56_3916!!.anInt1021
        return aClass56_3916!!.anInt1025
    }

    @Synchronized
    fun method2316(class56: Class56?, string: String?, i: Int, l: Long, bool: Boolean) {
        try {
            if (bool != false) method2318(9)
            aString3921 = string
            anInt3915 = i
            anInt3897++
            aLong3917 = l
            aClass56_3916 = class56
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("ae.J(" + (if (class56 != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + i + ',' + l + ',' + bool + ')'))
        }
    }

    override fun run() {
        anInt3902++
        while (!aBoolean3910) {
            val l = method599(-61)
            if (skip()) {
                continue
            }
            val l_3_ = method599(-73)
            val i = (-l_3_ - -l + 20L).toInt()
            if (i > 0) TexGenMaterialPass.method2161((-3).toByte(), i.toLong())
        }
    }

    private fun skip(): Boolean {
        synchronized(this) {
            try {
                anInt3920++
                if (anInterface16_3907 is LoadingBarRenderer) anInterface16_3907.method58(aBoolean3908, -104)
                else {
                    val l_1_ = method599(-104)
                    if (FacingDirectionNode.aRenderer6654 != null && anInterface16_3919 != null && anInterface16_3919!!.method55((-58).toByte()) != 0 && (aLong3914 >= l_1_ - anInterface16_3919!!.method55((-58).toByte()).toLong())) {
                        var i = ((l_1_ + -aLong3914) * 255L / anInterface16_3919!!.method55((-58).toByte()).toLong()).toInt()
                        var i_2_ = -i + 255
                        i_2_ = 0xffffff or (i_2_ shl 24)
                        i = 0xffffff or (i shl 24)
                        ScreenBorderFiller.method1170((-121).toByte())
                        FacingDirectionNode.aRenderer6654!!.GA(0)
                        val class105 = (FacingDirectionNode.aRenderer6654!!.method3629(LocTypeDefinition.anInt4017, HardCacheEntryReference.anInt10432, true))
                        FacingDirectionNode.aRenderer6654!!.method3681(class105!!, 0)
                        anInterface16_3919!!.method58(true, -126)
                        FacingDirectionNode.aRenderer6654!!.method3672()
                        class105.method964(0, 0, 0, i_2_, 1)
                        FacingDirectionNode.aRenderer6654!!.method3681(class105, 0)
                        FacingDirectionNode.aRenderer6654!!.GA(0)
                        anInterface16_3907.method58(true, -114)
                        FacingDirectionNode.aRenderer6654!!.method3672()
                        class105.method964(0, 0, 0, i, 1)
                    } else {
                        if (anInterface16_3919 != null) {
                            aBoolean3908 = true
                            anInterface16_3919!!.method59(-9719)
                            anInterface16_3919 = null
                        }
                        if (aBoolean3908) {
                            ScreenBorderFiller.method1170((-64).toByte())
                            if (FacingDirectionNode.aRenderer6654 != null) FacingDirectionNode.aRenderer6654!!.GA(0)
                        }
                        anInterface16_3907.method58((aBoolean3908 || (FacingDirectionNode.aRenderer6654 != null && FacingDirectionNode.aRenderer6654!!.method3655())), -90)
                    }
                    try {
                        if (FacingDirectionNode.aRenderer6654 != null && anInterface16_3907 !is LoadingBarRenderer) FacingDirectionNode.aRenderer6654!!.method3689(57.toByte())
                    } catch (exception_sub1: Exception_Sub1) {
                        method1242((exception_sub1.message + " (Recovered) " + Class79.aClient1367!!.method81(80.toByte())), exception_sub1, 15004)
                        method3553(true, 114.toByte(), 0)
                    }
                }
                val container: Container?
                if (RsaVarbitHandler.aFrame4904 != null) container = RsaVarbitHandler.aFrame4904
                else if (Class93.anApplet1530 != null) {
                    container = Class93.anApplet1530!!.getPulseComponent() as? Container
                }
                else container = EdgeDetectTextureNode.anGameApplet_Frame_9169
                container!!.getSize()
                container.getSize()
                if (RsaVarbitHandler.aFrame4904 === container) RsaVarbitHandler.aFrame4904!!.getInsets()
                aBoolean3908 = false
                if (FacingDirectionNode.aRenderer6654 != null && (anInterface16_3907 !is LoadingBarRenderer) && (aClass56_3916!!.method525(-112) < Class56.aClass56_1041!!.method525(-127))) method3556(false)
            } catch (exception: Exception) {
                return true
            }
        }
        return false
    }

    fun method2318(i: Int): String? {
        if (i != -9324) method2320((-47).toByte())
        anInt3903++
        return aString3921
    }

    fun method2319(i: Byte) {
        aBoolean3910 = true
        if (i >= -37) aLong3914 = -36L
        anInt3906++
    }

    fun method2320(i: Byte): Int {
        anInt3901++
        val i_4_ = -127 / ((29 - i) / 45)
        return anInt3915
    }

    @Synchronized
    fun method2321(i: Int, interface16: Interface16) {
        anInt3911++
        if (i != 10559) aWidgetComponent_3913 = null
        anInterface16_3919 = anInterface16_3907
        anInterface16_3907 = interface16
        aLong3914 = method599(-67)
    }

    @Synchronized
    fun method2322(i: Int): Boolean {
        anInt3900++
        if (i != 0) return false
        return anInterface16_3907.method56(125.toByte(), aLong3914)
    }

    fun method2323(i: Int): Long {
        anInt3912++
        if (i != 0) method2318(14)
        return aLong3917
    }

    fun method2324(i: Int): Class56? {
        anInt3904++
        if (i <= 45) return null
        return aClass56_3916
    }

    fun method2325(i: Byte): Int {
        val i_5_ = 32 / ((i - -41) / 47)
        anInt3899++
        return anInt3920
    }

    @Synchronized
    fun method2326(i: Int) {
        if (i <= 39) method2315(28.toByte())
        anInt3905++
        aBoolean3908 = true
    }

    companion object {
        var anInt3897: Int = 0
        var aFontMetaRef_3898: FontMetaRef? = FontMetaRef(11, 8)
        var anInt3899: Int = 0
        var anInt3900: Int = 0
        var anInt3901: Int = 0
        var anInt3902: Int = 0
        var anInt3903: Int = 0
        var anInt3904: Int = 0
        var anInt3905: Int = 0
        var anInt3906: Int = 0
        var anInt3909: Int = 0
        var anInt3911: Int = 0
        var anInt3912: Int = 0
        @JvmField
        var aWidgetComponent_3913: WidgetComponent? = null
        @JvmField
        var anInt3918: Int = 1
        @JvmStatic
        fun method2317(i: Byte) {
            if (i > 50) {
                aFontMetaRef_3898 = null
                aWidgetComponent_3913 = null
            }
        }
    }
}
