import DirectionPathStatics.method536
import CompositeRgbNoiseTextureStatics.method574
import NpcTypeStatics.method802
import MapSceneIconDefStatics.anInt2850
import MapSceneIconDefStatics.anInt2852
import MapSceneIconDefStatics.anInt2857
import MapSceneIconDefStatics.anInt2858
import MapSceneIconDefStatics.aNodeDeque_2859
import MapSceneIconDefStatics.aIntRange_2860

/* Class218 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapSceneIconDef {
    var aTextureDefinitionLoader_2851: TextureDefinitionLoader? = null
    @JvmField
    var anInt2853: Int = 0
    @JvmField
    var aBoolean2854: Boolean = false
    @JvmField
    var anInt2856: Int = 0
    fun method1593(i: Int): Boolean {
        if (i != 106) this.aTextureDefinitionLoader_2851 = null
        anInt2858++
        return this.aTextureDefinitionLoader_2851!!.aJs5Archive_1965!!.method421(false, this.anInt2853)
    }

    private fun method1595(i: Byte, i_17_: Int, class348_sub49: ByteBuffer) {
        anInt2852++
        if (i >= 5) {
            if (i_17_ == 1) this.anInt2853 = class348_sub49.readUnsignedShort(842397944)
            else if (i_17_ != 2) {
                if (i_17_ == 3) this.aBoolean2854 = true
                else if (i_17_ == 4) this.anInt2853 = -1
            } else this.anInt2856 = class348_sub49.readMedium(-1)
        }
    }

    fun method1596(i: Int, bool: Boolean, i_18_: Int, var_renderer: Renderer): AbstractModelRenderer? {
        anInt2857++
        if (i_18_ < 51) aIntRange_2860 = null
        val l = (var_renderer.anInt4567 shl 19 or (this.anInt2853 or (i shl 16) or (if (!bool) 0 else 262144))).toLong()
        var abstractModelRenderer = this.aTextureDefinitionLoader_2851!!.aLruByteCache_1976.method583(l, -87) as AbstractModelRenderer?
        if (abstractModelRenderer != null) return abstractModelRenderer
        if (!this.aTextureDefinitionLoader_2851!!.aJs5Archive_1965!!.method421(false, this.anInt2853)) return null
        val spriteImage = SpriteImageStatics.method1521(this.aTextureDefinitionLoader_2851!!.aJs5Archive_1965!!, this.anInt2853, 0)
        if (spriteImage != null) {
            spriteImage.anInt2700 = 0
            spriteImage.anInt2698 = spriteImage.anInt2700
            spriteImage.anInt2703 = spriteImage.anInt2698
            spriteImage.anInt2701 = spriteImage.anInt2703
            if (bool) spriteImage.method1514()
            for (i_19_ in 0..<i) spriteImage.method1520()
        }
        abstractModelRenderer = var_renderer.method3691(spriteImage, true)
        if (abstractModelRenderer != null) this.aTextureDefinitionLoader_2851!!.aLruByteCache_1976.method582(abstractModelRenderer, l, (-101).toByte())
        return abstractModelRenderer
    }

    fun method1597(i: Byte, class348_sub49: ByteBuffer) {
        anInt2850++
        while (true) {
            val i_20_ = class348_sub49.readUnsignedByte(255)
            if (i_20_ == 0) break
            method1595(61.toByte(), i_20_, class348_sub49)
        }
        if (i.toInt() != -114) aNodeDeque_2859 = null
    }
}
