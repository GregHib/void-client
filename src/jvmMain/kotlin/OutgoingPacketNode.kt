import LinkedListIteratorStatics.method1241
import BooleanGraphicsOptionStateStatics.method1722
import SoundBankPatchStatics.method2929
import NpcReferenceStatics.method2959
import GlShadowRenderPassStatics.method3553
import GameClock.method599
import RasterSpriteStatics.method166
import OutgoingPacketNodeStatics.anInt7117

class OutgoingPacketNode : LinkedListNode() {
    var aClass348_Sub49_Sub2_7116: CipheredPacketBuffer? = null
    var aFontMetaRef_7118: FontMetaRef? = null
    var anInt7119: Int = 0
    var anInt7122: Int = 0
    fun method3326(i: Byte) {
        anInt7117++
        if (PingHostListHolder.aClass348_Sub47Array2334!!.size > GroundDecorOptionStateStatics.anInt5980 && i.toInt() == -45) PingHostListHolder.aClass348_Sub47Array2334!![GroundDecorOptionStateStatics.anInt5980++] = this
    }
}
