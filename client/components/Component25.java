/* Component25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component25
/**
 * RENAMED from `Class239_Sub16` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt6007;
    static int anInt6008;
    static int anInt6009;
    static int anInt6010;
    static int anInt6011;
    static int anInt6012 = 1;
    static int anInt6013;
    static int anInt6014;
    static int anInt6015;
    static int anInt6016;
    static int anInt6017;

    static final String method1788(byte i, long l) {
        try {
            anInt6016++;
            if (l <= 0L || l >= 6582952005840035281L) return null;
            if (l % 37L == 0L) return null;
            int i_0_ = 0;
            long l_1_ = l;
            int i_2_ = -20 % ((i - -6) / 62);
            for (/**/; l_1_ != 0L; l_1_ /= 37L)
                i_0_++;
            StringBuffer stringbuffer = new StringBuffer(i_0_);
            while (l != 0) {
                long l_3_ = l;
                l /= 37L;
                char c = Component377.aCharArray852[(int) (l_3_ + -(37L * l))];
                if (c == 95) {
                    int i_4_ = stringbuffer.length() + -1;
                    stringbuffer.setCharAt(i_4_, Character.toUpperCase(stringbuffer.charAt(i_4_)));
                    c = '\u00a0';
                }
                stringbuffer.append(c);
            }
            stringbuffer.reverse();
            stringbuffer.setCharAt(0, Character.toUpperCase(stringbuffer.charAt(0)));
            return stringbuffer.toString();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "sba.F(" + i + ',' + l + ')');
        }
    }

    final int getValue(int i, int i_5_) {
        if (i != 3) anInt6012 = -22;
        anInt6014++;
        if (i_5_ == 0 || this.preferences.aClass239_Sub9_7256.method1759(i ^ ~0x7e5e) == 1) return 1;
        return 2;
    }

    final void validateValue(boolean bool) {
        if (bool != false) anInt6012 = 46;
        if (this.preferenceValue != 0 && this.preferences.aClass239_Sub9_7256.method1759(-32350) != 1) this.preferenceValue = 0;
        anInt6007++;
        if (this.preferenceValue < 0 || this.preferenceValue > 1) this.preferenceValue = getDefaultValue(20014);
    }

    final int method1789(int i) {
        if (i != -32350) anInt6008 = 32;
        anInt6017++;
        return this.preferenceValue;
    }

    Component25(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final void setValue(int i, int i_6_) {
        anInt6011++;
        int i_7_ = -19 / ((i - 82) / 35);
        this.preferenceValue = i_6_;
    }

    final boolean method1790(int i) {
        if (i < 85) anInt6012 = -109;
        anInt6015++;
        return true;
    }

    Component25(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    static final void method1791(int i, int[] is, int i_8_, Player player) {
        do {
            try {
                anInt6009++;
                if ((player.anIntArray10236) != null) {
                    boolean bool = true;
                    for (int i_9_ = 0; (player.anIntArray10236.length > i_9_); i_9_++) {
                        if ((player.anIntArray10236[i_9_]) != is[i_9_]) {
                            bool = false;
                            break;
                        }
                    }
                    if (bool && player.anInt10286 != -1) {
                        DisplayModeManagerContainer167 class17 = (RunescapeInfo.aClass87_191.getSequence(player.anInt10286, 7));
                        int i_10_ = class17.anInt248;
                        if (i_10_ == 1) {
                            player.anInt10232 = 0;
                            player.anInt10267 = 0;
                            player.anInt10294 = 0;
                            player.anInt10218 = i_8_;
                            player.anInt10244 = 1;
                            if (!player.aBoolean10309) DisplayModeManagerContainer260.method2178(player, player.anInt10267, class17, i ^ ~0x5df4);
                        }
                        if (i_10_ == 2) player.anInt10294 = 0;
                    }
                }
                boolean bool = true;
                if (i != 23946) method1791(126, null, -73, null);
                for (int i_11_ = 0; is.length > i_11_; i_11_++) {
                    if (is[i_11_] != -1) bool = false;
                    if (player.anIntArray10236 == null || (player.anIntArray10236[i_11_]) == -1 || (RunescapeInfo.aClass87_191.getSequence((player.anIntArray10236[i_11_]), 7).anInt239 <= (RunescapeInfo.aClass87_191.getSequence(is[i_11_], i ^ 0x5d8d).anInt239))) {
                        player.anInt10218 = i_8_;
                        player.anIntArray10236 = is;
                        break;
                    }
                }
                if (!bool) break;
                player.anIntArray10236 = is;
                player.anInt10218 = i_8_;
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("sba.E(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_8_ + ',' + (player != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final int getDefaultValue(int i) {
        if (i != 20014) method1789(40);
        anInt6010++;
        return 1;
    }

    static final void method1792(int i, int i_12_, int i_13_, int i_14_, byte i_15_, int i_16_) {
        anInt6013++;
        int i_17_ = LogicError.clamp(PauseTimer.anInt513, i, Component72.anInt1910, -90);
        int i_18_ = LogicError.clamp(PauseTimer.anInt513, i_13_, Component72.anInt1910, -94);
        int i_19_ = LogicError.clamp(Component22.anInt1745, i_12_, Component27.anInt4960, 77);
        int i_20_ = LogicError.clamp(Component22.anInt1745, i_14_, Component27.anInt4960, 59);
        int i_21_ = -27 / ((i_15_ - -6) / 55);
        for (int i_22_ = i_17_; i_22_ <= i_18_; i_22_++)
            MenuOpener.fillInts(-27, i_20_, DisplayModeManagerContainer167.anIntArrayArray255[i_22_], i_19_, i_16_);
    }
}
