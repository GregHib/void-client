/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Date;

import jagex3.jagmisc.jagmisc;

public abstract class Applet_Sub1 extends Applet
    implements Runnable, FocusListener, WindowListener
{
    static int anInt1;
    static int anInt2;
    static int anInt3;
    static int anInt4;
    static int anInt5;
    static int anInt6;
    static int anInt7;
    static int anInt8;
    static int anInt9;
    static int anInt10;
    static int anInt11;
    static int anInt12;
    static int anInt13;
    static int anInt14;
    static int anInt15;
    static int anInt16;
    private boolean aBoolean17 = false;
    static int anInt18;
    static int anInt19;
    static Class324 aClass324_20;
    static int anInt21;
    static int anInt22;
    static int anInt23;
    static int anInt24;
    static int anInt25;
    static int anInt26;
    private boolean aBoolean27 = false;
    static int anInt28;
    static int anInt29;
    static int anInt30;
    static int anInt31;
    static int anInt32;
    static int anInt33;
    static int anInt34;
    static int anInt35;
    static int anInt36;
    static int anInt37;
    static int[] anIntArray38;
    static int anInt39;
    static int anInt40;
    public static boolean aBoolean41;
    public static int anInt42;
    public static int anInt43;
    public static int anInt44;
    public static int anInt45;
    public static boolean aBoolean46;
    public static boolean aBoolean47;
    public static boolean aBoolean48;
    public static boolean aBoolean49;
    public static boolean aBoolean50;
    public static boolean aBoolean51;
    public static boolean aBoolean52;
    public static int anInt53;
    public static boolean aBoolean54;
    public static int anInt55;
    public static boolean aBoolean56;
    public static int anInt57;
    public static boolean aBoolean58;
    public static int anInt59;
    
    abstract void method80(int i);
    
    public final void stop() {
	anInt24++;
	if (this == Class348_Sub40_Sub9.anApplet_Sub1_9169
	    && !Class26.aBoolean384)
	    Class113.aLong1739 = Class62.method599(-73) - -4000L;
    }
    
    public final String getParameter(String string) {
	anInt3++;
	if (Class52.aFrame4904 != null)
	    return null;
	if (Class93.anApplet1530 != null && Class93.anApplet1530 != this)
	    return Class93.anApplet1530.getParameter(string);
	return super.getParameter(string);
    }
    
    String method81(byte i) {
	anInt1++;
	if (i <= 40)
	    run();
	return null;
    }
    
    final void method82(int i, String string) {
	int i_0_ = 88 / ((i - -5) / 54);
	anInt22++;
	if (!aBoolean27) {
	    aBoolean27 = true;
	    System.out.println("error_game_" + string);
	    try {
		Class224.method1617((byte) 125, Class93.anApplet1530,
				    "loggedout");
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		getAppletContext().showDocument(new URL(getCodeBase(),
							("error_game_" + string
							 + ".ws")),
						"_top");
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    public final void windowActivated(WindowEvent windowevent) {
	anInt16++;
    }
    
    final boolean method83(boolean bool) {
	if (bool != true)
	    getDocumentBase();
	anInt5++;
	return Class348_Sub40_Sub19.method3098(-30282, "jagmisc");
    }
    
    public final void focusLost(FocusEvent focusevent) {
	anInt9++;
	Class348_Sub40_Sub16.aBoolean9229 = false;
    }
    
    private final void method84(int i) {
	anInt8++;
	long l = Class62.method599(i + -88);
	long l_1_ = Class328_Sub2_Sub1.aLongArray8800[Class244.anInt4613];
	Class328_Sub2_Sub1.aLongArray8800[Class244.anInt4613] = l;
	Class244.anInt4613 = 0x1f & 1 + Class244.anInt4613;
	if (l_1_ != 0L
	    && (l_1_ ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
	    /* empty */
	}
	synchronized (this) {
	    Class175.aBoolean2329 = Class348_Sub40_Sub16.aBoolean9229;
	}
	method99((byte) 93);
	if (i != -1)
	    aBoolean27 = true;
    }
    
    public final void update(Graphics graphics) {
	anInt34++;
	paint(graphics);
    }
    
    static final void method85(int i, Class45 class45) {
	anInt32++;
	Class369_Sub3.aClass45_8601 = class45;
	if (i != 0)
	    anInt37 = 101;
    }
    
    public final void windowClosing(WindowEvent windowevent) {
	anInt15++;
	destroy();
    }
    
    public final URL getDocumentBase() {
	anInt30++;
	if (Class52.aFrame4904 != null)
	    return null;
	if (Class93.anApplet1530 != null && this != Class93.anApplet1530)
	    return Class93.anApplet1530.getDocumentBase();
	return super.getDocumentBase();
    }
    
    static final boolean method86(String string, int i) {
	anInt13++;
	if (i != 0)
	    return true;
	return Class275.aHashtable3548.containsKey(string);
    }
    
    public final void windowDeactivated(WindowEvent windowevent) {
	anInt12++;
    }
    
    synchronized void method87(byte i) {
	if (i > -11)
	    paint(null);
	if (Class305.aCanvas3869 != null) {
	    Class305.aCanvas3869.removeFocusListener(this);
	    Class305.aCanvas3869.getParent().setBackground(Color.black);
	    Class305.aCanvas3869.getParent().remove(Class305.aCanvas3869);
	}
	anInt7++;
	Container container;
	if (Class34.aFrame476 == null) {
	    if (Class52.aFrame4904 == null) {
		if (Class93.anApplet1530 == null)
		    container = Class348_Sub40_Sub9.anApplet_Sub1_9169;
		else
		    container = Class93.anApplet1530;
	    } else
		container = Class52.aFrame4904;
	} else
	    container = Class34.aFrame476;
	container.setLayout(null);
	Class305.aCanvas3869 = new Canvas_Sub1(this);
	container.add(Class305.aCanvas3869);
	Class305.aCanvas3869.setSize(Class321.anInt4017,
				     Class348_Sub42_Sub8_Sub2.anInt10432);
	Class305.aCanvas3869.setVisible(true);
	if (container == Class52.aFrame4904) {
	    Insets insets = Class52.aFrame4904.getInsets();
	    Class305.aCanvas3869.setLocation((insets.left
					      + Class348_Sub48.anInt7129),
					     insets.top - -Class335.anInt4167);
	} else
	    Class305.aCanvas3869.setLocation(Class348_Sub48.anInt7129,
					     Class335.anInt4167);
	Class305.aCanvas3869.addFocusListener(this);
	Class305.aCanvas3869.requestFocus();
	Class348_Sub40_Sub16.aBoolean9229 = true;
	Class175.aBoolean2329 = true;
	Class49.aBoolean4726 = true;
	Class203.aBoolean2674 = false;
	Class348_Sub12.aLong6748 = Class62.method599(-106);
    }
    
    public final void windowOpened(WindowEvent windowevent) {
	anInt39++;
    }
    
    public final synchronized void paint(Graphics graphics) {
	anInt18++;
	if (this == Class348_Sub40_Sub9.anApplet_Sub1_9169
	    && !Class26.aBoolean384) {
	    Class49.aBoolean4726 = true;
	    if (Class367_Sub4.aBoolean7320
		&& (-Class348_Sub12.aLong6748 + Class62.method599(-57)
		    ^ 0xffffffffffffffffL) < -1001L) {
		Rectangle rectangle = graphics.getClipBounds();
		if (rectangle == null
		    || ((Class272.anInt3473 ^ 0xffffffff) >= (rectangle.width
							      ^ 0xffffffff)
			&& ((rectangle.height ^ 0xffffffff)
			    <= (Class348_Sub22.anInt6857 ^ 0xffffffff))))
		    Class203.aBoolean2674 = true;
	    }
	}
    }
    
    private final void method88(int i) {
	anInt2++;
	long l = Class62.method599(-119);
	long l_2_ = Class348_Sub49.aLongArray7206[Class152.anInt2071];
	Class348_Sub49.aLongArray7206[Class152.anInt2071] = l;
	if (l_2_ != 0L && l_2_ < l) {
	    int i_3_ = (int) (l - l_2_);
	    Class239_Sub5.anInt5891 = (32000 + (i_3_ >> -1288403455)) / i_3_;
	}
	Class152.anInt2071 = Class152.anInt2071 - -1 & 0x1f;
	if (Class159.anInt2127++ > 50) {
	    Class159.anInt2127 -= 50;
	    Class49.aBoolean4726 = true;
	    Class305.aCanvas3869.setSize(Class321.anInt4017,
					 Class348_Sub42_Sub8_Sub2.anInt10432);
	    Class305.aCanvas3869.setVisible(true);
	    if (Class52.aFrame4904 != null && Class34.aFrame476 == null) {
		Insets insets = Class52.aFrame4904.getInsets();
		Class305.aCanvas3869.setLocation((insets.left
						  - -Class348_Sub48.anInt7129),
						 (insets.top
						  + Class335.anInt4167));
	    } else
		Class305.aCanvas3869.setLocation(Class348_Sub48.anInt7129,
						 Class335.anInt4167);
	}
	method93(-11018);
	if (i > -107)
	    method90(true, true);
    }
    
    public final void windowDeiconified(WindowEvent windowevent) {
	anInt35++;
    }
    
    public final void focusGained(FocusEvent focusevent) {
	anInt23++;
	Class348_Sub40_Sub16.aBoolean9229 = true;
	Class49.aBoolean4726 = true;
    }
    
    public final void windowClosed(WindowEvent windowevent) {
	anInt33++;
    }
    
    final boolean method89(int i) {
	anInt40++;
	if (i <= 19)
	    return true;
	String string = getDocumentBase().getHost().toLowerCase();
	if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
	    return true;
	if (string.equals("runescape.com")
	    || string.endsWith(".runescape.com"))
	    return true;
	if (string.equals("rs2rsps.no-ip.org") || string.endsWith(".rs2rsps.no-ip.org"))
	    return true;
	if (string.endsWith("127.0.0.1"))
	    return true;
	for (/**/;
	     (string.length() > 0 && string.charAt(-1 + string.length()) >= '0'
	      && (string.charAt(-1 + string.length()) ^ 0xffffffff) >= -58);
	     string = string.substring(0, string.length() - 1)) {
	    /* empty */
	}
	if (string.endsWith("192.168.1."))
	    return true;
	//method82(53, "invalidhost");
	//return false;
	return true;
    }
    
    private final void method90(boolean bool, boolean bool_4_) {
	anInt26++;
	synchronized (this) {
	    if (Class26.aBoolean384)
		return;
	    Class26.aBoolean384 = true;
	}
	System.out.println("Shutdown start - clean:" + bool);
	if (Class93.anApplet1530 != null)
	    Class93.anApplet1530.destroy();
	if (bool_4_ != false)
	    aBoolean17 = false;
	try {
	    method80(0);
	} catch (Exception exception) {
	    /* empty */
	}
	if (aBoolean17) {
	    try {
		jagmisc.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    aBoolean17 = false;
	}
	Class257.method1945((byte) -128, true);
	Class228.method1629(!bool_4_);
	if (Class305.aCanvas3869 != null) {
	    try {
		Class305.aCanvas3869.removeFocusListener(this);
		Class305.aCanvas3869.getParent().remove(Class305.aCanvas3869);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	if (Class348_Sub23_Sub1.aClass297_8992 != null) {
	    try {
		Class348_Sub23_Sub1.aClass297_8992.method2234((byte) 103);
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	method91((byte) 108);
	if (Class52.aFrame4904 != null) {
	    Class52.aFrame4904.setVisible(false);
	    Class52.aFrame4904.dispose();
	    Class52.aFrame4904 = null;
	}
	System.out.println("Shutdown complete - clean:" + bool);
    }
    
    public static final void provideLoaderApplet(Applet applet) {
	anInt11++;
	Class93.anApplet1530 = applet;
    }
    
    abstract void method91(byte i);
    
    public final AppletContext getAppletContext() {
	anInt19++;
	if (Class52.aFrame4904 != null)
	    return null;
	if (Class93.anApplet1530 != null && this != Class93.anApplet1530)
	    return Class93.anApplet1530.getAppletContext();
	return super.getAppletContext();
    }
    
    public final URL getCodeBase() {
	anInt29++;
	if (Class52.aFrame4904 != null)
	    return null;
	if (Class93.anApplet1530 != null && this != Class93.anApplet1530)
	    return Class93.anApplet1530.getCodeBase();
	return super.getCodeBase();
    }
    
    public abstract void init();
    
    public final void destroy() {
	anInt21++;
	if (Class348_Sub40_Sub9.anApplet_Sub1_9169 == this
	    && !Class26.aBoolean384) {
	    Class113.aLong1739 = Class62.method599(-108);
	    Class286_Sub5.method2161((byte) 77, 5000L);
	    Class231.aClass297_2993 = null;
	    method90(false, false);
	}
    }
    
    public final void run() {
	anInt28++;
	do {
	    try {
		if (Class297.aString3782 != null) {
		    String string = Class297.aString3782.toLowerCase();
		    if (string.indexOf("sun") != -1
			|| (string.indexOf("apple") ^ 0xffffffff) != 0) {
			String string_5_ = Class297.aString3796;
			if (string_5_.equals("1.1")
			    || string_5_.startsWith("1.1.")
			    || string_5_.equals("1.2")
			    || string_5_.startsWith("1.2.")) {
			    method82(-119, "wrongjava");
			    break;
			}
		    } else if ((string.indexOf("ibm") ^ 0xffffffff) != 0
			       && (Class297.aString3796 == null
				   || Class297.aString3796.equals("1.4.2"))) {
			method82(81, "wrongjava");
			break;
		    }
		}
		if (Class297.aString3796 != null
		    && Class297.aString3796.startsWith("1.")) {
		    int i = 2;
		    int i_6_ = 0;
		    while ((i ^ 0xffffffff)
			   > (Class297.aString3796.length() ^ 0xffffffff)) {
			int i_7_ = Class297.aString3796.charAt(i);
			if (i_7_ < 48 || i_7_ > 57)
			    break;
			i++;
			i_6_ = 10 * i_6_ - (-i_7_ + 48);
		    }
		    if ((i_6_ ^ 0xffffffff) <= -6)
			Class367_Sub4.aBoolean7320 = true;
		}
		Applet applet = Class348_Sub40_Sub9.anApplet_Sub1_9169;
		if (Class93.anApplet1530 != null)
		    applet = Class93.anApplet1530;
		Method method = Class297.aMethod3786;
		if (method != null) {
		    try {
			method.invoke(applet, new Object[] { Boolean.TRUE });
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
		aa_Sub3.method168((byte) 103);
		Class127_Sub1.method1119(false);
		method87((byte) -97);
		method92(28740);
		Class348_Sub8.aClass241_6660 = Class229.method1631(false);
		while (Class113.aLong1739 == 0L
		       || ((Class113.aLong1739 ^ 0xffffffffffffffffL)
			   < (Class62.method599(-124)
			      ^ 0xffffffffffffffffL))) {
		    Class101_Sub2.anInt5744
			= Class348_Sub8.aClass241_6660
			      .method1861(0, Class73.aLong4783);
		    for (int i = 0; Class101_Sub2.anInt5744 > i; i++)
			method84(-1);
		    method88(-119);
		    Class369_Sub3_Sub1.method3578((byte) -42,
						  Class305.aCanvas3869,
						  (Class348_Sub23_Sub1
						   .aClass297_8992));
		}
	    } catch (Throwable throwable) {
		Class156.method1242(method81((byte) 109), throwable, 15004);
		method82(123, "crash");
	    } finally {
		method90(true, false);
	    }
	} while (false);
    }
    
    abstract void method92(int i);
    
    abstract void method93(int i);
    
    static final void method94(String string, int i) {
	anInt6++;
	if (Class286_Sub1.aStringArray6200 == null)
	    Class14_Sub3.method249(2);
	Class286_Sub3.aCalendar6221.setTime(new Date(Class62.method599(-102)));
	int i_8_ = Class286_Sub3.aCalendar6221.get(11);
	int i_9_ = Class286_Sub3.aCalendar6221.get(12);
	int i_10_ = Class286_Sub3.aCalendar6221.get(13);
	String string_11_
	    = (Integer.toString(i_8_ / 10) + i_8_ % 10 + ":" + i_9_ / 10
	       + i_9_ % 10 + ":" + i_10_ / 10 + i_10_ % 10);
	String[] strings = Class348_Sub40_Sub23.method3113('\n', true, string);
	for (int i_12_ = 0; i_12_ < strings.length; i_12_++) {
	    for (int i_13_ = Class369_Sub2.anInt8587;
		 (i_13_ ^ 0xffffffff) < -1; i_13_--)
		Class286_Sub1.aStringArray6200[i_13_]
		    = Class286_Sub1.aStringArray6200[-1 + i_13_];
	    Class286_Sub1.aStringArray6200[0]
		= string_11_ + ": " + strings[i_12_];
	    if (Class299_Sub1.aFileOutputStream6323 != null) {
		try {
		    Class299_Sub1.aFileOutputStream6323.write
			(Class348_Sub24.method2992(((Class286_Sub1
						     .aStringArray6200[0])
						    + "\n"),
						   (byte) -20));
		} catch (java.io.IOException ioexception) {
		    /* empty */
		}
	    }
	    if ((Class369_Sub2.anInt8587 ^ 0xffffffff)
		> (-1 + Class286_Sub1.aStringArray6200.length ^ 0xffffffff)) {
		Class369_Sub2.anInt8587++;
		if (Class284.anInt3676 > 0)
		    Class284.anInt3676++;
	    }
	}
	int i_14_ = 85 / ((i - -1) / 52);
    }
    
    final void method95(int i, int i_15_, int i_16_, int i_17_, int i_18_,
			String string, int i_19_) {
	anInt25++;
	try {
	    if (Class348_Sub40_Sub9.anApplet_Sub1_9169 != null) {
		Class348_Sub51.anInt7252++;
		if (Class348_Sub51.anInt7252 >= 3)
		    method82(112, "alreadyloaded");
		else
		    getAppletContext().showDocument(getDocumentBase(),
						    "_self");
	    } else {
		Class348_Sub48.anInt7129 = 0;
		Class348_Sub22.anInt6857
		    = Class348_Sub42_Sub8_Sub2.anInt10432 = i_16_;
		Class272.anInt3473 = Class321.anInt4017 = i;
		Class335.anInt4167 = 0;
		Class348_Sub1_Sub3.anInt8818 = i_15_;
		Class348_Sub40_Sub9.anApplet_Sub1_9169 = this;
		Class348_Sub8.anApplet6662 = Class93.anApplet1530;
		Class231.aClass297_2993
		    = Class348_Sub23_Sub1.aClass297_8992
		    = new Class297(i_17_, string, i_18_,
				   Class93.anApplet1530 != null);
		Class144 class144
		    = Class348_Sub23_Sub1.aClass297_8992.method2236(this,
								    -10240, 1);
		if (i_19_ != 50)
		    anInt37 = -13;
		while ((class144.anInt1997 ^ 0xffffffff) == -1)
		    Class286_Sub5.method2161((byte) -126, 10L);
	    }
	} catch (Throwable throwable) {
	    Class156.method1242(null, throwable, 15004);
	    method82(52, "crash");
	}
    }
    
    final void method96(int i, int i_20_, boolean bool, int i_21_, int i_22_,
			String string, int i_23_, int i_24_) {
	try {
	    if (i_23_ != 23499)
		return;
	    Class272.anInt3473 = Class321.anInt4017 = i_20_;
	    Class348_Sub22.anInt6857 = Class348_Sub42_Sub8_Sub2.anInt10432
		= i_24_;
	    Class348_Sub40_Sub9.anApplet_Sub1_9169 = this;
	    Class335.anInt4167 = 0;
	    Class348_Sub48.anInt7129 = 0;
	    Class348_Sub1_Sub3.anInt8818 = i_21_;
	    Class348_Sub8.anApplet6662 = null;
	    Class52.aFrame4904 = new Frame();
	    Class52.aFrame4904.setTitle("Jagex");
	    Class52.aFrame4904.setResizable(true);
	    Class52.aFrame4904.addWindowListener(this);
	    Class52.aFrame4904.setVisible(true);
	    Class52.aFrame4904.toFront();
	    Insets insets = Class52.aFrame4904.getInsets();
	    Class52.aFrame4904.setSize(insets.right + (insets.left
						       + Class272.anInt3473),
				       (insets.bottom
					+ (Class348_Sub22.anInt6857
					   + insets.top)));
	    Class231.aClass297_2993 = Class348_Sub23_Sub1.aClass297_8992
		= new Class297(i, string, i_22_, true);
	    Class144 class144 = Class348_Sub23_Sub1.aClass297_8992
				    .method2236(this, i_23_ + -33739, 1);
	    while (class144.anInt1997 == 0)
		Class286_Sub5.method2161((byte) 21, 10L);
	} catch (Exception exception) {
	    Class156.method1242(null, exception, i_23_ + -8495);
	}
	anInt31++;
    }
    
    public final void windowIconified(WindowEvent windowevent) {
	anInt14++;
    }
    
    final boolean method97(int i) {
	if (i != -1)
	    method88(-104);
	anInt4++;
	return Class348_Sub40_Sub19.method3098(-30282, "jaclib");
    }
    
    public static void method98(int i) {
	anIntArray38 = null;
	aClass324_20 = null;
	if (i != 32717)
	    method86(null, 65);
    }
    
    public final void start() {
	anInt36++;
	if (this == Class348_Sub40_Sub9.anApplet_Sub1_9169
	    && !Class26.aBoolean384)
	    Class113.aLong1739 = 0L;
    }
    
    abstract void method99(byte i);
    
    final boolean method100(int i) {
	anInt10++;
	if (i != 10)
	    return true;
	return Class348_Sub40_Sub19.method3098(-30282, "jagtheora");
    }
}
