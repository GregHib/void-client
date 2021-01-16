/* Class335 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class335
{
    static int anInt4166;
    static int anInt4167 = 0;
    static int anInt4168 = 0;
    static int anInt4169;
    
    static final void method2655(int i, int i_0_, int i_1_, int i_2_,
				 int i_3_) {
	anInt4166++;
	for (Class348_Sub9 class348_sub9
		 = (Class348_Sub9) Class218.aClass262_2859.method1995(4);
	     class348_sub9 != null;
	     class348_sub9 = ((Class348_Sub9)
			      Class218.aClass262_2859.method1990((byte) 97)))
	    Class238_Sub1.method1708(i_1_, i_3_, i_0_, i_2_, (byte) -78,
				     class348_sub9);
	for (Class348_Sub9 class348_sub9
		 = (Class348_Sub9) client.aClass262_5185.method1995(4);
	     class348_sub9 != null;
	     class348_sub9 = ((Class348_Sub9)
			      client.aClass262_5185.method1990((byte) 85))) {
	    int i_4_ = 1;
	    Class225 class225 = ((Class348_Sub9) class348_sub9)
				    .aClass318_Sub1_Sub3_Sub3_Sub1_6691
				    .method2422((byte) 72);
	    if ((((Class318_Sub1_Sub3_Sub3)
		  (((Class348_Sub9) class348_sub9)
		   .aClass318_Sub1_Sub3_Sub3_Sub1_6691)).anInt10268
		 ^ 0xffffffff) == 0
		|| ((Class318_Sub1_Sub3_Sub3)
		    (((Class348_Sub9) class348_sub9)
		     .aClass318_Sub1_Sub3_Sub3_Sub1_6691)).aBoolean10213)
		i_4_ = 0;
	    else if ((((Class225) class225).anInt2919
		      == ((Class318_Sub1_Sub3_Sub3)
			  (((Class348_Sub9) class348_sub9)
			   .aClass318_Sub1_Sub3_Sub3_Sub1_6691)).anInt10268)
		     || ((((Class318_Sub1_Sub3_Sub3)
			   (((Class348_Sub9) class348_sub9)
			    .aClass318_Sub1_Sub3_Sub3_Sub1_6691)).anInt10268
			  ^ 0xffffffff)
			 == (((Class225) class225).anInt2920 ^ 0xffffffff))
		     || (((Class225) class225).anInt2949
			 == ((Class318_Sub1_Sub3_Sub3)
			     (((Class348_Sub9) class348_sub9)
			      .aClass318_Sub1_Sub3_Sub3_Sub1_6691)).anInt10268)
		     || ((((Class225) class225).anInt2914 ^ 0xffffffff)
			 == (((Class318_Sub1_Sub3_Sub3)
			      (((Class348_Sub9) class348_sub9)
			       .aClass318_Sub1_Sub3_Sub3_Sub1_6691)).anInt10268
			     ^ 0xffffffff)))
		i_4_ = 2;
	    else if (((((Class225) class225).anInt2940 ^ 0xffffffff)
		      == (((Class318_Sub1_Sub3_Sub3)
			   (((Class348_Sub9) class348_sub9)
			    .aClass318_Sub1_Sub3_Sub3_Sub1_6691)).anInt10268
			  ^ 0xffffffff))
		     || (((Class225) class225).anInt2924
			 == ((Class318_Sub1_Sub3_Sub3)
			     (((Class348_Sub9) class348_sub9)
			      .aClass318_Sub1_Sub3_Sub3_Sub1_6691)).anInt10268)
		     || ((((Class318_Sub1_Sub3_Sub3)
			   (((Class348_Sub9) class348_sub9)
			    .aClass318_Sub1_Sub3_Sub3_Sub1_6691)).anInt10268
			  ^ 0xffffffff)
			 == (((Class225) class225).anInt2947 ^ 0xffffffff))
		     || (((Class318_Sub1_Sub3_Sub3)
			  (((Class348_Sub9) class348_sub9)
			   .aClass318_Sub1_Sub3_Sub3_Sub1_6691)).anInt10268
			 == ((Class225) class225).anInt2958))
		i_4_ = 3;
	    if ((i_4_ ^ 0xffffffff)
		!= (((Class348_Sub9) class348_sub9).anInt6675 ^ 0xffffffff)) {
		int i_5_
		    = Class8.method214((((Class348_Sub9) class348_sub9)
					.aClass318_Sub1_Sub3_Sub3_Sub1_6691),
				       -1);
		Class79 class79 = (((Class318_Sub1_Sub3_Sub3_Sub1)
				    (((Class348_Sub9) class348_sub9)
				     .aClass318_Sub1_Sub3_Sub3_Sub1_6691))
				   .aClass79_10505);
		if (((Class79) class79).anIntArray1377 != null)
		    class79 = class79.method794((Class318_Sub1_Sub3_Sub3
						 .aClass170_10209),
						-1);
		if (class79 != null && i_5_ != -1) {
		    if (((i_5_ ^ 0xffffffff)
			 == (((Class348_Sub9) class348_sub9).anInt6685
			     ^ 0xffffffff))
			&& (!((Class79) class79).aBoolean1370
			    != ((Class348_Sub9) class348_sub9).aBoolean6674)) {
			((Class348_Sub9) class348_sub9).anInt6677
			    = ((Class79) class79).anInt1356;
			((Class348_Sub9) class348_sub9).anInt6675 = i_4_;
		    } else {
			boolean bool = false;
			if ((((Class348_Sub9) class348_sub9)
			     .aClass348_Sub16_Sub5_6676)
			    == null)
			    bool = true;
			else {
			    ((Class348_Sub9) class348_sub9).anInt6677 -= 512;
			    if ((((Class348_Sub9) class348_sub9).anInt6677
				 ^ 0xffffffff)
				>= -1) {
				Class348_Sub43.aClass348_Sub16_Sub4_7065
				    .method2880
				    (((Class348_Sub9) class348_sub9)
				     .aClass348_Sub16_Sub5_6676);
				bool = true;
				((Class348_Sub9) class348_sub9)
				    .aClass348_Sub16_Sub5_6676
				    = null;
			    }
			}
			if (bool) {
			    ((Class348_Sub9) class348_sub9).aBoolean6674
				= ((Class79) class79).aBoolean1370;
			    ((Class348_Sub9) class348_sub9).anInt6685 = i_5_;
			    ((Class348_Sub9) class348_sub9)
				.aClass348_Sub19_Sub1_6686
				= null;
			    ((Class348_Sub9) class348_sub9)
				.aClass348_Sub10_6688
				= null;
			    ((Class348_Sub9) class348_sub9).anInt6675 = i_4_;
			    ((Class348_Sub9) class348_sub9).anInt6677
				= ((Class79) class79).anInt1356;
			}
		    }
		} else {
		    ((Class348_Sub9) class348_sub9).anInt6675 = i_4_;
		    ((Class348_Sub9) class348_sub9).aBoolean6674 = false;
		    ((Class348_Sub9) class348_sub9).anInt6685 = -1;
		}
	    }
	    ((Class348_Sub9) class348_sub9).anInt6678
		= (((Class318_Sub1) (((Class348_Sub9) class348_sub9)
				     .aClass318_Sub1_Sub3_Sub3_Sub1_6691))
		   .anInt6377);
	    ((Class348_Sub9) class348_sub9).anInt6698
		= ((((Class318_Sub1) (((Class348_Sub9) class348_sub9)
				      .aClass318_Sub1_Sub3_Sub3_Sub1_6691))
		    .anInt6377)
		   - -(((Class348_Sub9) class348_sub9)
			   .aClass318_Sub1_Sub3_Sub3_Sub1_6691
			   .method2436((byte) 55)
		       << -206175832));
	    ((Class348_Sub9) class348_sub9).anInt6689
		= (((Class318_Sub1) (((Class348_Sub9) class348_sub9)
				     .aClass318_Sub1_Sub3_Sub3_Sub1_6691))
		   .anInt6388);
	    ((Class348_Sub9) class348_sub9).anInt6687
		= ((((Class318_Sub1) (((Class348_Sub9) class348_sub9)
				      .aClass318_Sub1_Sub3_Sub3_Sub1_6691))
		    .anInt6388)
		   + (((Class348_Sub9) class348_sub9)
			  .aClass318_Sub1_Sub3_Sub3_Sub1_6691
			  .method2436((byte) 92)
		      << 271262248));
	    Class238_Sub1.method1708(i_1_, i_3_, i_0_, i_2_, (byte) -78,
				     class348_sub9);
	}
	Class348_Sub9 class348_sub9
	    = ((Class348_Sub9)
	       Class348_Sub42_Sub16_Sub2.aClass356_10465.method3484(0));
	int i_6_ = -122 / (-i / 47);
	for (/**/; class348_sub9 != null;
	     class348_sub9
		 = ((Class348_Sub9)
		    Class348_Sub42_Sub16_Sub2.aClass356_10465.method3482(0))) {
	    int i_7_ = 1;
	    Class225 class225 = ((Class348_Sub9) class348_sub9)
				    .aClass318_Sub1_Sub3_Sub3_Sub2_6679
				    .method2422((byte) 72);
	    if (((Class318_Sub1_Sub3_Sub3)
		 (((Class348_Sub9) class348_sub9)
		  .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).anInt10268 != -1
		&& !((Class318_Sub1_Sub3_Sub3)
		     (((Class348_Sub9) class348_sub9)
		      .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).aBoolean10213) {
		if ((((Class318_Sub1_Sub3_Sub3)
		      (((Class348_Sub9) class348_sub9)
		       .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).anInt10268
		     != ((Class225) class225).anInt2919)
		    && (((Class225) class225).anInt2920
			!= ((Class318_Sub1_Sub3_Sub3)
			    (((Class348_Sub9) class348_sub9)
			     .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).anInt10268)
		    && (((Class225) class225).anInt2949
			!= ((Class318_Sub1_Sub3_Sub3)
			    (((Class348_Sub9) class348_sub9)
			     .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).anInt10268)
		    && ((((Class225) class225).anInt2914 ^ 0xffffffff)
			!= (((Class318_Sub1_Sub3_Sub3)
			     (((Class348_Sub9) class348_sub9)
			      .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).anInt10268
			    ^ 0xffffffff))) {
		    if (((((Class225) class225).anInt2940 ^ 0xffffffff)
			 == (((Class318_Sub1_Sub3_Sub3)
			      (((Class348_Sub9) class348_sub9)
			       .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).anInt10268
			     ^ 0xffffffff))
			|| ((((Class318_Sub1_Sub3_Sub3)
			      (((Class348_Sub9) class348_sub9)
			       .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).anInt10268
			     ^ 0xffffffff)
			    == (((Class225) class225).anInt2924 ^ 0xffffffff))
			|| ((((Class225) class225).anInt2947 ^ 0xffffffff)
			    == ((((Class318_Sub1_Sub3_Sub3)
				  (((Class348_Sub9) class348_sub9)
				   .aClass318_Sub1_Sub3_Sub3_Sub2_6679))
				 .anInt10268)
				^ 0xffffffff))
			|| ((((Class318_Sub1_Sub3_Sub3)
			      (((Class348_Sub9) class348_sub9)
			       .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).anInt10268
			     ^ 0xffffffff)
			    == (((Class225) class225).anInt2958 ^ 0xffffffff)))
			i_7_ = 3;
		} else
		    i_7_ = 2;
	    } else
		i_7_ = 0;
	    if (((Class348_Sub9) class348_sub9).anInt6675 != i_7_) {
		int i_8_ = (Class315.method2357
			    (-1, (((Class348_Sub9) class348_sub9)
				  .aClass318_Sub1_Sub3_Sub3_Sub2_6679)));
		if (i_8_ == ((Class348_Sub9) class348_sub9).anInt6685
		    && (((Class318_Sub1_Sub3_Sub3_Sub2)
			 (((Class348_Sub9) class348_sub9)
			  .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).aBoolean10517
			== ((Class348_Sub9) class348_sub9).aBoolean6674)) {
		    ((Class348_Sub9) class348_sub9).anInt6677
			= ((Class318_Sub1_Sub3_Sub3_Sub2)
			   (((Class348_Sub9) class348_sub9)
			    .aClass318_Sub1_Sub3_Sub3_Sub2_6679)).anInt10558;
		    ((Class348_Sub9) class348_sub9).anInt6675 = i_7_;
		} else {
		    boolean bool = false;
		    if ((((Class348_Sub9) class348_sub9)
			 .aClass348_Sub16_Sub5_6676)
			!= null) {
			((Class348_Sub9) class348_sub9).anInt6677 -= 512;
			if (((Class348_Sub9) class348_sub9).anInt6677 <= 0) {
			    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
				(((Class348_Sub9) class348_sub9)
				 .aClass348_Sub16_Sub5_6676);
			    ((Class348_Sub9) class348_sub9)
				.aClass348_Sub16_Sub5_6676
				= null;
			    bool = true;
			}
		    } else
			bool = true;
		    if (bool) {
			((Class348_Sub9) class348_sub9).aBoolean6674
			    = (((Class318_Sub1_Sub3_Sub3_Sub2)
				(((Class348_Sub9) class348_sub9)
				 .aClass318_Sub1_Sub3_Sub3_Sub2_6679))
			       .aBoolean10517);
			((Class348_Sub9) class348_sub9).anInt6677
			    = (((Class318_Sub1_Sub3_Sub3_Sub2)
				(((Class348_Sub9) class348_sub9)
				 .aClass318_Sub1_Sub3_Sub3_Sub2_6679))
			       .anInt10558);
			((Class348_Sub9) class348_sub9).aClass348_Sub10_6688
			    = null;
			((Class348_Sub9) class348_sub9).anInt6685 = i_8_;
			((Class348_Sub9) class348_sub9)
			    .aClass348_Sub19_Sub1_6686
			    = null;
			((Class348_Sub9) class348_sub9).anInt6675 = i_7_;
		    }
		}
	    }
	    ((Class348_Sub9) class348_sub9).anInt6678
		= (((Class318_Sub1) (((Class348_Sub9) class348_sub9)
				     .aClass318_Sub1_Sub3_Sub3_Sub2_6679))
		   .anInt6377);
	    ((Class348_Sub9) class348_sub9).anInt6698
		= ((((Class318_Sub1) (((Class348_Sub9) class348_sub9)
				      .aClass318_Sub1_Sub3_Sub3_Sub2_6679))
		    .anInt6377)
		   + (((Class348_Sub9) class348_sub9)
			  .aClass318_Sub1_Sub3_Sub3_Sub2_6679
			  .method2436((byte) 123)
		      << -125487992));
	    ((Class348_Sub9) class348_sub9).anInt6689
		= (((Class318_Sub1) (((Class348_Sub9) class348_sub9)
				     .aClass318_Sub1_Sub3_Sub3_Sub2_6679))
		   .anInt6388);
	    ((Class348_Sub9) class348_sub9).anInt6687
		= ((((Class318_Sub1) (((Class348_Sub9) class348_sub9)
				      .aClass318_Sub1_Sub3_Sub3_Sub2_6679))
		    .anInt6388)
		   - -(((Class348_Sub9) class348_sub9)
			   .aClass318_Sub1_Sub3_Sub3_Sub2_6679
			   .method2436((byte) 126)
		       << -658545816));
	    Class238_Sub1.method1708(i_1_, i_3_, i_0_, i_2_, (byte) -78,
				     class348_sub9);
	}
    }
}
