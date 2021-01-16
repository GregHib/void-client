/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class186
{
    static Class45 aClass45_2490;
    static Class74 aClass74_2491;
    static boolean aBoolean2492 = false;
    static int anInt2493;
    static String[] aStringArray2494;
    static Class351 aClass351_2495;
    static String aString2496;
    static int[] anIntArray2497;
    
    public static void method1396(int i) {
	aClass45_2490 = null;
	aClass74_2491 = null;
	aStringArray2494 = null;
	anIntArray2497 = null;
	aString2496 = null;
	aClass351_2495 = null;
	if (i != 25)
	    aClass351_2495 = null;
    }
    
    static final void method1397(int i) {
	anInt2493++;
	int i_0_ = Class328_Sub1.anInt6513;
	int[] is = Class286_Sub7.anIntArray6290;
	for (int i_1_ = 0; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
	    Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2
		= Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058[is[i_1_]];
	    if (class318_sub1_sub3_sub3_sub2 != null
		&& ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
		     .anInt10264)
		    ^ 0xffffffff) < -1) {
		((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
		    .anInt10264--;
		if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
		     .anInt10264)
		    == 0)
		    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub2)
			.aString10292
			= null;
	    }
	}
	for (int i_2_ = i;
	     (Class150.anInt2057 ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
	    long l = (long) Class74.anIntArray1233[i_2_];
	    Class348_Sub22 class348_sub22
		= ((Class348_Sub22)
		   Class282.aClass356_3654.method3480(l, -6008));
	    if (class348_sub22 != null) {
		Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1
		    = (((Class348_Sub22) class348_sub22)
		       .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
		if (((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
		      .anInt10264)
		     ^ 0xffffffff)
		    < -1) {
		    ((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3_sub1)
			.anInt10264--;
		    if (((Class318_Sub1_Sub3_Sub3)
			 class318_sub1_sub3_sub3_sub1).anInt10264
			== 0)
			((Class318_Sub1_Sub3_Sub3)
			 class318_sub1_sub3_sub3_sub1).aString10292
			    = null;
		}
	    }
	}
    }
    
    public Class186() {
	/* empty */
    }
    
    abstract void method1398(int i, int i_3_, float f, float f_4_, int i_5_,
			     float f_6_, int i_7_, float f_8_, int i_9_,
			     int i_10_, float[] fs);
    
    static {
	aClass74_2491 = new Class74(13, -1);
	aStringArray2494 = new String[100];
	aClass351_2495 = new Class351(35, 5);
	aString2496 = "";
	anIntArray2497 = new int[25];
    }
}
