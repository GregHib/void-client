/* NameFormatter - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class37` (JODE-obfuscated).
 * Name formatter. Truncates long player/friend display names (substring at >9 / >6 chars) and appends FriendsIgnoreList clan/title suffixes.
 */

final class NameFormatter {
    static int anInt490;
    static int anInt491;
    static int anInt492;
    static int anInt493;
    static int anInt494;
    static int anInt495 = 0;
    static int anInt496;

    /**
     * Formats a quantity with thousands separators and K/M colour suffixes for the UI.
     */
    static final String formatQuantity(int i, int i_0_) {
        anInt494++;
        String string = Integer.toString(i_0_);
        if (i >= -109) return null;
        for (int i_1_ = -3 + string.length(); i_1_ > 0; i_1_ -= 3)
            string = string.substring(0, i_1_) + "," + string.substring(i_1_);
        if (string.length() > 9) return (" <col=00ff80>" + string.substring(0, string.length() + -8) + FriendsIgnoreList.aClass274_3516.getLocalized(ObjectDeserializer.languageId, 544) + " (" + string + ")</col>");
        if (string.length() > 6) return (" <col=ffffff>" + string.substring(0, -4 + string.length()) + FriendsIgnoreList.aClass274_3518.getLocalized(ObjectDeserializer.languageId, 544) + " (" + string + ")</col>");
        return " <col=ffff00>" + string + "</col>";
    }

    /** Returns {@code is} to the size-bucketed byte[] pool (100 / 5000 / 30000 / custom). */
    static final synchronized void releaseByteArray(int i, byte[] is) {
        anInt491++;
        if (is.length == 100 && DefinitionSub31.anInt9412 < 1000) DisplayModeManagerContainer310.aByteArrayArray358[DefinitionSub31.anInt9412++] = is;
        else {
            if (i != 0) allocateByteArray(-119, -101);
            if (is.length == 5000 && DefinitionSub21.anInt9280 < 250) HeapDumper.aByteArrayArray1918[DefinitionSub21.anInt9280++] = is;
            else if (is.length == 30000 && Sprite.anInt6913 < 50) DebugPanicSub2.aByteArrayArray8505[Sprite.anInt6913++] = is;
            else if (DefinitionSub6.aByteArrayArrayArray9134 != null) {
                for (int i_2_ = 0; Component317.anIntArray8684.length > i_2_; i_2_++) {
                    if ((is.length == Component317.anIntArray8684[i_2_]) && (DefinitionSub6.aByteArrayArrayArray9134[i_2_]).length > DisplayModeManagerContainer56.anIntArray2552[i_2_]) {
                        DefinitionSub6.aByteArrayArrayArray9134[i_2_][DisplayModeManagerContainer56.anIntArray2552[i_2_]++] = is;
                        break;
                    }
                }
            }
        }
    }

    /**
     * Enqueue a world sound effect (id {@code i_7_}, volume {@code i}, coords/delay params)
     * when SFX prefs are on and the active queue is under 50 entries.
     */
    static final void queueSoundEffect(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        if (i_8_ != -29494) anInt496 = 32;
        if (Component192.preferences.aClass239_Sub26_7272.method1838(-32350) != 0 && i != 0 && Component335.anInt2021 < 50 && i_7_ != -1) GlFramebufferTexture.aClass10Array8531[Component335.anInt2021++] = new RunescapeInfo((byte) 1, i_7_, i, i_4_, i_5_, i_3_, i_6_, null);
        anInt490++;
    }

    /** Allocates (or reuses from the pool) a {@code byte[i]} buffer. */
    static final synchronized byte[] allocateByteArray(int i, int i_9_) {
        anInt493++;
        if (i == 100 && DefinitionSub31.anInt9412 > 0) {
            byte[] is = DisplayModeManagerContainer310.aByteArrayArray358[--DefinitionSub31.anInt9412];
            DisplayModeManagerContainer310.aByteArrayArray358[DefinitionSub31.anInt9412] = null;
            return is;
        }
        if (i == 5000 && DefinitionSub21.anInt9280 > 0) {
            byte[] is = (HeapDumper.aByteArrayArray1918[--DefinitionSub21.anInt9280]);
            HeapDumper.aByteArrayArray1918[DefinitionSub21.anInt9280] = null;
            return is;
        }
        if (i_9_ != -1) allocateByteArray(-88, -45);
        if (i == 30000 && Sprite.anInt6913 > 0) {
            byte[] is = (DebugPanicSub2.aByteArrayArray8505[--Sprite.anInt6913]);
            DebugPanicSub2.aByteArrayArray8505[Sprite.anInt6913] = null;
            return is;
        }
        if (DefinitionSub6.aByteArrayArrayArray9134 != null) {
            for (int i_10_ = 0; Component317.anIntArray8684.length > i_10_; i_10_++) {
                if ((i == Component317.anIntArray8684[i_10_]) && DisplayModeManagerContainer56.anIntArray2552[i_10_] > 0) {
                    byte[] is = (DefinitionSub6.aByteArrayArrayArray9134[i_10_][--DisplayModeManagerContainer56.anIntArray2552[i_10_]]);
                    DefinitionSub6.aByteArrayArrayArray9134[i_10_][DisplayModeManagerContainer56.anIntArray2552[i_10_]] = null;
                    return is;
                }
            }
        }
        return new byte[i];
    }
}
