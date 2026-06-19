import GlCubeMapTextureStatics.method245
import ClickFeedbackTaskStatics.method1353
import GlTexture2DStatics.method1969
import WaterMaterialPassStatics.method2148
import CubemapTextureGlSourceStatics.method2264
import MidiSequencePlayerStatics.method2878
import InvertTextureNodeStatics.method3135
import DirectionPathStatics.method536
import NpcTypeStatics.method802
import OpenGlRenderNodeStatics.method3297

/* Class348_Sub14 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LongKeyNode : LinkedListNode {
    var aLong6762: Long = 0

    constructor()

    internal constructor(l: Long) {
        try {
            this.aLong6762 = l
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, "ij.<init>(" + l + ')')
        }
    }
}
