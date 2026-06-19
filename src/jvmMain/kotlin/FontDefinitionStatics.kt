object FontDefinitionStatics {
    var anInt1978: Int = 0
            var anInt1980: Int = 0
            var anInt1981: Int = 0
            var anInt1982: Int = 0
            var anInt1983: Int = 0
            var anInt1984: Int = 0
            var anInt1985: Int = 0
            var aFontMetaRef_1987: FontMetaRef? = FontMetaRef(66, -1)
            var anInt1989: Int = 0
            var anInt1990: Int = 0
            var anInt1991: Int = 0
            @JvmStatic
            fun method1180(i: Byte) {
                if (i.toInt() != -76) method1180(27.toByte())
                aFontMetaRef_1987 = null
            }
    
            fun method1189(i: Int, i_41_: Int) {
                anInt1991++
                if (i != -1) aFontMetaRef_1987 = null
                val class348_sub15 = (ProjectileConfigUtil.aHashtable_389!!.method3480(i_41_.toLong(), -6008) as? MenuActionNode?)
                if (class348_sub15 != null) {
                    class348_sub15.aBoolean6781 = !class348_sub15.aBoolean6781
                    class348_sub15.aClass55_Sub1_6768!!.method514(116.toByte(), class348_sub15.aBoolean6781)
                }
            }
}
