/* Component285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component285
/**
 * RENAMED from `Class54` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private byte aByte966;
    int anInt967;
    static int anInt968;
    int anInt969;
    static int anInt970;
    static int anInt971;
    static int anInt972;
    int anInt973;
    static String[] aStringArray974;
    static int anInt975;
    int anInt976;
    int anInt977;

    final int method499(int i) {
        anInt972++;
        if (i != 21110) return -38;
        if ((aByte966 & 0x8) != 8) return 0;
        return 1;
    }

    static final int method500(int i, int i_0_) {
        anInt975++;
        if (i != 7) return -107;
        return i_0_ >>> 8;
    }

    public static void method501(int i) {
        aStringArray974 = null;
        if (i != 1) method501(-15);
    }

    final int method502(byte i) {
        anInt971++;
        int i_1_ = 4 / ((3 - i) / 43);
        return aByte966 & 0x7;
    }

    public Component285() {
        /* empty */
    }

    static final void method503(int i, int i_2_, byte i_3_, int i_4_, int i_5_) {
        anInt968++;
        int i_6_ = HashNodeSub16Sub2.anInt10463;
        while_4_:
        do {
            do {
                if (i_6_ != 0) {
                    if (i_6_ != 1) {
                        if (i_6_ == 2) break;
                        break while_4_;
                    }
                } else return;
                NodeSub3.anInt6585 = i;
                Component112.anInt3941 = i_2_;
                Component339.anInt3142 = i_5_;
                HashNodeSub16Sub2.anInt10463 = 2;
                Component112.anInt3939 = i_4_;
                return;
            } while (false);
            if (Component112.anInt3939 < i_4_) Component112.anInt3939 = i_4_;
            if (Component112.anInt3941 > i_2_) Component112.anInt3941 = i_2_;
            if (Component339.anInt3142 > i_5_) Component339.anInt3142 = i_5_;
            if (i > NodeSub3.anInt6585) NodeSub3.anInt6585 = i;
            return;
        } while (false);
        if (i_3_ != -74) method501(46);
    }

    Component285(Buffer class348_sub49) {
        aByte966 = class348_sub49.readByte(-113);
        this.anInt969 = class348_sub49.readUnsignedShort(842397944);
        this.anInt976 = class348_sub49.readInt((byte) -126);
        this.anInt967 = class348_sub49.readInt((byte) -126);
        this.anInt977 = class348_sub49.readInt((byte) -126);
        this.anInt973 = class348_sub49.readInt((byte) -126);
    }
}
