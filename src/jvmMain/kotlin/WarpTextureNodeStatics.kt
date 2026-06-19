import kotlin.math.atan2

object WarpTextureNodeStatics {
    @JvmField
            var anInt9425: Int = 0
            @JvmField
            var anInt9426: Int = 0
            @JvmField
            var aWidgetComponentArrayArray9427: Array<Array<WidgetComponent?>?>? = null
            @JvmField
            var anInt9428: Int = 0
            @JvmField
            var anInt9429: Int = 0
            @JvmField
            var anInt9430: Int = 0
    
            @JvmStatic
            fun method3137(bool: Boolean, i: Byte): Boolean {
                var bool = bool
                anInt9426++
                val bool_0_ = FacingDirectionNodeStatics.aRenderer6654!!.method3666()
                if (i.toInt() != -24) return true
                if (!bool_0_ == !bool) return true
                if (!bool) FacingDirectionNodeStatics.aRenderer6654!!.method3710()
                else if (!FacingDirectionNodeStatics.aRenderer6654!!.method3671()) bool = false
                if (bool_0_ == bool) return false
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub12_7243), if (bool) 1 else 0)
                GlCubeMapTextureStatics.method243(37)
                return true
            }
    
            @JvmStatic
            fun method3138(i: Byte) {
                aWidgetComponentArrayArray9427 = null
                val i_1_ = 93 % ((-58 - i) / 55)
            }
}
