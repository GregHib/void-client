import LinkedListIterator.Companion.method1242
import GlTexture2DRegion.Companion.method3553
import GlGroundShaderPass.Companion.method3556
import GameClock.method599
import java.awt.Container
import kotlin.concurrent.Volatile

/* Class311 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ResourceLoaderThread : Runnable {
    private var anCursorController_3907: CursorController = LoadingBarRenderer()
    private var aBoolean3908 = false

    @Volatile
    private var aBoolean3910 = false
    private var aLong3914: Long = 0
    private var anInt3915 = 0
    private var aConnectionStateType_3916: ConnectionStateType? = null
    private var aLong3917: Long = 0
    private var anCursorController_3919: CursorController? = null
    private var anInt3920 = 0
    private var aString3921: String? = null

    fun method2315(i: Byte): Int {
        anInt3909++
        if (aConnectionStateType_3916 == null) return 0
        if (i < 103) aLong3917 = -58L
        val i_0_ = aConnectionStateType_3916!!.method525(-118)
        if (aConnectionStateType_3916!!.aBoolean1016 && (anInt3915 < aConnectionStateType_3916!!.anInt1021)) return 1 + anInt3915
        if (i_0_ < 0 || -1 + MaterialTypeMarkerStatics.aConnectionStateTypeArray6515!!.size <= i_0_) return 100
        if (aConnectionStateType_3916!!.anInt1025 == anInt3915) return aConnectionStateType_3916!!.anInt1021
        return aConnectionStateType_3916!!.anInt1025
    }

    @Synchronized
    fun method2316(connectionStateType: ConnectionStateType?, string: String?, i: Int, l: Long, bool: Boolean) {
        try {
            if (bool != false) method2318(9)
            aString3921 = string
            anInt3915 = i
            anInt3897++
            aLong3917 = l
            aConnectionStateType_3916 = connectionStateType
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("ae.J(" + (if (connectionStateType != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + i + ',' + l + ',' + bool + ')'))
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
        withLock(this) {
            try {
                anInt3920++
                if (anCursorController_3907 is LoadingBarRenderer) anCursorController_3907.method58(aBoolean3908, -104)
                else {
                    val l_1_ = method599(-104)
                    if (FacingDirectionNodeStatics.aRenderer6654 != null && anCursorController_3919 != null && anCursorController_3919!!.method55((-58).toByte()) != 0 && (aLong3914 >= l_1_ - anCursorController_3919!!.method55((-58).toByte()).toLong())) {
                        var i = ((l_1_ + -aLong3914) * 255L / anCursorController_3919!!.method55((-58).toByte()).toLong()).toInt()
                        var i_2_ = -i + 255
                        i_2_ = 0xffffff or (i_2_ shl 24)
                        i = 0xffffff or (i shl 24)
                        ScreenBorderFiller.method1170((-121).toByte())
                        FacingDirectionNodeStatics.aRenderer6654!!.GA(0)
                        val class105 = (FacingDirectionNodeStatics.aRenderer6654!!.method3629(LocTypeDefinition.anInt4017, GameDisplayManager.anInt10432, true))
                        FacingDirectionNodeStatics.aRenderer6654!!.method3681(class105!!, 0)
                        anCursorController_3919!!.method58(true, -126)
                        FacingDirectionNodeStatics.aRenderer6654!!.method3672()
                        class105.method964(0, 0, 0, i_2_, 1)
                        FacingDirectionNodeStatics.aRenderer6654!!.method3681(class105, 0)
                        FacingDirectionNodeStatics.aRenderer6654!!.GA(0)
                        anCursorController_3907.method58(true, -114)
                        FacingDirectionNodeStatics.aRenderer6654!!.method3672()
                        class105.method964(0, 0, 0, i, 1)
                    } else {
                        if (anCursorController_3919 != null) {
                            aBoolean3908 = true
                            anCursorController_3919!!.method59(-9719)
                            anCursorController_3919 = null
                        }
                        if (aBoolean3908) {
                            ScreenBorderFiller.method1170((-64).toByte())
                            if (FacingDirectionNodeStatics.aRenderer6654 != null) FacingDirectionNodeStatics.aRenderer6654!!.GA(0)
                        }
                        anCursorController_3907.method58((aBoolean3908 || (FacingDirectionNodeStatics.aRenderer6654 != null && FacingDirectionNodeStatics.aRenderer6654!!.method3655())), -90)
                    }
                    try {
                        if (FacingDirectionNodeStatics.aRenderer6654 != null && anCursorController_3907 !is LoadingBarRenderer) FacingDirectionNodeStatics.aRenderer6654!!.method3689(57.toByte())
                    } catch (clientException_: ClientException) {
                        method1242((clientException_.message + " (Recovered) " + NpcType.aClient1367!!.method81(80.toByte())), clientException_, 15004)
                        method3553(true, 114.toByte(), 0)
                    }
                }
                val container: Container?
                if (RsaVarbitHandler.aFrame4904 != null) container = RsaVarbitHandler.aFrame4904
                else if (JagGlToolkitFactory.anApplet1530 != null) {
                    container = JagGlToolkitFactory.anApplet1530!!.getPulseComponent() as? Container
                }
                else container = EdgeDetectTextureNode.anGameApplet_Frame_9169
                container!!.getSize()
                container.getSize()
                if (RsaVarbitHandler.aFrame4904 === container) RsaVarbitHandler.aFrame4904!!.getInsets()
                aBoolean3908 = false
                if (FacingDirectionNodeStatics.aRenderer6654 != null && (anCursorController_3907 !is LoadingBarRenderer) && (aConnectionStateType_3916!!.method525(-112) < ConnectionStateType.aConnectionStateType_1041!!.method525(-127))) method3556(false)
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
    fun method2321(i: Int, cursorController: CursorController) {
        anInt3911++
        if (i != 10559) aWidgetComponent_3913 = null
        anCursorController_3919 = anCursorController_3907
        anCursorController_3907 = cursorController
        aLong3914 = method599(-67)
    }

    @Synchronized
    fun method2322(i: Int): Boolean {
        anInt3900++
        if (i != 0) return false
        return anCursorController_3907.method56(125.toByte(), aLong3914)
    }

    fun method2323(i: Int): Long {
        anInt3912++
        if (i != 0) method2318(14)
        return aLong3917
    }

    fun method2324(i: Int): ConnectionStateType? {
        anInt3904++
        if (i <= 45) return null
        return aConnectionStateType_3916
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

        var aWidgetComponent_3913: WidgetComponent? = null

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
