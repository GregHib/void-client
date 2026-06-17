/* Class222 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class UnderlayDefinition {
    var anInt2883: Int = 0
    var aItemDefinitionLoader_2886: ItemDefinitionLoader? = null
    var anInt2890: Int = 0
    private var anInt2891 = 0
    private fun method1608(i: Int, class348_sub49: Buffer, i_0_: Byte) {
        anInt2887++
        if (i == 1) anInt2891 = class348_sub49.readUnsignedShort(842397944)
        else if (i == 2) {
            this.anInt2883 = class348_sub49.readUnsignedByte(255)
            this.anInt2890 = class348_sub49.readUnsignedByte(255)
        }
    }

    @Synchronized
    fun method1610(i: Byte): SpriteImage? {
        anInt2888++
        var spriteImage = this.aItemDefinitionLoader_2886!!.aClass60_2190!!.method583(anInt2891.toLong(), -70) as? SpriteImage?
        if (spriteImage != null) return spriteImage
        spriteImage = SpriteImage.method1521(this.aItemDefinitionLoader_2886!!.aClass45_2180!!, anInt2891, 0)
        if (i < 49) method1609(93.toByte())
        if (spriteImage != null) this.aItemDefinitionLoader_2886!!.aClass60_2190!!.method582(spriteImage, anInt2891.toLong(), (-120).toByte())
        return spriteImage
    }

    fun method1611(class348_sub49: Buffer, bool: Boolean) {
        while (true) {
            val i = class348_sub49.readUnsignedByte(255)
            if (i == 0) break
            method1608(i, class348_sub49, 4.toByte())
        }
        anInt2889++
        if (bool != false) method1610((-86).toByte())
    }

    companion object {
        @JvmField
        var anInt2884: Int = 0
        @JvmField
        var aRectangleRegion_2885: RectangleRegion? = RectangleRegion(4, 1, 1, 1)
        var anInt2887: Int = 0
        var anInt2888: Int = 0
        var anInt2889: Int = 0
        var aFontMetaRef_2892: FontMetaRef? = FontMetaRef(39, 8)

        @JvmStatic
        fun method1609(i: Byte) {
            if (i <= -71) {
                aFontMetaRef_2892 = null
                aRectangleRegion_2885 = null
            }
        }
    }
}
