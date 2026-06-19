import CacheArchiveIndexLoaderStatics.method340
import SceneEntityModelStatics.method2502
import SceneEntityModelStatics.anInt6407

/* Class318_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SceneEntityModel : SceneLinkedListNode() {
    var aBoolean6409: Boolean = false
    var aClass318_Sub1_6410: SceneEntity? = null
    @JvmField
    var aClass318_Sub3Array6414: Array<SceneOcculder?>? = null

    fun method2504(i: Int, i_32_: Int, var_renderer: Renderer?, i_33_: Int): Boolean {
        if (i_33_ >= -37) method2502(null, -82)
        anInt6407++
        val i_34_ = this.aClass318_Sub1_6410!!.method2393(-117)
        if (this.aClass318_Sub3Array6414 != null) {
            var i_35_ = 0
            while (this.aClass318_Sub3Array6414!!.size > i_35_) {
                this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 = this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 shl i_34_
                if (this.aClass318_Sub3Array6414!![i_35_]!!.method2500(i_32_, i) && this.aClass318_Sub1_6410!!.method2391(var_renderer, i, i_32_, 0)) {
                    this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 = this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 shr i_34_
                    return true
                }
                this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 = this.aClass318_Sub3Array6414!![i_35_]!!.anInt6403 shr i_34_
                i_35_++
            }
        }
        return false
    }
}
