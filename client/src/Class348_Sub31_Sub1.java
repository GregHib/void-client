/* Class348_Sub31_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

final class Class348_Sub31_Sub1 extends Class348_Sub31 {
    private Shape aShape9064;
    private Canvas aCanvas9065;
    private Image anImage9066;
    private Rectangle aRectangle9067;

    final void method3011(int i, int i_0_, int i_1_, Graphics graphics,
                          int i_2_, int i_3_, int i_4_, int i_5_) {
        aShape9064 = graphics.getClip();
        aRectangle9067.x = i_3_;
        aRectangle9067.width = i_4_;
        aRectangle9067.y = i;
        aRectangle9067.height = i_1_;
        graphics.setClip(aRectangle9067);
        graphics.drawImage(anImage9066, i_3_ + -i_0_, -i_5_ + i, aCanvas9065);
        if (i_2_ == -1)
            graphics.setClip(aShape9064);
    }

    final void method3008(Canvas canvas, int i, int i_6_, int i_7_) {
        aCanvas9065 = canvas;
        aRectangle9067 = new Rectangle();
        ((Class348_Sub31_Sub1) this).anInt6917 = i;
        ((Class348_Sub31_Sub1) this).anInt6920 = i_7_;
        ((Class348_Sub31_Sub1) this).anIntArray6916
                = new int[(((Class348_Sub31_Sub1) this).anInt6920
                * ((Class348_Sub31_Sub1) this).anInt6917)];
        DataBufferInt databufferint
                = new DataBufferInt(((Class348_Sub31_Sub1) this).anIntArray6916,
                (((Class348_Sub31_Sub1) this)
                        .anIntArray6916).length);
        if (i_6_ > -42)
            method3008(null, 6, -14, 63);
        DirectColorModel directcolormodel
                = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster writableraster
                = Raster.createWritableRaster((directcolormodel
                        .createCompatibleSampleModel
                                ((((Class348_Sub31_Sub1) this)
                                                .anInt6917),
                                        (((Class348_Sub31_Sub1) this)
                                                .anInt6920))),
                databufferint, null);
        anImage9066 = new BufferedImage(directcolormodel, writableraster,
                false, new Hashtable());
    }
}
