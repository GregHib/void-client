/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class10 {
    Class318_Sub1 aClass318_Sub1_172;
    int anInt173;
    static int[][] anIntArrayArray174 = {{0, 2}, {0, 2}, {0, 0, 2}, {2, 0, 0}, {0, 2, 0}, {0, 0, 2}, {0, 5, 1, 4}, {0, 4, 4, 4}, {4, 4, 4, 0}, {6, 6, 6, 2, 2, 2}, {2, 2, 2, 6, 6, 6}, {0, 11, 6, 6, 6, 4}, {0, 2}, {0, 4, 4, 4}, {0, 4, 4, 4}};
    static int anInt175;
    Class348_Sub16_Sub5 aClass348_Sub16_Sub5_176;
    int anInt177;
    int anInt178;
    static int[] anIntArray179;
    byte aByte180;
    static int anInt181;
    static int anInt182;
    Class317 aClass317_183;
    int anInt184;
    int anInt185;
    static Game runescape;
    static int[] anIntArray187 = {-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
    int anInt188;
    Class348_Sub19_Sub1 aClass348_Sub19_Sub1_189;
    static int anInt190;
    static Class87 aClass87_191;
    Class348_Sub10 aClass348_Sub10_192;

    static final String method217(byte i) {
        anInt175++;
        if (Class5_Sub1.aBoolean8335 || Class316.aClass348_Sub42_Sub12_3963 == null) return "";
        if (i < 51) return null;
        return (Class316.aClass348_Sub42_Sub12_3963.aString9593);
    }

    public static void method218(byte i) {
        if (i < 101) method218((byte) -85);
        anIntArray187 = null;
        anIntArray179 = null;
        runescape = null;
        aClass87_191 = null;
        anIntArrayArray174 = null;
    }

    static final boolean method219(int i, boolean bool, int i_0_) {
        if (bool != false) return false;
        anInt190++;
        return (i & 0x800) != 0 | Class278.method2077(-106, i_0_, i) || Class348_Sub42_Sub8_Sub2.method3200(i, i_0_, (byte) 88);
    }

    final boolean method220(byte i) {
        anInt181++;
        if (i >= -12) method218((byte) 101);
        return this.aByte180 == 2 || this.aByte180 == 3;
    }

    Class10(byte i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, Class318_Sub1 class318_sub1) {
        this.anInt177 = i_2_;
        this.anInt184 = i_4_;
        this.anInt188 = i_3_;
        this.anInt178 = i_5_;
        this.anInt185 = i_1_;
        this.aByte180 = i;
        this.anInt173 = i_6_;
        this.aClass318_Sub1_172 = class318_sub1;
    }

    static {
        runescape = new Game("runescape", 0);
    }
}
