/* Class373_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class Class373_Sub2 extends Class373
    implements MouseListener, MouseMotionListener
{
    static int anInt7426;
    static int anInt7427;
    static int anInt7428;
    static int anInt7429;
    static int anInt7430;
    static int anInt7431;
    private int anInt7432;
    static int anInt7433;
    static int anInt7434;
    static int anInt7435;
    static int anInt7436;
    static int anInt7437;
    static int anInt7438;
    static int anInt7439;
    static int anInt7440;
    private Class262 aClass262_7441 = new Class262();
    private int anInt7442;
    static int anInt7443;
    static boolean aBoolean7444 = false;
    static int anInt7445;
    static Class283[] aClass283Array7446;
    static int anInt7447;
    private int anInt7448;
    static int anInt7449;
    private Class262 aClass262_7450 = new Class262();
    static int anInt7451;
    static int anInt7452;
    private int anInt7453;
    private int anInt7454;
    static int anInt7455;
    private int anInt7456;
    static int anInt7457;
    private boolean aBoolean7458;
    private Component aComponent7459;
    
    private final void method3603(byte i, Component component) {
	anInt7447++;
	if (i >= -83)
	    mouseExited(null);
	method3608(85);
	aComponent7459 = component;
	aComponent7459.addMouseListener(this);
	aComponent7459.addMouseMotionListener(this);
    }
    
    public final synchronized void mouseDragged(MouseEvent mouseevent) {
	method3605(mouseevent.getY(), (byte) -76, mouseevent.getX());
	anInt7427++;
    }
    
    public final synchronized void mouseEntered(MouseEvent mouseevent) {
	method3605(mouseevent.getY(), (byte) -76, mouseevent.getX());
	anInt7426++;
    }
    
    private final int method3604(int i, MouseEvent mouseevent) {
	anInt7436++;
	int i_0_ = mouseevent.getModifiers();
	boolean bool = (0x10 & i_0_) != 0;
	boolean bool_1_ = (i_0_ & 0x8) != 0;
	boolean bool_2_ = (0x4 & i_0_) != 0;
	if (bool_1_ && (bool || bool_2_))
	    bool_1_ = false;
	if (bool && bool_2_)
	    return 4;
	if (bool)
	    return 1;
	if (bool_1_)
	    return 2;
	if (i != -6345)
	    method3596(-12);
	if (bool_2_)
	    return 4;
	return 0;
    }
    
    public final synchronized void mouseExited(MouseEvent mouseevent) {
	method3605(mouseevent.getY(), (byte) -76, mouseevent.getX());
	anInt7452++;
    }
    
    final boolean method3590(byte i) {
	anInt7457++;
	if (i <= 112)
	    method3606(-77, 6, -104, -59, 86);
	if ((anInt7432 & 0x4 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    final synchronized void method3589(int i) {
	if (i != 0)
	    method3589(-46);
	anInt7432 = anInt7456;
	anInt7440++;
	anInt7448 = anInt7453;
	anInt7442 = anInt7454;
	Class262 class262 = aClass262_7441;
	aClass262_7441 = aClass262_7450;
	aClass262_7450 = class262;
	aClass262_7450.method1996(i ^ 0x66);
    }
    
    public final synchronized void mouseMoved(MouseEvent mouseevent) {
	anInt7435++;
	method3605(mouseevent.getY(), (byte) -76, mouseevent.getX());
    }
    
    private final void method3605(int i, byte i_3_, int i_4_) {
	anInt7445++;
	anInt7454 = i_4_;
	if (i_3_ != -76)
	    anInt7429 = 51;
	anInt7453 = i;
	if (aBoolean7458)
	    method3606(-1, i, i_4_, 0, -125);
    }
    
    final int method3594(byte i) {
	anInt7430++;
	if (i <= 69)
	    return -123;
	return anInt7448;
    }
    
    final Class348_Sub45 method3596(int i) {
	if (i != 0)
	    mouseReleased(null);
	anInt7437++;
	return (Class348_Sub45) aClass262_7441.method1997(i + 8);
    }
    
    private final void method3606(int i, int i_5_, int i_6_, int i_7_,
				  int i_8_) {
	anInt7439++;
	Class348_Sub45_Sub2 class348_sub45_sub2 = new Class348_Sub45_Sub2();
	((Class348_Sub45_Sub2) class348_sub45_sub2).anInt9739 = i_6_;
	((Class348_Sub45_Sub2) class348_sub45_sub2).anInt9733 = i_5_;
	((Class348_Sub45_Sub2) class348_sub45_sub2).anInt9730 = i_7_;
	((Class348_Sub45_Sub2) class348_sub45_sub2).anInt9736 = i;
	((Class348_Sub45_Sub2) class348_sub45_sub2).aLong9734
	    = Class62.method599(-110);
	aClass262_7450.method1999(class348_sub45_sub2, -20180);
	if (i_8_ >= -110)
	    method3607(28, null, -68);
    }
    
    public final synchronized void mouseClicked(MouseEvent mouseevent) {
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
	anInt7438++;
    }
    
    final void method3592(int i) {
	if (i != 0)
	    method3597(false);
	anInt7433++;
	method3608(84);
    }
    
    final boolean method3588(int i) {
	int i_9_ = -108 % ((-38 - i) / 48);
	anInt7434++;
	if ((anInt7432 & 0x2 ^ 0xffffffff) == -1)
	    return false;
	return true;
    }
    
    final boolean method3595(int i) {
	anInt7455++;
	if (i >= -67)
	    mouseExited(null);
	if ((anInt7432 & 0x1) == 0)
	    return false;
	return true;
    }
    
    static final String method3607(int i, Class348_Sub49 class348_sub49,
				   int i_10_) {
	int i_11_ = 17 % ((9 - i_10_) / 59);
	anInt7451++;
	try {
	    int i_12_ = class348_sub49.method3382(-122);
	    if ((i_12_ ^ 0xffffffff) < (i ^ 0xffffffff))
		i_12_ = i;
	    byte[] is = new byte[i_12_];
	    ((Class348_Sub49) class348_sub49).anInt7197
		+= (Class64.aClass296_1131.method2226
		    (is, ((Class348_Sub49) class348_sub49).anInt7197,
		     ((Class348_Sub49) class348_sub49).aByteArray7154, i_12_,
		     -1, 0));
	    String string = Class367_Sub8.method3546(is, 0, i_12_, 0);
	    return string;
	} catch (Exception exception) {
	    return "Cabbage";
	}
    }
    
    public final synchronized void mouseReleased(MouseEvent mouseevent) {
	anInt7428++;
	int i = method3604(-6345, mouseevent);
	if ((i & anInt7456 ^ 0xffffffff) == -1)
	    i = anInt7456;
	if ((i & 0x1 ^ 0xffffffff) != -1)
	    method3606(3, mouseevent.getY(), mouseevent.getX(),
		       mouseevent.getClickCount(), -116);
	if ((0x4 & i) != 0)
	    method3606(5, mouseevent.getY(), mouseevent.getX(),
		       mouseevent.getClickCount(), -119);
	if ((0x2 & i) != 0)
	    method3606(4, mouseevent.getY(), mouseevent.getX(),
		       mouseevent.getClickCount(), -117);
	anInt7456 &= i ^ 0xffffffff;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    private final void method3608(int i) {
	anInt7431++;
	if (aComponent7459 != null) {
	    aComponent7459.removeMouseMotionListener(this);
	    aComponent7459.removeMouseListener(this);
	    aComponent7459 = null;
	    aClass262_7441 = null;
	    aClass262_7450 = null;
	    anInt7442 = anInt7448 = anInt7432 = 0;
	    int i_13_ = -106 / ((-57 - i) / 46);
	    anInt7454 = anInt7453 = anInt7456 = 0;
	}
    }
    
    final int method3597(boolean bool) {
	if (bool != true)
	    anInt7453 = -101;
	anInt7443++;
	return anInt7442;
    }
    
    public final synchronized void mousePressed(MouseEvent mouseevent) {
	anInt7449++;
	int i = method3604(-6345, mouseevent);
	if (i != 1) {
	    if (i == 4)
		method3606(2, mouseevent.getY(), mouseevent.getX(),
			   mouseevent.getClickCount(), -112);
	    else if (i == 2)
		method3606(1, mouseevent.getY(), mouseevent.getX(),
			   mouseevent.getClickCount(), -121);
	} else
	    method3606(0, mouseevent.getY(), mouseevent.getX(),
		       mouseevent.getClickCount(), -126);
	anInt7456 |= i;
	if (mouseevent.isPopupTrigger())
	    mouseevent.consume();
    }
    
    public static void method3609(byte i) {
	int i_14_ = 49 % ((i - -35) / 41);
	aClass283Array7446 = null;
    }
    
    Class373_Sub2(Component component, boolean bool) {
	method3603((byte) -108, component);
	aBoolean7458 = bool;
    }
}
