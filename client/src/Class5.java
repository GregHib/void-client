/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class5 implements Interface1 {
    static int anInt4627;
    static int anInt4628;
    static int anInt4629;
    private int anInt4630;
    private final Index aIndex_4631;
    Index aIndex_4632;
    static int anInt4633;
    static int anInt4634;
    Class369 aClass369_4635;
    static Class60 aClass60_4636 = new Class60(64);
    private FontRenderer aFontRenderer_4637;
    static int anInt4638;
    static int anInt4639;
    private long aLong4640;
    static int anInt4641;

    abstract void method178(int i, boolean bool, byte i_0_, int i_1_);

    public boolean method8(byte i) {
        int i_2_ = -94 % ((i - 25) / 52);
        anInt4641++;
        boolean bool = true;
        if (!this.aIndex_4632.method421(false, this.aClass369_4635.anInt4965)) bool = false;
        if (!aIndex_4631.method421(false, this.aClass369_4635.anInt4965)) bool = false;
        return bool;
    }

    public void method7(int i) {
        anInt4639++;
        if (i == 10286) {
            FontMetrics fontMetrics = Class239_Sub10.getFontMetrics((byte) -85, (this.aClass369_4635.anInt4965), aIndex_4631);
            aFontRenderer_4637 = (Class348_Sub8.aHa6654.method3686(fontMetrics, Class207.method1523(this.aIndex_4632, (this.aClass369_4635.anInt4965)), true));
        }
    }

    static final Class369_Sub1 method179(int i, Class348_Sub49 class348_sub49) {
        anInt4629++;
        Class369 class369 = Class348_Sub16_Sub2.method2834((byte) -127, class348_sub49);
        int i_3_ = class348_sub49.readInt((byte) -126);
        int i_4_ = class348_sub49.readInt((byte) -126);
        if (i != 16533) aClass60_4636 = null;
        int i_5_ = class348_sub49.readUnsignedShort(842397944);
        return new Class369_Sub1(class369.aClass221_4968, class369.aClass341_4973, class369.anInt4970, class369.anInt4959, class369.anInt4971, class369.anInt4963, class369.anInt4966, class369.anInt4965, class369.anInt4961, i_3_, i_4_, i_5_);
    }

    public static void method180(int i) {
        aClass60_4636 = null;
        if (i != -19960) method180(-71);
    }

    static final void method181(boolean bool, Npc npc) {
        if (bool != true) method180(54);
        anInt4627++;
        for (Class348_Sub9 class348_sub9 = (Class348_Sub9) client.aClass262_5185.method1995(4); class348_sub9 != null; class348_sub9 = ((Class348_Sub9) client.aClass262_5185.method1990((byte) 78))) {
            if ((class348_sub9.aNpc_6691) == npc) {
                if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880(class348_sub9.aClass348_Sub16_Sub5_6676);
                    class348_sub9.aClass348_Sub16_Sub5_6676 = null;
                }
                class348_sub9.method2715((byte) 27);
                break;
            }
        }
    }

    abstract void method182(int i, int i_6_, int i_7_, boolean bool);

    final int method183(int i) {
        anInt4633++;
        if (i <= 16) this.aClass369_4635 = null;
        int i_8_ = Class51.aClass311_897.method2320((byte) 106);
        int i_9_ = 100 * i_8_;
        if (anInt4630 != i_8_ || i_8_ == 0) {
            anInt4630 = i_8_;
            aLong4640 = Class62.method599(-125);
        } else {
            int i_10_ = Class51.aClass311_897.method2315((byte) 121);
            if (i_8_ < i_10_) {
                long l = aLong4640 - Class51.aClass311_897.method2323(0);
                if (l > 0L) {
                    long l_11_ = (long) (i_10_ - i_8_) * (10000L * l / (long) i_8_);
                    long l_12_ = (-aLong4640 + Class62.method599(-89)) * 10000L;
                    if (l_11_ > l_12_) i_9_ = (int) ((long) (i_8_ * 100) + ((long) (i_10_ + -i_8_) * (l_12_ * 100L) / l_11_));
                    else i_9_ = i_10_ * 100;
                }
            }
        }
        return i_9_;
    }

    public final void method9(byte i, boolean bool) {
        if (i == -49) {
            anInt4634++;
            int i_13_ = ((this.aClass369_4635.aClass221_4968.method1607(Class92.anInt1524, this.aClass369_4635.anInt4971, (byte) -123)) + this.aClass369_4635.anInt4970);
            int i_14_ = ((this.aClass369_4635.aClass341_4973.method2679(ha_Sub2.anInt7666, this.aClass369_4635.anInt4963, i ^ ~0x60b)) + this.aClass369_4635.anInt4959);
            method178(i_13_, bool, (byte) -84, i_14_);
            method182(63, i_14_, i_13_, bool);
            String string = Class51.aClass311_897.method2318(i ^ 0x245b);
            if (-aLong4640 + Class62.method599(-100) > 10000L) string += " (" + Class51.aClass311_897.method2324(i + 149).method525(-117) + ")";
            aFontRenderer_4637.method2575((byte) 115, (i_13_ + this.aClass369_4635.anInt4971 / 2), this.aClass369_4635.anInt4961, string, -1, (this.aClass369_4635.anInt4966 + 4 + (i_14_ - -(this.aClass369_4635.anInt4963 / 2))));
        }
    }

    Class5(Index index, Index index_15_, Class369 class369) {
        try {
            aIndex_4631 = index_15_;
            this.aIndex_4632 = index;
            this.aClass369_4635 = class369;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("gl.<init>(" + (index != null ? "{...}" : "null") + ',' + (index_15_ != null ? "{...}" : "null") + ',' + (class369 != null ? "{...}" : "null") + ')'));
        }
    }
}
