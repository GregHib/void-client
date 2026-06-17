import FixedFunctionMaterialPass.Companion.method2145
import Class348_Sub3.Companion.method2739
import Class348_Sub40_Sub37.Companion.method3147
import Class348_Sub40_Sub39.Companion.method3153

/* Class312 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class312 {
    private var aClass348_3922: Class348? = null
    private var aNodeDeque_3923: NodeDeque? = null
    fun method2327(i: Byte): Class348? {
        anInt3929++
        val class348 = (aNodeDeque_3923!!.aClass348_3334.aClass348_4294)
        if (i.toInt() != -53) method2329(-21)
        if (aNodeDeque_3923!!.aClass348_3334 === class348) {
            aClass348_3922 = null
            return null
        }
        aClass348_3922 = class348!!.aClass348_4294
        return class348
    }

    fun method2328(nodeDeque: NodeDeque, i: Int) {
        anInt3927++
        if (i <= 73) method2327((-67).toByte())
        aNodeDeque_3923 = nodeDeque
    }

    fun method2329(i: Int): Class348? {
        anInt3928++
        if (i != 10) Companion.method2330((-25).toByte())
        val class348 = aClass348_3922
        if (aNodeDeque_3923!!.aClass348_3334 === class348) {
            aClass348_3922 = null
            return null
        }
        aClass348_3922 = class348!!.aClass348_4294
        return class348
    }

    constructor()

    internal constructor(nodeDeque: NodeDeque) {
        aNodeDeque_3923 = nodeDeque
    }

    companion object {
        var anInt3924: Int = 0
        var aIntRange_3925: IntRange?
        var anInt3926: Int = 0
        var anInt3927: Int = 0
        var anInt3928: Int = 0
        var anInt3929: Int = 0
        var anInt3930: Int = 2
        @JvmField
        var anInt3931: Int
        @JvmField
        var anInt3932: Int

        fun method2330(i: Byte) {
            method2739(0)
            anInt3924++
            if (i.toInt() == 86) {
                Class348_Sub40_Sub25.anInt9341 = 0
                Class348_Sub40_Sub36.aIntRange_9456 = null
                Class299.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                AbstractGameSocket.aIntRange_3133 = null
                GraphicsOptionState.aIntRange_3145 = null
                Class348_Sub50.anInt7213 = 0
                Class348_Sub3.aIntRange_6584 = null
                RegionSceneLoader.anInt3699 = 0
                method3153(0)
                method3147(27.toByte())
                for (i_0_ in 0..2047) LoadingBarRenderer.aPlayerArray5058!![i_0_] = null
                LocalPlayerState.aPlayer_1907 = null
                var i_1_ = 0
                while (Class348_Sub32.anInt6930 > i_1_) {
                    val npc = (Class348_Sub40_Sub23.aClass348_Sub22Array9319!![i_1_]!!.aNpc_6859)
                    if (npc != null) npc.anInt10275 = -1
                    i_1_++
                }
                Class363.method3515(i + 36)
                Class318_Sub1_Sub5_Sub2.anInt10163 = -1
                Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163
                Class348_Sub40_Sub21.anInt9282 = 1
                Class348_Sub49.method3379(2, 10)
                for (i_2_ in 0..99) GzipDecompressor.aBooleanArray2076!![i_2_] = true
                method2145(-24498)
                LightingOptionState.aClass348_Sub26_5881 = null
                FloatCameraTransform.aLong5745 = 0L
            }
        }

        @JvmStatic
        fun method2331(bool: Boolean) {
            aIntRange_3925 = null
            if (bool != true) anInt3930 = -53
        }

        fun method2332(i: Int, i_3_: Byte, i_4_: Int): Boolean {
            if (i_3_ <= 120) anInt3930 = 6
            anInt3926++
            return (0x20 and i_4_) != 0
        }

        init {
            aIntRange_3925 = IntRange(27, 3)
            anInt3931 = 0
            anInt3932 = 1403
        }
    }
}
