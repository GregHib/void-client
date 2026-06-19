import CollisionMapAccessor.method2064
import ChatMessageStreamStatics.method136
import kotlin.math.atan2
import kotlin.math.sqrt
import kotlin.math.tan

object TrackedGroundDecorStatics {
    var anInt10370: Int = 0
            var anInt10372: Int = 0
            var anInt10373: Int = 0
            var anInt10374: Int = 0
            var anInt10376: Int = 0
            var anInt10377: Int = 0
            var anInt10379: Int = 0
            var anInt10380: Int = 0
            var anInt10382: Int = 0
            var anInt10385: Int = 0
            var anInt10388: Int = 0
            var anInt10389: Int = 0
            var anInt10390: Int = 0
            var anInt10394: Int = 0
            @JvmField
            var anInt10395: Int = -1
            var anInt10397: Int = 0
            var anInt10402: Int = 0
            var anInt10404: Int = 0
            var anInt10405: Int = 0
            var anInt10406: Int = 0
            var anInt10415: Int = 0
    
            fun method2477(string: String?, string_37_: String?, i: Byte, i_38_: Int, string_39_: String?, string_40_: String?, i_41_: Int, i_42_: Int, string_43_: String?) {
                try {
                    anInt10382++
                    var hintArrowOrMessage: HintArrowOrMessage? = SceneModelBuilderStatics.aHintArrowOrMessageArray6400s!![99]
                    for (i_44_ in 99 downTo 1) SceneModelBuilderStatics.aHintArrowOrMessageArray6400s!![i_44_] = SceneModelBuilderStatics.aHintArrowOrMessageArray6400s!![i_44_ + -1]
                    if (hintArrowOrMessage == null) hintArrowOrMessage = HintArrowOrMessage(i_41_, i_42_, string_39_, string, string_43_, string_40_, i_38_, string_37_)
                    else hintArrowOrMessage.method1196(i_41_, i_42_, string_43_, string, string_40_, -18691, i_38_, string_39_, string_37_)
                    SceneModelBuilderStatics.aHintArrowOrMessageArray6400s!![0] = hintArrowOrMessage
                    LoadingScreenImageNodeStatics.anInt9501 = ResourceLoaderThreadStatics.anInt3918
                    if (i <= -109) NativeShaderProgramStatics.anInt9774++
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("to.K(" + (if (string != null) "{...}" else "null") + ',' + (if (string_37_ != null) "{...}" else "null") + ',' + i + ',' + i_38_ + ',' + (if (string_39_ != null) "{...}" else "null") + ',' + (if (string_40_ != null) "{...}" else "null") + ',' + i_41_ + ',' + i_42_ + ',' + (if (string_43_ != null) "{...}" else "null") + ')'))
                }
            }
}
