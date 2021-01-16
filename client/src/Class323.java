/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

final class Class323
{
    private boolean aBoolean4037 = false;
    private static int anInt4038
	= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
	      .length();
    private int[] anIntArray4039;
    private int anInt4040;
    private int anInt4041;
    private Class105[] aClass105Array4042;
    private static int[] anIntArray4043 = new int[256];
    private int[] anIntArray4044 = new int[4];
    
    private final void method2559(ha var_ha, Font font,
				  FontMetrics fontmetrics, char c, int i,
				  boolean bool) {
	int i_0_ = fontmetrics.charWidth(c);
	int i_1_ = i_0_;
	if (bool) {
	    try {
		if (c == '/')
		    bool = false;
		if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k'
		    || c == 'x' || c == 'y' || c == 'A' || c == 'V'
		    || c == 'W')
		    i_0_++;
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	int i_2_ = fontmetrics.getMaxAscent();
	int i_3_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
	int i_4_ = fontmetrics.getHeight();
	Image image = Class305.aCanvas3869.createImage(i_0_, i_3_);
	Graphics graphics = image.getGraphics();
	graphics.setColor(Color.black);
	graphics.fillRect(0, 0, i_0_, i_3_);
	graphics.setColor(Color.white);
	graphics.setFont(font);
	graphics.drawString(String.valueOf(c), 0, i_2_);
	if (bool)
	    graphics.drawString(String.valueOf(c), 1, i_2_);
	int[] is = new int[i_0_ * i_3_];
	PixelGrabber pixelgrabber
	    = new PixelGrabber(image, 0, 0, i_0_, i_3_, is, 0, i_0_);
	try {
	    pixelgrabber.grabPixels();
	} catch (Exception exception) {
	    /* empty */
	}
	image.flush();
	Object object = null;
	int i_5_ = 0;
    while_113_:
	for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
	    for (int i_7_ = 0; i_7_ < i_0_; i_7_++) {
		int i_8_ = is[i_7_ + i_6_ * i_0_];
		if ((i_8_ & 0xffffff) != 0) {
		    i_5_ = i_6_;
		    break while_113_;
		}
	    }
	}
	for (int i_9_ = 0; i_9_ < is.length; i_9_++) {
	    if ((is[i_9_] & 0xffffff) == 0)
		is[i_9_] = 0;
	}
	anInt4041 = i_2_ - i_5_;
	anInt4040 = i_4_;
	anIntArray4039[i] = i_1_;
	aClass105Array4042[i]
	    = var_ha.method3662(i_0_, is, (byte) 94, 0, i_0_, i_3_);
    }
    
    final int method2560() {
	return anInt4041;
    }
    
    private final void method2561(ha var_ha, String string, int[] is, int i,
				  int i_10_, int i_11_, boolean bool) {
	if (i_11_ == 0)
	    bool = false;
	i_11_ |= ~0xffffff;
	for (int i_12_ = 0; i_12_ < string.length(); i_12_++) {
	    int i_13_ = anIntArray4043[string.charAt(i_12_)];
	    if (bool)
		aClass105Array4042[i_13_].method964(i + 1, i_10_ + 1, 0,
						    -16777216, 1);
	    aClass105Array4042[i_13_].method964(i, i_10_, 0, i_11_, 1);
	    i += anIntArray4039[i_13_];
	}
    }
    
    public static void method2562() {
	anIntArray4043 = null;
    }
    
    final void method2563(ha var_ha, String string, int i, int i_14_,
			  int i_15_, boolean bool) {
	int i_16_ = method2564(string) / 2;
	var_ha.K(anIntArray4044);
	if (i - i_16_ <= anIntArray4044[2] && i + i_16_ >= anIntArray4044[0]
	    && i_14_ - anInt4041 <= anIntArray4044[3]
	    && i_14_ + anInt4040 >= anIntArray4044[1])
	    method2561(var_ha, string, anIntArray4044, i - i_16_, i_14_, i_15_,
		       bool);
    }
    
    final int method2564(String string) {
	int i = 0;
	for (int i_17_ = 0; i_17_ < string.length(); i_17_++) {
	    int i_18_ = anIntArray4043[string.charAt(i_17_)];
	    i += anIntArray4039[i_18_];
	}
	return i;
    }
    
    final int method2565() {
	return anInt4040 - 1;
    }
    
    Class323(ha var_ha, int i, boolean bool, Component component) {
	aBoolean4037 = false;
	aClass105Array4042 = new Class105[256];
	anIntArray4039 = new int[256];
	Font font = new Font("Helvetica", bool ? 1 : 0, i);
	FontMetrics fontmetrics = component.getFontMetrics(font);
	for (int i_19_ = 0; i_19_ < anInt4038; i_19_++)
	    method2559
		(var_ha, font, fontmetrics,
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		     .charAt(i_19_),
		 i_19_, false);
	if (bool && aBoolean4037) {
	    aBoolean4037 = false;
	    font = new Font("Helvetica", 0, i);
	    fontmetrics = component.getFontMetrics(font);
	    for (int i_20_ = 0; i_20_ < anInt4038; i_20_++)
		method2559
		    (var_ha, font, fontmetrics,
		     "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			 .charAt(i_20_),
		     i_20_, false);
	    if (!aBoolean4037) {
		aBoolean4037 = false;
		for (int i_21_ = 0; i_21_ < anInt4038; i_21_++)
		    method2559
			(var_ha, font, fontmetrics,
			 "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			     .charAt(i_21_),
			 i_21_, true);
	    }
	}
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_22_
		= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		      .indexOf(i);
	    if (i_22_ == -1)
		i_22_ = 74;
	    anIntArray4043[i] = i_22_;
	}
    }
}
