import CharCountUtil.method256
import GraphicsOptionStateStatics.method1711
import RsaVarbitHandlerStatics.method494

object WidgetCacheStatics {
    @JvmField
            var anInt1483: Int = 0
            @JvmField
            var anInt1484: Int = 0
            @JvmField
            var anInt1485: Int = 0
            @JvmField
            var anInt1486: Int = 0
            @JvmField
            var anInt1489: Int = 0
            @JvmField
            var anInt1490: Int = 0
            @JvmStatic
            fun method837(i: Int, bool: Boolean, i_3_: Int, i_4_: Int): Int {
                var i_4_ = i_4_
                i_4_ = i_4_ and 0x3
                anInt1486++
                if (i_4_ == 0) return i_3_
                if (bool != true) return -75
                if (i_4_ == 1) return 7 - i
                if (i_4_ == 2) return 7 - i_3_
                return i
            }
}
