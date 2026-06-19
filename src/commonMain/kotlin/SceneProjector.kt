/* Class230 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SceneProjector internal constructor(string: String?, i: Int) {

    var aString2985: String? = null

    var anInt2987: Int = 0
    override fun toString(): String {
        anInt2989++
        throw IllegalStateException()
    }

    init {
        try {
            this.aString2985 = string
            this.anInt2987 = i
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("sj.<init>(" + (if (string != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    companion object {
        var anInt2989: Int = 0
    }
}