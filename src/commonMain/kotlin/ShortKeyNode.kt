/* Class348_Sub29 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ShortKeyNode : LinkedListNode {
    var aShort6911: Short = 0

    constructor()

    internal constructor(i: Short) {
        this.aShort6911 = i
    }

    companion object {
        var aJs5Archive_6909: Js5Archive? = null
        var anInt6910: Int = 0
        @JvmStatic
        fun method3003(i: Int) {
            aJs5Archive_6909 = null
            if (i != -4587) method3003(-101)
        }

        fun method3004(js5Archive: Js5Archive?, bool: Boolean, var_renderConfig: RenderConfig?) {
            do {
                try {
                    WalkingTypeUtil.aJs5Archive_3309 = js5Archive
                    anInt6910++
                    MatrixCameraTransform.aRenderConfig5684 = var_renderConfig
                    if (bool == false) break
                    method3004(null, false, null)
                } catch (runtimeexception: RuntimeException) {
                    throw TextureLoadException.method2929(runtimeexception, ("oia.B(" + (if (js5Archive != null) "{...}" else "null") + ',' + bool + ',' + (if (var_renderConfig != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }
    }
}
