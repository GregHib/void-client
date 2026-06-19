import SoundBankPatchStatics.method2929
import CompletedResourceRequestStatics.method3265

/* Class352 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RenderableEntry {
    var aFont_4332: Font?
    var aFontDefinition_4333: FontDefinition? = null

    internal constructor(font: Font?) {
        this.aFont_4332 = null
        this.aFont_4332 = font
    }

    internal constructor(font: Font?, fontDefinition: FontDefinition?) {
        this.aFont_4332 = null
        try {
            this.aFontDefinition_4333 = fontDefinition
            this.aFont_4332 = font
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("el.<init>(" + (if (font != null) "{...}" else "null") + ',' + (if (fontDefinition != null) "{...}" else "null") + ')'))
        }
    }
}
