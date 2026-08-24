import kotlin.jvm.JvmStatic
import DetailLevelOptionState.Companion.method1836
import CubeMapMaterialPass.Companion.method2172
import OpenGlTerrainTile.Companion.method4002

/* Class48 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ColourAdjustment {

    var anInt847: Int = 0

    var anInt853: Int = 0

    var anInt854: Int = 0

    var anInt856: Int

    var anInt857: Int = 128

    var anInt858: Int
    fun method451(colourAdjustment_7_: ColourAdjustment, i: Byte) {
        this.anInt857 = colourAdjustment_7_.anInt857
        this.anInt858 = colourAdjustment_7_.anInt858
        this.anInt856 = colourAdjustment_7_.anInt856
        this.anInt854 = colourAdjustment_7_.anInt854
        anInt855++
        this.anInt847 = colourAdjustment_7_.anInt847
        this.anInt853 = colourAdjustment_7_.anInt853
        if (i.toInt() != -110) Companion.method448((-93).toByte())
    }

    fun method452(bool: Boolean): ColourAdjustment {
        anInt848++
        if (bool != true) Companion.method448((-81).toByte())
        return ColourAdjustment(this.anInt858, this.anInt856, this.anInt857, this.anInt854, this.anInt847, this.anInt853)
    }

    internal constructor(i: Int) {
        this.anInt856 = 128
        this.anInt858 = i
    }

    private constructor(i: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int) {
        this.anInt856 = 128
        this.anInt847 = i_11_
        this.anInt854 = i_10_
        this.anInt853 = i_12_
        this.anInt858 = i
        this.anInt856 = i_8_
        this.anInt857 = i_9_
    }

    companion object {

        var anInt848: Int = 0

        var anInt849: Int = 0

        var anInt850: Int = 0

        var aShort851: Short
        var aCharArray852: CharArray? = charArrayOf('_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9')

        var anInt855: Int = 0

        var anInt859: Int

        var anIntArray860: IntArray?

        @JvmStatic
        fun method448(i: Byte) {
            aCharArray852 = null
            anIntArray860 = null
            val i_0_ = -50 % ((37 - i) / 40)
        }

        @JvmStatic
        fun method449(string: String?, string_1_: String?, bool: Boolean, i: Int, bool_2_: Boolean) {
            do {
                try {
                    anInt849++
                    val class348_sub47 = ProjectileSpawner.method1478(true)
                    class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeByte(bool, ScriptOpcodeHolder.aConfigIdPair_2348!!.anInt400)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 0)
                    val i_3_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 634)
                    val `is`: IntArray = MinimapSquareDrawer.Companion.method463(class348_sub47, false)
                    val i_4_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string_1_!!)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), SocketStreamWorker.anInt2670)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string!!)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeLong(TextureMetadataProvider.aLong4615, 104.toByte())
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(bool, ChatCommandProcessor.anInt6967)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(bool, (Client.aSceneProjector_10434!!.anInt2987))
                    method4002((class348_sub47.aClass348_Sub49_Sub2_7116!!), 55.toByte())
                    val string_5_ = Gl2dTexture.aString8605
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (string_5_ == null) 0 else 1)
                    if (string_5_ != null) class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string_5_)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, i)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (!bool_2_) 0 else 1)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 += 7
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.method3350(i_4_, true, `is`, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197))
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.method3383(1809639944, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 + -i_3_))
                    InterfaceComponentGroup.method3243(2, class348_sub47)
                    RenderableEntry.anInt4337 = -3
                    GlWaterRenderPass.anInt7297 = 1
                    HostPingThread.anInt2264 = 0
                    AnimatedModelRenderer.anInt8398 = 0
                    if (i >= 13) break
                    VideoStreamDecoder.aBoolean4127 = true
                    method2172(60)
                } catch (runtimeexception: RuntimeException) {
                    throw TextureLoadException.method2929(runtimeexception, ("iq.D(" + (if (string != null) "{...}" else "null") + ',' + (if (string_1_ != null) "{...}" else "null") + ',' + bool + ',' + i + ',' + bool_2_ + ')'))
                }
                break
            } while (false)
        }

        fun method450(i: Int, string: String, i_6_: Int): Int {
            if (i != -20188) return 88
            anInt850++
            return method1836(-123, i_6_, true, string)
        }

        init {
            aShort851 = 32767.toShort()
            anInt859 = -1
            anIntArray860 = intArrayOf(4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0)
        }
    }
}
