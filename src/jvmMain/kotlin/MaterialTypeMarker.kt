/* Class328_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class MaterialTypeMarker : ShaderObject() {
    companion object {
        var aConnectionStateTypeArray6515: Array<ConnectionStateType?>? = null
        var anInt6516: Int = 0
        @JvmField
        var aLruByteCache_6517: LruByteCache? = LruByteCache(4)
        var anInt6518: Int = 0

        fun method2612(class348_sub49: ByteBuffer, bool: Boolean): ConfigValueProvider {
            anInt6518++
            val i = class348_sub49.readUnsignedShort(842397944)
            if (bool != true) method2613(-27)
            return ConfigValueProvider(i)
        }

        @JvmStatic
        fun method2613(i: Int) {
            aConnectionStateTypeArray6515 = null
            aLruByteCache_6517 = null
            if (i != -1) method2613(58)
        }
    }
}
