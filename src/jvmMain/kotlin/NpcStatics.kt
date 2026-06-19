import CircleDrawer.method1496
import LinkedListNodeStatics.method2711
import SoundBankPatchStatics.method2929
import NpcTypeStatics.method802
import ChatMessageStreamStatics.method136

object NpcStatics {
    var anInt10493: Int = 0
            var anInt10494: Int = 0
            var anInt10495: Int = 0
            var anInt10496: Int = 0
            var anInt10497: Int = 0
            var anInt10498: Int = 0
            var anInt10500: Int = 0
            var anInt10501: Int = 0
            var anInt10502: Int = 0
            var anInt10503: Int = 0
            var anInt10504: Int = 0
            var anInt10506: Int = 0
            var anInt10507: Int = 0
            var anInt10508: Int = 0
            var anInt10509: Int = 0
            var anInt10510: Int = 0
            var anInt10511: Int = 0
            var anInt10513: Int = 0
            var anInt10514: Int = 0
            var anInt10515: Int = 0
    
            fun method2441(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
                if (i_2_ != -22728) anInt10503 = 121
                if (i_5_ - i_0_ >= WorldMapLabelStatics.anInt4960 && CameraNodeListStatics.anInt1745 >= i_0_ + i_5_ && -i_0_ + i_3_ >= LocalPlayerState.anInt1910 && i_3_ + i_0_ <= WidgetTextConfigStatics.anInt513) CircleRasterizerStatics.method2255(i_0_, i_5_, (-68).toByte(), i_1_, i_3_, i_4_, i)
                else method1496(i, i_3_, i_4_, i_0_, 2, i_1_, i_5_)
                anInt10498++
            }
    
            fun method2446(c: Char, i: Byte): Boolean {
                if (i.toInt() != 105) anInt10503 = 124
                anInt10508++
                return (c.code >= 48 && c.code <= 57) || (c.code >= 65 && c.code <= 90) || (c.code >= 97 && c.code <= 122)
            }
}
