/* Class348_Sub35 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub35 : Class348 {
    @JvmField
    var anInt6976: Int = 0

    constructor()

    internal constructor(i: Int) {
        this.anInt6976 = i
    }

    companion object {
        var anInt6975: Int = 0
        var aClass74_6977: Class74? = Class74(8, 3)
        var aNodeDeque_6978: NodeDeque?
        var anInt6979: Int = 0
        var aClass45_6980: Class45? = null
        var anInt6981: Int = 0

        fun method3027(i: Byte) {
            anInt6975++
            if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 0 && Class355.anInt4372 != ParticleSystemState.anInt2204) Class348_Sub41.Companion.method3157(FileIoUtil.anInt4095, 123.toByte(), Renderer.anInt4581, 11, false)
            else {
                Class348_Sub46.method3319(Class348_Sub8.aRenderer6654, (-121).toByte())
                if (i.toInt() != 33) method3028(-79)
                if (TrackedGroundDecor.anInt10395 != Class355.anInt4372) Class348_Sub40_Sub9.method3072((-96).toByte())
            }
        }

        @JvmStatic
        fun method3028(i: Int) {
            if (i != -11677) Companion.method3027((-80).toByte())
            aClass74_6977 = null
            aClass45_6980 = null
            aNodeDeque_6978 = null
        }

        init {
            aNodeDeque_6978 = NodeDeque()
        }
    }
}
