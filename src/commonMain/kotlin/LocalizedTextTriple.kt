/* Class295 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LocalizedTextTriple internal constructor(string: String?, string_4_: String?, string_5_: String?) {
    var aString3754: String? = null
    var aString3756: String? = null
    var aString3758: String? = null

    init {
        try {
            this.aString3754 = string_4_
            this.aString3758 = string_5_
            this.aString3756 = string
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("wc.<init>(" + (if (string != null) "{...}" else "null") + ',' + (if (string_4_ != null) "{...}" else "null") + ',' + (if (string_5_ != null) "{...}" else "null") + ')'))
        }
    }
}