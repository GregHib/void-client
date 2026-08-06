/* Class200 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ScriptResources {
    var aOutgoingPacketHeader_2638: OutgoingPacketHeader? = OutgoingPacketHeader(59, 8)
    var aTextureDefinitionCache_2639: TextureDefinitionCache? = null

    var aAbstractModelRendererArray2640: Array<AbstractModelRenderer?>? = null

    @JvmStatic
    fun method1463(i: Byte) {
        aOutgoingPacketHeader_2638 = null
        aAbstractModelRendererArray2640 = null
        if (i.toInt() != 25) aAbstractModelRendererArray2640 = null
        aTextureDefinitionCache_2639 = null
    }
}
