import java.awt.*
import java.awt.image.BufferedImage
import java.awt.image.DataBufferInt
import java.awt.image.DirectColorModel
import java.awt.image.Raster
import java.util.*

class Class348_Sub31_Sub1 : Class348_Sub31() {
    private var aShape9064: Shape? = null
    private var aCanvas9065: Canvas? = null
    private var anImage9066: Image? = null
    private var aRectangle9067: Rectangle? = null

    override fun method3011(i: Int, i_0_: Int, i_1_: Int, graphics: Graphics?, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
        aShape9064 = graphics!!.getClip()
        aRectangle9067!!.x = i_3_
        aRectangle9067!!.width = i_4_
        aRectangle9067!!.y = i
        aRectangle9067!!.height = i_1_
        graphics.setClip(aRectangle9067)
        graphics.drawImage(anImage9066, i_3_ + -i_0_, -i_5_ + i, aCanvas9065)
        if (i_2_ == -1) graphics.setClip(aShape9064)
    }

    override fun method3008(canvas: Canvas?, i: Int, i_6_: Int, i_7_: Int) {
        aCanvas9065 = canvas
        aRectangle9067 = Rectangle()
        this.anInt6917 = i
        this.anInt6920 = i_7_
        this.anIntArray6916 = IntArray((this.anInt6920 * this.anInt6917))
        val databufferint = DataBufferInt(this.anIntArray6916, (this.anIntArray6916)!!.size)
        if (i_6_ > -42) method3008(null, 6, -14, 63)
        val directcolormodel = DirectColorModel(32, 16711680, 65280, 255)
        val writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel((this.anInt6917), (this.anInt6920))), databufferint, null)
        anImage9066 = BufferedImage(directcolormodel, writableraster, false, Hashtable<Any?, Any?>())
    }
}
