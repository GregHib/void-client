object BloomGraphicsOptionStateStatics {
    @JvmField
            var anInt5960: Int = 0
            @JvmField
            var anInt5961: Int = 0
            @JvmField
            var anInt5962: Int = 0
            @JvmField
            var anInt5963: Int = 0
            @JvmField
            var aJs5Archive_5964: Js5Archive? = null
            @JvmField
            var anInt5965: Int = 0
            @JvmField
            var aString5966: String? = null
            @JvmField
            var anInt5967: Int = 0
            @JvmField
            var anInt5968: Int = 0
            @JvmField
            var anInt5969: Int = 0
            @JvmField
            var anInt5970: Int = 0
            @JvmField
            var aLong5971: Long = 0
            @JvmField
            var anInt5972: Int = 0
            @JvmField
            var anInt5973: Int = 0
    
            @JvmStatic
            fun method1772(i: Int) {
                anInt5968++
                var class348_sub15 = ProjectileConfigUtil.aHashtable_389!!.method3484(0) as MenuActionNode?
                if (i <= 4) aString5966 = null
                while ( /**/class348_sub15 != null) {
                    OpenGlModelStatics.method690(108.toByte(), (class348_sub15.anInt6773))
                    class348_sub15 = ProjectileConfigUtil.aHashtable_389!!.method3482(0) as MenuActionNode?
                }
            }
    
            @JvmStatic
            fun method1773(i: Byte) {
                val i_3_ = -86 / ((i - 13) / 45)
                aString5966 = null
                aJs5Archive_5964 = null
            }
    
            @JvmStatic
            fun method1775(i: Byte, i_4_: Int, i_5_: Int) {
                anInt5967++
                if (i.toInt() == -8 && TextureLoaderUtil.method2547(i_4_, 84.toByte())) BlankTextureNodeStatics.method3097((WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i_4_]!!), i_5_, 119)
            }
}
