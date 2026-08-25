import kotlin.jvm.JvmStatic
import GlBloomEffect.Companion.method2766
import SceneNodeDeque.Companion.method847
import io.DataInputStream
import java.net.URL

/*
 * Class156
 */
class LinkedListIterator {
    private var aClass348_Sub42_2115: HashLinkedListNode? = null
    private var aLinkedNodeListIterator_2118: LinkedNodeListIterator? = null
    fun method1240(i: Int): HashLinkedListNode? {
        anInt2114++
        if (i <= 7) method1240(79)
        val class348_sub42 = (aLinkedNodeListIterator_2118!!.aClass348_Sub42_1647.aClass348_Sub42_7063)
        if (class348_sub42 === aLinkedNodeListIterator_2118!!.aClass348_Sub42_1647) {
            aClass348_Sub42_2115 = null
            return null
        }
        aClass348_Sub42_2115 = class348_sub42!!.aClass348_Sub42_7063
        return class348_sub42
    }

    constructor()

    fun method1243(i: Byte): HashLinkedListNode? {
        anInt2120++
        if (i < 44) aStringArray2113 = null
        val class348_sub42 = aClass348_Sub42_2115
        if (class348_sub42 === aLinkedNodeListIterator_2118!!.aClass348_Sub42_1647) {
            aClass348_Sub42_2115 = null
            return null
        }
        aClass348_Sub42_2115 = class348_sub42!!.aClass348_Sub42_7063
        return class348_sub42
    }

    internal constructor(linkedNodeListIterator: LinkedNodeListIterator) {
        aLinkedNodeListIterator_2118 = linkedNodeListIterator
    }

    companion object {
        var aFloat2111: Float = 0f
        var anInt2112: Int = 0
        var aStringArray2113: Array<String?>? = arrayOfNulls<String>(100)
        var anInt2114: Int = 0
        var anInt2116: Int = 0

        var anIntArray2117: IntArray? = IntArray(2)
        var anInt2119: Int = 0
        var anInt2120: Int = 0

        fun method1238(i: Int, i_0_: Int, i_1_: Int): Boolean {
            anInt2116++
            if (i_1_ > -4) aFloat2111 = -0.9273654f
            return (0x800 and i) != 0
        }

        @JvmStatic
        fun method1239(i: Int) {
            aStringArray2113 = null
            anIntArray2117 = null
            if (i != 30114) anIntArray2117 = null
        }

        @JvmStatic
        fun method1241(i: Int, i_2_: Int, i_3_: Int): Boolean {
            if (i_3_ > -111) method1239(-81)
            anInt2119++
            return (((i_2_ and 0x18) != 0) or ((0x220 and i_2_) == 544))
        }

        @JvmStatic
        fun method1242(string: String?, throwable: Throwable?, i: Int) {
            anInt2112++
            do {
                try {
                    var string_4_ = ""
                    if (throwable != null) string_4_ = method2766(false, throwable)
                    if (string != null) {
                        if (throwable != null) string_4_ += " | "
                        string_4_ += string
                    }
                    throwable?.printStackTrace()
                    method847(string_4_, -5192)
                    string_4_ = TileRenderState.method2680("%3a", true, ":", string_4_)
                    string_4_ = TileRenderState.method2680("%40", true, "@", string_4_)
                    string_4_ = TileRenderState.method2680("%26", true, "&", string_4_)
                    string_4_ = TileRenderState.method2680("%23", true, "#", string_4_)
                    if (FacingDirectionNode.anApplet6662 != null) {
                        if (i != 15004) method1238(-69, 63, 124)
                        val class144 = (HudTabPanel.aPrivilegedOperationWorker_2993!!.method2237(URL(FacingDirectionNode.anApplet6662!!.getCodeBase(), ("clienterror.ws?c=" + ParticleTileShape.anInt8818 + "&u=" + (if (OpenGlTerrainTile.aString8265 != null) OpenGlTerrainTile.aString8265 else NativeBufferHandle.aLong1507.toString()) + "&v1=" + PrivilegedOperationWorker.aString3782 + "&v2=" + PrivilegedOperationWorker.aString3796 + "&e=" + string_4_)), 8362))
                        while (class144!!.anInt1997 == 0) TexGenMaterialPass.method2161((-123).toByte(), 1L)
                        if (class144.anInt1997 != 1) break
                        val datainputstream = class144.anObject1998 as DataInputStream?
                        datainputstream!!.read()
                        datainputstream.close()
                    }
                } catch (exception: Exception) {
                    break
                }
                break
            } while (false)
        }
    }
}
