/* Class318_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub3 extends Class318
{
    boolean aBoolean6401 = false;
    int anInt6402;
    int anInt6403;
    int anInt6404;
    int anInt6405;
    int anInt6406;
    
    final boolean method2500(int i, int i_0_) {
	if (!((Class318_Sub3) this).aBoolean6401)
	    return false;
	int i_1_ = (((Class318_Sub3) this).anInt6406
		    - ((Class318_Sub3) this).anInt6405);
	int i_2_ = (((Class318_Sub3) this).anInt6404
		    - ((Class318_Sub3) this).anInt6402);
	int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
	int i_4_ = (i * i_1_ + i_0_ * i_2_
		    - (((Class318_Sub3) this).anInt6405 * i_1_
		       + ((Class318_Sub3) this).anInt6402 * i_2_));
	if (i_4_ <= 0) {
	    int i_5_ = ((Class318_Sub3) this).anInt6405 - i;
	    int i_6_ = ((Class318_Sub3) this).anInt6402 - i_0_;
	    if (i_5_ * i_5_ + i_6_ * i_6_
		>= (((Class318_Sub3) this).anInt6403
		    * ((Class318_Sub3) this).anInt6403))
		return false;
	    return true;
	}
	if (i_4_ > i_3_) {
	    int i_7_ = ((Class318_Sub3) this).anInt6406 - i;
	    int i_8_ = ((Class318_Sub3) this).anInt6404 - i_0_;
	    if (i_7_ * i_7_ + i_8_ * i_8_
		>= (((Class318_Sub3) this).anInt6403
		    * ((Class318_Sub3) this).anInt6403))
		return false;
	    return true;
	}
	i_4_ = (i_4_ << 10) / i_3_;
	int i_9_ = ((Class318_Sub3) this).anInt6405 + (i_1_ * i_4_ >> 10) - i;
	int i_10_
	    = ((Class318_Sub3) this).anInt6402 + (i_2_ * i_4_ >> 10) - i_0_;
	if (i_9_ * i_9_ + i_10_ * i_10_
	    >= (((Class318_Sub3) this).anInt6403
		* ((Class318_Sub3) this).anInt6403))
	    return false;
	return true;
    }
    
    public Class318_Sub3() {
	/* empty */
    }
}
