import ParticleDetailOptionStateStatics.method1796
import SoundBankPatchStatics.method2929
import SpriteComponentStatics.method202

object TextureMaterialGroupStatics {
    var anInt9670: Int = 0
            var aClass348_Sub42_Sub17Array9672: Array<TextureMaterialGroup?>? = arrayOfNulls<TextureMaterialGroup>(14)
            var anInt9674: Int = 0
            var anInt9675: Int = 0
            var anInt9676: Int = 0
            var anInt9677: Int = 0
            @JvmField
            var anIntArrayArray9678: Array<IntArray?>? = null
            var aFontMetaRef_9679: FontMetaRef? = FontMetaRef(27, 7)
            var anInt9680: Int = 0
    
            fun method3266(var_renderer: Renderer?, i: Int, locTypeConfig: LocTypeConfig?): Int {
                try {
                    anInt9674++
                    if (locTypeConfig!!.anInt3569 == -1) {
                        if (locTypeConfig.anInt3575 != -1) {
                            val class12 = var_renderer!!.aRenderConfig4579!!.method3(locTypeConfig.anInt3575, -6662)
                            if (!class12!!.aBoolean209) return class12.aShort208.toInt()
                        }
                    } else return locTypeConfig.anInt3569
                    if (i <= 123) return -68
                    return locTypeConfig.anInt3563
                } catch (runtimeexception: RuntimeException) {
                    throw method2929(runtimeexception, ("gw.F(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + (if (locTypeConfig != null) "{...}" else "null") + ')'))
                }
            }
    
            @JvmStatic
            fun method3269(bool: Boolean) {
                aClass348_Sub42_Sub17Array9672 = null
                aFontMetaRef_9679 = null
                anIntArrayArray9678 = null
                if (bool != true) method3270((-116).toByte())
            }
    
            fun method3270(i: Byte) {
                if (i <= 106) method3266(null, -91, null)
                var class348_sub42_sub12 = (SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1995(4) as ContactEntry?)
                while (class348_sub42_sub12 != null) {
                    if (method1796(69, class348_sub42_sub12.anInt9608)) method202(6, class348_sub42_sub12)
                    class348_sub42_sub12 = SourceRowTextureNodeStatics.aNodeDeque_9111!!.method1990(115.toByte()) as ContactEntry?
                }
                anInt9680++
            }
}
