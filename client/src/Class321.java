/* Class321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class321 {
    static int anInt3995;
    private int[][] varbits;
    private int[][] varps;
    private int[] anIntArray3998;
    static int anInt3999;
    int itemSprite = -1;
    private int[] anIntArray4001;
    private int[][] skillRequirements;
    private int[] anIntArray4003;
    private int[] questRequirements;
    static int anInt4005 = -1;
    private Class356 parameters;
    private int[] anIntArray4007;
    private int[] pathStart;
    private int[] anIntArray4009;
    private String listName;
    private String[] aStringArray4011;
    private String name;
    static int anInt4013;
    private int[] anIntArray4014;
    static Class114 aClass114_4015 = new Class114(116, 6);
    private String[] aStringArray4016;
    static int anInt4017;

    final void method2548(byte i) {
        if (i <= 117) method2550(null, -119, (byte) 18);
        anInt3999++;
        if (listName == null) listName = name;
    }

    public static void method2549(byte i) {
        if (i > -74) method2549((byte) 75);
        aClass114_4015 = null;
    }

    private final void method2550(Class348_Sub49 class348_sub49, int i, byte i_0_) {
        if (i_0_ != 52) anIntArray4014 = null;
        anInt4013++;
        if (i != 1) {
            if (i == 2)
                listName = class348_sub49.method3371(i_0_ ^ ~0x349a);
            else if (i == 3) {
                int i_1_ = class348_sub49.readUnsignedByte(i_0_ ^ 0xcb);
                varps = new int[i_1_][3];
                for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
                    varps[i_2_][0] = class348_sub49.readUnsignedShort(842397944);
                    varps[i_2_][1] = class348_sub49.readInt((byte) -126);
                    varps[i_2_][2] = class348_sub49.readInt((byte) -126);
                }
            } else if (i == 4) {
                int i_17_ = class348_sub49.readUnsignedByte(255);
                varbits = new int[i_17_][3];
                for (int i_18_ = 0; i_17_ > i_18_; i_18_++) {
                    varbits[i_18_][0] = class348_sub49.readUnsignedShort(842397944);
                    varbits[i_18_][1] = class348_sub49.readInt((byte) -126);
                    varbits[i_18_][2] = class348_sub49.readInt((byte) -126);
                }
            } else if (i != 5) {
                if (i == 6) class348_sub49.readUnsignedByte(255);
                else if (i == 7) class348_sub49.readUnsignedByte(255);
                else if (i != 8) {
                    if (i != 9) {
                        if (i == 10) {
                            int i_3_ = class348_sub49.readUnsignedByte(i_0_ + 203);
                            pathStart = new int[i_3_];
                            for (int i_4_ = 0; i_3_ > i_4_; i_4_++)
                                pathStart[i_4_] = class348_sub49.readInt((byte) -126);
                        } else if (i != 12) {
                            if (i == 13) {
                                int i_15_ = class348_sub49.readUnsignedByte(255);
                                questRequirements = new int[i_15_];
                                for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
                                    questRequirements[i_16_] = class348_sub49.readUnsignedShort(842397944);
                            } else if (i == 14) {
                                int i_13_ = class348_sub49.readUnsignedByte(i_0_ ^ 0xcb);
                                skillRequirements = new int[i_13_][2];
                                for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
                                    skillRequirements[i_14_][0] = class348_sub49.readUnsignedByte(255);
                                    skillRequirements[i_14_][1] = (class348_sub49.readUnsignedByte(Class348_Sub21.method2955(i_0_, 203)));
                                }
                            } else if (i == 15) class348_sub49.readUnsignedShort(842397944);
                            else if (i == 17) this.itemSprite = class348_sub49.readUnsignedShort(842397944);
                            else if (i == 18) {
                                int i_5_ = class348_sub49.readUnsignedByte(255);
                                anIntArray4014 = new int[i_5_];
                                aStringArray4011 = new String[i_5_];
                                anIntArray4007 = new int[i_5_];
                                anIntArray4001 = new int[i_5_];
                                for (int i_6_ = 0; (i_6_ < i_5_); i_6_++) {
                                    anIntArray4014[i_6_] = (class348_sub49.readInt((byte) -126));
                                    anIntArray4001[i_6_] = (class348_sub49.readInt((byte) -126));
                                    anIntArray4007[i_6_] = (class348_sub49.readInt((byte) -126));
                                    aStringArray4011[i_6_] = (class348_sub49.readString((byte) 123));
                                }
                            } else if (i == 19) {
                                int i_7_ = class348_sub49.readUnsignedByte(255);
                                aStringArray4016 = new String[i_7_];
                                anIntArray4003 = new int[i_7_];
                                anIntArray4009 = new int[i_7_];
                                anIntArray3998 = new int[i_7_];
                                for (int i_8_ = 0; (i_8_ < i_7_); i_8_++) {
                                    anIntArray4009[i_8_] = (class348_sub49.readInt((byte) -126));
                                    anIntArray3998[i_8_] = (class348_sub49.readInt((byte) -126));
                                    anIntArray4003[i_8_] = (class348_sub49.readInt((byte) -126));
                                    aStringArray4016[i_8_] = (class348_sub49.readString((byte) -25));
                                }
                            } else if (i == 249) {
                                int i_9_ = class348_sub49.readUnsignedByte(255);
                                if (parameters == null) {
                                    int i_10_ = (Class33.method340(i_9_, (byte) 108));
                                    parameters = new Class356(i_10_);
                                }
                                for (int i_11_ = 0; i_9_ > i_11_; i_11_++) {
                                    boolean bool = (class348_sub49.readUnsignedByte(255) == 1);
                                    int i_12_ = class348_sub49.readMedium(-1);
                                    Class348 class348;
                                    if (!bool) class348 = (new Class348_Sub35(class348_sub49.readInt((byte) -126)));
                                    else class348 = (new Class348_Sub50(class348_sub49.readString((byte) -98)));
                                    parameters.method3483((byte) 123, i_12_, class348);
                                }
                            }
                        } else class348_sub49.readInt((byte) -126);
                    } else class348_sub49.readUnsignedByte(255);
                }
            } else class348_sub49.readUnsignedShort(842397944);
        } else name = class348_sub49.method3371(-13487);
    }

    final void method2551(int i, Class348_Sub49 class348_sub49) {
        int i_19_ = -14 / ((i - -56) / 61);
        anInt3995++;
        for (; ; ) {
            int i_20_ = class348_sub49.readUnsignedByte(255);
            if (i_20_ == 0) break;
            method2550(class348_sub49, i_20_, (byte) 52);
        }
    }

    public Class321() {
        /* empty */
    }
}
