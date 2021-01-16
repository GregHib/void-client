/* za_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeap;

import jaggl.OpenGL;

final class za_Sub2 extends za
{
    static int anInt9777;
    static int anInt9778;
    static int anInt9779;
    static int anInt9780;
    static Class138 aClass138_9781;
    NativeHeap aNativeHeap9782;
    static boolean aBoolean9783 = false;
    
    static final Class193 method3442(int i, byte[] is, Class377 class377,
				     int i_0_) {
	try {
	    anInt9779++;
	    if (is == null)
		return null;
	    int i_1_ = OpenGL.glGenProgramARB();
	    OpenGL.glBindProgramARB(i, i_1_);
	    OpenGL.glProgramRawARB(i, 34933, is);
	    OpenGL.glGetIntegerv(34379, Class104.anIntArray1626, 0);
	    if ((Class104.anIntArray1626[0] ^ 0xffffffff) != 0) {
		OpenGL.glBindProgramARB(i, 0);
		return null;
	    }
	    OpenGL.glBindProgramARB(i, 0);
	    if (i_0_ != 4)
		return null;
	    return new Class193(class377, i, i_1_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("cu.A(" + i + ','
					     + (is != null ? "{...}" : "null")
					     + ','
					     + (class377 != null ? "{...}"
						: "null")
					     + ',' + i_0_ + ')'));
	}
    }
    
    static final void method3443
	(boolean bool, Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3) {
	anInt9778++;
	if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
	     .anIntArray10242) != null
	    || (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		.anIntArray10296) != null) {
	    boolean bool_2_ = bool;
	    for (int i = 0;
		 i < (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		      .anIntArray10242).length;
		 i++) {
		int i_3_ = -1;
		if ((((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		     .anIntArray10242)
		    != null)
		    i_3_ = (((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
			    .anIntArray10242[i]);
		if ((i_3_ ^ 0xffffffff) == 0) {
		    if (!class318_sub1_sub3_sub3.method2423(-80, i, -1))
			bool_2_ = false;
		} else {
		    bool_2_ = false;
		    boolean bool_4_ = false;
		    boolean bool_5_ = false;
		    int i_6_;
		    int i_7_;
		    if ((i_3_ & ~0x3fffffff ^ 0xffffffff) == 1073741823) {
			int i_8_ = i_3_ & 0xfffffff;
			int i_9_ = i_8_ >> -934245874;
			i_7_ = (((Class318_Sub1) class318_sub1_sub3_sub3)
				.anInt6377) - 512 * (i_9_ - anInt9780) - 256;
			int i_10_ = i_8_ & 0x3fff;
			i_6_ = (-256 - (i_10_ - Class90.anInt1517) * 512
				+ (((Class318_Sub1) class318_sub1_sub3_sub3)
				   .anInt6388));
		    } else if ((0x8000 & i_3_) == 0) {
			Class348_Sub22 class348_sub22
			    = ((Class348_Sub22)
			       Class282.aClass356_3654.method3480((long) i_3_,
								  -6008));
			if (class348_sub22 == null) {
			    class318_sub1_sub3_sub3.method2423(-96, i, -1);
			    continue;
			}
			Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1
			    = (((Class348_Sub22) class348_sub22)
			       .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
			i_6_ = ((((Class318_Sub1) class318_sub1_sub3_sub3)
				 .anInt6388)
				- ((Class318_Sub1)
				   class318_sub1_sub3_sub3_sub1).anInt6388);
			i_7_
			    = (-(((Class318_Sub1) class318_sub1_sub3_sub3_sub1)
				 .anInt6377)
			       + (((Class318_Sub1) class318_sub1_sub3_sub3)
				  .anInt6377));
		    } else {
			int i_11_ = i_3_ & 0x7fff;
			Class318_Sub1_Sub3_Sub3_Sub2 class318_sub1_sub3_sub3_sub2
			    = (Class294.aClass318_Sub1_Sub3_Sub3_Sub2Array5058
			       [i_11_]);
			if (class318_sub1_sub3_sub3_sub2 == null) {
			    class318_sub1_sub3_sub3.method2423(67, i, -1);
			    continue;
			}
			i_6_ = ((((Class318_Sub1) class318_sub1_sub3_sub3)
				 .anInt6388)
				- ((Class318_Sub1)
				   class318_sub1_sub3_sub3_sub2).anInt6388);
			i_7_
			    = (-(((Class318_Sub1) class318_sub1_sub3_sub3_sub2)
				 .anInt6377)
			       + (((Class318_Sub1) class318_sub1_sub3_sub3)
				  .anInt6377));
		    }
		    if ((i_7_ ^ 0xffffffff) != -1 || (i_6_ ^ 0xffffffff) != -1)
			class318_sub1_sub3_sub3.method2423
			    (-100, i, 0x3fff & (int) (Math.atan2((double) i_7_,
								 (double) i_6_)
						      * 2607.5945876176133));
		}
	    }
	    if (bool_2_) {
		((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		    .anIntArray10242
		    = null;
		((Class318_Sub1_Sub3_Sub3) class318_sub1_sub3_sub3)
		    .anIntArray10296
		    = null;
	    }
	}
    }
    
    public static void method3444(int i) {
	if (i <= -85)
	    aClass138_9781 = null;
    }
    
    final void method3445(int i) {
	((za_Sub2) this).aNativeHeap9782.b();
	if (i != -9503)
	    anInt9780 = -29;
	anInt9777++;
    }
    
    za_Sub2(int i) {
	((za_Sub2) this).aNativeHeap9782 = new NativeHeap(i);
    }
    
    static {
	aClass138_9781 = new Class138(14, 0, 4, 1);
    }
}
