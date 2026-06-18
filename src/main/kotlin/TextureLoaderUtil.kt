/* Class320 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object TextureLoaderUtil {
    var aShort3992: Short = 320
    var anInt3993: Int = 0
    var aFloat3994: Float = 0f

    fun method2547(i: Int, i_0_: Byte): Boolean {
        anInt3993++
        if (AudioResampler.aBooleanArray2162!![i]) return true
        if (!RenderConfigFactory.aJs5Archive_2978!!.method408((-124).toByte(), i)) return false
        val i_1_ = RenderConfigFactory.aJs5Archive_2978!!.method407(0, i)
        if (i_1_ == 0) {
            AudioResampler.aBooleanArray2162!![i] = true
            return true
        }
        if (WarpTextureNode.aWidgetComponentArrayArray9427!![i] == null) WarpTextureNode.aWidgetComponentArrayArray9427!![i] = arrayOfNulls<WidgetComponent>(i_1_)
        var i_2_ = 0
        while (i_1_ > i_2_) {
            if (WarpTextureNode.aWidgetComponentArrayArray9427!![i]!![i_2_] == null) {
                val `is` = RenderConfigFactory.aJs5Archive_2978!!.method410(i_0_.toInt() xor 0x717.inv(), i, i_2_)
                if (`is` != null) {
                    val widgetComponent = (WidgetComponent().also { WarpTextureNode.aWidgetComponentArrayArray9427!![i]!![i_2_] = it })
                    widgetComponent.anInt830 = i_2_ + (i shl 16)
                    check(`is`[0].toInt() == -1) { "if1" }
                    widgetComponent.method433(Buffer(`is`), true)
                }
            }
            i_2_++
        }
        if (i_0_.toInt() != 84) aFloat3994 = -0.8522395f
        AudioResampler.aBooleanArray2162!![i] = true
        return true
    }
}
