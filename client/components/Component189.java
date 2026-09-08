/* Component189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component189
/**
 * RENAMED from {@code Class300} (JODE-obfuscated).
 * Small config type with a default short, optional short array, and one extra byte.
 */ {
    static int anInt3815;
    static int anInt3816;
    /** Default short value (opcode 1). */
    int defaultValue;
    static int anInt3818;
    static boolean aBoolean3819 = false;
    static int anInt3820;
    /** Optional short array (opcode 2). */
    int[] values;
    static int anInt3822;
    /** Extra unsigned byte (opcode 3); default {@code -1}. */
    int paddingOpcode = -1;
    static int anInt3824;

    /** Take a {@link ParticleSystem} from the pool, or allocate a new one. */
    static final ParticleSystem obtainParticleSystem(byte i) {
        anInt3824++;
        if (i != -103) return null;
        if (Component266.anInt5980 == 0) return new ParticleSystem();
        return Component218.aClass348_Sub47Array2334[--Component266.anInt5980];
    }

    /** Friend-list index of {@code string} (case-insensitive), or {@code -1}. */
    static final int findFriendIndex(String string, int i) {
        anInt3816++;
        if (string == null) return -1;
        if (i >= -41) return 97;
        for (int i_0_ = 0; (i_0_ < DefinitionSub30.friendCount); i_0_++) {
            if (string.equalsIgnoreCase(Component178.friendNames[i_0_])) return i_0_;
        }
        return -1;
    }

    final void decode(Buffer class348_sub49, byte i) {
        anInt3818++;
        for (; ; ) {
            int i_1_ = class348_sub49.readUnsignedByte(255);
            if (i_1_ == 0) break;
            decodeOpcode(0, class348_sub49, i_1_);
        }
        int i_2_ = -63 / ((72 - i) / 37);
    }

    private final void decodeOpcode(int i, Buffer class348_sub49, int i_3_) {
        if (i_3_ == 1) this.defaultValue = class348_sub49.readUnsignedShort(842397944);
        else if (i_3_ == 2) {
            this.values = new int[class348_sub49.readUnsignedByte(255)];
            for (int i_4_ = 0; (i_4_ < this.values.length); i_4_++)
                this.values[i_4_] = class348_sub49.readUnsignedShort(842397944);
        } else if (i_3_ == 3) this.paddingOpcode = class348_sub49.readUnsignedByte(255);
        if (i != 0) aBoolean3819 = true;
        anInt3822++;
    }

    static final DisplayModeManagerContainer77 loadFromCache(int i, CacheStore class45, int i_5_, int i_6_) {
        if (i_6_ != -1) aBoolean3819 = true;
        anInt3815++;
        byte[] is = class45.getFile(-1860, i_5_, i);
        if (is == null) return null;
        return new DisplayModeManagerContainer77(is);
    }

    public Component189() {
        this.defaultValue = -1;
    }
}
