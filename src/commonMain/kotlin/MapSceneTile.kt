/* Class57 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapSceneTile {

    var anInt1046: Int = 0

    var anInt1047: Int = 0

    var anInt1052: Int = 0

    var anInt1054: Int = 0

    companion object {

        var aWidgetDefinitionArray1048s: Array<WidgetDefinition?>? = arrayOfNulls<WidgetDefinition>(14)

        var anInt1049: Int = 0

        var aAudioResampler_1050: AudioResampler? = null
        var aConfigFlagUtil_1051: ConfigFlagUtil? = ConfigFlagUtil()

        var anInt1053: Int = 0

        var aBoxedIntHolder_1055: BoxedIntHolder? = null

        @JvmStatic
        fun method529(i: Int, bool: Boolean) {
            anInt1053++
            if (bool != true) method530(-105)
            val class348_sub42_sub15 = NamedTimedNode.method2516(i, 105.toByte(), 2)
            class348_sub42_sub15.method3251(-16058)
        }

        @JvmStatic
        fun method530(i: Int) {
            aWidgetDefinitionArray1048s = null
            aBoxedIntHolder_1055 = null
            aAudioResampler_1050 = null
            aConfigFlagUtil_1051 = null
            if (i != 14) aConfigFlagUtil_1051 = null
        }

        fun method531(i: Byte, trigLookupTables: TrigLookupTables?): Int {
            val i_0_ = -45 / ((i - 54) / 43)
            anInt1049++
            if (LoadingBarRenderer.aTrigLookupTables_4247 != trigLookupTables) {
                if (trigLookupTables != GlIndexBufferArb.aTrigLookupTables_8503) {
                    if (SceneObjectEntity.aTrigLookupTables_8737 != trigLookupTables) {
                        if (RenderListTextureNode.aTrigLookupTables_9485 == trigLookupTables) return 34166
                    } else return 34168
                } else return 34167
            } else return 5890
            throw IllegalArgumentException()
        }
    }
}
