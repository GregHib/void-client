/* p - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

final class p extends Class348 implements Interface19
{
    long nativeid;
    private static boolean aBoolean5144 = false;
    int anInt5145;
    private static long aLong5146;
    Canvas aCanvas5147;
    int anInt5148;
    
    private final native void sa(oa var_oa, Canvas canvas, int i, int i_0_);
    
    public final native void w(boolean bool);
    
    private final native void H(int i, int i_1_, int i_2_, int i_3_);
    
    private final native void oa(Canvas canvas, int i, int i_4_);
    
    private final void method3432(Exception exception) {
	if (!aBoolean5144) {
	    aLong5146 = Class62.method599(-54);
	    aBoolean5144 = true;
	} else if (Class62.method599(-88) - aLong5146 < 30000L)
	    ((p) this).aCanvas5147.repaint();
	else
	    throw new RuntimeException(exception.getMessage());
    }
    
    private final native void K(int i, int i_5_, int i_6_, int i_7_, int i_8_,
				int i_9_);
    
    final void method3433(int i, int i_10_) {
	try {
	    synchronized (((p) this).aCanvas5147.getTreeLock()) {
		Dimension dimension = ((p) this).aCanvas5147.getSize();
		H(i, i_10_, dimension.width, dimension.height);
		aBoolean5144 = false;
	    }
	} catch (Exception exception) {
	    method3432(exception);
	}
    }
    
    protected final void finalize() {
	if (((p) this).nativeid != 0L)
	    Class257.method1947(0, this);
    }
    
    p(oa var_oa, Canvas canvas, int i, int i_11_) {
	((p) this).aCanvas5147 = canvas;
	((p) this).anInt5145 = i;
	((p) this).anInt5148 = i_11_;
	sa(var_oa, ((p) this).aCanvas5147, i, i_11_);
    }
    
    final void method3434(Rectangle[] rectangles, int i, int i_12_,
			  int i_13_) {
	try {
	    synchronized (((p) this).aCanvas5147.getTreeLock()) {
		for (int i_14_ = 0; i_14_ < i; i_14_++) {
		    Rectangle rectangle = rectangles[i_14_];
		    if (rectangle.width > 0 && rectangle.height > 0)
			K(rectangle.x, rectangle.y, rectangle.width,
			  rectangle.height, i_12_, i_13_);
		}
		aBoolean5144 = false;
	    }
	} catch (Exception exception) {
	    method3432(exception);
	}
    }
    
    final void method3435(Canvas canvas, int i, int i_15_) {
	((p) this).anInt5145 = i;
	((p) this).anInt5148 = i_15_;
	oa(canvas, i, i_15_);
    }
    
    final void method3436() {
	w(true);
	((p) this).nativeid = 0L;
	((p) this).aCanvas5147 = null;
    }
}
