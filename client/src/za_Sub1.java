/* za_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeap;

final class za_Sub1 extends za
{
    NativeHeap aNativeHeap9770;
    static int anInt9771;
    static int anInt9772;
    static Class113 aClass113_9773 = new Class113();
    static int anInt9774;
    static int anInt9775 = -1;
    static int anInt9776 = 0;
    
    static final int method3439(int i) {
	anInt9771++;
	if (i <= 92)
	    return 99;
	if (Class348_Sub49.anInt7207 == 1)
	    return Class348_Sub16_Sub1.anInt8854;
	return Class59_Sub1.anInt5283;
    }
    
    za_Sub1(int i) {
	((za_Sub1) this).aNativeHeap9770 = new NativeHeap(i);
    }
    
    final void method3440(int i) {
	anInt9772++;
	((za_Sub1) this).aNativeHeap9770.b();
	int i_0_ = -30 / ((i - -26) / 52);
    }
    
    public static void method3441(int i) {
	aClass113_9773 = null;
	if (i != 1)
	    method3439(-118);
    }
}
